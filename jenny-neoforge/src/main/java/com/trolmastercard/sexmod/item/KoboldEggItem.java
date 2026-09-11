package com.trolmastercard.sexmod.item;

import java.util.UUID;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class KoboldEggItem extends Item {
    public KoboldEggItem(Properties var1) {
        super(var1);
    }

    public InteractionResult useOn(UseOnContext var1) {
        Level var2 = var1.getLevel();
        if (var2.isClientSide()) {
            return InteractionResult.SUCCESS;
        }

        Vec3 var3 = var1.getClickLocation();
        this.a(var2, var1.getItemInHand(), var3.x, var3.y, var3.z);
        return InteractionResult.SUCCESS;
    }

    public InteractionResultHolder<ItemStack> use(Level var1, Player var2, InteractionHand var3) {
        if (var1.isClientSide()) {
            return InteractionResultHolder.success(var2.getItemInHand(var3));
        }

        Vec3 var4 = var2.getEyePosition();
        Vec3 var5 = var2.getLookAngle();
        Vec3 var6 = var4.add(var5.x, var5.y, var5.z);
        this.a(var1, var2.getItemInHand(var3), var6.x, var6.y - 0.5, var6.z);
        return InteractionResultHolder.success(var2.getItemInHand(var3));
    }

    private void a(Level var1, ItemStack var2, double var3, double var5, double var7) {
        com.trolmastercard.sexmod.entity.KoboldEggEntity var9 = (com.trolmastercard.sexmod.entity.KoboldEggEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.B.get()).create(var1);
        if (var9 != null) {
            var9.setPos(var3, var5, var7);
            CompoundTag var10 = ((CustomData)var2.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag();
            String var11 = var10.getString("tribeColor");
            var9.getEntityData().set(com.trolmastercard.sexmod.entity.KoboldEggEntity.b, com.trolmastercard.sexmod.EyeAndKoboldColor.a(var11).name());
            String var12 = var10.getString("tribeID");
            if (!"".equals(var12)) {
                var9.a = UUID.fromString(var12);
            }

            var1.addFreshEntity(var9);
            var2.shrink(1);
        }
    }
}
