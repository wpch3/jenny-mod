package com.trolmastercard.sexmod;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;

public class be {
    public static float a(double var0, double var2) {
        var0 = (var0 + (Math.PI * 2)) % (Math.PI * 2);
        var2 = (var2 + (Math.PI * 2)) % (Math.PI * 2);
        double var4 = var2 - var0;

        while (var4 < -Math.PI) {
            var4 += Math.PI * 2;
        }

        while (var4 >= Math.PI) {
            var4 -= Math.PI * 2;
        }

        return (float)var4;
    }

    public static bm a(Vec3d var0, Vec3d var1) {
        Vec3d var2 = var1.func_178788_d(var0).func_72432_b();
        return new bm(
            (float)Math.atan2(var2.field_72450_a, var2.field_72449_c),
            (float)Math.atan2(var2.field_72448_b, Math.sqrt(var2.field_72450_a * var2.field_72450_a + var2.field_72449_c * var2.field_72449_c))
        );
    }

    public static void a(String var0) {
        Clipboard var1 = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection var2 = new StringSelection(var0);
        var1.setContents(var2, null);
    }

    public static String b(String param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: ifnull 12
        // 04: aload 0
        // 05: invokevirtual java/lang/String.isEmpty ()Z
        // 08: ifeq 18
        // 0b: goto 12
        // 0e: invokestatic com/trolmastercard/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 11: athrow
        // 12: aload 0
        // 13: areturn
        // 14: invokestatic com/trolmastercard/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 17: athrow
        // 18: new java/lang/StringBuilder
        // 1b: dup
        // 1c: invokespecial java/lang/StringBuilder.<init> ()V
        // 1f: aload 0
        // 20: bipush 0
        // 21: invokevirtual java/lang/String.charAt (I)C
        // 24: invokestatic java/lang/Character.toUpperCase (C)C
        // 27: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
        // 2a: aload 0
        // 2b: bipush 1
        // 2c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
        // 2f: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
        // 32: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 35: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 38: areturn
        // try (0 -> 5): 6 java/lang/RuntimeException
        // try (2 -> 10): 10 java/lang/RuntimeException
    }

    public static boolean a(double var0, double var2, double var4) {
        try {
            if (var0 < var2) {
                return false;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            return !(var0 >= var4);
        } catch (RuntimeException var6) {
            throw a(var6);
        }
    }

    public static int a(int var0) {
        try {
            if (var0 <= 0) {
                return var0;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        Random var1 = new Random();
        int var2 = 0;

        for (int var3 = 0; var3 <= var0; var3++) {
            var2 += var3;
        }

        int var8 = var1.nextInt(var2) + 1;
        int var4 = 0;

        for (int var5 = 0; var5 <= var0; var5++) {
            var4 += var5;

            try {
                if (var4 >= var8) {
                    return var5;
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }
        }

        return var0;
    }

    public static int a() {
        try {
            if (r.f.nextBoolean()) {
                return 1;
            }
        } catch (RuntimeException var0) {
            throw a(var0);
        }

        return -1;
    }

    public static float b(float var0, float var1, float var2) {
        return Math.max(var1, Math.min(var2, var0));
    }

    public static double b(double var0, double var2, double var4) {
        return Math.max(var2, Math.min(var4, var0));
    }

    public static float a(float param0, boolean param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: new java/util/Random
        // 03: dup
        // 04: invokespecial java/util/Random.<init> ()V
        // 07: astore 2
        // 08: aload 2
        // 09: invokevirtual java/util/Random.nextFloat ()F
        // 0c: fload 0
        // 0d: fmul
        // 0e: iload 1
        // 0f: ifeq 28
        // 12: aload 2
        // 13: invokevirtual java/util/Random.nextBoolean ()Z
        // 16: ifeq 28
        // 19: goto 20
        // 1c: invokestatic com/trolmastercard/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1f: athrow
        // 20: bipush -1
        // 21: goto 29
        // 24: invokestatic com/trolmastercard/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 27: athrow
        // 28: bipush 1
        // 29: i2f
        // 2a: fmul
        // 2b: freturn
        // try (4 -> 13): 14 java/lang/RuntimeException
        // try (10 -> 18): 18 java/lang/RuntimeException
    }

    public static float a(float param0, float param1, float param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: fload 0
        // 01: fload 1
        // 02: fsub
        // 03: invokestatic java/lang/Math.abs (F)F
        // 06: fload 2
        // 07: fcmpg
        // 08: ifgt 11
        // 0b: fload 0
        // 0c: freturn
        // 0d: invokestatic com/trolmastercard/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 10: athrow
        // 11: fload 0
        // 12: invokestatic java/lang/Math.abs (F)F
        // 15: fload 1
        // 16: invokestatic java/lang/Math.abs (F)F
        // 19: fcmpg
        // 1a: ifge 36
        // 1d: fload 1
        // 1e: fconst_0
        // 1f: fcmpl
        // 20: ifle 32
        // 23: goto 2a
        // 26: invokestatic com/trolmastercard/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 29: athrow
        // 2a: fload 1
        // 2b: fload 2
        // 2c: fsub
        // 2d: freturn
        // 2e: invokestatic com/trolmastercard/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 31: athrow
        // 32: fload 1
        // 33: fload 2
        // 34: fadd
        // 35: freturn
        // 36: fload 0
        // 37: fconst_0
        // 38: fcmpl
        // 39: ifle 44
        // 3c: fload 0
        // 3d: fload 2
        // 3e: fsub
        // 3f: freturn
        // 40: invokestatic com/trolmastercard/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 43: athrow
        // 44: fload 0
        // 45: fload 2
        // 46: fadd
        // 47: freturn
        // try (0 -> 9): 9 java/lang/RuntimeException
        // try (11 -> 21): 22 java/lang/RuntimeException
        // try (17 -> 28): 28 java/lang/RuntimeException
        // try (34 -> 42): 42 java/lang/RuntimeException
    }

    public static int a(double var0) {
        return Math.round((float)var0);
    }

    public static void a(int var0, Runnable var1) {
        String var2 = UUID.randomUUID().toString();

        Thread var10000;
        Thread var10001;
        Runnable var10002;
        StringBuilder var10003;
        String var10004;
        label17: {
            try {
                var10000 = new Thread;
                var10001 = var10000;
                var10002 = () -> {
                    try {
                        Thread.sleep(var0);
                    } catch (Exception var3x) {
                        var3x.printStackTrace();
                    }

                    var1.run();
                };
                var10003 = new StringBuilder();
                if (g0.a()) {
                    var10004 = "server sexmod thread ";
                    break label17;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            var10004 = "client sexmod thread ";
        }

        var10001./* $VF: Unable to resugar constructor */<init>(var10002, var10003.append(var10004).append(var2).toString());
        var10000.start();
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
