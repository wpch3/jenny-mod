package com.trolmastercard.sexmod;

import javax.vecmath.Vector3f;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class cr extends cv {
    fp[] f = new fp[]{fp.STARTDOGGY, fp.DOGGYCUM, fp.DOGGYSLOW, fp.DOGGYFAST, fp.DOGGYCUM, fp.DOGGYSTART, fp.WAITDOGGY};

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{
            new ResourceLocation("sexmod", "geo/slime/nude.geo.json"),
            new ResourceLocation("sexmod", "geo/slime/armored.geo.json"),
            new ResourceLocation("sexmod", "geo/slime/dressed.geo.json")
        };
    }

    @Override
    public ResourceLocation a(em var1) {
        try {
            if (var1.field_70170_p instanceof gj) {
                return this.c[0];
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            if ((Integer)var1.func_184212_Q().func_187225_a(em.D) > this.c.length) {
                System.out.println("Girl doesn't have an outfit Nr." + var1.func_184212_Q().func_187225_a(em.D) + " so im just making her nude lol");
                return this.c[0];
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        try {
            if (var1 instanceof ec) {
                return this.c[var1.func_184212_Q().func_187225_a(em.D)];
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        try {
            if ((Integer)var1.func_184212_Q().func_187225_a(em.D) == 1) {
                return this.c[2];
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        return this.c[0];
    }

    @Override
    public ResourceLocation b() {
        return new ResourceLocation("sexmod", "textures/entity/slime/slime.png");
    }

    @Override
    public ResourceLocation b(em var1) {
        return new ResourceLocation("sexmod", "animations/slime/slime.animation.json");
    }

    @Override
    public void a(em param1, Integer param2, AnimationEvent param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: aload 1
        // 02: aload 2
        // 03: aload 3
        // 04: invokespecial com/trolmastercard/sexmod/cv.a (Lcom/trolmastercard/sexmod/em;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
        // 07: aload 0
        // 08: invokevirtual com/trolmastercard/sexmod/cr.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 0b: astore 4
        // 0d: aload 1
        // 0e: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 11: instanceof com/trolmastercard/sexmod/gj
        // 14: ifne 90
        // 17: aload 4
        // 19: ldc "bedSlime"
        // 1b: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 1e: ifnull 90
        // 21: goto 28
        // 24: invokestatic com/trolmastercard/sexmod/cr.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 27: athrow
        // 28: aload 4
        // 2a: ldc "bedSlimeLayer"
        // 2c: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 2f: ifnull 90
        // 32: goto 39
        // 35: invokestatic com/trolmastercard/sexmod/cr.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 38: athrow
        // 39: aload 4
        // 3b: ldc "bedSlime"
        // 3d: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 40: aload 0
        // 41: getfield com/trolmastercard/sexmod/cr.f [Lcom/trolmastercard/sexmod/fp;
        // 44: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
        // 47: aload 1
        // 48: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 4b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
        // 50: ifne 62
        // 53: goto 5a
        // 56: invokestatic com/trolmastercard/sexmod/cr.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 59: athrow
        // 5a: bipush 1
        // 5b: goto 63
        // 5e: invokestatic com/trolmastercard/sexmod/cr.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 61: athrow
        // 62: bipush 0
        // 63: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 68: aload 4
        // 6a: ldc "bedSlimeLayer"
        // 6c: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 6f: aload 0
        // 70: getfield com/trolmastercard/sexmod/cr.f [Lcom/trolmastercard/sexmod/fp;
        // 73: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
        // 76: aload 1
        // 77: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 7a: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
        // 7f: ifne 8a
        // 82: bipush 1
        // 83: goto 8b
        // 86: invokestatic com/trolmastercard/sexmod/cr.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 89: athrow
        // 8a: bipush 0
        // 8b: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 90: aload 1
        // 91: instanceof com/trolmastercard/sexmod/ei
        // 94: ifeq 9c
        // 97: return
        // 98: invokestatic com/trolmastercard/sexmod/cr.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 9b: athrow
        // 9c: aload 0
        // 9d: bipush 1
        // 9e: anewarray 194
        // a1: dup
        // a2: bipush 0
        // a3: ldc "head"
        // a5: aastore
        // a6: ldc "hat"
        // a8: invokevirtual com/trolmastercard/sexmod/cr.a ([Ljava/lang/String;Ljava/lang/String;)V
        // ab: return
        // try (8 -> 16): 17 java/lang/RuntimeException
        // try (12 -> 23): 24 java/lang/RuntimeException
        // try (19 -> 36): 37 java/lang/RuntimeException
        // try (26 -> 41): 41 java/lang/RuntimeException
        // try (44 -> 57): 57 java/lang/RuntimeException
        // try (61 -> 65): 65 java/lang/RuntimeException
    }

    void a(String[] var1, String var2) {
        AnimationProcessor var3 = this.getAnimationProcessor();
        IBone var4 = var3.getBone(var2);
        IBone[] var5 = new IBone[var1.length];
        int var6 = 0;

        try {
            while (var6 < var5.length) {
                var5[var6] = var3.getBone(var1[var6]);
                var6++;
            }
        } catch (RuntimeException var12) {
            throw a(var12);
        }

        Vector3f var13 = new Vector3f(0.0F, 0.0F, 0.0F);
        Vector3f var7 = new Vector3f(0.0F, 0.0F, 0.0F);

        for (IBone var11 : var5) {
            var13.add(new Vector3f(var11.getRotationX(), var11.getRotationY(), var11.getRotationZ()));
            var7.add(new Vector3f(var11.getPositionX(), var11.getPositionY(), var11.getPositionZ()));
        }

        var4.setRotationX(var13.x);
        var4.setRotationY(var13.y);
        var4.setRotationZ(var13.z);
        var4.setPositionX(var7.x);
        var4.setPositionY(var7.y);
        var4.setPositionZ(var7.z);
        var4.setPositionZ(var7.z);
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] g() {
        return new String[]{"bigblob"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs"};
    }

    @Override
    public String[] a() {
        return new String[]{"boobsFlesh", "upperBodyL", "upperBodyR", "cloth"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip"};
    }

    @Override
    public String[] e() {
        return new String[]{"fleshL", "fleshR", "vagina", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
