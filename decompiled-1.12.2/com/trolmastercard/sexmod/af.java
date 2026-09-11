package com.trolmastercard.sexmod;

import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.processor.IBone;

public class af {
    public static Vec3d[][] a(em var0, float var1, String var2, String var3, String var4, float var5, float var6, float var7, float var8, String var9) {
        Vec3d[] var10 = b(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
        return a(var10);
    }

    public static Vec3d[][] a(em var0, float var1, String var2, String var3, f7 var4, f7 var5) {
        Vec3d[] var6 = b(var0, var1, var2, var3, var4, var5);
        return b(var6);
    }

    static Vec3d[] b(em param0, float param1, String param2, String param3, f7 param4, f7 param5) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: aload 2
        // 002: invokevirtual com/trolmastercard/sexmod/em.b (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3d;
        // 005: astore 6
        // 007: aload 0
        // 008: aload 3
        // 009: invokevirtual com/trolmastercard/sexmod/em.b (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3d;
        // 00c: astore 7
        // 00e: bipush 8
        // 010: anewarray 34
        // 013: astore 8
        // 015: aload 4
        // 017: getfield com/trolmastercard/sexmod/f7.a F
        // 01a: fconst_0
        // 01b: fcmpl
        // 01c: ifne 101
        // 01f: aload 5
        // 021: getfield com/trolmastercard/sexmod/f7.a F
        // 024: fconst_0
        // 025: fcmpl
        // 026: ifne 101
        // 029: goto 030
        // 02c: invokestatic com/trolmastercard/sexmod/af.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 02f: athrow
        // 030: aload 8
        // 032: bipush 0
        // 033: new net/minecraft/util/math/Vec3d
        // 036: dup
        // 037: dconst_0
        // 038: aload 4
        // 03a: getfield com/trolmastercard/sexmod/f7.c F
        // 03d: f2d
        // 03e: aload 4
        // 040: getfield com/trolmastercard/sexmod/f7.b F
        // 043: f2d
        // 044: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 047: aastore
        // 048: aload 8
        // 04a: bipush 1
        // 04b: new net/minecraft/util/math/Vec3d
        // 04e: dup
        // 04f: dconst_0
        // 050: aload 4
        // 052: getfield com/trolmastercard/sexmod/f7.c F
        // 055: fneg
        // 056: f2d
        // 057: aload 4
        // 059: getfield com/trolmastercard/sexmod/f7.b F
        // 05c: f2d
        // 05d: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 060: aastore
        // 061: aload 8
        // 063: bipush 2
        // 064: new net/minecraft/util/math/Vec3d
        // 067: dup
        // 068: dconst_0
        // 069: aload 4
        // 06b: getfield com/trolmastercard/sexmod/f7.c F
        // 06e: fneg
        // 06f: f2d
        // 070: aload 4
        // 072: getfield com/trolmastercard/sexmod/f7.b F
        // 075: fneg
        // 076: f2d
        // 077: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 07a: aastore
        // 07b: aload 8
        // 07d: bipush 3
        // 07e: new net/minecraft/util/math/Vec3d
        // 081: dup
        // 082: dconst_0
        // 083: aload 4
        // 085: getfield com/trolmastercard/sexmod/f7.c F
        // 088: f2d
        // 089: aload 4
        // 08b: getfield com/trolmastercard/sexmod/f7.b F
        // 08e: fneg
        // 08f: f2d
        // 090: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 093: aastore
        // 094: aload 8
        // 096: bipush 4
        // 097: new net/minecraft/util/math/Vec3d
        // 09a: dup
        // 09b: dconst_0
        // 09c: aload 5
        // 09e: getfield com/trolmastercard/sexmod/f7.c F
        // 0a1: f2d
        // 0a2: aload 5
        // 0a4: getfield com/trolmastercard/sexmod/f7.b F
        // 0a7: f2d
        // 0a8: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 0ab: aastore
        // 0ac: aload 8
        // 0ae: bipush 5
        // 0af: new net/minecraft/util/math/Vec3d
        // 0b2: dup
        // 0b3: dconst_0
        // 0b4: aload 5
        // 0b6: getfield com/trolmastercard/sexmod/f7.c F
        // 0b9: fneg
        // 0ba: f2d
        // 0bb: aload 5
        // 0bd: getfield com/trolmastercard/sexmod/f7.b F
        // 0c0: f2d
        // 0c1: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 0c4: aastore
        // 0c5: aload 8
        // 0c7: bipush 6
        // 0c9: new net/minecraft/util/math/Vec3d
        // 0cc: dup
        // 0cd: dconst_0
        // 0ce: aload 5
        // 0d0: getfield com/trolmastercard/sexmod/f7.c F
        // 0d3: fneg
        // 0d4: f2d
        // 0d5: aload 5
        // 0d7: getfield com/trolmastercard/sexmod/f7.b F
        // 0da: fneg
        // 0db: f2d
        // 0dc: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 0df: aastore
        // 0e0: aload 8
        // 0e2: bipush 7
        // 0e4: new net/minecraft/util/math/Vec3d
        // 0e7: dup
        // 0e8: dconst_0
        // 0e9: aload 5
        // 0eb: getfield com/trolmastercard/sexmod/f7.c F
        // 0ee: f2d
        // 0ef: aload 5
        // 0f1: getfield com/trolmastercard/sexmod/f7.b F
        // 0f4: fneg
        // 0f5: f2d
        // 0f6: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 0f9: aastore
        // 0fa: goto 1cb
        // 0fd: invokestatic com/trolmastercard/sexmod/af.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 100: athrow
        // 101: aload 8
        // 103: bipush 0
        // 104: new net/minecraft/util/math/Vec3d
        // 107: dup
        // 108: aload 4
        // 10a: getfield com/trolmastercard/sexmod/f7.a F
        // 10d: f2d
        // 10e: aload 4
        // 110: getfield com/trolmastercard/sexmod/f7.c F
        // 113: f2d
        // 114: dconst_0
        // 115: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 118: aastore
        // 119: aload 8
        // 11b: bipush 1
        // 11c: new net/minecraft/util/math/Vec3d
        // 11f: dup
        // 120: aload 4
        // 122: getfield com/trolmastercard/sexmod/f7.a F
        // 125: fneg
        // 126: f2d
        // 127: aload 4
        // 129: getfield com/trolmastercard/sexmod/f7.c F
        // 12c: f2d
        // 12d: dconst_0
        // 12e: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 131: aastore
        // 132: aload 8
        // 134: bipush 2
        // 135: new net/minecraft/util/math/Vec3d
        // 138: dup
        // 139: aload 4
        // 13b: getfield com/trolmastercard/sexmod/f7.a F
        // 13e: fneg
        // 13f: f2d
        // 140: aload 4
        // 142: getfield com/trolmastercard/sexmod/f7.c F
        // 145: fneg
        // 146: f2d
        // 147: dconst_0
        // 148: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 14b: aastore
        // 14c: aload 8
        // 14e: bipush 3
        // 14f: new net/minecraft/util/math/Vec3d
        // 152: dup
        // 153: aload 4
        // 155: getfield com/trolmastercard/sexmod/f7.a F
        // 158: f2d
        // 159: aload 4
        // 15b: getfield com/trolmastercard/sexmod/f7.c F
        // 15e: fneg
        // 15f: f2d
        // 160: dconst_0
        // 161: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 164: aastore
        // 165: aload 8
        // 167: bipush 4
        // 168: new net/minecraft/util/math/Vec3d
        // 16b: dup
        // 16c: aload 5
        // 16e: getfield com/trolmastercard/sexmod/f7.a F
        // 171: f2d
        // 172: aload 5
        // 174: getfield com/trolmastercard/sexmod/f7.c F
        // 177: f2d
        // 178: dconst_0
        // 179: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 17c: aastore
        // 17d: aload 8
        // 17f: bipush 5
        // 180: new net/minecraft/util/math/Vec3d
        // 183: dup
        // 184: aload 5
        // 186: getfield com/trolmastercard/sexmod/f7.a F
        // 189: fneg
        // 18a: f2d
        // 18b: aload 5
        // 18d: getfield com/trolmastercard/sexmod/f7.c F
        // 190: f2d
        // 191: dconst_0
        // 192: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 195: aastore
        // 196: aload 8
        // 198: bipush 6
        // 19a: new net/minecraft/util/math/Vec3d
        // 19d: dup
        // 19e: aload 5
        // 1a0: getfield com/trolmastercard/sexmod/f7.a F
        // 1a3: fneg
        // 1a4: f2d
        // 1a5: aload 5
        // 1a7: getfield com/trolmastercard/sexmod/f7.c F
        // 1aa: fneg
        // 1ab: f2d
        // 1ac: dconst_0
        // 1ad: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 1b0: aastore
        // 1b1: aload 8
        // 1b3: bipush 7
        // 1b5: new net/minecraft/util/math/Vec3d
        // 1b8: dup
        // 1b9: aload 5
        // 1bb: getfield com/trolmastercard/sexmod/f7.a F
        // 1be: f2d
        // 1bf: aload 5
        // 1c1: getfield com/trolmastercard/sexmod/f7.c F
        // 1c4: fneg
        // 1c5: f2d
        // 1c6: dconst_0
        // 1c7: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 1ca: aastore
        // 1cb: bipush 0
        // 1cc: istore 9
        // 1ce: iload 9
        // 1d0: aload 8
        // 1d2: arraylength
        // 1d3: if_icmpge 1ee
        // 1d6: aload 8
        // 1d8: iload 9
        // 1da: aload 8
        // 1dc: iload 9
        // 1de: aaload
        // 1df: fload 1
        // 1e0: invokestatic com/trolmastercard/sexmod/ck.a (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 1e3: aastore
        // 1e4: iinc 9 1
        // 1e7: goto 1ce
        // 1ea: invokestatic com/trolmastercard/sexmod/af.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1ed: athrow
        // 1ee: bipush 0
        // 1ef: istore 9
        // 1f1: iload 9
        // 1f3: bipush 4
        // 1f4: if_icmpge 210
        // 1f7: aload 8
        // 1f9: iload 9
        // 1fb: aload 8
        // 1fd: iload 9
        // 1ff: aaload
        // 200: aload 6
        // 202: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 205: aastore
        // 206: iinc 9 1
        // 209: goto 1f1
        // 20c: invokestatic com/trolmastercard/sexmod/af.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 20f: athrow
        // 210: bipush 4
        // 211: istore 9
        // 213: iload 9
        // 215: bipush 8
        // 217: if_icmpge 233
        // 21a: aload 8
        // 21c: iload 9
        // 21e: aload 8
        // 220: iload 9
        // 222: aaload
        // 223: aload 7
        // 225: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 228: aastore
        // 229: iinc 9 1
        // 22c: goto 213
        // 22f: invokestatic com/trolmastercard/sexmod/af.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 232: athrow
        // 233: aload 8
        // 235: areturn
        // try (11 -> 21): 22 java/lang/RuntimeException
        // try (16 -> 137): 137 java/lang/RuntimeException
        // try (253 -> 267): 267 java/lang/RuntimeException
        // try (271 -> 284): 284 java/lang/RuntimeException
        // try (288 -> 301): 301 java/lang/RuntimeException
    }

