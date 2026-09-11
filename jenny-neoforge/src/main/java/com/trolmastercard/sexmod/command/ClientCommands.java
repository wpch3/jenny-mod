package com.trolmastercard.sexmod.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.trolmastercard.sexmod.client.gui.CharacterSelectScreen;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterClientCommandsEvent;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class ClientCommands {
    @SubscribeEvent
    public static void register(RegisterClientCommandsEvent var0) {
        var0.getDispatcher()
            .register((LiteralArgumentBuilder)LiteralArgumentBuilder.literal("sexmod").then(LiteralArgumentBuilder.literal("select").executes(var0x -> {
                Minecraft.getInstance().execute(() -> Minecraft.getInstance().setScreen(new CharacterSelectScreen()));
                return 1;
            })));
    }

    private ClientCommands() {
    }
}
