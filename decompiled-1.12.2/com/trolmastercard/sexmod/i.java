package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class i extends EntityLivingBase implements IAnimatable {
    static final int e = 12000;
    private final AnimationFactory d = new AnimationFactory(this);
    public UUID f = null;
    static AnimationController<i> a;
    public static final DataParameter<String> b = EntityDataManager.func_187226_a(i.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(115);
    public static final DataParameter<Integer> c = EntityDataManager.func_187226_a(i.class, DataSerializers.field_187192_b).func_187156_b().func_187161_a(116);

    public i(World var1) {
        super(var1);
        this.func_70105_a(0.5F, 0.5F);
    }

    protected void func_70088_a() {
        super.func_70088_a();
        this.field_70180_af.func_187214_a(b, ff.aJ.toString());
        this.field_70180_af.func_187214_a(c, 0);
    }

    public void func_70071_h_() {
        super.func_70071_h_();
        int var1 = (Integer)this.field_70180_af.func_187225_a(c);

        try {
            if (var1 >= 12000) {
                this.a();
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            if (!this.field_70170_p.field_72995_K) {
                this.field_70180_af.func_187227_b(c, var1 + 1);
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }
    }

    public boolean canTrample(World var1, Block var2, BlockPos var3, float var4) {
        return false;
    }

    public boolean func_70097_a(DamageSource var1, float var2) {
        boolean var3 = super.func_70097_a(var1, var2);

        try {
            if (!var3) {
                return false;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        this.func_70106_y();
        return true;
    }

    void a() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: bipush 0
        // 001: istore 1
        // 002: iload 1
        // 003: bipush 30
        // 005: if_icmpge 093
        // 008: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 00b: invokevirtual java/util/Random.nextBoolean ()Z
        // 00e: ifeq 020
        // 011: goto 018
        // 014: invokestatic com/trolmastercard/sexmod/i.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 017: athrow
        // 018: bipush 1
        // 019: goto 021
        // 01c: invokestatic com/trolmastercard/sexmod/i.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 01f: athrow
        // 020: bipush -1
        // 021: i2f
        // 022: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 025: invokevirtual java/util/Random.nextFloat ()F
        // 028: fmul
        // 029: fstore 2
        // 02a: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 02d: invokevirtual java/util/Random.nextBoolean ()Z
        // 030: ifeq 03b
        // 033: bipush 1
        // 034: goto 03c
        // 037: invokestatic com/trolmastercard/sexmod/i.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 03a: athrow
        // 03b: bipush -1
        // 03c: i2f
        // 03d: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 040: invokevirtual java/util/Random.nextFloat ()F
        // 043: fmul
        // 044: fstore 3
        // 045: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 048: invokevirtual java/util/Random.nextBoolean ()Z
        // 04b: ifeq 056
        // 04e: bipush 1
        // 04f: goto 057
        // 052: invokestatic com/trolmastercard/sexmod/i.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 055: athrow
        // 056: bipush -1
        // 057: i2f
        // 058: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 05b: invokevirtual java/util/Random.nextFloat ()F
        // 05e: fmul
        // 05f: fstore 4
        // 061: aload 0
        // 062: getfield com/trolmastercard/sexmod/i.field_70170_p Lnet/minecraft/world/World;
        // 065: getstatic net/minecraft/util/EnumParticleTypes.EXPLOSION_NORMAL Lnet/minecraft/util/EnumParticleTypes;
        // 068: ldc2_w 0.5
        // 06b: aload 0
        // 06c: getfield com/trolmastercard/sexmod/i.field_70165_t D
        // 06f: dadd
        // 070: ldc2_w 0.5
        // 073: aload 0
        // 074: getfield com/trolmastercard/sexmod/i.field_70163_u D
        // 077: dadd
        // 078: ldc2_w 0.5
        // 07b: aload 0
        // 07c: getfield com/trolmastercard/sexmod/i.field_70161_v D
        // 07f: dadd
        // 080: fload 2
        // 081: f2d
        // 082: fload 3
        // 083: f2d
        // 084: fload 4
        // 086: f2d
        // 087: bipush 0
        // 088: newarray 10
        // 08a: invokevirtual net/minecraft/world/World.func_175688_a (Lnet/minecraft/util/EnumParticleTypes;DDDDDD[I)V
        // 08d: iinc 1 1
        // 090: goto 002
        // 093: aload 0
        // 094: getfield com/trolmastercard/sexmod/i.field_70170_p Lnet/minecraft/world/World;
        // 097: getfield net/minecraft/world/World.field_72995_K Z
        // 09a: ifeq 0a2
        // 09d: return
        // 09e: invokestatic com/trolmastercard/sexmod/i.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a1: athrow
        // 0a2: aload 0
        // 0a3: getfield com/trolmastercard/sexmod/i.f Ljava/util/UUID;
        // 0a6: ifnonnull 0b7
        // 0a9: aload 0
        // 0aa: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 0ad: putfield com/trolmastercard/sexmod/i.f Ljava/util/UUID;
        // 0b0: goto 0b7
        // 0b3: invokestatic com/trolmastercard/sexmod/i.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b6: athrow
        // 0b7: aload 0
        // 0b8: getfield com/trolmastercard/sexmod/i.field_70170_p Lnet/minecraft/world/World;
        // 0bb: aload 0
        // 0bc: getfield com/trolmastercard/sexmod/i.f Ljava/util/UUID;
        // 0bf: invokestatic com/trolmastercard/sexmod/ff.a (Lnet/minecraft/world/World;Ljava/util/UUID;)Lcom/trolmastercard/sexmod/ff;
        // 0c2: astore 1
        // 0c3: aload 0
        // 0c4: getfield com/trolmastercard/sexmod/i.f Ljava/util/UUID;
        // 0c7: aload 1
        // 0c8: invokestatic com/trolmastercard/sexmod/ax.c (Ljava/util/UUID;Lcom/trolmastercard/sexmod/ff;)V
        // 0cb: aload 0
        // 0cc: getfield com/trolmastercard/sexmod/i.f Ljava/util/UUID;
        // 0cf: invokestatic com/trolmastercard/sexmod/ax.b (Ljava/util/UUID;)Ljava/util/UUID;
        // 0d2: astore 2
        // 0d3: aload 2
        // 0d4: ifnull 0ec
        // 0d7: aload 1
        // 0d8: invokevirtual com/trolmastercard/sexmod/ff.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 0db: getstatic com/trolmastercard/sexmod/em.v Lnet/minecraft/network/datasync/DataParameter;
        // 0de: aload 2
        // 0df: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
        // 0e2: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 0e5: goto 0ec
        // 0e8: invokestatic com/trolmastercard/sexmod/i.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0eb: athrow
        // 0ec: aload 0
        // 0ed: getfield com/trolmastercard/sexmod/i.f Ljava/util/UUID;
        // 0f0: invokestatic com/trolmastercard/sexmod/ax.n (Ljava/util/UUID;)Ljava/util/List;
        // 0f3: astore 3
        // 0f4: aconst_null
        // 0f5: astore 4
        // 0f7: aload 3
        // 0f8: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 0fd: astore 5
        // 0ff: aload 5
        // 101: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 106: ifeq 139
        // 109: aload 5
        // 10b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 110: checkcast com/trolmastercard/sexmod/ff
        // 113: astore 6
        // 115: aload 6
        // 117: invokevirtual com/trolmastercard/sexmod/ff.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 11a: getstatic com/trolmastercard/sexmod/ff.aU Lnet/minecraft/network/datasync/DataParameter;
        // 11d: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 120: checkcast java/lang/String
        // 123: astore 7
        // 125: ldc ""
        // 127: aload 7
        // 129: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 12c: ifne 136
        // 12f: aload 7
        // 131: astore 4
        // 133: goto 139
        // 136: goto 0ff
        // 139: aload 4
        // 13b: ifnull 151
        // 13e: aload 1
        // 13f: invokevirtual com/trolmastercard/sexmod/ff.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 142: getstatic com/trolmastercard/sexmod/ff.aU Lnet/minecraft/network/datasync/DataParameter;
        // 145: aload 4
        // 147: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 14a: goto 151
        // 14d: invokestatic com/trolmastercard/sexmod/i.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 150: athrow
        // 151: aload 1
        // 152: ldc2_w 0.5
        // 155: aload 0
        // 156: getfield com/trolmastercard/sexmod/i.field_70165_t D
        // 159: dadd
        // 15a: aload 0
        // 15b: getfield com/trolmastercard/sexmod/i.field_70163_u D
        // 15e: ldc2_w 0.5
        // 161: aload 0
        // 162: getfield com/trolmastercard/sexmod/i.field_70161_v D
        // 165: dadd
        // 166: invokevirtual com/trolmastercard/sexmod/ff.func_70107_b (DDD)V
        // 169: aload 0
        // 16a: getfield com/trolmastercard/sexmod/i.field_70170_p Lnet/minecraft/world/World;
        // 16d: aload 1
        // 16e: invokevirtual net/minecraft/world/World.func_72838_d (Lnet/minecraft/entity/Entity;)Z
        // 171: pop
        // 172: aload 0
        // 173: aload 1
        // 174: invokevirtual com/trolmastercard/sexmod/i.a (Lcom/trolmastercard/sexmod/ff;)V
        // 177: aload 0
        // 178: getfield com/trolmastercard/sexmod/i.field_70170_p Lnet/minecraft/world/World;
        // 17b: aconst_null
        // 17c: aload 0
        // 17d: invokevirtual com/trolmastercard/sexmod/i.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 180: getstatic net/minecraft/init/SoundEvents.field_187539_bB Lnet/minecraft/util/SoundEvent;
        // 183: getstatic net/minecraft/util/SoundCategory.BLOCKS Lnet/minecraft/util/SoundCategory;
        // 186: ldc 0.5
        // 188: fconst_1
        // 189: invokevirtual net/minecraft/world/World.func_184133_a (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;FF)V
        // 18c: aload 0
        // 18d: getfield com/trolmastercard/sexmod/i.field_70170_p Lnet/minecraft/world/World;
        // 190: aload 0
        // 191: invokevirtual net/minecraft/world/World.func_72900_e (Lnet/minecraft/entity/Entity;)V
        // 194: return
        // try (2 -> 8): 9 java/lang/RuntimeException
        // try (5 -> 13): 13 java/lang/RuntimeException
        // try (21 -> 26): 26 java/lang/RuntimeException
        // try (34 -> 39): 39 java/lang/RuntimeException
        // try (73 -> 78): 78 java/lang/RuntimeException
        // try (80 -> 86): 87 java/lang/RuntimeException
        // try (103 -> 111): 112 java/lang/RuntimeException
        // try (144 -> 151): 152 java/lang/RuntimeException
    }

    void a(ff var1) {
        EntityPlayer var2 = var1.z();

        try {
            if (var2 == null) {
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        EntityPlayerMP var3 = (EntityPlayerMP)var2;
        EyeAndKoboldColor var4 = ax.l(this.f);
        var2.func_145747_a(
            new TextComponentString(
                String.format(
                    "%s%s %shas become a %snew tribe member%s!", var4.getTextColor(), var1.c(), TextFormatting.WHITE, TextFormatting.RED, TextFormatting.WHITE
                )
            )
        );
        var3.field_71135_a
            .func_147359_a(
                new SPacketSoundEffect(
                    SoundEvents.field_187734_u, SoundCategory.NEUTRAL, var2.field_70165_t, var2.field_70163_u, var2.field_70161_v, 1.0F, 1.0F
                )
            );
        var3.field_71135_a
            .func_147359_a(
                new SPacketSoundEffect(
                    SoundEvents.field_187640_br, SoundCategory.NEUTRAL, var2.field_70165_t, var2.field_70163_u, var2.field_70161_v, 1.0F, 1.0F
                )
            );
    }

    @Override
    public void registerControllers(AnimationData var1) {
        a = new AnimationController<>(this, "controller", 5.0F, this::a);
        var1.addAnimationController(a);
    }

    @Override
    public AnimationFactory getFactory() {
        return this.d;
    }

    public void func_70014_b(NBTTagCompound var1) {
        try {
            if (this.f != null) {
                var1.func_74778_a("tribeID", this.f.toString());
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        var1.func_74778_a("egg_color", (String)this.field_70180_af.func_187225_a(b));
        var1.func_74768_a("eggAge", (Integer)this.field_70180_af.func_187225_a(c));
        super.func_70014_b(var1);
    }

    public void func_70037_a(NBTTagCompound var1) {
        super.func_70037_a(var1);
        String var2 = var1.func_74779_i("tribeID");

        try {
            if (!"".equals(var2)) {
                this.f = UUID.fromString(var2);
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        this.field_70180_af.func_187227_b(b, var1.func_74779_i("egg_color"));
        this.field_70180_af.func_187227_b(c, var1.func_74762_e("eggAge"));
    }

    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> var1) {
        int var2 = (Integer)this.field_70180_af.func_187225_a(c);

        try {
            if (12000 - var2 < 20) {
                var1.getController().setAnimation(new AnimationBuilder().addAnimation("animation.model.hatch", true));
                return PlayState.CONTINUE;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        float var3 = var2 / 12000.0F;

        try {
            if (var3 > 0.98) {
                var1.getController().setAnimation(new AnimationBuilder().addAnimation("animation.model.veryfast", true));
                return PlayState.CONTINUE;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        try {
            if (var3 > 0.85) {
                var1.getController().setAnimation(new AnimationBuilder().addAnimation("animation.model.fast", true));
                return PlayState.CONTINUE;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (var3 > 0.75) {
                var1.getController().setAnimation(new AnimationBuilder().addAnimation("animation.model.medium", true));
                return PlayState.CONTINUE;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        try {
            if (var3 > 0.5) {
                var1.getController().setAnimation(new AnimationBuilder().addAnimation("animation.model.slow", true));
                return PlayState.CONTINUE;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        return PlayState.CONTINUE;
    }

    public Iterable<ItemStack> func_184193_aE() {
        return new ArrayList<>();
    }

    public ItemStack func_184582_a(EntityEquipmentSlot var1) {
        return ItemStack.field_190927_a;
    }

    public void func_184201_a(EntityEquipmentSlot var1, ItemStack var2) {
    }

    public EnumHandSide func_184591_cq() {
        return EnumHandSide.LEFT;
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
