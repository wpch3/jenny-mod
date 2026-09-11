package com.trolmastercard.sexmod;

import com.google.common.base.Optional;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class gi extends Entity {
    public static final int m = 15;
    private static final DataParameter<Integer> g = EntityDataManager.func_187226_a(gi.class, DataSerializers.field_187192_b)
        .func_187156_b()
        .func_187161_a(111);
    private static final DataParameter<Optional<UUID>> f = EntityDataManager.func_187226_a(gi.class, DataSerializers.field_187203_m)
        .func_187156_b()
        .func_187161_a(110);
    private boolean k;
    private int l;
    private int h;
    public int d;
    private int c;
    private int j;
    private float e;
    public Entity i;
    private gi.a n = gi.a.FLYING;
    private int a;
    private int o;
    public static eb b = null;

    public gi(World var1, eb var2, double var3) {
        super(var1);
        this.a(var2);
        this.a(var3);
    }

    public gi(World var1) {
        super(var1);
    }

    private void a(eb var1) {
        this.func_70105_a(0.25F, 0.25F);
        this.field_70158_ak = true;
        var1.av = this;
    }

    protected void func_70088_a() {
        this.func_184212_Q().func_187214_a(g, 0);
        this.func_184212_Q().func_187214_a(f, Optional.of(b.f()));
    }

    public AxisAlignedBB func_184177_bl() {
        return this.func_174813_aQ().func_186662_g(10.0);
    }

    eb b() {
        Optional var1 = (Optional)this.field_70180_af.func_187225_a(f);

        try {
            if (!var1.isPresent()) {
                return null;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        em var2 = em.a((UUID)var1.get());

        try {
            if (var2 == null) {
                return null;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            if (!(var2 instanceof eb)) {
                return null;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        return (eb)var2;
    }

    eb g() {
        Optional var1 = (Optional)this.field_70180_af.func_187225_a(f);

        try {
            if (!var1.isPresent()) {
                return null;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        em var2 = em.b((UUID)var1.get());

        try {
            if (!(var2 instanceof eb)) {
                return null;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        return (eb)var2;
    }

    public void b(int var1) {
        this.o = var1;
    }

    public void a(int var1) {
        this.a = var1;
    }

    public void func_70030_z() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokespecial net/minecraft/entity/Entity.func_70030_z ()V
        // 04: aload 0
        // 05: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 08: getfield net/minecraft/world/World.field_72995_K Z
        // 0b: ifeq 13
        // 0e: return
        // 0f: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 12: athrow
        // 13: aload 0
        // 14: getfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 17: ifnonnull 28
        // 1a: aload 0
        // 1b: getfield com/trolmastercard/sexmod/gi.field_70122_E Z
        // 1e: ifeq 44
        // 21: goto 28
        // 24: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 27: athrow
        // 28: aload 0
        // 29: getfield com/trolmastercard/sexmod/gi.d I
        // 2c: ifne 44
        // 2f: goto 36
        // 32: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 35: athrow
        // 36: aload 0
        // 37: invokevirtual com/trolmastercard/sexmod/gi.b ()Lcom/trolmastercard/sexmod/eb;
        // 3a: invokevirtual com/trolmastercard/sexmod/eb.o ()V
        // 3d: goto 44
        // 40: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 43: athrow
        // 44: return
        // try (0 -> 7): 7 java/lang/RuntimeException
        // try (9 -> 15): 16 java/lang/RuntimeException
        // try (12 -> 21): 22 java/lang/RuntimeException
        // try (18 -> 27): 28 java/lang/RuntimeException
    }

    public void a(double var1) {
        eb var3 = this.b();

        try {
            if (var3 == null) {
                return;
            }
        } catch (RuntimeException var20) {
            throw a(var20);
        }

        BlockPos var4 = var3.ai;
        float var5 = (float)Math.sqrt(var3.func_174791_d().func_186679_c(var4.func_177958_n(), var4.func_177956_o(), var4.func_177952_p()));
        float var6 = -22.5F + 45.0F * (var5 / 7.0F);
        float var7 = var3.I();
        float var8 = MathHelper.func_76134_b(-var7 * (float) (Math.PI / 180.0) - (float) Math.PI);
        float var9 = MathHelper.func_76126_a(-var7 * (float) (Math.PI / 180.0) - (float) Math.PI);
        float var10 = -MathHelper.func_76134_b(-var6 * (float) (Math.PI / 180.0));
        float var11 = MathHelper.func_76126_a(-var6 * (float) (Math.PI / 180.0));
        double var12 = var3.field_70169_q + (var3.field_70165_t - var3.field_70169_q) - var9 * 0.3;
        double var14 = var3.field_70167_r + (var3.field_70163_u - var3.field_70167_r) + var3.func_70047_e();
        double var16 = var3.field_70166_s + (var3.field_70161_v - var3.field_70166_s) - var8 * 0.3;
        this.func_70012_b(var12, var14, var16, var7, var6);
        this.field_70159_w = var1 * -var9;
        this.field_70181_x = var1 * MathHelper.func_76131_a(-(var11 / var10), -5.0F, 5.0F);
        this.field_70179_y = var1 * -var8;
        float var18 = MathHelper.func_76133_a(
            this.field_70159_w * this.field_70159_w + this.field_70181_x * this.field_70181_x + this.field_70179_y * this.field_70179_y
        );
        this.field_70159_w = this.field_70159_w * (0.6 / var18 + 0.5 + this.field_70146_Z.nextGaussian() * 0.0045);
        this.field_70181_x = this.field_70181_x * (0.6 / var18 + 0.5 + this.field_70146_Z.nextGaussian() * 0.0045);
        this.field_70179_y = this.field_70179_y * (0.6 / var18 + 0.5 + this.field_70146_Z.nextGaussian() * 0.0045);
        float var19 = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
        this.field_70177_z = (float)(MathHelper.func_181159_b(this.field_70159_w, this.field_70179_y) * (180.0 / Math.PI));
        this.field_70125_A = (float)(MathHelper.func_181159_b(this.field_70181_x, var19) * (180.0 / Math.PI));
        this.field_70126_B = this.field_70177_z;
        this.field_70127_C = this.field_70125_A;
    }

    public void func_184206_a(DataParameter<?> var1) {
        if (g.equals(var1)) {
            int var2 = (Integer)this.func_184212_Q().func_187225_a(g);

            gi var10000;
            Entity var10001;
            label19: {
                try {
                    var10000 = this;
                    if (var2 > 0) {
                        var10001 = this.field_70170_p.func_73045_a(var2 - 1);
                        break label19;
                    }
                } catch (RuntimeException var3) {
                    throw a(var3);
                }

                var10001 = null;
            }

            var10000.i = var10001;
        }

        super.func_184206_a(var1);
    }

    @SideOnly(Side.CLIENT)
    public boolean func_70112_a(double var1) {
        double var3 = 64.0;

        try {
            if (var1 < 4096.0) {
                return true;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        return false;
    }

    @SideOnly(Side.CLIENT)
    public void func_180426_a(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
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
        // 001: invokespecial net/minecraft/entity/Entity.func_70071_h_ ()V
        // 004: aload 0
        // 005: invokevirtual com/trolmastercard/sexmod/gi.b ()Lcom/trolmastercard/sexmod/eb;
        // 008: ifnonnull 016
        // 00b: aload 0
        // 00c: invokevirtual com/trolmastercard/sexmod/gi.func_70106_y ()V
        // 00f: goto 2cf
        // 012: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 015: athrow
        // 016: aload 0
        // 017: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 01a: getfield net/minecraft/world/World.field_72995_K Z
        // 01d: ifne 02e
        // 020: aload 0
        // 021: invokespecial com/trolmastercard/sexmod/gi.f ()Z
        // 024: ifne 2cf
        // 027: goto 02e
        // 02a: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 02d: athrow
        // 02e: aload 0
        // 02f: getfield com/trolmastercard/sexmod/gi.k Z
        // 032: ifeq 060
        // 035: goto 03c
        // 038: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 03b: athrow
        // 03c: aload 0
        // 03d: dup
        // 03e: getfield com/trolmastercard/sexmod/gi.l I
        // 041: bipush 1
        // 042: iadd
        // 043: putfield com/trolmastercard/sexmod/gi.l I
        // 046: aload 0
        // 047: getfield com/trolmastercard/sexmod/gi.l I
        // 04a: sipush 1200
        // 04d: if_icmplt 060
        // 050: goto 057
        // 053: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 056: athrow
        // 057: aload 0
        // 058: invokevirtual com/trolmastercard/sexmod/gi.func_70106_y ()V
        // 05b: return
        // 05c: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 05f: athrow
        // 060: fconst_0
        // 061: fstore 1
        // 062: new net/minecraft/util/math/BlockPos
        // 065: dup
        // 066: aload 0
        // 067: invokespecial net/minecraft/util/math/BlockPos.<init> (Lnet/minecraft/entity/Entity;)V
        // 06a: astore 2
        // 06b: aload 0
        // 06c: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 06f: aload 2
        // 070: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 073: astore 3
        // 074: aload 3
        // 075: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a ()Lnet/minecraft/block/material/Material; 1
        // 07a: getstatic net/minecraft/block/material/Material.field_151586_h Lnet/minecraft/block/material/Material;
        // 07d: if_acmpne 08a
        // 080: aload 3
        // 081: aload 0
        // 082: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 085: aload 2
        // 086: invokestatic net/minecraft/block/BlockLiquid.func_190973_f (Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)F
        // 089: fstore 1
        // 08a: aload 0
        // 08b: getfield com/trolmastercard/sexmod/gi.n Lcom/trolmastercard/sexmod/gi$a;
        // 08e: getstatic com/trolmastercard/sexmod/gi$a.FLYING Lcom/trolmastercard/sexmod/gi$a;
        // 091: if_acmpne 153
        // 094: aload 0
        // 095: getfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 098: ifnull 0bd
        // 09b: goto 0a2
        // 09e: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a1: athrow
        // 0a2: aload 0
        // 0a3: dconst_0
        // 0a4: putfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 0a7: aload 0
        // 0a8: dconst_0
        // 0a9: putfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 0ac: aload 0
        // 0ad: dconst_0
        // 0ae: putfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 0b1: aload 0
        // 0b2: getstatic com/trolmastercard/sexmod/gi$a.HOOKED_IN_ENTITY Lcom/trolmastercard/sexmod/gi$a;
        // 0b5: putfield com/trolmastercard/sexmod/gi.n Lcom/trolmastercard/sexmod/gi$a;
        // 0b8: return
        // 0b9: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0bc: athrow
        // 0bd: fload 1
        // 0be: fconst_0
        // 0bf: fcmpl
        // 0c0: ifle 0f3
        // 0c3: aload 0
        // 0c4: dup
        // 0c5: getfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 0c8: ldc2_w 0.3
        // 0cb: dmul
        // 0cc: putfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 0cf: aload 0
        // 0d0: dup
        // 0d1: getfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 0d4: ldc2_w 0.2
        // 0d7: dmul
        // 0d8: putfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 0db: aload 0
        // 0dc: dup
        // 0dd: getfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 0e0: ldc2_w 0.3
        // 0e3: dmul
        // 0e4: putfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 0e7: aload 0
        // 0e8: getstatic com/trolmastercard/sexmod/gi$a.BOBBING Lcom/trolmastercard/sexmod/gi$a;
        // 0eb: putfield com/trolmastercard/sexmod/gi.n Lcom/trolmastercard/sexmod/gi$a;
        // 0ee: return
        // 0ef: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0f2: athrow
        // 0f3: aload 0
        // 0f4: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 0f7: getfield net/minecraft/world/World.field_72995_K Z
        // 0fa: ifne 108
        // 0fd: aload 0
        // 0fe: invokespecial com/trolmastercard/sexmod/gi.e ()V
        // 101: goto 108
        // 104: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 107: athrow
        // 108: aload 0
        // 109: getfield com/trolmastercard/sexmod/gi.k Z
        // 10c: ifne 13c
        // 10f: aload 0
        // 110: getfield com/trolmastercard/sexmod/gi.field_70122_E Z
        // 113: ifne 13c
        // 116: goto 11d
        // 119: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 11c: athrow
        // 11d: aload 0
        // 11e: getfield com/trolmastercard/sexmod/gi.field_70123_F Z
        // 121: ifne 13c
        // 124: goto 12b
        // 127: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 12a: athrow
        // 12b: aload 0
        // 12c: dup
        // 12d: getfield com/trolmastercard/sexmod/gi.h I
        // 130: bipush 1
        // 131: iadd
        // 132: putfield com/trolmastercard/sexmod/gi.h I
        // 135: goto 260
        // 138: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 13b: athrow
        // 13c: aload 0
        // 13d: bipush 0
        // 13e: putfield com/trolmastercard/sexmod/gi.h I
        // 141: aload 0
        // 142: dconst_0
        // 143: putfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 146: aload 0
        // 147: dconst_0
        // 148: putfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 14b: aload 0
        // 14c: dconst_0
        // 14d: putfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 150: goto 260
        // 153: aload 0
        // 154: getfield com/trolmastercard/sexmod/gi.n Lcom/trolmastercard/sexmod/gi$a;
        // 157: getstatic com/trolmastercard/sexmod/gi$a.HOOKED_IN_ENTITY Lcom/trolmastercard/sexmod/gi$a;
        // 15a: if_acmpne 1d5
        // 15d: aload 0
        // 15e: getfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 161: ifnull 1d4
        // 164: goto 16b
        // 167: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 16a: athrow
        // 16b: aload 0
        // 16c: getfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 16f: getfield net/minecraft/entity/Entity.field_70128_L Z
        // 172: ifeq 18f
        // 175: goto 17c
        // 178: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 17b: athrow
        // 17c: aload 0
        // 17d: aconst_null
        // 17e: putfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 181: aload 0
        // 182: getstatic com/trolmastercard/sexmod/gi$a.FLYING Lcom/trolmastercard/sexmod/gi$a;
        // 185: putfield com/trolmastercard/sexmod/gi.n Lcom/trolmastercard/sexmod/gi$a;
        // 188: goto 1d4
        // 18b: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 18e: athrow
        // 18f: aload 0
        // 190: aload 0
        // 191: getfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 194: getfield net/minecraft/entity/Entity.field_70165_t D
        // 197: putfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 19a: aload 0
        // 19b: getfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 19e: getfield net/minecraft/entity/Entity.field_70131_O F
        // 1a1: f2d
        // 1a2: dstore 4
        // 1a4: aload 0
        // 1a5: aload 0
        // 1a6: getfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 1a9: invokevirtual net/minecraft/entity/Entity.func_174813_aQ ()Lnet/minecraft/util/math/AxisAlignedBB;
        // 1ac: getfield net/minecraft/util/math/AxisAlignedBB.field_72338_b D
        // 1af: dload 4
        // 1b1: ldc2_w 0.8
        // 1b4: dmul
        // 1b5: dadd
        // 1b6: putfield com/trolmastercard/sexmod/gi.field_70163_u D
        // 1b9: aload 0
        // 1ba: aload 0
        // 1bb: getfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 1be: getfield net/minecraft/entity/Entity.field_70161_v D
        // 1c1: putfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 1c4: aload 0
        // 1c5: aload 0
        // 1c6: getfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 1c9: aload 0
        // 1ca: getfield com/trolmastercard/sexmod/gi.field_70163_u D
        // 1cd: aload 0
        // 1ce: getfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 1d1: invokevirtual com/trolmastercard/sexmod/gi.func_70107_b (DDD)V
        // 1d4: return
        // 1d5: aload 0
        // 1d6: getfield com/trolmastercard/sexmod/gi.n Lcom/trolmastercard/sexmod/gi$a;
        // 1d9: getstatic com/trolmastercard/sexmod/gi$a.BOBBING Lcom/trolmastercard/sexmod/gi$a;
        // 1dc: if_acmpne 260
        // 1df: aload 0
        // 1e0: dup
        // 1e1: getfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 1e4: ldc2_w 0.9
        // 1e7: dmul
        // 1e8: putfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 1eb: aload 0
        // 1ec: dup
        // 1ed: getfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 1f0: ldc2_w 0.9
        // 1f3: dmul
        // 1f4: putfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 1f7: aload 0
        // 1f8: getfield com/trolmastercard/sexmod/gi.field_70163_u D
        // 1fb: aload 0
        // 1fc: getfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 1ff: dadd
        // 200: aload 2
        // 201: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 204: i2d
        // 205: dsub
        // 206: fload 1
        // 207: f2d
        // 208: dsub
        // 209: dstore 4
        // 20b: dload 4
        // 20d: invokestatic java/lang/Math.abs (D)D
        // 210: ldc2_w 0.01
        // 213: dcmpg
        // 214: ifge 225
        // 217: dload 4
        // 219: dload 4
        // 21b: invokestatic java/lang/Math.signum (D)D
        // 21e: ldc2_w 0.1
        // 221: dmul
        // 222: dadd
        // 223: dstore 4
        // 225: aload 0
        // 226: dup
        // 227: getfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 22a: dload 4
        // 22c: aload 0
        // 22d: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 230: invokevirtual java/util/Random.nextFloat ()F
        // 233: f2d
        // 234: dmul
        // 235: ldc2_w 0.2
        // 238: dmul
        // 239: dsub
        // 23a: putfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 23d: aload 0
        // 23e: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 241: getfield net/minecraft/world/World.field_72995_K Z
        // 244: ifne 260
        // 247: fload 1
        // 248: fconst_0
        // 249: fcmpl
        // 24a: ifle 260
        // 24d: goto 254
        // 250: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 253: athrow
        // 254: aload 0
        // 255: aload 2
        // 256: invokespecial com/trolmastercard/sexmod/gi.a (Lnet/minecraft/util/math/BlockPos;)V
        // 259: goto 260
        // 25c: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 25f: athrow
        // 260: aload 3
        // 261: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a ()Lnet/minecraft/block/material/Material; 1
        // 266: getstatic net/minecraft/block/material/Material.field_151586_h Lnet/minecraft/block/material/Material;
        // 269: if_acmpeq 27f
        // 26c: aload 0
        // 26d: dup
        // 26e: getfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 271: ldc2_w 0.03
        // 274: dsub
        // 275: putfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 278: goto 27f
        // 27b: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 27e: athrow
        // 27f: aload 0
        // 280: getstatic net/minecraft/entity/MoverType.SELF Lnet/minecraft/entity/MoverType;
        // 283: aload 0
        // 284: getfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 287: aload 0
        // 288: getfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 28b: aload 0
        // 28c: getfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 28f: invokevirtual com/trolmastercard/sexmod/gi.func_70091_d (Lnet/minecraft/entity/MoverType;DDD)V
        // 292: aload 0
        // 293: invokespecial com/trolmastercard/sexmod/gi.h ()V
        // 296: ldc2_w 0.92
        // 299: dstore 4
        // 29b: aload 0
        // 29c: dup
        // 29d: getfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 2a0: ldc2_w 0.92
        // 2a3: dmul
        // 2a4: putfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 2a7: aload 0
        // 2a8: dup
        // 2a9: getfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 2ac: ldc2_w 0.92
        // 2af: dmul
        // 2b0: putfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 2b3: aload 0
        // 2b4: dup
        // 2b5: getfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 2b8: ldc2_w 0.92
        // 2bb: dmul
        // 2bc: putfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 2bf: aload 0
        // 2c0: aload 0
        // 2c1: getfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 2c4: aload 0
        // 2c5: getfield com/trolmastercard/sexmod/gi.field_70163_u D
        // 2c8: aload 0
        // 2c9: getfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 2cc: invokevirtual com/trolmastercard/sexmod/gi.func_70107_b (DDD)V
        // 2cf: return
        // try (0 -> 8): 8 java/lang/RuntimeException
        // try (10 -> 17): 18 java/lang/RuntimeException
        // try (14 -> 23): 24 java/lang/RuntimeException
        // try (20 -> 36): 37 java/lang/RuntimeException
        // try (26 -> 42): 42 java/lang/RuntimeException
        // try (66 -> 73): 74 java/lang/RuntimeException
        // try (70 -> 89): 89 java/lang/RuntimeException
        // try (91 -> 117): 117 java/lang/RuntimeException
        // try (119 -> 125): 126 java/lang/RuntimeException
        // try (128 -> 134): 135 java/lang/RuntimeException
        // try (131 -> 140): 141 java/lang/RuntimeException
        // try (137 -> 150): 150 java/lang/RuntimeException
        // try (165 -> 172): 173 java/lang/RuntimeException
        // try (169 -> 179): 180 java/lang/RuntimeException
        // try (175 -> 189): 189 java/lang/RuntimeException
        // try (266 -> 287): 288 java/lang/RuntimeException
        // try (283 -> 293): 294 java/lang/RuntimeException
        // try (296 -> 306): 307 java/lang/RuntimeException
    }

    private boolean f() {
        return false;
    }

    private void h() {
        float var1 = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
        this.field_70177_z = (float)(MathHelper.func_181159_b(this.field_70159_w, this.field_70179_y) * (180.0 / Math.PI));
        this.field_70125_A = (float)(MathHelper.func_181159_b(this.field_70181_x, var1) * (180.0 / Math.PI));

        try {
            while (this.field_70125_A - this.field_70127_C < -180.0F) {
                this.field_70127_C -= 360.0F;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        try {
            while (this.field_70125_A - this.field_70127_C >= 180.0F) {
                this.field_70127_C += 360.0F;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        try {
            while (this.field_70177_z - this.field_70126_B < -180.0F) {
                this.field_70126_B -= 360.0F;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            while (this.field_70177_z - this.field_70126_B >= 180.0F) {
                this.field_70126_B += 360.0F;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        this.field_70125_A = this.field_70127_C + (this.field_70125_A - this.field_70127_C) * 0.2F;
        this.field_70177_z = this.field_70126_B + (this.field_70177_z - this.field_70126_B) * 0.2F;
    }

    private void e() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: new net/minecraft/util/math/Vec3d
        // 003: dup
        // 004: aload 0
        // 005: getfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 008: aload 0
        // 009: getfield com/trolmastercard/sexmod/gi.field_70163_u D
        // 00c: aload 0
        // 00d: getfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 010: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 013: astore 1
        // 014: new net/minecraft/util/math/Vec3d
        // 017: dup
        // 018: aload 0
        // 019: getfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 01c: aload 0
        // 01d: getfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 020: dadd
        // 021: aload 0
        // 022: getfield com/trolmastercard/sexmod/gi.field_70163_u D
        // 025: aload 0
        // 026: getfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 029: dadd
        // 02a: aload 0
        // 02b: getfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 02e: aload 0
        // 02f: getfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 032: dadd
        // 033: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 036: astore 2
        // 037: aload 0
        // 038: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 03b: aload 1
        // 03c: aload 2
        // 03d: bipush 0
        // 03e: bipush 1
        // 03f: bipush 0
        // 040: invokevirtual net/minecraft/world/World.func_147447_a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
        // 043: astore 3
        // 044: new net/minecraft/util/math/Vec3d
        // 047: dup
        // 048: aload 0
        // 049: getfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 04c: aload 0
        // 04d: getfield com/trolmastercard/sexmod/gi.field_70163_u D
        // 050: aload 0
        // 051: getfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 054: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 057: astore 1
        // 058: new net/minecraft/util/math/Vec3d
        // 05b: dup
        // 05c: aload 0
        // 05d: getfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 060: aload 0
        // 061: getfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 064: dadd
        // 065: aload 0
        // 066: getfield com/trolmastercard/sexmod/gi.field_70163_u D
        // 069: aload 0
        // 06a: getfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 06d: dadd
        // 06e: aload 0
        // 06f: getfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 072: aload 0
        // 073: getfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 076: dadd
        // 077: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 07a: astore 2
        // 07b: aload 3
        // 07c: ifnull 09c
        // 07f: new net/minecraft/util/math/Vec3d
        // 082: dup
        // 083: aload 3
        // 084: getfield net/minecraft/util/math/RayTraceResult.field_72307_f Lnet/minecraft/util/math/Vec3d;
        // 087: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 08a: aload 3
        // 08b: getfield net/minecraft/util/math/RayTraceResult.field_72307_f Lnet/minecraft/util/math/Vec3d;
        // 08e: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 091: aload 3
        // 092: getfield net/minecraft/util/math/RayTraceResult.field_72307_f Lnet/minecraft/util/math/Vec3d;
        // 095: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 098: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 09b: astore 2
        // 09c: aconst_null
        // 09d: astore 4
        // 09f: aload 0
        // 0a0: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 0a3: aload 0
        // 0a4: aload 0
        // 0a5: invokevirtual com/trolmastercard/sexmod/gi.func_174813_aQ ()Lnet/minecraft/util/math/AxisAlignedBB;
        // 0a8: aload 0
        // 0a9: getfield com/trolmastercard/sexmod/gi.field_70159_w D
        // 0ac: aload 0
        // 0ad: getfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 0b0: aload 0
        // 0b1: getfield com/trolmastercard/sexmod/gi.field_70179_y D
        // 0b4: invokevirtual net/minecraft/util/math/AxisAlignedBB.func_72321_a (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        // 0b7: dconst_1
        // 0b8: invokevirtual net/minecraft/util/math/AxisAlignedBB.func_186662_g (D)Lnet/minecraft/util/math/AxisAlignedBB;
        // 0bb: invokevirtual net/minecraft/world/World.func_72839_b (Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
        // 0be: astore 5
        // 0c0: dconst_0
        // 0c1: dstore 6
        // 0c3: aload 5
        // 0c5: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 0ca: astore 8
        // 0cc: aload 8
        // 0ce: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 0d3: ifeq 151
        // 0d6: aload 8
        // 0d8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 0dd: checkcast net/minecraft/entity/Entity
        // 0e0: astore 9
        // 0e2: aload 0
        // 0e3: aload 9
        // 0e5: invokevirtual com/trolmastercard/sexmod/gi.a (Lnet/minecraft/entity/Entity;)Z
        // 0e8: ifeq 14e
        // 0eb: aload 9
        // 0ed: aload 0
        // 0ee: invokevirtual com/trolmastercard/sexmod/gi.b ()Lcom/trolmastercard/sexmod/eb;
        // 0f1: if_acmpne 10a
        // 0f4: goto 0fb
        // 0f7: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0fa: athrow
        // 0fb: aload 0
        // 0fc: getfield com/trolmastercard/sexmod/gi.h I
        // 0ff: bipush 5
        // 100: if_icmplt 14e
        // 103: goto 10a
        // 106: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 109: athrow
        // 10a: aload 9
        // 10c: invokevirtual net/minecraft/entity/Entity.func_174813_aQ ()Lnet/minecraft/util/math/AxisAlignedBB;
        // 10f: ldc2_w 0.30000001192092896
        // 112: invokevirtual net/minecraft/util/math/AxisAlignedBB.func_186662_g (D)Lnet/minecraft/util/math/AxisAlignedBB;
        // 115: astore 10
        // 117: aload 10
        // 119: aload 1
        // 11a: aload 2
        // 11b: invokevirtual net/minecraft/util/math/AxisAlignedBB.func_72327_a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;
        // 11e: astore 11
        // 120: aload 11
        // 122: ifnull 14e
        // 125: aload 1
        // 126: aload 11
        // 128: getfield net/minecraft/util/math/RayTraceResult.field_72307_f Lnet/minecraft/util/math/Vec3d;
        // 12b: invokevirtual net/minecraft/util/math/Vec3d.func_72436_e (Lnet/minecraft/util/math/Vec3d;)D
        // 12e: dstore 12
        // 130: dload 12
        // 132: dload 6
        // 134: dcmpg
        // 135: iflt 146
        // 138: dload 6
        // 13a: dconst_0
        // 13b: dcmpl
        // 13c: ifne 14e
        // 13f: goto 146
        // 142: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 145: athrow
        // 146: aload 9
        // 148: astore 4
        // 14a: dload 12
        // 14c: dstore 6
        // 14e: goto 0cc
        // 151: aload 4
        // 153: ifnull 160
        // 156: new net/minecraft/util/math/RayTraceResult
        // 159: dup
        // 15a: aload 4
        // 15c: invokespecial net/minecraft/util/math/RayTraceResult.<init> (Lnet/minecraft/entity/Entity;)V
        // 15f: astore 3
        // 160: aload 3
        // 161: ifnull 19e
        // 164: aload 3
        // 165: getfield net/minecraft/util/math/RayTraceResult.field_72313_a Lnet/minecraft/util/math/RayTraceResult$Type;
        // 168: getstatic net/minecraft/util/math/RayTraceResult$Type.MISS Lnet/minecraft/util/math/RayTraceResult$Type;
        // 16b: if_acmpeq 19e
        // 16e: goto 175
        // 171: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 174: athrow
        // 175: aload 3
        // 176: getfield net/minecraft/util/math/RayTraceResult.field_72313_a Lnet/minecraft/util/math/RayTraceResult$Type;
        // 179: getstatic net/minecraft/util/math/RayTraceResult$Type.ENTITY Lnet/minecraft/util/math/RayTraceResult$Type;
        // 17c: if_acmpne 199
        // 17f: goto 186
        // 182: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 185: athrow
        // 186: aload 0
        // 187: aload 3
        // 188: getfield net/minecraft/util/math/RayTraceResult.field_72308_g Lnet/minecraft/entity/Entity;
        // 18b: putfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 18e: aload 0
        // 18f: invokespecial com/trolmastercard/sexmod/gi.a ()V
        // 192: goto 19e
        // 195: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 198: athrow
        // 199: aload 0
        // 19a: bipush 1
        // 19b: putfield com/trolmastercard/sexmod/gi.k Z
        // 19e: return
        // try (112 -> 120): 121 java/lang/RuntimeException
        // try (116 -> 127): 128 java/lang/RuntimeException
        // try (147 -> 155): 156 java/lang/RuntimeException
        // try (170 -> 176): 177 java/lang/RuntimeException
        // try (172 -> 183): 184 java/lang/RuntimeException
        // try (179 -> 193): 193 java/lang/RuntimeException
    }

    private void a() {
        this.func_184212_Q().func_187227_b(g, this.i.func_145782_y() + 1);
    }

    private void a(BlockPos param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 004: checkcast net/minecraft/world/WorldServer
        // 007: astore 2
        // 008: bipush 1
        // 009: istore 3
        // 00a: aload 1
        // 00b: invokevirtual net/minecraft/util/math/BlockPos.func_177984_a ()Lnet/minecraft/util/math/BlockPos;
        // 00e: astore 4
        // 010: aload 0
        // 011: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 014: invokevirtual java/util/Random.nextFloat ()F
        // 017: ldc 0.25
        // 019: fcmpg
        // 01a: ifge 03a
        // 01d: aload 0
        // 01e: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 021: aload 4
        // 023: invokevirtual net/minecraft/world/World.func_175727_C (Lnet/minecraft/util/math/BlockPos;)Z
        // 026: ifeq 03a
        // 029: goto 030
        // 02c: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 02f: athrow
        // 030: iinc 3 1
        // 033: goto 03a
        // 036: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 039: athrow
        // 03a: aload 0
        // 03b: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 03e: invokevirtual java/util/Random.nextFloat ()F
        // 041: ldc 0.5
        // 043: fcmpg
        // 044: ifge 064
        // 047: aload 0
        // 048: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 04b: aload 4
        // 04d: invokevirtual net/minecraft/world/World.func_175678_i (Lnet/minecraft/util/math/BlockPos;)Z
        // 050: ifne 064
        // 053: goto 05a
        // 056: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 059: athrow
        // 05a: iinc 3 -1
        // 05d: goto 064
        // 060: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 063: athrow
        // 064: aload 0
        // 065: getfield com/trolmastercard/sexmod/gi.d I
        // 068: ifle 0b5
        // 06b: aload 0
        // 06c: dup
        // 06d: getfield com/trolmastercard/sexmod/gi.d I
        // 070: bipush 1
        // 071: isub
        // 072: putfield com/trolmastercard/sexmod/gi.d I
        // 075: aload 0
        // 076: getfield com/trolmastercard/sexmod/gi.d I
        // 079: ifgt 094
        // 07c: goto 083
        // 07f: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 082: athrow
        // 083: aload 0
        // 084: bipush 0
        // 085: putfield com/trolmastercard/sexmod/gi.c I
        // 088: aload 0
        // 089: bipush 0
        // 08a: putfield com/trolmastercard/sexmod/gi.j I
        // 08d: goto 3ee
        // 090: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 093: athrow
        // 094: aload 0
        // 095: dup
        // 096: getfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 099: ldc2_w 0.2
        // 09c: aload 0
        // 09d: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 0a0: invokevirtual java/util/Random.nextFloat ()F
        // 0a3: f2d
        // 0a4: dmul
        // 0a5: aload 0
        // 0a6: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 0a9: invokevirtual java/util/Random.nextFloat ()F
        // 0ac: f2d
        // 0ad: dmul
        // 0ae: dsub
        // 0af: putfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 0b2: goto 3ee
        // 0b5: aload 0
        // 0b6: getfield com/trolmastercard/sexmod/gi.j I
        // 0b9: ifle 282
        // 0bc: aload 0
        // 0bd: dup
        // 0be: getfield com/trolmastercard/sexmod/gi.j I
        // 0c1: iload 3
        // 0c2: isub
        // 0c3: putfield com/trolmastercard/sexmod/gi.j I
        // 0c6: aload 0
        // 0c7: getfield com/trolmastercard/sexmod/gi.j I
        // 0ca: ifle 1dc
        // 0cd: goto 0d4
        // 0d0: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0d3: athrow
        // 0d4: aload 0
        // 0d5: aload 0
        // 0d6: getfield com/trolmastercard/sexmod/gi.e F
        // 0d9: f2d
        // 0da: aload 0
        // 0db: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 0de: invokevirtual java/util/Random.nextGaussian ()D
        // 0e1: ldc2_w 4.0
        // 0e4: dmul
        // 0e5: dadd
        // 0e6: d2f
        // 0e7: putfield com/trolmastercard/sexmod/gi.e F
        // 0ea: aload 0
        // 0eb: getfield com/trolmastercard/sexmod/gi.e F
        // 0ee: ldc 0.017453292
        // 0f0: fmul
        // 0f1: fstore 5
        // 0f3: fload 5
        // 0f5: invokestatic net/minecraft/util/math/MathHelper.func_76126_a (F)F
        // 0f8: fstore 6
        // 0fa: fload 5
        // 0fc: invokestatic net/minecraft/util/math/MathHelper.func_76134_b (F)F
        // 0ff: fstore 7
        // 101: aload 0
        // 102: getfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 105: fload 6
        // 107: aload 0
        // 108: getfield com/trolmastercard/sexmod/gi.j I
        // 10b: i2f
        // 10c: fmul
        // 10d: ldc 0.1
        // 10f: fmul
        // 110: f2d
        // 111: dadd
        // 112: dstore 8
        // 114: aload 0
        // 115: invokevirtual com/trolmastercard/sexmod/gi.func_174813_aQ ()Lnet/minecraft/util/math/AxisAlignedBB;
        // 118: getfield net/minecraft/util/math/AxisAlignedBB.field_72338_b D
        // 11b: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 11e: i2f
        // 11f: fconst_1
        // 120: fadd
        // 121: f2d
        // 122: dstore 10
        // 124: aload 0
        // 125: getfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 128: fload 7
        // 12a: aload 0
        // 12b: getfield com/trolmastercard/sexmod/gi.j I
        // 12e: i2f
        // 12f: fmul
        // 130: ldc 0.1
        // 132: fmul
        // 133: f2d
        // 134: dadd
        // 135: dstore 12
        // 137: aload 2
        // 138: new net/minecraft/util/math/BlockPos
        // 13b: dup
        // 13c: dload 8
        // 13e: dload 10
        // 140: dconst_1
        // 141: dsub
        // 142: dload 12
        // 144: invokespecial net/minecraft/util/math/BlockPos.<init> (DDD)V
        // 147: invokevirtual net/minecraft/world/WorldServer.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 14a: astore 14
        // 14c: aload 14
        // 14e: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a ()Lnet/minecraft/block/material/Material; 1
        // 153: getstatic net/minecraft/block/material/Material.field_151586_h Lnet/minecraft/block/material/Material;
        // 156: if_acmpne 1d9
        // 159: aload 0
        // 15a: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 15d: invokevirtual java/util/Random.nextFloat ()F
        // 160: ldc 0.15
        // 162: fcmpg
        // 163: ifge 193
        // 166: goto 16d
        // 169: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 16c: athrow
        // 16d: aload 2
        // 16e: getstatic net/minecraft/util/EnumParticleTypes.WATER_BUBBLE Lnet/minecraft/util/EnumParticleTypes;
        // 171: dload 8
        // 173: dload 10
        // 175: ldc2_w 0.10000000149011612
        // 178: dsub
        // 179: dload 12
        // 17b: bipush 1
        // 17c: fload 6
        // 17e: f2d
        // 17f: ldc2_w 0.1
        // 182: fload 7
        // 184: f2d
        // 185: dconst_0
        // 186: bipush 0
        // 187: newarray 10
        // 189: invokevirtual net/minecraft/world/WorldServer.func_175739_a (Lnet/minecraft/util/EnumParticleTypes;DDDIDDDD[I)V
        // 18c: goto 193
        // 18f: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 192: athrow
        // 193: fload 6
        // 195: ldc 0.04
        // 197: fmul
        // 198: fstore 15
        // 19a: fload 7
        // 19c: ldc 0.04
        // 19e: fmul
        // 19f: fstore 16
        // 1a1: aload 2
        // 1a2: getstatic net/minecraft/util/EnumParticleTypes.WATER_WAKE Lnet/minecraft/util/EnumParticleTypes;
        // 1a5: dload 8
        // 1a7: dload 10
        // 1a9: dload 12
        // 1ab: bipush 0
        // 1ac: fload 16
        // 1ae: f2d
        // 1af: ldc2_w 0.01
        // 1b2: fload 15
        // 1b4: fneg
        // 1b5: f2d
        // 1b6: dconst_1
        // 1b7: bipush 0
        // 1b8: newarray 10
        // 1ba: invokevirtual net/minecraft/world/WorldServer.func_175739_a (Lnet/minecraft/util/EnumParticleTypes;DDDIDDDD[I)V
        // 1bd: aload 2
        // 1be: getstatic net/minecraft/util/EnumParticleTypes.WATER_WAKE Lnet/minecraft/util/EnumParticleTypes;
        // 1c1: dload 8
        // 1c3: dload 10
        // 1c5: dload 12
        // 1c7: bipush 0
        // 1c8: fload 16
        // 1ca: fneg
        // 1cb: f2d
        // 1cc: ldc2_w 0.01
        // 1cf: fload 15
        // 1d1: f2d
        // 1d2: dconst_1
        // 1d3: bipush 0
        // 1d4: newarray 10
        // 1d6: invokevirtual net/minecraft/world/WorldServer.func_175739_a (Lnet/minecraft/util/EnumParticleTypes;DDDIDDDD[I)V
        // 1d9: goto 3ee
        // 1dc: aload 0
        // 1dd: ldc -0.4
        // 1df: aload 0
        // 1e0: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 1e3: ldc 0.6
        // 1e5: fconst_1
        // 1e6: invokestatic net/minecraft/util/math/MathHelper.func_151240_a (Ljava/util/Random;FF)F
        // 1e9: fmul
        // 1ea: f2d
        // 1eb: putfield com/trolmastercard/sexmod/gi.field_70181_x D
        // 1ee: aload 0
        // 1ef: getstatic net/minecraft/init/SoundEvents.field_187609_F Lnet/minecraft/util/SoundEvent;
        // 1f2: ldc 0.25
        // 1f4: fconst_1
        // 1f5: aload 0
        // 1f6: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 1f9: invokevirtual java/util/Random.nextFloat ()F
        // 1fc: aload 0
        // 1fd: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 200: invokevirtual java/util/Random.nextFloat ()F
        // 203: fsub
        // 204: ldc 0.4
        // 206: fmul
        // 207: fadd
        // 208: invokevirtual com/trolmastercard/sexmod/gi.func_184185_a (Lnet/minecraft/util/SoundEvent;FF)V
        // 20b: aload 0
        // 20c: invokevirtual com/trolmastercard/sexmod/gi.func_174813_aQ ()Lnet/minecraft/util/math/AxisAlignedBB;
        // 20f: getfield net/minecraft/util/math/AxisAlignedBB.field_72338_b D
        // 212: ldc2_w 0.5
        // 215: dadd
        // 216: dstore 5
        // 218: aload 2
        // 219: getstatic net/minecraft/util/EnumParticleTypes.WATER_BUBBLE Lnet/minecraft/util/EnumParticleTypes;
        // 21c: aload 0
        // 21d: getfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 220: dload 5
        // 222: aload 0
        // 223: getfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 226: fconst_1
        // 227: aload 0
        // 228: getfield com/trolmastercard/sexmod/gi.field_70130_N F
        // 22b: ldc 20.0
        // 22d: fmul
        // 22e: fadd
        // 22f: f2i
        // 230: aload 0
        // 231: getfield com/trolmastercard/sexmod/gi.field_70130_N F
        // 234: f2d
        // 235: dconst_0
        // 236: aload 0
        // 237: getfield com/trolmastercard/sexmod/gi.field_70130_N F
        // 23a: f2d
        // 23b: ldc2_w 0.20000000298023224
        // 23e: bipush 0
        // 23f: newarray 10
        // 241: invokevirtual net/minecraft/world/WorldServer.func_175739_a (Lnet/minecraft/util/EnumParticleTypes;DDDIDDDD[I)V
        // 244: aload 2
        // 245: getstatic net/minecraft/util/EnumParticleTypes.WATER_WAKE Lnet/minecraft/util/EnumParticleTypes;
        // 248: aload 0
        // 249: getfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 24c: dload 5
        // 24e: aload 0
        // 24f: getfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 252: fconst_1
        // 253: aload 0
        // 254: getfield com/trolmastercard/sexmod/gi.field_70130_N F
        // 257: ldc 20.0
        // 259: fmul
        // 25a: fadd
        // 25b: f2i
        // 25c: aload 0
        // 25d: getfield com/trolmastercard/sexmod/gi.field_70130_N F
        // 260: f2d
        // 261: dconst_0
        // 262: aload 0
        // 263: getfield com/trolmastercard/sexmod/gi.field_70130_N F
        // 266: f2d
        // 267: ldc2_w 0.20000000298023224
        // 26a: bipush 0
        // 26b: newarray 10
        // 26d: invokevirtual net/minecraft/world/WorldServer.func_175739_a (Lnet/minecraft/util/EnumParticleTypes;DDDIDDDD[I)V
        // 270: aload 0
        // 271: aload 0
        // 272: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 275: bipush 20
        // 277: bipush 40
        // 279: invokestatic net/minecraft/util/math/MathHelper.func_76136_a (Ljava/util/Random;II)I
        // 27c: putfield com/trolmastercard/sexmod/gi.d I
        // 27f: goto 3ee
        // 282: aload 0
        // 283: getfield com/trolmastercard/sexmod/gi.c I
        // 286: ifle 3cc
        // 289: aload 0
        // 28a: dup
        // 28b: getfield com/trolmastercard/sexmod/gi.c I
        // 28e: iload 3
        // 28f: isub
        // 290: putfield com/trolmastercard/sexmod/gi.c I
        // 293: ldc 0.15
        // 295: fstore 5
        // 297: aload 0
        // 298: getfield com/trolmastercard/sexmod/gi.c I
        // 29b: bipush 20
        // 29d: if_icmpge 2b6
        // 2a0: fload 5
        // 2a2: f2d
        // 2a3: bipush 20
        // 2a5: aload 0
        // 2a6: getfield com/trolmastercard/sexmod/gi.c I
        // 2a9: isub
        // 2aa: i2d
        // 2ab: ldc2_w 0.05
        // 2ae: dmul
        // 2af: dadd
        // 2b0: d2f
        // 2b1: fstore 5
        // 2b3: goto 2f1
        // 2b6: aload 0
        // 2b7: getfield com/trolmastercard/sexmod/gi.c I
        // 2ba: bipush 40
        // 2bc: if_icmpge 2d5
        // 2bf: fload 5
        // 2c1: f2d
        // 2c2: bipush 40
        // 2c4: aload 0
        // 2c5: getfield com/trolmastercard/sexmod/gi.c I
        // 2c8: isub
        // 2c9: i2d
        // 2ca: ldc2_w 0.02
        // 2cd: dmul
        // 2ce: dadd
        // 2cf: d2f
        // 2d0: fstore 5
        // 2d2: goto 2f1
        // 2d5: aload 0
        // 2d6: getfield com/trolmastercard/sexmod/gi.c I
        // 2d9: bipush 60
        // 2db: if_icmpge 2f1
        // 2de: fload 5
        // 2e0: f2d
        // 2e1: bipush 60
        // 2e3: aload 0
        // 2e4: getfield com/trolmastercard/sexmod/gi.c I
        // 2e7: isub
        // 2e8: i2d
        // 2e9: ldc2_w 0.01
        // 2ec: dmul
        // 2ed: dadd
        // 2ee: d2f
        // 2ef: fstore 5
        // 2f1: aload 0
        // 2f2: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 2f5: invokevirtual java/util/Random.nextFloat ()F
        // 2f8: fload 5
        // 2fa: fcmpg
        // 2fb: ifge 39e
        // 2fe: aload 0
        // 2ff: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 302: fconst_0
        // 303: ldc 360.0
        // 305: invokestatic net/minecraft/util/math/MathHelper.func_151240_a (Ljava/util/Random;FF)F
        // 308: ldc 0.017453292
        // 30a: fmul
        // 30b: fstore 6
        // 30d: aload 0
        // 30e: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 311: ldc 25.0
        // 313: ldc 60.0
        // 315: invokestatic net/minecraft/util/math/MathHelper.func_151240_a (Ljava/util/Random;FF)F
        // 318: fstore 7
        // 31a: aload 0
        // 31b: getfield com/trolmastercard/sexmod/gi.field_70165_t D
        // 31e: fload 6
        // 320: invokestatic net/minecraft/util/math/MathHelper.func_76126_a (F)F
        // 323: fload 7
        // 325: fmul
        // 326: ldc 0.1
        // 328: fmul
        // 329: f2d
        // 32a: dadd
        // 32b: dstore 8
        // 32d: aload 0
        // 32e: invokevirtual com/trolmastercard/sexmod/gi.func_174813_aQ ()Lnet/minecraft/util/math/AxisAlignedBB;
        // 331: getfield net/minecraft/util/math/AxisAlignedBB.field_72338_b D
        // 334: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 337: i2f
        // 338: fconst_1
        // 339: fadd
        // 33a: f2d
        // 33b: dstore 10
        // 33d: aload 0
        // 33e: getfield com/trolmastercard/sexmod/gi.field_70161_v D
        // 341: fload 6
        // 343: invokestatic net/minecraft/util/math/MathHelper.func_76134_b (F)F
        // 346: fload 7
        // 348: fmul
        // 349: ldc 0.1
        // 34b: fmul
        // 34c: f2d
        // 34d: dadd
        // 34e: dstore 12
        // 350: aload 2
        // 351: new net/minecraft/util/math/BlockPos
        // 354: dup
        // 355: dload 8
        // 357: d2i
        // 358: dload 10
        // 35a: d2i
        // 35b: bipush 1
        // 35c: isub
        // 35d: dload 12
        // 35f: d2i
        // 360: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
        // 363: invokevirtual net/minecraft/world/WorldServer.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 366: astore 14
        // 368: aload 14
        // 36a: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a ()Lnet/minecraft/block/material/Material; 1
        // 36f: getstatic net/minecraft/block/material/Material.field_151586_h Lnet/minecraft/block/material/Material;
        // 372: if_acmpne 39e
        // 375: aload 2
        // 376: getstatic net/minecraft/util/EnumParticleTypes.WATER_SPLASH Lnet/minecraft/util/EnumParticleTypes;
        // 379: dload 8
        // 37b: dload 10
        // 37d: dload 12
        // 37f: bipush 2
        // 380: aload 0
        // 381: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 384: bipush 2
        // 385: invokevirtual java/util/Random.nextInt (I)I
        // 388: iadd
        // 389: ldc2_w 0.10000000149011612
        // 38c: dconst_0
        // 38d: ldc2_w 0.10000000149011612
        // 390: dconst_0
        // 391: bipush 0
        // 392: newarray 10
        // 394: invokevirtual net/minecraft/world/WorldServer.func_175739_a (Lnet/minecraft/util/EnumParticleTypes;DDDIDDDD[I)V
        // 397: goto 39e
        // 39a: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 39d: athrow
        // 39e: aload 0
        // 39f: getfield com/trolmastercard/sexmod/gi.c I
        // 3a2: ifgt 3c9
        // 3a5: aload 0
        // 3a6: aload 0
        // 3a7: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 3aa: fconst_0
        // 3ab: ldc 360.0
        // 3ad: invokestatic net/minecraft/util/math/MathHelper.func_151240_a (Ljava/util/Random;FF)F
        // 3b0: putfield com/trolmastercard/sexmod/gi.e F
        // 3b3: aload 0
        // 3b4: aload 0
        // 3b5: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 3b8: bipush 20
        // 3ba: bipush 80
        // 3bc: invokestatic net/minecraft/util/math/MathHelper.func_76136_a (Ljava/util/Random;II)I
        // 3bf: putfield com/trolmastercard/sexmod/gi.j I
        // 3c2: goto 3c9
        // 3c5: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3c8: athrow
        // 3c9: goto 3ee
        // 3cc: aload 0
        // 3cd: aload 0
        // 3ce: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 3d1: bipush 100
        // 3d3: sipush 600
        // 3d6: invokestatic net/minecraft/util/math/MathHelper.func_76136_a (Ljava/util/Random;II)I
        // 3d9: putfield com/trolmastercard/sexmod/gi.c I
        // 3dc: aload 0
        // 3dd: dup
        // 3de: getfield com/trolmastercard/sexmod/gi.c I
        // 3e1: aload 0
        // 3e2: getfield com/trolmastercard/sexmod/gi.o I
        // 3e5: bipush 20
        // 3e7: imul
        // 3e8: bipush 5
        // 3e9: imul
        // 3ea: isub
        // 3eb: putfield com/trolmastercard/sexmod/gi.c I
        // 3ee: return
        // try (9 -> 20): 21 java/lang/RuntimeException
        // try (15 -> 24): 25 java/lang/RuntimeException
        // try (27 -> 38): 39 java/lang/RuntimeException
        // try (33 -> 42): 43 java/lang/RuntimeException
        // try (45 -> 57): 58 java/lang/RuntimeException
        // try (48 -> 67): 67 java/lang/RuntimeException
        // try (86 -> 98): 99 java/lang/RuntimeException
        // try (168 -> 178): 179 java/lang/RuntimeException
        // try (172 -> 198): 199 java/lang/RuntimeException
        // try (457 -> 479): 480 java/lang/RuntimeException
        // try (482 -> 499): 500 java/lang/RuntimeException
    }

    protected boolean a(Entity param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: invokevirtual net/minecraft/entity/Entity.func_70067_L ()Z
        // 04: ifne 15
        // 07: aload 1
        // 08: instanceof net/minecraft/entity/item/EntityItem
        // 0b: ifeq 1d
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14: athrow
        // 15: bipush 1
        // 16: goto 1e
        // 19: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1c: athrow
        // 1d: bipush 0
        // 1e: ireturn
        // try (0 -> 6): 7 java/lang/RuntimeException
        // try (3 -> 11): 11 java/lang/RuntimeException
    }

    public void func_70014_b(NBTTagCompound var1) {
    }

    public void func_70037_a(NBTTagCompound var1) {
    }

    public int c() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 04: getfield net/minecraft/world/World.field_72995_K Z
        // 07: ifne d1
        // 0a: aload 0
        // 0b: invokevirtual com/trolmastercard/sexmod/gi.b ()Lcom/trolmastercard/sexmod/eb;
        // 0e: ifnull d1
        // 11: goto 18
        // 14: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 17: athrow
        // 18: bipush 0
        // 19: istore 1
        // 1a: aconst_null
        // 1b: astore 2
        // 1c: aload 0
        // 1d: getfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 20: ifnull 4f
        // 23: aload 0
        // 24: invokevirtual com/trolmastercard/sexmod/gi.d ()V
        // 27: aload 0
        // 28: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 2b: aload 0
        // 2c: bipush 31
        // 2e: invokevirtual net/minecraft/world/World.func_72960_a (Lnet/minecraft/entity/Entity;B)V
        // 31: aload 0
        // 32: getfield com/trolmastercard/sexmod/gi.i Lnet/minecraft/entity/Entity;
        // 35: instanceof net/minecraft/entity/item/EntityItem
        // 38: ifeq 4a
        // 3b: goto 42
        // 3e: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 41: athrow
        // 42: bipush 3
        // 43: goto 4b
        // 46: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 49: athrow
        // 4a: bipush 5
        // 4b: istore 1
        // 4c: goto b7
        // 4f: aload 0
        // 50: getfield com/trolmastercard/sexmod/gi.d I
        // 53: ifle b7
        // 56: new net/minecraft/world/storage/loot/LootContext$Builder
        // 59: dup
        // 5a: aload 0
        // 5b: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 5e: checkcast net/minecraft/world/WorldServer
        // 61: invokespecial net/minecraft/world/storage/loot/LootContext$Builder.<init> (Lnet/minecraft/world/WorldServer;)V
        // 64: astore 3
        // 65: aload 0
        // 66: getfield com/trolmastercard/sexmod/gi.field_70170_p Lnet/minecraft/world/World;
        // 69: invokevirtual net/minecraft/world/World.func_184146_ak ()Lnet/minecraft/world/storage/loot/LootTableManager;
        // 6c: getstatic net/minecraft/world/storage/loot/LootTableList.field_186387_al Lnet/minecraft/util/ResourceLocation;
        // 6f: invokevirtual net/minecraft/world/storage/loot/LootTableManager.func_186521_a (Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/world/storage/loot/LootTable;
        // 72: aload 0
        // 73: getfield com/trolmastercard/sexmod/gi.field_70146_Z Ljava/util/Random;
        // 76: aload 3
        // 77: invokevirtual net/minecraft/world/storage/loot/LootContext$Builder.func_186471_a ()Lnet/minecraft/world/storage/loot/LootContext;
        // 7a: invokevirtual net/minecraft/world/storage/loot/LootTable.func_186462_a (Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Ljava/util/List;
        // 7d: astore 4
        // 7f: aload 4
        // 81: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 86: astore 5
        // 88: aload 5
        // 8a: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 8f: ifeq ae
        // 92: aload 5
        // 94: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 99: checkcast net/minecraft/item/ItemStack
        // 9c: astore 6
        // 9e: aload 0
        // 9f: invokevirtual com/trolmastercard/sexmod/gi.b ()Lcom/trolmastercard/sexmod/eb;
        // a2: astore 7
        // a4: aload 7
        // a6: aload 6
        // a8: invokevirtual com/trolmastercard/sexmod/eb.b (Lnet/minecraft/item/ItemStack;)V
        // ab: goto 88
        // ae: aload 0
        // af: sipush 9999
        // b2: putfield com/trolmastercard/sexmod/gi.d I
        // b5: bipush 1
        // b6: istore 1
        // b7: aload 0
        // b8: getfield com/trolmastercard/sexmod/gi.k Z
        // bb: ifeq c0
        // be: bipush 2
        // bf: istore 1
        // c0: aload 2
        // c1: ifnonnull cc
        // c4: iload 1
        // c5: goto d0
        // c8: invokestatic com/trolmastercard/sexmod/gi.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // cb: athrow
        // cc: aload 2
        // cd: invokevirtual net/minecraftforge/event/entity/player/ItemFishedEvent.getRodDamage ()I
        // d0: ireturn
        // d1: bipush 0
        // d2: ireturn
        // try (0 -> 7): 8 java/lang/RuntimeException
        // try (14 -> 28): 29 java/lang/RuntimeException
        // try (17 -> 33): 33 java/lang/RuntimeException
        // try (86 -> 90): 90 java/lang/RuntimeException
    }

    protected void d() {
        eb var1 = this.b();
        if (var1 != null) {
            double var2 = var1.field_70165_t - this.field_70165_t;
            double var4 = var1.field_70163_u - this.field_70163_u;
            double var6 = var1.field_70161_v - this.field_70161_v;
            double var8 = 0.1;
            this.i.field_70159_w += var2 * 0.1;
            this.i.field_70181_x += var4 * 0.1;
            this.i.field_70179_y += var6 * 0.1;
        }
    }

    protected boolean func_70041_e_() {
        return false;
    }

    public void func_70020_e(NBTTagCompound var1) {
    }

    public NBTTagCompound func_189511_e(NBTTagCompound var1) {
        return null;
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }

    enum a {
        FLYING,
        HOOKED_IN_ENTITY,
        BOBBING;
    }
}
