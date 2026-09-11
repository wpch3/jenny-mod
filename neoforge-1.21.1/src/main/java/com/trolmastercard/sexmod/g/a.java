package com.trolmastercard.sexmod.g;

import com.trolmastercard.sexmod.d.e;
import com.trolmastercard.sexmod.f.c;
import com.trolmastercard.sexmod.f.f;
import com.trolmastercard.sexmod.f.b.k;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerLoggedInEvent;

@EventBusSubscriber(modid = "sexmod")
public final class a {
    private static final Map<UUID, Long> a = new ConcurrentHashMap<>();

    private a() {
    }

    @SubscribeEvent
    public static void onLogin(PlayerLoggedInEvent var0) {
        if (!e.a()) {
            if (var0.getEntity() instanceof ServerPlayer var1) {
                a(var1, true);
            }
        }
    }

    @SubscribeEvent
    public static void onGatedSpawn(EntityJoinLevelEvent var0) {
        if (!e.a() && !var0.getLevel().isClientSide()) {
            Entity var1 = var0.getEntity();
            boolean var2 = var1 instanceof k;
            boolean var3 = var1 instanceof f || var1 instanceof com.trolmastercard.sexmod.f.a || var1 instanceof c;
            if (var2 || var3) {
                if (var3) {
                    var1.discard();
                }

                if (var0.getLevel().getNearestPlayer(var1, 32.0) instanceof ServerPlayer var5) {
                    a(var5, false);
                }
            }
        }
    }

    private static void a(ServerPlayer var0, boolean var1) {
        long var2 = var0.level().getGameTime();
        Long var4 = a.get(var0.getUUID());
        if (var1 || var4 == null || var2 - var4 >= 60L) {
            a.put(var0.getUUID(), var2);
            var0.displayClientMessage(
                Component.literal("[Jenny Mod] No license key for THIS machine \u2014 the mod is DISABLED (NPCs won't spawn).").withStyle(ChatFormatting.RED),
                false
            );
            var0.displayClientMessage(
                Component.literal("Put your machine-bound key in config/sexmod-license.key (line1=code, line2=bind). Ask your distributor for a key.")
                    .withStyle(ChatFormatting.YELLOW),
                false
            );
        }
    }
}
