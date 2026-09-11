package com.trolmastercard.sexmod;

import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class dh extends d_<f8> {
    static final gv C = new gv(115, 108, 188, 255);
    static final f7 D = new f7(0.05F, 0.04F, 0.0F);
    static final f7 v = new f7(0.0F, 0.065F, 0.0F);
    static final f7 z = new f7(0.0F, 0.03F, 0.03F);
    static final gv r = new gv(63, 59, 150, 255);
    static final gv x = new gv(79, 74, 188, 255);
    static final float A = 0.5F;
    static final float w = 0.5F;
    static final int s = 40;
    static final float y = 0.01F;
    static final float t = 0.03F;
    public static final HashSet<String> B = new HashSet<String>() {
        {
            this.add("boobs2");
            this.add("booty2");
            this.add("vagina2");
            this.add("fuckhole2");
        }
    };
    boolean u = false;

    public dh(RenderManager var1, AnimatedGeoModel var2, double var3) {
        super(var1, var2, var3);
    }

    @Override
    public HashSet<String> a() {
        try {
            if (!this.u) {
                B.addAll(gx.a);
                this.u = true;
            }
        } catch (NumberFormatException var1) {
            throw a(var1);
        }

        return B;
    }

    public void a(f8 var1, double var2, double var4, double var6, float var8, float var9) {
        try {
            if (this.d(var1)) {
                return;
            }
        } catch (NumberFormatException var11) {
            throw a(var11);
        }

        try {
            if (this.a(var1)) {
                return;
            }
        } catch (NumberFormatException var13) {
            throw a(var13);
        }

        try {
            if (c(var1, 0.5F)) {
                return;
            }
        } catch (NumberFormatException var10) {
            throw a(var10);
        }

        try {
            if (this.c(var1)) {
                return;
            }
        } catch (NumberFormatException var12) {
            throw a(var12);
        }

        super.a(var1, var2, var4, var6, var8, var9);
        a(var1, var9);
    }

    boolean c(f8 var1) {
        f_ var2 = var1.a(false);

        try {
            if (var2 == null) {
                return false;
            }
        } catch (NumberFormatException var4) {
            throw a(var4);
        }

        try {
            switch (var2.y()) {
                case CONTROLLED_FLIGHT:
                case BOOST:
                    return true;
                default:
                    return false;
            }
        } catch (NumberFormatException var3) {
            throw a(var3);
        }
    }

    boolean a(f8 var1) {
        try {
            if (var1.y() != fp.RIDE_MOMMY_HEAD) {
                return false;
            }
        } catch (NumberFormatException var2) {
            throw a(var2);
        }

        try {
            if (var1.a(false) == null) {
                return true;
            }
        } catch (NumberFormatException var3) {
            throw a(var3);
        }

        return false;
    }

    boolean d(f8 var1) {
        f_ var2 = var1.a(false);

        try {
            if (var2 == null) {
                return false;
            }
        } catch (NumberFormatException var3) {
            throw a(var3);
        }

        try {
            if (var2.field_70128_L) {
                var1.a((UUID)null);
                return false;
            }
        } catch (NumberFormatException var4) {
            throw a(var4);
        }

        return var2.b();
    }

    public void func_76979_b(Entity var1, double var2, double var4, double var6, float var8, float var9) {
        try {
            if (!(var1 instanceof f8)) {
                super.func_76979_b(var1, var2, var4, var6, var8, var9);
                return;
            }
        } catch (NumberFormatException var13) {
            throw a(var13);
        }

        f8 var10 = (f8)var1;

        try {
            if (this.d(var10)) {
                return;
            }
        } catch (NumberFormatException var11) {
            throw a(var11);
        }

        try {
            if (var10.r()) {
                return;
            }
        } catch (NumberFormatException var12) {
            throw a(var12);
        }

        super.func_76979_b(var1, var2, var4, var6, var8, var9);
    }

    static boolean c(em var0, float var1) {
        try {
            if (!(var0 instanceof f8)) {
                return false;
            }
        } catch (NumberFormatException var5) {
            throw a(var5);
        }

        f_ var2 = ((f8)var0).a(false);

        try {
            if (var2 == null) {
                return false;
            }
        } catch (NumberFormatException var3) {
            throw a(var3);
        }

        try {
            if (var2.bm < var1) {
                return true;
            }
        } catch (NumberFormatException var4) {
            throw a(var4);
        }

        return false;
    }

    public static void a(em var0, float var1) {
        EntityPlayerSP var2 = i.field_71439_g;

        try {
            if (var2 == null) {
                return;
            }
        } catch (NumberFormatException var5) {
            throw a(var5);
        }

        try {
            if (c(var0, 0.5F)) {
                return;
            }
        } catch (NumberFormatException var7) {
            throw a(var7);
        }

        Tessellator var3 = Tessellator.func_178181_a();
        BufferBuilder var4 = var3.func_178180_c();

        label29: {
            try {
                GlStateManager.func_179094_E();
                if (var0.h()) {
                    GlStateManager.func_179137_b(0.0, 0.01, 0.0);
                    break label29;
                }
            } catch (NumberFormatException var6) {
                throw a(var6);
            }

            af.a(i, var0, var1);
            b(var0, var1);
        }

        i.func_110434_K().func_110577_a(e);
        GlStateManager.func_179129_p();
        GlStateManager.func_179140_f();
        a(var0, var4, var3, a((em)var0, var1));
        a(var0, var4, var3);
        GlStateManager.func_179121_F();
        GlStateManager.func_179089_o();
        GlStateManager.func_179145_e();
    }

    static void b(em var0, float var1) {
        try {
            if (!(var0 instanceof f8)) {
                return;
            }
        } catch (NumberFormatException var7) {
            throw a(var7);
        }

        f8 var2 = (f8)var0;

        try {
            if (!var2.r()) {
                return;
            }
        } catch (NumberFormatException var4) {
            throw a(var4);
        }

        try {
            if (ce.c(var2)) {
                return;
            }
        } catch (NumberFormatException var6) {
            throw a(var6);
        }

        f_ var3 = var2.a(false);

        try {
            if (var3 == null) {
                return;
            }
        } catch (NumberFormatException var5) {
            throw a(var5);
        }

        GlStateManager.func_179114_b(-b6.b(var0.field_70760_ar, var0.field_70761_aq, var1), 0.0F, 1.0F, 0.0F);
    }

    static boolean a(em var0) {
        if (var0 instanceof f_) {
            var0 = ((f_)var0).a(false);
        }

        try {
            if (var0 == null) {
                return false;
            }
        } catch (NumberFormatException var1) {
            throw a(var1);
        }

        try {
            if (!fp.a(var0, fp.THREESOME_SLOW, fp.THREESOME_FAST, fp.THREESOME_CUM)) {
                return true;
            }
        } catch (NumberFormatException var2) {
            throw a(var2);
        }

        return false;
    }

    static void a(em var0, BufferBuilder var1, Tessellator var2) {
        try {
            if (!a(var0)) {
                return;
            }
        } catch (NumberFormatException var5) {
            throw a(var5);
        }

        var1.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        int var3 = 0;

        try {
            while (var3 < 39) {
                a(var0, var1, var3, var3 + 1);
                var3++;
            }
        } catch (NumberFormatException var4) {
            throw a(var4);
        }

        a(var0, var1, 39, 0);
        var2.func_78381_a();
    }

    static void a(em var0, BufferBuilder var1, int var2, int var3) {
        Vec3d var4 = var0.b("skirt_" + var2 + "_0");
        Vec3d var5 = var0.b("skirt_" + var2 + "_1");
        Vec3d var6 = var0.b("skirt_" + var2 + "_2");
        Vec3d var7 = var0.b("skirt_" + var3 + "_0");
        Vec3d var8 = var0.b("skirt_" + var3 + "_1");
        Vec3d var9 = var0.b("skirt_" + var3 + "_2");

        gv var10000;
        label17: {
            try {
                if (var2 % 2 == 0) {
                    var10000 = x;
                    break label17;
                }
            } catch (NumberFormatException var11) {
                throw a(var11);
            }

            var10000 = r;
        }

        gv var10 = var10000;
        var1.func_181662_b(var4.field_72450_a, var4.field_72448_b, var4.field_72449_c).func_181669_b(var10.a, var10.d, var10.c, var10.b).func_181675_d();
        var1.func_181662_b(var5.field_72450_a, var5.field_72448_b, var5.field_72449_c).func_181669_b(var10.a, var10.d, var10.c, var10.b).func_181675_d();
        var1.func_181662_b(var8.field_72450_a, var8.field_72448_b, var8.field_72449_c).func_181669_b(var10.a, var10.d, var10.c, var10.b).func_181675_d();
        var1.func_181662_b(var7.field_72450_a, var7.field_72448_b, var7.field_72449_c).func_181669_b(var10.a, var10.d, var10.c, var10.b).func_181675_d();
        var1.func_181662_b(var5.field_72450_a, var5.field_72448_b, var5.field_72449_c).func_181669_b(var10.a, var10.d, var10.c, var10.b).func_181675_d();
        var1.func_181662_b(var8.field_72450_a, var8.field_72448_b, var8.field_72449_c).func_181669_b(var10.a, var10.d, var10.c, var10.b).func_181675_d();
        var1.func_181662_b(var9.field_72450_a, var9.field_72448_b, var9.field_72449_c).func_181669_b(var10.a, var10.d, var10.c, var10.b).func_181675_d();
        var1.func_181662_b(var6.field_72450_a, var6.field_72448_b, var6.field_72449_c).func_181669_b(var10.a, var10.d, var10.c, var10.b).func_181675_d();
    }

    @Override
    protected void a(BufferBuilder param1, String param2, GeoBone param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/dh.j Lcom/trolmastercard/sexmod/em;
        // 04: aload 2
        // 05: aload 3
        // 06: bipush 0
        // 07: invokestatic com/trolmastercard/sexmod/dh.a (Lcom/trolmastercard/sexmod/em;Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
        // 0a: aload 0
        // 0b: getfield com/trolmastercard/sexmod/dh.j Lcom/trolmastercard/sexmod/em;
        // 0e: checkcast com/trolmastercard/sexmod/f8
        // 11: invokevirtual com/trolmastercard/sexmod/f8.b ()Lnet/minecraft/entity/Entity;
        // 14: astore 4
        // 16: aload 4
        // 18: ifnonnull 20
        // 1b: return
        // 1c: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1f: athrow
        // 20: ldc "weapon"
        // 22: aload 2
        // 23: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 26: ifeq 53
        // 29: aload 0
        // 2a: getfield com/trolmastercard/sexmod/dh.j Lcom/trolmastercard/sexmod/em;
        // 2d: checkcast com/trolmastercard/sexmod/f8
        // 30: aload 4
        // 32: getstatic com/trolmastercard/sexmod/dh.i Lnet/minecraft/client/Minecraft;
        // 35: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
        // 38: invokevirtual com/trolmastercard/sexmod/f8.a (Lnet/minecraft/entity/Entity;F)Z
        // 3b: ifeq 53
        // 3e: goto 45
        // 41: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 44: athrow
        // 45: aload 0
        // 46: aload 1
        // 47: aload 3
        // 48: bipush 1
        // 49: invokevirtual com/trolmastercard/sexmod/dh.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
        // 4c: goto 53
        // 4f: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 52: athrow
        // 53: ldc "offhand"
        // 55: aload 2
        // 56: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 59: ifeq 86
        // 5c: aload 0
        // 5d: getfield com/trolmastercard/sexmod/dh.j Lcom/trolmastercard/sexmod/em;
        // 60: checkcast com/trolmastercard/sexmod/f8
        // 63: aload 4
        // 65: getstatic com/trolmastercard/sexmod/dh.i Lnet/minecraft/client/Minecraft;
        // 68: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
        // 6b: invokevirtual com/trolmastercard/sexmod/f8.a (Lnet/minecraft/entity/Entity;F)Z
        // 6e: ifne 86
        // 71: goto 78
        // 74: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 77: athrow
        // 78: aload 0
        // 79: aload 1
        // 7a: aload 3
        // 7b: bipush 0
        // 7c: invokevirtual com/trolmastercard/sexmod/dh.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
        // 7f: goto 86
        // 82: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 85: athrow
        // 86: return
        // try (11 -> 14): 14 java/lang/NumberFormatException
        // try (16 -> 28): 29 java/lang/NumberFormatException
        // try (20 -> 36): 37 java/lang/NumberFormatException
        // try (39 -> 51): 52 java/lang/NumberFormatException
        // try (43 -> 59): 60 java/lang/NumberFormatException
    }

    void a(BufferBuilder var1, GeoBone var2, boolean var3) {
        ItemRenderer var4 = Minecraft.func_71410_x().func_175597_ag();

        label22: {
            try {
                GlStateManager.func_179094_E();
                Tessellator.func_178181_a().func_78381_a();
                com.trolmastercard.sexmod.p.a(IGeoRenderer.MATRIX_STACK, var2);
                GL11.glEnable(2896);
                GlStateManager.func_179147_l();
                GlStateManager.func_187401_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
                if (var3) {
                    GlStateManager.func_179137_b(-0.01, 0.0, 0.0);
                    GlStateManager.func_179114_b(120.0F, 1.0F, 0.0F, 0.0F);
                    break label22;
                }
            } catch (NumberFormatException var8) {
                throw a(var8);
            }

            GlStateManager.func_179137_b(0.15, 0.0, -0.05);
            GlStateManager.func_179114_b(-140.0F, 1.0F, 0.0F, 0.0F);
        }

        GlStateManager.func_179139_a(0.7, 0.7, 0.7);
        ItemStack var5 = new ItemStack(Items.field_151031_f);
        float var6 = this.j.b(i.func_184121_ak());
        if (var6 < 1.0F) {
            float var7 = (float)b6.e(var6);
            this.j.d((int)(11.0F * (1.0F - var7) + 71980.0F));
            this.j.a(var5);
            this.j.func_184598_c(EnumHand.MAIN_HAND);
            this.j.W();
        } else {
            this.j.a(ItemStack.field_190927_a);
            this.j.K();
        }

        var4.func_178099_a(this.j, var5, TransformType.THIRD_PERSON_RIGHT_HAND);
        var1.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
        GL11.glDisable(2896);
        GlStateManager.func_179121_F();
        GlStateManager.func_179147_l();
        GlStateManager.func_187401_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
    }

    public static void a(em param0, String param1, GeoBone param2, boolean param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 1
        // 001: ldc "skirt_"
        // 003: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 006: ifne 00e
        // 009: return
        // 00a: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 00d: athrow
        // 00e: aload 1
        // 00f: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/String;)I
        // 012: istore 4
        // 014: iload 4
        // 016: i2d
        // 017: ldc2_w 17.0
        // 01a: ldc2_w 35.0
        // 01d: invokestatic com/trolmastercard/sexmod/be.a (DDD)Z
        // 020: ifeq 093
        // 023: getstatic com/trolmastercard/sexmod/dh.i Lnet/minecraft/client/Minecraft;
        // 026: invokevirtual net/minecraft/client/Minecraft.func_147113_T ()Z
        // 029: ifeq 038
        // 02c: goto 033
        // 02f: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 032: athrow
        // 033: return
        // 034: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 037: athrow
        // 038: iload 4
        // 03a: bipush 26
        // 03c: if_icmpge 048
        // 03f: ldc "cheekL"
        // 041: goto 04a
        // 044: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 047: athrow
        // 048: ldc "cheekR"
        // 04a: astore 5
        // 04c: iload 3
        // 04d: ifeq 066
        // 050: new java/lang/StringBuilder
        // 053: dup
        // 054: invokespecial java/lang/StringBuilder.<init> ()V
        // 057: aload 5
        // 059: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 05c: ldc "2"
        // 05e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 061: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 064: astore 5
        // 066: aload 0
        // 067: invokevirtual com/trolmastercard/sexmod/em.b ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 06a: aload 5
        // 06c: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 06f: invokeinterface software/bernie/geckolib3/core/processor/IBone.getRotationX ()F 1
        // 074: invokestatic com/trolmastercard/sexmod/gc.d (F)F
        // 077: fstore 6
        // 079: fload 6
        // 07b: fconst_0
        // 07c: fcmpg
        // 07d: ifge 085
        // 080: return
        // 081: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 084: athrow
        // 085: aload 2
        // 086: aload 2
        // 087: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getPositionY ()F
        // 08a: fload 6
        // 08c: ldc 0.01
        // 08e: fmul
        // 08f: fadd
        // 090: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPositionY (F)V
        // 093: iload 4
        // 095: i2d
        // 096: dconst_1
        // 097: ldc2_w 11.0
        // 09a: invokestatic com/trolmastercard/sexmod/be.a (DDD)Z
        // 09d: ifeq 117
        // 0a0: aload 1
        // 0a1: ldc "1"
        // 0a3: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
        // 0a6: ifne 0b5
        // 0a9: goto 0b0
        // 0ac: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0af: athrow
        // 0b0: return
        // 0b1: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0b4: athrow
        // 0b5: iload 4
        // 0b7: bipush 6
        // 0b9: if_icmpge 0c5
        // 0bc: ldc "legR"
        // 0be: goto 0c7
        // 0c1: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0c4: athrow
        // 0c5: ldc "legL"
        // 0c7: astore 5
        // 0c9: iload 3
        // 0ca: ifeq 0e3
        // 0cd: new java/lang/StringBuilder
        // 0d0: dup
        // 0d1: invokespecial java/lang/StringBuilder.<init> ()V
        // 0d4: aload 5
        // 0d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 0d9: ldc "2"
        // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 0de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 0e1: astore 5
        // 0e3: aload 0
        // 0e4: invokevirtual com/trolmastercard/sexmod/em.b ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 0e7: aload 5
        // 0e9: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 0ec: invokeinterface software/bernie/geckolib3/core/processor/IBone.getRotationX ()F 1
        // 0f1: invokestatic com/trolmastercard/sexmod/gc.d (F)F
        // 0f4: fstore 6
        // 0f6: fload 6
        // 0f8: fconst_0
        // 0f9: fcmpg
        // 0fa: ifge 102
        // 0fd: return
        // 0fe: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 101: athrow
        // 102: aload 2
        // 103: fload 6
        // 105: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 108: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 10b: aload 2
        // 10c: fload 6
        // 10e: ldc 0.03
        // 110: fmul
        // 111: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 114: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPositionY (F)V
        // 117: return
        // try (0 -> 5): 5 java/lang/NumberFormatException
        // try (10 -> 19): 20 java/lang/NumberFormatException
        // try (16 -> 23): 23 java/lang/NumberFormatException
        // try (25 -> 30): 30 java/lang/NumberFormatException
        // try (52 -> 57): 57 java/lang/NumberFormatException
        // try (67 -> 77): 78 java/lang/NumberFormatException
        // try (73 -> 81): 81 java/lang/NumberFormatException
        // try (83 -> 88): 88 java/lang/NumberFormatException
        // try (110 -> 115): 115 java/lang/NumberFormatException
    }

    static int a(String var0) {
        int var1 = var0.indexOf(95);
        int var2 = var0.indexOf(95, var1 + 1);

        try {
            if (var1 == -1 || var2 == -1) {
                return -1;
            }
        } catch (NumberFormatException var6) {
            throw a(var6);
        }

        String var3 = var0.substring(var1 + 1, var2);

        try {
            return Integer.parseInt(var3);
        } catch (NumberFormatException var5) {
            return -1;
        }
    }

    protected void a(GeoModel var1, BufferBuilder var2, f8 var3, float var4, float var5, float var6, float var7, float var8) {
        try {
            if (!ce.c(var3)) {
                super.a(var1, var2, var3, var4, var5, var6, var7, var8);
                return;
            }
        } catch (IOException var18) {
            throw a(var18);
        }

        GeoBone var9 = var1.topLevelBones.get(0);
        GeoBone var10 = null;
        GeoBone var11 = null;

        for (GeoBone var13 : var9.childBones) {
            String var14 = var13.getName();
            byte var15 = -1;

            label48: {
                label47: {
                    try {
                        switch (var14.hashCode()) {
                            case 93911760:
                                break;
                            case 109761491:
                                if (!var14.equals("steve")) {
                                    break label48;
                                }
                                break label47;
                            default:
                                break label48;
                        }
                    } catch (IOException var17) {
                        throw a(var17);
                    }

                    if (var14.equals("body2")) {
                        var15 = 1;
                    }
                    break label48;
                }

                var15 = 0;
            }

            switch (var15) {
                case 0:
                    var11 = var13;
                    break;
                case 1:
                    var10 = var13;
            }
        }

        MATRIX_STACK.push();
        MATRIX_STACK.translate(var9);
        MATRIX_STACK.moveToPivot(var9);
        MATRIX_STACK.rotate(var9);
        MATRIX_STACK.scale(var9);
        MATRIX_STACK.moveBackFromPivot(var9);
        this.renderRecursively(var2, var10, var4, var5, var6, var7);
        Tessellator.func_178181_a().func_78381_a();
        var2.func_181668_a(7, DefaultVertexFormats.field_181712_l);

        try {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.d(this.j));
        } catch (IOException var16) {
            var16.printStackTrace();
        }

        this.renderRecursively(var2, var11, var4, var5, var6, this.j.v());
        Tessellator.func_178181_a().func_78381_a();
        MATRIX_STACK.pop();
    }

    static void a(em var0, BufferBuilder var1, Tessellator var2, float var3) {
        var1.func_181668_a(7, DefaultVertexFormats.field_181709_i);
        Vec3d[][] var4 = af.a(var0, var3, "clothBoobLconStart", "clothBoobLconEnd", D, v);
        Vec3d[][] var5 = af.a(var0, var3, "clothBoobRconStart", "clothBoobRconEnd", D, v);
        Vec3d[][] var6 = af.a(var0, var3, "clothBoobMidconStart", "clothBoobMidconEnd", z, z);
        af.a(var1, var4, C);
        af.a(var1, var5, C);
        af.a(var1, var6, C);
        var2.func_78381_a();
    }

    @Override
    public boolean a(HashSet var1, GeoBone var2) {
        while (var2.parent != null) {
            String var3 = var2.getName();

            try {
                if (var3.contains("clothBoob")) {
                    return true;
                }
            } catch (NumberFormatException var6) {
                throw a(var6);
            }

            try {
                if (var1.contains(var3)) {
                    return false;
                }
            } catch (NumberFormatException var4) {
                throw a(var4);
            }

            try {
                if (var3.startsWith("armor")) {
                    return false;
                }
            } catch (NumberFormatException var5) {
                throw a(var5);
            }

            var2 = var2.parent;
        }

        return true;
    }

    protected Vec3d a(f8 var1, float var2, Vec3d var3) {
        if (var1.y() == fp.RUN) {
            float var6 = var1.I();
            var1.field_70177_z = var6;
            var1.field_70760_ar = var6;
            var1.field_70761_aq = var6;
            var1.field_70758_at = var6;
            var1.field_70759_as = var6;
            return var3;
        }

        if (b(var1)) {
            f_ var4 = var1.a(false);

            try {
                if (var4 != null) {
                    a(var4, var2, var1);
                    return b(var4, var2);
                }
            } catch (NumberFormatException var5) {
                throw a(var5);
            }
        }

        return var3;
    }

    public static void a(f_ var0, float var1, EntityLivingBase var2) {
        boolean var3 = var0.Q();

        float var10000;
        label35: {
            try {
                if (var3) {
                    var10000 = var0.I();
                    break label35;
                }
            } catch (NumberFormatException var8) {
                throw a(var8);
            }

            var10000 = var0.field_70759_as;
        }

        float var4 = var10000;

        label27: {
            try {
                if (var3) {
                    var10000 = var0.I();
                    break label27;
                }
            } catch (NumberFormatException var7) {
                throw a(var7);
            }

            var10000 = var0.field_70758_at;
        }

        float var5 = var10000;
        Float var6 = f_.a(var0, var1);
        if (var6 != null) {
            var4 = var6;
            var5 = var6;
        }

        var2.field_70177_z = var4;
        var2.field_70760_ar = var5;
        var2.field_70761_aq = var4;
        var2.field_70758_at = var5;
        var2.field_70759_as = var4;
    }

    public static boolean b(f8 param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/f8.r ()Z
        // 04: ifeq 1d
        // 07: aload 0
        // 08: invokestatic com/trolmastercard/sexmod/ce.c (Lcom/trolmastercard/sexmod/em;)Z
        // 0b: ifne 1d
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 14: athrow
        // 15: bipush 1
        // 16: goto 1e
        // 19: invokestatic com/trolmastercard/sexmod/dh.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1c: athrow
        // 1d: bipush 0
        // 1e: ireturn
        // try (0 -> 6): 7 java/lang/NumberFormatException
        // try (3 -> 11): 11 java/lang/NumberFormatException
    }

    public static Vec3d b(f_ var0, float var1) {
        return ak.a(var0, i.field_71439_g, var1).func_178787_e(var0.b("mangPos"));
    }

    public static Vec3d a(f_ var0, float var1) {
        return ak.a(var0, var1).func_178787_e(var0.b("mangPos"));
    }

    private static Exception a(Exception var0) {
        return var0;
    }
}
