package com.trolmastercard.sexmod.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;

/**
 * Official port of 1.12.2 cb applied to the player galath (er).
 *
 * <p>er.b() is hardcoded false (verified in bytecode), so the player never uses the con_mang
 * geo through the b() gate and never runs the f_ tail (no aE field, no ce.a call).
 * er.a() (wings) hides during the same 4 poses as the NPC.
 * er.c() (clothed) reads stub behavior state (ah/ap); no 1.21.1 analog exists, so this port
 * uses false (matching the NPC bb default).</p>
 *
 * <p>Skipped NPC-only helpers: cb.h, cb.b, cb.c, cb.i (all f_-gated), cb.f (no az timer).</p>
 */
public class PlayerGalathModel extends GirlModel<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> {
    public PlayerGalathModel() {
    }

    @Override
    protected ResourceLocation[] i() {
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
        return new String[]{"armorHelmet"};
    }

    @Override
    protected void a(com.trolmastercard.sexmod.entity.player.PlayerGalathEntity var1,
        AnimationProcessor<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> var2,
        AnimationState<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> var3) {
        // Official cb has no neck tracking; disable the GirlModel addition for fidelity.
    }

    @Override
    public void setCustomAnimations(com.trolmastercard.sexmod.entity.player.PlayerGalathEntity entity, long var2,
        AnimationState<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> state) {
        float partial = state.getPartialTick();
        AnimationProcessor<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> proc = this.getAnimationProcessor();
        this.aimMasturbateArms(entity, proc, partial);
        super.setCustomAnimations(entity, var2, state);
        this.boostFrameTilt(entity, proc, partial);
        this.updateClothVisibility(entity, proc);
        this.updateWingVisibility(entity, proc);
        GalathModel.hide(proc, "coin", true);
        this.updateFutaVisibility(proc);
        this.snapHugMangBody(entity, proc);
    }

    // Official cb.k (same as NPC; partner is always the client player, see GalathModel).
    private void aimMasturbateArms(com.trolmastercard.sexmod.entity.player.PlayerGalathEntity entity,
        AnimationProcessor<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> proc, float partial) {
        if (entity.ai() != com.trolmastercard.sexmod.entity.ScenePose.cc) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        Vec3 toPlayer = GalathModel.relativeEyeVec(entity, mc.player, partial).add(BoneOffsetTable.localOffset(entity, "head", partial));
        float yawTo = GalathModel.wrap360((float) Math.atan2(toPlayer.z, toPlayer.x)) - entity.getYRot();
        float pitchTo = GalathModel.wrap360((float) Math.atan2(toPlayer.y, Math.sqrt(toPlayer.x * toPlayer.x + toPlayer.z * toPlayer.z)));
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

    // Official cb.a(em). The player entity has no f2/G/H/I/J flight state, so zeros are used;
    // the BOOST-window +45 tilt still applies.
    private void boostFrameTilt(com.trolmastercard.sexmod.entity.player.PlayerGalathEntity entity,
        AnimationProcessor<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> proc, float partial) {
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
        tool.setRotX(tilt);
        tool.setRotZ(0.0F);
    }

    // Official cb.e with c() = false.
    private void updateClothVisibility(com.trolmastercard.sexmod.entity.player.PlayerGalathEntity entity,
        AnimationProcessor<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> proc) {
        boolean poseSet = GalathModel.poseIn(entity.ai(), com.trolmastercard.sexmod.entity.ScenePose.ci,
            com.trolmastercard.sexmod.entity.ScenePose.cj, com.trolmastercard.sexmod.entity.ScenePose.ck);
        GalathModel.hide(proc, "nippleR", true);
        GalathModel.hide(proc, "nippleL", true);
        GalathModel.hide(proc, "braBoobL", false);
        GalathModel.hide(proc, "braBoobR", false);
        GalathModel.hide(proc, "slip", poseSet);
    }

    // Official cb.g (same 4 poses as NPC, verified from er$a).
    private void updateWingVisibility(com.trolmastercard.sexmod.entity.player.PlayerGalathEntity entity,
        AnimationProcessor<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> proc) {
        GalathModel.hide(proc, "wings", GalathModel.poseIn(entity.ai(), com.trolmastercard.sexmod.entity.ScenePose.bT,
            com.trolmastercard.sexmod.entity.ScenePose.bU, com.trolmastercard.sexmod.entity.ScenePose.bV,
            com.trolmastercard.sexmod.entity.ScenePose.z));
    }

    // Official cb.a().
    private void updateFutaVisibility(AnimationProcessor<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> proc) {
        boolean show = GirlModel.a;
        GalathModel.hide(proc, "futaCock", !show);
        GalathModel.hide(proc, "futaBallLL", !show);
        GalathModel.hide(proc, "futaBallLR", !show);
    }

    // Official cb.d (not f_-gated, so shared with the player).
    private void snapHugMangBody(com.trolmastercard.sexmod.entity.player.PlayerGalathEntity entity,
        AnimationProcessor<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity> proc) {
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
}
