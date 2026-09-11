package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.ai.EntityMoveHelper.Action;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;

public class ay extends EntityLiving {
    public static int b = 8400;
    public static List<ay> g = new ArrayList<>();
    private static final DataParameter<Integer> d = EntityDataManager.func_187226_a(ay.class, DataSerializers.field_187192_b)
        .func_187156_b()
        .func_187161_a(111);
    private static final DataParameter<Integer> c = EntityDataManager.func_187226_a(ay.class, DataSerializers.field_187192_b)
        .func_187156_b()
        .func_187161_a(110);
    public float a;
    public float e;
    public float h;
    private boolean f;

    public ay(World var1) {
        super(var1);
        this.field_70765_h = new ay.b(this);
    }

    protected void func_184651_r() {
        this.field_70714_bg.func_75776_a(1, new ay.d(this));
        this.field_70714_bg.func_75776_a(5, new ay.c(this));
    }

    protected void func_70088_a() {
        super.func_70088_a();
        this.field_70180_af.func_187214_a(c, 1);
        this.field_70180_af.func_187214_a(d, 0);
    }

    public void func_180430_e(float var1, float var2) {
    }

    protected boolean func_70692_ba() {
        return false;
    }

    protected void a(int var1, boolean var2) {
        try {
            this.field_70180_af.func_187227_b(c, var1);
            this.func_70105_a(0.51000005F * var1, 0.51000005F * var1);
            this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
            this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(var1 * var1);
            this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.2F + 0.1F * var1);
            if (var2) {
                this.func_70606_j(this.func_110138_aP());
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        this.field_70728_aV = var1;
    }

    public int h() {
        return (Integer)this.field_70180_af.func_187225_a(c);
    }

    public static void a(DataFixer var0) {
        EntityLiving.func_189752_a(var0, ay.class);
    }

    public void func_70014_b(NBTTagCompound var1) {
        super.func_70014_b(var1);
        var1.func_74768_a("Size", this.h() - 1);
        var1.func_74757_a("wasOnGround", this.f);
        var1.func_74768_a("ageInTicks", (Integer)this.field_70180_af.func_187225_a(d));
    }

    public void func_70037_a(NBTTagCompound var1) {
        super.func_70037_a(var1);
        int var2 = var1.func_74762_e("Size");
        if (var2 < 0) {
            var2 = 0;
        }

        this.a(var2 + 1, false);
        this.f = var1.func_74767_n("wasOnGround");
        this.field_70180_af.func_187227_b(d, var1.func_74762_e("ageInTicks"));
    }

    public boolean j() {
        try {
            if (this.h() <= 1) {
                return true;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return false;
    }

    protected EnumParticleTypes g() {
        return EnumParticleTypes.SLIME;
    }

    public static ArrayList<ay> a(Vec3d var0) {
        ArrayList var1 = a(var0, 0.1);
        if (var1.isEmpty()) {
            var1 = a(var0, 0.5);
        }

        return var1;
    }

    private static ArrayList<ay> a(Vec3d param0, double param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: new java/util/ArrayList
        // 03: dup
        // 04: invokespecial java/util/ArrayList.<init> ()V
        // 07: astore 3
        // 08: getstatic com/trolmastercard/sexmod/ay.g Ljava/util/List;
        // 0b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 10: astore 4
        // 12: aload 4
        // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 19: ifeq 86
        // 1c: aload 4
        // 1e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 23: checkcast com/trolmastercard/sexmod/ay
        // 26: astore 5
        // 28: aload 5
        // 2a: ifnonnull 34
        // 2d: goto 12
        // 30: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 33: athrow
        // 34: aload 5
        // 36: getfield com/trolmastercard/sexmod/ay.field_70169_q D
        // 39: aload 0
        // 3a: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 3d: dsub
        // 3e: invokestatic java/lang/Math.abs (D)D
        // 41: aload 5
        // 43: getfield com/trolmastercard/sexmod/ay.field_70167_r D
        // 46: aload 0
        // 47: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 4a: dsub
        // 4b: invokestatic java/lang/Math.abs (D)D
        // 4e: dadd
        // 4f: aload 5
        // 51: getfield com/trolmastercard/sexmod/ay.field_70166_s D
        // 54: aload 0
        // 55: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 58: dsub
        // 59: invokestatic java/lang/Math.abs (D)D
        // 5c: dadd
        // 5d: dstore 6
        // 5f: aload 5
        // 61: getfield com/trolmastercard/sexmod/ay.field_70170_p Lnet/minecraft/world/World;
        // 64: ifnull 83
        // 67: dload 6
        // 69: dload 1
        // 6a: dcmpg
        // 6b: ifge 83
        // 6e: goto 75
        // 71: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 74: athrow
        // 75: aload 3
        // 76: aload 5
        // 78: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
        // 7b: pop
        // 7c: goto 83
        // 7f: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 82: athrow
        // 83: goto 12
        // 86: goto a4
        // 89: astore 4
        // 8b: getstatic java/lang/System.out Ljava/io/PrintStream;
        // 8e: new java/lang/StringBuilder
        // 91: dup
        // 92: invokespecial java/lang/StringBuilder.<init> ()V
        // 95: ldc "couldnt find slimes at distance "
        // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 9a: dload 1
        // 9b: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
        // 9e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // a1: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
        // a4: aload 3
        // a5: areturn
        // try (43 -> 54): 55 java/lang/Exception
        // try (40 -> 47): 48 java/lang/Exception
        // try (14 -> 17): 17 java/lang/Exception
        // try (4 -> 58): 59 java/lang/Exception
    }

    public Vec3d e() {
        return new Vec3d(this.field_70169_q, this.field_70167_r, this.field_70166_s);
    }

    void a(EnumParticleTypes var1) {
        double var2 = r.f.nextGaussian() * 0.02;
        double var4 = r.f.nextGaussian() * 0.02;
        double var6 = r.f.nextGaussian() * 0.02;
        this.field_70170_p
            .func_175688_a(
                var1,
                this.field_70165_t + r.f.nextFloat() * this.field_70130_N * 2.0F - this.field_70130_N,
                this.field_70163_u + 0.15 + r.f.nextFloat() * this.field_70131_O,
                this.field_70161_v + r.f.nextFloat() * this.field_70130_N * 2.0F - this.field_70130_N,
                var2,
                var4,
                var6,
                new int[0]
            );
    }

    public void func_70071_h_() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/ay.field_70180_af Lnet/minecraft/network/datasync/EntityDataManager;
        // 004: getstatic com/trolmastercard/sexmod/ay.d Lnet/minecraft/network/datasync/DataParameter;
        // 007: aload 0
        // 008: getfield com/trolmastercard/sexmod/ay.field_70180_af Lnet/minecraft/network/datasync/EntityDataManager;
        // 00b: getstatic com/trolmastercard/sexmod/ay.d Lnet/minecraft/network/datasync/DataParameter;
        // 00e: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 011: checkcast java/lang/Integer
        // 014: invokevirtual java/lang/Integer.intValue ()I
        // 017: bipush 1
        // 018: iadd
        // 019: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 01c: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 01f: aload 0
        // 020: getfield com/trolmastercard/sexmod/ay.field_70170_p Lnet/minecraft/world/World;
        // 023: getfield net/minecraft/world/World.field_72995_K Z
        // 026: ifeq 097
        // 029: aload 0
        // 02a: getfield com/trolmastercard/sexmod/ay.field_70180_af Lnet/minecraft/network/datasync/EntityDataManager;
        // 02d: getstatic com/trolmastercard/sexmod/ay.d Lnet/minecraft/network/datasync/DataParameter;
        // 030: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 033: checkcast java/lang/Integer
        // 036: invokevirtual java/lang/Integer.intValue ()I
        // 039: i2d
        // 03a: getstatic com/trolmastercard/sexmod/ay.b I
        // 03d: i2d
        // 03e: ldc2_w 0.95
        // 041: dmul
        // 042: dcmpl
        // 043: ifle 05b
        // 046: goto 04d
        // 049: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 04c: athrow
        // 04d: aload 0
        // 04e: getstatic net/minecraft/util/EnumParticleTypes.CLOUD Lnet/minecraft/util/EnumParticleTypes;
        // 051: invokevirtual com/trolmastercard/sexmod/ay.a (Lnet/minecraft/util/EnumParticleTypes;)V
        // 054: goto 0e9
        // 057: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 05a: athrow
        // 05b: aload 0
        // 05c: getfield com/trolmastercard/sexmod/ay.field_70180_af Lnet/minecraft/network/datasync/EntityDataManager;
        // 05f: getstatic com/trolmastercard/sexmod/ay.d Lnet/minecraft/network/datasync/DataParameter;
        // 062: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 065: checkcast java/lang/Integer
        // 068: invokevirtual java/lang/Integer.intValue ()I
        // 06b: i2d
        // 06c: getstatic com/trolmastercard/sexmod/ay.b I
        // 06f: i2d
        // 070: ldc2_w 0.7
        // 073: dmul
        // 074: dcmpl
        // 075: ifle 0e9
        // 078: aload 0
        // 079: getfield com/trolmastercard/sexmod/ay.field_70173_aa I
        // 07c: bipush 10
        // 07e: irem
        // 07f: ifne 0e9
        // 082: goto 089
        // 085: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 088: athrow
        // 089: aload 0
        // 08a: getstatic net/minecraft/util/EnumParticleTypes.VILLAGER_HAPPY Lnet/minecraft/util/EnumParticleTypes;
        // 08d: invokevirtual com/trolmastercard/sexmod/ay.a (Lnet/minecraft/util/EnumParticleTypes;)V
        // 090: goto 0e9
        // 093: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 096: athrow
        // 097: aload 0
        // 098: getfield com/trolmastercard/sexmod/ay.field_70180_af Lnet/minecraft/network/datasync/EntityDataManager;
        // 09b: getstatic com/trolmastercard/sexmod/ay.d Lnet/minecraft/network/datasync/DataParameter;
        // 09e: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 0a1: checkcast java/lang/Integer
        // 0a4: invokevirtual java/lang/Integer.intValue ()I
        // 0a7: getstatic com/trolmastercard/sexmod/ay.b I
        // 0aa: if_icmple 0e9
        // 0ad: new com/trolmastercard/sexmod/fn
        // 0b0: dup
        // 0b1: aload 0
        // 0b2: getfield com/trolmastercard/sexmod/ay.field_70170_p Lnet/minecraft/world/World;
        // 0b5: invokespecial com/trolmastercard/sexmod/fn.<init> (Lnet/minecraft/world/World;)V
        // 0b8: astore 1
        // 0b9: aload 1
        // 0ba: aload 0
        // 0bb: getfield com/trolmastercard/sexmod/ay.field_70165_t D
        // 0be: aload 0
        // 0bf: getfield com/trolmastercard/sexmod/ay.field_70163_u D
        // 0c2: aload 0
        // 0c3: getfield com/trolmastercard/sexmod/ay.field_70161_v D
        // 0c6: aload 0
        // 0c7: getfield com/trolmastercard/sexmod/ay.field_70177_z F
        // 0ca: aload 0
        // 0cb: getfield com/trolmastercard/sexmod/ay.field_70125_A F
        // 0ce: invokevirtual com/trolmastercard/sexmod/fn.func_70080_a (DDDFF)V
        // 0d1: aload 0
        // 0d2: getfield com/trolmastercard/sexmod/ay.field_70170_p Lnet/minecraft/world/World;
        // 0d5: aload 1
        // 0d6: invokevirtual net/minecraft/world/World.func_72838_d (Lnet/minecraft/entity/Entity;)Z
        // 0d9: pop
        // 0da: aload 1
        // 0db: getstatic net/minecraft/init/SoundEvents.field_187604_bf Lnet/minecraft/util/SoundEvent;
        // 0de: invokevirtual com/trolmastercard/sexmod/fn.a (Lnet/minecraft/util/SoundEvent;)V
        // 0e1: aload 0
        // 0e2: getfield com/trolmastercard/sexmod/ay.field_70170_p Lnet/minecraft/world/World;
        // 0e5: aload 0
        // 0e6: invokevirtual net/minecraft/world/World.func_72900_e (Lnet/minecraft/entity/Entity;)V
        // 0e9: aload 0
        // 0ea: dup
        // 0eb: getfield com/trolmastercard/sexmod/ay.e F
        // 0ee: aload 0
        // 0ef: getfield com/trolmastercard/sexmod/ay.a F
        // 0f2: aload 0
        // 0f3: getfield com/trolmastercard/sexmod/ay.e F
        // 0f6: fsub
        // 0f7: ldc 0.5
        // 0f9: fmul
        // 0fa: fadd
        // 0fb: putfield com/trolmastercard/sexmod/ay.e F
        // 0fe: aload 0
        // 0ff: aload 0
        // 100: getfield com/trolmastercard/sexmod/ay.e F
        // 103: putfield com/trolmastercard/sexmod/ay.h F
        // 106: aload 0
        // 107: invokespecial net/minecraft/entity/EntityLiving.func_70071_h_ ()V
        // 10a: aload 0
        // 10b: getfield com/trolmastercard/sexmod/ay.field_70122_E Z
        // 10e: ifeq 1d9
        // 111: aload 0
        // 112: getfield com/trolmastercard/sexmod/ay.f Z
        // 115: ifne 1d9
        // 118: goto 11f
        // 11b: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 11e: athrow
        // 11f: aload 0
        // 120: invokevirtual com/trolmastercard/sexmod/ay.h ()I
        // 123: istore 1
        // 124: aload 0
        // 125: invokevirtual com/trolmastercard/sexmod/ay.k ()Z
        // 128: ifeq 12d
        // 12b: bipush 0
        // 12c: istore 1
        // 12d: bipush 0
        // 12e: istore 2
        // 12f: iload 2
        // 130: iload 1
        // 131: bipush 8
        // 133: imul
        // 134: if_icmpge 1ad
        // 137: aload 0
        // 138: getfield com/trolmastercard/sexmod/ay.field_70146_Z Ljava/util/Random;
        // 13b: invokevirtual java/util/Random.nextFloat ()F
        // 13e: ldc 6.2831855
        // 140: fmul
        // 141: fstore 3
        // 142: aload 0
        // 143: getfield com/trolmastercard/sexmod/ay.field_70146_Z Ljava/util/Random;
        // 146: invokevirtual java/util/Random.nextFloat ()F
        // 149: ldc 0.5
        // 14b: fmul
        // 14c: ldc 0.5
        // 14e: fadd
        // 14f: fstore 4
        // 151: fload 3
        // 152: invokestatic net/minecraft/util/math/MathHelper.func_76126_a (F)F
        // 155: iload 1
        // 156: i2f
        // 157: fmul
        // 158: ldc 0.5
        // 15a: fmul
        // 15b: fload 4
        // 15d: fmul
        // 15e: fstore 5
        // 160: fload 3
        // 161: invokestatic net/minecraft/util/math/MathHelper.func_76134_b (F)F
        // 164: iload 1
        // 165: i2f
        // 166: fmul
        // 167: ldc 0.5
        // 169: fmul
        // 16a: fload 4
        // 16c: fmul
        // 16d: fstore 6
        // 16f: aload 0
        // 170: getfield com/trolmastercard/sexmod/ay.field_70170_p Lnet/minecraft/world/World;
        // 173: astore 7
        // 175: aload 0
        // 176: invokevirtual com/trolmastercard/sexmod/ay.g ()Lnet/minecraft/util/EnumParticleTypes;
        // 179: astore 8
        // 17b: aload 0
        // 17c: getfield com/trolmastercard/sexmod/ay.field_70165_t D
        // 17f: fload 5
        // 181: f2d
        // 182: dadd
        // 183: dstore 9
        // 185: aload 0
        // 186: getfield com/trolmastercard/sexmod/ay.field_70161_v D
        // 189: fload 6
        // 18b: f2d
        // 18c: dadd
        // 18d: dstore 11
        // 18f: aload 7
        // 191: aload 8
        // 193: dload 9
        // 195: aload 0
        // 196: invokevirtual com/trolmastercard/sexmod/ay.func_174813_aQ ()Lnet/minecraft/util/math/AxisAlignedBB;
        // 199: getfield net/minecraft/util/math/AxisAlignedBB.field_72338_b D
        // 19c: dload 11
        // 19e: dconst_0
        // 19f: dconst_0
        // 1a0: dconst_0
        // 1a1: bipush 0
        // 1a2: newarray 10
        // 1a4: invokevirtual net/minecraft/world/World.func_175688_a (Lnet/minecraft/util/EnumParticleTypes;DDDDDD[I)V
        // 1a7: iinc 2 1
        // 1aa: goto 12f
        // 1ad: aload 0
        // 1ae: aload 0
        // 1af: invokevirtual com/trolmastercard/sexmod/ay.f ()Lnet/minecraft/util/SoundEvent;
        // 1b2: aload 0
        // 1b3: invokevirtual com/trolmastercard/sexmod/ay.func_70599_aP ()F
        // 1b6: aload 0
        // 1b7: getfield com/trolmastercard/sexmod/ay.field_70146_Z Ljava/util/Random;
        // 1ba: invokevirtual java/util/Random.nextFloat ()F
        // 1bd: aload 0
        // 1be: getfield com/trolmastercard/sexmod/ay.field_70146_Z Ljava/util/Random;
        // 1c1: invokevirtual java/util/Random.nextFloat ()F
        // 1c4: fsub
        // 1c5: ldc 0.2
        // 1c7: fmul
        // 1c8: fconst_1
        // 1c9: fadd
        // 1ca: ldc 0.8
        // 1cc: fdiv
        // 1cd: invokevirtual com/trolmastercard/sexmod/ay.func_184185_a (Lnet/minecraft/util/SoundEvent;FF)V
        // 1d0: aload 0
        // 1d1: ldc -0.5
        // 1d3: putfield com/trolmastercard/sexmod/ay.a F
        // 1d6: goto 1fa
        // 1d9: aload 0
        // 1da: getfield com/trolmastercard/sexmod/ay.field_70122_E Z
        // 1dd: ifne 1fa
        // 1e0: aload 0
        // 1e1: getfield com/trolmastercard/sexmod/ay.f Z
        // 1e4: ifeq 1fa
        // 1e7: goto 1ee
        // 1ea: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1ed: athrow
        // 1ee: aload 0
        // 1ef: fconst_1
        // 1f0: putfield com/trolmastercard/sexmod/ay.a F
        // 1f3: goto 1fa
        // 1f6: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1f9: athrow
        // 1fa: aload 0
        // 1fb: aload 0
        // 1fc: getfield com/trolmastercard/sexmod/ay.field_70122_E Z
        // 1ff: putfield com/trolmastercard/sexmod/ay.f Z
        // 202: aload 0
        // 203: invokevirtual com/trolmastercard/sexmod/ay.b ()V
        // 206: return
        // try (0 -> 30): 31 java/lang/RuntimeException
        // try (17 -> 37): 37 java/lang/RuntimeException
        // try (39 -> 57): 58 java/lang/RuntimeException
        // try (52 -> 64): 64 java/lang/RuntimeException
        // try (104 -> 128): 129 java/lang/RuntimeException
        // try (236 -> 242): 243 java/lang/RuntimeException
        // try (239 -> 248): 249 java/lang/RuntimeException
    }

    protected void b() {
        this.a *= 0.6F;
    }

    protected int a() {
        return this.field_70146_Z.nextInt(100) + 50;
    }

    protected ay d() {
        return new ay(this.field_70170_p);
    }

    public void func_184206_a(DataParameter<?> param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/ay.c Lnet/minecraft/network/datasync/DataParameter;
        // 03: aload 1
        // 04: invokevirtual net/minecraft/network/datasync/DataParameter.equals (Ljava/lang/Object;)Z
        // 07: ifeq 52
        // 0a: aload 0
        // 0b: invokevirtual com/trolmastercard/sexmod/ay.h ()I
        // 0e: istore 2
        // 0f: aload 0
        // 10: ldc 0.51000005
        // 12: iload 2
        // 13: i2f
        // 14: fmul
        // 15: ldc 0.51000005
        // 17: iload 2
        // 18: i2f
        // 19: fmul
        // 1a: invokevirtual com/trolmastercard/sexmod/ay.func_70105_a (FF)V
        // 1d: aload 0
        // 1e: aload 0
        // 1f: getfield com/trolmastercard/sexmod/ay.field_70759_as F
        // 22: putfield com/trolmastercard/sexmod/ay.field_70177_z F
        // 25: aload 0
        // 26: aload 0
        // 27: getfield com/trolmastercard/sexmod/ay.field_70759_as F
        // 2a: putfield com/trolmastercard/sexmod/ay.field_70761_aq F
        // 2d: aload 0
        // 2e: invokevirtual com/trolmastercard/sexmod/ay.func_70090_H ()Z
        // 31: ifeq 52
        // 34: aload 0
        // 35: getfield com/trolmastercard/sexmod/ay.field_70146_Z Ljava/util/Random;
        // 38: bipush 20
        // 3a: invokevirtual java/util/Random.nextInt (I)I
        // 3d: ifne 52
        // 40: goto 47
        // 43: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 46: athrow
        // 47: aload 0
        // 48: invokevirtual com/trolmastercard/sexmod/ay.func_71061_d_ ()V
        // 4b: goto 52
        // 4e: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 51: athrow
        // 52: aload 0
        // 53: aload 1
        // 54: invokespecial net/minecraft/entity/EntityLiving.func_184206_a (Lnet/minecraft/network/datasync/DataParameter;)V
        // 57: return
        // try (7 -> 33): 34 java/lang/RuntimeException
        // try (28 -> 38): 39 java/lang/RuntimeException
    }

    public void func_70106_y() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/ay.h ()I
        // 04: istore 1
        // 05: aload 0
        // 06: getfield com/trolmastercard/sexmod/ay.field_70170_p Lnet/minecraft/world/World;
        // 09: getfield net/minecraft/world/World.field_72995_K Z
        // 0c: ifne cc
        // 0f: iload 1
        // 10: bipush 1
        // 11: if_icmple cc
        // 14: goto 1b
        // 17: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1a: athrow
        // 1b: aload 0
        // 1c: invokevirtual com/trolmastercard/sexmod/ay.func_110143_aJ ()F
        // 1f: fconst_0
        // 20: fcmpg
        // 21: ifgt cc
        // 24: goto 2b
        // 27: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2a: athrow
        // 2b: bipush 2
        // 2c: aload 0
        // 2d: getfield com/trolmastercard/sexmod/ay.field_70146_Z Ljava/util/Random;
        // 30: bipush 3
        // 31: invokevirtual java/util/Random.nextInt (I)I
        // 34: iadd
        // 35: istore 2
        // 36: bipush 0
        // 37: istore 3
        // 38: iload 3
        // 39: iload 2
        // 3a: if_icmpge cc
        // 3d: iload 3
        // 3e: bipush 2
        // 3f: irem
        // 40: i2f
        // 41: ldc 0.5
        // 43: fsub
        // 44: iload 1
        // 45: i2f
        // 46: fmul
        // 47: ldc 4.0
        // 49: fdiv
        // 4a: fstore 4
        // 4c: iload 3
        // 4d: bipush 2
        // 4e: idiv
        // 4f: i2f
        // 50: ldc 0.5
        // 52: fsub
        // 53: iload 1
        // 54: i2f
        // 55: fmul
        // 56: ldc 4.0
        // 58: fdiv
        // 59: fstore 5
        // 5b: aload 0
        // 5c: invokevirtual com/trolmastercard/sexmod/ay.d ()Lcom/trolmastercard/sexmod/ay;
        // 5f: astore 6
        // 61: aload 0
        // 62: invokevirtual com/trolmastercard/sexmod/ay.func_145818_k_ ()Z
        // 65: ifeq 78
        // 68: aload 6
        // 6a: aload 0
        // 6b: invokevirtual com/trolmastercard/sexmod/ay.func_95999_t ()Ljava/lang/String;
        // 6e: invokevirtual com/trolmastercard/sexmod/ay.func_96094_a (Ljava/lang/String;)V
        // 71: goto 78
        // 74: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 77: athrow
        // 78: aload 0
        // 79: invokevirtual com/trolmastercard/sexmod/ay.func_104002_bU ()Z
        // 7c: ifeq 8b
        // 7f: aload 6
        // 81: invokevirtual com/trolmastercard/sexmod/ay.func_110163_bv ()V
        // 84: goto 8b
        // 87: invokestatic com/trolmastercard/sexmod/ay.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 8a: athrow
        // 8b: aload 6
        // 8d: iload 1
        // 8e: bipush 2
        // 8f: idiv
        // 90: bipush 1
        // 91: invokevirtual com/trolmastercard/sexmod/ay.a (IZ)V
        // 94: aload 6
        // 96: aload 0
        // 97: getfield com/trolmastercard/sexmod/ay.field_70165_t D
        // 9a: fload 4
        // 9c: f2d
        // 9d: dadd
        // 9e: aload 0
        // 9f: getfield com/trolmastercard/sexmod/ay.field_70163_u D
        // a2: ldc2_w 0.5
        // a5: dadd
        // a6: aload 0
        // a7: getfield com/trolmastercard/sexmod/ay.field_70161_v D
        // aa: fload 5
        // ac: f2d
        // ad: dadd
        // ae: aload 0
        // af: getfield com/trolmastercard/sexmod/ay.field_70146_Z Ljava/util/Random;
        // b2: invokevirtual java/util/Random.nextFloat ()F
        // b5: ldc 360.0
        // b7: fmul
        // b8: fconst_0
        // b9: invokevirtual com/trolmastercard/sexmod/ay.func_70012_b (DDDFF)V
        // bc: aload 0
        // bd: getfield com/trolmastercard/sexmod/ay.field_70170_p Lnet/minecraft/world/World;
        // c0: aload 6
        // c2: invokevirtual net/minecraft/world/World.func_72838_d (Lnet/minecraft/entity/Entity;)Z
        // c5: pop
        // c6: iinc 3 1
        // c9: goto 38
        // cc: aload 0
        // cd: invokespecial net/minecraft/entity/EntityLiving.func_70106_y ()V
        // d0: return
        // try (3 -> 10): 11 java/lang/RuntimeException
        // try (7 -> 18): 19 java/lang/RuntimeException
        // try (60 -> 67): 68 java/lang/RuntimeException
        // try (70 -> 75): 76 java/lang/RuntimeException
    }

    public float func_70047_e() {
        return 0.625F * this.field_70131_O;
    }

    protected SoundEvent func_184601_bQ(DamageSource var1) {
        try {
            if (this.j()) {
                return SoundEvents.field_187898_fy;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        return SoundEvents.field_187880_fp;
    }

    protected SoundEvent func_184615_bR() {
        try {
            if (this.j()) {
                return SoundEvents.field_187896_fx;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return SoundEvents.field_187874_fm;
    }

    protected SoundEvent f() {
        try {
            if (this.j()) {
                return SoundEvents.field_187900_fz;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return SoundEvents.field_187886_fs;
    }

    protected Item func_146068_u() {
        try {
            if (this.h() == 1) {
                return Items.field_151123_aH;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return null;
    }

    @Nullable
    protected ResourceLocation func_184647_J() {
        try {
            if (this.h() == 1) {
                return LootTableList.field_186378_ac;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return LootTableList.field_186419_a;
    }

    protected float func_70599_aP() {
        return 0.4F * this.h();
    }

    public int func_70646_bf() {
        return 0;
    }

    protected boolean i() {
        try {
            if (this.h() > 0) {
                return true;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return false;
    }

    protected void func_70664_aZ() {
        this.field_70181_x = 0.42F;
        this.field_70160_al = true;
    }

    @Nullable
    public IEntityLivingData func_180482_a(DifficultyInstance var1, @Nullable IEntityLivingData var2) {
        this.a(1, true);
        return super.func_180482_a(var1, var2);
    }

    protected SoundEvent c() {
        try {
            if (this.j()) {
                return SoundEvents.field_189110_fE;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return SoundEvents.field_187882_fq;
    }

    protected boolean k() {
        return false;
    }

    private static Exception a(Exception var0) {
        return var0;
    }

    static class a extends EntityAIBase {
        private final ay b;
        private float a;
        private int c;

        public a(ay var1) {
            this.b = var1;
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
            // 01: getfield com/trolmastercard/sexmod/ay$a.b Lcom/trolmastercard/sexmod/ay;
            // 04: invokevirtual com/trolmastercard/sexmod/ay.func_70638_az ()Lnet/minecraft/entity/EntityLivingBase;
            // 07: ifnonnull 59
            // 0a: aload 0
            // 0b: getfield com/trolmastercard/sexmod/ay$a.b Lcom/trolmastercard/sexmod/ay;
            // 0e: getfield com/trolmastercard/sexmod/ay.field_70122_E Z
            // 11: ifne 51
            // 14: goto 1b
            // 17: invokestatic com/trolmastercard/sexmod/ay$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1a: athrow
            // 1b: aload 0
            // 1c: getfield com/trolmastercard/sexmod/ay$a.b Lcom/trolmastercard/sexmod/ay;
            // 1f: invokevirtual com/trolmastercard/sexmod/ay.func_70090_H ()Z
            // 22: ifne 51
            // 25: goto 2c
            // 28: invokestatic com/trolmastercard/sexmod/ay$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 2b: athrow
            // 2c: aload 0
            // 2d: getfield com/trolmastercard/sexmod/ay$a.b Lcom/trolmastercard/sexmod/ay;
            // 30: invokevirtual com/trolmastercard/sexmod/ay.func_180799_ab ()Z
            // 33: ifne 51
            // 36: goto 3d
            // 39: invokestatic com/trolmastercard/sexmod/ay$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 3c: athrow
            // 3d: aload 0
            // 3e: getfield com/trolmastercard/sexmod/ay$a.b Lcom/trolmastercard/sexmod/ay;
            // 41: getstatic net/minecraft/init/MobEffects.field_188424_y Lnet/minecraft/potion/Potion;
            // 44: invokevirtual com/trolmastercard/sexmod/ay.func_70644_a (Lnet/minecraft/potion/Potion;)Z
            // 47: ifeq 59
            // 4a: goto 51
            // 4d: invokestatic com/trolmastercard/sexmod/ay$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 50: athrow
            // 51: bipush 1
            // 52: goto 5a
            // 55: invokestatic com/trolmastercard/sexmod/ay$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
                    this.c = 40 + this.b.func_70681_au().nextInt(60);
                    this.a = this.b.func_70681_au().nextInt(360);
                }
            } catch (RuntimeException var1) {
                throw a(var1);
            }

            ((ay.b)this.b.func_70605_aq()).a(this.a, false);
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }

    static class b extends EntityMoveHelper {
        private float b;
        private int c;
        private final ay d;
        private boolean a;

        public b(ay var1) {
            super(var1);
            this.d = var1;
            this.b = 180.0F * var1.field_70177_z / (float) Math.PI;
        }

        public void a(float var1, boolean var2) {
            this.b = var1;
            this.a = var2;
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
            // 001: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 004: aload 0
            // 005: aload 0
            // 006: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 009: getfield net/minecraft/entity/EntityLiving.field_70177_z F
            // 00c: aload 0
            // 00d: getfield com/trolmastercard/sexmod/ay$b.b F
            // 010: ldc 90.0
            // 012: invokevirtual com/trolmastercard/sexmod/ay$b.func_75639_a (FFF)F
            // 015: putfield net/minecraft/entity/EntityLiving.field_70177_z F
            // 018: aload 0
            // 019: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 01c: aload 0
            // 01d: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 020: getfield net/minecraft/entity/EntityLiving.field_70177_z F
            // 023: putfield net/minecraft/entity/EntityLiving.field_70759_as F
            // 026: aload 0
            // 027: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 02a: aload 0
            // 02b: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 02e: getfield net/minecraft/entity/EntityLiving.field_70177_z F
            // 031: putfield net/minecraft/entity/EntityLiving.field_70761_aq F
            // 034: aload 0
            // 035: getfield com/trolmastercard/sexmod/ay$b.field_188491_h Lnet/minecraft/entity/ai/EntityMoveHelper$Action;
            // 038: getstatic net/minecraft/entity/ai/EntityMoveHelper$Action.MOVE_TO Lnet/minecraft/entity/ai/EntityMoveHelper$Action;
            // 03b: if_acmpeq 04d
            // 03e: aload 0
            // 03f: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 042: fconst_0
            // 043: invokevirtual net/minecraft/entity/EntityLiving.func_191989_p (F)V
            // 046: goto 15a
            // 049: invokestatic com/trolmastercard/sexmod/ay$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 04c: athrow
            // 04d: aload 0
            // 04e: getstatic net/minecraft/entity/ai/EntityMoveHelper$Action.WAIT Lnet/minecraft/entity/ai/EntityMoveHelper$Action;
            // 051: putfield com/trolmastercard/sexmod/ay$b.field_188491_h Lnet/minecraft/entity/ai/EntityMoveHelper$Action;
            // 054: aload 0
            // 055: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 058: getfield net/minecraft/entity/EntityLiving.field_70122_E Z
            // 05b: ifeq 13e
            // 05e: aload 0
            // 05f: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 062: aload 0
            // 063: getfield com/trolmastercard/sexmod/ay$b.field_75645_e D
            // 066: aload 0
            // 067: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 06a: getstatic net/minecraft/entity/SharedMonsterAttributes.field_111263_d Lnet/minecraft/entity/ai/attributes/IAttribute;
            // 06d: invokevirtual net/minecraft/entity/EntityLiving.func_110148_a (Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;
            // 070: invokeinterface net/minecraft/entity/ai/attributes/IAttributeInstance.func_111126_e ()D 1
            // 075: dmul
            // 076: d2f
            // 077: invokevirtual net/minecraft/entity/EntityLiving.func_70659_e (F)V
            // 07a: aload 0
            // 07b: dup
            // 07c: getfield com/trolmastercard/sexmod/ay$b.c I
            // 07f: dup_x1
            // 080: bipush 1
            // 081: isub
            // 082: putfield com/trolmastercard/sexmod/ay$b.c I
            // 085: ifgt 123
            // 088: goto 08f
            // 08b: invokestatic com/trolmastercard/sexmod/ay$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 08e: athrow
            // 08f: aload 0
            // 090: aload 0
            // 091: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 094: invokevirtual com/trolmastercard/sexmod/ay.a ()I
            // 097: putfield com/trolmastercard/sexmod/ay$b.c I
            // 09a: aload 0
            // 09b: getfield com/trolmastercard/sexmod/ay$b.a Z
            // 09e: ifeq 0b9
            // 0a1: goto 0a8
            // 0a4: invokestatic com/trolmastercard/sexmod/ay$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 0a7: athrow
            // 0a8: aload 0
            // 0a9: dup
            // 0aa: getfield com/trolmastercard/sexmod/ay$b.c I
            // 0ad: bipush 3
            // 0ae: idiv
            // 0af: putfield com/trolmastercard/sexmod/ay$b.c I
            // 0b2: goto 0b9
            // 0b5: invokestatic com/trolmastercard/sexmod/ay$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 0b8: athrow
            // 0b9: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
            // 0bc: sipush 360
            // 0bf: invokevirtual java/util/Random.nextInt (I)I
            // 0c2: i2f
            // 0c3: fstore 1
            // 0c4: aload 0
            // 0c5: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 0c8: invokevirtual com/trolmastercard/sexmod/ay.func_70605_aq ()Lnet/minecraft/entity/ai/EntityMoveHelper;
            // 0cb: checkcast com/trolmastercard/sexmod/ay$b
            // 0ce: fload 1
            // 0cf: bipush 0
            // 0d0: invokevirtual com/trolmastercard/sexmod/ay$b.a (FZ)V
            // 0d3: aload 0
            // 0d4: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 0d7: invokevirtual com/trolmastercard/sexmod/ay.func_70683_ar ()Lnet/minecraft/entity/ai/EntityJumpHelper;
            // 0da: invokevirtual net/minecraft/entity/ai/EntityJumpHelper.func_75660_a ()V
            // 0dd: aload 0
            // 0de: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 0e1: invokevirtual com/trolmastercard/sexmod/ay.i ()Z
            // 0e4: ifeq 120
            // 0e7: aload 0
            // 0e8: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 0eb: aload 0
            // 0ec: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 0ef: invokevirtual com/trolmastercard/sexmod/ay.c ()Lnet/minecraft/util/SoundEvent;
            // 0f2: aload 0
            // 0f3: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 0f6: invokevirtual com/trolmastercard/sexmod/ay.func_70599_aP ()F
            // 0f9: aload 0
            // 0fa: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 0fd: invokevirtual com/trolmastercard/sexmod/ay.func_70681_au ()Ljava/util/Random;
            // 100: invokevirtual java/util/Random.nextFloat ()F
            // 103: aload 0
            // 104: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 107: invokevirtual com/trolmastercard/sexmod/ay.func_70681_au ()Ljava/util/Random;
            // 10a: invokevirtual java/util/Random.nextFloat ()F
            // 10d: fsub
            // 10e: ldc 0.2
            // 110: fmul
            // 111: fconst_1
            // 112: fadd
            // 113: ldc 0.8
            // 115: fmul
            // 116: invokevirtual com/trolmastercard/sexmod/ay.func_184185_a (Lnet/minecraft/util/SoundEvent;FF)V
            // 119: goto 120
            // 11c: invokestatic com/trolmastercard/sexmod/ay$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 11f: athrow
            // 120: goto 15a
            // 123: aload 0
            // 124: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 127: fconst_0
            // 128: putfield com/trolmastercard/sexmod/ay.field_70702_br F
            // 12b: aload 0
            // 12c: getfield com/trolmastercard/sexmod/ay$b.d Lcom/trolmastercard/sexmod/ay;
            // 12f: fconst_0
            // 130: putfield com/trolmastercard/sexmod/ay.field_191988_bg F
            // 133: aload 0
            // 134: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 137: fconst_0
            // 138: invokevirtual net/minecraft/entity/EntityLiving.func_70659_e (F)V
            // 13b: goto 15a
            // 13e: aload 0
            // 13f: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
            // 142: aload 0
            // 143: getfield com/trolmastercard/sexmod/ay$b.field_75645_e D
            // 146: aload 0
            // 147: getfield com/trolmastercard/sexmod/ay$b.field_75648_a Lnet/minecraft/entity/EntityLiving;
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

    static class c extends EntityAIBase {
        private final ay a;

        public c(ay var1) {
            this.a = var1;
            this.func_75248_a(5);
        }

        public boolean func_75250_a() {
            return true;
        }

        public void func_75246_d() {
            ((ay.b)this.a.func_70605_aq()).a(1.0);
        }
    }

    static class d extends EntityAIBase {
        private final ay a;

        public d(ay var1) {
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
            // 01: getfield com/trolmastercard/sexmod/ay$d.a Lcom/trolmastercard/sexmod/ay;
            // 04: invokevirtual com/trolmastercard/sexmod/ay.func_70090_H ()Z
            // 07: ifne 1b
            // 0a: aload 0
            // 0b: getfield com/trolmastercard/sexmod/ay$d.a Lcom/trolmastercard/sexmod/ay;
            // 0e: invokevirtual com/trolmastercard/sexmod/ay.func_180799_ab ()Z
            // 11: ifeq 23
            // 14: goto 1b
            // 17: invokestatic com/trolmastercard/sexmod/ay$d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1a: athrow
            // 1b: bipush 1
            // 1c: goto 24
            // 1f: invokestatic com/trolmastercard/sexmod/ay$d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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

            ((ay.b)this.a.func_70605_aq()).a(1.2);
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
