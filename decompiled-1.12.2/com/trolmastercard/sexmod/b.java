package com.trolmastercard.sexmod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class b extends GeoEntityRenderer<cy> {
    public static final float e = 1.876945F;
    public static final float i = 2.876945F;
    Minecraft a;
    cy c = null;
    br.b b = null;
    HashMap<String, String> h = new HashMap<>();
    HashMap<String, String> f = new HashMap<>();
    HashMap<String, gt> g = new HashMap<>();
    public static boolean k = false;
    Vec3d d = new Vec3d(1.0, 1.0, 1.0);
    Vec3d j;

    public b(RenderManager var1, AnimatedGeoModel<cy> var2) {
        super(var1, var2);
        this.a = Minecraft.func_71410_x();
        this.a();
    }

    void a() {
        this.h.put("customLegL", "legL");
        this.h.put("customShinL", "shinL");
        this.h.put("customLegR", "legR");
        this.h.put("customShinR", "shinR");
        this.f.put("top", "upperBody");
        this.f.put("customArmL", "armL");
        this.f.put("customLowerArmL", "lowerArmL");
        this.f.put("customArmR", "armR");
        this.f.put("customLowerArmR", "lowerArmR");
        this.g.put("lowerArmR", var0 -> gc.c(var0.ai()));
        this.g.put("lowerArmL", var0 -> gc.c(var0.T()));
    }

    boolean d(cy var1) {
        String var2 = var1.a();

        try {
            if (var1.f) {
                return false;
            }
        } catch (IllegalStateException var10) {
            throw a(var10);
        }

        try {
            if (br.f(var2)) {
                return false;
            }
        } catch (IllegalStateException var7) {
            throw a(var7);
        }

        try {
            if (br.g() != null) {
                return true;
            }
        } catch (IllegalStateException var9) {
            throw a(var9);
        }

        UUID var3 = var1.b();
        em var4 = em.b(var3);

        try {
            if (var4 == null) {
                return true;
            }
        } catch (IllegalStateException var8) {
            throw a(var8);
        }

        HashSet var5 = var4.Y();
        var5.remove(var2);
        String var6 = em.a(var5);
        ge.b.sendToServer(new fw(var6, var1.b()));
        return true;
    }

    @SideOnly(Side.CLIENT)
    public static void a(em var0, float var1) {
        try {
            if (var0.field_70128_L) {
                return;
            }
        } catch (IllegalStateException var8) {
            throw a(var8);
        }

        try {
            if (!var0.field_70170_p.field_72995_K) {
                return;
            }
        } catch (IllegalStateException var6) {
            throw a(var6);
        }

        try {
            if (!var0.H()) {
                return;
            }
        } catch (IllegalStateException var7) {
            throw a(var7);
        }

        RenderManager var2 = Minecraft.func_71410_x().func_175598_ae();

        for (String var4 : var0.Y()) {
            cy var5 = new cy(var0.field_70170_p, var0.f(), var4);
            k = true;
            var2.func_188391_a(var5, 0.0, 0.0, 0.0, 0.0F, var1, false);
        }
    }

    public boolean a(cy var1, ICamera var2, double var3, double var5, double var7) {
        return super.func_177071_a(var1, var2, var3, var5, var7);
    }

    boolean a(float var1) {
        try {
            if (var1 == 2.876945F) {
                return true;
            }
        } catch (IllegalStateException var3) {
            throw a(var3);
        }

        try {
            if (var1 == 1.876945F) {
                return true;
            }
        } catch (IllegalStateException var4) {
            throw a(var4);
        }

        try {
            if (k) {
                k = false;
                return true;
            } else {
                return false;
            }
        } catch (IllegalStateException var2) {
            throw a(var2);
        }
    }

    void a(br.b param1, cy param2, float param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: ifnull 15
        // 04: aload 1
        // 05: invokevirtual com/trolmastercard/sexmod/br$b.i ()Lcom/trolmastercard/sexmod/c8;
        // 08: getstatic com/trolmastercard/sexmod/c8.DEFAULT Lcom/trolmastercard/sexmod/c8;
        // 0b: if_acmpne 1f
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 14: athrow
        // 15: aload 0
        // 16: aconst_null
        // 17: putfield com/trolmastercard/sexmod/b.j Lnet/minecraft/util/math/Vec3d;
        // 1a: return
        // 1b: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 1e: athrow
        // 1f: sipush 2896
        // 22: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
        // 25: aload 0
        // 26: aload 1
        // 27: invokevirtual com/trolmastercard/sexmod/br$b.i ()Lcom/trolmastercard/sexmod/c8;
        // 2a: getstatic com/trolmastercard/sexmod/c8.SEXMOD Lcom/trolmastercard/sexmod/c8;
        // 2d: if_acmpne 3c
        // 30: aload 2
        // 31: fload 3
        // 32: invokestatic com/trolmastercard/sexmod/cj.a (Lnet/minecraft/entity/EntityLivingBase;F)Lnet/minecraft/util/math/Vec3d;
        // 35: goto 3d
        // 38: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 3b: athrow
        // 3c: aconst_null
        // 3d: putfield com/trolmastercard/sexmod/b.j Lnet/minecraft/util/math/Vec3d;
        // 40: return
        // try (0 -> 6): 7 java/lang/IllegalStateException
        // try (2 -> 13): 13 java/lang/IllegalStateException
        // try (15 -> 26): 26 java/lang/IllegalStateException
    }

    public void a(cy param1, double param2, double param4, double param6, float param8, float param9) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: fload 9
        // 003: invokevirtual com/trolmastercard/sexmod/b.a (F)Z
        // 006: ifne 00e
        // 009: return
        // 00a: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 00d: athrow
        // 00e: getstatic com/trolmastercard/sexmod/br.d Z
        // 011: ifeq 019
        // 014: return
        // 015: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 018: athrow
        // 019: aload 0
        // 01a: aload 1
        // 01b: invokevirtual com/trolmastercard/sexmod/b.d (Lcom/trolmastercard/sexmod/cy;)Z
        // 01e: ifeq 026
        // 021: return
        // 022: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 025: athrow
        // 026: aload 1
        // 027: new software/bernie/geckolib3/util/MatrixStack
        // 02a: dup
        // 02b: invokespecial software/bernie/geckolib3/util/MatrixStack.<init> ()V
        // 02e: putfield com/trolmastercard/sexmod/cy.c Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 031: aload 1
        // 032: invokevirtual com/trolmastercard/sexmod/cy.a ()Ljava/lang/String;
        // 035: invokestatic com/trolmastercard/sexmod/br.b (Ljava/lang/String;)Lcom/trolmastercard/sexmod/br$b;
        // 038: astore 10
        // 03a: aload 0
        // 03b: aload 1
        // 03c: putfield com/trolmastercard/sexmod/b.c Lcom/trolmastercard/sexmod/cy;
        // 03f: aload 0
        // 040: aload 10
        // 042: putfield com/trolmastercard/sexmod/b.b Lcom/trolmastercard/sexmod/br$b;
        // 045: aload 0
        // 046: aload 10
        // 048: aload 1
        // 049: fload 9
        // 04b: invokevirtual com/trolmastercard/sexmod/b.a (Lcom/trolmastercard/sexmod/br$b;Lcom/trolmastercard/sexmod/cy;F)V
        // 04e: fload 9
        // 050: ldc 1.876945
        // 052: fcmpl
        // 053: ifeq 065
        // 056: fload 9
        // 058: ldc 2.876945
        // 05a: fcmpl
        // 05b: ifne 08c
        // 05e: goto 065
        // 061: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 064: athrow
        // 065: aload 0
        // 066: new net/minecraft/util/math/Vec3d
        // 069: dup
        // 06a: dconst_1
        // 06b: dconst_1
        // 06c: dconst_1
        // 06d: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 070: putfield com/trolmastercard/sexmod/b.d Lnet/minecraft/util/math/Vec3d;
        // 073: aload 0
        // 074: aload 1
        // 075: dload 2
        // 076: dload 4
        // 078: dload 6
        // 07a: fload 8
        // 07c: fload 9
        // 07e: invokespecial software/bernie/geckolib3/renderers/geo/GeoEntityRenderer.doRender (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V
        // 081: sipush 2896
        // 084: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
        // 087: return
        // 088: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 08b: athrow
        // 08c: aload 1
        // 08d: invokevirtual com/trolmastercard/sexmod/cy.b ()Ljava/util/UUID;
        // 090: astore 11
        // 092: aload 11
        // 094: ifnonnull 09c
        // 097: return
        // 098: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 09b: athrow
        // 09c: aload 11
        // 09e: invokestatic com/trolmastercard/sexmod/em.b (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/em;
        // 0a1: astore 13
        // 0a3: aload 13
        // 0a5: ifnonnull 0ad
        // 0a8: return
        // 0a9: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0ac: athrow
        // 0ad: aload 10
        // 0af: ifnull 0d5
        // 0b2: aload 10
        // 0b4: invokevirtual com/trolmastercard/sexmod/br$b.a ()Z
        // 0b7: ifne 0d5
        // 0ba: goto 0c1
        // 0bd: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0c0: athrow
        // 0c1: aload 13
        // 0c3: invokevirtual com/trolmastercard/sexmod/em.ah ()I
        // 0c6: ifne 0d5
        // 0c9: goto 0d0
        // 0cc: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0cf: athrow
        // 0d0: return
        // 0d1: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0d4: athrow
        // 0d5: aload 13
        // 0d7: instanceof com/trolmastercard/sexmod/ei
        // 0da: ifne 0e4
        // 0dd: aload 13
        // 0df: astore 12
        // 0e1: goto 115
        // 0e4: aload 13
        // 0e6: checkcast com/trolmastercard/sexmod/ei
        // 0e9: invokevirtual com/trolmastercard/sexmod/ei.m ()Ljava/util/UUID;
        // 0ec: astore 14
        // 0ee: aload 14
        // 0f0: ifnonnull 0f8
        // 0f3: return
        // 0f4: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0f7: athrow
        // 0f8: aload 1
        // 0f9: getfield com/trolmastercard/sexmod/cy.field_70170_p Lnet/minecraft/world/World;
        // 0fc: aload 14
        // 0fe: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // 101: astore 15
        // 103: aload 15
        // 105: ifnonnull 111
        // 108: aload 13
        // 10a: goto 113
        // 10d: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 110: athrow
        // 111: aload 15
        // 113: astore 12
        // 115: aload 13
        // 117: aload 0
        // 118: getfield com/trolmastercard/sexmod/b.a Lnet/minecraft/client/Minecraft;
        // 11b: aload 1
        // 11c: aload 12
        // 11e: fload 9
        // 120: invokevirtual com/trolmastercard/sexmod/em.a (Lnet/minecraft/client/Minecraft;Lcom/trolmastercard/sexmod/cy;Lnet/minecraft/entity/EntityLivingBase;F)Lnet/minecraft/util/math/Vec3d;
        // 123: astore 14
        // 125: new net/minecraft/util/math/BlockPos
        // 128: dup
        // 129: aload 12
        // 12b: getfield net/minecraft/entity/EntityLivingBase.field_70165_t D
        // 12e: invokestatic java/lang/Math.floor (D)D
        // 131: aload 12
        // 133: getfield net/minecraft/entity/EntityLivingBase.field_70163_u D
        // 136: invokestatic java/lang/Math.floor (D)D
        // 139: aload 12
        // 13b: getfield net/minecraft/entity/EntityLivingBase.field_70161_v D
        // 13e: invokestatic java/lang/Math.floor (D)D
        // 141: invokespecial net/minecraft/util/math/BlockPos.<init> (DDD)V
        // 144: astore 15
        // 146: aload 12
        // 148: getfield net/minecraft/entity/EntityLivingBase.field_70170_p Lnet/minecraft/world/World;
        // 14b: aload 15
        // 14d: bipush 1
        // 14e: invokevirtual net/minecraft/world/World.func_175721_c (Lnet/minecraft/util/math/BlockPos;Z)I
        // 151: istore 16
        // 153: new net/minecraft/util/math/Vec3d
        // 156: dup
        // 157: dconst_1
        // 158: dconst_1
        // 159: dconst_1
        // 15a: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 15d: astore 17
        // 15f: iload 16
        // 161: i2f
        // 162: ldc 10.0
        // 164: ldc 15.0
        // 166: invokestatic com/trolmastercard/sexmod/be.b (FFF)F
        // 169: ldc 15.0
        // 16b: fdiv
        // 16c: fstore 18
        // 16e: aload 0
        // 16f: new net/minecraft/util/math/Vec3d
        // 172: dup
        // 173: aload 17
        // 175: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 178: fload 18
        // 17a: f2d
        // 17b: dmul
        // 17c: aload 17
        // 17e: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 181: fload 18
        // 183: f2d
        // 184: dmul
        // 185: aload 17
        // 187: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 18a: fload 18
        // 18c: f2d
        // 18d: dmul
        // 18e: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 191: putfield com/trolmastercard/sexmod/b.d Lnet/minecraft/util/math/Vec3d;
        // 194: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 197: aload 14
        // 199: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 19c: aload 14
        // 19e: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 1a1: aload 14
        // 1a3: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 1a6: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 1a9: aload 13
        // 1ab: invokevirtual com/trolmastercard/sexmod/em.Q ()Z
        // 1ae: ifeq 1c6
        // 1b1: aload 13
        // 1b3: invokevirtual com/trolmastercard/sexmod/em.I ()Ljava/lang/Float;
        // 1b6: invokevirtual java/lang/Float.floatValue ()F
        // 1b9: fconst_0
        // 1ba: fconst_1
        // 1bb: fconst_0
        // 1bc: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 1bf: goto 1c6
        // 1c2: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 1c5: athrow
        // 1c6: aload 0
        // 1c7: aload 1
        // 1c8: dconst_0
        // 1c9: dconst_0
        // 1ca: dconst_0
        // 1cb: fload 8
        // 1cd: fload 9
        // 1cf: invokespecial software/bernie/geckolib3/renderers/geo/GeoEntityRenderer.doRender (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V
        // 1d2: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 1d5: sipush 2896
        // 1d8: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
        // 1db: return
        // try (0 -> 5): 5 java/lang/IllegalStateException
        // try (7 -> 10): 10 java/lang/IllegalStateException
        // try (12 -> 17): 17 java/lang/IllegalStateException
        // try (28 -> 47): 48 java/lang/IllegalStateException
        // try (43 -> 69): 69 java/lang/IllegalStateException
        // try (74 -> 77): 77 java/lang/IllegalStateException
        // try (82 -> 85): 85 java/lang/IllegalStateException
        // try (87 -> 92): 93 java/lang/IllegalStateException
        // try (89 -> 98): 99 java/lang/IllegalStateException
        // try (95 -> 102): 102 java/lang/IllegalStateException
        // try (114 -> 117): 117 java/lang/IllegalStateException
        // try (124 -> 128): 128 java/lang/IllegalStateException
        // try (174 -> 212): 213 java/lang/IllegalStateException
    }

    public static Vec3d a(Minecraft var0, cy var1, EntityLivingBase var2, em var3, float var4) {
        Vec3d var5;
        if (var3.Q()) {
            Vec3d var6 = var3.o();
            float var7 = var3.I();
            var1.field_70169_q = var6.field_72450_a;
            var1.field_70167_r = var6.field_72448_b;
            var1.field_70166_s = var6.field_72449_c;
            var1.field_70142_S = var6.field_72450_a;
            var1.field_70137_T = var6.field_72448_b;
            var1.field_70136_U = var6.field_72449_c;
            var1.field_70165_t = var6.field_72450_a;
            var1.field_70163_u = var6.field_72448_b;
            var1.field_70161_v = var6.field_72449_c;
            var1.field_70177_z = var7;
            var1.field_70126_B = var7;
            var1.field_70759_as = var7;
            var1.field_70758_at = var7;
            var1.field_70761_aq = var7;
            var1.field_70760_ar = var7;
            var1.field_70125_A = var7;
            var1.field_70127_C = var7;
            var5 = var6;
        } else {
            var1.field_70177_z = var2.field_70177_z;
            var1.field_70126_B = var2.field_70126_B;
            var1.field_70759_as = var2.field_70759_as;
            var1.field_70758_at = var2.field_70758_at;
            var1.field_70761_aq = var2.field_70761_aq;
            var1.field_70760_ar = var2.field_70760_ar;
            var1.field_70125_A = var2.field_70125_A;
            var1.field_70127_C = var2.field_70127_C;
            var1.field_70169_q = var2.field_70169_q;
            var1.field_70167_r = var2.field_70167_r;
            var1.field_70166_s = var2.field_70166_s;
            var1.field_70142_S = var2.field_70142_S;
            var1.field_70137_T = var2.field_70137_T;
            var1.field_70136_U = var2.field_70136_U;
            var1.field_70165_t = var2.field_70165_t;
            var1.field_70163_u = var2.field_70163_u;
            var1.field_70161_v = var2.field_70161_v;
            var5 = b6.a(new Vec3d(var2.field_70142_S, var2.field_70137_T, var2.field_70136_U), var2.func_174791_d(), var4);
        }

        EntityPlayerSP var8 = var0.field_71439_g;
        Vec3d var9 = b6.a(new Vec3d(var8.field_70142_S, var8.field_70137_T, var8.field_70136_U), var8.func_174791_d(), var4);
        return var5.func_178788_d(var9);
    }

    public void a(GeoModel var1, cy var2, float var3, float var4, float var5, float var6, float var7) {
        GlStateManager.func_179129_p();
        GlStateManager.func_179091_B();
        BufferBuilder var8 = Tessellator.func_178181_a().func_178180_c();
        var8.func_181668_a(7, DefaultVertexFormats.field_181712_l);

        for (GeoBone var10 : var1.topLevelBones) {
            try {
                if (var3 != 1.876945F) {
                    this.a(var2, var10, var3);
                }
            } catch (IllegalStateException var11) {
                throw a(var11);
            }

            var2.c.translate(-var10.getPivotX() / 16.0F, -var10.getPivotY() / 16.0F, -var10.getPivotZ() / 16.0F);
            this.renderRecursively(var8, var10, var4, var5, var6, var7);
        }

        Tessellator.func_178181_a().func_78381_a();
        GlStateManager.func_179101_C();
        GlStateManager.func_179089_o();
    }

    EntityLivingBase c(cy var1) {
        em var3 = this.b(var1);

        try {
            if (var3 == null) {
                return null;
            }
        } catch (IllegalStateException var5) {
            throw a(var5);
        }

        Object var2;
        if (!(var3 instanceof ei)) {
            var2 = var3;
        } else {
            EntityPlayer var4 = var1.field_70170_p.func_152378_a(((ei)var3).m());

            Object var10000;
            label28: {
                try {
                    if (var4 == null) {
                        var10000 = var3;
                        break label28;
                    }
                } catch (IllegalStateException var6) {
                    throw a(var6);
                }

                var10000 = var4;
            }

            var2 = var10000;
        }

        return (EntityLivingBase)var2;
    }

    em b(cy var1) {
        UUID var2 = var1.b();
        em var3 = fs.a(var2);

        try {
            if (var3 != null) {
                return var3;
            }
        } catch (IllegalStateException var4) {
            throw a(var4);
        }

        return em.b(var2);
    }

    void a(cy var1, GeoBone var2, float var3) {
        String var4 = this.a(var1);

        try {
            if (var4 == null) {
                return;
            }
        } catch (IllegalStateException var5) {
            throw a(var5);
        }

        this.a(var1, var2, var3, var4);
    }

    void a(cy param1, GeoBone param2, float param3, String param4) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: aload 1
        // 02: invokevirtual com/trolmastercard/sexmod/b.b (Lcom/trolmastercard/sexmod/cy;)Lcom/trolmastercard/sexmod/em;
        // 05: astore 5
        // 07: aload 0
        // 08: aload 1
        // 09: invokevirtual com/trolmastercard/sexmod/b.c (Lcom/trolmastercard/sexmod/cy;)Lnet/minecraft/entity/EntityLivingBase;
        // 0c: astore 6
        // 0e: aload 1
        // 0f: aload 5
        // 11: aload 4
        // 13: bipush 0
        // 14: invokevirtual com/trolmastercard/sexmod/em.a (Ljava/lang/String;Z)Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 17: putfield com/trolmastercard/sexmod/cy.c Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 1a: aload 1
        // 1b: getfield com/trolmastercard/sexmod/cy.f Z
        // 1e: ifeq 2f
        // 21: fload 3
        // 22: ldc 2.876945
        // 24: fcmpl
        // 25: ifeq 34
        // 28: goto 2f
        // 2b: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 2e: athrow
        // 2f: return
        // 30: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 33: athrow
        // 34: aload 1
        // 35: getfield com/trolmastercard/sexmod/cy.c Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 38: ldc 0.5
        // 3a: ldc 0.5
        // 3c: ldc 0.5
        // 3e: invokevirtual software/bernie/geckolib3/util/MatrixStack.scale (FFF)V
        // 41: aload 1
        // 42: getfield com/trolmastercard/sexmod/cy.c Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 45: getstatic com/trolmastercard/sexmod/a.b F
        // 48: fneg
        // 49: f2d
        // 4a: invokestatic java/lang/Math.toRadians (D)D
        // 4d: d2f
        // 4e: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotateY (F)V
        // 51: return
        // try (8 -> 21): 22 java/lang/IllegalStateException
        // try (17 -> 25): 25 java/lang/IllegalStateException
    }

    String a(cy var1) {
        try {
            if (var1.f) {
                return var1.d.boneName;
            }
        } catch (IllegalStateException var5) {
            throw a(var5);
        }

        br.b var2 = br.b(var1.a());

        try {
            if (var2 == null) {
                return null;
            }
        } catch (IllegalStateException var3) {
            throw a(var3);
        }

        try {
            if (gw.CUSTOM_BONE.equals(var2.j())) {
                return var2.b();
            }
        } catch (IllegalStateException var4) {
            throw a(var4);
        }

        return var2.j().boneName;
    }

    @Override
    public void renderRecursively(BufferBuilder var1, GeoBone var2, float var3, float var4, float var5, float var6) {
        this.c.c.push();
        this.c.c.translate(var2);
        this.c.c.moveToPivot(var2);
        this.c.c.rotate(var2);
        this.c.c.scale(var2);
        this.c.c.moveBackFromPivot(var2);
        if (!var2.isHidden()) {
            for (GeoCube var8 : var2.childCubes) {
                this.c.c.push();
                GlStateManager.func_179094_E();
                this.renderCube(var1, var8, var3, var4, var5, var6);
                GlStateManager.func_179121_F();
                this.c.c.pop();
            }
        }

        if (!var2.childBonesAreHiddenToo()) {
            for (GeoBone var11 : var2.childBones) {
                this.renderRecursively(var1, var11, var3, var4, var5, var6);
            }
        }

        try {
            this.c.c.pop();
        } catch (IllegalStateException var9) {
        }
    }

    @Override
    public void renderCube(BufferBuilder param1, GeoCube param2, float param3, float param4, float param5, float param6) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/b.c Lcom/trolmastercard/sexmod/cy;
        // 004: getfield com/trolmastercard/sexmod/cy.c Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 007: aload 2
        // 008: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 00b: aload 0
        // 00c: getfield com/trolmastercard/sexmod/b.c Lcom/trolmastercard/sexmod/cy;
        // 00f: getfield com/trolmastercard/sexmod/cy.c Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 012: aload 2
        // 013: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 016: aload 0
        // 017: getfield com/trolmastercard/sexmod/b.c Lcom/trolmastercard/sexmod/cy;
        // 01a: getfield com/trolmastercard/sexmod/cy.c Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 01d: aload 2
        // 01e: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 021: aload 2
        // 022: getfield software/bernie/geckolib3/geo/render/built/GeoCube.quads [Lsoftware/bernie/geckolib3/geo/render/built/GeoQuad;
        // 025: astore 7
        // 027: aload 7
        // 029: arraylength
        // 02a: istore 8
        // 02c: bipush 0
        // 02d: istore 9
        // 02f: iload 9
        // 031: iload 8
        // 033: if_icmpge 215
        // 036: aload 7
        // 038: iload 9
        // 03a: aaload
        // 03b: astore 10
        // 03d: aload 10
        // 03f: ifnonnull 049
        // 042: goto 20f
        // 045: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 048: athrow
        // 049: new javax/vecmath/Vector3f
        // 04c: dup
        // 04d: aload 10
        // 04f: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 052: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 055: i2f
        // 056: aload 10
        // 058: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 05b: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
        // 05e: i2f
        // 05f: aload 10
        // 061: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 064: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 067: i2f
        // 068: invokespecial javax/vecmath/Vector3f.<init> (FFF)V
        // 06b: astore 11
        // 06d: aload 0
        // 06e: getfield com/trolmastercard/sexmod/b.c Lcom/trolmastercard/sexmod/cy;
        // 071: getfield com/trolmastercard/sexmod/cy.c Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 074: invokevirtual software/bernie/geckolib3/util/MatrixStack.getNormalMatrix ()Ljavax/vecmath/Matrix3f;
        // 077: aload 11
        // 079: invokevirtual javax/vecmath/Matrix3f.transform (Ljavax/vecmath/Tuple3f;)V
        // 07c: aload 2
        // 07d: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 080: getfield javax/vecmath/Vector3f.y F
        // 083: fconst_0
        // 084: fcmpl
        // 085: ifeq 09b
        // 088: aload 2
        // 089: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 08c: getfield javax/vecmath/Vector3f.z F
        // 08f: fconst_0
        // 090: fcmpl
        // 091: ifne 0bf
        // 094: goto 09b
        // 097: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 09a: athrow
        // 09b: aload 11
        // 09d: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 0a0: fconst_0
        // 0a1: fcmpg
        // 0a2: ifge 0bf
        // 0a5: goto 0ac
        // 0a8: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0ab: athrow
        // 0ac: aload 11
        // 0ae: dup
        // 0af: getfield javax/vecmath/Vector3f.x F
        // 0b2: ldc -1.0
        // 0b4: fmul
        // 0b5: putfield javax/vecmath/Vector3f.x F
        // 0b8: goto 0bf
        // 0bb: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0be: athrow
        // 0bf: aload 2
        // 0c0: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 0c3: getfield javax/vecmath/Vector3f.x F
        // 0c6: fconst_0
        // 0c7: fcmpl
        // 0c8: ifeq 0de
        // 0cb: aload 2
        // 0cc: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 0cf: getfield javax/vecmath/Vector3f.z F
        // 0d2: fconst_0
        // 0d3: fcmpl
        // 0d4: ifne 102
        // 0d7: goto 0de
        // 0da: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0dd: athrow
        // 0de: aload 11
        // 0e0: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 0e3: fconst_0
        // 0e4: fcmpg
        // 0e5: ifge 102
        // 0e8: goto 0ef
        // 0eb: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0ee: athrow
        // 0ef: aload 11
        // 0f1: dup
        // 0f2: getfield javax/vecmath/Vector3f.y F
        // 0f5: ldc -1.0
        // 0f7: fmul
        // 0f8: putfield javax/vecmath/Vector3f.y F
        // 0fb: goto 102
        // 0fe: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 101: athrow
        // 102: aload 2
        // 103: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 106: getfield javax/vecmath/Vector3f.x F
        // 109: fconst_0
        // 10a: fcmpl
        // 10b: ifeq 121
        // 10e: aload 2
        // 10f: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 112: getfield javax/vecmath/Vector3f.y F
        // 115: fconst_0
        // 116: fcmpl
        // 117: ifne 145
        // 11a: goto 121
        // 11d: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 120: athrow
        // 121: aload 11
        // 123: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 126: fconst_0
        // 127: fcmpg
        // 128: ifge 145
        // 12b: goto 132
        // 12e: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 131: athrow
        // 132: aload 11
        // 134: dup
        // 135: getfield javax/vecmath/Vector3f.z F
        // 138: ldc -1.0
        // 13a: fmul
        // 13b: putfield javax/vecmath/Vector3f.z F
        // 13e: goto 145
        // 141: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 144: athrow
        // 145: aload 0
        // 146: getfield com/trolmastercard/sexmod/b.j Lnet/minecraft/util/math/Vec3d;
        // 149: ifnull 164
        // 14c: aload 0
        // 14d: aload 0
        // 14e: getfield com/trolmastercard/sexmod/b.d Lnet/minecraft/util/math/Vec3d;
        // 151: aload 11
        // 153: aload 0
        // 154: getfield com/trolmastercard/sexmod/b.j Lnet/minecraft/util/math/Vec3d;
        // 157: invokestatic com/trolmastercard/sexmod/gx.a (Lnet/minecraft/util/math/Vec3d;Ljavax/vecmath/Vector3f;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 15a: putfield com/trolmastercard/sexmod/b.d Lnet/minecraft/util/math/Vec3d;
        // 15d: goto 164
        // 160: invokestatic com/trolmastercard/sexmod/b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 163: athrow
        // 164: aload 10
        // 166: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.vertices [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
        // 169: astore 12
        // 16b: aload 12
        // 16d: arraylength
        // 16e: istore 13
        // 170: bipush 0
        // 171: istore 14
        // 173: iload 14
        // 175: iload 13
        // 177: if_icmpge 20f
        // 17a: aload 12
        // 17c: iload 14
        // 17e: aaload
        // 17f: astore 15
        // 181: new javax/vecmath/Vector4f
        // 184: dup
        // 185: aload 15
        // 187: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 18a: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 18d: aload 15
        // 18f: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 192: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 195: aload 15
        // 197: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 19a: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 19d: fconst_1
        // 19e: invokespecial javax/vecmath/Vector4f.<init> (FFFF)V
        // 1a1: astore 16
        // 1a3: aload 0
        // 1a4: getfield com/trolmastercard/sexmod/b.c Lcom/trolmastercard/sexmod/cy;
        // 1a7: getfield com/trolmastercard/sexmod/cy.c Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 1aa: invokevirtual software/bernie/geckolib3/util/MatrixStack.getModelMatrix ()Ljavax/vecmath/Matrix4f;
        // 1ad: aload 16
        // 1af: invokevirtual javax/vecmath/Matrix4f.transform (Ljavax/vecmath/Tuple4f;)V
        // 1b2: aload 1
        // 1b3: aload 16
        // 1b5: invokevirtual javax/vecmath/Vector4f.getX ()F
        // 1b8: f2d
        // 1b9: aload 16
        // 1bb: invokevirtual javax/vecmath/Vector4f.getY ()F
        // 1be: f2d
        // 1bf: aload 16
        // 1c1: invokevirtual javax/vecmath/Vector4f.getZ ()F
        // 1c4: f2d
        // 1c5: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1c8: aload 15
        // 1ca: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureU F
        // 1cd: f2d
        // 1ce: aload 15
        // 1d0: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureV F
        // 1d3: f2d
        // 1d4: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1d7: aload 0
        // 1d8: getfield com/trolmastercard/sexmod/b.d Lnet/minecraft/util/math/Vec3d;
        // 1db: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 1de: d2f
        // 1df: aload 0
        // 1e0: getfield com/trolmastercard/sexmod/b.d Lnet/minecraft/util/math/Vec3d;
        // 1e3: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 1e6: d2f
        // 1e7: aload 0
        // 1e8: getfield com/trolmastercard/sexmod/b.d Lnet/minecraft/util/math/Vec3d;
        // 1eb: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 1ee: d2f
        // 1ef: fload 6
        // 1f1: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181666_a (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1f4: aload 11
        // 1f6: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 1f9: aload 11
        // 1fb: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 1fe: aload 11
        // 200: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 203: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
        // 206: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
        // 209: iinc 14 1
        // 20c: goto 173
        // 20f: iinc 9 1
        // 212: goto 02f
        // 215: return
        // try (30 -> 33): 33 java/lang/IllegalStateException
        // try (51 -> 69): 70 java/lang/IllegalStateException
        // try (63 -> 77): 78 java/lang/IllegalStateException
        // try (72 -> 86): 87 java/lang/IllegalStateException
        // try (89 -> 101): 102 java/lang/IllegalStateException
        // try (95 -> 109): 110 java/lang/IllegalStateException
        // try (104 -> 118): 119 java/lang/IllegalStateException
        // try (121 -> 133): 134 java/lang/IllegalStateException
        // try (127 -> 141): 142 java/lang/IllegalStateException
        // try (136 -> 150): 151 java/lang/IllegalStateException
        // try (153 -> 164): 165 java/lang/IllegalStateException
    }

    private static IllegalStateException a(IllegalStateException var0) {
        return var0;
    }
}
