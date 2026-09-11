package com.trolmastercard.sexmod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public abstract class cv<T extends em> extends cm<T> implements gs {
    public static final List<String> b = Arrays.asList(
        "braStringMidStartR",
        "braStringMidMid1R",
        "braStringMidMid2R",
        "braStringMidMid3R",
        "braStringMidEndR",
        "braStringBackR",
        "braStringRightEndR",
        "braStringRightStartR",
        "braStringRightL",
        "braStringMidMid1L",
        "braStringMidMid2L",
        "braStringMidMid3L",
        "braStringMidEndL",
        "braStringBackL",
        "braStringLeftEndL",
        "braStringLeftStartL",
        "braStringMidStartL",
        "braStringRightR"
    );
    public static final List<String> e = Arrays.asList("boyCam", "girlCam");
    public static boolean d = true;
    protected ResourceLocation[] c = this.a();
    protected Minecraft a = Minecraft.func_71410_x();

    protected cv() {
    }

    protected abstract ResourceLocation[] a();

    public abstract ResourceLocation b();

    public abstract ResourceLocation b(em var1);

    public ResourceLocation c(em var1) {
        return this.b(var1);
    }

    public ResourceLocation a(em var1) {
        try {
            if (var1.field_70170_p instanceof gj) {
                return this.c[0];
            }
        } catch (RuntimeException var2) {
            throw b(var2);
        }

        try {
            if ((Integer)var1.func_184212_Q().func_187225_a(em.D) > this.c.length) {
                System.out.println("Girl doesn't have an outfit Nr." + var1.func_184212_Q().func_187225_a(em.D) + " so im just making her nude lol");
                return this.c[0];
            }
        } catch (RuntimeException var3) {
            throw b(var3);
        }

        return this.c[var1.func_184212_Q().func_187225_a(em.D)];
    }

    public ResourceLocation g(em var1) {
        return this.b();
    }

    @Override
    public void setMolangQueries(IAnimatable var1, double var2) {
        try {
            if (Minecraft.func_71410_x().field_71441_e != null) {
                super.setMolangQueries(var1, var2);
            }
        } catch (RuntimeException var4) {
            throw b(var4);
        }
    }

    public void a(T param1, Integer param2, AnimationEvent param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: aload 1
        // 002: aload 2
        // 003: aload 3
        // 004: invokespecial com/trolmastercard/sexmod/cm.setLivingAnimations (Lsoftware/bernie/geckolib3/core/IAnimatable;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
        // 007: aload 0
        // 008: invokevirtual com/trolmastercard/sexmod/cv.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 00b: astore 4
        // 00d: aload 0
        // 00e: aload 1
        // 00f: aload 4
        // 011: invokevirtual com/trolmastercard/sexmod/cv.a (Lcom/trolmastercard/sexmod/em;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;)V
        // 014: aload 1
        // 015: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 018: instanceof com/trolmastercard/sexmod/gj
        // 01b: ifeq 023
        // 01e: return
        // 01f: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 022: athrow
        // 023: aload 1
        // 024: invokevirtual com/trolmastercard/sexmod/em.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 027: getstatic com/trolmastercard/sexmod/em.G Lnet/minecraft/network/datasync/DataParameter;
        // 02a: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 02d: checkcast java/lang/Boolean
        // 030: invokevirtual java/lang/Boolean.booleanValue ()Z
        // 033: ifeq 060
        // 036: aload 1
        // 037: aload 1
        // 038: invokevirtual com/trolmastercard/sexmod/em.o ()Lnet/minecraft/util/math/Vec3d;
        // 03b: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 03e: aload 1
        // 03f: invokevirtual com/trolmastercard/sexmod/em.o ()Lnet/minecraft/util/math/Vec3d;
        // 042: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 045: aload 1
        // 046: invokevirtual com/trolmastercard/sexmod/em.o ()Lnet/minecraft/util/math/Vec3d;
        // 049: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 04c: aload 1
        // 04d: invokevirtual com/trolmastercard/sexmod/em.I ()Ljava/lang/Float;
        // 050: invokevirtual java/lang/Float.floatValue ()F
        // 053: fconst_0
        // 054: bipush 3
        // 055: bipush 1
        // 056: invokevirtual com/trolmastercard/sexmod/em.func_180426_a (DDDFFIZ)V
        // 059: goto 060
        // 05c: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 05f: athrow
        // 060: aload 1
        // 061: getfield com/trolmastercard/sexmod/em.C Lsoftware/bernie/geckolib3/core/controller/AnimationController;
        // 064: ifnull 09f
        // 067: aload 1
        // 068: getfield com/trolmastercard/sexmod/em.C Lsoftware/bernie/geckolib3/core/controller/AnimationController;
        // 06b: aload 1
        // 06c: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 06f: instanceof com/trolmastercard/sexmod/gj
        // 072: ifne 08a
        // 075: goto 07c
        // 078: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 07b: athrow
        // 07c: aload 1
        // 07d: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 080: ifnonnull 094
        // 083: goto 08a
        // 086: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 089: athrow
        // 08a: ldc2_w 5.0
        // 08d: goto 09c
        // 090: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 093: athrow
        // 094: aload 1
        // 095: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 098: getfield com/trolmastercard/sexmod/fp.transitionTick I
        // 09b: i2d
        // 09c: putfield software/bernie/geckolib3/core/controller/AnimationController.transitionLengthTicks D
        // 09f: aload 0
        // 0a0: aload 1
        // 0a1: aload 4
        // 0a3: aload 3
        // 0a4: invokevirtual com/trolmastercard/sexmod/cv.a (Lcom/trolmastercard/sexmod/em;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
        // 0a7: aload 1
        // 0a8: instanceof com/trolmastercard/sexmod/e2
        // 0ab: ifeq 0ca
        // 0ae: aload 1
        // 0af: invokevirtual com/trolmastercard/sexmod/em.h ()Z
        // 0b2: ifne 0ca
        // 0b5: goto 0bc
        // 0b8: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0bb: athrow
        // 0bc: aload 1
        // 0bd: invokevirtual com/trolmastercard/sexmod/em.ah ()I
        // 0c0: ifne 0d7
        // 0c3: goto 0ca
        // 0c6: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0c9: athrow
        // 0ca: aload 0
        // 0cb: aload 4
        // 0cd: invokevirtual com/trolmastercard/sexmod/cv.a (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;)V
        // 0d0: goto 111
        // 0d3: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0d6: athrow
        // 0d7: aload 0
        // 0d8: aload 4
        // 0da: aload 1
        // 0db: getfield com/trolmastercard/sexmod/em.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 0de: getstatic com/trolmastercard/sexmod/e2.X Lnet/minecraft/network/datasync/DataParameter;
        // 0e1: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 0e4: checkcast net/minecraft/item/ItemStack
        // 0e7: aload 1
        // 0e8: getfield com/trolmastercard/sexmod/em.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 0eb: getstatic com/trolmastercard/sexmod/e2.T Lnet/minecraft/network/datasync/DataParameter;
        // 0ee: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 0f1: checkcast net/minecraft/item/ItemStack
        // 0f4: aload 1
        // 0f5: getfield com/trolmastercard/sexmod/em.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 0f8: getstatic com/trolmastercard/sexmod/e2.U Lnet/minecraft/network/datasync/DataParameter;
        // 0fb: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 0fe: checkcast net/minecraft/item/ItemStack
        // 101: aload 1
        // 102: getfield com/trolmastercard/sexmod/em.m Lnet/minecraft/network/datasync/EntityDataManager;
        // 105: getstatic com/trolmastercard/sexmod/e2.W Lnet/minecraft/network/datasync/DataParameter;
        // 108: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 10b: checkcast net/minecraft/item/ItemStack
        // 10e: invokevirtual com/trolmastercard/sexmod/cv.a (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)V
        // 111: return
        // try (8 -> 17): 17 java/lang/RuntimeException
        // try (19 -> 43): 44 java/lang/RuntimeException
        // try (46 -> 55): 56 java/lang/RuntimeException
        // try (49 -> 61): 62 java/lang/RuntimeException
        // try (58 -> 66): 66 java/lang/RuntimeException
        // try (73 -> 84): 85 java/lang/RuntimeException
        // try (81 -> 90): 91 java/lang/RuntimeException
        // try (87 -> 97): 97 java/lang/RuntimeException
    }

    public static Vec3d d(em var0) {
        return a(new Vec3d(var0.field_70142_S, var0.field_70137_T, var0.field_70136_U), var0.func_174791_d());
    }

    public static Vec3d a(em var0, Vec3d var1) {
        return a(var1, var0.func_174791_d());
    }

    public static Vec3d a(Vec3d var0, Vec3d var1) {
        Vec3d var2 = var1.func_178788_d(var0);
        Vec3d var3 = new Vec3d(Math.abs(var2.field_72450_a), Math.abs(var2.field_72448_b), Math.abs(var2.field_72449_c));
        double var4 = var3.field_72450_a / (var3.field_72450_a + var3.field_72448_b + var3.field_72449_c);
        double var6 = var3.field_72448_b / (var3.field_72450_a + var3.field_72448_b + var3.field_72449_c);
        double var8 = var3.field_72449_c / (var3.field_72450_a + var3.field_72448_b + var3.field_72449_c);

        Vec3d var10000;
        Vec3d var10001;
        byte var10002;
        label51: {
            try {
                var10000 = new Vec3d;
                var10001 = var10000;
                if (var2.field_72450_a > 0.0) {
                    var10002 = 1;
                    break label51;
                }
            } catch (RuntimeException var17) {
                throw b(var17);
            }

            var10002 = -1;
        }

        var10001./* $VF: Unable to resugar constructor */<init>(
            var10002 * var4, (var2.field_72448_b > 0.0 ? 1 : -1) * var6, (var2.field_72449_c > 0.0 ? 1 : -1) * var8
        );
        Vec3d var10 = var10000;
        double var11 = var10.field_72448_b / 2.0 + 0.5;
        float var13 = (float)b6.b(-180.0, 0.0, var11);
        if (Float.isNaN(var13)) {
            var13 = -90.0F;
        }

        label43: {
            try {
                if (var11 < 0.5) {
                    var18 = 0.0F;
                    break label43;
                }
            } catch (RuntimeException var16) {
                throw b(var16);
            }

            var18 = (float)b6.b(0.0, 16.0, -var11);
        }

        float var14 = var18;
        if (Float.isNaN(var14)) {
            var14 = 0.0F;
        }

        float var15 = (float)(4.0 - Math.sin((Math.PI / 2) + var11 * 2.0 * Math.PI) * 4.0);
        if (Float.isNaN(var15)) {
            var15 = 8.0F;
        }

        return new Vec3d(gc.c(var13), var14, var15);
    }

    void a(AnimationProcessor<T> var1, ItemStack var2, ItemStack var3, ItemStack var4, ItemStack var5) {
        cv var10000;
        AnimationProcessor var10001;
        boolean var10002;
        label40: {
            try {
                var10000 = this;
                var10001 = var1;
                if (!var2.func_190926_b()) {
                    var10002 = true;
                    break label40;
                }
            } catch (RuntimeException var8) {
                throw b(var8);
            }

            var10002 = false;
        }

        label33: {
            try {
                var10000.c(var10001, var10002);
                this.b(var1, var3.func_77973_b() instanceof ItemArmor);
                var10000 = this;
                var10001 = var1;
                if (!var4.func_190926_b()) {
                    var10002 = true;
                    break label33;
                }
            } catch (RuntimeException var7) {
                throw b(var7);
            }

            var10002 = false;
        }

        label26: {
            try {
                var10000.d(var10001, var10002);
                var10000 = this;
                var10001 = var1;
                if (!var5.func_190926_b()) {
                    var10002 = true;
                    break label26;
                }
            } catch (RuntimeException var6) {
                throw b(var6);
            }

            var10002 = false;
        }

        var10000.a(var10001, var10002);
    }

    protected void a(AnimationProcessor<T> var1) {
        this.c(var1, false);
        this.b(var1, false);
        this.d(var1, false);
        this.a(var1, false);
    }

    void c(AnimationProcessor var1, boolean var2) {
        cv var10000;
        String[] var10001;
        boolean var10002;
        label16: {
            try {
                this.a(this.c(), var2, var1);
                var10000 = this;
                var10001 = this.g();
                if (!var2) {
                    var10002 = true;
                    break label16;
                }
            } catch (RuntimeException var3) {
                throw b(var3);
            }

            var10002 = false;
        }

        var10000.a(var10001, var10002, var1);
    }

    void b(AnimationProcessor<T> var1, boolean var2) {
        cv var10000;
        String[] var10001;
        boolean var10002;
        label16: {
            try {
                this.a(this.f(), var2, var1);
                var10000 = this;
                var10001 = this.a();
                if (!var2) {
                    var10002 = true;
                    break label16;
                }
            } catch (RuntimeException var3) {
                throw b(var3);
            }

            var10002 = false;
        }

        var10000.a(var10001, var10002, var1);
    }

    void d(AnimationProcessor<T> var1, boolean var2) {
        cv var10000;
        String[] var10001;
        boolean var10002;
        label16: {
            try {
                this.a(this.h(), var2, var1);
                var10000 = this;
                var10001 = this.e();
                if (!var2) {
                    var10002 = true;
                    break label16;
                }
            } catch (RuntimeException var3) {
                throw b(var3);
            }

            var10002 = false;
        }

        var10000.a(var10001, var10002, var1);
    }

    void a(AnimationProcessor<T> var1, boolean var2) {
        cv var10000;
        String[] var10001;
        boolean var10002;
        label16: {
            try {
                this.a(this.b(), var2, var1);
                var10000 = this;
                var10001 = this.d();
                if (!var2) {
                    var10002 = true;
                    break label16;
                }
            } catch (RuntimeException var3) {
                throw b(var3);
            }

            var10002 = false;
        }

        var10000.a(var10001, var10002, var1);
    }

    void a(String[] var1, boolean var2, AnimationProcessor<T> var3) {
        for (String var7 : var1) {
            this.a(var7, var2, var3);
        }
    }

    void a(String var1, boolean var2, AnimationProcessor<T> var3) {
        try {
            if (var3.getBone(var1) == null) {
                return;
            }
        } catch (RuntimeException var4) {
            throw b(var4);
        }

        IBone var10000;
        boolean var10001;
        label22: {
            try {
                var10000 = var3.getBone(var1);
                if (!var2) {
                    var10001 = true;
                    break label22;
                }
            } catch (RuntimeException var5) {
                throw b(var5);
            }

            var10001 = false;
        }

        var10000.setHidden(var10001);
    }

    protected boolean f(T var1) {
        UUID var2 = var1.ae();

        try {
            if (var2 == null) {
                return true;
            }
        } catch (RuntimeException var6) {
            throw b(var6);
        }

        World var3 = var1.field_70170_p;
        AbstractClientPlayer var4 = (AbstractClientPlayer)var3.func_152378_a(var2);

        try {
            if (var4 == null) {
                return true;
            }
        } catch (RuntimeException var5) {
            throw b(var5);
        }

        return "default".equals(var4.func_175154_l());
    }

    void a(T param1, AnimationProcessor<T> param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: aload 1
        // 02: invokevirtual com/trolmastercard/sexmod/cv.f (Lcom/trolmastercard/sexmod/em;)Z
        // 05: istore 3
        // 06: aload 2
        // 07: ldc "rightArmAlex"
        // 09: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 0c: iload 3
        // 0d: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 12: aload 2
        // 13: ldc "rightLowerArmAlex"
        // 15: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 18: iload 3
        // 19: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 1e: aload 2
        // 1f: ldc "rightArmSteve"
        // 21: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 24: iload 3
        // 25: ifne 30
        // 28: bipush 1
        // 29: goto 31
        // 2c: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2f: athrow
        // 30: bipush 0
        // 31: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 36: aload 2
        // 37: ldc "rightLowerArmSteve"
        // 39: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 3c: iload 3
        // 3d: ifne 48
        // 40: bipush 1
        // 41: goto 49
        // 44: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 47: athrow
        // 48: bipush 0
        // 49: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 4e: aload 2
        // 4f: ldc "leftArmAlex"
        // 51: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 54: iload 3
        // 55: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 5a: aload 2
        // 5b: ldc "leftLowerArmAlex"
        // 5d: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 60: iload 3
        // 61: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 66: aload 2
        // 67: ldc "leftArmSteve"
        // 69: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 6c: iload 3
        // 6d: ifne 78
        // 70: bipush 1
        // 71: goto 79
        // 74: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 77: athrow
        // 78: bipush 0
        // 79: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 7e: aload 2
        // 7f: ldc "leftLowerArmSteve"
        // 81: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 84: iload 3
        // 85: ifne 90
        // 88: bipush 1
        // 89: goto 91
        // 8c: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 8f: athrow
        // 90: bipush 0
        // 91: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 96: aload 2
        // 97: ldc "steve"
        // 99: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 9c: astore 4
        // 9e: aload 4
        // a0: ifnull c4
        // a3: aload 4
        // a5: aload 1
        // a6: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // a9: getfield com/trolmastercard/sexmod/fp.hasPlayer Z
        // ac: ifne be
        // af: goto b6
        // b2: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // b5: athrow
        // b6: bipush 1
        // b7: goto bf
        // ba: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // bd: athrow
        // be: bipush 0
        // bf: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // c4: return
        // try (4 -> 21): 21 java/lang/RuntimeException
        // try (24 -> 32): 32 java/lang/RuntimeException
        // try (35 -> 53): 53 java/lang/RuntimeException
        // try (56 -> 64): 64 java/lang/RuntimeException
        // try (72 -> 79): 80 java/lang/RuntimeException
        // try (74 -> 84): 84 java/lang/RuntimeException
    }

    protected boolean e(T var1) {
        return true;
    }

    protected void a(T param1, AnimationProcessor<T> param2, AnimationEvent param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 04: instanceof com/trolmastercard/sexmod/gj
        // 07: ifeq 0f
        // 0a: return
        // 0b: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e: athrow
        // 0f: aload 0
        // 10: aload 1
        // 11: invokevirtual com/trolmastercard/sexmod/cv.e (Lcom/trolmastercard/sexmod/em;)Z
        // 14: ifne 1c
        // 17: return
        // 18: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1b: athrow
        // 1c: aload 1
        // 1d: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 20: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 23: if_acmpeq 4d
        // 26: aload 1
        // 27: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 2a: getstatic com/trolmastercard/sexmod/fp.ATTACK Lcom/trolmastercard/sexmod/fp;
        // 2d: if_acmpeq 4d
        // 30: goto 37
        // 33: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 36: athrow
        // 37: aload 1
        // 38: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 3b: getstatic com/trolmastercard/sexmod/fp.BOW Lcom/trolmastercard/sexmod/fp;
        // 3e: if_acmpeq 4d
        // 41: goto 48
        // 44: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 47: athrow
        // 48: return
        // 49: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4c: athrow
        // 4d: aload 3
        // 4e: ldc software/bernie/geckolib3/model/provider/data/EntityModelData
        // 50: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getExtraDataOfType (Ljava/lang/Class;)Ljava/util/List;
        // 53: bipush 0
        // 54: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
        // 59: checkcast software/bernie/geckolib3/model/provider/data/EntityModelData
        // 5c: astore 4
        // 5e: aload 2
        // 5f: ldc "neck"
        // 61: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 64: astore 5
        // 66: aload 5
        // 68: aload 4
        // 6a: getfield software/bernie/geckolib3/model/provider/data/EntityModelData.netHeadYaw F
        // 6d: ldc 0.5
        // 6f: fmul
        // 70: ldc 0.017453292
        // 72: fmul
        // 73: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 78: aload 2
        // 79: ldc "head"
        // 7b: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 7e: astore 6
        // 80: aload 6
        // 82: aload 4
        // 84: getfield software/bernie/geckolib3/model/provider/data/EntityModelData.netHeadYaw F
        // 87: ldc 0.017453292
        // 89: fmul
        // 8a: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 8f: aload 6
        // 91: aload 4
        // 93: getfield software/bernie/geckolib3/model/provider/data/EntityModelData.headPitch F
        // 96: ldc 0.017453292
        // 98: fmul
        // 99: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // 9e: aload 2
        // 9f: ldc "body"
        // a1: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // a4: ifnonnull b4
        // a7: aload 2
        // a8: ldc "dd"
        // aa: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // ad: goto ba
        // b0: invokestatic com/trolmastercard/sexmod/cv.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // b3: athrow
        // b4: aload 2
        // b5: ldc "body"
        // b7: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // ba: astore 7
        // bc: aload 7
        // be: fconst_0
        // bf: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // c4: return
        // try (0 -> 5): 5 java/lang/RuntimeException
        // try (7 -> 12): 12 java/lang/RuntimeException
        // try (14 -> 22): 23 java/lang/RuntimeException
        // try (18 -> 29): 30 java/lang/RuntimeException
        // try (25 -> 33): 33 java/lang/RuntimeException
        // try (58 -> 78): 78 java/lang/RuntimeException
    }

    public ItemStack a(em var1, String var2) {
        try {
            if (Arrays.asList(this.c()).contains(var2)) {
                return (ItemStack)var1.m.func_187225_a(e2.X);
            }
        } catch (RuntimeException var4) {
            throw b(var4);
        }

        try {
            if (Arrays.asList(this.f()).contains(var2)) {
                return (ItemStack)var1.m.func_187225_a(e2.T);
            }
        } catch (RuntimeException var6) {
            throw b(var6);
        }

        try {
            if (Arrays.asList(this.h()).contains(var2)) {
                return (ItemStack)var1.m.func_187225_a(e2.U);
            }
        } catch (RuntimeException var3) {
            throw b(var3);
        }

        try {
            if (Arrays.asList(this.b()).contains(var2)) {
                return (ItemStack)var1.m.func_187225_a(e2.W);
            }
        } catch (RuntimeException var5) {
            throw b(var5);
        }

        return ItemStack.field_190927_a;
    }

    private static RuntimeException b(RuntimeException var0) {
        return var0;
    }
}
