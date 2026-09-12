package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.vecmath.Vector2f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4d;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class bS extends GeoItemRenderer<m> {
   private static final ResourceLocation b = new ResourceLocation("textures/entity/endercrystal/endercrystal.png");
   private final b k = new b();
   static final float j = 10.0F;
   static final float p = 1.5F;
   static final float n = 0.175F;
   static final float d = 0.1F;
   static final float f = 0.04F;
   static final float o = 8.0F;
   static final float h = 6.0F;
   static final float l = 1.3F;
   static final Vector2f[] a = new Vector2f[]{
      new Vector2f(1.0F, 0.0F),
      new Vector2f(0.0F, 1.0F),
      new Vector2f(0.0F, 0.0F),
      new Vector2f(0.5F, 0.5F),
      new Vector2f(0.75F, 0.25F),
      new Vector2f(0.25F, 0.75F),
      new Vector2f(0.25F, 0.75F)
   };
   static boolean i = false;
   Minecraft g;
   Vector2f c;
   double e = 0.0;
   EntityPlayer r;
   ItemStack m;
   static HashMap<ItemStack, Vector3f> q = new HashMap<>();

   public bS() {
      super(new y());
      this.g = Minecraft.func_71410_x();
   }

   public static boolean b() {
      return i;
   }

   public static void a() {
      boolean var10000;
      label16: {
         try {
            if (!i) {
               var10000 = true;
               break label16;
            }
         } catch (RuntimeException var0) {
            throw a(var0);
         }

         var10000 = false;
      }

      i = var10000;
   }

   public void a(m var1, ItemStack var2) {
      EntityPlayer var3 = null;

      for (EntityPlayer var5 : this.g.field_71441_e.field_73010_i) {
         if (var5.field_71071_by.field_70462_a.contains(var2)) {
            var3 = var5;
            break;
         }

         if (var5.field_71071_by.field_184439_c.contains(var2)) {
            var3 = var5;
            break;
         }
      }

      if (var3 != null) {
         double var11 = var3.field_70165_t - var3.field_70142_S;
         double var6 = var3.field_70161_v - var3.field_70136_U;
         double var8 = (Math.PI / 180.0) * var3.field_70177_z;
         this.c = new Vector2f((float)(var11 * Math.cos(var8) + var6 * Math.sin(var8)), (float)(-var11 * Math.sin(var8) + var6 * Math.cos(var8)));
      } else {
         this.c = new Vector2f(0.0F, 0.0F);
      }

      try {
         if (!Minecraft.func_71410_x().func_147113_T()) {
            this.e = Minecraft.func_71410_x().field_71439_g.field_70173_aa + this.g.func_184121_ak();
         }
      } catch (RuntimeException var10) {
         throw a(var10);
      }

      this.m = var2;
      this.r = var3;
      super.render(var1, var2);
   }

   @Override
   public void renderRecursively(BufferBuilder var1, GeoBone var2, float var3, float var4, float var5, float var6) {
      if ("staff".equals(var2.getName())) {
         GlStateManager.func_179094_E();
         Tessellator.func_178181_a().func_78381_a();
         Q.a(IGeoRenderer.MATRIX_STACK, var2);
         GlStateManager.func_179137_b(0.0, 1.5 + 0.001 * Math.sin(0.005 * this.e) + 0.001, 0.0);
         Vector3f var7 = q.get(this.m);
         GlStateManager.func_179139_a(this.c(), this.c(), this.c());
         if (var7 == null) {
            var7 = new Vector3f(0.0F, 0.0F, 0.0F);
         }

         Vector3f var10000;
         Vector3f var10001;
         Vector3f var10002;
         float var10003;
         float var10004;
         label25: {
            try {
               var10000 = var7;
               var10001 = new Vector3f;
               var10002 = var10001;
               var10003 = this.c.x;
               if (this.r == null) {
                  var10004 = 0.0F;
                  break label25;
               }
            } catch (RuntimeException var8) {
               throw a(var8);
            }

            var10004 = (float)(this.r.field_70163_u - this.r.field_70137_T);
         }

         var10002./* $VF: Unable to resugar constructor */<init>(var10003, var10004, this.c.y);
         var10000.add(var10001);
         GlStateManager.func_179114_b(var7.z * 10.0F, 1.0F, 0.0F, 0.0F);
         GlStateManager.func_179114_b(var7.x * 10.0F, 0.0F, 1.0F, 0.0F);
         GlStateManager.func_179114_b(-var7.y * 10.0F, 0.0F, 0.0F, 1.0F);
         GlStateManager.func_179114_b((float)(this.e * 0.1F), 1.0F, 1.0F, 1.0F);
         q.put(this.m, var7);
         this.g.func_110434_K().func_110577_a(b);
         this.k.func_78088_a(Minecraft.func_71410_x().field_71439_g, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GlStateManager.func_179121_F();
         if (this.r != null) {
            this.d();
         }

         this.g.func_110434_K().func_110577_a(new y().b(null));
         var1.func_181668_a(7, DefaultVertexFormats.field_181712_l);
      }

      super.renderRecursively(var1, var2, var3, var4, var5, var6);
   }

   void d() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 1
      // 08: new java/util/ArrayList
      // 0b: dup
      // 0c: invokespecial java/util/ArrayList.<init> ()V
      // 0f: astore 2
      // 10: getstatic com/schnurritv/sexmod/cA.aM Ljava/util/List;
      // 13: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 18: astore 3
      // 19: aload 3
      // 1a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f: ifeq 5d
      // 22: aload 3
      // 23: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 28: checkcast javax/vecmath/Vector4d
      // 2b: astore 4
      // 2d: aload 1
      // 2e: aload 4
      // 30: invokevirtual javax/vecmath/Vector4d.getW ()D
      // 33: d2i
      // 34: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 37: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3c: pop
      // 3d: aload 2
      // 3e: new net/minecraft/util/math/Vec3d
      // 41: dup
      // 42: aload 4
      // 44: invokevirtual javax/vecmath/Vector4d.getX ()D
      // 47: aload 4
      // 49: invokevirtual javax/vecmath/Vector4d.getY ()D
      // 4c: aload 4
      // 4e: invokevirtual javax/vecmath/Vector4d.getZ ()D
      // 51: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 54: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 59: pop
      // 5a: goto 19
      // 5d: aload 1
      // 5e: invokeinterface java/util/List.size ()I 1
      // 63: ifne 6b
      // 66: return
      // 67: invokestatic com/schnurritv/sexmod/bS.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6a: athrow
      // 6b: getstatic com/schnurritv/sexmod/bS.i Z
      // 6e: ifeq 7e
      // 71: aload 0
      // 72: aload 1
      // 73: aload 2
      // 74: invokevirtual com/schnurritv/sexmod/bS.a (Ljava/util/List;Ljava/util/List;)V
      // 77: goto 83
      // 7a: invokestatic com/schnurritv/sexmod/bS.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: aload 1
      // 80: invokevirtual com/schnurritv/sexmod/bS.a (Ljava/util/List;)V
      // 83: return
      // try (38 -> 42): 42 java/lang/RuntimeException
      // try (44 -> 51): 51 java/lang/RuntimeException
   }

   void a(List<Integer> var1, List<Vec3d> var2) {
      for (int var3 = 0; var3 < var1.size(); var3++) {
         float var4 = b1.a(this.r.field_70758_at, this.r.field_70759_as, this.g.func_184121_ak());
         float var5 = b1.a(this.r.field_70127_C, this.r.field_70125_A, this.g.func_184121_ak());
         Vec3d var6 = b1.a(
            new Vec3d(this.r.field_70169_q, this.r.field_70167_r + this.r.func_70047_e(), this.r.field_70166_s),
            this.r.func_174791_d().func_72441_c(0.0, this.r.func_70047_e(), 0.0),
            this.g.func_184121_ak()
         );
         Vec3d var7 = var6.func_178788_d((Vec3d)var2.get(var3));
         var7 = b1.a(var7, -var5, var4);
         double var8 = Math.abs(var7.field_72450_a) + Math.abs(var7.field_72449_c) + Math.abs(var7.field_72448_b);
         double var10 = -var7.field_72450_a / var8;
         double var12 = -var7.field_72448_b / var8;
         double var14 = var7.field_72449_c / var8;
         var10 = this.a(var10);
         var12 = this.a(var12);
         var14 = this.a(var14);
         var10 *= 1.3F;
         var12 *= 1.3F;
         var14 *= 1.3F;
         this.b((Integer)var1.get(var3), (float)var10, (float)var12, (float)var14);
      }
   }

   void a(List<Integer> var1) {
      float var2 = 1.0F / var1.size();
      float var3 = 0.0F;

      for (int var4 = 0; var4 < var1.size(); var4++) {
         var3 += var2;
         this.a((Integer)var1.get(var4), 1.0F - var3, 0.0F + var3, (float)b1.a(0.8F, 1.2F, (double)var4 / var1.size()));
      }
   }

   double a(double var1) {
      return var1 * Math.sqrt(1.0 - var1 * var1 / 2.0);
   }

   double c() {
      return 0.175F + 0.025 * Math.sin(0.005 * this.e) + 0.025;
   }

   void a(int var1, float var2, float var3, float var4) {
      this.a(new ItemStack(Blocks.field_150325_L, 1, var1), var2, var3, var4);
   }

   void b(int var1, float var2, float var3, float var4) {
      this.b(new ItemStack(Blocks.field_150325_L, 1, var1), var2, var3, var4);
   }

   void b(ItemStack var1, float var2, float var3, float var4) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179137_b(0.0, 1.5 + 0.001 * Math.sin(0.005 * this.e) + 0.001, 0.0);
      GlStateManager.func_179152_a(0.04F, 0.04F, 0.04F);
      GlStateManager.func_179109_b(var2 * 6.0F, var3 * 6.0F, var4 * 6.0F);
      this.g.func_175597_ag().func_178099_a(Minecraft.func_71410_x().field_71439_g, var1, TransformType.NONE);
      GlStateManager.func_179121_F();
   }

   void a(ItemStack var1, float var2, float var3, float var4) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179137_b(0.0, 1.5 + 0.001 * Math.sin(0.005 * this.e) + 0.001, 0.0);
      GlStateManager.func_179152_a(0.04F, 0.04F, 0.04F);
      GlStateManager.func_179114_b((float)(this.e * 8.0 * var4), 0.0F, var2, var3);
      GlStateManager.func_179109_b(6.0F, 0.0F, 0.0F);
      this.g.func_175597_ag().func_178099_a(Minecraft.func_71410_x().field_71439_g, var1, TransformType.NONE);
      GlStateManager.func_179121_F();
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
