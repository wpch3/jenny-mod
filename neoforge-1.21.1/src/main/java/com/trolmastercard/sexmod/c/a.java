package com.trolmastercard.sexmod.c;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.trolmastercard.sexmod.h.d;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterClientCommandsEvent;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class a {
    @SubscribeEvent
    public static void register(RegisterClientCommandsEvent var0) {
        var0.getDispatcher()
            .register((LiteralArgumentBuilder)LiteralArgumentBuilder.literal("sexmod").then(LiteralArgumentBuilder.literal("select").executes(var0x -> {
                Minecraft.getInstance().execute(() -> Minecraft.getInstance().setScreen(new d()));
                return 1;
            })));
    }

    private a() {
    }
}
