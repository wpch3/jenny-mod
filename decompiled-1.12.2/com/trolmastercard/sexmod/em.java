package com.trolmastercard.sexmod;

import com.mojang.realmsclient.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.GeoModelProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.util.MatrixStack;

public abstract class em extends EntityCreature implements IAnimatable {
    public static int j = 22;
    protected static final long t = 20L;
    private final AnimationFactory g;
    public EntityAIWanderAvoidWater z;
    public df o;
    public static HashSet<em> k = new HashSet<>();
    public Vec3d B;
    protected float r;
    protected EntityDataManager m;
    public PathNavigate f;
    public Vec3d l;
    public EntityEnderPearl q;
    public float n;
    public boolean F;
    private boolean i;
    HashMap<String, Vec3d> x;
    public static final DataParameter<String> v = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(110);
    public static final DataParameter<Boolean> G = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187198_h).func_187156_b().func_187161_a(109);
    public static final DataParameter<String> e = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(108);
    public static final DataParameter<Float> w = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187193_c).func_187156_b().func_187161_a(107);
    public static final DataParameter<String> u = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(106);
    public static final DataParameter<Integer> D = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187192_b).func_187156_b().func_187161_a(105);
    public static final DataParameter<String> J = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(104);
    public static final DataParameter<String> h = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(103);
    public static final DataParameter<String> y = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(102);
    public static final DataParameter<String> a = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(101);
    public static final DataParameter<String> b = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(100);
    public static final DataParameter<String> c = EntityDataManager.func_187226_a(em.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(99);
    protected static final List<Item> I = Arrays.asList(Items.field_151166_bC, Items.field_151045_i, Items.field_151043_k, Items.field_151079_bi);
    public AnimationController C;
    public AnimationController E;
    public AnimationController s;
    HashMap<String, Pair<Integer, Integer>> A;
    AnimationProcessor<?> H;
    public List<String> p;
    protected List<Entry<gw, Entry<List<String>, Integer>>> d;

    public void a(em.a var1) {
        this.m.func_187227_b(a, var1.toString());
    }

    public em.a q() {
        return em.a.valueOf((String)this.m.func_187225_a(a));
    }

    @SideOnly(Side.CLIENT)
    protected void a(String var1, String var2) {
        ge.b.sendToServer(new n(this.f(), var1, var2));
    }

    public UUID f() {
        try {
            return UUID.fromString((String)this.m.func_187225_a(u));
        } catch (Exception var3) {
            UUID var2 = UUID.randomUUID();
            this.m.func_187227_b(u, var2.toString());
            return var2;
        }
    }

    public fp y() {
        return fp.valueOf((String)this.m.func_187225_a(J));
    }

    public void b(fp param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 04: astore 2
        // 05: aload 2
        // 06: aload 1
        // 07: if_acmpne 0f
        // 0a: return
        // 0b: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e: athrow
        // 0f: aload 1
        // 10: getstatic com/trolmastercard/sexmod/fp.ATTACK Lcom/trolmastercard/sexmod/fp;
        // 13: if_acmpne 29
        // 16: aload 2
        // 17: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 1a: if_acmpeq 29
        // 1d: goto 24
        // 20: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 23: athrow
        // 24: return
        // 25: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 28: athrow
        // 29: aload 1
        // 2a: ifnonnull 37
        // 2d: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 30: goto 38
        // 33: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 36: athrow
        // 37: aload 1
        // 38: astore 1
        // 39: aload 0
        // 3a: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 3d: getfield net/minecraft/world/World.field_72995_K Z
        // 40: ifeq 52
        // 43: aload 0
        // 44: ldc "currentAction"
        // 46: aload 1
        // 47: invokevirtual com/trolmastercard/sexmod/fp.toString ()Ljava/lang/String;
        // 4a: invokevirtual com/trolmastercard/sexmod/em.a (Ljava/lang/String;Ljava/lang/String;)V
        // 4d: return
        // 4e: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 51: athrow
        // 52: aload 2
        // 53: bipush 2
        // 54: newarray 10
        // 56: dup
        // 57: bipush 0
        // 58: bipush 0
        // 59: iastore
        // 5a: dup
        // 5b: bipush 1
        // 5c: bipush 0
        // 5d: iastore
        // 5e: putfield com/trolmastercard/sexmod/fp.ticksPlaying [I
        // 61: aload 0
        // 62: getfield com/trolmastercard/sexmod/em.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 65: getstatic com/trolmastercard/sexmod/em.J Lnet/minecraft/network/datasync/DataParameter;
        // 68: aload 1
        // 69: invokevirtual com/trolmastercard/sexmod/fp.toString ()Ljava/lang/String;
        // 6c: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 6f: return
        // try (3 -> 7): 7 java/util/ConcurrentModificationException
        // try (9 -> 15): 16 java/util/ConcurrentModificationException
        // try (12 -> 19): 19 java/util/ConcurrentModificationException
        // try (21 -> 25): 25 java/util/ConcurrentModificationException
        // try (29 -> 39): 39 java/util/ConcurrentModificationException
    }

    public int ah() {
        return (Integer)this.m.func_187225_a(D);
    }

    public void f(int var1) {
        try {
            if (this.field_70170_p.field_72995_K) {
                this.a("currentModel", "0");
                return;
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }

        this.m.func_187227_b(D, var1);
    }

    public boolean m() {
        return false;
    }

    @Nullable
    public EntityPlayer S() {
        UUID var1 = this.ae();

        try {
            if (var1 == null) {
                return null;
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }

        return this.field_70170_p.func_152378_a(var1);
    }

    public static void a(em var0, String var1) {
        for (EntityPlayer var3 : cj.a(var0)) {
            var3.func_145747_a(new TextComponentString(var1));
        }
    }

    public static void a(em var0, SoundEvent var1, boolean var2) {
        Vec3d var3 = var0.func_174791_d();

        for (EntityPlayer var5 : cj.a(var0)) {
            Vec3d var6;
            if (!var2) {
                var6 = var3;
            } else {
                Vec3d var7 = var5.func_174791_d();
                Vec3d var8 = var3.func_178788_d(var7).func_72432_b();
                var6 = var7.func_178787_e(var8);
            }

            ((EntityPlayerMP)var5)
                .field_71135_a
                .func_147359_a(new SPacketSoundEffect(var1, SoundCategory.AMBIENT, var6.field_72450_a, var6.field_72448_b, var6.field_72449_c, 1.0F, 1.0F));
        }
    }

    public static void a(em var0, SoundEvent var1) {
        a(var0, var1, false);
    }

    public static void a(em var0, SoundEvent[] var1) {
        a(var0, com.trolmastercard.sexmod.c.a(var1));
    }

    public static void a(em var0, SoundEvent[] var1, boolean var2) {
        a(var0, com.trolmastercard.sexmod.c.a(var1), var2);
    }

    @SideOnly(Side.CLIENT)
    public Vec3d A() {
        Vec3d var1 = Minecraft.func_71410_x().field_71439_g.func_174791_d();
        Vec3d var2 = this.func_174791_d();
        Vec3d var3 = var2.func_178788_d(var1).func_72432_b();
        return var1.func_178787_e(var3);
    }

    @Nullable
    public UUID ae() {
        String var1 = (String)this.m.func_187225_a(y);

        try {
            if (var1.equals("null")) {
                return null;
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }

        return UUID.fromString(var1);
    }

    public void e(UUID param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 04: getfield net/minecraft/world/World.field_72995_K Z
        // 07: ifeq 2e
        // 0a: aload 1
        // 0b: ifnonnull 23
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14: athrow
        // 15: aload 0
        // 16: ldc "playerSheHasSexWith"
        // 18: aconst_null
        // 19: invokevirtual com/trolmastercard/sexmod/em.a (Ljava/lang/String;Ljava/lang/String;)V
        // 1c: goto 2d
        // 1f: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 22: athrow
        // 23: aload 0
        // 24: ldc "playerSheHasSexWith"
        // 26: aload 1
        // 27: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
        // 2a: invokevirtual com/trolmastercard/sexmod/em.a (Ljava/lang/String;Ljava/lang/String;)V
        // 2d: return
        // 2e: aload 1
        // 2f: ifnonnull 45
        // 32: aload 0
        // 33: getfield com/trolmastercard/sexmod/em.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 36: getstatic com/trolmastercard/sexmod/em.y Lnet/minecraft/network/datasync/DataParameter;
        // 39: ldc "null"
        // 3b: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 3e: goto 53
        // 41: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 44: athrow
        // 45: aload 0
        // 46: getfield com/trolmastercard/sexmod/em.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 49: getstatic com/trolmastercard/sexmod/em.y Lnet/minecraft/network/datasync/DataParameter;
        // 4c: aload 1
        // 4d: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
        // 50: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 53: return
        // try (0 -> 6): 7 java/util/ConcurrentModificationException
        // try (4 -> 14): 14 java/util/ConcurrentModificationException
        // try (22 -> 30): 30 java/util/ConcurrentModificationException
    }

    public void a(@Nonnull EntityPlayer var1) {
        this.e(var1.getPersistentID());
    }

    public Vec3d o() {
        String[] var1 = ((String)this.m.func_187225_a(e)).split("\\|");
        return new Vec3d(Double.parseDouble(var1[0]), Double.parseDouble(var1[1]), Double.parseDouble(var1[2]));
    }

    public void c(Vec3d var1) {
        if (this.field_70170_p.field_72995_K) {
            String var2 = var1.field_72450_a + "f" + var1.field_72448_b + "f" + var1.field_72449_c + "f";
            this.a("targetPos", var2);
        } else {
            this.m.func_187227_b(e, var1.field_72450_a + "|" + var1.field_72448_b + "|" + var1.field_72449_c);
        }
    }

    public void a(Vec3d var1) {
        this.m.func_187227_b(e, var1.field_72450_a + "|" + var1.field_72448_b + "|" + var1.field_72449_c);
    }

    public Float I() {
        return (Float)this.m.func_187225_a(w);
    }

    public void b(float var1) {
        this.m.func_187227_b(w, var1);
    }

    public void a(boolean var1) {
        try {
            if (this.field_70170_p.field_72995_K) {
                this.a("shouldbeattargetpos", String.valueOf(var1));
                return;
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }

        this.m.func_187227_b(G, var1);
    }

    public boolean Q() {
        return (Boolean)this.m.func_187225_a(G);
    }

    protected boolean func_70692_ba() {
        return false;
    }

    protected em(World param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: aload 1
        // 02: invokespecial net/minecraft/entity/EntityCreature.<init> (Lnet/minecraft/world/World;)V
        // 05: aload 0
        // 06: new software/bernie/geckolib3/core/manager/AnimationFactory
        // 09: dup
        // 0a: aload 0
        // 0b: invokespecial software/bernie/geckolib3/core/manager/AnimationFactory.<init> (Lsoftware/bernie/geckolib3/core/IAnimatable;)V
        // 0e: putfield com/trolmastercard/sexmod/em.g Lsoftware/bernie/geckolib3/core/manager/AnimationFactory;
        // 11: aload 0
        // 12: getstatic net/minecraft/util/math/Vec3d.field_186680_a Lnet/minecraft/util/math/Vec3d;
        // 15: putfield com/trolmastercard/sexmod/em.l Lnet/minecraft/util/math/Vec3d;
        // 18: aload 0
        // 19: fconst_1
        // 1a: putfield com/trolmastercard/sexmod/em.n F
        // 1d: aload 0
        // 1e: bipush 0
        // 1f: putfield com/trolmastercard/sexmod/em.F Z
        // 22: aload 0
        // 23: bipush 0
        // 24: putfield com/trolmastercard/sexmod/em.i Z
        // 27: aload 0
        // 28: new java/util/HashMap
        // 2b: dup
        // 2c: invokespecial java/util/HashMap.<init> ()V
        // 2f: putfield com/trolmastercard/sexmod/em.x Ljava/util/HashMap;
        // 32: aload 0
        // 33: new java/util/HashMap
        // 36: dup
        // 37: invokespecial java/util/HashMap.<init> ()V
        // 3a: putfield com/trolmastercard/sexmod/em.A Ljava/util/HashMap;
        // 3d: aload 0
        // 3e: aconst_null
        // 3f: putfield com/trolmastercard/sexmod/em.H Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 42: aload 0
        // 43: new java/util/ArrayList
        // 46: dup
        // 47: invokespecial java/util/ArrayList.<init> ()V
        // 4a: putfield com/trolmastercard/sexmod/em.p Ljava/util/List;
        // 4d: aload 0
        // 4e: aconst_null
        // 4f: putfield com/trolmastercard/sexmod/em.d Ljava/util/List;
        // 52: aload 1
        // 53: getfield net/minecraft/world/World.field_72995_K Z
        // 56: ifeq 5d
        // 59: aload 0
        // 5a: invokevirtual com/trolmastercard/sexmod/em.p ()V
        // 5d: aload 1
        // 5e: getfield net/minecraft/world/World.field_72995_K Z
        // 61: ifeq 77
        // 64: aload 1
        // 65: instanceof com/trolmastercard/sexmod/gj
        // 68: ifeq 77
        // 6b: goto 72
        // 6e: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 71: athrow
        // 72: return
        // 73: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 76: athrow
        // 77: aload 0
        // 78: invokevirtual com/trolmastercard/sexmod/em.func_70661_as ()Lnet/minecraft/pathfinding/PathNavigate;
        // 7b: astore 2
        // 7c: aload 2
        // 7d: instanceof net/minecraft/pathfinding/PathNavigateGround
        // 80: ifeq 92
        // 83: aload 2
        // 84: checkcast net/minecraft/pathfinding/PathNavigateGround
        // 87: bipush 1
        // 88: invokevirtual net/minecraft/pathfinding/PathNavigateGround.func_179688_b (Z)V
        // 8b: goto 92
        // 8e: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 91: athrow
        // 92: return
        // try (47 -> 53): 54 java/util/ConcurrentModificationException
        // try (50 -> 57): 57 java/util/ConcurrentModificationException
        // try (62 -> 69): 70 java/util/ConcurrentModificationException
    }

    @SideOnly(Side.CLIENT)
    protected void p() {
        this.C = new AnimationController<>(this, "action", 0.0F, this::a);
        this.E = new AnimationController<>(this, "movement", 5.0F, this::a);
        this.s = new AnimationController<>(this, "eyes", 10.0F, this::a);
    }

    protected void func_70088_a() {
        super.func_70088_a();
        this.f = this.func_70661_as();
        this.m = this.func_184212_Q();
        this.m.func_187214_a(u, UUID.randomUUID().toString());
        this.m.func_187214_a(D, 1);
        this.m.func_187214_a(J, fp.NULL.toString());
        this.m.func_187214_a(h, "");
        this.m.func_187214_a(y, "null");
        this.m.func_187214_a(G, false);
        this.m.func_187214_a(w, 0.0F);
        this.m.func_187214_a(e, "0|0|0");
        this.m.func_187214_a(v, "");
        this.m.func_187214_a(a, em.a.WALK.toString());
        this.m.func_187214_a(b, "");
        this.m.func_187214_a(c, "");
    }

    public void b(boolean var1) {
        try {
            this.i = var1;
            if (var1) {
                fs.b(this);
                return;
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }

        fs.a(this);
    }

    public boolean h() {
        return this.i;
    }

    public static List<em> ad() {
        try {
            if (!g0.a()) {
                return Z();
            }
        } catch (ConcurrentModificationException var7) {
            throw c(var7);
        }

        WorldServer[] var0 = FMLCommonHandler.instance().getMinecraftServerInstance().field_71305_c;

        try {
            if (var0.length == 0) {
                return new ArrayList<>();
            }
        } catch (ConcurrentModificationException var6) {
            throw c(var6);
        }

        ArrayList var1 = new ArrayList();

        for (WorldServer var5 : var0) {
            var1.addAll(var5.func_175644_a(em.class, var0x -> true));
        }

        return var1;
    }

    @SideOnly(Side.CLIENT)
    private static List<em> Z() {
        WorldClient var0 = Minecraft.func_71410_x().field_71441_e;

        try {
            if (var0 == null) {
                return new ArrayList<>();
            }
        } catch (ConcurrentModificationException var1) {
            throw c(var1);
        }

        return var0.func_175644_a(em.class, var0x -> true);
    }

    public boolean B() {
        return true;
    }

    protected void func_110147_ax() {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(20.0);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.5);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(30.0);
    }

    protected void func_184651_r() {
        this.z = new EntityAIWanderAvoidWater(this, 0.35);
        this.o = new df(this, EntityPlayer.class, 3.0F, 1.0F);
        this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
        this.field_70714_bg.func_75776_a(2, new EntityAITempt(this, 0.4, false, new HashSet<>(I)));
        this.field_70714_bg.func_75776_a(3, new hz(this));
        this.field_70714_bg.func_75776_a(5, this.o);
        this.field_70714_bg.func_75776_a(5, this.z);
    }

    public void func_70014_b(NBTTagCompound var1) {
        var1.func_74780_a("homeX", this.l.field_72450_a);
        var1.func_74780_a("homeY", this.l.field_72448_b);
        var1.func_74780_a("homeZ", this.l.field_72449_c);
        var1.func_74778_a("girlID", (String)this.m.func_187225_a(u));
        String var2 = this.w();

        try {
            if (!"".equals(var2)) {
                var1.func_74778_a("sexmod:customname", var2);
            }
        } catch (ConcurrentModificationException var3) {
            throw c(var3);
        }

        try {
            if (this.X()) {
                var1.func_74778_a("sexmod:customModel", this.C());
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        super.func_70014_b(var1);
    }

    protected boolean X() {
        return a(this);
    }

    public void func_70037_a(NBTTagCompound var1) {
        super.func_70037_a(var1);
        this.l = new Vec3d(var1.func_74769_h("homeX"), var1.func_74769_h("homeY"), var1.func_74769_h("homeZ"));
        String var2 = var1.func_74779_i("sexmod:customname");

        try {
            if (!"".equals(var2)) {
                this.g(var2);
            }
        } catch (ConcurrentModificationException var15) {
            throw c(var15);
        }

        String var3 = var1.func_74779_i("girlID");

        try {
            if ("".equals(var3)) {
                return;
            }
        } catch (ConcurrentModificationException var14) {
            throw c(var14);
        }

        UUID var4 = UUID.fromString(var3);
        boolean var5 = false;

        for (em var7 : g(var4)) {
            try {
                if (var7.field_70170_p.field_72995_K) {
                    continue;
                }
            } catch (ConcurrentModificationException var13) {
                throw c(var13);
            }

            try {
                if (var7 == this) {
                    continue;
                }
            } catch (ConcurrentModificationException var12) {
                throw c(var12);
            }

            try {
                if (var7.field_70128_L) {
                    continue;
                }
            } catch (ConcurrentModificationException var11) {
                throw c(var11);
            }

            try {
                if (!var7.isAddedToWorld()) {
                    continue;
                }
            } catch (ConcurrentModificationException var10) {
                throw c(var10);
            }

            var5 = true;
            break;
        }

        try {
            if (var5) {
                Main.LOGGER.log(Level.WARN, String.format("got a duped %s with id '%s'. Deleted her", this.c(), var4));
                this.field_70170_p.func_72900_e(this);
                return;
            }
        } catch (ConcurrentModificationException var9) {
            throw c(var9);
        }

        try {
            this.m.func_187227_b(u, var4.toString());
            if (this.X()) {
                this.f(var1.func_74779_i("sexmod:customModel"));
            }
        } catch (ConcurrentModificationException var8) {
            throw c(var8);
        }
    }

    public boolean d() {
        return true;
    }

    public void func_70016_h(double var1, double var3, double var5) {
        this.field_70159_w = var1;
        this.field_70181_x = var3;
        this.field_70179_y = var5;
    }

    public void b(Vec3d var1) {
        this.field_70159_w = var1.field_72450_a;
        this.field_70181_x = var1.field_72448_b;
        this.field_70179_y = var1.field_72449_c;
    }

    public Vec3d j() {
        return new Vec3d(this.field_70142_S, this.field_70137_T, this.field_70136_U);
    }

    public void func_70619_bc() {
        try {
            if ((Boolean)this.m.func_187225_a(G)) {
                this.func_70034_d(this.I());
                this.func_70080_a(this.o().field_72450_a, this.o().field_72448_b, this.o().field_72449_c, this.I(), 0.0F);
                this.func_70101_b(this.I(), this.field_70125_A);
            }
        } catch (ConcurrentModificationException var1) {
            throw c(var1);
        }

        try {
            if (this.l.equals(Vec3d.field_186680_a)) {
                this.l = new Vec3d(this.func_180425_c());
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }

        this.G();
    }

    public void func_70071_h_() {
        super.func_70071_h_();
        this.l();
    }

    protected void G() {
        try {
            if (!br.e) {
                return;
            }
        } catch (ConcurrentModificationException var13) {
            throw c(var13);
        }

        HashSet var1 = this.Y();
        fy var2 = fy.a(this);
        HashSet var3 = new HashSet();
        String var4 = br.h();

        for (String var6 : var1) {
            try {
                if (!"".equals(br.a(var6, var4))) {
                    var3.add(var6);
                    continue;
                }
            } catch (ConcurrentModificationException var12) {
                throw c(var12);
            }

            HashSet var7 = br.a(var6);

            try {
                if (var7 == null) {
                    var3.add(var6);
                    continue;
                }
            } catch (ConcurrentModificationException var11) {
                throw c(var11);
            }

            try {
                if (var7.isEmpty()) {
                    continue;
                }
            } catch (ConcurrentModificationException var10) {
                throw c(var10);
            }

            try {
                if (!var7.contains(var2)) {
                    var3.add(var6);
                }
            } catch (ConcurrentModificationException var8) {
                throw c(var8);
            }
        }

        try {
            if (var3.isEmpty()) {
                return;
            }
        } catch (ConcurrentModificationException var9) {
            throw c(var9);
        }

        var1.removeAll(var3);
        this.f(a(var1));
    }

    protected void l() {
        fp var1 = this.y();

        int[] var10000;
        byte var10001;
        label42: {
            try {
                var10000 = var1.ticksPlaying;
                if (this.field_70170_p.field_72995_K) {
                    var10001 = 1;
                    break label42;
                }
            } catch (ConcurrentModificationException var5) {
                throw c(var5);
            }

            var10001 = 0;
        }

        try {
            if (++var10000[var10001] < var1.length) {
                return;
            }
        } catch (ConcurrentModificationException var3) {
            throw c(var3);
        }

        try {
            if (var1.followUp == null) {
                return;
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        try {
            if (!this.field_70170_p.field_72995_K) {
                this.b(var1.followUp);
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }
    }

    protected void k() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/em.func_70661_as ()Lnet/minecraft/pathfinding/PathNavigate;
        // 04: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75505_d ()Lnet/minecraft/pathfinding/Path;
        // 07: astore 1
        // 08: aload 1
        // 09: ifnonnull 11
        // 0c: return
        // 0d: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 10: athrow
        // 11: aload 0
        // 12: getfield com/trolmastercard/sexmod/em.field_70122_E Z
        // 15: ifne 26
        // 18: aload 0
        // 19: invokevirtual com/trolmastercard/sexmod/em.func_70090_H ()Z
        // 1c: ifeq 2b
        // 1f: goto 26
        // 22: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 25: athrow
        // 26: return
        // 27: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
        // 44: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 47: athrow
        // 48: return
        // 49: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
        // 94: putfield com/trolmastercard/sexmod/em.field_70159_w D
        // 97: aload 0
        // 98: aload 6
        // 9a: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 9d: ldc2_w 7.0
        // a0: ddiv
        // a1: putfield com/trolmastercard/sexmod/em.field_70179_y D
        // a4: return
        // try (4 -> 7): 7 java/util/ConcurrentModificationException
        // try (9 -> 15): 16 java/util/ConcurrentModificationException
        // try (12 -> 19): 19 java/util/ConcurrentModificationException
        // try (27 -> 35): 36 java/util/ConcurrentModificationException
        // try (30 -> 39): 39 java/util/ConcurrentModificationException
    }

    public void g() {
    }

    @SideOnly(Side.CLIENT)
    public boolean b(EntityPlayer var1) {
        return false;
    }

    @SideOnly(Side.CLIENT)
    protected static void a(EntityPlayer var0, em var1) {
        Minecraft.func_71410_x().func_147108_a(new m(var1, var0));
    }

    @SideOnly(Side.CLIENT)
    protected static void a(EntityPlayer var0, em var1, String[] var2, ItemStack[] var3, boolean var4) {
        Minecraft.func_71410_x().func_147108_a(new m(var1, var0, var2, var3, var4));
    }

    @SideOnly(Side.CLIENT)
    protected static void a(EntityPlayer var0, em var1, String[] var2, boolean var3) {
        Minecraft.func_71410_x().func_147108_a(new m(var1, var0, var2, null, var3));
    }

    public void a(ItemStack var1) {
        this.field_184627_bm = var1;
    }

    public void d(int var1) {
        this.field_184628_bn = var1;
    }

    public Vec3d M() {
        return new Vec3d(this.field_70169_q, this.field_70167_r, this.field_70166_s);
    }

    protected static Vec3d a(em var0) {
        return new Vec3d(var0.field_70169_q, var0.field_70167_r, var0.field_70166_s);
    }

    public em af() {
        return this;
    }

    public void x() {
        try {
            if (this.field_70170_p.field_72995_K) {
                this.a("master", "");
                this.a("walk speed", em.a.WALK.toString());
                return;
            }
        } catch (ConcurrentModificationException var1) {
            throw c(var1);
        }

        this.m.func_187227_b(v, "");
        this.m.func_187227_b(a, em.a.WALK.toString());
    }

    protected void a(EntityPlayerMP var1, boolean var2) {
        var1.field_70159_w = 0.0;
        var1.field_70181_x = 0.0;
        var1.field_70179_y = 0.0;
        if (var2) {
            Vec3d var3 = this.a(0.35);
            var1.func_70634_a(var3.field_72450_a, var3.field_72448_b, var3.field_72449_c);
        }
    }

    public void j(UUID var1) {
        EntityPlayer var2 = this.field_70170_p.func_152378_a(var1);
        var2.field_70159_w = 0.0;
        var2.field_70181_x = 0.0;
        var2.field_70179_y = 0.0;
        Vec3d var3 = this.a(0.35);
        var2.func_70634_a(var3.field_72450_a, var3.field_72448_b, var3.field_72449_c);
        this.b(var2.field_70759_as + 180.0F);
    }

    protected void a(boolean var1, boolean var2, UUID var3) {
        try {
            if (this.field_70170_p.field_72995_K) {
                ge.b.sendToServer(new dc(this.f(), var3, var1, var2));
                return;
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        dc.a.a(this.f(), var3, var1, var2);
    }

    public static em b(UUID var0) {
        try {
            if (var0 == null) {
                return null;
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        for (em var2 : g(var0)) {
            try {
                if (var2.field_70170_p.field_72995_K) {
                    return var2;
                }
            } catch (ConcurrentModificationException var3) {
                throw c(var3);
            }
        }

        return null;
    }

    public static em a(UUID var0) {
        try {
            if (var0 == null) {
                return null;
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        for (em var2 : g(var0)) {
            try {
                if (!var2.field_70170_p.field_72995_K) {
                    return var2;
                }
            } catch (ConcurrentModificationException var3) {
                throw c(var3);
            }
        }

        return null;
    }

    public static ArrayList<em> g(UUID var0) {
        ArrayList var1 = new ArrayList();

        try {
            for (em var3 : ad()) {
                try {
                    if (var3 == null) {
                        continue;
                    }
                } catch (ConcurrentModificationException var5) {
                    throw c(var5);
                }

                try {
                    if (var3.f().equals(var0)) {
                        var1.add(var3);
                    }
                } catch (ConcurrentModificationException var4) {
                    throw c(var4);
                }
            }
        } catch (ConcurrentModificationException var6) {
            System.out.println("had a ConcurrentModificationException while cycling through the girl list... hopefully nothin borke owo");
            var6.printStackTrace();
        }

        return var1;
    }

    protected BlockPos a(BlockPos var1) {
        return this.a(var1, 1);
    }

    public BlockPos a(BlockPos var1, int var2) {
        return this.a(var1, var2, Blocks.field_150324_C, 22, 3, null);
    }

    public void W() {
        this.m.func_187227_b(field_184621_as, Byte.valueOf("1"));
    }

    public void K() {
        this.m.func_187227_b(field_184621_as, Byte.valueOf("0"));
    }

    public BlockPos a(BlockPos param1, int param2, Block param3, int param4, int param5, @Nullable HashSet<Biome> param6) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: bipush 1
        // 001: istore 7
        // 003: bipush -1
        // 004: istore 8
        // 006: aload 1
        // 007: astore 9
        // 009: bipush 0
        // 00a: istore 10
        // 00c: iload 7
        // 00e: iload 4
        // 010: if_icmpge 164
        // 013: bipush 0
        // 014: istore 11
        // 016: iload 11
        // 018: bipush 2
        // 019: if_icmpge 161
        // 01c: iload 8
        // 01e: bipush -1
        // 01f: imul
        // 020: istore 8
        // 022: bipush 0
        // 023: istore 12
        // 025: iload 12
        // 027: iload 7
        // 029: if_icmpge 0bd
        // 02c: aload 9
        // 02e: bipush 0
        // 02f: bipush 0
        // 030: iload 8
        // 032: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 035: astore 9
        // 037: iload 5
        // 039: ineg
        // 03a: istore 13
        // 03c: iload 13
        // 03e: iload 5
        // 040: bipush 1
        // 041: iadd
        // 042: if_icmpge 0b7
        // 045: aload 0
        // 046: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 049: aload 9
        // 04b: bipush 0
        // 04c: iload 13
        // 04e: iload 8
        // 050: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 053: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 056: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 05b: aload 3
        // 05c: if_acmpne 0b1
        // 05f: goto 066
        // 062: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 065: athrow
        // 066: iinc 10 1
        // 069: iload 10
        // 06b: iload 2
        // 06c: if_icmplt 0b1
        // 06f: goto 076
        // 072: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 075: athrow
        // 076: aload 6
        // 078: ifnull 0a2
        // 07b: goto 082
        // 07e: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 081: athrow
        // 082: aload 6
        // 084: aload 0
        // 085: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 088: aload 9
        // 08a: iload 8
        // 08c: iload 13
        // 08e: bipush 0
        // 08f: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 092: invokevirtual net/minecraft/world/World.func_180494_b (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;
        // 095: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 098: ifeq 0b1
        // 09b: goto 0a2
        // 09e: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a1: athrow
        // 0a2: aload 9
        // 0a4: bipush 0
        // 0a5: iload 13
        // 0a7: iload 8
        // 0a9: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 0ac: areturn
        // 0ad: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b0: athrow
        // 0b1: iinc 13 1
        // 0b4: goto 03c
        // 0b7: iinc 12 1
        // 0ba: goto 025
        // 0bd: bipush 0
        // 0be: istore 12
        // 0c0: iload 12
        // 0c2: iload 7
        // 0c4: if_icmpge 158
        // 0c7: aload 9
        // 0c9: iload 8
        // 0cb: bipush 0
        // 0cc: bipush 0
        // 0cd: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 0d0: astore 9
        // 0d2: iload 5
        // 0d4: ineg
        // 0d5: istore 13
        // 0d7: iload 13
        // 0d9: iload 5
        // 0db: bipush 1
        // 0dc: iadd
        // 0dd: if_icmpge 152
        // 0e0: aload 0
        // 0e1: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 0e4: aload 9
        // 0e6: iload 8
        // 0e8: iload 13
        // 0ea: bipush 0
        // 0eb: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 0ee: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 0f1: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 0f6: aload 3
        // 0f7: if_acmpne 14c
        // 0fa: goto 101
        // 0fd: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 100: athrow
        // 101: iinc 10 1
        // 104: iload 10
        // 106: iload 2
        // 107: if_icmplt 14c
        // 10a: goto 111
        // 10d: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 110: athrow
        // 111: aload 6
        // 113: ifnull 13d
        // 116: goto 11d
        // 119: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 11c: athrow
        // 11d: aload 6
        // 11f: aload 0
        // 120: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 123: aload 9
        // 125: iload 8
        // 127: iload 13
        // 129: bipush 0
        // 12a: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 12d: invokevirtual net/minecraft/world/World.func_180494_b (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;
        // 130: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 133: ifeq 14c
        // 136: goto 13d
        // 139: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 13c: athrow
        // 13d: aload 9
        // 13f: iload 8
        // 141: iload 13
        // 143: bipush 0
        // 144: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 147: areturn
        // 148: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14b: athrow
        // 14c: iinc 13 1
        // 14f: goto 0d7
        // 152: iinc 12 1
        // 155: goto 0c0
        // 158: iinc 7 1
        // 15b: iinc 11 1
        // 15e: goto 016
        // 161: goto 00c
        // 164: aconst_null
        // 165: areturn
        // try (34 -> 50): 51 java/util/ConcurrentModificationException
        // try (39 -> 57): 58 java/util/ConcurrentModificationException
        // try (53 -> 62): 63 java/util/ConcurrentModificationException
        // try (60 -> 76): 77 java/util/ConcurrentModificationException
        // try (65 -> 85): 85 java/util/ConcurrentModificationException
        // try (105 -> 121): 122 java/util/ConcurrentModificationException
        // try (110 -> 128): 129 java/util/ConcurrentModificationException
        // try (124 -> 133): 134 java/util/ConcurrentModificationException
        // try (131 -> 147): 148 java/util/ConcurrentModificationException
        // try (136 -> 156): 156 java/util/ConcurrentModificationException
    }

    protected List<BlockPos> a(BlockPos param1, Class param2, int param3, int param4, @Nullable HashSet<Biome> param5) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: bipush 1
        // 001: istore 6
        // 003: bipush -1
        // 004: istore 7
        // 006: aload 1
        // 007: astore 8
        // 009: new java/util/ArrayList
        // 00c: dup
        // 00d: invokespecial java/util/ArrayList.<init> ()V
        // 010: astore 9
        // 012: iload 6
        // 014: iload 3
        // 015: if_icmpge 163
        // 018: bipush 0
        // 019: istore 10
        // 01b: iload 10
        // 01d: bipush 2
        // 01e: if_icmpge 160
        // 021: iload 7
        // 023: bipush -1
        // 024: imul
        // 025: istore 7
        // 027: bipush 0
        // 028: istore 11
        // 02a: iload 11
        // 02c: iload 6
        // 02e: if_icmpge 0bf
        // 031: aload 8
        // 033: bipush 0
        // 034: bipush 0
        // 035: iload 7
        // 037: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 03a: astore 8
        // 03c: iload 4
        // 03e: ineg
        // 03f: istore 12
        // 041: iload 12
        // 043: iload 4
        // 045: bipush 1
        // 046: iadd
        // 047: if_icmpge 0b9
        // 04a: aload 2
        // 04b: aload 0
        // 04c: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 04f: aload 8
        // 051: bipush 0
        // 052: iload 12
        // 054: iload 7
        // 056: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 059: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 05c: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 061: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
        // 064: ifeq 0b3
        // 067: goto 06e
        // 06a: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 06d: athrow
        // 06e: aload 5
        // 070: ifnull 09a
        // 073: goto 07a
        // 076: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 079: athrow
        // 07a: aload 5
        // 07c: aload 0
        // 07d: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 080: aload 8
        // 082: iload 7
        // 084: iload 12
        // 086: bipush 0
        // 087: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 08a: invokevirtual net/minecraft/world/World.func_180494_b (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;
        // 08d: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 090: ifeq 0b3
        // 093: goto 09a
        // 096: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 099: athrow
        // 09a: aload 9
        // 09c: aload 8
        // 09e: bipush 0
        // 09f: iload 12
        // 0a1: iload 7
        // 0a3: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 0a6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
        // 0ab: pop
        // 0ac: goto 0b3
        // 0af: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b2: athrow
        // 0b3: iinc 12 1
        // 0b6: goto 041
        // 0b9: iinc 11 1
        // 0bc: goto 02a
        // 0bf: bipush 0
        // 0c0: istore 11
        // 0c2: iload 11
        // 0c4: iload 6
        // 0c6: if_icmpge 157
        // 0c9: aload 8
        // 0cb: iload 7
        // 0cd: bipush 0
        // 0ce: bipush 0
        // 0cf: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 0d2: astore 8
        // 0d4: iload 4
        // 0d6: ineg
        // 0d7: istore 12
        // 0d9: iload 12
        // 0db: iload 4
        // 0dd: bipush 1
        // 0de: iadd
        // 0df: if_icmpge 151
        // 0e2: aload 2
        // 0e3: aload 0
        // 0e4: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 0e7: aload 8
        // 0e9: iload 7
        // 0eb: iload 12
        // 0ed: bipush 0
        // 0ee: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 0f1: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 0f4: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 0f9: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
        // 0fc: ifeq 14b
        // 0ff: goto 106
        // 102: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 105: athrow
        // 106: aload 5
        // 108: ifnull 132
        // 10b: goto 112
        // 10e: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 111: athrow
        // 112: aload 5
        // 114: aload 0
        // 115: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 118: aload 8
        // 11a: iload 7
        // 11c: iload 12
        // 11e: bipush 0
        // 11f: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 122: invokevirtual net/minecraft/world/World.func_180494_b (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;
        // 125: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 128: ifeq 14b
        // 12b: goto 132
        // 12e: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 131: athrow
        // 132: aload 9
        // 134: aload 8
        // 136: iload 7
        // 138: iload 12
        // 13a: bipush 0
        // 13b: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 13e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
        // 143: pop
        // 144: goto 14b
        // 147: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14a: athrow
        // 14b: iinc 12 1
        // 14e: goto 0d9
        // 151: iinc 11 1
        // 154: goto 0c2
        // 157: iinc 6 1
        // 15a: iinc 10 1
        // 15d: goto 01b
        // 160: goto 012
        // 163: aload 9
        // 165: areturn
        // try (36 -> 53): 54 java/util/ConcurrentModificationException
        // try (41 -> 58): 59 java/util/ConcurrentModificationException
        // try (56 -> 72): 73 java/util/ConcurrentModificationException
        // try (61 -> 83): 84 java/util/ConcurrentModificationException
        // try (104 -> 121): 122 java/util/ConcurrentModificationException
        // try (109 -> 126): 127 java/util/ConcurrentModificationException
        // try (124 -> 140): 141 java/util/ConcurrentModificationException
        // try (129 -> 151): 152 java/util/ConcurrentModificationException
    }

    public boolean J() {
        try {
            if (!((String)this.m.func_187225_a(v)).equals("")) {
                return true;
            }
        } catch (ConcurrentModificationException var1) {
            throw c(var1);
        }

        return false;
    }

    @Nullable
    public UUID O() {
        String var1 = (String)this.m.func_187225_a(v);

        try {
            if ("".equals(var1)) {
                return null;
            }
        } catch (IllegalArgumentException var4) {
            throw c(var4);
        }

        try {
            return UUID.fromString(var1);
        } catch (IllegalArgumentException var3) {
            return null;
        }
    }

    @Nullable
    public EntityPlayer z() {
        UUID var1 = this.O();

        try {
            if (var1 == null) {
                return null;
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }

        return this.field_70170_p.func_152378_a(var1);
    }

    protected ResourceLocation func_184647_J() {
        return dz.d;
    }

    @SideOnly(Side.CLIENT)
    public void a(String var1, UUID var2) {
    }

    @SideOnly(Side.CLIENT)
    protected abstract <E extends IAnimatable> PlayState a(AnimationEvent<E> var1);

    @SideOnly(Side.CLIENT)
    protected boolean a(fp var1, String var2, boolean var3, AnimationEvent var4) {
        return false;
    }

    @SideOnly(Side.CLIENT)
    protected void a(String param1, boolean param2, AnimationEvent param3, boolean param4) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: iload 4
        // 02: ifne 33
        // 05: aload 0
        // 06: aload 3
        // 07: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getPartialTick ()F
        // 0a: invokestatic com/trolmastercard/sexmod/fp.b (Lcom/trolmastercard/sexmod/em;F)Z
        // 0d: ifeq 33
        // 10: goto 17
        // 13: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 16: athrow
        // 17: aload 0
        // 18: aload 0
        // 19: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 1c: aload 1
        // 1d: getstatic com/trolmastercard/sexmod/d3.d Z
        // 20: aload 3
        // 21: invokevirtual com/trolmastercard/sexmod/em.a (Lcom/trolmastercard/sexmod/fp;Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)Z
        // 24: ifeq 33
        // 27: goto 2e
        // 2a: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2d: athrow
        // 2e: return
        // 2f: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 32: athrow
        // 33: iload 2
        // 34: ifeq 41
        // 37: getstatic software/bernie/geckolib3/core/builder/ILoopType$EDefaultLoopTypes.LOOP Lsoftware/bernie/geckolib3/core/builder/ILoopType$EDefaultLoopTypes;
        // 3a: goto 44
        // 3d: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 40: athrow
        // 41: getstatic software/bernie/geckolib3/core/builder/ILoopType$EDefaultLoopTypes.HOLD_ON_LAST_FRAME Lsoftware/bernie/geckolib3/core/builder/ILoopType$EDefaultLoopTypes;
        // 44: astore 5
        // 46: aload 3
        // 47: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getController ()Lsoftware/bernie/geckolib3/core/controller/AnimationController;
        // 4a: new software/bernie/geckolib3/core/builder/AnimationBuilder
        // 4d: dup
        // 4e: invokespecial software/bernie/geckolib3/core/builder/AnimationBuilder.<init> ()V
        // 51: aload 1
        // 52: aload 5
        // 54: invokevirtual software/bernie/geckolib3/core/builder/AnimationBuilder.addAnimation (Ljava/lang/String;Lsoftware/bernie/geckolib3/core/builder/ILoopType;)Lsoftware/bernie/geckolib3/core/builder/AnimationBuilder;
        // 57: invokevirtual software/bernie/geckolib3/core/controller/AnimationController.setAnimation (Lsoftware/bernie/geckolib3/core/builder/AnimationBuilder;)V
        // 5a: aload 3
        // 5b: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getController ()Lsoftware/bernie/geckolib3/core/controller/AnimationController;
        // 5e: dconst_0
        // 5f: putfield software/bernie/geckolib3/core/controller/AnimationController.transitionLengthTicks D
        // 62: return
        // try (0 -> 7): 8 java/util/ConcurrentModificationException
        // try (2 -> 18): 19 java/util/ConcurrentModificationException
        // try (10 -> 22): 22 java/util/ConcurrentModificationException
        // try (24 -> 28): 28 java/util/ConcurrentModificationException
    }

    @SideOnly(Side.CLIENT)
    protected void a(String var1, boolean var2, AnimationEvent var3) {
        this.a(var1, var2, var3, false);
    }

    @SideOnly(Side.CLIENT)
    protected void a(String param1, int param2, float param3, AnimationEvent param4, boolean param5) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: iload 5
        // 002: ifne 035
        // 005: aload 0
        // 006: aload 4
        // 008: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getPartialTick ()F
        // 00b: invokestatic com/trolmastercard/sexmod/fp.b (Lcom/trolmastercard/sexmod/em;F)Z
        // 00e: ifeq 035
        // 011: goto 018
        // 014: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 017: athrow
        // 018: aload 0
        // 019: aload 0
        // 01a: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 01d: aload 1
        // 01e: getstatic com/trolmastercard/sexmod/d3.d Z
        // 021: aload 4
        // 023: invokevirtual com/trolmastercard/sexmod/em.a (Lcom/trolmastercard/sexmod/fp;Ljava/lang/String;ZLsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)Z
        // 026: ifeq 035
        // 029: goto 030
        // 02c: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 02f: athrow
        // 030: return
        // 031: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 034: athrow
        // 035: aload 4
        // 037: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getController ()Lsoftware/bernie/geckolib3/core/controller/AnimationController;
        // 03a: astore 6
        // 03c: aload 0
        // 03d: getfield com/trolmastercard/sexmod/em.A Ljava/util/HashMap;
        // 040: aload 1
        // 041: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
        // 044: checkcast com/mojang/realmsclient/util/Pair
        // 047: astore 7
        // 049: aload 7
        // 04b: ifnonnull 05b
        // 04e: bipush 0
        // 04f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 052: bipush 0
        // 053: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 056: invokestatic com/mojang/realmsclient/util/Pair.of (Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/realmsclient/util/Pair;
        // 059: astore 7
        // 05b: aload 7
        // 05d: invokevirtual com/mojang/realmsclient/util/Pair.first ()Ljava/lang/Object;
        // 060: checkcast java/lang/Integer
        // 063: invokevirtual java/lang/Integer.intValue ()I
        // 066: istore 8
        // 068: aload 7
        // 06a: invokevirtual com/mojang/realmsclient/util/Pair.second ()Ljava/lang/Object;
        // 06d: checkcast java/lang/Integer
        // 070: invokevirtual java/lang/Integer.intValue ()I
        // 073: istore 9
        // 075: aload 0
        // 076: aload 4
        // 078: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getPartialTick ()F
        // 07b: invokestatic com/trolmastercard/sexmod/fp.b (Lcom/trolmastercard/sexmod/em;F)Z
        // 07e: ifne 0c7
        // 081: aload 4
        // 083: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getController ()Lsoftware/bernie/geckolib3/core/controller/AnimationController;
        // 086: new software/bernie/geckolib3/core/builder/AnimationBuilder
        // 089: dup
        // 08a: invokespecial software/bernie/geckolib3/core/builder/AnimationBuilder.<init> ()V
        // 08d: iload 8
        // 08f: ifne 0a1
        // 092: goto 099
        // 095: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 098: athrow
        // 099: aload 1
        // 09a: goto 0b4
        // 09d: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a0: athrow
        // 0a1: new java/lang/StringBuilder
        // 0a4: dup
        // 0a5: invokespecial java/lang/StringBuilder.<init> ()V
        // 0a8: aload 1
        // 0a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 0ac: iload 8
        // 0ae: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
        // 0b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 0b4: getstatic software/bernie/geckolib3/core/builder/ILoopType$EDefaultLoopTypes.LOOP Lsoftware/bernie/geckolib3/core/builder/ILoopType$EDefaultLoopTypes;
        // 0b7: invokevirtual software/bernie/geckolib3/core/builder/AnimationBuilder.addAnimation (Ljava/lang/String;Lsoftware/bernie/geckolib3/core/builder/ILoopType;)Lsoftware/bernie/geckolib3/core/builder/AnimationBuilder;
        // 0ba: invokevirtual software/bernie/geckolib3/core/controller/AnimationController.setAnimation (Lsoftware/bernie/geckolib3/core/builder/AnimationBuilder;)V
        // 0bd: aload 4
        // 0bf: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getController ()Lsoftware/bernie/geckolib3/core/controller/AnimationController;
        // 0c2: dconst_0
        // 0c3: putfield software/bernie/geckolib3/core/controller/AnimationController.transitionLengthTicks D
        // 0c6: return
        // 0c7: aload 0
        // 0c8: iload 8
        // 0ca: iload 9
        // 0cc: iload 2
        // 0cd: fload 3
        // 0ce: invokevirtual com/trolmastercard/sexmod/em.a (IIIF)I
        // 0d1: istore 10
        // 0d3: aload 6
        // 0d5: new software/bernie/geckolib3/core/builder/AnimationBuilder
        // 0d8: dup
        // 0d9: invokespecial software/bernie/geckolib3/core/builder/AnimationBuilder.<init> ()V
        // 0dc: iload 10
        // 0de: ifne 0e9
        // 0e1: aload 1
        // 0e2: goto 0fc
        // 0e5: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e8: athrow
        // 0e9: new java/lang/StringBuilder
        // 0ec: dup
        // 0ed: invokespecial java/lang/StringBuilder.<init> ()V
        // 0f0: aload 1
        // 0f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 0f4: iload 10
        // 0f6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
        // 0f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 0fc: getstatic software/bernie/geckolib3/core/builder/ILoopType$EDefaultLoopTypes.LOOP Lsoftware/bernie/geckolib3/core/builder/ILoopType$EDefaultLoopTypes;
        // 0ff: invokevirtual software/bernie/geckolib3/core/builder/AnimationBuilder.addAnimation (Ljava/lang/String;Lsoftware/bernie/geckolib3/core/builder/ILoopType;)Lsoftware/bernie/geckolib3/core/builder/AnimationBuilder;
        // 102: invokevirtual software/bernie/geckolib3/core/controller/AnimationController.setAnimation (Lsoftware/bernie/geckolib3/core/builder/AnimationBuilder;)V
        // 105: aload 6
        // 107: dconst_0
        // 108: putfield software/bernie/geckolib3/core/controller/AnimationController.transitionLengthTicks D
        // 10b: aload 0
        // 10c: getfield com/trolmastercard/sexmod/em.A Ljava/util/HashMap;
        // 10f: aload 1
        // 110: iload 10
        // 112: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 115: iload 10
        // 117: ifne 123
        // 11a: iload 9
        // 11c: goto 125
        // 11f: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 122: athrow
        // 123: iload 10
        // 125: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 128: invokestatic com/mojang/realmsclient/util/Pair.of (Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/realmsclient/util/Pair;
        // 12b: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // 12e: pop
        // 12f: return
        // try (0 -> 7): 8 java/util/ConcurrentModificationException
        // try (2 -> 18): 19 java/util/ConcurrentModificationException
        // try (10 -> 22): 22 java/util/ConcurrentModificationException
        // try (51 -> 63): 64 java/util/ConcurrentModificationException
        // try (56 -> 68): 68 java/util/ConcurrentModificationException
        // try (93 -> 101): 101 java/util/ConcurrentModificationException
        // try (111 -> 126): 126 java/util/ConcurrentModificationException
    }

    @SideOnly(Side.CLIENT)
    protected void a(String var1, int var2, float var3, AnimationEvent var4) {
        this.a(var1, var2, var3, var4, false);
    }

    // $VF: Handled exception range with multiple entry points by splitting it
    // $VF: Duplicated exception handlers to handle obfuscated exceptions
    int a(int var1, int var2, int var3, float var4) {
        try {
            if (var1 != 0) {
                return 0;
            }
        } catch (ConcurrentModificationException var11) {
            throw c(var11);
        }

        Random var5 = this.func_70681_au();

        try {
            if (var5.nextFloat() > var4) {
                return 0;
            }
        } catch (ConcurrentModificationException var8) {
            throw c(var8);
        }

        int var6;
        while (true) {
            var6 = var5.nextInt(var3);
            if (var6 != var2) {
                try {
                    if (var6 != 0) {
                        break;
                    }
                } catch (ConcurrentModificationException var10) {
                    throw c(var10);
                }
            }

            try {
                if (var3 <= 2) {
                    break;
                }
            } catch (ConcurrentModificationException var9) {
                throw c(var9);
            }
        }

        try {
            return var6;
        } catch (ConcurrentModificationException var7) {
            throw c(var7);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public abstract void registerControllers(AnimationData var1);

    protected void s() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 04: getfield net/minecraft/world/World.field_72995_K Z
        // 07: ifeq 36
        // 0a: aload 0
        // 0b: invokevirtual com/trolmastercard/sexmod/em.n ()Z
        // 0e: ifeq 36
        // 11: goto 18
        // 14: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 17: athrow
        // 18: aload 0
        // 19: aconst_null
        // 1a: putfield com/trolmastercard/sexmod/em.B Lnet/minecraft/util/math/Vec3d;
        // 1d: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 20: new com/trolmastercard/sexmod/s
        // 23: dup
        // 24: aload 0
        // 25: invokevirtual com/trolmastercard/sexmod/em.f ()Ljava/util/UUID;
        // 28: bipush 1
        // 29: invokespecial com/trolmastercard/sexmod/s.<init> (Ljava/util/UUID;Z)V
        // 2c: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 2f: goto 58
        // 32: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 35: athrow
        // 36: aload 0
        // 37: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 3a: getfield net/minecraft/world/World.field_72995_K Z
        // 3d: ifne 58
        // 40: aload 0
        // 41: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 44: aload 0
        // 45: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 48: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // 4b: checkcast net/minecraft/entity/player/EntityPlayerMP
        // 4e: invokestatic com/trolmastercard/sexmod/s$a.a (Lnet/minecraft/entity/player/EntityPlayerMP;)V
        // 51: goto 58
        // 54: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 57: athrow
        // 58: return
        // try (0 -> 7): 8 java/util/ConcurrentModificationException
        // try (4 -> 22): 22 java/util/ConcurrentModificationException
        // try (24 -> 35): 36 java/util/ConcurrentModificationException
    }

    public static em c(EntityPlayer var0) {
        try {
            if (var0 == null) {
                return null;
            }
        } catch (ConcurrentModificationException var1) {
            throw c(var1);
        }

        return i(var0.getPersistentID());
    }

    @SideOnly(Side.CLIENT)
    public Vec3d a(Minecraft var1, cy var2, EntityLivingBase var3, float var4) {
        return com.trolmastercard.sexmod.b.a(var1, var2, var3, this, var4);
    }

    public static em i(@Nonnull UUID var0) {
        return a(var0, (Boolean)null);
    }

    public static em a(@Nonnull UUID var0, Boolean var1) {
        try {
            Iterator var2 = ad().iterator();

            while (true) {
                em var3;
                while (true) {
                    while (true) {
                        if (!var2.hasNext()) {
                            return null;
                        }

                        var3 = (em)var2.next();

                        try {
                            if (var3.field_70128_L) {
                                continue;
                            }
                            break;
                        } catch (ConcurrentModificationException var5) {
                            throw c(var5);
                        }
                    }

                    try {
                        if (!var0.equals(var3.ae())) {
                            continue;
                        }
                        break;
                    } catch (ConcurrentModificationException var6) {
                        throw c(var6);
                    }
                }

                if (var1 == null) {
                    return var3;
                }

                boolean var4 = var3.field_70170_p.field_72995_K;

                try {
                    if (var4 && !var1) {
                        return var3;
                    }
                } catch (ConcurrentModificationException var8) {
                    throw c(var8);
                }

                try {
                    if (var4 || !var1) {
                        continue;
                    }
                } catch (ConcurrentModificationException var7) {
                    throw c(var7);
                }

                return var3;
            }
        } catch (ConcurrentModificationException var9) {
            return null;
        }
    }

    @Nullable
    public static em c(@Nonnull UUID var0) {
        boolean var10000;
        label55: {
            try {
                if (FMLCommonHandler.instance().getMinecraftServerInstance() == null) {
                    var10000 = true;
                    break label55;
                }
            } catch (ConcurrentModificationException var8) {
                throw c(var8);
            }

            var10000 = false;
        }

        boolean var1 = var10000;

        try {
            for (em var3 : ad()) {
                try {
                    if (var3.field_70128_L) {
                        continue;
                    }
                } catch (ConcurrentModificationException var6) {
                    throw c(var6);
                }

                boolean var4 = var3.field_70170_p.field_72995_K;

                try {
                    if (var4 != var1) {
                        continue;
                    }
                } catch (ConcurrentModificationException var5) {
                    throw c(var5);
                }

                if (var0.equals(var3.ae())) {
                    return var3;
                }
            }
        } catch (ConcurrentModificationException var7) {
        }

        return null;
    }

    public static em d(@Nonnull EntityPlayer var0) {
        return c(var0.getPersistentID());
    }

    @SideOnly(Side.CLIENT)
    public void ac() {
    }

    public void r() {
        try {
            this.B = null;
            this.func_189654_d(false);
            this.b((fp)null);
            if (this.field_70170_p.field_72995_K) {
                this.V();
            }
        } catch (ConcurrentModificationException var1) {
            throw c(var1);
        }
    }

    @SideOnly(Side.CLIENT)
    protected void V() {
        try {
            if (this.n()) {
                d3.a(true);
                Minecraft.func_71410_x().field_71439_g.func_82142_c(false);
                ge.b.sendToServer(new s(this.f()));
            }
        } catch (ConcurrentModificationException var1) {
            throw c(var1);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void k(UUID var0) {
        try {
            Iterator var1 = ad().iterator();

            em var2;
            while (true) {
                UUID var3;
                while (true) {
                    if (!var1.hasNext()) {
                        return;
                    }

                    var2 = (em)var1.next();
                    var3 = var2.ae();

                    try {
                        if (var3 == null) {
                            continue;
                        }
                        break;
                    } catch (ConcurrentModificationException var5) {
                        throw c(var5);
                    }
                }

                try {
                    if (!var3.equals(var0)) {
                        continue;
                    }
                    break;
                } catch (ConcurrentModificationException var6) {
                    throw c(var6);
                }
            }

            fp var4 = var2.c(var2.y());
            if (var4 != null) {
                var2.b(var4);
            }
        } catch (ConcurrentModificationException var7) {
        }
    }

    @SideOnly(Side.CLIENT)
    public static void f(UUID var0) {
        try {
            for (em var2 : ad()) {
                try {
                    if (var2.field_70128_L) {
                        continue;
                    }
                } catch (ConcurrentModificationException var9) {
                    throw c(var9);
                }

                try {
                    if (!var2.field_70170_p.field_72995_K) {
                        continue;
                    }
                } catch (ConcurrentModificationException var8) {
                    throw c(var8);
                }

                UUID var3 = var2.ae();

                try {
                    if (var3 == null) {
                        continue;
                    }
                } catch (ConcurrentModificationException var7) {
                    throw c(var7);
                }

                try {
                    if (!var3.equals(var0)) {
                        continue;
                    }
                } catch (ConcurrentModificationException var6) {
                    throw c(var6);
                }

                fp var4 = var2.a(var2.y());

                try {
                    if (var4 == null) {
                        continue;
                    }
                } catch (ConcurrentModificationException var5) {
                    throw c(var5);
                }

                var2.b(var4);
            }
        } catch (ConcurrentModificationException var10) {
        }
    }

    public void N() {
        this.ag();
        ge.b.sendToServer(new a1(this.f()));
    }

    @SideOnly(Side.CLIENT)
    public void ag() {
        this.C.tickOffset = 0.0;
    }

    @SideOnly(Side.CLIENT)
    @Nullable
    protected abstract fp c(fp var1);

    @SideOnly(Side.CLIENT)
    protected abstract fp a(fp var1);

    public TargetPoint P() {
        return new TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0);
    }

    protected void a(double var1, double var3, double var5, float var7, float var8) {
        try {
            if (this.ae() == null) {
                System.out.println("couldnt move camera because the player isn't set");
                return;
            }
        } catch (ConcurrentModificationException var13) {
            throw c(var13);
        }

        EntityPlayer var9 = this.field_70170_p.func_152378_a(this.ae());

        try {
            if (this.B == null) {
                this.B = var9.func_174791_d();
            }
        } catch (ConcurrentModificationException var12) {
            throw c(var12);
        }

        Vec3d var10 = this.B;
        var10 = var10.func_72441_c(-Math.sin((this.r + 90.0F) * (Math.PI / 180.0)) * var1, 0.0, Math.cos((this.r + 90.0F) * (Math.PI / 180.0)) * var1);
        var10 = var10.func_72441_c(0.0, var3, 0.0);
        var10 = var10.func_72441_c(-Math.sin(this.r * (Math.PI / 180.0)) * var5, 0.0, Math.cos(this.r * (Math.PI / 180.0)) * var5);

        try {
            if (this.field_70170_p.field_72995_K) {
                ge.b.sendToServer(new a8(var9.getPersistentID().toString(), var10, this.r + var7, var8));
                return;
            }
        } catch (ConcurrentModificationException var11) {
            throw c(var11);
        }

        var9.func_70080_a(var10.field_72450_a, var10.field_72448_b, var10.field_72449_c, this.r + var7, var8);
        var9.func_70634_a(var10.field_72450_a, var10.field_72448_b, var10.field_72449_c);
        this.field_70159_w = 0.0;
        this.field_70181_x = 0.0;
        this.field_70179_y = 0.0;
    }

    @SideOnly(Side.CLIENT)
    protected boolean n() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 04: getfield net/minecraft/world/World.field_72995_K Z
        // 07: ifne 10
        // 0a: bipush 0
        // 0b: ireturn
        // 0c: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0f: athrow
        // 10: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 13: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 16: astore 1
        // 17: aload 1
        // 18: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 1b: aload 0
        // 1c: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 1f: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 22: ifne 3a
        // 25: aload 1
        // 26: invokevirtual net/minecraft/entity/player/EntityPlayer.func_110124_au ()Ljava/util/UUID;
        // 29: aload 0
        // 2a: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 2d: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 30: ifeq 42
        // 33: goto 3a
        // 36: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 39: athrow
        // 3a: bipush 1
        // 3b: goto 43
        // 3e: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 41: athrow
        // 42: bipush 0
        // 43: ireturn
        // try (0 -> 6): 6 java/util/ConcurrentModificationException
        // try (11 -> 23): 24 java/util/ConcurrentModificationException
        // try (17 -> 28): 28 java/util/ConcurrentModificationException
    }

    protected void U() {
    }

    public void g(String var1) {
        this.m.func_187227_b(c, var1);
    }

    public String w() {
        return (String)this.m.func_187225_a(c);
    }

    public abstract String c();

    public String ab() {
        String var1 = (String)this.m.func_187225_a(c);

        try {
            if (!"".equals(var1)) {
                return var1;
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }

        return this.c();
    }

    public abstract float i();

    @SideOnly(Side.CLIENT)
    public boolean t() {
        return true;
    }

    public void h(String var1) {
        try {
            if (!this.field_70170_p.field_72995_K) {
                ge.b
                    .sendToAllAround(
                        new gh(String.format("<%s> %s", this.ab(), var1), this.field_71093_bK, this.f()),
                        new TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 40.0)
                    );
                return;
            }
        } catch (ConcurrentModificationException var3) {
            throw c(var3);
        }

        try {
            if (this.n()) {
                ge.b.sendToServer(new gh(String.format("<%s> %s", this.ab(), var1), this.field_71093_bK, this.f()));
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }
    }

    protected void b(String var1, boolean var2) {
        try {
            if (!var2) {
                this.h(var1);
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        try {
            if (!this.field_70170_p.field_72995_K) {
                ge.b
                    .sendToAllAround(
                        new gh(var1, this.field_71093_bK, this.f()),
                        new TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 40.0)
                    );
                return;
            }
        } catch (ConcurrentModificationException var5) {
            throw c(var5);
        }

        try {
            if (this.n()) {
                ge.b.sendToServer(new gh(var1, this.field_71093_bK, this.f()));
            }
        } catch (ConcurrentModificationException var3) {
            throw c(var3);
        }
    }

    protected void a(String var1) {
        try {
            if (this.field_70170_p.field_72995_K) {
                Minecraft.func_71410_x().field_71439_g.func_145747_a(new TextComponentString(String.format("<%s> %s", this.ab(), var1)));
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }
    }

    protected void a(UUID var1, String var2) {
        EntityPlayer var3 = this.field_70170_p.func_152378_a(var1);

        try {
            if (var3 == null) {
                System.out.println("Player with UUID " + var1.toString() + " not found");
                return;
            }
        } catch (ConcurrentModificationException var5) {
            throw c(var5);
        }

        try {
            if (this.field_70170_p.field_72995_K) {
                Minecraft.func_71410_x().field_71439_g.func_145747_a(new TextComponentString("<" + var3.func_70005_c_() + "> " + var2));
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }
    }

    public void a(SoundEvent var1, float var2, float var3) {
        this.field_70170_p
            .func_184134_a(
                this.func_180425_c().func_177958_n(),
                this.func_180425_c().func_177956_o(),
                this.func_180425_c().func_177952_p(),
                var1,
                SoundCategory.NEUTRAL,
                var2,
                var3,
                false
            );
    }

    public void a(SoundEvent var1) {
        this.a(var1, 1.0F, 1.0F);
    }

    public void a(SoundEvent[] var1, int... var2) {
        try {
            if (var2.length == 0) {
                this.a(var1[this.func_70681_au().nextInt(var1.length)]);
                return;
            }
        } catch (ConcurrentModificationException var3) {
            throw c(var3);
        }

        this.a(var1[var2[this.func_70681_au().nextInt(var2.length)]], 1.0F, 1.0F);
    }

    public void a(SoundEvent[] var1, float var2) {
        this.a(var1[this.func_70681_au().nextInt(var1.length)], var2, 1.0F);
    }

    public void a(SoundEvent var1, float var2) {
        this.a(var1, var2, 1.0F);
    }

    public static boolean a(Entity var0) {
        try {
            if (var0 == null) {
                return false;
            }
        } catch (ConcurrentModificationException var3) {
            throw c(var3);
        }

        try {
            if (!(var0 instanceof em)) {
                return false;
            }
        } catch (ConcurrentModificationException var1) {
            throw c(var1);
        }

        try {
            if (!(var0 instanceof ei)) {
                return true;
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }

        return false;
    }

    @SideOnly(Side.CLIENT)
    public em E() {
        return this;
    }

    @SideOnly(Side.CLIENT)
    public boolean e() {
        EntityPlayer var1 = this.field_70170_p.func_72890_a(this, 50.0);

        try {
            if (var1 == null) {
                return false;
            }
        } catch (ConcurrentModificationException var2) {
            throw c(var2);
        }

        return var1.getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID());
    }

    public Vec3d aa() {
        return this.a(1.0);
    }

    public Vec3d a(double var1) {
        EntityPlayer var3 = this.field_70170_p.func_152378_a(this.ae());
        float var4 = var3.field_70177_z;
        return var3.func_174791_d().func_72441_c(-Math.sin(var4 * (Math.PI / 180.0)) * var1, 0.0, Math.cos(var4 * (Math.PI / 180.0)) * var1);
    }

    public Vec3d a(Vec3d var1, float var2) {
        return var1;
    }

    public static void a(EnumParticleTypes var0, em var1) {
        double var2 = com.trolmastercard.sexmod.r.f.nextGaussian() * 0.02;
        double var4 = com.trolmastercard.sexmod.r.f.nextGaussian() * 0.02;
        double var6 = com.trolmastercard.sexmod.r.f.nextGaussian() * 0.02;
        var1.field_70170_p
            .func_175688_a(
                var0,
                var1.field_70165_t + com.trolmastercard.sexmod.r.f.nextFloat() * var1.field_70130_N * 2.0F - var1.field_70130_N,
                var1.field_70163_u + 0.5 + com.trolmastercard.sexmod.r.f.nextFloat() * var1.field_70131_O,
                var1.field_70161_v + com.trolmastercard.sexmod.r.f.nextFloat() * var1.field_70130_N * 2.0F - var1.field_70130_N,
                var2,
                var4,
                var6,
                new int[0]
            );
    }

    public static void a(EnumParticleTypes var0, em var1, int var2) {
        int var3 = 0;

        try {
            while (var3 < var2) {
                a(var0, var1);
                var3++;
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }
    }

    @Override
    public AnimationFactory getFactory() {
        return this.g;
    }

    public boolean func_70104_M() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    protected SoundEvent func_184639_G() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/em.func_70681_au ()Ljava/util/Random;
        // 04: sipush 10000
        // 07: invokevirtual java/util/Random.nextInt (I)I
        // 0a: ifne 50
        // 0d: aload 0
        // 0e: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 11: getfield net/minecraft/world/World.field_72995_K Z
        // 14: ifeq 49
        // 17: goto 1e
        // 1a: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1d: athrow
        // 1e: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 21: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 24: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 27: aload 0
        // 28: invokevirtual com/trolmastercard/sexmod/em.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 2b: invokevirtual net/minecraft/util/math/Vec3d.func_72438_d (Lnet/minecraft/util/math/Vec3d;)D
        // 2e: ldc2_w 10.0
        // 31: dcmpg
        // 32: ifge 49
        // 35: goto 3c
        // 38: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3b: athrow
        // 3c: aload 0
        // 3d: ldc "whopa"
        // 3f: invokevirtual com/trolmastercard/sexmod/em.a (Ljava/lang/String;)V
        // 42: goto 49
        // 45: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 48: athrow
        // 49: getstatic com/trolmastercard/sexmod/c.MISC_FART [Lnet/minecraft/util/SoundEvent;
        // 4c: invokestatic com/trolmastercard/sexmod/c.a ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        // 4f: areturn
        // 50: aconst_null
        // 51: areturn
        // try (0 -> 9): 10 java/util/ConcurrentModificationException
        // try (5 -> 21): 22 java/util/ConcurrentModificationException
        // try (12 -> 27): 28 java/util/ConcurrentModificationException
    }

    public float T() {
        return 0.0F;
    }

    public float ai() {
        return 0.0F;
    }

    @SideOnly(Side.CLIENT)
    public MatrixStack a(String param1, boolean param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/em.H Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 004: ifnonnull 016
        // 007: aload 0
        // 008: aload 0
        // 009: invokevirtual com/trolmastercard/sexmod/em.b ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 00c: putfield com/trolmastercard/sexmod/em.H Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 00f: goto 016
        // 012: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 015: athrow
        // 016: aload 0
        // 017: getfield com/trolmastercard/sexmod/em.H Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 01a: aload 1
        // 01b: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 01e: astore 3
        // 01f: aload 3
        // 020: ifnonnull 06f
        // 023: getstatic com/trolmastercard/sexmod/cv.e Ljava/util/List;
        // 026: aload 1
        // 027: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
        // 02c: ifne 067
        // 02f: goto 036
        // 032: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 035: athrow
        // 036: getstatic com/trolmastercard/sexmod/Main.LOGGER Lorg/apache/logging/log4j/Logger;
        // 039: getstatic org/apache/logging/log4j/Level.WARN Lorg/apache/logging/log4j/Level;
        // 03c: ldc "The bone '%s' does not exist on %s. Bone model matrix couldn't be calculated"
        // 03e: bipush 2
        // 03f: anewarray 777
        // 042: dup
        // 043: bipush 0
        // 044: aload 1
        // 045: aastore
        // 046: dup
        // 047: bipush 1
        // 048: aload 0
        // 049: invokevirtual com/trolmastercard/sexmod/em.c ()Ljava/lang/String;
        // 04c: aastore
        // 04d: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        // 050: invokeinterface org/apache/logging/log4j/Logger.log (Lorg/apache/logging/log4j/Level;Ljava/lang/String;)V 3
        // 055: aload 0
        // 056: getfield com/trolmastercard/sexmod/em.p Ljava/util/List;
        // 059: aload 1
        // 05a: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
        // 05f: pop
        // 060: goto 067
        // 063: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 066: athrow
        // 067: new software/bernie/geckolib3/util/MatrixStack
        // 06a: dup
        // 06b: invokespecial software/bernie/geckolib3/util/MatrixStack.<init> ()V
        // 06e: areturn
        // 06f: aload 3
        // 070: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
        // 073: astore 4
        // 075: new java/util/ArrayList
        // 078: dup
        // 079: invokespecial java/util/ArrayList.<init> ()V
        // 07c: astore 5
        // 07e: aload 4
        // 080: astore 6
        // 082: aload 6
        // 084: getfield software/bernie/geckolib3/geo/render/built/GeoBone.parent Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
        // 087: ifnull 0a0
        // 08a: aload 6
        // 08c: getfield software/bernie/geckolib3/geo/render/built/GeoBone.parent Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
        // 08f: astore 7
        // 091: aload 5
        // 093: aload 7
        // 095: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
        // 098: pop
        // 099: aload 7
        // 09b: astore 6
        // 09d: goto 082
        // 0a0: aload 5
        // 0a2: invokestatic java/util/Collections.reverse (Ljava/util/List;)V
        // 0a5: new software/bernie/geckolib3/util/MatrixStack
        // 0a8: dup
        // 0a9: invokespecial software/bernie/geckolib3/util/MatrixStack.<init> ()V
        // 0ac: astore 6
        // 0ae: aload 0
        // 0af: invokevirtual com/trolmastercard/sexmod/em.Q ()Z
        // 0b2: ifeq 0ce
        // 0b5: aload 6
        // 0b7: aload 0
        // 0b8: invokevirtual com/trolmastercard/sexmod/em.I ()Ljava/lang/Float;
        // 0bb: invokevirtual java/lang/Float.floatValue ()F
        // 0be: f2d
        // 0bf: invokestatic java/lang/Math.toRadians (D)D
        // 0c2: dneg
        // 0c3: d2f
        // 0c4: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotateY (F)V
        // 0c7: goto 0f5
        // 0ca: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0cd: athrow
        // 0ce: iload 2
        // 0cf: ifeq 0f5
        // 0d2: aload 6
        // 0d4: aload 0
        // 0d5: getfield com/trolmastercard/sexmod/em.field_70760_ar F
        // 0d8: aload 0
        // 0d9: getfield com/trolmastercard/sexmod/em.field_70761_aq F
        // 0dc: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 0df: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
        // 0e2: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 0e5: f2d
        // 0e6: invokestatic java/lang/Math.toRadians (D)D
        // 0e9: dneg
        // 0ea: d2f
        // 0eb: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotateY (F)V
        // 0ee: goto 0f5
        // 0f1: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0f4: athrow
        // 0f5: aload 5
        // 0f7: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
        // 0fa: astore 7
        // 0fc: aload 7
        // 0fe: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 103: ifeq 138
        // 106: aload 7
        // 108: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 10d: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
        // 110: astore 8
        // 112: aload 6
        // 114: aload 8
        // 116: invokevirtual software/bernie/geckolib3/util/MatrixStack.translate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 119: aload 6
        // 11b: aload 8
        // 11d: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 120: aload 6
        // 122: aload 8
        // 124: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 127: aload 6
        // 129: aload 8
        // 12b: invokevirtual software/bernie/geckolib3/util/MatrixStack.scale (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 12e: aload 6
        // 130: aload 8
        // 132: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 135: goto 0fc
        // 138: aload 6
        // 13a: aload 4
        // 13c: invokevirtual software/bernie/geckolib3/util/MatrixStack.translate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 13f: aload 6
        // 141: aload 4
        // 143: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 146: aload 6
        // 148: aload 4
        // 14a: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 14d: aload 6
        // 14f: aload 4
        // 151: invokevirtual software/bernie/geckolib3/util/MatrixStack.scale (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 154: aload 0
        // 155: aload 6
        // 157: invokevirtual com/trolmastercard/sexmod/em.a (Lsoftware/bernie/geckolib3/util/MatrixStack;)Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 15a: astore 6
        // 15c: aload 6
        // 15e: areturn
        // try (0 -> 7): 8 java/util/ConcurrentModificationException
        // try (15 -> 21): 22 java/util/ConcurrentModificationException
        // try (17 -> 45): 46 java/util/ConcurrentModificationException
        // try (80 -> 93): 93 java/util/ConcurrentModificationException
        // try (95 -> 110): 111 java/util/ConcurrentModificationException
    }

    protected MatrixStack a(MatrixStack var1) {
        return var1;
    }

    @SideOnly(Side.CLIENT)
    public Vec3d b(String var1) {
        Vec3d var2 = this.x.get(var1);

        try {
            if (var2 != null) {
                return var2;
            }
        } catch (ConcurrentModificationException var3) {
            throw c(var3);
        }

        try {
            if (!this.p.contains(var1)) {
                this.p.add(var1);
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        return Vec3d.field_186680_a;
    }

    @SideOnly(Side.CLIENT)
    public Vec3d d(String var1) {
        return this.b(var1).func_178787_e(this.func_174791_d());
    }

    public void a(String var1, Vec3d var2) {
        this.x.put(var1, var2);
    }

    @SideOnly(Side.CLIENT)
    public float R() {
        AnimationProcessor var1 = this.b();
        IBone var2 = var1.getBone("girlCam");

        try {
            if (var2 == null) {
                return 0.0F;
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        float var3 = var2.getPivotY();
        var3 = this.a(var3);
        return var3 / 16.0F;
    }

    @SideOnly(Side.CLIENT)
    public float v() {
        return 1.0F;
    }

    protected float a(float var1) {
        return var1;
    }

    public AnimatedGeoModel<? extends em> a() {
        Minecraft var1 = Minecraft.func_71410_x();
        Render var2 = var1.func_175598_ae().func_78713_a(this);

        try {
            if (var2 == null) {
                return null;
            }
        } catch (ConcurrentModificationException var6) {
            throw c(var6);
        }

        try {
            if (!(var2 instanceof d_)) {
                return null;
            }
        } catch (ConcurrentModificationException var8) {
            throw c(var8);
        }

        GeoEntityRenderer var3 = (GeoEntityRenderer)var2;
        GeoModelProvider var4 = var3.getGeoModelProvider();

        try {
            if (var4 == null) {
                return null;
            }
        } catch (ConcurrentModificationException var5) {
            throw c(var5);
        }

        try {
            if (!(var4 instanceof AnimatedGeoModel)) {
                return null;
            }
        } catch (ConcurrentModificationException var7) {
            throw c(var7);
        }

        return (AnimatedGeoModel<? extends em>)var4;
    }

    public AnimationProcessor<?> b() {
        return this.a().getAnimationProcessor();
    }

    public boolean h(int var1) {
        ArrayList var2 = this.D();

        try {
            if (var2.size() - 1 < var1) {
                return false;
            }
        } catch (ConcurrentModificationException var3) {
            throw c(var3);
        }

        try {
            if ((Integer)var2.get(var1) == 101) {
                return true;
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        return false;
    }

    public e1 g(int var1) {
        return e1.a;
    }

    public void a(List<Integer> param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: instanceof com/trolmastercard/sexmod/e4
        // 04: ifne 1a
        // 07: aload 0
        // 08: instanceof com/trolmastercard/sexmod/ew
        // 0b: ifne 1a
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14: athrow
        // 15: return
        // 16: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 19: athrow
        // 1a: new java/lang/StringBuilder
        // 1d: dup
        // 1e: invokespecial java/lang/StringBuilder.<init> ()V
        // 21: astore 2
        // 22: aload 1
        // 23: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 28: astore 3
        // 29: aload 3
        // 2a: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 2f: ifeq 49
        // 32: aload 3
        // 33: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 38: checkcast java/lang/Integer
        // 3b: invokevirtual java/lang/Integer.intValue ()I
        // 3e: istore 4
        // 40: aload 2
        // 41: iload 4
        // 43: invokestatic com/trolmastercard/sexmod/e4.c (Ljava/lang/StringBuilder;I)V
        // 46: goto 29
        // 49: aload 0
        // 4a: getfield com/trolmastercard/sexmod/em.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 4d: getstatic com/trolmastercard/sexmod/e4.M Lnet/minecraft/network/datasync/DataParameter;
        // 50: aload 2
        // 51: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 54: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 57: return
        // try (0 -> 6): 7 java/util/ConcurrentModificationException
        // try (3 -> 10): 10 java/util/ConcurrentModificationException
    }

    public String F() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: instanceof com/trolmastercard/sexmod/e4
        // 04: ifne 15
        // 07: aload 0
        // 08: instanceof com/trolmastercard/sexmod/ew
        // 0b: ifeq 27
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14: athrow
        // 15: aload 0
        // 16: getfield com/trolmastercard/sexmod/em.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 19: getstatic com/trolmastercard/sexmod/e4.M Lnet/minecraft/network/datasync/DataParameter;
        // 1c: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 1f: checkcast java/lang/String
        // 22: areturn
        // 23: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 26: athrow
        // 27: ldc ""
        // 29: areturn
        // try (0 -> 6): 7 java/util/ConcurrentModificationException
        // try (3 -> 15): 15 java/util/ConcurrentModificationException
    }

    public static String c(List<Integer> var0) {
        StringBuilder var1 = new StringBuilder();

        for (int var3 : var0) {
            var1.append(var3);
            var1.append("-");
        }

        return var1.toString();
    }

    public static List<Integer> c(String var0) {
        ArrayList var1 = new ArrayList();
        String[] var2 = var0.split("-");

        for (String var6 : var2) {
            var1.add(Integer.parseInt(var6));
        }

        return var1;
    }

    public static List<Integer> h(UUID param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/Main.proxy Lcom/trolmastercard/sexmod/CommonProxy;
        // 03: instanceof com/trolmastercard/sexmod/ClientProxy
        // 06: ifeq 14
        // 09: aload 0
        // 0a: invokestatic com/trolmastercard/sexmod/em.b (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/em;
        // 0d: goto 18
        // 10: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 13: athrow
        // 14: aload 0
        // 15: invokestatic com/trolmastercard/sexmod/em.a (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/em;
        // 18: astore 1
        // 19: new java/util/ArrayList
        // 1c: dup
        // 1d: aload 1
        // 1e: invokevirtual com/trolmastercard/sexmod/em.L ()Ljava/util/ArrayList;
        // 21: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
        // 24: astore 2
        // 25: aload 1
        // 26: instanceof com/trolmastercard/sexmod/e4
        // 29: ifne 3a
        // 2c: aload 1
        // 2d: instanceof com/trolmastercard/sexmod/ew
        // 30: ifeq 58
        // 33: goto 3a
        // 36: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 39: athrow
        // 3a: aload 2
        // 3b: aload 1
        // 3c: invokevirtual com/trolmastercard/sexmod/em.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 3f: getstatic com/trolmastercard/sexmod/e4.M Lnet/minecraft/network/datasync/DataParameter;
        // 42: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 45: checkcast java/lang/String
        // 48: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/String;)Ljava/util/List;
        // 4b: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
        // 50: pop
        // 51: goto 58
        // 54: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 57: athrow
        // 58: aload 2
        // 59: areturn
        // try (0 -> 6): 6 java/util/ConcurrentModificationException
        // try (17 -> 23): 24 java/util/ConcurrentModificationException
        // try (20 -> 35): 36 java/util/ConcurrentModificationException
    }

    public ArrayList<Integer> L() {
        return new ArrayList<>();
    }

    public List<Entry<gw, Entry<List<String>, Integer>>> d(UUID var1) {
        try {
            if (this.d != null) {
                return this.d;
            }
        } catch (ConcurrentModificationException var8) {
            throw c(var8);
        }

        ArrayList var2 = this.D();

        try {
            if (var2.isEmpty()) {
                this.d = new ArrayList<>();
                return this.d;
            }
        } catch (ConcurrentModificationException var7) {
            throw c(var7);
        }

        ArrayList var3 = new ArrayList();
        List var4 = h(var1);
        int var5 = 0;

        try {
            while (var5 < var2.size()) {
                var3.add(new SimpleEntry<>(gw.GIRL_SPECIFIC, new SimpleEntry<>(this.e((Integer)var2.get(var5)), var4.get(var5))));
                var5++;
            }
        } catch (ConcurrentModificationException var6) {
            throw c(var6);
        }

        this.d = var3;
        return var3;
    }

    public void b(List<Entry<gw, Entry<List<String>, Integer>>> var1) {
        this.d = var1;
    }

    public void a(int var1, int var2) {
        try {
            if (this.d == null) {
                return;
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        try {
            if (this.d.size() - 1 < var1) {
                return;
            }
        } catch (ConcurrentModificationException var5) {
            throw c(var5);
        }

        Entry var3 = this.d.get(var1);
        ((Entry)var3.getValue()).setValue(var2);
        this.d.set(var1, var3);
    }

    public void e(String param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: instanceof com/trolmastercard/sexmod/e4
        // 04: ifne 15
        // 07: aload 0
        // 08: instanceof com/trolmastercard/sexmod/ew
        // 0b: ifeq 27
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14: athrow
        // 15: aload 0
        // 16: getfield com/trolmastercard/sexmod/em.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 19: getstatic com/trolmastercard/sexmod/e4.M Lnet/minecraft/network/datasync/DataParameter;
        // 1c: aload 1
        // 1d: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 20: goto 27
        // 23: invokestatic com/trolmastercard/sexmod/em.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 26: athrow
        // 27: return
        // try (0 -> 6): 7 java/util/ConcurrentModificationException
        // try (3 -> 14): 15 java/util/ConcurrentModificationException
    }

    private List<String> e(int var1) {
        ArrayList var2 = new ArrayList();
        int var3 = 0;

        try {
            while (var3 < var1) {
                var2.add("");
                var3++;
            }

            return var2;
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }
    }

    public ArrayList<Integer> D() {
        return new ArrayList<>();
    }

    public List<Integer> u() {
        return new ArrayList<>();
    }

    public void f(String var1) {
        this.m.func_187227_b(b, var1);
    }

    public String C() {
        return (String)this.m.func_187225_a(b);
    }

    public static String a(HashSet<String> var0) {
        try {
            if (var0 == null) {
                return "";
            }
        } catch (ConcurrentModificationException var4) {
            throw c(var4);
        }

        try {
            if (var0.isEmpty()) {
                return "";
            }
        } catch (ConcurrentModificationException var5) {
            throw c(var5);
        }

        StringBuilder var1 = new StringBuilder();

        for (String var3 : var0) {
            var1.append(var3);
            var1.append("#");
        }

        return var1.toString();
    }

    public HashSet<String> Y() {
        String var1 = this.C();
        String[] var2 = var1.split("#");
        HashSet var3 = new HashSet();

        for (String var7 : var2) {
            try {
                if ("".equals(var7)) {
                    continue;
                }
            } catch (ConcurrentModificationException var9) {
                throw c(var9);
            }

            try {
                if ("cross".equals(var7)) {
                    continue;
                }
            } catch (ConcurrentModificationException var8) {
                throw c(var8);
            }

            var3.add(var7);
        }

        return var3;
    }

    @SideOnly(Side.CLIENT)
    public boolean H() {
        return true;
    }

    private static RuntimeException c(RuntimeException var0) {
        return var0;
    }

    public enum a {
        WALK,
        FAST_WALK,
        RUN;
    }
}
