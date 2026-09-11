package com.trolmastercard.sexmod.registry;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Blocks;

public final class ModBlocks {
    public static final Blocks a = DeferredRegister.createBlocks("sexmod");
    public static final DeferredBlock<com.trolmastercard.sexmod.block.ModFireBlock> b = a.registerBlock(
        "fire", com.trolmastercard.sexmod.block.ModFireBlock::new, Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.FIRE)
    );

    public static void a(IEventBus var0) {
        a.register(var0);
    }
}
