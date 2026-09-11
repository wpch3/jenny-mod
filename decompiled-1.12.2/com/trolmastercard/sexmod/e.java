package com.trolmastercard.sexmod;

import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;

public class e extends Render<al> {
    static final ResourceLocation g = new ResourceLocation("sexmod", "textures/entity/pyrocinical/standing.png");
    static final ResourceLocation f = new ResourceLocation("sexmod", "textures/entity/pyrocinical/praising.png");
    static final ResourceLocation a = new ResourceLocation("sexmod", "textures/entity/pyrocinical/walking1.png");
    static final ResourceLocation b = new ResourceLocation("sexmod", "textures/entity/pyrocinical/walking2.png");
    static final String e = "textures/entity/pyrocinical/fat/";
    static final int j = 30;
    static final float c = 1.4F;
    static final float h = 0.75F;
    Minecraft d;
    ResourceLocation k = null;
    long i = 0L;

    public e(RenderManager var1) {
        super(var1);
        this.d = Minecraft.func_71410_x();
    }

    @Nullable
    protected ResourceLocation a(al var1) {
        return null;
    }

    public void a(al param1, double param2, double param4, double param6, float param8, float param9) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: sipush 2896
        // 003: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
        // 006: invokestatic net/minecraft/client/renderer/GlStateManager.func_179141_d ()V
        // 009: invokestatic net/minecraft/client/renderer/GlStateManager.func_179147_l ()V
        // 00c: getstatic net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        // 00f: getstatic net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        // 012: invokestatic net/minecraft/client/renderer/GlStateManager.func_187401_a (Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
        // 015: getstatic net/minecraft/client/renderer/OpenGlHelper.field_77476_b I
        // 018: ldc 240.0
        // 01a: ldc 240.0
        // 01c: invokestatic net/minecraft/client/renderer/OpenGlHelper.func_77475_a (IFF)V
        // 01f: aload 0
        // 020: getfield com/trolmastercard/sexmod/e.d Lnet/minecraft/client/Minecraft;
        // 023: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 026: astore 10
        // 028: new net/minecraft/util/math/Vec3d
        // 02b: dup
        // 02c: aload 1
        // 02d: getfield com/trolmastercard/sexmod/al.field_70142_S D
        // 030: aload 1
        // 031: getfield com/trolmastercard/sexmod/al.field_70137_T D
        // 034: aload 1
        // 035: getfield com/trolmastercard/sexmod/al.field_70136_U D
        // 038: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 03b: aload 1
        // 03c: invokevirtual com/trolmastercard/sexmod/al.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 03f: fload 9
        // 041: f2d
        // 042: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 045: astore 11
        // 047: new net/minecraft/util/math/Vec3d
        // 04a: dup
        // 04b: aload 10
        // 04d: getfield net/minecraft/entity/player/EntityPlayer.field_70142_S D
        // 050: aload 10
        // 052: getfield net/minecraft/entity/player/EntityPlayer.field_70137_T D
        // 055: aload 10
        // 057: getfield net/minecraft/entity/player/EntityPlayer.field_70136_U D
        // 05a: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 05d: aload 10
        // 05f: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 062: fload 9
        // 064: f2d
        // 065: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 068: astore 12
        // 06a: aload 11
        // 06c: aload 12
        // 06e: invokevirtual net/minecraft/util/math/Vec3d.func_178788_d (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 071: astore 13
        // 073: aload 0
        // 074: aload 1
        // 075: aload 13
        // 077: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 07a: invokestatic java/lang/Math.abs (D)D
        // 07d: aload 13
        // 07f: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 082: invokestatic java/lang/Math.abs (D)D
        // 085: dadd
        // 086: aload 13
        // 088: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 08b: invokestatic java/lang/Math.abs (D)D
        // 08e: dadd
        // 08f: invokevirtual com/trolmastercard/sexmod/e.a (Lcom/trolmastercard/sexmod/al;D)Lnet/minecraft/util/ResourceLocation;
        // 092: astore 14
        // 094: aload 0
        // 095: getfield com/trolmastercard/sexmod/e.d Lnet/minecraft/client/Minecraft;
        // 098: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
        // 09b: aload 14
        // 09d: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
        // 0a0: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 0a3: fconst_1
        // 0a4: fconst_1
        // 0a5: fconst_1
        // 0a6: aload 0
        // 0a7: aload 1
        // 0a8: fload 9
        // 0aa: invokevirtual com/trolmastercard/sexmod/e.b (Lcom/trolmastercard/sexmod/al;F)F
        // 0ad: invokestatic net/minecraft/client/renderer/GlStateManager.func_179131_c (FFFF)V
        // 0b0: aload 13
        // 0b2: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 0b5: aload 13
        // 0b7: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 0ba: aload 0
        // 0bb: aload 14
        // 0bd: invokevirtual com/trolmastercard/sexmod/e.a (Lnet/minecraft/util/ResourceLocation;)D
        // 0c0: dadd
        // 0c1: aload 13
        // 0c3: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 0c6: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 0c9: ldc 180.0
        // 0cb: aload 0
        // 0cc: getfield com/trolmastercard/sexmod/e.field_76990_c Lnet/minecraft/client/renderer/entity/RenderManager;
        // 0cf: getfield net/minecraft/client/renderer/entity/RenderManager.field_78735_i F
        // 0d2: fsub
        // 0d3: fconst_0
        // 0d4: fconst_1
        // 0d5: fconst_0
        // 0d6: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 0d9: ldc 1.4
        // 0db: aload 0
        // 0dc: aload 1
        // 0dd: fload 9
        // 0df: invokevirtual com/trolmastercard/sexmod/e.a (Lcom/trolmastercard/sexmod/al;F)F
        // 0e2: fadd
        // 0e3: fstore 15
        // 0e5: fload 15
        // 0e7: fload 15
        // 0e9: fload 15
        // 0eb: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
        // 0ee: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
        // 0f1: astore 16
        // 0f3: aload 16
        // 0f5: invokevirtual net/minecraft/client/renderer/Tessellator.func_178180_c ()Lnet/minecraft/client/renderer/BufferBuilder;
        // 0f8: astore 17
        // 0fa: aload 17
        // 0fc: bipush 7
        // 0fe: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181707_g Lnet/minecraft/client/renderer/vertex/VertexFormat;
        // 101: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
        // 104: aload 17
        // 106: ldc2_w -1.0
        // 109: dconst_0
        // 10a: dconst_0
        // 10b: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 10e: dconst_0
        // 10f: dconst_1
        // 110: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 113: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
        // 116: aload 17
        // 118: dconst_1
        // 119: dconst_0
        // 11a: dconst_0
        // 11b: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 11e: dconst_1
        // 11f: dconst_1
        // 120: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 123: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
        // 126: aload 17
        // 128: dconst_1
        // 129: ldc2_w 2.0
        // 12c: dconst_0
        // 12d: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 130: dconst_1
        // 131: dconst_0
        // 132: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 135: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
        // 138: aload 17
        // 13a: ldc2_w -1.0
        // 13d: ldc2_w 2.0
        // 140: dconst_0
        // 141: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 144: dconst_0
        // 145: dconst_0
        // 146: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 149: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
        // 14c: aload 16
        // 14e: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
        // 151: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 154: sipush 2896
        // 157: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
        // 15a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179118_c ()V
        // 15d: getstatic net/minecraft/client/renderer/OpenGlHelper.field_77476_b I
        // 160: getstatic net/minecraft/client/renderer/OpenGlHelper.lastBrightnessX F
        // 163: getstatic net/minecraft/client/renderer/OpenGlHelper.lastBrightnessY F
        // 166: invokestatic net/minecraft/client/renderer/OpenGlHelper.func_77475_a (IFF)V
        // 169: invokestatic java/lang/System.currentTimeMillis ()J
        // 16c: lstore 18
        // 16e: aload 0
        // 16f: getfield com/trolmastercard/sexmod/e.k Lnet/minecraft/util/ResourceLocation;
        // 172: getstatic com/trolmastercard/sexmod/e.f Lnet/minecraft/util/ResourceLocation;
        // 175: if_acmpeq 1ba
        // 178: aload 14
        // 17a: getstatic com/trolmastercard/sexmod/e.f Lnet/minecraft/util/ResourceLocation;
        // 17d: if_acmpne 1ba
        // 180: goto 187
        // 183: invokestatic com/trolmastercard/sexmod/e.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 186: athrow
        // 187: lload 18
        // 189: aload 0
        // 18a: getfield com/trolmastercard/sexmod/e.i J
        // 18d: ldc2_w 60000
        // 190: ladd
        // 191: lcmp
        // 192: ifle 1ba
        // 195: goto 19c
        // 198: invokestatic com/trolmastercard/sexmod/e.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 19b: athrow
        // 19c: aload 0
        // 19d: getfield com/trolmastercard/sexmod/e.d Lnet/minecraft/client/Minecraft;
        // 1a0: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1a3: getstatic com/trolmastercard/sexmod/c.MISC_PYRO [Lnet/minecraft/util/SoundEvent;
        // 1a6: bipush 0
        // 1a7: aaload
        // 1a8: fconst_1
        // 1a9: fconst_1
        // 1aa: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184185_a (Lnet/minecraft/util/SoundEvent;FF)V
        // 1ad: aload 0
        // 1ae: lload 18
        // 1b0: putfield com/trolmastercard/sexmod/e.i J
        // 1b3: goto 1ba
        // 1b6: invokestatic com/trolmastercard/sexmod/e.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1b9: athrow
        // 1ba: aload 0
        // 1bb: aload 14
        // 1bd: putfield com/trolmastercard/sexmod/e.k Lnet/minecraft/util/ResourceLocation;
        // 1c0: return
        // try (166 -> 173): 174 java/lang/RuntimeException
        // try (170 -> 183): 184 java/lang/RuntimeException
        // try (176 -> 198): 199 java/lang/RuntimeException
    }

    ResourceLocation a(al var1, double var2) {
        try {
            if (var1.a != -1) {
                return new ResourceLocation("sexmod", String.format("%s%s.png", "textures/entity/pyrocinical/fat/", this.b(var1)));
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        try {
            if (var2 < 3.0) {
                return f;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        Vec3d var4 = new Vec3d(var1.field_70142_S, var1.field_70137_T, var1.field_70136_U).func_178788_d(var1.func_174791_d());

        try {
            if (Math.abs(var4.field_72450_a) + Math.abs(var4.field_72448_b) + Math.abs(var4.field_72449_c) == 0.0) {
                return g;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        try {
            if (Math.sin(this.d.field_71439_g.field_70173_aa * 0.75F) > 0.0) {
                return a;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        return b;
    }

    double a(ResourceLocation param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/e.a Lnet/minecraft/util/ResourceLocation;
        // 03: aload 1
        // 04: invokevirtual net/minecraft/util/ResourceLocation.equals (Ljava/lang/Object;)Z
        // 07: ifne 21
        // 0a: getstatic com/trolmastercard/sexmod/e.b Lnet/minecraft/util/ResourceLocation;
        // 0d: aload 1
        // 0e: invokevirtual net/minecraft/util/ResourceLocation.equals (Ljava/lang/Object;)Z
        // 11: ifne 21
        // 14: goto 1b
        // 17: invokestatic com/trolmastercard/sexmod/e.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1a: athrow
        // 1b: dconst_0
        // 1c: dreturn
        // 1d: invokestatic com/trolmastercard/sexmod/e.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 20: athrow
        // 21: aload 0
        // 22: getfield com/trolmastercard/sexmod/e.d Lnet/minecraft/client/Minecraft;
        // 25: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 28: getfield net/minecraft/client/entity/EntityPlayerSP.field_70173_aa I
        // 2b: i2f
        // 2c: ldc 0.75
        // 2e: fmul
        // 2f: f2d
        // 30: invokestatic java/lang/Math.sin (D)D
        // 33: ldc2_w 0.10000000149011612
        // 36: dmul
        // 37: dreturn
        // try (0 -> 8): 9 java/lang/RuntimeException
        // try (4 -> 13): 13 java/lang/RuntimeException
    }

    int b(al var1) {
        try {
            if (var1.a == -1) {
                return 0;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        return (int)be.b(this.d.field_71439_g.field_70173_aa - var1.a, 1.0F, 30.0F);
    }

    float a(al var1, float var2) {
        try {
            if (var1.a == -1) {
                return 0.0F;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        int var3 = this.b(var1);

        try {
            if (var3 == 30) {
                return 1.0F;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        return (var3 + var2) / 30.0F;
    }

    float b(al var1, float var2) {
        try {
            if (var1.a == -1) {
                return 1.0F;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        try {
            if (this.d.field_71439_g.field_70173_aa - var1.a > 120) {
                return 0.0F;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        byte var3 = 90;
        float var4 = be.b(this.d.field_71439_g.field_70173_aa - var1.a, var3, 120.0F) - var3;
        float var5 = (var4 + var2) / 30.0F;
        return 1.0F - var5;
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
