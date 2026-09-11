package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.entity.ScenePose;
import com.trolmastercard.sexmod.entity.player.PlayerSlimeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;

public class PlayerSlimeModel extends GirlModel<PlayerSlimeEntity> {
    public PlayerSlimeModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{ResourceLocation.fromNamespaceAndPath("sexmod", "slime/nude"), ResourceLocation.fromNamespaceAndPath("sexmod", "slime/armored"), ResourceLocation.fromNamespaceAndPath("sexmod", "slime/dressed")};
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/slime/slime.png");
    }

    // Official cr.a(em) ec branch: player slimes index the model directly.
    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1) {
        int outfit = var1.aj();
        if (outfit > this.i().length) {
            System.out.println("Girl doesn't have an outfit Nr." + outfit + " so im just making her nude lol");
            return this.i()[0];
        }
        return this.i()[outfit];
    }

    @Override
    public void setCustomAnimations(PlayerSlimeEntity entity, long instanceId, AnimationState<PlayerSlimeEntity> state) {
        super.setCustomAnimations(entity, instanceId, state);
        AnimationProcessor<PlayerSlimeEntity> proc = this.getAnimationProcessor();
        ScenePose pose = entity.ai();
        boolean doggy = pose == ScenePose.h || pose == ScenePose.i || pose == ScenePose.j || pose == ScenePose.k || pose == ScenePose.l || pose == ScenePose.m;
        GeoBone bedSlime = proc.getBone("bedSlime");
        GeoBone bedSlimeLayer = proc.getBone("bedSlimeLayer");
        if (bedSlime != null && bedSlimeLayer != null) {
            bedSlime.setHidden(!doggy);
            bedSlimeLayer.setHidden(!doggy);
        }
    }

    @Override
    protected ItemStack[] getSyncedEquipment(PlayerSlimeEntity entity) {
        if (!entity.ao() && entity.aj() != 0) {
            return new ItemStack[]{
                (ItemStack)entity.getEntityData().get(PlayerSlimeEntity.OUTFIT_HEAD),
                (ItemStack)entity.getEntityData().get(PlayerSlimeEntity.OUTFIT_CHEST),
                (ItemStack)entity.getEntityData().get(PlayerSlimeEntity.OUTFIT_LEGS),
                (ItemStack)entity.getEntityData().get(PlayerSlimeEntity.OUTFIT_FEET)};
        }
        return null;
    }

    // Official cr groups (shared with the NPC model; b, d, e stay empty).
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
