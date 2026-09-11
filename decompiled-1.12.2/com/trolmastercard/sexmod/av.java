package com.trolmastercard.sexmod;

import javax.vecmath.Vector4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.geo.render.built.GeoQuad;
import software.bernie.geckolib3.geo.render.built.GeoVertex;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class av extends GeoItemRenderer<cc> {
    public static final f7 e = new f7(0.84705883F, 0.11764706F, 0.35686275F);
    public static final f7 f = new f7(0.44705883F, 0.44705883F, 0.44705883F);
    public static final float b = 240.0F;
    public static final float g = 120.0F;
    static final float h = 0.05F;
    static final Minecraft a = Minecraft.func_71410_x();
    boolean c = false;
    f7 d;

    public av() {
        super(new as());
    }

    public void a(GeoModel var1, cc var2, float var3, float var4, float var5, float var6, float var7) {
        GlStateManager.func_179129_p();
        GlStateManager.func_179091_B();
        BufferBuilder var8 = Tessellator.func_178181_a().func_178180_c();
        var8.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        GeoBone var9 = null;
        this.c = false;
        GeoBone var10 = var1.topLevelBones.get(0);
        MATRIX_STACK.push();
        MATRIX_STACK.translate(var10);
        MATRIX_STACK.moveToPivot(var10);
        MATRIX_STACK.rotate(var10);
        MATRIX_STACK.scale(var10);
        MATRIX_STACK.moveBackFromPivot(var10);

        for (GeoBone var12 : var10.childBones) {
            if ("pentagram".equals(var12.getName())) {
                var9 = var12;
            } else {
                this.renderRecursively(var8, var12, var4, var5, var6, var7);
            }
        }

        Tessellator.func_178181_a().func_78381_a();
        float var14 = this.a(var3);

        try {
            this.d = this.a();
            if (!v.f) {
                OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, var14, var14);
                GL11.glDisable(2896);
            }
        } catch (RuntimeException var13) {
            throw a(var13);
        }

        var8.func_181668_a(7, DefaultVertexFormats.field_181709_i);
        this.c = true;
        this.renderRecursively(var8, var9, var4, var5, var6, var7);
        Tessellator.func_178181_a().func_78381_a();
        GL11.glEnable(2896);
        MATRIX_STACK.pop();
        GlStateManager.func_179101_C();
        GlStateManager.func_179089_o();
        GlStateManager.func_179117_G();
    }

    float a(float param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/av.a Lnet/minecraft/client/Minecraft;
        // 03: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 06: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184614_ca ()Lnet/minecraft/item/ItemStack;
        // 09: aload 0
        // 0a: getfield com/trolmastercard/sexmod/av.currentItemStack Lnet/minecraft/item/ItemStack;
        // 0d: if_acmpeq 31
        // 10: getstatic com/trolmastercard/sexmod/av.a Lnet/minecraft/client/Minecraft;
        // 13: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 16: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184592_cb ()Lnet/minecraft/item/ItemStack;
        // 19: aload 0
        // 1a: getfield com/trolmastercard/sexmod/av.currentItemStack Lnet/minecraft/item/ItemStack;
        // 1d: if_acmpeq 31
        // 20: goto 27
        // 23: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 26: athrow
        // 27: aload 0
        // 28: fload 1
        // 29: invokevirtual com/trolmastercard/sexmod/av.b (F)F
        // 2c: freturn
        // 2d: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 30: athrow
        // 31: invokestatic java/lang/System.currentTimeMillis ()J
        // 34: lstore 2
        // 35: getstatic com/trolmastercard/sexmod/av.a Lnet/minecraft/client/Minecraft;
        // 38: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 3b: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getEntityData ()Lnet/minecraft/nbt/NBTTagCompound;
        // 3e: astore 4
        // 40: aload 4
        // 42: ldc "sexmod:galath_coin_activation_time"
        // 44: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74763_f (Ljava/lang/String;)J
        // 47: lstore 5
        // 49: aload 4
        // 4b: ldc "sexmod:galath_coin_deactivation_time"
        // 4d: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74763_f (Ljava/lang/String;)J
        // 50: lstore 7
        // 52: lload 5
        // 54: lconst_0
        // 55: lcmp
        // 56: ifeq 66
        // 59: aload 0
        // 5a: lload 2
        // 5b: lload 5
        // 5d: fload 1
        // 5e: invokevirtual com/trolmastercard/sexmod/av.a (JJF)F
        // 61: freturn
        // 62: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 65: athrow
        // 66: lload 7
        // 68: lconst_0
        // 69: lcmp
        // 6a: ifeq 7a
        // 6d: aload 0
        // 6e: lload 2
        // 6f: lload 7
        // 71: fload 1
        // 72: invokevirtual com/trolmastercard/sexmod/av.b (JJF)F
        // 75: freturn
        // 76: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 79: athrow
        // 7a: getstatic com/trolmastercard/sexmod/v.f Z
        // 7d: ifeq 87
        // 80: ldc 120.0
        // 82: freturn
        // 83: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 86: athrow
        // 87: aload 0
        // 88: fload 1
        // 89: invokevirtual com/trolmastercard/sexmod/av.b (F)F
        // 8c: freturn
        // try (0 -> 12): 13 java/lang/RuntimeException
        // try (6 -> 19): 19 java/lang/RuntimeException
        // try (35 -> 45): 45 java/lang/RuntimeException
        // try (47 -> 57): 57 java/lang/RuntimeException
        // try (59 -> 63): 63 java/lang/RuntimeException
    }

    float b(long var1, long var3, float var5) {
        float var6 = (float)(var1 - var3);

        try {
            if (var6 < 1000.0F) {
                return 120.0F;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        try {
            return var6 <= 3000.0F ? b6.a(120.0F, 240.0F, (var6 - 1000.0F) / 2000.0F) : 240.0F;
        } catch (RuntimeException var7) {
            throw a(var7);
        }
    }

    float a(long var1, long var3, float var5) {
        float var6 = (float)(var1 - var3);

        try {
            if (var6 < 1000.0F) {
                return 240.0F;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        try {
            return var6 <= 3000.0F ? b6.a(240.0F, 120.0F, (var6 - 1000.0F) / 2000.0F) : 120.0F;
        } catch (RuntimeException var7) {
            throw a(var7);
        }
    }

    f7 a() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/av.a Lnet/minecraft/client/Minecraft;
        // 03: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 06: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184614_ca ()Lnet/minecraft/item/ItemStack;
        // 09: aload 0
        // 0a: getfield com/trolmastercard/sexmod/av.currentItemStack Lnet/minecraft/item/ItemStack;
        // 0d: if_acmpeq 2f
        // 10: getstatic com/trolmastercard/sexmod/av.a Lnet/minecraft/client/Minecraft;
        // 13: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 16: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184592_cb ()Lnet/minecraft/item/ItemStack;
        // 19: aload 0
        // 1a: getfield com/trolmastercard/sexmod/av.currentItemStack Lnet/minecraft/item/ItemStack;
        // 1d: if_acmpeq 2f
        // 20: goto 27
        // 23: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 26: athrow
        // 27: getstatic com/trolmastercard/sexmod/av.e Lcom/trolmastercard/sexmod/f7;
        // 2a: areturn
        // 2b: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2e: athrow
        // 2f: invokestatic java/lang/System.currentTimeMillis ()J
        // 32: lstore 1
        // 33: getstatic com/trolmastercard/sexmod/av.a Lnet/minecraft/client/Minecraft;
        // 36: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 39: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getEntityData ()Lnet/minecraft/nbt/NBTTagCompound;
        // 3c: astore 3
        // 3d: aload 3
        // 3e: ldc "sexmod:galath_coin_activation_time"
        // 40: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74763_f (Ljava/lang/String;)J
        // 43: lstore 4
        // 45: aload 3
        // 46: ldc "sexmod:galath_coin_deactivation_time"
        // 48: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74763_f (Ljava/lang/String;)J
        // 4b: lstore 6
        // 4d: lload 4
        // 4f: lconst_0
        // 50: lcmp
        // 51: ifeq 60
        // 54: aload 0
        // 55: lload 4
        // 57: lload 1
        // 58: invokevirtual com/trolmastercard/sexmod/av.b (JJ)Lcom/trolmastercard/sexmod/f7;
        // 5b: areturn
        // 5c: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 5f: athrow
        // 60: lload 6
        // 62: lconst_0
        // 63: lcmp
        // 64: ifeq 73
        // 67: aload 0
        // 68: lload 6
        // 6a: lload 1
        // 6b: invokevirtual com/trolmastercard/sexmod/av.a (JJ)Lcom/trolmastercard/sexmod/f7;
        // 6e: areturn
        // 6f: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 72: athrow
        // 73: getstatic com/trolmastercard/sexmod/v.f Z
        // 76: ifeq 81
        // 79: getstatic com/trolmastercard/sexmod/av.f Lcom/trolmastercard/sexmod/f7;
        // 7c: areturn
        // 7d: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 80: athrow
        // 81: getstatic com/trolmastercard/sexmod/av.e Lcom/trolmastercard/sexmod/f7;
        // 84: areturn
        // try (0 -> 12): 13 java/lang/RuntimeException
        // try (6 -> 17): 17 java/lang/RuntimeException
        // try (33 -> 42): 42 java/lang/RuntimeException
        // try (44 -> 53): 53 java/lang/RuntimeException
        // try (55 -> 59): 59 java/lang/RuntimeException
    }

    f7 a(long var1, long var3) {
        float var5 = (float)(var3 - var1);

        try {
            if (var5 < 1000.0F) {
                return f;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        try {
            if (var5 <= 3000.0F) {
                return b6.a(f, e, (var5 - 1000.0F) / 2000.0F);
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        return e;
    }

    f7 b(long var1, long var3) {
        float var5 = (float)(var3 - var1);

        try {
            if (var5 < 1000.0F) {
                return e;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        try {
            if (var5 <= 3000.0F) {
                return b6.a(e, f, (var5 - 1000.0F) / 2000.0F);
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        return f;
    }

    float b(float var1) {
        return (float)(60.0 * Math.sin((a.field_71439_g.field_70173_aa + var1) * 0.05F) + 180.0);
    }

    void a(BufferBuilder var1, GeoCube var2) {
        for (GeoQuad var6 : var2.quads) {
            try {
                if (var6 == null) {
                    continue;
                }
            } catch (RuntimeException var12) {
                throw a(var12);
            }

            for (GeoVertex var10 : var6.vertices) {
                Vector4f var11 = new Vector4f(var10.position.getX(), var10.position.getY(), var10.position.getZ(), 1.0F);
                MATRIX_STACK.getModelMatrix().transform(var11);
                var1.func_181662_b(var11.getX(), var11.getY(), var11.getZ())
                    .func_187315_a(var10.textureU, var10.textureV)
                    .func_181666_a(this.d.a, this.d.c, this.d.b, 1.0F)
                    .func_181675_d();
            }
        }
    }

    @Override
    public void renderCube(BufferBuilder param1, GeoCube param2, float param3, float param4, float param5, float param6) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: getstatic com/trolmastercard/sexmod/av.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 003: aload 2
        // 004: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 007: getstatic com/trolmastercard/sexmod/av.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 00a: aload 2
        // 00b: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 00e: getstatic com/trolmastercard/sexmod/av.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 011: aload 2
        // 012: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 015: aload 0
        // 016: getfield com/trolmastercard/sexmod/av.c Z
        // 019: ifeq 027
        // 01c: aload 0
        // 01d: aload 1
        // 01e: aload 2
        // 01f: invokevirtual com/trolmastercard/sexmod/av.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 022: return
        // 023: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 026: athrow
        // 027: aload 2
        // 028: getfield software/bernie/geckolib3/geo/render/built/GeoCube.quads [Lsoftware/bernie/geckolib3/geo/render/built/GeoQuad;
        // 02b: astore 7
        // 02d: aload 7
        // 02f: arraylength
        // 030: istore 8
        // 032: bipush 0
        // 033: istore 9
        // 035: iload 9
        // 037: iload 8
        // 039: if_icmpge 1e1
        // 03c: aload 7
        // 03e: iload 9
        // 040: aaload
        // 041: astore 10
        // 043: aload 10
        // 045: ifnonnull 04f
        // 048: goto 1db
        // 04b: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 04e: athrow
        // 04f: new javax/vecmath/Vector3f
        // 052: dup
        // 053: aload 10
        // 055: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 058: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 05b: i2f
        // 05c: aload 10
        // 05e: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 061: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
        // 064: i2f
        // 065: aload 10
        // 067: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 06a: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 06d: i2f
        // 06e: invokespecial javax/vecmath/Vector3f.<init> (FFF)V
        // 071: astore 11
        // 073: getstatic com/trolmastercard/sexmod/av.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 076: invokevirtual software/bernie/geckolib3/util/MatrixStack.getNormalMatrix ()Ljavax/vecmath/Matrix3f;
        // 079: aload 11
        // 07b: invokevirtual javax/vecmath/Matrix3f.transform (Ljavax/vecmath/Tuple3f;)V
        // 07e: aload 2
        // 07f: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 082: getfield javax/vecmath/Vector3f.y F
        // 085: fconst_0
        // 086: fcmpl
        // 087: ifeq 09d
        // 08a: aload 2
        // 08b: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 08e: getfield javax/vecmath/Vector3f.z F
        // 091: fconst_0
        // 092: fcmpl
        // 093: ifne 0c1
        // 096: goto 09d
        // 099: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 09c: athrow
        // 09d: aload 11
        // 09f: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 0a2: fconst_0
        // 0a3: fcmpg
        // 0a4: ifge 0c1
        // 0a7: goto 0ae
        // 0aa: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ad: athrow
        // 0ae: aload 11
        // 0b0: dup
        // 0b1: getfield javax/vecmath/Vector3f.x F
        // 0b4: ldc -1.0
        // 0b6: fmul
        // 0b7: putfield javax/vecmath/Vector3f.x F
        // 0ba: goto 0c1
        // 0bd: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0c0: athrow
        // 0c1: aload 2
        // 0c2: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 0c5: getfield javax/vecmath/Vector3f.x F
        // 0c8: fconst_0
        // 0c9: fcmpl
        // 0ca: ifeq 0e0
        // 0cd: aload 2
        // 0ce: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 0d1: getfield javax/vecmath/Vector3f.z F
        // 0d4: fconst_0
        // 0d5: fcmpl
        // 0d6: ifne 104
        // 0d9: goto 0e0
        // 0dc: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0df: athrow
        // 0e0: aload 11
        // 0e2: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 0e5: fconst_0
        // 0e6: fcmpg
        // 0e7: ifge 104
        // 0ea: goto 0f1
        // 0ed: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0f0: athrow
        // 0f1: aload 11
        // 0f3: dup
        // 0f4: getfield javax/vecmath/Vector3f.y F
        // 0f7: ldc -1.0
        // 0f9: fmul
        // 0fa: putfield javax/vecmath/Vector3f.y F
        // 0fd: goto 104
        // 100: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 103: athrow
        // 104: aload 2
        // 105: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 108: getfield javax/vecmath/Vector3f.x F
        // 10b: fconst_0
        // 10c: fcmpl
        // 10d: ifeq 123
        // 110: aload 2
        // 111: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 114: getfield javax/vecmath/Vector3f.y F
        // 117: fconst_0
        // 118: fcmpl
        // 119: ifne 147
        // 11c: goto 123
        // 11f: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 122: athrow
        // 123: aload 11
        // 125: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 128: fconst_0
        // 129: fcmpg
        // 12a: ifge 147
        // 12d: goto 134
        // 130: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 133: athrow
        // 134: aload 11
        // 136: dup
        // 137: getfield javax/vecmath/Vector3f.z F
        // 13a: ldc -1.0
        // 13c: fmul
        // 13d: putfield javax/vecmath/Vector3f.z F
        // 140: goto 147
        // 143: invokestatic com/trolmastercard/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 146: athrow
        // 147: aload 10
        // 149: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.vertices [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
        // 14c: astore 12
        // 14e: aload 12
        // 150: arraylength
        // 151: istore 13
        // 153: bipush 0
        // 154: istore 14
        // 156: iload 14
        // 158: iload 13
        // 15a: if_icmpge 1db
        // 15d: aload 12
        // 15f: iload 14
        // 161: aaload
        // 162: astore 15
        // 164: new javax/vecmath/Vector4f
        // 167: dup
        // 168: aload 15
        // 16a: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 16d: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 170: aload 15
        // 172: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 175: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 178: aload 15
        // 17a: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 17d: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 180: fconst_1
        // 181: invokespecial javax/vecmath/Vector4f.<init> (FFFF)V
        // 184: astore 16
        // 186: getstatic com/trolmastercard/sexmod/av.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 189: invokevirtual software/bernie/geckolib3/util/MatrixStack.getModelMatrix ()Ljavax/vecmath/Matrix4f;
        // 18c: aload 16
        // 18e: invokevirtual javax/vecmath/Matrix4f.transform (Ljavax/vecmath/Tuple4f;)V
        // 191: aload 1
        // 192: aload 16
        // 194: invokevirtual javax/vecmath/Vector4f.getX ()F
        // 197: f2d
        // 198: aload 16
        // 19a: invokevirtual javax/vecmath/Vector4f.getY ()F
        // 19d: f2d
        // 19e: aload 16
        // 1a0: invokevirtual javax/vecmath/Vector4f.getZ ()F
        // 1a3: f2d
        // 1a4: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1a7: aload 15
        // 1a9: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureU F
        // 1ac: f2d
        // 1ad: aload 15
        // 1af: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureV F
        // 1b2: f2d
        // 1b3: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1b6: fload 3
        // 1b7: fload 4
        // 1b9: fload 5
        // 1bb: fload 6
        // 1bd: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181666_a (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1c0: aload 11
        // 1c2: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 1c5: aload 11
        // 1c7: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 1ca: aload 11
        // 1cc: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 1cf: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1d2: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
        // 1d5: iinc 14 1
        // 1d8: goto 156
        // 1db: iinc 9 1
        // 1de: goto 035
        // 1e1: return
        // try (0 -> 17): 17 java/lang/RuntimeException
        // try (34 -> 37): 37 java/lang/RuntimeException
        // try (55 -> 71): 72 java/lang/RuntimeException
        // try (65 -> 79): 80 java/lang/RuntimeException
        // try (74 -> 88): 89 java/lang/RuntimeException
        // try (91 -> 103): 104 java/lang/RuntimeException
        // try (97 -> 111): 112 java/lang/RuntimeException
        // try (106 -> 120): 121 java/lang/RuntimeException
        // try (123 -> 135): 136 java/lang/RuntimeException
        // try (129 -> 143): 144 java/lang/RuntimeException
        // try (138 -> 152): 153 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
