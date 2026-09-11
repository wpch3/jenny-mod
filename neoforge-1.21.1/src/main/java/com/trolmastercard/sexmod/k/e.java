package com.trolmastercard.sexmod.k;

import com.trolmastercard.sexmod.f.b.i;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class e extends FishingRodItem {
    public e(Properties var1) {
        super(var1);
    }

    public void a(Level var1, i var2, InteractionHand var3) {
        ItemStack var4 = var2.getItemInHand(var3);
        if (var2.g != null) {
            int var5 = var2.g.d();
            var4.hurtAndBreak(var5, var2, LivingEntity.getSlotForHand(var3));
            var2.swing(var3);
            var1.playSound(
                null,
                var2.getX(),
                var2.getY(),
                var2.getZ(),
                SoundEvents.FISHING_BOBBER_RETRIEVE,
                SoundSource.NEUTRAL,
                1.0F,
                0.4F / (var1.getRandom().nextFloat() * 0.4F + 0.8F)
            );
        } else {
            var1.playSound(
                null,
                var2.getX(),
                var2.getY(),
                var2.getZ(),
                SoundEvents.FISHING_BOBBER_THROW,
                SoundSource.NEUTRAL,
                0.5F,
                0.4F / (var1.getRandom().nextFloat() * 0.4F + 0.8F)
            );
            if (!var1.isClientSide()) {
                double var10 = var2.position().distanceTo(new Vec3(var2.p.getX(), var2.p.getY(), var2.p.getZ()));
                com.trolmastercard.sexmod.f.e var7 = new com.trolmastercard.sexmod.f.e(
                    (EntityType<? extends Entity>)com.trolmastercard.sexmod.i.b.z.get(), var1, var2, var10 * i.a
                );
                int var8 = EnchantmentHelper.getItemEnchantmentLevel(
                    var1.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LURE), var4
                );
                if (var8 > 0) {
                    var7.a(var8);
                }

                int var9 = EnchantmentHelper.getItemEnchantmentLevel(
                    var1.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LUCK_OF_THE_SEA), var4
                );
                if (var9 > 0) {
                    var7.b(var9);
                }

                var1.addFreshEntity(var7);
                var2.g = var7;
            }

            var2.swing(var3);
        }
    }
}
