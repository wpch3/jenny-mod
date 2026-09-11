package com.trolmastercard.sexmod.i;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class d {
    public static final DeferredRegister<MenuType<?>> a = DeferredRegister.create(Registries.MENU, "sexmod");
    public static final DeferredHolder<MenuType<?>, MenuType<com.trolmastercard.sexmod.j.a>> b = a.register(
        "npc_equipment", () -> IMenuTypeExtension.create((var0, var1, var2) -> new com.trolmastercard.sexmod.j.a(var0, var1, var2.readVarInt()))
    );
    public static final DeferredHolder<MenuType<?>, MenuType<com.trolmastercard.sexmod.j.b>> c = a.register(
        "npc_storage", () -> IMenuTypeExtension.create((var0, var1, var2) -> new com.trolmastercard.sexmod.j.b(var0, var1, var2.readVarInt()))
    );

    public static void a(IEventBus var0) {
        a.register(var0);
    }
}