    static Vec3d[][] b(Vec3d[] var0) {
        Vec3d[][] var1 = new Vec3d[6][4];
        var1[0][0] = var0[0];
        var1[0][1] = var0[1];
        var1[0][2] = var0[2];
        var1[0][3] = var0[3];
        var1[1][0] = var0[4];
        var1[1][1] = var0[5];
        var1[1][2] = var0[6];
        var1[1][3] = var0[7];
        var1[2][0] = var0[1];
        var1[2][1] = var0[2];
        var1[2][2] = var0[6];
        var1[2][3] = var0[5];
        var1[3][0] = var0[3];
        var1[3][1] = var0[7];
        var1[3][2] = var0[4];
        var1[3][3] = var0[0];
        var1[4][0] = var0[1];
        var1[4][1] = var0[0];
        var1[4][2] = var0[4];
        var1[4][3] = var0[5];
        var1[5][0] = var0[2];
        var1[5][1] = var0[3];
        var1[5][2] = var0[7];
        var1[5][3] = var0[6];
        return var1;
    }

    static Vec3d[] b(em var0, float var1, String var2, String var3, String var4, float var5, float var6, float var7, float var8, String var9) {
        IBone var10 = var0.b().getBone(var9);
        if (var10 == null) {
            Vec3d[] var23 = new Vec3d[12];
            Arrays.fill(var23, Vec3d.field_186680_a);
            return var23;
        }

        float var11 = gc.d(var10.getRotationY());
        float var12 = gc.d(var10.getRotationZ());
        Vec3d var13 = var0.b(var2);
        Vec3d var14 = var0.b(var3);
        Vec3d var15 = var0.b(var4);
        Vec3d[] var16 = new Vec3d[]{
            new Vec3d(var5, 0.0, -var6),
            new Vec3d(-var5, 0.0, -var6),
            new Vec3d(-var5, 0.0, var6),
            new Vec3d(var5, 0.0, var6),
            new Vec3d(var5, var6, 0.0),
            new Vec3d(-var5, var6, 0.0),
            new Vec3d(-var5, -var6, 0.0),
            new Vec3d(var5, -var6, 0.0),
            new Vec3d(var7, 0.0, -var8),
            new Vec3d(-var7, 0.0, -var8),
            new Vec3d(-var7, 0.0, var8),
            new Vec3d(var7, 0.0, var8)
        };
        int var17 = 0;

        try {
            while (var17 < var16.length) {
                var16[var17] = ck.a(var16[var17], var1);
                var17++;
            }
        } catch (RuntimeException var22) {
            throw a(var22);
        }

        var17 = 0;

        try {
            while (var17 < 4) {
                var16[var17] = ck.a(var16[var17], 0.0F, var11, var12);
                var17++;
            }
        } catch (RuntimeException var21) {
            throw a(var21);
        }

        var17 = 0;

        try {
            while (var17 < 4) {
                var16[var17] = var16[var17].func_178787_e(var13);
                var17++;
            }
        } catch (RuntimeException var20) {
            throw a(var20);
        }

        var17 = 4;

        try {
            while (var17 < 8) {
                var16[var17] = var16[var17].func_178787_e(var14);
                var17++;
            }
        } catch (RuntimeException var19) {
            throw a(var19);
        }

        var17 = 8;

        try {
            while (var17 < 12) {
                var16[var17] = var16[var17].func_178787_e(var15);
                var17++;
            }

            return var16;
        } catch (RuntimeException var18) {
            throw a(var18);
        }
    }

