package com.trolmastercard.sexmod.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;

/**
 * Official port of 1.12.2 ce (manglelie model).
 *
 * <p>Helper order in {@link #setCustomAnimations} matches ce.main exactly:
 * super, a(em,proc,partial), b, d, a(em), e. {@link #applyConMangEffects} is also called
 * from {@link GalathModel} for the official cb main-tail (ce.a static).</p>
 *
 * <p>Official entity mappings used here (see port report):<br>
 * - f8.r() (attached flag) - bool param b (set by the galath spawn code).<br>
 * - f8.b() (carrier entity) - r() (entity id param c).<br>
 * - f8.a(Z) (galath partner) - b(Z) (narrowed to GalathEntity; official is f_-typed).<br>
 * - f_.a(Z) (manglelie partner) - GalathEntity.a(Z) (exists in 1.21.1).<br>
 * - f8.b(F) (carry blend) - carryBlend field (default 0; official behavior writes it).<br>
 * - f8.a(Vec3d,F) (reach-side test, stub) - inferred: carrier on the manglelie right side.<br>
 * - f_.a(f_,F) (nullable sway override, stub) - always null, head-yaw lerp fallback is used
 * (official at/as fields feed head yaw: they are bulk-copied with yaw in the disguise code).<br>
 * - em.b(String) bone offsets - {@link BoneOffsetTable} rest pivots (no renderer hook).<br>
 * - ce.k/ce.i constants are never referenced by any decoded ce path and are omitted.</p>
 */
public class ManglelieModel extends GirlModel<com.trolmastercard.sexmod.entity.ManglelieEntity> {
    private static final float M35 = (float) Math.toRadians(35.0F);
    private static final float L140 = (float) Math.toRadians(140.0F);
    private static final float G45 = (float) Math.toRadians(45.0F);
    private static final float RAD90 = (float) Math.toRadians(90.0F);

