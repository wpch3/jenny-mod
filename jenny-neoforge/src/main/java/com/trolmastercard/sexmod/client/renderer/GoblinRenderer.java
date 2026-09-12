package com.trolmastercard.sexmod.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.Arrays;
import java.util.HashSet;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.core.Vec3i;

public class GoblinRenderer extends GirlRenderer<com.trolmastercard.sexmod.entity.GoblinEntity> {
    static final HashSet<String> a = new HashSet<>(
        Arrays.asList(
            "meatTorso",
            "meatCheekR",
            "meatCheekL",
            "meatFootR",
            "meatFootL",
            "meatShinR",
            "meatShinL",
            "meatLegL",
            "meatLegR",
            "nippleR",
            "nippleL",
            "preggy",
            "shoeL",
            "shoeR",
            "frontAndInside",
            "Lside",
            "Rside",
            "cheekR",
            "cheekL",
            "fuckhole",
            "head",
            "nose",
            "neck",
            "armL",
            "lowerArmL",
            "armR",
            "lowerArmR",
            "torso",
            "LegL",
            "LegR",
            "shinL",
            "shinR"
        )
    );

    public GoblinRenderer(Context var1) {
        super(var1, new com.trolmastercard.sexmod.client.model.GoblinModel());
    }

    @Override
    protected void applyRotations(com.trolmastercard.sexmod.entity.GoblinEntity var1, PoseStack var2, float var3, float var4, float var5, float var6) {
        super.applyRotations(var1, var2, var3, com.trolmastercard.sexmod.client.renderer.NpcRenderUtils.a(var1, var4, var5), var5, var6);
    }

    @Override
    protected int a(com.trolmastercard.sexmod.entity.GoblinEntity var1, String var2) {
        if (var2.contains("band")) {
            return -1;
        } else if (var2.contains("eyeColor")) {
            return b(var1);
        } else if (var2.contains("variant") || var2.contains("boob")) {
            return a(var1);
        } else if (var2.contains("hair")) {
            return -1;
        } else {
            return a.contains(var2) ? a(var1) : -1;
        }
    }

    private static int a(com.trolmastercard.sexmod.entity.GoblinEntity var0) {
        return a(a((String)var0.getEntityData().get(com.trolmastercard.sexmod.entity.VariantGirlEntity.U)).a());
    }

    private static int b(com.trolmastercard.sexmod.entity.GoblinEntity var0) {
        return a((Vec3i)var0.getEntityData().get(com.trolmastercard.sexmod.entity.VariantGirlEntity.V));
    }

    private static int a(Vec3i var0) {
        return var0.getX() << 16 | var0.getY() << 8 | var0.getZ();
    }

    private static com.trolmastercard.sexmod.entity.GoblinColorB a(String var0) {
        try {
            return com.trolmastercard.sexmod.entity.GoblinColorB.valueOf(var0);
        } catch (IllegalArgumentException var2) {
            return com.trolmastercard.sexmod.entity.GoblinEntity.a;
        }
    }
}
