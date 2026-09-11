package com.trolmastercard.sexmod.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModMenus {
    public static final DeferredRegister<MenuType<?>> a = DeferredRegister.create(Registries.MENU, "sexmod");
    public static final DeferredHolder<MenuType<?>, MenuType<com.trolmastercard.sexmod.menu.NpcEquipmentMenu>> b = a.register(
        "npc_equipment", () -> IMenuTypeExtension.create((var0, var1, var2) -> new com.trolmastercard.sexmod.menu.NpcEquipmentMenu(var0, var1, var2.readVarInt()))
    );
    public static final DeferredHolder<MenuType<?>, MenuType<com.trolmastercard.sexmod.menu.NpcStorageMenu>> c = a.register(
        "npc_storage", () -> IMenuTypeExtension.create((var0, var1, var2) -> new com.trolmastercard.sexmod.menu.NpcStorageMenu(var0, var1, var2.readVarInt()))
    );

    public static void a(IEventBus var0) {
        a.register(var0);
    }
}