    static Vec3d[][] a(Vec3d[] var0) {
        Vec3d[][] var1 = new Vec3d[10][4];
        var1[0][0] = var0[0];
        var1[0][1] = var0[1];
        var1[0][2] = var0[5];
        var1[0][3] = var0[4];
        var1[1][0] = var0[1];
        var1[1][1] = var0[2];
        var1[1][2] = var0[6];
        var1[1][3] = var0[5];
        var1[2][0] = var0[3];
        var1[2][1] = var0[2];
        var1[2][2] = var0[6];
        var1[2][3] = var0[7];
        var1[3][0] = var0[0];
        var1[3][1] = var0[4];
        var1[3][2] = var0[7];
        var1[3][3] = var0[3];
        var1[4][0] = var0[0];
        var1[4][1] = var0[1];
        var1[4][2] = var0[2];
        var1[4][3] = var0[3];
        var1[5][0] = var0[4];
        var1[5][1] = var0[5];
        var1[5][2] = var0[9];
        var1[5][3] = var0[8];
        var1[6][0] = var0[9];
        var1[6][1] = var0[10];
        var1[6][2] = var0[6];
        var1[6][3] = var0[5];
        var1[7][0] = var0[10];
        var1[7][1] = var0[11];
        var1[7][2] = var0[7];
        var1[7][3] = var0[6];
        var1[8][0] = var0[4];
        var1[8][1] = var0[7];
        var1[8][2] = var0[11];
        var1[8][3] = var0[8];
        var1[9][0] = var0[8];
        var1[9][1] = var0[9];
        var1[9][2] = var0[10];
        var1[9][3] = var0[11];
        return var1;
    }

