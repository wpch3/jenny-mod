package com.trolmastercard.sexmod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public class TribeClaimItem extends Item {
    public TribeClaimItem(Properties var1) {
        super(var1);
    }

    public InteractionResultHolder<ItemStack> use(Level var1, Player var2, InteractionHand var3) {
        ItemStack var4 = var2.getItemInHand(var3);
        Vec3 var5 = var2.getEyePosition(0.0F);
        Vec3 var6 = var2.getViewVector(0.0F);
        Vec3 var7 = var5.add(var6.x * 5.0, var6.y * 5.0, var6.z * 5.0);
        BlockHitResult var8 = var1.clip(new ClipContext(var5, var7, Block.OUTLINE, Fluid.NONE, var2));
        if (var8.getType() == Type.MISS) {
            return InteractionResultHolder.fail(var4);
        }

        if (!var2.hasInfiniteMaterials()) {
            var4.shrink(1);
        }

        if (!var1.isClientSide()) {
            com.trolmastercard.sexmod.server.TribeData.a(var1, var8.getLocation());
        }

        return InteractionResultHolder.success(var4);
    }
}
