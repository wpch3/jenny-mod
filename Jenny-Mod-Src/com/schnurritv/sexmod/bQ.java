package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.Collection;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec2f;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bq extends bM {
   static final float O = 8.0F;
   static final float F = 1.68F;
   static final float M = 5.0F;
   static Collection<bq> E = new ArrayList<>();
   double K = 0.0;
   double N = 0.0;
   double L = 0.0;
   double I = 0.0;
   float P = 0.0F;
   float Q = 0.0F;
   float G;
   float J;
   double H = 0.0;
   double R = 0.0;

   public bq(RenderManager var1, AnimatedGeoModel var2) {
      super(var1, var2);
      E.add(this);
   }

   @Override
   protected void a() {
      GlStateManager.func_179109_b(0.0F, -1.1F, 0.0F);
      GlStateManager.func_179152_a(0.7F, 0.7F, 0.7F);
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

      try {
         if (!var1) {
            GlStateManager.func_179114_b(20.0F, 1.0F, 0.0F, 0.0F);
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      GlStateManager.func_179137_b(0.0, 0.05, 0.0);
   }

   @Override
   protected void a(boolean var1) {
      try {
         super.a(var1);
         if (var1) {
            GlStateManager.func_179137_b(0.15, 0.0, 0.0);
            return;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      GlStateManager.func_179137_b(-0.05, 0.0, 0.0);
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
      // 07: ifeq 2e
      // 0a: iload 2
      // 0b: ifne 2e
      // 0e: goto 15
      // 11: invokestatic com/schnurritv/sexmod/bq.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: ldc2_w -0.025
      // 18: ldc2_w -0.1
      // 1b: ldc2_w -0.1
      // 1e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // 21: ldc 10.0
      // 23: fconst_1
      // 24: fconst_0
      // 25: fconst_0
      // 26: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 29: return
      // 2a: invokestatic com/schnurritv/sexmod/bq.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d: athrow
      // 2e: iload 1
      // 2f: ifne 56
      // 32: iload 2
      // 33: ifne 56
      // 36: goto 3d
      // 39: invokestatic com/schnurritv/sexmod/bq.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3c: athrow
      // 3d: ldc2_w -0.05
      // 40: ldc2_w -0.125
      // 43: ldc2_w 0.125
      // 46: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
      // 49: ldc 50.0
      // 4b: fconst_1
      // 4c: fconst_0
      // 4d: fconst_0
      // 4e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 51: return
      // 52: invokestatic com/schnurritv/sexmod/bq.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: return
      // try (0 -> 8): 9 java/lang/RuntimeException
      // try (6 -> 21): 21 java/lang/RuntimeException
      // try (23 -> 27): 28 java/lang/RuntimeException
      // try (25 -> 40): 40 java/lang/RuntimeException
   }

   @Override
   protected void a(String var1, GeoBone var2) {
      try {
         if ((Boolean)this.A.func_184212_Q().func_187225_a(bi.z)) {
            return;
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      try {
         if ("tail".equals(var1)) {
            this.a(var2, 0.0F, 0.0F, 1.0F);
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      try {
         if ("body".equals(var1)) {
            this.a(var2);
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      try {
         if (this.A.D() == bj.BOW) {
            return;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      try {
         if ("armL".equals(var1)) {
            this.a(var2, 0.0F, (float) (-Math.PI / 9), 0.15F);
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      try {
         if (this.A.D() == bj.ATTACK) {
            return;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      try {
         if ("armR".equals(var1)) {
            this.a(var2, 0.0F, (float) (Math.PI / 9), 0.15F);
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }
   }

   void a(GeoBone var1, float var2, float var3, float var4) {
      double var5 = this.K - this.L;
      double var7 = this.N - this.I;
      double var9 = (Math.PI / 180.0) * this.A.field_70177_z;
      Vec2f var11 = new Vec2f((float)(var5 * Math.cos(var9) + var7 * Math.sin(var9)), (float)(-var5 * Math.sin(var9) + var7 * Math.cos(var9)));
      this.G = var11.field_189983_j * -8.0F;
      this.J = var11.field_189982_i * 8.0F;
      this.G = b1.b(this.G, -1.68F, 1.68F);
      this.J = b1.b(this.J, -1.68F, 1.68F);
      this.G = b1.a(this.P, this.G, this.B);
      this.J = b1.a(this.Q, this.J, this.B);
      var1.setRotationX(var2 + this.G * var4);
      var1.setRotationZ(var3 + this.J * var4);
   }

   void a(GeoBone var1) {
      double var2 = this.K - this.L;
      double var4 = this.N - this.I;

      try {
         this.R = (Math.abs(var2) + Math.abs(var4)) * 5.0;
         this.R = b1.b((float)this.R, 0.0F, 1.0F);
         var1.setPositionY((float)b1.c(5.0, 0.0, b1.a(this.H, this.R, this.B)));
         if (this.A instanceof br) {
            ((br)this.A).ao = (float)b1.c(0.3F, 0.0, b1.a(this.H, this.R, this.B));
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }
   }

   void b() {
      try {
         if (this.A == null) {
            return;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      try {
         this.P = this.G;
         this.Q = this.J;
         this.H = this.R;
         if (this.A.q() == null) {
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      EntityPlayer var1 = this.g.field_70170_p.func_152378_a(this.A.q());

      try {
         if (var1 == null) {
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      this.L = this.K;
      this.I = this.N;
      this.K = var1.field_70165_t;
      this.N = var1.field_70161_v;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   @EventBusSubscriber
   public static class b {
      @SubscribeEvent
      public void a(ClientTickEvent var1) {
         for (bq var3 : bq.E) {
            var3.b();
         }
      }
   }
}
