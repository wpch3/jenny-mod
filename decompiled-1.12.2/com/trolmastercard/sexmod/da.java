package com.trolmastercard.sexmod;

import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class da extends d_<f_> implements c3 {
    public static final int D = 14;
    public static final HashSet<String> E = new HashSet<String>() {
        {
            this.add("static");
            this.add("turnable");
            this.add("slip");
            this.add("boobs");
            this.add("booty");
            this.add("vagina");
            this.add("fuckhole");
            this.add("futaBallLR");
            this.add("futaBallLL");
            this.add("coin");
            this.add("pentagram");
        }
    };
    public static final f7 y = new f7(0.0F, 0.0F, 0.0F);
    static final gv H = new gv(152, 45, 62, 255);
    static final gv I = new gv(84, 66, 88, 255);
    static final bm C = new bm(0.25F, 0.125F);
    static final bm x = new bm(0.375F, 0.125F);
    static final float F = 0.125F;
    static final ResourceLocation w = new ResourceLocation("sexmod", "textures/star.png");
    static final int v = 105;
    static final int A = 125;
    static final float B = 0.0296875F;
    static final float J = 0.06484375F;
    static final float z = 0.026124999F;
    static final float u = 0.0570625F;
    static final ef.b G = new ef.b(
        H,
        0.1F,
        12,
        0.035F,
        (var0, var1) -> (float)(Math.sin(var1 * 0.3 + -0.2 * var0) * 15.0),
        (var0, var1) -> (float)(Math.sin(var1 * -0.15 + -0.2 * var0) * 3.0),
        (var0, var1) -> 0.0F,
        0.03F,
        0.005F
    );
    static final ef.b t = new ef.b(
        H,
        0.0F,
        12,
        0.0F,
        (var0, var1) -> (float)(Math.sin(var1 * 0.3 + -0.2 * var0) * 15.0),
        (var0, var1) -> (float)(Math.sin(var1 * -0.15 + -0.2 * var0) * 3.0),
        (var0, var1) -> 0.0F,
        0.03F,
        0.005F
    );
    boolean r = false;
    float s = 0.0F;

    public da(RenderManager var1, AnimatedGeoModel var2, double var3) {
        super(var1, var2, var3);
    }

    @Nullable
    protected f7 a(f_ var1) {
        try {
            if (var1.field_70170_p instanceof gj) {
                return null;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        try {
            if (var1.bb) {
                return null;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        return y;
    }

    @Override
    public HashSet<String> a() {
        try {
            if (!this.r) {
                E.addAll(gx.a);
                E.addAll(dh.B);
                this.r = true;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return E;
    }

    @Override
    protected void b(Tessellator var1, BufferBuilder var2, em var3, f7 var4, float var5) {
        a(var1, var2, var3, var4, var5);
    }

    protected void b(f_ var1) {
        try {
            if (var1.y() != fp.MASTERBATE) {
                return;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        float var2 = var1.I();
        var1.field_70177_z = var2;
        var1.field_70760_ar = var2;
        var1.field_70761_aq = var2;
        var1.field_70758_at = var2;
        var1.field_70759_as = var2;
    }

    public void a(f_ var1, double var2, double var4, double var6, float var8, float var9) {
        Vec3d var10 = a(var1, var9);

        try {
            if (var10 != null) {
                var1.a(var10);
            }
        } catch (RuntimeException var12) {
            throw a(var12);
        }

        try {
            var1.aG = var10;
            f_.a(var1, var9);
            this.d(var1);
            this.c(var1);
            super.a(var1, var2, var4, var6, var8, var9);
            a((em)var1, var9);
            if (var1.b()) {
                dh.a((em)var1, var9);
            }
        } catch (RuntimeException var11) {
            throw a(var11);
        }
    }

    void c(f_ var1) {
        try {
            if (var1.y() != fp.RAPE_CHARGE) {
                return;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        var1.field_70761_aq = var1.I();
        var1.field_70760_ar = var1.field_70761_aq;
    }

    void d(f_ var1) {
        try {
            if (!(Boolean)var1.func_184212_Q().func_187225_a(f_.bP)) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        Vec3d var2 = new Vec3d(var1.field_70142_S, var1.field_70137_T, var1.field_70136_U);
        Vec3d var3 = var1.func_174791_d().func_178788_d(var2);

        boolean var10000;
        label35: {
            try {
                if (Math.abs(var3.field_72450_a) + Math.abs(var3.field_72449_c) < 0.05F) {
                    var10000 = true;
                    break label35;
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            var10000 = false;
        }

        boolean var4 = var10000;

        try {
            if (var4) {
                var1.field_70761_aq = this.s;
                var1.field_70760_ar = this.s;
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        float var5 = (float)(gc.b(Math.atan2(var3.field_72449_c, var3.field_72450_a)) - 90.0);
        var1.field_70761_aq = var5;
        var1.field_70760_ar = var5;
        this.s = var5;
    }

    @Nullable
    public static Vec3d a(f_ param0, float param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: invokevirtual com/trolmastercard/sexmod/f_.az ()I
        // 004: i2f
        // 005: fstore 2
        // 006: fload 2
        // 007: ldc -1.0
        // 009: fcmpl
        // 00a: ifne 021
        // 00d: aload 0
        // 00e: ldc2_w -1
        // 011: putfield com/trolmastercard/sexmod/f_.af J
        // 014: aload 0
        // 015: ldc2_w -1
        // 018: putfield com/trolmastercard/sexmod/f_.aH J
        // 01b: aconst_null
        // 01c: areturn
        // 01d: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 020: athrow
        // 021: aload 0
        // 022: invokevirtual com/trolmastercard/sexmod/f_.M ()Lnet/minecraft/entity/EntityLivingBase;
        // 025: astore 3
        // 026: aload 3
        // 027: ifnonnull 030
        // 02a: aconst_null
        // 02b: areturn
        // 02c: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 02f: athrow
        // 030: new net/minecraft/util/math/Vec3d
        // 033: dup
        // 034: aload 3
        // 035: getfield net/minecraft/entity/EntityLivingBase.field_70169_q D
        // 038: aload 3
        // 039: getfield net/minecraft/entity/EntityLivingBase.field_70167_r D
        // 03c: aload 3
        // 03d: getfield net/minecraft/entity/EntityLivingBase.field_70166_s D
        // 040: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 043: aload 3
        // 044: invokevirtual net/minecraft/entity/EntityLivingBase.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 047: fload 1
        // 048: f2d
        // 049: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 04c: astore 4
        // 04e: fload 2
        // 04f: ldc 24.0
        // 051: fcmpl
        // 052: ifne 087
        // 055: aload 0
        // 056: getfield com/trolmastercard/sexmod/f_.af J
        // 059: ldc2_w -1
        // 05c: lcmp
        // 05d: ifne 087
        // 060: goto 067
        // 063: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 066: athrow
        // 067: aload 0
        // 068: getstatic com/trolmastercard/sexmod/da.i Lnet/minecraft/client/Minecraft;
        // 06b: getfield net/minecraft/client/Minecraft.field_71441_e Lnet/minecraft/client/multiplayer/WorldClient;
        // 06e: invokevirtual net/minecraft/client/multiplayer/WorldClient.func_82737_E ()J
        // 071: putfield com/trolmastercard/sexmod/f_.af J
        // 074: aload 0
        // 075: aload 0
        // 076: getfield com/trolmastercard/sexmod/f_.af J
        // 079: ldc2_w 8
        // 07c: ladd
        // 07d: putfield com/trolmastercard/sexmod/f_.aH J
        // 080: goto 087
        // 083: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 086: athrow
        // 087: fload 2
        // 088: f2d
        // 089: ldc2_w 24.0
        // 08c: ldc2_w 32.0
        // 08f: invokestatic com/trolmastercard/sexmod/be.a (DDD)Z
        // 092: ifeq 0f3
        // 095: new net/minecraft/util/math/Vec3d
        // 098: dup
        // 099: dconst_0
        // 09a: dconst_0
        // 09b: ldc2_w 3.0
        // 09e: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 0a1: aload 0
        // 0a2: invokevirtual com/trolmastercard/sexmod/f_.I ()Ljava/lang/Float;
        // 0a5: invokevirtual java/lang/Float.floatValue ()F
        // 0a8: ldc 180.0
        // 0aa: fadd
        // 0ab: invokestatic com/trolmastercard/sexmod/ck.a (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 0ae: astore 5
        // 0b0: aload 0
        // 0b1: invokevirtual com/trolmastercard/sexmod/f_.B ()Lnet/minecraft/util/math/Vec3d;
        // 0b4: astore 6
        // 0b6: aload 4
        // 0b8: dconst_0
        // 0b9: aload 3
        // 0ba: invokevirtual net/minecraft/entity/EntityLivingBase.func_70047_e ()F
        // 0bd: f2d
        // 0be: dconst_0
        // 0bf: invokevirtual net/minecraft/util/math/Vec3d.func_72441_c (DDD)Lnet/minecraft/util/math/Vec3d;
        // 0c2: aload 5
        // 0c4: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 0c7: astore 7
        // 0c9: getstatic com/trolmastercard/sexmod/da.i Lnet/minecraft/client/Minecraft;
        // 0cc: getfield net/minecraft/client/Minecraft.field_71441_e Lnet/minecraft/client/multiplayer/WorldClient;
        // 0cf: invokevirtual net/minecraft/client/multiplayer/WorldClient.func_82737_E ()J
        // 0d2: l2f
        // 0d3: fload 1
        // 0d4: fadd
        // 0d5: aload 0
        // 0d6: getfield com/trolmastercard/sexmod/f_.af J
        // 0d9: l2f
        // 0da: fsub
        // 0db: aload 0
        // 0dc: getfield com/trolmastercard/sexmod/f_.aH J
        // 0df: aload 0
        // 0e0: getfield com/trolmastercard/sexmod/f_.af J
        // 0e3: lsub
        // 0e4: l2f
        // 0e5: fdiv
        // 0e6: fstore 8
        // 0e8: aload 6
        // 0ea: aload 7
        // 0ec: fload 8
        // 0ee: f2d
        // 0ef: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 0f2: areturn
        // 0f3: fload 2
        // 0f4: f2d
        // 0f5: ldc2_w 32.0
        // 0f8: ldc2_w 54.0
        // 0fb: invokestatic com/trolmastercard/sexmod/be.a (DDD)Z
        // 0fe: ifeq 124
        // 101: new net/minecraft/util/math/Vec3d
        // 104: dup
        // 105: dconst_0
        // 106: dconst_0
        // 107: ldc2_w 1.5
        // 10a: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 10d: aload 0
        // 10e: invokevirtual com/trolmastercard/sexmod/f_.I ()Ljava/lang/Float;
        // 111: invokevirtual java/lang/Float.floatValue ()F
        // 114: ldc 180.0
        // 116: fadd
        // 117: invokestatic com/trolmastercard/sexmod/ck.a (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 11a: astore 5
        // 11c: aload 4
        // 11e: aload 5
        // 120: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 123: areturn
        // 124: aconst_null
        // 125: areturn
        // try (4 -> 16): 16 java/lang/RuntimeException
        // try (21 -> 25): 25 java/lang/RuntimeException
        // try (42 -> 51): 52 java/lang/RuntimeException
        // try (46 -> 65): 66 java/lang/RuntimeException
    }

    public static void a(em var0, float var1) {
        EntityPlayerSP var2 = i.field_71439_g;

        try {
            if (var2 == null) {
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        Tessellator var3 = Tessellator.func_178181_a();
        BufferBuilder var4 = var3.func_178180_c();
        GlStateManager.func_179094_E();
        af.a(i, var0, var1);
        i.func_110434_K().func_110577_a(e);
        GlStateManager.func_179129_p();
        GlStateManager.func_179140_f();
        a(var0, var4, var3, b6.a(var0.field_70760_ar, var0.field_70761_aq, var1));
        b(var0, var4, var3, var1);
        a(var0, var4, var3);
        GlStateManager.func_179121_F();
        GlStateManager.func_179089_o();
        GlStateManager.func_179145_e();
    }

    static void b(em var0, BufferBuilder var1, Tessellator var2, float var3) {
        try {
            if (!(var0 instanceof f_)) {
                return;
            }
        } catch (RuntimeException var18) {
            throw a(var18);
        }

        try {
            if (!(Boolean)var0.func_184212_Q().func_187225_a(f_.bP)) {
                return;
            }
        } catch (RuntimeException var16) {
            throw a(var16);
        }

        try {
            if ((Boolean)var0.func_184212_Q().func_187225_a(f_.L)) {
                return;
            }
        } catch (RuntimeException var17) {
            throw a(var17);
        }

        GlStateManager.func_179094_E();
        Vec3d var4 = var0.b("stars");
        GlStateManager.func_179137_b(var4.field_72450_a, var4.field_72448_b, var4.field_72449_c);
        float var5 = (float)i.field_71441_e.func_82737_E() + var3;
        float var6 = (float)(Math.sin(var5 * 0.2) * 5.0);
        float var7 = (float)(Math.cos(var5 * 0.2) * 5.0);
        float var8 = (float)(var5 * 3.0);
        GlStateManager.func_179114_b(var6, 1.0F, 0.0F, 0.0F);
        GlStateManager.func_179114_b(var8, 0.0F, 1.0F, 0.0F);
        GlStateManager.func_179114_b(var7, 0.0F, 0.0F, 1.0F);
        float var9 = gc.c(9.0);
        f7 var10 = f_.aa;
        i.func_110434_K().func_110577_a(e);
        var1.func_181668_a(3, DefaultVertexFormats.field_181709_i);
        GlStateManager.func_187441_d(a(var0, var3, 1.0F, 3.0F));

        for (float var11 = 0.0F; var11 < Math.PI * 2; var11 += var9) {
            double var12 = Math.sin(var11) * 0.3F;
            double var14 = Math.cos(var11) * 0.3F;
            var1.func_181662_b(var12, 0.0, var14).func_187315_a(0.0, 0.0).func_181666_a(var10.a, var10.c, var10.b, 1.0F).func_181675_d();
        }

        var2.func_78381_a();
        i.func_110434_K().func_110577_a(w);
        var1.func_181668_a(7, DefaultVertexFormats.field_181709_i);
        var9 = gc.c(60.0);

        for (float var20 = 0.0F; var20 < Math.PI * 2; var20 += var9) {
            double var21 = Math.sin(var20) * 0.3F;
            double var22 = Math.cos(var20) * 0.3F;
            var1.func_181662_b(var21 - 0.1F, 0.1F, var22).func_187315_a(0.0, 0.0).func_181666_a(1.0F, 1.0F, 1.0F, 1.0F).func_181675_d();
            var1.func_181662_b(var21 + 0.1F, 0.1F, var22).func_187315_a(1.0, 0.0).func_181666_a(1.0F, 1.0F, 1.0F, 1.0F).func_181675_d();
            var1.func_181662_b(var21 + 0.1F, -0.1F, var22).func_187315_a(1.0, 1.0).func_181666_a(1.0F, 1.0F, 1.0F, 1.0F).func_181675_d();
            var1.func_181662_b(var21 - 0.1F, -0.1F, var22).func_187315_a(0.0, 1.0).func_181666_a(1.0F, 1.0F, 1.0F, 1.0F).func_181675_d();
        }

        var2.func_78381_a();
        GlStateManager.func_179121_F();
    }

    static void a(em param0, BufferBuilder param1, Tessellator param2, float param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 04: getstatic com/trolmastercard/sexmod/fp.GIVE_COIN Lcom/trolmastercard/sexmod/fp;
        // 07: if_acmpne 23
        // 0a: getstatic com/trolmastercard/sexmod/fp.GIVE_COIN Lcom/trolmastercard/sexmod/fp;
        // 0d: getfield com/trolmastercard/sexmod/fp.ticksPlaying [I
        // 10: bipush 1
        // 11: iaload
        // 12: bipush 100
        // 14: if_icmple 23
        // 17: goto 1e
        // 1a: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1d: athrow
        // 1e: return
        // 1f: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 22: athrow
        // 23: aload 1
        // 24: bipush 7
        // 26: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181709_i Lnet/minecraft/client/renderer/vertex/VertexFormat;
        // 29: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
        // 2c: aload 0
        // 2d: fload 3
        // 2e: ldc "hairStrandStartR"
        // 30: ldc "hairStrandMidR"
        // 32: ldc "hairStrandEndR"
        // 34: ldc 0.0296875
        // 36: ldc 0.06484375
        // 38: ldc 0.026124999
        // 3a: ldc 0.0570625
        // 3c: ldc "head"
        // 3e: invokestatic com/trolmastercard/sexmod/af.a (Lcom/trolmastercard/sexmod/em;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFLjava/lang/String;)[[Lnet/minecraft/util/math/Vec3d;
        // 41: astore 4
        // 43: aload 0
        // 44: fload 3
        // 45: ldc "hairStrandStartL"
        // 47: ldc "hairStrandMidL"
        // 49: ldc "hairStrandEndL"
        // 4b: ldc 0.0296875
        // 4d: ldc 0.06484375
        // 4f: ldc 0.026124999
        // 51: ldc 0.0570625
        // 53: ldc "head"
        // 55: invokestatic com/trolmastercard/sexmod/af.a (Lcom/trolmastercard/sexmod/em;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFLjava/lang/String;)[[Lnet/minecraft/util/math/Vec3d;
        // 58: astore 5
        // 5a: aload 1
        // 5b: aload 4
        // 5d: getstatic com/trolmastercard/sexmod/da.I Lcom/trolmastercard/sexmod/gv;
        // 60: invokestatic com/trolmastercard/sexmod/af.a (Lnet/minecraft/client/renderer/BufferBuilder;[[Lnet/minecraft/util/math/Vec3d;Lcom/trolmastercard/sexmod/gv;)V
        // 63: aload 1
        // 64: aload 5
        // 66: getstatic com/trolmastercard/sexmod/da.I Lcom/trolmastercard/sexmod/gv;
        // 69: invokestatic com/trolmastercard/sexmod/af.a (Lnet/minecraft/client/renderer/BufferBuilder;[[Lnet/minecraft/util/math/Vec3d;Lcom/trolmastercard/sexmod/gv;)V
        // 6c: aload 2
        // 6d: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
        // 70: return
        // try (0 -> 10): 11 java/lang/RuntimeException
        // try (4 -> 14): 14 java/lang/RuntimeException
    }

    static void a(em var0, BufferBuilder var1, Tessellator var2) {
        try {
            if (!((b7)var0).a()) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        i.func_110434_K().func_110577_a(cb.h);
        Vec3d[] var3 = new Vec3d[14];
        Vec3d[] var4 = new Vec3d[14];
        int var5 = 0;

        try {
            while (var5 < 14) {
                var3[var5] = var0.b("wingRV" + var5);
                var4[var5] = var0.b("wingLV" + var5);
                var5++;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        a(var1, var2, var3);
        a(var1, var2, var4);
    }

    static void a(BufferBuilder var0, Tessellator var1, Vec3d[] var2) {
        var0.func_181668_a(4, DefaultVertexFormats.field_181709_i);
        var0.func_181662_b(var2[0].field_72450_a, var2[0].field_72448_b, var2[0].field_72449_c)
            .func_187315_a(C.c, C.a)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[1].field_72450_a, var2[1].field_72448_b, var2[1].field_72449_c)
            .func_187315_a(C.c + 0.125F, C.a)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[2].field_72450_a, var2[2].field_72448_b, var2[2].field_72449_c)
            .func_187315_a(C.c + 0.125F, C.a + 0.125F)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[11].field_72450_a, var2[11].field_72448_b, var2[11].field_72449_c)
            .func_187315_a(C.c, C.a)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[12].field_72450_a, var2[12].field_72448_b, var2[12].field_72449_c)
            .func_187315_a(C.c + 0.125F, C.a)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[13].field_72450_a, var2[13].field_72448_b, var2[13].field_72449_c)
            .func_187315_a(C.c + 0.125F, C.a + 0.125F)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var1.func_78381_a();
        var0.func_181668_a(7, DefaultVertexFormats.field_181709_i);
        var0.func_181662_b(var2[3].field_72450_a, var2[3].field_72448_b, var2[3].field_72449_c)
            .func_187315_a(x.c, x.a + 0.125F)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[4].field_72450_a, var2[4].field_72448_b, var2[4].field_72449_c)
            .func_187315_a(x.c, x.a)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[5].field_72450_a, var2[5].field_72448_b, var2[5].field_72449_c)
            .func_187315_a(x.c + 0.125F, x.a)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[6].field_72450_a, var2[6].field_72448_b, var2[6].field_72449_c)
            .func_187315_a(x.c + 0.125F, x.a + 0.125F)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[7].field_72450_a, var2[7].field_72448_b, var2[7].field_72449_c)
            .func_187315_a(x.c, x.a + 0.125F)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[8].field_72450_a, var2[8].field_72448_b, var2[8].field_72449_c)
            .func_187315_a(x.c, x.a)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[9].field_72450_a, var2[9].field_72448_b, var2[9].field_72449_c)
            .func_187315_a(x.c + 0.125F, x.a)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var0.func_181662_b(var2[10].field_72450_a, var2[10].field_72448_b, var2[10].field_72449_c)
            .func_187315_a(x.c + 0.125F, x.a + 0.125F)
            .func_181669_b(255, 255, 255, 255)
            .func_181675_d();
        var1.func_78381_a();
    }

    protected void a(GeoModel var1, BufferBuilder var2, f_ var3, float var4, float var5, float var6, float var7, float var8) {
        GeoBone var9 = var1.topLevelBones.get(0);
        GeoBone var10 = null;
        GeoBone var11 = null;
        GeoBone var12 = null;
        GeoBone var13 = null;

        for (GeoBone var15 : var9.childBones) {
            String var16 = var15.getName();
            byte var17 = -1;

            label68: {
                label67: {
                    label66: {
                        label65: {
                            try {
                                switch (var16.hashCode()) {
                                    case 3029410:
                                        break;
                                    case 3059345:
                                        break label65;
                                    case 93911760:
                                        break label66;
                                    case 109761491:
                                        if (!var16.equals("steve")) {
                                            break label68;
                                        }
                                        break label67;
                                    default:
                                        break label68;
                                }
                            } catch (IOException var20) {
                                throw a(var20);
                            }

                            if (var16.equals("body")) {
                                var17 = 1;
                            }
                            break label68;
                        }

                        if (var16.equals("coin")) {
                            var17 = 2;
                        }
                        break label68;
                    }

                    if (var16.equals("body2")) {
                        var17 = 3;
                    }
                    break label68;
                }

                var17 = 0;
            }

            switch (var17) {
                case 0:
                    var12 = var15;
                    break;
                case 1:
                    var10 = var15;
                    break;
                case 2:
                    var11 = var15;
                    break;
                case 3:
                    var13 = var15;
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
        this.a(var2, var11, var3, var8);
        var2.func_181668_a(7, DefaultVertexFormats.field_181712_l);

        try {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.d(this.j));
        } catch (IOException var18) {
            var18.printStackTrace();
        }

        try {
            this.renderRecursively(var2, var12, var4, var5, var6, this.j.v());
            Tessellator.func_178181_a().func_78381_a();
            if (var13 != null) {
                var2.func_181668_a(7, DefaultVertexFormats.field_181712_l);
                Minecraft.func_71410_x().field_71446_o.func_110577_a(ce.j);
                this.renderRecursively(var2, var13, var4, var5, var6, this.j.v());
                Tessellator.func_178181_a().func_78381_a();
            }
        } catch (IOException var19) {
            throw a(var19);
        }

        MATRIX_STACK.pop();
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
        // 000: aload 2
        // 001: astore 4
        // 003: bipush -1
        // 004: istore 5
        // 006: aload 4
        // 008: invokevirtual java/lang/String.hashCode ()I
        // 00b: lookupswitch 357 14 -1304612943 224 -868095228 208 -791821796 192 -129402903 121 3002736 326 3002742 343 3198432 176 99151443 241 100470425 258 100470431 275 1358970225 292 1358970226 309 1851354257 144 1851354263 160
        // 084: aload 4
        // 086: ldc "hairBack"
        // 088: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 08b: ifeq 170
        // 08e: goto 095
        // 091: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 094: athrow
        // 095: bipush 0
        // 096: istore 5
        // 098: goto 170
        // 09b: aload 4
        // 09d: ldc "hairDownSideL"
        // 09f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 0a2: ifeq 170
        // 0a5: bipush 1
        // 0a6: istore 5
        // 0a8: goto 170
        // 0ab: aload 4
        // 0ad: ldc "hairDownSideR"
        // 0af: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 0b2: ifeq 170
        // 0b5: bipush 2
        // 0b6: istore 5
        // 0b8: goto 170
        // 0bb: aload 4
        // 0bd: ldc "head"
        // 0bf: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 0c2: ifeq 170
        // 0c5: bipush 3
        // 0c6: istore 5
        // 0c8: goto 170
        // 0cb: aload 4
        // 0cd: ldc "weapon"
        // 0cf: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 0d2: ifeq 170
        // 0d5: bipush 4
        // 0d6: istore 5
        // 0d8: goto 170
        // 0db: aload 4
        // 0dd: ldc "tongue"
        // 0df: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 0e2: ifeq 170
        // 0e5: bipush 5
        // 0e6: istore 5
        // 0e8: goto 170
        // 0eb: aload 4
        // 0ed: ldc "mangTongue"
        // 0ef: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 0f2: ifeq 170
        // 0f5: bipush 6
        // 0f7: istore 5
        // 0f9: goto 170
        // 0fc: aload 4
        // 0fe: ldc "head3"
        // 100: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 103: ifeq 170
        // 106: bipush 7
        // 108: istore 5
        // 10a: goto 170
        // 10d: aload 4
        // 10f: ldc "irisL"
        // 111: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 114: ifeq 170
        // 117: bipush 8
        // 119: istore 5
        // 11b: goto 170
        // 11e: aload 4
        // 120: ldc "irisR"
        // 122: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 125: ifeq 170
        // 128: bipush 9
        // 12a: istore 5
        // 12c: goto 170
        // 12f: aload 4
        // 131: ldc "irsisFaceR2"
        // 133: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 136: ifeq 170
        // 139: bipush 10
        // 13b: istore 5
        // 13d: goto 170
        // 140: aload 4
        // 142: ldc "irsisFaceR3"
        // 144: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 147: ifeq 170
        // 14a: bipush 11
        // 14c: istore 5
        // 14e: goto 170
        // 151: aload 4
        // 153: ldc "armL"
        // 155: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 158: ifeq 170
        // 15b: bipush 12
        // 15d: istore 5
        // 15f: goto 170
        // 162: aload 4
        // 164: ldc "armR"
        // 166: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 169: ifeq 170
        // 16c: bipush 13
        // 16e: istore 5
        // 170: iload 5
        // 172: tableswitch 807 0 13 70 184 184 290 511 644 653 662 670 670 678 678 686 686
        // 1b8: getstatic com/trolmastercard/sexmod/da.i Lnet/minecraft/client/Minecraft;
        // 1bb: invokevirtual net/minecraft/client/Minecraft.func_147113_T ()Z
        // 1be: ifeq 1cf
        // 1c1: goto 1c8
        // 1c4: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1c7: athrow
        // 1c8: goto 499
        // 1cb: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1ce: athrow
        // 1cf: aload 0
        // 1d0: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 1d3: checkcast com/trolmastercard/sexmod/f_
        // 1d6: invokevirtual com/trolmastercard/sexmod/f_.b ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 1d9: ldc "head"
        // 1db: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 1de: astore 6
        // 1e0: aload 6
        // 1e2: invokeinterface software/bernie/geckolib3/core/processor/IBone.getRotationX ()F 1
        // 1e7: invokestatic com/trolmastercard/sexmod/gc.d (F)F
        // 1ea: fstore 7
        // 1ec: fload 7
        // 1ee: fconst_0
        // 1ef: fcmpg
        // 1f0: ifge 204
        // 1f3: aload 3
        // 1f4: fload 7
        // 1f6: fneg
        // 1f7: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 1fa: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 1fd: goto 499
        // 200: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 203: athrow
        // 204: fconst_1
        // 205: fload 7
        // 207: ldc 45.0
        // 209: fdiv
        // 20a: invokestatic java/lang/Math.min (FF)F
        // 20d: fstore 8
        // 20f: aload 3
        // 210: fload 7
        // 212: fneg
        // 213: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 216: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 219: aload 3
        // 21a: aload 3
        // 21b: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getPositionY ()F
        // 21e: fload 8
        // 220: ldc 1.5
        // 222: fmul
        // 223: fadd
        // 224: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPositionY (F)V
        // 227: goto 499
        // 22a: getstatic com/trolmastercard/sexmod/da.i Lnet/minecraft/client/Minecraft;
        // 22d: invokevirtual net/minecraft/client/Minecraft.func_147113_T ()Z
        // 230: ifeq 23a
        // 233: goto 499
        // 236: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 239: athrow
        // 23a: aload 0
        // 23b: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 23e: checkcast com/trolmastercard/sexmod/f_
        // 241: invokevirtual com/trolmastercard/sexmod/f_.b ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 244: ldc "head"
        // 246: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 249: astore 6
        // 24b: aload 6
        // 24d: invokeinterface software/bernie/geckolib3/core/processor/IBone.getRotationX ()F 1
        // 252: invokestatic com/trolmastercard/sexmod/gc.d (F)F
        // 255: fstore 7
        // 257: fload 7
        // 259: fconst_0
        // 25a: fcmpg
        // 25b: ifge 271
        // 25e: aload 3
        // 25f: fload 7
        // 261: fneg
        // 262: fconst_2
        // 263: fdiv
        // 264: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 267: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 26a: goto 499
        // 26d: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 270: athrow
        // 271: fconst_1
        // 272: fload 7
        // 274: ldc 45.0
        // 276: fdiv
        // 277: invokestatic java/lang/Math.min (FF)F
        // 27a: fstore 8
        // 27c: aload 3
        // 27d: fload 7
        // 27f: fneg
        // 280: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 283: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 286: aload 3
        // 287: aload 3
        // 288: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getPositionY ()F
        // 28b: fload 8
        // 28d: fadd
        // 28e: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPositionY (F)V
        // 291: goto 499
        // 294: aload 0
        // 295: aload 3
        // 296: invokevirtual com/trolmastercard/sexmod/da.c (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 299: aload 0
        // 29a: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 29d: checkcast com/trolmastercard/sexmod/f_
        // 2a0: invokevirtual com/trolmastercard/sexmod/f_.y ()Lcom/trolmastercard/sexmod/fp;
        // 2a3: astore 8
        // 2a5: aload 8
        // 2a7: getstatic com/trolmastercard/sexmod/fp.FLY Lcom/trolmastercard/sexmod/fp;
        // 2aa: if_acmpeq 2c3
        // 2ad: aload 8
        // 2af: getstatic com/trolmastercard/sexmod/fp.ATTACK_SWORD Lcom/trolmastercard/sexmod/fp;
        // 2b2: if_acmpeq 2c3
        // 2b5: goto 2bc
        // 2b8: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2bb: athrow
        // 2bc: goto 499
        // 2bf: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2c2: athrow
        // 2c3: aload 0
        // 2c4: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 2c7: checkcast com/trolmastercard/sexmod/f_
        // 2ca: invokevirtual com/trolmastercard/sexmod/f_.M ()Lnet/minecraft/entity/EntityLivingBase;
        // 2cd: astore 9
        // 2cf: aload 9
        // 2d1: ifnonnull 2db
        // 2d4: goto 499
        // 2d7: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2da: athrow
        // 2db: getstatic com/trolmastercard/sexmod/da.i Lnet/minecraft/client/Minecraft;
        // 2de: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
        // 2e1: fstore 10
        // 2e3: new net/minecraft/util/math/Vec3d
        // 2e6: dup
        // 2e7: aload 0
        // 2e8: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 2eb: checkcast com/trolmastercard/sexmod/f_
        // 2ee: getfield com/trolmastercard/sexmod/f_.field_70142_S D
        // 2f1: aload 0
        // 2f2: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 2f5: checkcast com/trolmastercard/sexmod/f_
        // 2f8: getfield com/trolmastercard/sexmod/f_.field_70137_T D
        // 2fb: aload 0
        // 2fc: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 2ff: checkcast com/trolmastercard/sexmod/f_
        // 302: getfield com/trolmastercard/sexmod/f_.field_70136_U D
        // 305: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 308: aload 0
        // 309: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 30c: checkcast com/trolmastercard/sexmod/f_
        // 30f: invokevirtual com/trolmastercard/sexmod/f_.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 312: fload 10
        // 314: f2d
        // 315: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 318: astore 11
        // 31a: new net/minecraft/util/math/Vec3d
        // 31d: dup
        // 31e: aload 9
        // 320: getfield net/minecraft/entity/EntityLivingBase.field_70142_S D
        // 323: aload 9
        // 325: getfield net/minecraft/entity/EntityLivingBase.field_70137_T D
        // 328: aload 9
        // 32a: getfield net/minecraft/entity/EntityLivingBase.field_70136_U D
        // 32d: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 330: aload 0
        // 331: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 334: checkcast com/trolmastercard/sexmod/f_
        // 337: invokevirtual com/trolmastercard/sexmod/f_.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 33a: fload 10
        // 33c: f2d
        // 33d: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 340: astore 12
        // 342: aload 11
        // 344: aload 12
        // 346: invokevirtual net/minecraft/util/math/Vec3d.func_178788_d (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 349: astore 13
        // 34b: aload 13
        // 34d: aload 0
        // 34e: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 351: checkcast com/trolmastercard/sexmod/f_
        // 354: getfield com/trolmastercard/sexmod/f_.field_70761_aq F
        // 357: invokestatic com/trolmastercard/sexmod/ck.a (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 35a: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 35d: d2f
        // 35e: fstore 14
        // 360: aload 13
        // 362: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 365: fload 14
        // 367: f2d
        // 368: invokestatic java/lang/Math.atan2 (DD)D
        // 36b: d2f
        // 36c: fstore 7
        // 36e: goto 499
        // 371: aload 0
        // 372: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 375: checkcast com/trolmastercard/sexmod/f_
        // 378: getfield com/trolmastercard/sexmod/f_.ap Z
        // 37b: ifne 385
        // 37e: goto 499
        // 381: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 384: athrow
        // 385: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 388: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
        // 38b: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
        // 38e: getstatic com/trolmastercard/sexmod/da.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 391: aload 3
        // 392: invokestatic com/trolmastercard/sexmod/p.a (Lsoftware/bernie/geckolib3/util/MatrixStack;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 395: sipush 2896
        // 398: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
        // 39b: ldc2_w 1.5
        // 39e: dconst_1
        // 39f: ldc2_w 2.0
        // 3a2: invokestatic net/minecraft/client/renderer/GlStateManager.func_179139_a (DDD)V
        // 3a5: dconst_0
        // 3a6: dconst_0
        // 3a7: ldc2_w 0.05
        // 3aa: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 3ad: ldc 110.0
        // 3af: fconst_1
        // 3b0: fconst_0
        // 3b1: fconst_0
        // 3b2: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 3b5: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 3b8: invokevirtual net/minecraft/client/Minecraft.func_175597_ag ()Lnet/minecraft/client/renderer/ItemRenderer;
        // 3bb: aload 0
        // 3bc: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 3bf: new net/minecraft/item/ItemStack
        // 3c2: dup
        // 3c3: getstatic net/minecraft/init/Items.field_151040_l Lnet/minecraft/item/Item;
        // 3c6: invokespecial net/minecraft/item/ItemStack.<init> (Lnet/minecraft/item/Item;)V
        // 3c9: getstatic net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType.THIRD_PERSON_RIGHT_HAND Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;
        // 3cc: invokevirtual net/minecraft/client/renderer/ItemRenderer.func_178099_a (Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V
        // 3cf: aload 0
        // 3d0: aload 0
        // 3d1: aload 0
        // 3d2: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 3d5: invokevirtual com/trolmastercard/sexmod/da.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
        // 3d8: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
        // 3db: checkcast net/minecraft/util/ResourceLocation
        // 3de: invokevirtual com/trolmastercard/sexmod/da.func_110776_a (Lnet/minecraft/util/ResourceLocation;)V
        // 3e1: aload 1
        // 3e2: bipush 7
        // 3e4: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l Lnet/minecraft/client/renderer/vertex/VertexFormat;
        // 3e7: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
        // 3ea: sipush 2896
        // 3ed: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
        // 3f0: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 3f3: goto 499
        // 3f6: aload 0
        // 3f7: aload 1
        // 3f8: aload 3
        // 3f9: invokevirtual com/trolmastercard/sexmod/da.e (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 3fc: goto 499
        // 3ff: aload 0
        // 400: aload 1
        // 401: aload 3
        // 402: invokevirtual com/trolmastercard/sexmod/da.c (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 405: goto 499
        // 408: aload 0
        // 409: aload 3
        // 40a: invokevirtual com/trolmastercard/sexmod/da.d (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 40d: goto 499
        // 410: aload 0
        // 411: aload 3
        // 412: invokevirtual com/trolmastercard/sexmod/da.a (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 415: goto 499
        // 418: aload 0
        // 419: aload 3
        // 41a: invokevirtual com/trolmastercard/sexmod/da.b (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 41d: goto 499
        // 420: aload 0
        // 421: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 424: checkcast com/trolmastercard/sexmod/f_
        // 427: invokevirtual com/trolmastercard/sexmod/f_.y ()Lcom/trolmastercard/sexmod/fp;
        // 42a: getstatic com/trolmastercard/sexmod/fp.RAPE_CHARGE Lcom/trolmastercard/sexmod/fp;
        // 42d: if_acmpeq 437
        // 430: goto 499
        // 433: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 436: athrow
        // 437: aload 0
        // 438: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 43b: checkcast com/trolmastercard/sexmod/f_
        // 43e: invokevirtual com/trolmastercard/sexmod/f_.M ()Lnet/minecraft/entity/EntityLivingBase;
        // 441: astore 9
        // 443: aload 9
        // 445: ifnonnull 44f
        // 448: goto 499
        // 44b: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 44e: athrow
        // 44f: aload 0
        // 450: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 453: checkcast com/trolmastercard/sexmod/f_
        // 456: getfield com/trolmastercard/sexmod/f_.field_70761_aq F
        // 459: fstore 15
        // 45b: aload 9
        // 45d: invokevirtual net/minecraft/entity/EntityLivingBase.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 460: aload 0
        // 461: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 464: checkcast com/trolmastercard/sexmod/f_
        // 467: invokevirtual com/trolmastercard/sexmod/f_.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 46a: invokevirtual net/minecraft/util/math/Vec3d.func_178788_d (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 46d: astore 13
        // 46f: aload 13
        // 471: fload 15
        // 473: invokestatic com/trolmastercard/sexmod/ck.a (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 476: astore 13
        // 478: aload 13
        // 47a: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 47d: ldc2_w -1.0
        // 480: dconst_1
        // 481: invokestatic com/trolmastercard/sexmod/be.b (DDD)D
        // 484: dneg
        // 485: dstore 16
        // 487: aload 3
        // 488: aload 3
        // 489: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationZ ()F
        // 48c: ldc2_w 45.0
        // 48f: dload 16
        // 491: dmul
        // 492: invokestatic com/trolmastercard/sexmod/gc.c (D)F
        // 495: fadd
        // 496: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationZ (F)V
        // 499: aload 0
        // 49a: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 49d: checkcast com/trolmastercard/sexmod/f_
        // 4a0: invokevirtual com/trolmastercard/sexmod/f_.b ()Z
        // 4a3: ifeq 4b7
        // 4a6: aload 0
        // 4a7: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 4aa: aload 2
        // 4ab: aload 3
        // 4ac: bipush 1
        // 4ad: invokestatic com/trolmastercard/sexmod/dh.a (Lcom/trolmastercard/sexmod/em;Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
        // 4b0: goto 4b7
        // 4b3: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 4b6: athrow
        // 4b7: return
        // try (4 -> 11): 12 java/lang/RuntimeException
        // try (107 -> 112): 113 java/lang/RuntimeException
        // try (109 -> 116): 116 java/lang/RuntimeException
        // try (129 -> 139): 139 java/lang/RuntimeException
        // try (161 -> 165): 165 java/lang/RuntimeException
        // try (178 -> 190): 190 java/lang/RuntimeException
        // try (218 -> 224): 225 java/lang/RuntimeException
        // try (221 -> 228): 228 java/lang/RuntimeException
        // try (235 -> 238): 238 java/lang/RuntimeException
        // try (304 -> 310): 310 java/lang/RuntimeException
        // try (381 -> 388): 388 java/lang/RuntimeException
        // try (395 -> 398): 398 java/lang/RuntimeException
        // try (433 -> 444): 445 java/lang/RuntimeException
    }

    void e(BufferBuilder var1, GeoBone var2) {
        try {
            if (fp.a(this.j, fp.PUSSY_LICKING, fp.MASTERBATE_SITTING)) {
                this.f(var1, var2);
                return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        try {
            if (fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
                this.d(var1, var2);
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }
    }

    void c(BufferBuilder param1, GeoBone param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 04: bipush 1
        // 05: anewarray 170
        // 08: dup
        // 09: bipush 0
        // 0a: getstatic com/trolmastercard/sexmod/fp.MORNING_BLOWJOB_SLOW Lcom/trolmastercard/sexmod/fp;
        // 0d: aastore
        // 0e: invokestatic com/trolmastercard/sexmod/fp.a (Lcom/trolmastercard/sexmod/em;[Lcom/trolmastercard/sexmod/fp;)Z
        // 11: ifne 2d
        // 14: aload 0
        // 15: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 18: checkcast com/trolmastercard/sexmod/f_
        // 1b: getfield com/trolmastercard/sexmod/f_.aD Z
        // 1e: ifne 2d
        // 21: goto 28
        // 24: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 27: athrow
        // 28: return
        // 29: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2c: athrow
        // 2d: aload 0
        // 2e: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 31: checkcast com/trolmastercard/sexmod/f_
        // 34: getfield com/trolmastercard/sexmod/f_.aD Z
        // 37: ifeq 58
        // 3a: fconst_1
        // 3b: ldc 0.29
        // 3d: aload 0
        // 3e: getfield com/trolmastercard/sexmod/da.j Lcom/trolmastercard/sexmod/em;
        // 41: getstatic com/trolmastercard/sexmod/da.i Lnet/minecraft/client/Minecraft;
        // 44: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
        // 47: invokestatic com/trolmastercard/sexmod/fp.a (Lcom/trolmastercard/sexmod/em;F)F
        // 4a: invokestatic java/lang/Math.min (FF)F
        // 4d: ldc 0.29
        // 4f: fdiv
        // 50: fsub
        // 51: goto 59
        // 54: invokestatic com/trolmastercard/sexmod/da.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 57: athrow
        // 58: fconst_1
        // 59: fstore 3
        // 5a: aload 0
        // 5b: aload 1
        // 5c: aload 2
        // 5d: fload 3
        // 5e: invokevirtual com/trolmastercard/sexmod/da.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;F)V
        // 61: aload 0
        // 62: getstatic com/trolmastercard/sexmod/ce.j Lnet/minecraft/util/ResourceLocation;
        // 65: invokevirtual com/trolmastercard/sexmod/da.func_110776_a (Lnet/minecraft/util/ResourceLocation;)V
        // 68: return
        // try (0 -> 15): 16 java/lang/RuntimeException
        // try (10 -> 19): 19 java/lang/RuntimeException
        // try (21 -> 38): 38 java/lang/RuntimeException
    }

    void d(GeoBone var1) {
        try {
            if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW, fp.MORNING_BLOWJOB_FAST)) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (i.func_147113_T()) {
                return;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        float var2 = i.field_71439_g.field_70173_aa + i.func_184121_ak();
        float var3 = (float)(Math.sin(var2 * 0.1F) * 0.1F) + 0.2F;
        float var4 = (float)Math.sin(var2 * 0.1F) * 0.1F;

        try {
            if (fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
                var1.setRotationY(var1.getRotationY() + var3);
                var1.setRotationZ(var1.getRotationZ() + var4);
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        try {
            if (!this.j.aD) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        float var5 = 1.0F - Math.min(0.5F, fp.a(this.j, i.func_184121_ak())) / 0.5F;
        var1.setRotationY(var1.getRotationY() + var3 * var5);
        var1.setRotationZ(var1.getRotationZ() + var4 * var5);
    }

    void c(GeoBone var1) {
        try {
            if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW, fp.MORNING_BLOWJOB_FAST)) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (i.func_147113_T()) {
                return;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        float var2 = i.field_71439_g.field_70173_aa + i.func_184121_ak();
        float var3 = (float)Math.sin(var2 * -0.1F) * 0.1F;
        float var4 = (float)Math.sin(var2 * 0.1F) * 0.1F;

        try {
            if (fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
                var1.setRotationY(var1.getRotationY() + var3);
                var1.setRotationZ(var1.getRotationZ() + var4);
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        try {
            if (!this.j.aD) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        float var5 = Math.min(0.5F, fp.a(this.j, i.func_184121_ak())) / 0.5F;
        var1.setRotationY(var1.getRotationY() + var3 * var5);
        var1.setRotationZ(var1.getRotationZ() + var4 * var5);
    }

    void a(GeoBone var1) {
        try {
            if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
                return;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            if (i.func_147113_T()) {
                return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        float var2 = i.field_71439_g.field_70173_aa + i.func_184121_ak();
        var1.setPositionX((float)(var1.getPositionX() + Math.sin(var2 * 0.1F) * -0.1F));
    }

    void b(GeoBone var1) {
        try {
            if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
                return;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            if (i.func_147113_T()) {
                return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        float var2 = i.field_71439_g.field_70173_aa + i.func_184121_ak();
        var1.setPositionX((float)(var1.getPositionX() + Math.sin(var2 * 0.1F) * -0.15F));
    }

    void a(BufferBuilder var1, GeoBone var2, float var3) {
        float var4 = fp.d(this.j, i.func_184121_ak());
        float var5 = var3 * (float)(0.02F * (-0.4F * Math.cos((Math.PI * 2) * var4 + 1.05) + 0.6F));
        ef.b var6 = new ef.b(
            H,
            0.0F,
            12,
            var5,
            (var2x, var3x) -> var3 * (float)(Math.cos((Math.PI * 2) * var4 + 0.35F + -0.2F * var2x) * -10.0),
            (var0, var1x) -> 0.0F,
            (var2x, var3x) -> var3 * (float)(Math.cos((Math.PI * 2) * var4 + 1.25 + -0.1F * var2x) * -5.0),
            0.03F,
            0.005F
        );
        this.a(var1, var2, var6);
    }

    void d(BufferBuilder var1, GeoBone var2) {
        float var3 = fp.d(this.j, i.func_184121_ak());
        ef.b var4 = new ef.b(
            H,
            0.0F,
            12,
            0.02F,
            (var1x, var2x) -> (float)(Math.cos((Math.PI * 2) * var3 + -0.2F * var1x) * 15.0),
            (var1x, var2x) -> (float)(Math.cos((Math.PI * 2) * var3 + -0.2F * var1x) * 5.0),
            (var0, var1x) -> 0.0F,
            0.03F,
            0.005F
        );
        this.a(var1, var2, var4);
    }

    void f(BufferBuilder var1, GeoBone var2) {
        float var3 = this.j.b(i.func_184121_ak());

        try {
            if (var3 == 0.0F) {
                this.a(var1, var2, G);
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        try {
            if (var3 == 1.0F) {
                this.a(var1, var2, t);
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        ef.b var4 = G.a();
        var4.g = b6.a(G.g, 0.0F, var3);
        var4.e = b6.a(G.e, 0.0F, var3);
        this.a(var1, var2, var4);
    }

    void a(BufferBuilder var1, GeoBone var2, ef.b var3) {
        GlStateManager.func_179094_E();
        Tessellator.func_178181_a().func_78381_a();
        com.trolmastercard.sexmod.p.a(MATRIX_STACK, var2);
        GlStateManager.func_179129_p();
        this.func_110776_a(e);
        ef.a(var1, Tessellator.func_178181_a(), i, var3);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
        var1.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        GlStateManager.func_179089_o();
        GlStateManager.func_179121_F();
    }

    void a(BufferBuilder var1, GeoBone var2, f_ var3, float var4) {
        try {
            if (var3.y() != fp.GIVE_COIN) {
                return;
            }
        } catch (RuntimeException var14) {
            throw a(var14);
        }

        n = var1;
        var1.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        MATRIX_STACK.push();
        MATRIX_STACK.translate(var2);
        MATRIX_STACK.moveToPivot(var2);
        MATRIX_STACK.rotate(var2);
        MATRIX_STACK.scale(var2);
        MATRIX_STACK.moveBackFromPivot(var2);
        if (!this.p.contains(var2.getName())) {
            for (GeoCube var6 : var2.childCubes) {
                MATRIX_STACK.push();
                GlStateManager.func_179094_E();
                this.q = var2;
                this.a(var1, var6, 1.0F, 1.0F, 1.0F, 1.0F, (double)0.0);
                GlStateManager.func_179121_F();
                MATRIX_STACK.pop();
            }
        }

        Tessellator.func_178181_a().func_78381_a();
        GeoBone var15 = var2.childBones.get(0);
        var1.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        GL11.glDisable(2896);
        float var16 = be.b(fp.GIVE_COIN.ticksPlaying[1] + var4, 105.0F, 125.0F);
        float var7 = (var16 - 105.0F) / 20.0F;
        float var8 = b6.a(120.0F, 240.0F, var7);
        f7 var9 = b6.a(av.f, av.e, var7);
        float var10 = OpenGlHelper.lastBrightnessX;
        float var11 = OpenGlHelper.lastBrightnessY;
        OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, var8, var8);
        MATRIX_STACK.push();
        MATRIX_STACK.translate(var15);
        MATRIX_STACK.moveToPivot(var15);
        MATRIX_STACK.rotate(var15);
        MATRIX_STACK.scale(var15);
        MATRIX_STACK.moveBackFromPivot(var15);
        if (!this.p.contains(var15.getName())) {
            for (GeoCube var13 : var15.childCubes) {
                MATRIX_STACK.push();
                GlStateManager.func_179094_E();
                this.q = var15;
                this.a(var1, var13, var9.a, var9.c, var9.b, 1.0F, (double)0.0);
                GlStateManager.func_179121_F();
                MATRIX_STACK.pop();
            }
        }

        MATRIX_STACK.pop();
        MATRIX_STACK.pop();
        Tessellator.func_178181_a().func_78381_a();
        GL11.glEnable(2896);
        OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, var10, var11);
    }

    protected Vec3d a(f_ var1, float var2, Vec3d var3) {
        if (var1.y() == fp.RUN) {
            float var4 = var1.I();
            var1.field_70177_z = var4;
            var1.field_70760_ar = var4;
            var1.field_70761_aq = var4;
            var1.field_70758_at = var4;
            var1.field_70759_as = var4;
        }

        return var3;
    }

    private static Exception a(Exception var0) {
        return var0;
    }
}
