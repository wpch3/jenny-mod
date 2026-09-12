package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.entity.ScenePose;
import com.trolmastercard.sexmod.entity.player.PlayerKoboldEntity;
import com.trolmastercard.sexmod.entity.player.PlayerVariantGirlEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;

public class PlayerKoboldModel extends GirlModel<PlayerKoboldEntity> {
    public PlayerKoboldModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{ResourceLocation.fromNamespaceAndPath("sexmod", "kobold/kobold"), ResourceLocation.fromNamespaceAndPath("sexmod", "kobold/armored")};
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/kobold/kobold.png");
    }

    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "kobold/kobold");
    }

    @Override
    public void setCustomAnimations(PlayerKoboldEntity entity, long instanceId, AnimationState<PlayerKoboldEntity> state) {
        super.setCustomAnimations(entity, instanceId, state);
        AnimationProcessor<PlayerKoboldEntity> proc = this.getAnimationProcessor();
        ScenePose pose = entity.ai();
        VariantModelEffects.applyCrownAndEgg(proc, false, false);
        VariantModelEffects.applyCustomization(proc, playerCustomCodes(entity), pose);
        VariantModelEffects.applyTounge(proc, pose);
        VariantModelEffects.applySexOffsets(proc, pose, (Float)entity.getEntityData().get(PlayerKoboldEntity.s), entity.aB);
    }

    private static String[] playerCustomCodes(PlayerKoboldEntity entity) {
        String custom = (String)entity.getEntityData().get(PlayerVariantGirlEntity.n);
        return custom == null ? new String[0] : custom.split("-");
    }

    // Official c9 groups (shared with the NPC model; g stays empty).
    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
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
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip", "armorKneeR", "armorKneeL"};
    }

    @Override
    public String[] e() {
        return new String[]{"fleshL", "fleshR", "vagina", "fuckhole", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

    @Override
    public String[] d() {
        return new String[]{"toesR", "toesL"};
    }

}
