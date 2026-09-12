package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class F extends A {
   final float c = 60.0F;
   Minecraft d = Minecraft.func_71410_x();

   protected ResourceLocation[] c() {
      return new ResourceLocation[]{
         new ResourceLocation("sexmod", "geo/goblin/goblin.geo.json"), new ResourceLocation("sexmod", "geo/goblin/armored.geo.json")
      };
   }

   public ResourceLocation a() {
      return new ResourceLocation("sexmod", "textures/entity/goblin/goblin.png");
   }

   public ResourceLocation b() {
      return new ResourceLocation("sexmod", "animations/goblin/goblin.animation.json");
   }

   protected boolean d(bi var1) {
      try {
         if (!(var1 instanceof ct)) {
            return super.d(var1);
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      ct var2 = (ct)var1;
      UUID var3 = var2.r();
      if (var3 == null) {
         var3 = var2.a();
      }

      try {
         if (var3 == null) {
            return true;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      World var4 = var2.field_70170_p;
      AbstractClientPlayer var5 = (AbstractClientPlayer)var4.func_152378_a(var3);

      try {
         if (var5 == null) {
            return true;
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      return "default".equals(var5.func_175154_l());
   }

   public void a(bi param1, Integer param2, AnimationEvent param3) {
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
      // 004: invokespecial com/schnurritv/sexmod/A.a (Lcom/schnurritv/sexmod/bi;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
      // 007: aload 1
      // 008: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 00b: instanceof com/b
      // 00e: ifeq 016
      // 011: return
      // 012: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 015: athrow
      // 016: aload 0
      // 017: invokevirtual com/schnurritv/sexmod/F.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
      // 01a: astore 4
      // 01c: aload 1
      // 01d: instanceof com/schnurritv/sexmod/ct
      // 020: istore 5
      // 022: aload 4
      // 024: ldc "preggy"
      // 026: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
      // 029: astore 6
      // 02b: aload 6
      // 02d: aload 1
      // 02e: invokevirtual com/schnurritv/sexmod/bi.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 031: getstatic com/schnurritv/sexmod/ct.aH Lnet/minecraft/network/datasync/DataParameter;
      // 034: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 037: checkcast java/lang/Boolean
      // 03a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03d: ifne 048
      // 040: bipush 1
      // 041: goto 049
      // 044: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 047: athrow
      // 048: bipush 0
      // 049: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
      // 04e: aload 4
      // 050: ldc "body"
      // 052: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
      // 055: astore 7
      // 057: aload 4
      // 059: ldc "head"
      // 05b: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
      // 05e: astore 8
      // 060: aload 1
      // 061: invokevirtual com/schnurritv/sexmod/bi.D ()Lcom/schnurritv/sexmod/bj;
      // 064: astore 9
      // 066: aload 9
      // 068: getstatic com/schnurritv/sexmod/bj.BREEDING_SLOW_2 Lcom/schnurritv/sexmod/bj;
      // 06b: if_acmpeq 08c
      // 06e: aload 9
      // 070: getstatic com/schnurritv/sexmod/bj.BREEDING_FAST_2 Lcom/schnurritv/sexmod/bj;
      // 073: if_acmpeq 08c
      // 076: goto 07d
      // 079: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07c: athrow
      // 07d: aload 9
      // 07f: getstatic com/schnurritv/sexmod/bj.BREEDING_CUM_2 Lcom/schnurritv/sexmod/bj;
      // 082: if_acmpne 0b8
      // 085: goto 08c
      // 088: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08b: athrow
      // 08c: aload 0
      // 08d: getfield com/schnurritv/sexmod/F.d Lnet/minecraft/client/Minecraft;
      // 090: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
      // 093: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
      // 096: ifne 0b8
      // 099: goto 0a0
      // 09c: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09f: athrow
      // 0a0: aload 7
      // 0a2: aload 7
      // 0a4: invokeinterface software/bernie/geckolib3/core/processor/IBone.getPositionY ()F 1
      // 0a9: ldc 1.5
      // 0ab: fadd
      // 0ac: invokeinterface software/bernie/geckolib3/core/processor/IBone.setPositionY (F)V 2
      // 0b1: goto 0b8
      // 0b4: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b7: athrow
      // 0b8: iload 5
      // 0ba: ifne 0c2
      // 0bd: return
      // 0be: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c1: athrow
      // 0c2: aload 1
      // 0c3: checkcast com/schnurritv/sexmod/ct
      // 0c6: astore 10
      // 0c8: aload 9
      // 0ca: getstatic com/schnurritv/sexmod/bj.AWAIT_PICK_UP Lcom/schnurritv/sexmod/bj;
      // 0cd: if_acmpeq 0df
      // 0d0: aload 9
      // 0d2: getstatic com/schnurritv/sexmod/bj.VANISH Lcom/schnurritv/sexmod/bj;
      // 0d5: if_acmpne 0f0
      // 0d8: goto 0df
      // 0db: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: aload 10
      // 0e2: aload 7
      // 0e4: aload 8
      // 0e6: invokevirtual com/schnurritv/sexmod/F.a (Lcom/schnurritv/sexmod/ct;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;)V
      // 0e9: goto 0f0
      // 0ec: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ef: athrow
      // 0f0: aload 9
      // 0f2: getstatic com/schnurritv/sexmod/bj.SIT Lcom/schnurritv/sexmod/bj;
      // 0f5: if_acmpne 107
      // 0f8: aload 0
      // 0f9: aload 10
      // 0fb: aload 8
      // 0fd: invokevirtual com/schnurritv/sexmod/F.a (Lcom/schnurritv/sexmod/ct;Lsoftware/bernie/geckolib3/core/processor/IBone;)V
      // 100: goto 107
      // 103: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 106: athrow
      // 107: aload 9
      // 109: getstatic com/schnurritv/sexmod/bj.START_THROWING Lcom/schnurritv/sexmod/bj;
      // 10c: if_acmpne 149
      // 10f: aload 0
      // 110: getfield com/schnurritv/sexmod/F.d Lnet/minecraft/client/Minecraft;
      // 113: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 116: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 119: aload 10
      // 11b: invokevirtual com/schnurritv/sexmod/ct.a ()Ljava/util/UUID;
      // 11e: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 121: ifeq 13c
      // 124: goto 12b
      // 127: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12a: athrow
      // 12b: aload 0
      // 12c: aload 7
      // 12e: aload 4
      // 130: aload 10
      // 132: invokevirtual com/schnurritv/sexmod/F.a (Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/schnurritv/sexmod/ct;)V
      // 135: goto 151
      // 138: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13b: athrow
      // 13c: aload 0
      // 13d: aload 7
      // 13f: aload 4
      // 141: aload 10
      // 143: invokevirtual com/schnurritv/sexmod/F.b (Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/schnurritv/sexmod/ct;)V
      // 146: goto 151
      // 149: aload 7
      // 14b: bipush 0
      // 14c: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
      // 151: aload 7
      // 153: invokeinterface software/bernie/geckolib3/core/processor/IBone.isHidden ()Z 1
      // 158: ifne 16a
      // 15b: aload 9
      // 15d: getstatic com/schnurritv/sexmod/bj.START_THROWING Lcom/schnurritv/sexmod/bj;
      // 160: if_acmpeq 179
      // 163: goto 16a
      // 166: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 169: athrow
      // 16a: aload 9
      // 16c: getstatic com/schnurritv/sexmod/bj.THROWN Lcom/schnurritv/sexmod/bj;
      // 16f: if_acmpne 2d6
      // 172: goto 179
      // 175: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 178: athrow
      // 179: aload 1
      // 17a: invokevirtual com/schnurritv/sexmod/bi.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 17d: aload 1
      // 17e: getfield com/schnurritv/sexmod/bi.field_70142_S D
      // 181: aload 1
      // 182: getfield com/schnurritv/sexmod/bi.field_70137_T D
      // 185: aload 1
      // 186: getfield com/schnurritv/sexmod/bi.field_70136_U D
      // 189: invokevirtual net/minecraft/util/math/Vec3d.func_178786_a (DDD)Lnet/minecraft/util/math/Vec3d;
      // 18c: astore 11
      // 18e: new net/minecraft/util/math/Vec3d
      // 191: dup
      // 192: aload 11
      // 194: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 197: invokestatic java/lang/Math.abs (D)D
      // 19a: aload 11
      // 19c: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 19f: invokestatic java/lang/Math.abs (D)D
      // 1a2: aload 11
      // 1a4: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 1a7: invokestatic java/lang/Math.abs (D)D
      // 1aa: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 1ad: astore 12
      // 1af: aload 12
      // 1b1: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 1b4: aload 12
      // 1b6: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 1b9: aload 12
      // 1bb: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 1be: dadd
      // 1bf: aload 12
      // 1c1: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 1c4: dadd
      // 1c5: ddiv
      // 1c6: dstore 13
      // 1c8: aload 12
      // 1ca: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 1cd: aload 12
      // 1cf: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 1d2: aload 12
      // 1d4: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 1d7: dadd
      // 1d8: aload 12
      // 1da: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 1dd: dadd
      // 1de: ddiv
      // 1df: dstore 15
      // 1e1: aload 12
      // 1e3: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 1e6: aload 12
      // 1e8: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 1eb: aload 12
      // 1ed: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 1f0: dadd
      // 1f1: aload 12
      // 1f3: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 1f6: dadd
      // 1f7: ddiv
      // 1f8: dstore 17
      // 1fa: new net/minecraft/util/math/Vec3d
      // 1fd: dup
      // 1fe: aload 11
      // 200: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 203: dconst_0
      // 204: dcmpl
      // 205: ifle 210
      // 208: bipush 1
      // 209: goto 211
      // 20c: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20f: athrow
      // 210: bipush -1
      // 211: i2d
      // 212: dload 13
      // 214: dmul
      // 215: aload 11
      // 217: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 21a: dconst_0
      // 21b: dcmpl
      // 21c: ifle 223
      // 21f: bipush 1
      // 220: goto 224
      // 223: bipush -1
      // 224: i2d
      // 225: dload 15
      // 227: dmul
      // 228: aload 11
      // 22a: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 22d: dconst_0
      // 22e: dcmpl
      // 22f: ifle 236
      // 232: bipush 1
      // 233: goto 237
      // 236: bipush -1
      // 237: i2d
      // 238: dload 17
      // 23a: dmul
      // 23b: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 23e: astore 19
      // 240: aload 19
      // 242: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 245: ldc2_w 2.0
      // 248: ddiv
      // 249: ldc2_w 0.5
      // 24c: dadd
      // 24d: dstore 20
      // 24f: ldc2_w -180.0
      // 252: dconst_0
      // 253: dload 20
      // 255: invokestatic com/schnurritv/sexmod/b1.a (DDD)D
      // 258: d2f
      // 259: fstore 22
      // 25b: fload 22
      // 25d: invokestatic java/lang/Float.isNaN (F)Z
      // 260: ifeq 267
      // 263: ldc -90.0
      // 265: fstore 22
      // 267: dload 20
      // 269: ldc2_w 0.5
      // 26c: dcmpg
      // 26d: ifge 278
      // 270: fconst_0
      // 271: goto 283
      // 274: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 277: athrow
      // 278: dconst_0
      // 279: ldc2_w 16.0
      // 27c: dload 20
      // 27e: dneg
      // 27f: invokestatic com/schnurritv/sexmod/b1.a (DDD)D
      // 282: d2f
      // 283: fstore 23
      // 285: fload 23
      // 287: invokestatic java/lang/Float.isNaN (F)Z
      // 28a: ifeq 290
      // 28d: fconst_0
      // 28e: fstore 23
      // 290: ldc2_w 4.0
      // 293: ldc2_w 1.5707963267948966
      // 296: dload 20
      // 298: ldc2_w 2.0
      // 29b: dmul
      // 29c: ldc2_w 3.141592653589793
      // 29f: dmul
      // 2a0: dadd
      // 2a1: invokestatic java/lang/Math.sin (D)D
      // 2a4: ldc2_w 4.0
      // 2a7: dmul
      // 2a8: dsub
      // 2a9: d2f
      // 2aa: fstore 24
      // 2ac: fload 24
      // 2ae: invokestatic java/lang/Float.isNaN (F)Z
      // 2b1: ifeq 2b8
      // 2b4: ldc 8.0
      // 2b6: fstore 24
      // 2b8: aload 7
      // 2ba: fload 22
      // 2bc: invokestatic com/schnurritv/sexmod/b1.b (F)F
      // 2bf: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
      // 2c4: aload 7
      // 2c6: fload 23
      // 2c8: invokeinterface software/bernie/geckolib3/core/processor/IBone.setPositionY (F)V 2
      // 2cd: aload 7
      // 2cf: fload 24
      // 2d1: invokeinterface software/bernie/geckolib3/core/processor/IBone.setPositionZ (F)V 2
      // 2d6: aload 9
      // 2d8: getstatic com/schnurritv/sexmod/bj.START_THROWING Lcom/schnurritv/sexmod/bj;
      // 2db: if_acmpeq 2ed
      // 2de: aload 9
      // 2e0: getstatic com/schnurritv/sexmod/bj.PICK_UP Lcom/schnurritv/sexmod/bj;
      // 2e3: if_acmpne 2fc
      // 2e6: goto 2ed
      // 2e9: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ec: athrow
      // 2ed: aload 0
      // 2ee: aload 4
      // 2f0: aload 10
      // 2f2: invokevirtual com/schnurritv/sexmod/F.a (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/schnurritv/sexmod/ct;)V
      // 2f5: goto 2fc
      // 2f8: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2fb: athrow
      // 2fc: return
      // try (0 -> 10): 10 java/lang/RuntimeException
      // try (22 -> 32): 32 java/lang/RuntimeException
      // try (47 -> 53): 54 java/lang/RuntimeException
      // try (50 -> 59): 60 java/lang/RuntimeException
      // try (56 -> 67): 68 java/lang/RuntimeException
      // try (62 -> 76): 77 java/lang/RuntimeException
      // try (79 -> 82): 82 java/lang/RuntimeException
      // try (87 -> 93): 94 java/lang/RuntimeException
      // try (90 -> 101): 102 java/lang/RuntimeException
      // try (104 -> 111): 112 java/lang/RuntimeException
      // try (114 -> 125): 126 java/lang/RuntimeException
      // try (117 -> 134): 134 java/lang/RuntimeException
      // try (145 -> 151): 152 java/lang/RuntimeException
      // try (148 -> 157): 158 java/lang/RuntimeException
      // try (219 -> 228): 228 java/lang/RuntimeException
      // try (276 -> 282): 282 java/lang/RuntimeException
      // try (325 -> 331): 332 java/lang/RuntimeException
      // try (328 -> 338): 339 java/lang/RuntimeException
   }

   void a(AnimationProcessor var1, ct var2) {
      UUID var3 = var2.a();

      try {
         if (var3 == null) {
            var2.r();
         }
      } catch (RuntimeException var11) {
         throw a(var11);
      }

      try {
         if (var3 == null) {
            return;
         }
      } catch (RuntimeException var13) {
         throw a(var13);
      }

      EntityPlayer var4 = var2.field_70170_p.func_152378_a(var3);

      try {
         if (var4 == null) {
            return;
         }
      } catch (RuntimeException var12) {
         throw a(var12);
      }

      float var5 = b1.a(var4.field_184618_aE, var4.field_70721_aZ, this.d.func_184121_ak());
      float var6 = var4.field_184619_aG;
      float var7 = (float)Math.sin(var6);
      IBone var8 = var1.getBone("LeftLeg");
      IBone var9 = var1.getBone("RightLeg");
      float var10 = b1.b(60.0F * var7 * var5);
      var8.setRotationX(var10);
      var9.setRotationX(-var10);
   }

   void a(ct param1, IBone param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield com/schnurritv/sexmod/ct.field_70170_p Lnet/minecraft/world/World;
      // 004: aload 1
      // 005: ldc2_w 15.0
      // 008: invokevirtual net/minecraft/world/World.func_72890_a (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
      // 00b: astore 3
      // 00c: aload 3
      // 00d: ifnonnull 015
      // 010: return
      // 011: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 014: athrow
      // 015: aload 3
      // 016: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 019: astore 4
      // 01b: aload 1
      // 01c: invokevirtual com/schnurritv/sexmod/ct.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 01f: astore 5
      // 021: aload 4
      // 023: aload 5
      // 025: invokevirtual net/minecraft/util/math/Vec3d.func_178788_d (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
      // 028: astore 6
      // 02a: aload 1
      // 02b: getfield com/schnurritv/sexmod/ct.field_70177_z F
      // 02e: fstore 7
      // 030: bipush 0
      // 031: istore 8
      // 033: fload 7
      // 035: f2i
      // 036: lookupswitch 158 4 -90 133 0 42 90 105 180 77
      // 060: aload 4
      // 062: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 065: aload 5
      // 067: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 06a: dcmpl
      // 06b: ifle 07d
      // 06e: goto 075
      // 071: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 074: athrow
      // 075: bipush 1
      // 076: goto 07e
      // 079: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07c: athrow
      // 07d: bipush 0
      // 07e: istore 8
      // 080: goto 0d4
      // 083: aload 4
      // 085: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 088: aload 5
      // 08a: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 08d: dcmpg
      // 08e: ifge 099
      // 091: bipush 1
      // 092: goto 09a
      // 095: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 098: athrow
      // 099: bipush 0
      // 09a: istore 8
      // 09c: goto 0d4
      // 09f: aload 4
      // 0a1: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 0a4: aload 5
      // 0a6: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 0a9: dcmpg
      // 0aa: ifge 0b5
      // 0ad: bipush 1
      // 0ae: goto 0b6
      // 0b1: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b4: athrow
      // 0b5: bipush 0
      // 0b6: istore 8
      // 0b8: goto 0d4
      // 0bb: aload 4
      // 0bd: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 0c0: aload 5
      // 0c2: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 0c5: dcmpl
      // 0c6: ifle 0d1
      // 0c9: bipush 1
      // 0ca: goto 0d2
      // 0cd: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d0: athrow
      // 0d1: bipush 0
      // 0d2: istore 8
      // 0d4: iload 8
      // 0d6: ifne 0e5
      // 0d9: aload 2
      // 0da: fconst_0
      // 0db: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
      // 0e0: return
      // 0e1: invokestatic com/schnurritv/sexmod/F.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e4: athrow
      // 0e5: fconst_0
      // 0e6: fstore 9
      // 0e8: fload 7
      // 0ea: f2i
      // 0eb: lookupswitch 51 3 0 47 90 40 180 33
      // 10c: ldc 90.0
      // 10e: fstore 9
      // 110: goto 11e
      // 113: ldc 180.0
      // 115: fstore 9
      // 117: goto 11e
      // 11a: ldc -90.0
      // 11c: fstore 9
      // 11e: aload 6
      // 120: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 123: aload 6
      // 125: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 128: invokestatic net/minecraft/util/math/MathHelper.func_181159_b (DD)D
      // 12b: ldc2_w 57.29577951308232
      // 12e: dmul
      // 12f: fload 9
      // 131: f2d
      // 132: dadd
      // 133: dneg
      // 134: d2f
      // 135: fstore 10
      // 137: aload 3
      // 138: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70047_e ()F
      // 13b: f2d
      // 13c: aload 4
      // 13e: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 141: dadd
      // 142: aload 1
      // 143: invokevirtual com/schnurritv/sexmod/ct.func_70047_e ()F
      // 146: f2d
      // 147: aload 5
      // 149: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 14c: dadd
      // 14d: dsub
      // 14e: d2f
      // 14f: ldc -0.75
      // 151: ldc 0.75
      // 153: invokestatic com/schnurritv/sexmod/b1.b (FFF)F
      // 156: fstore 11
      // 158: aload 2
      // 159: fload 10
      // 15b: invokestatic com/schnurritv/sexmod/b1.b (F)F
      // 15e: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
      // 163: aload 2
      // 164: fload 11
      // 166: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
      // 16b: return
      // try (6 -> 9): 9 java/lang/RuntimeException
      // try (26 -> 35): 36 java/lang/RuntimeException
      // try (29 -> 40): 40 java/lang/RuntimeException
      // try (45 -> 53): 53 java/lang/RuntimeException
      // try (58 -> 66): 66 java/lang/RuntimeException
      // try (71 -> 79): 79 java/lang/RuntimeException
      // try (83 -> 89): 89 java/lang/RuntimeException
   }

   void a(ct var1, IBone var2, IBone var3) {
      EntityPlayer var4 = var1.field_70170_p.func_72890_a(var1, 15.0);

      try {
         if (var4 == null) {
            return;
         }
      } catch (RuntimeException var10) {
         throw a(var10);
      }

      Vec3d var5 = var4.func_174791_d();
      Vec3d var6 = var1.func_174791_d();
      Vec3d var7 = var5.func_178788_d(var6);
      float var8 = (float)(-(Math.atan2(var7.field_72449_c, var7.field_72450_a) * (180.0 / Math.PI))) + 90.0F;
      float var9 = b1.b((float)(var4.func_70047_e() + var5.field_72448_b - (var1.func_70047_e() + var6.field_72448_b)), -0.75F, 0.75F);
      var2.setRotationY(b1.b(var8));
      var3.setRotationX(var9);
   }

   void b(IBone var1, AnimationProcessor var2, ct var3) {
      try {
         if (var3.aB) {
            var1.setHidden(true);
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      var1.setHidden(false);
      var2.getBone("steve").setHidden(true);
   }

   void a(IBone var1, AnimationProcessor var2, ct var3) {
      label38: {
         try {
            if (var3.aB) {
               var1.setHidden(true);
               break label38;
            }
         } catch (RuntimeException var6) {
            throw a(var6);
         }

         IBone var10000;
         boolean var10001;
         label29: {
            try {
               var10000 = var1;
               if (var3.aQ < 15) {
                  var10001 = true;
                  break label29;
               }
            } catch (RuntimeException var5) {
               throw a(var5);
            }

            var10001 = false;
         }

         var10000.setHidden(var10001);
      }

      try {
         if (!var3.aB) {
            var2.getBone("steve").setHidden(true);
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }
   }

   public String[] d() {
      return new String[]{"armorHelmet"};
   }

   public String[] a() {
      return new String[]{"armorBoobL", "armorBoobR"};
   }

   public String[] c() {
      return new String[]{"nippleL", "nippleR"};
   }

   public String[] e() {
      return new String[]{"armorCheekR", "armorCheekL", "armorLegL", "armorLegR", "armorShinL", "armorShinR", "armorTorso"};
   }

   public String[] f() {
      return new String[]{"fuckhole", "vagina", "meatCheekR", "meatCheekL", "meatLegL", "meatLegR", "meatShinL", "meatShinR"};
   }

   public String[] h() {
      return new String[]{"armorFootL", "armorFootR"};
   }

   public String[] b() {
      return new String[]{"meatFootL", "meatFootR"};
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
