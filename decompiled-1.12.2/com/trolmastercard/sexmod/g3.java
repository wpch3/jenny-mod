package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import net.minecraft.init.Biomes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.event.world.WorldEvent.Load;
import net.minecraftforge.event.world.WorldEvent.Save;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class g3 extends WorldSavedData implements IWorldGenerator {
    static final String j = "sexmod:generation";
    static final int h = 156;
    static final int a = 62;
    static final int b = 6;
    final double f = 0.004F;
    public static boolean i = true;
    final List<g3.b> e = new ArrayList<>();
    final List<g3.a> d = new ArrayList<>();
    private static g3 g = null;
    static boolean c = true;

    public static g3 b() {
        try {
            if (g == null) {
                g = new g3();
            }
        } catch (RuntimeException var0) {
            throw a(var0);
        }

        return g;
    }

    public g3(String var1) {
        this();
    }

    private g3() {
        super("sexmod:generation");
        g = this;
        this.e
            .add(
                new g3.b(
                    "ellie",
                    new HashSet<>(Arrays.asList(Biomes.field_150578_U, Biomes.field_150584_S, Biomes.field_76768_g, Biomes.field_150585_R)),
                    new Vec3i(30, 27, 26),
                    9,
                    true
                )
            );
        this.e.add(new g3.b("jenny", new HashSet<>(Arrays.asList(Biomes.field_76772_c, Biomes.field_76767_f)), new Vec3i(9, 4, 9), 1, true));
        this.e
            .add(
                new g3.b(
                    "ellie",
                    new HashSet<>(Arrays.asList(Biomes.field_150578_U, Biomes.field_150584_S, Biomes.field_76768_g, Biomes.field_150585_R)),
                    new Vec3i(30, 27, 26),
                    9,
                    true
                )
            );
        this.e.add(new g3.b("bia", new HashSet<>(Arrays.asList(Biomes.field_185448_Z, Biomes.field_150583_P)), new Vec3i(11, 9, 15), 2, true));
        this.e.add(new g3.b("luna", new HashSet<>(Arrays.asList(Biomes.field_76771_b, Biomes.field_150575_M)), new Vec3i(3, 7, 10), 0, false));
    }

    public void a() {
        this.d.clear();
    }

    @SubscribeEvent
    public void a(Save var1) {
        World var2 = var1.getWorld();
        var2.func_175693_T().func_75745_a("sexmod:generation", this);
        this.func_76185_a();
    }

    @SubscribeEvent
    public void a(Load var1) {
        World var2 = var1.getWorld();
        var2.func_175693_T().func_75742_a(g3.class, "sexmod:generation");
    }

    public void func_76184_a(NBTTagCompound var1) {
        this.a();
        NBTTagCompound var2 = var1.func_74775_l("sexmod:generation");
        int var3 = 0;

        while (true) {
            String var4 = var2.func_74779_i("sexmod:name" + var3);
            String var5 = var2.func_74779_i("sexmod:pos" + var3);

            try {
                if ("".equals(var4)) {
                    break;
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            try {
                if ("".equals(var5)) {
                    break;
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }

            this.d.add(new g3.a(a(var5), var4));
            var3++;
        }
    }

    public NBTTagCompound func_189551_b(NBTTagCompound var1) {
        var1.func_74782_a("sexmod:generation", new NBTTagCompound());
        NBTTagCompound var2 = new NBTTagCompound();
        int var3 = 0;

        for (g3.a var5 : this.d) {
            var2.func_74778_a("sexmod:name" + var3, var5.a);
            var2.func_74778_a("sexmod:pos" + var3++, a(var5.b));
        }

        var1.func_74782_a("sexmod:generation", var2);
        return var1;
    }

    static String a(e1 var0) {
        return var0.c + "|" + var0.b;
    }

    static e1 a(String var0) {
        String[] var1 = var0.split("\\|");
        return new e1(Integer.parseInt(var1[0]), Integer.parseInt(var1[1]));
    }

    public void generate(Random var1, int var2, int var3, World var4, IChunkGenerator var5, IChunkProvider var6) {
        try {
            if (!i) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (var4.func_175624_G() == WorldType.field_77138_c) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        this.b(var4, var1, var2, var3);
        this.a(var4, var1, var2, var3);
        this.a(var1, var2, var3, var4);
    }

    void a(Random var1, int var2, int var3, World var4) {
        try {
            if (!c) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        c = false;

        for (g3.b var6 : this.e) {
            this.a(var6, var1, var2, var3, var4);
        }

        c = true;
    }

    void a(g3.b param1, Random param2, int param3, int param4, World param5) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/g3.d Ljava/util/List;
        // 004: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 009: astore 6
        // 00b: aload 6
        // 00d: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 012: ifeq 058
        // 015: aload 6
        // 017: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 01c: checkcast com/trolmastercard/sexmod/g3$a
        // 01f: astore 7
        // 021: aload 7
        // 023: getfield com/trolmastercard/sexmod/g3$a.a Ljava/lang/String;
        // 026: aload 1
        // 027: getfield com/trolmastercard/sexmod/g3$b.f Ljava/lang/String;
        // 02a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 02d: ifeq 03a
        // 030: sipush 156
        // 033: goto 03c
        // 036: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 039: athrow
        // 03a: bipush 62
        // 03c: istore 8
        // 03e: aload 7
        // 040: getfield com/trolmastercard/sexmod/g3$a.b Lcom/trolmastercard/sexmod/e1;
        // 043: iload 3
        // 044: iload 4
        // 046: invokevirtual com/trolmastercard/sexmod/e1.a (II)F
        // 049: iload 8
        // 04b: i2f
        // 04c: fcmpg
        // 04d: ifge 055
        // 050: return
        // 051: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 054: athrow
        // 055: goto 00b
        // 058: aload 1
        // 059: getfield com/trolmastercard/sexmod/g3$b.c Lnet/minecraft/util/math/Vec3i;
        // 05c: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 05f: istore 6
        // 061: aload 1
        // 062: getfield com/trolmastercard/sexmod/g3$b.c Lnet/minecraft/util/math/Vec3i;
        // 065: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 068: istore 7
        // 06a: iload 3
        // 06b: bipush 16
        // 06d: imul
        // 06e: bipush 16
        // 070: iload 6
        // 072: isub
        // 073: bipush 2
        // 074: idiv
        // 075: iadd
        // 076: istore 8
        // 078: iload 4
        // 07a: bipush 16
        // 07c: imul
        // 07d: bipush 16
        // 07f: iload 7
        // 081: isub
        // 082: bipush 2
        // 083: idiv
        // 084: iadd
        // 085: istore 9
        // 087: aload 5
        // 089: getfield net/minecraft/world/World.field_73011_w Lnet/minecraft/world/WorldProvider;
        // 08c: new net/minecraft/util/math/BlockPos
        // 08f: dup
        // 090: iload 8
        // 092: bipush 80
        // 094: iload 9
        // 096: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
        // 099: invokevirtual net/minecraft/world/WorldProvider.getBiomeForCoords (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;
        // 09c: astore 10
        // 09e: aload 1
        // 09f: getfield com/trolmastercard/sexmod/g3$b.e Ljava/util/HashSet;
        // 0a2: aload 10
        // 0a4: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 0a7: ifne 0af
        // 0aa: return
        // 0ab: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ae: athrow
        // 0af: ldc -2147483648
        // 0b1: istore 11
        // 0b3: ldc 2147483647
        // 0b5: istore 12
        // 0b7: iload 8
        // 0b9: istore 13
        // 0bb: iload 13
        // 0bd: iload 8
        // 0bf: iload 6
        // 0c1: iadd
        // 0c2: if_icmpge 130
        // 0c5: iload 9
        // 0c7: istore 14
        // 0c9: iload 14
        // 0cb: iload 9
        // 0cd: iload 7
        // 0cf: iadd
        // 0d0: if_icmpge 12a
        // 0d3: aload 5
        // 0d5: iload 13
        // 0d7: iload 14
        // 0d9: invokestatic com/trolmastercard/sexmod/cj.a (Lnet/minecraft/world/World;II)I
        // 0dc: istore 15
        // 0de: aload 1
        // 0df: getfield com/trolmastercard/sexmod/g3$b.d Z
        // 0e2: ifeq 10e
        // 0e5: aload 5
        // 0e7: new net/minecraft/util/math/BlockPos
        // 0ea: dup
        // 0eb: iload 13
        // 0ed: iload 15
        // 0ef: iload 14
        // 0f1: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
        // 0f4: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 0f7: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 0fc: getstatic net/minecraft/init/Blocks.field_150355_j Lnet/minecraft/block/BlockStaticLiquid;
        // 0ff: if_acmpne 10e
        // 102: goto 109
        // 105: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 108: athrow
        // 109: return
        // 10a: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 10d: athrow
        // 10e: iload 15
        // 110: iload 11
        // 112: if_icmple 119
        // 115: iload 15
        // 117: istore 11
        // 119: iload 15
        // 11b: iload 12
        // 11d: if_icmpge 124
        // 120: iload 15
        // 122: istore 12
        // 124: iinc 14 1
        // 127: goto 0c9
        // 12a: iinc 13 1
        // 12d: goto 0bb
        // 130: iload 11
        // 132: iload 12
        // 134: isub
        // 135: aload 1
        // 136: getfield com/trolmastercard/sexmod/g3$b.a I
        // 139: if_icmple 141
        // 13c: return
        // 13d: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 140: athrow
        // 141: iload 11
        // 143: istore 13
        // 145: aload 0
        // 146: getfield com/trolmastercard/sexmod/g3.d Ljava/util/List;
        // 149: new com/trolmastercard/sexmod/g3$a
        // 14c: dup
        // 14d: new com/trolmastercard/sexmod/e1
        // 150: dup
        // 151: iload 3
        // 152: iload 4
        // 154: invokespecial com/trolmastercard/sexmod/e1.<init> (II)V
        // 157: aload 1
        // 158: getfield com/trolmastercard/sexmod/g3$b.f Ljava/lang/String;
        // 15b: invokespecial com/trolmastercard/sexmod/g3$a.<init> (Lcom/trolmastercard/sexmod/e1;Ljava/lang/String;)V
        // 15e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
        // 163: pop
        // 164: aload 1
        // 165: getfield com/trolmastercard/sexmod/g3$b.b Lcom/trolmastercard/sexmod/b4;
        // 168: aload 5
        // 16a: aload 2
        // 16b: new net/minecraft/util/math/BlockPos
        // 16e: dup
        // 16f: iload 8
        // 171: iload 13
        // 173: iload 9
        // 175: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
        // 178: invokevirtual com/trolmastercard/sexmod/b4.func_180709_b (Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z
        // 17b: pop
        // 17c: aload 1
        // 17d: getfield com/trolmastercard/sexmod/g3$b.d Z
        // 180: ifne 188
        // 183: return
        // 184: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 187: athrow
        // 188: bipush 1
        // 189: istore 14
        // 18b: iload 13
        // 18d: bipush 1
        // 18e: isub
        // 18f: istore 15
        // 191: iload 14
        // 193: ifeq 241
        // 196: bipush 0
        // 197: istore 14
        // 199: new net/minecraft/util/math/Vec3i
        // 19c: dup
        // 19d: iload 6
        // 19f: bipush 2
        // 1a0: iadd
        // 1a1: bipush 0
        // 1a2: iload 7
        // 1a4: bipush 2
        // 1a5: iadd
        // 1a6: invokespecial net/minecraft/util/math/Vec3i.<init> (III)V
        // 1a9: astore 16
        // 1ab: iinc 8 -1
        // 1ae: iinc 9 -1
        // 1b1: iload 8
        // 1b3: istore 17
        // 1b5: iload 17
        // 1b7: iload 8
        // 1b9: aload 16
        // 1bb: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 1be: iadd
        // 1bf: if_icmpge 23b
        // 1c2: iload 9
        // 1c4: istore 18
        // 1c6: iload 18
        // 1c8: iload 9
        // 1ca: aload 16
        // 1cc: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 1cf: iadd
        // 1d0: if_icmpge 235
        // 1d3: new net/minecraft/util/math/BlockPos
        // 1d6: dup
        // 1d7: iload 17
        // 1d9: iload 15
        // 1db: iload 18
        // 1dd: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
        // 1e0: astore 19
        // 1e2: aload 5
        // 1e4: aload 19
        // 1e6: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 1e9: astore 20
        // 1eb: aload 20
        // 1ed: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 1f2: aload 5
        // 1f4: aload 19
        // 1f6: invokevirtual net/minecraft/block/Block.func_176205_b (Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z
        // 1f9: ifne 203
        // 1fc: goto 22f
        // 1ff: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 202: athrow
        // 203: aload 5
        // 205: aload 19
        // 207: invokevirtual net/minecraft/world/World.func_175678_i (Lnet/minecraft/util/math/BlockPos;)Z
        // 20a: ifeq 21a
        // 20d: getstatic net/minecraft/init/Blocks.field_150349_c Lnet/minecraft/block/BlockGrass;
        // 210: invokevirtual net/minecraft/block/BlockGrass.func_176223_P ()Lnet/minecraft/block/state/IBlockState;
        // 213: goto 220
        // 216: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 219: athrow
        // 21a: getstatic net/minecraft/init/Blocks.field_150346_d Lnet/minecraft/block/Block;
        // 21d: invokevirtual net/minecraft/block/Block.func_176223_P ()Lnet/minecraft/block/state/IBlockState;
        // 220: astore 20
        // 222: aload 5
        // 224: aload 19
        // 226: aload 20
        // 228: invokevirtual net/minecraft/world/World.func_175656_a (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z
        // 22b: pop
        // 22c: bipush 1
        // 22d: istore 14
        // 22f: iinc 18 1
        // 232: goto 1c6
        // 235: iinc 17 1
        // 238: goto 1b5
        // 23b: iinc 15 -1
        // 23e: goto 191
        // 241: return
        // try (11 -> 19): 19 java/lang/RuntimeException
        // try (23 -> 33): 33 java/lang/RuntimeException
        // try (74 -> 80): 80 java/lang/RuntimeException
        // try (105 -> 119): 120 java/lang/RuntimeException
        // try (108 -> 123): 123 java/lang/RuntimeException
        // try (139 -> 146): 146 java/lang/RuntimeException
        // try (150 -> 180): 180 java/lang/RuntimeException
        // try (232 -> 239): 239 java/lang/RuntimeException
        // try (241 -> 248): 248 java/lang/RuntimeException
    }

    void b(World var1, Random var2, int var3, int var4) {
        try {
            if (var2.nextDouble() > 0.004F) {
                return;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        int var5 = var3 * 16 + 8;
        int var6 = var4 * 16 + 8;
        int var7 = cj.a(var1, var5, var6);

        try {
            if (var1.func_180495_p(new BlockPos(var5, var7, var6)).func_185904_a().func_76224_d()) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        ax.a(var1, new Vec3d(var5, var7, var6));
    }

    void a(World param1, Random param2, int param3, int param4) {
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
        // 037: getstatic com/trolmastercard/sexmod/e3.ah Lnet/minecraft/util/math/Vec3i;
        // 03a: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 03d: if_icmpgt 12d
        // 040: bipush -1
        // 041: istore 11
        // 043: iload 11
        // 045: getstatic com/trolmastercard/sexmod/e3.ah Lnet/minecraft/util/math/Vec3i;
        // 048: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
        // 04b: if_icmpgt 127
        // 04e: bipush 0
        // 04f: istore 12
        // 051: iload 12
        // 053: getstatic com/trolmastercard/sexmod/e3.ah Lnet/minecraft/util/math/Vec3i;
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
        // 08b: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 08e: athrow
        // 08f: iload 11
        // 091: getstatic com/trolmastercard/sexmod/e3.ah Lnet/minecraft/util/math/Vec3i;
        // 094: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
        // 097: if_icmpne 0a6
        // 09a: goto 0a1
        // 09d: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a0: athrow
        // 0a1: return
        // 0a2: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a5: athrow
        // 0a6: iload 10
        // 0a8: ifeq 0db
        // 0ab: iload 10
        // 0ad: getstatic com/trolmastercard/sexmod/e3.ah Lnet/minecraft/util/math/Vec3i;
        // 0b0: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 0b3: if_icmpeq 0db
        // 0b6: goto 0bd
        // 0b9: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0bc: athrow
        // 0bd: iload 12
        // 0bf: ifeq 0db
        // 0c2: goto 0c9
        // 0c5: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0c8: athrow
        // 0c9: iload 12
        // 0cb: getstatic com/trolmastercard/sexmod/e3.ah Lnet/minecraft/util/math/Vec3i;
        // 0ce: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 0d1: if_icmpne 11b
        // 0d4: goto 0db
        // 0d7: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0da: athrow
        // 0db: iload 11
        // 0dd: ifne 11b
        // 0e0: goto 0e7
        // 0e3: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e6: athrow
        // 0e7: aload 1
        // 0e8: aload 13
        // 0ea: invokevirtual net/minecraft/world/World.func_175623_d (Lnet/minecraft/util/math/BlockPos;)Z
        // 0ed: ifeq 11b
        // 0f0: goto 0f7
        // 0f3: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0f6: athrow
        // 0f7: aload 1
        // 0f8: aload 13
        // 0fa: invokevirtual net/minecraft/util/math/BlockPos.func_177984_a ()Lnet/minecraft/util/math/BlockPos;
        // 0fd: invokevirtual net/minecraft/world/World.func_175623_d (Lnet/minecraft/util/math/BlockPos;)Z
        // 100: ifeq 11b
        // 103: goto 10a
        // 106: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 109: athrow
        // 10a: aload 9
        // 10c: aload 13
        // 10e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
        // 113: pop
        // 114: goto 11b
        // 117: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
        // 145: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 148: athrow
        // 149: return
        // 14a: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
        // 19f: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
        // 1bb: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
        // 1d7: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1da: athrow
        // 1db: aload 13
        // 1dd: astore 10
        // 1df: goto 1e2
        // 1e2: aload 10
        // 1e4: ifnonnull 1ec
        // 1e7: return
        // 1e8: invokestatic com/trolmastercard/sexmod/g3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
        // 20a: getstatic com/trolmastercard/sexmod/e3.aB Lnet/minecraft/util/math/Vec3d;
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
        // 224: getstatic com/trolmastercard/sexmod/e3.ao Lnet/minecraft/util/math/Vec3d;
        // 227: astore 12
        // 229: new net/minecraft/util/math/Vec3i
        // 22c: dup
        // 22d: getstatic com/trolmastercard/sexmod/e3.ah Lnet/minecraft/util/math/Vec3i;
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
        // 251: getstatic com/trolmastercard/sexmod/e3.aM Lnet/minecraft/util/math/Vec3d;
        // 254: astore 12
        // 256: new net/minecraft/util/math/Vec3i
        // 259: dup
        // 25a: getstatic com/trolmastercard/sexmod/e3.ah Lnet/minecraft/util/math/Vec3i;
        // 25d: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 260: bipush 1
        // 261: isub
        // 262: bipush 0
        // 263: getstatic com/trolmastercard/sexmod/e3.ah Lnet/minecraft/util/math/Vec3i;
        // 266: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 269: bipush 1
        // 26a: isub
        // 26b: invokespecial net/minecraft/util/math/Vec3i.<init> (III)V
        // 26e: astore 13
        // 270: goto 294
        // 273: getstatic net/minecraft/util/Rotation.COUNTERCLOCKWISE_90 Lnet/minecraft/util/Rotation;
        // 276: astore 11
        // 278: getstatic com/trolmastercard/sexmod/e3.U Lnet/minecraft/util/math/Vec3d;
        // 27b: astore 12
        // 27d: new net/minecraft/util/math/Vec3i
        // 280: dup
        // 281: bipush 0
        // 282: bipush 0
        // 283: getstatic com/trolmastercard/sexmod/e3.ah Lnet/minecraft/util/math/Vec3i;
        // 286: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 289: bipush 1
        // 28a: isub
        // 28b: invokespecial net/minecraft/util/math/Vec3i.<init> (III)V
        // 28e: astore 13
        // 290: ldc 90.0
        // 292: fstore 14
        // 294: new com/trolmastercard/sexmod/b4
        // 297: dup
        // 298: ldc "goblin"
        // 29a: invokespecial com/trolmastercard/sexmod/b4.<init> (Ljava/lang/String;)V
        // 29d: aload 1
        // 29e: aload 8
        // 2a0: bipush 0
        // 2a1: bipush -1
        // 2a2: bipush 0
        // 2a3: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 2a6: aload 13
        // 2a8: invokevirtual net/minecraft/util/math/BlockPos.func_177971_a (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
        // 2ab: aload 11
        // 2ad: invokevirtual com/trolmastercard/sexmod/b4.a (Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;)V
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
        // 2fd: new com/trolmastercard/sexmod/e3
        // 300: dup
        // 301: aload 1
        // 302: bipush 1
        // 303: fload 14
        // 305: aload 12
        // 307: invokespecial com/trolmastercard/sexmod/e3.<init> (Lnet/minecraft/world/World;ZFLnet/minecraft/util/math/Vec3d;)V
        // 30a: astore 15
        // 30c: aload 15
        // 30e: bipush 1
        // 30f: putfield com/trolmastercard/sexmod/e3.field_98038_p Z
        // 312: aload 1
        // 313: aload 15
        // 315: invokevirtual net/minecraft/world/World.func_72838_d (Lnet/minecraft/entity/Entity;)Z
        // 318: pop
        // 319: aload 1
        // 31a: iload 3
        // 31b: iload 4
        // 31d: invokevirtual net/minecraft/world/World.func_72964_e (II)Lnet/minecraft/world/chunk/Chunk;
        // 320: invokevirtual net/minecraft/world/chunk/Chunk.func_76630_e ()V
        // 323: return
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

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }

    static class a {
        e1 b;
        String a;

        public a(e1 var1, String var2) {
            this.b = var1;
            this.a = var2;
        }
    }

    static class b {
        public final String f;
        public final b4 b;
        public final HashSet<Biome> e;
        public final Vec3i c;
        public final boolean d;
        public final int a;

        public b(String var1, HashSet<Biome> var2, Vec3i var3, int var4, boolean var5) {
            this.f = var1;
            this.e = var2;
            this.c = var3;
            this.d = var5;
            this.a = var4;
            this.b = new b4(var1);
        }
    }
}
