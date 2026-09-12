package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.entity.BeeEntity;
import com.trolmastercard.sexmod.entity.ContainerGirlEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;

public class BeeModel extends GirlModel<BeeEntity> {
    public BeeModel() {
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
        return ResourceLocation.fromNamespaceAndPath("sexmod", "bee/bee");
    }

    // Official c0 main: the carried chest shows while the chest idle plays.
    @Override
    public void setCustomAnimations(BeeEntity entity, long instanceId, AnimationState<BeeEntity> state) {
        super.setCustomAnimations(entity, instanceId, state);
        AnimationProcessor<BeeEntity> proc = this.getAnimationProcessor();
        GeoBone chest = proc.getBone("chest");
        if (chest != null) {
            chest.setHidden(!(Boolean)entity.getEntityData().get(ContainerGirlEntity.d));
        }
    }

    // Official c0 groups (d stays the gs empty default).
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
