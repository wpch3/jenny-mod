package com.trolmastercard.sexmod;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public abstract class d6<G extends e4> extends d_<G> {
    protected static final Vec3i r = new Vec3i(255, 255, 255);
    static HashMap<Integer, Vec3i> s = new HashMap<>();

    public d6(RenderManager var1, AnimatedGeoModel var2, double var3) {
        super(var1, var2, var3);
    }

    public static void c() {
        s.clear();
    }

    protected Vec3i a(GeoBone var1) {
        String var2 = var1.getName();
        int var3 = var2.hashCode() + this.j.getPersistentID().hashCode();
        Vec3i var4 = s.get(var3);

        try {
            if (var4 != null) {
                return var4;
            }
        } catch (RuntimeException var5) {
            throw c(var5);
        }

        var4 = this.a(var2);
        s.put(var3, var4);
        return var4;
    }

    protected abstract Vec3i a(String var1);

    protected static void b(GeoBone var0, int var1) {
        List var2 = var0.childBones;

        for (int var4 = 0; var4 < var2.size(); var4++) {
            GeoBone var5 = (GeoBone)var2.get(var4);
            if (var1 == var4) {
                GeoBone var3 = var5;
                var3.setHidden(false);
                return;
            }
        }
    }

    @Override
    protected void a(BufferBuilder var1, GeoBone var2) {
        ItemStack var3 = this.a((ItemStack)null);
        float var4 = this.a();
        Vec3d var5 = this.a(var3);

        try {
            if (var3 == null) {
                return;
            }
        } catch (RuntimeException var6) {
            throw c(var6);
        }

        GlStateManager.func_179094_E();
        Tessellator.func_178181_a().func_78381_a();
        com.trolmastercard.sexmod.p.a(IGeoRenderer.MATRIX_STACK, var2);
        GL11.glEnable(2896);
        GlStateManager.func_179152_a(var4, var4, var4);
        GlStateManager.func_179114_b((float)var5.field_72450_a, 1.0F, 0.0F, 0.0F);
        GlStateManager.func_179114_b((float)var5.field_72448_b, 0.0F, 1.0F, 0.0F);
        GlStateManager.func_179114_b((float)var5.field_72449_c, 0.0F, 0.0F, 1.0F);
        Minecraft.func_71410_x().func_175597_ag().func_178099_a(this.j, var3, TransformType.THIRD_PERSON_RIGHT_HAND);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
        var1.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        GL11.glDisable(2896);
        GlStateManager.func_179121_F();
    }

    protected float a() {
        return 1.0F;
    }

    protected Vec3d a(ItemStack var1) {
        return new Vec3d(-90.0, 0.0, 0.0);
    }

    protected static GeoBone a(GeoBone var0, int var1) {
        List var2 = var0.childBones;
        GeoBone var3 = null;
        var2.sort(Comparator.comparingDouble(GeoBone::getPivotY));

        for (int var4 = 0; var4 < var2.size(); var4++) {
            GeoBone var5 = (GeoBone)var2.get(var4);
            if (var1 == var4) {
                var3 = var5;
                var3.setHidden(false);
            } else {
                var5.setHidden(true);
            }
        }

        return var3;
    }

    protected Vec3i a(Vec3i var1) {
        return var1;
    }

    @Override
    public void a(BufferBuilder param1, GeoBone param2, float param3, float param4, float param5, float param6, double param7) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/d6.j Lcom/trolmastercard/sexmod/em;
        // 004: checkcast com/trolmastercard/sexmod/e4
        // 007: getfield com/trolmastercard/sexmod/e4.field_70170_p Lnet/minecraft/world/World;
        // 00a: instanceof com/trolmastercard/sexmod/gj
        // 00d: ifeq 015
        // 010: return
        // 011: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 014: athrow
        // 015: aload 2
        // 016: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
        // 019: astore 9
        // 01b: aload 9
        // 01d: ldc "weapon"
        // 01f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 022: ifeq 032
        // 025: aload 0
        // 026: aload 1
        // 027: aload 2
        // 028: invokevirtual com/trolmastercard/sexmod/d6.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 02b: goto 032
        // 02e: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 031: athrow
        // 032: aload 9
        // 034: ldc "itemRenderer"
        // 036: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 039: ifeq 060
        // 03c: aload 0
        // 03d: getfield com/trolmastercard/sexmod/d6.j Lcom/trolmastercard/sexmod/em;
        // 040: checkcast com/trolmastercard/sexmod/e4
        // 043: invokevirtual com/trolmastercard/sexmod/e4.y ()Lcom/trolmastercard/sexmod/fp;
        // 046: getstatic com/trolmastercard/sexmod/fp.PAYMENT Lcom/trolmastercard/sexmod/fp;
        // 049: if_acmpne 060
        // 04c: goto 053
        // 04f: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 052: athrow
        // 053: aload 0
        // 054: aload 1
        // 055: aload 2
        // 056: invokevirtual com/trolmastercard/sexmod/d6.b (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 059: goto 060
        // 05c: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 05f: athrow
        // 060: aload 0
        // 061: aload 1
        // 062: aload 2
        // 063: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
        // 066: aload 2
        // 067: invokevirtual com/trolmastercard/sexmod/d6.a (Lnet/minecraft/client/renderer/BufferBuilder;Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 06a: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 06d: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
        // 070: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 073: aload 2
        // 074: invokevirtual software/bernie/geckolib3/util/MatrixStack.translate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 077: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 07a: aload 2
        // 07b: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 07e: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 081: aload 2
        // 082: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 085: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 088: aload 2
        // 089: invokevirtual software/bernie/geckolib3/util/MatrixStack.scale (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 08c: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 08f: aload 2
        // 090: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 093: aload 2
        // 094: getfield software/bernie/geckolib3/geo/render/built/GeoBone.isHidden Z
        // 097: ifne 11a
        // 09a: aload 2
        // 09b: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childCubes Ljava/util/List;
        // 09e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 0a3: astore 10
        // 0a5: aload 10
        // 0a7: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 0ac: ifeq 0e6
        // 0af: aload 10
        // 0b1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 0b6: checkcast software/bernie/geckolib3/geo/render/built/GeoCube
        // 0b9: astore 11
        // 0bb: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0be: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
        // 0c1: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 0c4: aload 0
        // 0c5: aload 2
        // 0c6: putfield com/trolmastercard/sexmod/d6.q Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
        // 0c9: aload 0
        // 0ca: aload 1
        // 0cb: aload 11
        // 0cd: aload 2
        // 0ce: fload 3
        // 0cf: fload 4
        // 0d1: fload 5
        // 0d3: fload 6
        // 0d5: dload 7
        // 0d7: invokevirtual com/trolmastercard/sexmod/d6.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
        // 0da: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 0dd: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0e0: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 0e3: goto 0a5
        // 0e6: aload 2
        // 0e7: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childBones Ljava/util/List;
        // 0ea: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 0ef: astore 10
        // 0f1: aload 10
        // 0f3: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 0f8: ifeq 11a
        // 0fb: aload 10
        // 0fd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 102: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
        // 105: astore 11
        // 107: aload 0
        // 108: aload 1
        // 109: aload 11
        // 10b: fload 3
        // 10c: fload 4
        // 10e: fload 5
        // 110: fload 6
        // 112: dload 7
        // 114: invokevirtual com/trolmastercard/sexmod/d6.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
        // 117: goto 0f1
        // 11a: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 11d: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 120: return
        // try (0 -> 7): 7 java/lang/RuntimeException
        // try (12 -> 20): 21 java/lang/RuntimeException
        // try (23 -> 33): 34 java/lang/RuntimeException
        // try (27 -> 40): 41 java/lang/RuntimeException
    }

    @Override
    public void renderRecursively(BufferBuilder var1, GeoBone var2, float var3, float var4, float var5, float var6) {
        this.a(var1, var2, var3, var4, var5, var6, 0.0);
    }

    public void a(BufferBuilder param1, GeoCube param2, GeoBone param3, float param4, float param5, float param6, float param7, double param8) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 003: aload 2
        // 004: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 007: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 00a: aload 2
        // 00b: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 00e: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 011: aload 2
        // 012: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 015: aload 2
        // 016: getfield software/bernie/geckolib3/geo/render/built/GeoCube.quads [Lsoftware/bernie/geckolib3/geo/render/built/GeoQuad;
        // 019: astore 10
        // 01b: aload 10
        // 01d: arraylength
        // 01e: istore 11
        // 020: bipush 0
        // 021: istore 12
        // 023: iload 12
        // 025: iload 11
        // 027: if_icmpge 21c
        // 02a: aload 10
        // 02c: iload 12
        // 02e: aaload
        // 02f: astore 13
        // 031: aload 13
        // 033: ifnonnull 03d
        // 036: goto 216
        // 039: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 03c: athrow
        // 03d: new javax/vecmath/Vector3f
        // 040: dup
        // 041: aload 13
        // 043: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 046: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 049: i2f
        // 04a: aload 13
        // 04c: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 04f: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
        // 052: i2f
        // 053: aload 13
        // 055: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 058: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 05b: i2f
        // 05c: invokespecial javax/vecmath/Vector3f.<init> (FFF)V
        // 05f: astore 14
        // 061: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 064: invokevirtual software/bernie/geckolib3/util/MatrixStack.getNormalMatrix ()Ljavax/vecmath/Matrix3f;
        // 067: aload 14
        // 069: invokevirtual javax/vecmath/Matrix3f.transform (Ljavax/vecmath/Tuple3f;)V
        // 06c: aload 2
        // 06d: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 070: getfield javax/vecmath/Vector3f.y F
        // 073: fconst_0
        // 074: fcmpl
        // 075: ifeq 08b
        // 078: aload 2
        // 079: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 07c: getfield javax/vecmath/Vector3f.z F
        // 07f: fconst_0
        // 080: fcmpl
        // 081: ifne 0af
        // 084: goto 08b
        // 087: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 08a: athrow
        // 08b: aload 14
        // 08d: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 090: fconst_0
        // 091: fcmpg
        // 092: ifge 0af
        // 095: goto 09c
        // 098: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 09b: athrow
        // 09c: aload 14
        // 09e: dup
        // 09f: getfield javax/vecmath/Vector3f.x F
        // 0a2: ldc -1.0
        // 0a4: fmul
        // 0a5: putfield javax/vecmath/Vector3f.x F
        // 0a8: goto 0af
        // 0ab: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ae: athrow
        // 0af: aload 2
        // 0b0: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 0b3: getfield javax/vecmath/Vector3f.x F
        // 0b6: fconst_0
        // 0b7: fcmpl
        // 0b8: ifeq 0ce
        // 0bb: aload 2
        // 0bc: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 0bf: getfield javax/vecmath/Vector3f.z F
        // 0c2: fconst_0
        // 0c3: fcmpl
        // 0c4: ifne 0f2
        // 0c7: goto 0ce
        // 0ca: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0cd: athrow
        // 0ce: aload 14
        // 0d0: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 0d3: fconst_0
        // 0d4: fcmpg
        // 0d5: ifge 0f2
        // 0d8: goto 0df
        // 0db: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0de: athrow
        // 0df: aload 14
        // 0e1: dup
        // 0e2: getfield javax/vecmath/Vector3f.y F
        // 0e5: ldc -1.0
        // 0e7: fmul
        // 0e8: putfield javax/vecmath/Vector3f.y F
        // 0eb: goto 0f2
        // 0ee: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0f1: athrow
        // 0f2: aload 2
        // 0f3: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 0f6: getfield javax/vecmath/Vector3f.x F
        // 0f9: fconst_0
        // 0fa: fcmpl
        // 0fb: ifeq 111
        // 0fe: aload 2
        // 0ff: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 102: getfield javax/vecmath/Vector3f.y F
        // 105: fconst_0
        // 106: fcmpl
        // 107: ifne 135
        // 10a: goto 111
        // 10d: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 110: athrow
        // 111: aload 14
        // 113: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 116: fconst_0
        // 117: fcmpg
        // 118: ifge 135
        // 11b: goto 122
        // 11e: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 121: athrow
        // 122: aload 14
        // 124: dup
        // 125: getfield javax/vecmath/Vector3f.z F
        // 128: ldc -1.0
        // 12a: fmul
        // 12b: putfield javax/vecmath/Vector3f.z F
        // 12e: goto 135
        // 131: invokestatic com/trolmastercard/sexmod/d6.c (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 134: athrow
        // 135: aload 0
        // 136: aload 3
        // 137: invokevirtual com/trolmastercard/sexmod/d6.a (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)Lnet/minecraft/util/math/Vec3i;
        // 13a: astore 15
        // 13c: aload 0
        // 13d: aload 15
        // 13f: invokevirtual com/trolmastercard/sexmod/d6.a (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/Vec3i;
        // 142: astore 15
        // 144: aload 0
        // 145: aload 3
        // 146: new net/minecraft/util/math/Vec3d
        // 149: dup
        // 14a: aload 15
        // 14c: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 14f: i2f
        // 150: ldc 255.0
        // 152: fdiv
        // 153: f2d
        // 154: aload 15
        // 156: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
        // 159: i2f
        // 15a: ldc 255.0
        // 15c: fdiv
        // 15d: f2d
        // 15e: aload 15
        // 160: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 163: i2f
        // 164: ldc 255.0
        // 166: fdiv
        // 167: f2d
        // 168: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 16b: aload 14
        // 16d: invokestatic com/trolmastercard/sexmod/gx.a (Lcom/trolmastercard/sexmod/c3;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Lnet/minecraft/util/math/Vec3d;Ljavax/vecmath/Vector3f;)Lnet/minecraft/util/math/Vec3d;
        // 170: astore 16
        // 172: aload 13
        // 174: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.vertices [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
        // 177: astore 17
        // 179: aload 17
        // 17b: arraylength
        // 17c: istore 18
        // 17e: bipush 0
        // 17f: istore 19
        // 181: iload 19
        // 183: iload 18
        // 185: if_icmpge 216
        // 188: aload 17
        // 18a: iload 19
        // 18c: aaload
        // 18d: astore 20
        // 18f: new javax/vecmath/Vector4f
        // 192: dup
        // 193: aload 20
        // 195: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 198: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 19b: aload 20
        // 19d: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 1a0: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 1a3: aload 20
        // 1a5: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 1a8: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 1ab: fconst_1
        // 1ac: invokespecial javax/vecmath/Vector4f.<init> (FFFF)V
        // 1af: astore 21
        // 1b1: getstatic com/trolmastercard/sexmod/d6.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 1b4: invokevirtual software/bernie/geckolib3/util/MatrixStack.getModelMatrix ()Ljavax/vecmath/Matrix4f;
        // 1b7: aload 21
        // 1b9: invokevirtual javax/vecmath/Matrix4f.transform (Ljavax/vecmath/Tuple4f;)V
        // 1bc: aload 1
        // 1bd: aload 21
        // 1bf: invokevirtual javax/vecmath/Vector4f.getX ()F
        // 1c2: f2d
        // 1c3: aload 21
        // 1c5: invokevirtual javax/vecmath/Vector4f.getY ()F
        // 1c8: f2d
        // 1c9: aload 21
        // 1cb: invokevirtual javax/vecmath/Vector4f.getZ ()F
        // 1ce: f2d
        // 1cf: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1d2: aload 20
        // 1d4: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureU F
        // 1d7: f2d
        // 1d8: dload 8
        // 1da: dadd
        // 1db: aload 20
        // 1dd: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureV F
        // 1e0: f2d
        // 1e1: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1e4: aload 16
        // 1e6: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 1e9: d2f
        // 1ea: aload 16
        // 1ec: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 1ef: d2f
        // 1f0: aload 16
        // 1f2: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 1f5: d2f
        // 1f6: fload 7
        // 1f8: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181666_a (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1fb: aload 14
        // 1fd: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 200: aload 14
        // 202: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 205: aload 14
        // 207: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 20a: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
        // 20d: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
        // 210: iinc 19 1
        // 213: goto 181
        // 216: iinc 12 1
        // 219: goto 023
        // 21c: return
        // try (24 -> 27): 27 java/lang/RuntimeException
        // try (45 -> 61): 62 java/lang/RuntimeException
        // try (55 -> 69): 70 java/lang/RuntimeException
        // try (64 -> 78): 79 java/lang/RuntimeException
        // try (81 -> 93): 94 java/lang/RuntimeException
        // try (87 -> 101): 102 java/lang/RuntimeException
        // try (96 -> 110): 111 java/lang/RuntimeException
        // try (113 -> 125): 126 java/lang/RuntimeException
        // try (119 -> 133): 134 java/lang/RuntimeException
        // try (128 -> 142): 143 java/lang/RuntimeException
    }

    private static RuntimeException c(RuntimeException var0) {
        return var0;
    }
}
