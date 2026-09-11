package com.trolmastercard.sexmod.i;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Blocks;

public final class a {
    public static final Blocks a = DeferredRegister.createBlocks("sexmod");
    public static final DeferredBlock<com.trolmastercard.sexmod.a.a> b = a.registerBlock(
        "fire", com.trolmastercard.sexmod.a.a::new, Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.FIRE)
    );

    public static void a(IEventBus var0) {
        a.register(var0);
    }
}
