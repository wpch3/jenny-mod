package com.trolmastercard.sexmod.util;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public class EntityTargetUtils {
    public static boolean a(Entity var0) {
        if (var0 instanceof Creeper) {
            return false;
        } else if (var0 instanceof ZombifiedPiglin) {
            return false;
        } else {
            return var0 instanceof Guardian ? false : !(var0 instanceof EnderMan);
        }
    }

    public static boolean a(Level var0, Vec3 var1, Entity var2) {
        Vec3 var3 = var2.position().add(0.0, var2.getEyeHeight(), 0.0);
        BlockHitResult var4 = var0.clip(new ClipContext(var1, var3, Block.COLLIDER, Fluid.NONE, var2));
        return var4 == null ? true : var4.getType() != Type.BLOCK;
    }
}
