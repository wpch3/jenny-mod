package com.trolmastercard.sexmod.i;

import com.trolmastercard.sexmod.f.b.g;
import com.trolmastercard.sexmod.f.b.o;
import com.trolmastercard.sexmod.f.c.f;
import com.trolmastercard.sexmod.f.c.h;
import com.trolmastercard.sexmod.f.c.i;
import com.trolmastercard.sexmod.f.c.j;
import com.trolmastercard.sexmod.f.c.k;
import com.trolmastercard.sexmod.f.c.l;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType.Builder;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class b {
    public static final DeferredRegister<EntityType<?>> a = DeferredRegister.create(Registries.ENTITY_TYPE, "sexmod");
    public static final DeferredHolder<EntityType<?>, EntityType<g>> b = a.register(
        "jenny", () -> Builder.of(g::new, MobCategory.CREATURE).sized(0.6F, 1.8F).clientTrackingRange(64).updateInterval(3).build("jenny")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<i>> c = a.register(
        "player_jenny", () -> Builder.of(i::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_jenny")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<f>> d = a.register(
        "player_ellie", () -> Builder.of(f::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_ellie")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<l>> e = a.register(
        "player_slime", () -> Builder.of(l::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_slime")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.c.e>> f = a.register(
        "player_bia",
        () -> Builder.of(com.trolmastercard.sexmod.f.c.e::new, MobCategory.MISC)
            .sized(0.01F, 0.01F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("player_bia")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.c.d>> g = a.register(
        "player_bee",
        () -> Builder.of(com.trolmastercard.sexmod.f.c.d::new, MobCategory.MISC)
            .sized(0.01F, 0.01F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("player_bee")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.c.c>> h = a.register(
        "player_allie",
        () -> Builder.of(com.trolmastercard.sexmod.f.c.c::new, MobCategory.MISC)
            .sized(0.01F, 0.01F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("player_allie")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<k>> i = a.register(
        "player_luna", () -> Builder.of(k::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_luna")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.c.g>> j = a.register(
        "player_galath",
        () -> Builder.of(com.trolmastercard.sexmod.f.c.g::new, MobCategory.MISC)
            .sized(0.01F, 0.01F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("player_galath")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<j>> k = a.register(
        "player_kobold", () -> Builder.of(j::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_kobold")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<h>> l = a.register(
        "player_goblin", () -> Builder.of(h::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_goblin")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.b.d>> m = a.register(
        "ellie",
        () -> Builder.of(com.trolmastercard.sexmod.f.b.d::new, MobCategory.CREATURE).sized(0.6F, 1.8F).clientTrackingRange(64).updateInterval(3).build("ellie")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.b.c>> n = a.register(
        "bia",
        () -> Builder.of(com.trolmastercard.sexmod.f.b.c::new, MobCategory.CREATURE).sized(0.6F, 1.65F).clientTrackingRange(64).updateInterval(3).build("bia")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<o>> o = a.register(
        "slime", () -> Builder.of(o::new, MobCategory.CREATURE).sized(0.6F, 1.8F).clientTrackingRange(64).updateInterval(3).build("slime")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.b.b>> p = a.register(
        "bee",
        () -> Builder.of(com.trolmastercard.sexmod.f.b.b::new, MobCategory.CREATURE).sized(0.3F, 1.5F).clientTrackingRange(64).updateInterval(3).build("bee")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.b.a>> q = a.register(
        "allie",
        () -> Builder.of(com.trolmastercard.sexmod.f.b.a::new, MobCategory.CREATURE).sized(0.5F, 1.0F).clientTrackingRange(64).updateInterval(3).build("allie")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.b.i>> r = a.register(
        "luna",
        () -> Builder.of(com.trolmastercard.sexmod.f.b.i::new, MobCategory.CREATURE).sized(0.6F, 1.8F).clientTrackingRange(64).updateInterval(3).build("luna")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.b.j>> s = a.register(
        "manglelie",
        () -> Builder.of(com.trolmastercard.sexmod.f.b.j::new, MobCategory.AMBIENT)
            .sized(0.6F, 0.9F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("manglelie")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.b.e>> t = a.register(
        "galath",
        () -> Builder.of(com.trolmastercard.sexmod.f.b.e::new, MobCategory.MONSTER).sized(1.0F, 2.4F).clientTrackingRange(64).updateInterval(3).build("galath")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.b.h>> u = a.register(
        "kobold",
        () -> Builder.of(com.trolmastercard.sexmod.f.b.h::new, MobCategory.CREATURE)
            .sized(0.5F, 0.99F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("kobold")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.b.f>> v = a.register(
        "goblin",
        () -> Builder.of(com.trolmastercard.sexmod.f.b.f::new, MobCategory.CREATURE)
            .sized(0.5F, 0.99F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("goblin")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.a>> w = a.register(
        "custom_model",
        () -> Builder.of(com.trolmastercard.sexmod.f.a::new, MobCategory.MISC)
            .sized(0.1F, 0.1F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("custom_model")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.c>> x = a.register(
        "friendly_slime",
        () -> Builder.of(com.trolmastercard.sexmod.f.c::new, MobCategory.CREATURE)
            .sized(0.51F, 0.51F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("friendly_slime")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.f>> y = a.register(
        "pyrocinical",
        () -> Builder.of(com.trolmastercard.sexmod.f.f::new, MobCategory.AMBIENT)
            .sized(0.6F, 1.8F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("pyrocinical")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.e>> z = a.register(
        "luna_hook",
        () -> Builder.of(com.trolmastercard.sexmod.f.e::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(64).updateInterval(3).build("luna_hook")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.b>> A = a.register(
        "energy_ball",
        () -> Builder.of(com.trolmastercard.sexmod.f.b::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(64).updateInterval(3).build("energy_ball")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.f.d>> B = a.register(
        "kobold_egg",
        () -> Builder.of(com.trolmastercard.sexmod.f.d::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(64).updateInterval(3).build("kobold_egg")
    );

    public static void a(IEventBus var0) {
        a.register(var0);
    }

    public static void a(EntityAttributeCreationEvent var0) {
        var0.put((EntityType)b.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)c.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)d.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)e.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)f.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)g.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)h.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)i.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)j.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)k.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)l.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)m.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)n.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)o.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)p.get(), com.trolmastercard.sexmod.f.b.b.b().build());
        var0.put((EntityType)q.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)r.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)s.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)t.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)u.get(), com.trolmastercard.sexmod.f.b.h.j().build());
        var0.put((EntityType)v.get(), com.trolmastercard.sexmod.f.b.k.aq().build());
        var0.put((EntityType)w.get(), LivingEntity.createLivingAttributes().build());
        var0.put((EntityType)x.get(), com.trolmastercard.sexmod.f.c.a().build());
        var0.put((EntityType)y.get(), com.trolmastercard.sexmod.f.f.a().build());
        var0.put((EntityType)A.get(), com.trolmastercard.sexmod.f.b.a().build());
        var0.put((EntityType)B.get(), com.trolmastercard.sexmod.f.d.a().build());
    }
}
