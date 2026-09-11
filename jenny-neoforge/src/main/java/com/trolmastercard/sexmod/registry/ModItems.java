package com.trolmastercard.sexmod.registry;

import com.trolmastercard.sexmod.item.NpcEditorWandItem;
import com.trolmastercard.sexmod.item.TribeClaimItem;
import java.util.List;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Items;

public final class ModItems {
    public static final Items a = DeferredRegister.createItems("sexmod");
    public static final DeferredRegister<CreativeModeTab> b = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "sexmod");
    public static final DeferredItem<SpawnEggItem> c = a("jenny", com.trolmastercard.sexmod.registry.ModEntities.b);
    public static final DeferredItem<SpawnEggItem> d = a("ellie", com.trolmastercard.sexmod.registry.ModEntities.m);
    public static final DeferredItem<SpawnEggItem> e = a("bia", com.trolmastercard.sexmod.registry.ModEntities.n);
    public static final DeferredItem<SpawnEggItem> f = a("slime", com.trolmastercard.sexmod.registry.ModEntities.o);
    public static final DeferredItem<SpawnEggItem> g = a("bee", com.trolmastercard.sexmod.registry.ModEntities.p);
    public static final DeferredItem<SpawnEggItem> h = a("allie", com.trolmastercard.sexmod.registry.ModEntities.q);
    public static final DeferredItem<SpawnEggItem> i = a("luna", com.trolmastercard.sexmod.registry.ModEntities.r);
    public static final DeferredItem<SpawnEggItem> j = a("manglelie", com.trolmastercard.sexmod.registry.ModEntities.s);
    public static final DeferredItem<SpawnEggItem> k = a("galath", com.trolmastercard.sexmod.registry.ModEntities.t);
    public static final DeferredItem<SpawnEggItem> l = a("kobold", com.trolmastercard.sexmod.registry.ModEntities.u);
    public static final DeferredItem<SpawnEggItem> m = a("goblin", com.trolmastercard.sexmod.registry.ModEntities.v);
    public static final DeferredItem<SpawnEggItem> n = a("custom_model", com.trolmastercard.sexmod.registry.ModEntities.w);
    public static final DeferredItem<SpawnEggItem> o = a("friendly_slime", com.trolmastercard.sexmod.registry.ModEntities.x);
    public static final DeferredItem<SpawnEggItem> p = a("pyrocinical", com.trolmastercard.sexmod.registry.ModEntities.y);
    public static final DeferredItem<com.trolmastercard.sexmod.item.LunaRodItem> q = a.registerItem(
        "luna_rod", com.trolmastercard.sexmod.item.LunaRodItem::new, new Properties().durability(64)
    );
    public static final DeferredItem<com.trolmastercard.sexmod.item.KoboldEggItem> r = a.registerItem(
        "kobold_egg_item", com.trolmastercard.sexmod.item.KoboldEggItem::new, new Properties().stacksTo(1)
    );
    public static final DeferredItem<com.trolmastercard.sexmod.item.GalathCoinItem> s = a.registerItem(
        "galath_coin", com.trolmastercard.sexmod.item.GalathCoinItem::new, new Properties().stacksTo(1)
    );
    public static final DeferredItem<TribeClaimItem> t = a.registerItem("tribe_egg", TribeClaimItem::new, new Properties().stacksTo(1));
    public static final DeferredItem<com.trolmastercard.sexmod.item.AllieLampItem> u = a.registerItem(
        "allies_lamp", com.trolmastercard.sexmod.item.AllieLampItem::new, new Properties().stacksTo(1)
    );
    public static final DeferredItem<com.trolmastercard.sexmod.item.KoboldStaffItem> v = a.registerItem(
        "dragon_staff", com.trolmastercard.sexmod.item.KoboldStaffItem::new, new Properties().stacksTo(1)
    );
    public static final DeferredItem<NpcEditorWandItem> w = a.registerItem("npc_editor_wand", NpcEditorWandItem::new, new Properties().stacksTo(1));
    private static final List<DeferredItem<SpawnEggItem>> y = List.of(c, d, e, f, g, h, i, j, k, l, m, n, o, p);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> x = b.register(
        "sexmod",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.sexmod"))
            .icon(() -> new ItemStack((ItemLike)c.get()))
            .displayItems((var0, var1) -> {
                y.forEach(var1x -> var1.accept((ItemLike)var1x.get()));
                var1.accept((ItemLike)q.get());
                var1.accept((ItemLike)r.get());
                var1.accept((ItemLike)s.get());
                var1.accept((ItemLike)t.get());
                var1.accept((ItemLike)u.get());
                var1.accept((ItemLike)v.get());
                var1.accept((ItemLike)w.get());
            })
            .build()
    );

    private static DeferredItem<SpawnEggItem> a(String var0, DeferredHolder<EntityType<?>, ? extends EntityType<?>> var1) {
        DeferredHolder var2 = var1;
        return a.registerItem(var0 + "_spawn_egg", var1x -> new DeferredSpawnEggItem(var2, 16777215, 16777215, var1x), new Properties());
    }

    public static void a(IEventBus var0) {
        a.register(var0);
        b.register(var0);
    }
}
