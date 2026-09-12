package com.trolmastercard.sexmod.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;

/**
 * Official port of 1.12.2 cb (galath model).
 *
 * <p>Helper order in {@link #setCustomAnimations} matches cb.main exactly:
 * k, super, a(em), h, f, b, e, g, j, a(), c, i, d, then the f_ tail
 * (aE write-back + con_mang pass).</p>
 *
 * <p>Known divergences from official (all documented in the port report):<br>
 * - cb.f (attack lunge) is skipped: it needs the f_.az attack timer, which has no 1.21.1 analog.<br>
 * - cb.j (coin hide) is player-only and lives in {@link PlayerGalathModel}.<br>
 * - cb.k wrote molang variables; Geckolib 4.9 has no custom-molang API, so the same values
 * drive armR/head bones directly (identical degrees).<br>
 * - cb.e (Alex/Steve skin gate) is inherited from {@link GirlModel}; the official override
 * (f_.k/f_.M) is unrecoverable (stub class).<br>
 * - Official tilt default for non-flight poses is ambiguous in the bytecode (default branch
 * falls into the tilt path); this port uses tilt only inside the BOOST window. If 1.12.2
 * shows a constant +45 rotationTool tilt, flip {@link #boostFrameTilt} default to 45.</p>
 */
public class GalathModel extends GirlModel<com.trolmastercard.sexmod.entity.GalathEntity> {
    private float lipPrev = 0.0F;

