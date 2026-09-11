package com.trolmastercard.sexmod.e;

import com.trolmastercard.sexmod.Main;
import java.io.File;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent.Post;

@EventBusSubscriber(modid = "sexmod")
public final class c {
    private static boolean a = false;
    private static int b = 0;
    private static int c = 0;
    private static int d = -1;
    private static int e = -1;
    private static Vec3 f = Vec3.ZERO;
    private static final Set<String> g = new HashSet<>();
    private static int h = 0;
    private static int i = 0;
    private static double j = 0.0;
    private static boolean k = false;

    @SubscribeEvent
    public static void onServerTick(Post var0) {
        if (!a) {
            if (new File("gameplay.target").exists()) {
                MinecraftServer var1 = var0.getServer();
                ServerLevel var2 = var1.overworld();
                if (var2 != null) {
                    switch (b) {
                        case 0:
                            var2.setChunkForced(0, 0, true);
                            var2.getChunk(0, 0);
                            Main.a.info("[GAMEPLAY] force-loaded + ticketed chunk (0,0); settling before spawn");
                            b = 1;
                            c = 0;
                            return;
                        case 1:
                            if (++c < 20) {
                                return;
                            }

                            b = 2;
                            c = 0;
                            return;
                        case 2:
                            Vec3 var11 = new Vec3(8.5, -57.0, 12.5);
                            Vec3 var13 = new Vec3(12.5, -60.0, 12.5);
                            com.trolmastercard.sexmod.f.b.e var15 = (com.trolmastercard.sexmod.f.b.e)((EntityType)com.trolmastercard.sexmod.i.b.t.get())
                                .create(var2);
                            LivingEntity var17 = (LivingEntity)((EntityType)BuiltInRegistries.ENTITY_TYPE
                                    .get(ResourceLocation.withDefaultNamespace("iron_golem")))
                                .create(var2);
                            if (var15 != null && var17 != null) {
                                var15.moveTo(var11.x, var11.y, var11.z, 0.0F, 0.0F);
                                var17.moveTo(var13.x, var13.y, var13.z, 0.0F, 0.0F);
                                var2.addFreshEntity(var15);
                                var2.addFreshEntity(var17);
                                var15.a(var17);
                                d = var15.getId();
                                e = var17.getId();
                                f = var15.position();
                                Main.a
                                    .info(
                                        "[GAMEPLAY] GALATH_FIGHT begin: galath="
                                            + d
                                            + " target(ironGolem)="
                                            + e
                                            + " at "
                                            + a(var11.x)
                                            + ","
                                            + a(var11.y)
                                            + ","
                                            + a(var11.z)
                                    );
                                b = 3;
                                c = 0;
                                return;
                            }

                            a(var2, "ABORT: spawn failed (create null)");
                            return;
                        case 3:
                            if (var2.getEntity(d) instanceof com.trolmastercard.sexmod.f.b.e var3 && var3.isAlive()) {
                                LivingEntity var12 = var2.getEntity(e) instanceof LivingEntity var5 ? var5 : null;
                                if (var3.p() == null && var12 != null && var12.isAlive()) {
                                    var3.a(var12);
                                }

                                if (var3.p() != null) {
                                    k = true;
                                }

                                if (var3.p != null) {
                                    g.add(var3.p.name());
                                }

                                int var14 = var2.getEntitiesOfClass(
                                        com.trolmastercard.sexmod.f.b.class, new AABB(var3.position(), var3.position()).inflate(48.0)
                                    )
                                    .size();
                                if (var14 > h) {
                                    h = var14;
                                }

                                if (var3.u.size() > i) {
                                    i = var3.u.size();
                                }

                                double var16 = var3.position().distanceTo(f);
                                if (var16 > j) {
                                    j = var16;
                                }

                                if (c % 40 == 0) {
                                    Main.a
                                        .info(
                                            "[GAMEPLAY] +"
                                                + c
                                                + "t  bZ="
                                                + (var3.p == null ? "-" : var3.p.name())
                                                + "  M="
                                                + (var3.p() == null ? "null" : "set")
                                                + "  balls="
                                                + var14
                                                + "  skels="
                                                + var3.u.size()
                                                + "  move="
                                                + a(var16)
                                                + "  anim="
                                                + var3.ai()
                                        );
                                }

                                if (++c >= 240) {
                                    boolean var8 = !g.isEmpty();
                                    boolean var9 = h > 0 || i > 0 || j > 1.0;
                                    String var10 = var8 && var9 && k ? "RAN" : "INCONCLUSIVE";
                                    a(
                                        var2,
                                        "VERDICT="
                                            + var10
                                            + " targetHeld="
                                            + k
                                            + " abilities="
                                            + g
                                            + " maxEnergyBalls="
                                            + h
                                            + " maxSkeletons="
                                            + i
                                            + " maxMove="
                                            + a(j)
                                    );
                                }

                                return;
                            } else {
                                a(var2, "ABORT: Galath gone at tick " + c + " (was alive at spawn)");
                                return;
                            }
                    }
                }
            }
        }
    }

    private static void a(ServerLevel var0, String var1) {
        Main.a.info("[GAMEPLAY] GALATH_FIGHT DONE \u2014 " + var1);

        try {
            if (d != -1 && var0.getEntity(d) != null) {
                var0.getEntity(d).discard();
            }

            if (e != -1 && var0.getEntity(e) != null) {
                var0.getEntity(e).discard();
            }

            var0.setChunkForced(0, 0, false);
        } catch (Throwable var4) {
        }

        try {
            Files.writeString(new File("gameplay.done").toPath(), var1 + "\n");
        } catch (Throwable var3) {
            Main.a.info("[GAMEPLAY] could not write gameplay.done: " + var3);
        }

        a = true;
    }

    private static String a(double var0) {
        return String.format("%.2f", var0);
    }

    private c() {
    }
}
