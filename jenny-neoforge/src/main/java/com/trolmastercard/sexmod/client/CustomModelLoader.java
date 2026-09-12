package com.trolmastercard.sexmod.client;

import com.mojang.blaze3d.platform.NativeImage;
import com.trolmastercard.sexmod.Sexmod;
import com.trolmastercard.sexmod.entity.NpcType;
import com.trolmastercard.sexmod.entity.GirlEntity;
import com.trolmastercard.sexmod.util.SideUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
public class CustomModelLoader {
    static Map<String, CustomModelLoader.a> a = new HashMap<>();
    public static boolean b = false;
    public static boolean c = false;
    private static boolean d = false;

    static void a(Level var0, String var1) {
        if (!SideUtils.a()) {
            b(var0, var1);
        } else {
            c(var0, var1);
        }
    }

    private static void c(Level var0, String var1) {
        if (Level.ERROR.equals(var0)) {
            Sexmod.a.error(var1);
        } else if (Level.WARN.equals(var0)) {
            Sexmod.a.warn(var1);
        } else if (Level.DEBUG.equals(var0)) {
            Sexmod.a.debug(var1);
        } else {
            Sexmod.a.info(var1);
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
            CustomModelLoader.a var2 = (CustomModelLoader.a)var1.getValue();
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
        return !SideUtils.a() ? f() : "sexmod_custom_models";
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

    static ResourceLocation a(String var0, File var1) throws IOException {
        ResourceLocation var2 = ResourceLocation.fromNamespaceAndPath("sexmod", var0.toLowerCase() + "_custom_texture");

        try (FileInputStream var3 = new FileInputStream(var1)) {
            NativeImage var4 = NativeImage.read(var3);
            Minecraft.getInstance().getTextureManager().register(var2, new DynamicTexture(var4));
        }

        return var2;
    }

    static Object a(File var0) throws IOException {
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

        CustomModelLoader.a var6 = new CustomModelLoader.a(var5, var0);
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

    public static HashMap<com.trolmastercard.sexmod.client.gui.EquipmentSlotType, List<String>> a(GirlEntity var0) {
        HashMap var1 = new HashMap();

        for (com.trolmastercard.sexmod.client.gui.EquipmentSlotType var5 : com.trolmastercard.sexmod.client.gui.EquipmentSlotType.values()) {
            var1.put(var5, new ArrayList());
        }

        for (Entry var9 : a.entrySet()) {
            String var10 = (String)var9.getKey();
            CustomModelLoader.a var11 = (CustomModelLoader.a)var9.getValue();
            com.trolmastercard.sexmod.client.gui.EquipmentSlotType var6 = var11.a;
            List var7 = (List)var1.get(var6);
            if (var11.b.isEmpty() || var11.b.contains(NpcType.a(var0))) {
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
                GirlEntity var4 = null;

                for (GirlEntity var6 : var2.level.getEntitiesOfClass(GirlEntity.class, var3.getBoundingBox().inflate(10.0))) {
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
        com.trolmastercard.sexmod.client.gui.EquipmentSlotType a;
        HashSet<NpcType> b = new HashSet<>();
        HashSet<String> c = new HashSet<>();
        String d;
        String e;
        boolean f;
        com.trolmastercard.sexmod.client.model.ModelSource g;
        float h = 1.0F;
        float i = 0.0F;
        ResourceLocation j;
        public String k = null;
        float l;

        public a(File var1, String var2) {
            if (var2.contains(" ") || var2.contains("#") || var2.contains("$")) {
                this.k = String.format("You cannot call your custom model '%s'. '#', '$' and spaces are illegal characters", var2);
                return;
            }
            if ("cross".equalsIgnoreCase(var2)) {
                this.k = "You cannot call your custom model 'cross'. Im sorry, but I need that specific name for internal stuff";
                return;
            }
            Properties var3 = new Properties();
            FileInputStream var4;
            try {
                var4 = new FileInputStream(var1);
            } catch (FileNotFoundException var5) {
                this.k = String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", var2, var1.getAbsolutePath());
                return;
            }
            try {
                var3.load(var4);
            } catch (IOException var5) {
                this.k = String.format("couldn't read the cfg File for '%s' at '%s'. It appears to be corrupted. Try making a new one", var2, var1.getAbsolutePath());
                return;
            }
            String var5 = var3.getProperty("wear_type");
            if (var5 == null) {
                this.k = String.format("The cfg File for the model '%s' at '%s' is missing the 'wear_type'. Go to the bottom of the cfg File and write 'wear_type=HEAD'. Check the cfg files of my examples to see what values for 'wear_type' are possible", var2, var1.getAbsolutePath());
                return;
            }
            var5 = var5.replace(" ", "");
            try {
                this.a = com.trolmastercard.sexmod.client.gui.EquipmentSlotType.valueOf(var5);
            } catch (IllegalArgumentException var6) {
                this.k = String.format("you entered '%s' into the 'wear_type' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'wear_type", var5, var2, var1.getAbsolutePath());
                return;
            }
            if (com.trolmastercard.sexmod.client.gui.EquipmentSlotType.g.equals(this.a)) {
                this.e = var3.getProperty("custom_bone");
                if (this.e == null || "".equals(this.e)) {
                    this.k = String.format("You selected CUSTOM_BONE as the 'wear_type' in the cfg file for '%s' at '%s', yet you left the 'custom_bone' field right underneath it empty. If you want ur model to be parented to a specific bone, you have to enter the name of that bone at the field 'custom_bone'.", var2, var1.getAbsolutePath());
                    return;
                }
            }
            String var6 = var3.getProperty("which_girls");
            var6 = var6.replace(" ", "");
            String[] var7 = var6.split(",");
            for (String var11 : var7) {
                if ("".equals(var11)) {
                    continue;
                }
                try {
                    this.b.add(NpcType.valueOf(var11));
                } catch (IllegalArgumentException var12) {
                    this.k = String.format("you entered '%s' as one of the girls, you put into the 'which_girls' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_girls'.", var11, var2, var1.getAbsolutePath());
                    return;
                }
            }
            String var8 = var3.getProperty("which_lighting");
            if (var8 == null) {
                this.k = String.format("The %s's cfg file at '%s' doesn't contain the field 'which_lighting'. Go to the bottom of the cfg file and write either 'which_lighting=DEFAULT', 'which_lighting=SEXMOD', or 'which_lighting=NONE'.", var2, var1.getAbsolutePath());
                return;
            }
            var8 = var8.replace(" ", "");
            try {
                this.g = com.trolmastercard.sexmod.client.model.ModelSource.valueOf(var8);
            } catch (IllegalArgumentException var9) {
                this.k = String.format("you entered '%s' into the 'which_lighting' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_lighting'.", var8, var2, var1.getAbsolutePath());
            }
            String var9 = var3.getProperty("author");
            this.d = var9 == null || "".equals(var9) ? "anon" : var9;
            String var10 = var3.getProperty("bones_to_hide");
            if (var10 != null && !"".equals(var10)) {
                var10 = var10.replace(" ", "");
                this.c.addAll(Arrays.asList(var10.split(",")));
            }
            String var11 = var3.getProperty("enable_when_nude");
            this.f = var11 != null && var11.replace(" ", "").equalsIgnoreCase("yes");
            String var12 = var3.getProperty("gui_size_factor");
            if (var12 != null && !"".equals(var12)) {
                var12 = var12.replace(" ", "").replace(",", ".");
                try {
                    this.h = Float.parseFloat(var12);
                } catch (NumberFormatException var13) {
                    this.k = String.format("you entered '%s' into the 'gui_size_factor' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_size_factor'.", var12, var2, var1.getAbsolutePath());
                }
            }
            String var13 = var3.getProperty("gui_vertical_positioning");
            if (var13 != null && !"".equals(var13)) {
                var13 = var13.replace(" ", "").replace(",", ".");
                try {
                    this.i = Float.parseFloat(var13);
                } catch (NumberFormatException var14) {
                    this.k = String.format("you entered '%s' into the 'gui_vertical_positioning' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_vertical_positioning'.", var13, var2, var1.getAbsolutePath());
                }
            }
            String var14 = var3.getProperty("version");
            var14 = var14.replace(" ", "").replace(",", ".");
            try {
                this.l = Float.parseFloat(var14);
            } catch (NumberFormatException var15) {
                this.k = String.format("you entered '%s' into the 'versionString' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'versionString'.", var14, var2, var1.getAbsolutePath());
            }
        }

        public ResourceLocation a() {
            return this.j;
        }

        public void a(ResourceLocation var1) {
            this.j = var1;
        }
    }
}
