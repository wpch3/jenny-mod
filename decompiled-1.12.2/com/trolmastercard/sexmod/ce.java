package com.trolmastercard.sexmod;

import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class ce extends cv {
    public static final float h = 7.0F;
    public static final float k = 0.75F;
    static final float l = gc.c(140.0F);
    static final float m = gc.c(35.0F);
    static final float i = 90.0F;
    static final float g = gc.c(45.0F);
    static final float f = gc.c(-45.0F);
    public static final ResourceLocation j = new ResourceLocation("sexmod", "textures/entity/manglelie/manglelie.png");

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{
            new ResourceLocation("sexmod", "geo/manglelie/manglelie.geo.json"),
            new ResourceLocation("sexmod", "geo/manglelie/manglelie.geo.json"),
            new ResourceLocation("sexmod", "geo/galath/galath_con_mang.geo.json")
        };
    }

    @Override
    public ResourceLocation a(em var1) {
        try {
            if (var1.field_70170_p instanceof gj) {
                return this.c[0];
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        try {
            if (c(var1)) {
                return this.c[2];
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        return this.c[var1.func_184212_Q().func_187225_a(em.D)];
    }

    public static boolean c(em var0) {
        return fp.a(var0, fp.THREESOME_SLOW, fp.THREESOME_FAST, fp.THREESOME_CUM);
    }

    @Override
    public ResourceLocation b() {
        return j;
    }

    @Override
    public ResourceLocation b(em var1) {
        return new ResourceLocation("sexmod", "animations/manglelie/manglelie.animation.json");
    }

    @Override
    public void a(em var1, Integer var2, AnimationEvent var3) {
        super.a(var1, var2, var3);
        a(var1, this.getAnimationProcessor(), var3.getPartialTick());
        this.b(var1);
        this.d(var1);
        this.a(var1);
        this.e(var1);
    }

    void e(em var1) {
        try {
            if (this.a.func_147113_T()) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        try {
            if (c(var1)) {
                return;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        f_ var2 = f8.a(var1, false);

        try {
            if (var2 == null) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (!fp.a(var2.y(), fp.CORRUPT_CUM, fp.CARRY_FAST, fp.CORRUPT_INTRO, fp.CORRUPT_SLOW)) {
                return;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        AnimationProcessor var3 = this.getAnimationProcessor();
        IBone var4 = var3.getBone("legR");
        var4.setRotationY(var4.getRotationY() + f);
        IBone var5 = var3.getBone("lowerArmR");
        IBone var6 = var3.getBone("lowerArmL");
        var5.setRotationX(var5.getRotationX() + f);
        var6.setRotationX(var6.getRotationX() + f);
    }

    void a(em var1) {
        try {
            if (!(var1 instanceof f8)) {
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        try {
            if (c(var1)) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        f8 var2 = (f8)var1;
        f_ var3 = var2.a(false);

        try {
            if (var3 == null) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        IBone var4 = this.getAnimationProcessor().getBone("body");

        IBone var10000;
        float var10001;
        float var10002;
        label32: {
            try {
                var10000 = var4;
                var10001 = var3.bw;
                if (this.a.func_147113_T()) {
                    var10002 = 0.0F;
                    break label32;
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }

            var10002 = var4.getRotationY();
        }

        var10000.setRotationY(var10001 + var10002);
        var4.setScaleX(var3.bm);
        var4.setScaleY(var3.bm);
        var4.setScaleZ(var3.bm);
    }

    Vec3d a(@Nonnull Entity var1) {
        return ak.a(var1, this.a.func_184121_ak()).func_72441_c(0.0, var1.func_70047_e(), 0.0);
    }

    void d(em param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: getstatic com/trolmastercard/sexmod/ClientProxy.IS_PRELOADING Z
        // 003: ifeq 00b
        // 006: return
        // 007: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 00a: athrow
        // 00b: aload 1
        // 00c: invokestatic com/trolmastercard/sexmod/ce.c (Lcom/trolmastercard/sexmod/em;)Z
        // 00f: ifeq 017
        // 012: return
        // 013: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 016: athrow
        // 017: aload 0
        // 018: getfield com/trolmastercard/sexmod/ce.a Lnet/minecraft/client/Minecraft;
        // 01b: invokevirtual net/minecraft/client/Minecraft.func_147113_T ()Z
        // 01e: ifeq 026
        // 021: return
        // 022: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 025: athrow
        // 026: aload 1
        // 027: checkcast com/trolmastercard/sexmod/f8
        // 02a: astore 2
        // 02b: aload 2
        // 02c: invokevirtual com/trolmastercard/sexmod/f8.r ()Z
        // 02f: ifne 037
        // 032: return
        // 033: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 036: athrow
        // 037: aload 2
        // 038: bipush 0
        // 039: invokevirtual com/trolmastercard/sexmod/f8.a (Z)Lcom/trolmastercard/sexmod/f_;
        // 03c: astore 3
        // 03d: aload 3
        // 03e: ifnonnull 046
        // 041: return
        // 042: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 045: athrow
        // 046: aload 0
        // 047: invokevirtual com/trolmastercard/sexmod/ce.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 04a: astore 4
        // 04c: aload 4
        // 04e: ldc "armL"
        // 050: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 053: astore 5
        // 055: aload 4
        // 057: ldc "armR"
        // 059: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 05c: astore 6
        // 05e: aload 4
        // 060: ldc "lowerArmL"
        // 062: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 065: astore 7
        // 067: aload 4
        // 069: ldc "lowerArmR"
        // 06b: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 06e: astore 8
        // 070: aload 4
        // 072: ldc "elbowR"
        // 074: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 077: astore 9
        // 079: aload 4
        // 07b: ldc "elbowL"
        // 07d: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 080: astore 10
        // 082: aload 2
        // 083: invokevirtual com/trolmastercard/sexmod/f8.b ()Lnet/minecraft/entity/Entity;
        // 086: astore 11
        // 088: aload 11
        // 08a: ifnonnull 095
        // 08d: bipush 1
        // 08e: goto 096
        // 091: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 094: athrow
        // 095: bipush 0
        // 096: istore 12
        // 098: iload 12
        // 09a: ifne 0ae
        // 09d: aload 2
        // 09e: aload 0
        // 09f: aload 11
        // 0a1: invokevirtual com/trolmastercard/sexmod/ce.a (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/Vec3d;
        // 0a4: putfield com/trolmastercard/sexmod/f8.R Lnet/minecraft/util/math/Vec3d;
        // 0a7: goto 0ae
        // 0aa: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ad: athrow
        // 0ae: invokestatic net/minecraft/client/Minecraft.func_175610_ah ()I
        // 0b1: i2f
        // 0b2: fstore 14
        // 0b4: fload 14
        // 0b6: fconst_0
        // 0b7: fcmpl
        // 0b8: ifne 0be
        // 0bb: fconst_1
        // 0bc: fstore 14
        // 0be: aload 2
        // 0bf: getfield com/trolmastercard/sexmod/f8.aj Z
        // 0c2: iload 12
        // 0c4: if_icmpne 0d3
        // 0c7: aload 2
        // 0c8: fconst_0
        // 0c9: putfield com/trolmastercard/sexmod/f8.V F
        // 0cc: goto 0e1
        // 0cf: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0d2: athrow
        // 0d3: aload 2
        // 0d4: dup
        // 0d5: getfield com/trolmastercard/sexmod/f8.V F
        // 0d8: ldc 1.5
        // 0da: fload 14
        // 0dc: fdiv
        // 0dd: fadd
        // 0de: putfield com/trolmastercard/sexmod/f8.V F
        // 0e1: aload 2
        // 0e2: getfield com/trolmastercard/sexmod/f8.V F
        // 0e5: fconst_1
        // 0e6: fcmpl
        // 0e7: iflt 0fc
        // 0ea: aload 2
        // 0eb: fconst_0
        // 0ec: putfield com/trolmastercard/sexmod/f8.V F
        // 0ef: aload 2
        // 0f0: iload 12
        // 0f2: putfield com/trolmastercard/sexmod/f8.aj Z
        // 0f5: goto 0fc
        // 0f8: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0fb: athrow
        // 0fc: aload 2
        // 0fd: getfield com/trolmastercard/sexmod/f8.V F
        // 100: fconst_0
        // 101: fcmpl
        // 102: ifne 136
        // 105: iload 12
        // 107: ifeq 125
        // 10a: goto 111
        // 10d: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 110: athrow
        // 111: aload 0
        // 112: aload 3
        // 113: aload 6
        // 115: aload 5
        // 117: aload 7
        // 119: aload 8
        // 11b: invokevirtual com/trolmastercard/sexmod/ce.a (Lcom/trolmastercard/sexmod/f_;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;)Lcom/trolmastercard/sexmod/ce$a;
        // 11e: goto 131
        // 121: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 124: athrow
        // 125: aload 0
        // 126: aload 2
        // 127: aload 3
        // 128: aload 8
        // 12a: aload 7
        // 12c: aload 4
        // 12e: invokevirtual com/trolmastercard/sexmod/ce.a (Lcom/trolmastercard/sexmod/f8;Lcom/trolmastercard/sexmod/f_;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;)Lcom/trolmastercard/sexmod/ce$a;
        // 131: astore 13
        // 133: goto 175
        // 136: aload 0
        // 137: aload 3
        // 138: aload 6
        // 13a: aload 5
        // 13c: aload 7
        // 13e: aload 8
        // 140: invokevirtual com/trolmastercard/sexmod/ce.a (Lcom/trolmastercard/sexmod/f_;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;)Lcom/trolmastercard/sexmod/ce$a;
        // 143: aload 0
        // 144: aload 2
        // 145: aload 3
        // 146: aload 8
        // 148: aload 7
        // 14a: aload 4
        // 14c: invokevirtual com/trolmastercard/sexmod/ce.a (Lcom/trolmastercard/sexmod/f8;Lcom/trolmastercard/sexmod/f_;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;)Lcom/trolmastercard/sexmod/ce$a;
        // 14f: aload 2
        // 150: getfield com/trolmastercard/sexmod/f8.aj Z
        // 153: ifeq 165
        // 156: aload 2
        // 157: getfield com/trolmastercard/sexmod/f8.V F
        // 15a: f2d
        // 15b: invokestatic com/trolmastercard/sexmod/b6.c (D)D
        // 15e: goto 16f
        // 161: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 164: athrow
        // 165: dconst_1
        // 166: aload 2
        // 167: getfield com/trolmastercard/sexmod/f8.V F
        // 16a: f2d
        // 16b: invokestatic com/trolmastercard/sexmod/b6.c (D)D
        // 16e: dsub
        // 16f: d2f
        // 170: invokestatic com/trolmastercard/sexmod/ce$a.a (Lcom/trolmastercard/sexmod/ce$a;Lcom/trolmastercard/sexmod/ce$a;F)Lcom/trolmastercard/sexmod/ce$a;
        // 173: astore 13
        // 175: aload 6
        // 177: aload 13
        // 179: invokestatic com/trolmastercard/sexmod/ce$a.access$000 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 17c: getfield com/trolmastercard/sexmod/f7.a F
        // 17f: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // 184: aload 6
        // 186: aload 13
        // 188: invokestatic com/trolmastercard/sexmod/ce$a.access$000 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 18b: getfield com/trolmastercard/sexmod/f7.c F
        // 18e: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 193: aload 6
        // 195: aload 13
        // 197: invokestatic com/trolmastercard/sexmod/ce$a.access$000 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 19a: getfield com/trolmastercard/sexmod/f7.b F
        // 19d: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationZ (F)V 2
        // 1a2: aload 5
        // 1a4: aload 13
        // 1a6: invokestatic com/trolmastercard/sexmod/ce$a.access$100 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 1a9: getfield com/trolmastercard/sexmod/f7.a F
        // 1ac: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // 1b1: aload 5
        // 1b3: aload 13
        // 1b5: invokestatic com/trolmastercard/sexmod/ce$a.access$100 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 1b8: getfield com/trolmastercard/sexmod/f7.c F
        // 1bb: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 1c0: aload 5
        // 1c2: aload 13
        // 1c4: invokestatic com/trolmastercard/sexmod/ce$a.access$100 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 1c7: getfield com/trolmastercard/sexmod/f7.b F
        // 1ca: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationZ (F)V 2
        // 1cf: aload 7
        // 1d1: aload 13
        // 1d3: invokestatic com/trolmastercard/sexmod/ce$a.access$200 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 1d6: getfield com/trolmastercard/sexmod/f7.a F
        // 1d9: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // 1de: aload 7
        // 1e0: aload 13
        // 1e2: invokestatic com/trolmastercard/sexmod/ce$a.access$200 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 1e5: getfield com/trolmastercard/sexmod/f7.c F
        // 1e8: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 1ed: aload 7
        // 1ef: aload 13
        // 1f1: invokestatic com/trolmastercard/sexmod/ce$a.access$200 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 1f4: getfield com/trolmastercard/sexmod/f7.b F
        // 1f7: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationZ (F)V 2
        // 1fc: aload 8
        // 1fe: aload 13
        // 200: invokestatic com/trolmastercard/sexmod/ce$a.access$300 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 203: getfield com/trolmastercard/sexmod/f7.a F
        // 206: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // 20b: aload 8
        // 20d: aload 13
        // 20f: invokestatic com/trolmastercard/sexmod/ce$a.access$300 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 212: getfield com/trolmastercard/sexmod/f7.c F
        // 215: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 21a: aload 8
        // 21c: aload 13
        // 21e: invokestatic com/trolmastercard/sexmod/ce$a.access$300 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 221: getfield com/trolmastercard/sexmod/f7.b F
        // 224: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationZ (F)V 2
        // 229: aload 5
        // 22b: aload 13
        // 22d: invokestatic com/trolmastercard/sexmod/ce$a.access$400 (Lcom/trolmastercard/sexmod/ce$a;)F
        // 230: invokeinterface software/bernie/geckolib3/core/processor/IBone.setScaleY (F)V 2
        // 235: aload 6
        // 237: aload 13
        // 239: invokestatic com/trolmastercard/sexmod/ce$a.access$500 (Lcom/trolmastercard/sexmod/ce$a;)F
        // 23c: invokeinterface software/bernie/geckolib3/core/processor/IBone.setScaleY (F)V 2
        // 241: aload 9
        // 243: aload 13
        // 245: invokestatic com/trolmastercard/sexmod/ce$a.access$600 (Lcom/trolmastercard/sexmod/ce$a;)F
        // 248: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 24d: aload 10
        // 24f: aload 13
        // 251: invokestatic com/trolmastercard/sexmod/ce$a.access$700 (Lcom/trolmastercard/sexmod/ce$a;)F
        // 254: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 259: return
        // try (0 -> 3): 3 java/lang/RuntimeException
        // try (5 -> 9): 9 java/lang/RuntimeException
        // try (11 -> 16): 16 java/lang/RuntimeException
        // try (21 -> 25): 25 java/lang/RuntimeException
        // try (31 -> 34): 34 java/lang/RuntimeException
        // try (66 -> 70): 70 java/lang/RuntimeException
        // try (74 -> 81): 82 java/lang/RuntimeException
        // try (93 -> 101): 101 java/lang/RuntimeException
        // try (111 -> 122): 123 java/lang/RuntimeException
        // try (125 -> 132): 133 java/lang/RuntimeException
        // try (130 -> 143): 143 java/lang/RuntimeException
        // try (154 -> 176): 176 java/lang/RuntimeException
    }

    ce.a a(@Nonnull f8 param1, @Nonnull f_ param2, IBone param3, IBone param4, AnimationProcessor param5) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: new com/trolmastercard/sexmod/ce$a
        // 003: dup
        // 004: aconst_null
        // 005: invokespecial com/trolmastercard/sexmod/ce$a.<init> (Lcom/trolmastercard/sexmod/ce$b;)V
        // 008: astore 6
        // 00a: aload 6
        // 00c: new com/trolmastercard/sexmod/f7
        // 00f: dup
        // 010: getstatic com/trolmastercard/sexmod/ce.m F
        // 013: fconst_0
        // 014: aload 3
        // 015: invokeinterface software/bernie/geckolib3/core/processor/IBone.getRotationZ ()F 1
        // 01a: invokespecial com/trolmastercard/sexmod/f7.<init> (FFF)V
        // 01d: invokestatic com/trolmastercard/sexmod/ce$a.access$202 (Lcom/trolmastercard/sexmod/ce$a;Lcom/trolmastercard/sexmod/f7;)Lcom/trolmastercard/sexmod/f7;
        // 020: pop
        // 021: aload 6
        // 023: new com/trolmastercard/sexmod/f7
        // 026: dup
        // 027: getstatic com/trolmastercard/sexmod/ce.l F
        // 02a: fconst_0
        // 02b: aload 4
        // 02d: invokeinterface software/bernie/geckolib3/core/processor/IBone.getRotationZ ()F 1
        // 032: invokespecial com/trolmastercard/sexmod/f7.<init> (FFF)V
        // 035: invokestatic com/trolmastercard/sexmod/ce$a.access$302 (Lcom/trolmastercard/sexmod/ce$a;Lcom/trolmastercard/sexmod/f7;)Lcom/trolmastercard/sexmod/f7;
        // 038: pop
        // 039: aload 2
        // 03a: getfield com/trolmastercard/sexmod/f_.aE F
        // 03d: aload 5
        // 03f: ldc "upperBody"
        // 041: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 044: invokeinterface software/bernie/geckolib3/core/processor/IBone.getRotationX ()F 1
        // 049: fadd
        // 04a: fstore 7
        // 04c: aload 0
        // 04d: getfield com/trolmastercard/sexmod/ce.a Lnet/minecraft/client/Minecraft;
        // 050: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
        // 053: fstore 8
        // 055: aload 2
        // 056: fload 8
        // 058: invokestatic com/trolmastercard/sexmod/dh.a (Lcom/trolmastercard/sexmod/f_;F)Lnet/minecraft/util/math/Vec3d;
        // 05b: astore 9
        // 05d: aload 1
        // 05e: ldc "armR"
        // 060: invokevirtual com/trolmastercard/sexmod/f8.b (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3d;
        // 063: aload 9
        // 065: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 068: astore 10
        // 06a: aload 1
        // 06b: ldc "armL"
        // 06d: invokevirtual com/trolmastercard/sexmod/f8.b (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3d;
        // 070: aload 9
        // 072: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 075: astore 11
        // 077: aload 10
        // 079: aload 1
        // 07a: getfield com/trolmastercard/sexmod/f8.R Lnet/minecraft/util/math/Vec3d;
        // 07d: invokestatic com/trolmastercard/sexmod/be.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lcom/trolmastercard/sexmod/bm;
        // 080: astore 12
        // 082: aload 11
        // 084: aload 1
        // 085: getfield com/trolmastercard/sexmod/f8.R Lnet/minecraft/util/math/Vec3d;
        // 088: invokestatic com/trolmastercard/sexmod/be.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lcom/trolmastercard/sexmod/bm;
        // 08b: astore 13
        // 08d: aload 2
        // 08e: fload 8
        // 090: invokestatic com/trolmastercard/sexmod/f_.a (Lcom/trolmastercard/sexmod/f_;F)Ljava/lang/Float;
        // 093: astore 14
        // 095: aload 14
        // 097: ifnonnull 0af
        // 09a: aload 2
        // 09b: getfield com/trolmastercard/sexmod/f_.field_70758_at F
        // 09e: aload 2
        // 09f: getfield com/trolmastercard/sexmod/f_.field_70759_as F
        // 0a2: fload 8
        // 0a4: f2d
        // 0a5: invokestatic com/trolmastercard/sexmod/b6.b (FFD)F
        // 0a8: goto 0b4
        // 0ab: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ae: athrow
        // 0af: aload 14
        // 0b1: invokevirtual java/lang/Float.floatValue ()F
        // 0b4: fstore 15
        // 0b6: fload 15
        // 0b8: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 0bb: fstore 16
        // 0bd: aload 1
        // 0be: fload 8
        // 0c0: invokevirtual com/trolmastercard/sexmod/f8.b (F)F
        // 0c3: fstore 17
        // 0c5: fconst_1
        // 0c6: fload 17
        // 0c8: invokestatic java/lang/Math.min (FF)F
        // 0cb: f2d
        // 0cc: invokestatic com/trolmastercard/sexmod/b6.e (D)D
        // 0cf: d2f
        // 0d0: fstore 18
        // 0d2: fload 18
        // 0d4: fconst_1
        // 0d5: fcmpl
        // 0d6: ifeq 0df
        // 0d9: fconst_0
        // 0da: fstore 19
        // 0dc: goto 0f9
        // 0df: fload 17
        // 0e1: ldc 28.0
        // 0e3: fmul
        // 0e4: ldc 28.0
        // 0e6: fsub
        // 0e7: ldc 32.0
        // 0e9: fdiv
        // 0ea: fstore 19
        // 0ec: fconst_0
        // 0ed: fload 19
        // 0ef: ldc 0.5
        // 0f1: fsub
        // 0f2: invokestatic java/lang/Math.max (FF)F
        // 0f5: fconst_2
        // 0f6: fmul
        // 0f7: fstore 19
        // 0f9: fload 19
        // 0fb: f2d
        // 0fc: invokestatic com/trolmastercard/sexmod/b6.h (D)D
        // 0ff: d2f
        // 100: fstore 20
        // 102: fconst_0
        // 103: ldc 90.0
        // 105: fload 18
        // 107: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 10a: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 10d: fstore 21
        // 10f: aload 1
        // 110: aload 1
        // 111: getfield com/trolmastercard/sexmod/f8.R Lnet/minecraft/util/math/Vec3d;
        // 114: fload 8
        // 116: invokevirtual com/trolmastercard/sexmod/f8.a (Lnet/minecraft/util/math/Vec3d;F)Z
        // 119: istore 22
        // 11b: iload 22
        // 11d: ifeq 233
        // 120: aload 6
        // 122: new com/trolmastercard/sexmod/f7
        // 125: dup
        // 126: fload 7
        // 128: fneg
        // 129: aload 12
        // 12b: getfield com/trolmastercard/sexmod/bm.a F
        // 12e: fadd
        // 12f: ldc 90.0
        // 131: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 134: fadd
        // 135: aload 12
        // 137: getfield com/trolmastercard/sexmod/bm.c F
        // 13a: fconst_0
        // 13b: invokespecial com/trolmastercard/sexmod/f7.<init> (FFF)V
        // 13e: invokestatic com/trolmastercard/sexmod/ce$a.access$002 (Lcom/trolmastercard/sexmod/ce$a;Lcom/trolmastercard/sexmod/f7;)Lcom/trolmastercard/sexmod/f7;
        // 141: pop
        // 142: aload 6
        // 144: new com/trolmastercard/sexmod/f7
        // 147: dup
        // 148: fload 7
        // 14a: fneg
        // 14b: aload 13
        // 14d: getfield com/trolmastercard/sexmod/bm.a F
        // 150: fadd
        // 151: ldc 90.0
        // 153: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 156: fadd
        // 157: aload 13
        // 159: getfield com/trolmastercard/sexmod/bm.c F
        // 15c: f2d
        // 15d: ldc -20.0
        // 15f: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 162: f2d
        // 163: aload 12
        // 165: getfield com/trolmastercard/sexmod/bm.c F
        // 168: fload 16
        // 16a: fconst_1
        // 16b: fmul
        // 16c: fadd
        // 16d: f2d
        // 16e: invokestatic java/lang/Math.cos (D)D
        // 171: dmul
        // 172: dadd
        // 173: fload 21
        // 175: fconst_2
        // 176: fdiv
        // 177: fconst_0
        // 178: fload 20
        // 17a: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 17d: f2d
        // 17e: dadd
        // 17f: d2f
        // 180: fconst_0
        // 181: invokespecial com/trolmastercard/sexmod/f7.<init> (FFF)V
        // 184: invokestatic com/trolmastercard/sexmod/ce$a.access$102 (Lcom/trolmastercard/sexmod/ce$a;Lcom/trolmastercard/sexmod/f7;)Lcom/trolmastercard/sexmod/f7;
        // 187: pop
        // 188: aload 6
        // 18a: fconst_1
        // 18b: aload 12
        // 18d: getfield com/trolmastercard/sexmod/bm.c F
        // 190: invokestatic java/lang/Math.abs (F)F
        // 193: fload 16
        // 195: invokestatic java/lang/Math.abs (F)F
        // 198: fsub
        // 199: invokestatic java/lang/Math.abs (F)F
        // 19c: ldc 0.1909
        // 19e: fmul
        // 19f: fadd
        // 1a0: invokestatic com/trolmastercard/sexmod/ce$a.access$402 (Lcom/trolmastercard/sexmod/ce$a;F)F
        // 1a3: pop
        // 1a4: aload 6
        // 1a6: ldc 90.0
        // 1a8: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 1ab: invokestatic com/trolmastercard/sexmod/ce$a.access$702 (Lcom/trolmastercard/sexmod/ce$a;F)F
        // 1ae: pop
        // 1af: aload 6
        // 1b1: invokestatic com/trolmastercard/sexmod/ce$a.access$200 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 1b4: fload 21
        // 1b6: fconst_0
        // 1b7: fload 20
        // 1b9: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 1bc: putfield com/trolmastercard/sexmod/f7.b F
        // 1bf: fload 19
        // 1c1: f2d
        // 1c2: ldc2_w 0.5
        // 1c5: dcmpl
        // 1c6: ifle 1f7
        // 1c9: goto 1d0
        // 1cc: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1cf: athrow
        // 1d0: aload 6
        // 1d2: invokestatic com/trolmastercard/sexmod/ce$a.access$200 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 1d5: getstatic com/trolmastercard/sexmod/ce.m F
        // 1d8: getstatic com/trolmastercard/sexmod/ce.g F
        // 1db: f2d
        // 1dc: dconst_0
        // 1dd: fload 19
        // 1df: ldc 0.5
        // 1e1: fsub
        // 1e2: fconst_2
        // 1e3: fmul
        // 1e4: f2d
        // 1e5: invokestatic com/trolmastercard/sexmod/b6.h (D)D
        // 1e8: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 1eb: d2f
        // 1ec: fadd
        // 1ed: putfield com/trolmastercard/sexmod/f7.a F
        // 1f0: goto 33f
        // 1f3: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1f6: athrow
        // 1f7: fload 19
        // 1f9: fconst_0
        // 1fa: fcmpl
        // 1fb: ifeq 33f
        // 1fe: fload 19
        // 200: f2d
        // 201: ldc2_w 0.5
        // 204: dcmpg
        // 205: ifge 33f
        // 208: goto 20f
        // 20b: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 20e: athrow
        // 20f: aload 6
        // 211: invokestatic com/trolmastercard/sexmod/ce$a.access$200 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 214: getstatic com/trolmastercard/sexmod/ce.m F
        // 217: dconst_0
        // 218: getstatic com/trolmastercard/sexmod/ce.g F
        // 21b: f2d
        // 21c: fload 19
        // 21e: fconst_2
        // 21f: fmul
        // 220: f2d
        // 221: invokestatic com/trolmastercard/sexmod/b6.h (D)D
        // 224: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 227: d2f
        // 228: fadd
        // 229: putfield com/trolmastercard/sexmod/f7.a F
        // 22c: goto 33f
        // 22f: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 232: athrow
        // 233: aload 6
        // 235: new com/trolmastercard/sexmod/f7
        // 238: dup
        // 239: fload 7
        // 23b: fneg
        // 23c: aload 13
        // 23e: getfield com/trolmastercard/sexmod/bm.a F
        // 241: fadd
        // 242: ldc 90.0
        // 244: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 247: fadd
        // 248: aload 13
        // 24a: getfield com/trolmastercard/sexmod/bm.c F
        // 24d: fconst_0
        // 24e: invokespecial com/trolmastercard/sexmod/f7.<init> (FFF)V
        // 251: invokestatic com/trolmastercard/sexmod/ce$a.access$102 (Lcom/trolmastercard/sexmod/ce$a;Lcom/trolmastercard/sexmod/f7;)Lcom/trolmastercard/sexmod/f7;
        // 254: pop
        // 255: aload 6
        // 257: new com/trolmastercard/sexmod/f7
        // 25a: dup
        // 25b: fload 7
        // 25d: fneg
        // 25e: aload 12
        // 260: getfield com/trolmastercard/sexmod/bm.a F
        // 263: fadd
        // 264: ldc 90.0
        // 266: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 269: fadd
        // 26a: aload 12
        // 26c: getfield com/trolmastercard/sexmod/bm.c F
        // 26f: f2d
        // 270: ldc 20.0
        // 272: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 275: f2d
        // 276: aload 13
        // 278: getfield com/trolmastercard/sexmod/bm.c F
        // 27b: fload 16
        // 27d: fconst_1
        // 27e: fmul
        // 27f: fadd
        // 280: f2d
        // 281: invokestatic java/lang/Math.cos (D)D
        // 284: dmul
        // 285: dadd
        // 286: d2f
        // 287: fload 21
        // 289: fconst_2
        // 28a: fdiv
        // 28b: fconst_0
        // 28c: fload 20
        // 28e: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 291: fsub
        // 292: fconst_0
        // 293: invokespecial com/trolmastercard/sexmod/f7.<init> (FFF)V
        // 296: invokestatic com/trolmastercard/sexmod/ce$a.access$002 (Lcom/trolmastercard/sexmod/ce$a;Lcom/trolmastercard/sexmod/f7;)Lcom/trolmastercard/sexmod/f7;
        // 299: pop
        // 29a: aload 6
        // 29c: fconst_1
        // 29d: aload 13
        // 29f: getfield com/trolmastercard/sexmod/bm.c F
        // 2a2: invokestatic java/lang/Math.abs (F)F
        // 2a5: fload 16
        // 2a7: invokestatic java/lang/Math.abs (F)F
        // 2aa: fsub
        // 2ab: invokestatic java/lang/Math.abs (F)F
        // 2ae: ldc 0.1909
        // 2b0: fmul
        // 2b1: fadd
        // 2b2: invokestatic com/trolmastercard/sexmod/ce$a.access$502 (Lcom/trolmastercard/sexmod/ce$a;F)F
        // 2b5: pop
        // 2b6: aload 6
        // 2b8: ldc 90.0
        // 2ba: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 2bd: invokestatic com/trolmastercard/sexmod/ce$a.access$602 (Lcom/trolmastercard/sexmod/ce$a;F)F
        // 2c0: pop
        // 2c1: aload 6
        // 2c3: invokestatic com/trolmastercard/sexmod/ce$a.access$300 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 2c6: fload 21
        // 2c8: fconst_0
        // 2c9: fload 20
        // 2cb: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 2ce: fneg
        // 2cf: putfield com/trolmastercard/sexmod/f7.b F
        // 2d2: fload 19
        // 2d4: f2d
        // 2d5: ldc2_w 0.5
        // 2d8: dcmpl
        // 2d9: ifle 303
        // 2dc: aload 6
        // 2de: invokestatic com/trolmastercard/sexmod/ce$a.access$300 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 2e1: getstatic com/trolmastercard/sexmod/ce.l F
        // 2e4: getstatic com/trolmastercard/sexmod/ce.g F
        // 2e7: f2d
        // 2e8: dconst_0
        // 2e9: fload 19
        // 2eb: ldc 0.5
        // 2ed: fsub
        // 2ee: fconst_2
        // 2ef: fmul
        // 2f0: f2d
        // 2f1: invokestatic com/trolmastercard/sexmod/b6.h (D)D
        // 2f4: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 2f7: d2f
        // 2f8: fadd
        // 2f9: putfield com/trolmastercard/sexmod/f7.a F
        // 2fc: goto 33f
        // 2ff: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 302: athrow
        // 303: fload 19
        // 305: fconst_0
        // 306: fcmpl
        // 307: ifeq 33f
        // 30a: fload 19
        // 30c: f2d
        // 30d: ldc2_w 0.5
        // 310: dcmpg
        // 311: ifge 33f
        // 314: goto 31b
        // 317: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 31a: athrow
        // 31b: aload 6
        // 31d: invokestatic com/trolmastercard/sexmod/ce$a.access$300 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 320: getstatic com/trolmastercard/sexmod/ce.l F
        // 323: dconst_0
        // 324: getstatic com/trolmastercard/sexmod/ce.g F
        // 327: f2d
        // 328: fload 19
        // 32a: fconst_2
        // 32b: fmul
        // 32c: f2d
        // 32d: invokestatic com/trolmastercard/sexmod/b6.h (D)D
        // 330: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 333: d2f
        // 334: fadd
        // 335: putfield com/trolmastercard/sexmod/f7.a F
        // 338: goto 33f
        // 33b: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 33e: athrow
        // 33f: aload 6
        // 341: invokestatic com/trolmastercard/sexmod/ce$a.access$000 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 344: dup
        // 345: getfield com/trolmastercard/sexmod/f7.c F
        // 348: fload 16
        // 34a: fadd
        // 34b: putfield com/trolmastercard/sexmod/f7.c F
        // 34e: aload 6
        // 350: invokestatic com/trolmastercard/sexmod/ce$a.access$100 (Lcom/trolmastercard/sexmod/ce$a;)Lcom/trolmastercard/sexmod/f7;
        // 353: dup
        // 354: getfield com/trolmastercard/sexmod/f7.c F
        // 357: fload 16
        // 359: fadd
        // 35a: putfield com/trolmastercard/sexmod/f7.c F
        // 35d: aload 6
        // 35f: areturn
        // try (67 -> 77): 77 java/lang/RuntimeException
        // try (136 -> 226): 227 java/lang/RuntimeException
        // try (138 -> 247): 247 java/lang/RuntimeException
        // try (249 -> 258): 259 java/lang/RuntimeException
        // try (253 -> 277): 277 java/lang/RuntimeException
        // try (279 -> 385): 385 java/lang/RuntimeException
        // try (387 -> 396): 397 java/lang/RuntimeException
        // try (391 -> 414): 415 java/lang/RuntimeException
    }

    ce.a a(f_ var1, IBone var2, IBone var3, IBone var4, IBone var5) {
        float var6 = var1.aE;
        ce.a var7 = new ce.a();

        try {
            if (var6 > 0.0F) {
                var7.c = new f7(var2.getRotationX() - var6, var2.getRotationY() - var6 * -25.0F / 45.0F, var2.getRotationZ() + var6 * 12.5F / 45.0F);
                var7.g = new f7(var3.getRotationX() - var6, var3.getRotationY() + var6 * 15.0F / 45.0F, var3.getRotationZ());
                var7.b = new f7(var4.getRotationX(), var4.getRotationY(), var4.getRotationZ());
                var7.h = new f7(var5.getRotationX(), var5.getRotationY(), var5.getRotationZ());
                return var7;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        var7.h = new f7(var5.getRotationX() + 2.0F * var6, var5.getRotationY(), var5.getRotationZ());
        var7.b = new f7(var4.getRotationX() + 2.2222223F * var6, var4.getRotationY(), var4.getRotationZ());
        var7.c = new f7(var2.getRotationX() - var6, var2.getRotationY(), var2.getRotationZ() + var6 * 5.0F / 45.0F);
        var7.g = new f7(var3.getRotationX() - var6, var3.getRotationY(), var3.getRotationZ() - var6 * 5.0F / 45.0F);
        return var7;
    }

    void b(em var1) {
        try {
            if (ClientProxy.IS_PRELOADING) {
                return;
            }
        } catch (RuntimeException var16) {
            throw a(var16);
        }

        try {
            if (this.a.func_147113_T()) {
                return;
            }
        } catch (RuntimeException var24) {
            throw a(var24);
        }

        f8 var2 = (f8)var1;

        try {
            if (!dh.b(var2)) {
                return;
            }
        } catch (RuntimeException var23) {
            throw a(var23);
        }

        f_ var3 = var2.a(false);

        try {
            if (var3 == null) {
                return;
            }
        } catch (RuntimeException var22) {
            throw a(var22);
        }

        AnimationProcessor var4 = this.getAnimationProcessor();
        float var5 = var3.aE;
        var4.getBone("rotationTool").setRotationX(var5);
        IBone var6 = var4.getBone("head");
        IBone var7 = var4.getBone("upperBody");
        IBone var8 = var4.getBone("boobs");

        label87: {
            try {
                if (var5 > 0.0F) {
                    var7.setRotationX(-1.1111112F * var5);
                    var6.setRotationX(0.1333F * var5);
                    var8.setRotationX(var5 * 22.5F / 45.0F);
                    break label87;
                }
            } catch (RuntimeException var21) {
                throw a(var21);
            }

            var7.setRotationX(-1.6666666F * var5);
            var6.setRotationX(var5 * 0.666F);
        }

        float var9 = be.a(var2.T, var2.af);
        float var10 = be.a(var2.ai, var2.W);
        float var11 = Minecraft.func_175610_ah();
        if (var11 == 0.0F) {
            var11 = 1.0F;
        }

        float var10000;
        float var10001;
        label112: {
            try {
                var10000 = 7.0F;
                if (Math.abs(var9) < 7.0F) {
                    var10001 = var9;
                    break label112;
                }
            } catch (RuntimeException var20) {
                throw a(var20);
            }

            try {
                if (var9 > 0.0F) {
                    var10001 = 7.0F;
                    break label112;
                }
            } catch (RuntimeException var19) {
                throw a(var19);
            }

            var10001 = -7.0F;
        }

        float var12 = var10000 * var10001 * (1.0F / var11);

        label113: {
            try {
                var10000 = 7.0F;
                if (Math.abs(var10) < 7.0F) {
                    var10001 = var10;
                    break label113;
                }
            } catch (RuntimeException var18) {
                throw a(var18);
            }

            try {
                if (var10 > 0.0F) {
                    var10001 = 7.0F;
                    break label113;
                }
            } catch (RuntimeException var17) {
                throw a(var17);
            }

            var10001 = -7.0F;
        }

        float var13 = var10000 * var10001 * (1.0F / var11);
        float var14 = var2.T + var12;
        float var15 = var2.ai + var13;
        var6.setRotationY(var6.getRotationY() + var14);
        var6.setRotationX(var6.getRotationX() + var15);
        var2.T = var14;
        var2.ai = var15;
    }

    public static void a(em var0, AnimationProcessor var1, float var2) {
        try {
            if (ClientProxy.IS_PRELOADING) {
                return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        boolean var3 = dh.a(var0);
        e(var1, var3);
        f(var1, var3);
        b(var0, var1, var2);
    }

    static void b(em param0, AnimationProcessor param1, float param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: instanceof com/trolmastercard/sexmod/f8
        // 04: ifne 0c
        // 07: return
        // 08: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b: athrow
        // 0c: bipush 0
        // 0d: istore 3
        // 0e: iload 3
        // 0f: bipush 3
        // 10: if_icmpge 59
        // 13: aload 1
        // 14: new java/lang/StringBuilder
        // 17: dup
        // 18: invokespecial java/lang/StringBuilder.<init> ()V
        // 1b: ldc "cockStage"
        // 1d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 20: iload 3
        // 21: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
        // 24: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 27: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 2a: astore 4
        // 2c: aload 4
        // 2e: ifnull 53
        // 31: aload 4
        // 33: iload 3
        // 34: aload 0
        // 35: checkcast com/trolmastercard/sexmod/f8
        // 38: getfield com/trolmastercard/sexmod/f8.an I
        // 3b: if_icmple 4d
        // 3e: goto 45
        // 41: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 44: athrow
        // 45: bipush 1
        // 46: goto 4e
        // 49: invokestatic com/trolmastercard/sexmod/ce.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4c: athrow
        // 4d: bipush 0
        // 4e: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 53: iinc 3 1
        // 56: goto 0e
        // 59: return
        // try (0 -> 4): 4 java/lang/RuntimeException
        // try (22 -> 30): 31 java/lang/RuntimeException
        // try (24 -> 35): 35 java/lang/RuntimeException
    }

    static void f(AnimationProcessor var0, boolean var1) {
        IBone var10000;
        boolean var10001;
        label16: {
            try {
                var10000 = var0.getBone("skirt");
                if (!var1) {
                    var10001 = true;
                    break label16;
                }
            } catch (RuntimeException var2) {
                throw a(var2);
            }

            var10001 = false;
        }

        var10000.setHidden(var10001);
    }

    static void e(AnimationProcessor var0, boolean var1) {
        IBone var10000;
        boolean var10001;
        label28: {
            try {
                var0.getBone("cheekRBelowSkirt").setHidden(var1);
                var0.getBone("cheekLBelowSkirt").setHidden(var1);
                var0.getBone("sideRNoSkirt").setHidden(var1);
                var10000 = var0.getBone("sideRSkirt");
                if (!var1) {
                    var10001 = true;
                    break label28;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            var10001 = false;
        }

        label21: {
            try {
                var10000.setHidden(var10001);
                var0.getBone("sideLNoSkirt").setHidden(var1);
                var10000 = var0.getBone("sideLSkirt");
                if (!var1) {
                    var10001 = true;
                    break label21;
                }
            } catch (RuntimeException var2) {
                throw a(var2);
            }

            var10001 = false;
        }

        var10000.setHidden(var10001);
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }

    private static class a {
        private f7 c;
        private f7 g;
        private f7 h;
        private f7 b;
        private float f = 1.0F;
        private float a = 1.0F;
        private float e = 0.0F;
        private float d = 0.0F;

        private a() {
        }

        static ce.a a(ce.a var0, ce.a var1, float var2) {
            ce.a var3 = new ce.a();
            var3.c = b6.a(var0.c, var1.c, var2);
            var3.g = b6.a(var0.g, var1.g, var2);
            var3.h = b6.a(var0.h, var1.h, var2);
            var3.b = b6.a(var0.b, var1.b, var2);
            var3.f = b6.a(var0.f, var1.f, var2);
            var3.a = b6.a(var0.a, var1.a, var2);
            var3.e = b6.a(var0.e, var1.e, var2);
            var3.d = b6.a(var0.d, var1.d, var2);
            return var3;
        }
    }
}
