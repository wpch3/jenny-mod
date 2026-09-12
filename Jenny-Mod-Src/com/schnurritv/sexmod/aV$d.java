package com.schnurritv.sexmod;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.PathNavigateGround;

class aV$d extends EntityAIBase {
   private final aV a;

   public aV$d(aV var1) {
      this.a = var1;
      this.func_75248_a(5);
      ((PathNavigateGround)var1.func_70661_as()).func_179693_d(true);
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
      // 01: getfield com/schnurritv/sexmod/aV$d.a Lcom/schnurritv/sexmod/aV;
      // 04: invokevirtual com/schnurritv/sexmod/aV.func_70090_H ()Z
      // 07: ifne 1b
      // 0a: aload 0
      // 0b: getfield com/schnurritv/sexmod/aV$d.a Lcom/schnurritv/sexmod/aV;
      // 0e: invokevirtual com/schnurritv/sexmod/aV.func_180799_ab ()Z
      // 11: ifeq 23
      // 14: goto 1b
      // 17: invokestatic com/schnurritv/sexmod/aV$d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: bipush 1
      // 1c: goto 24
      // 1f: invokestatic com/schnurritv/sexmod/aV$d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // try (0 -> 8): 9 java/lang/RuntimeException
      // try (4 -> 13): 13 java/lang/RuntimeException
   }

   public void func_75246_d() {
      try {
         if (this.a.func_70681_au().nextFloat() < 0.8F) {
            this.a.func_70683_ar().func_75660_a();
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      ((aV$c)this.a.func_70605_aq()).a(1.2);
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
