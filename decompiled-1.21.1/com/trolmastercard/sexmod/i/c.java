package com.trolmastercard.sexmod.i;

import com.trolmastercard.sexmod.k.f;
import com.trolmastercard.sexmod.k.g;
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

public final class c {
    public static final Items a = DeferredRegister.createItems("sexmod");
    public static final DeferredRegister<CreativeModeTab> b = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "sexmod");
    public static final DeferredItem<SpawnEggItem> c = a("jenny", com.trolmastercard.sexmod.i.b.b);
    public static final DeferredItem<SpawnEggItem> d = a("ellie", com.trolmastercard.sexmod.i.b.m);
    public static final DeferredItem<SpawnEggItem> e = a("bia", com.trolmastercard.sexmod.i.b.n);
    public static final DeferredItem<SpawnEggItem> f = a("slime", com.trolmastercard.sexmod.i.b.o);
    public static final DeferredItem<SpawnEggItem> g = a("bee", com.trolmastercard.sexmod.i.b.p);
    public static final DeferredItem<SpawnEggItem> h = a("allie", com.trolmastercard.sexmod.i.b.q);
    public static final DeferredItem<SpawnEggItem> i = a("luna", com.trolmastercard.sexmod.i.b.r);
    public static final DeferredItem<SpawnEggItem> j = a("manglelie", com.trolmastercard.sexmod.i.b.s);
    public static final DeferredItem<SpawnEggItem> k = a("galath", com.trolmastercard.sexmod.i.b.t);
    public static final DeferredItem<SpawnEggItem> l = a("kobold", com.trolmastercard.sexmod.i.b.u);
    public static final DeferredItem<SpawnEggItem> m = a("goblin", com.trolmastercard.sexmod.i.b.v);
    public static final DeferredItem<SpawnEggItem> n = a("custom_model", com.trolmastercard.sexmod.i.b.w);
    public static final DeferredItem<SpawnEggItem> o = a("friendly_slime", com.trolmastercard.sexmod.i.b.x);
    public static final DeferredItem<SpawnEggItem> p = a("pyrocinical", com.trolmastercard.sexmod.i.b.y);
    public static final DeferredItem<com.trolmastercard.sexmod.k.e> q = a.registerItem(
        "luna_rod", com.trolmastercard.sexmod.k.e::new, new Properties().durability(64)
    );
    public static final DeferredItem<com.trolmastercard.sexmod.k.d> r = a.registerItem(
        "kobold_egg_item", com.trolmastercard.sexmod.k.d::new, new Properties().stacksTo(1)
    );
    public static final DeferredItem<com.trolmastercard.sexmod.k.c> s = a.registerItem(
        "galath_coin", com.trolmastercard.sexmod.k.c::new, new Properties().stacksTo(1)
    );
    public static final DeferredItem<g> t = a.registerItem("tribe_egg", g::new, new Properties().stacksTo(1));
    public static final DeferredItem<com.trolmastercard.sexmod.k.a> u = a.registerItem(
        "allies_lamp", com.trolmastercard.sexmod.k.a::new, new Properties().stacksTo(1)
    );
    public static final DeferredItem<com.trolmastercard.sexmod.k.b> v = a.registerItem(
        "dragon_staff", com.trolmastercard.sexmod.k.b::new, new Properties().stacksTo(1)
    );
    public static final DeferredItem<f> w = a.registerItem("npc_editor_wand", f::new, new Properties().stacksTo(1));
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
