package com.trolmastercard.sexmod;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class cc extends Item implements IAnimatable {
    public static final cc r = new cc();
    public static final long c = 4000L;
    public static final long g = 1000L;
    public static final long j = 3000L;
    public static final float q = 0.1F;
    public static final float p = -0.01F;
    public static final float e = 0.0015F;
    public static final float k = 2.0F;
    public static final float h = 1.5F;
    public static final float d = 0.03F;
    public static final float s = 100.0F;
    public static final float l = 0.2F;
    public static final float o = 1.5F;
    public static final String b = "sexmod:galath_coin_activation_time";
    public static final String m = "sexmod:galath_coin_deactivation_time";
    public static final String n = "sexmod:galath_coin_de_summoning_animation_time";
    public static final String f = "Defeating a succubus makes her accept the victor as her master, granting him a coin to which her soul is bound. Using the coin summons her, offering services on demand. If her master uses the coin on her or goes too far, she returns to the coin";
    private final AnimationFactory i = new AnimationFactory(this);
    AnimationController<cc> a;

    public cc() {
        this.field_77777_bU = 1;
    }

    public static void a() {
        r.setRegistryName("sexmod", "galath_coin");
        r.func_77655_b("galath_coin");
        MinecraftForge.EVENT_BUS.register(cc.class);
    }

    @SubscribeEvent
    public static void a(Register<Item> var0) {
        var0.getRegistry().register(r);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void a(ModelRegistryEvent var0) {
        ModelLoader.setCustomModelResourceLocation(r, 0, new ModelResourceLocation("sexmod:galath_coin"));
        r.setTileEntityItemStackRenderer(new av());
    }

    public ActionResult<ItemStack> func_77659_a(World var1, EntityPlayer var2, EnumHand var3) {
        NBTTagCompound var4 = var2.getEntityData();
        ActionResult var5 = new ActionResult(EnumActionResult.FAIL, var2.func_184586_b(var3));

        try {
            if (var4.func_74763_f("sexmod:galath_coin_deactivation_time") != 0L) {
                return var5;
            }
        } catch (ConcurrentModificationException var8) {
            throw a(var8);
        }

        try {
            if (var4.func_74763_f("sexmod:galath_coin_activation_time") != 0L) {
                return var5;
            }
        } catch (ConcurrentModificationException var6) {
            throw a(var6);
        }

        try {
            if (!this.a(var1, var2)) {
                var1.func_184134_a(
                    var2.field_70165_t,
                    var2.field_70163_u,
                    var2.field_70161_v,
                    com.trolmastercard.sexmod.c.MISC_BEEW[0],
                    SoundCategory.PLAYERS,
                    1.0F,
                    1.0F,
                    false
                );
                return new ActionResult(EnumActionResult.SUCCESS, var2.func_184586_b(var3));
            }
        } catch (ConcurrentModificationException var7) {
            throw a(var7);
        }

        var1.func_184134_a(
            var2.field_70165_t, var2.field_70163_u, var2.field_70161_v, com.trolmastercard.sexmod.c.MISC_WEOWEO[1], SoundCategory.PLAYERS, 1.0F, 1.0F, false
        );
        var4.func_74772_a("sexmod:galath_coin_activation_time", System.currentTimeMillis());
        return new ActionResult(EnumActionResult.SUCCESS, var2.func_184586_b(var3));
    }

    boolean a(World param1, EntityPlayer param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: getfield net/minecraft/world/World.field_72995_K Z
        // 04: ifne 22
        // 07: aload 2
        // 08: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 0b: invokestatic com/trolmastercard/sexmod/v.c (Ljava/util/UUID;)Z
        // 0e: ifne 20
        // 11: goto 18
        // 14: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 17: athrow
        // 18: bipush 1
        // 19: goto 21
        // 1c: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 1f: athrow
        // 20: bipush 0
        // 21: ireturn
        // 22: getstatic com/trolmastercard/sexmod/v.f Z
        // 25: ifne 30
        // 28: bipush 1
        // 29: goto 31
        // 2c: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 2f: athrow
        // 30: bipush 0
        // 31: ireturn
        // try (0 -> 7): 8 java/util/ConcurrentModificationException
        // try (3 -> 12): 12 java/util/ConcurrentModificationException
        // try (16 -> 20): 20 java/util/ConcurrentModificationException
    }

    @SubscribeEvent
    public void a(EntityInteract var1) {
        EntityPlayer var2 = var1.getEntityPlayer();
        ItemStack var3 = var2.func_184586_b(var1.getHand());

        try {
            if (!r.equals(var3.func_77973_b())) {
                return;
            }
        } catch (ConcurrentModificationException var8) {
            throw a(var8);
        }

        Entity var4 = var1.getTarget();

        try {
            if (!(var4 instanceof f_)) {
                return;
            }
        } catch (ConcurrentModificationException var7) {
            throw a(var7);
        }

        f_ var5 = (f_)var4;

        try {
            if (!var2.getPersistentID().equals(var5.O())) {
                return;
            }
        } catch (ConcurrentModificationException var6) {
            throw a(var6);
        }

        var2.field_70170_p
            .func_184134_a(
                var2.field_70165_t,
                var2.field_70163_u,
                var2.field_70161_v,
                com.trolmastercard.sexmod.c.MISC_WEOWEO[0],
                SoundCategory.PLAYERS,
                1.0F,
                1.0F,
                false
            );
        var2.getEntityData().func_74772_a("sexmod:galath_coin_deactivation_time", System.currentTimeMillis());
        var1.setCanceled(true);
    }

    public void func_77663_a(ItemStack param1, World param2, Entity param3, int param4, boolean param5) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: aload 1
        // 02: aload 2
        // 03: aload 3
        // 04: iload 4
        // 06: iload 5
        // 08: invokespecial net/minecraft/item/Item.func_77663_a (Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;IZ)V
        // 0b: aload 3
        // 0c: instanceof net/minecraft/entity/player/EntityPlayer
        // 0f: ifne 17
        // 12: return
        // 13: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 16: athrow
        // 17: aload 3
        // 18: checkcast net/minecraft/entity/player/EntityPlayer
        // 1b: astore 6
        // 1d: aload 6
        // 1f: invokevirtual net/minecraft/entity/player/EntityPlayer.getEntityData ()Lnet/minecraft/nbt/NBTTagCompound;
        // 22: astore 7
        // 24: aload 7
        // 26: ldc "sexmod:galath_coin_activation_time"
        // 28: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74763_f (Ljava/lang/String;)J
        // 2b: lstore 8
        // 2d: aload 7
        // 2f: ldc "sexmod:galath_coin_deactivation_time"
        // 31: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74763_f (Ljava/lang/String;)J
        // 34: lstore 10
        // 36: invokestatic java/lang/System.currentTimeMillis ()J
        // 39: lstore 12
        // 3b: aload 0
        // 3c: aload 6
        // 3e: aload 7
        // 40: lload 12
        // 42: lload 8
        // 44: invokevirtual com/trolmastercard/sexmod/cc.b (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/nbt/NBTTagCompound;JJ)V
        // 47: aload 0
        // 48: aload 6
        // 4a: aload 7
        // 4c: lload 12
        // 4e: lload 10
        // 50: invokevirtual com/trolmastercard/sexmod/cc.a (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/nbt/NBTTagCompound;JJ)V
        // 53: lload 10
        // 55: lconst_0
        // 56: lcmp
        // 57: ifeq 84
        // 5a: lload 12
        // 5c: lload 10
        // 5e: ldc2_w 4000
        // 61: ladd
        // 62: lcmp
        // 63: ifle 84
        // 66: goto 6d
        // 69: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 6c: athrow
        // 6d: aload 7
        // 6f: ldc "sexmod:galath_coin_deactivation_time"
        // 71: lconst_0
        // 72: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74772_a (Ljava/lang/String;J)V
        // 75: aload 7
        // 77: ldc "sexmod:galath_coin_de_summoning_animation_time"
        // 79: bipush 0
        // 7a: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74757_a (Ljava/lang/String;Z)V
        // 7d: goto 84
        // 80: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 83: athrow
        // 84: aload 2
        // 85: getfield net/minecraft/world/World.field_72995_K Z
        // 88: ifne 90
        // 8b: return
        // 8c: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 8f: athrow
        // 90: aload 0
        // 91: aload 6
        // 93: lload 12
        // 95: lload 8
        // 97: invokevirtual com/trolmastercard/sexmod/cc.a (Lnet/minecraft/entity/player/EntityPlayer;JJ)V
        // 9a: aload 0
        // 9b: aload 6
        // 9d: lload 12
        // 9f: lload 10
        // a1: invokevirtual com/trolmastercard/sexmod/cc.b (Lnet/minecraft/entity/player/EntityPlayer;JJ)V
        // a4: return
        // try (0 -> 11): 11 java/util/ConcurrentModificationException
        // try (29 -> 51): 52 java/util/ConcurrentModificationException
        // try (45 -> 62): 63 java/util/ConcurrentModificationException
        // try (65 -> 69): 69 java/util/ConcurrentModificationException
    }

    @SideOnly(Side.CLIENT)
    void b(EntityPlayer param1, long param2, long param4) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: lload 4
        // 002: lconst_0
        // 003: lcmp
        // 004: ifne 00c
        // 007: return
        // 008: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 00b: athrow
        // 00c: lload 2
        // 00d: lload 4
        // 00f: ldc2_w 1000
        // 012: ladd
        // 013: lcmp
        // 014: ifle 029
        // 017: lload 2
        // 018: lload 4
        // 01a: ldc2_w 3000
        // 01d: ladd
        // 01e: lcmp
        // 01f: iflt 02e
        // 022: goto 029
        // 025: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 028: athrow
        // 029: return
        // 02a: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 02d: athrow
        // 02e: aconst_null
        // 02f: astore 6
        // 031: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 034: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 039: astore 7
        // 03b: aload 7
        // 03d: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 042: ifeq 09e
        // 045: aload 7
        // 047: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 04c: checkcast com/trolmastercard/sexmod/em
        // 04f: astore 8
        // 051: aload 8
        // 053: getfield com/trolmastercard/sexmod/em.field_70128_L Z
        // 056: ifeq 060
        // 059: goto 03b
        // 05c: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 05f: athrow
        // 060: aload 8
        // 062: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 065: getfield net/minecraft/world/World.field_72995_K Z
        // 068: ifne 072
        // 06b: goto 03b
        // 06e: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 071: athrow
        // 072: aload 8
        // 074: instanceof com/trolmastercard/sexmod/f_
        // 077: ifne 081
        // 07a: goto 03b
        // 07d: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 080: athrow
        // 081: aload 1
        // 082: aload 8
        // 084: invokevirtual com/trolmastercard/sexmod/em.z ()Lnet/minecraft/entity/player/EntityPlayer;
        // 087: invokevirtual net/minecraft/entity/player/EntityPlayer.equals (Ljava/lang/Object;)Z
        // 08a: ifne 094
        // 08d: goto 03b
        // 090: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 093: athrow
        // 094: aload 8
        // 096: checkcast com/trolmastercard/sexmod/f_
        // 099: astore 6
        // 09b: goto 09e
        // 09e: goto 0a3
        // 0a1: astore 7
        // 0a3: aload 6
        // 0a5: ifnonnull 0ad
        // 0a8: return
        // 0a9: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0ac: athrow
        // 0ad: aload 6
        // 0af: invokevirtual com/trolmastercard/sexmod/f_.o ()Lnet/minecraft/util/math/Vec3d;
        // 0b2: dconst_0
        // 0b3: ldc2_w 1.5
        // 0b6: dconst_0
        // 0b7: invokevirtual net/minecraft/util/math/Vec3d.func_72441_c (DDD)Lnet/minecraft/util/math/Vec3d;
        // 0ba: astore 7
        // 0bc: aload 1
        // 0bd: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 0c0: dconst_0
        // 0c1: aload 1
        // 0c2: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70047_e ()F
        // 0c5: f2d
        // 0c6: dconst_0
        // 0c7: invokevirtual net/minecraft/util/math/Vec3d.func_72441_c (DDD)Lnet/minecraft/util/math/Vec3d;
        // 0ca: astore 8
        // 0cc: aload 8
        // 0ce: aload 1
        // 0cf: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184614_ca ()Lnet/minecraft/item/ItemStack;
        // 0d2: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 0d5: getstatic com/trolmastercard/sexmod/cc.r Lcom/trolmastercard/sexmod/cc;
        // 0d8: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
        // 0db: ifeq 0e6
        // 0de: bipush 1
        // 0df: goto 0e7
        // 0e2: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0e5: athrow
        // 0e6: bipush -1
        // 0e7: i2f
        // 0e8: ldc 0.1
        // 0ea: fmul
        // 0eb: f2d
        // 0ec: ldc -0.01
        // 0ee: aload 1
        // 0ef: getfield net/minecraft/entity/player/EntityPlayer.field_70125_A F
        // 0f2: ldc 0.0015
        // 0f4: fmul
        // 0f5: fadd
        // 0f6: f2d
        // 0f7: dconst_0
        // 0f8: aload 1
        // 0f9: getfield net/minecraft/entity/player/EntityPlayer.field_70761_aq F
        // 0fc: invokestatic com/trolmastercard/sexmod/ck.a (DDDF)Lnet/minecraft/util/math/Vec3d;
        // 0ff: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 102: astore 9
        // 104: lload 2
        // 105: lload 4
        // 107: lsub
        // 108: ldc2_w 1000
        // 10b: lsub
        // 10c: l2f
        // 10d: ldc 2000.0
        // 10f: fdiv
        // 110: fstore 10
        // 112: aload 7
        // 114: aload 9
        // 116: fload 10
        // 118: f2d
        // 119: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 11c: astore 11
        // 11e: ldc 0.2
        // 120: putstatic com/trolmastercard/sexmod/ez.b F
        // 123: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 126: getfield net/minecraft/client/Minecraft.field_71452_i Lnet/minecraft/client/particle/ParticleManager;
        // 129: new com/trolmastercard/sexmod/ez
        // 12c: dup
        // 12d: aload 1
        // 12e: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
        // 131: aload 11
        // 133: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 136: aload 11
        // 138: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 13b: aload 11
        // 13d: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 140: invokespecial com/trolmastercard/sexmod/ez.<init> (Lnet/minecraft/world/World;DDD)V
        // 143: invokevirtual net/minecraft/client/particle/ParticleManager.func_78873_a (Lnet/minecraft/client/particle/Particle;)V
        // 146: return
        // try (56 -> 62): 62 java/util/ConcurrentModificationException
        // try (50 -> 54): 54 java/util/ConcurrentModificationException
        // try (43 -> 48): 48 java/util/ConcurrentModificationException
        // try (37 -> 41): 41 java/util/ConcurrentModificationException
        // try (13 -> 23): 23 java/util/ConcurrentModificationException
        // try (7 -> 19): 20 java/util/ConcurrentModificationException
        // try (0 -> 5): 5 java/util/ConcurrentModificationException
        // try (27 -> 68): 69 java/util/ConcurrentModificationException
        // try (70 -> 73): 73 java/util/ConcurrentModificationException
        // try (91 -> 100): 100 java/util/ConcurrentModificationException
    }

    @SideOnly(Side.CLIENT)
    void a(EntityPlayer var1) {
        try {
            if (!Minecraft.func_71410_x().field_71439_g.getPersistentID().equals(var1.getPersistentID())) {
                return;
            }
        } catch (ConcurrentModificationException var2) {
            throw a(var2);
        }

        v.f = true;
    }

    @SideOnly(Side.CLIENT)
    void a(EntityPlayer param1, long param2, long param4) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: lload 2
        // 01: lload 4
        // 03: ldc2_w 1000
        // 06: ladd
        // 07: lcmp
        // 08: ifle 1d
        // 0b: lload 2
        // 0c: lload 4
        // 0e: ldc2_w 3000
        // 11: ladd
        // 12: lcmp
        // 13: iflt 22
        // 16: goto 1d
        // 19: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 1c: athrow
        // 1d: return
        // 1e: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 21: athrow
        // 22: aload 1
        // 23: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 26: dconst_0
        // 27: aload 1
        // 28: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70047_e ()F
        // 2b: f2d
        // 2c: dconst_0
        // 2d: invokevirtual net/minecraft/util/math/Vec3d.func_72441_c (DDD)Lnet/minecraft/util/math/Vec3d;
        // 30: astore 6
        // 32: aload 6
        // 34: aload 1
        // 35: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184614_ca ()Lnet/minecraft/item/ItemStack;
        // 38: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 3b: getstatic com/trolmastercard/sexmod/cc.r Lcom/trolmastercard/sexmod/cc;
        // 3e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
        // 41: ifeq 4c
        // 44: bipush 1
        // 45: goto 4d
        // 48: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 4b: athrow
        // 4c: bipush -1
        // 4d: i2f
        // 4e: ldc 0.1
        // 50: fmul
        // 51: f2d
        // 52: ldc -0.01
        // 54: aload 1
        // 55: getfield net/minecraft/entity/player/EntityPlayer.field_70125_A F
        // 58: ldc 0.0015
        // 5a: fmul
        // 5b: fadd
        // 5c: f2d
        // 5d: dconst_0
        // 5e: aload 1
        // 5f: getfield net/minecraft/entity/player/EntityPlayer.field_70761_aq F
        // 62: invokestatic com/trolmastercard/sexmod/ck.a (DDDF)Lnet/minecraft/util/math/Vec3d;
        // 65: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 68: astore 7
        // 6a: aload 6
        // 6c: aload 1
        // 6d: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70040_Z ()Lnet/minecraft/util/math/Vec3d;
        // 70: invokevirtual net/minecraft/util/math/Vec3d.func_72432_b ()Lnet/minecraft/util/math/Vec3d;
        // 73: ldc2_w 2.0
        // 76: invokevirtual net/minecraft/util/math/Vec3d.func_186678_a (D)Lnet/minecraft/util/math/Vec3d;
        // 79: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 7c: astore 8
        // 7e: lload 2
        // 7f: lload 4
        // 81: lsub
        // 82: ldc2_w 1000
        // 85: lsub
        // 86: l2f
        // 87: ldc 2000.0
        // 89: fdiv
        // 8a: fstore 9
        // 8c: aload 7
        // 8e: aload 8
        // 90: fload 9
        // 92: f2d
        // 93: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 96: astore 10
        // 98: ldc 0.2
        // 9a: putstatic com/trolmastercard/sexmod/ez.b F
        // 9d: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // a0: getfield net/minecraft/client/Minecraft.field_71452_i Lnet/minecraft/client/particle/ParticleManager;
        // a3: new com/trolmastercard/sexmod/ez
        // a6: dup
        // a7: aload 1
        // a8: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
        // ab: aload 10
        // ad: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // b0: aload 10
        // b2: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // b5: aload 10
        // b7: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // ba: invokespecial com/trolmastercard/sexmod/ez.<init> (Lnet/minecraft/world/World;DDD)V
        // bd: invokevirtual net/minecraft/client/particle/ParticleManager.func_78873_a (Lnet/minecraft/client/particle/Particle;)V
        // c0: return
        // try (0 -> 12): 13 java/util/ConcurrentModificationException
        // try (6 -> 16): 16 java/util/ConcurrentModificationException
        // try (27 -> 36): 36 java/util/ConcurrentModificationException
    }

    @SubscribeEvent
    public void a(PlayerChangedDimensionEvent var1) {
        EntityPlayer var2 = var1.player;

        try {
            if (var2.field_70170_p.field_72995_K) {
                return;
            }
        } catch (ConcurrentModificationException var6) {
            throw a(var6);
        }

        UUID var3 = v.b(var2);
        em var4 = em.a(var3);

        try {
            if (var4 == null) {
                return;
            }
        } catch (ConcurrentModificationException var5) {
            throw a(var5);
        }

        v.a((f_)var4);
        ge.b.sendTo(new gf(false), (EntityPlayerMP)var2);
    }

    void b(EntityPlayer var1, NBTTagCompound var2, long var3, long var5) {
        try {
            if (var5 == 0L) {
                return;
            }
        } catch (ConcurrentModificationException var13) {
            throw a(var13);
        }

        try {
            if (var3 - var5 <= 4000L) {
                return;
            }
        } catch (ConcurrentModificationException var16) {
            throw a(var16);
        }

        var2.func_74772_a("sexmod:galath_coin_activation_time", 0L);
        Vec3d var7 = var1.func_174791_d().func_72441_c(0.0, var1.func_70047_e(), 0.0);
        Vec3d var8 = var7.func_178787_e(var1.func_70040_Z().func_72432_b().func_186678_a(2.0));
        Random var9 = var1.func_70681_au();
        int var10 = 0;

        try {
            while (var10 < 100.0F) {
                var1.field_70170_p
                    .func_175688_a(
                        EnumParticleTypes.DRAGON_BREATH,
                        var8.field_72450_a,
                        var8.field_72448_b,
                        var8.field_72449_c,
                        (2.0F * var9.nextFloat() - 1.0F) * 0.2F,
                        (2.0F * var9.nextFloat() - 1.0F) * 0.2F,
                        (2.0F * var9.nextFloat() - 1.0F) * 0.2F,
                        new int[0]
                    );
                var10++;
            }
        } catch (ConcurrentModificationException var15) {
            throw a(var15);
        }

        World var17 = var1.field_70170_p;

        try {
            if (var17.field_72995_K) {
                this.a(var1);
                return;
            }
        } catch (ConcurrentModificationException var14) {
            throw a(var14);
        }

        f_ var11 = new f_(var1.field_70170_p, var1, var8);

        try {
            var11.func_70634_a(var8.field_72450_a, var8.field_72448_b, var8.field_72449_c);
            v.a(var1, var11);
            var1.field_70170_p.func_72838_d(var11);
            if (v.b(var1.getPersistentID())) {
                var11.v();
            }
        } catch (ConcurrentModificationException var12) {
            throw a(var12);
        }
    }

    void d(EntityPlayer var1) {
        try {
            if (var1.field_70170_p.field_72995_K) {
                this.b(var1);
                return;
            }
        } catch (ConcurrentModificationException var2) {
            throw a(var2);
        }

        this.c(var1);
    }

    void c(EntityPlayer var1) {
        UUID var2 = v.b(var1);
        em var3 = em.a(var2);

        try {
            if (var3 instanceof f_) {
                a((f_)var3);
            }
        } catch (ConcurrentModificationException var4) {
            throw a(var4);
        }
    }

    public static void a(f_ var0) {
        var0.b(fp.GALATH_DE_SUMMON);
        var0.aC();
        var0.a(true);
        var0.c(var0.func_174791_d());
        var0.b(var0.field_70177_z);
    }

    @SideOnly(Side.CLIENT)
    void b(EntityPlayer var1) {
        f_ var2 = null;

        try {
            label69: {
                Iterator var3 = em.ad().iterator();

                em var4;
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                if (!var3.hasNext()) {
                                    break label69;
                                }

                                var4 = (em)var3.next();

                                try {
                                    if (var4.field_70128_L) {
                                        continue;
                                    }
                                    break;
                                } catch (ConcurrentModificationException var6) {
                                    throw a(var6);
                                }
                            }

                            try {
                                if (!var4.field_70170_p.field_72995_K) {
                                    continue;
                                }
                                break;
                            } catch (ConcurrentModificationException var7) {
                                throw a(var7);
                            }
                        }

                        try {
                            if (!(var4 instanceof f_)) {
                                continue;
                            }
                            break;
                        } catch (ConcurrentModificationException var8) {
                            throw a(var8);
                        }
                    }

                    try {
                        if (!var1.equals(var4.z())) {
                            continue;
                        }
                        break;
                    } catch (ConcurrentModificationException var9) {
                        throw a(var9);
                    }
                }

                var2 = (f_)var4;
            }
        } catch (ConcurrentModificationException var10) {
        }

        try {
            if (var2 == null) {
                return;
            }
        } catch (ConcurrentModificationException var5) {
            throw a(var5);
        }

        a(var1, var2);
    }

    @SideOnly(Side.CLIENT)
    public static void a(UUID var0, f_ var1) {
        World var2 = var1.field_70170_p;

        Vec3d var10000;
        label34: {
            try {
                if (var1.Q()) {
                    var10000 = var1.o();
                    break label34;
                }
            } catch (ConcurrentModificationException var11) {
                throw a(var11);
            }

            var10000 = var1.func_174791_d();
        }

        Vec3d var3 = var10000;
        Vec3d var4 = var3.func_72441_c(0.0, 1.5, 0.0);
        Random var5 = var1.func_70681_au();

        for (int var6 = 0; var6 < 100.0F; var6++) {
            Vec3d var7 = new Vec3d((var5.nextFloat() * 2.0F - 1.0F) * 1.5F, (var5.nextFloat() * 2.0F - 1.0F) * 1.5F, (var5.nextFloat() * 2.0F - 1.0F) * 1.5F);
            Vec3d var8 = var4.func_178787_e(var7);
            Vec3d var9 = var7.func_186678_a(-0.03F);
            var2.func_175688_a(
                EnumParticleTypes.DRAGON_BREATH,
                var8.field_72450_a,
                var8.field_72448_b,
                var8.field_72449_c,
                var9.field_72450_a,
                var9.field_72448_b,
                var9.field_72449_c,
                new int[0]
            );
        }

        try {
            if (Minecraft.func_71410_x().field_71439_g.getPersistentID().equals(var0)) {
                v.f = false;
            }
        } catch (ConcurrentModificationException var10) {
            throw a(var10);
        }
    }

    public static void a(EntityPlayer var0, f_ var1) {
        a(var0.getPersistentID(), var1);
    }

    void a(EntityPlayer param1, NBTTagCompound param2, long param3, long param5) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: lload 5
        // 02: lconst_0
        // 03: lcmp
        // 04: ifne 0c
        // 07: return
        // 08: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0b: athrow
        // 0c: lload 3
        // 0d: lload 5
        // 0f: lsub
        // 10: lstore 7
        // 12: aload 1
        // 13: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
        // 16: astore 9
        // 18: aload 2
        // 19: ldc "sexmod:galath_coin_de_summoning_animation_time"
        // 1b: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74767_n (Ljava/lang/String;)Z
        // 1e: istore 10
        // 20: iload 10
        // 22: ifne 5d
        // 25: lload 7
        // 27: ldc2_w 1000
        // 2a: aload 9
        // 2c: getfield net/minecraft/world/World.field_72995_K Z
        // 2f: ifeq 41
        // 32: goto 39
        // 35: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 38: athrow
        // 39: bipush 0
        // 3a: goto 44
        // 3d: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 40: athrow
        // 41: sipush 150
        // 44: i2l
        // 45: lsub
        // 46: lcmp
        // 47: ifle 5d
        // 4a: aload 2
        // 4b: ldc "sexmod:galath_coin_de_summoning_animation_time"
        // 4d: bipush 1
        // 4e: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74757_a (Ljava/lang/String;Z)V
        // 51: aload 0
        // 52: aload 1
        // 53: invokevirtual com/trolmastercard/sexmod/cc.d (Lnet/minecraft/entity/player/EntityPlayer;)V
        // 56: goto 5d
        // 59: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 5c: athrow
        // 5d: aload 9
        // 5f: getfield net/minecraft/world/World.field_72995_K Z
        // 62: ifeq 6a
        // 65: return
        // 66: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 69: athrow
        // 6a: lload 3
        // 6b: lload 5
        // 6d: lsub
        // 6e: ldc2_w 3000
        // 71: lcmp
        // 72: ifgt 7a
        // 75: return
        // 76: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 79: athrow
        // 7a: aload 1
        // 7b: invokestatic com/trolmastercard/sexmod/v.b (Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/UUID;
        // 7e: astore 11
        // 80: aload 11
        // 82: invokestatic com/trolmastercard/sexmod/em.a (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/em;
        // 85: astore 12
        // 87: aload 12
        // 89: instanceof com/trolmastercard/sexmod/f_
        // 8c: ifne 94
        // 8f: return
        // 90: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 93: athrow
        // 94: aload 12
        // 96: checkcast com/trolmastercard/sexmod/f_
        // 99: invokestatic com/trolmastercard/sexmod/v.a (Lcom/trolmastercard/sexmod/f_;)V
        // 9c: return
        // try (0 -> 5): 5 java/util/ConcurrentModificationException
        // try (18 -> 25): 26 java/util/ConcurrentModificationException
        // try (20 -> 30): 30 java/util/ConcurrentModificationException
        // try (33 -> 44): 45 java/util/ConcurrentModificationException
        // try (47 -> 51): 51 java/util/ConcurrentModificationException
        // try (53 -> 60): 60 java/util/ConcurrentModificationException
        // try (68 -> 72): 72 java/util/ConcurrentModificationException
    }

    @Override
    public void registerControllers(AnimationData var1) {
        this.a = new AnimationController<>(this, "controller", 0.0F, this::a);
        var1.addAnimationController(this.a);
    }

    @SideOnly(Side.CLIENT)
    protected <segs extends IAnimatable> PlayState a(AnimationEvent<segs> param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 03: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 06: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getEntityData ()Lnet/minecraft/nbt/NBTTagCompound;
        // 09: astore 2
        // 0a: aload 2
        // 0b: ldc "sexmod:galath_coin_activation_time"
        // 0d: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74763_f (Ljava/lang/String;)J
        // 10: lconst_0
        // 11: lcmp
        // 12: ifne 36
        // 15: aload 2
        // 16: ldc "sexmod:galath_coin_deactivation_time"
        // 18: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74763_f (Ljava/lang/String;)J
        // 1b: lconst_0
        // 1c: lcmp
        // 1d: ifne 36
        // 20: goto 27
        // 23: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 26: athrow
        // 27: aload 1
        // 28: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getController ()Lsoftware/bernie/geckolib3/core/controller/AnimationController;
        // 2b: invokevirtual software/bernie/geckolib3/core/controller/AnimationController.clearAnimationCache ()V
        // 2e: getstatic software/bernie/geckolib3/core/PlayState.STOP Lsoftware/bernie/geckolib3/core/PlayState;
        // 31: areturn
        // 32: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 35: athrow
        // 36: aload 0
        // 37: getfield com/trolmastercard/sexmod/cc.a Lsoftware/bernie/geckolib3/core/controller/AnimationController;
        // 3a: new software/bernie/geckolib3/core/builder/AnimationBuilder
        // 3d: dup
        // 3e: invokespecial software/bernie/geckolib3/core/builder/AnimationBuilder.<init> ()V
        // 41: ldc "animation.galath_coin.summon"
        // 43: getstatic software/bernie/geckolib3/core/builder/ILoopType$EDefaultLoopTypes.PLAY_ONCE Lsoftware/bernie/geckolib3/core/builder/ILoopType$EDefaultLoopTypes;
        // 46: invokevirtual software/bernie/geckolib3/core/builder/AnimationBuilder.addAnimation (Ljava/lang/String;Lsoftware/bernie/geckolib3/core/builder/ILoopType;)Lsoftware/bernie/geckolib3/core/builder/AnimationBuilder;
        // 49: invokevirtual software/bernie/geckolib3/core/controller/AnimationController.setAnimation (Lsoftware/bernie/geckolib3/core/builder/AnimationBuilder;)V
        // 4c: getstatic software/bernie/geckolib3/core/PlayState.CONTINUE Lsoftware/bernie/geckolib3/core/PlayState;
        // 4f: areturn
        // try (4 -> 16): 17 java/util/ConcurrentModificationException
        // try (10 -> 24): 24 java/util/ConcurrentModificationException
    }

    @Override
    public AnimationFactory getFactory() {
        return this.i;
    }

    private static ConcurrentModificationException a(ConcurrentModificationException var0) {
        return var0;
    }
}
