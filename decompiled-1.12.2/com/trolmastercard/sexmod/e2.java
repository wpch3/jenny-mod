package com.trolmastercard.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public abstract class e2 extends em {
    public int S = 1;
    public int P;
    public int O = 0;
    public int K;
    public Vec3d V = Vec3d.field_186680_a;
    public boolean N;
    public ItemStackHandler Q = new ItemStackHandler(7);
    public static final DataParameter<ItemStack> L = EntityDataManager.func_187226_a(e2.class, DataSerializers.field_187196_f)
        .func_187156_b()
        .func_187161_a(117);
    public static final DataParameter<ItemStack> R = EntityDataManager.func_187226_a(e2.class, DataSerializers.field_187196_f)
        .func_187156_b()
        .func_187161_a(116);
    public static final DataParameter<ItemStack> X = EntityDataManager.func_187226_a(e2.class, DataSerializers.field_187196_f)
        .func_187156_b()
        .func_187161_a(115);
    public static final DataParameter<ItemStack> T = EntityDataManager.func_187226_a(e2.class, DataSerializers.field_187196_f)
        .func_187156_b()
        .func_187161_a(114);
    public static final DataParameter<ItemStack> U = EntityDataManager.func_187226_a(e2.class, DataSerializers.field_187196_f)
        .func_187156_b()
        .func_187161_a(113);
    public static final DataParameter<ItemStack> W = EntityDataManager.func_187226_a(e2.class, DataSerializers.field_187196_f)
        .func_187156_b()
        .func_187161_a(112);
    public static final DataParameter<Integer> M = EntityDataManager.func_187226_a(e2.class, DataSerializers.field_187192_b).func_187156_b().func_187161_a(111);

    protected e2(World var1) {
        super(var1);
        if (this.Q.getStackInSlot(0) == ItemStack.field_190927_a) {
            this.Q.setStackInSlot(0, new ItemStack(Items.field_151040_l));
        }

        try {
            if (this.Q.getStackInSlot(1) == ItemStack.field_190927_a) {
                this.Q.setStackInSlot(1, new ItemStack(Items.field_151031_f));
            }
        } catch (RuntimeException var2) {
            throw b(var2);
        }
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.m.func_187214_a(M, 0);
        this.m.func_187214_a(L, ItemStack.field_190927_a);
        this.m.func_187214_a(R, ItemStack.field_190927_a);
        this.m.func_187214_a(X, ItemStack.field_190927_a);
        this.m.func_187214_a(T, ItemStack.field_190927_a);
        this.m.func_187214_a(U, ItemStack.field_190927_a);
        this.m.func_187214_a(W, ItemStack.field_190927_a);
    }

    @Override
    protected void func_184651_r() {
        super.func_184651_r();
        this.field_70714_bg.func_75776_a(1, new g(this));
    }

    public void c() {
    }

    @Override
    public void func_70619_bc() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: invokespecial com/trolmastercard/sexmod/em.func_70619_bc ()V
        // 004: aload 0
        // 005: getfield com/trolmastercard/sexmod/e2.field_70173_aa I
        // 008: bipush 80
        // 00a: irem
        // 00b: ifne 0cf
        // 00e: aload 0
        // 00f: invokevirtual com/trolmastercard/sexmod/e2.func_110143_aJ ()F
        // 012: aload 0
        // 013: invokevirtual com/trolmastercard/sexmod/e2.func_110138_aP ()F
        // 016: fcmpl
        // 017: ifeq 0cf
        // 01a: goto 021
        // 01d: invokestatic com/trolmastercard/sexmod/e2.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 020: athrow
        // 021: aload 0
        // 022: invokevirtual com/trolmastercard/sexmod/e2.J ()Z
        // 025: ifne 03b
        // 028: goto 02f
        // 02b: invokestatic com/trolmastercard/sexmod/e2.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 02e: athrow
        // 02f: aload 0
        // 030: fconst_1
        // 031: invokevirtual com/trolmastercard/sexmod/e2.func_70691_i (F)V
        // 034: goto 0cf
        // 037: invokestatic com/trolmastercard/sexmod/e2.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 03a: athrow
        // 03b: aload 0
        // 03c: getfield com/trolmastercard/sexmod/e2.field_70170_p Lnet/minecraft/world/World;
        // 03f: ldc net/minecraft/entity/monster/EntityMob
        // 041: new net/minecraft/util/math/AxisAlignedBB
        // 044: dup
        // 045: new net/minecraft/util/math/BlockPos
        // 048: dup
        // 049: aload 0
        // 04a: getfield com/trolmastercard/sexmod/e2.field_70165_t D
        // 04d: ldc2_w 7.0
        // 050: dsub
        // 051: aload 0
        // 052: getfield com/trolmastercard/sexmod/e2.field_70163_u D
        // 055: dconst_1
        // 056: dsub
        // 057: aload 0
        // 058: getfield com/trolmastercard/sexmod/e2.field_70161_v D
        // 05b: ldc2_w 7.0
        // 05e: dsub
        // 05f: invokespecial net/minecraft/util/math/BlockPos.<init> (DDD)V
        // 062: new net/minecraft/util/math/BlockPos
        // 065: dup
        // 066: aload 0
        // 067: getfield com/trolmastercard/sexmod/e2.field_70165_t D
        // 06a: ldc2_w 7.0
        // 06d: dadd
        // 06e: aload 0
        // 06f: getfield com/trolmastercard/sexmod/e2.field_70163_u D
        // 072: dconst_1
        // 073: dadd
        // 074: aload 0
        // 075: getfield com/trolmastercard/sexmod/e2.field_70161_v D
        // 078: ldc2_w 7.0
        // 07b: dadd
        // 07c: invokespecial net/minecraft/util/math/BlockPos.<init> (DDD)V
        // 07f: invokespecial net/minecraft/util/math/AxisAlignedBB.<init> (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)V
        // 082: invokevirtual net/minecraft/world/World.func_72872_a (Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
        // 085: astore 1
        // 086: aload 1
        // 087: invokeinterface java/util/List.isEmpty ()Z 1
        // 08c: ifeq 097
        // 08f: bipush 4
        // 090: goto 098
        // 093: invokestatic com/trolmastercard/sexmod/e2.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 096: athrow
        // 097: bipush 1
        // 098: istore 2
        // 099: aload 0
        // 09a: iload 2
        // 09b: i2f
        // 09c: invokevirtual com/trolmastercard/sexmod/e2.func_70691_i (F)V
        // 09f: aload 0
        // 0a0: getfield com/trolmastercard/sexmod/e2.field_70170_p Lnet/minecraft/world/World;
        // 0a3: checkcast net/minecraft/world/WorldServer
        // 0a6: getstatic net/minecraft/util/EnumParticleTypes.HEART Lnet/minecraft/util/EnumParticleTypes;
        // 0a9: bipush 0
        // 0aa: aload 0
        // 0ab: getfield com/trolmastercard/sexmod/e2.field_70165_t D
        // 0ae: aload 0
        // 0af: getfield com/trolmastercard/sexmod/e2.field_70163_u D
        // 0b2: dconst_1
        // 0b3: dadd
        // 0b4: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 0b7: invokevirtual java/util/Random.nextDouble ()D
        // 0ba: dadd
        // 0bb: aload 0
        // 0bc: getfield com/trolmastercard/sexmod/e2.field_70161_v D
        // 0bf: iload 2
        // 0c0: dconst_1
        // 0c1: dconst_1
        // 0c2: dconst_1
        // 0c3: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 0c6: invokevirtual java/util/Random.nextGaussian ()D
        // 0c9: bipush 0
        // 0ca: newarray 10
        // 0cc: invokevirtual net/minecraft/world/WorldServer.func_180505_a (Lnet/minecraft/util/EnumParticleTypes;ZDDDIDDDD[I)V
        // 0cf: aload 0
        // 0d0: getfield com/trolmastercard/sexmod/e2.N Z
        // 0d3: ifeq 0f0
        // 0d6: aload 0
        // 0d7: invokevirtual com/trolmastercard/sexmod/e2.J ()Z
        // 0da: ifne 0f0
        // 0dd: goto 0e4
        // 0e0: invokestatic com/trolmastercard/sexmod/e2.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e3: athrow
        // 0e4: aload 0
        // 0e5: bipush 0
        // 0e6: putfield com/trolmastercard/sexmod/e2.N Z
        // 0e9: goto 0f0
        // 0ec: invokestatic com/trolmastercard/sexmod/e2.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ef: athrow
        // 0f0: aload 0
        // 0f1: getfield com/trolmastercard/sexmod/e2.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 0f4: getstatic com/trolmastercard/sexmod/e2.field_184621_as Lnet/minecraft/network/datasync/DataParameter;
        // 0f7: ldc "1"
        // 0f9: invokestatic java/lang/Byte.valueOf (Ljava/lang/String;)Ljava/lang/Byte;
        // 0fc: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 0ff: aload 0
        // 100: getfield com/trolmastercard/sexmod/e2.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 103: getstatic com/trolmastercard/sexmod/e2.L Lnet/minecraft/network/datasync/DataParameter;
        // 106: aload 0
        // 107: getfield com/trolmastercard/sexmod/e2.Q Lnet/minecraftforge/items/ItemStackHandler;
        // 10a: bipush 0
        // 10b: invokevirtual net/minecraftforge/items/ItemStackHandler.getStackInSlot (I)Lnet/minecraft/item/ItemStack;
        // 10e: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 111: aload 0
        // 112: getfield com/trolmastercard/sexmod/e2.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 115: getstatic com/trolmastercard/sexmod/e2.R Lnet/minecraft/network/datasync/DataParameter;
        // 118: aload 0
        // 119: getfield com/trolmastercard/sexmod/e2.Q Lnet/minecraftforge/items/ItemStackHandler;
        // 11c: bipush 1
        // 11d: invokevirtual net/minecraftforge/items/ItemStackHandler.getStackInSlot (I)Lnet/minecraft/item/ItemStack;
        // 120: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 123: aload 0
        // 124: getfield com/trolmastercard/sexmod/e2.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 127: getstatic com/trolmastercard/sexmod/e2.X Lnet/minecraft/network/datasync/DataParameter;
        // 12a: aload 0
        // 12b: getfield com/trolmastercard/sexmod/e2.Q Lnet/minecraftforge/items/ItemStackHandler;
        // 12e: bipush 2
        // 12f: invokevirtual net/minecraftforge/items/ItemStackHandler.getStackInSlot (I)Lnet/minecraft/item/ItemStack;
        // 132: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 135: aload 0
        // 136: getfield com/trolmastercard/sexmod/e2.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 139: getstatic com/trolmastercard/sexmod/e2.T Lnet/minecraft/network/datasync/DataParameter;
        // 13c: aload 0
        // 13d: getfield com/trolmastercard/sexmod/e2.Q Lnet/minecraftforge/items/ItemStackHandler;
        // 140: bipush 3
        // 141: invokevirtual net/minecraftforge/items/ItemStackHandler.getStackInSlot (I)Lnet/minecraft/item/ItemStack;
        // 144: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 147: aload 0
        // 148: getfield com/trolmastercard/sexmod/e2.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 14b: getstatic com/trolmastercard/sexmod/e2.U Lnet/minecraft/network/datasync/DataParameter;
        // 14e: aload 0
        // 14f: getfield com/trolmastercard/sexmod/e2.Q Lnet/minecraftforge/items/ItemStackHandler;
        // 152: bipush 4
        // 153: invokevirtual net/minecraftforge/items/ItemStackHandler.getStackInSlot (I)Lnet/minecraft/item/ItemStack;
        // 156: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 159: aload 0
        // 15a: getfield com/trolmastercard/sexmod/e2.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 15d: getstatic com/trolmastercard/sexmod/e2.W Lnet/minecraft/network/datasync/DataParameter;
        // 160: aload 0
        // 161: getfield com/trolmastercard/sexmod/e2.Q Lnet/minecraftforge/items/ItemStackHandler;
        // 164: bipush 5
        // 165: invokevirtual net/minecraftforge/items/ItemStackHandler.getStackInSlot (I)Lnet/minecraft/item/ItemStack;
        // 168: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 16b: return
        // try (0 -> 13): 14 java/lang/RuntimeException
        // try (7 -> 19): 20 java/lang/RuntimeException
        // try (16 -> 26): 26 java/lang/RuntimeException
        // try (66 -> 71): 71 java/lang/RuntimeException
        // try (104 -> 110): 111 java/lang/RuntimeException
        // try (107 -> 116): 117 java/lang/RuntimeException
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void a(String var1, UUID var2) {
        try {
            if ("action.names.followme".equals(var1)) {
                this.a("master", var2.toString());
                return;
            }
        } catch (RuntimeException var7) {
            throw b(var7);
        }

        try {
            if ("action.names.stopfollowme".equals(var1)) {
                this.x();
                return;
            }
        } catch (RuntimeException var6) {
            throw b(var6);
        }

        if ("action.names.equipment".equals(var1)) {
            EntityPlayerSP var3 = Minecraft.func_71410_x().field_71439_g;
            ge.b.sendToServer(new bo(this.f(), var3.getPersistentID()));
        } else {
            try {
                if ("action.names.gohome".equals(var1)) {
                    this.x();
                    ge.b.sendToServer(new gg(this.f()));
                    return;
                }
            } catch (RuntimeException var5) {
                throw b(var5);
            }

            try {
                if ("action.names.setnewhome".equals(var1)) {
                    this.c();
                    ge.b.sendToServer(new a6(this.f(), new Vec3d(this.func_180425_c())));
                }
            } catch (RuntimeException var4) {
                throw b(var4);
            }
        }
    }

    @Override
    public void func_70014_b(NBTTagCompound var1) {
        var1.func_74782_a("inventory", this.Q.serializeNBT());
        super.func_70014_b(var1);
    }

    @Override
    public void func_70037_a(NBTTagCompound var1) {
        super.func_70037_a(var1);
        this.Q.deserializeNBT(var1.func_74775_l("inventory"));
    }

    public boolean hasCapability(Capability<?> param1, EnumFacing param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: getstatic net/minecraftforge/items/CapabilityItemHandler.ITEM_HANDLER_CAPABILITY Lnet/minecraftforge/common/capabilities/Capability;
        // 04: if_acmpeq 17
        // 07: aload 0
        // 08: aload 1
        // 09: aload 2
        // 0a: invokespecial com/trolmastercard/sexmod/em.hasCapability (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/util/EnumFacing;)Z
        // 0d: ifeq 1f
        // 10: goto 17
        // 13: invokestatic com/trolmastercard/sexmod/e2.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 16: athrow
        // 17: bipush 1
        // 18: goto 20
        // 1b: invokestatic com/trolmastercard/sexmod/e2.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1e: athrow
        // 1f: bipush 0
        // 20: ireturn
        // try (0 -> 8): 9 java/lang/RuntimeException
        // try (3 -> 13): 13 java/lang/RuntimeException
    }

    public <T> T getCapability(Capability<T> var1, EnumFacing var2) {
        try {
            if (var1 == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
                return (T)this.Q;
            }
        } catch (RuntimeException var3) {
            throw b(var3);
        }

        return (T)super.getCapability(var1, var2);
    }

    private static RuntimeException b(RuntimeException var0) {
        return var0;
    }
}
