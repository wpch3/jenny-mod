package com.schnurritv.sexmod;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.GeoModelProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class bW<T extends bi & IAnimatable> extends GeoEntityRenderer<T> {
   static final float l = 1.5F;
   public static final float h = 0.1F;
   public static final Vec3d k = new Vec3d(0.95, 0.65, 0.85);
   public static final Vec3d m = new Vec3d(0.0, 0.2, 0.3);
   protected double o;
   static boolean p = false;
   protected T g;
   protected Minecraft n;
   protected static HashMap<k, HashMap<String, Boolean>> t = new HashMap<>();
   protected static HashMap<UUID, ResourceLocation> f = new HashMap<>();
   Color r = new Color(245, 199, 165);
   Color u = new Color(245, 157, 169);
   boolean q = false;
   protected HashSet<String> e = new HashSet<>();
   Vec3d s;
   Integer b = null;
   Integer j = null;
   Integer a = null;
   float d = 0.0F;
   public static BufferBuilder c;
   Matrix4f i = null;
   protected GeoBone v = null;

   public bW(RenderManager var1, AnimatedGeoModel<T> var2, double var3) {
      super(var1, var2);
      this.o = var3;
      this.n = Minecraft.func_71410_x();
      this.field_76989_e = 0.2F;
   }

   protected ResourceLocation a(T var1) throws IOException {
      label38: {
         try {
            if (!(var1.field_70170_p instanceof com.b) && var1.r() != null) {
               break label38;
            }
         } catch (IOException var5) {
            throw b(var5);
         }

         ResourceLocation var2 = f.get(this.n.func_110432_I().func_148256_e().getId());

         try {
            if (var2 == null) {
               return this.a(this.n.func_110432_I().func_148256_e().getId(), var1.field_70170_p);
            }

            return var2;
         } catch (IOException var4) {
            throw b(var4);
         }
      }

      ResourceLocation var6 = f.get(var1.r());

      try {
         if (var6 == null) {
            return this.a(var1.r(), var1.field_70170_p);
         }
      } catch (IOException var3) {
         throw b(var3);
      }

      return var6;
   }

   protected ResourceLocation a(UUID var1, World var2) throws IOException {
      BufferedImage var3;
      try {
         var3 = aY.a(var1);
         Graphics var4 = var3.getGraphics();
         var4.setColor(this.r);
         var4.fillRect(0, 0, 4, 3);
         var4.setColor(this.u);
         var4.fillRect(4, 0, 3, 3);
      } catch (Exception var6) {
         try {
            if (!this.q) {
               this.q = true;
            }
         } catch (Exception var5) {
            throw b(var5);
         }

         var3 = ImageIO.read(this.n.func_110442_L().func_110536_a(new ResourceLocation("sexmod", "textures/player/steve.png")).func_110527_b());
      }

      f.put(var1, this.field_76990_c.field_78724_e.func_110578_a("player" + var1, new DynamicTexture(var3)));
      return f.get(var1);
   }

   protected void d() {
   }

   protected void f() {
   }

   float a(World var1, Vec3d var2, float var3, float var4) {
      RayTraceResult var5 = this.a(var2, var2.func_178787_e(b1.a(new Vec3d(0.0, 0.0, -4.0), var3, var4)), var1);

      try {
         if (var5 == null) {
            return 4.0F;
         }
      } catch (IllegalStateException var8) {
         throw b(var8);
      }

      Vec3d var6 = var5.field_72307_f;

      try {
         if (var6 == null) {
            return 4.0F;
         }
      } catch (IllegalStateException var7) {
         throw b(var7);
      }

      return (float)var2.func_72438_d(var6);
   }

   boolean a(T var1, EntityPlayer var2) {
      try {
         if (var1 instanceof bg) {
            return true;
         }
      } catch (IllegalStateException var20) {
         throw b(var20);
      }

      World var3 = var1.field_70170_p;
      Vec3d var4 = var1.func_174791_d();
      float var5 = var1.field_70130_N * 1.5F;
      float var6 = var1.field_70131_O * 1.5F;
      Vec3d var7 = var2.func_174791_d().func_72441_c(0.0, var2.func_70047_e(), 0.0);
      int var8 = this.n.field_71474_y.field_74320_O;

      try {
         if (var8 != 0) {
            return true;
         }
      } catch (IllegalStateException var19) {
         throw b(var19);
      }

      if (var8 > 0) {
         float var9 = var2.field_70177_z;
         float var10 = var2.field_70125_A;
         if (var8 == 2) {
            var10 += 180.0F;
         }

         float var11 = 4.0F;
         Vec3d var12 = var7.func_72441_c(
            MathHelper.func_76126_a(var9 * (float) (Math.PI / 180.0)) * MathHelper.func_76134_b(var10 * (float) (Math.PI / 180.0)) * var11,
            MathHelper.func_76126_a(var10 * (float) (Math.PI / 180.0)) * var11,
            -MathHelper.func_76134_b(var9 * (float) (Math.PI / 180.0)) * MathHelper.func_76134_b(var10 * (float) (Math.PI / 180.0)) * var11
         );
         BlockPos var13 = new BlockPos(var12);
         boolean var14 = var3.func_175623_d(var13);
         if (!var14) {
            var7 = var12;
         } else if (var3.func_175623_d(var13.func_177982_a(0, 1, 0))) {
            var7 = new Vec3d(var12.field_72450_a, var13.func_177956_o() + 1, var12.field_72449_c);
         }
      }

      Vec3d[] var21 = new Vec3d[]{
         var4.func_72441_c(-var5 / 2.0F, 0.0, -var5 / 2.0F),
         var4.func_72441_c(-var5 / 2.0F, 0.0, var5 / 2.0F),
         var4.func_72441_c(var5 / 2.0F, 0.0, -var5 / 2.0F),
         var4.func_72441_c(var5 / 2.0F, 0.0, var5 / 2.0F),
         var4.func_72441_c(-var5 / 2.0F, var6, -var5 / 2.0F),
         var4.func_72441_c(-var5 / 2.0F, var6, var5 / 2.0F),
         var4.func_72441_c(var5 / 2.0F, var6, -var5 / 2.0F),
         var4.func_72441_c(var5 / 2.0F, var6, var5 / 2.0F)
      };

      for (Vec3d var25 : var21) {
         RayTraceResult var26 = this.a(var7, var25, var3);

         try {
            if (var26 == null) {
               return true;
            }
         } catch (IllegalStateException var18) {
            throw b(var18);
         }

         IBlockState var15 = var3.func_180495_p(var26.func_178782_a());

         try {
            if (var15.func_185895_e()) {
               return true;
            }
         } catch (IllegalStateException var16) {
            throw b(var16);
         }

         try {
            if (var15.func_177230_c().func_180664_k() != BlockRenderLayer.SOLID) {
               return true;
            }
         } catch (IllegalStateException var17) {
            throw b(var17);
         }
      }

      return false;
   }

   HashSet<String> a(Boolean param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04: ifeq 0e
      // 07: invokestatic com/schnurritv/sexmod/a4.d ()Ljava/util/HashSet;
      // 0a: astore 3
      // 0b: goto 16
      // 0e: aload 0
      // 0f: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 12: invokevirtual com/schnurritv/sexmod/bi.K ()Ljava/util/HashSet;
      // 15: astore 3
      // 16: new java/util/HashSet
      // 19: dup
      // 1a: invokespecial java/util/HashSet.<init> ()V
      // 1d: astore 4
      // 1f: aload 3
      // 20: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 23: astore 5
      // 25: aload 5
      // 27: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2c: ifeq 76
      // 2f: aload 5
      // 31: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 36: checkcast java/lang/String
      // 39: astore 6
      // 3b: aload 6
      // 3d: invokestatic com/schnurritv/sexmod/bk.l (Ljava/lang/String;)Lcom/schnurritv/sexmod/bk$b;
      // 40: astore 7
      // 42: aload 7
      // 44: ifnonnull 4e
      // 47: goto 25
      // 4a: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 7
      // 50: invokevirtual com/schnurritv/sexmod/bk$b.j ()Z
      // 53: ifne 68
      // 56: iload 2
      // 57: ifeq 68
      // 5a: goto 61
      // 5d: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: goto 25
      // 64: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: aload 4
      // 6a: aload 7
      // 6c: invokevirtual com/schnurritv/sexmod/bk$b.b ()Ljava/util/HashSet;
      // 6f: invokevirtual java/util/HashSet.addAll (Ljava/util/Collection;)Z
      // 72: pop
      // 73: goto 25
      // 76: aload 4
      // 78: areturn
      // try (27 -> 30): 30 java/lang/IllegalStateException
      // try (32 -> 37): 38 java/lang/IllegalStateException
      // try (35 -> 41): 41 java/lang/IllegalStateException
   }

   public void a(GeoModel param1, T param2, float param3, float param4, float param5, float param6, float param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/schnurritv/sexmod/bW.n Lnet/minecraft/client/Minecraft;
      // 004: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 007: ifnull 033
      // 00a: aload 2
      // 00b: getfield com/schnurritv/sexmod/bi.j Z
      // 00e: ifne 033
      // 011: goto 018
      // 014: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 0
      // 019: aload 2
      // 01a: aload 0
      // 01b: getfield com/schnurritv/sexmod/bW.n Lnet/minecraft/client/Minecraft;
      // 01e: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 021: invokevirtual com/schnurritv/sexmod/bW.a (Lcom/schnurritv/sexmod/bi;Lnet/minecraft/entity/player/EntityPlayer;)Z
      // 024: ifne 033
      // 027: goto 02e
      // 02a: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: return
      // 02f: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: invokestatic net/minecraft/client/renderer/GlStateManager.func_179091_B ()V
      // 036: aload 0
      // 037: aload 2
      // 038: fload 3
      // 039: fload 4
      // 03b: fload 5
      // 03d: fload 6
      // 03f: fload 7
      // 041: invokevirtual com/schnurritv/sexmod/bW.a (Lcom/schnurritv/sexmod/bi;FFFFF)V
      // 044: aload 0
      // 045: aload 2
      // 046: fload 3
      // 047: fload 4
      // 049: fload 5
      // 04b: fload 6
      // 04d: fload 7
      // 04f: invokevirtual com/schnurritv/sexmod/bW.renderLate (Ljava/lang/Object;FFFFF)V
      // 052: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
      // 055: invokevirtual net/minecraft/client/renderer/Tessellator.func_178180_c ()Lnet/minecraft/client/renderer/BufferBuilder;
      // 058: astore 8
      // 05a: aload 8
      // 05c: bipush 7
      // 05e: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l Lnet/minecraft/client/renderer/vertex/VertexFormat;
      // 061: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
      // 064: aconst_null
      // 065: astore 9
      // 067: aload 0
      // 068: aload 0
      // 069: aload 0
      // 06a: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 06d: invokevirtual com/schnurritv/sexmod/bW.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
      // 070: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 073: checkcast net/minecraft/util/ResourceLocation
      // 076: invokevirtual com/schnurritv/sexmod/bW.func_110776_a (Lnet/minecraft/util/ResourceLocation;)V
      // 079: aload 0
      // 07a: getfield com/schnurritv/sexmod/bW.e Ljava/util/HashSet;
      // 07d: invokevirtual java/util/HashSet.clear ()V
      // 080: aload 0
      // 081: aload 0
      // 082: aload 2
      // 083: getfield com/schnurritv/sexmod/bi.j Z
      // 086: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 089: aload 2
      // 08a: invokevirtual com/schnurritv/sexmod/bi.L ()I
      // 08d: ifne 098
      // 090: bipush 1
      // 091: goto 099
      // 094: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: bipush 0
      // 099: invokevirtual com/schnurritv/sexmod/bW.a (Ljava/lang/Boolean;Z)Ljava/util/HashSet;
      // 09c: putfield com/schnurritv/sexmod/bW.e Ljava/util/HashSet;
      // 09f: aload 0
      // 0a0: invokevirtual com/schnurritv/sexmod/bW.d ()V
      // 0a3: aload 2
      // 0a4: invokestatic com/schnurritv/sexmod/k.a (Lnet/minecraft/entity/Entity;)Lcom/schnurritv/sexmod/k;
      // 0a7: astore 10
      // 0a9: getstatic com/schnurritv/sexmod/bW.t Ljava/util/HashMap;
      // 0ac: aload 10
      // 0ae: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b1: ifnonnull 0cc
      // 0b4: aload 0
      // 0b5: aload 2
      // 0b6: invokevirtual com/schnurritv/sexmod/bi.N ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
      // 0b9: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getModelRendererList ()Ljava/util/List;
      // 0bc: aload 0
      // 0bd: invokevirtual com/schnurritv/sexmod/bW.b ()Ljava/util/HashSet;
      // 0c0: aload 10
      // 0c2: invokevirtual com/schnurritv/sexmod/bW.a (Ljava/util/List;Ljava/util/HashSet;Lcom/schnurritv/sexmod/k;)V
      // 0c5: goto 0cc
      // 0c8: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: aload 2
      // 0ce: fload 3
      // 0cf: invokestatic com/schnurritv/sexmod/b1.a (Lnet/minecraft/entity/EntityLivingBase;F)Lnet/minecraft/util/math/Vec3d;
      // 0d2: putfield com/schnurritv/sexmod/bW.s Lnet/minecraft/util/math/Vec3d;
      // 0d5: aload 1
      // 0d6: getfield software/bernie/geckolib3/geo/render/built/GeoModel.topLevelBones Ljava/util/List;
      // 0d9: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0de: astore 11
      // 0e0: aload 11
      // 0e2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e7: ifeq 11d
      // 0ea: aload 11
      // 0ec: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f1: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
      // 0f4: astore 12
      // 0f6: aload 12
      // 0f8: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
      // 0fb: ldc "steve"
      // 0fd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 100: ifeq 10a
      // 103: aload 12
      // 105: astore 9
      // 107: goto 0e0
      // 10a: aload 0
      // 10b: aload 8
      // 10d: aload 12
      // 10f: fload 4
      // 111: fload 5
      // 113: fload 6
      // 115: fload 7
      // 117: invokevirtual com/schnurritv/sexmod/bW.renderRecursively (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFF)V
      // 11a: goto 0e0
      // 11d: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
      // 120: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
      // 123: aload 0
      // 124: invokevirtual com/schnurritv/sexmod/bW.f ()V
      // 127: aload 9
      // 129: ifnull 16b
      // 12c: aload 8
      // 12e: bipush 7
      // 130: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l Lnet/minecraft/client/renderer/vertex/VertexFormat;
      // 133: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
      // 136: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 139: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
      // 13c: aload 0
      // 13d: aload 0
      // 13e: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 141: invokevirtual com/schnurritv/sexmod/bW.a (Lcom/schnurritv/sexmod/bi;)Lnet/minecraft/util/ResourceLocation;
      // 144: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
      // 147: goto 155
      // 14a: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: astore 11
      // 150: aload 11
      // 152: invokevirtual java/io/IOException.printStackTrace ()V
      // 155: aload 0
      // 156: aload 8
      // 158: aload 9
      // 15a: fload 4
      // 15c: fload 5
      // 15e: fload 6
      // 160: fload 7
      // 162: invokevirtual com/schnurritv/sexmod/bW.renderRecursively (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFF)V
      // 165: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
      // 168: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
      // 16b: aload 0
      // 16c: aload 2
      // 16d: fload 3
      // 16e: fload 4
      // 170: fload 5
      // 172: fload 6
      // 174: fload 7
      // 176: invokevirtual com/schnurritv/sexmod/bW.renderAfter (Ljava/lang/Object;FFFFF)V
      // 179: invokestatic net/minecraft/client/renderer/GlStateManager.func_179101_C ()V
      // 17c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179089_o ()V
      // 17f: return
      // try (80 -> 92): 93 java/io/IOException
      // try (49 -> 70): 70 java/io/IOException
      // try (10 -> 21): 21 java/io/IOException
      // try (4 -> 17): 18 java/io/IOException
      // try (0 -> 7): 8 java/io/IOException
      // try (138 -> 145): 148 java/io/IOException
      // try (128 -> 146): 146 java/lang/IllegalStateException
   }

   String b(String var1) {
      StringBuilder var2 = new StringBuilder();

      try {
         BufferedReader var3 = new BufferedReader(new FileReader(var1));

         while (true) {
            String var4;
            String var10000 = var4 = var3.readLine();

            try {
               if (var10000 == null) {
                  break;
               }

               var2.append(var4).append("//\n");
            } catch (IOException var5) {
               throw b(var5);
            }
         }

         var3.close();
      } catch (IOException var6) {
         var6.printStackTrace();
      }

      return var2.toString();
   }

   protected void a(double var1, double var3, double var5) {
      try {
         if (this.g.j) {
            return;
         }
      } catch (IllegalStateException var9) {
         throw b(var9);
      }

      try {
         if (this.g.D().hideNameTag) {
            return;
         }
      } catch (IllegalStateException var7) {
         throw b(var7);
      }

      try {
         if (this.n.func_175598_ae().field_78734_h == null) {
            return;
         }
      } catch (IllegalStateException var8) {
         throw b(var8);
      }

      this.func_147906_a(this.g, this.g.P(), var1, var3 + this.g.s(), var5, 300);
   }

   public void a(T param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: putfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 005: aload 0
      // 006: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 009: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 00c: instanceof com/b
      // 00f: ifne 241
      // 012: aload 0
      // 013: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 016: invokevirtual com/schnurritv/sexmod/bi.G ()Z
      // 019: ifeq 058
      // 01c: goto 023
      // 01f: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 0
      // 024: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 027: instanceof com/schnurritv/sexmod/bg
      // 02a: ifeq 048
      // 02d: goto 034
      // 030: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: aload 0
      // 035: getfield com/schnurritv/sexmod/bW.n Lnet/minecraft/client/Minecraft;
      // 038: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
      // 03b: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
      // 03e: ifeq 058
      // 041: goto 048
      // 044: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 0
      // 049: dload 2
      // 04a: dload 4
      // 04c: dload 6
      // 04e: invokevirtual com/schnurritv/sexmod/bW.a (DDD)V
      // 051: goto 058
      // 054: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: aload 1
      // 059: invokevirtual com/schnurritv/sexmod/bi.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 05c: astore 10
      // 05e: bipush 0
      // 05f: istore 11
      // 061: aload 10
      // 063: getstatic com/schnurritv/sexmod/bi.h Lnet/minecraft/network/datasync/DataParameter;
      // 066: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 069: checkcast java/lang/String
      // 06c: ldc ""
      // 06e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 071: ifne 16a
      // 074: aload 0
      // 075: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 078: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 07b: aload 10
      // 07d: getstatic com/schnurritv/sexmod/bi.h Lnet/minecraft/network/datasync/DataParameter;
      // 080: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 083: checkcast java/lang/String
      // 086: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 089: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
      // 08c: astore 12
      // 08e: aload 12
      // 090: ifnull 16a
      // 093: aload 12
      // 095: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184218_aH ()Z
      // 098: ifeq 16a
      // 09b: goto 0a2
      // 09e: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: aload 12
      // 0a4: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184187_bx ()Lnet/minecraft/entity/Entity;
      // 0a7: instanceof net/minecraft/entity/passive/EntityHorse
      // 0aa: ifeq 16a
      // 0ad: goto 0b4
      // 0b0: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 12
      // 0b6: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184187_bx ()Lnet/minecraft/entity/Entity;
      // 0b9: checkcast net/minecraft/entity/passive/EntityHorse
      // 0bc: invokevirtual net/minecraft/entity/passive/EntityHorse.func_110257_ck ()Z
      // 0bf: ifeq 16a
      // 0c2: goto 0c9
      // 0c5: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: aload 12
      // 0cb: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184187_bx ()Lnet/minecraft/entity/Entity;
      // 0ce: checkcast net/minecraft/entity/EntityLiving
      // 0d1: astore 13
      // 0d3: aload 0
      // 0d4: getfield com/schnurritv/sexmod/bW.n Lnet/minecraft/client/Minecraft;
      // 0d7: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 0da: astore 14
      // 0dc: aload 13
      // 0de: invokevirtual net/minecraft/entity/EntityLiving.func_70040_Z ()Lnet/minecraft/util/math/Vec3d;
      // 0e1: astore 15
      // 0e3: new net/minecraft/util/math/Vec3d
      // 0e6: dup
      // 0e7: aload 12
      // 0e9: getfield net/minecraft/entity/player/EntityPlayer.field_70142_S D
      // 0ec: aload 12
      // 0ee: getfield net/minecraft/entity/player/EntityPlayer.field_70137_T D
      // 0f1: aload 12
      // 0f3: getfield net/minecraft/entity/player/EntityPlayer.field_70136_U D
      // 0f6: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 0f9: aload 12
      // 0fb: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 0fe: fload 9
      // 100: f2d
      // 101: invokestatic com/schnurritv/sexmod/b1.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
      // 104: astore 16
      // 106: new net/minecraft/util/math/Vec3d
      // 109: dup
      // 10a: aload 14
      // 10c: getfield net/minecraft/entity/player/EntityPlayer.field_70142_S D
      // 10f: aload 14
      // 111: getfield net/minecraft/entity/player/EntityPlayer.field_70137_T D
      // 114: aload 14
      // 116: getfield net/minecraft/entity/player/EntityPlayer.field_70136_U D
      // 119: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 11c: aload 14
      // 11e: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 121: fload 9
      // 123: f2d
      // 124: invokestatic com/schnurritv/sexmod/b1.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
      // 127: astore 17
      // 129: aload 16
      // 12b: aload 17
      // 12d: invokevirtual net/minecraft/util/math/Vec3d.func_178788_d (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
      // 130: astore 17
      // 132: aload 17
      // 134: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 137: aload 15
      // 139: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 13c: ldc2_w -0.5
      // 13f: dmul
      // 140: dadd
      // 141: dstore 2
      // 142: aload 17
      // 144: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 147: ldc2_w 0.15000000596046448
      // 14a: dadd
      // 14b: dstore 4
      // 14d: aload 17
      // 14f: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 152: aload 15
      // 154: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 157: ldc2_w -0.5
      // 15a: dmul
      // 15b: dadd
      // 15c: dstore 6
      // 15e: aload 1
      // 15f: aload 13
      // 161: getfield net/minecraft/entity/EntityLiving.field_70761_aq F
      // 164: putfield com/schnurritv/sexmod/bi.field_70761_aq F
      // 167: bipush 1
      // 168: istore 11
      // 16a: iload 11
      // 16c: ifne 241
      // 16f: aload 10
      // 171: getstatic com/schnurritv/sexmod/bi.z Lnet/minecraft/network/datasync/DataParameter;
      // 174: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 177: checkcast java/lang/Boolean
      // 17a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 17d: ifeq 241
      // 180: goto 187
      // 183: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: aload 1
      // 188: instanceof com/schnurritv/sexmod/bg
      // 18b: ifeq 1ba
      // 18e: goto 195
      // 191: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: aload 1
      // 196: checkcast com/schnurritv/sexmod/bg
      // 199: invokevirtual com/schnurritv/sexmod/bg.m ()Z
      // 19c: ifeq 1ba
      // 19f: goto 1a6
      // 1a2: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: aload 0
      // 1a7: getfield com/schnurritv/sexmod/bW.n Lnet/minecraft/client/Minecraft;
      // 1aa: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
      // 1ad: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
      // 1b0: ifne 213
      // 1b3: goto 1ba
      // 1b6: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b9: athrow
      // 1ba: new net/minecraft/util/math/Vec3d
      // 1bd: dup
      // 1be: aload 0
      // 1bf: getfield com/schnurritv/sexmod/bW.n Lnet/minecraft/client/Minecraft;
      // 1c2: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1c5: getfield net/minecraft/client/entity/EntityPlayerSP.field_70142_S D
      // 1c8: aload 0
      // 1c9: getfield com/schnurritv/sexmod/bW.n Lnet/minecraft/client/Minecraft;
      // 1cc: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1cf: getfield net/minecraft/client/entity/EntityPlayerSP.field_70137_T D
      // 1d2: aload 0
      // 1d3: getfield com/schnurritv/sexmod/bW.n Lnet/minecraft/client/Minecraft;
      // 1d6: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1d9: getfield net/minecraft/client/entity/EntityPlayerSP.field_70136_U D
      // 1dc: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 1df: aload 0
      // 1e0: getfield com/schnurritv/sexmod/bW.n Lnet/minecraft/client/Minecraft;
      // 1e3: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1e6: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 1e9: fload 9
      // 1eb: f2d
      // 1ec: invokestatic com/schnurritv/sexmod/b1.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
      // 1ef: astore 12
      // 1f1: aload 0
      // 1f2: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 1f5: invokevirtual com/schnurritv/sexmod/bi.o ()Lnet/minecraft/util/math/Vec3d;
      // 1f8: aload 12
      // 1fa: invokevirtual net/minecraft/util/math/Vec3d.func_178788_d (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
      // 1fd: astore 13
      // 1ff: aload 13
      // 201: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 204: dstore 2
      // 205: aload 13
      // 207: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 20a: dstore 4
      // 20c: aload 13
      // 20e: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 211: dstore 6
      // 213: aload 10
      // 215: getstatic com/schnurritv/sexmod/bi.l Lnet/minecraft/network/datasync/DataParameter;
      // 218: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 21b: checkcast java/lang/Float
      // 21e: invokevirtual java/lang/Float.floatValue ()F
      // 221: fstore 12
      // 223: aload 1
      // 224: fload 12
      // 226: putfield com/schnurritv/sexmod/bi.field_70177_z F
      // 229: aload 1
      // 22a: fload 12
      // 22c: putfield com/schnurritv/sexmod/bi.field_70760_ar F
      // 22f: aload 1
      // 230: fload 12
      // 232: putfield com/schnurritv/sexmod/bi.field_70761_aq F
      // 235: aload 1
      // 236: fload 12
      // 238: putfield com/schnurritv/sexmod/bi.field_70758_at F
      // 23b: aload 1
      // 23c: fload 12
      // 23e: putfield com/schnurritv/sexmod/bi.field_70759_as F
      // 241: aload 1
      // 242: invokevirtual com/schnurritv/sexmod/bi.func_110167_bD ()Z
      // 245: ifeq 260
      // 248: aload 0
      // 249: aload 1
      // 24a: dload 2
      // 24b: dload 4
      // 24d: aload 0
      // 24e: getfield com/schnurritv/sexmod/bW.o D
      // 251: dadd
      // 252: dload 6
      // 254: fload 9
      // 256: invokevirtual com/schnurritv/sexmod/bW.a (Lcom/schnurritv/sexmod/bi;DDDF)V
      // 259: goto 260
      // 25c: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25f: athrow
      // 260: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 263: dload 2
      // 264: dload 4
      // 266: dload 6
      // 268: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // 26b: sipush 2896
      // 26e: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 271: fconst_1
      // 272: fconst_1
      // 273: fconst_1
      // 274: ldc 0.5
      // 276: invokestatic net/minecraft/client/renderer/GlStateManager.func_179131_c (FFFF)V
      // 279: invokestatic net/minecraft/client/renderer/GlStateManager.func_179108_z ()V
      // 27c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179147_l ()V
      // 27f: getstatic net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
      // 282: getstatic net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
      // 285: invokestatic net/minecraft/client/renderer/GlStateManager.func_187401_a (Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
      // 288: aload 1
      // 289: invokevirtual com/schnurritv/sexmod/bi.func_184187_bx ()Lnet/minecraft/entity/Entity;
      // 28c: ifnull 2a8
      // 28f: aload 1
      // 290: invokevirtual com/schnurritv/sexmod/bi.func_184187_bx ()Lnet/minecraft/entity/Entity;
      // 293: invokevirtual net/minecraft/entity/Entity.shouldRiderSit ()Z
      // 296: ifeq 2a8
      // 299: goto 2a0
      // 29c: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29f: athrow
      // 2a0: bipush 1
      // 2a1: goto 2a9
      // 2a4: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a7: athrow
      // 2a8: bipush 0
      // 2a9: istore 10
      // 2ab: new software/bernie/geckolib3/model/provider/data/EntityModelData
      // 2ae: dup
      // 2af: invokespecial software/bernie/geckolib3/model/provider/data/EntityModelData.<init> ()V
      // 2b2: astore 11
      // 2b4: aload 11
      // 2b6: iload 10
      // 2b8: putfield software/bernie/geckolib3/model/provider/data/EntityModelData.isSitting Z
      // 2bb: aload 11
      // 2bd: aload 1
      // 2be: invokevirtual com/schnurritv/sexmod/bi.func_70631_g_ ()Z
      // 2c1: putfield software/bernie/geckolib3/model/provider/data/EntityModelData.isChild Z
      // 2c4: aload 1
      // 2c5: getfield com/schnurritv/sexmod/bi.field_70760_ar F
      // 2c8: aload 1
      // 2c9: getfield com/schnurritv/sexmod/bi.field_70761_aq F
      // 2cc: fload 9
      // 2ce: invokestatic software/bernie/shadowed/eliotlash/mclib/utils/Interpolations.lerpYaw (FFF)F
      // 2d1: fstore 12
      // 2d3: aload 1
      // 2d4: getfield com/schnurritv/sexmod/bi.field_70758_at F
      // 2d7: aload 1
      // 2d8: getfield com/schnurritv/sexmod/bi.field_70759_as F
      // 2db: fload 9
      // 2dd: invokestatic software/bernie/shadowed/eliotlash/mclib/utils/Interpolations.lerpYaw (FFF)F
      // 2e0: fstore 13
      // 2e2: fload 13
      // 2e4: fload 12
      // 2e6: fsub
      // 2e7: fstore 14
      // 2e9: iload 10
      // 2eb: ifeq 362
      // 2ee: aload 1
      // 2ef: invokevirtual com/schnurritv/sexmod/bi.func_184187_bx ()Lnet/minecraft/entity/Entity;
      // 2f2: instanceof net/minecraft/entity/EntityLivingBase
      // 2f5: ifeq 362
      // 2f8: goto 2ff
      // 2fb: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fe: athrow
      // 2ff: aload 1
      // 300: invokevirtual com/schnurritv/sexmod/bi.func_184187_bx ()Lnet/minecraft/entity/Entity;
      // 303: checkcast net/minecraft/entity/EntityLivingBase
      // 306: astore 15
      // 308: aload 15
      // 30a: getfield net/minecraft/entity/EntityLivingBase.field_70760_ar F
      // 30d: aload 15
      // 30f: getfield net/minecraft/entity/EntityLivingBase.field_70761_aq F
      // 312: fload 9
      // 314: invokestatic software/bernie/shadowed/eliotlash/mclib/utils/Interpolations.lerpYaw (FFF)F
      // 317: fstore 12
      // 319: fload 13
      // 31b: fload 12
      // 31d: fsub
      // 31e: fstore 14
      // 320: fload 14
      // 322: invokestatic net/minecraft/util/math/MathHelper.func_76142_g (F)F
      // 325: fstore 16
      // 327: fload 16
      // 329: ldc -85.0
      // 32b: fcmpg
      // 32c: ifge 333
      // 32f: ldc -85.0
      // 331: fstore 16
      // 333: fload 16
      // 335: ldc 85.0
      // 337: fcmpl
      // 338: iflt 33f
      // 33b: ldc 85.0
      // 33d: fstore 16
      // 33f: fload 13
      // 341: fload 16
      // 343: fsub
      // 344: fstore 12
      // 346: fload 16
      // 348: fload 16
      // 34a: fmul
      // 34b: ldc 2500.0
      // 34d: fcmpl
      // 34e: ifle 35b
      // 351: fload 12
      // 353: fload 16
      // 355: ldc 0.2
      // 357: fmul
      // 358: fadd
      // 359: fstore 12
      // 35b: fload 13
      // 35d: fload 12
      // 35f: fsub
      // 360: fstore 14
      // 362: aload 1
      // 363: getfield com/schnurritv/sexmod/bi.field_70127_C F
      // 366: aload 1
      // 367: getfield com/schnurritv/sexmod/bi.field_70125_A F
      // 36a: fload 9
      // 36c: invokestatic software/bernie/shadowed/eliotlash/mclib/utils/Interpolations.lerp (FFF)F
      // 36f: fstore 15
      // 371: aload 0
      // 372: aload 1
      // 373: fload 9
      // 375: invokevirtual com/schnurritv/sexmod/bW.handleRotationFloat (Lnet/minecraft/entity/EntityLivingBase;F)F
      // 378: fstore 16
      // 37a: aload 0
      // 37b: aload 1
      // 37c: fload 16
      // 37e: fload 12
      // 380: fload 9
      // 382: invokevirtual com/schnurritv/sexmod/bW.a (Lcom/schnurritv/sexmod/bi;FFF)V
      // 385: fconst_0
      // 386: fstore 17
      // 388: fconst_0
      // 389: fstore 18
      // 38b: iload 10
      // 38d: ifne 3d5
      // 390: aload 1
      // 391: invokevirtual com/schnurritv/sexmod/bi.func_70089_S ()Z
      // 394: ifeq 3d5
      // 397: goto 39e
      // 39a: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39d: athrow
      // 39e: aload 1
      // 39f: getfield com/schnurritv/sexmod/bi.field_184618_aE F
      // 3a2: aload 1
      // 3a3: getfield com/schnurritv/sexmod/bi.field_70721_aZ F
      // 3a6: fload 9
      // 3a8: invokestatic software/bernie/shadowed/eliotlash/mclib/utils/Interpolations.lerp (FFF)F
      // 3ab: fstore 17
      // 3ad: aload 1
      // 3ae: getfield com/schnurritv/sexmod/bi.field_184619_aG F
      // 3b1: aload 1
      // 3b2: getfield com/schnurritv/sexmod/bi.field_70721_aZ F
      // 3b5: fconst_1
      // 3b6: fload 9
      // 3b8: fsub
      // 3b9: fmul
      // 3ba: fsub
      // 3bb: fstore 18
      // 3bd: aload 1
      // 3be: invokevirtual com/schnurritv/sexmod/bi.func_70631_g_ ()Z
      // 3c1: ifeq 3cb
      // 3c4: fload 18
      // 3c6: ldc 3.0
      // 3c8: fmul
      // 3c9: fstore 18
      // 3cb: fload 17
      // 3cd: fconst_1
      // 3ce: fcmpl
      // 3cf: ifle 3d5
      // 3d2: fconst_1
      // 3d3: fstore 17
      // 3d5: aload 11
      // 3d7: fload 15
      // 3d9: fneg
      // 3da: putfield software/bernie/geckolib3/model/provider/data/EntityModelData.headPitch F
      // 3dd: aload 11
      // 3df: fload 14
      // 3e1: fneg
      // 3e2: putfield software/bernie/geckolib3/model/provider/data/EntityModelData.netHeadYaw F
      // 3e5: new software/bernie/geckolib3/core/event/predicate/AnimationEvent
      // 3e8: dup
      // 3e9: aload 1
      // 3ea: fload 18
      // 3ec: fload 17
      // 3ee: fload 9
      // 3f0: fload 17
      // 3f2: ldc -0.15
      // 3f4: fcmpl
      // 3f5: ifle 407
      // 3f8: fload 17
      // 3fa: ldc 0.15
      // 3fc: fcmpg
      // 3fd: iflt 40b
      // 400: goto 407
      // 403: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 406: athrow
      // 407: bipush 1
      // 408: goto 40c
      // 40b: bipush 0
      // 40c: aload 11
      // 40e: invokestatic java/util/Collections.singletonList (Ljava/lang/Object;)Ljava/util/List;
      // 411: invokespecial software/bernie/geckolib3/core/event/predicate/AnimationEvent.<init> (Lsoftware/bernie/geckolib3/core/IAnimatable;FFFZLjava/util/List;)V
      // 414: astore 19
      // 416: aload 0
      // 417: invokespecial software/bernie/geckolib3/renderers/geo/GeoEntityRenderer.getGeoModelProvider ()Lsoftware/bernie/geckolib3/model/provider/GeoModelProvider;
      // 41a: astore 20
      // 41c: aload 20
      // 41e: aload 1
      // 41f: invokevirtual software/bernie/geckolib3/model/provider/GeoModelProvider.getModelLocation (Ljava/lang/Object;)Lnet/minecraft/util/ResourceLocation;
      // 422: astore 21
      // 424: aload 20
      // 426: aload 21
      // 428: invokevirtual software/bernie/geckolib3/model/provider/GeoModelProvider.getModel (Lnet/minecraft/util/ResourceLocation;)Lsoftware/bernie/geckolib3/geo/render/built/GeoModel;
      // 42b: astore 22
      // 42d: aload 20
      // 42f: instanceof software/bernie/geckolib3/core/IAnimatableModel
      // 432: ifeq 453
      // 435: aload 20
      // 437: checkcast software/bernie/geckolib3/core/IAnimatableModel
      // 43a: aload 1
      // 43b: aload 1
      // 43c: invokevirtual com/schnurritv/sexmod/bi.func_110124_au ()Ljava/util/UUID;
      // 43f: invokevirtual java/util/UUID.hashCode ()I
      // 442: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 445: aload 19
      // 447: invokeinterface software/bernie/geckolib3/core/IAnimatableModel.setLivingAnimations (Ljava/lang/Object;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V 4
      // 44c: goto 453
      // 44f: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 452: athrow
      // 453: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 456: fconst_0
      // 457: ldc 0.01
      // 459: fconst_0
      // 45a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 45d: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 460: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
      // 463: aload 0
      // 464: aload 1
      // 465: invokevirtual com/schnurritv/sexmod/bW.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
      // 468: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
      // 46b: aload 0
      // 46c: aload 1
      // 46d: fload 9
      // 46f: invokevirtual com/schnurritv/sexmod/bW.getRenderColor (Ljava/lang/Object;F)Lsoftware/bernie/geckolib3/core/util/Color;
      // 472: astore 23
      // 474: aload 0
      // 475: aload 1
      // 476: fload 9
      // 478: invokevirtual com/schnurritv/sexmod/bW.setDoRenderBrightness (Lnet/minecraft/entity/EntityLivingBase;F)Z
      // 47b: istore 24
      // 47d: aload 0
      // 47e: aload 22
      // 480: aload 1
      // 481: fload 9
      // 483: aload 23
      // 485: invokevirtual software/bernie/geckolib3/core/util/Color.getRed ()I
      // 488: i2f
      // 489: ldc 255.0
      // 48b: fdiv
      // 48c: aload 23
      // 48e: invokevirtual software/bernie/geckolib3/core/util/Color.getBlue ()I
      // 491: i2f
      // 492: ldc 255.0
      // 494: fdiv
      // 495: aload 23
      // 497: invokevirtual software/bernie/geckolib3/core/util/Color.getGreen ()I
      // 49a: i2f
      // 49b: ldc 255.0
      // 49d: fdiv
      // 49e: aload 23
      // 4a0: invokevirtual software/bernie/geckolib3/core/util/Color.getAlpha ()I
      // 4a3: i2f
      // 4a4: ldc 255.0
      // 4a6: fdiv
      // 4a7: invokevirtual com/schnurritv/sexmod/bW.a (Lsoftware/bernie/geckolib3/geo/render/built/GeoModel;Lcom/schnurritv/sexmod/bi;FFFFF)V
      // 4aa: iload 24
      // 4ac: ifeq 4b9
      // 4af: invokestatic software/bernie/geckolib3/renderers/geo/RenderHurtColor.unset ()V
      // 4b2: goto 4b9
      // 4b5: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b8: athrow
      // 4b9: aload 0
      // 4ba: getfield com/schnurritv/sexmod/bW.layerRenderers Ljava/util/List;
      // 4bd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4c2: astore 25
      // 4c4: aload 25
      // 4c6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4cb: ifeq 4f1
      // 4ce: aload 25
      // 4d0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4d5: checkcast software/bernie/geckolib3/renderers/geo/GeoLayerRenderer
      // 4d8: astore 26
      // 4da: aload 26
      // 4dc: aload 1
      // 4dd: fload 18
      // 4df: fload 17
      // 4e1: fload 9
      // 4e3: fload 18
      // 4e5: fload 14
      // 4e7: fload 15
      // 4e9: aload 23
      // 4eb: invokevirtual software/bernie/geckolib3/renderers/geo/GeoLayerRenderer.render (Lnet/minecraft/entity/EntityLivingBase;FFFFFFLsoftware/bernie/geckolib3/core/util/Color;)V
      // 4ee: goto 4c4
      // 4f1: sipush 2896
      // 4f4: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 4f7: invokestatic net/minecraft/client/renderer/GlStateManager.func_179084_k ()V
      // 4fa: invokestatic net/minecraft/client/renderer/GlStateManager.func_179133_A ()V
      // 4fd: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 500: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 503: aload 1
      // 504: fload 9
      // 506: invokestatic com/schnurritv/sexmod/bd.a (Lcom/schnurritv/sexmod/bi;F)V
      // 509: return
      // try (0 -> 12): 13 java/lang/IllegalStateException
      // try (8 -> 19): 20 java/lang/IllegalStateException
      // try (15 -> 27): 28 java/lang/IllegalStateException
      // try (22 -> 35): 36 java/lang/IllegalStateException
      // try (60 -> 65): 66 java/lang/IllegalStateException
      // try (62 -> 72): 73 java/lang/IllegalStateException
      // try (68 -> 80): 81 java/lang/IllegalStateException
      // try (155 -> 163): 164 java/lang/IllegalStateException
      // try (157 -> 169): 170 java/lang/IllegalStateException
      // try (166 -> 176): 177 java/lang/IllegalStateException
      // try (172 -> 184): 185 java/lang/IllegalStateException
      // try (246 -> 259): 260 java/lang/IllegalStateException
      // try (262 -> 286): 287 java/lang/IllegalStateException
      // try (282 -> 291): 291 java/lang/IllegalStateException
      // try (324 -> 330): 331 java/lang/IllegalStateException
      // try (405 -> 410): 411 java/lang/IllegalStateException
      // try (443 -> 465): 466 java/lang/IllegalStateException
      // try (486 -> 498): 499 java/lang/IllegalStateException
      // try (522 -> 550): 551 java/lang/IllegalStateException
   }

   protected void a(T var1, float var2, float var3, float var4) {
      try {
         super.applyRotations((T)var1, var2, var3, var4);
         if (!(var1 instanceof bg)) {
            return;
         }
      } catch (IllegalStateException var22) {
         throw b(var22);
      }

      UUID var5 = ((bg)var1).q();

      try {
         if (var5 == null) {
            return;
         }
      } catch (IllegalStateException var21) {
         throw b(var21);
      }

      EntityPlayer var6 = var1.field_70170_p.func_152378_a(var5);

      try {
         if (var6 == null) {
            return;
         }
      } catch (IllegalStateException var18) {
         throw b(var18);
      }

      try {
         if (!var6.func_184613_cA()) {
            return;
         }
      } catch (IllegalStateException var20) {
         throw b(var20);
      }

      float var7 = var6.func_184599_cB() + var4;
      float var8 = MathHelper.func_76131_a(var7 * var7 / 100.0F, 0.0F, 1.0F);
      GlStateManager.func_179114_b(var8 * (-90.0F - var6.field_70125_A), 1.0F, 0.0F, 0.0F);
      Vec3d var9 = var6.func_70676_i(var4);
      double var10 = var6.field_70159_w * var6.field_70159_w + var6.field_70179_y * var6.field_70179_y;
      double var12 = var9.field_72450_a * var9.field_72450_a + var9.field_72449_c * var9.field_72449_c;

      try {
         if (!(var10 > 0.0) || !(var12 > 0.0)) {
            return;
         }
      } catch (IllegalStateException var19) {
         throw b(var19);
      }

      double var14 = (var6.field_70159_w * var9.field_72450_a + var6.field_70179_y * var9.field_72449_c) / (Math.sqrt(var10) * Math.sqrt(var12));
      double var16 = var6.field_70159_w * var9.field_72449_c - var6.field_70179_y * var9.field_72450_a;
      GlStateManager.func_179114_b((float)(Math.signum(var16) * Math.acos(var14)) * 180.0F / (float) Math.PI, 0.0F, 1.0F, 0.0F);
   }

   protected void a(BufferBuilder var1, String var2, GeoBone var3) {
   }

   protected void a(bi var1, double var2, double var4, double var6, float var8) {
      Entity var9 = var1.func_110166_bE();
      var4 -= (1.6 - var1.field_70131_O) * 0.5;
      Tessellator var10 = Tessellator.func_178181_a();
      BufferBuilder var11 = var10.func_178180_c();
      double var12 = b1.a(var9.field_70126_B, var9.field_70177_z, var8 * 0.5F) * (float) (Math.PI / 180.0);
      double var14 = b1.a(var9.field_70127_C, var9.field_70125_A, var8 * 0.5F) * (float) (Math.PI / 180.0);
      double var16 = Math.cos(var12);
      double var18 = Math.sin(var12);
      double var20 = Math.sin(var14);
      if (var9 instanceof EntityHanging) {
         var16 = 0.0;
         var18 = 0.0;
         var20 = -1.0;
      }

      double var22 = Math.cos(var14);
      double var24 = b1.a(var9.field_70169_q, var9.field_70165_t, var8) - var16 * 0.7 - var18 * 0.5 * var22;
      double var26 = b1.a(var9.field_70167_r + var9.func_70047_e() * 0.7, var9.field_70163_u + var9.func_70047_e() * 0.7, var8) - var20 * 0.5 - 0.25;
      double var28 = b1.a(var9.field_70166_s, var9.field_70161_v, var8) - var18 * 0.7 + var16 * 0.5 * var22;
      double var30 = b1.a(var1.field_70760_ar, var1.field_70761_aq, var8) * (float) (Math.PI / 180.0) + (Math.PI / 2);
      var16 = Math.cos(var30) * var1.field_70130_N * 0.4;
      var18 = Math.sin(var30) * var1.field_70130_N * 0.4;
      double var32 = b1.a(var1.field_70169_q, var1.field_70165_t, var8) + var16;
      double var34 = b1.a(var1.field_70167_r, var1.field_70163_u, var8);
      double var36 = b1.a(var1.field_70166_s, var1.field_70161_v, var8) + var18;
      var2 += var16;
      var6 += var18;
      double var38 = (float)(var24 - var32);
      double var40 = (float)(var26 - var34);
      double var42 = (float)(var28 - var36);
      GlStateManager.func_179090_x();
      GlStateManager.func_179140_f();
      GlStateManager.func_179129_p();
      var11.func_181668_a(5, DefaultVertexFormats.field_181706_f);

      for (int var44 = 0; var44 <= 24; var44++) {
         float var45 = 0.5F;
         float var46 = 0.4F;
         float var47 = 0.3F;
         if (var44 % 2 == 0) {
            var45 *= 0.7F;
            var46 *= 0.7F;
            var47 *= 0.7F;
         }

         float var48 = var44 / 24.0F;
         var11.func_181662_b(
               var2 + var38 * var48 + 0.0, var4 + var40 * (var48 * var48 + var48) * 0.5 + ((24.0F - var44) / 18.0F + 0.125F), var6 + var42 * var48
            )
            .func_181666_a(var45, var46, var47, 1.0F)
            .func_181675_d();
         var11.func_181662_b(
               var2 + var38 * var48 + 0.025, var4 + var40 * (var48 * var48 + var48) * 0.5 + ((24.0F - var44) / 18.0F + 0.125F) + 0.025, var6 + var42 * var48
            )
            .func_181666_a(var45, var46, var47, 1.0F)
            .func_181675_d();
      }

      var10.func_78381_a();
      var11.func_181668_a(5, DefaultVertexFormats.field_181706_f);

      for (int var54 = 0; var54 <= 24; var54++) {
         float var55 = 0.5F;
         float var56 = 0.4F;
         float var57 = 0.3F;
         if (var54 % 2 == 0) {
            var55 *= 0.7F;
            var56 *= 0.7F;
            var57 *= 0.7F;
         }

         float var58 = var54 / 24.0F;
         var11.func_181662_b(
               var2 + var38 * var58 + 0.0, var4 + var40 * (var58 * var58 + var58) * 0.5 + ((24.0F - var54) / 18.0F + 0.125F) + 0.025, var6 + var42 * var58
            )
            .func_181666_a(var55, var56, var57, 1.0F)
            .func_181675_d();
         var11.func_181662_b(
               var2 + var38 * var58 + 0.025, var4 + var40 * (var58 * var58 + var58) * 0.5 + ((24.0F - var54) / 18.0F + 0.125F), var6 + var42 * var58 + 0.025
            )
            .func_181666_a(var55, var56, var57, 1.0F)
            .func_181675_d();
      }

      var10.func_78381_a();
      GlStateManager.func_179145_e();
      GlStateManager.func_179098_w();
      GlStateManager.func_179089_o();
   }

   @Override
   public void renderRecursively(BufferBuilder param1, GeoBone param2, float param3, float param4, float param5, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 004: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 007: instanceof com/b
      // 00a: ifeq 012
      // 00d: return
      // 00e: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 011: athrow
      // 012: aload 2
      // 013: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
      // 016: astore 7
      // 018: aload 7
      // 01a: ldc "weapon"
      // 01c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 01f: ifeq 040
      // 022: aload 0
      // 023: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 026: instanceof com/schnurritv/sexmod/bs
      // 029: ifeq 040
      // 02c: goto 033
      // 02f: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: aload 0
      // 034: aload 1
      // 035: aload 2
      // 036: invokevirtual com/schnurritv/sexmod/bW.b (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 039: goto 040
      // 03c: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: aload 7
      // 042: ldc "itemRenderer"
      // 044: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 047: ifeq 06b
      // 04a: aload 0
      // 04b: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 04e: invokevirtual com/schnurritv/sexmod/bi.D ()Lcom/schnurritv/sexmod/bj;
      // 051: getstatic com/schnurritv/sexmod/bj.PAYMENT Lcom/schnurritv/sexmod/bj;
      // 054: if_acmpne 06b
      // 057: goto 05e
      // 05a: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 1
      // 060: aload 2
      // 061: invokevirtual com/schnurritv/sexmod/bW.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 064: goto 06b
      // 067: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: aload 1
      // 06c: putstatic com/schnurritv/sexmod/bW.c Lnet/minecraft/client/renderer/BufferBuilder;
      // 06f: aload 0
      // 070: aload 1
      // 071: aload 7
      // 073: aload 2
      // 074: invokevirtual com/schnurritv/sexmod/bW.a (Lnet/minecraft/client/renderer/BufferBuilder;Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 077: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 07a: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
      // 07d: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 080: aload 2
      // 081: invokevirtual software/bernie/geckolib3/util/MatrixStack.translate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 084: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 087: aload 2
      // 088: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 08b: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 08e: aload 2
      // 08f: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 092: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 095: aload 2
      // 096: invokevirtual software/bernie/geckolib3/util/MatrixStack.scale (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 099: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 09c: aload 2
      // 09d: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 0a0: ldc "Head2"
      // 0a2: aload 7
      // 0a4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a7: ifeq 0c3
      // 0aa: aload 0
      // 0ab: invokevirtual com/schnurritv/sexmod/bW.c ()Z
      // 0ae: ifne 0c3
      // 0b1: goto 0b8
      // 0b4: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 0bb: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
      // 0be: return
      // 0bf: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: aload 7
      // 0c6: invokevirtual com/schnurritv/sexmod/bW.a (Ljava/lang/String;)Z
      // 0c9: ifne 0d7
      // 0cc: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 0cf: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
      // 0d2: return
      // 0d3: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 2
      // 0d8: getfield software/bernie/geckolib3/geo/render/built/GeoBone.isHidden Z
      // 0db: ifne 1ae
      // 0de: aload 0
      // 0df: aload 7
      // 0e1: fload 3
      // 0e2: fload 4
      // 0e4: fload 5
      // 0e6: invokevirtual com/schnurritv/sexmod/bW.a (Ljava/lang/String;FFF)Ljavax/vecmath/Vector4f;
      // 0e9: astore 8
      // 0eb: aload 8
      // 0ed: getfield javax/vecmath/Vector4f.x F
      // 0f0: fstore 3
      // 0f1: aload 8
      // 0f3: getfield javax/vecmath/Vector4f.y F
      // 0f6: fstore 4
      // 0f8: aload 8
      // 0fa: getfield javax/vecmath/Vector4f.z F
      // 0fd: fstore 5
      // 0ff: aload 8
      // 101: getfield javax/vecmath/Vector4f.w F
      // 104: f2d
      // 105: dstore 9
      // 107: aload 0
      // 108: getfield com/schnurritv/sexmod/bW.e Ljava/util/HashSet;
      // 10b: aload 7
      // 10d: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 110: ifne 15e
      // 113: aload 2
      // 114: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childCubes Ljava/util/List;
      // 117: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11c: astore 11
      // 11e: aload 11
      // 120: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 125: ifeq 15e
      // 128: aload 11
      // 12a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12f: checkcast software/bernie/geckolib3/geo/render/built/GeoCube
      // 132: astore 12
      // 134: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 137: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
      // 13a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 13d: aload 0
      // 13e: aload 2
      // 13f: putfield com/schnurritv/sexmod/bW.v Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
      // 142: aload 0
      // 143: aload 1
      // 144: aload 12
      // 146: fload 3
      // 147: fload 4
      // 149: fload 5
      // 14b: fload 6
      // 14d: dload 9
      // 14f: invokevirtual com/schnurritv/sexmod/bW.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;FFFFD)V
      // 152: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 155: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 158: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
      // 15b: goto 11e
      // 15e: aload 2
      // 15f: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childBones Ljava/util/List;
      // 162: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 167: astore 11
      // 169: aload 11
      // 16b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 170: ifeq 1ae
      // 173: aload 11
      // 175: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 17a: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
      // 17d: astore 12
      // 17f: dload 9
      // 181: dconst_0
      // 182: dcmpl
      // 183: ifne 19b
      // 186: aload 0
      // 187: aload 1
      // 188: aload 12
      // 18a: fload 3
      // 18b: fload 4
      // 18d: fload 5
      // 18f: fload 6
      // 191: invokevirtual com/schnurritv/sexmod/bW.renderRecursively (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFF)V
      // 194: goto 1ab
      // 197: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: aload 0
      // 19c: aload 1
      // 19d: aload 12
      // 19f: fload 3
      // 1a0: fload 4
      // 1a2: fload 5
      // 1a4: fload 6
      // 1a6: dload 9
      // 1a8: invokevirtual com/schnurritv/sexmod/bW.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
      // 1ab: goto 169
      // 1ae: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 1b1: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
      // 1b4: goto 1b9
      // 1b7: astore 8
      // 1b9: return
      // try (165 -> 178): 178 java/lang/IllegalStateException
      // try (87 -> 94): 94 java/lang/IllegalStateException
      // try (76 -> 85): 85 java/lang/IllegalStateException
      // try (48 -> 79): 80 java/lang/IllegalStateException
      // try (33 -> 45): 46 java/lang/IllegalStateException
      // try (29 -> 38): 39 java/lang/IllegalStateException
      // try (15 -> 26): 27 java/lang/IllegalStateException
      // try (11 -> 19): 20 java/lang/IllegalStateException
      // try (0 -> 6): 6 java/lang/IllegalStateException
      // try (190 -> 192): 193 java/lang/IllegalStateException
   }

   protected Vector4f a(float var1, float var2, float var3) {
      return new Vector4f(var1, var2, var3, 0.0F);
   }

   boolean a(String var1) {
      try {
         if (!var1.startsWith("armor")) {
            return true;
         }
      } catch (IllegalStateException var2) {
         throw b(var2);
      }

      return this.g instanceof bs;
   }

   protected Vector4f a(String var1, float var2, float var3, float var4) {
      try {
         if (!var1.startsWith("armor")) {
            return this.a(var2, var3, var4);
         }
      } catch (IllegalStateException var19) {
         throw b(var19);
      }

      try {
         if (!(this.g instanceof bs)) {
            return this.a(var2, var3, var4);
         }
      } catch (IllegalStateException var15) {
         throw b(var15);
      }

      try {
         if ((Integer)this.g.D.func_187225_a(bi.t) == 0) {
            return this.a(var2, var3, var4);
         }
      } catch (IllegalStateException var18) {
         throw b(var18);
      }

      GeoModelProvider var5 = this.getGeoModelProvider();

      try {
         if (!(var5 instanceof A)) {
            return this.a(var2, var3, var4);
         }
      } catch (IllegalStateException var17) {
         throw b(var17);
      }

      A var6 = (A)var5;
      ItemStack var7 = var6.a(this.g, var1);

      try {
         if (!(var7.func_77973_b() instanceof ItemArmor)) {
            return this.a(var2, var3, var4);
         }
      } catch (IllegalStateException var16) {
         throw b(var16);
      }

      ItemArmor var8 = (ItemArmor)var7.func_77973_b();
      ArmorMaterial var9 = var8.func_82812_d();
      float var10 = 0.0F;
      switch (var9) {
         case GOLD:
            var10 = 1.0F;
            break;
         case CHAIN:
         case IRON:
            var10 = 2.0F;
            break;
         case LEATHER:
            var10 = 4.0F;
            int var11 = var8.func_82814_b(var7);
            float var12 = (var11 >> 16 & 0xFF) / 255.0F;
            float var13 = (var11 >> 8 & 0xFF) / 255.0F;
            float var14 = (var11 & 0xFF) / 255.0F;
            var2 *= var12;
            var3 *= var13;
            var4 *= var14;
      }

      return new Vector4f(var2, var3, var4, 72.0F * var10 / 4096.0F);
   }

   public void a(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.i = (Matrix4f)MATRIX_STACK.getModelMatrix().clone();
   }

   public void a(BufferBuilder var1, GeoBone var2, float var3, float var4, float var5, float var6, double var7) {
      try {
         if (this.g.field_70170_p instanceof com.b) {
            return;
         }
      } catch (IllegalStateException var14) {
         throw b(var14);
      }

      String var9 = var2.getName();

      try {
         if (var9.equals("weapon")) {
            this.b(var1, var2);
         }
      } catch (IllegalStateException var12) {
         throw b(var12);
      }

      label56: {
         label57: {
            try {
               this.a(var1, var2.getName(), var2);
               MATRIX_STACK.push();
               MATRIX_STACK.translate(var2);
               MATRIX_STACK.moveToPivot(var2);
               MATRIX_STACK.rotate(var2);
               MATRIX_STACK.scale(var2);
               MATRIX_STACK.moveBackFromPivot(var2);
               if (var2.isHidden) {
                  break label56;
               }

               if (this.e.contains(var9)) {
                  break label57;
               }
            } catch (IllegalStateException var13) {
               throw b(var13);
            }

            for (GeoCube var11 : var2.childCubes) {
               MATRIX_STACK.push();
               GlStateManager.func_179094_E();
               this.v = var2;
               this.a(var1, var11, var3, var4, var5, var6, var7);
               GlStateManager.func_179121_F();
               MATRIX_STACK.pop();
            }
         }

         for (GeoBone var16 : var2.childBones) {
            this.a(var1, var16, var3, var4, var5, var6, var7);
         }
      }

      MATRIX_STACK.pop();
   }

   protected boolean c() {
      try {
         if (!this.g.f()) {
            return true;
         }
      } catch (IllegalStateException var1) {
         throw b(var1);
      }

      try {
         if (this.n.field_71474_y.field_74320_O != 0) {
            return true;
         }
      } catch (IllegalStateException var2) {
         throw b(var2);
      }

      return false;
   }

   public void a(BufferBuilder param1, GeoCube param2, float param3, float param4, float param5, float param6, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 003: aload 2
      // 004: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
      // 007: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 00a: aload 2
      // 00b: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
      // 00e: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 011: aload 2
      // 012: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
      // 015: aload 2
      // 016: getfield software/bernie/geckolib3/geo/render/built/GeoCube.quads [Lsoftware/bernie/geckolib3/geo/render/built/GeoQuad;
      // 019: astore 9
      // 01b: aload 9
      // 01d: arraylength
      // 01e: istore 10
      // 020: bipush 0
      // 021: istore 11
      // 023: iload 11
      // 025: iload 10
      // 027: if_icmpge 20a
      // 02a: aload 9
      // 02c: iload 11
      // 02e: aaload
      // 02f: astore 12
      // 031: aload 12
      // 033: ifnonnull 03d
      // 036: goto 204
      // 039: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: new javax/vecmath/Vector3f
      // 040: dup
      // 041: aload 12
      // 043: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
      // 046: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 049: i2f
      // 04a: aload 12
      // 04c: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
      // 04f: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
      // 052: i2f
      // 053: aload 12
      // 055: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
      // 058: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 05b: i2f
      // 05c: invokespecial javax/vecmath/Vector3f.<init> (FFF)V
      // 05f: astore 13
      // 061: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 064: invokevirtual software/bernie/geckolib3/util/MatrixStack.getNormalMatrix ()Ljavax/vecmath/Matrix3f;
      // 067: aload 13
      // 069: invokevirtual javax/vecmath/Matrix3f.transform (Ljavax/vecmath/Tuple3f;)V
      // 06c: aload 2
      // 06d: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
      // 070: getfield javax/vecmath/Vector3f.y F
      // 073: fconst_0
      // 074: fcmpl
      // 075: ifeq 08b
      // 078: aload 2
      // 079: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
      // 07c: getfield javax/vecmath/Vector3f.z F
      // 07f: fconst_0
      // 080: fcmpl
      // 081: ifne 0af
      // 084: goto 08b
      // 087: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: aload 13
      // 08d: invokevirtual javax/vecmath/Vector3f.getX ()F
      // 090: fconst_0
      // 091: fcmpg
      // 092: ifge 0af
      // 095: goto 09c
      // 098: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 13
      // 09e: dup
      // 09f: getfield javax/vecmath/Vector3f.x F
      // 0a2: ldc -1.0
      // 0a4: fmul
      // 0a5: putfield javax/vecmath/Vector3f.x F
      // 0a8: goto 0af
      // 0ab: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: aload 2
      // 0b0: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
      // 0b3: getfield javax/vecmath/Vector3f.x F
      // 0b6: fconst_0
      // 0b7: fcmpl
      // 0b8: ifeq 0ce
      // 0bb: aload 2
      // 0bc: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
      // 0bf: getfield javax/vecmath/Vector3f.z F
      // 0c2: fconst_0
      // 0c3: fcmpl
      // 0c4: ifne 0f2
      // 0c7: goto 0ce
      // 0ca: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 13
      // 0d0: invokevirtual javax/vecmath/Vector3f.getY ()F
      // 0d3: fconst_0
      // 0d4: fcmpg
      // 0d5: ifge 0f2
      // 0d8: goto 0df
      // 0db: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: aload 13
      // 0e1: dup
      // 0e2: getfield javax/vecmath/Vector3f.y F
      // 0e5: ldc -1.0
      // 0e7: fmul
      // 0e8: putfield javax/vecmath/Vector3f.y F
      // 0eb: goto 0f2
      // 0ee: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: aload 2
      // 0f3: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
      // 0f6: getfield javax/vecmath/Vector3f.x F
      // 0f9: fconst_0
      // 0fa: fcmpl
      // 0fb: ifeq 111
      // 0fe: aload 2
      // 0ff: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
      // 102: getfield javax/vecmath/Vector3f.y F
      // 105: fconst_0
      // 106: fcmpl
      // 107: ifne 135
      // 10a: goto 111
      // 10d: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: aload 13
      // 113: invokevirtual javax/vecmath/Vector3f.getZ ()F
      // 116: fconst_0
      // 117: fcmpg
      // 118: ifge 135
      // 11b: goto 122
      // 11e: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: aload 13
      // 124: dup
      // 125: getfield javax/vecmath/Vector3f.z F
      // 128: ldc -1.0
      // 12a: fmul
      // 12b: putfield javax/vecmath/Vector3f.z F
      // 12e: goto 135
      // 131: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: new net/minecraft/util/math/Vec3d
      // 138: dup
      // 139: fload 3
      // 13a: f2d
      // 13b: fload 4
      // 13d: f2d
      // 13e: fload 5
      // 140: f2d
      // 141: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 144: astore 14
      // 146: aload 0
      // 147: invokevirtual com/schnurritv/sexmod/bW.e ()Z
      // 14a: ifeq 15c
      // 14d: aload 0
      // 14e: aload 14
      // 150: aload 13
      // 152: invokevirtual com/schnurritv/sexmod/bW.a (Lnet/minecraft/util/math/Vec3d;Ljavax/vecmath/Vector3f;)Lnet/minecraft/util/math/Vec3d;
      // 155: goto 15e
      // 158: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: aload 14
      // 15e: astore 15
      // 160: aload 12
      // 162: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.vertices [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
      // 165: astore 16
      // 167: aload 16
      // 169: arraylength
      // 16a: istore 17
      // 16c: bipush 0
      // 16d: istore 18
      // 16f: iload 18
      // 171: iload 17
      // 173: if_icmpge 204
      // 176: aload 16
      // 178: iload 18
      // 17a: aaload
      // 17b: astore 19
      // 17d: new javax/vecmath/Vector4f
      // 180: dup
      // 181: aload 19
      // 183: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
      // 186: invokevirtual javax/vecmath/Vector3f.getX ()F
      // 189: aload 19
      // 18b: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
      // 18e: invokevirtual javax/vecmath/Vector3f.getY ()F
      // 191: aload 19
      // 193: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
      // 196: invokevirtual javax/vecmath/Vector3f.getZ ()F
      // 199: fconst_1
      // 19a: invokespecial javax/vecmath/Vector4f.<init> (FFFF)V
      // 19d: astore 20
      // 19f: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 1a2: invokevirtual software/bernie/geckolib3/util/MatrixStack.getModelMatrix ()Ljavax/vecmath/Matrix4f;
      // 1a5: aload 20
      // 1a7: invokevirtual javax/vecmath/Matrix4f.transform (Ljavax/vecmath/Tuple4f;)V
      // 1aa: aload 1
      // 1ab: aload 20
      // 1ad: invokevirtual javax/vecmath/Vector4f.getX ()F
      // 1b0: f2d
      // 1b1: aload 20
      // 1b3: invokevirtual javax/vecmath/Vector4f.getY ()F
      // 1b6: f2d
      // 1b7: aload 20
      // 1b9: invokevirtual javax/vecmath/Vector4f.getZ ()F
      // 1bc: f2d
      // 1bd: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 1c0: aload 19
      // 1c2: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureU F
      // 1c5: f2d
      // 1c6: dload 7
      // 1c8: dadd
      // 1c9: aload 19
      // 1cb: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureV F
      // 1ce: f2d
      // 1cf: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 1d2: aload 15
      // 1d4: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 1d7: d2f
      // 1d8: aload 15
      // 1da: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 1dd: d2f
      // 1de: aload 15
      // 1e0: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 1e3: d2f
      // 1e4: fload 6
      // 1e6: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181666_a (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
      // 1e9: aload 13
      // 1eb: invokevirtual javax/vecmath/Vector3f.getX ()F
      // 1ee: aload 13
      // 1f0: invokevirtual javax/vecmath/Vector3f.getY ()F
      // 1f3: aload 13
      // 1f5: invokevirtual javax/vecmath/Vector3f.getZ ()F
      // 1f8: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
      // 1fb: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
      // 1fe: iinc 18 1
      // 201: goto 16f
      // 204: iinc 11 1
      // 207: goto 023
      // 20a: return
      // try (24 -> 27): 27 java/lang/IllegalStateException
      // try (45 -> 61): 62 java/lang/IllegalStateException
      // try (55 -> 69): 70 java/lang/IllegalStateException
      // try (64 -> 78): 79 java/lang/IllegalStateException
      // try (81 -> 93): 94 java/lang/IllegalStateException
      // try (87 -> 101): 102 java/lang/IllegalStateException
      // try (96 -> 110): 111 java/lang/IllegalStateException
      // try (113 -> 125): 126 java/lang/IllegalStateException
      // try (119 -> 133): 134 java/lang/IllegalStateException
      // try (128 -> 142): 143 java/lang/IllegalStateException
      // try (155 -> 163): 163 java/lang/IllegalStateException
   }

   protected HashSet<String> b() {
      return new HashSet<String>() {
         {
            this.add("boobs");
            this.add("booty");
            this.add("vagina");
            this.add("fuckhole");
         }
      };
   }

   protected boolean e() {
      k var1 = com.schnurritv.sexmod.k.a(this.g);
      HashMap var2 = t.get(var1);
      if (var2 == null) {
         var2 = new HashMap();
         boolean var6 = this.a(this.b());
         var2.put(this.v.getName(), var6);
         t.put(var1, var2);
         return var6;
      } else {
         Boolean var3 = (Boolean)var2.get(this.v.getName());
         if (var3 == null) {
            var3 = this.a(this.b());
            var2.put(this.v.getName(), var3);
            t.put(var1, var2);
            return var3;
         } else {
            return var3;
         }
      }
   }

   boolean a(HashSet<String> var1) {
      return this.a(var1, this.v);
   }

   boolean a(HashSet<String> var1, GeoBone var2) {
      while (var2.parent != null) {
         String var3 = var2.getName();

         try {
            if (var1.contains(var3)) {
               return false;
            }
         } catch (IllegalStateException var4) {
            throw b(var4);
         }

         try {
            if (var3.startsWith("armor")) {
               return false;
            }
         } catch (IllegalStateException var5) {
            throw b(var5);
         }

         var2 = var2.parent;
      }

      return true;
   }

   protected void a(List<IBone> var1, HashSet<String> var2, k var3) {
      HashMap var4 = new HashMap();

      for (IBone var6 : var1) {
         var4.put(var6.getName(), this.a(var2, (GeoBone)var6));
      }

      t.put(var3, var4);
   }

   public Vec3d a(Vec3d var1, Vector3f var2) {
      double var3 = b1.a(var2, this.s);
      double var5 = b1.d(Math.abs(var3));
      var5 *= 0.1F;

      Vec3d var10000;
      try {
         var10000 = var1;
         if (var3 > 0.0) {
            return b1.a(var1, k, var5);
         }
      } catch (IllegalStateException var7) {
         throw b(var7);
      }

      return b1.a(var10000, m, var5);
   }

   protected ItemStack a() {
      String var1 = (String)this.g.D.func_187225_a(bi.n);
      byte var2 = -1;

      label76: {
         label75: {
            label74: {
               label73: {
                  label72: {
                     label71: {
                        try {
                           switch (var1.hashCode()) {
                              case -20842805:
                                 break;
                              case 113766:
                                 break label74;
                              case 64419037:
                                 break label72;
                              case 95761198:
                                 if (!var1.equals("doggy")) {
                                    break label76;
                                 }
                                 break label75;
                              case 109773592:
                                 break label71;
                              case 2014427283:
                                 break label73;
                              default:
                                 break label76;
                           }
                        } catch (IllegalStateException var4) {
                           throw b(var4);
                        }

                        if (var1.equals("blowjob")) {
                           var2 = 1;
                        }
                        break label76;
                     }

                     if (var1.equals("strip")) {
                        var2 = 2;
                     }
                     break label76;
                  }

                  if (var1.equals("boobjob")) {
                     var2 = 3;
                  }
                  break label76;
               }

               if (var1.equals("touch_boobs")) {
                  var2 = 4;
               }
               break label76;
            }

            if (var1.equals("sex")) {
               var2 = 5;
            }
            break label76;
         }

         var2 = 0;
      }

      try {
         switch (var2) {
            case 0:
               return new ItemStack(Items.field_151045_i, 2);
            case 1:
               return new ItemStack(Items.field_151166_bC, 3);
            case 2:
               return new ItemStack(Items.field_151043_k, 1);
            case 3:
               return new ItemStack(Items.field_151079_bi, 2);
            case 4:
               return new ItemStack(Items.field_151115_aP, 2, 1);
            case 5:
               return new ItemStack(Items.field_151115_aP, 3, 0);
            default:
               return null;
         }
      } catch (IllegalStateException var3) {
         throw b(var3);
      }
   }

   protected void a(BufferBuilder param1, GeoBone param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual com/schnurritv/sexmod/bW.a ()Lnet/minecraft/item/ItemStack;
      // 04: astore 3
      // 05: aload 3
      // 06: ifnonnull 0e
      // 09: return
      // 0a: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d: athrow
      // 0e: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 11: invokevirtual net/minecraft/client/Minecraft.func_175597_ag ()Lnet/minecraft/client/renderer/ItemRenderer;
      // 14: astore 4
      // 16: bipush 0
      // 17: istore 5
      // 19: iload 5
      // 1b: aload 3
      // 1c: invokevirtual net/minecraft/item/ItemStack.func_190916_E ()I
      // 1f: if_icmpge ff
      // 22: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 25: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
      // 28: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
      // 2b: getstatic software/bernie/geckolib3/renderers/geo/IGeoRenderer.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 2e: aload 2
      // 2f: invokestatic com/schnurritv/sexmod/Q.a (Lsoftware/bernie/geckolib3/util/MatrixStack;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 32: sipush 2896
      // 35: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 38: aload 2
      // 39: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
      // 3c: f2d
      // 3d: ldc2_w 2.5
      // 40: dadd
      // 41: dconst_0
      // 42: dconst_0
      // 43: dconst_1
      // 44: invokestatic org/lwjgl/opengl/GL11.glRotated (DDDD)V
      // 47: aload 2
      // 48: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationY ()F
      // 4b: f2d
      // 4c: dconst_0
      // 4d: dconst_1
      // 4e: dconst_0
      // 4f: invokestatic org/lwjgl/opengl/GL11.glRotated (DDDD)V
      // 52: aload 2
      // 53: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationZ ()F
      // 56: f2d
      // 57: dconst_1
      // 58: dconst_0
      // 59: dconst_0
      // 5a: invokestatic org/lwjgl/opengl/GL11.glRotated (DDDD)V
      // 5d: iload 5
      // 5f: lookupswitch 70 2 1 29 2 53
      // 78: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: ldc2_w -15.0
      // 7f: dconst_0
      // 80: dconst_0
      // 81: dconst_1
      // 82: invokestatic org/lwjgl/opengl/GL11.glRotated (DDDD)V
      // 85: dconst_0
      // 86: dconst_0
      // 87: ldc2_w -0.025
      // 8a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // 8d: goto a5
      // 90: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: ldc2_w 15.0
      // 97: dconst_0
      // 98: dconst_0
      // 99: dconst_1
      // 9a: invokestatic org/lwjgl/opengl/GL11.glRotated (DDDD)V
      // 9d: dconst_0
      // 9e: dconst_0
      // 9f: ldc2_w 0.025
      // a2: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // a5: aload 0
      // a6: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // a9: getfield com/schnurritv/sexmod/bi.i F
      // ac: aload 0
      // ad: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // b0: getfield com/schnurritv/sexmod/bi.i F
      // b3: aload 0
      // b4: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // b7: getfield com/schnurritv/sexmod/bi.i F
      // ba: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
      // bd: aload 4
      // bf: aload 0
      // c0: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // c3: new net/minecraft/item/ItemStack
      // c6: dup
      // c7: aload 3
      // c8: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // cb: bipush 1
      // cc: invokespecial net/minecraft/item/ItemStack.<init> (Lnet/minecraft/item/Item;I)V
      // cf: getstatic net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType.THIRD_PERSON_RIGHT_HAND Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;
      // d2: invokevirtual net/minecraft/client/renderer/ItemRenderer.func_178099_a (Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V
      // d5: aload 0
      // d6: aload 0
      // d7: aload 0
      // d8: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // db: invokevirtual com/schnurritv/sexmod/bW.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
      // de: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // e1: checkcast net/minecraft/util/ResourceLocation
      // e4: invokevirtual com/schnurritv/sexmod/bW.func_110776_a (Lnet/minecraft/util/ResourceLocation;)V
      // e7: aload 1
      // e8: bipush 7
      // ea: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l Lnet/minecraft/client/renderer/vertex/VertexFormat;
      // ed: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
      // f0: sipush 2896
      // f3: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // f6: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // f9: iinc 5 1
      // fc: goto 19
      // ff: return
      // try (3 -> 6): 6 java/lang/IllegalStateException
      // try (13 -> 50): 50 java/lang/IllegalStateException
      // try (17 -> 62): 62 java/lang/IllegalStateException
   }

   protected ItemStack a(@Nullable ItemStack var1) {
      return var1;
   }

   protected void b(BufferBuilder param1, GeoBone param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 004: ifnonnull 00c
      // 007: return
      // 008: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00b: athrow
      // 00c: aload 0
      // 00d: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 010: instanceof com/schnurritv/sexmod/bs
      // 013: ifne 01b
      // 016: return
      // 017: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 01f: invokevirtual com/schnurritv/sexmod/bi.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 022: astore 3
      // 023: aload 0
      // 024: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 027: checkcast com/schnurritv/sexmod/bs
      // 02a: astore 4
      // 02c: aload 3
      // 02d: getstatic com/schnurritv/sexmod/bs.J Lnet/minecraft/network/datasync/DataParameter;
      // 030: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 033: checkcast java/lang/Integer
      // 036: invokevirtual java/lang/Integer.intValue ()I
      // 039: istore 5
      // 03b: aload 4
      // 03d: invokevirtual com/schnurritv/sexmod/bs.D ()Lcom/schnurritv/sexmod/bj;
      // 040: getstatic com/schnurritv/sexmod/bj.BOW Lcom/schnurritv/sexmod/bj;
      // 043: if_acmpeq 052
      // 046: aload 0
      // 047: fconst_0
      // 048: putfield com/schnurritv/sexmod/bW.d F
      // 04b: goto 052
      // 04e: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: aconst_null
      // 053: astore 6
      // 055: iload 5
      // 057: bipush 1
      // 058: if_icmpne 06a
      // 05b: aload 3
      // 05c: getstatic com/schnurritv/sexmod/bs.K Lnet/minecraft/network/datasync/DataParameter;
      // 05f: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 062: checkcast net/minecraft/item/ItemStack
      // 065: astore 6
      // 067: goto 07c
      // 06a: iload 5
      // 06c: bipush 2
      // 06d: if_icmpne 07c
      // 070: aload 3
      // 071: getstatic com/schnurritv/sexmod/bs.N Lnet/minecraft/network/datasync/DataParameter;
      // 074: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 077: checkcast net/minecraft/item/ItemStack
      // 07a: astore 6
      // 07c: aload 0
      // 07d: aload 6
      // 07f: invokevirtual com/schnurritv/sexmod/bW.a (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;
      // 082: astore 6
      // 084: aload 6
      // 086: ifnonnull 08e
      // 089: return
      // 08a: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 6
      // 090: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 093: getstatic net/minecraft/init/Items.field_151031_f Lnet/minecraft/item/ItemBow;
      // 096: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 099: ifeq 0de
      // 09c: aload 4
      // 09e: invokevirtual com/schnurritv/sexmod/bs.D ()Lcom/schnurritv/sexmod/bj;
      // 0a1: getstatic com/schnurritv/sexmod/bj.BOW Lcom/schnurritv/sexmod/bj;
      // 0a4: if_acmpne 0de
      // 0a7: goto 0ae
      // 0aa: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: dup
      // 0b0: getfield com/schnurritv/sexmod/bW.d F
      // 0b3: ldc 0.015
      // 0b5: fadd
      // 0b6: putfield com/schnurritv/sexmod/bW.d F
      // 0b9: aload 4
      // 0bb: aload 0
      // 0bc: getfield com/schnurritv/sexmod/bW.d F
      // 0bf: fneg
      // 0c0: ldc 20.0
      // 0c2: fmul
      // 0c3: aload 6
      // 0c5: invokevirtual net/minecraft/item/ItemStack.func_77988_m ()I
      // 0c8: i2f
      // 0c9: fadd
      // 0ca: invokestatic java/lang/Math.round (F)I
      // 0cd: invokevirtual com/schnurritv/sexmod/bs.a (I)V
      // 0d0: aload 4
      // 0d2: aload 6
      // 0d4: invokevirtual com/schnurritv/sexmod/bs.a (Lnet/minecraft/item/ItemStack;)V
      // 0d7: goto 0de
      // 0da: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd: athrow
      // 0de: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 0e1: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
      // 0e4: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
      // 0e7: getstatic com/schnurritv/sexmod/bW.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 0ea: aload 2
      // 0eb: invokestatic com/schnurritv/sexmod/Q.a (Lsoftware/bernie/geckolib3/util/MatrixStack;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 0ee: sipush 2896
      // 0f1: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 0f4: aload 6
      // 0f6: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 0f9: instanceof net/minecraft/item/ItemBow
      // 0fc: ifeq 112
      // 0ff: aload 4
      // 101: getfield com/schnurritv/sexmod/bs.I I
      // 104: i2f
      // 105: fconst_1
      // 106: fconst_0
      // 107: fconst_0
      // 108: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 10b: goto 166
      // 10e: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: aload 4
      // 114: invokevirtual com/schnurritv/sexmod/bs.D ()Lcom/schnurritv/sexmod/bj;
      // 117: getstatic com/schnurritv/sexmod/bj.ATTACK Lcom/schnurritv/sexmod/bj;
      // 11a: if_acmpne 15a
      // 11d: aload 4
      // 11f: getfield com/schnurritv/sexmod/bs.L I
      // 122: ifne 15a
      // 125: goto 12c
      // 128: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: aload 4
      // 12e: getfield com/schnurritv/sexmod/bs.O Lnet/minecraft/util/math/Vec3d;
      // 131: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 134: aload 4
      // 136: getfield com/schnurritv/sexmod/bs.O Lnet/minecraft/util/math/Vec3d;
      // 139: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 13c: aload 4
      // 13e: getfield com/schnurritv/sexmod/bs.O Lnet/minecraft/util/math/Vec3d;
      // 141: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 144: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // 147: aload 4
      // 149: getfield com/schnurritv/sexmod/bs.R I
      // 14c: i2f
      // 14d: fconst_1
      // 14e: fconst_0
      // 14f: fconst_0
      // 150: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 153: goto 166
      // 156: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: aload 4
      // 15c: getfield com/schnurritv/sexmod/bs.M I
      // 15f: i2f
      // 160: fconst_1
      // 161: fconst_0
      // 162: fconst_0
      // 163: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 166: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 169: invokevirtual net/minecraft/client/Minecraft.func_175597_ag ()Lnet/minecraft/client/renderer/ItemRenderer;
      // 16c: aload 0
      // 16d: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 170: aload 6
      // 172: getstatic net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType.THIRD_PERSON_RIGHT_HAND Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;
      // 175: invokevirtual net/minecraft/client/renderer/ItemRenderer.func_178099_a (Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V
      // 178: aload 0
      // 179: aload 0
      // 17a: aload 0
      // 17b: getfield com/schnurritv/sexmod/bW.g Lcom/schnurritv/sexmod/bi;
      // 17e: invokevirtual com/schnurritv/sexmod/bW.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
      // 181: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 184: checkcast net/minecraft/util/ResourceLocation
      // 187: invokevirtual com/schnurritv/sexmod/bW.func_110776_a (Lnet/minecraft/util/ResourceLocation;)V
      // 18a: aload 1
      // 18b: bipush 7
      // 18d: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l Lnet/minecraft/client/renderer/vertex/VertexFormat;
      // 190: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
      // 193: sipush 2896
      // 196: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 199: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 19c: return
      // try (0 -> 4): 4 java/lang/IllegalStateException
      // try (6 -> 11): 11 java/lang/IllegalStateException
      // try (27 -> 34): 35 java/lang/IllegalStateException
      // try (60 -> 63): 63 java/lang/IllegalStateException
      // try (65 -> 74): 75 java/lang/IllegalStateException
      // try (70 -> 98): 99 java/lang/IllegalStateException
      // try (101 -> 121): 121 java/lang/IllegalStateException
      // try (123 -> 130): 131 java/lang/IllegalStateException
      // try (127 -> 151): 151 java/lang/IllegalStateException
   }

   RayTraceResult a(Vec3d param1, Vec3d param2, World param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 004: invokestatic java/lang/Double.isNaN (D)Z
      // 007: ifne 02c
      // 00a: aload 1
      // 00b: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 00e: invokestatic java/lang/Double.isNaN (D)Z
      // 011: ifne 02c
      // 014: goto 01b
      // 017: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 1
      // 01c: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 01f: invokestatic java/lang/Double.isNaN (D)Z
      // 022: ifeq 032
      // 025: goto 02c
      // 028: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: aconst_null
      // 02d: areturn
      // 02e: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: aload 2
      // 033: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 036: invokestatic java/lang/Double.isNaN (D)Z
      // 039: ifne 05e
      // 03c: aload 2
      // 03d: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 040: invokestatic java/lang/Double.isNaN (D)Z
      // 043: ifne 05e
      // 046: goto 04d
      // 049: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: aload 2
      // 04e: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 051: invokestatic java/lang/Double.isNaN (D)Z
      // 054: ifeq 064
      // 057: goto 05e
      // 05a: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aconst_null
      // 05f: areturn
      // 060: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: aload 2
      // 065: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 068: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
      // 06b: istore 4
      // 06d: aload 2
      // 06e: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 071: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
      // 074: istore 5
      // 076: aload 2
      // 077: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 07a: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
      // 07d: istore 6
      // 07f: aload 1
      // 080: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 083: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
      // 086: istore 7
      // 088: aload 1
      // 089: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 08c: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
      // 08f: istore 8
      // 091: aload 1
      // 092: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 095: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
      // 098: istore 9
      // 09a: new net/minecraft/util/math/BlockPos
      // 09d: dup
      // 09e: iload 7
      // 0a0: iload 8
      // 0a2: iload 9
      // 0a4: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
      // 0a7: astore 10
      // 0a9: aload 3
      // 0aa: aload 10
      // 0ac: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 0af: astore 11
      // 0b1: aload 11
      // 0b3: aload 3
      // 0b4: aload 10
      // 0b6: invokeinterface net/minecraft/block/state/IBlockState.func_185890_d (Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB; 3
      // 0bb: getstatic net/minecraft/block/Block.field_185506_k Lnet/minecraft/util/math/AxisAlignedBB;
      // 0be: if_acmpeq 0e9
      // 0c1: aload 11
      // 0c3: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 0c8: invokevirtual net/minecraft/block/Block.func_180664_k ()Lnet/minecraft/util/BlockRenderLayer;
      // 0cb: getstatic net/minecraft/util/BlockRenderLayer.SOLID Lnet/minecraft/util/BlockRenderLayer;
      // 0ce: if_acmpne 0e9
      // 0d1: goto 0d8
      // 0d4: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: aload 11
      // 0da: aload 3
      // 0db: aload 10
      // 0dd: aload 1
      // 0de: aload 2
      // 0df: invokeinterface net/minecraft/block/state/IBlockState.func_185910_a (Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult; 5
      // 0e4: areturn
      // 0e5: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: sipush 200
      // 0ec: istore 12
      // 0ee: iload 12
      // 0f0: iinc 12 -1
      // 0f3: iflt 3f2
      // 0f6: aload 1
      // 0f7: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 0fa: invokestatic java/lang/Double.isNaN (D)Z
      // 0fd: ifne 129
      // 100: goto 107
      // 103: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: aload 1
      // 108: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 10b: invokestatic java/lang/Double.isNaN (D)Z
      // 10e: ifne 129
      // 111: goto 118
      // 114: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: aload 1
      // 119: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 11c: invokestatic java/lang/Double.isNaN (D)Z
      // 11f: ifeq 12f
      // 122: goto 129
      // 125: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: aconst_null
      // 12a: areturn
      // 12b: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: iload 7
      // 131: iload 4
      // 133: if_icmpne 158
      // 136: iload 8
      // 138: iload 5
      // 13a: if_icmpne 158
      // 13d: goto 144
      // 140: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: iload 9
      // 146: iload 6
      // 148: if_icmpne 158
      // 14b: goto 152
      // 14e: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: aconst_null
      // 153: areturn
      // 154: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157: athrow
      // 158: bipush 1
      // 159: istore 13
      // 15b: bipush 1
      // 15c: istore 14
      // 15e: bipush 1
      // 15f: istore 15
      // 161: ldc2_w 999.0
      // 164: dstore 16
      // 166: ldc2_w 999.0
      // 169: dstore 18
      // 16b: ldc2_w 999.0
      // 16e: dstore 20
      // 170: iload 4
      // 172: iload 7
      // 174: if_icmple 181
      // 177: iload 7
      // 179: i2d
      // 17a: dconst_1
      // 17b: dadd
      // 17c: dstore 16
      // 17e: goto 195
      // 181: iload 4
      // 183: iload 7
      // 185: if_icmpge 192
      // 188: iload 7
      // 18a: i2d
      // 18b: dconst_0
      // 18c: dadd
      // 18d: dstore 16
      // 18f: goto 195
      // 192: bipush 0
      // 193: istore 13
      // 195: iload 5
      // 197: iload 8
      // 199: if_icmple 1a6
      // 19c: iload 8
      // 19e: i2d
      // 19f: dconst_1
      // 1a0: dadd
      // 1a1: dstore 18
      // 1a3: goto 1ba
      // 1a6: iload 5
      // 1a8: iload 8
      // 1aa: if_icmpge 1b7
      // 1ad: iload 8
      // 1af: i2d
      // 1b0: dconst_0
      // 1b1: dadd
      // 1b2: dstore 18
      // 1b4: goto 1ba
      // 1b7: bipush 0
      // 1b8: istore 14
      // 1ba: iload 6
      // 1bc: iload 9
      // 1be: if_icmple 1cb
      // 1c1: iload 9
      // 1c3: i2d
      // 1c4: dconst_1
      // 1c5: dadd
      // 1c6: dstore 20
      // 1c8: goto 1df
      // 1cb: iload 6
      // 1cd: iload 9
      // 1cf: if_icmpge 1dc
      // 1d2: iload 9
      // 1d4: i2d
      // 1d5: dconst_0
      // 1d6: dadd
      // 1d7: dstore 20
      // 1d9: goto 1df
      // 1dc: bipush 0
      // 1dd: istore 15
      // 1df: ldc2_w 999.0
      // 1e2: dstore 22
      // 1e4: ldc2_w 999.0
      // 1e7: dstore 24
      // 1e9: ldc2_w 999.0
      // 1ec: dstore 26
      // 1ee: aload 2
      // 1ef: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 1f2: aload 1
      // 1f3: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 1f6: dsub
      // 1f7: dstore 28
      // 1f9: aload 2
      // 1fa: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 1fd: aload 1
      // 1fe: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 201: dsub
      // 202: dstore 30
      // 204: aload 2
      // 205: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 208: aload 1
      // 209: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 20c: dsub
      // 20d: dstore 32
      // 20f: iload 13
      // 211: ifeq 220
      // 214: dload 16
      // 216: aload 1
      // 217: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 21a: dsub
      // 21b: dload 28
      // 21d: ddiv
      // 21e: dstore 22
      // 220: iload 14
      // 222: ifeq 231
      // 225: dload 18
      // 227: aload 1
      // 228: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 22b: dsub
      // 22c: dload 30
      // 22e: ddiv
      // 22f: dstore 24
      // 231: iload 15
      // 233: ifeq 242
      // 236: dload 20
      // 238: aload 1
      // 239: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 23c: dsub
      // 23d: dload 32
      // 23f: ddiv
      // 240: dstore 26
      // 242: dload 22
      // 244: ldc2_w -0.0
      // 247: dcmpl
      // 248: ifne 250
      // 24b: ldc2_w -1.0E-4
      // 24e: dstore 22
      // 250: dload 24
      // 252: ldc2_w -0.0
      // 255: dcmpl
      // 256: ifne 25e
      // 259: ldc2_w -1.0E-4
      // 25c: dstore 24
      // 25e: dload 26
      // 260: ldc2_w -0.0
      // 263: dcmpl
      // 264: ifne 26c
      // 267: ldc2_w -1.0E-4
      // 26a: dstore 26
      // 26c: dload 22
      // 26e: dload 24
      // 270: dcmpg
      // 271: ifge 2c1
      // 274: dload 22
      // 276: dload 26
      // 278: dcmpg
      // 279: ifge 2c1
      // 27c: goto 283
      // 27f: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 282: athrow
      // 283: iload 4
      // 285: iload 7
      // 287: if_icmple 29b
      // 28a: goto 291
      // 28d: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 290: athrow
      // 291: getstatic net/minecraft/util/EnumFacing.WEST Lnet/minecraft/util/EnumFacing;
      // 294: goto 29e
      // 297: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29a: athrow
      // 29b: getstatic net/minecraft/util/EnumFacing.EAST Lnet/minecraft/util/EnumFacing;
      // 29e: astore 34
      // 2a0: new net/minecraft/util/math/Vec3d
      // 2a3: dup
      // 2a4: dload 16
      // 2a6: aload 1
      // 2a7: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 2aa: dload 30
      // 2ac: dload 22
      // 2ae: dmul
      // 2af: dadd
      // 2b0: aload 1
      // 2b1: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 2b4: dload 32
      // 2b6: dload 22
      // 2b8: dmul
      // 2b9: dadd
      // 2ba: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 2bd: astore 1
      // 2be: goto 33b
      // 2c1: dload 24
      // 2c3: dload 26
      // 2c5: dcmpg
      // 2c6: ifge 307
      // 2c9: iload 5
      // 2cb: iload 8
      // 2cd: if_icmple 2e1
      // 2d0: goto 2d7
      // 2d3: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d6: athrow
      // 2d7: getstatic net/minecraft/util/EnumFacing.DOWN Lnet/minecraft/util/EnumFacing;
      // 2da: goto 2e4
      // 2dd: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e0: athrow
      // 2e1: getstatic net/minecraft/util/EnumFacing.UP Lnet/minecraft/util/EnumFacing;
      // 2e4: astore 34
      // 2e6: new net/minecraft/util/math/Vec3d
      // 2e9: dup
      // 2ea: aload 1
      // 2eb: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 2ee: dload 28
      // 2f0: dload 24
      // 2f2: dmul
      // 2f3: dadd
      // 2f4: dload 18
      // 2f6: aload 1
      // 2f7: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 2fa: dload 32
      // 2fc: dload 24
      // 2fe: dmul
      // 2ff: dadd
      // 300: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 303: astore 1
      // 304: goto 33b
      // 307: iload 6
      // 309: iload 9
      // 30b: if_icmple 318
      // 30e: getstatic net/minecraft/util/EnumFacing.NORTH Lnet/minecraft/util/EnumFacing;
      // 311: goto 31b
      // 314: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 317: athrow
      // 318: getstatic net/minecraft/util/EnumFacing.SOUTH Lnet/minecraft/util/EnumFacing;
      // 31b: astore 34
      // 31d: new net/minecraft/util/math/Vec3d
      // 320: dup
      // 321: aload 1
      // 322: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 325: dload 28
      // 327: dload 26
      // 329: dmul
      // 32a: dadd
      // 32b: aload 1
      // 32c: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 32f: dload 30
      // 331: dload 26
      // 333: dmul
      // 334: dadd
      // 335: dload 20
      // 337: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 33a: astore 1
      // 33b: aload 1
      // 33c: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 33f: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
      // 342: aload 34
      // 344: getstatic net/minecraft/util/EnumFacing.EAST Lnet/minecraft/util/EnumFacing;
      // 347: if_acmpne 352
      // 34a: bipush 1
      // 34b: goto 353
      // 34e: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 351: athrow
      // 352: bipush 0
      // 353: isub
      // 354: istore 7
      // 356: aload 1
      // 357: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 35a: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
      // 35d: aload 34
      // 35f: getstatic net/minecraft/util/EnumFacing.UP Lnet/minecraft/util/EnumFacing;
      // 362: if_acmpne 36d
      // 365: bipush 1
      // 366: goto 36e
      // 369: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36c: athrow
      // 36d: bipush 0
      // 36e: isub
      // 36f: istore 8
      // 371: aload 1
      // 372: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 375: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
      // 378: aload 34
      // 37a: getstatic net/minecraft/util/EnumFacing.SOUTH Lnet/minecraft/util/EnumFacing;
      // 37d: if_acmpne 388
      // 380: bipush 1
      // 381: goto 389
      // 384: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 387: athrow
      // 388: bipush 0
      // 389: isub
      // 38a: istore 9
      // 38c: new net/minecraft/util/math/BlockPos
      // 38f: dup
      // 390: iload 7
      // 392: iload 8
      // 394: iload 9
      // 396: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
      // 399: astore 10
      // 39b: aload 3
      // 39c: aload 10
      // 39e: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 3a1: astore 35
      // 3a3: aload 35
      // 3a5: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a ()Lnet/minecraft/block/material/Material; 1
      // 3aa: getstatic net/minecraft/block/material/Material.field_151567_E Lnet/minecraft/block/material/Material;
      // 3ad: if_acmpeq 3c7
      // 3b0: aload 35
      // 3b2: aload 3
      // 3b3: aload 10
      // 3b5: invokeinterface net/minecraft/block/state/IBlockState.func_185890_d (Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB; 3
      // 3ba: getstatic net/minecraft/block/Block.field_185506_k Lnet/minecraft/util/math/AxisAlignedBB;
      // 3bd: if_acmpeq 3ef
      // 3c0: goto 3c7
      // 3c3: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c6: athrow
      // 3c7: aload 35
      // 3c9: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 3ce: invokevirtual net/minecraft/block/Block.func_180664_k ()Lnet/minecraft/util/BlockRenderLayer;
      // 3d1: getstatic net/minecraft/util/BlockRenderLayer.SOLID Lnet/minecraft/util/BlockRenderLayer;
      // 3d4: if_acmpne 3ef
      // 3d7: goto 3de
      // 3da: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3dd: athrow
      // 3de: aload 35
      // 3e0: aload 3
      // 3e1: aload 10
      // 3e3: aload 1
      // 3e4: aload 2
      // 3e5: invokeinterface net/minecraft/block/state/IBlockState.func_185910_a (Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult; 5
      // 3ea: areturn
      // 3eb: invokestatic com/schnurritv/sexmod/bW.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ee: athrow
      // 3ef: goto 0ee
      // 3f2: aconst_null
      // 3f3: areturn
      // try (0 -> 8): 9 java/lang/IllegalStateException
      // try (4 -> 15): 16 java/lang/IllegalStateException
      // try (11 -> 20): 20 java/lang/IllegalStateException
      // try (22 -> 30): 31 java/lang/IllegalStateException
      // try (26 -> 37): 38 java/lang/IllegalStateException
      // try (33 -> 42): 42 java/lang/IllegalStateException
      // try (79 -> 90): 91 java/lang/IllegalStateException
      // try (85 -> 100): 100 java/lang/IllegalStateException
      // try (104 -> 111): 112 java/lang/IllegalStateException
      // try (107 -> 118): 119 java/lang/IllegalStateException
      // try (114 -> 125): 126 java/lang/IllegalStateException
      // try (121 -> 130): 130 java/lang/IllegalStateException
      // try (132 -> 138): 139 java/lang/IllegalStateException
      // try (135 -> 144): 145 java/lang/IllegalStateException
      // try (141 -> 149): 149 java/lang/IllegalStateException
      // try (292 -> 300): 301 java/lang/IllegalStateException
      // try (296 -> 306): 307 java/lang/IllegalStateException
      // try (303 -> 311): 311 java/lang/IllegalStateException
      // try (333 -> 340): 341 java/lang/IllegalStateException
      // try (337 -> 345): 345 java/lang/IllegalStateException
      // try (367 -> 372): 372 java/lang/IllegalStateException
      // try (393 -> 401): 401 java/lang/IllegalStateException
      // try (406 -> 414): 414 java/lang/IllegalStateException
      // try (419 -> 427): 427 java/lang/IllegalStateException
      // try (443 -> 453): 454 java/lang/IllegalStateException
      // try (447 -> 461): 462 java/lang/IllegalStateException
      // try (456 -> 471): 471 java/lang/IllegalStateException
   }

   private static Exception b(Exception var0) {
      return var0;
   }
}
