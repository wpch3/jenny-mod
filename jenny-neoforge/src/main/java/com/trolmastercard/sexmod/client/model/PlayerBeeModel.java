package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.entity.player.PlayerBeeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;

public class PlayerBeeModel extends GirlModel<PlayerBeeEntity> {
    public PlayerBeeModel() {
    }

    @Override
    protected String[] stuckBoneNames() {
        return STUCK_BONES_BASE;
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{ResourceLocation.fromNamespaceAndPath("sexmod", "bee/bee"), ResourceLocation.fromNamespaceAndPath("sexmod", "bee/armored")};
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/bee/bee.png");
    }

    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1) {
        int outfit = var1.aj();
        if (outfit > this.i().length) {
            System.out.println("Girl doesn't have an outfit Nr." + outfit + " so im just making her nude lol");
            return this.i()[0];
        }
        return this.i()[outfit];
    }

    // Player bees carry no synced chest state, so the chest bone stays hidden.
    @Override
    public void setCustomAnimations(PlayerBeeEntity entity, long instanceId, AnimationState<PlayerBeeEntity> state) {
        super.setCustomAnimations(entity, instanceId, state);
        AnimationProcessor<PlayerBeeEntity> proc = this.getAnimationProcessor();
        GeoBone chest = proc.getBone("chest");
        if (chest != null) {
            chest.setHidden(true);
        }
    }

    // Official c0 groups (shared with the NPC model; d stays empty).
    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] g() {
        return new String[]{"band", "feeler", "feeler2", "brow", "brow2", "brow3", "brow4"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs"};
    }

    @Override
    public String[] a() {
        return new String[]{"boobsFlesh", "upperBodyL", "upperBodyR"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip"};
    }

    @Override
    public String[] e() {
        return new String[]{"sideL", "sideR", "fleshL", "fleshR", "vagina", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

}
