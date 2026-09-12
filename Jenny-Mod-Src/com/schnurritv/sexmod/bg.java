package com.schnurritv.sexmod;

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

public class bG extends bP<ct> {
   static final Vec3i M = new Vec3i(255, 255, 255);
   static final float P = -420.69F;
   static final float B = 8.0F;
   static final float Q = 3.0F;
   static final Vec3d D = new Vec3d(10.0, -20.0, -10.0);
   static final float C = 0.1F;
   static final HashSet<String> H = new HashSet<>(
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
   static final HashSet<String> y = new HashSet<>(Arrays.asList("lashR", "lashL", "closedR", "closedL", "browL", "browR", "closedL", "closedL"));
   static final HashSet<String> A = new HashSet<>(Arrays.asList("meatLegR", "meatShinR", "meatFootR", "boobR", "boobR1", "boobR2"));
   static Minecraft L;
   float z = 0.0F;
   boolean K = false;
   boolean R = false;
   float J = 0.0F;
   float G = 0.0F;
   float O = 0.0F;
   float E = 0.0F;
   float N = 0.0F;
   float F = 0.0F;
   float I = 0.0F;
   float S = 0.0F;

   public bG(RenderManager var1, AnimatedGeoModel var2, double var3) {
      super(var1, var2, var3);
      L = Minecraft.func_71410_x();
   }

   protected ResourceLocation a(ct var1) throws IOException {
      UUID var3 = var1.r();
      if (var3 == null) {
         var3 = var1.a();
      }

      label43: {
         try {
            if (!(var1.field_70170_p instanceof com.b) && var3 != null) {
               break label43;
            }
         } catch (IOException var6) {
            throw a(var6);
         }

         ResourceLocation var2 = f.get(L.func_110432_I().func_148256_e().getId());

         try {
            if (var2 == null) {
               return this.a(L.func_110432_I().func_148256_e().getId(), var1.field_70170_p);
            }

            return var2;
         } catch (IOException var5) {
            throw a(var5);
         }
      }

      ResourceLocation var7 = f.get(var3);

      try {
         if (var7 == null) {
            return this.a(var3, var1.field_70170_p);
         }
      } catch (IOException var4) {
         throw a(var4);
      }

      return var7;
   }

   public void b(ct var1, float var2) {
      L.func_175598_ae().func_188391_a(var1, 0.0, 0.0, 0.0, -420.69F, var2, false);
   }

   private void a(float var1) {
      if (L.func_175606_aa() instanceof EntityPlayer) {
         EntityPlayer var2 = (EntityPlayer)L.func_175606_aa();
         float var3 = var2.field_70140_Q - var2.field_70141_P;
         float var4 = -(var2.field_70140_Q + var3 * var1);
         float var5 = var2.field_71107_bF + (var2.field_71109_bG - var2.field_71107_bF) * var1;
         float var6 = MathHelper.func_76126_a(var4 * (float) Math.PI) * var5 * 0.5F;
         GlStateManager.func_179137_b(
            Math.cos(L.field_71439_g.field_70177_z * (Math.PI / 180.0)) * var6,
            Math.abs(MathHelper.func_76134_b(var4 * (float) Math.PI) * var5),
            Math.sin(L.field_71439_g.field_70177_z * (Math.PI / 180.0)) * var6
         );
      }
   }

   public void a(GeoModel var1, ct var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var2.Q);
   }

   @Override
   public void func_76979_b(Entity param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: instanceof com/schnurritv/sexmod/ct
      // 04: ifne 1a
      // 07: aload 0
      // 08: aload 1
      // 09: dload 2
      // 0a: dload 4
      // 0c: dload 6
      // 0e: fload 8
      // 10: fload 9
      // 12: invokespecial com/schnurritv/sexmod/bP.func_76979_b (Lnet/minecraft/entity/Entity;DDDFF)V
      // 15: return
      // 16: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 1
      // 1b: checkcast com/schnurritv/sexmod/ct
      // 1e: astore 10
      // 20: aload 10
      // 22: invokevirtual com/schnurritv/sexmod/ct.D ()Lcom/schnurritv/sexmod/bj;
      // 25: getstatic com/schnurritv/sexmod/bj.PICK_UP Lcom/schnurritv/sexmod/bj;
      // 28: if_acmpeq 3d
      // 2b: aload 10
      // 2d: invokevirtual com/schnurritv/sexmod/ct.D ()Lcom/schnurritv/sexmod/bj;
      // 30: getstatic com/schnurritv/sexmod/bj.SHOULDER_IDLE Lcom/schnurritv/sexmod/bj;
      // 33: if_acmpne 42
      // 36: goto 3d
      // 39: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: return
      // 3e: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: aload 0
      // 43: aload 1
      // 44: dload 2
      // 45: dload 4
      // 47: dload 6
      // 49: fload 8
      // 4b: fload 9
      // 4d: invokespecial com/schnurritv/sexmod/bP.func_76979_b (Lnet/minecraft/entity/Entity;DDDFF)V
      // 50: return
      // try (0 -> 12): 12 java/lang/RuntimeException
      // try (17 -> 25): 26 java/lang/RuntimeException
      // try (21 -> 29): 29 java/lang/RuntimeException
   }

