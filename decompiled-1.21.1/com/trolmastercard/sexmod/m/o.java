package com.trolmastercard.sexmod.m;

import net.minecraft.world.phys.Vec3;

public class o {
    public static Vec3 a(double var0, double var2, double var4, float var6) {
        return a(new Vec3(var0, var2, var4), var6);
    }

    public static Vec3 a(Vec3 var0, float var1) {
        return a(var0, 0.0F, var1);
    }

    public static Vec3 a(Vec3 var0, float var1, float var2) {
        Vec3 var3 = new Vec3(
            var0.x,
            var0.y * Math.cos(var1 * (Math.PI / 180.0)) - var0.z * Math.sin(var1 * (Math.PI / 180.0)),
            var0.y * Math.sin(var1 * (Math.PI / 180.0)) + var0.z * Math.cos(var1 * (Math.PI / 180.0))
        );
        return new Vec3(
            -Math.sin((var2 + 90.0F) * (Math.PI / 180.0)) * var3.x - Math.sin(var2 * (Math.PI / 180.0)) * var3.z,
            var3.y,
            Math.cos((var2 + 90.0F) * (Math.PI / 180.0)) * var3.x + Math.cos(var2 * (Math.PI / 180.0)) * var3.z
        );
    }

    public static Vec3 a(Vec3 var0) {
        return new Vec3(-var0.x, var0.y, -var0.z);
    }

    static double a(double var0, double var2, double var4) {
        return (var4 - var0) / (var2 - var0);
    }

    public static double a(Vec3 var0, Vec3 var1, Vec3 var2) {
        return a(var0.x, var1.x, var2.x);
    }
}
