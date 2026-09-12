package com.trolmastercard.sexmod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent.Post;
import net.neoforged.neoforge.network.PacketDistributor;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class SceneHintOverlay {
    private static boolean a;
    private static boolean b;

    @SubscribeEvent
    public static void onClientTick(Post var0) {
        Minecraft var1 = Minecraft.getInstance();
        com.trolmastercard.sexmod.entity.GirlEntity var2 = var1.player != null && var1.level != null ? NearbyNpcFinder.a(var1) : null;
        if (var2 == null) {
            if (!HornyMeterOverlay.a && HornyMeterOverlay.a()) {
                HornyMeterOverlay.c();
            }

            a = false;
            b = false;
        } else {
            if (!HornyMeterOverlay.a()) {
                HornyMeterOverlay.b();
            }

            if (a(var2.ai())) {
                HornyMeterOverlay.d();
            }

            boolean var3 = HornyMeterOverlay.e();
            boolean var4 = var1.options.keyShift.isDown();
            boolean var5 = var1.options.keyJump.isDown();
            if (var4 && !a) {
                PacketDistributor.sendToServer(new com.trolmastercard.sexmod.network.AdvanceScenePayload(false), new CustomPacketPayload[0]);
            }

            if (var5 && !b) {
                PacketDistributor.sendToServer(var3 ? new com.trolmastercard.sexmod.network.AdvanceScenePayload(true) : new com.trolmastercard.sexmod.network.EndScenePayload(), new CustomPacketPayload[0]);
            }

            var1.gui
                .setOverlayMessage(
                    Component.literal(var3 ? "Jump = climax   \u00b7   Sneak = next stage" : "Sneak = next stage   \u00b7   Jump = leave"), false
                );
            a = var4;
            b = var5;
        }
    }

    private static boolean a(com.trolmastercard.sexmod.entity.ScenePose var0) {
        if (!var0.cp) {
            return false;
        }

        String var1 = var0.name();
        return !var1.startsWith("START") && !var1.endsWith("START") ? !com.trolmastercard.sexmod.entity.ScenePose.isCumPose(var0) : false;
    }

    private SceneHintOverlay() {
    }
}
