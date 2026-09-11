package com.trolmastercard.sexmod;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ap extends Item implements IAnimatable {
    static final String e = "sexmodAllieInUse";
    static final String d = "sexmodAllieInUseTicks";
    public static final String j = "sexmodUses";
    public static final String h = "sexmodAllieID";
    static final Integer c = 95;
    static final Integer k = 50;
    public static final int a = 150;
    public static final float f = 0.75F;
    public static final ap b = new ap();
    private final AnimationFactory i = new AnimationFactory(this);
    AnimationController<ap> g;

    public ap() {
        this.func_77637_a(CreativeTabs.field_78026_f);
        this.field_77777_bU = 1;
    }

    public static void a() {
        b.setRegistryName("sexmod", "allies_lamp");
        b.func_77655_b("allies_lamp");
        MinecraftForge.EVENT_BUS.register(ap.class);
    }

    @SubscribeEvent
    public static void a(Register<Item> var0) {
        var0.getRegistry().register(b);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void a(ModelRegistryEvent var0) {
        ModelLoader.setCustomModelResourceLocation(b, 0, new ModelResourceLocation("sexmod:allies_lamp"));
        b.setTileEntityItemStackRenderer(new f0());
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(Pre var1) {
        NBTTagCompound var2 = Minecraft.func_71410_x().field_71439_g.getEntityData();

        try {
            if (var2.func_74767_n("sexmodAllieInUse")) {
                var1.setCanceled(true);
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }
    }

    @SubscribeEvent
    public void a(LootTableLoadEvent var1) {
        HashSet var2 = new HashSet();
        var2.add(LootTableList.field_186424_f);
        var2.add(LootTableList.field_186429_k);
        var2.add(LootTableList.field_186422_d);
        var2.add(LootTableList.field_191192_o);
        if (var2.contains(var1.getName())) {
            LootPool var3 = var1.getTable().getPool("pool3");
            if (var3 == null) {
                var3 = var1.getTable().getPool("pool2");
            }

            try {
                if (var3 != null) {
                    var3.addEntry(new LootEntryItem(b, 5, 0, new LootFunction[0], new LootCondition[0], "sexmod:allies_lamp"));
                }
            } catch (RuntimeException var4) {
                throw a(var4);
            }
        }
    }

    @Override
    public void registerControllers(AnimationData var1) {
        this.g = new AnimationController<>(this, "controller", 2.0F, this::a);
        var1.addAnimationController(this.g);
    }

    @SideOnly(Side.CLIENT)
    public void func_77624_a(ItemStack var1, World var2, List<String> var3, ITooltipFlag var4) {
        NBTTagCompound var5 = var1.func_77978_p();

        try {
            if (var5 == null) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        int var6 = 3 - var1.func_77978_p().func_74762_e("sexmodUses");

        label42: {
            try {
                switch (var6) {
                    case 0:
                        break;
                    case 1:
                        break label42;
                    case 2:
                        var3.add("2 wishes left");
                        return;
                    default:
                        return;
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            var3.add("no wishes left");
            return;
        }

        var3.add("1 wish left");
    }

    @SideOnly(Side.CLIENT)
    protected <segs extends IAnimatable> PlayState a(AnimationEvent<segs> var1) {
        EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
        NBTTagCompound var3 = var2.getEntityData();
        boolean var4 = var3.func_74767_n("sexmodAllieInUse");

        try {
            if (!var4) {
                var1.getController().clearAnimationCache();
                return PlayState.STOP;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        var1.getController().setAnimation(new AnimationBuilder().addAnimation("animation.lamp.rub", ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME));
        return PlayState.CONTINUE;
    }

    public void func_77663_a(ItemStack param1, World param2, Entity param3, int param4, boolean param5) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 3
        // 001: instanceof net/minecraft/entity/player/EntityPlayer
        // 004: ifne 00c
        // 007: return
        // 008: invokestatic com/trolmastercard/sexmod/ap.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 00b: athrow
        // 00c: aload 3
        // 00d: checkcast net/minecraft/entity/player/EntityPlayer
        // 010: astore 6
        // 012: aload 3
        // 013: invokevirtual net/minecraft/entity/Entity.getEntityData ()Lnet/minecraft/nbt/NBTTagCompound;
        // 016: astore 7
        // 018: aload 1
        // 019: aload 6
        // 01b: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184614_ca ()Lnet/minecraft/item/ItemStack;
        // 01e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
        // 021: ifne 03c
        // 024: aload 1
        // 025: aload 6
        // 027: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184592_cb ()Lnet/minecraft/item/ItemStack;
        // 02a: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
        // 02d: ifne 03c
        // 030: goto 037
        // 033: invokestatic com/trolmastercard/sexmod/ap.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 036: athrow
        // 037: return
        // 038: invokestatic com/trolmastercard/sexmod/ap.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 03b: athrow
        // 03c: aload 7
        // 03e: ldc "sexmodAllieInUse"
        // 040: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74767_n (Ljava/lang/String;)Z
        // 043: istore 8
        // 045: aload 7
        // 047: ldc "sexmodAllieInUseTicks"
        // 049: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74762_e (Ljava/lang/String;)I
        // 04c: istore 9
        // 04e: iload 8
        // 050: ifne 058
        // 053: return
        // 054: invokestatic com/trolmastercard/sexmod/ap.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 057: athrow
        // 058: aload 7
        // 05a: ldc "sexmodAllieInUseTicks"
        // 05c: iload 9
        // 05e: bipush 1
        // 05f: iadd
        // 060: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74768_a (Ljava/lang/String;I)V
        // 063: iload 9
        // 065: getstatic com/trolmastercard/sexmod/ap.k Ljava/lang/Integer;
        // 068: invokevirtual java/lang/Integer.intValue ()I
        // 06b: if_icmple 0da
        // 06e: iload 9
        // 070: getstatic com/trolmastercard/sexmod/ap.c Ljava/lang/Integer;
        // 073: invokevirtual java/lang/Integer.intValue ()I
        // 076: if_icmpge 0da
        // 079: goto 080
        // 07c: invokestatic com/trolmastercard/sexmod/ap.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 07f: athrow
        // 080: iload 9
        // 082: getstatic com/trolmastercard/sexmod/ap.k Ljava/lang/Integer;
        // 085: invokevirtual java/lang/Integer.intValue ()I
        // 088: isub
        // 089: i2f
        // 08a: getstatic com/trolmastercard/sexmod/ap.c Ljava/lang/Integer;
        // 08d: invokevirtual java/lang/Integer.intValue ()I
        // 090: getstatic com/trolmastercard/sexmod/ap.k Ljava/lang/Integer;
        // 093: invokevirtual java/lang/Integer.intValue ()I
        // 096: isub
        // 097: i2f
        // 098: fdiv
        // 099: f2d
        // 09a: dstore 10
        // 09c: dload 10
        // 09e: invokestatic com/trolmastercard/sexmod/b6.h (D)D
        // 0a1: dstore 10
        // 0a3: new net/minecraft/util/math/Vec3d
        // 0a6: dup
        // 0a7: dconst_0
        // 0a8: aload 6
        // 0aa: getfield net/minecraft/entity/player/EntityPlayer.eyeHeight F
        // 0ad: f2d
        // 0ae: dconst_1
        // 0af: dload 10
        // 0b1: dsub
        // 0b2: dmul
        // 0b3: dconst_0
        // 0b4: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 0b7: astore 12
        // 0b9: aload 2
        // 0ba: getstatic net/minecraft/util/EnumParticleTypes.CRIT_MAGIC Lnet/minecraft/util/EnumParticleTypes;
        // 0bd: aload 0
        // 0be: aload 6
        // 0c0: invokevirtual com/trolmastercard/sexmod/ap.a (Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/util/math/Vec3d;
        // 0c3: aload 12
        // 0c5: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 0c8: dload 10
        // 0ca: ldc2_w 150.0
        // 0cd: dmul
        // 0ce: d2i
        // 0cf: dload 10
        // 0d1: ldc2_w 0.75
        // 0d4: dmul
        // 0d5: dload 10
        // 0d7: invokestatic com/trolmastercard/sexmod/cj.a (Lnet/minecraft/world/World;Lnet/minecraft/util/EnumParticleTypes;Lnet/minecraft/util/math/Vec3d;IDD)V
        // 0da: iload 9
        // 0dc: getstatic com/trolmastercard/sexmod/ap.c Ljava/lang/Integer;
        // 0df: invokevirtual java/lang/Integer.intValue ()I
        // 0e2: if_icmpge 0ea
        // 0e5: return
        // 0e6: invokestatic com/trolmastercard/sexmod/ap.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e9: athrow
        // 0ea: aload 2
        // 0eb: getstatic net/minecraft/util/EnumParticleTypes.CRIT_MAGIC Lnet/minecraft/util/EnumParticleTypes;
        // 0ee: aload 0
        // 0ef: aload 6
        // 0f1: invokevirtual com/trolmastercard/sexmod/ap.a (Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/util/math/Vec3d;
        // 0f4: sipush 150
        // 0f7: ldc2_w 0.75
        // 0fa: ldc2_w 2.0
        // 0fd: invokestatic com/trolmastercard/sexmod/cj.a (Lnet/minecraft/world/World;Lnet/minecraft/util/EnumParticleTypes;Lnet/minecraft/util/math/Vec3d;IDD)V
        // 100: aload 7
        // 102: ldc "sexmodAllieInUse"
        // 104: bipush 0
        // 105: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74757_a (Ljava/lang/String;Z)V
        // 108: aload 7
        // 10a: ldc "sexmodAllieInUseTicks"
        // 10c: bipush 0
        // 10d: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74768_a (Ljava/lang/String;I)V
        // 110: aload 2
        // 111: getfield net/minecraft/world/World.field_72995_K Z
        // 114: ifeq 120
        // 117: bipush 0
        // 118: invokestatic com/trolmastercard/sexmod/d3.a (Z)V
        // 11b: return
        // 11c: invokestatic com/trolmastercard/sexmod/ap.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 11f: athrow
        // 120: aload 1
        // 121: invokevirtual net/minecraft/item/ItemStack.func_77978_p ()Lnet/minecraft/nbt/NBTTagCompound;
        // 124: astore 10
        // 126: aload 10
        // 128: ifnonnull 134
        // 12b: new net/minecraft/nbt/NBTTagCompound
        // 12e: dup
        // 12f: invokespecial net/minecraft/nbt/NBTTagCompound.<init> ()V
        // 132: astore 10
        // 134: aload 10
        // 136: ldc "sexmodUses"
        // 138: aload 10
        // 13a: ldc "sexmodUses"
        // 13c: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74762_e (Ljava/lang/String;)I
        // 13f: bipush 1
        // 140: iadd
        // 141: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74768_a (Ljava/lang/String;I)V
        // 144: new com/trolmastercard/sexmod/ev
        // 147: dup
        // 148: aload 6
        // 14a: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
        // 14d: aload 6
        // 14f: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184614_ca ()Lnet/minecraft/item/ItemStack;
        // 152: invokespecial com/trolmastercard/sexmod/ev.<init> (Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;)V
        // 155: astore 11
        // 157: aload 11
        // 159: aload 6
        // 15b: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 15e: invokevirtual com/trolmastercard/sexmod/ev.e (Ljava/util/UUID;)V
        // 161: aload 0
        // 162: aload 6
        // 164: invokevirtual com/trolmastercard/sexmod/ap.a (Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/util/math/Vec3d;
        // 167: astore 12
        // 169: aload 11
        // 16b: aload 12
        // 16d: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 170: aload 12
        // 172: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 175: aload 12
        // 177: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 17a: aload 6
        // 17c: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
        // 17f: ldc 180.0
        // 181: fadd
        // 182: aload 6
        // 184: getfield net/minecraft/entity/player/EntityPlayer.field_70125_A F
        // 187: invokevirtual com/trolmastercard/sexmod/ev.func_70080_a (DDDFF)V
        // 18a: aload 11
        // 18c: aload 11
        // 18e: invokevirtual com/trolmastercard/sexmod/ev.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 191: invokevirtual com/trolmastercard/sexmod/ev.c (Lnet/minecraft/util/math/Vec3d;)V
        // 194: aload 11
        // 196: aload 6
        // 198: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
        // 19b: ldc 180.0
        // 19d: fadd
        // 19e: invokevirtual com/trolmastercard/sexmod/ev.b (F)V
        // 1a1: aload 11
        // 1a3: bipush 1
        // 1a4: invokevirtual com/trolmastercard/sexmod/ev.a (Z)V
        // 1a7: aload 11
        // 1a9: bipush 1
        // 1aa: invokevirtual com/trolmastercard/sexmod/ev.func_189654_d (Z)V
        // 1ad: aload 11
        // 1af: bipush 1
        // 1b0: putfield com/trolmastercard/sexmod/ev.field_70145_X Z
        // 1b3: aload 6
        // 1b5: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
        // 1b8: aload 11
        // 1ba: invokevirtual net/minecraft/world/World.func_72838_d (Lnet/minecraft/entity/Entity;)Z
        // 1bd: pop
        // 1be: aload 11
        // 1c0: invokevirtual com/trolmastercard/sexmod/ev.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 1c3: bipush 0
        // 1c4: bipush -1
        // 1c5: bipush 0
        // 1c6: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
        // 1c9: astore 13
        // 1cb: aload 11
        // 1cd: getfield com/trolmastercard/sexmod/ev.field_70170_p Lnet/minecraft/world/World;
        // 1d0: aload 13
        // 1d2: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 1d5: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 1da: getstatic net/minecraft/init/Blocks.field_150354_m Lnet/minecraft/block/BlockSand;
        // 1dd: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
        // 1e0: ifeq 1f2
        // 1e3: aload 11
        // 1e5: getstatic com/trolmastercard/sexmod/fp.SUMMON_SAND Lcom/trolmastercard/sexmod/fp;
        // 1e8: invokevirtual com/trolmastercard/sexmod/ev.b (Lcom/trolmastercard/sexmod/fp;)V
        // 1eb: goto 20c
        // 1ee: invokestatic com/trolmastercard/sexmod/ap.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1f1: athrow
        // 1f2: aload 11
        // 1f4: aload 11
        // 1f6: invokevirtual com/trolmastercard/sexmod/ev.f ()Z
        // 1f9: ifeq 206
        // 1fc: getstatic com/trolmastercard/sexmod/fp.SUMMON Lcom/trolmastercard/sexmod/fp;
        // 1ff: goto 209
        // 202: invokestatic com/trolmastercard/sexmod/ap.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 205: athrow
        // 206: getstatic com/trolmastercard/sexmod/fp.SUMMON_NORMAL Lcom/trolmastercard/sexmod/fp;
        // 209: invokevirtual com/trolmastercard/sexmod/ev.b (Lcom/trolmastercard/sexmod/fp;)V
        // 20c: aload 1
        // 20d: aload 10
        // 20f: invokevirtual net/minecraft/item/ItemStack.func_77982_d (Lnet/minecraft/nbt/NBTTagCompound;)V
        // 212: return
        // try (0 -> 4): 4 java/lang/RuntimeException
        // try (12 -> 22): 23 java/lang/RuntimeException
        // try (17 -> 26): 26 java/lang/RuntimeException
        // try (36 -> 39): 39 java/lang/RuntimeException
        // try (41 -> 55): 56 java/lang/RuntimeException
        // try (104 -> 109): 109 java/lang/RuntimeException
        // try (111 -> 134): 134 java/lang/RuntimeException
        // try (214 -> 226): 226 java/lang/RuntimeException
        // try (228 -> 234): 234 java/lang/RuntimeException
    }

    Vec3d a(EntityPlayer var1) {
        return var1.func_174791_d().func_178787_e(ck.a(new Vec3d(0.0, 0.0, 2.0), var1.field_70759_as));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.i;
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }

    public static class a {
        @SubscribeEvent
        public void a(PlayerLoggedOutEvent var1) {
            var1.player.getEntityData().func_74757_a("sexmodAllieInUse", false);
        }

        @SubscribeEvent
        public void a(RightClickItem param1) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 000: aload 1
            // 001: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickItem.getEntityPlayer ()Lnet/minecraft/entity/player/EntityPlayer;
            // 004: astore 2
            // 005: aload 1
            // 006: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickItem.getHand ()Lnet/minecraft/util/EnumHand;
            // 009: astore 3
            // 00a: aload 2
            // 00b: aload 3
            // 00c: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184586_b (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
            // 00f: astore 4
            // 011: aload 2
            // 012: invokestatic com/trolmastercard/sexmod/ei.e (Lnet/minecraft/entity/player/EntityPlayer;)Z
            // 015: ifeq 01d
            // 018: return
            // 019: invokestatic com/trolmastercard/sexmod/ap$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
            // 01c: athrow
            // 01d: aload 2
            // 01e: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
            // 021: getfield net/minecraft/world/World.field_72995_K Z
            // 024: ifeq 039
            // 027: invokestatic com/trolmastercard/sexmod/d3.b ()Z
            // 02a: ifne 039
            // 02d: goto 034
            // 030: invokestatic com/trolmastercard/sexmod/ap$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
            // 033: athrow
            // 034: return
            // 035: invokestatic com/trolmastercard/sexmod/ap$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
            // 038: athrow
            // 039: aload 2
            // 03a: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
            // 03d: getfield net/minecraft/world/World.field_72995_K Z
            // 040: ifne 0ab
            // 043: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
            // 046: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
            // 04b: astore 5
            // 04d: aload 5
            // 04f: invokeinterface java/util/Iterator.hasNext ()Z 1
            // 054: ifeq 0a6
            // 057: aload 5
            // 059: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
            // 05e: checkcast com/trolmastercard/sexmod/em
            // 061: astore 6
            // 063: aload 6
            // 065: getfield com/trolmastercard/sexmod/em.field_70128_L Z
            // 068: ifeq 072
            // 06b: goto 04d
            // 06e: invokestatic com/trolmastercard/sexmod/ap$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
            // 071: athrow
            // 072: aload 6
            // 074: instanceof com/trolmastercard/sexmod/ev
            // 077: ifne 081
            // 07a: goto 04d
            // 07d: invokestatic com/trolmastercard/sexmod/ap$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
            // 080: athrow
            // 081: aload 6
            // 083: checkcast com/trolmastercard/sexmod/ev
            // 086: astore 7
            // 088: aload 7
            // 08a: invokevirtual com/trolmastercard/sexmod/ev.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
            // 08d: getstatic com/trolmastercard/sexmod/ev.N Lnet/minecraft/network/datasync/DataParameter;
            // 090: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
            // 093: checkcast net/minecraft/item/ItemStack
            // 096: astore 8
            // 098: aload 4
            // 09a: aload 8
            // 09c: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
            // 09f: ifeq 0a3
            // 0a2: return
            // 0a3: goto 04d
            // 0a6: goto 0ab
            // 0a9: astore 5
            // 0ab: aload 4
            // 0ad: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
            // 0b0: getstatic com/trolmastercard/sexmod/ap.b Lcom/trolmastercard/sexmod/ap;
            // 0b3: if_acmpeq 0bb
            // 0b6: return
            // 0b7: invokestatic com/trolmastercard/sexmod/ap$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
            // 0ba: athrow
            // 0bb: aload 4
            // 0bd: invokevirtual net/minecraft/item/ItemStack.func_77978_p ()Lnet/minecraft/nbt/NBTTagCompound;
            // 0c0: astore 5
            // 0c2: aload 5
            // 0c4: ifnull 0de
            // 0c7: aload 5
            // 0c9: ldc "sexmodUses"
            // 0cb: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74762_e (Ljava/lang/String;)I
            // 0ce: bipush 3
            // 0cf: if_icmplt 0de
            // 0d2: goto 0d9
            // 0d5: invokestatic com/trolmastercard/sexmod/ap$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
            // 0d8: athrow
            // 0d9: return
            // 0da: invokestatic com/trolmastercard/sexmod/ap$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
            // 0dd: athrow
            // 0de: aload 2
            // 0df: invokevirtual net/minecraft/entity/player/EntityPlayer.getEntityData ()Lnet/minecraft/nbt/NBTTagCompound;
            // 0e2: astore 6
            // 0e4: aload 6
            // 0e6: ldc "sexmodAllieInUse"
            // 0e8: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74767_n (Ljava/lang/String;)Z
            // 0eb: istore 7
            // 0ed: iload 7
            // 0ef: ifeq 0f7
            // 0f2: return
            // 0f3: invokestatic com/trolmastercard/sexmod/ap$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
            // 0f6: athrow
            // 0f7: aload 6
            // 0f9: ldc "sexmodAllieInUse"
            // 0fb: bipush 1
            // 0fc: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74757_a (Ljava/lang/String;Z)V
            // 0ff: aload 6
            // 101: ldc "sexmodAllieInUseTicks"
            // 103: bipush 0
            // 104: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74768_a (Ljava/lang/String;I)V
            // 107: return
            // try (48 -> 52): 52 java/util/ConcurrentModificationException
            // try (42 -> 46): 46 java/util/ConcurrentModificationException
            // try (20 -> 26): 26 java/util/ConcurrentModificationException
            // try (16 -> 22): 23 java/util/ConcurrentModificationException
            // try (10 -> 14): 14 java/util/ConcurrentModificationException
            // try (32 -> 67): 70 java/util/ConcurrentModificationException
            // try (68 -> 69): 70 java/util/ConcurrentModificationException
            // try (71 -> 76): 76 java/util/ConcurrentModificationException
            // try (81 -> 88): 89 java/util/ConcurrentModificationException
            // try (83 -> 92): 92 java/util/ConcurrentModificationException
            // try (101 -> 104): 104 java/util/ConcurrentModificationException
        }

        private static ConcurrentModificationException a(ConcurrentModificationException var0) {
            return var0;
        }
    }
}
