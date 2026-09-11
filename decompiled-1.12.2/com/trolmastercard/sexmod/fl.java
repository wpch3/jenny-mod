package com.trolmastercard.sexmod;

import net.minecraft.entity.EntityLiving;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.math.BlockPos;

public class fl {
    public static BlockPos a(Path var0) {
        try {
            if (var0 == null) {
                return BlockPos.field_177992_a;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        PathPoint var1 = var0.func_75870_c();

        try {
            if (var1 == null) {
                return BlockPos.field_177992_a;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        return new BlockPos(var1.field_75839_a, var1.field_75837_b, var1.field_75838_c);
    }

    public static BlockPos a(EntityLiving var0) {
        PathNavigate var1 = var0.func_70661_as();
        Path var2 = var1.func_75505_d();
        return a(var2);
    }

    public static boolean a(Path param0, BlockPos[] param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual net/minecraft/pathfinding/Path.func_75874_d ()I
        // 04: istore 2
        // 05: new java/util/ArrayList
        // 08: dup
        // 09: invokespecial java/util/ArrayList.<init> ()V
        // 0c: astore 3
        // 0d: bipush 0
        // 0e: istore 4
        // 10: iload 4
        // 12: iload 2
        // 13: if_icmpge 2d
        // 16: aload 3
        // 17: aload 0
        // 18: iload 4
        // 1a: invokevirtual net/minecraft/pathfinding/Path.func_75877_a (I)Lnet/minecraft/pathfinding/PathPoint;
        // 1d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
        // 22: pop
        // 23: iinc 4 1
        // 26: goto 10
        // 29: invokestatic com/trolmastercard/sexmod/fl.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2c: athrow
        // 2d: aload 3
        // 2e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 33: astore 4
        // 35: aload 4
        // 37: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 3c: ifeq a8
        // 3f: aload 4
        // 41: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 46: checkcast net/minecraft/pathfinding/PathPoint
        // 49: astore 5
        // 4b: aload 1
        // 4c: astore 6
        // 4e: aload 6
        // 50: arraylength
        // 51: istore 7
        // 53: bipush 0
        // 54: istore 8
        // 56: iload 8
        // 58: iload 7
        // 5a: if_icmpge a5
        // 5d: aload 6
        // 5f: iload 8
        // 61: aaload
        // 62: astore 9
        // 64: aload 5
        // 66: getfield net/minecraft/pathfinding/PathPoint.field_75839_a I
        // 69: aload 9
        // 6b: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 6e: if_icmpne 9f
        // 71: aload 5
        // 73: getfield net/minecraft/pathfinding/PathPoint.field_75837_b I
        // 76: aload 9
        // 78: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 7b: if_icmpne 9f
        // 7e: goto 85
        // 81: invokestatic com/trolmastercard/sexmod/fl.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 84: athrow
        // 85: aload 5
        // 87: getfield net/minecraft/pathfinding/PathPoint.field_75838_c I
        // 8a: aload 9
        // 8c: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 8f: if_icmpne 9f
        // 92: goto 99
        // 95: invokestatic com/trolmastercard/sexmod/fl.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 98: athrow
        // 99: bipush 1
        // 9a: ireturn
        // 9b: invokestatic com/trolmastercard/sexmod/fl.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 9e: athrow
        // 9f: iinc 8 1
        // a2: goto 56
        // a5: goto 35
        // a8: bipush 0
        // a9: ireturn
        // try (9 -> 20): 20 java/lang/RuntimeException
        // try (46 -> 56): 57 java/lang/RuntimeException
        // try (51 -> 64): 65 java/lang/RuntimeException
        // try (59 -> 69): 69 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
