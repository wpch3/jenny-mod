package com.trolmastercard.sexmod;

import java.util.HashMap;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

public class cx extends cv {
    HashMap<Integer, float[]> f = new HashMap<Integer, float[]>() {
        {
            this.put(0, new float[]{0.0F, -1.2F, 1.2F});
            this.put(-90, new float[]{2.0F, -71.56F, -68.0F});
            this.put(90, new float[]{-2.0F, 68.0F, 70.5F});
        }
    };

    public cx() {
        this.c = this.a();
    }

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{new ResourceLocation("sexmod", "geo/ellie/nude.geo.json"), new ResourceLocation("sexmod", "geo/ellie/dressed.geo.json")};
    }

    @Override
    public ResourceLocation b() {
        return new ResourceLocation("sexmod", "textures/entity/ellie/ellie.png");
    }

    @Override
    public ResourceLocation b(em var1) {
        return new ResourceLocation("sexmod", "animations/ellie/ellie.animation.json");
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
        // 000: aload 0
        // 001: aload 1
        // 002: aload 2
        // 003: aload 3
        // 004: invokespecial com/trolmastercard/sexmod/cv.a (Lcom/trolmastercard/sexmod/em;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
        // 007: aload 1
        // 008: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 00b: instanceof com/trolmastercard/sexmod/gj
        // 00e: ifeq 016
        // 011: return
        // 012: invokestatic com/trolmastercard/sexmod/cx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 015: athrow
        // 016: aload 1
        // 017: instanceof com/trolmastercard/sexmod/ei
        // 01a: ifeq 022
        // 01d: return
        // 01e: invokestatic com/trolmastercard/sexmod/cx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 021: athrow
        // 022: aload 1
        // 023: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 026: getstatic com/trolmastercard/sexmod/fp.SITDOWNIDLE Lcom/trolmastercard/sexmod/fp;
        // 029: if_acmpeq 031
        // 02c: return
        // 02d: invokestatic com/trolmastercard/sexmod/cx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 030: athrow
        // 031: aload 1
        // 032: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 035: aload 1
        // 036: ldc2_w 15.0
        // 039: invokevirtual net/minecraft/world/World.func_72890_a (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
        // 03c: astore 4
        // 03e: aload 4
        // 040: ifnonnull 048
        // 043: return
        // 044: invokestatic com/trolmastercard/sexmod/cx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 047: athrow
        // 048: aload 0
        // 049: invokevirtual com/trolmastercard/sexmod/cx.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 04c: ldc "head"
        // 04e: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 051: astore 5
        // 053: aload 1
        // 054: invokevirtual com/trolmastercard/sexmod/em.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 057: aload 4
        // 059: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 05c: invokevirtual net/minecraft/util/math/Vec3d.func_178788_d (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 05f: astore 6
        // 061: aload 1
        // 062: invokevirtual com/trolmastercard/sexmod/em.I ()Ljava/lang/Float;
        // 065: invokevirtual java/lang/Float.floatValue ()F
        // 068: invokestatic java/lang/Math.round (F)I
        // 06b: istore 7
        // 06d: iload 7
        // 06f: sipush 180
        // 072: if_icmpne 0f3
        // 075: aload 6
        // 077: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 07a: aload 6
        // 07c: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 07f: invokestatic java/lang/Math.atan2 (DD)D
        // 082: d2f
        // 083: ldc 1.2
        // 085: fmul
        // 086: fstore 8
        // 088: fload 8
        // 08a: fconst_0
        // 08b: fcmpl
        // 08c: ifle 0a0
        // 08f: ldc 1.5
        // 091: ldc 3.14
        // 093: fload 8
        // 095: invokestatic java/lang/Math.min (FF)F
        // 098: invokestatic java/lang/Math.max (FF)F
        // 09b: fstore 8
        // 09d: goto 0ae
        // 0a0: ldc -3.14
        // 0a2: ldc -1.5
        // 0a4: fload 8
        // 0a6: invokestatic java/lang/Math.min (FF)F
        // 0a9: invokestatic java/lang/Math.max (FF)F
        // 0ac: fstore 8
        // 0ae: fload 8
        // 0b0: ldc 1.5
        // 0b2: fcmpl
        // 0b3: ifeq 0e3
        // 0b6: fload 8
        // 0b8: ldc 3.14
        // 0ba: fcmpl
        // 0bb: ifeq 0e3
        // 0be: goto 0c5
        // 0c1: invokestatic com/trolmastercard/sexmod/cx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0c4: athrow
        // 0c5: fload 8
        // 0c7: ldc -3.14
        // 0c9: fcmpl
        // 0ca: ifeq 0e3
        // 0cd: goto 0d4
        // 0d0: invokestatic com/trolmastercard/sexmod/cx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0d3: athrow
        // 0d4: fload 8
        // 0d6: ldc -1.5
        // 0d8: fcmpl
        // 0d9: ifne 0e9
        // 0dc: goto 0e3
        // 0df: invokestatic com/trolmastercard/sexmod/cx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e2: athrow
        // 0e3: fconst_0
        // 0e4: fstore 8
        // 0e6: goto 16c
        // 0e9: fload 8
        // 0eb: ldc 3.0
        // 0ed: fadd
        // 0ee: fstore 8
        // 0f0: goto 16c
        // 0f3: aload 0
        // 0f4: getfield com/trolmastercard/sexmod/cx.f Ljava/util/HashMap;
        // 0f7: iload 7
        // 0f9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 0fc: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
        // 0ff: checkcast [F
        // 102: bipush 1
        // 103: faload
        // 104: fstore 9
        // 106: aload 0
        // 107: getfield com/trolmastercard/sexmod/cx.f Ljava/util/HashMap;
        // 10a: iload 7
        // 10c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 10f: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
        // 112: checkcast [F
        // 115: bipush 2
        // 116: faload
        // 117: fstore 10
        // 119: aload 6
        // 11b: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 11e: aload 6
        // 120: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 123: invokestatic java/lang/Math.atan2 (DD)D
        // 126: aload 0
        // 127: getfield com/trolmastercard/sexmod/cx.f Ljava/util/HashMap;
        // 12a: iload 7
        // 12c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 12f: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
        // 132: checkcast [F
        // 135: bipush 0
        // 136: faload
        // 137: f2d
        // 138: dadd
        // 139: d2f
        // 13a: aload 1
        // 13b: invokevirtual com/trolmastercard/sexmod/em.I ()Ljava/lang/Float;
        // 13e: invokevirtual java/lang/Float.floatValue ()F
        // 141: fadd
        // 142: ldc 0.8
        // 144: fmul
        // 145: fstore 8
        // 147: fload 8
        // 149: fload 9
        // 14b: fload 10
        // 14d: invokestatic com/trolmastercard/sexmod/be.b (FFF)F
        // 150: fstore 8
        // 152: fload 8
        // 154: fload 9
        // 156: fcmpl
        // 157: ifeq 169
        // 15a: fload 8
        // 15c: fload 10
        // 15e: fcmpl
        // 15f: ifne 16c
        // 162: goto 169
        // 165: invokestatic com/trolmastercard/sexmod/cx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 168: athrow
        // 169: fconst_0
        // 16a: fstore 8
        // 16c: fload 8
        // 16e: fconst_0
        // 16f: fcmpl
        // 170: ifne 17b
        // 173: fconst_0
        // 174: goto 191
        // 177: invokestatic com/trolmastercard/sexmod/cx.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 17a: athrow
        // 17b: aload 4
        // 17d: getfield net/minecraft/entity/player/EntityPlayer.field_70163_u D
        // 180: aload 1
        // 181: getfield com/trolmastercard/sexmod/em.field_70163_u D
        // 184: dsub
        // 185: ldc2_w 0.5
        // 188: dmul
        // 189: d2f
        // 18a: ldc -0.75
        // 18c: ldc 0.75
        // 18e: invokestatic com/trolmastercard/sexmod/be.b (FFF)F
        // 191: fstore 9
        // 193: aload 5
        // 195: fload 8
        // 197: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 19c: aload 5
        // 19e: fload 9
        // 1a0: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // 1a5: return
        // try (0 -> 10): 10 java/lang/RuntimeException
        // try (12 -> 16): 16 java/lang/RuntimeException
        // try (18 -> 23): 23 java/lang/RuntimeException
        // try (31 -> 34): 34 java/lang/RuntimeException
        // try (81 -> 89): 90 java/lang/RuntimeException
        // try (85 -> 96): 97 java/lang/RuntimeException
        // try (92 -> 103): 104 java/lang/RuntimeException
        // try (160 -> 168): 169 java/lang/RuntimeException
        // try (173 -> 179): 179 java/lang/RuntimeException
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] g() {
        return new String[]{"headband"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs"};
    }

    @Override
    public String[] a() {
        return new String[]{"boobsFlesh", "upperBodyL", "upperBodyR"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip"};
    }

    @Override
    public String[] e() {
        return new String[]{"fleshL", "fleshR", "vagina", "hotpants", "slip", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
