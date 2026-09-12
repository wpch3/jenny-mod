package com.schnurritv.sexmod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import javax.vecmath.Vector3f;
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

public class bd extends GeoEntityRenderer<a8> {
   public static final float i = 1.876945F;
   public static final float c = 2.876945F;
   Minecraft a;
   a8 g = null;
   com.schnurritv.sexmod.bk.b h = null;
   HashMap<String, String> d = new HashMap<>();
   HashMap<String, String> k = new HashMap<>();
   HashMap<String, a1> j = new HashMap<>();
   public static boolean b = false;
   Vec3d e = new Vec3d(1.0, 1.0, 1.0);
   Vec3d f;

   public bd(RenderManager var1, AnimatedGeoModel<a8> var2) {
      super(var1, var2);
      this.a = Minecraft.func_71410_x();
      this.a();
   }

   void a() {
      this.d.put("customLegL", "legL");
      this.d.put("customShinL", "shinL");
      this.d.put("customLegR", "legR");
      this.d.put("customShinR", "shinR");
      this.k.put("top", "upperBody");
      this.k.put("customArmL", "armL");
      this.k.put("customLowerArmL", "lowerArmL");
      this.k.put("customArmR", "armR");
      this.k.put("customLowerArmR", "lowerArmR");
      this.j.put("lowerArmR", var0 -> b1.b(var0.i()));
      this.j.put("lowerArmL", var0 -> b1.b(var0.F()));
   }

   boolean c(a8 var1) {
      String var2 = var1.b();

      try {
         if (var1.d) {
            return false;
         }
      } catch (IllegalStateException var10) {
         throw a(var10);
      }

      try {
         if (bk.k(var2)) {
            return false;
         }
      } catch (IllegalStateException var7) {
         throw a(var7);
      }

      try {
         if (this.a.func_147104_D() != null) {
            return true;
         }
      } catch (IllegalStateException var9) {
         throw a(var9);
      }

      UUID var3 = var1.a();
      bi var4 = bi.f(var3);

      try {
         if (var4 == null) {
            return true;
         }
      } catch (IllegalStateException var8) {
         throw a(var8);
      }

      HashSet var5 = var4.K();
      var5.remove(var2);
      String var6 = bi.a(var5);
      at.a.sendToServer(new c8(var6, var1.a()));
      return true;
   }

   @SideOnly(Side.CLIENT)
   public static void a(bi var0, float var1) {
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
         if (!var0.C()) {
            return;
         }
      } catch (IllegalStateException var7) {
         throw a(var7);
      }

      RenderManager var2 = Minecraft.func_71410_x().func_175598_ae();

