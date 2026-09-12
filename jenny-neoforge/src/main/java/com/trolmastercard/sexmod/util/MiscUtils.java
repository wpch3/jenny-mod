package com.trolmastercard.sexmod.util;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;

public class MiscUtils {
    public static void a(String var0) {
        Clipboard var1 = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection var2 = new StringSelection(var0);
        var1.setContents(var2, null);
    }

    public static String b(String var0) {
        return var0 != null && !var0.isEmpty() ? Character.toUpperCase(var0.charAt(0)) + var0.substring(1).toLowerCase() : var0;
    }

    public static boolean a(double var0, double var2, double var4) {
        return var0 >= var2 && var0 < var4;
    }

    public static int a(int var0) {
        if (var0 <= 0) {
            return var0;
        }

        Random var1 = new Random();
        int var2 = 0;

        for (int var3 = 0; var3 <= var0; var3++) {
            var2 += var3;
        }

        int var6 = var1.nextInt(var2) + 1;
        int var4 = 0;

        for (int var5 = 0; var5 <= var0; var5++) {
            var4 += var5;
            if (var4 >= var6) {
                return var5;
            }
        }

        return var0;
    }

    public static int a() {
        return com.trolmastercard.sexmod.util.ModState.a.nextBoolean() ? 1 : -1;
    }

    public static float a(float var0, float var1, float var2) {
        return Math.max(var1, Math.min(var2, var0));
    }

    public static double b(double var0, double var2, double var4) {
        return Math.max(var2, Math.min(var4, var0));
    }

    public static float a(float var0, boolean var1) {
        Random var2 = new Random();
        float var3 = var2.nextFloat() * var0;
        int var4 = var1 && var2.nextBoolean() ? -1 : 1;
        return var3 * var4;
    }

    public static int a(double var0) {
        return Math.round((float)var0);
    }
}