    public ManglelieModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        // Official ce.a(): manglelie, manglelie, galath_con_mang.
        return new ResourceLocation[]{
            ResourceLocation.fromNamespaceAndPath("sexmod", "manglelie/manglelie"),
            ResourceLocation.fromNamespaceAndPath("sexmod", "manglelie/manglelie"),
            ResourceLocation.fromNamespaceAndPath("sexmod", "galath/galath_con_mang")
        };
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/manglelie/manglelie.png");
    }

    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "manglelie/manglelie");
    }

    @Override
    public ResourceLocation getModelResource(com.trolmastercard.sexmod.entity.ManglelieEntity entity) {
        // Official ce.a(em): threesome poses use c[2].
        if (isThreesomePose(entity.ai())) {
            return a(this.b[2]);
        }
        return super.getModelResource(entity);
    }

    @Override
    protected void a(com.trolmastercard.sexmod.entity.ManglelieEntity var1,
        AnimationProcessor<com.trolmastercard.sexmod.entity.ManglelieEntity> var2,
        AnimationState<com.trolmastercard.sexmod.entity.ManglelieEntity> var3) {
        // Official ce drives the head itself (ce.b); disable the GirlModel addition for fidelity.
    }

    static boolean isThreesomePose(com.trolmastercard.sexmod.entity.ScenePose pose) {
        return GalathModel.poseIn(pose, com.trolmastercard.sexmod.entity.ScenePose.cf, com.trolmastercard.sexmod.entity.ScenePose.cg,
            com.trolmastercard.sexmod.entity.ScenePose.ch);
    }

    @Override
    public void setCustomAnimations(com.trolmastercard.sexmod.entity.ManglelieEntity entity, long var2,
        AnimationState<com.trolmastercard.sexmod.entity.ManglelieEntity> state) {
        float partial = state.getPartialTick();
        AnimationProcessor<com.trolmastercard.sexmod.entity.ManglelieEntity> proc = this.getAnimationProcessor();
        super.setCustomAnimations(entity, var2, state);
        applyConMangEffects(entity, proc, partial);
        this.trackHeadWithGalath(entity, proc);
        this.poseCarryArms(entity, proc, partial);
        this.mirrorGalathBody(entity, proc);
        this.poseCorruptLimbs(entity, proc);
    }

    // Official ce.a static (also invoked from the cb main-tail).
    public static void applyConMangEffects(com.trolmastercard.sexmod.entity.GirlEntity entity, AnimationProcessor<?> proc, float partial) {
        boolean partnered = partnerNonThreesome(entity);
        updateCheekVisibility(proc, partnered);
        updateSkirtVisibility(proc, partnered);
        updateCockStage(entity, proc);
    }

    // Official dh.a(em).
    static boolean partnerNonThreesome(com.trolmastercard.sexmod.entity.GirlEntity entity) {
        com.trolmastercard.sexmod.entity.GirlEntity other = entity;
        if (entity instanceof com.trolmastercard.sexmod.entity.GalathEntity galath) {
            other = galath.a(false);
        }
        if (other == null) {
            return false;
        }
        return !isThreesomePose(other.ai());
    }

    // Official ce.f.
    static void updateSkirtVisibility(AnimationProcessor<?> proc, boolean show) {
        GalathModel.hide(proc, "skirt", !show);
    }

    // Official ce.e.
    static void updateCheekVisibility(AnimationProcessor<?> proc, boolean flag) {
        GalathModel.hide(proc, "cheekRBelowSkirt", flag);
        GalathModel.hide(proc, "cheekLBelowSkirt", flag);
        GalathModel.hide(proc, "sideRNoSkirt", flag);
        GalathModel.hide(proc, "sideRSkirt", !flag);
        GalathModel.hide(proc, "sideLNoSkirt", flag);
        GalathModel.hide(proc, "sideLSkirt", !flag);
    }

    // Official ce.b static (f8-only; cockStage bones exist only on the con_mang geo).
    static void updateCockStage(com.trolmastercard.sexmod.entity.GirlEntity entity, AnimationProcessor<?> proc) {
        if (!(entity instanceof com.trolmastercard.sexmod.entity.ManglelieEntity mang)) {
            return;
        }
        for (int stage = 0; stage < 3; stage++) {
            GalathModel.hide(proc, "cockStage" + stage, stage > mang.an);
        }
    }

    // Official ce.b(em). Gate dh.b(f8) = r() && !ce.c(em).
    private void trackHeadWithGalath(com.trolmastercard.sexmod.entity.ManglelieEntity entity,
        AnimationProcessor<com.trolmastercard.sexmod.entity.ManglelieEntity> proc) {
        if (!entity.b()) {
            return;
        }
        if (isThreesomePose(entity.ai())) {
            return;
        }
        if (!(entity.b(false) instanceof com.trolmastercard.sexmod.entity.GalathEntity galath)) {
            return;
        }
        float headPitch = galath.aE;
        GeoBone tool = proc.getBone("rotationTool");
        if (tool != null) {
            tool.setRotX(headPitch);
        }
        GeoBone head = proc.getBone("head");
        GeoBone upper = proc.getBone("upperBody");
        GeoBone boobs = proc.getBone("boobs");
        if (headPitch > 0.0F) {
            if (upper != null) {
                upper.setRotX(-1.1111112F * headPitch);
            }
            if (head != null) {
                head.setRotX(0.1333F * headPitch);
            }
            if (boobs != null) {
                boobs.setRotX(headPitch * 22.5F / 45.0F);
            }
        } else {
            if (upper != null) {
                upper.setRotX(-1.6666666F * headPitch);
            }
            if (head != null) {
                head.setRotX(headPitch * 0.666F);
            }
        }
        float yawDiff = angleDiff(entity.T, entity.af);
        float pitchDiff = angleDiff(entity.ai, entity.W);
        float fps = currentFps();
        entity.T = entity.T + 7.0F * clamp7(yawDiff) / fps;
        entity.ai = entity.ai + 7.0F * clamp7(pitchDiff) / fps;
        if (head != null) {
            head.setRotY(head.getRotY() + entity.T);
            head.setRotX(head.getRotX() + entity.ai);
        }
    }

    // Official ce.d(em).
    private void poseCarryArms(com.trolmastercard.sexmod.entity.ManglelieEntity entity,
        AnimationProcessor<com.trolmastercard.sexmod.entity.ManglelieEntity> proc, float partial) {
        if (isThreesomePose(entity.ai())) {
            return;
        }
        if (GalathModel.isDebugScreen()) {
            return;
        }
        if (!entity.b()) {
            return;
        }
        if (!(entity.b(false) instanceof com.trolmastercard.sexmod.entity.GalathEntity galath)) {
            return;
        }
        GeoBone armL = proc.getBone("armL");
        GeoBone armR = proc.getBone("armR");
        GeoBone lowL = proc.getBone("lowerArmL");
        GeoBone lowR = proc.getBone("lowerArmR");
        GeoBone elbowR = proc.getBone("elbowR");
        GeoBone elbowL = proc.getBone("elbowL");
        Entity carrier = entity.r();
        boolean noCarrier = carrier == null;
        if (!noCarrier) {
            entity.R = eyePos(carrier, partial);
        }
        float fps = currentFps();
        if (entity.aj == noCarrier) {
            entity.V = 0.0F;
        } else {
            entity.V = entity.V + 1.5F / fps;
        }
        if (entity.V >= 1.0F) {
            entity.V = 0.0F;
            entity.aj = noCarrier;
        }
        MangPose pose;
        if (entity.V == 0.0F) {
            pose = noCarrier
                ? buildFreePose(galath, armR, armL, lowL, lowR)
                : buildCarryPose(entity, galath, lowR, lowL, proc, partial);
        } else {
            MangPose freePose = buildFreePose(galath, armR, armL, lowL, lowR);
            MangPose carryPose = buildCarryPose(entity, galath, lowR, lowL, proc, partial);
            float weight = entity.aj ? (float) easeOutBack(entity.V) : (float) (1.0 - easeOutBack(entity.V));
            pose = MangPose.lerp(freePose, carryPose, weight);
        }
        setRot(armR, pose.c);
        setRot(armL, pose.g);
        setRot(lowL, pose.h);
        setRot(lowR, pose.b);
        if (armL != null) {
            armL.setScaleY(pose.f);
        }
        if (armR != null) {
            armR.setScaleY(pose.a);
        }
        if (elbowR != null) {
            elbowR.setRotY(pose.e);
        }
        if (elbowL != null) {
            elbowL.setRotY(pose.d);
        }
    }

    // Official ce.a(em): mirror the galath body write-back (bw/bm from cb.c).
    private void mirrorGalathBody(com.trolmastercard.sexmod.entity.ManglelieEntity entity,
        AnimationProcessor<com.trolmastercard.sexmod.entity.ManglelieEntity> proc) {
        if (isThreesomePose(entity.ai())) {
            return;
        }
        if (!(entity.b(false) instanceof com.trolmastercard.sexmod.entity.GalathEntity galath)) {
            return;
        }
        GeoBone body = proc.getBone("body");
        if (body == null) {
            return;
        }
        body.setRotY(galath.bw + (GalathModel.isDebugScreen() ? 0.0F : body.getRotY()));
        body.setScaleX(galath.bm);
        body.setScaleY(galath.bm);
        body.setScaleZ(galath.bm);
    }

    // Official ce.e(em).
    private void poseCorruptLimbs(com.trolmastercard.sexmod.entity.ManglelieEntity entity,
        AnimationProcessor<com.trolmastercard.sexmod.entity.ManglelieEntity> proc) {
        if (GalathModel.isDebugScreen()) {
            return;
        }
        if (isThreesomePose(entity.ai())) {
            return;
        }
        if (!(entity.b(false) instanceof com.trolmastercard.sexmod.entity.GalathEntity galath)) {
            return;
        }
        if (!GalathModel.poseIn(galath.ai(), com.trolmastercard.sexmod.entity.ScenePose.bV, com.trolmastercard.sexmod.entity.ScenePose.bs,
            com.trolmastercard.sexmod.entity.ScenePose.bW, com.trolmastercard.sexmod.entity.ScenePose.bT)) {
            return;
        }
        float tilt = (float) Math.toRadians(-45.0F);
        GeoBone legR = proc.getBone("legR");
        if (legR != null) {
            legR.setRotY(legR.getRotY() + tilt);
        }
        GeoBone lowR = proc.getBone("lowerArmR");
        if (lowR != null) {
            lowR.setRotX(lowR.getRotX() + tilt);
        }
        GeoBone lowL = proc.getBone("lowerArmL");
        if (lowL != null) {
            lowL.setRotX(lowL.getRotX() + tilt);
        }
    }

    // Official ce builder a(f_, armR, armL, lowerArmL, lowerArmR).
    static MangPose buildFreePose(com.trolmastercard.sexmod.entity.GalathEntity galath, GeoBone armR, GeoBone armL, GeoBone lowL, GeoBone lowR) {
        float headPitch = galath.aE;
        MangPose pose = new MangPose();
        if (headPitch > 0.0F) {
            pose.c = new float[]{rotX(armR) - headPitch, rotY(armR) - headPitch * -25.0F / 45.0F, rotZ(armR) + headPitch * 12.5F / 45.0F};
            pose.g = new float[]{rotX(armL) - headPitch, rotY(armL) + headPitch * 15.0F / 45.0F, rotZ(armL)};
            pose.b = readRot(lowL);
            pose.h = readRot(lowR);
        } else {
            pose.h = new float[]{rotX(lowR) + 2.0F * headPitch, rotY(lowR), rotZ(lowR)};
            pose.b = new float[]{rotX(lowL) + 2.2222223F * headPitch, rotY(lowL), rotZ(lowL)};
            pose.c = new float[]{rotX(armR) - headPitch, rotY(armR), rotZ(armR) + headPitch * 5.0F / 45.0F};
            pose.g = new float[]{rotX(armL) - headPitch, rotY(armL), rotZ(armL) - headPitch * 5.0F / 45.0F};
        }
        return pose;
    }

    // Official ce builder a(f8, f_, lowerArmR, lowerArmL, proc): carry arm IK.
    static MangPose buildCarryPose(com.trolmastercard.sexmod.entity.ManglelieEntity mang, com.trolmastercard.sexmod.entity.GalathEntity galath,
        GeoBone lowR, GeoBone lowL, AnimationProcessor<?> proc, float partial) {
        MangPose pose = new MangPose();
        pose.h = new float[]{M35, 0.0F, rotZ(lowR)};
        pose.b = new float[]{L140, 0.0F, rotZ(lowL)};
        float headPitchSum = galath.aE + rotX(proc.getBone("upperBody"));
        // Official dh.a(f_, F) = ak.a(galath, partial) + galath.b("mangPos").
        Vec3 anchor = lerpPos(galath, partial).add(BoneOffsetTable.localOffset(galath, "mangPos", partial));
        Vec3 armRWorld = BoneOffsetTable.localOffset(mang, "armR", partial).add(anchor);
        Vec3 armLWorld = BoneOffsetTable.localOffset(mang, "armL", partial).add(anchor);
        Vec3 target = mang.R == null ? anchor : mang.R;
        float[] aimR = yawPitchAim(armRWorld, target);
        float[] aimL = yawPitchAim(armLWorld, target);
        float headYaw = angleLerpDeg(galath.yHeadRotO, galath.getYHeadRot(), partial);
        float sway = (float) Math.toRadians(headYaw);
        float blend = mang.carryBlend;
        float eased = (float) easeQuartOut(Math.min(1.0F, blend));
        float morph;
        if (eased == 1.0F) {
            morph = Math.max(0.0F, (blend * 28.0F - 28.0F) / 32.0F - 0.5F) * 2.0F;
        } else {
            morph = 0.0F;
        }
        float morphEased = (float) cosineIO(morph);
        float spread = (float) Math.toRadians(GalathModel.lerp(0.0F, 90.0F, eased));
        if (carrierOnRight(mang, target, partial)) {
            pose.c = new float[]{-headPitchSum + aimR[0] + RAD90, aimR[1], 0.0F};
            pose.g = new float[]{-headPitchSum + aimL[0] + RAD90,
                (float) (aimL[1] + Math.toRadians(-20.0) + aimR[1] * Math.cos(aimR[1] + sway) + GalathModel.lerp(spread / 2, 0.0F, morphEased)), 0.0F};
            pose.f = 1.0F + Math.abs(Math.abs(aimR[1]) - Math.abs(sway)) * 0.1909F;
            pose.d = RAD90;
            pose.h[2] = (float) GalathModel.lerp(spread, 0.0F, morphEased);
            if (morph > 0.5) {
                pose.h[0] = M35 + (float) GalathModel.lerp(0.0, G45, cosineIO((morph - 0.5) * 2));
            } else if (morph != 0.0F && morph < 0.5) {
                pose.h[0] = M35 + (float) GalathModel.lerp(0.0, G45, cosineIO(morph * 2));
            }
        } else {
            pose.g = new float[]{-headPitchSum + aimL[0] + RAD90, aimL[1], 0.0F};
            pose.c = new float[]{-headPitchSum + aimR[0] + RAD90,
                (float) (aimR[1] + Math.toRadians(20.0) + aimL[1] * Math.cos(aimL[1] + sway) - GalathModel.lerp(spread / 2, 0.0F, morphEased)), 0.0F};
            pose.a = 1.0F + Math.abs(Math.abs(aimL[1]) - Math.abs(sway)) * 0.1909F;
            pose.e = RAD90;
            pose.b[2] = -(float) GalathModel.lerp(spread, 0.0F, morphEased);
            if (morph > 0.5) {
                pose.b[0] = L140 + (float) GalathModel.lerp(0.0, G45, cosineIO((morph - 0.5) * 2));
            } else if (morph != 0.0F && morph < 0.5) {
                pose.b[0] = L140 + (float) GalathModel.lerp(0.0, G45, cosineIO(morph * 2));
            }
        }
        pose.c[1] += sway;
        pose.g[1] += sway;
        return pose;
    }

    // Official ce.a(Entity): lerped position (or lock target) + eye height.
    static Vec3 eyePos(Entity entity, float partial) {
        Vec3 base;
        if (entity instanceof com.trolmastercard.sexmod.entity.GirlEntity girl
            && (Boolean) girl.getEntityData().get(com.trolmastercard.sexmod.entity.GirlEntity.ap)) {
            base = girl.am();
        } else {
            base = lerpPos(entity, partial);
        }
        return base.add(0.0, entity.getEyeHeight(), 0.0);
    }

    static Vec3 lerpPos(Entity entity, float partial) {
        return new Vec3(GalathModel.lerp(entity.xo, entity.getX(), partial), GalathModel.lerp(entity.yo, entity.getY(), partial),
            GalathModel.lerp(entity.zo, entity.getZ(), partial));
    }

    // Official be.a(Vec3d, Vec3d): [yaw, pitch] from one world point to another.
    static float[] yawPitchAim(Vec3 from, Vec3 to) {
        Vec3 dir = to.subtract(from).normalize();
        return new float[]{(float) Math.atan2(dir.x, dir.z),
            (float) Math.atan2(dir.y, Math.sqrt(dir.x * dir.x + dir.z * dir.z))};
    }

    // Official f8.a(Vec3d, F) is a stub; inferred as a carrier-side test (see class javadoc).
    static boolean carrierOnRight(com.trolmastercard.sexmod.entity.ManglelieEntity mang, Vec3 target, float partial) {
        Vec3 eye = lerpPos(mang, partial).add(0.0, mang.getEyeHeight(), 0.0);
        Vec3 toTarget = target.subtract(eye);
        double yaw = Math.toRadians(mang.getYRot());
        double rightX = -Math.cos(yaw);
        double rightZ = -Math.sin(yaw);
        return toTarget.x * rightX + toTarget.z * rightZ > 0.0;
    }

    // Official b6.b(FFD): degree angle lerp.
    static float angleLerpDeg(float from, float to, double progress) {
        double fromRad = Math.toRadians(from);
        double toRad = Math.toRadians(to);
        double diff = toRad - fromRad;
        while (diff < -Math.PI) {
            diff += Math.PI * 2;
        }
        while (diff >= Math.PI) {
            diff -= Math.PI * 2;
        }
        return (float) Math.toDegrees(fromRad + diff * progress);
    }

    // Official be.a(DD): wrapped angle difference.
    static float angleDiff(double from, double to) {
        from = (from + Math.PI * 2) % (Math.PI * 2);
        to = (to + Math.PI * 2) % (Math.PI * 2);
        double diff = to - from;
        while (diff < -Math.PI) {
            diff += Math.PI * 2;
        }
        while (diff >= Math.PI) {
            diff -= Math.PI * 2;
        }
        return (float) diff;
    }

    static float clamp7(float value) {
        if (Math.abs(value) < 7.0F) {
            return value;
        }
        return value > 0.0F ? 7.0F : -7.0F;
    }

    // Official b6.c (easeOutBack).
    static double easeOutBack(double value) {
        double c3 = 1.70158;
        double c1 = c3 + 1.0;
        return 1.0 + c1 * Math.pow(value - 1.0, 3.0) + c3 * Math.pow(value - 1.0, 2.0);
    }

    // Official b6.e (easeOutQuart).
    static double easeQuartOut(double value) {
        return 1.0 - Math.pow(1.0 - value, 4.0);
    }

    // Official b6.h (cosine in-out).
    static double cosineIO(double value) {
        return -(Math.cos(Math.PI * value) - 1.0) / 2.0;
    }

    static float currentFps() {
        Minecraft mc = Minecraft.getInstance();
        if (mc == null) {
            return 1.0F;
        }
        float fps = mc.getFps();
        return fps == 0.0F ? 1.0F : fps;
    }

    static float rotX(GeoBone bone) {
        return bone == null ? 0.0F : bone.getRotX();
    }

    static float rotY(GeoBone bone) {
        return bone == null ? 0.0F : bone.getRotY();
    }

    static float rotZ(GeoBone bone) {
        return bone == null ? 0.0F : bone.getRotZ();
    }

    static float[] readRot(GeoBone bone) {
        return new float[]{rotX(bone), rotY(bone), rotZ(bone)};
    }

    static void setRot(GeoBone bone, float[] rot) {
        if (bone == null) {
            return;
        }
        bone.setRotX(rot[0]);
        bone.setRotY(rot[1]);
        bone.setRotZ(rot[2]);
    }

    // Official ce$a pose struct (field names kept, defaults match: f/a = 1, e/d = 0).
    static class MangPose {
        float[] c = new float[3];
        float[] g = new float[3];
        float[] h = new float[3];
        float[] b = new float[3];
        float f = 1.0F;
        float a = 1.0F;
        float e = 0.0F;
        float d = 0.0F;

        static MangPose lerp(MangPose first, MangPose second, float weight) {
            MangPose out = new MangPose();
            for (int i = 0; i < 3; i++) {
                out.c[i] = (float) GalathModel.lerp(first.c[i], second.c[i], weight);
                out.g[i] = (float) GalathModel.lerp(first.g[i], second.g[i], weight);
                out.h[i] = (float) GalathModel.lerp(first.h[i], second.h[i], weight);
                out.b[i] = (float) GalathModel.lerp(first.b[i], second.b[i], weight);
            }
            out.f = (float) GalathModel.lerp(first.f, second.f, weight);
            out.a = (float) GalathModel.lerp(first.a, second.a, weight);
            out.e = (float) GalathModel.lerp(first.e, second.e, weight);
            out.d = (float) GalathModel.lerp(first.d, second.d, weight);
            return out;
        }
    }
}
