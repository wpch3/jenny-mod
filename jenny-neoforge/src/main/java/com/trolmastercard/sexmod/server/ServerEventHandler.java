package com.trolmastercard.sexmod.server;

import java.util.UUID;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerChangedDimensionEvent;

@EventBusSubscriber(modid = "sexmod")
public final class ServerEventHandler {
    private ServerEventHandler() {
    }

    @SubscribeEvent
    public static void onPlayerChangedDimension(PlayerChangedDimensionEvent var0) {
        Player var1 = var0.getEntity();
        if (var1.level() instanceof ServerLevel var2) {
            UUID var8 = var1.getUUID();
            com.trolmastercard.sexmod.entity.GoblinEntity var4 = null;

            for (com.trolmastercard.sexmod.entity.GirlEntity var6 : com.trolmastercard.sexmod.entity.GirlEntity.ap()) {
                if (!var6.level().isClientSide() && var6 instanceof com.trolmastercard.sexmod.entity.GoblinEntity var7 && var8.equals(var7.g_())) {
                    var4 = var7;
                    break;
                }
            }

            if (var4 != null) {
                String var9 = var4.aH();
                String var10 = var4.aF();
                var4.a((UUID)null);
                var4.q((UUID)null);
                var4.c(com.trolmastercard.sexmod.entity.ScenePose.a);
                com.trolmastercard.sexmod.entity.GoblinEntity var11 = (com.trolmastercard.sexmod.entity.GoblinEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.v.get()).create(var2);
                if (var11 == null) {
                    var4.discard();
                } else {
                    var11.b(var9);
                    var11.g(var10);
                    var11.a(true);
                    var11.moveTo(var1.getX(), var1.getY(), var1.getZ(), var11.getYRot(), var11.getXRot());
                    var2.addFreshEntity(var11);
                    var11.a(var8);
                    var11.c(com.trolmastercard.sexmod.entity.ScenePose.aO);
                    var4.discard();
                }
            }
        }
    }

    @SubscribeEvent
    public static void onLivingIncomingDamage(LivingIncomingDamageEvent var0) {
        DamageSource var1 = var0.getSource();
        if (!var1.is(DamageTypes.FELL_OUT_OF_WORLD)) {
            if (var0.getEntity() instanceof com.trolmastercard.sexmod.entity.GoblinEntity var3) {
                if (var3.g_() != null) {
                    var0.setCanceled(true);
                }
            }
        }
    }
}
