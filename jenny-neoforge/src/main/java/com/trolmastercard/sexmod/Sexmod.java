package com.trolmastercard.sexmod;

import com.mojang.logging.LogUtils;
import com.trolmastercard.sexmod.registry.ModBlocks;
import com.trolmastercard.sexmod.registry.ModEntities;
import com.trolmastercard.sexmod.registry.ModItems;
import com.trolmastercard.sexmod.registry.ModMenus;
import com.trolmastercard.sexmod.registry.ModSounds;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import org.slf4j.Logger;

// Hand-written from the fan's Main: identical wiring minus the license gate
// (d/e.b() removed); packet/client setup self-register via @EventBusSubscriber.
@Mod("sexmod")
public class Sexmod {
    public static final Logger a = LogUtils.getLogger();

    public Sexmod(IEventBus var1, ModContainer var2) {
        a.info("Jenny Mod (NeoForge port) loading");
        ModBlocks.a(var1);
        ModEntities.a(var1);
        ModSounds.a(var1);
        ModMenus.a(var1);
        ModItems.a(var1);
        var1.addListener((EntityAttributeCreationEvent var0) -> ModEntities.a(var0));
    }
}
