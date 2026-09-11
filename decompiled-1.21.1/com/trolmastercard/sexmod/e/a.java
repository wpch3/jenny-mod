package com.trolmastercard.sexmod.e;

import com.trolmastercard.sexmod.f.j;
import com.trolmastercard.sexmod.f.b.g;
import com.trolmastercard.sexmod.f.b.k;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.CameraType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.server.IntegratedServer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Difficulty;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.GameType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent.Post;
import net.neoforged.neoforge.server.ServerLifecycleHooks;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class a {
    static final String[] a = new String[]{"STARTBLOWJOB", "PAIZURI_START", "DOGGYSTART"};
    static int b = 0;
    static int c = 0;
    static int d = 0;
    static volatile int e = -1;
    static boolean f = false;
    private static boolean A = false;
    static final String[] g = new String[]{"STARTBLOWJOB", "SUCKBLOWJOB", "THRUSTBLOWJOB", "PAIZURI_START", "PAIZURI_SLOW", "DOGGYSTART", "DOGGYSLOW"};
    static final double[][] h = new double[][]{{2.6, 0.9, 0.0}, {0.3, 0.9, 2.6}, {-2.6, 0.9, 0.0}, {1.3, 0.45, 0.0}};
    static final String[] i = new String[]{"front", "side", "back", "groin"};
    static int j = 0;
    static int k = 0;
    static int l = 0;
    static int m = 0;
    static boolean n = false;
    static String o = null;
    static String p = null;
    static int q = 0;
    static int r = 0;
    static int s = 0;
    static boolean t = false;
    static String u = null;
    static String v = null;
    static int w = 0;
    static boolean x = false;
    static boolean y = false;
    static boolean z = false;

    private a() {
    }

    @SubscribeEvent
    public static void onClientTick(Post var0) {
        if (!f) {
            if (!A) {
                A = true;

                try {
                    String var1 = "user.dir="
                        + System.getProperty("user.dir")
                        + " capture.hold.exists="
                        + new File("capture.hold").exists()
                        + " abs="
                        + new File("capture.hold").getAbsolutePath();
                    Files.writeString(new File("portcapture_cwd.txt").toPath(), var1);
                } catch (Throwable var3) {
                }
            }

            try {
                if (new File("capture.hold").exists()) {
                    d();
                } else if (new File("capture.target").exists()) {
                    c();
                } else if (new File("capture.live").exists()) {
                    a();
                } else if (new File("capture.marker").exists()) {
                    b();
                }
            } catch (Throwable var2) {
                d("drive threw: " + var2);
                var2.printStackTrace();
            }
        }
    }

    static void a() {
        Minecraft var0 = Minecraft.getInstance();
        LocalPlayer var1 = var0.player;
        if (var1 != null && var0.level != null) {
            IntegratedServer var2 = var0.getSingleplayerServer();
            if (var2 == null) {
                f = true;
            } else {
                switch (b) {
                    case 0:
                        d("LIVE in world");
                        c(var2);
                        b = 1;
                        c = 0;
                        return;
                    case 1:
                        if (++c < 30) {
                            return;
                        }

                        double var3 = var1.getX();
                        double var5 = var1.getY();
                        double var7 = var1.getZ();
                        float var9 = var1.getYRot();
                        String var10 = a[d];
                        var2.execute(() -> a(var2, var10, var3, var5, var7, var9));
                        b = 2;
                        c = 0;
                        return;
                    case 2:
                        if (++c < 70) {
                            return;
                        }

                        var2.execute(
                            () -> {
                                Entity var1x = var2.overworld().getEntity(e);

                                for (ServerPlayer var3x : var2.getPlayerList().getPlayers()) {
                                    if (var1x instanceof g var4) {
                                        var4.e(false);
                                        d(
                                            "LIVE seat: player="
                                                + a(var3x.getX())
                                                + ","
                                                + a(var3x.getY())
                                                + ","
                                                + a(var3x.getZ())
                                                + " jenny="
                                                + a(var1x.getX())
                                                + ","
                                                + a(var1x.getY())
                                                + ","
                                                + a(var1x.getZ())
                                                + " dist="
                                                + a(Math.sqrt(var3x.distanceToSqr(var1x)))
                                                + " act="
                                                + var4.ai()
                                        );
                                    }
                                }
                            }
                        );
                        b = 3;
                        c = 0;
                        return;
                    case 3:
                        if (++c < 45) {
                            return;
                        }

                        b(var2, a[d]);
                        a(var0, "port_" + a[d] + "_fp");
                        var0.options.setCameraType(CameraType.THIRD_PERSON_BACK);
                        b = 4;
                        c = 0;
                        return;
                    case 4:
                        if (++c < 15) {
                            return;
                        }

                        a(var0, "port_" + a[d] + "_3pback");
                        var0.options.setCameraType(CameraType.THIRD_PERSON_FRONT);
                        b = 5;
                        c = 0;
                        return;
                    case 5:
                        if (++c < 15) {
                            return;
                        }

                        a(var0, "port_" + a[d] + "_3pfront");
                        var0.options.setCameraType(CameraType.FIRST_PERSON);
                        a(var0);
                        c = 0;
                        if (++d >= a.length) {
                            f();
                            f = true;
                            d("LIVE ALL-SCENES DONE (" + a.length + " scenes x 3 F5 POVs)");
                        } else {
                            b = 1;
                        }

                        return;
                }
            }
        }
    }

    static void a(MinecraftServer var0, String var1, double var2, double var4, double var6, float var8) {
        try {
            ServerLevel var9 = var0.overworld();
            g var10 = (g)((EntityType)com.trolmastercard.sexmod.i.b.b.get()).create(var9);
            if (var10 == null) {
                d("LIVE: JENNY.create null");
                return;
            }

            var10.setPersistenceRequired();
            double var11 = Math.toRadians(var8);
            var10.moveTo(var2 + -Math.sin(var11) * 2.0, var4, var6 + Math.cos(var11) * 2.0, var8 + 180.0F, 0.0F);
            var9.addFreshEntity(var10);
            e = var10.getId();
            ServerPlayer var13 = (ServerPlayer)var0.getPlayerList().getPlayers().get(0);
            var10.a(var13, com.trolmastercard.sexmod.f.j.valueOf(var1));
            d("LIVE stage " + var1 + " jenny=" + e + " (startSceneInPlace)");
        } catch (Throwable var14) {
            d("LIVE stage threw: " + var14);
            var14.printStackTrace();
        }
    }

    static void b() {
        Minecraft var0 = Minecraft.getInstance();
        LocalPlayer var1 = var0.player;
        if (var0.level != null && var1 != null) {
            IntegratedServer var2 = var0.getSingleplayerServer();
            if (var2 == null) {
                f = true;
            } else {
                switch (j) {
                    case 0:
                        c(var2);
                        j = 1;
                        l = 0;
                        return;
                    case 1:
                        if (!n) {
                            if (++l < 20) {
                                return;
                            }

                            a(var2);
                            n = true;
                            l = 0;
                            return;
                        } else {
                            if (++l < 20) {
                                return;
                            }

                            j = 2;
                            l = 0;
                            k = 0;
                            return;
                        }
                    case 2:
                        var2.execute(() -> a(var2, g[k]));
                        j = 3;
                        l = 0;
                        return;
                    case 3:
                        if (++l < 50) {
                            return;
                        }

                        m = 0;
                        l = 0;
                        j = 4;
                        return;
                    case 4:
                        if (l == 0) {
                            a(var0, var2, m);
                        }

                        if (++l >= 12) {
                            a(var0, "grid_" + g[k] + "_" + i[m]);
                            l = 0;
                            if (++m >= i.length) {
                                a(var0);
                                if (++k >= g.length) {
                                    f();
                                    f = true;
                                    d("GRID DONE (" + g.length + " scenes x " + i.length + " views)");
                                } else {
                                    j = 2;
                                }
                            }
                        }

                        return;
                }
            }
        }
    }

    static void a(MinecraftServer var0) {
        var0.execute(() -> {
            try {
                for (ServerPlayer var2 : var0.getPlayerList().getPlayers()) {
                    var2.setGameMode(GameType.SPECTATOR);
                    var2.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1000000, 0, false, false));
                }

                d("set SPECTATOR + night vision");
            } catch (Throwable var3) {
                d("setSpectator threw: " + var3);
            }
        });
    }

    static void a(MinecraftServer var0, String var1) {
        ServerLevel var2 = var0.overworld();
        g var3 = (g)((EntityType)com.trolmastercard.sexmod.i.b.b.get()).create(var2);
        if (var3 == null) {
            d("GRID JENNY.create null");
        } else {
            var3.setNoGravity(true);
            var3.setNoAi(true);
            var3.setPersistenceRequired();
            var3.moveTo(8.5, -60.0, 12.5, 0.0F, 0.0F);
            var3.getEntityData().set(com.trolmastercard.sexmod.f.b.k.aw, "11111111-1111-1111-1111-111111111111");
            var3.getEntityData().set(com.trolmastercard.sexmod.f.b.k.at, 0);
            var2.addFreshEntity(var3);
            j var4 = com.trolmastercard.sexmod.f.j.valueOf(var1);
            var3.c(var4);
            var3.getEntityData().set(com.trolmastercard.sexmod.f.b.k.au, var1);
            e = var3.getId();
            d("GRID stage " + var1 + " id=" + e);
        }
    }

    static void a(Minecraft var0, MinecraftServer var1, int var2) {
        ClientLevel var3 = var0.level;
        if (e != -1 && var3 != null) {
            double var4 = 8.5;
            double var6 = -60.0;
            double var8 = 12.5;
            float var10 = 0.0F;
            Entity var11 = var3.getEntity(e);
            if (var11 != null) {
                var4 = var11.getX();
                var6 = var11.getY();
                var8 = var11.getZ();
                var10 = var11.getYRot();
                var11.setYRot(var10);
                var11.yRotO = var10;
                if (var11 instanceof LivingEntity var12) {
                    var12.setYBodyRot(var10);
                    var12.setYHeadRot(var10);
                    var12.yBodyRotO = var10;
                    var12.yHeadRotO = var10;
                }
            }

            double var39 = Math.toRadians(var10);
            double var14 = -Math.sin(var39);
            double var16 = Math.cos(var39);
            double var18 = Math.cos(var39);
            double var20 = Math.sin(var39);
            double[] var22 = h[var2];
            double var23 = var4 + var14 * var22[0] + var18 * var22[2];
            double var25 = var6 + var22[1];
            double var27 = var8 + var16 * var22[0] + var20 * var22[2];
            double var29 = var4 - var23;
            double var31 = var6 + 0.9 - (var25 + 1.62);
            double var33 = var8 - var27;
            double var35 = Math.sqrt(var29 * var29 + var33 * var33);
            float var37 = (float)Math.toDegrees(Math.atan2(-var29, var33));
            float var38 = (float)(-Math.toDegrees(Math.atan2(var31, var35)));
            var1.execute(() -> {
                for (ServerPlayer var10x : var1.getPlayerList().getPlayers()) {
                    var10x.connection.teleport(var23, var25, var27, var37, var38);
                }
            });
            d("GRID view " + i[var2] + " cam=" + a(var23) + "," + a(var25) + "," + a(var27));
        }
    }

    static void c() {
        Minecraft var0 = Minecraft.getInstance();
        LocalPlayer var1 = var0.player;
        if (var0.level != null && var1 != null) {
            IntegratedServer var2 = var0.getSingleplayerServer();
            if (var2 == null) {
                f = true;
            } else {
                if (o == null) {
                    String var3 = e();
                    int var4 = var3.indexOf(58);
                    if (var4 < 0) {
                        d("TARGET bad marker (need ENTITY:SCENE) got=\"" + var3 + "\"");
                        f();
                        f = true;
                        return;
                    }

                    o = var3.substring(0, var4).trim().toUpperCase();
                    p = var3.substring(var4 + 1).trim().toUpperCase();
                    d("TARGET entity=" + o + " scene=" + p);
                }

                switch (q) {
                    case 0:
                        c(var2);
                        q = 1;
                        r = 0;
                        return;
                    case 1:
                        if (!t) {
                            if (++r < 20) {
                                return;
                            }

                            a(var2);
                            t = true;
                            r = 0;
                            return;
                        } else {
                            if (++r < 20) {
                                return;
                            }

                            q = 2;
                            r = 0;
                            return;
                        }
                    case 2:
                        var2.execute(() -> a(var2, o, p));
                        q = 3;
                        r = 0;
                        return;
                    case 3:
                        if (++r < 50) {
                            return;
                        } else {
                            if (e == -1) {
                                d("TARGET spawn failed for " + o + " \u2014 aborting");
                                f();
                                f = true;
                                return;
                            }

                            b(var2, o + ":" + p);
                            s = 0;
                            r = 0;
                            q = 4;
                            return;
                        }
                    case 4:
                        if (r == 0) {
                            a(var0, var2, s);
                        }

                        if (++r >= 12) {
                            a(var0, "grid_" + o + "_" + p + "_" + i[s]);
                            r = 0;
                            if (++s >= i.length) {
                                a(var0);
                                f();
                                f = true;
                                d("TARGET DONE " + o + ":" + p + " (" + i.length + " views)");
                            }
                        }

                        return;
                }
            }
        }
    }

    static void d() {
        Minecraft var0 = Minecraft.getInstance();
        LocalPlayer var1 = var0.player;
        if (var0.level != null && var1 != null) {
            IntegratedServer var2 = var0.getSingleplayerServer();
            Object var3 = var2 != null ? var2 : ServerLifecycleHooks.getCurrentServer();
            if (!z) {
                b(
                    "HOLD firing; player="
                        + (var1 != null)
                        + " sp="
                        + (var2 != null)
                        + " lifecycle="
                        + (ServerLifecycleHooks.getCurrentServer() != null)
                        + " serverPicked="
                        + (var3 != null)
                );
                z = true;
            }

            if (var3 == null) {
                b("HOLD bail: server==null");
            } else if (!x) {
                if (++w >= 20) {
                    c((MinecraftServer)var3);
                    b((MinecraftServer)var3);
                    x = true;
                    w = 0;
                }
            } else {
                String var4 = c("capture.hold");
                if (var4.isEmpty() || var4.equalsIgnoreCase("DONE")) {
                    a(var0);
                    f();
                    f = true;
                    b("HOLD DONE");
                } else if (!var4.equalsIgnoreCase(u)) {
                    String[] var5 = var4.split(":");
                    if (var5.length < 2) {
                        b("HOLD bad spec (need ENTITY:SCENE[:VIEW]) got=\"" + var4 + "\"");
                        u = var4;
                    } else {
                        String var6 = var5[0].trim().toUpperCase();
                        String var7 = var5[1].trim().toUpperCase();
                        String var8 = var5.length >= 3 ? var5[2].trim().toUpperCase() : "FRONT";
                        String var9 = var6 + ":" + var7;
                        double var10 = var1.getX();
                        double var12 = var1.getY();
                        double var14 = var1.getZ();
                        float var16 = var1.getYRot();
                        if (!var9.equalsIgnoreCase(v)) {
                            a(var0);
                            v = var9;
                            b("HOLD staging " + var9 + ":" + var8 + " inFrontOf " + a(var10) + "," + a(var12) + "," + a(var14) + " yaw=" + a(var16));
                            var3.execute(() -> a(var3, var10, var12, var14, var16, var6, var7, var8));
                        } else {
                            b("HOLD rotate " + var9 + " -> " + var8);
                            var3.execute(() -> a(var3, var16, var8));
                        }

                        u = var4;
                        w = 0;
                        y = false;
                    }
                } else {
                    if (!y) {
                        if (++w < 30) {
                            return;
                        }

                        y = true;
                        b("HOLD_READY " + u + " stagedId=" + e);
                    }
                }
            }
        }
    }

    static void a(MinecraftServer var0, double var1, double var3, double var5, float var7, String var8, String var9, String var10) {
        try {
            b(var0);
            ServerLevel var11 = var0.overworld();
            k var12 = a(var8, var11);
            if (var12 == null) {
                b("holdStage: entityFor null for " + var8);
                return;
            }

            j var13;
            try {
                var13 = com.trolmastercard.sexmod.f.j.valueOf(var9);
            } catch (IllegalArgumentException var22) {
                b("holdStage: unknown scene " + var9);
                var12.discard();
                return;
            }

            var12.setNoGravity(true);
            var12.setNoAi(true);
            var12.setPersistenceRequired();
            double var14 = Math.toRadians(var7);
            double var16 = var1 + -Math.sin(var14) * 4.5;
            double var18 = var5 + Math.cos(var14) * 4.5;
            var12.moveTo(var16, var3, var18, var7 + a(var10), 0.0F);
            var12.finalizeSpawn(var11, var11.getCurrentDifficultyAt(var12.blockPosition()), MobSpawnType.MOB_SUMMONED, null);
            var12.getEntityData().set(com.trolmastercard.sexmod.f.b.k.aw, "11111111-1111-1111-1111-111111111111");
            var12.getEntityData().set(com.trolmastercard.sexmod.f.b.k.at, 0);
            var11.addFreshEntity(var12);
            var12.c(var13);
            var12.getEntityData().set(com.trolmastercard.sexmod.f.b.k.au, var9);

            for (ServerPlayer var21 : var0.getPlayerList().getPlayers()) {
                var21.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1000000, 0, false, false));
            }

            e = var12.getId();
        } catch (Throwable var23) {
            d("holdStage threw: " + var23);
        }
    }

    static void a(MinecraftServer var0, float var1, String var2) {
        try {
            if (e == -1) {
                return;
            }

            if (var0.overworld().getEntity(e) instanceof LivingEntity var4) {
                float var5 = var1 + a(var2);
                var4.setYRot(var5);
                var4.yRotO = var5;
                var4.setYBodyRot(var5);
                var4.setYHeadRot(var5);
                var4.yBodyRotO = var5;
                var4.yHeadRotO = var5;
            }
        } catch (Throwable var6) {
            d("holdRotate threw: " + var6);
        }
    }

    static float a(String var0) {
        switch (var0) {
            case "BACK":
                return 0.0F;
            case "LEFT":
                return 90.0F;
            case "RIGHT":
                return 270.0F;
            case "FRONT":
            default:
                return 180.0F;
        }
    }

    static void b(MinecraftServer var0) {
        try {
            var0.setDifficulty(Difficulty.PEACEFUL, true);

            for (ServerPlayer var2 : var0.getPlayerList().getPlayers()) {
                var2.setGameMode(GameType.CREATIVE);
                var2.setInvulnerable(true);
                var2.setHealth(var2.getMaxHealth());
                var2.setRemainingFireTicks(0);
            }

            ArrayList var5 = new ArrayList();

            for (Entity var3 : var0.overworld().getAllEntities()) {
                if (var3 instanceof Mob && !(var3 instanceof k)) {
                    var5.add(var3);
                }
            }

            for (Entity var8 : var5) {
                var8.discard();
            }
        } catch (Throwable var4) {
            b("holdProtect threw: " + var4);
        }
    }

    static void b(String var0) {
        try {
            Files.writeString(new File("portcapture_hold.txt").toPath(), var0 + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Throwable var2) {
        }
    }

    static String c(String var0) {
        try {
            return new String(Files.readAllBytes(new File(var0).toPath())).trim();
        } catch (Exception var2) {
            return "";
        }
    }

    static String e() {
        try {
            return new String(Files.readAllBytes(new File("capture.target").toPath())).trim();
        } catch (Exception var1) {
            d("readTarget failed: " + var1);
            return "";
        }
    }

    static k a(String var0, ServerLevel var1) {
        switch (var0) {
            case "JENNY":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.b.get()).create(var1);
            case "ELLIE":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.m.get()).create(var1);
            case "BIA":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.n.get()).create(var1);
            case "SLIME":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.o.get()).create(var1);
            case "BEE":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.p.get()).create(var1);
            case "ALLIE":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.q.get()).create(var1);
            case "LUNA":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.r.get()).create(var1);
            case "MANGLELIE":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.s.get()).create(var1);
            case "GALATH":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.t.get()).create(var1);
            case "KOBOLD":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.u.get()).create(var1);
            case "GOBLIN":
                return (k)((EntityType)com.trolmastercard.sexmod.i.b.v.get()).create(var1);
            default:
                d("entityFor: unknown entity \"" + var0 + "\"");
                return null;
        }
    }

    static void a(MinecraftServer var0, String var1, String var2) {
        ServerLevel var3 = var0.overworld();

        k var4;
        try {
            var4 = a(var1, var3);
        } catch (Throwable var8) {
            d("TARGET entityFor threw: " + var8);
            return;
        }

        if (var4 == null) {
            d("TARGET create null for " + var1);
        } else {
            j var5;
            try {
                var5 = com.trolmastercard.sexmod.f.j.valueOf(var2);
            } catch (IllegalArgumentException var7) {
                d("TARGET unknown scene \"" + var2 + "\" \u2014 discarding spawn");
                var4.discard();
                return;
            }

            var4.setNoGravity(true);
            var4.setNoAi(true);
            var4.setPersistenceRequired();
            var4.moveTo(8.5, -60.0, 12.5, 0.0F, 0.0F);
            var4.finalizeSpawn(var3, var3.getCurrentDifficultyAt(var4.blockPosition()), MobSpawnType.MOB_SUMMONED, null);
            var4.getEntityData().set(com.trolmastercard.sexmod.f.b.k.aw, "11111111-1111-1111-1111-111111111111");
            var4.getEntityData().set(com.trolmastercard.sexmod.f.b.k.at, 0);
            var3.addFreshEntity(var4);
            var4.c(var5);
            var4.getEntityData().set(com.trolmastercard.sexmod.f.b.k.au, var2);
            e = var4.getId();
            d("TARGET stage " + var1 + ":" + var2 + " id=" + e);
        }
    }

    static void c(MinecraftServer var0) {
        var0.execute(() -> {
            try {
                ServerLevel var1 = var0.overworld();
                int var2 = 0;

                for (Entity var4 : var1.getAllEntities()) {
                    if (var4 instanceof k) {
                        var4.discard();
                        var2++;
                    }
                }

                d("PURGE removed " + var2 + " NPCs");
            } catch (Throwable var5) {
                d("purge threw: " + var5);
            }
        });
    }

    static void a(Minecraft var0) {
        IntegratedServer var1 = var0.getSingleplayerServer();
        int var2 = e;
        if (var1 != null) {
            var1.execute(() -> {
                try {
                    Entity var2x = var1.overworld().getEntity(var2);
                    if (var2x != null) {
                        var2x.discard();
                    }
                } catch (Exception var3) {
                    d("cleanup skip: " + var3);
                }
            });
        }

        e = -1;
    }

    static void b(MinecraftServer var0, String var1) {
        var0.execute(
            () -> {
                try {
                    ServerLevel var2 = var0.overworld();
                    StringBuilder var3 = new StringBuilder("CENSUS[" + var1 + "] players=");
                    List var4 = var0.getPlayerList().getPlayers();
                    var3.append(var4.size());

                    for (ServerPlayer var6 : var4) {
                        var3.append(" P{")
                            .append(a(var6.getX()))
                            .append(",")
                            .append(a(var6.getY()))
                            .append(",")
                            .append(a(var6.getZ()))
                            .append(" gm=")
                            .append(var6.gameMode.getGameModeForPlayer())
                            .append("}");
                    }

                    int var10 = 0;

                    for (Entity var7 : var2.getAllEntities()) {
                        if (var7 instanceof k var8) {
                            var10++;
                            var3.append(" N{id=")
                                .append(var8.getId())
                                .append(" @")
                                .append(a(var8.getX()))
                                .append(",")
                                .append(a(var8.getZ()))
                                .append(" D=")
                                .append(var8.getEntityData().get(com.trolmastercard.sexmod.f.b.k.at))
                                .append(" J=")
                                .append((String)var8.getEntityData().get(com.trolmastercard.sexmod.f.b.k.au))
                                .append(" bound=")
                                .append((String)var8.getEntityData().get(com.trolmastercard.sexmod.f.b.k.aw))
                                .append("}");
                        }
                    }

                    var3.append(" NPCcount=").append(var10);
                    d(var3.toString());
                } catch (Throwable var9) {
                    d("census threw: " + var9);
                }
            }
        );
    }

    static void a(Minecraft var0, String var1) {
        d("SHOT " + var1);
    }

    static void f() {
        try {
            new File("capture.done").createNewFile();
        } catch (Exception var1) {
            d("writeDone failed: " + var1);
        }
    }

    static String a(double var0) {
        return String.format("%.1f", var0);
    }

    static void d(String var0) {
        System.out.println("[PORTCAPTURE] " + var0);
    }
}
