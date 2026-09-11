package com.trolmastercard.sexmod.d;

import com.trolmastercard.sexmod.Main;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.CodeSource;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import net.neoforged.fml.loading.FMLPaths;

public final class e {
    private static final Pattern a = Pattern.compile("^FAP-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{4}$");
    private static Boolean b;

    private e() {
    }

    public static boolean a() {
        if (b == null) {
            b = c();
        }

        return b;
    }

    private static boolean c() {
        try {
            if (d()) {
                return true;
            }

            Path var0 = FMLPaths.CONFIGDIR.get().resolve("sexmod-license.key");
            if (!Files.isRegularFile(var0)) {
                return false;
            }

            List var1 = Files.readAllLines(var0, StandardCharsets.UTF_8);
            if (var1.size() < 2) {
                return false;
            }

            String var2 = ((String)var1.get(0)).trim();
            String var3 = ((String)var1.get(1)).trim();
            return a(var2) && var3.equalsIgnoreCase(c(var2));
        } catch (Exception var4) {
            return false;
        }
    }

    private static boolean d() {
        try {
            CodeSource var0 = e.class.getProtectionDomain().getCodeSource();
            return var0 != null && !var0.getLocation().toString().toLowerCase(Locale.ROOT).endsWith(".jar");
        } catch (Exception var1) {
            return false;
        }
    }

    public static void b() {
        if (a()) {
            Main.a.info("[sexmod] license OK \u2014 features enabled.");
        } else {
            Main.a
                .warn(
                    "[sexmod] NO VALID LICENSE KEY at config/{} \u2014 features are DISABLED. Place a machine-bound key (line1=code, line2=bind) in config/{} \u2014 ask your distributor.",
                    "sexmod-license.key",
                    "sexmod-license.key"
                );
            Main.a.warn("[sexmod] this machine's license fingerprint = \"{}\"", e());
        }
    }

    static boolean a(String var0) {
        if (var0 == null) {
            return false;
        }

        String var1 = var0.trim().toUpperCase(Locale.ROOT);
        if (!a.matcher(var1).matches()) {
            return false;
        }

        String[] var2 = var1.split("-");
        String var3 = var2[1] + var2[2];
        return b(var3).equals(var2[3]);
    }

    private static String b(String var0) {
        try {
            MessageDigest var1 = MessageDigest.getInstance("SHA-1");
            var1.update("CE670EDD406C827D98B0359F00CB6082".getBytes(StandardCharsets.UTF_8));
            var1.update(var0.getBytes(StandardCharsets.UTF_8));
            byte[] var2 = var1.digest();
            return String.format("%02X%02X", var2[0] & 255, var2[1] & 255);
        } catch (Exception var3) {
            throw new IllegalStateException("SHA-1 unavailable", var3);
        }
    }

    private static String e() {
        String var0 = System.getenv("COMPUTERNAME");
        if (var0 == null || var0.isBlank()) {
            var0 = System.getenv("HOSTNAME");
        }

        if (var0 == null || var0.isBlank()) {
            try {
                var0 = InetAddress.getLocalHost().getHostName();
            } catch (Exception var2) {
                var0 = "unknown-host";
            }
        }

        return var0 + "|" + System.getProperty("user.name", "unknown-user");
    }

    private static String c(String var0) {
        try {
            MessageDigest var1 = MessageDigest.getInstance("SHA-256");
            var1.update("CE670EDD406C827D98B0359F00CB6082".getBytes(StandardCharsets.UTF_8));
            var1.update("|bind|".getBytes(StandardCharsets.UTF_8));
            var1.update(var0.trim().toUpperCase(Locale.ROOT).getBytes(StandardCharsets.UTF_8));
            var1.update("|".getBytes(StandardCharsets.UTF_8));
            var1.update(e().getBytes(StandardCharsets.UTF_8));
            byte[] var2 = var1.digest();
            StringBuilder var3 = new StringBuilder(64);

            for (byte var7 : var2) {
                var3.append(String.format("%02x", var7 & 255));
            }

            return var3.toString();
        } catch (Exception var8) {
            throw new IllegalStateException("SHA-256 unavailable", var8);
        }
    }
}
