package com.trolmastercard.sexmod.b.b;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.Arrays;
import java.util.HashSet;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.core.Vec3i;

public class m extends t<com.trolmastercard.sexmod.f.b.f> {
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

    public m(Context var1) {
        super(var1, new com.trolmastercard.sexmod.b.a.m());
    }

    protected void a(com.trolmastercard.sexmod.f.b.f var1, PoseStack var2, float var3, float var4, float var5, float var6) {
        super.applyRotations(var1, var2, var3, com.trolmastercard.sexmod.b.b.a.a(var1, var4, var5), var5, var6);
    }

    protected int a(com.trolmastercard.sexmod.f.b.f var1, String var2) {
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

    private static int a(com.trolmastercard.sexmod.f.b.f var0) {
        return a(a((String)var0.getEntityData().get(com.trolmastercard.sexmod.f.b.n.U)).a());
    }

    private static int b(com.trolmastercard.sexmod.f.b.f var0) {
        return a((Vec3i)var0.getEntityData().get(com.trolmastercard.sexmod.f.b.n.V));
    }

    private static int a(Vec3i var0) {
        return var0.getX() << 16 | var0.getY() << 8 | var0.getZ();
    }

    private static com.trolmastercard.sexmod.m.g a(String var0) {
        try {
            return com.trolmastercard.sexmod.m.g.valueOf(var0);
        } catch (IllegalArgumentException var2) {
            return com.trolmastercard.sexmod.f.b.f.a;
        }
    }
}
