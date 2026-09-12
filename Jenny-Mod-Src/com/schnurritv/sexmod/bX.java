package com.schnurritv.sexmod;

import java.util.HashSet;
import javax.vecmath.Vector3f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bx extends bM {
   Vector3f J = new Vector3f(0.0F, 0.0F, 0.0F);
   Vector3f I = new Vector3f(0.0F, 0.0F, 0.0F);
   Vector3f F = new Vector3f(0.0F, 0.0F, 0.0F);
   Vector3f K = new Vector3f(0.0F, 0.0F, 0.0F);
   Vector3f H = new Vector3f(0.0F, 0.0F, 0.0F);
   Vector3f G = new Vector3f(0.0F, 0.0F, 0.0F);
   Vector3f E = new Vector3f(0.0F, 0.0F, 0.0F);

   public bx(RenderManager var1, AnimatedGeoModel var2) {
      super(var1, var2);
   }

   @Override
   protected void a() {
      GlStateManager.func_179109_b(0.0F, -1.25F, 0.0F);
      GlStateManager.func_179152_a(0.8F, 0.8F, 0.8F);
   }

   @Override
   protected void a(String var1, GeoBone var2) {
      try {
         if ("slime".equals(var1)) {
            this.F = new Vector3f(var2.getRotationX(), var2.getRotationY(), var2.getRotationZ());
            this.J = new Vector3f(var2.getScaleX(), var2.getScaleY(), var2.getScaleZ());
            this.I = new Vector3f(var2.getPositionX(), var2.getPositionY(), var2.getPositionZ());
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      try {
         if ("upperBody".equals(var1)) {
            this.G = new Vector3f(var2.getRotationX(), var2.getRotationY(), var2.getRotationZ());
         }
      } catch (RuntimeException var11) {
         throw a(var11);
      }

      try {
         if ("torso".equals(var1)) {
            this.K = new Vector3f(var2.getRotationX(), var2.getRotationY(), var2.getRotationZ());
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      try {
         if ("head".equals(var1)) {
            this.E = new Vector3f(var2.getRotationX(), var2.getRotationY(), var2.getRotationZ());
         }
      } catch (RuntimeException var10) {
         throw a(var10);
      }

      try {
         if ("boobs".equals(var1)) {
            this.H = new Vector3f(var2.getRotationX(), var2.getRotationY(), var2.getRotationZ());
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      try {
         if ("figure".equals(var1)) {
            var2.setRotationX(this.F.x);
            var2.setRotationY(this.F.y);
            var2.setRotationZ(this.F.z);
            var2.setScaleX(this.J.x);
            var2.setScaleY(this.J.y);
            var2.setScaleZ(this.J.z);
            var2.setPositionX(this.I.x);
            var2.setPositionY(this.I.y);
            var2.setPositionZ(this.I.z);
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      try {
         if ("dress".equals(var1)) {
            var2.setRotationX(this.G.x);
            var2.setRotationY(this.G.y);
            var2.setRotationZ(this.G.z);
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      try {
         if ("hat".equals(var1)) {
            var2.setRotationX(this.E.x);
            var2.setRotationY(this.E.y);
            var2.setRotationZ(this.E.z);
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      try {
         if ("boobsSlime".equals(var1)) {
            var2.setRotationX(this.H.x);
            var2.setRotationY(this.H.y);
            var2.setRotationZ(this.H.z);
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }
   }

   @Override
   protected void a(boolean var1) {
      try {
         super.a(var1);
         if (var1) {
            GlStateManager.func_179109_b(0.15F, 0.0F, 0.0F);
            return;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      GlStateManager.func_179137_b(-0.02, 0.0, 0.0);
      GlStateManager.func_179114_b(90.0F, 1.0F, 0.0F, 0.0F);
   }

   @Override
   protected HashSet<String> b() {
      HashSet var1 = super.b();
      var1.add("figure");
      return var1;
   }

   @Override
   protected void a(boolean param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: iload 2
      // 03: invokespecial com/schnurritv/sexmod/bM.a (ZZ)V
      // 06: iload 1
      // 07: ifeq 24
      // 0a: iload 2
      // 0b: ifne 24
      // 0e: goto 15
      // 11: invokestatic com/schnurritv/sexmod/bx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: ldc2_w -0.025
      // 18: ldc2_w -0.025
      // 1b: dconst_0
      // 1c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // 1f: return
      // 20: invokestatic com/schnurritv/sexmod/bx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: iload 1
      // 25: ifne 40
      // 28: iload 2
      // 29: ifeq 40
      // 2c: goto 33
      // 2f: invokestatic com/schnurritv/sexmod/bx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: ldc 120.0
      // 35: fconst_0
      // 36: fconst_1
      // 37: fconst_0
      // 38: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 3b: return
      // 3c: invokestatic com/schnurritv/sexmod/bx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3f: athrow
      // 40: iload 1
      // 41: ifne 68
      // 44: iload 2
      // 45: ifne 68
      // 48: goto 4f
      // 4b: invokestatic com/schnurritv/sexmod/bx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: dconst_0
      // 50: ldc2_w 0.4
      // 53: ldc2_w -0.1
      // 56: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // 59: ldc -30.0
      // 5b: fconst_1
      // 5c: fconst_0
      // 5d: fconst_0
      // 5e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 61: goto 68
      // 64: invokestatic com/schnurritv/sexmod/bx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 67: athrow
      // 68: return
      // try (0 -> 8): 9 java/lang/RuntimeException
      // try (6 -> 16): 16 java/lang/RuntimeException
      // try (18 -> 22): 23 java/lang/RuntimeException
      // try (20 -> 31): 31 java/lang/RuntimeException
      // try (33 -> 37): 38 java/lang/RuntimeException
      // try (35 -> 49): 50 java/lang/RuntimeException
   }

   @Override
   protected void a(boolean var1, ItemStack var2) {
      try {
         super.a(var1, var2);
         switch (var2.func_77973_b().func_77661_b(var2)) {
            case BLOCK:
            case BOW:
               return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      float var10000;
      label21: {
         try {
            if (var1) {
               var10000 = 30.0F;
               break label21;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         var10000 = 135.0F;
      }

      GlStateManager.func_179114_b(var10000, 1.0F, 0.0F, 0.0F);
      GlStateManager.func_179137_b(0.0, 0.05, -0.05);
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