    public GalathModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        // Official cb.a(): galath, galath, galath_con_mang.
        return new ResourceLocation[]{
            ResourceLocation.fromNamespaceAndPath("sexmod", "galath/galath"),
            ResourceLocation.fromNamespaceAndPath("sexmod", "galath/galath"),
            ResourceLocation.fromNamespaceAndPath("sexmod", "galath/galath_con_mang")
        };
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/galath/galath.png");
    }

    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "galath/galath");
    }

    @Override
    public String[] a() {
        // Official cb.c().
        return new String[]{"armorHelmet"};
    }

    @Override
    public ResourceLocation getModelResource(com.trolmastercard.sexmod.entity.GalathEntity entity) {
        // Official cb.a(em): con_mang poses use c[2]. NOTE: the official gate is f_.b()
        // (pose switch); the 1.21.1 GalathEntity.b() means has-master instead (fan behavior),
        // so the pose set is checked directly here without touching behavior.
        if (isConMangPose(entity.ai())) {
            return a(this.b[2]);
        }
        return super.getModelResource(entity);
    }

    @Override
    protected void a(com.trolmastercard.sexmod.entity.GalathEntity var1, AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> var2, AnimationState<com.trolmastercard.sexmod.entity.GalathEntity> var3) {
        // Official cb has no neck tracking; disable the GirlModel addition for fidelity.
    }

    static boolean isConMangPose(com.trolmastercard.sexmod.entity.ScenePose pose) {
        return poseIn(pose, com.trolmastercard.sexmod.entity.ScenePose.cd, com.trolmastercard.sexmod.entity.ScenePose.cl,
            com.trolmastercard.sexmod.entity.ScenePose.cm, com.trolmastercard.sexmod.entity.ScenePose.cn);
    }

    static boolean poseIn(com.trolmastercard.sexmod.entity.ScenePose pose, com.trolmastercard.sexmod.entity.ScenePose... set) {
        if (pose == null) {
            return false;
        }
        for (com.trolmastercard.sexmod.entity.ScenePose candidate : set) {
            if (pose == candidate) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setCustomAnimations(com.trolmastercard.sexmod.entity.GalathEntity entity, long var2, AnimationState<com.trolmastercard.sexmod.entity.GalathEntity> state) {
        float partial = state.getPartialTick();
        AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc = this.getAnimationProcessor();
        this.aimMasturbateArms(entity, proc, partial);
        super.setCustomAnimations(entity, var2, state);
        this.boostFrameTilt(entity, proc, partial);
        this.poseRapeCharge(entity, proc);
        this.poseKnockoutFly(entity, proc);
        this.updateClothVisibility(entity, proc);
        this.updateWingVisibility(entity, proc);
        this.updateFutaVisibility(proc);
        this.writeBackBodyState(entity, proc);
        this.animateLickHead(entity, proc, partial);
        this.snapHugMangBody(entity, proc);
        GeoBone head = proc.getBone("head");
        if (head != null) {
            entity.aE = head.getRotX();
        }
        if (isConMangPose(entity.ai())) {
            ManglelieModel.applyConMangEffects(entity, proc, partial);
        }
    }

    // Official cb.k. Partner: official uses em.z() (UUID param v), but v is never set
    // (only reset), so official always falls back to the client player too.
    private void aimMasturbateArms(com.trolmastercard.sexmod.entity.GalathEntity entity, AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc, float partial) {
        if (entity.ai() != com.trolmastercard.sexmod.entity.ScenePose.cc) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        Vec3 toPlayer = relativeEyeVec(entity, mc.player, partial).add(BoneOffsetTable.localOffset(entity, "head", partial));
        float yawTo = wrap360((float) Math.atan2(toPlayer.z, toPlayer.x)) - entity.getYRot();
        float pitchTo = wrap360((float) Math.atan2(toPlayer.y, Math.sqrt(toPlayer.x * toPlayer.x + toPlayer.z * toPlayer.z)));
        double dist = Math.abs(toPlayer.x) + Math.abs(toPlayer.y) + Math.abs(toPlayer.z);
        double pitchBase = dist * 7.0 - 20.0;
        double armPitchBase = dist * 5.0 - 20.0;
        GeoBone armR = proc.getBone("armR");
        if (armR != null) {
            armR.setRotX((float) Math.toRadians(armPitchBase + pitchTo - 110.0));
            armR.setRotY((float) Math.toRadians(yawTo + 80.0F));
        }
        GeoBone head = proc.getBone("head");
        if (head != null) {
            head.setRotX((float) Math.toRadians(45.0 - 17.0 + 6.3826 + pitchBase + pitchTo - 80.0));
            head.setRotY((float) Math.toRadians(yawTo + 90.0F));
        }
    }

    // Official cb.a(em). FLY/CONTROLLED_FLIGHT skip only the BOOST check; the lerp runs always.
    private void boostFrameTilt(com.trolmastercard.sexmod.entity.GalathEntity entity, AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc, float partial) {
        float tilt = 0.0F;
        if (entity.ai() == com.trolmastercard.sexmod.entity.ScenePose.bY
            && com.trolmastercard.sexmod.entity.ScenePose.bY.cv[1] > 13
            && com.trolmastercard.sexmod.entity.ScenePose.bY.cv[1] < 40) {
            tilt = 45.0F;
        }
        GeoBone tool = proc.getBone("rotationTool");
        if (tool == null) {
            return;
        }
        // Official f2 (b7.d): c = prevX, d = currX, b = prevZ, a = currZ.
        // 1.21.1 mapping: I = prevX, G = currX, J = prevZ, H = currZ (see GalathEntity.r() shifts).
        tool.setRotX((float) lerp(entity.I + tilt, entity.G + tilt, partial));
        tool.setRotZ((float) lerp(entity.J, entity.H, partial));
    }

    // Official cb.h.
    private void poseRapeCharge(com.trolmastercard.sexmod.entity.GalathEntity entity, AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc) {
        if (entity.ai() != com.trolmastercard.sexmod.entity.ScenePose.bO) {
            return;
        }
        Vec3 vec = throwVec(new Vec3(entity.xo, entity.yo, entity.zo), entity.position());
        GeoBone tool = proc.getBone("rotationTool");
        if (tool != null) {
            tool.setRotX((float) vec.x);
        }
        GeoBone body = proc.getBone("body");
        if (body != null) {
            body.setPosY((float) vec.y);
            body.setPosZ((float) vec.z);
            // Official reads f_.bO (charge progress, writers live in the f_ stub).
            // 1.21.1 analog: float param l (default 0, never driven yet).
            body.setRotY((float) Math.toRadians((Float) entity.getEntityData().get(com.trolmastercard.sexmod.entity.GalathEntity.l) * 180.0F));
        }
    }

    // Official cb.b. bP (knockout-physics flag) maps to bool param k (set by b(Vec3)).
    private void poseKnockoutFly(com.trolmastercard.sexmod.entity.GalathEntity entity, AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc) {
        if (!(Boolean) entity.getEntityData().get(com.trolmastercard.sexmod.entity.GalathEntity.k)) {
            return;
        }
        if (entity.ai() != com.trolmastercard.sexmod.entity.ScenePose.bK) {
            return;
        }
        GeoBone body = proc.getBone("body");
        if (body == null) {
            return;
        }
        Vec3 delta = entity.getDeltaMovement();
        if (Math.abs(delta.x) + Math.abs(delta.z) < 0.01F) {
            body.setRotX((float) Math.toRadians(-90.0F));
            body.setPosY(0.0F);
            body.setPosZ(0.0F);
            return;
        }
        Vec3 vec = throwVec(new Vec3(entity.xo, entity.yo, entity.zo), entity.position());
        body.setRotX(-(float) vec.x);
        body.setPosY((float) vec.y);
        body.setPosZ((float) vec.z);
    }

    // Official cb.e.
    private void updateClothVisibility(com.trolmastercard.sexmod.entity.GalathEntity entity, AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc) {
        boolean clothed = entity.bb;
        boolean poseSet = poseIn(entity.ai(), com.trolmastercard.sexmod.entity.ScenePose.ci, com.trolmastercard.sexmod.entity.ScenePose.cj,
            com.trolmastercard.sexmod.entity.ScenePose.ck);
        hide(proc, "nippleR", !clothed);
        hide(proc, "nippleL", !clothed);
        hide(proc, "braBoobL", clothed);
        hide(proc, "braBoobR", clothed);
        hide(proc, "slip", clothed || poseSet);
    }

    // Official cb.g. Wings hidden exactly during {CORRUPT_SLOW, CORRUPT_FAST, CORRUPT_CUM, COWGIRLCUM}.
    private void updateWingVisibility(com.trolmastercard.sexmod.entity.GalathEntity entity, AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc) {
        hide(proc, "wings", poseIn(entity.ai(), com.trolmastercard.sexmod.entity.ScenePose.bT, com.trolmastercard.sexmod.entity.ScenePose.bU,
            com.trolmastercard.sexmod.entity.ScenePose.bV, com.trolmastercard.sexmod.entity.ScenePose.z));
    }

    // Official cb.a(). a_.e (default true) maps to the GirlModel.a config hook.
    private void updateFutaVisibility(AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc) {
        boolean show = GirlModel.a;
        hide(proc, "futaCock", !show);
        hide(proc, "futaBallLL", !show);
        hide(proc, "futaBallLR", !show);
    }

    // Official cb.c.
    private void writeBackBodyState(com.trolmastercard.sexmod.entity.GalathEntity entity, AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc) {
        GeoBone body = proc.getBone("body");
        if (body == null) {
            return;
        }
        entity.bw = body.getRotY();
        entity.bm = body.getScaleY();
    }

    // Official cb.i. f_.b(partial) (sway blend, stub) approximated with partial tick;
    // f_.a5 (lick pause flag, stub) has no analog so motion/sound always run.
    private void animateLickHead(com.trolmastercard.sexmod.entity.GalathEntity entity, AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc, float partial) {
        if (!poseIn(entity.ai(), com.trolmastercard.sexmod.entity.ScenePose.ci)) {
            return;
        }
        if (isDebugScreen()) {
            return;
        }
        GeoBone head = proc.getBone("head");
        if (head == null) {
            return;
        }
        float time = partial + entity.tickCount;
        float[] sway = new float[]{
            (float) Math.sin(time * 0.3F) * (float) Math.toRadians(10.0F),
            (float) Math.sin(time * 0.15F) * (float) Math.toRadians(7.0F),
            (float) Math.sin(time * -0.15F) * (float) Math.toRadians(7.0F)
        };
        head.setRotX(head.getRotX() + (float) lerp(sway[0], 0.0F, partial));
        head.setRotY(head.getRotY() + (float) lerp(sway[1], 0.0F, partial));
        head.setRotZ(head.getRotZ() + (float) lerp(sway[2], 0.0F, partial));
        float lip = (float) Math.sin(time * 0.3F) * 10.0F;
        if (lip > 0.0F && this.lipPrev < 0.0F) {
            // Official plays a random GIRLS_ALLIE_LIPSOUND; 1.21.1 has only jenny lipsounds.
            com.trolmastercard.sexmod.registry.ModSounds.b(entity, "jenny", "lipsound.lipsound" + entity.getRandom().nextInt(10));
        }
        this.lipPrev = lip;
    }

    // Official cb.d. body2 exists only on the con_mang geo (null-guarded officially too).
    private void snapHugMangBody(com.trolmastercard.sexmod.entity.GalathEntity entity, AnimationProcessor<com.trolmastercard.sexmod.entity.GalathEntity> proc) {
        if (entity.aB == null || entity.aB.getAnimationState() != AnimationController.State.TRANSITIONING) {
            return;
        }
        if (entity.ai() != com.trolmastercard.sexmod.entity.ScenePose.cd) {
            return;
        }
        GeoBone body2 = proc.getBone("body2");
        if (body2 == null) {
            return;
        }
        body2.setPosX(0.0F);
        body2.setPosY(-0.53F);
        body2.setPosZ(-40.05F);
    }

    // Official ak.b.
    static Vec3 relativeEyeVec(net.minecraft.world.entity.Entity girl, Player player, float partial) {
        double eyeH = player.getEyeHeight();
        Vec3 girlPrev = new Vec3(girl.xo, girl.yo + eyeH, girl.zo);
        Vec3 girlPos = girl.position().add(0.0, eyeH, 0.0);
        Vec3 playerPrev = new Vec3(player.xo, player.yo, player.zo);
        Vec3 playerPos = player.position();
        return lerpVec(girlPrev, girlPos, partial).subtract(lerpVec(playerPrev, playerPos, partial));
    }

    // Official cv.a(Vec3d, Vec3d): velocity-to-pose vector. NaN guards are official.
    static Vec3 throwVec(Vec3 from, Vec3 to) {
        Vec3 delta = to.subtract(from);
        double sum = Math.abs(delta.x) + Math.abs(delta.y) + Math.abs(delta.z);
        double wy = Math.abs(delta.y) / sum;
        double w11 = wy / 2.0 + 0.5;
        float rot = (float) lerp(-180.0, 0.0, w11);
        if (Float.isNaN(rot)) {
            rot = -90.0F;
        }
        float pos;
        if (w11 < 0.5) {
            pos = 0.0F;
        } else {
            pos = (float) lerp(0.0, 16.0, -w11);
        }
        if (Float.isNaN(pos)) {
            pos = 0.0F;
        }
        float lift = (float) (4.0 - Math.sin(Math.PI / 2 + w11 * 2.0 * Math.PI) * 4.0);
        if (Float.isNaN(lift)) {
            lift = 8.0F;
        }
        return new Vec3(Math.toRadians(rot), pos, lift);
    }

    // Official gc.b (kept verbatim, including the radian-into-360 quirk in cb.k).
    static float wrap360(float value) {
        value %= 360.0F;
        if (value < 0.0F) {
            value += 360.0F;
        }
        return value;
    }

    static double lerp(double from, double to, double progress) {
        return from + (to - from) * progress;
    }

    static Vec3 lerpVec(Vec3 from, Vec3 to, double progress) {
        return new Vec3(lerp(from.x, to.x, progress), lerp(from.y, to.y, progress), lerp(from.z, to.z, progress));
    }

    static void hide(AnimationProcessor<?> proc, String bone, boolean hidden) {
        GeoBone geoBone = proc.getBone(bone);
        if (geoBone != null) {
            geoBone.setHidden(hidden);
        }
    }

    static boolean isDebugScreen() {
        Minecraft mc = Minecraft.getInstance();
        return mc != null && mc.getDebugOverlay() != null && mc.getDebugOverlay().showDebugScreen();
    }
}