   Vec3d a(World var1, ct var2, UUID var3, double var4, double var6, double var8) {
      try {
         if (var1 == null) {
            return new Vec3d(var4, var6, var8);
         }
      } catch (RuntimeException var16) {
         throw a(var16);
      }

      try {
         if (var3 == null) {
            return new Vec3d(var4, var6, var8);
         }
      } catch (RuntimeException var13) {
         throw a(var13);
      }

      try {
         if (var2 == null) {
            return new Vec3d(var4, var6, var8);
         }
      } catch (RuntimeException var15) {
         throw a(var15);
      }

      EntityPlayer var10 = var1.func_152378_a(var3);

      try {
         if (var10 == null) {
            return new Vec3d(var4, var6, var8);
         }
      } catch (RuntimeException var14) {
         throw a(var14);
      }

      Vec3d var11 = var10.func_174791_d();
      Vec3d var12 = L.field_71439_g.func_174791_d();
      var2.field_70760_ar = var10.field_70758_at;
      var2.field_70761_aq = var10.field_70759_as;
      var2.b(bj.START_THROWING);
      return var11.func_178788_d(var12);
   }

   public void a(ct param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: putfield com/schnurritv/sexmod/bG.g Lcom/schnurritv/sexmod/bi;
      // 005: aload 0
      // 006: ldc -420.69
      // 008: fload 8
      // 00a: fcmpl
      // 00b: ifne 027
      // 00e: aload 1
      // 00f: invokevirtual com/schnurritv/sexmod/ct.D ()Lcom/schnurritv/sexmod/bj;
      // 012: getstatic com/schnurritv/sexmod/bj.SHOULDER_IDLE Lcom/schnurritv/sexmod/bj;
      // 015: if_acmpne 027
      // 018: goto 01f
      // 01b: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: bipush 1
      // 020: goto 028
      // 023: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: bipush 0
      // 028: putfield com/schnurritv/sexmod/bG.K Z
      // 02b: aload 0
      // 02c: ldc -420.69
      // 02e: fload 8
      // 030: fcmpl
      // 031: ifne 04d
      // 034: aload 1
      // 035: invokevirtual com/schnurritv/sexmod/ct.D ()Lcom/schnurritv/sexmod/bj;
      // 038: getstatic com/schnurritv/sexmod/bj.PICK_UP Lcom/schnurritv/sexmod/bj;
      // 03b: if_acmpne 04d
      // 03e: goto 045
      // 041: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: bipush 1
      // 046: goto 04e
      // 049: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: bipush 0
      // 04e: putfield com/schnurritv/sexmod/bG.R Z
      // 051: aload 0
      // 052: aload 1
      // 053: getfield com/schnurritv/sexmod/ct.field_70170_p Lnet/minecraft/world/World;
      // 056: aload 1
      // 057: invokevirtual com/schnurritv/sexmod/ct.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 05a: bipush 1
      // 05b: invokevirtual net/minecraft/world/World.func_175721_c (Lnet/minecraft/util/math/BlockPos;Z)I
      // 05e: i2f
      // 05f: putfield com/schnurritv/sexmod/bG.G F
      // 062: aload 0
      // 063: fload 9
      // 065: putfield com/schnurritv/sexmod/bG.z F
      // 068: aload 0
      // 069: fload 8
      // 06b: putfield com/schnurritv/sexmod/bG.J F
      // 06e: aload 1
      // 06f: invokevirtual com/schnurritv/sexmod/ct.D ()Lcom/schnurritv/sexmod/bj;
      // 072: astore 10
      // 074: aload 1
      // 075: invokevirtual com/schnurritv/sexmod/ct.a ()Ljava/util/UUID;
      // 078: astore 11
      // 07a: aload 1
      // 07b: getfield com/schnurritv/sexmod/ct.aB Z
      // 07e: ifeq 0a7
      // 081: aload 0
      // 082: aload 1
      // 083: getfield com/schnurritv/sexmod/ct.field_70170_p Lnet/minecraft/world/World;
      // 086: aload 1
      // 087: aload 11
      // 089: dload 2
      // 08a: dload 4
      // 08c: dload 6
      // 08e: invokevirtual com/schnurritv/sexmod/bG.a (Lnet/minecraft/world/World;Lcom/schnurritv/sexmod/ct;Ljava/util/UUID;DDD)Lnet/minecraft/util/math/Vec3d;
      // 091: astore 12
      // 093: aload 12
      // 095: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 098: dstore 2
      // 099: aload 12
      // 09b: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 09e: dstore 4
      // 0a0: aload 12
      // 0a2: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 0a5: dstore 6
      // 0a7: aload 10
      // 0a9: getstatic com/schnurritv/sexmod/bj.THROWN Lcom/schnurritv/sexmod/bj;
      // 0ac: if_acmpeq 0be
      // 0af: aload 10
      // 0b1: getstatic com/schnurritv/sexmod/bj.START_THROWING Lcom/schnurritv/sexmod/bj;
      // 0b4: if_acmpne 10f
      // 0b7: goto 0be
      // 0ba: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 0c1: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
      // 0c4: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
      // 0c7: ifne 0f3
      // 0ca: goto 0d1
      // 0cd: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: fload 8
      // 0d3: ldc -420.69
      // 0d5: fcmpl
      // 0d6: ifne 0f3
      // 0d9: goto 0e0
      // 0dc: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: aload 1
      // 0e1: getfield com/schnurritv/sexmod/ct.aB Z
      // 0e4: ifne 0f3
      // 0e7: goto 0ee
      // 0ea: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: return
      // 0ef: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: aload 1
      // 0f4: getfield com/schnurritv/sexmod/ct.aB Z
      // 0f7: ifne 10f
      // 0fa: aload 1
      // 0fb: invokevirtual com/schnurritv/sexmod/ct.d ()Ljava/lang/Float;
      // 0fe: invokevirtual java/lang/Float.floatValue ()F
      // 101: fstore 12
      // 103: aload 1
      // 104: fload 12
      // 106: putfield com/schnurritv/sexmod/ct.field_70760_ar F
      // 109: aload 1
      // 10a: fload 12
      // 10c: putfield com/schnurritv/sexmod/ct.field_70761_aq F
      // 10f: aload 1
      // 110: aload 10
      // 112: invokestatic com/schnurritv/sexmod/bG.a (Lcom/schnurritv/sexmod/ct;Lcom/schnurritv/sexmod/bj;)Z
      // 115: ifeq 28d
      // 118: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 11b: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 11e: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 121: aload 11
      // 123: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 126: ifeq 1d8
      // 129: goto 130
      // 12c: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: ldc -420.69
      // 132: fload 8
      // 134: fcmpl
      // 135: ifeq 144
      // 138: goto 13f
      // 13b: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: return
      // 140: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: aload 1
      // 145: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 148: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 14b: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 14e: ldc 180.0
      // 150: fadd
      // 151: putfield com/schnurritv/sexmod/ct.field_70761_aq F
      // 154: aload 1
      // 155: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 158: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 15b: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 15e: ldc 180.0
      // 160: fadd
      // 161: putfield com/schnurritv/sexmod/ct.field_70760_ar F
      // 164: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 167: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 16a: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70040_Z ()Lnet/minecraft/util/math/Vec3d;
      // 16d: astore 12
      // 16f: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 172: aload 12
      // 174: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 177: aload 12
      // 179: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 17c: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 17f: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 182: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70047_e ()F
      // 185: f2d
      // 186: dadd
      // 187: aload 12
      // 189: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 18c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // 18f: new net/minecraft/util/math/Vec3d
      // 192: dup
      // 193: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 196: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 199: getfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
      // 19c: invokestatic java/lang/Math.abs (F)F
      // 19f: fneg
      // 1a0: f2d
      // 1a1: dconst_0
      // 1a2: dconst_0
      // 1a3: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 1a6: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 1a9: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1ac: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 1af: invokestatic com/schnurritv/sexmod/ct.a (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
      // 1b2: astore 13
      // 1b4: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 1b7: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1ba: getfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
      // 1bd: aload 13
      // 1bf: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 1c2: d2f
      // 1c3: fconst_0
      // 1c4: aload 13
      // 1c6: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 1c9: d2f
      // 1ca: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 1cd: dconst_0
      // 1ce: dstore 2
      // 1cf: dconst_0
      // 1d0: dstore 4
      // 1d2: dconst_0
      // 1d3: dstore 6
      // 1d5: goto 3df
      // 1d8: aload 1
      // 1d9: getfield com/schnurritv/sexmod/ct.aB Z
      // 1dc: ifeq 203
      // 1df: aload 11
      // 1e1: ifnull 203
      // 1e4: goto 1eb
      // 1e7: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 1ee: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1f1: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 1f4: aload 11
      // 1f6: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 1f9: ifeq 26d
      // 1fc: goto 203
      // 1ff: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: aload 11
      // 205: ifnull 253
      // 208: goto 20f
      // 20b: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20e: athrow
      // 20f: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 212: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 215: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 218: aload 11
      // 21a: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 21d: ifne 253
      // 220: goto 227
      // 223: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 226: athrow
      // 227: aload 1
      // 228: getfield com/schnurritv/sexmod/ct.field_70170_p Lnet/minecraft/world/World;
      // 22b: aload 11
      // 22d: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
      // 230: astore 12
      // 232: aload 12
      // 234: ifnull 250
      // 237: aload 1
      // 238: aload 12
      // 23a: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
      // 23d: putfield com/schnurritv/sexmod/ct.field_70761_aq F
      // 240: aload 1
      // 241: aload 12
      // 243: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
      // 246: putfield com/schnurritv/sexmod/ct.field_70760_ar F
      // 249: goto 250
      // 24c: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24f: athrow
      // 250: goto 26d
      // 253: aload 1
      // 254: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 257: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 25a: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 25d: putfield com/schnurritv/sexmod/ct.field_70761_aq F
      // 260: aload 1
      // 261: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 264: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 267: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 26a: putfield com/schnurritv/sexmod/ct.field_70760_ar F
      // 26d: aload 0
      // 26e: aload 1
      // 26f: fload 9
      // 271: invokevirtual com/schnurritv/sexmod/bG.a (Lcom/schnurritv/sexmod/ct;F)Lnet/minecraft/util/math/Vec3d;
      // 274: astore 12
      // 276: aload 12
      // 278: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 27b: dstore 2
      // 27c: aload 12
      // 27e: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 281: dstore 4
      // 283: aload 12
      // 285: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 288: dstore 6
      // 28a: goto 3df
      // 28d: aload 0
      // 28e: getfield com/schnurritv/sexmod/bG.K Z
      // 291: ifeq 30e
      // 294: aload 0
      // 295: fload 9
      // 297: invokespecial com/schnurritv/sexmod/bG.a (F)V
      // 29a: new net/minecraft/util/math/Vec3d
      // 29d: dup
      // 29e: ldc -0.1
      // 2a0: ldc 0.2
      // 2a2: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 2a5: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
      // 2a8: getfield net/minecraft/client/settings/GameSettings.field_74334_X F
      // 2ab: ldc 110.0
      // 2ad: fdiv
      // 2ae: invokestatic com/schnurritv/sexmod/b1.a (FFF)F
      // 2b1: f2d
      // 2b2: dconst_0
      // 2b3: dconst_0
      // 2b4: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 2b7: astore 12
      // 2b9: aload 12
      // 2bb: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 2be: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 2c1: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 2c4: invokestatic com/schnurritv/sexmod/ct.a (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
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
      // 2de: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 2e1: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 2e4: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 2e7: putfield com/schnurritv/sexmod/ct.field_70761_aq F
      // 2ea: aload 1
      // 2eb: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 2ee: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 2f1: getfield net/minecraft/client/entity/EntityPlayerSP.field_70126_B F
      // 2f4: putfield com/schnurritv/sexmod/ct.field_70760_ar F
      // 2f7: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 2fa: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 2fd: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70093_af ()Z
      // 300: ifeq 30b
      // 303: dload 4
      // 305: ldc2_w 0.075
      // 308: dsub
      // 309: dstore 4
      // 30b: goto 3df
      // 30e: aload 10
      // 310: getstatic com/schnurritv/sexmod/bj.SHOULDER_IDLE Lcom/schnurritv/sexmod/bj;
      // 313: if_acmpne 3a2
      // 316: aload 11
      // 318: ifnonnull 327
      // 31b: goto 322
      // 31e: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 321: athrow
      // 322: return
      // 323: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 326: athrow
      // 327: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 32a: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 32d: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 330: aload 11
      // 332: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 335: ifeq 350
      // 338: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 33b: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
      // 33e: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
      // 341: ifne 350
      // 344: goto 34b
      // 347: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34a: athrow
      // 34b: return
      // 34c: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34f: athrow
      // 350: aload 1
      // 351: getfield com/schnurritv/sexmod/ct.field_70170_p Lnet/minecraft/world/World;
      // 354: aload 11
      // 356: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
      // 359: astore 12
      // 35b: aload 12
      // 35d: ifnonnull 365
      // 360: return
      // 361: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 364: athrow
      // 365: aload 0
      // 366: aload 12
      // 368: fload 9
      // 36a: invokevirtual com/schnurritv/sexmod/bG.a (Lnet/minecraft/entity/player/EntityPlayer;F)Ljavax/vecmath/Vector4f;
      // 36d: astore 13
      // 36f: aload 13
      // 371: getfield javax/vecmath/Vector4f.x F
      // 374: f2d
      // 375: dstore 2
      // 376: aload 13
      // 378: getfield javax/vecmath/Vector4f.y F
      // 37b: f2d
      // 37c: dstore 4
      // 37e: aload 13
      // 380: getfield javax/vecmath/Vector4f.z F
      // 383: f2d
      // 384: dstore 6
      // 386: aload 1
      // 387: aload 13
      // 389: getfield javax/vecmath/Vector4f.w F
      // 38c: putfield com/schnurritv/sexmod/ct.field_70761_aq F
      // 38f: aload 12
      // 391: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70093_af ()Z
      // 394: ifeq 39f
      // 397: dload 4
      // 399: ldc2_w 0.32
      // 39c: dsub
      // 39d: dstore 4
      // 39f: goto 3df
      // 3a2: aload 10
      // 3a4: getstatic com/schnurritv/sexmod/bj.PICK_UP Lcom/schnurritv/sexmod/bj;
      // 3a7: if_acmpne 3df
      // 3aa: aload 11
      // 3ac: ifnull 3df
      // 3af: goto 3b6
      // 3b2: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b5: athrow
      // 3b6: aload 1
      // 3b7: getfield com/schnurritv/sexmod/ct.field_70170_p Lnet/minecraft/world/World;
      // 3ba: aload 11
      // 3bc: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
      // 3bf: astore 12
      // 3c1: aload 12
      // 3c3: ifnull 3df
      // 3c6: aload 1
      // 3c7: aload 12
      // 3c9: getfield net/minecraft/entity/player/EntityPlayer.field_70758_at F
      // 3cc: putfield com/schnurritv/sexmod/ct.field_70760_ar F
      // 3cf: aload 1
      // 3d0: aload 12
      // 3d2: getfield net/minecraft/entity/player/EntityPlayer.field_70759_as F
      // 3d5: putfield com/schnurritv/sexmod/ct.field_70761_aq F
      // 3d8: goto 3df
      // 3db: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3de: athrow
      // 3df: aload 0
      // 3e0: aload 1
      // 3e1: dload 2
      // 3e2: dload 4
      // 3e4: dload 6
      // 3e6: fload 8
      // 3e8: fload 9
      // 3ea: invokespecial com/schnurritv/sexmod/bP.a (Lcom/schnurritv/sexmod/bi;DDDFF)V
      // 3ed: aload 1
      // 3ee: aload 10
      // 3f0: invokestatic com/schnurritv/sexmod/bG.a (Lcom/schnurritv/sexmod/ct;Lcom/schnurritv/sexmod/bj;)Z
      // 3f3: ifeq 42b
      // 3f6: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 3f9: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
      // 3fc: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
      // 3ff: ifne 42b
      // 402: goto 409
      // 405: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 408: athrow
      // 409: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 40c: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 40f: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 412: aload 11
      // 414: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 417: ifeq 42b
      // 41a: goto 421
      // 41d: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 420: athrow
      // 421: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 424: goto 42b
      // 427: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42a: athrow
      // 42b: return
      // try (0 -> 12): 13 java/lang/RuntimeException
      // try (8 -> 17): 17 java/lang/RuntimeException
      // try (20 -> 30): 31 java/lang/RuntimeException
      // try (26 -> 35): 35 java/lang/RuntimeException
      // try (82 -> 88): 89 java/lang/RuntimeException
      // try (85 -> 95): 96 java/lang/RuntimeException
      // try (91 -> 102): 103 java/lang/RuntimeException
      // try (98 -> 108): 109 java/lang/RuntimeException
      // try (105 -> 112): 112 java/lang/RuntimeException
      // try (127 -> 137): 138 java/lang/RuntimeException
      // try (131 -> 144): 145 java/lang/RuntimeException
      // try (140 -> 148): 148 java/lang/RuntimeException
      // try (215 -> 220): 221 java/lang/RuntimeException
      // try (218 -> 229): 230 java/lang/RuntimeException
      // try (223 -> 234): 235 java/lang/RuntimeException
      // try (232 -> 243): 244 java/lang/RuntimeException
      // try (251 -> 261): 262 java/lang/RuntimeException
      // try (345 -> 350): 351 java/lang/RuntimeException
      // try (348 -> 354): 354 java/lang/RuntimeException
      // try (356 -> 366): 367 java/lang/RuntimeException
      // try (362 -> 370): 370 java/lang/RuntimeException
      // try (377 -> 380): 380 java/lang/RuntimeException
      // try (411 -> 416): 417 java/lang/RuntimeException
      // try (424 -> 434): 435 java/lang/RuntimeException
      // try (437 -> 453): 454 java/lang/RuntimeException
      // try (449 -> 462): 463 java/lang/RuntimeException
      // try (456 -> 466): 467 java/lang/RuntimeException
   }

