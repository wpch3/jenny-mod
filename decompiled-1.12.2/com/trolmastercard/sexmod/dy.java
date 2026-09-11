package com.trolmastercard.sexmod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.vecmath.Vector4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class dy extends d6<e3> {
    static final Vec3i w = new Vec3i(255, 255, 255);
    static final float K = -420.69F;
    static final float A = 8.0F;
    static final float L = 3.0F;
    static final Vec3d G = new Vec3d(10.0, -20.0, -10.0);
    static final float J = 0.1F;
    static final HashSet<String> D = new HashSet<>(
        Arrays.asList(
            "meatTorso",
            "meatCheekR",
            "meatCheekL",
            "meatFootR",
            "meatFootL",
            "meatShinR",
            "meatShinL",
            "meatLegL",
            "meatLegR",
            "nippleR",
            "nippleL",
            "preggy",
            "shoeL",
            "shoeR",
            "frontAndInside",
            "Lside",
            "Rside",
            "cheekR",
            "cheekL",
            "fuckhole",
            "head",
            "nose",
            "neck",
            "armL",
            "lowerArmL",
            "armR",
            "lowerArmR",
            "torso",
            "LegL",
            "LegR",
            "shinL",
            "shinR"
        )
    );
    static final HashSet<String> M = new HashSet<>(Arrays.asList("lashR", "lashL", "closedR", "closedL", "browL", "browR", "closedL", "closedL"));
    static final HashSet<String> C = new HashSet<>(Arrays.asList("meatLegR", "meatShinR", "meatFootR", "boobR", "boobR1", "boobR2"));
    static Minecraft y;
    float v = 0.0F;
    boolean u = false;
    boolean F = false;
    static float B = 0.0F;
    float z = 0.0F;
    static float H = 0.0F;
    static float t = 0.0F;
    static float I = 0.0F;
    static float E = 0.0F;
    static float N = 0.0F;
    static float x = 0.0F;

    public dy(RenderManager var1, AnimatedGeoModel var2, double var3) {
        super(var1, var2, var3);
        y = Minecraft.func_71410_x();
    }

    protected ResourceLocation a(e3 var1) throws IOException {
        UUID var3 = var1.ae();
        if (var3 == null) {
            var3 = var1.e();
        }

        label43: {
            try {
                if (!(var1.field_70170_p instanceof gj) && var3 != null) {
                    break label43;
                }
            } catch (IOException var6) {
                throw a(var6);
            }

            ResourceLocation var2 = l.get(y.func_110432_I().func_148256_e().getId());

            try {
                if (var2 == null) {
                    return this.a(y.func_110432_I().func_148256_e().getId(), var1.field_70170_p);
                }

                return var2;
            } catch (IOException var5) {
                throw a(var5);
            }
        }

        ResourceLocation var7 = l.get(var3);

        try {
            if (var7 == null) {
                return this.a(var3, var1.field_70170_p);
            }
        } catch (IOException var4) {
            throw a(var4);
        }

        return var7;
    }

    public static void a(em var0, float var1) {
        y.func_175598_ae().func_188391_a(var0, 0.0, 0.0, 0.0, -420.69F, var1, false);
    }

    public static void a(float var0) {
        try {
            if (!(y.func_175606_aa() instanceof EntityPlayer)) {
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        EntityPlayer var1 = (EntityPlayer)y.func_175606_aa();
        float var2 = var1.field_70140_Q - var1.field_70141_P;
        float var3 = -(var1.field_70140_Q + var2 * var0);
        float var4 = var1.field_71107_bF + (var1.field_71109_bG - var1.field_71107_bF) * var0;
        float var5 = MathHelper.func_76126_a(var3 * (float) Math.PI) * var4 * 0.5F;
        GlStateManager.func_179137_b(
            Math.cos(y.field_71439_g.field_70177_z * (Math.PI / 180.0)) * var5,
            Math.abs(MathHelper.func_76134_b(var3 * (float) Math.PI) * var4),
            Math.sin(y.field_71439_g.field_70177_z * (Math.PI / 180.0)) * var5
        );
    }

    public void a(GeoModel var1, e3 var2, float var3, float var4, float var5, float var6, float var7) {
        super.a(var1, var2, var3, var4, var5, var6, var2.ar);
    }

    public void func_76979_b(Entity param1, double param2, double param4, double param6, float param8, float param9) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: instanceof com/trolmastercard/sexmod/e3
        // 04: ifne 1a
        // 07: aload 0
        // 08: aload 1
        // 09: dload 2
        // 0a: dload 4
        // 0c: dload 6
        // 0e: fload 8
        // 10: fload 9
        // 12: invokespecial com/trolmastercard/sexmod/d6.func_76979_b (Lnet/minecraft/entity/Entity;DDDFF)V
        // 15: return
        // 16: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 19: athrow
        // 1a: aload 1
        // 1b: checkcast com/trolmastercard/sexmod/e3
        // 1e: astore 10
        // 20: aload 10
        // 22: invokevirtual com/trolmastercard/sexmod/e3.y ()Lcom/trolmastercard/sexmod/fp;
        // 25: getstatic com/trolmastercard/sexmod/fp.PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 28: if_acmpeq 3d
        // 2b: aload 10
        // 2d: invokevirtual com/trolmastercard/sexmod/e3.y ()Lcom/trolmastercard/sexmod/fp;
        // 30: getstatic com/trolmastercard/sexmod/fp.SHOULDER_IDLE Lcom/trolmastercard/sexmod/fp;
        // 33: if_acmpne 42
        // 36: goto 3d
        // 39: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 3c: athrow
        // 3d: return
        // 3e: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 41: athrow
        // 42: aload 0
        // 43: aload 1
        // 44: dload 2
        // 45: dload 4
        // 47: dload 6
        // 49: fload 8
        // 4b: fload 9
        // 4d: invokespecial com/trolmastercard/sexmod/d6.func_76979_b (Lnet/minecraft/entity/Entity;DDDFF)V
        // 50: return
        // try (0 -> 12): 12 java/lang/RuntimeException
        // try (17 -> 25): 26 java/lang/RuntimeException
        // try (21 -> 29): 29 java/lang/RuntimeException
    }

    public static Vec3d a(World var0, em var1, UUID var2, double var3, double var5, double var7) {
        try {
            if (var0 == null) {
                return new Vec3d(var3, var5, var7);
            }
        } catch (RuntimeException var15) {
            throw a(var15);
        }

        try {
            if (var2 == null) {
                return new Vec3d(var3, var5, var7);
            }
        } catch (RuntimeException var12) {
            throw a(var12);
        }

        try {
            if (var1 == null) {
                return new Vec3d(var3, var5, var7);
            }
        } catch (RuntimeException var14) {
            throw a(var14);
        }

        EntityPlayer var9 = var0.func_152378_a(var2);

        try {
            if (var9 == null) {
                return new Vec3d(var3, var5, var7);
            }
        } catch (RuntimeException var13) {
            throw a(var13);
        }

        Vec3d var10 = var9.func_174791_d();
        Vec3d var11 = y.field_71439_g.func_174791_d();
        var1.field_70760_ar = var9.field_70758_at;
        var1.field_70761_aq = var9.field_70759_as;
        var1.b(fp.START_THROWING);
        return var10.func_178788_d(var11);
    }

    public void a(e3 param1, double param2, double param4, double param6, float param8, float param9) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: aload 1
        // 002: putfield com/trolmastercard/sexmod/dy.j Lcom/trolmastercard/sexmod/em;
        // 005: aload 0
        // 006: ldc -420.69
        // 008: fload 8
        // 00a: fcmpl
        // 00b: ifne 027
        // 00e: aload 1
        // 00f: invokevirtual com/trolmastercard/sexmod/e3.y ()Lcom/trolmastercard/sexmod/fp;
        // 012: getstatic com/trolmastercard/sexmod/fp.SHOULDER_IDLE Lcom/trolmastercard/sexmod/fp;
        // 015: if_acmpne 027
        // 018: goto 01f
        // 01b: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 01e: athrow
        // 01f: bipush 1
        // 020: goto 028
        // 023: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 026: athrow
        // 027: bipush 0
        // 028: putfield com/trolmastercard/sexmod/dy.u Z
        // 02b: aload 0
        // 02c: ldc -420.69
        // 02e: fload 8
        // 030: fcmpl
        // 031: ifne 04d
        // 034: aload 1
        // 035: invokevirtual com/trolmastercard/sexmod/e3.y ()Lcom/trolmastercard/sexmod/fp;
        // 038: getstatic com/trolmastercard/sexmod/fp.PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 03b: if_acmpne 04d
        // 03e: goto 045
        // 041: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 044: athrow
        // 045: bipush 1
        // 046: goto 04e
        // 049: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 04c: athrow
        // 04d: bipush 0
        // 04e: putfield com/trolmastercard/sexmod/dy.F Z
        // 051: aload 0
        // 052: aload 1
        // 053: getfield com/trolmastercard/sexmod/e3.field_70170_p Lnet/minecraft/world/World;
        // 056: aload 1
        // 057: invokevirtual com/trolmastercard/sexmod/e3.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 05a: bipush 1
        // 05b: invokevirtual net/minecraft/world/World.func_175721_c (Lnet/minecraft/util/math/BlockPos;Z)I
        // 05e: i2f
        // 05f: putfield com/trolmastercard/sexmod/dy.z F
        // 062: aload 0
        // 063: fload 9
        // 065: putfield com/trolmastercard/sexmod/dy.v F
        // 068: fload 8
        // 06a: putstatic com/trolmastercard/sexmod/dy.B F
        // 06d: aload 1
        // 06e: invokevirtual com/trolmastercard/sexmod/e3.y ()Lcom/trolmastercard/sexmod/fp;
        // 071: astore 10
        // 073: aload 1
        // 074: invokevirtual com/trolmastercard/sexmod/e3.e ()Ljava/util/UUID;
        // 077: astore 11
        // 079: aload 1
        // 07a: invokevirtual com/trolmastercard/sexmod/e3.h ()Z
        // 07d: ifeq 0a5
        // 080: aload 1
        // 081: getfield com/trolmastercard/sexmod/e3.field_70170_p Lnet/minecraft/world/World;
        // 084: aload 1
        // 085: aload 11
        // 087: dload 2
        // 088: dload 4
        // 08a: dload 6
        // 08c: invokestatic com/trolmastercard/sexmod/dy.a (Lnet/minecraft/world/World;Lcom/trolmastercard/sexmod/em;Ljava/util/UUID;DDD)Lnet/minecraft/util/math/Vec3d;
        // 08f: astore 12
        // 091: aload 12
        // 093: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 096: dstore 2
        // 097: aload 12
        // 099: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 09c: dstore 4
        // 09e: aload 12
        // 0a0: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 0a3: dstore 6
        // 0a5: aload 10
        // 0a7: getstatic com/trolmastercard/sexmod/fp.THROWN Lcom/trolmastercard/sexmod/fp;
        // 0aa: if_acmpeq 0bc
        // 0ad: aload 10
        // 0af: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 0b2: if_acmpne 10d
        // 0b5: goto 0bc
        // 0b8: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0bb: athrow
        // 0bc: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 0bf: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 0c2: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 0c5: ifne 0f1
        // 0c8: goto 0cf
        // 0cb: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0ce: athrow
        // 0cf: fload 8
        // 0d1: ldc -420.69
        // 0d3: fcmpl
        // 0d4: ifne 0f1
        // 0d7: goto 0de
        // 0da: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0dd: athrow
        // 0de: aload 1
        // 0df: invokevirtual com/trolmastercard/sexmod/e3.h ()Z
        // 0e2: ifne 0f1
        // 0e5: goto 0ec
        // 0e8: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0eb: athrow
        // 0ec: return
        // 0ed: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0f0: athrow
        // 0f1: aload 1
        // 0f2: invokevirtual com/trolmastercard/sexmod/e3.h ()Z
        // 0f5: ifne 10d
        // 0f8: aload 1
        // 0f9: invokevirtual com/trolmastercard/sexmod/e3.I ()Ljava/lang/Float;
        // 0fc: invokevirtual java/lang/Float.floatValue ()F
        // 0ff: fstore 12
        // 101: aload 1
        // 102: fload 12
        // 104: putfield com/trolmastercard/sexmod/e3.field_70760_ar F
        // 107: aload 1
        // 108: fload 12
        // 10a: putfield com/trolmastercard/sexmod/e3.field_70761_aq F
        // 10d: aload 1
        // 10e: aload 10
        // 110: invokestatic com/trolmastercard/sexmod/dy.a (Lcom/trolmastercard/sexmod/em;Lcom/trolmastercard/sexmod/fp;)Z
        // 113: ifeq 28e
        // 116: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 119: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 11c: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 11f: aload 11
        // 121: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 124: ifeq 1d6
        // 127: goto 12e
        // 12a: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 12d: athrow
        // 12e: ldc -420.69
        // 130: fload 8
        // 132: fcmpl
        // 133: ifeq 142
        // 136: goto 13d
        // 139: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 13c: athrow
        // 13d: return
        // 13e: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 141: athrow
        // 142: aload 1
        // 143: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 146: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 149: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 14c: ldc 180.0
        // 14e: fadd
        // 14f: putfield com/trolmastercard/sexmod/e3.field_70761_aq F
        // 152: aload 1
        // 153: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 156: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 159: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 15c: ldc 180.0
        // 15e: fadd
        // 15f: putfield com/trolmastercard/sexmod/e3.field_70760_ar F
        // 162: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 165: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 168: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70040_Z ()Lnet/minecraft/util/math/Vec3d;
        // 16b: astore 12
        // 16d: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 170: aload 12
        // 172: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 175: aload 12
        // 177: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 17a: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 17d: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 180: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70047_e ()F
        // 183: f2d
        // 184: dadd
        // 185: aload 12
        // 187: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 18a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 18d: new net/minecraft/util/math/Vec3d
        // 190: dup
        // 191: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 194: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 197: getfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
        // 19a: invokestatic java/lang/Math.abs (F)F
        // 19d: fneg
        // 19e: f2d
        // 19f: dconst_0
        // 1a0: dconst_0
        // 1a1: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 1a4: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 1a7: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1aa: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 1ad: invokestatic com/trolmastercard/sexmod/e3.b (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 1b0: astore 13
        // 1b2: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 1b5: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1b8: getfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
        // 1bb: aload 13
        // 1bd: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 1c0: d2f
        // 1c1: fconst_0
        // 1c2: aload 13
        // 1c4: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 1c7: d2f
        // 1c8: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 1cb: dconst_0
        // 1cc: dstore 2
        // 1cd: dconst_0
        // 1ce: dstore 4
        // 1d0: dconst_0
        // 1d1: dstore 6
        // 1d3: goto 3de
        // 1d6: aload 1
        // 1d7: invokevirtual com/trolmastercard/sexmod/e3.h ()Z
        // 1da: ifeq 201
        // 1dd: aload 11
        // 1df: ifnull 201
        // 1e2: goto 1e9
        // 1e5: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1e8: athrow
        // 1e9: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 1ec: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1ef: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 1f2: aload 11
        // 1f4: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 1f7: ifeq 26b
        // 1fa: goto 201
        // 1fd: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 200: athrow
        // 201: aload 11
        // 203: ifnull 251
        // 206: goto 20d
        // 209: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 20c: athrow
        // 20d: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 210: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 213: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 216: aload 11
        // 218: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 21b: ifne 251
        // 21e: goto 225
        // 221: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 224: athrow
        // 225: aload 1
        // 226: getfield com/trolmastercard/sexmod/e3.field_70170_p Lnet/minecraft/world/World;
        // 229: aload 11
        // 22b: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // 22e: astore 12
        // 230: aload 12
        // 232: ifnull 24e
        // 235: aload 1
        // 236: aload 12
        // 238: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
        // 23b: putfield com/trolmastercard/sexmod/e3.field_70761_aq F
        // 23e: aload 1
        // 23f: aload 12
        // 241: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
        // 244: putfield com/trolmastercard/sexmod/e3.field_70760_ar F
        // 247: goto 24e
        // 24a: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 24d: athrow
        // 24e: goto 26b
        // 251: aload 1
        // 252: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 255: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 258: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 25b: putfield com/trolmastercard/sexmod/e3.field_70761_aq F
        // 25e: aload 1
        // 25f: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 262: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 265: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 268: putfield com/trolmastercard/sexmod/e3.field_70760_ar F
        // 26b: aload 1
        // 26c: aload 1
        // 26d: invokevirtual com/trolmastercard/sexmod/e3.e ()Ljava/util/UUID;
        // 270: fload 9
        // 272: invokestatic com/trolmastercard/sexmod/dy.a (Lcom/trolmastercard/sexmod/em;Ljava/util/UUID;F)Lnet/minecraft/util/math/Vec3d;
        // 275: astore 12
        // 277: aload 12
        // 279: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 27c: dstore 2
        // 27d: aload 12
        // 27f: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 282: dstore 4
        // 284: aload 12
        // 286: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 289: dstore 6
        // 28b: goto 3de
        // 28e: aload 0
        // 28f: getfield com/trolmastercard/sexmod/dy.u Z
        // 292: ifeq 30e
        // 295: fload 9
        // 297: invokestatic com/trolmastercard/sexmod/dy.a (F)V
        // 29a: new net/minecraft/util/math/Vec3d
        // 29d: dup
        // 29e: ldc -0.1
        // 2a0: ldc 0.2
        // 2a2: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 2a5: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 2a8: getfield net/minecraft/client/settings/GameSettings.field_74334_X F
        // 2ab: ldc 110.0
        // 2ad: fdiv
        // 2ae: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 2b1: f2d
        // 2b2: dconst_0
        // 2b3: dconst_0
        // 2b4: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 2b7: astore 12
        // 2b9: aload 12
        // 2bb: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 2be: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 2c1: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 2c4: invokestatic com/trolmastercard/sexmod/e3.b (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 2c7: astore 12
        // 2c9: aload 12
        // 2cb: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 2ce: dstore 2
        // 2cf: aload 12
        // 2d1: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 2d4: dstore 4
        // 2d6: aload 12
        // 2d8: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 2db: dstore 6
        // 2dd: aload 1
        // 2de: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 2e1: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 2e4: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 2e7: putfield com/trolmastercard/sexmod/e3.field_70761_aq F
        // 2ea: aload 1
        // 2eb: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 2ee: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 2f1: getfield net/minecraft/client/entity/EntityPlayerSP.field_70126_B F
        // 2f4: putfield com/trolmastercard/sexmod/e3.field_70760_ar F
        // 2f7: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 2fa: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 2fd: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70093_af ()Z
        // 300: ifeq 30b
        // 303: dload 4
        // 305: ldc2_w 0.075
        // 308: dsub
        // 309: dstore 4
        // 30b: goto 3de
        // 30e: aload 10
        // 310: getstatic com/trolmastercard/sexmod/fp.SHOULDER_IDLE Lcom/trolmastercard/sexmod/fp;
        // 313: if_acmpne 3a1
        // 316: aload 11
        // 318: ifnonnull 327
        // 31b: goto 322
        // 31e: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 321: athrow
        // 322: return
        // 323: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 326: athrow
        // 327: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 32a: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 32d: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 330: aload 11
        // 332: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 335: ifeq 350
        // 338: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 33b: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 33e: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 341: ifne 350
        // 344: goto 34b
        // 347: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 34a: athrow
        // 34b: return
        // 34c: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 34f: athrow
        // 350: aload 1
        // 351: getfield com/trolmastercard/sexmod/e3.field_70170_p Lnet/minecraft/world/World;
        // 354: aload 11
        // 356: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // 359: astore 12
        // 35b: aload 12
        // 35d: ifnonnull 365
        // 360: return
        // 361: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 364: athrow
        // 365: aload 12
        // 367: fload 9
        // 369: invokestatic com/trolmastercard/sexmod/dy.a (Lnet/minecraft/entity/player/EntityPlayer;F)Ljavax/vecmath/Vector4f;
        // 36c: astore 13
        // 36e: aload 13
        // 370: getfield javax/vecmath/Vector4f.x F
        // 373: f2d
        // 374: dstore 2
        // 375: aload 13
        // 377: getfield javax/vecmath/Vector4f.y F
        // 37a: f2d
        // 37b: dstore 4
        // 37d: aload 13
        // 37f: getfield javax/vecmath/Vector4f.z F
        // 382: f2d
        // 383: dstore 6
        // 385: aload 1
        // 386: aload 13
        // 388: getfield javax/vecmath/Vector4f.w F
        // 38b: putfield com/trolmastercard/sexmod/e3.field_70761_aq F
        // 38e: aload 12
        // 390: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70093_af ()Z
        // 393: ifeq 39e
        // 396: dload 4
        // 398: ldc2_w 0.32
        // 39b: dsub
        // 39c: dstore 4
        // 39e: goto 3de
        // 3a1: aload 10
        // 3a3: getstatic com/trolmastercard/sexmod/fp.PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 3a6: if_acmpne 3de
        // 3a9: aload 11
        // 3ab: ifnull 3de
        // 3ae: goto 3b5
        // 3b1: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 3b4: athrow
        // 3b5: aload 1
        // 3b6: getfield com/trolmastercard/sexmod/e3.field_70170_p Lnet/minecraft/world/World;
        // 3b9: aload 11
        // 3bb: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // 3be: astore 12
        // 3c0: aload 12
        // 3c2: ifnull 3de
        // 3c5: aload 1
        // 3c6: aload 12
        // 3c8: getfield net/minecraft/entity/player/EntityPlayer.field_70758_at F
        // 3cb: putfield com/trolmastercard/sexmod/e3.field_70760_ar F
        // 3ce: aload 1
        // 3cf: aload 12
        // 3d1: getfield net/minecraft/entity/player/EntityPlayer.field_70759_as F
        // 3d4: putfield com/trolmastercard/sexmod/e3.field_70761_aq F
        // 3d7: goto 3de
        // 3da: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 3dd: athrow
        // 3de: aload 0
        // 3df: aload 1
        // 3e0: dload 2
        // 3e1: dload 4
        // 3e3: dload 6
        // 3e5: fload 8
        // 3e7: fload 9
        // 3e9: invokespecial com/trolmastercard/sexmod/d6.a (Lcom/trolmastercard/sexmod/em;DDDFF)V
        // 3ec: aload 1
        // 3ed: aload 10
        // 3ef: invokestatic com/trolmastercard/sexmod/dy.a (Lcom/trolmastercard/sexmod/em;Lcom/trolmastercard/sexmod/fp;)Z
        // 3f2: ifeq 42a
        // 3f5: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 3f8: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 3fb: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 3fe: ifne 42a
        // 401: goto 408
        // 404: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 407: athrow
        // 408: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 40b: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 40e: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 411: aload 11
        // 413: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 416: ifeq 42a
        // 419: goto 420
        // 41c: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 41f: athrow
        // 420: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 423: goto 42a
        // 426: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 429: athrow
        // 42a: return
        // try (0 -> 12): 13 java/lang/RuntimeException
        // try (8 -> 17): 17 java/lang/RuntimeException
        // try (20 -> 30): 31 java/lang/RuntimeException
        // try (26 -> 35): 35 java/lang/RuntimeException
        // try (80 -> 86): 87 java/lang/RuntimeException
        // try (83 -> 93): 94 java/lang/RuntimeException
        // try (89 -> 100): 101 java/lang/RuntimeException
        // try (96 -> 106): 107 java/lang/RuntimeException
        // try (103 -> 110): 110 java/lang/RuntimeException
        // try (125 -> 135): 136 java/lang/RuntimeException
        // try (129 -> 142): 143 java/lang/RuntimeException
        // try (138 -> 146): 146 java/lang/RuntimeException
        // try (213 -> 218): 219 java/lang/RuntimeException
        // try (216 -> 227): 228 java/lang/RuntimeException
        // try (221 -> 232): 233 java/lang/RuntimeException
        // try (230 -> 241): 242 java/lang/RuntimeException
        // try (249 -> 259): 260 java/lang/RuntimeException
        // try (343 -> 348): 349 java/lang/RuntimeException
        // try (346 -> 352): 352 java/lang/RuntimeException
        // try (354 -> 364): 365 java/lang/RuntimeException
        // try (360 -> 368): 368 java/lang/RuntimeException
        // try (375 -> 378): 378 java/lang/RuntimeException
        // try (408 -> 413): 414 java/lang/RuntimeException
        // try (421 -> 431): 432 java/lang/RuntimeException
        // try (434 -> 450): 451 java/lang/RuntimeException
        // try (446 -> 459): 460 java/lang/RuntimeException
        // try (453 -> 463): 464 java/lang/RuntimeException
    }

    public static boolean a(em param0, fp param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 04: if_acmpne 1b
        // 07: aload 0
        // 08: invokevirtual com/trolmastercard/sexmod/em.h ()Z
        // 0b: ifne 1b
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 14: athrow
        // 15: bipush 0
        // 16: ireturn
        // 17: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1a: athrow
        // 1b: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 1e: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 21: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 24: ifeq 49
        // 27: aload 1
        // 28: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 2b: if_acmpeq 43
        // 2e: goto 35
        // 31: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 34: athrow
        // 35: aload 1
        // 36: getstatic com/trolmastercard/sexmod/fp.PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 39: if_acmpne 49
        // 3c: goto 43
        // 3f: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 42: athrow
        // 43: bipush 0
        // 44: ireturn
        // 45: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 48: athrow
        // 49: getstatic com/trolmastercard/sexmod/dy$a.a [I
        // 4c: aload 1
        // 4d: invokevirtual com/trolmastercard/sexmod/fp.ordinal ()I
        // 50: iaload
        // 51: tableswitch 41 1 5 35 35 35 35 35
        // 74: bipush 1
        // 75: ireturn
        // 76: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 79: athrow
        // 7a: bipush 0
        // 7b: ireturn
        // try (0 -> 6): 7 java/lang/RuntimeException
        // try (3 -> 11): 11 java/lang/RuntimeException
        // try (13 -> 20): 21 java/lang/RuntimeException
        // try (17 -> 26): 27 java/lang/RuntimeException
        // try (23 -> 31): 31 java/lang/RuntimeException
        // try (33 -> 40): 40 java/lang/RuntimeException
    }

    public static Vec3d a(em var0, UUID var1, float var2) {
        try {
            if (var1 == null) {
                return Vec3d.field_186680_a;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        EntityPlayer var3 = var0.field_70170_p.func_152378_a(var1);

        try {
            if (var3 == null) {
                return Vec3d.field_186680_a;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        Vec3d var4 = b6.a(new Vec3d(var3.field_70169_q, var3.field_70167_r, var3.field_70166_s), var3.func_174791_d(), var2);
        Vec3d var5 = b6.a(
            new Vec3d(y.field_71439_g.field_70169_q, y.field_71439_g.field_70167_r, y.field_71439_g.field_70166_s), y.field_71439_g.func_174791_d(), var2
        );
        return var4.func_178788_d(var5);
    }

    public static Vector4f a(EntityPlayer var0, float var1) {
        EntityPlayerSP var2 = y.field_71439_g;
        float var3 = b6.a(var0.field_70760_ar, var0.field_70761_aq, var1);
        Vec3d var4 = b6.a(new Vec3d(var0.field_70142_S, var0.field_70137_T, var0.field_70136_U), var0.func_174791_d(), var1);
        Vec3d var5 = b6.a(new Vec3d(var2.field_70142_S, var2.field_70137_T, var2.field_70136_U), var2.func_174791_d(), var1);
        Vec3d var6 = var4.func_178788_d(var5);
        return new Vector4f((float)var6.field_72450_a, (float)var6.field_72448_b, (float)var6.field_72449_c, var3);
    }

    @Override
    protected Vec3i a(String param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/dy.j Lcom/trolmastercard/sexmod/em;
        // 04: invokestatic com/trolmastercard/sexmod/e4.a (Lcom/trolmastercard/sexmod/em;)[Ljava/lang/String;
        // 07: astore 2
        // 08: aload 2
        // 09: arraylength
        // 0a: bipush 8
        // 0c: if_icmpge 17
        // 0f: getstatic com/trolmastercard/sexmod/dy.r Lnet/minecraft/util/math/Vec3i;
        // 12: areturn
        // 13: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 16: athrow
        // 17: aload 1
        // 18: ldc "band"
        // 1a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 1d: ifeq 28
        // 20: getstatic com/trolmastercard/sexmod/dy.w Lnet/minecraft/util/math/Vec3i;
        // 23: areturn
        // 24: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 27: athrow
        // 28: aload 1
        // 29: ldc "eyeColor"
        // 2b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 2e: ifne 41
        // 31: aload 1
        // 32: ldc "eyeColor2"
        // 34: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 37: ifeq 4d
        // 3a: goto 41
        // 3d: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 40: athrow
        // 41: aload 2
        // 42: bipush 8
        // 44: aaload
        // 45: invokestatic com/trolmastercard/sexmod/dy.b (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
        // 48: areturn
        // 49: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 4c: athrow
        // 4d: aload 1
        // 4e: ldc "variant"
        // 50: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 53: ifne 66
        // 56: aload 1
        // 57: ldc "boob"
        // 59: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 5c: ifeq 72
        // 5f: goto 66
        // 62: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 65: athrow
        // 66: aload 2
        // 67: bipush 7
        // 69: aaload
        // 6a: invokestatic com/trolmastercard/sexmod/dy.c (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
        // 6d: areturn
        // 6e: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 71: athrow
        // 72: aload 1
        // 73: ldc "hair"
        // 75: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 78: ifeq 87
        // 7b: aload 2
        // 7c: bipush 6
        // 7e: aaload
        // 7f: invokestatic com/trolmastercard/sexmod/dy.d (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
        // 82: areturn
        // 83: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 86: athrow
        // 87: getstatic com/trolmastercard/sexmod/dy.D Ljava/util/HashSet;
        // 8a: aload 1
        // 8b: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 8e: ifeq 9d
        // 91: aload 2
        // 92: bipush 7
        // 94: aaload
        // 95: invokestatic com/trolmastercard/sexmod/dy.c (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
        // 98: areturn
        // 99: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 9c: athrow
        // 9d: getstatic com/trolmastercard/sexmod/dy.M Ljava/util/HashSet;
        // a0: aload 1
        // a1: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // a4: ifeq b3
        // a7: aload 2
        // a8: bipush 6
        // aa: aaload
        // ab: invokestatic com/trolmastercard/sexmod/dy.d (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
        // ae: areturn
        // af: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // b2: athrow
        // b3: getstatic com/trolmastercard/sexmod/dy.r Lnet/minecraft/util/math/Vec3i;
        // b6: areturn
        // try (4 -> 10): 10 java/lang/RuntimeException
        // try (12 -> 18): 18 java/lang/RuntimeException
        // try (20 -> 28): 29 java/lang/RuntimeException
        // try (24 -> 36): 36 java/lang/RuntimeException
        // try (38 -> 46): 47 java/lang/RuntimeException
        // try (42 -> 54): 54 java/lang/RuntimeException
        // try (56 -> 65): 65 java/lang/RuntimeException
        // try (67 -> 76): 76 java/lang/RuntimeException
        // try (78 -> 87): 87 java/lang/RuntimeException
    }

    public static Vec3i b(String var0) {
        return eh.values()[Integer.parseInt(var0)].a();
    }

    public static Vec3i c(String var0) {
        return by.values()[Integer.parseInt(var0)].a();
    }

    public static Vec3i d(String var0) {
        return g5.values()[Integer.parseInt(var0)].a();
    }

    @Override
    protected void a(BufferBuilder var1, String var2, GeoBone var3) {
        try {
            if (this.j.field_70170_p instanceof gj) {
                return;
            }
        } catch (RuntimeException var11) {
            throw a(var11);
        }

        String[] var4 = e4.a(this.j);

        try {
            if (var4.length < 8) {
                return;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        String var5 = var2;
        byte var6 = -1;

        label115: {
            label114: {
                label113: {
                    label112: {
                        label111: {
                            label110: {
                                label109: {
                                    label108: {
                                        try {
                                            switch (var5.hashCode()) {
                                                case -1383396097:
                                                    break label112;
                                                case -1383396096:
                                                    break label113;
                                                case 2364452:
                                                    break label110;
                                                case 3029410:
                                                    break label109;
                                                case 3105718:
                                                    if (!var5.equals("earL")) {
                                                        break label115;
                                                    }
                                                    break label114;
                                                case 3105724:
                                                    break;
                                                case 3194850:
                                                    break label108;
                                                case 93921650:
                                                    break label111;
                                                default:
                                                    break label115;
                                            }
                                        } catch (RuntimeException var9) {
                                            throw a(var9);
                                        }

                                        if (var5.equals("earR")) {
                                            var6 = 1;
                                        }
                                        break label115;
                                    }

                                    if (var5.equals("hair")) {
                                        var6 = 2;
                                    }
                                    break label115;
                                }

                                if (var5.equals("body")) {
                                    var6 = 3;
                                }
                                break label115;
                            }

                            if (var5.equals("LegR")) {
                                var6 = 4;
                            }
                            break label115;
                        }

                        if (var5.equals("boobR")) {
                            var6 = 5;
                        }
                        break label115;
                    }

                    if (var5.equals("boobR1")) {
                        var6 = 6;
                    }
                    break label115;
                }

                if (var5.equals("boobR2")) {
                    var6 = 7;
                }
                break label115;
            }

            var6 = 0;
        }

        label86: {
            label85: {
                label84: {
                    label83: {
                        label82: {
                            label81: {
                                label80: {
                                    try {
                                        switch (var6) {
                                            case 0:
                                                a(var3, var4[0], var4[1], var4[3]);
                                                break label86;
                                            case 1:
                                                break label85;
                                            case 2:
                                                break label84;
                                            case 3:
                                                break label83;
                                            case 4:
                                                break label82;
                                            case 5:
                                                break label81;
                                            case 6:
                                                break label80;
                                            case 7:
                                                break;
                                            default:
                                                break label86;
                                        }
                                    } catch (RuntimeException var8) {
                                        throw a(var8);
                                    }

                                    a(this.u, var3, 5.0F, 3.0F);
                                    break label86;
                                }

                                a(this.u, var3, 10.0F, 15.0F);
                                break label86;
                            }

                            a(this.u, var3, 30.0F, 30.0F);
                            break label86;
                        }

                        a(this.u, var3, 25.0F, 25.0F);
                        break label86;
                    }

                    var3.setPivotY(-0.15F);
                    a(this.j, var3);
                    break label86;
                }

                a(var3, var4[5]);
                break label86;
            }

            a(var3, var4[0], var4[2], var4[4]);
        }

        try {
            if (var2.contains("crown")) {
                a(this.j, var3, var4[9]);
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }
    }

    public static void a(em var0, GeoBone var1, String var2) {
        try {
            if (var0.h()) {
                var1.setHidden(true);
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        if (var0 instanceof e3) {
            int var3 = Integer.parseInt(var2);

            GeoBone var10000;
            boolean var10001;
            label30: {
                try {
                    var10000 = var1;
                    if (var3 == 0) {
                        var10001 = true;
                        break label30;
                    }
                } catch (RuntimeException var5) {
                    throw a(var5);
                }

                var10001 = false;
            }

            var10000.setHidden(var10001);
        } else {
            try {
                if (var0 instanceof eq) {
                    var1.setHidden(((ItemStack)var0.func_184212_Q().func_187225_a(e2.X)).func_190926_b());
                }
            } catch (RuntimeException var4) {
                throw a(var4);
            }
        }
    }

    public static void a(boolean var0, GeoBone var1, float var2, float var3) {
        try {
            if (y.func_147113_T()) {
                return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        try {
            if (!var0) {
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        var1.setRotationX(var1.getRotationX() + gc.c(be.b(x, -var2, var2)));
        var1.setRotationZ(var1.getRotationZ() + gc.c(be.b(N, -var3, var3)));
    }

    public static void a(em param0, GeoBone param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/dy.B F
        // 03: ldc -420.69
        // 05: fcmpl
        // 06: ifne 1a
        // 09: aload 0
        // 0a: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 0d: getstatic com/trolmastercard/sexmod/fp.SHOULDER_IDLE Lcom/trolmastercard/sexmod/fp;
        // 10: if_acmpeq 1f
        // 13: goto 1a
        // 16: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 19: athrow
        // 1a: return
        // 1b: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1e: athrow
        // 1f: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 22: invokevirtual net/minecraft/client/Minecraft.func_175598_ae ()Lnet/minecraft/client/renderer/entity/RenderManager;
        // 25: getfield net/minecraft/client/renderer/entity/RenderManager.field_78732_j F
        // 28: fneg
        // 29: fstore 2
        // 2a: aload 1
        // 2b: ldc 8.0
        // 2d: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPivotY (F)V
        // 30: getstatic com/trolmastercard/sexmod/dy.y Lnet/minecraft/client/Minecraft;
        // 33: invokevirtual net/minecraft/client/Minecraft.func_147113_T ()Z
        // 36: ifeq 3e
        // 39: return
        // 3a: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 3d: athrow
        // 3e: aload 1
        // 3f: aload 1
        // 40: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
        // 43: fload 2
        // 44: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 47: fadd
        // 48: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 4b: return
        // try (0 -> 8): 9 java/lang/RuntimeException
        // try (4 -> 12): 12 java/lang/RuntimeException
        // try (19 -> 26): 26 java/lang/RuntimeException
    }

    public static void a(GeoBone var0, String var1) {
        int var2 = Integer.parseInt(var1);
        a(var0, var2);
    }

    static HashSet<Integer> b(int var0, String var1) {
        int var2 = Integer.parseInt(var1);
        int var3 = var0 - 1;
        ArrayList var4 = a(var3);

        while (var2 >= var4.size()) {
            var2 -= var4.size();
        }

        return (HashSet<Integer>)var4.get(var2);
    }

    static ArrayList<HashSet<Integer>> a(int var0) {
        ArrayList var1 = new ArrayList();
        a(0, new HashSet<>(), var0, var1);
        return var1;
    }

    static void a(int var0, HashSet<Integer> var1, int var2, ArrayList<HashSet<Integer>> var3) {
        try {
            if (var0 > var2) {
                var3.add(var1);
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        HashSet var4 = new HashSet(var1);
        a(var0 + 1, var1, var2, var3);
        var4.add(var0);
        a(var0 + 1, var4, var2, var3);
    }

    static HashSet<Integer> a(int var0, String var1) {
        HashSet var2 = new HashSet();
        int var3 = Integer.parseInt(var1);
        var3 = (int)(0.01F * var3 * var3);
        int var4 = Math.round(var3 / 100.0F * var0);
        Random var5 = new Random(var3);

        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = var5.nextInt(var0);

            try {
                if (!var2.contains(var7)) {
                    var2.add(var7);
                    continue;
                }
            } catch (RuntimeException var8) {
                throw a(var8);
            }

            var6--;
        }

        return var2;
    }

    static void a(GeoBone var0, String var1, String var2, String var3) {
        GeoBone var4 = a(var0, Integer.parseInt(var1));
        GeoBone var5 = a(var4, Integer.parseInt(var2));
        List var6 = var5.childBones;
        int var7 = var6.size();
        HashSet var8 = b(var7, var3);
        var5.childBones.forEach(var0x -> var0x.setHidden(true));
        var8.forEach(var1x -> b(var5, var1x));
    }

    @Override
    protected Vec3i a(Vec3i param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/dy.u Z
        // 04: ifne 1b
        // 07: aload 0
        // 08: getfield com/trolmastercard/sexmod/dy.F Z
        // 0b: ifne 1b
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 14: athrow
        // 15: aload 1
        // 16: areturn
        // 17: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1a: athrow
        // 1b: aload 0
        // 1c: getfield com/trolmastercard/sexmod/dy.z F
        // 1f: fconst_2
        // 20: ldc 15.0
        // 22: invokestatic com/trolmastercard/sexmod/be.b (FFF)F
        // 25: ldc 15.0
        // 27: fdiv
        // 28: fstore 2
        // 29: new net/minecraft/util/math/Vec3i
        // 2c: dup
        // 2d: aload 1
        // 2e: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 31: i2f
        // 32: fload 2
        // 33: fmul
        // 34: f2d
        // 35: aload 1
        // 36: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
        // 39: i2f
        // 3a: fload 2
        // 3b: fmul
        // 3c: f2d
        // 3d: aload 1
        // 3e: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 41: i2f
        // 42: fload 2
        // 43: fmul
        // 44: f2d
        // 45: invokespecial net/minecraft/util/math/Vec3i.<init> (DDD)V
        // 48: areturn
        // try (0 -> 6): 7 java/lang/RuntimeException
        // try (3 -> 11): 11 java/lang/RuntimeException
    }

    @Override
    protected ItemStack a(@Nullable ItemStack param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/dy.j Lcom/trolmastercard/sexmod/em;
        // 04: checkcast com/trolmastercard/sexmod/e3
        // 07: invokevirtual com/trolmastercard/sexmod/e3.y ()Lcom/trolmastercard/sexmod/fp;
        // 0a: astore 2
        // 0b: aload 2
        // 0c: getstatic com/trolmastercard/sexmod/fp.RUN Lcom/trolmastercard/sexmod/fp;
        // 0f: if_acmpeq 20
        // 12: aload 2
        // 13: getstatic com/trolmastercard/sexmod/fp.CATCH Lcom/trolmastercard/sexmod/fp;
        // 16: if_acmpne 38
        // 19: goto 20
        // 1c: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1f: athrow
        // 20: aload 0
        // 21: getfield com/trolmastercard/sexmod/dy.j Lcom/trolmastercard/sexmod/em;
        // 24: checkcast com/trolmastercard/sexmod/e3
        // 27: invokevirtual com/trolmastercard/sexmod/e3.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 2a: getstatic com/trolmastercard/sexmod/e3.a0 Lnet/minecraft/network/datasync/DataParameter;
        // 2d: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 30: checkcast net/minecraft/item/ItemStack
        // 33: areturn
        // 34: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 37: athrow
        // 38: aload 1
        // 39: areturn
        // try (5 -> 11): 12 java/lang/RuntimeException
        // try (8 -> 22): 22 java/lang/RuntimeException
    }

    @Override
    public HashSet<String> a() {
        return new HashSet<String>() {
            {
                this.add("boobs");
                this.add("booty");
                this.add("vagina");
                this.add("fuckhole");
                this.add("preggy");
                this.add("LegL");
                this.add("LegR");
                this.add("cheekR");
                this.add("cheekL");
            }
        };
    }

    @Override
    protected float a() {
        try {
            return this.j.y() == fp.CATCH ? 0.5F : 1.0F;
        } catch (RuntimeException var1) {
            throw a(var1);
        }
    }

    @Override
    protected Vec3d a(ItemStack param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: ifnonnull 0c
        // 04: getstatic net/minecraft/util/math/Vec3d.field_186680_a Lnet/minecraft/util/math/Vec3d;
        // 07: areturn
        // 08: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0b: athrow
        // 0c: aload 1
        // 0d: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 10: instanceof net/minecraft/item/ItemBlock
        // 13: ifne 25
        // 16: aload 1
        // 17: invokevirtual net/minecraft/item/ItemStack.func_77976_d ()I
        // 1a: bipush 1
        // 1b: if_icmpne 2f
        // 1e: goto 25
        // 21: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 24: athrow
        // 25: aload 0
        // 26: aload 1
        // 27: invokespecial com/trolmastercard/sexmod/d6.a (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/util/math/Vec3d;
        // 2a: areturn
        // 2b: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2e: athrow
        // 2f: new net/minecraft/util/math/Vec3d
        // 32: dup
        // 33: ldc2_w 180.0
        // 36: dconst_0
        // 37: dconst_0
        // 38: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 3b: areturn
        // try (0 -> 4): 4 java/lang/RuntimeException
        // try (6 -> 14): 15 java/lang/RuntimeException
        // try (10 -> 21): 21 java/lang/RuntimeException
    }

    @Override
    public void a(BufferBuilder param1, GeoCube param2, GeoBone param3, float param4, float param5, float param6, float param7, double param8) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/dy.u Z
        // 04: ifeq 20
        // 07: getstatic com/trolmastercard/sexmod/dy.C Ljava/util/HashSet;
        // 0a: aload 3
        // 0b: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
        // 0e: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 11: ifne 20
        // 14: goto 1b
        // 17: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1a: athrow
        // 1b: return
        // 1c: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1f: athrow
        // 20: aload 0
        // 21: getfield com/trolmastercard/sexmod/dy.p Ljava/util/HashSet;
        // 24: aload 3
        // 25: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
        // 28: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 2b: ifeq 33
        // 2e: return
        // 2f: invokestatic com/trolmastercard/sexmod/dy.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 32: athrow
        // 33: aload 0
        // 34: aload 3
        // 35: putfield com/trolmastercard/sexmod/dy.q Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
        // 38: aload 0
        // 39: aload 1
        // 3a: aload 2
        // 3b: aload 3
        // 3c: fload 4
        // 3e: fload 5
        // 40: fload 6
        // 42: fload 7
        // 44: dload 8
        // 46: invokespecial com/trolmastercard/sexmod/d6.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
        // 49: return
        // try (0 -> 8): 9 java/lang/RuntimeException
        // try (3 -> 12): 12 java/lang/RuntimeException
        // try (14 -> 21): 21 java/lang/RuntimeException
    }

    private static Exception a(Exception var0) {
        return var0;
    }
}
