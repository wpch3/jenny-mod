package com.trolmastercard.sexmod.client.model;

import net.minecraft.resources.ResourceLocation;

public class PlayerJennyModel extends GirlModel<com.trolmastercard.sexmod.entity.player.PlayerJennyEntity> {
    public PlayerJennyModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{
            ResourceLocation.fromNamespaceAndPath("sexmod", "jenny/jennynude"), ResourceLocation.fromNamespaceAndPath("sexmod", "jenny/jennydressed")
        };
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/jenny/jenny.png");
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

    // Official c5 groups (shared with the NPC model; d, g stay empty).
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
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip"};
    }

    @Override
    public String[] e() {
        return new String[]{"fleshL", "fleshR", "vagina", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

}
