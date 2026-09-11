package com.trolmastercard.sexmod.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.trolmastercard.sexmod.entity.GirlEntity;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

@EventBusSubscriber(modid = "sexmod")
public final class SexmodCommand {
    @SubscribeEvent
    public static void register(RegisterCommandsEvent var0) {
        LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.literal(
                                                    "become"
                                                )
                                                .then(a("jenny", com.trolmastercard.sexmod.registry.ModEntities.c)))
                                            .then(a("ellie", com.trolmastercard.sexmod.registry.ModEntities.d)))
                                        .then(a("slime", com.trolmastercard.sexmod.registry.ModEntities.e)))
                                    .then(a("bia", com.trolmastercard.sexmod.registry.ModEntities.f)))
                                .then(a("bee", com.trolmastercard.sexmod.registry.ModEntities.g)))
                            .then(a("allie", com.trolmastercard.sexmod.registry.ModEntities.h)))
                        .then(a("luna", com.trolmastercard.sexmod.registry.ModEntities.i)))
                    .then(a("galath", com.trolmastercard.sexmod.registry.ModEntities.j)))
                .then(a("kobold", com.trolmastercard.sexmod.registry.ModEntities.k)))
            .then(a("goblin", com.trolmastercard.sexmod.registry.ModEntities.l));
        var0.getDispatcher()
            .register(
                (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.literal("sexmod").then(var1))
                        .then(Commands.literal("revert").executes(var0x -> {
                            com.trolmastercard.sexmod.entity.player.PlayerGirlEntity.b(((CommandSourceStack)var0x.getSource()).getPlayerOrException());
                            return 1;
                        })))
                    .then(Commands.literal("bind").then(Commands.argument("target", EntityArgument.entity()).executes(var0x -> {
                        if (EntityArgument.getEntity(var0x, "target") instanceof GirlEntity var1x) {
                            var1x.getEntityData().set(GirlEntity.ao, ((CommandSourceStack)var0x.getSource()).getPlayerOrException().getUUID().toString());
                            return 1;
                        } else {
                            ((CommandSourceStack)var0x.getSource()).sendFailure(Component.literal("Not an NPC (EntityNpcBase)."));
                            return 0;
                        }
                    })))
            );
    }

    private static LiteralArgumentBuilder<CommandSourceStack> a(
        String var0, DeferredHolder<EntityType<?>, ? extends EntityType<? extends com.trolmastercard.sexmod.entity.player.PlayerGirlEntity>> var1
    ) {
        return (LiteralArgumentBuilder<CommandSourceStack>)Commands.literal(var0)
            .executes(
                var1x -> {
                    com.trolmastercard.sexmod.entity.player.PlayerGirlEntity.a(
                        ((CommandSourceStack)var1x.getSource()).getPlayerOrException(), (EntityType<? extends com.trolmastercard.sexmod.entity.player.PlayerGirlEntity>)var1.get()
                    );
                    return 1;
                }
            );
    }

    private SexmodCommand() {
    }
}
