package com.trolmastercard.sexmod.client;

import java.util.WeakHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent.Post;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class GalathChargeWatcher {
    private static final WeakHashMap<com.trolmastercard.sexmod.entity.GalathEntity, Boolean> a = new WeakHashMap<>();

    @SubscribeEvent
    public static void onClientTick(Post var0) {
        Minecraft var1 = Minecraft.getInstance();
        if (var1.level == null) {
            a.clear();
        } else {
            for (Entity var3 : var1.level.entitiesForRendering()) {
                if (var3 instanceof com.trolmastercard.sexmod.entity.GalathEntity var4) {
                    boolean var5 = var4.e();
                    Boolean var6 = a.put(var4, var5);
                    if (var5 && var6 != null && !var6) {
                        ClientUtils.b(var4);
                    }
                }
            }
        }
    }

    private GalathChargeWatcher() {
    }
}
