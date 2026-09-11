package com.trolmastercard.sexmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.world.World;

public class d {
    public static boolean a(Entity var0) {
        try {
            if (var0 instanceof EntityCreeper) {
                return false;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        try {
            if (var0 instanceof EntityPigZombie) {
                return false;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        try {
            if (var0 instanceof EntityGuardian) {
                return false;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            return !(var0 instanceof EntityEnderman);
        } catch (RuntimeException var1) {
            throw a(var1);
        }
    }

    public static boolean a(World var0, Vec3d var1, Entity var2) {
        RayTraceResult var3 = var0.func_147447_a(var1, var2.func_174791_d().func_72441_c(0.0, var2.func_70047_e(), 0.0), true, true, false);

        try {
            if (var3 == null) {
                return true;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        try {
            if (var3.field_72313_a != Type.BLOCK) {
                return true;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        return false;
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
