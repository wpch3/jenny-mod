package com.trolmastercard.sexmod.client.model;

import net.minecraft.resources.ResourceLocation;

public class BiaModel extends GirlModel<com.trolmastercard.sexmod.entity.BiaEntity> {
    public BiaModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{ResourceLocation.fromNamespaceAndPath("sexmod", "bia/bianude"), ResourceLocation.fromNamespaceAndPath("sexmod", "bia/biadressed")};
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/bia/bia.png");
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

    // Official cl groups (d stays the gs empty default).
    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] g() {
        return new String[]{"leaf7", "leaf8"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorChest", "armorBoobs", "armorShoulderR", "armorShoulderL"};
    }

    @Override
    public String[] a() {
        return new String[]{"bra", "upperBodyR", "upperBodyL"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip"};
    }

    @Override
    public String[] e() {
        return new String[]{"slip", "fleshL", "fleshR", "vagina", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

}
