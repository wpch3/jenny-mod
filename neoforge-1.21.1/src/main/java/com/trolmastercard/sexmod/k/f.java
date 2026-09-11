package com.trolmastercard.sexmod.k;

import com.trolmastercard.sexmod.f.h;
import com.trolmastercard.sexmod.f.b.k;
import com.trolmastercard.sexmod.m.j;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.AttackEntityEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.LeftClickBlock;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.LeftClickEmpty;

@EventBusSubscriber(modid = "sexmod")
public class f extends Item {
    public f(Properties var1) {
        super(var1);
    }

    @SubscribeEvent
    public static void onEntityInteract(EntityInteract var0) {
        Entity var1 = var0.getTarget();
        if (var1 instanceof k) {
            if (k.b(var1)) {
                Player var2 = var0.getEntity();
                if (var2 != null) {
                    if (b(var2)) {
                        var0.setCanceled(true);
                        if (var0.getLevel().isClientSide()) {
                            com.trolmastercard.sexmod.b.b.a(((k)var1).aD());
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onAttackEntity(AttackEntityEvent var0) {
        if (var0.getTarget() instanceof k var2) {
            Player var3 = var0.getEntity();
            if (var3 != null) {
                if (b(var3)) {
                    var0.setCanceled(true);
                    if (var3.level().isClientSide()) {
                        String var4 = var2.aH();
                        String var5 = k.c(k.w(var2.ah()));
                        var3.displayClientMessage(
                            Component.literal(String.format("%s's model-code: %s%s$%s", var2.a(), ChatFormatting.YELLOW, var4, var5)), false
                        );
                        var3.displayClientMessage(Component.literal(ChatFormatting.ITALIC + "copied to clipboard"), false);
                        j.a(String.format("%s$%s", var4, var5));
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onLeftClickBlock(LeftClickBlock var0) {
        if (a(var0.getEntity())) {
            var0.setCanceled(true);
        }
    }

    @SubscribeEvent
    public static void onLeftClickEmpty(LeftClickEmpty var0) {
        a(var0.getEntity());
    }

    static boolean a(Player var0) {
        if (var0 == null) {
            return false;
        } else if (!b(var0)) {
            return false;
        } else if (!var0.level().isClientSide()) {
            return true;
        } else {
            com.trolmastercard.sexmod.f.c.a var1 = com.trolmastercard.sexmod.f.c.a.c(var0.getUUID());
            if (var1 == null) {
                var0.displayClientMessage(Component.literal("you gotta turn into the girl, you want to copy the model-code off"), false);
                return true;
            } else {
                String var2 = var1.aH();
                String var3 = k.c(k.w(var1.ah()));
                h var4 = h.a(var1);
                var0.displayClientMessage(
                    Component.literal(
                        String.format("%s's model-code: %s%s$%s", j.b(var4 == null ? "girl" : var4.toString()), ChatFormatting.YELLOW, var2, var3)
                    ),
                    false
                );
                var0.displayClientMessage(Component.literal(ChatFormatting.ITALIC + "copied to clipboard"), false);
                j.a(String.format("%s$%s", var2, var3));
                return true;
            }
        }
    }

    static boolean b(Player var0) {
        return var0.getMainHandItem().getItem() instanceof f || var0.getOffhandItem().getItem() instanceof f;
    }

    public void inventoryTick(ItemStack var1, Level var2, Entity var3, int var4, boolean var5) {
        super.inventoryTick(var1, var2, var3, var4, var5);
    }
}
