package com.trolmastercard.sexmod;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.ClientConnectedToServerEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.ClientDisconnectionFromServerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;
import software.bernie.geckolib3.geo.raw.pojo.Converter;
import software.bernie.geckolib3.geo.raw.pojo.RawGeoModel;
import software.bernie.geckolib3.geo.raw.tree.RawGeometryTree;
import software.bernie.geckolib3.geo.render.GeoBuilder;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.resource.GeckoLibCache;

public class br {
    public static final String a = "sexmod/custom_models";
    static final String b = "sexmod/custom_models/whitelisted_servers.txt";
    public static final String f = "sexmod_custom_models";
    static Map<String, br.b> c = new HashMap<>();
    public static boolean d = false;
    public static boolean e = false;

    public static Map<String, br.b> i() {
        return c;
    }

    public static boolean f(String var0) {
        try {
            if (c.get(var0) != null) {
                return true;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return false;
    }

    public static int b(boolean var0) {
        a(var0);
        return c(var0);
    }

    static void b(Level var0, String var1) {
        try {
            if (Main.proxy instanceof ClientProxy) {
                a(var0, var1);
                return;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        Main.LOGGER.log(var0, var1);
    }

    public static void a(boolean var0) {
        try {
            if (var0) {
                c();
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        c.clear();
    }

    public static void a() {
        ge.b.sendToServer(new g6());
    }

    @SideOnly(Side.CLIENT)
    public static boolean b() {
        String var0 = g();

        try {
            if (var0 == null) {
                return false;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return l(var0);
    }

    public static void h(String var0) {
        File var1 = new File("sexmod/custom_models/whitelisted_servers.txt");
        var1.mkdirs();
        HashSet var2 = new HashSet();
        if (var1.exists()) {
            var2 = f();
        }

        var2.add(var0);
        var1.delete();
        var1 = new File("sexmod/custom_models/whitelisted_servers.txt");

        try {
            FileWriter var3 = new FileWriter(var1);
            Throwable var4 = null;

            try {
                for (String var6 : var2) {
                    var3.write(var6 + "\n");
                }
            } catch (Throwable var18) {
                var4 = var18;
                throw var18;
            } finally {
                label90: {
                    label89: {
                        try {
                            if (var3 == null) {
                                break label90;
                            }

                            if (var4 == null) {
                                break label89;
                            }
                        } catch (Throwable var17) {
                            throw a(var17);
                        }

                        try {
                            var3.close();
                        } catch (Throwable var16) {
                            var4.addSuppressed(var16);
                        }
                        break label90;
                    }

                    var3.close();
                }
            }
        } catch (IOException var20) {
            var20.printStackTrace();
        }
    }

    public static boolean l(String var0) {
        return f().contains(var0);
    }

    static HashSet<String> f() {
        File var0 = new File("sexmod/custom_models/whitelisted_servers.txt");

        try {
            var0.createNewFile();
        } catch (Exception var17) {
            var17.printStackTrace();
        }

        HashSet var1 = new HashSet();

        try {
            BufferedReader var2 = new BufferedReader(new FileReader(var0));
            Throwable var3 = null;

            try {
                while (true) {
                    String var4;
                    String var10000 = var4 = var2.readLine();

                    try {
                        if (var10000 == null) {
                            return var1;
                        }

                        var1.add(var4);
                    } catch (Exception var19) {
                        throw a(var19);
                    }
                }
            } catch (Throwable var20) {
                var3 = var20;
                throw var20;
            } finally {
                label100: {
                    label99: {
                        try {
                            if (var2 == null) {
                                break label100;
                            }

                            if (var3 == null) {
                                break label99;
                            }
                        } catch (Exception var18) {
                            throw a(var18);
                        }

                        try {
                            var2.close();
                        } catch (Throwable var16) {
                            var3.addSuppressed(var16);
                        }
                        break label100;
                    }

                    var2.close();
                }
            }
        } catch (IOException var22) {
            var22.printStackTrace();
            return new HashSet<>();
        }
    }

    public static float i(String var0) {
        br.b var1 = c.get(var0);

        try {
            if (var1 == null) {
                return 0.0F;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        return var1.f();
    }

    @SideOnly(Side.CLIENT)
    static void c() {
        for (Entry var1 : c.entrySet()) {
            br.b var2 = (br.b)var1.getValue();

            try {
                if (var2 == null) {
                    continue;
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }

            ResourceLocation var3 = var2.c();
            ResourceLocation var4 = var2.k();

            try {
                if (var3 != null) {
                    GeckoLibCache.getInstance().getGeoModels().remove(var3);
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            try {
                if (var4 != null) {
                    Minecraft.func_71410_x().field_71446_o.func_147645_c(var4);
                }
            } catch (RuntimeException var5) {
                throw a(var5);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    static void a(Level var0, String var1) {
        EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;

        try {
            if (var2 == null) {
                Main.LOGGER.log(var0, var1);
                return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        TextFormatting var3;
        if (Level.DEBUG.equals(var0)) {
            var3 = TextFormatting.DARK_GREEN;
        } else if (Level.ERROR.equals(var0)) {
            var3 = TextFormatting.RED;
        } else {
            var3 = TextFormatting.WHITE;
        }

        var2.func_145747_a(new TextComponentString(var3.toString() + var1));
    }

    public static String h() {
        try {
            return Main.proxy instanceof ClientProxy ? d() : "sexmod_custom_models";
        } catch (RuntimeException var0) {
            throw a(var0);
        }
    }

    @SideOnly(Side.CLIENT)
    public static String d() {
        String var0 = g();

        try {
            if (var0 == null) {
                return "sexmod/custom_models/singleplayer";
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return "sexmod/custom_models/" + var0;
    }

    @SideOnly(Side.CLIENT)
    @Nullable
    public static String g() {
        Minecraft var0 = Minecraft.func_71410_x();
        ServerData var1 = var0.func_147104_D();

        try {
            if (var1 == null) {
                return null;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        String var2 = var1.field_78845_b;
        int var3 = var2.indexOf(":");
        if (var3 != -1) {
            var2 = var2.substring(0, var3);
        }

        return var2;
    }

    public static int c(boolean var0) {
        b(Level.INFO, "loading up custom models...");
        String var1 = h();
        File var2 = new File(var1);
        var2.mkdirs();
        String[] var3 = var2.list((var0x, var1x) -> new File(var0x, var1x).isDirectory());

        try {
            if (var3 == null) {
                b(
                    Level.ERROR,
                    String.format(
                        "Something is wrong with the custom models folder at '%s'. Check if it exists, if not - make the directory yourself because Minecraft cannot do it itself for some reason",
                        var2.getAbsolutePath()
                    )
                );
                return -1;
            }
        } catch (RuntimeException var12) {
            throw a(var12);
        }

        b(Level.INFO, String.format("found %s custom model(s)", var3.length));
        int var4 = 0;

        for (String var8 : var3) {
            String var9 = a(var8, var1);

            try {
                if (!"".equals(var9)) {
                    b(Level.ERROR, var9);
                    return -1;
                }
            } catch (RuntimeException var11) {
                throw a(var11);
            }

            var9 = a(var8, var1, var0);

            try {
                if (!"".equals(var9)) {
                    b(Level.ERROR, var9);
                    return -1;
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            var4++;
        }

        b(Level.DEBUG, String.format("successfully registered %s custom models", var4));
        e = true;
        return 0;
    }

    public static String a(String var0, String var1) {
        String var2 = String.format("%s/%s", var1, var0);
        File var3 = new File(String.format("%s/%s.geo.json", var2, var0));
        File var4 = new File(String.format("%s/%s.png", var2, var0));
        File var5 = new File(String.format("%s/%s.cfg", var2, var0));

        try {
            if (!var3.exists()) {
                return String.format("couldn't find model File for '%s'. It should have been at '%s'. Are you sure it exists?", var0, var3.getAbsolutePath());
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (!var4.exists()) {
                return String.format("couldn't find texture File for '%s'. It should have been at '%s'. Are you sure it exists?", var0, var4.getAbsolutePath());
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        try {
            return !var5.exists()
                ? String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", var0, var5.getAbsolutePath())
                : "";
        } catch (RuntimeException var6) {
            throw a(var6);
        }
    }

    @SideOnly(Side.CLIENT)
    static ResourceLocation a(String var0, File var1) throws Exception {
        BufferedImage var2 = ImageIO.read(var1);
        return Minecraft.func_71410_x().field_71446_o.func_110578_a(var0, new DynamicTexture(var2));
    }

    @SideOnly(Side.CLIENT)
    static RawGeoModel a(File var0) throws IOException {
        StringBuilder var1 = new StringBuilder();
        BufferedReader var2 = new BufferedReader(new FileReader(var0));
        Throwable var3 = null;

        try {
            while (true) {
                String var4;
                String var10000 = var4 = var2.readLine();

                try {
                    if (var10000 == null) {
                        break;
                    }

                    var1.append(var4);
                } catch (Throwable var16) {
                    throw a(var16);
                }
            }
        } catch (Throwable var17) {
            var3 = var17;
            throw var17;
        } finally {
            label82: {
                label81: {
                    try {
                        if (var2 == null) {
                            break label82;
                        }

                        if (var3 == null) {
                            break label81;
                        }
                    } catch (Throwable var15) {
                        throw a(var15);
                    }

                    try {
                        var2.close();
                    } catch (Throwable var14) {
                        var3.addSuppressed(var14);
                    }
                    break label82;
                }

                var2.close();
            }
        }

        String var19 = var1.toString();
        return Converter.fromJsonString(var19);
    }

    public static String a(String var0, String var1, boolean var2) {
        try {
            if (c.get(var0) != null) {
                return String.format("already registered '%s'... honestly, unsure how this could happen lol", var0);
            }
        } catch (IOException var25) {
            throw a(var25);
        }

        String var3 = String.format("%s/%s/", var1, var0);
        String var4 = var3 + var0 + ".cfg";
        File var5 = new File(var4);

        try {
            if (!var5.exists()) {
                return String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", var0, var4);
            }
        } catch (IOException var24) {
            throw a(var24);
        }

        br.b var6 = new br.b(var5, var0);

        try {
            if (var6.h != null) {
                return var6.h;
            }
        } catch (IOException var23) {
            throw a(var23);
        }

        String var8 = var3 + var0 + ".png";
        File var7 = new File(var8);

        try {
            if (!var7.exists()) {
                return String.format("The texture for the custom model '%s' couldn't be found at '%s' are you sure it exists?", var0, var8);
            }
        } catch (IOException var20) {
            throw a(var20);
        }

        ResourceLocation var9 = null;
        if (var2) {
            try {
                var9 = a(var0, var7);
            } catch (IOException var18) {
                return String.format("The texture for the custom model '%s' at '%s' appears to be corrupted. Try making a new one", var0, var8);
            } catch (Exception var19) {
                return String.format(
                    "Couldn't load the texture for the custom model '%s' at '%s'. Maybe try increasing the amount of RAM of ur Minecraft client", var0, var7
                );
            }
        }

        ResourceLocation var10 = new ResourceLocation("sexmod", var0 + "Model");
        String var12 = var3 + var0 + ".geo.json";
        File var13 = new File(var12);

        try {
            if (!var13.exists()) {
                return String.format("The geo model for the custom model '%s' couldn't be found at '%s' are you sure it exists?", var0, var12);
            }
        } catch (IOException var22) {
            throw a(var22);
        }

        if (var2) {
            RawGeoModel var11;
            try {
                var11 = a(var13);
            } catch (IOException var17) {
                return String.format("The geo model for the custom model '%s' at '%s' appears to be corrupted. Try replacing it.", var0, var12);
            }

            try {
                RawGeometryTree var14 = RawGeometryTree.parseHierarchy(var11, var10);
                GeoModel var15 = GeoBuilder.getGeoBuilder(var10.func_110624_b()).constructGeoModel(var14);
                GeckoLibCache.getInstance().getGeoModels().put(var10, var15);
            } catch (Exception var16) {
                return String.format("The geo model for the custom model '%s' at '%s' appears to be corrupted. Try replacing it.", var0, var12);
            }
        }

        try {
            if (var2) {
                var6.b(var10);
                var6.a(var9);
            }
        } catch (IOException var21) {
            throw a(var21);
        }

        c.put(var0, var6);
        b(Level.DEBUG, String.format("successfully registered custom model '%s'", var0));
        return "";
    }

    public static ResourceLocation k(String param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/br.c Ljava/util/Map;
        // 03: aload 0
        // 04: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
        // 09: checkcast com/trolmastercard/sexmod/br$b
        // 0c: astore 1
        // 0d: aload 1
        // 0e: ifnonnull 3b
        // 11: aload 0
        // 12: ldc "cross"
        // 14: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 17: ifne 39
        // 1a: goto 21
        // 1d: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 20: athrow
        // 21: getstatic java/lang/System.out Ljava/io/PrintStream;
        // 24: ldc "The custom model for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n"
        // 26: bipush 1
        // 27: anewarray 42
        // 2a: dup
        // 2b: bipush 0
        // 2c: aload 0
        // 2d: aastore
        // 2e: invokevirtual java/io/PrintStream.printf (Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
        // 31: pop
        // 32: goto 39
        // 35: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 38: athrow
        // 39: aconst_null
        // 3a: areturn
        // 3b: aload 1
        // 3c: invokevirtual com/trolmastercard/sexmod/br$b.c ()Lnet/minecraft/util/ResourceLocation;
        // 3f: areturn
        // try (5 -> 11): 12 java/lang/RuntimeException
        // try (7 -> 24): 25 java/lang/RuntimeException
    }

    public static ResourceLocation c(String param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/br.c Ljava/util/Map;
        // 03: aload 0
        // 04: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
        // 09: checkcast com/trolmastercard/sexmod/br$b
        // 0c: astore 1
        // 0d: aload 1
        // 0e: ifnonnull 3b
        // 11: aload 0
        // 12: ldc "cross"
        // 14: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 17: ifne 39
        // 1a: goto 21
        // 1d: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 20: athrow
        // 21: getstatic java/lang/System.out Ljava/io/PrintStream;
        // 24: ldc "The custom texture for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n"
        // 26: bipush 1
        // 27: anewarray 42
        // 2a: dup
        // 2b: bipush 0
        // 2c: aload 0
        // 2d: aastore
        // 2e: invokevirtual java/io/PrintStream.printf (Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
        // 31: pop
        // 32: goto 39
        // 35: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 38: athrow
        // 39: aconst_null
        // 3a: areturn
        // 3b: aload 1
        // 3c: invokevirtual com/trolmastercard/sexmod/br$b.k ()Lnet/minecraft/util/ResourceLocation;
        // 3f: areturn
        // try (5 -> 11): 12 java/lang/RuntimeException
        // try (7 -> 24): 25 java/lang/RuntimeException
    }

    public static GeoModel j(String var0) {
        return GeckoLibCache.getInstance().getGeoModels().get(k(var0));
    }

    public static gw e(String param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/br.c Ljava/util/Map;
        // 03: aload 0
        // 04: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
        // 09: checkcast com/trolmastercard/sexmod/br$b
        // 0c: astore 1
        // 0d: aload 1
        // 0e: ifnonnull 3d
        // 11: aload 0
        // 12: ldc "cross"
        // 14: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 17: ifne 39
        // 1a: goto 21
        // 1d: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 20: athrow
        // 21: getstatic java/lang/System.out Ljava/io/PrintStream;
        // 24: ldc "The ClothingType for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n"
        // 26: bipush 1
        // 27: anewarray 42
        // 2a: dup
        // 2b: bipush 0
        // 2c: aload 0
        // 2d: aastore
        // 2e: invokevirtual java/io/PrintStream.printf (Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
        // 31: pop
        // 32: goto 39
        // 35: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 38: athrow
        // 39: getstatic com/trolmastercard/sexmod/gw.HEAD Lcom/trolmastercard/sexmod/gw;
        // 3c: areturn
        // 3d: aload 1
        // 3e: getfield com/trolmastercard/sexmod/br$b.d Lcom/trolmastercard/sexmod/gw;
        // 41: areturn
        // try (5 -> 11): 12 java/lang/RuntimeException
        // try (7 -> 24): 25 java/lang/RuntimeException
    }

    public static HashSet<fy> a(String param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/br.c Ljava/util/Map;
        // 03: aload 0
        // 04: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
        // 09: checkcast com/trolmastercard/sexmod/br$b
        // 0c: astore 1
        // 0d: aload 1
        // 0e: ifnonnull 3b
        // 11: aload 0
        // 12: ldc "cross"
        // 14: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 17: ifne 39
        // 1a: goto 21
        // 1d: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 20: athrow
        // 21: getstatic java/lang/System.out Ljava/io/PrintStream;
        // 24: ldc "The HashSet<GirlType> for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n"
        // 26: bipush 1
        // 27: anewarray 42
        // 2a: dup
        // 2b: bipush 0
        // 2c: aload 0
        // 2d: aastore
        // 2e: invokevirtual java/io/PrintStream.printf (Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
        // 31: pop
        // 32: goto 39
        // 35: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 38: athrow
        // 39: aconst_null
        // 3a: areturn
        // 3b: aload 1
        // 3c: getfield com/trolmastercard/sexmod/br$b.g Ljava/util/HashSet;
        // 3f: areturn
        // try (5 -> 11): 12 java/lang/RuntimeException
        // try (7 -> 24): 25 java/lang/RuntimeException
    }

    public static HashSet<String> g(String param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/br.c Ljava/util/Map;
        // 03: aload 0
        // 04: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
        // 09: checkcast com/trolmastercard/sexmod/br$b
        // 0c: astore 1
        // 0d: aload 1
        // 0e: ifnonnull 41
        // 11: aload 0
        // 12: ldc "cross"
        // 14: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 17: ifne 39
        // 1a: goto 21
        // 1d: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 20: athrow
        // 21: getstatic java/lang/System.out Ljava/io/PrintStream;
        // 24: ldc "The HashSet<String> for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n"
        // 26: bipush 1
        // 27: anewarray 42
        // 2a: dup
        // 2b: bipush 0
        // 2c: aload 0
        // 2d: aastore
        // 2e: invokevirtual java/io/PrintStream.printf (Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
        // 31: pop
        // 32: goto 39
        // 35: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 38: athrow
        // 39: new java/util/HashSet
        // 3c: dup
        // 3d: invokespecial java/util/HashSet.<init> ()V
        // 40: areturn
        // 41: aload 1
        // 42: getfield com/trolmastercard/sexmod/br$b.b Ljava/util/HashSet;
        // 45: areturn
        // try (5 -> 11): 12 java/lang/RuntimeException
        // try (7 -> 24): 25 java/lang/RuntimeException
    }

    public static String d(String param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/br.c Ljava/util/Map;
        // 03: aload 0
        // 04: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
        // 09: checkcast com/trolmastercard/sexmod/br$b
        // 0c: astore 1
        // 0d: aload 1
        // 0e: ifnonnull 3c
        // 11: aload 0
        // 12: ldc "cross"
        // 14: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 17: ifne 39
        // 1a: goto 21
        // 1d: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 20: athrow
        // 21: getstatic java/lang/System.out Ljava/io/PrintStream;
        // 24: ldc "The author for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n"
        // 26: bipush 1
        // 27: anewarray 42
        // 2a: dup
        // 2b: bipush 0
        // 2c: aload 0
        // 2d: aastore
        // 2e: invokevirtual java/io/PrintStream.printf (Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
        // 31: pop
        // 32: goto 39
        // 35: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 38: athrow
        // 39: ldc ""
        // 3b: areturn
        // 3c: aload 1
        // 3d: getfield com/trolmastercard/sexmod/br$b.k Ljava/lang/String;
        // 40: areturn
        // try (5 -> 11): 12 java/lang/RuntimeException
        // try (7 -> 24): 25 java/lang/RuntimeException
    }

    @Nullable
    public static br.b b(String var0) {
        return c.get(var0);
    }

    public static HashMap<gw, List<String>> a(em param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: new java/util/HashMap
        // 03: dup
        // 04: invokespecial java/util/HashMap.<init> ()V
        // 07: astore 1
        // 08: invokestatic com/trolmastercard/sexmod/gw.values ()[Lcom/trolmastercard/sexmod/gw;
        // 0b: astore 2
        // 0c: aload 2
        // 0d: arraylength
        // 0e: istore 3
        // 0f: bipush 0
        // 10: istore 4
        // 12: iload 4
        // 14: iload 3
        // 15: if_icmpge 32
        // 18: aload 2
        // 19: iload 4
        // 1b: aaload
        // 1c: astore 5
        // 1e: aload 1
        // 1f: aload 5
        // 21: new java/util/ArrayList
        // 24: dup
        // 25: invokespecial java/util/ArrayList.<init> ()V
        // 28: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // 2b: pop
        // 2c: iinc 4 1
        // 2f: goto 12
        // 32: getstatic com/trolmastercard/sexmod/br.c Ljava/util/Map;
        // 35: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
        // 3a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
        // 3f: astore 2
        // 40: aload 2
        // 41: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 46: ifeq b9
        // 49: aload 2
        // 4a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 4f: checkcast java/util/Map$Entry
        // 52: astore 3
        // 53: aload 3
        // 54: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
        // 59: checkcast java/lang/String
        // 5c: astore 4
        // 5e: aload 3
        // 5f: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
        // 64: checkcast com/trolmastercard/sexmod/br$b
        // 67: astore 5
        // 69: aload 5
        // 6b: getfield com/trolmastercard/sexmod/br$b.d Lcom/trolmastercard/sexmod/gw;
        // 6e: astore 6
        // 70: aload 1
        // 71: aload 6
        // 73: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
        // 76: checkcast java/util/List
        // 79: astore 7
        // 7b: aload 5
        // 7d: getfield com/trolmastercard/sexmod/br$b.g Ljava/util/HashSet;
        // 80: invokevirtual java/util/HashSet.isEmpty ()Z
        // 83: ifne a3
        // 86: aload 5
        // 88: getfield com/trolmastercard/sexmod/br$b.g Ljava/util/HashSet;
        // 8b: aload 0
        // 8c: invokestatic com/trolmastercard/sexmod/fy.a (Lnet/minecraft/entity/Entity;)Lcom/trolmastercard/sexmod/fy;
        // 8f: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 92: ifne a3
        // 95: goto 9c
        // 98: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // 9b: athrow
        // 9c: goto 40
        // 9f: invokestatic com/trolmastercard/sexmod/br.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
        // a2: athrow
        // a3: aload 7
        // a5: aload 4
        // a7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
        // ac: pop
        // ad: aload 1
        // ae: aload 6
        // b0: aload 7
        // b2: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // b5: pop
        // b6: goto 40
        // b9: aload 1
        // ba: areturn
        // try (54 -> 64): 65 java/lang/RuntimeException
        // try (58 -> 68): 68 java/lang/RuntimeException
    }

    public static HashMap<String, Float> e() {
        HashMap var0 = new HashMap();

        for (Entry var2 : i().entrySet()) {
            var0.put(var2.getKey(), ((br.b)var2.getValue()).f());
        }

        return var0;
    }

    private static Throwable a(Throwable var0) {
        return var0;
    }

    @SideOnly(Side.CLIENT)
    public static class a {
        boolean a = false;

        @SideOnly(Side.CLIENT)
        @SubscribeEvent
        public void a(ClientChatEvent var1) {
            String var2 = var1.getOriginalMessage();

            try {
                if (!"id".equals(var2)) {
                    return;
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }

            EntityPlayerSP var3 = Minecraft.func_71410_x().field_71439_g;
            List var4 = var3.field_70170_p.func_72872_a(em.class, var3.func_174813_aQ().func_186662_g(10.0));
            em var5 = null;

            for (em var7 : var4) {
                if (var5 == null) {
                    var5 = var7;
                } else if (var3.func_70032_d(var7) < var3.func_70032_d(var5)) {
                    var5 = var7;
                }
            }

            try {
                if (var5 == null) {
                    return;
                }
            } catch (RuntimeException var8) {
                throw a(var8);
            }

            var3.func_146105_b(new TextComponentString(var5.f().toString()), false);
            var1.setCanceled(true);
        }

        @SideOnly(Side.CLIENT)
        @SubscribeEvent
        public void a(ClientConnectedToServerEvent var1) {
            Minecraft var2 = Minecraft.func_71410_x();
            var2.func_152343_a(() -> br.c(true));
            this.a = false;
        }

        @SideOnly(Side.CLIENT)
        @SubscribeEvent
        public void a(EntityJoinWorldEvent var1) {
            try {
                if (!var1.getEntity().equals(Minecraft.func_71410_x().field_71439_g)) {
                    return;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            try {
                if (this.a) {
                    return;
                }
            } catch (RuntimeException var4) {
                throw a(var4);
            }

            try {
                this.a = true;
                if (br.b()) {
                    br.a();
                }
            } catch (RuntimeException var2) {
                throw a(var2);
            }
        }

        @SideOnly(Side.CLIENT)
        @SubscribeEvent
        public void a(ClientDisconnectionFromServerEvent var1) {
            Minecraft.func_71410_x().func_152344_a(() -> br.a(true));
            this.a = false;
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }

    public static class b {
        gw d;
        HashSet<fy> g;
        HashSet<String> b;
        String k;
        String j;
        boolean c;
        c8 e;
        float m;
        float a;
        ResourceLocation i;
        ResourceLocation f;
        public String h;
        float l;

        public b(File param1, String param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 000: aload 0
            // 001: invokespecial java/lang/Object.<init> ()V
            // 004: aload 0
            // 005: new java/util/HashSet
            // 008: dup
            // 009: invokespecial java/util/HashSet.<init> ()V
            // 00c: putfield com/trolmastercard/sexmod/br$b.g Ljava/util/HashSet;
            // 00f: aload 0
            // 010: new java/util/HashSet
            // 013: dup
            // 014: invokespecial java/util/HashSet.<init> ()V
            // 017: putfield com/trolmastercard/sexmod/br$b.b Ljava/util/HashSet;
            // 01a: aload 0
            // 01b: fconst_1
            // 01c: putfield com/trolmastercard/sexmod/br$b.m F
            // 01f: aload 0
            // 020: fconst_0
            // 021: putfield com/trolmastercard/sexmod/br$b.a F
            // 024: aload 0
            // 025: aconst_null
            // 026: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 029: aload 2
            // 02a: ldc " "
            // 02c: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
            // 02f: ifne 04b
            // 032: aload 2
            // 033: ldc "#"
            // 035: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
            // 038: ifne 04b
            // 03b: aload 2
            // 03c: ldc "$"
            // 03e: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
            // 041: ifeq 061
            // 044: goto 04b
            // 047: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 04a: athrow
            // 04b: aload 0
            // 04c: ldc "You cannot call your custom model '%s'. '#', '$' and spaces are illegal characters"
            // 04e: bipush 1
            // 04f: anewarray 36
            // 052: dup
            // 053: bipush 0
            // 054: aload 2
            // 055: aastore
            // 056: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 059: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 05c: return
            // 05d: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 060: athrow
            // 061: ldc "cross"
            // 063: aload 2
            // 064: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
            // 067: ifeq 075
            // 06a: aload 0
            // 06b: ldc "You cannot call your custom model 'cross'. Im sorry, but I need that specific name for internal stuff"
            // 06d: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 070: return
            // 071: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 074: athrow
            // 075: new java/util/Properties
            // 078: dup
            // 079: invokespecial java/util/Properties.<init> ()V
            // 07c: astore 3
            // 07d: new java/io/FileInputStream
            // 080: dup
            // 081: aload 1
            // 082: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
            // 085: astore 4
            // 087: goto 0a5
            // 08a: astore 5
            // 08c: aload 0
            // 08d: ldc "couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?"
            // 08f: bipush 2
            // 090: anewarray 36
            // 093: dup
            // 094: bipush 0
            // 095: aload 2
            // 096: aastore
            // 097: dup
            // 098: bipush 1
            // 099: aload 1
            // 09a: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 09d: aastore
            // 09e: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 0a1: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 0a4: return
            // 0a5: aload 3
            // 0a6: aload 4
            // 0a8: invokevirtual java/util/Properties.load (Ljava/io/InputStream;)V
            // 0ab: goto 0c9
            // 0ae: astore 5
            // 0b0: aload 0
            // 0b1: ldc "couldn't read the cfg File for '%s' at '%s'. It appears to be corrupted. Try making a new one"
            // 0b3: bipush 2
            // 0b4: anewarray 36
            // 0b7: dup
            // 0b8: bipush 0
            // 0b9: aload 2
            // 0ba: aastore
            // 0bb: dup
            // 0bc: bipush 1
            // 0bd: aload 1
            // 0be: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 0c1: aastore
            // 0c2: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 0c5: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 0c8: return
            // 0c9: aload 3
            // 0ca: ldc "wear_type"
            // 0cc: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 0cf: astore 5
            // 0d1: aload 5
            // 0d3: ifnonnull 0f3
            // 0d6: aload 0
            // 0d7: ldc "The cfg File for the model '%s' at '%s' is missing the 'wear_type'. Go to the bottom of the cfg File and write 'wear_type=HEAD'. Check the cfg files of my examples to see what values for 'wear_type' are possible"
            // 0d9: bipush 2
            // 0da: anewarray 36
            // 0dd: dup
            // 0de: bipush 0
            // 0df: aload 2
            // 0e0: aastore
            // 0e1: dup
            // 0e2: bipush 1
            // 0e3: aload 1
            // 0e4: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 0e7: aastore
            // 0e8: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 0eb: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 0ee: return
            // 0ef: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 0f2: athrow
            // 0f3: aload 5
            // 0f5: ldc " "
            // 0f7: ldc ""
            // 0f9: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 0fc: astore 5
            // 0fe: aload 0
            // 0ff: aload 5
            // 101: invokestatic com/trolmastercard/sexmod/gw.valueOf (Ljava/lang/String;)Lcom/trolmastercard/sexmod/gw;
            // 104: putfield com/trolmastercard/sexmod/br$b.d Lcom/trolmastercard/sexmod/gw;
            // 107: goto 12a
            // 10a: astore 6
            // 10c: aload 0
            // 10d: ldc "you entered '%s' into the 'wear_type' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'wear_type"
            // 10f: bipush 3
            // 110: anewarray 36
            // 113: dup
            // 114: bipush 0
            // 115: aload 5
            // 117: aastore
            // 118: dup
            // 119: bipush 1
            // 11a: aload 2
            // 11b: aastore
            // 11c: dup
            // 11d: bipush 2
            // 11e: aload 1
            // 11f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 122: aastore
            // 123: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 126: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 129: return
            // 12a: getstatic com/trolmastercard/sexmod/gw.CUSTOM_BONE Lcom/trolmastercard/sexmod/gw;
            // 12d: aload 0
            // 12e: getfield com/trolmastercard/sexmod/br$b.d Lcom/trolmastercard/sexmod/gw;
            // 131: invokevirtual com/trolmastercard/sexmod/gw.equals (Ljava/lang/Object;)Z
            // 134: ifeq 171
            // 137: aload 0
            // 138: aload 3
            // 139: ldc "custom_bone"
            // 13b: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 13e: putfield com/trolmastercard/sexmod/br$b.j Ljava/lang/String;
            // 141: ldc ""
            // 143: aload 0
            // 144: getfield com/trolmastercard/sexmod/br$b.j Ljava/lang/String;
            // 147: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 14a: ifeq 171
            // 14d: goto 154
            // 150: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 153: athrow
            // 154: aload 0
            // 155: ldc "You selected CUSTOM_BONE as the 'wear_type' in the cfg file for '%s' at '%s', yet you left the 'custom_bone' field right underneath it empty. If you want ur model to be parented to a specific bone, you have to enter the name of that bone at the field 'custom_bone'."
            // 157: bipush 2
            // 158: anewarray 36
            // 15b: dup
            // 15c: bipush 0
            // 15d: aload 2
            // 15e: aastore
            // 15f: dup
            // 160: bipush 1
            // 161: aload 1
            // 162: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 165: aastore
            // 166: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 169: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 16c: return
            // 16d: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 170: athrow
            // 171: aload 3
            // 172: ldc "which_girls"
            // 174: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 177: astore 6
            // 179: aload 6
            // 17b: ldc " "
            // 17d: ldc ""
            // 17f: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 182: astore 6
            // 184: aload 6
            // 186: ldc ","
            // 188: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
            // 18b: astore 7
            // 18d: aload 7
            // 18f: astore 8
            // 191: aload 8
            // 193: arraylength
            // 194: istore 9
            // 196: bipush 0
            // 197: istore 10
            // 199: iload 10
            // 19b: iload 9
            // 19d: if_icmpge 1ee
            // 1a0: aload 8
            // 1a2: iload 10
            // 1a4: aaload
            // 1a5: astore 11
            // 1a7: ldc ""
            // 1a9: aload 11
            // 1ab: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 1ae: ifeq 1b8
            // 1b1: goto 1e8
            // 1b4: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 1b7: athrow
            // 1b8: aload 0
            // 1b9: getfield com/trolmastercard/sexmod/br$b.g Ljava/util/HashSet;
            // 1bc: aload 11
            // 1be: invokestatic com/trolmastercard/sexmod/fy.valueOf (Ljava/lang/String;)Lcom/trolmastercard/sexmod/fy;
            // 1c1: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
            // 1c4: pop
            // 1c5: goto 1e8
            // 1c8: astore 12
            // 1ca: aload 0
            // 1cb: ldc "you entered '%s' as one of the girls, you put into the 'which_girls' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_girls'."
            // 1cd: bipush 3
            // 1ce: anewarray 36
            // 1d1: dup
            // 1d2: bipush 0
            // 1d3: aload 11
            // 1d5: aastore
            // 1d6: dup
            // 1d7: bipush 1
            // 1d8: aload 2
            // 1d9: aastore
            // 1da: dup
            // 1db: bipush 2
            // 1dc: aload 1
            // 1dd: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 1e0: aastore
            // 1e1: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 1e4: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 1e7: return
            // 1e8: iinc 10 1
            // 1eb: goto 199
            // 1ee: aload 3
            // 1ef: ldc "which_lighting"
            // 1f1: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 1f4: astore 8
            // 1f6: aload 8
            // 1f8: ifnonnull 218
            // 1fb: aload 0
            // 1fc: ldc "The %s's cfg file at '%s' doesn't contain the field 'which_lighting'. Go to the bottom of the cfg file and write either 'which_lighting=DEFAULT', 'which_lighting=SEXMOD', or 'which_lighting=NONE'."
            // 1fe: bipush 2
            // 1ff: anewarray 36
            // 202: dup
            // 203: bipush 0
            // 204: aload 2
            // 205: aastore
            // 206: dup
            // 207: bipush 1
            // 208: aload 1
            // 209: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 20c: aastore
            // 20d: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 210: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 213: return
            // 214: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 217: athrow
            // 218: aload 8
            // 21a: ldc " "
            // 21c: ldc ""
            // 21e: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 221: astore 8
            // 223: aload 0
            // 224: aload 8
            // 226: invokestatic com/trolmastercard/sexmod/c8.valueOf (Ljava/lang/String;)Lcom/trolmastercard/sexmod/c8;
            // 229: putfield com/trolmastercard/sexmod/br$b.e Lcom/trolmastercard/sexmod/c8;
            // 22c: goto 24e
            // 22f: astore 9
            // 231: aload 0
            // 232: ldc "you entered '%s' into the 'which_lighting' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_lighting'."
            // 234: bipush 3
            // 235: anewarray 36
            // 238: dup
            // 239: bipush 0
            // 23a: aload 8
            // 23c: aastore
            // 23d: dup
            // 23e: bipush 1
            // 23f: aload 2
            // 240: aastore
            // 241: dup
            // 242: bipush 2
            // 243: aload 1
            // 244: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 247: aastore
            // 248: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 24b: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 24e: aload 3
            // 24f: ldc "author"
            // 251: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 254: astore 9
            // 256: aload 9
            // 258: ifnull 26c
            // 25b: ldc ""
            // 25d: aload 9
            // 25f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 262: ifeq 279
            // 265: goto 26c
            // 268: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 26b: athrow
            // 26c: aload 0
            // 26d: ldc "anon"
            // 26f: putfield com/trolmastercard/sexmod/br$b.k Ljava/lang/String;
            // 272: goto 27f
            // 275: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 278: athrow
            // 279: aload 0
            // 27a: aload 9
            // 27c: putfield com/trolmastercard/sexmod/br$b.k Ljava/lang/String;
            // 27f: aload 3
            // 280: ldc "bones_to_hide"
            // 282: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 285: astore 10
            // 287: aload 10
            // 289: ifnull 2be
            // 28c: ldc ""
            // 28e: aload 10
            // 290: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 293: ifne 2be
            // 296: goto 29d
            // 299: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 29c: athrow
            // 29d: aload 10
            // 29f: ldc " "
            // 2a1: ldc ""
            // 2a3: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 2a6: astore 10
            // 2a8: aload 10
            // 2aa: ldc ","
            // 2ac: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
            // 2af: astore 11
            // 2b1: aload 0
            // 2b2: getfield com/trolmastercard/sexmod/br$b.b Ljava/util/HashSet;
            // 2b5: aload 11
            // 2b7: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
            // 2ba: invokevirtual java/util/HashSet.addAll (Ljava/util/Collection;)Z
            // 2bd: pop
            // 2be: aload 3
            // 2bf: ldc "enable_when_nude"
            // 2c1: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 2c4: astore 11
            // 2c6: aload 11
            // 2c8: ifnonnull 2d7
            // 2cb: aload 0
            // 2cc: bipush 0
            // 2cd: putfield com/trolmastercard/sexmod/br$b.c Z
            // 2d0: goto 2ed
            // 2d3: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 2d6: athrow
            // 2d7: aload 11
            // 2d9: ldc " "
            // 2db: ldc ""
            // 2dd: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 2e0: astore 11
            // 2e2: aload 0
            // 2e3: aload 11
            // 2e5: ldc "yes"
            // 2e7: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
            // 2ea: putfield com/trolmastercard/sexmod/br$b.c Z
            // 2ed: aload 3
            // 2ee: ldc "gui_size_factor"
            // 2f0: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 2f3: astore 12
            // 2f5: aload 12
            // 2f7: ifnull 34c
            // 2fa: ldc ""
            // 2fc: aload 12
            // 2fe: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 301: ifne 34c
            // 304: goto 30b
            // 307: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 30a: athrow
            // 30b: aload 12
            // 30d: ldc " "
            // 30f: ldc ""
            // 311: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 314: astore 12
            // 316: aload 12
            // 318: ldc ","
            // 31a: ldc "."
            // 31c: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 31f: astore 12
            // 321: aload 0
            // 322: aload 12
            // 324: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
            // 327: putfield com/trolmastercard/sexmod/br$b.m F
            // 32a: goto 34c
            // 32d: astore 13
            // 32f: aload 0
            // 330: ldc "you entered '%s' into the 'gui_size_factor' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_size_factor'."
            // 332: bipush 3
            // 333: anewarray 36
            // 336: dup
            // 337: bipush 0
            // 338: aload 12
            // 33a: aastore
            // 33b: dup
            // 33c: bipush 1
            // 33d: aload 2
            // 33e: aastore
            // 33f: dup
            // 340: bipush 2
            // 341: aload 1
            // 342: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 345: aastore
            // 346: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 349: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 34c: aload 3
            // 34d: ldc "gui_vertical_positioning"
            // 34f: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 352: astore 13
            // 354: aload 13
            // 356: ifnull 3ab
            // 359: ldc ""
            // 35b: aload 13
            // 35d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 360: ifne 3ab
            // 363: goto 36a
            // 366: invokestatic com/trolmastercard/sexmod/br$b.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
            // 369: athrow
            // 36a: aload 13
            // 36c: ldc " "
            // 36e: ldc ""
            // 370: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 373: astore 13
            // 375: aload 13
            // 377: ldc ","
            // 379: ldc "."
            // 37b: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 37e: astore 13
            // 380: aload 0
            // 381: aload 13
            // 383: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
            // 386: putfield com/trolmastercard/sexmod/br$b.a F
            // 389: goto 3ab
            // 38c: astore 14
            // 38e: aload 0
            // 38f: ldc "you entered '%s' into the 'gui_vertical_positioning' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_vertical_positioning'."
            // 391: bipush 3
            // 392: anewarray 36
            // 395: dup
            // 396: bipush 0
            // 397: aload 13
            // 399: aastore
            // 39a: dup
            // 39b: bipush 1
            // 39c: aload 2
            // 39d: aastore
            // 39e: dup
            // 39f: bipush 2
            // 3a0: aload 1
            // 3a1: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 3a4: aastore
            // 3a5: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 3a8: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 3ab: aload 3
            // 3ac: ldc "version"
            // 3ae: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 3b1: astore 14
            // 3b3: aload 14
            // 3b5: ldc " "
            // 3b7: ldc ""
            // 3b9: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 3bc: astore 14
            // 3be: aload 14
            // 3c0: ldc ","
            // 3c2: ldc "."
            // 3c4: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 3c7: astore 14
            // 3c9: aload 0
            // 3ca: aload 14
            // 3cc: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
            // 3cf: putfield com/trolmastercard/sexmod/br$b.l F
            // 3d2: goto 3f4
            // 3d5: astore 15
            // 3d7: aload 0
            // 3d8: ldc "you entered '%s' into the 'versionString' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'versionString'."
            // 3da: bipush 3
            // 3db: anewarray 36
            // 3de: dup
            // 3df: bipush 0
            // 3e0: aload 14
            // 3e2: aastore
            // 3e3: dup
            // 3e4: bipush 1
            // 3e5: aload 2
            // 3e6: aastore
            // 3e7: dup
            // 3e8: bipush 2
            // 3e9: aload 1
            // 3ea: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 3ed: aastore
            // 3ee: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 3f1: putfield com/trolmastercard/sexmod/br$b.h Ljava/lang/String;
            // 3f4: return
            // try (49 -> 57): 57 java/io/FileNotFoundException
            // try (29 -> 47): 47 java/io/FileNotFoundException
            // try (25 -> 33): 34 java/io/FileNotFoundException
            // try (63 -> 68): 69 java/io/FileNotFoundException
            // try (86 -> 89): 90 java/io/IOException
            // try (111 -> 129): 129 java/io/FileNotFoundException
            // try (131 -> 140): 141 java/lang/IllegalArgumentException
            // try (167 -> 196): 196 java/io/FileNotFoundException
            // try (162 -> 177): 178 java/io/FileNotFoundException
            // try (225 -> 229): 239 java/lang/IllegalArgumentException
            // try (225 -> 230): 230 java/io/FileNotFoundException
            // try (232 -> 238): 239 java/lang/IllegalArgumentException
            // try (266 -> 284): 284 java/io/FileNotFoundException
            // try (291 -> 295): 296 java/lang/IllegalArgumentException
            // try (392 -> 398): 399 java/io/FileNotFoundException
            // try (370 -> 376): 376 java/io/FileNotFoundException
            // try (342 -> 348): 349 java/io/FileNotFoundException
            // try (322 -> 333): 333 java/io/FileNotFoundException
            // try (320 -> 326): 327 java/io/FileNotFoundException
            // try (411 -> 415): 416 java/lang/NumberFormatException
            // try (440 -> 446): 447 java/io/FileNotFoundException
            // try (459 -> 463): 464 java/lang/NumberFormatException
            // try (498 -> 502): 503 java/lang/NumberFormatException
        }

        public String b() {
            return this.j;
        }

        public c8 i() {
            return this.e;
        }

        public float g() {
            return this.a;
        }

        public float d() {
            return this.m;
        }

        public gw j() {
            return this.d;
        }

        public HashSet<fy> l() {
            return this.g;
        }

        public String e() {
            return this.k;
        }

        public boolean a() {
            return this.c;
        }

        public HashSet<String> h() {
            return this.b;
        }

        public ResourceLocation k() {
            return this.i;
        }

        public void a(ResourceLocation var1) {
            this.i = var1;
        }

        public ResourceLocation c() {
            return this.f;
        }

        public void b(ResourceLocation var1) {
            this.f = var1;
        }

        public float f() {
            return this.l;
        }

        private static FileNotFoundException a(FileNotFoundException var0) {
            return var0;
        }
    }
}
