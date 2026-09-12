package com.schnurritv.sexmod;

import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class be extends bW {
   public be(RenderManager var1, AnimatedGeoModel var2, double var3) {
      super(var1, var2, var3);
   }

   @Override
   public void a(GeoModel param1, bi param2, float param3, float param4, float param5, float param6, float param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 2
      // 01: checkcast com/schnurritv/sexmod/bO
      // 04: astore 8
      // 06: aload 2
      // 07: invokevirtual com/schnurritv/sexmod/bi.D ()Lcom/schnurritv/sexmod/bj;
      // 0a: getstatic com/schnurritv/sexmod/bj.NULL Lcom/schnurritv/sexmod/bj;
      // 0d: if_acmpne 23
      // 10: aload 2
      // 11: getfield com/schnurritv/sexmod/bi.j Z
      // 14: ifne 23
      // 17: goto 1e
      // 1a: invokestatic com/schnurritv/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: return
      // 1f: invokestatic com/schnurritv/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: aload 8
      // 25: aload 8
      // 27: getfield com/schnurritv/sexmod/bO.P F
      // 2a: fconst_1
      // 2b: fcmpl
      // 2c: ifne 3b
      // 2f: aload 8
      // 31: getfield com/schnurritv/sexmod/bO.P F
      // 34: goto 43
      // 37: invokestatic com/schnurritv/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3a: athrow
      // 3b: aload 8
      // 3d: getfield com/schnurritv/sexmod/bO.P F
      // 40: ldc 0.01
      // 42: fsub
      // 43: putfield com/schnurritv/sexmod/bO.P F
      // 46: aload 8
      // 48: getfield com/schnurritv/sexmod/bO.P F
      // 4b: fstore 7
      // 4d: fload 7
      // 4f: fload 7
      // 51: fload 7
      // 53: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
      // 56: fconst_0
      // 57: fload 7
      // 59: fconst_1
      // 5a: fcmpl
      // 5b: ifne 66
      // 5e: fconst_0
      // 5f: goto 6e
      // 62: invokestatic com/schnurritv/sexmod/be.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 65: athrow
      // 66: ldc 3.0
      // 68: fload 7
      // 6a: ldc 3.0
      // 6c: fmul
      // 6d: fsub
      // 6e: fconst_0
      // 6f: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 72: aload 0
      // 73: aload 1
      // 74: aload 2
      // 75: fload 3
      // 76: fload 4
      // 78: fload 5
      // 7a: fload 6
      // 7c: fload 7
      // 7e: invokespecial com/schnurritv/sexmod/bW.a (Lsoftware/bernie/geckolib3/geo/render/built/GeoModel;Lcom/schnurritv/sexmod/bi;FFFFF)V
      // 81: return
      // try (3 -> 10): 11 java/lang/RuntimeException
      // try (7 -> 14): 14 java/lang/RuntimeException
      // try (16 -> 25): 25 java/lang/RuntimeException
      // try (35 -> 46): 46 java/lang/RuntimeException
   }

   @Override
   protected void a(double var1, double var3, double var5) {
      try {
         if (this.g.D() == bj.NULL) {
            return;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      try {
         if (this.g.j) {
            return;
         }
      } catch (RuntimeException var10) {
         throw a(var10);
      }

      try {
         if (this.g.D().hideNameTag) {
            return;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      try {
         if (this.n.func_175598_ae().field_78734_h == null) {
            return;
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      this.func_147906_a(this.g, this.g.P(), var1, var3 + this.g.s(), var5, 300);
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
