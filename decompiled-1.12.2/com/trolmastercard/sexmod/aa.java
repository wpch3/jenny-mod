package com.trolmastercard.sexmod;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;

public class aa extends EntityAINearestAttackableTarget<ff> {
    private final int a;
    private final boolean b;

    public aa(EntityCreature var1, boolean var2, boolean var3) {
        this(var1, var2, false, var3);
    }

    public aa(EntityCreature var1, boolean var2, boolean var3, boolean var4) {
        this(var1, 10, var2, var3, null, var4);
    }

    public aa(EntityCreature var1, int var2, boolean var3, boolean var4, @Nullable Predicate var5, boolean var6) {
        super(var1, ff.class, var2, var3, var4, var5);
        this.a = var2;
        this.b = var6;
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
        // 01: getfield com/trolmastercard/sexmod/aa.b Z
        // 04: ifeq 1c
        // 07: aload 0
        // 08: getfield com/trolmastercard/sexmod/aa.field_75299_d Lnet/minecraft/entity/EntityCreature;
        // 0b: invokevirtual net/minecraft/entity/EntityCreature.func_70013_c ()F
        // 0e: fstore 1
        // 0f: fload 1
        // 10: ldc 0.5
        // 12: fcmpl
        // 13: iflt 1c
        // 16: bipush 0
        // 17: ireturn
        // 18: invokestatic com/trolmastercard/sexmod/aa.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1b: athrow
        // 1c: aload 0
        // 1d: getfield com/trolmastercard/sexmod/aa.a I
        // 20: ifle 41
        // 23: aload 0
        // 24: getfield com/trolmastercard/sexmod/aa.field_75299_d Lnet/minecraft/entity/EntityCreature;
        // 27: invokevirtual net/minecraft/entity/EntityCreature.func_70681_au ()Ljava/util/Random;
        // 2a: aload 0
        // 2b: getfield com/trolmastercard/sexmod/aa.a I
        // 2e: invokevirtual java/util/Random.nextInt (I)I
        // 31: ifeq 41
        // 34: goto 3b
        // 37: invokestatic com/trolmastercard/sexmod/aa.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3a: athrow
        // 3b: bipush 0
        // 3c: ireturn
        // 3d: invokestatic com/trolmastercard/sexmod/aa.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 40: athrow
        // 41: aload 0
        // 42: getfield com/trolmastercard/sexmod/aa.field_75299_d Lnet/minecraft/entity/EntityCreature;
        // 45: getfield net/minecraft/entity/EntityCreature.field_70170_p Lnet/minecraft/world/World;
        // 48: aload 0
        // 49: getfield com/trolmastercard/sexmod/aa.field_75307_b Ljava/lang/Class;
        // 4c: aload 0
        // 4d: aload 0
        // 4e: invokevirtual com/trolmastercard/sexmod/aa.func_111175_f ()D
        // 51: invokevirtual com/trolmastercard/sexmod/aa.func_188511_a (D)Lnet/minecraft/util/math/AxisAlignedBB;
        // 54: aload 0
        // 55: getfield com/trolmastercard/sexmod/aa.field_82643_g Lcom/google/common/base/Predicate;
        // 58: invokevirtual net/minecraft/world/World.func_175647_a (Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;Lcom/google/common/base/Predicate;)Ljava/util/List;
        // 5b: astore 1
        // 5c: aload 1
        // 5d: invokeinterface java/util/List.isEmpty ()Z 1
        // 62: ifeq 6b
        // 65: bipush 0
        // 66: ireturn
        // 67: invokestatic com/trolmastercard/sexmod/aa.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 6a: athrow
        // 6b: new java/util/ArrayList
        // 6e: dup
        // 6f: invokespecial java/util/ArrayList.<init> ()V
        // 72: astore 2
        // 73: aload 1
        // 74: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 79: astore 3
        // 7a: aload 3
        // 7b: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 80: ifeq a9
        // 83: aload 3
        // 84: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 89: checkcast com/trolmastercard/sexmod/ff
        // 8c: astore 4
        // 8e: aload 4
        // 90: invokevirtual com/trolmastercard/sexmod/ff.J ()Z
        // 93: ifeq a6
        // 96: aload 2
        // 97: aload 4
        // 99: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
        // 9e: pop
        // 9f: goto a6
        // a2: invokestatic com/trolmastercard/sexmod/aa.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // a5: athrow
        // a6: goto 7a
        // a9: aload 2
        // aa: invokeinterface java/util/List.isEmpty ()Z 1
        // af: ifeq b8
        // b2: bipush 0
        // b3: ireturn
        // b4: invokestatic com/trolmastercard/sexmod/aa.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // b7: athrow
        // b8: aload 2
        // b9: aload 0
        // ba: getfield com/trolmastercard/sexmod/aa.field_75306_g Lnet/minecraft/entity/ai/EntityAINearestAttackableTarget$Sorter;
        // bd: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
        // c2: aload 0
        // c3: aload 2
        // c4: bipush 0
        // c5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
        // ca: checkcast net/minecraft/entity/EntityLivingBase
        // cd: putfield com/trolmastercard/sexmod/aa.field_75309_a Lnet/minecraft/entity/EntityLivingBase;
        // d0: bipush 1
        // d1: ireturn
        // try (7 -> 13): 13 java/lang/RuntimeException
        // try (15 -> 25): 26 java/lang/RuntimeException
        // try (18 -> 30): 30 java/lang/RuntimeException
        // try (45 -> 50): 50 java/lang/RuntimeException
        // try (66 -> 73): 74 java/lang/RuntimeException
        // try (77 -> 82): 82 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
