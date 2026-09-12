package com.schnurritv.sexmod;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;

public class C extends A {
   protected ResourceLocation[] c() {
      return new ResourceLocation[]{new ResourceLocation("sexmod", "geo/bee/bee.geo.json"), new ResourceLocation("sexmod", "geo/bee/armored.geo.json")};
   }

   public ResourceLocation a() {
      return new ResourceLocation("sexmod", "textures/entity/bee/bee.png");
   }

   public ResourceLocation b() {
      return new ResourceLocation("sexmod", "animations/bee/bee.animation.json");
   }

   public void a(bi param1, Integer param2, AnimationEvent param3) {
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
      // 04: invokespecial com/schnurritv/sexmod/A.a (Lcom/schnurritv/sexmod/bi;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
      // 07: aload 1
      // 08: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 0b: instanceof com/b
      // 0e: ifeq 16
      // 11: return
      // 12: invokestatic com/schnurritv/sexmod/C.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual com/schnurritv/sexmod/C.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
      // 1a: astore 4
      // 1c: aload 4
      // 1e: ldc "chest"
      // 20: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
      // 23: astore 5
      // 25: aload 5
      // 27: ifnonnull 2f
      // 2a: return
      // 2b: invokestatic com/schnurritv/sexmod/C.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e: athrow
      // 2f: aload 5
      // 31: aload 1
      // 32: getfield com/schnurritv/sexmod/bi.b Lsoftware/bernie/geckolib3/core/controller/AnimationController;
      // 35: invokevirtual software/bernie/geckolib3/core/controller/AnimationController.getCurrentAnimation ()Lsoftware/bernie/geckolib3/core/builder/Animation;
      // 38: ifnull 54
      // 3b: aload 1
      // 3c: getfield com/schnurritv/sexmod/bi.b Lsoftware/bernie/geckolib3/core/controller/AnimationController;
      // 3f: invokevirtual software/bernie/geckolib3/core/controller/AnimationController.getCurrentAnimation ()Lsoftware/bernie/geckolib3/core/builder/Animation;
      // 42: getfield software/bernie/geckolib3/core/builder/Animation.animationName Ljava/lang/String;
      // 45: ldc "chest"
      // 47: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 4a: ifne 5c
      // 4d: goto 54
      // 50: invokestatic com/schnurritv/sexmod/C.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: bipush 1
      // 55: goto 5d
      // 58: invokestatic com/schnurritv/sexmod/C.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5b: athrow
      // 5c: bipush 0
      // 5d: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
      // 62: return
      // try (0 -> 10): 10 java/lang/RuntimeException
      // try (19 -> 22): 22 java/lang/RuntimeException
      // try (24 -> 36): 37 java/lang/RuntimeException
      // try (29 -> 41): 41 java/lang/RuntimeException
   }

   protected void a(bi param1, AnimationProcessor param2, AnimationEvent param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 04: instanceof com/b
      // 07: ifne b6
      // 0a: aload 1
      // 0b: invokevirtual com/schnurritv/sexmod/bi.D ()Lcom/schnurritv/sexmod/bj;
      // 0e: getstatic com/schnurritv/sexmod/bj.NULL Lcom/schnurritv/sexmod/bj;
      // 11: if_acmpeq 3d
      // 14: goto 1b
      // 17: invokestatic com/schnurritv/sexmod/C.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual com/schnurritv/sexmod/bi.D ()Lcom/schnurritv/sexmod/bj;
      // 1f: getstatic com/schnurritv/sexmod/bj.ATTACK Lcom/schnurritv/sexmod/bj;
      // 22: if_acmpeq 3d
      // 25: goto 2c
      // 28: invokestatic com/schnurritv/sexmod/C.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: aload 1
      // 2d: invokevirtual com/schnurritv/sexmod/bi.D ()Lcom/schnurritv/sexmod/bj;
      // 30: getstatic com/schnurritv/sexmod/bj.BOW Lcom/schnurritv/sexmod/bj;
      // 33: if_acmpne b6
      // 36: goto 3d
      // 39: invokestatic com/schnurritv/sexmod/C.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3c: athrow
      // 3d: aload 3
      // 3e: ldc software/bernie/geckolib3/model/provider/data/EntityModelData
      // 40: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getExtraDataOfType (Ljava/lang/Class;)Ljava/util/List;
      // 43: bipush 0
      // 44: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 49: checkcast software/bernie/geckolib3/model/provider/data/EntityModelData
      // 4c: astore 4
      // 4e: aload 2
      // 4f: ldc "neck"
      // 51: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
      // 54: astore 5
      // 56: aload 5
      // 58: aload 4
      // 5a: getfield software/bernie/geckolib3/model/provider/data/EntityModelData.netHeadYaw F
      // 5d: ldc 0.5
      // 5f: fmul
      // 60: ldc 0.017453292
      // 62: fmul
      // 63: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
      // 68: aload 2
      // 69: ldc "head"
      // 6b: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
      // 6e: astore 6
      // 70: aload 6
      // 72: aload 4
      // 74: getfield software/bernie/geckolib3/model/provider/data/EntityModelData.netHeadYaw F
      // 77: ldc 0.017453292
      // 79: fmul
      // 7a: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
      // 7f: aload 6
      // 81: fconst_1
      // 82: aload 4
      // 84: getfield software/bernie/geckolib3/model/provider/data/EntityModelData.headPitch F
      // 87: ldc 0.017453292
      // 89: fmul
      // 8a: fadd
      // 8b: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
      // 90: aload 2
      // 91: ldc "body"
      // 93: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
      // 96: ifnonnull a6
      // 99: aload 2
      // 9a: ldc "dd"
      // 9c: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
      // 9f: goto ac
      // a2: invokestatic com/schnurritv/sexmod/C.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a5: athrow
      // a6: aload 2
      // a7: ldc "body"
      // a9: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
      // ac: astore 7
      // ae: aload 7
      // b0: fconst_0
      // b1: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
      // b6: return
      // try (0 -> 8): 9 java/lang/RuntimeException
      // try (4 -> 15): 16 java/lang/RuntimeException
      // try (11 -> 22): 23 java/lang/RuntimeException
      // try (48 -> 70): 70 java/lang/RuntimeException
   }

   public String[] d() {
      return new String[]{"armorHelmet"};
   }

   public String[] g() {
      return new String[]{"band", "feeler", "feeler2", "brow", "brow2", "brow3", "brow4"};
   }

   public String[] a() {
      return new String[]{"armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs"};
   }

   public String[] c() {
      return new String[]{"boobsFlesh", "upperBodyL", "upperBodyR"};
   }

   public String[] e() {
      return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip"};
   }

   public String[] f() {
      return new String[]{"sideL", "sideR", "fleshL", "fleshR", "vagina", "curvesL", "curvesR", "kneeL", "kneeR"};
   }

   public String[] h() {
      return new String[]{"armorShoesL", "armorShoesR"};
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
