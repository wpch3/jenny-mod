package com.schnurritv.sexmod;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public abstract class bN extends bM {
   protected static final Vec3i E = new Vec3i(255, 255, 255);
   static HashMap<Integer, Vec3i> F = new HashMap<>();

   public bN(RenderManager var1, AnimatedGeoModel var2) {
      super(var1, var2);
   }

   public static void b() {
      F.clear();
   }

   protected Vec3i a(GeoBone var1) {
      String var2 = var1.getName();
      int var3 = var2.hashCode() + this.g.getPersistentID().hashCode();
      Vec3i var4 = F.get(var3);

      try {
         if (var4 != null) {
            return var4;
         }
      } catch (IllegalStateException var5) {
         throw b(var5);
      }

      var4 = this.c(var2);
      F.put(var3, var4);
      return var4;
   }

   protected abstract Vec3i c(String var1);

   protected void b(GeoBone var1, int var2) {
      List var3 = var1.childBones;

      for (int var5 = 0; var5 < var3.size(); var5++) {
         GeoBone var6 = (GeoBone)var3.get(var5);
         if (var2 == var5) {
            GeoBone var4 = var6;
            var4.setHidden(false);
            return;
         }
      }
   }

   protected float c() {
      return 1.0F;
   }

   protected Vec3d a(ItemStack var1) {
      return new Vec3d(-90.0, 0.0, 0.0);
   }

   protected GeoBone a(GeoBone var1, int var2) {
      List var3 = var1.childBones;
      GeoBone var4 = null;
      var3.sort(Comparator.comparingDouble(GeoBone::getPivotY));

      for (int var5 = 0; var5 < var3.size(); var5++) {
         GeoBone var6 = (GeoBone)var3.get(var5);
         if (var2 == var5) {
            var4 = var6;
            var4.setHidden(false);
         } else {
            var6.setHidden(true);
         }
      }

      return var4;
   }

   protected Vec3i a(Vec3i var1) {
      return var1;
   }

   @Override
   public void renderRecursively(BufferBuilder param1, GeoBone param2, float param3, float param4, float param5, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 2
      // 001: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
      // 004: astore 7
      // 006: aload 0
      // 007: getfield com/schnurritv/sexmod/bN.y Z
      // 00a: ifeq 078
      // 00d: aload 7
      // 00f: ldc "upperBody"
      // 011: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 014: ifeq 030
      // 017: goto 01e
      // 01a: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 01d: athrow
      // 01e: aload 2
      // 01f: aload 2
      // 020: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
      // 023: ldc 0.5
      // 025: fsub
      // 026: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
      // 029: goto 030
      // 02c: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 02f: athrow
      // 030: aload 7
      // 032: ldc "head"
      // 034: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 037: ifeq 04c
      // 03a: aload 2
      // 03b: aload 2
      // 03c: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
      // 03f: ldc 0.5
      // 041: fadd
      // 042: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
      // 045: goto 04c
      // 048: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 04b: athrow
      // 04c: aload 7
      // 04e: ldc "legL"
      // 050: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 053: ifne 067
      // 056: aload 7
      // 058: ldc "legR"
      // 05a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05d: ifeq 078
      // 060: goto 067
      // 063: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 066: athrow
      // 067: aload 2
      // 068: aload 2
      // 069: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getPositionZ ()F
      // 06c: fconst_1
      // 06d: fadd
      // 06e: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPositionZ (F)V
      // 071: goto 078
      // 074: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 077: athrow
      // 078: aload 7
      // 07a: ldc "head"
      // 07c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07f: ifeq 097
      // 082: aload 0
      // 083: aload 1
      // 084: aload 2
      // 085: fload 3
      // 086: fload 4
      // 088: fload 5
      // 08a: invokestatic software/bernie/geckolib3/core/util/Color.ofRGB (FFF)Lsoftware/bernie/geckolib3/core/util/Color;
      // 08d: invokevirtual com/schnurritv/sexmod/bN.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Lsoftware/bernie/geckolib3/core/util/Color;)V
      // 090: goto 097
      // 093: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 096: athrow
      // 097: aload 0
      // 098: aload 7
      // 09a: aload 2
      // 09b: invokevirtual com/schnurritv/sexmod/bN.a (Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 09e: aload 0
      // 09f: aload 7
      // 0a1: aload 2
      // 0a2: aload 0
      // 0a3: getfield com/schnurritv/sexmod/bN.A Lcom/schnurritv/sexmod/bg;
      // 0a6: aload 1
      // 0a7: invokevirtual com/schnurritv/sexmod/bN.a (Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Lcom/schnurritv/sexmod/bg;Lnet/minecraft/client/renderer/BufferBuilder;)V
      // 0aa: aload 0
      // 0ab: getfield com/schnurritv/sexmod/bN.D Z
      // 0ae: ifeq 149
      // 0b1: aload 0
      // 0b2: getfield com/schnurritv/sexmod/bN.C Lnet/minecraft/item/ItemStack;
      // 0b5: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 0b8: instanceof net/minecraft/item/ItemBow
      // 0bb: ifne 0d9
      // 0be: goto 0c5
      // 0c1: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield com/schnurritv/sexmod/bN.w Lnet/minecraft/item/ItemStack;
      // 0c9: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 0cc: instanceof net/minecraft/item/ItemBow
      // 0cf: ifeq 149
      // 0d2: goto 0d9
      // 0d5: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0d8: athrow
      // 0d9: aload 7
      // 0db: ldc "armR"
      // 0dd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e0: ifeq 104
      // 0e3: goto 0ea
      // 0e6: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0e9: athrow
      // 0ea: aload 2
      // 0eb: aload 2
      // 0ec: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
      // 0ef: aload 0
      // 0f0: getfield com/schnurritv/sexmod/bN.g Lcom/schnurritv/sexmod/bi;
      // 0f3: getfield com/schnurritv/sexmod/bi.field_70125_A F
      // 0f6: ldc 50.0
      // 0f8: fdiv
      // 0f9: fsub
      // 0fa: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
      // 0fd: goto 104
      // 100: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 103: athrow
      // 104: aload 7
      // 106: ldc "armL"
      // 108: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10b: ifeq 128
      // 10e: aload 2
      // 10f: aload 2
      // 110: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationY ()F
      // 113: aload 0
      // 114: getfield com/schnurritv/sexmod/bN.g Lcom/schnurritv/sexmod/bi;
      // 117: getfield com/schnurritv/sexmod/bi.field_70125_A F
      // 11a: ldc 50.0
      // 11c: fdiv
      // 11d: fsub
      // 11e: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationY (F)V
      // 121: goto 128
      // 124: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 127: athrow
      // 128: aload 0
      // 129: getfield com/schnurritv/sexmod/bN.w Lnet/minecraft/item/ItemStack;
      // 12c: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 12f: instanceof net/minecraft/item/ItemBow
      // 132: ifeq 149
      // 135: aload 0
      // 136: getfield com/schnurritv/sexmod/bN.w Lnet/minecraft/item/ItemStack;
      // 139: astore 8
      // 13b: aload 0
      // 13c: aload 0
      // 13d: getfield com/schnurritv/sexmod/bN.C Lnet/minecraft/item/ItemStack;
      // 140: putfield com/schnurritv/sexmod/bN.w Lnet/minecraft/item/ItemStack;
      // 143: aload 0
      // 144: aload 8
      // 146: putfield com/schnurritv/sexmod/bN.C Lnet/minecraft/item/ItemStack;
      // 149: aload 0
      // 14a: getfield com/schnurritv/sexmod/bN.D Z
      // 14d: ifeq 1b7
      // 150: aload 0
      // 151: getfield com/schnurritv/sexmod/bN.C Lnet/minecraft/item/ItemStack;
      // 154: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 157: instanceof net/minecraft/item/ItemShield
      // 15a: ifeq 1b7
      // 15d: goto 164
      // 160: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 163: athrow
      // 164: aload 7
      // 166: ldc "armR"
      // 168: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16b: ifeq 187
      // 16e: goto 175
      // 171: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 174: athrow
      // 175: aload 2
      // 176: fconst_0
      // 177: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationZ (F)V
      // 17a: aload 2
      // 17b: ldc 0.5
      // 17d: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
      // 180: goto 1b7
      // 183: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 186: athrow
      // 187: aload 0
      // 188: getfield com/schnurritv/sexmod/bN.w Lnet/minecraft/item/ItemStack;
      // 18b: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 18e: instanceof net/minecraft/item/ItemShield
      // 191: ifeq 1b7
      // 194: aload 7
      // 196: ldc "armL"
      // 198: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 19b: ifeq 1b7
      // 19e: goto 1a5
      // 1a1: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1a4: athrow
      // 1a5: aload 2
      // 1a6: fconst_0
      // 1a7: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationZ (F)V
      // 1aa: aload 2
      // 1ab: ldc 0.5
      // 1ad: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
      // 1b0: goto 1b7
      // 1b3: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b6: athrow
      // 1b7: aload 7
      // 1b9: ldc "weapon"
      // 1bb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1be: ifeq 1e0
      // 1c1: aload 0
      // 1c2: getfield com/schnurritv/sexmod/bN.C Lnet/minecraft/item/ItemStack;
      // 1c5: invokevirtual net/minecraft/item/ItemStack.func_190926_b ()Z
      // 1c8: ifne 1e0
      // 1cb: goto 1d2
      // 1ce: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1d1: athrow
      // 1d2: aload 0
      // 1d3: aload 1
      // 1d4: aload 2
      // 1d5: bipush 0
      // 1d6: invokevirtual com/schnurritv/sexmod/bN.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
      // 1d9: goto 1e0
      // 1dc: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1df: athrow
      // 1e0: aload 7
      // 1e2: ldc "offhand"
      // 1e4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e7: ifeq 209
      // 1ea: aload 0
      // 1eb: getfield com/schnurritv/sexmod/bN.w Lnet/minecraft/item/ItemStack;
      // 1ee: invokevirtual net/minecraft/item/ItemStack.func_190926_b ()Z
      // 1f1: ifne 209
      // 1f4: goto 1fb
      // 1f7: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1fa: athrow
      // 1fb: aload 0
      // 1fc: aload 1
      // 1fd: aload 2
      // 1fe: bipush 1
      // 1ff: invokevirtual com/schnurritv/sexmod/bN.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
      // 202: goto 209
      // 205: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 208: athrow
      // 209: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 20c: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
      // 20f: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 212: aload 2
      // 213: invokevirtual software/bernie/geckolib3/util/MatrixStack.translate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 216: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 219: aload 2
      // 21a: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 21d: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 220: aload 2
      // 221: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 224: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 227: aload 2
      // 228: invokevirtual software/bernie/geckolib3/util/MatrixStack.scale (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 22b: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 22e: aload 2
      // 22f: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 232: ldc "Head2"
      // 234: aload 7
      // 236: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 239: ifeq 255
      // 23c: aload 0
      // 23d: invokevirtual com/schnurritv/sexmod/bN.c ()Z
      // 240: ifne 255
      // 243: goto 24a
      // 246: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 249: athrow
      // 24a: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 24d: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
      // 250: return
      // 251: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 254: athrow
      // 255: ldc "neck"
      // 257: aload 7
      // 259: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 25c: ifne 270
      // 25f: ldc "head"
      // 261: aload 7
      // 263: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 266: ifeq 289
      // 269: goto 270
      // 26c: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 26f: athrow
      // 270: aload 0
      // 271: invokevirtual com/schnurritv/sexmod/bN.b ()Z
      // 274: ifne 289
      // 277: goto 27e
      // 27a: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 27d: athrow
      // 27e: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 281: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
      // 284: return
      // 285: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 288: athrow
      // 289: aload 2
      // 28a: getfield software/bernie/geckolib3/geo/render/built/GeoBone.isHidden Z
      // 28d: ifne 361
      // 290: aload 0
      // 291: aload 7
      // 293: fload 3
      // 294: fload 4
      // 296: fload 5
      // 298: invokevirtual com/schnurritv/sexmod/bN.a (Ljava/lang/String;FFF)Ljavax/vecmath/Vector4f;
      // 29b: astore 8
      // 29d: aload 8
      // 29f: getfield javax/vecmath/Vector4f.x F
      // 2a2: fstore 3
      // 2a3: aload 8
      // 2a5: getfield javax/vecmath/Vector4f.y F
      // 2a8: fstore 4
      // 2aa: aload 8
      // 2ac: getfield javax/vecmath/Vector4f.z F
      // 2af: fstore 5
      // 2b1: aload 8
      // 2b3: getfield javax/vecmath/Vector4f.w F
      // 2b6: f2d
      // 2b7: dstore 9
      // 2b9: aload 0
      // 2ba: getfield com/schnurritv/sexmod/bN.e Ljava/util/HashSet;
      // 2bd: aload 7
      // 2bf: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 2c2: ifne 311
      // 2c5: aload 2
      // 2c6: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childCubes Ljava/util/List;
      // 2c9: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2ce: astore 11
      // 2d0: aload 11
      // 2d2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d7: ifeq 311
      // 2da: aload 11
      // 2dc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2e1: checkcast software/bernie/geckolib3/geo/render/built/GeoCube
      // 2e4: astore 12
      // 2e6: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 2e9: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
      // 2ec: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 2ef: aload 0
      // 2f0: aload 2
      // 2f1: putfield com/schnurritv/sexmod/bN.v Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
      // 2f4: aload 0
      // 2f5: aload 1
      // 2f6: aload 12
      // 2f8: aload 2
      // 2f9: fload 3
      // 2fa: fload 4
      // 2fc: fload 5
      // 2fe: fload 6
      // 300: dload 9
      // 302: invokevirtual com/schnurritv/sexmod/bN.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
      // 305: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 308: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 30b: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
      // 30e: goto 2d0
      // 311: aload 2
      // 312: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childBones Ljava/util/List;
      // 315: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 31a: astore 11
      // 31c: aload 11
      // 31e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 323: ifeq 361
      // 326: aload 11
      // 328: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32d: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
      // 330: astore 12
      // 332: dload 9
      // 334: dconst_0
      // 335: dcmpl
      // 336: ifne 34e
      // 339: aload 0
      // 33a: aload 1
      // 33b: aload 12
      // 33d: fload 3
      // 33e: fload 4
      // 340: fload 5
      // 342: fload 6
      // 344: invokevirtual com/schnurritv/sexmod/bN.renderRecursively (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFF)V
      // 347: goto 35e
      // 34a: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 34d: athrow
      // 34e: aload 0
      // 34f: aload 1
      // 350: aload 12
      // 352: fload 3
      // 353: fload 4
      // 355: fload 5
      // 357: fload 6
      // 359: dload 9
      // 35b: invokevirtual com/schnurritv/sexmod/bN.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
      // 35e: goto 31c
      // 361: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 364: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
      // 367: goto 36c
      // 36a: astore 8
      // 36c: return
      // try (362 -> 375): 375 java/lang/IllegalStateException
      // try (281 -> 290): 290 java/lang/IllegalStateException
      // try (274 -> 284): 285 java/lang/IllegalStateException
      // try (270 -> 278): 279 java/lang/IllegalStateException
      // try (259 -> 268): 268 java/lang/IllegalStateException
      // try (238 -> 262): 263 java/lang/IllegalStateException
      // try (223 -> 235): 236 java/lang/IllegalStateException
      // try (219 -> 227): 228 java/lang/IllegalStateException
      // try (204 -> 216): 217 java/lang/IllegalStateException
      // try (200 -> 208): 209 java/lang/IllegalStateException
      // try (184 -> 197): 198 java/lang/IllegalStateException
      // try (179 -> 188): 189 java/lang/IllegalStateException
      // try (163 -> 177): 177 java/lang/IllegalStateException
      // try (155 -> 167): 168 java/lang/IllegalStateException
      // try (152 -> 160): 161 java/lang/IllegalStateException
      // try (120 -> 134): 135 java/lang/IllegalStateException
      // try (100 -> 117): 118 java/lang/IllegalStateException
      // try (92 -> 104): 105 java/lang/IllegalStateException
      // try (84 -> 97): 98 java/lang/IllegalStateException
      // try (70 -> 89): 90 java/lang/IllegalStateException
      // try (55 -> 67): 68 java/lang/IllegalStateException
      // try (39 -> 52): 53 java/lang/IllegalStateException
      // try (35 -> 43): 44 java/lang/IllegalStateException
      // try (22 -> 32): 33 java/lang/IllegalStateException
      // try (6 -> 19): 20 java/lang/IllegalStateException
      // try (3 -> 10): 11 java/lang/IllegalStateException
      // try (387 -> 389): 390 java/lang/IllegalStateException
   }

   public void a(BufferBuilder param1, GeoCube param2, GeoBone param3, float param4, float param5, float param6, float param7, double param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 003: aload 2
      // 004: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
      // 007: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 00a: aload 2
      // 00b: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
      // 00e: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
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
      // 027: if_icmpge 24f
      // 02a: aload 10
      // 02c: iload 12
      // 02e: aaload
      // 02f: astore 13
      // 031: aload 13
      // 033: ifnonnull 03d
      // 036: goto 249
      // 039: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
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
      // 061: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
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
      // 087: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 08a: athrow
      // 08b: aload 14
      // 08d: invokevirtual javax/vecmath/Vector3f.getX ()F
      // 090: fconst_0
      // 091: fcmpg
      // 092: ifge 0af
      // 095: goto 09c
      // 098: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09b: athrow
      // 09c: aload 14
      // 09e: dup
      // 09f: getfield javax/vecmath/Vector3f.x F
      // 0a2: ldc -1.0
      // 0a4: fmul
      // 0a5: putfield javax/vecmath/Vector3f.x F
      // 0a8: goto 0af
      // 0ab: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
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
      // 0ca: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0cd: athrow
      // 0ce: aload 14
      // 0d0: invokevirtual javax/vecmath/Vector3f.getY ()F
      // 0d3: fconst_0
      // 0d4: fcmpg
      // 0d5: ifge 0f2
      // 0d8: goto 0df
      // 0db: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0de: athrow
      // 0df: aload 14
      // 0e1: dup
      // 0e2: getfield javax/vecmath/Vector3f.y F
      // 0e5: ldc -1.0
      // 0e7: fmul
      // 0e8: putfield javax/vecmath/Vector3f.y F
      // 0eb: goto 0f2
      // 0ee: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
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
      // 10d: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 110: athrow
      // 111: aload 14
      // 113: invokevirtual javax/vecmath/Vector3f.getZ ()F
      // 116: fconst_0
      // 117: fcmpg
      // 118: ifge 135
      // 11b: goto 122
      // 11e: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 121: athrow
      // 122: aload 14
      // 124: dup
      // 125: getfield javax/vecmath/Vector3f.z F
      // 128: ldc -1.0
      // 12a: fmul
      // 12b: putfield javax/vecmath/Vector3f.z F
      // 12e: goto 135
      // 131: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 134: athrow
      // 135: aload 0
      // 136: aload 3
      // 137: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
      // 13a: invokevirtual com/schnurritv/sexmod/bN.b (Ljava/lang/String;)Z
      // 13d: ifeq 155
      // 140: new net/minecraft/util/math/Vec3d
      // 143: dup
      // 144: fload 4
      // 146: f2d
      // 147: fload 5
      // 149: f2d
      // 14a: fload 6
      // 14c: f2d
      // 14d: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 150: astore 15
      // 152: goto 1a5
      // 155: aload 0
      // 156: aload 3
      // 157: invokevirtual com/schnurritv/sexmod/bN.a (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)Lnet/minecraft/util/math/Vec3i;
      // 15a: astore 16
      // 15c: aload 0
      // 15d: aload 16
      // 15f: invokevirtual com/schnurritv/sexmod/bN.a (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/Vec3i;
      // 162: astore 16
      // 164: new net/minecraft/util/math/Vec3d
      // 167: dup
      // 168: aload 16
      // 16a: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 16d: i2f
      // 16e: ldc 255.0
      // 170: fdiv
      // 171: f2d
      // 172: aload 16
      // 174: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
      // 177: i2f
      // 178: ldc 255.0
      // 17a: fdiv
      // 17b: f2d
      // 17c: aload 16
      // 17e: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 181: i2f
      // 182: ldc 255.0
      // 184: fdiv
      // 185: f2d
      // 186: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 189: astore 17
      // 18b: aload 0
      // 18c: invokevirtual com/schnurritv/sexmod/bN.e ()Z
      // 18f: ifeq 1a1
      // 192: aload 0
      // 193: aload 17
      // 195: aload 14
      // 197: invokevirtual com/schnurritv/sexmod/bN.a (Lnet/minecraft/util/math/Vec3d;Ljavax/vecmath/Vector3f;)Lnet/minecraft/util/math/Vec3d;
      // 19a: goto 1a3
      // 19d: invokestatic com/schnurritv/sexmod/bN.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1a0: athrow
      // 1a1: aload 17
      // 1a3: astore 15
      // 1a5: aload 13
      // 1a7: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.vertices [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
      // 1aa: astore 16
      // 1ac: aload 16
      // 1ae: arraylength
      // 1af: istore 17
      // 1b1: bipush 0
      // 1b2: istore 18
      // 1b4: iload 18
      // 1b6: iload 17
      // 1b8: if_icmpge 249
      // 1bb: aload 16
      // 1bd: iload 18
      // 1bf: aaload
      // 1c0: astore 19
      // 1c2: new javax/vecmath/Vector4f
      // 1c5: dup
      // 1c6: aload 19
      // 1c8: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
      // 1cb: invokevirtual javax/vecmath/Vector3f.getX ()F
      // 1ce: aload 19
      // 1d0: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
      // 1d3: invokevirtual javax/vecmath/Vector3f.getY ()F
      // 1d6: aload 19
      // 1d8: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
      // 1db: invokevirtual javax/vecmath/Vector3f.getZ ()F
      // 1de: fconst_1
      // 1df: invokespecial javax/vecmath/Vector4f.<init> (FFFF)V
      // 1e2: astore 20
      // 1e4: getstatic com/schnurritv/sexmod/bN.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 1e7: invokevirtual software/bernie/geckolib3/util/MatrixStack.getModelMatrix ()Ljavax/vecmath/Matrix4f;
      // 1ea: aload 20
      // 1ec: invokevirtual javax/vecmath/Matrix4f.transform (Ljavax/vecmath/Tuple4f;)V
      // 1ef: aload 1
      // 1f0: aload 20
      // 1f2: invokevirtual javax/vecmath/Vector4f.getX ()F
      // 1f5: f2d
      // 1f6: aload 20
      // 1f8: invokevirtual javax/vecmath/Vector4f.getY ()F
      // 1fb: f2d
      // 1fc: aload 20
      // 1fe: invokevirtual javax/vecmath/Vector4f.getZ ()F
      // 201: f2d
      // 202: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 205: aload 19
      // 207: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureU F
      // 20a: f2d
      // 20b: dload 8
      // 20d: dadd
      // 20e: aload 19
      // 210: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureV F
      // 213: f2d
      // 214: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 217: aload 15
      // 219: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 21c: d2f
      // 21d: aload 15
      // 21f: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 222: d2f
      // 223: aload 15
      // 225: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 228: d2f
      // 229: fload 7
      // 22b: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181666_a (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
      // 22e: aload 14
      // 230: invokevirtual javax/vecmath/Vector3f.getX ()F
      // 233: aload 14
      // 235: invokevirtual javax/vecmath/Vector3f.getY ()F
      // 238: aload 14
      // 23a: invokevirtual javax/vecmath/Vector3f.getZ ()F
      // 23d: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
      // 240: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
      // 243: iinc 18 1
      // 246: goto 1b4
      // 249: iinc 12 1
      // 24c: goto 023
      // 24f: return
      // try (24 -> 27): 27 java/lang/IllegalStateException
      // try (45 -> 61): 62 java/lang/IllegalStateException
      // try (55 -> 69): 70 java/lang/IllegalStateException
      // try (64 -> 78): 79 java/lang/IllegalStateException
      // try (81 -> 93): 94 java/lang/IllegalStateException
      // try (87 -> 101): 102 java/lang/IllegalStateException
      // try (96 -> 110): 111 java/lang/IllegalStateException
      // try (113 -> 125): 126 java/lang/IllegalStateException
      // try (119 -> 133): 134 java/lang/IllegalStateException
      // try (128 -> 142): 143 java/lang/IllegalStateException
      // try (191 -> 199): 199 java/lang/IllegalStateException
   }

   protected boolean b(String var1) {
      return var1.startsWith("armor");
   }

   private static IllegalStateException b(IllegalStateException var0) {
      return var0;
   }
}
