package com.trolmastercard.sexmod.util;

import net.minecraft.world.phys.Vec3;

public class LerpUtils {
    public static Vec3 a(Vec3 var0, Vec3 var1, int var2) {
        if (var2 == 0) {
            return var1;
        }

        Vec3 var3 = var1.subtract(var0);
        return var0.add(var3.x / var2, var3.y / var2, var3.z / var2);
    }

    public static double a(double var0, double var2, double var4) {
        return var0 + (var2 - var0) * var4;
    }

    public static float a(float var0, float var1, float var2) {
        return var0 + (var1 - var0) * var2;
    }

    public static Vec3 a(Vec3 var0, Vec3 var1, double var2) {
        Vec3 var4 = var1.subtract(var0);
        return var0.add(new Vec3(var4.x * var2, var4.y * var2, var4.z * var2));
    }

    public static double a(double var0) {
        return 1.0 - Math.pow(1.0 - var0, 3.0);
    }

    public static double b(double var0) {
        return Math.sin(var0 * Math.PI / 2.0);
    }

    public static double c(double var0) {
        return var0 * var0 * var0;
    }
}
