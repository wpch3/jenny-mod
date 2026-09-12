package com.trolmastercard.sexmod.client.model;

import net.minecraft.resources.ResourceLocation;

public class AllieModel extends GirlModel<com.trolmastercard.sexmod.entity.AllieEntity> {
    public AllieModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{ResourceLocation.fromNamespaceAndPath("sexmod", "allie/allie"), ResourceLocation.fromNamespaceAndPath("sexmod", "allie/armored"), ResourceLocation.fromNamespaceAndPath("sexmod", "allie/allie")};
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/allie/allie.png");
    }

    // Official c2.a(em): NPC allies only ever pick allie (0) or armored (2).
    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1) {
        int outfit = var1.aj();
        if (outfit > this.i().length) {
            System.out.println("Girl doesn't have an outfit Nr." + outfit + " so im just making her nude lol");
            return this.i()[0];
        }
        if (outfit == 1) {
            return this.i()[2];
        }
        return this.i()[0];
    }

    // Official c2 groups (b, d, e, g, h stay the gs empty defaults).
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
        return new String[]{"boobsFlesh", "clothes", "clothesR", "clothesL"};
    }

}
