package com.schnurritv.sexmod;

import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.ai.EntityMoveHelper.Action;

class aV$c extends EntityMoveHelper {
   private float b;
   private int a;
   private final aV c;
   private boolean d;

   public aV$c(aV var1) {
      super(var1);
      this.c = var1;
      this.b = 180.0F * var1.field_70177_z / (float) Math.PI;
   }

   public void a(float var1, boolean var2) {
      this.b = var1;
      this.d = var2;
   }

   public void a(double var1) {
      this.field_75645_e = var1;
      this.field_188491_h = Action.MOVE_TO;
   }

   public void func_75641_c() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 004: aload 0
      // 005: aload 0
      // 006: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 009: getfield net/minecraft/entity/EntityLiving.field_70177_z F
      // 00c: aload 0
      // 00d: getfield com/schnurritv/sexmod/aV$c.b F
      // 010: ldc 90.0
      // 012: invokevirtual com/schnurritv/sexmod/aV$c.func_75639_a (FFF)F
      // 015: putfield net/minecraft/entity/EntityLiving.field_70177_z F
      // 018: aload 0
      // 019: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 01c: aload 0
      // 01d: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 020: getfield net/minecraft/entity/EntityLiving.field_70177_z F
      // 023: putfield net/minecraft/entity/EntityLiving.field_70759_as F
      // 026: aload 0
      // 027: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 02a: aload 0
      // 02b: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 02e: getfield net/minecraft/entity/EntityLiving.field_70177_z F
      // 031: putfield net/minecraft/entity/EntityLiving.field_70761_aq F
      // 034: aload 0
      // 035: getfield com/schnurritv/sexmod/aV$c.field_188491_h Lnet/minecraft/entity/ai/EntityMoveHelper$Action;
      // 038: getstatic net/minecraft/entity/ai/EntityMoveHelper$Action.MOVE_TO Lnet/minecraft/entity/ai/EntityMoveHelper$Action;
      // 03b: if_acmpeq 04d
      // 03e: aload 0
      // 03f: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 042: fconst_0
      // 043: invokevirtual net/minecraft/entity/EntityLiving.func_191989_p (F)V
      // 046: goto 15a
      // 049: invokestatic com/schnurritv/sexmod/aV$c.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04c: athrow
      // 04d: aload 0
      // 04e: getstatic net/minecraft/entity/ai/EntityMoveHelper$Action.WAIT Lnet/minecraft/entity/ai/EntityMoveHelper$Action;
      // 051: putfield com/schnurritv/sexmod/aV$c.field_188491_h Lnet/minecraft/entity/ai/EntityMoveHelper$Action;
      // 054: aload 0
      // 055: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 058: getfield net/minecraft/entity/EntityLiving.field_70122_E Z
      // 05b: ifeq 13e
      // 05e: aload 0
      // 05f: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 062: aload 0
      // 063: getfield com/schnurritv/sexmod/aV$c.field_75645_e D
      // 066: aload 0
      // 067: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 06a: getstatic net/minecraft/entity/SharedMonsterAttributes.field_111263_d Lnet/minecraft/entity/ai/attributes/IAttribute;
      // 06d: invokevirtual net/minecraft/entity/EntityLiving.func_110148_a (Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;
      // 070: invokeinterface net/minecraft/entity/ai/attributes/IAttributeInstance.func_111126_e ()D 1
      // 075: dmul
      // 076: d2f
      // 077: invokevirtual net/minecraft/entity/EntityLiving.func_70659_e (F)V
      // 07a: aload 0
      // 07b: dup
      // 07c: getfield com/schnurritv/sexmod/aV$c.a I
      // 07f: dup_x1
      // 080: bipush 1
      // 081: isub
      // 082: putfield com/schnurritv/sexmod/aV$c.a I
      // 085: ifgt 123
      // 088: goto 08f
      // 08b: invokestatic com/schnurritv/sexmod/aV$c.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08e: athrow
      // 08f: aload 0
      // 090: aload 0
      // 091: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 094: invokevirtual com/schnurritv/sexmod/aV.g ()I
      // 097: putfield com/schnurritv/sexmod/aV$c.a I
      // 09a: aload 0
      // 09b: getfield com/schnurritv/sexmod/aV$c.d Z
      // 09e: ifeq 0b9
      // 0a1: goto 0a8
      // 0a4: invokestatic com/schnurritv/sexmod/aV$c.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: dup
      // 0aa: getfield com/schnurritv/sexmod/aV$c.a I
      // 0ad: bipush 3
      // 0ae: idiv
      // 0af: putfield com/schnurritv/sexmod/aV$c.a I
      // 0b2: goto 0b9
      // 0b5: invokestatic com/schnurritv/sexmod/aV$c.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b8: athrow
      // 0b9: getstatic com/schnurritv/sexmod/f.a Ljava/util/Random;
      // 0bc: sipush 360
      // 0bf: invokevirtual java/util/Random.nextInt (I)I
      // 0c2: i2f
      // 0c3: fstore 1
      // 0c4: aload 0
      // 0c5: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 0c8: invokevirtual com/schnurritv/sexmod/aV.func_70605_aq ()Lnet/minecraft/entity/ai/EntityMoveHelper;
      // 0cb: checkcast com/schnurritv/sexmod/aV$c
      // 0ce: fload 1
      // 0cf: bipush 0
      // 0d0: invokevirtual com/schnurritv/sexmod/aV$c.a (FZ)V
      // 0d3: aload 0
      // 0d4: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 0d7: invokevirtual com/schnurritv/sexmod/aV.func_70683_ar ()Lnet/minecraft/entity/ai/EntityJumpHelper;
      // 0da: invokevirtual net/minecraft/entity/ai/EntityJumpHelper.func_75660_a ()V
      // 0dd: aload 0
      // 0de: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 0e1: invokevirtual com/schnurritv/sexmod/aV.h ()Z
      // 0e4: ifeq 120
      // 0e7: aload 0
      // 0e8: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 0eb: aload 0
      // 0ec: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 0ef: invokevirtual com/schnurritv/sexmod/aV.j ()Lnet/minecraft/util/SoundEvent;
      // 0f2: aload 0
      // 0f3: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 0f6: invokevirtual com/schnurritv/sexmod/aV.func_70599_aP ()F
      // 0f9: aload 0
      // 0fa: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 0fd: invokevirtual com/schnurritv/sexmod/aV.func_70681_au ()Ljava/util/Random;
      // 100: invokevirtual java/util/Random.nextFloat ()F
      // 103: aload 0
      // 104: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 107: invokevirtual com/schnurritv/sexmod/aV.func_70681_au ()Ljava/util/Random;
      // 10a: invokevirtual java/util/Random.nextFloat ()F
      // 10d: fsub
      // 10e: ldc 0.2
      // 110: fmul
      // 111: fconst_1
      // 112: fadd
      // 113: ldc 0.8
      // 115: fmul
      // 116: invokevirtual com/schnurritv/sexmod/aV.func_184185_a (Lnet/minecraft/util/SoundEvent;FF)V
      // 119: goto 120
      // 11c: invokestatic com/schnurritv/sexmod/aV$c.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11f: athrow
      // 120: goto 15a
      // 123: aload 0
      // 124: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 127: fconst_0
      // 128: putfield com/schnurritv/sexmod/aV.field_70702_br F
      // 12b: aload 0
      // 12c: getfield com/schnurritv/sexmod/aV$c.c Lcom/schnurritv/sexmod/aV;
      // 12f: fconst_0
      // 130: putfield com/schnurritv/sexmod/aV.field_191988_bg F
      // 133: aload 0
      // 134: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 137: fconst_0
      // 138: invokevirtual net/minecraft/entity/EntityLiving.func_70659_e (F)V
      // 13b: goto 15a
      // 13e: aload 0
      // 13f: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 142: aload 0
      // 143: getfield com/schnurritv/sexmod/aV$c.field_75645_e D
      // 146: aload 0
      // 147: getfield com/schnurritv/sexmod/aV$c.field_75648_a Lnet/minecraft/entity/EntityLiving;
      // 14a: getstatic net/minecraft/entity/SharedMonsterAttributes.field_111263_d Lnet/minecraft/entity/ai/attributes/IAttribute;
      // 14d: invokevirtual net/minecraft/entity/EntityLiving.func_110148_a (Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;
      // 150: invokeinterface net/minecraft/entity/ai/attributes/IAttributeInstance.func_111126_e ()D 1
      // 155: dmul
      // 156: d2f
      // 157: invokevirtual net/minecraft/entity/EntityLiving.func_70659_e (F)V
      // 15a: return
      // try (0 -> 32): 32 java/lang/RuntimeException
      // try (34 -> 61): 62 java/lang/RuntimeException
      // try (41 -> 72): 73 java/lang/RuntimeException
      // try (64 -> 81): 82 java/lang/RuntimeException
      // try (89 -> 128): 129 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
