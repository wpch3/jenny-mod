package com.trolmastercard.sexmod;

import java.util.Arrays;
import java.util.HashSet;
import javax.annotation.Nullable;
import javax.vecmath.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.Vec3i;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class dj extends d6<ff> {
    static final HashSet<String> t = new HashSet<>(
        Arrays.asList(
            "colorSpots",
            "neck",
            "head",
            "snout",
            "midSectionR",
            "midSectionL",
            "innerCheekLR",
            "innerCheekRR",
            "gayL",
            "gayR",
            "legR",
            "legL",
            "shinL",
            "toesL",
            "kneeL",
            "curvesL",
            "shinR",
            "toesR",
            "kneeR",
            "curvesR",
            "sideL",
            "sideR",
            "hip",
            "torsoL",
            "torsoR",
            "armR",
            "lowerArmR",
            "ellbowR",
            "armL",
            "lowerArmL",
            "ellbowL",
            "hornUL",
            "hornUR",
            "tail",
            "tail2",
            "tail3",
            "tail4",
            "tail5",
            "hornDL2",
            "hornDR2",
            "hornDR3M",
            "hornDL3M",
            "frecklesAL1",
            "frecklesAL2",
            "frecklesAR1",
            "frecklesAR2",
            "frecklesHL1",
            "frecklesHL2",
            "frecklesHR1",
            "frecklesHR2"
        )
    );
    static final HashSet<String> u = new HashSet<>(
        Arrays.asList(
            "boobR",
            "boobL",
            "frontNeck",
            "Rside",
            "Lside",
            "frontAndInside",
            "innerCheekLL",
            "innerCheekRL",
            "layer",
            "layer2",
            "down",
            "down2",
            "down3",
            "down4",
            "down5",
            "fuckhole",
            "hornDR3S",
            "hornDL3S",
            "assholeCoverUp",
            "assholeCoverUp2"
        )
    );
    Minecraft w = Minecraft.func_71410_x();
    Vector3f v;

    public dj(RenderManager var1, AnimatedGeoModel var2, double var3) {
        super(var1, var2, var3);
    }

    @Override
    protected Vec3i a(String param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/dj.j Lcom/trolmastercard/sexmod/em;
        // 04: checkcast com/trolmastercard/sexmod/ff
        // 07: invokevirtual com/trolmastercard/sexmod/ff.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 0a: astore 2
        // 0b: aload 2
        // 0c: getstatic com/trolmastercard/sexmod/ff.N Lnet/minecraft/network/datasync/DataParameter;
        // 0f: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 12: checkcast java/lang/String
        // 15: invokestatic com/trolmastercard/sexmod/EyeAndKoboldColor.valueOf (Ljava/lang/String;)Lcom/trolmastercard/sexmod/EyeAndKoboldColor;
        // 18: astore 3
        // 19: aload 2
        // 1a: getstatic com/trolmastercard/sexmod/ff.K Lnet/minecraft/network/datasync/DataParameter;
        // 1d: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 20: checkcast net/minecraft/util/math/BlockPos
        // 23: astore 4
        // 25: getstatic com/trolmastercard/sexmod/dj.t Ljava/util/HashSet;
        // 28: aload 1
        // 29: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 2c: ifeq 38
        // 2f: aload 3
        // 30: invokevirtual com/trolmastercard/sexmod/EyeAndKoboldColor.getMainColor ()Lnet/minecraft/util/math/Vec3i;
        // 33: areturn
        // 34: invokestatic com/trolmastercard/sexmod/dj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 37: athrow
        // 38: getstatic com/trolmastercard/sexmod/dj.u Ljava/util/HashSet;
        // 3b: aload 1
        // 3c: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 3f: ifeq 4b
        // 42: aload 3
        // 43: invokevirtual com/trolmastercard/sexmod/EyeAndKoboldColor.getSecondaryColor ()Lnet/minecraft/util/math/Vec3i;
        // 46: areturn
        // 47: invokestatic com/trolmastercard/sexmod/dj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4a: athrow
        // 4b: ldc "irisR"
        // 4d: aload 1
        // 4e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 51: ifne 64
        // 54: ldc "irisL"
        // 56: aload 1
        // 57: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 5a: ifeq 6b
        // 5d: goto 64
        // 60: invokestatic com/trolmastercard/sexmod/dj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 63: athrow
        // 64: aload 4
        // 66: areturn
        // 67: invokestatic com/trolmastercard/sexmod/dj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 6a: athrow
        // 6b: getstatic com/trolmastercard/sexmod/dj.r Lnet/minecraft/util/math/Vec3i;
        // 6e: areturn
        // try (16 -> 23): 23 java/lang/RuntimeException
        // try (25 -> 32): 32 java/lang/RuntimeException
        // try (34 -> 42): 43 java/lang/RuntimeException
        // try (38 -> 47): 47 java/lang/RuntimeException
    }

    @Override
    protected ItemStack a(@Nullable ItemStack param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/dj$a.a [I
        // 03: aload 0
        // 04: getfield com/trolmastercard/sexmod/dj.j Lcom/trolmastercard/sexmod/em;
        // 07: checkcast com/trolmastercard/sexmod/ff
        // 0a: invokevirtual com/trolmastercard/sexmod/ff.y ()Lcom/trolmastercard/sexmod/fp;
        // 0d: invokevirtual com/trolmastercard/sexmod/fp.ordinal ()I
        // 10: iaload
        // 11: tableswitch 136 1 3 27 85 125
        // 2c: aload 0
        // 2d: getfield com/trolmastercard/sexmod/dj.j Lcom/trolmastercard/sexmod/em;
        // 30: checkcast com/trolmastercard/sexmod/ff
        // 33: invokevirtual com/trolmastercard/sexmod/ff.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 36: getstatic com/trolmastercard/sexmod/ff.at Lnet/minecraft/network/datasync/DataParameter;
        // 39: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 3c: checkcast java/lang/Boolean
        // 3f: invokevirtual java/lang/Boolean.booleanValue ()Z
        // 42: ifeq 5b
        // 45: goto 4c
        // 48: invokestatic com/trolmastercard/sexmod/dj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4b: athrow
        // 4c: new net/minecraft/item/ItemStack
        // 4f: dup
        // 50: getstatic net/minecraft/init/Items.field_151036_c Lnet/minecraft/item/Item;
        // 53: invokespecial net/minecraft/item/ItemStack.<init> (Lnet/minecraft/item/Item;)V
        // 56: areturn
        // 57: invokestatic com/trolmastercard/sexmod/dj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 5a: athrow
        // 5b: new net/minecraft/item/ItemStack
        // 5e: dup
        // 5f: getstatic net/minecraft/init/Items.field_151035_b Lnet/minecraft/item/Item;
        // 62: invokespecial net/minecraft/item/ItemStack.<init> (Lnet/minecraft/item/Item;)V
        // 65: areturn
        // 66: aload 0
        // 67: getfield com/trolmastercard/sexmod/dj.j Lcom/trolmastercard/sexmod/em;
        // 6a: checkcast com/trolmastercard/sexmod/ff
        // 6d: invokevirtual com/trolmastercard/sexmod/ff.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 70: getstatic com/trolmastercard/sexmod/ff.aC Lnet/minecraft/network/datasync/DataParameter;
        // 73: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 76: checkcast java/lang/Boolean
        // 79: invokevirtual java/lang/Boolean.booleanValue ()Z
        // 7c: ifeq 99
        // 7f: new net/minecraft/item/ItemStack
        // 82: dup
        // 83: getstatic net/minecraft/init/Items.field_151040_l Lnet/minecraft/item/Item;
        // 86: invokespecial net/minecraft/item/ItemStack.<init> (Lnet/minecraft/item/Item;)V
        // 89: areturn
        // 8a: invokestatic com/trolmastercard/sexmod/dj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 8d: athrow
        // 8e: new net/minecraft/item/ItemStack
        // 91: dup
        // 92: getstatic net/minecraft/init/Items.field_151040_l Lnet/minecraft/item/Item;
        // 95: invokespecial net/minecraft/item/ItemStack.<init> (Lnet/minecraft/item/Item;)V
        // 98: areturn
        // 99: aload 1
        // 9a: areturn
        // try (0 -> 17): 18 java/lang/RuntimeException
        // try (8 -> 25): 25 java/lang/RuntimeException
        // try (32 -> 46): 46 java/lang/RuntimeException
    }

    @Override
    public void a(BufferBuilder var1, GeoBone var2, float var3, float var4, float var5, float var6, double var7) {
        try {
            if (this.j.field_70170_p instanceof gj) {
                return;
            }
        } catch (RuntimeException var12) {
            throw a(var12);
        }

        String var9 = var2.getName();
        if ("blowOpening".equals(var9)) {
            var7 = 0.0;
        }

        if ("mouth".equals(var9)) {
            String[] var10 = e4.a(this.j);
            int var11 = Integer.parseInt(var10[7]);
            if (var11 == 1) {
                var7 = -0.078125;
            }
        }

        super.a(var1, var2, var3, var4, var5, var6, var7);
    }

    @Override
    protected void d() {
        float var1 = 0.25F - (Float)this.j.func_184212_Q().func_187225_a(e7.aA);
        GlStateManager.func_179152_a(1.0F - var1, 1.0F - var1, 1.0F - var1);
    }

    @Override
    protected void b() {
        float var1 = 0.25F - (Float)this.j.func_184212_Q().func_187225_a(e7.aA);
        double var2 = 1.0 / (1.0 - var1);
        GlStateManager.func_179139_a(var2, var2, var2);
    }

    @Override
    protected ItemStack a() {
        String var1 = (String)this.j.func_184212_Q().func_187225_a(em.h);

        try {
            if ("STARTBLOWJOB".equals(var1)) {
                return new ItemStack(Items.field_151035_b);
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            return "ANAL_START".equals(var1) ? new ItemStack(Items.field_151043_k, 3) : null;
        } catch (RuntimeException var2) {
            throw a(var2);
        }
    }

    public void a(ff var1, double var2, double var4, double var6, float var8, float var9) {
        String var10 = (String)var1.func_184212_Q().func_187225_a(e4.N);

        try {
            if (var1.as == null) {
                var1.as = var10;
            }
        } catch (RuntimeException var11) {
            throw a(var11);
        }

        try {
            if (!var1.as.equals(var10)) {
                c();
                var1.as = var10;
            }
        } catch (RuntimeException var12) {
            throw a(var12);
        }

        this.v = new Vector3f((float)var2, (float)var4, (float)var6);
        super.a(var1, var2, var4, var6, var8, var9);
    }

    @Override
    protected void a(double var1, double var3, double var5) {
        EntityDataManager var7 = this.j.func_184212_Q();
        String var8 = (String)var7.func_187225_a(ff.aU);

        try {
            if ("null".equals(var8)) {
                super.a(var1, var3, var5);
                return;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        EyeAndKoboldColor var9 = EyeAndKoboldColor.valueOf((String)var7.func_187225_a(ff.N));
        var8 = var9.getTextColor() + " -" + var8 + "-";
        this.func_147906_a(this.j, this.j.ab() + var8, var1, var3 + this.j.i(), var5, 300);
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
