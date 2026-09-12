package com.schnurritv.sexmod;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bo extends bM {
   public bo(RenderManager var1, AnimatedGeoModel var2) {
      super(var1, var2);
   }

   @Override
   protected void a(boolean var1, ItemStack var2) {
      float var10000;
      label16: {
         try {
            if (var1) {
               var10000 = 290.0F;
               break label16;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         var10000 = 90.0F;
      }

      GlStateManager.func_179114_b(var10000, 1.0F, 0.0F, 0.0F);
   }

   @Override
   protected void a() {
      GlStateManager.func_179109_b(0.0F, -0.6F, 0.0F);
      GlStateManager.func_179152_a(0.4F, 0.4F, 0.4F);
   }

   @Override
   protected void a(boolean var1) {
      try {
         super.a(var1);
         if (var1) {
            GlStateManager.func_179137_b(0.1, 0.0, 0.0);
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }
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
      // 00: iload 1
      // 01: ifeq 3e
      // 04: ldc 180.0
      // 06: fconst_0
      // 07: fconst_1
      // 08: fconst_0
      // 09: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 0c: ldc 90.0
      // 0e: fconst_1
      // 0f: fconst_0
      // 10: fconst_0
      // 11: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 14: fconst_0
      // 15: ldc -0.14
      // 17: ldc -0.17
      // 19: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 1c: iload 2
      // 1d: ifeq 60
      // 20: goto 27
      // 23: invokestatic com/schnurritv/sexmod/bo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26: athrow
      // 27: ldc 90.0
      // 29: fconst_0
      // 2a: fconst_0
      // 2b: fconst_1
      // 2c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 2f: ldc2_w 0.067
      // 32: dconst_0
      // 33: dconst_0
      // 34: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // 37: goto 60
      // 3a: invokestatic com/schnurritv/sexmod/bo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: iload 2
      // 3f: ifeq 60
      // 42: ldc -90.0
      // 44: fconst_1
      // 45: fconst_0
      // 46: fconst_0
      // 47: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 4a: ldc -90.0
      // 4c: fconst_0
      // 4d: fconst_0
      // 4e: fconst_1
      // 4f: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 52: fconst_0
      // 53: ldc 0.165
      // 55: fconst_0
      // 56: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 59: goto 60
      // 5c: invokestatic com/schnurritv/sexmod/bo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5f: athrow
      // 60: return
      // try (0 -> 18): 19 java/lang/RuntimeException
      // try (2 -> 31): 31 java/lang/RuntimeException
      // try (33 -> 49): 50 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