    public static void a(BufferBuilder var0, Vec3d[][] var1, gv var2) {
        for (Vec3d[] var6 : var1) {
            for (Vec3d var10 : var6) {
                var0.func_181662_b(var10.field_72450_a, var10.field_72448_b, var10.field_72449_c)
                    .func_187315_a(0.0, 0.0)
                    .func_181669_b(var2.a, var2.d, var2.c, var2.b)
                    .func_181675_d();
            }
        }
    }

    public static void a(Minecraft var0, em var1, float var2) {
        EntityPlayerSP var3 = var0.field_71439_g;

        try {
            if (var3 == null) {
                return;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        GlStateManager.func_179137_b(0.0, 0.01, 0.0);
        Entity var4 = ((d_)var0.func_175598_ae().func_78713_a(var1)).c(var1);

        Vec3d var10000;
        label22: {
            try {
                if (var1.Q()) {
                    var10000 = var1.o();
                    break label22;
                }
            } catch (RuntimeException var8) {
                throw a(var8);
            }

            var10000 = b6.a(new Vec3d(var4.field_70142_S, var4.field_70137_T, var4.field_70136_U), var4.func_174791_d(), var2);
        }

        Vec3d var5 = var10000;
        Vec3d var6 = b6.a(new Vec3d(var3.field_70142_S, var3.field_70137_T, var3.field_70136_U), var3.func_174791_d(), var2);
        Vec3d var7 = var5.func_178788_d(var6);
        var7 = var1.a(var7, var2);
        GlStateManager.func_179137_b(var7.field_72450_a, var7.field_72448_b, var7.field_72449_c);
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
