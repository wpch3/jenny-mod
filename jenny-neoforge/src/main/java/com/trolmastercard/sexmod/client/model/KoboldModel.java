package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.entity.KoboldEntity;
import com.trolmastercard.sexmod.entity.ScenePose;
import com.trolmastercard.sexmod.entity.VariantGirlEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;

public class KoboldModel extends GirlModel<KoboldEntity> {
    public KoboldModel() {
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
    public void setCustomAnimations(KoboldEntity entity, long instanceId, AnimationState<KoboldEntity> state) {
        super.setCustomAnimations(entity, instanceId, state);
        AnimationProcessor<KoboldEntity> proc = this.getAnimationProcessor();
        ScenePose pose = entity.ai();
        boolean showTrim = !entity.ao();
        VariantModelEffects.applyCrownAndEgg(proc, showTrim && (Boolean)entity.getEntityData().get(KoboldEntity.HAS_CROWN),
            showTrim && (Boolean)entity.getEntityData().get(KoboldEntity.HAS_EGG));
        VariantModelEffects.applyCustomization(proc, VariantGirlEntity.f(entity), pose);
        VariantModelEffects.applyTounge(proc, pose);
        VariantModelEffects.applySexOffsets(proc, pose, (Float)entity.getEntityData().get(KoboldEntity.b), entity.aB);
    }

    // Official c9 groups (g stays the gs empty default: kobolds have no head flesh layer).
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