   public static boolean a(ct param0, bj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getstatic com/schnurritv/sexmod/bj.START_THROWING Lcom/schnurritv/sexmod/bj;
      // 04: if_acmpne 1b
      // 07: aload 0
      // 08: getfield com/schnurritv/sexmod/ct.aB Z
      // 0b: ifne 1b
      // 0e: goto 15
      // 11: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: bipush 0
      // 16: ireturn
      // 17: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 1e: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
      // 21: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
      // 24: ifeq 49
      // 27: aload 1
      // 28: getstatic com/schnurritv/sexmod/bj.START_THROWING Lcom/schnurritv/sexmod/bj;
      // 2b: if_acmpeq 43
      // 2e: goto 35
      // 31: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 1
      // 36: getstatic com/schnurritv/sexmod/bj.PICK_UP Lcom/schnurritv/sexmod/bj;
      // 39: if_acmpne 49
      // 3c: goto 43
      // 3f: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: bipush 0
      // 44: ireturn
      // 45: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: getstatic com/schnurritv/sexmod/bG$b.a [I
      // 4c: aload 1
      // 4d: invokevirtual com/schnurritv/sexmod/bj.ordinal ()I
      // 50: iaload
      // 51: tableswitch 41 1 5 35 35 35 35 35
      // 74: bipush 1
      // 75: ireturn
      // 76: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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

   Vec3d a(ct var1, float var2) {
      UUID var3 = var1.a();

      try {
         if (var3 == null) {
            return Vec3d.field_186680_a;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      EntityPlayer var4 = var1.field_70170_p.func_152378_a(var3);

      try {
         if (var4 == null) {
            return Vec3d.field_186680_a;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      Vec3d var5 = b1.a(new Vec3d(var4.field_70169_q, var4.field_70167_r, var4.field_70166_s), var4.func_174791_d(), var2);
      Vec3d var6 = b1.a(
         new Vec3d(L.field_71439_g.field_70169_q, L.field_71439_g.field_70167_r, L.field_71439_g.field_70166_s), L.field_71439_g.func_174791_d(), var2
      );
      return var5.func_178788_d(var6);
   }

   Vector4f a(EntityPlayer var1, float var2) {
      EntityPlayerSP var3 = L.field_71439_g;
      float var4 = b1.a(var1.field_70760_ar, var1.field_70761_aq, var2);
      Vec3d var5 = b1.a(new Vec3d(var1.field_70142_S, var1.field_70137_T, var1.field_70136_U), var1.func_174791_d(), var2);
      Vec3d var6 = b1.a(new Vec3d(var3.field_70142_S, var3.field_70137_T, var3.field_70136_U), var3.func_174791_d(), var2);
      Vec3d var7 = var5.func_178788_d(var6);
      return new Vector4f((float)var7.field_72450_a, (float)var7.field_72448_b, (float)var7.field_72449_c, var4);
   }

   protected Vec3i a(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/bG.g Lcom/schnurritv/sexmod/bi;
      // 04: invokestatic com/schnurritv/sexmod/cC.a (Lcom/schnurritv/sexmod/bi;)[Ljava/lang/String;
      // 07: astore 2
      // 08: aload 2
      // 09: arraylength
      // 0a: bipush 8
      // 0c: if_icmpge 17
      // 0f: getstatic com/schnurritv/sexmod/bG.w Lnet/minecraft/util/math/Vec3i;
      // 12: areturn
      // 13: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 1
      // 18: ldc "band"
      // 1a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1d: ifeq 28
      // 20: getstatic com/schnurritv/sexmod/bG.M Lnet/minecraft/util/math/Vec3i;
      // 23: areturn
      // 24: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 3d: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 2
      // 42: bipush 8
      // 44: aaload
      // 45: invokestatic com/schnurritv/sexmod/bG.b (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
      // 48: areturn
      // 49: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 62: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 2
      // 67: bipush 7
      // 69: aaload
      // 6a: invokestatic com/schnurritv/sexmod/bG.c (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
      // 6d: areturn
      // 6e: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: aload 1
      // 73: ldc "hair"
      // 75: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 78: ifeq 87
      // 7b: aload 2
      // 7c: bipush 6
      // 7e: aaload
      // 7f: invokestatic com/schnurritv/sexmod/bG.d (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
      // 82: areturn
      // 83: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: getstatic com/schnurritv/sexmod/bG.H Ljava/util/HashSet;
      // 8a: aload 1
      // 8b: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 8e: ifeq 9d
      // 91: aload 2
      // 92: bipush 7
      // 94: aaload
      // 95: invokestatic com/schnurritv/sexmod/bG.c (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
      // 98: areturn
      // 99: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c: athrow
      // 9d: getstatic com/schnurritv/sexmod/bG.y Ljava/util/HashSet;
      // a0: aload 1
      // a1: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // a4: ifeq b3
      // a7: aload 2
      // a8: bipush 6
      // aa: aaload
      // ab: invokestatic com/schnurritv/sexmod/bG.d (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
      // ae: areturn
      // af: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b2: athrow
      // b3: getstatic com/schnurritv/sexmod/bG.w Lnet/minecraft/util/math/Vec3i;
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
      return W.values()[Integer.parseInt(var0)].a();
   }

   public static Vec3i c(String var0) {
      return bc.values()[Integer.parseInt(var0)].a();
   }

   public static Vec3i d(String var0) {
      return c6.values()[Integer.parseInt(var0)].a();
   }

   @Override
   protected void a(BufferBuilder var1, String var2, GeoBone var3) {
      try {
         if (((ct)this.g).field_70170_p instanceof com.b) {
            return;
         }
      } catch (RuntimeException var11) {
         throw a(var11);
      }

      String[] var4 = cC.a(this.g);

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

                           this.a(var3, 5.0F, 3.0F);
                           break label86;
                        }

                        this.a(var3, 10.0F, 15.0F);
                        break label86;
                     }

                     this.a(var3, 30.0F, 30.0F);
                     break label86;
                  }

                  this.a(var3, 25.0F, 25.0F);
                  break label86;
               }

               var3.setPivotY(-0.15F);
               this.a(var3);
               break label86;
            }

            a(var3, var4[5]);
            break label86;
         }

