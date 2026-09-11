package com.trolmastercard.sexmod.c;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.trolmastercard.sexmod.f.b.k;
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
public final class b {
    @SubscribeEvent
    public static void register(RegisterCommandsEvent var0) {
        LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.literal(
                                                    "become"
                                                )
                                                .then(a("jenny", com.trolmastercard.sexmod.i.b.c)))
                                            .then(a("ellie", com.trolmastercard.sexmod.i.b.d)))
                                        .then(a("slime", com.trolmastercard.sexmod.i.b.e)))
                                    .then(a("bia", com.trolmastercard.sexmod.i.b.f)))
                                .then(a("bee", com.trolmastercard.sexmod.i.b.g)))
                            .then(a("allie", com.trolmastercard.sexmod.i.b.h)))
                        .then(a("luna", com.trolmastercard.sexmod.i.b.i)))
                    .then(a("galath", com.trolmastercard.sexmod.i.b.j)))
                .then(a("kobold", com.trolmastercard.sexmod.i.b.k)))
            .then(a("goblin", com.trolmastercard.sexmod.i.b.l));
        var0.getDispatcher()
            .register(
                (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.literal("sexmod").then(var1))
                        .then(Commands.literal("revert").executes(var0x -> {
                            com.trolmastercard.sexmod.f.c.a.b(((CommandSourceStack)var0x.getSource()).getPlayerOrException());
                            return 1;
                        })))
                    .then(Commands.literal("bind").then(Commands.argument("target", EntityArgument.entity()).executes(var0x -> {
                        if (EntityArgument.getEntity(var0x, "target") instanceof k var1x) {
                            var1x.getEntityData().set(k.ao, ((CommandSourceStack)var0x.getSource()).getPlayerOrException().getUUID().toString());
                            return 1;
                        } else {
                            ((CommandSourceStack)var0x.getSource()).sendFailure(Component.literal("Not an NPC (EntityNpcBase)."));
                            return 0;
                        }
                    })))
            );
    }

    private static LiteralArgumentBuilder<CommandSourceStack> a(
        String var0, DeferredHolder<EntityType<?>, ? extends EntityType<? extends com.trolmastercard.sexmod.f.c.a>> var1
    ) {
        return (LiteralArgumentBuilder<CommandSourceStack>)Commands.literal(var0)
            .executes(
                var1x -> {
                    com.trolmastercard.sexmod.f.c.a.a(
                        ((CommandSourceStack)var1x.getSource()).getPlayerOrException(), (EntityType<? extends com.trolmastercard.sexmod.f.c.a>)var1.get()
                    );
                    return 1;
                }
            );
    }

    private b() {
    }
}
