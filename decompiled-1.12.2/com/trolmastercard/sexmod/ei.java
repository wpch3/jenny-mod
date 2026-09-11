package com.trolmastercard.sexmod;

import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.vecmath.Vector2f;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class ei extends e2 {
    public static final String aa = "sexmod:CustomModel";
    public static final String ae = "sexmod:GirlSpecific";
    public static final float ac = 0.0F;
    public static final int am = 100;
    public static final int Y = 65;
    public static boolean ag = true;
    public Vector2f ao = new Vector2f(0.0F, 0.0F);
    public boolean ad = false;
    public boolean aj = false;
    public boolean ak = false;
    public boolean af = true;
    public boolean ah = false;
    protected static final DataParameter<Optional<UUID>> ai = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187203_m)
        .func_187156_b()
        .func_187161_a(118);
    public static Hashtable<UUID, ei> al = new Hashtable<>();
    public static List<ei> Z = new ArrayList<>();
    int an = -1;
    public boolean ab = true;

    protected ei(World var1) {
        super(var1);
        this.func_70105_a(0.01F, 0.01F);
        Z.add(this);
    }

    protected ei(World var1, UUID var2) {
        this(var1);
        this.m.func_187227_b(ai, Optional.of(var2));
    }

    @Nullable
    public static ei d(UUID var0) {
        return al.get(var0);
    }

    @Nullable
    public static ei g(@Nonnull EntityPlayer var0) {
        return al.get(var0.getPersistentID());
    }

    @Nullable
    public static ei a(UUID var0) {
        try {
            for (em var2 : ad()) {
                try {
                    if (var2.field_70170_p.field_72995_K) {
                        continue;
                    }
                } catch (ConcurrentModificationException var5) {
                    throw a(var5);
                }

                try {
                    if (!(var2 instanceof ei)) {
                        continue;
                    }
                } catch (ConcurrentModificationException var4) {
                    throw a(var4);
                }

                ei var3 = (ei)var2;
                if (var0.equals(var3.m())) {
                    return var3;
                }
            }
        } catch (ConcurrentModificationException var6) {
        }

        return null;
    }

    @Override
    public TargetPoint P() {
        return new TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u - 0.0, this.field_70161_v, 50.0);
    }

    public void a(int var1, fp var2) {
        ge.b.sendToAllTracking(new gd(this.m(), var1, var2), this.P());
    }

    public EntityPlayer c(EntityPlayer var1) {
        return var1;
    }

    public boolean z() {
        return true;
    }

    public Vec3d c(Vec3d var1, float var2) {
        return var1;
    }

    public boolean func_70067_L() {
        return false;
    }

    public boolean v() {
        return true;
    }

    public boolean q() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public void H() {
    }

    public boolean p() {
        return true;
    }

    public boolean a(String var1) {
        return false;
    }

    public boolean A() {
        return true;
    }

    @Override
    public String c() {
        if (((Optional)this.m.func_187225_a(ai)).isPresent()) {
            EntityPlayer var1 = this.field_70170_p.func_152378_a((UUID)((Optional)this.m.func_187225_a(ai)).get());

            try {
                if (var1 != null) {
                    return var1.func_70005_c_();
                }
            } catch (ConcurrentModificationException var2) {
                throw a(var2);
            }
        }

        return "anonymous horny girl";
    }

    public void u() {
    }

    public abstract void b(String var1, UUID var2);

    public abstract at a(int var1);

    public abstract String c(int var1);

    public Vec3i b(int var1) {
        return new Vec3i(255, 255, 255);
    }

    @Override
    public boolean func_70104_M() {
        return false;
    }

    public boolean func_70058_J() {
        return true;
    }

    public boolean F() {
        return false;
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.m.func_187214_a(ai, Optional.absent());
    }

    @SideOnly(Side.CLIENT)
    public static void i() {
        ei var0 = d(Minecraft.func_71410_x().field_71439_g.getPersistentID());

        try {
            if (var0 == null) {
                return;
            }
        } catch (ConcurrentModificationException var1) {
            throw a(var1);
        }

        var0.r();
    }

    @Override
    public void r() {
        try {
            this.B = null;
            this.func_189654_d(false);
            if (this.field_70170_p.field_72995_K) {
                this.V();
            }
        } catch (ConcurrentModificationException var1) {
            throw a(var1);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    protected void V() {
        try {
            if (!this.n() && !this.f()) {
                return;
            }
        } catch (ConcurrentModificationException var2) {
            throw a(var2);
        }

        d3.a(true);
        EntityPlayerSP var1 = Minecraft.func_71410_x().field_71439_g;
        var1.func_82142_c(false);
        var1.func_189654_d(false);
        var1.field_70145_X = false;
        this.m.func_187227_b(G, false);
        ge.b.sendToServer(new s(this.f()));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean H() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 03: astore 1
        // 04: aload 0
        // 05: invokevirtual com/trolmastercard/sexmod/ei.f ()Z
        // 08: ifeq 1c
        // 0b: aload 1
        // 0c: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 0f: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 12: ifeq 24
        // 15: goto 1c
        // 18: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 1b: athrow
        // 1c: bipush 1
        // 1d: goto 25
        // 20: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 23: athrow
        // 24: bipush 0
        // 25: ireturn
        // try (2 -> 9): 10 java/util/ConcurrentModificationException
        // try (5 -> 14): 14 java/util/ConcurrentModificationException
    }

    protected void c(boolean var1) {
        try {
            if (!ag) {
                return;
            }
        } catch (ConcurrentModificationException var4) {
            throw a(var4);
        }

        try {
            if (this.m() == null) {
                return;
            }
        } catch (ConcurrentModificationException var6) {
            throw a(var6);
        }

        EntityPlayer var2 = this.field_70170_p.func_152378_a(this.m());

        try {
            if (var2 == null) {
                return;
            }
        } catch (ConcurrentModificationException var3) {
            throw a(var3);
        }

        try {
            var2.field_71075_bZ.field_75101_c = var1;
            if (!var1) {
                var2.field_71075_bZ.field_75100_b = false;
            }
        } catch (ConcurrentModificationException var5) {
            throw a(var5);
        }

        var2.func_71016_p();
    }

    public static boolean e(UUID var0) {
        C();

        for (Entry var2 : al.entrySet()) {
            UUID var3 = (UUID)var2.getKey();

            try {
                if (var0.equals(var3)) {
                    return true;
                }
            } catch (ConcurrentModificationException var4) {
                throw a(var4);
            }
        }

        return false;
    }

    public static boolean e(EntityPlayer var0) {
        try {
            if (var0 == null) {
                return false;
            }
        } catch (ConcurrentModificationException var1) {
            throw a(var1);
        }

        return e(var0.getPersistentID());
    }

    public AxisAlignedBB func_174813_aQ() {
        return super.func_174813_aQ().func_72317_d(0.0, 0.5, 0.0);
    }

    protected EntityPlayer j() {
        List var1 = this.field_70170_p.field_73010_i;
        EntityPlayer var2 = null;

        for (EntityPlayer var4 : var1) {
            try {
                if (var4.getPersistentID().equals(((Optional)this.m.func_187225_a(ai)).get())) {
                    continue;
                }
            } catch (ConcurrentModificationException var9) {
                throw a(var9);
            }

            if (var2 == null) {
                var2 = var4;
            } else {
                double var5 = var2.func_70092_e(this.w().field_72450_a, this.w().field_72448_b, this.w().field_72449_c);
                double var7 = var4.func_70092_e(this.w().field_72450_a, this.w().field_72448_b, this.w().field_72449_c);
                if (var7 < var5) {
                    var2 = var4;
                }
            }
        }

        return var2;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean e() {
        EntityPlayer var1 = this.j();

        try {
            if (var1 == null) {
                return false;
            }
        } catch (ConcurrentModificationException var2) {
            throw a(var2);
        }

        return var1.getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID());
    }

    public Vec3d w() {
        return new Vec3d(this.field_70165_t, this.field_70163_u - 0.0, this.field_70161_v);
    }

    protected void b(UUID var1) {
        EntityPlayerMP var2 = (EntityPlayerMP)this.field_70170_p.func_152378_a(var1);
        EntityPlayerMP var3 = (EntityPlayerMP)this.field_70170_p.func_152378_a((UUID)((Optional)this.m.func_187225_a(ai)).get());
        ge.b.sendTo(new gz(false), var2);
        ge.b.sendTo(new gz(false), var3);
        this.e(var1);
        this.field_70177_z = 0.0F;
        this.field_70759_as = 0.0F;
        var2.field_70177_z = 180.0F;
        var2.field_70759_as = 180.0F;
        var2.func_189654_d(true);
        var2.field_70145_X = true;
        Vec3d var4 = this.func_174791_d();
        var2.func_70634_a(var4.field_72450_a, var4.field_72448_b, var4.field_72449_c + 1.0);
        var2.field_71075_bZ.field_75100_b = true;
        var3.field_71075_bZ.field_75100_b = true;
        this.j(var1);
        this.m.func_187227_b(G, true);
        this.c(var4);
        this.b(0.0F);
    }

    protected void func_180429_a(BlockPos var1, Block var2) {
        super.func_180429_a(var1, var2);
    }

    public AxisAlignedBB a(EntityPlayer var1) {
        return var1.func_174813_aQ();
    }

    @Override
    public void func_70071_h_() {
        try {
            this.field_70145_X = true;
            this.func_189654_d(true);
            super.func_70071_h_();
            this.D();
            if (!this.field_70170_p.field_72995_K) {
                return;
            }
        } catch (ConcurrentModificationException var2) {
            throw a(var2);
        }

        try {
            if (this.f()) {
                com.trolmastercard.sexmod.w.a.a();
            }
        } catch (ConcurrentModificationException var1) {
            throw a(var1);
        }
    }

    @SideOnly(Side.CLIENT)
    void h() {
        Minecraft.func_71410_x().field_71439_g.eyeHeight = this.func_70047_e();
    }

    @SideOnly(Side.CLIENT)
    public boolean f() {
        try {
            if (!((Optional)this.m.func_187225_a(ai)).isPresent()) {
                return false;
            }
        } catch (ConcurrentModificationException var1) {
            throw a(var1);
        }

        return ((UUID)((Optional)this.m.func_187225_a(ai)).get()).equals(Minecraft.func_71410_x().field_71439_g.getPersistentID());
    }

    public boolean E() {
        return false;
    }

    void d(EntityPlayer var1) {
        NBTTagCompound var2 = var1.getEntityData();
        String var3 = var2.func_74779_i("sexmod:CustomModel" + fy.a(this));
        this.f(var3);
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
        // 00: invokestatic com/trolmastercard/sexmod/ei.C ()V
        // 03: aload 0
        // 04: invokevirtual com/trolmastercard/sexmod/ei.l ()V
        // 07: aload 0
        // 08: invokevirtual com/trolmastercard/sexmod/ei.G ()V
        // 0b: aload 0
        // 0c: invokevirtual com/trolmastercard/sexmod/ei.m ()Ljava/util/UUID;
        // 0f: astore 1
        // 10: aload 1
        // 11: ifnonnull 19
        // 14: return
        // 15: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 18: athrow
        // 19: aload 0
        // 1a: getfield com/trolmastercard/sexmod/ei.field_70170_p Lnet/minecraft/world/World;
        // 1d: aload 1
        // 1e: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // 21: astore 2
        // 22: aload 2
        // 23: ifnonnull 38
        // 26: aload 0
        // 27: aload 0
        // 28: getfield com/trolmastercard/sexmod/ei.field_70165_t D
        // 2b: dconst_0
        // 2c: aload 0
        // 2d: getfield com/trolmastercard/sexmod/ei.field_70161_v D
        // 30: invokevirtual com/trolmastercard/sexmod/ei.func_70634_a (DDD)V
        // 33: return
        // 34: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 37: athrow
        // 38: aload 0
        // 39: aload 2
        // 3a: invokevirtual com/trolmastercard/sexmod/ei.d (Lnet/minecraft/entity/player/EntityPlayer;)V
        // 3d: aload 0
        // 3e: invokevirtual com/trolmastercard/sexmod/ei.Q ()Z
        // 41: ifeq 5c
        // 44: aload 0
        // 45: invokevirtual com/trolmastercard/sexmod/ei.o ()Lnet/minecraft/util/math/Vec3d;
        // 48: astore 3
        // 49: aload 0
        // 4a: aload 3
        // 4b: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 4e: aload 3
        // 4f: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 52: aload 3
        // 53: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 56: invokevirtual com/trolmastercard/sexmod/ei.func_70634_a (DDD)V
        // 59: goto 6e
        // 5c: aload 0
        // 5d: aload 2
        // 5e: getfield net/minecraft/entity/player/EntityPlayer.field_70165_t D
        // 61: aload 2
        // 62: getfield net/minecraft/entity/player/EntityPlayer.field_70163_u D
        // 65: dconst_0
        // 66: dadd
        // 67: aload 2
        // 68: getfield net/minecraft/entity/player/EntityPlayer.field_70161_v D
        // 6b: invokevirtual com/trolmastercard/sexmod/ei.func_70634_a (DDD)V
        // 6e: aload 0
        // 6f: invokevirtual com/trolmastercard/sexmod/ei.y ()Lcom/trolmastercard/sexmod/fp;
        // 72: astore 3
        // 73: aload 3
        // 74: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 77: if_acmpne 96
        // 7a: aload 2
        // 7b: getfield net/minecraft/entity/player/EntityPlayer.field_82175_bq Z
        // 7e: ifeq 96
        // 81: goto 88
        // 84: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 87: athrow
        // 88: aload 0
        // 89: getstatic com/trolmastercard/sexmod/fp.ATTACK Lcom/trolmastercard/sexmod/fp;
        // 8c: invokevirtual com/trolmastercard/sexmod/ei.b (Lcom/trolmastercard/sexmod/fp;)V
        // 8f: goto 96
        // 92: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 95: athrow
        // 96: aload 3
        // 97: getstatic com/trolmastercard/sexmod/fp.ATTACK Lcom/trolmastercard/sexmod/fp;
        // 9a: if_acmpne b9
        // 9d: aload 2
        // 9e: getfield net/minecraft/entity/player/EntityPlayer.field_82175_bq Z
        // a1: ifne b9
        // a4: goto ab
        // a7: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // aa: athrow
        // ab: aload 0
        // ac: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // af: invokevirtual com/trolmastercard/sexmod/ei.b (Lcom/trolmastercard/sexmod/fp;)V
        // b2: goto b9
        // b5: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // b8: athrow
        // b9: return
        // try (8 -> 11): 11 java/util/ConcurrentModificationException
        // try (18 -> 28): 28 java/util/ConcurrentModificationException
        // try (61 -> 67): 68 java/util/ConcurrentModificationException
        // try (64 -> 73): 74 java/util/ConcurrentModificationException
        // try (76 -> 82): 83 java/util/ConcurrentModificationException
        // try (79 -> 88): 89 java/util/ConcurrentModificationException
    }

    void D() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/ei.an I
        // 04: bipush -1
        // 05: if_icmpne 0d
        // 08: return
        // 09: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0c: athrow
        // 0d: aload 0
        // 0e: dup
        // 0f: getfield com/trolmastercard/sexmod/ei.an I
        // 12: bipush 1
        // 13: iadd
        // 14: putfield com/trolmastercard/sexmod/ei.an I
        // 17: aload 0
        // 18: getfield com/trolmastercard/sexmod/ei.field_70170_p Lnet/minecraft/world/World;
        // 1b: getfield net/minecraft/world/World.field_72995_K Z
        // 1e: ifne 4c
        // 21: aload 0
        // 22: getfield com/trolmastercard/sexmod/ei.an I
        // 25: bipush 65
        // 27: if_icmpne 4c
        // 2a: goto 31
        // 2d: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 30: athrow
        // 31: aload 0
        // 32: aload 0
        // 33: invokevirtual com/trolmastercard/sexmod/ei.ah ()I
        // 36: ifne 48
        // 39: goto 40
        // 3c: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 3f: athrow
        // 40: bipush 1
        // 41: goto 49
        // 44: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 47: athrow
        // 48: bipush 0
        // 49: invokevirtual com/trolmastercard/sexmod/ei.f (I)V
        // 4c: aload 0
        // 4d: getfield com/trolmastercard/sexmod/ei.an I
        // 50: bipush 100
        // 52: if_icmpge 5a
        // 55: return
        // 56: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 59: athrow
        // 5a: aload 0
        // 5b: invokevirtual com/trolmastercard/sexmod/ei.y ()Lcom/trolmastercard/sexmod/fp;
        // 5e: getstatic com/trolmastercard/sexmod/fp.STRIP Lcom/trolmastercard/sexmod/fp;
        // 61: if_acmpeq 69
        // 64: return
        // 65: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 68: athrow
        // 69: aload 0
        // 6a: getfield com/trolmastercard/sexmod/ei.field_70170_p Lnet/minecraft/world/World;
        // 6d: getfield net/minecraft/world/World.field_72995_K Z
        // 70: ifeq 7c
        // 73: aload 0
        // 74: invokevirtual com/trolmastercard/sexmod/ei.n ()V
        // 77: return
        // 78: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 7b: athrow
        // 7c: aload 0
        // 7d: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 80: invokevirtual com/trolmastercard/sexmod/ei.b (Lcom/trolmastercard/sexmod/fp;)V
        // 83: return
        // try (0 -> 5): 5 java/util/ConcurrentModificationException
        // try (7 -> 21): 22 java/util/ConcurrentModificationException
        // try (17 -> 28): 29 java/util/ConcurrentModificationException
        // try (24 -> 33): 33 java/util/ConcurrentModificationException
        // try (37 -> 42): 42 java/util/ConcurrentModificationException
        // try (44 -> 49): 49 java/util/ConcurrentModificationException
        // try (51 -> 58): 58 java/util/ConcurrentModificationException
    }

    @SideOnly(Side.CLIENT)
    void n() {
        if (this.f()) {
            Minecraft var1 = Minecraft.func_71410_x();
            var1.field_71474_y.field_74320_O = 0;
            var1.field_71460_t.func_175066_a(var1.func_175606_aa());
            d3.a(true);
        }
    }

    public boolean o() {
        return this.Q();
    }

    public Vec3d b(Vec3d var1, float var2) {
        return var1;
    }

    public boolean a(fp var1, EntityPlayer var2) {
        return false;
    }

    public boolean l() {
        return true;
    }

    public void b(EntityPlayer var1) {
    }

    @Override
    public void b(fp param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/ei.field_70170_p Lnet/minecraft/world/World;
        // 04: getfield net/minecraft/world/World.field_72995_K Z
        // 07: ifne 33
        // 0a: aload 1
        // 0b: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 0e: if_acmpne 33
        // 11: goto 18
        // 14: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 17: athrow
        // 18: aload 0
        // 19: invokevirtual com/trolmastercard/sexmod/ei.Q ()Z
        // 1c: ifeq 33
        // 1f: goto 26
        // 22: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 25: athrow
        // 26: getstatic java/lang/System.out Ljava/io/PrintStream;
        // 29: ldc "prevented a potential animation break"
        // 2b: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
        // 2e: return
        // 2f: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 32: athrow
        // 33: aload 1
        // 34: getstatic com/trolmastercard/sexmod/fp.STRIP Lcom/trolmastercard/sexmod/fp;
        // 37: if_acmpne 58
        // 3a: aload 0
        // 3b: aload 0
        // 3c: getfield com/trolmastercard/sexmod/ei.field_70170_p Lnet/minecraft/world/World;
        // 3f: getfield net/minecraft/world/World.field_72995_K Z
        // 42: ifeq 54
        // 45: goto 4c
        // 48: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 4b: athrow
        // 4c: bipush 5
        // 4d: goto 55
        // 50: invokestatic com/trolmastercard/sexmod/ei.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 53: athrow
        // 54: bipush 0
        // 55: putfield com/trolmastercard/sexmod/ei.an I
        // 58: aload 0
        // 59: aload 1
        // 5a: invokespecial com/trolmastercard/sexmod/e2.b (Lcom/trolmastercard/sexmod/fp;)V
        // 5d: return
        // try (0 -> 7): 8 java/util/ConcurrentModificationException
        // try (4 -> 13): 14 java/util/ConcurrentModificationException
        // try (10 -> 20): 20 java/util/ConcurrentModificationException
        // try (22 -> 30): 31 java/util/ConcurrentModificationException
        // try (25 -> 35): 35 java/util/ConcurrentModificationException
    }

    void f(EntityPlayer var1) {
        this.m.func_187227_b(X, ItemStack.field_190927_a);
        this.m.func_187227_b(T, ItemStack.field_190927_a);
        this.m.func_187227_b(U, ItemStack.field_190927_a);
        this.m.func_187227_b(W, ItemStack.field_190927_a);

        for (ItemStack var3 : var1.func_184193_aE()) {
            try {
                if (var3.func_77973_b() instanceof ItemElytra) {
                    this.m.func_187227_b(T, var3);
                    continue;
                }
            } catch (ConcurrentModificationException var7) {
                throw a(var7);
            }

            try {
                if (!(var3.func_77973_b() instanceof ItemArmor)) {
                    continue;
                }
            } catch (ConcurrentModificationException var5) {
                throw a(var5);
            }

            ItemArmor var4 = (ItemArmor)var3.func_77973_b();

            label43: {
                label42: {
                    try {
                        switch (var4.func_185083_B_()) {
                            case HEAD:
                                this.m.func_187227_b(X, var3);
                                continue;
                            case CHEST:
                                break label43;
                            case LEGS:
                                break label42;
                            case FEET:
                                break;
                            default:
                                continue;
                        }
                    } catch (ConcurrentModificationException var6) {
                        throw a(var6);
                    }

                    this.m.func_187227_b(W, var3);
                    continue;
                }

                this.m.func_187227_b(U, var3);
                continue;
            }

            this.m.func_187227_b(T, var3);
        }
    }

    public UUID m() {
        try {
            return ((Optional)this.m.func_187225_a(ai)).isPresent() ? (UUID)((Optional)this.m.func_187225_a(ai)).get() : null;
        } catch (ConcurrentModificationException var1) {
            throw a(var1);
        }
    }

    @Nullable
    public EntityPlayer k() {
        UUID var1 = this.m();

        try {
            if (var1 == null) {
                return null;
            }
        } catch (ConcurrentModificationException var2) {
            throw a(var2);
        }

        return this.field_70170_p.func_152378_a(var1);
    }

    public void a(Optional<UUID> var1) {
        this.m.func_187227_b(ai, var1);
    }

    public void y() {
    }

    public void B() {
    }

    public static void C() {
        ArrayList var0 = new ArrayList();

        try {
            for (ei var2 : Z) {
                try {
                    if (var2.m() != null) {
                        al.put(var2.m(), var2);
                        var0.add(var2);
                    }
                } catch (ConcurrentModificationException var3) {
                    throw a(var3);
                }
            }
        } catch (ConcurrentModificationException var4) {
        }

        for (ei var6 : var0) {
            Z.remove(var6);
        }

        t();
    }

    static void t() {
        ArrayList var0 = new ArrayList();

        for (Entry var2 : al.entrySet()) {
            try {
                if (((ei)var2.getValue()).field_70128_L) {
                    var0.add(var2.getKey());
                }
            } catch (ConcurrentModificationException var3) {
                throw a(var3);
            }
        }

        for (UUID var5 : var0) {
            al.remove(var5);
        }
    }

    protected boolean c(UUID var1) {
        try {
            if (var1 == null) {
                return false;
            }
        } catch (ConcurrentModificationException var4) {
            throw a(var4);
        }

        ei var2 = d(var1);

        try {
            if (var2 != null) {
                return true;
            }
        } catch (ConcurrentModificationException var3) {
            throw a(var3);
        }

        return false;
    }

    @Override
    public void a(String var1, UUID var2) {
        try {
            if (this.a(var1)) {
                return;
            }
        } catch (ConcurrentModificationException var3) {
            throw a(var3);
        }

        try {
            if (!((Optional)this.m.func_187225_a(ai)).isPresent()) {
                return;
            }
        } catch (ConcurrentModificationException var4) {
            throw a(var4);
        }

        ge.b.sendToServer(new g4(var1, var2, (UUID)((Optional)this.m.func_187225_a(ai)).get(), this.ab));
        this.ab = true;
    }

    @Override
    public void func_70014_b(NBTTagCompound var1) {
        super.func_70014_b(var1);
        var1.func_74778_a("owner", ((UUID)((Optional)this.m.func_187225_a(ai)).get()).toString());
    }

    @Override
    public void func_70037_a(NBTTagCompound var1) {
        super.func_70037_a(var1);
        this.m.func_187227_b(ai, Optional.of(UUID.fromString(var1.func_74779_i("owner"))));
        Z.add(this);
    }

    @Override
    public void a(SoundEvent var1, float var2, float var3) {
        Vec3d var4 = this.w();

        try {
            if (this.field_70170_p.field_72995_K) {
                this.field_70170_p.func_184134_a(var4.field_72450_a, var4.field_72448_b, var4.field_72449_c, var1, SoundCategory.NEUTRAL, var2, var3, false);
                return;
            }
        } catch (ConcurrentModificationException var5) {
            throw a(var5);
        }

        this.field_70170_p
            .func_184133_a(null, new BlockPos(var4.field_72450_a, var4.field_72448_b, var4.field_72449_c), var1, SoundCategory.PLAYERS, var2, var3);
    }

    @Override
    public void a(SoundEvent var1) {
        this.a(var1, 1.0F, 1.0F);
    }

    public void a(SoundEvent[] var1) {
        this.a(var1[this.func_70681_au().nextInt(var1.length)], 1.0F, 1.0F);
    }

    @Override
    public void a(SoundEvent var1, float var2) {
        this.a(var1, var2, 1.0F);
    }

    @Override
    protected void U() {
    }

    private static ConcurrentModificationException a(ConcurrentModificationException var0) {
        return var0;
    }
}
