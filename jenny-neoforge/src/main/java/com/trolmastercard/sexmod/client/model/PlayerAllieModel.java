package com.trolmastercard.sexmod.client.model;

import net.minecraft.resources.ResourceLocation;

public class PlayerAllieModel extends GirlModel<com.trolmastercard.sexmod.entity.player.PlayerAllieEntity> {
    public PlayerAllieModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{
            ResourceLocation.fromNamespaceAndPath("sexmod", "allie/allie"),
            ResourceLocation.fromNamespaceAndPath("sexmod", "allie/armored"),
            ResourceLocation.fromNamespaceAndPath("sexmod", "allie/allie")
        };
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/allie/allie.png");
    }

    // Official c2.a(em) e5 branch: player allies index the model directly.
    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1) {
        int outfit = var1.aj();
        if (outfit > this.i().length) {
            System.out.println("Girl doesn't have an outfit Nr." + outfit + " so im just making her nude lol");
            return this.i()[0];
        }
        return this.i()[outfit];
    }

    // Official c2 groups (shared with the NPC model; b, d, e, g, h stay empty).
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
