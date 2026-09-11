package com.trolmastercard.sexmod.b;

import com.trolmastercard.sexmod.f.q;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderHandEvent;
import net.neoforged.neoforge.client.event.RenderPlayerEvent.Pre;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class e {
    private e() {
    }

    @SubscribeEvent
    public static void onRenderHand(RenderHandEvent var0) {
        Minecraft var1 = Minecraft.getInstance();
        if (var1.player != null) {
            UUID var2 = var1.player.getUUID();
            if (a(var2)) {
                var0.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public static void onRenderPlayerPre(Pre var0) {
        Minecraft var1 = Minecraft.getInstance();
        if (var1.level != null) {
            Player var2 = var0.getEntity();
            if (var2 != null) {
                if (a(var2.getUUID())) {
                    var0.setCanceled(true);
                }
            }
        }
    }

    private static boolean a(UUID var0) {
        if (var0 == null) {
            return false;
        }

        for (com.trolmastercard.sexmod.f.b.k var2 : com.trolmastercard.sexmod.f.b.k.ap()) {
            if (var2 instanceof q var3) {
                com.trolmastercard.sexmod.f.j var4 = var2.ai();
                if ((var4 == com.trolmastercard.sexmod.f.j.aP || var4 == com.trolmastercard.sexmod.f.j.aU) && var0.equals(var3.g_())) {
                    return true;
                }
            }
        }

        return false;
    }
}