         a(var3, var4[0], var4[2], var4[4]);
      }

      try {
         if (var2.contains("crown")) {
            a(this.g, var3, var4[9]);
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }
   }

   public static void a(bi var0, GeoBone var1, String var2) {
      try {
         if (var0.j) {
            var1.setHidden(true);
            return;
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      if (var0 instanceof ct) {
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
            if (var0 instanceof cU) {
               var1.setHidden(((ItemStack)var0.func_184212_Q().func_187225_a(bs.G)).func_190926_b());
            }
         } catch (RuntimeException var4) {
            throw a(var4);
         }
      }
   }

   void a(GeoBone var1, float var2, float var3) {
      try {
         if (L.func_147113_T()) {
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      try {
         if (!this.K) {
            return;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      var1.setRotationX(var1.getRotationX() + b1.b(b1.b(this.S, -var2, var2)));
      var1.setRotationZ(var1.getRotationZ() + b1.b(b1.b(this.I, -var3, var3)));
   }

   void a(GeoBone param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/bG.J F
      // 04: ldc -420.69
      // 06: fcmpl
      // 07: ifne 21
      // 0a: aload 0
      // 0b: getfield com/schnurritv/sexmod/bG.g Lcom/schnurritv/sexmod/bi;
      // 0e: checkcast com/schnurritv/sexmod/ct
      // 11: invokevirtual com/schnurritv/sexmod/ct.D ()Lcom/schnurritv/sexmod/bj;
      // 14: getstatic com/schnurritv/sexmod/bj.SHOULDER_IDLE Lcom/schnurritv/sexmod/bj;
      // 17: if_acmpeq 26
      // 1a: goto 21
      // 1d: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: return
      // 22: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 0
      // 27: getfield com/schnurritv/sexmod/bG.g Lcom/schnurritv/sexmod/bi;
      // 2a: checkcast com/schnurritv/sexmod/ct
      // 2d: invokevirtual com/schnurritv/sexmod/ct.a ()Ljava/util/UUID;
      // 30: astore 2
      // 31: aload 2
      // 32: ifnonnull 3a
      // 35: return
      // 36: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield com/schnurritv/sexmod/bG.g Lcom/schnurritv/sexmod/bi;
      // 3e: checkcast com/schnurritv/sexmod/ct
      // 41: getfield com/schnurritv/sexmod/ct.field_70170_p Lnet/minecraft/world/World;
      // 44: aload 2
      // 45: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
      // 48: astore 3
      // 49: aload 3
      // 4a: ifnonnull 52
      // 4d: return
      // 4e: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 55: invokevirtual net/minecraft/client/Minecraft.func_175598_ae ()Lnet/minecraft/client/renderer/entity/RenderManager;
      // 58: getfield net/minecraft/client/renderer/entity/RenderManager.field_78732_j F
      // 5b: fneg
      // 5c: fstore 4
      // 5e: aload 1
      // 5f: ldc 8.0
      // 61: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPivotY (F)V
      // 64: getstatic com/schnurritv/sexmod/bG.L Lnet/minecraft/client/Minecraft;
      // 67: invokevirtual net/minecraft/client/Minecraft.func_147113_T ()Z
      // 6a: ifeq 72
      // 6d: return
      // 6e: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: aload 1
      // 73: aload 1
      // 74: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
      // 77: fload 4
      // 79: invokestatic com/schnurritv/sexmod/b1.b (F)F
      // 7c: fadd
      // 7d: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
      // 80: return
      // try (0 -> 11): 12 java/lang/RuntimeException
      // try (5 -> 15): 15 java/lang/RuntimeException
      // try (22 -> 25): 25 java/lang/RuntimeException
      // try (34 -> 37): 37 java/lang/RuntimeException
      // try (44 -> 51): 51 java/lang/RuntimeException
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

   protected Vec3i a(Vec3i param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/bG.K Z
      // 04: ifne 1b
      // 07: aload 0
      // 08: getfield com/schnurritv/sexmod/bG.R Z
      // 0b: ifne 1b
      // 0e: goto 15
      // 11: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: aload 1
      // 16: areturn
      // 17: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield com/schnurritv/sexmod/bG.G F
      // 1f: fconst_2
      // 20: ldc 15.0
      // 22: invokestatic com/schnurritv/sexmod/b1.b (FFF)F
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
      // 01: getfield com/schnurritv/sexmod/bG.g Lcom/schnurritv/sexmod/bi;
      // 04: checkcast com/schnurritv/sexmod/ct
      // 07: invokevirtual com/schnurritv/sexmod/ct.D ()Lcom/schnurritv/sexmod/bj;
      // 0a: astore 2
      // 0b: aload 2
      // 0c: getstatic com/schnurritv/sexmod/bj.RUN Lcom/schnurritv/sexmod/bj;
      // 0f: if_acmpeq 20
      // 12: aload 2
      // 13: getstatic com/schnurritv/sexmod/bj.CATCH Lcom/schnurritv/sexmod/bj;
      // 16: if_acmpne 38
      // 19: goto 20
      // 1c: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield com/schnurritv/sexmod/bG.g Lcom/schnurritv/sexmod/bi;
      // 24: checkcast com/schnurritv/sexmod/ct
      // 27: invokevirtual com/schnurritv/sexmod/ct.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 2a: getstatic com/schnurritv/sexmod/ct.aa Lnet/minecraft/network/datasync/DataParameter;
      // 2d: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 30: checkcast net/minecraft/item/ItemStack
      // 33: areturn
      // 34: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: aload 1
      // 39: areturn
      // try (5 -> 11): 12 java/lang/RuntimeException
      // try (8 -> 22): 22 java/lang/RuntimeException
   }

   @Override
   protected HashSet<String> b() {
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

   protected float b() {
      try {
         return ((ct)this.g).D() == bj.CATCH ? 0.5F : 1.0F;
      } catch (RuntimeException var1) {
         throw a(var1);
      }
   }

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
      // 08: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 21: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: invokespecial com/schnurritv/sexmod/bP.a (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/util/math/Vec3d;
      // 2a: areturn
      // 2b: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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

   public void a(BufferBuilder param1, GeoCube param2, GeoBone param3, float param4, float param5, float param6, float param7, double param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/bG.K Z
      // 04: ifeq 20
      // 07: getstatic com/schnurritv/sexmod/bG.A Ljava/util/HashSet;
      // 0a: aload 3
      // 0b: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
      // 0e: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 11: ifne 20
      // 14: goto 1b
      // 17: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: return
      // 1c: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield com/schnurritv/sexmod/bG.e Ljava/util/HashSet;
      // 24: aload 3
      // 25: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
      // 28: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 2b: ifeq 33
      // 2e: return
      // 2f: invokestatic com/schnurritv/sexmod/bG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: aload 0
      // 34: aload 3
      // 35: putfield com/schnurritv/sexmod/bG.v Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
      // 38: aload 0
      // 39: aload 1
      // 3a: aload 2
      // 3b: aload 3
      // 3c: fload 4
      // 3e: fload 5
      // 40: fload 6
      // 42: fload 7
      // 44: dload 8
      // 46: invokespecial com/schnurritv/sexmod/bP.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
      // 49: return
      // try (0 -> 8): 9 java/lang/RuntimeException
      // try (3 -> 12): 12 java/lang/RuntimeException
      // try (14 -> 21): 21 java/lang/RuntimeException
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
