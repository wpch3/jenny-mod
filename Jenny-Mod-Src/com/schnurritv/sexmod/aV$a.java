package com.schnurritv.sexmod;

import net.minecraft.entity.ai.EntityAIBase;

class aV$a extends EntityAIBase {
   private final aV a;
   private float b;
   private int c;

   public aV$a(aV var1) {
      this.a = var1;
      this.func_75248_a(2);
   }

   public boolean func_75250_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/aV$a.a Lcom/schnurritv/sexmod/aV;
      // 04: invokevirtual com/schnurritv/sexmod/aV.func_70638_az ()Lnet/minecraft/entity/EntityLivingBase;
      // 07: ifnonnull 59
      // 0a: aload 0
      // 0b: getfield com/schnurritv/sexmod/aV$a.a Lcom/schnurritv/sexmod/aV;
      // 0e: getfield com/schnurritv/sexmod/aV.field_70122_E Z
      // 11: ifne 51
      // 14: goto 1b
      // 17: invokestatic com/schnurritv/sexmod/aV$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield com/schnurritv/sexmod/aV$a.a Lcom/schnurritv/sexmod/aV;
      // 1f: invokevirtual com/schnurritv/sexmod/aV.func_70090_H ()Z
      // 22: ifne 51
      // 25: goto 2c
      // 28: invokestatic com/schnurritv/sexmod/aV$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/schnurritv/sexmod/aV$a.a Lcom/schnurritv/sexmod/aV;
      // 30: invokevirtual com/schnurritv/sexmod/aV.func_180799_ab ()Z
      // 33: ifne 51
      // 36: goto 3d
      // 39: invokestatic com/schnurritv/sexmod/aV$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield com/schnurritv/sexmod/aV$a.a Lcom/schnurritv/sexmod/aV;
      // 41: getstatic net/minecraft/init/MobEffects.field_188424_y Lnet/minecraft/potion/Potion;
      // 44: invokevirtual com/schnurritv/sexmod/aV.func_70644_a (Lnet/minecraft/potion/Potion;)Z
      // 47: ifeq 59
      // 4a: goto 51
      // 4d: invokestatic com/schnurritv/sexmod/aV$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 50: athrow
      // 51: bipush 1
      // 52: goto 5a
      // 55: invokestatic com/schnurritv/sexmod/aV$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 58: athrow
      // 59: bipush 0
      // 5a: ireturn
      // try (0 -> 8): 9 java/lang/RuntimeException
      // try (4 -> 15): 16 java/lang/RuntimeException
      // try (11 -> 22): 23 java/lang/RuntimeException
      // try (18 -> 30): 31 java/lang/RuntimeException
      // try (25 -> 35): 35 java/lang/RuntimeException
   }

   public void func_75246_d() {
      try {
         if (--this.c <= 0) {
            this.c = 40 + this.a.func_70681_au().nextInt(60);
            this.b = this.a.func_70681_au().nextInt(360);
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      ((aV$c)this.a.func_70605_aq()).a(this.b, false);
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
