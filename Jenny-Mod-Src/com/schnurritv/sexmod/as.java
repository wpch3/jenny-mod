package com.schnurritv.sexmod;

import net.minecraft.block.BlockDoor;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.math.BlockPos;

public class aS extends EntityAIBase {
   protected EntityLiving f;
   protected BlockPos e = BlockPos.field_177992_a;
   protected BlockDoor c;
   boolean d;
   float b;
   float g;
   int a = 10;

   public aS(EntityLiving var1) {
      this.f = var1;
      if (!(var1.func_70661_as() instanceof PathNavigateGround)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   public boolean func_75250_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: bipush 1
      // 001: istore 1
      // 002: bipush -3
      // 004: istore 2
      // 005: iload 2
      // 006: bipush 5
      // 007: if_icmpge 068
      // 00a: bipush -3
      // 00c: istore 3
      // 00d: iload 3
      // 00e: bipush 5
      // 00f: if_icmpge 057
      // 012: aload 0
      // 013: getfield com/schnurritv/sexmod/aS.f Lnet/minecraft/entity/EntityLiving;
      // 016: getfield net/minecraft/entity/EntityLiving.field_70170_p Lnet/minecraft/world/World;
      // 019: aload 0
      // 01a: getfield com/schnurritv/sexmod/aS.f Lnet/minecraft/entity/EntityLiving;
      // 01d: invokevirtual net/minecraft/entity/EntityLiving.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 020: iload 2
      // 021: bipush 0
      // 022: iload 3
      // 023: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
      // 026: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 029: astore 4
      // 02b: aload 4
      // 02d: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 032: instanceof net/minecraft/block/BlockDoor
      // 035: ifeq 051
      // 038: aload 4
      // 03a: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a ()Lnet/minecraft/block/material/Material; 1
      // 03f: getstatic net/minecraft/block/material/Material.field_151575_d Lnet/minecraft/block/material/Material;
      // 042: if_acmpne 051
      // 045: goto 04c
      // 048: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04b: athrow
      // 04c: bipush 0
      // 04d: istore 1
      // 04e: goto 057
      // 051: iinc 3 1
      // 054: goto 00d
      // 057: iload 1
      // 058: ifne 062
      // 05b: goto 068
      // 05e: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 061: athrow
      // 062: iinc 2 1
      // 065: goto 005
      // 068: iload 1
      // 069: ifeq 072
      // 06c: bipush 0
      // 06d: ireturn
      // 06e: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: aload 0
      // 073: getfield com/schnurritv/sexmod/aS.f Lnet/minecraft/entity/EntityLiving;
      // 076: invokevirtual net/minecraft/entity/EntityLiving.func_70661_as ()Lnet/minecraft/pathfinding/PathNavigate;
      // 079: checkcast net/minecraft/pathfinding/PathNavigateGround
      // 07c: astore 2
      // 07d: aload 2
      // 07e: invokevirtual net/minecraft/pathfinding/PathNavigateGround.func_75505_d ()Lnet/minecraft/pathfinding/Path;
      // 081: astore 3
      // 082: aload 3
      // 083: ifnull 155
      // 086: aload 3
      // 087: invokevirtual net/minecraft/pathfinding/Path.func_75879_b ()Z
      // 08a: ifne 155
      // 08d: goto 094
      // 090: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 093: athrow
      // 094: aload 2
      // 095: invokevirtual net/minecraft/pathfinding/PathNavigateGround.func_179686_g ()Z
      // 098: ifeq 155
      // 09b: goto 0a2
      // 09e: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a1: athrow
      // 0a2: bipush 0
      // 0a3: istore 4
      // 0a5: iload 4
      // 0a7: aload 3
      // 0a8: invokevirtual net/minecraft/pathfinding/Path.func_75873_e ()I
      // 0ab: bipush 2
      // 0ac: iadd
      // 0ad: aload 3
      // 0ae: invokevirtual net/minecraft/pathfinding/Path.func_75874_d ()I
      // 0b1: invokestatic java/lang/Math.min (II)I
      // 0b4: if_icmpge 126
      // 0b7: aload 3
      // 0b8: iload 4
      // 0ba: invokevirtual net/minecraft/pathfinding/Path.func_75877_a (I)Lnet/minecraft/pathfinding/PathPoint;
      // 0bd: astore 5
      // 0bf: aload 0
      // 0c0: new net/minecraft/util/math/BlockPos
      // 0c3: dup
      // 0c4: aload 5
      // 0c6: getfield net/minecraft/pathfinding/PathPoint.field_75839_a I
      // 0c9: aload 5
      // 0cb: getfield net/minecraft/pathfinding/PathPoint.field_75837_b I
      // 0ce: bipush 1
      // 0cf: iadd
      // 0d0: aload 5
      // 0d2: getfield net/minecraft/pathfinding/PathPoint.field_75838_c I
      // 0d5: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
      // 0d8: putfield com/schnurritv/sexmod/aS.e Lnet/minecraft/util/math/BlockPos;
      // 0db: aload 0
      // 0dc: getfield com/schnurritv/sexmod/aS.f Lnet/minecraft/entity/EntityLiving;
      // 0df: aload 0
      // 0e0: getfield com/schnurritv/sexmod/aS.e Lnet/minecraft/util/math/BlockPos;
      // 0e3: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 0e6: i2d
      // 0e7: aload 0
      // 0e8: getfield com/schnurritv/sexmod/aS.f Lnet/minecraft/entity/EntityLiving;
      // 0eb: getfield net/minecraft/entity/EntityLiving.field_70163_u D
      // 0ee: aload 0
      // 0ef: getfield com/schnurritv/sexmod/aS.e Lnet/minecraft/util/math/BlockPos;
      // 0f2: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 0f5: i2d
      // 0f6: invokevirtual net/minecraft/entity/EntityLiving.func_70092_e (DDD)D
      // 0f9: ldc2_w 2.25
      // 0fc: dcmpg
      // 0fd: ifgt 120
      // 100: aload 0
      // 101: aload 0
      // 102: aload 0
      // 103: getfield com/schnurritv/sexmod/aS.e Lnet/minecraft/util/math/BlockPos;
      // 106: invokespecial com/schnurritv/sexmod/aS.a (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockDoor;
      // 109: putfield com/schnurritv/sexmod/aS.c Lnet/minecraft/block/BlockDoor;
      // 10c: aload 0
      // 10d: getfield com/schnurritv/sexmod/aS.c Lnet/minecraft/block/BlockDoor;
      // 110: ifnull 120
      // 113: goto 11a
      // 116: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 119: athrow
      // 11a: bipush 1
      // 11b: ireturn
      // 11c: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11f: athrow
      // 120: iinc 4 1
      // 123: goto 0a5
      // 126: aload 0
      // 127: new net/minecraft/util/math/BlockPos
      // 12a: dup
      // 12b: aload 0
      // 12c: getfield com/schnurritv/sexmod/aS.f Lnet/minecraft/entity/EntityLiving;
      // 12f: invokespecial net/minecraft/util/math/BlockPos.<init> (Lnet/minecraft/entity/Entity;)V
      // 132: invokevirtual net/minecraft/util/math/BlockPos.func_177984_a ()Lnet/minecraft/util/math/BlockPos;
      // 135: putfield com/schnurritv/sexmod/aS.e Lnet/minecraft/util/math/BlockPos;
      // 138: aload 0
      // 139: aload 0
      // 13a: aload 0
      // 13b: getfield com/schnurritv/sexmod/aS.e Lnet/minecraft/util/math/BlockPos;
      // 13e: invokespecial com/schnurritv/sexmod/aS.a (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockDoor;
      // 141: putfield com/schnurritv/sexmod/aS.c Lnet/minecraft/block/BlockDoor;
      // 144: aload 0
      // 145: getfield com/schnurritv/sexmod/aS.c Lnet/minecraft/block/BlockDoor;
      // 148: ifnull 153
      // 14b: bipush 1
      // 14c: goto 154
      // 14f: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 152: athrow
      // 153: bipush 0
      // 154: ireturn
      // 155: bipush 0
      // 156: ireturn
      // try (24 -> 32): 33 java/lang/IllegalArgumentException
      // try (40 -> 43): 43 java/lang/IllegalArgumentException
      // try (47 -> 51): 51 java/lang/IllegalArgumentException
      // try (61 -> 66): 67 java/lang/IllegalArgumentException
      // try (63 -> 72): 73 java/lang/IllegalArgumentException
      // try (90 -> 129): 130 java/lang/IllegalArgumentException
      // try (120 -> 134): 134 java/lang/IllegalArgumentException
      // try (138 -> 157): 157 java/lang/IllegalArgumentException
   }

   public boolean func_75253_b() {
      try {
         if (this.a >= 0) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw a(var1);
      }

      return false;
   }

   public void func_75249_e() {
      this.d = false;
      this.b = (float)(this.e.func_177958_n() + 0.5F - this.f.field_70165_t);
      this.g = (float)(this.e.func_177952_p() + 0.5F - this.f.field_70161_v);
      this.c.func_176512_a(this.f.field_70170_p, this.e, true);
   }

   public void func_75246_d() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/aS.e Lnet/minecraft/util/math/BlockPos;
      // 04: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 07: i2f
      // 08: ldc 0.5
      // 0a: fadd
      // 0b: f2d
      // 0c: aload 0
      // 0d: getfield com/schnurritv/sexmod/aS.f Lnet/minecraft/entity/EntityLiving;
      // 10: getfield net/minecraft/entity/EntityLiving.field_70165_t D
      // 13: dsub
      // 14: d2f
      // 15: fstore 1
      // 16: aload 0
      // 17: getfield com/schnurritv/sexmod/aS.e Lnet/minecraft/util/math/BlockPos;
      // 1a: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 1d: i2f
      // 1e: ldc 0.5
      // 20: fadd
      // 21: f2d
      // 22: aload 0
      // 23: getfield com/schnurritv/sexmod/aS.f Lnet/minecraft/entity/EntityLiving;
      // 26: getfield net/minecraft/entity/EntityLiving.field_70161_v D
      // 29: dsub
      // 2a: d2f
      // 2b: fstore 2
      // 2c: aload 0
      // 2d: getfield com/schnurritv/sexmod/aS.b F
      // 30: fload 1
      // 31: fmul
      // 32: aload 0
      // 33: getfield com/schnurritv/sexmod/aS.g F
      // 36: fload 2
      // 37: fmul
      // 38: fadd
      // 39: fstore 3
      // 3a: fload 3
      // 3b: fconst_0
      // 3c: fcmpg
      // 3d: ifge 74
      // 40: aload 0
      // 41: dup
      // 42: getfield com/schnurritv/sexmod/aS.a I
      // 45: bipush 1
      // 46: isub
      // 47: dup_x1
      // 48: putfield com/schnurritv/sexmod/aS.a I
      // 4b: ifgt 74
      // 4e: goto 55
      // 51: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: aload 0
      // 56: getfield com/schnurritv/sexmod/aS.c Lnet/minecraft/block/BlockDoor;
      // 59: aload 0
      // 5a: getfield com/schnurritv/sexmod/aS.f Lnet/minecraft/entity/EntityLiving;
      // 5d: getfield net/minecraft/entity/EntityLiving.field_70170_p Lnet/minecraft/world/World;
      // 60: aload 0
      // 61: getfield com/schnurritv/sexmod/aS.e Lnet/minecraft/util/math/BlockPos;
      // 64: bipush 0
      // 65: invokevirtual net/minecraft/block/BlockDoor.func_176512_a (Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)V
      // 68: aload 0
      // 69: bipush 1
      // 6a: putfield com/schnurritv/sexmod/aS.d Z
      // 6d: goto 74
      // 70: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 73: athrow
      // 74: return
      // try (36 -> 48): 49 java/lang/IllegalArgumentException
      // try (40 -> 63): 64 java/lang/IllegalArgumentException
   }

   public void func_75251_c() {
      this.a = 10;
   }

   private BlockDoor a(BlockPos param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/aS.f Lnet/minecraft/entity/EntityLiving;
      // 04: getfield net/minecraft/entity/EntityLiving.field_70170_p Lnet/minecraft/world/World;
      // 07: aload 1
      // 08: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 0b: astore 2
      // 0c: aload 2
      // 0d: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 12: astore 3
      // 13: aload 3
      // 14: instanceof net/minecraft/block/BlockDoor
      // 17: ifeq 38
      // 1a: aload 2
      // 1b: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a ()Lnet/minecraft/block/material/Material; 1
      // 20: getstatic net/minecraft/block/material/Material.field_151575_d Lnet/minecraft/block/material/Material;
      // 23: if_acmpne 38
      // 26: goto 2d
      // 29: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 3
      // 2e: checkcast net/minecraft/block/BlockDoor
      // 31: goto 39
      // 34: invokestatic com/schnurritv/sexmod/aS.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: aconst_null
      // 39: areturn
      // try (9 -> 16): 17 java/lang/IllegalArgumentException
      // try (12 -> 22): 22 java/lang/IllegalArgumentException
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
