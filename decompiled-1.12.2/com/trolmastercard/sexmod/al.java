package com.trolmastercard.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class al extends EntityLiving {
    public static final long b = 60000L;
    public static final float g = 3.0F;
    static final float c = 30.0F;
    static final int h = 175;
    static final int i = 10;
    BlockPos f = null;
    int d = 0;
    boolean e = false;
    public int a = -1;

    public al(World var1) {
        super(var1);
    }

    protected void func_70619_bc() {
        super.func_70619_bc();
        this.a();
    }

    void a() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/al.e Z
        // 004: ifeq 013
        // 007: aload 0
        // 008: invokevirtual com/trolmastercard/sexmod/al.func_70661_as ()Lnet/minecraft/pathfinding/PathNavigate;
        // 00b: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75499_g ()V
        // 00e: return
        // 00f: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 012: athrow
        // 013: aload 0
        // 014: getfield com/trolmastercard/sexmod/al.field_70170_p Lnet/minecraft/world/World;
        // 017: aload 0
        // 018: ldc2_w 15.0
        // 01b: invokevirtual net/minecraft/world/World.func_72890_a (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
        // 01e: astore 1
        // 01f: aload 1
        // 020: ifnull 041
        // 023: aload 1
        // 024: aload 0
        // 025: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70032_d (Lnet/minecraft/entity/Entity;)F
        // 028: ldc 3.0
        // 02a: fcmpg
        // 02b: ifge 041
        // 02e: goto 035
        // 031: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 034: athrow
        // 035: aload 0
        // 036: invokevirtual com/trolmastercard/sexmod/al.func_70661_as ()Lnet/minecraft/pathfinding/PathNavigate;
        // 039: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75499_g ()V
        // 03c: return
        // 03d: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 040: athrow
        // 041: aload 0
        // 042: getfield com/trolmastercard/sexmod/al.f Lnet/minecraft/util/math/BlockPos;
        // 045: ifnull 084
        // 048: aload 0
        // 049: aload 0
        // 04a: getfield com/trolmastercard/sexmod/al.f Lnet/minecraft/util/math/BlockPos;
        // 04d: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 050: i2d
        // 051: aload 0
        // 052: getfield com/trolmastercard/sexmod/al.f Lnet/minecraft/util/math/BlockPos;
        // 055: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 058: i2d
        // 059: aload 0
        // 05a: getfield com/trolmastercard/sexmod/al.f Lnet/minecraft/util/math/BlockPos;
        // 05d: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 060: i2d
        // 061: invokevirtual com/trolmastercard/sexmod/al.func_70011_f (DDD)D
        // 064: aload 0
        // 065: invokevirtual com/trolmastercard/sexmod/al.c ()D
        // 068: dcmpl
        // 069: ifgt 084
        // 06c: goto 073
        // 06f: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 072: athrow
        // 073: aload 0
        // 074: getfield com/trolmastercard/sexmod/al.d I
        // 077: sipush 175
        // 07a: if_icmple 125
        // 07d: goto 084
        // 080: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 083: athrow
        // 084: aload 0
        // 085: invokevirtual com/trolmastercard/sexmod/al.func_70681_au ()Ljava/util/Random;
        // 088: invokevirtual java/util/Random.nextBoolean ()Z
        // 08b: ifeq 09d
        // 08e: goto 095
        // 091: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 094: athrow
        // 095: bipush 1
        // 096: goto 09e
        // 099: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 09c: athrow
        // 09d: bipush -1
        // 09e: aload 0
        // 09f: invokevirtual com/trolmastercard/sexmod/al.func_70681_au ()Ljava/util/Random;
        // 0a2: bipush 10
        // 0a4: invokevirtual java/util/Random.nextInt (I)I
        // 0a7: imul
        // 0a8: istore 2
        // 0a9: aload 0
        // 0aa: invokevirtual com/trolmastercard/sexmod/al.func_70681_au ()Ljava/util/Random;
        // 0ad: invokevirtual java/util/Random.nextBoolean ()Z
        // 0b0: ifeq 0bb
        // 0b3: bipush 1
        // 0b4: goto 0bc
        // 0b7: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ba: athrow
        // 0bb: bipush -1
        // 0bc: aload 0
        // 0bd: invokevirtual com/trolmastercard/sexmod/al.func_70681_au ()Ljava/util/Random;
        // 0c0: bipush 10
        // 0c2: invokevirtual java/util/Random.nextInt (I)I
        // 0c5: imul
        // 0c6: istore 3
        // 0c7: aload 0
        // 0c8: getfield com/trolmastercard/sexmod/al.field_70170_p Lnet/minecraft/world/World;
        // 0cb: getfield net/minecraft/world/World.field_73011_w Lnet/minecraft/world/WorldProvider;
        // 0ce: invokevirtual net/minecraft/world/WorldProvider.func_186058_p ()Lnet/minecraft/world/DimensionType;
        // 0d1: getstatic net/minecraft/world/DimensionType.NETHER Lnet/minecraft/world/DimensionType;
        // 0d4: if_acmpne 0e6
        // 0d7: aload 0
        // 0d8: getfield com/trolmastercard/sexmod/al.field_70163_u D
        // 0db: invokestatic java/lang/Math.ceil (D)D
        // 0de: d2i
        // 0df: goto 0ff
        // 0e2: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e5: athrow
        // 0e6: aload 0
        // 0e7: getfield com/trolmastercard/sexmod/al.field_70170_p Lnet/minecraft/world/World;
        // 0ea: aload 0
        // 0eb: invokevirtual com/trolmastercard/sexmod/al.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 0ee: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 0f1: iload 2
        // 0f2: iadd
        // 0f3: aload 0
        // 0f4: invokevirtual com/trolmastercard/sexmod/al.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 0f7: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 0fa: iload 3
        // 0fb: iadd
        // 0fc: invokestatic com/trolmastercard/sexmod/cj.a (Lnet/minecraft/world/World;II)I
        // 0ff: istore 4
        // 101: aload 0
        // 102: new net/minecraft/util/math/BlockPos
        // 105: dup
        // 106: aload 0
        // 107: invokevirtual com/trolmastercard/sexmod/al.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 10a: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 10d: iload 2
        // 10e: iadd
        // 10f: iload 4
        // 111: aload 0
        // 112: invokevirtual com/trolmastercard/sexmod/al.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 115: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 118: iload 3
        // 119: iadd
        // 11a: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
        // 11d: putfield com/trolmastercard/sexmod/al.f Lnet/minecraft/util/math/BlockPos;
        // 120: aload 0
        // 121: bipush 0
        // 122: putfield com/trolmastercard/sexmod/al.d I
        // 125: aload 0
        // 126: getfield com/trolmastercard/sexmod/al.f Lnet/minecraft/util/math/BlockPos;
        // 129: aload 0
        // 12a: invokevirtual com/trolmastercard/sexmod/al.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 12d: invokevirtual net/minecraft/util/math/BlockPos.func_177951_i (Lnet/minecraft/util/math/Vec3i;)D
        // 130: invokestatic java/lang/Math.sqrt (D)D
        // 133: ldc2_w 2.0
        // 136: dcmpl
        // 137: ifle 168
        // 13a: aload 0
        // 13b: invokevirtual com/trolmastercard/sexmod/al.func_70661_as ()Lnet/minecraft/pathfinding/PathNavigate;
        // 13e: aload 0
        // 13f: getfield com/trolmastercard/sexmod/al.f Lnet/minecraft/util/math/BlockPos;
        // 142: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 145: i2d
        // 146: aload 0
        // 147: getfield com/trolmastercard/sexmod/al.f Lnet/minecraft/util/math/BlockPos;
        // 14a: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 14d: i2d
        // 14e: aload 0
        // 14f: getfield com/trolmastercard/sexmod/al.f Lnet/minecraft/util/math/BlockPos;
        // 152: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 155: i2d
        // 156: ldc2_w 0.3499999940395355
        // 159: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75492_a (DDDD)Z
        // 15c: pop
        // 15d: aload 0
        // 15e: invokevirtual com/trolmastercard/sexmod/al.d ()V
        // 161: goto 172
        // 164: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 167: athrow
        // 168: aload 0
        // 169: dup
        // 16a: getfield com/trolmastercard/sexmod/al.d I
        // 16d: bipush 1
        // 16e: iadd
        // 16f: putfield com/trolmastercard/sexmod/al.d I
        // 172: return
        // try (0 -> 7): 7 java/lang/RuntimeException
        // try (15 -> 23): 24 java/lang/RuntimeException
        // try (17 -> 30): 30 java/lang/RuntimeException
        // try (32 -> 53): 54 java/lang/RuntimeException
        // try (35 -> 60): 61 java/lang/RuntimeException
        // try (56 -> 67): 68 java/lang/RuntimeException
        // try (63 -> 72): 72 java/lang/RuntimeException
        // try (81 -> 87): 87 java/lang/RuntimeException
        // try (96 -> 107): 107 java/lang/RuntimeException
        // try (142 -> 171): 171 java/lang/RuntimeException
    }

    protected void d() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/al.func_70661_as ()Lnet/minecraft/pathfinding/PathNavigate;
        // 04: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75505_d ()Lnet/minecraft/pathfinding/Path;
        // 07: astore 1
        // 08: aload 1
        // 09: ifnonnull 11
        // 0c: return
        // 0d: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 10: athrow
        // 11: aload 0
        // 12: getfield com/trolmastercard/sexmod/al.field_70122_E Z
        // 15: ifne 26
        // 18: aload 0
        // 19: invokevirtual com/trolmastercard/sexmod/al.func_70090_H ()Z
        // 1c: ifeq 2b
        // 1f: goto 26
        // 22: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 25: athrow
        // 26: return
        // 27: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2a: athrow
        // 2b: aload 1
        // 2c: invokevirtual net/minecraft/pathfinding/Path.func_75873_e ()I
        // 2f: istore 2
        // 30: aload 1
        // 31: invokevirtual net/minecraft/pathfinding/Path.func_75874_d ()I
        // 34: istore 3
        // 35: iload 3
        // 36: iload 2
        // 37: if_icmpeq 48
        // 3a: iload 3
        // 3b: bipush 1
        // 3c: isub
        // 3d: iload 2
        // 3e: if_icmpne 4d
        // 41: goto 48
        // 44: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 47: athrow
        // 48: return
        // 49: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4c: athrow
        // 4d: aload 1
        // 4e: iload 2
        // 4f: invokevirtual net/minecraft/pathfinding/Path.func_75877_a (I)Lnet/minecraft/pathfinding/PathPoint;
        // 52: astore 4
        // 54: aload 1
        // 55: iload 2
        // 56: bipush 1
        // 57: iadd
        // 58: invokevirtual net/minecraft/pathfinding/Path.func_75877_a (I)Lnet/minecraft/pathfinding/PathPoint;
        // 5b: astore 5
        // 5d: new net/minecraft/util/math/Vec3d
        // 60: dup
        // 61: aload 5
        // 63: getfield net/minecraft/pathfinding/PathPoint.field_75839_a I
        // 66: aload 4
        // 68: getfield net/minecraft/pathfinding/PathPoint.field_75839_a I
        // 6b: isub
        // 6c: i2d
        // 6d: aload 5
        // 6f: getfield net/minecraft/pathfinding/PathPoint.field_75837_b I
        // 72: aload 4
        // 74: getfield net/minecraft/pathfinding/PathPoint.field_75837_b I
        // 77: isub
        // 78: i2d
        // 79: aload 5
        // 7b: getfield net/minecraft/pathfinding/PathPoint.field_75838_c I
        // 7e: aload 4
        // 80: getfield net/minecraft/pathfinding/PathPoint.field_75838_c I
        // 83: isub
        // 84: i2d
        // 85: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 88: astore 6
        // 8a: aload 0
        // 8b: aload 6
        // 8d: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 90: ldc2_w 7.0
        // 93: ddiv
        // 94: putfield com/trolmastercard/sexmod/al.field_70159_w D
        // 97: aload 0
        // 98: aload 6
        // 9a: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 9d: ldc2_w 7.0
        // a0: ddiv
        // a1: putfield com/trolmastercard/sexmod/al.field_70179_y D
        // a4: return
        // try (4 -> 7): 7 java/lang/RuntimeException
        // try (9 -> 15): 16 java/lang/RuntimeException
        // try (12 -> 19): 19 java/lang/RuntimeException
        // try (27 -> 35): 36 java/lang/RuntimeException
        // try (30 -> 39): 39 java/lang/RuntimeException
    }

    public boolean func_70097_a(DamageSource var1, float var2) {
        try {
            if (var1 == DamageSource.field_76380_i) {
                this.field_70170_p.func_72900_e(this);
                return true;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        try {
            if (!(var1.func_76346_g() instanceof EntityPlayer)) {
                return false;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            if (this.field_70170_p.field_72995_K) {
                this.b();
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        this.e = true;
        be.a(6250, () -> this.field_70170_p.func_72900_e(this));
        return false;
    }

    @SideOnly(Side.CLIENT)
    void b() {
        EntityPlayerSP var1 = Minecraft.func_71410_x().field_71439_g;
        this.a = var1.field_70173_aa;
        var1.func_184185_a(com.trolmastercard.sexmod.c.MISC_WEOWEO[3], 1.0F, 1.0F);
    }

    double c() {
        return Math.sqrt(1800.0);
    }

    public boolean func_70601_bi() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/al.func_70681_au ()Ljava/util/Random;
        // 04: bipush 100
        // 06: invokevirtual java/util/Random.nextInt (I)I
        // 09: bipush 1
        // 0a: if_icmpge 28
        // 0d: aload 0
        // 0e: invokevirtual com/trolmastercard/sexmod/al.func_70681_au ()Ljava/util/Random;
        // 11: bipush 100
        // 13: invokevirtual java/util/Random.nextInt (I)I
        // 16: bipush 10
        // 18: if_icmpge 28
        // 1b: goto 22
        // 1e: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 21: athrow
        // 22: bipush 1
        // 23: ireturn
        // 24: invokestatic com/trolmastercard/sexmod/al.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 27: athrow
        // 28: aload 0
        // 29: getfield com/trolmastercard/sexmod/al.field_70170_p Lnet/minecraft/world/World;
        // 2c: aload 0
        // 2d: invokevirtual net/minecraft/world/World.func_72900_e (Lnet/minecraft/entity/Entity;)V
        // 30: bipush 0
        // 31: ireturn
        // try (0 -> 12): 13 java/lang/RuntimeException
        // try (6 -> 17): 17 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
