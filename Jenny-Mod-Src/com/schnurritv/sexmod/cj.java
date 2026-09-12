package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class cj extends bg {
   public static final DataParameter<String> an = EntityDataManager.func_187226_a(cj.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(119);
   public static final DataParameter<BlockPos> aq = EntityDataManager.func_187226_a(cj.class, DataSerializers.field_187200_j)
      .func_187156_b()
      .func_187161_a(120);
   public static final DataParameter<String> ao = EntityDataManager.func_187226_a(cj.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(121);
   boolean ap = true;
   String al = null;
   String ar = null;
   BlockPos am = null;

   protected cj(World var1) {
      super(var1);
   }

   protected cj(World var1, UUID var2) {
      super(var1, var2);
   }

   protected void func_70088_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial com/schnurritv/sexmod/bg.func_70088_a ()V
      // 04: aload 0
      // 05: getfield com/schnurritv/sexmod/cj.field_70170_p Lnet/minecraft/world/World;
      // 08: getfield net/minecraft/world/World.field_72995_K Z
      // 0b: ifeq 24
      // 0e: aload 0
      // 0f: getfield com/schnurritv/sexmod/cj.field_70170_p Lnet/minecraft/world/World;
      // 12: instanceof com/b
      // 15: ifeq 24
      // 18: goto 1f
      // 1b: invokestatic com/schnurritv/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: return
      // 20: invokestatic com/schnurritv/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield com/schnurritv/sexmod/cj.D Lnet/minecraft/network/datasync/EntityDataManager;
      // 28: getstatic com/schnurritv/sexmod/cj.ao Lnet/minecraft/network/datasync/DataParameter;
      // 2b: aload 0
      // 2c: new java/lang/StringBuilder
      // 2f: dup
      // 30: invokespecial java/lang/StringBuilder.<init> ()V
      // 33: invokevirtual com/schnurritv/sexmod/cj.a (Ljava/lang/StringBuilder;)Ljava/lang/String;
      // 36: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187214_a (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
      // 39: return
      // try (0 -> 10): 11 java/lang/RuntimeException
      // try (6 -> 14): 14 java/lang/RuntimeException
   }

   protected abstract String a(StringBuilder var1);

   public static String[] a(bi var0) {
      return ((String)var0.func_184212_Q().func_187225_a(ao)).split("-");
   }

   public void func_70071_h_() {
      try {
         super.func_70071_h_();
         this.a();
         if (!this.ap) {
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      try {
         if (this.field_70170_p.field_72995_K) {
            this.b();
            this.ap = true;
            return;
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      EntityPlayer var1 = this.w();

      try {
         if (var1 == null) {
            return;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      String var2 = var1.getEntityData().func_74779_i("sexmod:GirlSpecific" + com.schnurritv.sexmod.k.a(this));

      try {
         this.ap = false;
         if (!"".equals(var2)) {
            this.c(e(var2));
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }
   }

   @Override
   void a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/cj.field_70170_p Lnet/minecraft/world/World;
      // 04: getfield net/minecraft/world/World.field_72995_K Z
      // 07: ifne 0f
      // 0a: return
      // 0b: invokestatic com/schnurritv/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: aload 0
      // 10: getfield com/schnurritv/sexmod/cj.D Lnet/minecraft/network/datasync/EntityDataManager;
      // 13: getstatic com/schnurritv/sexmod/cj.an Lnet/minecraft/network/datasync/DataParameter;
      // 16: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 19: checkcast java/lang/String
      // 1c: astore 1
      // 1d: aload 0
      // 1e: getfield com/schnurritv/sexmod/cj.D Lnet/minecraft/network/datasync/EntityDataManager;
      // 21: getstatic com/schnurritv/sexmod/cj.ao Lnet/minecraft/network/datasync/DataParameter;
      // 24: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 27: checkcast java/lang/String
      // 2a: astore 2
      // 2b: aload 0
      // 2c: getfield com/schnurritv/sexmod/cj.D Lnet/minecraft/network/datasync/EntityDataManager;
      // 2f: getstatic com/schnurritv/sexmod/cj.aq Lnet/minecraft/network/datasync/DataParameter;
      // 32: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 35: checkcast net/minecraft/util/math/BlockPos
      // 38: astore 3
      // 39: aload 0
      // 3a: getfield com/schnurritv/sexmod/cj.al Ljava/lang/String;
      // 3d: ifnonnull 54
      // 40: aload 0
      // 41: aload 1
      // 42: putfield com/schnurritv/sexmod/cj.al Ljava/lang/String;
      // 45: aload 0
      // 46: aload 2
      // 47: putfield com/schnurritv/sexmod/cj.ar Ljava/lang/String;
      // 4a: aload 0
      // 4b: aload 3
      // 4c: putfield com/schnurritv/sexmod/cj.am Lnet/minecraft/util/math/BlockPos;
      // 4f: return
      // 50: invokestatic com/schnurritv/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/schnurritv/sexmod/cj.ar Ljava/lang/String;
      // 58: aload 2
      // 59: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5c: ifeq 83
      // 5f: aload 0
      // 60: getfield com/schnurritv/sexmod/cj.al Ljava/lang/String;
      // 63: aload 1
      // 64: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 67: ifeq 83
      // 6a: goto 71
      // 6d: invokestatic com/schnurritv/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 70: athrow
      // 71: aload 0
      // 72: getfield com/schnurritv/sexmod/cj.am Lnet/minecraft/util/math/BlockPos;
      // 75: aload 3
      // 76: invokevirtual net/minecraft/util/math/BlockPos.equals (Ljava/lang/Object;)Z
      // 79: ifne 8e
      // 7c: goto 83
      // 7f: invokestatic com/schnurritv/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 82: athrow
      // 83: aload 0
      // 84: invokevirtual com/schnurritv/sexmod/cj.b ()V
      // 87: goto 8e
      // 8a: invokestatic com/schnurritv/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8d: athrow
      // 8e: aload 0
      // 8f: aload 1
      // 90: putfield com/schnurritv/sexmod/cj.al Ljava/lang/String;
      // 93: aload 0
      // 94: aload 2
      // 95: putfield com/schnurritv/sexmod/cj.ar Ljava/lang/String;
      // 98: aload 0
      // 99: aload 3
      // 9a: putfield com/schnurritv/sexmod/cj.am Lnet/minecraft/util/math/BlockPos;
      // 9d: return
      // try (0 -> 5): 5 java/lang/RuntimeException
      // try (25 -> 38): 38 java/lang/RuntimeException
      // try (40 -> 50): 51 java/lang/RuntimeException
      // try (45 -> 58): 59 java/lang/RuntimeException
      // try (53 -> 63): 64 java/lang/RuntimeException
   }

   protected abstract void b();

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
