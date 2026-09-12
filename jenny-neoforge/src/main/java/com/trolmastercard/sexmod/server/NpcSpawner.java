package com.trolmastercard.sexmod.server;

import com.trolmastercard.sexmod.Sexmod;
import com.trolmastercard.sexmod.entity.ScenePose;
import com.trolmastercard.sexmod.entity.Triggerable;
import com.trolmastercard.sexmod.entity.JennyEntity;
import com.trolmastercard.sexmod.entity.GirlEntity;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Zombie;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.util.FakePlayer;
import net.neoforged.neoforge.common.util.FakePlayerFactory;
import net.neoforged.neoforge.event.tick.ServerTickEvent.Post;

@EventBusSubscriber(modid = "sexmod")
public final class NpcSpawner {
    private static int a = -1;
    private static boolean b = false;
    private static boolean c = false;
    private static int d = -1;
    private static int e = -1;
    private static boolean f = false;
    private static boolean g = false;
    private static int h = 0;
    private static int i = 0;
    private static List<com.trolmastercard.sexmod.server.NpcSpawner.b> j;
    private static List<com.trolmastercard.sexmod.server.NpcSpawner.a> k;

    private static List<com.trolmastercard.sexmod.server.NpcSpawner.b> a() {
        ArrayList var0 = new ArrayList();
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("jenny", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.b.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("ellie", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.m.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("bia", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.n.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("slime", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.o.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("bee", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.p.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("allie", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.q.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("luna", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.r.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("manglelie", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.s.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("galath", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.t.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("kobold", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.u.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("goblin", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.v.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("custom_model", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.w.get()).create(var0x)));
        var0.add(new com.trolmastercard.sexmod.server.NpcSpawner.b("friendly_slime", var0x -> ((EntityType)com.trolmastercard.sexmod.registry.ModEntities.x.get()).create(var0x)));

        return var0;
    }

    private static List<com.trolmastercard.sexmod.server.NpcSpawner.a> b() {
        ArrayList var0 = new ArrayList();
        var0.add(
            new com.trolmastercard.sexmod.server.NpcSpawner.a(
                "Luna/headpat", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.r.get()).create(var0x), "headpat", com.trolmastercard.sexmod.entity.ScenePose.af
            )
        );
        var0.add(
            new com.trolmastercard.sexmod.server.NpcSpawner.a(
                "Bia/headpat", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.n.get()).create(var0x), "Headpat", com.trolmastercard.sexmod.entity.ScenePose.af
            )
        );
        var0.add(
            new com.trolmastercard.sexmod.server.NpcSpawner.a(
                "Bia/talk", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.n.get()).create(var0x), "talkHorny", com.trolmastercard.sexmod.entity.ScenePose.Q
            )
        );
        return var0;
    }

    @SubscribeEvent
    public static void onServerTick(Post var0) {
        if (!g && new File("feature.target").exists()) {
            MinecraftServer var1 = var0.getServer();
            ServerLevel var2 = var1.overworld();
            if (var2 != null) {
                switch (h) {
                    case 0:
                        var2.setChunkForced(0, 0, true);
                        var2.getChunk(0, 0);
                        h = 1;
                        i = 0;
                        break;
                    case 1:
                        if (++i >= 20) {
                            h = 2;
                            i = 0;
                        }
                        break;
                    case 2:
                        j = a();
                        int var20 = 0;
                        Iterator var26 = j.iterator();

                        while (true) {
                            while (true) {
                                if (!var26.hasNext()) {
                                    k = b();
                                    FakePlayer var27 = FakePlayerFactory.getMinecraft(var2);
                                    var27.moveTo(8.0, -60.0, 8.0, 0.0F, 0.0F);
                                    int var31 = 0;

                                    for (com.trolmastercard.sexmod.server.NpcSpawner.a var39 : k) {
                                        try {
                                            GirlEntity var41 = var39.b.apply(var2);
                                            var41.moveTo(6.0 + var31 % 3 * 1.5, -60.0, 10.0, 0.0F, 0.0F);
                                            var2.addFreshEntity(var41);
                                            var41.q(var27.getUUID());
                                            var41.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.av, var39.c);
                                            if (var41 instanceof Triggerable var42) {
                                                var42.d_();
                                            }

                                            var39.e = var41.getId();
                                        } catch (Throwable var13) {
                                            var39.g = "FAIL gesture-spawn " + var13;
                                        }

                                        var31++;
                                    }

                                    try {
                                        JennyEntity var36 = (JennyEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.b.get()).create(var2);
                                        if (var36 != null) {
                                            var36.moveTo(12.0, -60.0, 8.0, 0.0F, 0.0F);
                                            var2.addFreshEntity(var36);
                                            var36.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.ao, var27.getUUID().toString());
                                            a = var36.getId();
                                        }
                                    } catch (Throwable var12) {
                                        Sexmod.a.info("[FEATURE] downed-check spawn failed: " + var12);
                                    }

                                    try {
                                        JennyEntity var37 = (JennyEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.b.get()).create(var2);
                                        Zombie var40 = (Zombie)((EntityType)BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.withDefaultNamespace("zombie")))
                                            .create(var2);
                                        if (var37 != null && var40 != null) {
                                            var37.moveTo(20.0, -60.0, 20.0, 0.0F, 0.0F);
                                            var2.addFreshEntity(var37);
                                            var37.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.ao, var27.getUUID().toString());
                                            d = var37.getId();
                                            var40.moveTo(20.0, -60.0, 30.0, 0.0F, 0.0F);
                                            var40.setNoAi(true);
                                            var2.addFreshEntity(var40);
                                            e = var40.getId();
                                        }
                                    } catch (Throwable var11) {
                                        Sexmod.a.info("[FEATURE] archery-check spawn failed: " + var11);
                                    }

                                    Sexmod.a.info("[FEATURE] spawned " + j.size() + " mobs + " + k.size() + " gestures");
                                    h = 3;
                                    i = 0;
                                    return;
                                }

                                com.trolmastercard.sexmod.server.NpcSpawner.b var30 = (com.trolmastercard.sexmod.server.NpcSpawner.b)var26.next();

                                try {
                                    Entity var34 = var30.b.apply(var2);
                                    if (var34 != null) {
                                        var34.moveTo(1.5 + var20 % 7 * 1.8, -60.0, 4.0 + var20 / 7 * 3.0, 0.0F, 0.0F);
                                        var2.addFreshEntity(var34);
                                        var30.c = var34.getId();
                                        var30.d = "spawned";
                                        break;
                                    }

                                    var30.d = "FAIL create=null";
                                } catch (Throwable var14) {
                                    var30.d = "FAIL spawn-throw " + var14;
                                    break;
                                }
                            }

                            var20++;
                        }
                    case 3:
                        if (a != -1 && i == 20 && var2.getEntity(a) instanceof JennyEntity var3) {
                            var3.hurt(var2.damageSources().generic(), 1000.0F);
                        }

                        if (a != -1 && i == 30 && var2.getEntity(a) instanceof JennyEntity var15) {
                            b = var15.isAlive() && var15.F && var15.getHealth() == 1.0F;
                            var15.heal(1000.0F);
                        }

                        if (a != -1 && i == 40 && var2.getEntity(a) instanceof JennyEntity var16) {
                            c = !var16.F && var16.getHealth() >= var16.getMaxHealth();
                        }

                        if (!f && d != -1 && var2.getEntity(d) instanceof JennyEntity var17 && var17.ai() == com.trolmastercard.sexmod.entity.ScenePose.B) {
                            f = true;
                        }

                        for (com.trolmastercard.sexmod.server.NpcSpawner.a var24 : k) {
                            if (!var24.f && var24.e != -1 && var2.getEntity(var24.e) instanceof GirlEntity var5 && var5.ai() == var24.d) {
                                var24.f = true;
                            }
                        }

                        if (++i >= 100) {
                            StringBuilder var19 = new StringBuilder("FEATURE RESULTS\n-- SMOKE (spawn + tick, no crash) --\n");
                            int var25 = 0;

                            for (com.trolmastercard.sexmod.server.NpcSpawner.b var32 : j) {
                                boolean var7 = var32.c != -1 && var2.getEntity(var32.c) != null && var2.getEntity(var32.c).isAlive();
                                if (var7) {
                                    var25++;
                                }

                                var19.append("  ").append(var32.a).append(": ").append(var7 ? "ALIVE" : "DEAD/" + var32.d).append('\n');
                            }

                            var19.append("  smoke ").append(var25).append('/').append(j.size()).append(" alive\n-- GESTURES (U() drive) --\n");
                            int var29 = 0;

                            for (com.trolmastercard.sexmod.server.NpcSpawner.a var38 : k) {
                                ScenePose var8 = var38.e != -1 && var2.getEntity(var38.e) instanceof GirlEntity var9 ? var9.ai() : null;
                                if (var38.f) {
                                    var29++;
                                }

                                var19.append("  ")
                                    .append(var38.a)
                                    .append(": ")
                                    .append(var38.f ? "PASS" : "FAIL")
                                    .append(" want=")
                                    .append(var38.d.name())
                                    .append(" reached=")
                                    .append(var38.f)
                                    .append(" final=")
                                    .append(var8 == null ? "(gone)" : var8.name())
                                    .append('\n');
                            }

                            var19.append("  gestures ").append(var29).append('/').append(k.size()).append(" ok\n");
                            var19.append("-- DOWNED (EntityNpcCombatBase.DownedEvents) --\n")
                                .append("  survived_lethal_hit: ")
                                .append(b)
                                .append('\n')
                                .append("  recovered_after_heal: ")
                                .append(c)
                                .append('\n');
                            var19.append("-- ARCHERY (CombatFollowOwnerGoal bow switch) --\n").append("  reached_bow_charge: ").append(f).append('\n');
                            a(var2, var19.toString());
                        }
                }
            }
        }
    }

    private static void a(ServerLevel var0, String var1) {
        Sexmod.a.info("[FEATURE] DONE\n" + var1);

        try {
            if (j != null) {
                for (com.trolmastercard.sexmod.server.NpcSpawner.b var3 : j) {
                    if (var3.c != -1 && var0.getEntity(var3.c) != null) {
                        var0.getEntity(var3.c).discard();
                    }
                }
            }

            if (k != null) {
                for (com.trolmastercard.sexmod.server.NpcSpawner.a var7 : k) {
                    if (var7.e != -1 && var0.getEntity(var7.e) != null) {
                        var0.getEntity(var7.e).discard();
                    }
                }
            }

            if (a != -1 && var0.getEntity(a) != null) {
                var0.getEntity(a).discard();
            }

            if (d != -1 && var0.getEntity(d) != null) {
                var0.getEntity(d).discard();
            }

            if (e != -1 && var0.getEntity(e) != null) {
                var0.getEntity(e).discard();
            }

            var0.setChunkForced(0, 0, false);
        } catch (Throwable var5) {
        }

        try {
            Files.writeString(new File("feature.done").toPath(), var1);
        } catch (Throwable var4) {
            Sexmod.a.info("[FEATURE] could not write feature.done: " + var4);
        }

        g = true;
    }

    private NpcSpawner() {
    }

    private static final class a {
        final String a;
        final Function<ServerLevel, GirlEntity> b;
        final String c;
        final ScenePose d;
        int e = -1;
        boolean f = false;
        String g = "(not spawned)";

        a(String var1, Function<ServerLevel, GirlEntity> var2, String var3, ScenePose var4) {
            this.a = var1;
            this.b = var2;
            this.c = var3;
            this.d = var4;
        }
    }

    private static final class b {
        final String a;
        final Function<ServerLevel, ? extends Entity> b;
        int c = -1;
        String d = "(not spawned)";

        b(String var1, Function<ServerLevel, ? extends Entity> var2) {
            this.a = var1;
            this.b = var2;
        }
    }
}