      for (String var4 : var0.K()) {
         a8 var5 = new a8(var0.field_70170_p, var0.A(), var4);
         b = true;
         var2.func_188391_a(var5, 0.0, 0.0, 0.0, 0.0F, var1, false);
      }
   }

   public boolean a(a8 var1, ICamera var2, double var3, double var5, double var7) {
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
         if (b) {
            b = false;
            return true;
         } else {
            return false;
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }
   }

   void a(com.schnurritv.sexmod.bk.b param1, a8 param2, float param3) {
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
      // 05: invokevirtual com/schnurritv/sexmod/bk$b.g ()Lcom/schnurritv/sexmod/ad;
      // 08: getstatic com/schnurritv/sexmod/ad.DEFAULT Lcom/schnurritv/sexmod/ad;
      // 0b: if_acmpne 1f
      // 0e: goto 15
      // 11: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 14: athrow
      // 15: aload 0
      // 16: aconst_null
      // 17: putfield com/schnurritv/sexmod/bd.f Lnet/minecraft/util/math/Vec3d;
      // 1a: return
      // 1b: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1e: athrow
      // 1f: sipush 2896
      // 22: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 25: aload 0
      // 26: aload 1
      // 27: invokevirtual com/schnurritv/sexmod/bk$b.g ()Lcom/schnurritv/sexmod/ad;
      // 2a: getstatic com/schnurritv/sexmod/ad.SEXMOD Lcom/schnurritv/sexmod/ad;
      // 2d: if_acmpne 3c
      // 30: aload 2
      // 31: fload 3
      // 32: invokestatic com/schnurritv/sexmod/b1.a (Lnet/minecraft/entity/EntityLivingBase;F)Lnet/minecraft/util/math/Vec3d;
      // 35: goto 3d
      // 38: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3b: athrow
      // 3c: aconst_null
      // 3d: putfield com/schnurritv/sexmod/bd.f Lnet/minecraft/util/math/Vec3d;
      // 40: return
      // try (0 -> 6): 7 java/lang/IllegalStateException
      // try (2 -> 13): 13 java/lang/IllegalStateException
      // try (15 -> 26): 26 java/lang/IllegalStateException
   }

   public void a(a8 param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: fload 9
      // 003: invokevirtual com/schnurritv/sexmod/bd.a (F)Z
      // 006: ifne 00e
      // 009: return
      // 00a: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 00d: athrow
      // 00e: getstatic com/schnurritv/sexmod/bk.c Z
      // 011: ifeq 019
      // 014: return
      // 015: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 018: athrow
      // 019: aload 0
      // 01a: aload 1
      // 01b: invokevirtual com/schnurritv/sexmod/bd.c (Lcom/schnurritv/sexmod/a8;)Z
      // 01e: ifeq 026
      // 021: return
      // 022: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 025: athrow
      // 026: aload 1
      // 027: new software/bernie/geckolib3/util/MatrixStack
      // 02a: dup
      // 02b: invokespecial software/bernie/geckolib3/util/MatrixStack.<init> ()V
      // 02e: putfield com/schnurritv/sexmod/a8.g Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 031: aload 1
      // 032: invokevirtual com/schnurritv/sexmod/a8.b ()Ljava/lang/String;
      // 035: invokestatic com/schnurritv/sexmod/bk.l (Ljava/lang/String;)Lcom/schnurritv/sexmod/bk$b;
      // 038: astore 10
      // 03a: aload 0
      // 03b: aload 1
      // 03c: putfield com/schnurritv/sexmod/bd.g Lcom/schnurritv/sexmod/a8;
      // 03f: aload 0
      // 040: aload 10
      // 042: putfield com/schnurritv/sexmod/bd.h Lcom/schnurritv/sexmod/bk$b;
      // 045: aload 0
      // 046: aload 10
      // 048: aload 1
      // 049: fload 9
      // 04b: invokevirtual com/schnurritv/sexmod/bd.a (Lcom/schnurritv/sexmod/bk$b;Lcom/schnurritv/sexmod/a8;F)V
      // 04e: fload 9
      // 050: ldc 1.876945
      // 052: fcmpl
      // 053: ifeq 065
      // 056: fload 9
      // 058: ldc 2.876945
      // 05a: fcmpl
      // 05b: ifne 08c
      // 05e: goto 065
      // 061: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 064: athrow
      // 065: aload 0
      // 066: new net/minecraft/util/math/Vec3d
      // 069: dup
      // 06a: dconst_1
      // 06b: dconst_1
      // 06c: dconst_1
      // 06d: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 070: putfield com/schnurritv/sexmod/bd.e Lnet/minecraft/util/math/Vec3d;
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
      // 088: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 08b: athrow
      // 08c: aload 1
      // 08d: invokevirtual com/schnurritv/sexmod/a8.a ()Ljava/util/UUID;
      // 090: astore 11
      // 092: aload 11
      // 094: ifnonnull 09c
      // 097: return
      // 098: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09b: athrow
      // 09c: aload 11
      // 09e: invokestatic com/schnurritv/sexmod/bi.f (Ljava/util/UUID;)Lcom/schnurritv/sexmod/bi;
      // 0a1: astore 13
      // 0a3: aload 13
      // 0a5: ifnonnull 0ad
      // 0a8: return
      // 0a9: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ac: athrow
      // 0ad: aload 10
      // 0af: ifnull 0d5
      // 0b2: aload 10
      // 0b4: invokevirtual com/schnurritv/sexmod/bk$b.j ()Z
      // 0b7: ifne 0d5
      // 0ba: goto 0c1
      // 0bd: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c0: athrow
      // 0c1: aload 13
      // 0c3: invokevirtual com/schnurritv/sexmod/bi.L ()I
      // 0c6: ifne 0d5
      // 0c9: goto 0d0
      // 0cc: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0cf: athrow
      // 0d0: return
      // 0d1: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0d4: athrow
      // 0d5: aload 13
      // 0d7: instanceof com/schnurritv/sexmod/bg
      // 0da: ifne 0e4
      // 0dd: aload 13
      // 0df: astore 12
      // 0e1: goto 115
      // 0e4: aload 13
      // 0e6: checkcast com/schnurritv/sexmod/bg
      // 0e9: invokevirtual com/schnurritv/sexmod/bg.q ()Ljava/util/UUID;
      // 0ec: astore 14
      // 0ee: aload 14
      // 0f0: ifnonnull 0f8
      // 0f3: return
      // 0f4: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0f7: athrow
      // 0f8: aload 1
      // 0f9: getfield com/schnurritv/sexmod/a8.field_70170_p Lnet/minecraft/world/World;
      // 0fc: aload 14
      // 0fe: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
      // 101: astore 15
      // 103: aload 15
      // 105: ifnonnull 111
      // 108: aload 13
      // 10a: goto 113
      // 10d: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 110: athrow
      // 111: aload 15
      // 113: astore 12
      // 115: aload 0
      // 116: aload 1
      // 117: aload 12
      // 119: aload 13
      // 11b: fload 9
      // 11d: invokevirtual com/schnurritv/sexmod/bd.a (Lcom/schnurritv/sexmod/a8;Lnet/minecraft/entity/EntityLivingBase;Lcom/schnurritv/sexmod/bi;F)Lnet/minecraft/util/math/Vec3d;
      // 120: astore 14
      // 122: new net/minecraft/util/math/BlockPos
      // 125: dup
      // 126: aload 12
      // 128: getfield net/minecraft/entity/EntityLivingBase.field_70165_t D
      // 12b: invokestatic java/lang/Math.floor (D)D
      // 12e: aload 12
      // 130: getfield net/minecraft/entity/EntityLivingBase.field_70163_u D
      // 133: invokestatic java/lang/Math.floor (D)D
      // 136: aload 12
      // 138: getfield net/minecraft/entity/EntityLivingBase.field_70161_v D
      // 13b: invokestatic java/lang/Math.floor (D)D
      // 13e: invokespecial net/minecraft/util/math/BlockPos.<init> (DDD)V
      // 141: astore 15
      // 143: aload 12
      // 145: getfield net/minecraft/entity/EntityLivingBase.field_70170_p Lnet/minecraft/world/World;
      // 148: aload 15
      // 14a: bipush 1
      // 14b: invokevirtual net/minecraft/world/World.func_175721_c (Lnet/minecraft/util/math/BlockPos;Z)I
      // 14e: istore 16
      // 150: new net/minecraft/util/math/Vec3d
      // 153: dup
      // 154: dconst_1
      // 155: dconst_1
      // 156: dconst_1
      // 157: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 15a: astore 17
      // 15c: iload 16
      // 15e: i2f
      // 15f: ldc 10.0
      // 161: ldc 15.0
      // 163: invokestatic com/schnurritv/sexmod/b1.b (FFF)F
      // 166: ldc 15.0
      // 168: fdiv
      // 169: fstore 18
      // 16b: aload 0
      // 16c: new net/minecraft/util/math/Vec3d
      // 16f: dup
      // 170: aload 17
      // 172: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 175: fload 18
      // 177: f2d
      // 178: dmul
      // 179: aload 17
      // 17b: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 17e: fload 18
      // 180: f2d
      // 181: dmul
      // 182: aload 17
      // 184: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 187: fload 18
      // 189: f2d
      // 18a: dmul
      // 18b: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 18e: putfield com/schnurritv/sexmod/bd.e Lnet/minecraft/util/math/Vec3d;
      // 191: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 194: aload 14
      // 196: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 199: aload 14
      // 19b: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 19e: aload 14
      // 1a0: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 1a3: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // 1a6: aload 13
      // 1a8: invokevirtual com/schnurritv/sexmod/bi.j ()Z
      // 1ab: ifeq 1c3
      // 1ae: aload 13
      // 1b0: invokevirtual com/schnurritv/sexmod/bi.d ()Ljava/lang/Float;
      // 1b3: invokevirtual java/lang/Float.floatValue ()F
      // 1b6: fconst_0
      // 1b7: fconst_1
      // 1b8: fconst_0
      // 1b9: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 1bc: goto 1c3
      // 1bf: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1c2: athrow
      // 1c3: aload 0
      // 1c4: aload 1
      // 1c5: dconst_0
      // 1c6: dconst_0
      // 1c7: dconst_0
      // 1c8: fload 8
      // 1ca: fload 9
      // 1cc: invokespecial software/bernie/geckolib3/renderers/geo/GeoEntityRenderer.doRender (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V
      // 1cf: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 1d2: sipush 2896
      // 1d5: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 1d8: return
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
      // try (173 -> 211): 212 java/lang/IllegalStateException
   }

   Vec3d a(a8 var1, EntityLivingBase var2, bi var3, float var4) {
      Vec3d var5;
      if (var3.j()) {
         Vec3d var6 = var3.o();
         float var7 = var3.d();
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
         var5 = b1.a(new Vec3d(var2.field_70142_S, var2.field_70137_T, var2.field_70136_U), var2.func_174791_d(), var4);
      }

      EntityPlayerSP var8 = this.a.field_71439_g;
      Vec3d var9 = b1.a(new Vec3d(var8.field_70142_S, var8.field_70137_T, var8.field_70136_U), var8.func_174791_d(), var4);
      return var5.func_178788_d(var9);
   }

   public void a(GeoModel var1, a8 var2, float var3, float var4, float var5, float var6, float var7) {
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

         var2.g.translate(-var10.getPivotX() / 16.0F, -var10.getPivotY() / 16.0F, -var10.getPivotZ() / 16.0F);
         this.renderRecursively(var8, var10, var4, var5, var6, var7);
      }

      Tessellator.func_178181_a().func_78381_a();
      GlStateManager.func_179101_C();
      GlStateManager.func_179089_o();
   }

   EntityLivingBase a(a8 var1) {
      bi var3 = this.b(var1);

      try {
         if (var3 == null) {
            return null;
         }
      } catch (IllegalStateException var5) {
         throw a(var5);
      }

      Object var2;
      if (!(var3 instanceof bg)) {
         var2 = var3;
      } else {
         EntityPlayer var4 = var1.field_70170_p.func_152378_a(((bg)var3).q());

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

   bi b(a8 var1) {
      return bi.f(var1.a());
   }

   void a(a8 var1, GeoBone var2, float var3) {
      String var4 = this.d(var1);

      try {
         if (var4 == null) {
            return;
         }
      } catch (IllegalStateException var5) {
         throw a(var5);
      }

      this.a(var1, var2, var3, var4);
   }

   void a(a8 param1, GeoBone param2, float param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/schnurritv/sexmod/bd.b (Lcom/schnurritv/sexmod/a8;)Lcom/schnurritv/sexmod/bi;
      // 05: astore 5
      // 07: aload 0
      // 08: aload 1
      // 09: invokevirtual com/schnurritv/sexmod/bd.a (Lcom/schnurritv/sexmod/a8;)Lnet/minecraft/entity/EntityLivingBase;
      // 0c: astore 6
      // 0e: aload 6
      // 10: getfield net/minecraft/entity/EntityLivingBase.field_70760_ar F
      // 13: aload 6
      // 15: getfield net/minecraft/entity/EntityLivingBase.field_70761_aq F
      // 18: aload 0
      // 19: getfield com/schnurritv/sexmod/bd.a Lnet/minecraft/client/Minecraft;
      // 1c: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
      // 1f: invokestatic com/schnurritv/sexmod/b1.a (FFF)F
      // 22: invokestatic com/schnurritv/sexmod/b1.b (F)F
      // 25: fstore 7
      // 27: aload 1
      // 28: aload 5
      // 2a: aload 4
      // 2c: bipush 0
      // 2d: fconst_0
      // 2e: invokevirtual com/schnurritv/sexmod/bi.a (Ljava/lang/String;ZF)Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 31: putfield com/schnurritv/sexmod/a8.g Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 34: aload 1
      // 35: getfield com/schnurritv/sexmod/a8.d Z
      // 38: ifeq 49
      // 3b: fload 3
      // 3c: ldc 2.876945
      // 3e: fcmpl
      // 3f: ifeq 4e
      // 42: goto 49
      // 45: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 48: athrow
      // 49: return
      // 4a: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4d: athrow
      // 4e: aload 1
      // 4f: getfield com/schnurritv/sexmod/a8.g Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 52: ldc 0.5
      // 54: ldc 0.5
      // 56: ldc 0.5
      // 58: invokevirtual software/bernie/geckolib3/util/MatrixStack.scale (FFF)V
      // 5b: aload 1
      // 5c: getfield com/schnurritv/sexmod/a8.g Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 5f: getstatic com/schnurritv/sexmod/a4.l F
      // 62: fneg
      // 63: f2d
      // 64: invokestatic java/lang/Math.toRadians (D)D
      // 67: d2f
      // 68: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotateY (F)V
      // 6b: return
      // try (18 -> 32): 33 java/lang/IllegalStateException
      // try (28 -> 36): 36 java/lang/IllegalStateException
   }

   String d(a8 var1) {
      try {
         if (var1.d) {
            return var1.a.boneName;
         }
      } catch (IllegalStateException var5) {
         throw a(var5);
      }

      com.schnurritv.sexmod.bk.b var2 = bk.l(var1.b());

      try {
         if (var2 == null) {
            return null;
         }
      } catch (IllegalStateException var3) {
         throw a(var3);
      }

      try {
         if (bQ.CUSTOM_BONE.equals(var2.l())) {
            return var2.k();
         }
      } catch (IllegalStateException var4) {
         throw a(var4);
      }

      return var2.l().boneName;
   }

   @Override
   public void renderRecursively(BufferBuilder var1, GeoBone var2, float var3, float var4, float var5, float var6) {
      this.g.g.push();
      this.g.g.translate(var2);
      this.g.g.moveToPivot(var2);
      this.g.g.rotate(var2);
      this.g.g.scale(var2);
      this.g.g.moveBackFromPivot(var2);
      if (!var2.isHidden()) {
         for (GeoCube var8 : var2.childCubes) {
            this.g.g.push();
            GlStateManager.func_179094_E();
            this.renderCube(var1, var8, var3, var4, var5, var6);
            GlStateManager.func_179121_F();
            this.g.g.pop();
         }
      }

      if (!var2.childBonesAreHiddenToo()) {
         for (GeoBone var11 : var2.childBones) {
            this.renderRecursively(var1, var11, var3, var4, var5, var6);
         }
      }

      try {
         this.g.g.pop();
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
      // 001: getfield com/schnurritv/sexmod/bd.g Lcom/schnurritv/sexmod/a8;
      // 004: getfield com/schnurritv/sexmod/a8.g Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 007: aload 2
      // 008: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
      // 00b: aload 0
      // 00c: getfield com/schnurritv/sexmod/bd.g Lcom/schnurritv/sexmod/a8;
      // 00f: getfield com/schnurritv/sexmod/a8.g Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 012: aload 2
      // 013: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
      // 016: aload 0
      // 017: getfield com/schnurritv/sexmod/bd.g Lcom/schnurritv/sexmod/a8;
      // 01a: getfield com/schnurritv/sexmod/a8.g Lsoftware/bernie/geckolib3/util/MatrixStack;
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
      // 033: if_icmpge 212
      // 036: aload 7
      // 038: iload 9
      // 03a: aaload
      // 03b: astore 10
      // 03d: aload 10
      // 03f: ifnonnull 049
      // 042: goto 20c
      // 045: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
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
      // 06e: getfield com/schnurritv/sexmod/bd.g Lcom/schnurritv/sexmod/a8;
      // 071: getfield com/schnurritv/sexmod/a8.g Lsoftware/bernie/geckolib3/util/MatrixStack;
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
      // 097: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09a: athrow
      // 09b: aload 11
      // 09d: invokevirtual javax/vecmath/Vector3f.getX ()F
      // 0a0: fconst_0
      // 0a1: fcmpg
      // 0a2: ifge 0bf
      // 0a5: goto 0ac
      // 0a8: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ab: athrow
      // 0ac: aload 11
      // 0ae: dup
      // 0af: getfield javax/vecmath/Vector3f.x F
      // 0b2: ldc -1.0
      // 0b4: fmul
      // 0b5: putfield javax/vecmath/Vector3f.x F
      // 0b8: goto 0bf
      // 0bb: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
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
      // 0da: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0dd: athrow
      // 0de: aload 11
      // 0e0: invokevirtual javax/vecmath/Vector3f.getY ()F
      // 0e3: fconst_0
      // 0e4: fcmpg
      // 0e5: ifge 102
      // 0e8: goto 0ef
      // 0eb: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ee: athrow
      // 0ef: aload 11
      // 0f1: dup
      // 0f2: getfield javax/vecmath/Vector3f.y F
      // 0f5: ldc -1.0
      // 0f7: fmul
      // 0f8: putfield javax/vecmath/Vector3f.y F
      // 0fb: goto 102
      // 0fe: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
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
      // 11d: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 120: athrow
      // 121: aload 11
      // 123: invokevirtual javax/vecmath/Vector3f.getZ ()F
      // 126: fconst_0
      // 127: fcmpg
      // 128: ifge 145
      // 12b: goto 132
      // 12e: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 131: athrow
      // 132: aload 11
      // 134: dup
      // 135: getfield javax/vecmath/Vector3f.z F
      // 138: ldc -1.0
      // 13a: fmul
      // 13b: putfield javax/vecmath/Vector3f.z F
      // 13e: goto 145
      // 141: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 144: athrow
      // 145: aload 0
      // 146: getfield com/schnurritv/sexmod/bd.f Lnet/minecraft/util/math/Vec3d;
      // 149: ifnull 161
      // 14c: aload 0
      // 14d: aload 0
      // 14e: aload 0
      // 14f: getfield com/schnurritv/sexmod/bd.e Lnet/minecraft/util/math/Vec3d;
      // 152: aload 11
      // 154: invokevirtual com/schnurritv/sexmod/bd.a (Lnet/minecraft/util/math/Vec3d;Ljavax/vecmath/Vector3f;)Lnet/minecraft/util/math/Vec3d;
      // 157: putfield com/schnurritv/sexmod/bd.e Lnet/minecraft/util/math/Vec3d;
      // 15a: goto 161
      // 15d: invokestatic com/schnurritv/sexmod/bd.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 160: athrow
      // 161: aload 10
      // 163: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.vertices [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
      // 166: astore 12
      // 168: aload 12
      // 16a: arraylength
      // 16b: istore 13
      // 16d: bipush 0
      // 16e: istore 14
      // 170: iload 14
      // 172: iload 13
      // 174: if_icmpge 20c
      // 177: aload 12
      // 179: iload 14
      // 17b: aaload
      // 17c: astore 15
      // 17e: new javax/vecmath/Vector4f
      // 181: dup
      // 182: aload 15
      // 184: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
      // 187: invokevirtual javax/vecmath/Vector3f.getX ()F
      // 18a: aload 15
      // 18c: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
      // 18f: invokevirtual javax/vecmath/Vector3f.getY ()F
      // 192: aload 15
      // 194: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
      // 197: invokevirtual javax/vecmath/Vector3f.getZ ()F
      // 19a: fconst_1
      // 19b: invokespecial javax/vecmath/Vector4f.<init> (FFFF)V
      // 19e: astore 16
      // 1a0: aload 0
      // 1a1: getfield com/schnurritv/sexmod/bd.g Lcom/schnurritv/sexmod/a8;
      // 1a4: getfield com/schnurritv/sexmod/a8.g Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 1a7: invokevirtual software/bernie/geckolib3/util/MatrixStack.getModelMatrix ()Ljavax/vecmath/Matrix4f;
      // 1aa: aload 16
      // 1ac: invokevirtual javax/vecmath/Matrix4f.transform (Ljavax/vecmath/Tuple4f;)V
      // 1af: aload 1
      // 1b0: aload 16
      // 1b2: invokevirtual javax/vecmath/Vector4f.getX ()F
      // 1b5: f2d
      // 1b6: aload 16
      // 1b8: invokevirtual javax/vecmath/Vector4f.getY ()F
      // 1bb: f2d
      // 1bc: aload 16
      // 1be: invokevirtual javax/vecmath/Vector4f.getZ ()F
      // 1c1: f2d
      // 1c2: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 1c5: aload 15
      // 1c7: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureU F
      // 1ca: f2d
      // 1cb: aload 15
      // 1cd: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureV F
      // 1d0: f2d
      // 1d1: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 1d4: aload 0
      // 1d5: getfield com/schnurritv/sexmod/bd.e Lnet/minecraft/util/math/Vec3d;
      // 1d8: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 1db: d2f
      // 1dc: aload 0
      // 1dd: getfield com/schnurritv/sexmod/bd.e Lnet/minecraft/util/math/Vec3d;
      // 1e0: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 1e3: d2f
      // 1e4: aload 0
      // 1e5: getfield com/schnurritv/sexmod/bd.e Lnet/minecraft/util/math/Vec3d;
      // 1e8: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 1eb: d2f
      // 1ec: fload 6
      // 1ee: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181666_a (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
      // 1f1: aload 11
      // 1f3: invokevirtual javax/vecmath/Vector3f.getX ()F
      // 1f6: aload 11
      // 1f8: invokevirtual javax/vecmath/Vector3f.getY ()F
      // 1fb: aload 11
      // 1fd: invokevirtual javax/vecmath/Vector3f.getZ ()F
      // 200: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
      // 203: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
      // 206: iinc 14 1
      // 209: goto 170
      // 20c: iinc 9 1
      // 20f: goto 02f
      // 212: return
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
      // try (153 -> 163): 164 java/lang/IllegalStateException
   }

   public Vec3d a(Vec3d var1, Vector3f var2) {
      double var3 = b1.a(var2, this.f);

      Vec3d var10000;
      try {
         var10000 = var1;
         if (var3 > 0.0) {
            return b1.a(var1, bW.k, b1.d(Math.abs(var3)) * 0.1F);
         }
      } catch (IllegalStateException var5) {
         throw a(var5);
      }

      return b1.a(var10000, bW.m, b1.d(Math.abs(var3)) * 0.1F);
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
