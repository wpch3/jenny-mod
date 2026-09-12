package com.trolmastercard.sexmod.registry;

import com.trolmastercard.sexmod.entity.JennyEntity;
import com.trolmastercard.sexmod.entity.SlimeGirlEntity;
import com.trolmastercard.sexmod.entity.player.PlayerEllieEntity;
import com.trolmastercard.sexmod.entity.player.PlayerGoblinEntity;
import com.trolmastercard.sexmod.entity.player.PlayerJennyEntity;
import com.trolmastercard.sexmod.entity.player.PlayerKoboldEntity;
import com.trolmastercard.sexmod.entity.player.PlayerLunaEntity;
import com.trolmastercard.sexmod.entity.player.PlayerSlimeEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType.Builder;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModEntities {
    public static final DeferredRegister<EntityType<?>> a = DeferredRegister.create(Registries.ENTITY_TYPE, "sexmod");
    public static final DeferredHolder<EntityType<?>, EntityType<JennyEntity>> b = a.register(
        "jenny", () -> Builder.of(JennyEntity::new, MobCategory.CREATURE).sized(0.6F, 1.8F).clientTrackingRange(64).updateInterval(3).build("jenny")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<PlayerJennyEntity>> c = a.register(
        "player_jenny", () -> Builder.of(PlayerJennyEntity::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_jenny")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<PlayerEllieEntity>> d = a.register(
        "player_ellie", () -> Builder.of(PlayerEllieEntity::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_ellie")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<PlayerSlimeEntity>> e = a.register(
        "player_slime", () -> Builder.of(PlayerSlimeEntity::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_slime")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.player.PlayerBiaEntity>> f = a.register(
        "player_bia",
        () -> Builder.of(com.trolmastercard.sexmod.entity.player.PlayerBiaEntity::new, MobCategory.MISC)
            .sized(0.01F, 0.01F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("player_bia")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.player.PlayerBeeEntity>> g = a.register(
        "player_bee",
        () -> Builder.of(com.trolmastercard.sexmod.entity.player.PlayerBeeEntity::new, MobCategory.MISC)
            .sized(0.01F, 0.01F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("player_bee")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.player.PlayerAllieEntity>> h = a.register(
        "player_allie",
        () -> Builder.of(com.trolmastercard.sexmod.entity.player.PlayerAllieEntity::new, MobCategory.MISC)
            .sized(0.01F, 0.01F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("player_allie")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<PlayerLunaEntity>> i = a.register(
        "player_luna", () -> Builder.of(PlayerLunaEntity::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_luna")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.player.PlayerGalathEntity>> j = a.register(
        "player_galath",
        () -> Builder.of(com.trolmastercard.sexmod.entity.player.PlayerGalathEntity::new, MobCategory.MISC)
            .sized(0.01F, 0.01F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("player_galath")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<PlayerKoboldEntity>> k = a.register(
        "player_kobold", () -> Builder.of(PlayerKoboldEntity::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_kobold")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<PlayerGoblinEntity>> l = a.register(
        "player_goblin", () -> Builder.of(PlayerGoblinEntity::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(64).updateInterval(3).build("player_goblin")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.EllieEntity>> m = a.register(
        "ellie",
        () -> Builder.of(com.trolmastercard.sexmod.entity.EllieEntity::new, MobCategory.CREATURE).sized(0.6F, 1.8F).clientTrackingRange(64).updateInterval(3).build("ellie")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.BiaEntity>> n = a.register(
        "bia",
        () -> Builder.of(com.trolmastercard.sexmod.entity.BiaEntity::new, MobCategory.CREATURE).sized(0.6F, 1.65F).clientTrackingRange(64).updateInterval(3).build("bia")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<SlimeGirlEntity>> o = a.register(
        "slime", () -> Builder.of(SlimeGirlEntity::new, MobCategory.CREATURE).sized(0.6F, 1.8F).clientTrackingRange(64).updateInterval(3).build("slime")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.BeeEntity>> p = a.register(
        "bee",
        () -> Builder.of(com.trolmastercard.sexmod.entity.BeeEntity::new, MobCategory.CREATURE).sized(0.3F, 1.5F).clientTrackingRange(64).updateInterval(3).build("bee")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.AllieEntity>> q = a.register(
        "allie",
        () -> Builder.of(com.trolmastercard.sexmod.entity.AllieEntity::new, MobCategory.CREATURE).sized(0.5F, 1.0F).clientTrackingRange(64).updateInterval(3).build("allie")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.LunaEntity>> r = a.register(
        "luna",
        () -> Builder.of(com.trolmastercard.sexmod.entity.LunaEntity::new, MobCategory.CREATURE).sized(0.6F, 1.8F).clientTrackingRange(64).updateInterval(3).build("luna")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.ManglelieEntity>> s = a.register(
        "manglelie",
        () -> Builder.of(com.trolmastercard.sexmod.entity.ManglelieEntity::new, MobCategory.AMBIENT)
            .sized(0.6F, 0.9F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("manglelie")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.GalathEntity>> t = a.register(
        "galath",
        () -> Builder.of(com.trolmastercard.sexmod.entity.GalathEntity::new, MobCategory.MONSTER).sized(1.0F, 2.4F).clientTrackingRange(64).updateInterval(3).build("galath")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.KoboldEntity>> u = a.register(
        "kobold",
        () -> Builder.of(com.trolmastercard.sexmod.entity.KoboldEntity::new, MobCategory.CREATURE)
            .sized(0.5F, 0.99F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("kobold")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.GoblinEntity>> v = a.register(
        "goblin",
        () -> Builder.of(com.trolmastercard.sexmod.entity.GoblinEntity::new, MobCategory.CREATURE)
            .sized(0.5F, 0.99F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("goblin")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.CustomModelEntity>> w = a.register(
        "custom_model",
        () -> Builder.of(com.trolmastercard.sexmod.entity.CustomModelEntity::new, MobCategory.MISC)
            .sized(0.1F, 0.1F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("custom_model")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.FriendlySlimeEntity>> x = a.register(
        "friendly_slime",
        () -> Builder.of(com.trolmastercard.sexmod.entity.FriendlySlimeEntity::new, MobCategory.CREATURE)
            .sized(0.51F, 0.51F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("friendly_slime")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.PyrocinicalEntity>> y = a.register(
        "pyrocinical",
        () -> Builder.of(com.trolmastercard.sexmod.entity.PyrocinicalEntity::new, MobCategory.AMBIENT)
            .sized(0.6F, 1.8F)
            .clientTrackingRange(64)
            .updateInterval(3)
            .build("pyrocinical")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.LunaHookEntity>> z = a.register(
        "luna_hook",
        () -> Builder.<com.trolmastercard.sexmod.entity.LunaHookEntity>of(com.trolmastercard.sexmod.entity.LunaHookEntity::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(64).updateInterval(3).build("luna_hook")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.EnergyBallEntity>> A = a.register(
        "energy_ball",
        () -> Builder.<com.trolmastercard.sexmod.entity.EnergyBallEntity>of(com.trolmastercard.sexmod.entity.EnergyBallEntity::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(64).updateInterval(3).build("energy_ball")
    );
    public static final DeferredHolder<EntityType<?>, EntityType<com.trolmastercard.sexmod.entity.KoboldEggEntity>> B = a.register(
        "kobold_egg",
        () -> Builder.of(com.trolmastercard.sexmod.entity.KoboldEggEntity::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(64).updateInterval(3).build("kobold_egg")
    );

    public static void a(IEventBus var0) {
        a.register(var0);
    }

    public static void a(EntityAttributeCreationEvent var0) {
        var0.put((EntityType)b.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)c.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)d.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)e.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)f.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)g.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)h.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)i.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)j.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)k.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)l.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)m.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)n.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)o.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)p.get(), com.trolmastercard.sexmod.entity.BeeEntity.b().build());
        var0.put((EntityType)q.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)r.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)s.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)t.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)u.get(), com.trolmastercard.sexmod.entity.KoboldEntity.j().build());
        var0.put((EntityType)v.get(), com.trolmastercard.sexmod.entity.GirlEntity.aq().build());
        var0.put((EntityType)w.get(), LivingEntity.createLivingAttributes().build());
        var0.put((EntityType)x.get(), com.trolmastercard.sexmod.entity.FriendlySlimeEntity.a().build());
        var0.put((EntityType)y.get(), com.trolmastercard.sexmod.entity.PyrocinicalEntity.a().build());
        var0.put((EntityType)A.get(), com.trolmastercard.sexmod.entity.EnergyBallEntity.a().build());
        var0.put((EntityType)B.get(), com.trolmastercard.sexmod.entity.KoboldEggEntity.a().build());
    }
}
