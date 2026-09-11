package com.trolmastercard.sexmod;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class dd extends GeoItemRenderer<aj> {
    static final Vec3d a = new Vec3d(0.0, 1.0, 0.0);

    public dd() {
        super(new a2());
    }

    public void a(aj var1, ItemStack var2) {
        try {
            if (ad.b[0] == 0.0F) {
                GL11.glDisable(2896);
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        super.render(var1, var2);
        GL11.glEnable(2896);
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
        // 000: getstatic com/trolmastercard/sexmod/dd.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 003: aload 2
        // 004: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 007: getstatic com/trolmastercard/sexmod/dd.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 00a: aload 2
        // 00b: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 00e: getstatic com/trolmastercard/sexmod/dd.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 011: aload 2
        // 012: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 015: aload 2
        // 016: getfield software/bernie/geckolib3/geo/render/built/GeoCube.quads [Lsoftware/bernie/geckolib3/geo/render/built/GeoQuad;
        // 019: astore 7
        // 01b: aload 7
        // 01d: arraylength
        // 01e: istore 8
        // 020: bipush 0
        // 021: istore 9
        // 023: iload 9
        // 025: iload 8
        // 027: if_icmpge 215
        // 02a: aload 7
        // 02c: iload 9
        // 02e: aaload
        // 02f: astore 10
        // 031: aload 10
        // 033: ifnonnull 03d
        // 036: goto 20f
        // 039: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 03c: athrow
        // 03d: new javax/vecmath/Vector3f
        // 040: dup
        // 041: aload 10
        // 043: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 046: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 049: i2f
        // 04a: aload 10
        // 04c: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 04f: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
        // 052: i2f
        // 053: aload 10
        // 055: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 058: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 05b: i2f
        // 05c: invokespecial javax/vecmath/Vector3f.<init> (FFF)V
        // 05f: astore 11
        // 061: getstatic com/trolmastercard/sexmod/dd.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 064: invokevirtual software/bernie/geckolib3/util/MatrixStack.getNormalMatrix ()Ljavax/vecmath/Matrix3f;
        // 067: aload 11
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
        // 087: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 08a: athrow
        // 08b: aload 11
        // 08d: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 090: fconst_0
        // 091: fcmpg
        // 092: ifge 0af
        // 095: goto 09c
        // 098: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 09b: athrow
        // 09c: aload 11
        // 09e: dup
        // 09f: getfield javax/vecmath/Vector3f.x F
        // 0a2: ldc -1.0
        // 0a4: fmul
        // 0a5: putfield javax/vecmath/Vector3f.x F
        // 0a8: goto 0af
        // 0ab: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
        // 0ca: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0cd: athrow
        // 0ce: aload 11
        // 0d0: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 0d3: fconst_0
        // 0d4: fcmpg
        // 0d5: ifge 0f2
        // 0d8: goto 0df
        // 0db: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0de: athrow
        // 0df: aload 11
        // 0e1: dup
        // 0e2: getfield javax/vecmath/Vector3f.y F
        // 0e5: ldc -1.0
        // 0e7: fmul
        // 0e8: putfield javax/vecmath/Vector3f.y F
        // 0eb: goto 0f2
        // 0ee: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
        // 10d: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 110: athrow
        // 111: aload 11
        // 113: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 116: fconst_0
        // 117: fcmpg
        // 118: ifge 135
        // 11b: goto 122
        // 11e: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 121: athrow
        // 122: aload 11
        // 124: dup
        // 125: getfield javax/vecmath/Vector3f.z F
        // 128: ldc -1.0
        // 12a: fmul
        // 12b: putfield javax/vecmath/Vector3f.z F
        // 12e: goto 135
        // 131: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 134: athrow
        // 135: getstatic com/trolmastercard/sexmod/ad.b [F
        // 138: bipush 0
        // 139: faload
        // 13a: fconst_0
        // 13b: fcmpl
        // 13c: ifne 15d
        // 13f: new net/minecraft/util/math/Vec3d
        // 142: dup
        // 143: fload 3
        // 144: f2d
        // 145: fload 4
        // 147: f2d
        // 148: fload 5
        // 14a: f2d
        // 14b: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 14e: aload 11
        // 150: getstatic com/trolmastercard/sexmod/dd.a Lnet/minecraft/util/math/Vec3d;
        // 153: invokestatic com/trolmastercard/sexmod/gx.a (Lnet/minecraft/util/math/Vec3d;Ljavax/vecmath/Vector3f;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 156: goto 16c
        // 159: invokestatic com/trolmastercard/sexmod/dd.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 15c: athrow
        // 15d: new net/minecraft/util/math/Vec3d
        // 160: dup
        // 161: fload 3
        // 162: f2d
        // 163: fload 4
        // 165: f2d
        // 166: fload 5
        // 168: f2d
        // 169: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 16c: astore 12
        // 16e: aload 10
        // 170: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.vertices [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
        // 173: astore 13
        // 175: aload 13
        // 177: arraylength
        // 178: istore 14
        // 17a: bipush 0
        // 17b: istore 15
        // 17d: iload 15
        // 17f: iload 14
        // 181: if_icmpge 20f
        // 184: aload 13
        // 186: iload 15
        // 188: aaload
        // 189: astore 16
        // 18b: new javax/vecmath/Vector4f
        // 18e: dup
        // 18f: aload 16
        // 191: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 194: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 197: aload 16
        // 199: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 19c: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 19f: aload 16
        // 1a1: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 1a4: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 1a7: fconst_1
        // 1a8: invokespecial javax/vecmath/Vector4f.<init> (FFFF)V
        // 1ab: astore 17
        // 1ad: getstatic com/trolmastercard/sexmod/dd.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 1b0: invokevirtual software/bernie/geckolib3/util/MatrixStack.getModelMatrix ()Ljavax/vecmath/Matrix4f;
        // 1b3: aload 17
        // 1b5: invokevirtual javax/vecmath/Matrix4f.transform (Ljavax/vecmath/Tuple4f;)V
        // 1b8: aload 1
        // 1b9: aload 17
        // 1bb: invokevirtual javax/vecmath/Vector4f.getX ()F
        // 1be: f2d
        // 1bf: aload 17
        // 1c1: invokevirtual javax/vecmath/Vector4f.getY ()F
        // 1c4: f2d
        // 1c5: aload 17
        // 1c7: invokevirtual javax/vecmath/Vector4f.getZ ()F
        // 1ca: f2d
        // 1cb: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1ce: aload 16
        // 1d0: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureU F
        // 1d3: f2d
        // 1d4: aload 16
        // 1d6: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureV F
        // 1d9: f2d
        // 1da: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1dd: aload 12
        // 1df: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 1e2: d2f
        // 1e3: aload 12
        // 1e5: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 1e8: d2f
        // 1e9: aload 12
        // 1eb: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 1ee: d2f
        // 1ef: fload 6
        // 1f1: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181666_a (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1f4: aload 11
        // 1f6: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 1f9: aload 11
        // 1fb: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 1fe: aload 11
        // 200: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 203: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
        // 206: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
        // 209: iinc 15 1
        // 20c: goto 17d
        // 20f: iinc 9 1
        // 212: goto 023
        // 215: return
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
        // try (145 -> 164): 164 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
