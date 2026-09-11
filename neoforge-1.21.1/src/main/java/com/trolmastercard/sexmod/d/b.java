package com.trolmastercard.sexmod.d;

import com.mojang.blaze3d.platform.NativeImage;
import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.f.h;
import com.trolmastercard.sexmod.f.b.k;
import com.trolmastercard.sexmod.m.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientChatEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent.LoggingIn;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent.LoggingOut;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import org.apache.logging.log4j.Level;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public class b {
    static Map<String, b.a> a = new HashMap<>();
    public static boolean b = false;
    public static boolean c = false;
    private static boolean d = false;

    static void a(Level var0, String var1) {
        if (!l.a()) {
            b(var0, var1);
        } else {
            c(var0, var1);
        }
    }

    private static void c(Level var0, String var1) {
        if (Level.ERROR.equals(var0)) {
            Main.a.error(var1);
        } else if (Level.WARN.equals(var0)) {
            Main.a.warn(var1);
        } else if (Level.DEBUG.equals(var0)) {
            Main.a.debug(var1);
        } else {
            Main.a.info(var1);
        }
    }

    public static void a(boolean var0) {
        if (var0) {
            d();
        }

        a.clear();
    }

    public static void a() {
    }

    public static boolean b() {
        String var0 = g();
        return var0 == null ? false : a(var0);
    }

    public static boolean a(String var0) {
        return c().contains(var0);
    }

    static HashSet<String> c() {
        File var0 = new File("sexmod/custom_models/whitelisted_servers.txt");

        try {
            var0.createNewFile();
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        HashSet var1 = new HashSet();

        try (BufferedReader var2 = new BufferedReader(new FileReader(var0))) {
            String var3;
            while ((var3 = var2.readLine()) != null) {
                var1.add(var3);
            }

            return var1;
        } catch (IOException var8) {
            var8.printStackTrace();
            return new HashSet<>();
        }
    }

    static void d() {
        for (Entry var1 : a.entrySet()) {
            b.a var2 = (b.a)var1.getValue();
            if (var2 != null) {
                ResourceLocation var3 = var2.a();
                if (var3 != null) {
                    Minecraft.getInstance().getTextureManager().release(var3);
                }
            }
        }
    }

    static void b(Level var0, String var1) {
        LocalPlayer var2 = Minecraft.getInstance().player;
        if (var2 == null) {
            c(var0, var1);
        } else {
            ChatFormatting var3;
            if (Level.DEBUG.equals(var0)) {
                var3 = ChatFormatting.DARK_GREEN;
            } else if (Level.ERROR.equals(var0)) {
                var3 = ChatFormatting.RED;
            } else {
                var3 = ChatFormatting.WHITE;
            }

            var2.displayClientMessage(Component.literal(var1).withStyle(var3), false);
        }
    }

    public static String e() {
        return !l.a() ? f() : "sexmod_custom_models";
    }

    public static String f() {
        String var0 = g();
        return var0 == null ? "sexmod/custom_models/singleplayer" : "sexmod/custom_models/" + var0;
    }

    @Nullable
    public static String g() {
        Minecraft var0 = Minecraft.getInstance();
        ServerData var1 = var0.getCurrentServer();
        if (var1 == null) {
            return null;
        }

        String var2 = var1.ip;
        int var3 = var2.indexOf(":");
        if (var3 != -1) {
            var2 = var2.substring(0, var3);
        }

        return var2;
    }

    public static int b(boolean var0) {
        a(Level.INFO, "loading up custom models...");
        String var1 = e();
        File var2 = new File(var1);
        var2.mkdirs();
        String[] var3 = var2.list((var0x, var1x) -> new File(var0x, var1x).isDirectory());
        if (var3 == null) {
            a(
                Level.ERROR,
                String.format(
                    "Something is wrong with the custom models folder at '%s'. Check if it exists, if not - make the directory yourself because Minecraft cannot do it itself for some reason",
                    var2.getAbsolutePath()
                )
            );
            return -1;
        }

        a(Level.INFO, String.format("found %s custom model(s)", var3.length));
        int var4 = 0;

        for (String var8 : var3) {
            String var9 = a(var8, var1);
            if (!"".equals(var9)) {
                a(Level.ERROR, var9);
                return -1;
            }

            var9 = a(var8, var1, var0);
            if (!"".equals(var9)) {
                a(Level.ERROR, var9);
                return -1;
            }

            var4++;
        }

        a(Level.DEBUG, String.format("successfully registered %s custom models", var4));
        c = true;
        return 0;
    }

    public static String a(String var0, String var1) {
        String var2 = String.format("%s/%s", var1, var0);
        File var3 = new File(String.format("%s/%s.geo.json", var2, var0));
        File var4 = new File(String.format("%s/%s.png", var2, var0));
        File var5 = new File(String.format("%s/%s.cfg", var2, var0));
        if (!var3.exists()) {
            return String.format("couldn't find model File for '%s'. It should have been at '%s'. Are you sure it exists?", var0, var3.getAbsolutePath());
        } else if (!var4.exists()) {
            return String.format("couldn't find texture File for '%s'. It should have been at '%s'. Are you sure it exists?", var0, var4.getAbsolutePath());
        } else {
            return !var5.exists()
                ? String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", var0, var5.getAbsolutePath())
                : "";
        }
    }

    static ResourceLocation a(String var0, File var1) {
        ResourceLocation var2 = ResourceLocation.fromNamespaceAndPath("sexmod", var0.toLowerCase() + "_custom_texture");

        try (FileInputStream var3 = new FileInputStream(var1)) {
            NativeImage var4 = NativeImage.read(var3);
            Minecraft.getInstance().getTextureManager().register(var2, new DynamicTexture(var4));
        }

        return var2;
    }

    static Object a(File var0) {
        StringBuilder var1 = new StringBuilder();

        String var3;
        try (BufferedReader var2 = new BufferedReader(new FileReader(var0))) {
            while ((var3 = var2.readLine()) != null) {
                var1.append(var3);
            }
        }

        String var7 = var1.toString();
        return null;
    }

    public static String a(String var0, String var1, boolean var2) {
        if (a.get(var0) != null) {
            return String.format("already registered '%s'... honestly, unsure how this could happen lol", var0);
        }

        String var3 = String.format("%s/%s/", var1, var0);
        String var4 = var3 + var0 + ".cfg";
        File var5 = new File(var4);
        if (!var5.exists()) {
            return String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", var0, var4);
        }

        b.a var6 = new b.a(var5, var0);
        if (var6.k != null) {
            return var6.k;
        }

        String var7 = var3 + var0 + ".png";
        File var8 = new File(var7);
        if (!var8.exists()) {
            return String.format("The texture for the custom model '%s' couldn't be found at '%s' are you sure it exists?", var0, var7);
        }

        ResourceLocation var9 = null;
        if (var2) {
            try {
                var9 = a(var0, var8);
            } catch (IOException var15) {
                return String.format("The texture for the custom model '%s' at '%s' appears to be corrupted. Try making a new one", var0, var7);
            } catch (Exception var16) {
                return String.format(
                    "Couldn't load the texture for the custom model '%s' at '%s'. Maybe try increasing the amount of RAM of ur Minecraft client", var0, var8
                );
            }
        }

        ResourceLocation var10 = ResourceLocation.fromNamespaceAndPath("sexmod", var0.toLowerCase() + "_model");
        String var11 = var3 + var0 + ".geo.json";
        File var12 = new File(var11);
        if (!var12.exists()) {
            return String.format("The geo model for the custom model '%s' couldn't be found at '%s' are you sure it exists?", var0, var11);
        }

        if (var2) {
            try {
                a(var12);
            } catch (IOException var14) {
                return String.format("The geo model for the custom model '%s' at '%s' appears to be corrupted. Try replacing it.", var0, var11);
            }
        }

        if (var2) {
            var6.a(var9);
        }

        a.put(var0, var6);
        a(Level.DEBUG, String.format("successfully registered custom model '%s'", var0));
        return "";
    }

    public static HashMap<com.trolmastercard.sexmod.h.a, List<String>> a(k var0) {
        HashMap var1 = new HashMap();

        for (com.trolmastercard.sexmod.h.a var5 : com.trolmastercard.sexmod.h.a.values()) {
            var1.put(var5, new ArrayList());
        }

        for (Entry var9 : a.entrySet()) {
            String var10 = (String)var9.getKey();
            b.a var11 = (b.a)var9.getValue();
            com.trolmastercard.sexmod.h.a var6 = var11.a;
            List var7 = (List)var1.get(var6);
            if (var11.b.isEmpty() || var11.b.contains(h.a(var0))) {
                var7.add(var10);
                var1.put(var6, var7);
            }
        }

        return var1;
    }

    @SubscribeEvent
    public static void onClientChat(ClientChatEvent var0) {
        String var1 = var0.getOriginalMessage();
        if ("id".equals(var1)) {
            Minecraft var2 = Minecraft.getInstance();
            LocalPlayer var3 = var2.player;
            if (var3 != null && var2.level != null) {
                k var4 = null;

                for (k var6 : var2.level.getEntitiesOfClass(k.class, var3.getBoundingBox().inflate(10.0))) {
                    if (var4 == null) {
                        var4 = var6;
                    } else if (var3.distanceTo(var6) < var3.distanceTo(var4)) {
                        var4 = var6;
                    }
                }

                if (var4 != null) {
                    var3.displayClientMessage(Component.literal(var4.ah().toString()), false);
                    var0.setCanceled(true);
                }
            }
        }
    }

    @SubscribeEvent
    public static void onLoggingIn(LoggingIn var0) {
        b(true);
        d = false;
    }

    @SubscribeEvent
    public static void onEntityJoinLevel(EntityJoinLevelEvent var0) {
        if (var0.getLevel().isClientSide()) {
            Minecraft var1 = Minecraft.getInstance();
            if (var0.getEntity().equals(var1.player)) {
                if (!d) {
                    d = true;
                    if (b()) {
                        a();
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onLoggingOut(LoggingOut var0) {
        a(true);
        d = false;
    }

    public static class a {
        com.trolmastercard.sexmod.h.a a;
        HashSet<h> b = new HashSet<>();
        HashSet<String> c = new HashSet<>();
        String d;
        String e;
        boolean f;
        com.trolmastercard.sexmod.b.a.a g;
        float h = 1.0F;
        float i = 0.0F;
        ResourceLocation j;
        public String k = null;
        float l;

        public a(File var1, String var2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.StackOverflowError
            //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
            //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
            //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
            //   at org.jetbrains.java.decompiler.struct.attr.StructLineNumberTableAttribute.initContent(StructLineNumberTableAttribute.java:24)
            //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
            //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
            //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
            //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
            //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
            //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
            //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
            //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
            //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
            //
            // Bytecode:
            // 000: aload 0
            // 001: invokespecial java/lang/Object.<init> ()V
            // 004: aload 0
            // 005: new java/util/HashSet
            // 008: dup
            // 009: invokespecial java/util/HashSet.<init> ()V
            // 00c: putfield com/trolmastercard/sexmod/d/b$a.b Ljava/util/HashSet;
            // 00f: aload 0
            // 010: new java/util/HashSet
            // 013: dup
            // 014: invokespecial java/util/HashSet.<init> ()V
            // 017: putfield com/trolmastercard/sexmod/d/b$a.c Ljava/util/HashSet;
            // 01a: aload 0
            // 01b: fconst_1
            // 01c: putfield com/trolmastercard/sexmod/d/b$a.h F
            // 01f: aload 0
            // 020: fconst_0
            // 021: putfield com/trolmastercard/sexmod/d/b$a.i F
            // 024: aload 0
            // 025: aconst_null
            // 026: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 029: aload 2
            // 02a: ldc " "
            // 02c: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
            // 02f: ifne 044
            // 032: aload 2
            // 033: ldc "#"
            // 035: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
            // 038: ifne 044
            // 03b: aload 2
            // 03c: ldc "$"
            // 03e: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
            // 041: ifeq 056
            // 044: aload 0
            // 045: ldc "You cannot call your custom model '%s'. '#', '$' and spaces are illegal characters"
            // 047: bipush 1
            // 048: anewarray 46
            // 04b: dup
            // 04c: bipush 0
            // 04d: aload 2
            // 04e: aastore
            // 04f: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 052: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 055: return
            // 056: ldc "cross"
            // 058: aload 2
            // 059: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
            // 05c: ifeq 066
            // 05f: aload 0
            // 060: ldc "You cannot call your custom model 'cross'. Im sorry, but I need that specific name for internal stuff"
            // 062: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 065: return
            // 066: new java/util/Properties
            // 069: dup
            // 06a: invokespecial java/util/Properties.<init> ()V
            // 06d: astore 3
            // 06e: new java/io/FileInputStream
            // 071: dup
            // 072: aload 1
            // 073: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
            // 076: astore 4
            // 078: goto 096
            // 07b: astore 5
            // 07d: aload 0
            // 07e: ldc "couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?"
            // 080: bipush 2
            // 081: anewarray 46
            // 084: dup
            // 085: bipush 0
            // 086: aload 2
            // 087: aastore
            // 088: dup
            // 089: bipush 1
            // 08a: aload 1
            // 08b: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 08e: aastore
            // 08f: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 092: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 095: return
            // 096: aload 3
            // 097: aload 4
            // 099: invokevirtual java/util/Properties.load (Ljava/io/InputStream;)V
            // 09c: goto 0ba
            // 09f: astore 5
            // 0a1: aload 0
            // 0a2: ldc "couldn't read the cfg File for '%s' at '%s'. It appears to be corrupted. Try making a new one"
            // 0a4: bipush 2
            // 0a5: anewarray 46
            // 0a8: dup
            // 0a9: bipush 0
            // 0aa: aload 2
            // 0ab: aastore
            // 0ac: dup
            // 0ad: bipush 1
            // 0ae: aload 1
            // 0af: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 0b2: aastore
            // 0b3: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 0b6: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 0b9: return
            // 0ba: aload 3
            // 0bb: ldc "wear_type"
            // 0bd: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 0c0: astore 5
            // 0c2: aload 5
            // 0c4: ifnonnull 0e0
            // 0c7: aload 0
            // 0c8: ldc "The cfg File for the model '%s' at '%s' is missing the 'wear_type'. Go to the bottom of the cfg File and write 'wear_type=HEAD'. Check the cfg files of my examples to see what values for 'wear_type' are possible"
            // 0ca: bipush 2
            // 0cb: anewarray 46
            // 0ce: dup
            // 0cf: bipush 0
            // 0d0: aload 2
            // 0d1: aastore
            // 0d2: dup
            // 0d3: bipush 1
            // 0d4: aload 1
            // 0d5: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 0d8: aastore
            // 0d9: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 0dc: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 0df: return
            // 0e0: aload 5
            // 0e2: ldc " "
            // 0e4: ldc ""
            // 0e6: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 0e9: astore 5
            // 0eb: aload 0
            // 0ec: aload 5
            // 0ee: invokestatic com/trolmastercard/sexmod/h/a.valueOf (Ljava/lang/String;)Lcom/trolmastercard/sexmod/h/a;
            // 0f1: putfield com/trolmastercard/sexmod/d/b$a.a Lcom/trolmastercard/sexmod/h/a;
            // 0f4: goto 117
            // 0f7: astore 6
            // 0f9: aload 0
            // 0fa: ldc "you entered '%s' into the 'wear_type' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'wear_type"
            // 0fc: bipush 3
            // 0fd: anewarray 46
            // 100: dup
            // 101: bipush 0
            // 102: aload 5
            // 104: aastore
            // 105: dup
            // 106: bipush 1
            // 107: aload 2
            // 108: aastore
            // 109: dup
            // 10a: bipush 2
            // 10b: aload 1
            // 10c: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 10f: aastore
            // 110: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 113: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 116: return
            // 117: getstatic com/trolmastercard/sexmod/h/a.g Lcom/trolmastercard/sexmod/h/a;
            // 11a: aload 0
            // 11b: getfield com/trolmastercard/sexmod/d/b$a.a Lcom/trolmastercard/sexmod/h/a;
            // 11e: invokevirtual com/trolmastercard/sexmod/h/a.equals (Ljava/lang/Object;)Z
            // 121: ifeq 15a
            // 124: aload 0
            // 125: aload 3
            // 126: ldc "custom_bone"
            // 128: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 12b: putfield com/trolmastercard/sexmod/d/b$a.e Ljava/lang/String;
            // 12e: aload 0
            // 12f: getfield com/trolmastercard/sexmod/d/b$a.e Ljava/lang/String;
            // 132: ifnull 141
            // 135: ldc ""
            // 137: aload 0
            // 138: getfield com/trolmastercard/sexmod/d/b$a.e Ljava/lang/String;
            // 13b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 13e: ifeq 15a
            // 141: aload 0
            // 142: ldc "You selected CUSTOM_BONE as the 'wear_type' in the cfg file for '%s' at '%s', yet you left the 'custom_bone' field right underneath it empty. If you want ur model to be parented to a specific bone, you have to enter the name of that bone at the field 'custom_bone'."
            // 144: bipush 2
            // 145: anewarray 46
            // 148: dup
            // 149: bipush 0
            // 14a: aload 2
            // 14b: aastore
            // 14c: dup
            // 14d: bipush 1
            // 14e: aload 1
            // 14f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 152: aastore
            // 153: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 156: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 159: return
            // 15a: aload 3
            // 15b: ldc "which_girls"
            // 15d: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 160: astore 6
            // 162: aload 6
            // 164: ldc " "
            // 166: ldc ""
            // 168: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 16b: astore 6
            // 16d: aload 6
            // 16f: ldc ","
            // 171: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
            // 174: astore 7
            // 176: aload 7
            // 178: astore 8
            // 17a: aload 8
            // 17c: arraylength
            // 17d: istore 9
            // 17f: bipush 0
            // 180: istore 10
            // 182: iload 10
            // 184: iload 9
            // 186: if_icmpge 1d3
            // 189: aload 8
            // 18b: iload 10
            // 18d: aaload
            // 18e: astore 11
            // 190: ldc ""
            // 192: aload 11
            // 194: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 197: ifeq 19d
            // 19a: goto 1cd
            // 19d: aload 0
            // 19e: getfield com/trolmastercard/sexmod/d/b$a.b Ljava/util/HashSet;
            // 1a1: aload 11
            // 1a3: invokestatic com/trolmastercard/sexmod/f/h.valueOf (Ljava/lang/String;)Lcom/trolmastercard/sexmod/f/h;
            // 1a6: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
            // 1a9: pop
            // 1aa: goto 1cd
            // 1ad: astore 12
            // 1af: aload 0
            // 1b0: ldc "you entered '%s' as one of the girls, you put into the 'which_girls' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_girls'."
            // 1b2: bipush 3
            // 1b3: anewarray 46
            // 1b6: dup
            // 1b7: bipush 0
            // 1b8: aload 11
            // 1ba: aastore
            // 1bb: dup
            // 1bc: bipush 1
            // 1bd: aload 2
            // 1be: aastore
            // 1bf: dup
            // 1c0: bipush 2
            // 1c1: aload 1
            // 1c2: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 1c5: aastore
            // 1c6: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 1c9: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 1cc: return
            // 1cd: iinc 10 1
            // 1d0: goto 182
            // 1d3: aload 3
            // 1d4: ldc "which_lighting"
            // 1d6: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 1d9: astore 8
            // 1db: aload 8
            // 1dd: ifnonnull 1f9
            // 1e0: aload 0
            // 1e1: ldc "The %s's cfg file at '%s' doesn't contain the field 'which_lighting'. Go to the bottom of the cfg file and write either 'which_lighting=DEFAULT', 'which_lighting=SEXMOD', or 'which_lighting=NONE'."
            // 1e3: bipush 2
            // 1e4: anewarray 46
            // 1e7: dup
            // 1e8: bipush 0
            // 1e9: aload 2
            // 1ea: aastore
            // 1eb: dup
            // 1ec: bipush 1
            // 1ed: aload 1
            // 1ee: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 1f1: aastore
            // 1f2: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 1f5: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 1f8: return
            // 1f9: aload 8
            // 1fb: ldc " "
            // 1fd: ldc ""
            // 1ff: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 202: astore 8
            // 204: aload 0
            // 205: aload 8
            // 207: invokestatic com/trolmastercard/sexmod/b/a/a.valueOf (Ljava/lang/String;)Lcom/trolmastercard/sexmod/b/a/a;
            // 20a: putfield com/trolmastercard/sexmod/d/b$a.g Lcom/trolmastercard/sexmod/b/a/a;
            // 20d: goto 22f
            // 210: astore 9
            // 212: aload 0
            // 213: ldc "you entered '%s' into the 'which_lighting' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_lighting'."
            // 215: bipush 3
            // 216: anewarray 46
            // 219: dup
            // 21a: bipush 0
            // 21b: aload 8
            // 21d: aastore
            // 21e: dup
            // 21f: bipush 1
            // 220: aload 2
            // 221: aastore
            // 222: dup
            // 223: bipush 2
            // 224: aload 1
            // 225: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 228: aastore
            // 229: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 22c: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 22f: aload 3
            // 230: ldc "author"
            // 232: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 235: astore 9
            // 237: aload 0
            // 238: aload 9
            // 23a: ifnull 247
            // 23d: ldc ""
            // 23f: aload 9
            // 241: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 244: ifeq 24c
            // 247: ldc "anon"
            // 249: goto 24e
            // 24c: aload 9
            // 24e: putfield com/trolmastercard/sexmod/d/b$a.d Ljava/lang/String;
            // 251: aload 3
            // 252: ldc "bones_to_hide"
            // 254: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 257: astore 10
            // 259: aload 10
            // 25b: ifnull 285
            // 25e: ldc ""
            // 260: aload 10
            // 262: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 265: ifne 285
            // 268: aload 10
            // 26a: ldc " "
            // 26c: ldc ""
            // 26e: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 271: astore 10
            // 273: aload 0
            // 274: getfield com/trolmastercard/sexmod/d/b$a.c Ljava/util/HashSet;
            // 277: aload 10
            // 279: ldc ","
            // 27b: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
            // 27e: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
            // 281: invokevirtual java/util/HashSet.addAll (Ljava/util/Collection;)Z
            // 284: pop
            // 285: aload 3
            // 286: ldc "enable_when_nude"
            // 288: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 28b: astore 11
            // 28d: aload 0
            // 28e: aload 11
            // 290: ifnull 2a8
            // 293: aload 11
            // 295: ldc " "
            // 297: ldc ""
            // 299: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 29c: ldc "yes"
            // 29e: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
            // 2a1: ifeq 2a8
            // 2a4: bipush 1
            // 2a5: goto 2a9
            // 2a8: bipush 0
            // 2a9: putfield com/trolmastercard/sexmod/d/b$a.f Z
            // 2ac: aload 3
            // 2ad: ldc "gui_size_factor"
            // 2af: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 2b2: astore 12
            // 2b4: aload 12
            // 2b6: ifnull 300
            // 2b9: ldc ""
            // 2bb: aload 12
            // 2bd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 2c0: ifne 300
            // 2c3: aload 12
            // 2c5: ldc " "
            // 2c7: ldc ""
            // 2c9: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 2cc: ldc ","
            // 2ce: ldc "."
            // 2d0: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 2d3: astore 12
            // 2d5: aload 0
            // 2d6: aload 12
            // 2d8: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
            // 2db: putfield com/trolmastercard/sexmod/d/b$a.h F
            // 2de: goto 300
            // 2e1: astore 13
            // 2e3: aload 0
            // 2e4: ldc "you entered '%s' into the 'gui_size_factor' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_size_factor'."
            // 2e6: bipush 3
            // 2e7: anewarray 46
            // 2ea: dup
            // 2eb: bipush 0
            // 2ec: aload 12
            // 2ee: aastore
            // 2ef: dup
            // 2f0: bipush 1
            // 2f1: aload 2
            // 2f2: aastore
            // 2f3: dup
            // 2f4: bipush 2
            // 2f5: aload 1
            // 2f6: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 2f9: aastore
            // 2fa: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 2fd: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 300: aload 3
            // 301: ldc "gui_vertical_positioning"
            // 303: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 306: astore 13
            // 308: aload 13
            // 30a: ifnull 354
            // 30d: ldc ""
            // 30f: aload 13
            // 311: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 314: ifne 354
            // 317: aload 13
            // 319: ldc " "
            // 31b: ldc ""
            // 31d: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 320: ldc ","
            // 322: ldc "."
            // 324: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 327: astore 13
            // 329: aload 0
            // 32a: aload 13
            // 32c: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
            // 32f: putfield com/trolmastercard/sexmod/d/b$a.i F
            // 332: goto 354
            // 335: astore 14
            // 337: aload 0
            // 338: ldc "you entered '%s' into the 'gui_vertical_positioning' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_vertical_positioning'."
            // 33a: bipush 3
            // 33b: anewarray 46
            // 33e: dup
            // 33f: bipush 0
            // 340: aload 13
            // 342: aastore
            // 343: dup
            // 344: bipush 1
            // 345: aload 2
            // 346: aastore
            // 347: dup
            // 348: bipush 2
            // 349: aload 1
            // 34a: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 34d: aastore
            // 34e: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 351: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 354: aload 3
            // 355: ldc "version"
            // 357: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
            // 35a: astore 14
            // 35c: aload 14
            // 35e: ldc " "
            // 360: ldc ""
            // 362: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 365: ldc ","
            // 367: ldc "."
            // 369: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
            // 36c: astore 14
            // 36e: aload 0
            // 36f: aload 14
            // 371: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
            // 374: putfield com/trolmastercard/sexmod/d/b$a.l F
            // 377: goto 399
            // 37a: astore 15
            // 37c: aload 0
            // 37d: ldc "you entered '%s' into the 'versionString' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'versionString'."
            // 37f: bipush 3
            // 380: anewarray 46
            // 383: dup
            // 384: bipush 0
            // 385: aload 14
            // 387: aastore
            // 388: dup
            // 389: bipush 1
            // 38a: aload 2
            // 38b: aastore
            // 38c: dup
            // 38d: bipush 2
            // 38e: aload 1
            // 38f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
            // 392: aastore
            // 393: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
            // 396: putfield com/trolmastercard/sexmod/d/b$a.k Ljava/lang/String;
            // 399: return
            // try (56 -> 61): 62 java/io/FileNotFoundException
            // try (79 -> 82): 83 java/io/IOException
            // try (127 -> 131): 132 java/lang/IllegalArgumentException
            // try (219 -> 225): 226 java/lang/IllegalArgumentException
            // try (276 -> 280): 281 java/lang/IllegalArgumentException
            // try (375 -> 379): 380 java/lang/NumberFormatException
            // try (418 -> 422): 423 java/lang/NumberFormatException
            // try (455 -> 459): 460 java/lang/NumberFormatException
        }

        public ResourceLocation a() {
            return this.j;
        }

        public void a(ResourceLocation var1) {
            this.j = var1;
        }
    }
}
