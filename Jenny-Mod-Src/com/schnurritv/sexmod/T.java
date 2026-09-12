package com.schnurritv.sexmod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import net.minecraft.init.Biomes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class t implements IWorldGenerator {
   public static final int c = 6;
   static final double a = 0.004F;
   public static boolean b = true;

   public void generate(Random var1, int var2, int var3, World var4, IChunkGenerator var5, IChunkProvider var6) {
      try {
         if (!b) {
            return;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      try {
         if (var4.func_175624_G() == WorldType.field_77138_c) {
            return;
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      try {
         switch (var4.field_73011_w.getDimension()) {
            case 0:
               this.a(
                  new ab("jenny"),
                  var4,
                  var1,
                  var2,
                  var3,
                  new HashSet<>(Arrays.asList(Biomes.field_76772_c, Biomes.field_76767_f)),
                  new Vec3i(9, 4, 9),
                  1,
                  true,
                  true,
                  120
               );
               this.a(
                  new ab("ellie"),
                  var4,
                  var1,
                  var2,
                  var3,
                  new HashSet<>(Arrays.asList(Biomes.field_150578_U, Biomes.field_150584_S, Biomes.field_76768_g, Biomes.field_150585_R)),
                  new Vec3i(30, 27, 26),
                  9,
                  true,
                  false,
                  150
               );
               this.a(
                  new au("bia"),
                  var4,
                  var1,
                  var2,
                  var3,
                  new HashSet<>(Arrays.asList(Biomes.field_150583_P, Biomes.field_185448_Z)),
                  new Vec3i(11, 9, 15),
                  2,
                  true,
                  true,
                  4
               );
               this.a(
                  new ab("luna"),
                  var4,
                  var1,
                  var2,
                  var3,
                  new HashSet<>(Arrays.asList(Biomes.field_76771_b, Biomes.field_150575_M)),
                  new Vec3i(3, 7, 10),
                  0,
                  false,
                  false,
                  350
               );
               this.a(var4, var1, var2, var3);
               this.b(var4, var1, var2, var3);
            case 1:
            case 2:
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }
   }

   void b(World param1, Random param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: bipush 16
      // 002: iload 3
      // 003: imul
      // 004: bipush 3
      // 005: iadd
      // 006: istore 5
      // 008: bipush 16
      // 00a: iload 4
      // 00c: imul
      // 00d: bipush 3
      // 00e: iadd
      // 00f: istore 6
      // 011: aload 2
      // 012: sipush 255
      // 015: invokevirtual java/util/Random.nextInt (I)I
      // 018: istore 7
      // 01a: new net/minecraft/util/math/BlockPos
      // 01d: dup
      // 01e: iload 5
      // 020: iload 7
      // 022: iload 6
      // 024: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
      // 027: astore 8
      // 029: new java/util/ArrayList
      // 02c: dup
      // 02d: invokespecial java/util/ArrayList.<init> ()V
      // 030: astore 9
      // 032: bipush 0
      // 033: istore 10
      // 035: iload 10
      // 037: getstatic com/schnurritv/sexmod/ct.ad Lnet/minecraft/util/math/Vec3i;
      // 03a: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 03d: if_icmpgt 12d
      // 040: bipush -1
      // 041: istore 11
      // 043: iload 11
      // 045: getstatic com/schnurritv/sexmod/ct.ad Lnet/minecraft/util/math/Vec3i;
      // 048: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
      // 04b: if_icmpgt 127
      // 04e: bipush 0
      // 04f: istore 12
      // 051: iload 12
      // 053: getstatic com/schnurritv/sexmod/ct.ad Lnet/minecraft/util/math/Vec3i;
      // 056: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 059: if_icmpgt 121
      // 05c: aload 8
      // 05e: iload 10
      // 060: iload 11
      // 062: iload 12
      // 064: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
      // 067: astore 13
      // 069: aload 1
      // 06a: aload 13
      // 06c: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 06f: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a ()Lnet/minecraft/block/material/Material; 1
      // 074: astore 14
      // 076: aload 14
      // 078: invokevirtual net/minecraft/block/material/Material.func_76220_a ()Z
      // 07b: istore 15
      // 07d: iload 15
      // 07f: ifne 0a6
      // 082: iload 11
      // 084: bipush -1
      // 085: if_icmpeq 0a1
      // 088: goto 08f
      // 08b: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08e: athrow
      // 08f: iload 11
      // 091: getstatic com/schnurritv/sexmod/ct.ad Lnet/minecraft/util/math/Vec3i;
      // 094: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
      // 097: if_icmpne 0a6
      // 09a: goto 0a1
      // 09d: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a0: athrow
      // 0a1: return
      // 0a2: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a5: athrow
      // 0a6: iload 10
      // 0a8: ifeq 0db
      // 0ab: iload 10
      // 0ad: getstatic com/schnurritv/sexmod/ct.ad Lnet/minecraft/util/math/Vec3i;
      // 0b0: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 0b3: if_icmpeq 0db
      // 0b6: goto 0bd
      // 0b9: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0bc: athrow
      // 0bd: iload 12
      // 0bf: ifeq 0db
      // 0c2: goto 0c9
      // 0c5: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c8: athrow
      // 0c9: iload 12
      // 0cb: getstatic com/schnurritv/sexmod/ct.ad Lnet/minecraft/util/math/Vec3i;
      // 0ce: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 0d1: if_icmpne 11b
      // 0d4: goto 0db
      // 0d7: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0da: athrow
      // 0db: iload 11
      // 0dd: ifne 11b
      // 0e0: goto 0e7
      // 0e3: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e6: athrow
      // 0e7: aload 1
      // 0e8: aload 13
      // 0ea: invokevirtual net/minecraft/world/World.func_175623_d (Lnet/minecraft/util/math/BlockPos;)Z
      // 0ed: ifeq 11b
      // 0f0: goto 0f7
      // 0f3: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f6: athrow
      // 0f7: aload 1
      // 0f8: aload 13
      // 0fa: invokevirtual net/minecraft/util/math/BlockPos.func_177984_a ()Lnet/minecraft/util/math/BlockPos;
      // 0fd: invokevirtual net/minecraft/world/World.func_175623_d (Lnet/minecraft/util/math/BlockPos;)Z
      // 100: ifeq 11b
      // 103: goto 10a
      // 106: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 109: athrow
      // 10a: aload 9
      // 10c: aload 13
      // 10e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 113: pop
      // 114: goto 11b
      // 117: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11a: athrow
      // 11b: iinc 12 1
      // 11e: goto 051
      // 121: iinc 11 1
      // 124: goto 043
      // 127: iinc 10 1
      // 12a: goto 035
      // 12d: aload 9
      // 12f: invokeinterface java/util/List.size ()I 1
      // 134: ifeq 149
      // 137: aload 9
      // 139: invokeinterface java/util/List.size ()I 1
      // 13e: bipush 4
      // 13f: if_icmple 14e
      // 142: goto 149
      // 145: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 148: athrow
      // 149: return
      // 14a: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14d: athrow
      // 14e: aconst_null
      // 14f: astore 10
      // 151: aload 9
      // 153: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 158: astore 11
      // 15a: aload 11
      // 15c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 161: ifeq 1e2
      // 164: aload 11
      // 166: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 16b: checkcast net/minecraft/util/math/BlockPos
      // 16e: astore 12
      // 170: aload 12
      // 172: astore 13
      // 174: aload 8
      // 176: bipush 6
      // 178: bipush 0
      // 179: bipush 6
      // 17b: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
      // 17e: astore 14
      // 180: aload 13
      // 182: aload 14
      // 184: invokevirtual net/minecraft/util/math/BlockPos.func_177973_b (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
      // 187: astore 13
      // 189: aload 13
      // 18b: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 18e: invokestatic java/lang/Math.abs (I)I
      // 191: aload 13
      // 193: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 196: invokestatic java/lang/Math.abs (I)I
      // 199: if_icmpne 1a3
      // 19c: goto 15a
      // 19f: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a2: athrow
      // 1a3: aload 13
      // 1a5: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 1a8: invokestatic java/lang/Math.abs (I)I
      // 1ab: aload 13
      // 1ad: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 1b0: invokestatic java/lang/Math.abs (I)I
      // 1b3: bipush 1
      // 1b4: isub
      // 1b5: if_icmpne 1bf
      // 1b8: goto 15a
      // 1bb: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1be: athrow
      // 1bf: aload 13
      // 1c1: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 1c4: invokestatic java/lang/Math.abs (I)I
      // 1c7: bipush 1
      // 1c8: isub
      // 1c9: aload 13
      // 1cb: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 1ce: invokestatic java/lang/Math.abs (I)I
      // 1d1: if_icmpne 1db
      // 1d4: goto 15a
      // 1d7: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1da: athrow
      // 1db: aload 13
      // 1dd: astore 10
      // 1df: goto 1e2
      // 1e2: aload 10
      // 1e4: ifnonnull 1ec
      // 1e7: return
      // 1e8: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1eb: athrow
      // 1ec: new net/minecraft/util/math/Vec3i
      // 1ef: dup
      // 1f0: bipush 0
      // 1f1: bipush 0
      // 1f2: bipush 0
      // 1f3: invokespecial net/minecraft/util/math/Vec3i.<init> (III)V
      // 1f6: astore 13
      // 1f8: fconst_0
      // 1f9: fstore 14
      // 1fb: aload 10
      // 1fd: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 200: bipush -6
      // 202: if_icmpne 216
      // 205: getstatic net/minecraft/util/Rotation.NONE Lnet/minecraft/util/Rotation;
      // 208: astore 11
      // 20a: getstatic com/schnurritv/sexmod/ct.V Lnet/minecraft/util/math/Vec3d;
      // 20d: astore 12
      // 20f: ldc 180.0
      // 211: fstore 14
      // 213: goto 294
      // 216: aload 10
      // 218: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 21b: bipush 5
      // 21c: if_icmpne 243
      // 21f: getstatic net/minecraft/util/Rotation.CLOCKWISE_90 Lnet/minecraft/util/Rotation;
      // 222: astore 11
      // 224: getstatic com/schnurritv/sexmod/ct.aj Lnet/minecraft/util/math/Vec3d;
      // 227: astore 12
      // 229: new net/minecraft/util/math/Vec3i
      // 22c: dup
      // 22d: getstatic com/schnurritv/sexmod/ct.ad Lnet/minecraft/util/math/Vec3i;
      // 230: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 233: bipush 1
      // 234: isub
      // 235: bipush 0
      // 236: bipush 0
      // 237: invokespecial net/minecraft/util/math/Vec3i.<init> (III)V
      // 23a: astore 13
      // 23c: ldc -90.0
      // 23e: fstore 14
      // 240: goto 294
      // 243: aload 10
      // 245: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 248: bipush 5
      // 249: if_icmpne 273
      // 24c: getstatic net/minecraft/util/Rotation.CLOCKWISE_180 Lnet/minecraft/util/Rotation;
      // 24f: astore 11
      // 251: getstatic com/schnurritv/sexmod/ct.Z Lnet/minecraft/util/math/Vec3d;
      // 254: astore 12
      // 256: new net/minecraft/util/math/Vec3i
      // 259: dup
      // 25a: getstatic com/schnurritv/sexmod/ct.ad Lnet/minecraft/util/math/Vec3i;
      // 25d: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 260: bipush 1
      // 261: isub
      // 262: bipush 0
      // 263: getstatic com/schnurritv/sexmod/ct.ad Lnet/minecraft/util/math/Vec3i;
      // 266: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 269: bipush 1
      // 26a: isub
      // 26b: invokespecial net/minecraft/util/math/Vec3i.<init> (III)V
      // 26e: astore 13
      // 270: goto 294
      // 273: getstatic net/minecraft/util/Rotation.COUNTERCLOCKWISE_90 Lnet/minecraft/util/Rotation;
      // 276: astore 11
      // 278: getstatic com/schnurritv/sexmod/ct.ao Lnet/minecraft/util/math/Vec3d;
      // 27b: astore 12
      // 27d: new net/minecraft/util/math/Vec3i
      // 280: dup
      // 281: bipush 0
      // 282: bipush 0
      // 283: getstatic com/schnurritv/sexmod/ct.ad Lnet/minecraft/util/math/Vec3i;
      // 286: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 289: bipush 1
      // 28a: isub
      // 28b: invokespecial net/minecraft/util/math/Vec3i.<init> (III)V
      // 28e: astore 13
      // 290: ldc 90.0
      // 292: fstore 14
      // 294: new com/schnurritv/sexmod/ab
      // 297: dup
      // 298: ldc "goblin"
      // 29a: invokespecial com/schnurritv/sexmod/ab.<init> (Ljava/lang/String;)V
      // 29d: aload 1
      // 29e: aload 8
      // 2a0: bipush 0
      // 2a1: bipush -1
      // 2a2: bipush 0
      // 2a3: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
      // 2a6: aload 13
      // 2a8: invokevirtual net/minecraft/util/math/BlockPos.func_177971_a (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
      // 2ab: aload 11
      // 2ad: invokevirtual com/schnurritv/sexmod/ab.a (Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;)V
      // 2b0: aload 12
      // 2b2: aload 13
      // 2b4: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 2b7: i2d
      // 2b8: aload 13
      // 2ba: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
      // 2bd: i2d
      // 2be: aload 13
      // 2c0: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 2c3: i2d
      // 2c4: invokevirtual net/minecraft/util/math/Vec3d.func_72441_c (DDD)Lnet/minecraft/util/math/Vec3d;
      // 2c7: pop
      // 2c8: new net/minecraft/util/math/Vec3d
      // 2cb: dup
      // 2cc: aload 8
      // 2ce: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 2d1: i2d
      // 2d2: aload 12
      // 2d4: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 2d7: dadd
      // 2d8: ldc2_w 0.5
      // 2db: dadd
      // 2dc: aload 8
      // 2de: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
      // 2e1: i2d
      // 2e2: aload 12
      // 2e4: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 2e7: dadd
      // 2e8: aload 8
      // 2ea: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 2ed: i2d
      // 2ee: aload 12
      // 2f0: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 2f3: dadd
      // 2f4: ldc2_w 0.5
      // 2f7: dadd
      // 2f8: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 2fb: astore 12
      // 2fd: new com/schnurritv/sexmod/ct
      // 300: dup
      // 301: aload 1
      // 302: bipush 1
      // 303: fload 14
      // 305: aload 12
      // 307: invokespecial com/schnurritv/sexmod/ct.<init> (Lnet/minecraft/world/World;ZFLnet/minecraft/util/math/Vec3d;)V
      // 30a: astore 15
      // 30c: aload 15
      // 30e: bipush 1
      // 30f: putfield com/schnurritv/sexmod/ct.field_98038_p Z
      // 312: aload 1
      // 313: aload 15
      // 315: invokevirtual net/minecraft/world/World.func_72838_d (Lnet/minecraft/entity/Entity;)Z
      // 318: pop
      // 319: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 31c: new java/lang/StringBuilder
      // 31f: dup
      // 320: invokespecial java/lang/StringBuilder.<init> ()V
      // 323: ldc "generated @ "
      // 325: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 328: iload 5
      // 32a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 32d: ldc " "
      // 32f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 332: iload 7
      // 334: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 337: ldc " "
      // 339: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33c: iload 6
      // 33e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 341: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 344: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 347: aload 1
      // 348: iload 3
      // 349: iload 4
      // 34b: invokevirtual net/minecraft/world/World.func_72964_e (II)Lnet/minecraft/world/chunk/Chunk;
      // 34e: invokevirtual net/minecraft/world/chunk/Chunk.func_76630_e ()V
      // 351: return
      // try (59 -> 64): 65 java/lang/RuntimeException
      // try (61 -> 71): 72 java/lang/RuntimeException
      // try (67 -> 75): 75 java/lang/RuntimeException
      // try (77 -> 83): 84 java/lang/RuntimeException
      // try (79 -> 88): 89 java/lang/RuntimeException
      // try (86 -> 95): 96 java/lang/RuntimeException
      // try (91 -> 100): 101 java/lang/RuntimeException
      // try (98 -> 107): 108 java/lang/RuntimeException
      // try (103 -> 115): 116 java/lang/RuntimeException
      // try (110 -> 122): 123 java/lang/RuntimeException
      // try (131 -> 138): 139 java/lang/RuntimeException
      // try (134 -> 142): 142 java/lang/RuntimeException
      // try (168 -> 176): 176 java/lang/RuntimeException
      // try (178 -> 188): 188 java/lang/RuntimeException
      // try (190 -> 200): 200 java/lang/RuntimeException
      // try (205 -> 208): 208 java/lang/RuntimeException
   }

   void a(World var1, Random var2, int var3, int var4) {
      try {
         if (var2.nextDouble() > 0.004F) {
            return;
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      int var5 = var3 * 16 + 8;
      int var6 = var4 * 16 + 8;
      int var7 = b1.a(var1, var5, var6);

      try {
         if (var1.func_180495_p(new BlockPos(var5, var7, var6)).func_185904_a().func_76224_d()) {
            return;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      bK.a(var1, new Vec3d(var5, var7, var6));
   }

   private void a(
      WorldGenerator param1,
      World param2,
      Random param3,
      int param4,
      int param5,
      HashSet<Biome> param6,
      Vec3i param7,
      int param8,
      boolean param9,
      boolean param10,
      int param11
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 3
      // 001: iload 11
      // 003: invokevirtual java/util/Random.nextInt (I)I
      // 006: ifeq 00e
      // 009: return
      // 00a: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 00d: athrow
      // 00e: iload 4
      // 010: bipush 16
      // 012: imul
      // 013: bipush 16
      // 015: aload 7
      // 017: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 01a: isub
      // 01b: bipush 2
      // 01c: idiv
      // 01d: iadd
      // 01e: istore 12
      // 020: iload 5
      // 022: bipush 16
      // 024: imul
      // 025: bipush 16
      // 027: aload 7
      // 029: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 02c: isub
      // 02d: bipush 2
      // 02e: idiv
      // 02f: iadd
      // 030: istore 13
      // 032: aload 2
      // 033: getfield net/minecraft/world/World.field_73011_w Lnet/minecraft/world/WorldProvider;
      // 036: new net/minecraft/util/math/BlockPos
      // 039: dup
      // 03a: iload 12
      // 03c: bipush 80
      // 03e: iload 13
      // 040: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
      // 043: invokevirtual net/minecraft/world/WorldProvider.getBiomeForCoords (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;
      // 046: astore 14
      // 048: aload 6
      // 04a: aload 14
      // 04c: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 04f: ifne 057
      // 052: return
      // 053: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 056: athrow
      // 057: ldc -2147483648
      // 059: istore 15
      // 05b: ldc 2147483647
      // 05d: istore 16
      // 05f: iload 12
      // 061: istore 17
      // 063: iload 17
      // 065: iload 12
      // 067: aload 7
      // 069: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 06c: iadd
      // 06d: if_icmpge 0da
      // 070: iload 13
      // 072: istore 18
      // 074: iload 18
      // 076: iload 13
      // 078: aload 7
      // 07a: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 07d: iadd
      // 07e: if_icmpge 0d4
      // 081: aload 2
      // 082: iload 17
      // 084: iload 18
      // 086: invokestatic com/schnurritv/sexmod/b1.a (Lnet/minecraft/world/World;II)I
      // 089: istore 19
      // 08b: iload 10
      // 08d: ifeq 0b8
      // 090: aload 2
      // 091: new net/minecraft/util/math/BlockPos
      // 094: dup
      // 095: iload 17
      // 097: iload 19
      // 099: iload 18
      // 09b: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
      // 09e: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 0a1: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 0a6: getstatic net/minecraft/init/Blocks.field_150355_j Lnet/minecraft/block/BlockStaticLiquid;
      // 0a9: if_acmpne 0b8
      // 0ac: goto 0b3
      // 0af: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b2: athrow
      // 0b3: return
      // 0b4: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b7: athrow
      // 0b8: iload 19
      // 0ba: iload 15
      // 0bc: if_icmple 0c3
      // 0bf: iload 19
      // 0c1: istore 15
      // 0c3: iload 19
      // 0c5: iload 16
      // 0c7: if_icmpge 0ce
      // 0ca: iload 19
      // 0cc: istore 16
      // 0ce: iinc 18 1
      // 0d1: goto 074
      // 0d4: iinc 17 1
      // 0d7: goto 063
      // 0da: iload 15
      // 0dc: iload 16
      // 0de: isub
      // 0df: iload 8
      // 0e1: if_icmple 0e9
      // 0e4: return
      // 0e5: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e8: athrow
      // 0e9: iload 15
      // 0eb: istore 17
      // 0ed: aload 1
      // 0ee: aload 2
      // 0ef: aload 3
      // 0f0: new net/minecraft/util/math/BlockPos
      // 0f3: dup
      // 0f4: iload 12
      // 0f6: iload 17
      // 0f8: iload 13
      // 0fa: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
      // 0fd: invokevirtual net/minecraft/world/gen/feature/WorldGenerator.func_180709_b (Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z
      // 100: pop
      // 101: iload 9
      // 103: ifne 10b
      // 106: return
      // 107: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10a: athrow
      // 10b: bipush 1
      // 10c: istore 18
      // 10e: iload 17
      // 110: bipush 1
      // 111: isub
      // 112: istore 19
      // 114: iload 18
      // 116: ifeq 1c6
      // 119: bipush 0
      // 11a: istore 18
      // 11c: new net/minecraft/util/math/Vec3i
      // 11f: dup
      // 120: aload 7
      // 122: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 125: bipush 2
      // 126: iadd
      // 127: bipush 0
      // 128: aload 7
      // 12a: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 12d: bipush 2
      // 12e: iadd
      // 12f: invokespecial net/minecraft/util/math/Vec3i.<init> (III)V
      // 132: astore 7
      // 134: iinc 12 -1
      // 137: iinc 13 -1
      // 13a: iload 12
      // 13c: istore 20
      // 13e: iload 20
      // 140: iload 12
      // 142: aload 7
      // 144: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 147: iadd
      // 148: if_icmpge 1c0
      // 14b: iload 13
      // 14d: istore 21
      // 14f: iload 21
      // 151: iload 13
      // 153: aload 7
      // 155: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 158: iadd
      // 159: if_icmpge 1ba
      // 15c: new net/minecraft/util/math/BlockPos
      // 15f: dup
      // 160: iload 20
      // 162: iload 19
      // 164: iload 21
      // 166: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
      // 169: astore 22
      // 16b: aload 2
      // 16c: aload 22
      // 16e: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 171: astore 23
      // 173: aload 23
      // 175: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 17a: aload 2
      // 17b: aload 22
      // 17d: invokevirtual net/minecraft/block/Block.func_176205_b (Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z
      // 180: ifne 18a
      // 183: goto 1b4
      // 186: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 189: athrow
      // 18a: aload 2
      // 18b: aload 22
      // 18d: invokevirtual net/minecraft/world/World.func_175678_i (Lnet/minecraft/util/math/BlockPos;)Z
      // 190: ifeq 1a0
      // 193: getstatic net/minecraft/init/Blocks.field_150349_c Lnet/minecraft/block/BlockGrass;
      // 196: invokevirtual net/minecraft/block/BlockGrass.func_176223_P ()Lnet/minecraft/block/state/IBlockState;
      // 199: goto 1a6
      // 19c: invokestatic com/schnurritv/sexmod/t.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19f: athrow
      // 1a0: getstatic net/minecraft/init/Blocks.field_150346_d Lnet/minecraft/block/Block;
      // 1a3: invokevirtual net/minecraft/block/Block.func_176223_P ()Lnet/minecraft/block/state/IBlockState;
      // 1a6: astore 23
      // 1a8: aload 2
      // 1a9: aload 22
      // 1ab: aload 23
      // 1ad: invokevirtual net/minecraft/world/World.func_175656_a (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z
      // 1b0: pop
      // 1b1: bipush 1
      // 1b2: istore 18
      // 1b4: iinc 21 1
      // 1b7: goto 14f
      // 1ba: iinc 20 1
      // 1bd: goto 13e
      // 1c0: iinc 19 -1
      // 1c3: goto 114
      // 1c6: return
      // try (0 -> 5): 5 java/lang/RuntimeException
      // try (39 -> 44): 44 java/lang/RuntimeException
      // try (71 -> 84): 85 java/lang/RuntimeException
      // try (73 -> 88): 88 java/lang/RuntimeException
      // try (104 -> 110): 110 java/lang/RuntimeException
      // try (114 -> 128): 128 java/lang/RuntimeException
      // try (182 -> 189): 189 java/lang/RuntimeException
      // try (191 -> 198): 198 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
