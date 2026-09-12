package com.trolmastercard.sexmod.server.debug;

import com.trolmastercard.sexmod.Sexmod;
import com.trolmastercard.sexmod.entity.ScenePose;
import com.trolmastercard.sexmod.entity.GirlEntity;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.util.FakePlayer;
import net.neoforged.neoforge.common.util.FakePlayerFactory;
import net.neoforged.neoforge.event.tick.ServerTickEvent.Post;

@EventBusSubscriber(modid = "sexmod")
public final class DebugSceneTester {
    private static boolean a = false;
    private static int b = 0;
    private static int c = 0;
    private static List<DebugSceneTester.a> d;

    private static List<DebugSceneTester.a> a() {
        ArrayList var0 = new ArrayList();
        var0.add(new DebugSceneTester.a("Jenny/blowjob", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.b.get()).create(var0x), ScenePose.b));
        var0.add(new DebugSceneTester.a("Jenny/paizuri", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.b.get()).create(var0x), ScenePose.G));
        var0.add(new DebugSceneTester.a("Jenny/doggy", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.b.get()).create(var0x), ScenePose.j));
        var0.add(new DebugSceneTester.a("Luna/touchboobs", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.r.get()).create(var0x), ScenePose.az));
        var0.add(new DebugSceneTester.a("Luna/sex", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.r.get()).create(var0x), ScenePose.aE));
        var0.add(new DebugSceneTester.a("Ellie/cowgirl", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.m.get()).create(var0x), ScenePose.w));
        var0.add(new DebugSceneTester.a("Ellie/missionary", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.m.get()).create(var0x), ScenePose.M));
        var0.add(new DebugSceneTester.a("Bia/anal", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.n.get()).create(var0x), ScenePose.V));
        var0.add(new DebugSceneTester.a("Bia/doggy", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.n.get()).create(var0x), ScenePose.bv));
        var0.add(new DebugSceneTester.a("Allie/deepthroat", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.q.get()).create(var0x), ScenePose.ah));
        var0.add(new DebugSceneTester.a("Allie/reversecowgirl", var0x -> (GirlEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.q.get()).create(var0x), ScenePose.bE));
        return var0;
    }

    @SubscribeEvent
    public static void onServerTick(Post var0) {
        if (!a && new File("scene.target").exists()) {
            MinecraftServer var1 = var0.getServer();
            ServerLevel var2 = var1.overworld();
            if (var2 != null) {
                switch (b) {
                    case 0:
                        var2.setChunkForced(0, 0, true);
                        var2.getChunk(0, 0);
                        Sexmod.a.info("[SCENE] chunk (0,0) forced; settling");
                        b = 1;
                        c = 0;
                        break;
                    case 1:
                        if (++c >= 20) {
                            b = 2;
                            c = 0;
                        }
                        break;
                    case 2:
                        FakePlayer var13 = FakePlayerFactory.getMinecraft(var2);
                        var13.moveTo(8.0, -60.0, 8.0, 0.0F, 0.0F);
                        d = a();
                        int var15 = 0;

                        for (DebugSceneTester.a var20 : d) {
                            GirlEntity var21 = var20.b.apply(var2);
                            if (var21 == null) {
                                var20.h = "ABORT create null";
                            } else {
                                double var22 = 1.5 + var15 % 7 * 1.8;
                                double var10 = 4.0 + var15 / 7 * 3.0;
                                var21.moveTo(var22, -60.0, var10, 0.0F, 0.0F);
                                var2.addFreshEntity(var21);
                                var21.a(var13, var20.c);
                                var20.d = var21.getId();
                                var15++;
                            }
                        }

                        Sexmod.a.info("[SCENE] spawned " + d.size() + " scene cases via startSceneInPlace");
                        b = 3;
                        c = 0;
                        break;
                    case 3:
                        c++;

                        for (DebugSceneTester.a var4 : d) {
                            if (var4.d != -1 && var2.getEntity(var4.d) instanceof GirlEntity var5) {
                                ScenePose var18 = var5.ai();
                                if (var18 != ScenePose.a && var18.cp) {
                                    var4.g = var18.name();
                                }

                                if (var18.name().endsWith("CUM") || var18 == ScenePose.e) {
                                    var4.e = true;
                                }

                                if (var4.e && var18 == ScenePose.a) {
                                    var4.f = true;
                                }

                                if (c >= 60 && c <= 120 && c % 6 == 0) {
                                    var5.e(false);
                                }

                                if (c == 140) {
                                    var5.e(true);
                                }
                            }
                        }

                        if (c >= 270) {
                            StringBuilder var12 = new StringBuilder("SCENE FULL-LOOP RESULTS (start -> advance -> climax -> auto-exit)\n");
                            int var14 = 0;
                            int var16 = 0;
                            int var19 = 0;

                            for (DebugSceneTester.a var8 : d) {
                                boolean var9 = !var8.g.isEmpty();
                                if (var9) {
                                    var14++;
                                }

                                if (var8.e) {
                                    var16++;
                                }

                                if (var8.f) {
                                    var19++;
                                }

                                var8.h = "start="
                                    + (var9 ? "Y" : "n")
                                    + " climax="
                                    + (var8.e ? "Y" : "n")
                                    + " exit="
                                    + (var8.f ? "Y" : "n")
                                    + " deepest="
                                    + (var8.g.isEmpty() ? "-" : var8.g);
                                var12.append("  ").append(var8.a).append(": ").append(var8.h).append('\n');
                            }

                            var12.append("TOTAL started=")
                                .append(var14)
                                .append(" climax=")
                                .append(var16)
                                .append(" exit=")
                                .append(var19)
                                .append(" / ")
                                .append(d.size())
                                .append('\n');
                            a(var2, var12.toString());
                        }
                }
            }
        }
    }

    private static void a(ServerLevel var0, String var1) {
        Sexmod.a.info("[SCENE] DONE\n" + var1);

        try {
            if (d != null) {
                for (DebugSceneTester.a var3 : d) {
                    if (var3.d != -1 && var0.getEntity(var3.d) != null) {
                        var0.getEntity(var3.d).discard();
                    }
                }
            }

            var0.setChunkForced(0, 0, false);
        } catch (Throwable var5) {
        }

        try {
            Files.writeString(new File("scene.done").toPath(), var1);
        } catch (Throwable var4) {
            Sexmod.a.info("[SCENE] could not write scene.done: " + var4);
        }

        a = true;
    }

    private DebugSceneTester() {
    }

    private static final class a {
        final String a;
        final Function<ServerLevel, GirlEntity> b;
        final ScenePose c;
        int d = -1;
        boolean e = false;
        boolean f = false;
        String g = "";
        String h = "(not spawned)";

        a(String var1, Function<ServerLevel, GirlEntity> var2, ScenePose var3) {
            this.a = var1;
            this.b = var2;
            this.c = var3;
        }
    }
}
