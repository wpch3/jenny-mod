package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.entity.ScenePose;
import com.trolmastercard.sexmod.entity.SlimeGirlEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;

public class SlimeGirlModel extends GirlModel<SlimeGirlEntity> {
    public SlimeGirlModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{ResourceLocation.fromNamespaceAndPath("sexmod", "slime/nude"), ResourceLocation.fromNamespaceAndPath("sexmod", "slime/armored"), ResourceLocation.fromNamespaceAndPath("sexmod", "slime/dressed")};
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/slime/slime.png");
    }

    // Official cr.a(em): NPC slimes only ever pick nude (0) or dressed (2).
    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "slime/slime");
    }

    @Override
    public void setCustomAnimations(SlimeGirlEntity entity, long instanceId, AnimationState<SlimeGirlEntity> state) {
        super.setCustomAnimations(entity, instanceId, state);
        AnimationProcessor<SlimeGirlEntity> proc = this.getAnimationProcessor();
        ScenePose pose = entity.ai();
        boolean doggy = pose == ScenePose.h || pose == ScenePose.i || pose == ScenePose.j || pose == ScenePose.k || pose == ScenePose.l || pose == ScenePose.m;
        GeoBone bedSlime = proc.getBone("bedSlime");
        GeoBone bedSlimeLayer = proc.getBone("bedSlimeLayer");
        if (bedSlime != null && bedSlimeLayer != null) {
            bedSlime.setHidden(!doggy);
            bedSlimeLayer.setHidden(!doggy);
        }
        copyHeadToHat(proc);
    }

    // Official cr.a(String[], String): the hat follows the head exactly.
    private static void copyHeadToHat(AnimationProcessor<?> proc) {
        GeoBone hat;
        GeoBone head;
        try {
            hat = proc.getBone("hat");
            head = proc.getBone("head");
        } catch (RuntimeException e) {
            return;
        }
        if (hat == null || head == null) {
            return;
        }
        hat.setRotX(head.getRotX());
        hat.setRotY(head.getRotY());
        hat.setRotZ(head.getRotZ());
        hat.setPosX(head.getPosX());
        hat.setPosY(head.getPosY());
        hat.setPosZ(head.getPosZ());
    }

    @Override
    protected ItemStack[] getSyncedEquipment(SlimeGirlEntity entity) {
        if (!entity.ao() && entity.aj() != 0) {
            return new ItemStack[]{
                (ItemStack)entity.getEntityData().get(SlimeGirlEntity.OUTFIT_HEAD),
                (ItemStack)entity.getEntityData().get(SlimeGirlEntity.OUTFIT_CHEST),
                (ItemStack)entity.getEntityData().get(SlimeGirlEntity.OUTFIT_LEGS),
                (ItemStack)entity.getEntityData().get(SlimeGirlEntity.OUTFIT_FEET)};
        }
        return null;
    }

    // Official cr groups (b, d, e stay the gs empty defaults).
    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] g() {
        return new String[]{"bigblob"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs"};
    }

    @Override
    public String[] a() {
        return new String[]{"boobsFlesh", "upperBodyL", "upperBodyR", "cloth"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip"};
    }

}
