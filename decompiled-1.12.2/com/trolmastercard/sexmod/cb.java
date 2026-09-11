package com.trolmastercard.sexmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.resource.GeckoLibCache;
import software.bernie.shadowed.eliotlash.molang.MolangParser;

public class cb extends cv {
    public static ResourceLocation h = new ResourceLocation("sexmod", "textures/entity/galath/galath.png");
    float g = 0.0F;
    long f = -1L;
    long i = -1L;

    public cb() {
        this.c = this.a();
    }

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{
            new ResourceLocation("sexmod", "geo/galath/galath.geo.json"),
            new ResourceLocation("sexmod", "geo/galath/galath.geo.json"),
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
            if (((b7)var1).b()) {
                return this.c[2];
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        return this.c[var1.func_184212_Q().func_187225_a(em.D)];
    }

    @Override
    public ResourceLocation b() {
        return h;
    }

    @Override
    public ResourceLocation b(em var1) {
        return new ResourceLocation("sexmod", "animations/galath/galath.animation.json");
    }

    @Override
    protected boolean e(em var1) {
        try {
            if (!(var1 instanceof f_)) {
                return true;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        f_ var2 = (f_)var1;

        try {
            if (var2.k()) {
                return true;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        try {
            return var2.M() == null;
        } catch (RuntimeException var3) {
            throw a(var3);
        }
    }

    @Override
    public void a(em var1, Integer var2, AnimationEvent var3) {
        try {
            this.k(var1);
            super.a(var1, var2, var3);
            this.a(var1);
            this.h(var1);
            this.f(var1);
            this.b(var1);
            this.e(var1);
            this.g(var1);
            this.j(var1);
            this.a();
            this.c(var1);
            this.i(var1);
            this.d(var1);
            if (!(var1 instanceof f_)) {
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        f_ var4 = (f_)var1;

        try {
            var4.aE = this.getAnimationProcessor().getBone("head").getRotationX();
            if (var4.b()) {
                ce.a(var4, this.getAnimationProcessor(), var3.getPartialTick());
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }
    }

    void i(em param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 1
        // 001: bipush 1
        // 002: anewarray 191
        // 005: dup
        // 006: bipush 0
        // 007: getstatic com/trolmastercard/sexmod/fp.PUSSY_LICKING Lcom/trolmastercard/sexmod/fp;
        // 00a: aastore
        // 00b: invokestatic com/trolmastercard/sexmod/fp.a (Lcom/trolmastercard/sexmod/em;[Lcom/trolmastercard/sexmod/fp;)Z
        // 00e: ifne 016
        // 011: return
        // 012: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 015: athrow
        // 016: aload 1
        // 017: instanceof com/trolmastercard/sexmod/f_
        // 01a: ifne 022
        // 01d: return
        // 01e: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 021: athrow
        // 022: aload 0
        // 023: getfield com/trolmastercard/sexmod/cb.a Lnet/minecraft/client/Minecraft;
        // 026: invokevirtual net/minecraft/client/Minecraft.func_147113_T ()Z
        // 029: ifeq 031
        // 02c: return
        // 02d: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 030: athrow
        // 031: aload 0
        // 032: invokevirtual com/trolmastercard/sexmod/cb.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 035: astore 2
        // 036: aload 2
        // 037: ldc "head"
        // 039: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 03c: astore 3
        // 03d: aload 0
        // 03e: getfield com/trolmastercard/sexmod/cb.a Lnet/minecraft/client/Minecraft;
        // 041: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
        // 044: aload 0
        // 045: getfield com/trolmastercard/sexmod/cb.a Lnet/minecraft/client/Minecraft;
        // 048: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 04b: getfield net/minecraft/client/entity/EntityPlayerSP.field_70173_aa I
        // 04e: i2f
        // 04f: fadd
        // 050: fstore 4
        // 052: aload 0
        // 053: aload 1
        // 054: checkcast com/trolmastercard/sexmod/f_
        // 057: fload 4
        // 059: invokevirtual com/trolmastercard/sexmod/cb.a (Lcom/trolmastercard/sexmod/f_;F)Lcom/trolmastercard/sexmod/f7;
        // 05c: astore 5
        // 05e: aload 3
        // 05f: aload 3
        // 060: invokeinterface software/bernie/geckolib3/core/processor/IBone.getRotationX ()F 1
        // 065: aload 5
        // 067: getfield com/trolmastercard/sexmod/f7.a F
        // 06a: fadd
        // 06b: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // 070: aload 3
        // 071: aload 3
        // 072: invokeinterface software/bernie/geckolib3/core/processor/IBone.getRotationY ()F 1
        // 077: aload 5
        // 079: getfield com/trolmastercard/sexmod/f7.c F
        // 07c: fadd
        // 07d: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 082: aload 3
        // 083: aload 3
        // 084: invokeinterface software/bernie/geckolib3/core/processor/IBone.getRotationZ ()F 1
        // 089: aload 5
        // 08b: getfield com/trolmastercard/sexmod/f7.b F
        // 08e: fadd
        // 08f: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationZ (F)V 2
        // 094: aload 1
        // 095: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 098: getstatic com/trolmastercard/sexmod/fp.PUSSY_LICKING Lcom/trolmastercard/sexmod/fp;
        // 09b: if_acmpne 0af
        // 09e: aload 1
        // 09f: checkcast com/trolmastercard/sexmod/f_
        // 0a2: getfield com/trolmastercard/sexmod/f_.a5 Z
        // 0a5: ifeq 0b4
        // 0a8: goto 0af
        // 0ab: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ae: athrow
        // 0af: return
        // 0b0: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b3: athrow
        // 0b4: fload 4
        // 0b6: ldc 0.3
        // 0b8: fmul
        // 0b9: f2d
        // 0ba: invokestatic java/lang/Math.sin (D)D
        // 0bd: ldc2_w 10.0
        // 0c0: dmul
        // 0c1: d2f
        // 0c2: fstore 6
        // 0c4: fload 6
        // 0c6: fconst_0
        // 0c7: fcmpl
        // 0c8: ifle 0db
        // 0cb: aload 0
        // 0cc: getfield com/trolmastercard/sexmod/cb.g F
        // 0cf: fconst_0
        // 0d0: fcmpg
        // 0d1: iflt 0f9
        // 0d4: goto 0db
        // 0d7: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0da: athrow
        // 0db: fload 6
        // 0dd: fconst_0
        // 0de: fcmpg
        // 0df: ifge 10a
        // 0e2: goto 0e9
        // 0e5: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e8: athrow
        // 0e9: aload 0
        // 0ea: getfield com/trolmastercard/sexmod/cb.g F
        // 0ed: fconst_0
        // 0ee: fcmpl
        // 0ef: ifle 10a
        // 0f2: goto 0f9
        // 0f5: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0f8: athrow
        // 0f9: aload 1
        // 0fa: getstatic com/trolmastercard/sexmod/c.GIRLS_ALLIE_LIPSOUND [Lnet/minecraft/util/SoundEvent;
        // 0fd: invokestatic com/trolmastercard/sexmod/c.a ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
        // 100: invokevirtual com/trolmastercard/sexmod/em.a (Lnet/minecraft/util/SoundEvent;)V
        // 103: goto 10a
        // 106: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 109: athrow
        // 10a: aload 0
        // 10b: fload 6
        // 10d: putfield com/trolmastercard/sexmod/cb.g F
        // 110: return
        // try (0 -> 10): 10 java/lang/RuntimeException
        // try (12 -> 16): 16 java/lang/RuntimeException
        // try (18 -> 23): 23 java/lang/RuntimeException
        // try (48 -> 77): 78 java/lang/RuntimeException
        // try (73 -> 81): 81 java/lang/RuntimeException
        // try (92 -> 101): 102 java/lang/RuntimeException
        // try (96 -> 108): 109 java/lang/RuntimeException
        // try (104 -> 116): 117 java/lang/RuntimeException
        // try (111 -> 123): 124 java/lang/RuntimeException
    }

    f7 a(f_ var1, float var2) {
        return b6.a(this.a(var2), f7.d, var1.b(this.a.func_184121_ak()));
    }

    f7 a(float var1) {
        return new f7((float)Math.sin(var1 * 0.3F) * gc.c(10.0F), (float)Math.sin(var1 * 0.15F) * gc.c(7.0F), (float)Math.sin(var1 * -0.15) * gc.c(7.0F));
    }

    void c(em var1) {
        try {
            if (!(var1 instanceof f_)) {
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        f_ var2 = (f_)var1;
        AnimationProcessor var3 = this.getAnimationProcessor();
        IBone var4 = var3.getBone("body");
        var2.bw = var4.getRotationY();
        var2.bm = var4.getScaleY();
    }

    void d(em var1) {
        try {
            if (var1.C.getAnimationState() != AnimationState.Transitioning) {
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        AnimationProcessor var2 = this.getAnimationProcessor();
        fp var3 = var1.y();
        if (var3 == fp.HUG_MANG) {
            IBone var4 = var2.getBone("body2");

            try {
                if (var4 == null) {
                    return;
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }

            var4.setPositionX(0.0F);
            var4.setPositionY(-0.53F);
            var4.setPositionZ(-40.05F);
        }
    }

    void k(em var1) {
        try {
            if (ClientProxy.IS_PRELOADING) {
                return;
            }
        } catch (RuntimeException var13) {
            throw a(var13);
        }

        try {
            if (var1.y() != fp.MASTERBATE) {
                return;
            }
        } catch (RuntimeException var14) {
            throw a(var14);
        }

        Object var2 = var1.z();
        if (var2 == null) {
            var2 = this.a.field_71439_g;
        }

        MolangParser var3 = GeckoLibCache.getInstance().parser;
        Vec3d var4 = ak.b(var1, (EntityPlayer)var2, this.a.func_184121_ak()).func_178787_e(var1.b("head"));
        float var5 = (float)gc.b(Math.atan2(var4.field_72449_c, var4.field_72450_a)) - var1.I();
        float var6 = (float)gc.b(Math.atan2(var4.field_72448_b, Math.sqrt(var4.field_72450_a * var4.field_72450_a + var4.field_72449_c * var4.field_72449_c)));
        double var7 = Math.abs(var4.field_72450_a) + Math.abs(var4.field_72448_b) + Math.abs(var4.field_72449_c);
        double var9 = var7 * 7.0 + -20.0;
        double var11 = var7 * 5.0 + -20.0;
        var3.setValue("pitch", var9 + var6 - 80.0);
        var3.setValue("armpitch", var11 + var6 + -110.0);
        var3.setValue("armyaw", var5 + 80.0F);
        var3.setValue("yaw", var5 + 90.0F);
    }

    void a() {
        try {
            if (ClientProxy.IS_PRELOADING) {
                return;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        IBone var10000;
        boolean var10001;
        label46: {
            try {
                var10000 = this.getAnimationProcessor().getBone("futaCock");
                if (!a_.e) {
                    var10001 = true;
                    break label46;
                }
            } catch (RuntimeException var4) {
                throw a(var4);
            }

            var10001 = false;
        }

        label39: {
            try {
                var10000.setHidden(var10001);
                var10000 = this.getAnimationProcessor().getBone("futaBallLL");
                if (!a_.e) {
                    var10001 = true;
                    break label39;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            var10001 = false;
        }

        label32: {
            try {
                var10000.setHidden(var10001);
                var10000 = this.getAnimationProcessor().getBone("futaBallLR");
                if (!a_.e) {
                    var10001 = true;
                    break label32;
                }
            } catch (RuntimeException var2) {
                throw a(var2);
            }

            var10001 = false;
        }

        var10000.setHidden(var10001);
    }

    void j(em var1) {
        try {
            if (!(var1 instanceof ei)) {
                return;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        this.getAnimationProcessor().getBone("coin").setHidden(true);
    }

    void g(em var1) {
        IBone var10000;
        boolean var10001;
        label16: {
            try {
                var10000 = this.getAnimationProcessor().getBone("wings");
                if (!((b7)var1).a()) {
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

    void e(em param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/cb.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 04: astore 2
        // 05: aload 2
        // 06: ldc "nippleR"
        // 08: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 0b: astore 3
        // 0c: aload 2
        // 0d: ldc "nippleL"
        // 0f: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 12: astore 4
        // 14: aload 2
        // 15: ldc "braBoobL"
        // 17: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 1a: astore 5
        // 1c: aload 2
        // 1d: ldc "braBoobR"
        // 1f: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 22: astore 6
        // 24: aload 2
        // 25: ldc "slip"
        // 27: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 2a: astore 7
        // 2c: aload 1
        // 2d: checkcast com/trolmastercard/sexmod/b7
        // 30: invokeinterface com/trolmastercard/sexmod/b7.c ()Z 1
        // 35: istore 8
        // 37: aload 1
        // 38: bipush 3
        // 39: anewarray 191
        // 3c: dup
        // 3d: bipush 0
        // 3e: getstatic com/trolmastercard/sexmod/fp.PUSSY_LICKING Lcom/trolmastercard/sexmod/fp;
        // 41: aastore
        // 42: dup
        // 43: bipush 1
        // 44: getstatic com/trolmastercard/sexmod/fp.MASTERBATE_SITTING Lcom/trolmastercard/sexmod/fp;
        // 47: aastore
        // 48: dup
        // 49: bipush 2
        // 4a: getstatic com/trolmastercard/sexmod/fp.MASTERBATE_SITTING_CUM Lcom/trolmastercard/sexmod/fp;
        // 4d: aastore
        // 4e: invokestatic com/trolmastercard/sexmod/fp.a (Lcom/trolmastercard/sexmod/em;[Lcom/trolmastercard/sexmod/fp;)Z
        // 51: istore 9
        // 53: aload 3
        // 54: ifnonnull 5c
        // 57: return
        // 58: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 5b: athrow
        // 5c: aload 5
        // 5e: ifnonnull 66
        // 61: return
        // 62: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 65: athrow
        // 66: aload 3
        // 67: iload 8
        // 69: ifne 74
        // 6c: bipush 1
        // 6d: goto 75
        // 70: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 73: athrow
        // 74: bipush 0
        // 75: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 7a: aload 4
        // 7c: iload 8
        // 7e: ifne 89
        // 81: bipush 1
        // 82: goto 8a
        // 85: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 88: athrow
        // 89: bipush 0
        // 8a: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 8f: aload 5
        // 91: iload 8
        // 93: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 98: aload 6
        // 9a: iload 8
        // 9c: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // a1: aload 7
        // a3: iload 8
        // a5: ifne b4
        // a8: iload 9
        // aa: ifeq bc
        // ad: goto b4
        // b0: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // b3: athrow
        // b4: bipush 1
        // b5: goto bd
        // b8: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // bb: athrow
        // bc: bipush 0
        // bd: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // c2: return
        // try (44 -> 47): 47 java/lang/RuntimeException
        // try (49 -> 52): 52 java/lang/RuntimeException
        // try (54 -> 59): 59 java/lang/RuntimeException
        // try (62 -> 68): 68 java/lang/RuntimeException
        // try (71 -> 83): 84 java/lang/RuntimeException
        // try (81 -> 88): 88 java/lang/RuntimeException
    }

    void b(em var1) {
        try {
            if (!(var1 instanceof f_)) {
                return;
            }
        } catch (RuntimeException var11) {
            throw a(var11);
        }

        try {
            if (!(Boolean)var1.func_184212_Q().func_187225_a(f_.bP)) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (var1.y() != fp.KNOCK_OUT_FLY) {
                return;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        IBone var2 = this.getAnimationProcessor().getBone("body");
        Vec3d var3 = new Vec3d(var1.field_70142_S, var1.field_70137_T, var1.field_70136_U);
        Vec3d var4 = var1.func_174791_d().func_178788_d(var3);

        boolean var10000;
        label45: {
            try {
                if (Math.abs(var4.field_72450_a) + Math.abs(var4.field_72449_c) < 0.01F) {
                    var10000 = true;
                    break label45;
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }

            var10000 = false;
        }

        boolean var5 = var10000;

        try {
            if (var5) {
                var2.setRotationX(gc.c(-90.0F));
                var2.setPositionY(0.0F);
                var2.setPositionZ(0.0F);
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        Vec3d var6 = d(var1);
        var2.setRotationX(-((float)var6.field_72450_a));
        var2.setPositionY((float)var6.field_72448_b);
        var2.setPositionZ((float)var6.field_72449_c);
    }

    void h(em var1) {
        try {
            if (!(var1 instanceof f_)) {
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        try {
            if (var1.y() != fp.RAPE_CHARGE) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        Vec3d var2 = d(var1);
        IBone var3 = this.getAnimationProcessor().getBone("body");
        IBone var4 = this.getAnimationProcessor().getBone("rotationTool");
        var4.setRotationX((float)var2.field_72450_a);
        var3.setPositionY((float)var2.field_72448_b);
        var3.setPositionZ((float)var2.field_72449_c);
        float var5 = (Float)var1.func_184212_Q().func_187225_a(f_.bO);
        var3.setRotationY(gc.c(var5 * 180.0F));
    }

    void f(em param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: instanceof com/trolmastercard/sexmod/f_
        // 04: ifne 0c
        // 07: return
        // 08: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b: athrow
        // 0c: aload 1
        // 0d: checkcast com/trolmastercard/sexmod/f_
        // 10: astore 2
        // 11: aload 2
        // 12: invokevirtual com/trolmastercard/sexmod/f_.y ()Lcom/trolmastercard/sexmod/fp;
        // 15: getstatic com/trolmastercard/sexmod/fp.ATTACK_SWORD Lcom/trolmastercard/sexmod/fp;
        // 18: if_acmpeq 2e
        // 1b: aload 0
        // 1c: ldc2_w -1
        // 1f: putfield com/trolmastercard/sexmod/cb.f J
        // 22: aload 0
        // 23: ldc2_w -1
        // 26: putfield com/trolmastercard/sexmod/cb.i J
        // 29: return
        // 2a: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2d: athrow
        // 2e: aload 2
        // 2f: invokevirtual com/trolmastercard/sexmod/f_.az ()I
        // 32: istore 3
        // 33: iload 3
        // 34: bipush 24
        // 36: if_icmpne 6c
        // 39: aload 0
        // 3a: getfield com/trolmastercard/sexmod/cb.f J
        // 3d: ldc2_w -1
        // 40: lcmp
        // 41: ifne 6c
        // 44: goto 4b
        // 47: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4a: athrow
        // 4b: aload 0
        // 4c: aload 0
        // 4d: getfield com/trolmastercard/sexmod/cb.a Lnet/minecraft/client/Minecraft;
        // 50: getfield net/minecraft/client/Minecraft.field_71441_e Lnet/minecraft/client/multiplayer/WorldClient;
        // 53: invokevirtual net/minecraft/client/multiplayer/WorldClient.func_82737_E ()J
        // 56: putfield com/trolmastercard/sexmod/cb.f J
        // 59: aload 0
        // 5a: aload 0
        // 5b: getfield com/trolmastercard/sexmod/cb.f J
        // 5e: ldc2_w 8
        // 61: ladd
        // 62: putfield com/trolmastercard/sexmod/cb.i J
        // 65: goto 6c
        // 68: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 6b: athrow
        // 6c: iload 3
        // 6d: i2d
        // 6e: ldc2_w 24.0
        // 71: ldc2_w 32.0
        // 74: invokestatic com/trolmastercard/sexmod/be.a (DDD)Z
        // 77: ifne 7f
        // 7a: return
        // 7b: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 7e: athrow
        // 7f: aload 0
        // 80: invokevirtual com/trolmastercard/sexmod/cb.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 83: ldc "body"
        // 85: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 88: astore 4
        // 8a: aload 2
        // 8b: aload 2
        // 8c: invokevirtual com/trolmastercard/sexmod/f_.B ()Lnet/minecraft/util/math/Vec3d;
        // 8f: invokestatic com/trolmastercard/sexmod/cb.a (Lcom/trolmastercard/sexmod/em;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 92: astore 5
        // 94: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 97: getfield net/minecraft/client/Minecraft.field_71441_e Lnet/minecraft/client/multiplayer/WorldClient;
        // 9a: invokevirtual net/minecraft/client/multiplayer/WorldClient.func_82737_E ()J
        // 9d: l2f
        // 9e: aload 0
        // 9f: getfield com/trolmastercard/sexmod/cb.a Lnet/minecraft/client/Minecraft;
        // a2: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
        // a5: fadd
        // a6: aload 0
        // a7: getfield com/trolmastercard/sexmod/cb.f J
        // aa: l2f
        // ab: fsub
        // ac: aload 0
        // ad: getfield com/trolmastercard/sexmod/cb.i J
        // b0: aload 0
        // b1: getfield com/trolmastercard/sexmod/cb.f J
        // b4: lsub
        // b5: l2f
        // b6: fdiv
        // b7: fstore 6
        // b9: aload 5
        // bb: getstatic net/minecraft/util/math/Vec3d.field_186680_a Lnet/minecraft/util/math/Vec3d;
        // be: fload 6
        // c0: f2d
        // c1: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // c4: astore 5
        // c6: aload 4
        // c8: aload 5
        // ca: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // cd: d2f
        // ce: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // d3: aload 4
        // d5: aload 5
        // d7: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // da: d2f
        // db: invokeinterface software/bernie/geckolib3/core/processor/IBone.setPositionY (F)V 2
        // e0: aload 4
        // e2: aload 5
        // e4: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // e7: d2f
        // e8: invokeinterface software/bernie/geckolib3/core/processor/IBone.setPositionZ (F)V 2
        // ed: return
        // try (0 -> 4): 4 java/lang/RuntimeException
        // try (9 -> 20): 20 java/lang/RuntimeException
        // try (25 -> 33): 34 java/lang/RuntimeException
        // try (28 -> 48): 49 java/lang/RuntimeException
        // try (51 -> 58): 58 java/lang/RuntimeException
    }

    void a(em param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: fconst_0
        // 01: fstore 2
        // 02: getstatic com/trolmastercard/sexmod/cb$a.a [I
        // 05: aload 1
        // 06: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 09: invokevirtual com/trolmastercard/sexmod/fp.ordinal ()I
        // 0c: iaload
        // 0d: tableswitch 73 1 3 27 70 70
        // 28: getstatic com/trolmastercard/sexmod/fp.BOOST Lcom/trolmastercard/sexmod/fp;
        // 2b: getfield com/trolmastercard/sexmod/fp.ticksPlaying [I
        // 2e: bipush 1
        // 2f: iaload
        // 30: bipush 13
        // 32: if_icmple 53
        // 35: goto 3c
        // 38: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3b: athrow
        // 3c: getstatic com/trolmastercard/sexmod/fp.BOOST Lcom/trolmastercard/sexmod/fp;
        // 3f: getfield com/trolmastercard/sexmod/fp.ticksPlaying [I
        // 42: bipush 1
        // 43: iaload
        // 44: bipush 40
        // 46: if_icmpge 53
        // 49: goto 50
        // 4c: invokestatic com/trolmastercard/sexmod/cb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4f: athrow
        // 50: ldc 45.0
        // 52: fstore 2
        // 53: goto 57
        // 56: return
        // 57: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 5a: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
        // 5d: fstore 3
        // 5e: aload 0
        // 5f: invokevirtual com/trolmastercard/sexmod/cb.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 62: ldc "rotationTool"
        // 64: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 67: astore 4
        // 69: aload 1
        // 6a: checkcast com/trolmastercard/sexmod/b7
        // 6d: invokeinterface com/trolmastercard/sexmod/b7.d ()Lcom/trolmastercard/sexmod/f2; 1
        // 72: astore 5
        // 74: aload 4
        // 76: aload 5
        // 78: getfield com/trolmastercard/sexmod/f2.c D
        // 7b: fload 2
        // 7c: f2d
        // 7d: dadd
        // 7e: aload 5
        // 80: getfield com/trolmastercard/sexmod/f2.d D
        // 83: fload 2
        // 84: f2d
        // 85: dadd
        // 86: fload 3
        // 87: f2d
        // 88: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 8b: d2f
        // 8c: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // 91: aload 4
        // 93: aload 5
        // 95: getfield com/trolmastercard/sexmod/f2.b D
        // 98: aload 5
        // 9a: getfield com/trolmastercard/sexmod/f2.a D
        // 9d: fload 3
        // 9e: f2d
        // 9f: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // a2: d2f
        // a3: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationZ (F)V 2
        // a8: return
        // try (2 -> 14): 15 java/lang/RuntimeException
        // try (8 -> 23): 24 java/lang/RuntimeException
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
