package com.trolmastercard.sexmod.b;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent.Post;
import net.neoforged.neoforge.network.PacketDistributor;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class k {
    private static boolean a;
    private static boolean b;

    @SubscribeEvent
    public static void onClientTick(Post var0) {
        Minecraft var1 = Minecraft.getInstance();
        com.trolmastercard.sexmod.f.b.k var2 = var1.player != null && var1.level != null ? j.a(var1) : null;
        if (var2 == null) {
            if (!f.a && f.a()) {
                f.c();
            }

            a = false;
            b = false;
        } else {
            if (!f.a()) {
                f.b();
            }

            if (a(var2.ai())) {
                f.d();
            }

            boolean var3 = f.e();
            boolean var4 = var1.options.keyShift.isDown();
            boolean var5 = var1.options.keyJump.isDown();
            if (var4 && !a) {
                PacketDistributor.sendToServer(new com.trolmastercard.sexmod.l.b(false), new CustomPacketPayload[0]);
            }

            if (var5 && !b) {
                PacketDistributor.sendToServer(var3 ? new com.trolmastercard.sexmod.l.b(true) : new com.trolmastercard.sexmod.l.e(), new CustomPacketPayload[0]);
            }

            var1.gui
                .setOverlayMessage(
                    Component.literal(var3 ? "Jump = climax   \u00b7   Sneak = next stage" : "Sneak = next stage   \u00b7   Jump = leave"), false
                );
            a = var4;
            b = var5;
        }
    }

    private static boolean a(com.trolmastercard.sexmod.f.j var0) {
        if (!var0.cp) {
            return false;
        }

        String var1 = var0.name();
        return !var1.startsWith("START") && !var1.endsWith("START") ? !var1.endsWith("CUM") && var0 != com.trolmastercard.sexmod.f.j.e : false;
    }

    private k() {
    }
}
