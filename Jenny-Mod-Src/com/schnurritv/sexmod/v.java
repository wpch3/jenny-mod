package com.schnurritv.sexmod;

import javax.annotation.Nullable;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class V extends Render<n> {
   static final double d = 0.1896224320030116;
   static final double c = -0.5;
   static final double b = 0.08742380916962415;
   private static final ResourceLocation a = new ResourceLocation("textures/particle/particles.png");

   public V(RenderManager var1) {
      super(var1);
   }

   public void a(n param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual com/schnurritv/sexmod/n.c ()Lcom/schnurritv/sexmod/c9;
      // 004: astore 10
      // 006: aload 10
      // 008: ifnull 02a
      // 00b: aload 0
      // 00c: getfield com/schnurritv/sexmod/V.field_188301_f Z
      // 00f: ifne 02a
      // 012: goto 019
      // 015: invokestatic com/schnurritv/sexmod/V.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 018: athrow
      // 019: aload 10
      // 01b: getfield com/schnurritv/sexmod/c9.am F
      // 01e: fconst_1
      // 01f: fcmpl
      // 020: ifne 02f
      // 023: goto 02a
      // 026: invokestatic com/schnurritv/sexmod/V.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 029: athrow
      // 02a: return
      // 02b: invokestatic com/schnurritv/sexmod/V.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02e: athrow
      // 02f: aload 10
      // 031: aload 1
      // 032: putfield com/schnurritv/sexmod/c9.W Lcom/schnurritv/sexmod/n;
      // 035: aload 10
      // 037: invokevirtual com/schnurritv/sexmod/c9.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 03a: getstatic com/schnurritv/sexmod/c9.ah Lnet/minecraft/network/datasync/DataParameter;
      // 03d: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 040: checkcast net/minecraft/item/ItemStack
      // 043: astore 11
      // 045: aload 11
      // 047: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 04a: getstatic net/minecraft/init/Items.field_190931_a Lnet/minecraft/item/Item;
      // 04d: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 050: ifne 11d
      // 053: invokestatic net/minecraft/client/Minecraft.func_175610_ah ()I
      // 056: i2f
      // 057: fstore 12
      // 059: fload 12
      // 05b: fconst_0
      // 05c: fcmpl
      // 05d: ifne 064
      // 060: ldc 0.1
      // 062: fstore 12
      // 064: aload 10
      // 066: dup
      // 067: getfield com/schnurritv/sexmod/c9.am F
      // 06a: ldc 60.0
      // 06c: fload 12
      // 06e: fdiv
      // 06f: ldc 0.01666
      // 071: fmul
      // 072: fconst_2
      // 073: fmul
      // 074: fadd
      // 075: putfield com/schnurritv/sexmod/c9.am F
      // 078: aload 10
      // 07a: fconst_1
      // 07b: aload 10
      // 07d: getfield com/schnurritv/sexmod/c9.am F
      // 080: invokestatic java/lang/Math.min (FF)F
      // 083: putfield com/schnurritv/sexmod/c9.am F
      // 086: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 089: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 08c: astore 13
      // 08e: new net/minecraft/util/math/Vec3d
      // 091: dup
      // 092: aload 13
      // 094: getfield net/minecraft/entity/player/EntityPlayer.field_70142_S D
      // 097: aload 13
      // 099: getfield net/minecraft/entity/player/EntityPlayer.field_70137_T D
      // 09c: aload 13
      // 09e: getfield net/minecraft/entity/player/EntityPlayer.field_70136_U D
      // 0a1: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 0a4: aload 13
      // 0a6: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 0a9: fload 9
      // 0ab: f2d
      // 0ac: invokestatic com/schnurritv/sexmod/b1.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
      // 0af: astore 14
      // 0b1: new net/minecraft/util/math/Vec3d
      // 0b4: dup
      // 0b5: dload 2
      // 0b6: dload 4
      // 0b8: dload 6
      // 0ba: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 0bd: astore 15
      // 0bf: new net/minecraft/util/math/Vec3d
      // 0c2: dup
      // 0c3: aload 10
      // 0c5: getfield com/schnurritv/sexmod/c9.field_70142_S D
      // 0c8: aload 10
      // 0ca: getfield com/schnurritv/sexmod/c9.field_70137_T D
      // 0cd: ldc2_w 0.875
      // 0d0: dadd
      // 0d1: aload 10
      // 0d3: getfield com/schnurritv/sexmod/c9.field_70136_U D
      // 0d6: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 0d9: aload 10
      // 0db: invokevirtual com/schnurritv/sexmod/c9.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 0de: dconst_0
      // 0df: ldc2_w 0.875
      // 0e2: dconst_0
      // 0e3: invokevirtual net/minecraft/util/math/Vec3d.func_72441_c (DDD)Lnet/minecraft/util/math/Vec3d;
      // 0e6: fload 9
      // 0e8: f2d
      // 0e9: invokestatic com/schnurritv/sexmod/b1.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
      // 0ec: astore 16
      // 0ee: aload 16
      // 0f0: aload 14
      // 0f2: invokevirtual net/minecraft/util/math/Vec3d.func_178788_d (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
      // 0f5: astore 16
      // 0f7: aload 15
      // 0f9: aload 16
      // 0fb: aload 10
      // 0fd: getfield com/schnurritv/sexmod/c9.am F
      // 100: f2d
      // 101: invokestatic com/schnurritv/sexmod/b1.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
      // 104: astore 15
      // 106: aload 15
      // 108: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 10b: dstore 2
      // 10c: aload 15
      // 10e: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 111: dstore 4
      // 113: aload 15
      // 115: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 118: dstore 6
      // 11a: goto 123
      // 11d: aload 10
      // 11f: fconst_0
      // 120: putfield com/schnurritv/sexmod/c9.am F
      // 123: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 126: dload 2
      // 127: d2f
      // 128: dload 4
      // 12a: d2f
      // 12b: dload 6
      // 12d: d2f
      // 12e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 131: invokestatic net/minecraft/client/renderer/GlStateManager.func_179091_B ()V
      // 134: ldc 0.5
      // 136: ldc 0.5
      // 138: ldc 0.5
      // 13a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
      // 13d: aload 0
      // 13e: aload 1
      // 13f: invokevirtual com/schnurritv/sexmod/V.func_180548_c (Lnet/minecraft/entity/Entity;)Z
      // 142: pop
      // 143: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
      // 146: astore 12
      // 148: aload 12
      // 14a: invokevirtual net/minecraft/client/renderer/Tessellator.func_178180_c ()Lnet/minecraft/client/renderer/BufferBuilder;
      // 14d: astore 13
      // 14f: ldc 180.0
      // 151: aload 0
      // 152: getfield com/schnurritv/sexmod/V.field_76990_c Lnet/minecraft/client/renderer/entity/RenderManager;
      // 155: getfield net/minecraft/client/renderer/entity/RenderManager.field_78735_i F
      // 158: fsub
      // 159: fconst_0
      // 15a: fconst_1
      // 15b: fconst_0
      // 15c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 15f: aload 0
      // 160: getfield com/schnurritv/sexmod/V.field_76990_c Lnet/minecraft/client/renderer/entity/RenderManager;
      // 163: getfield net/minecraft/client/renderer/entity/RenderManager.field_78733_k Lnet/minecraft/client/settings/GameSettings;
      // 166: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
      // 169: bipush 2
      // 16a: if_icmpne 175
      // 16d: bipush -1
      // 16e: goto 176
      // 171: invokestatic com/schnurritv/sexmod/V.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 174: athrow
      // 175: bipush 1
      // 176: i2f
      // 177: aload 0
      // 178: getfield com/schnurritv/sexmod/V.field_76990_c Lnet/minecraft/client/renderer/entity/RenderManager;
      // 17b: getfield net/minecraft/client/renderer/entity/RenderManager.field_78732_j F
      // 17e: fneg
      // 17f: fmul
      // 180: fconst_1
      // 181: fconst_0
      // 182: fconst_0
      // 183: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 186: aload 0
      // 187: getfield com/schnurritv/sexmod/V.field_188301_f Z
      // 18a: ifeq 19f
      // 18d: invokestatic net/minecraft/client/renderer/GlStateManager.func_179142_g ()V
      // 190: aload 0
      // 191: aload 1
      // 192: invokevirtual com/schnurritv/sexmod/V.func_188298_c (Lnet/minecraft/entity/Entity;)I
      // 195: invokestatic net/minecraft/client/renderer/GlStateManager.func_187431_e (I)V
      // 198: goto 19f
      // 19b: invokestatic com/schnurritv/sexmod/V.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19e: athrow
      // 19f: aload 11
      // 1a1: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 1a4: getstatic net/minecraft/init/Items.field_190931_a Lnet/minecraft/item/Item;
      // 1a7: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1aa: ifne 1e1
      // 1ad: fconst_2
      // 1ae: fconst_2
      // 1af: fconst_2
      // 1b0: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
      // 1b3: fconst_0
      // 1b4: ldc -0.2
      // 1b6: fconst_0
      // 1b7: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 1ba: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 1bd: invokevirtual net/minecraft/client/Minecraft.func_175597_ag ()Lnet/minecraft/client/renderer/ItemRenderer;
      // 1c0: aload 10
      // 1c2: aload 11
      // 1c4: getstatic net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType.THIRD_PERSON_RIGHT_HAND Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;
      // 1c7: invokevirtual net/minecraft/client/renderer/ItemRenderer.func_178099_a (Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V
      // 1ca: fconst_0
      // 1cb: ldc 0.2
      // 1cd: fconst_0
      // 1ce: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 1d1: ldc 0.5
      // 1d3: ldc 0.5
      // 1d5: ldc 0.5
      // 1d7: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
      // 1da: goto 1e1
      // 1dd: invokestatic com/schnurritv/sexmod/V.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e0: athrow
      // 1e1: aload 0
      // 1e2: aload 1
      // 1e3: invokevirtual com/schnurritv/sexmod/V.func_180548_c (Lnet/minecraft/entity/Entity;)Z
      // 1e6: pop
      // 1e7: aload 13
      // 1e9: bipush 7
      // 1eb: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181710_j Lnet/minecraft/client/renderer/vertex/VertexFormat;
      // 1ee: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
      // 1f1: aload 13
      // 1f3: ldc2_w -0.5
      // 1f6: ldc2_w -0.5
      // 1f9: dconst_0
      // 1fa: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 1fd: ldc2_w 0.0625
      // 200: ldc2_w 0.1875
      // 203: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 206: fconst_0
      // 207: fconst_1
      // 208: fconst_0
      // 209: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
      // 20c: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
      // 20f: aload 13
      // 211: ldc2_w 0.5
      // 214: ldc2_w -0.5
      // 217: dconst_0
      // 218: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 21b: ldc2_w 0.125
      // 21e: ldc2_w 0.1875
      // 221: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 224: fconst_0
      // 225: fconst_1
      // 226: fconst_0
      // 227: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
      // 22a: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
      // 22d: aload 13
      // 22f: ldc2_w 0.5
      // 232: ldc2_w 0.5
      // 235: dconst_0
      // 236: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 239: ldc2_w 0.125
      // 23c: ldc2_w 0.125
      // 23f: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 242: fconst_0
      // 243: fconst_1
      // 244: fconst_0
      // 245: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
      // 248: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
      // 24b: aload 13
      // 24d: ldc2_w -0.5
      // 250: ldc2_w 0.5
      // 253: dconst_0
      // 254: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 257: ldc2_w 0.0625
      // 25a: ldc2_w 0.125
      // 25d: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 260: fconst_0
      // 261: fconst_1
      // 262: fconst_0
      // 263: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
      // 266: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
      // 269: aload 12
      // 26b: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
      // 26e: aload 0
      // 26f: getfield com/schnurritv/sexmod/V.field_188301_f Z
      // 272: ifeq 282
      // 275: invokestatic net/minecraft/client/renderer/GlStateManager.func_187417_n ()V
      // 278: invokestatic net/minecraft/client/renderer/GlStateManager.func_179119_h ()V
      // 27b: goto 282
      // 27e: invokestatic com/schnurritv/sexmod/V.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 281: athrow
      // 282: invokestatic net/minecraft/client/renderer/GlStateManager.func_179101_C ()V
      // 285: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 288: aload 10
      // 28a: invokevirtual com/schnurritv/sexmod/c9.func_184591_cq ()Lnet/minecraft/util/EnumHandSide;
      // 28d: getstatic net/minecraft/util/EnumHandSide.RIGHT Lnet/minecraft/util/EnumHandSide;
      // 290: if_acmpne 29b
      // 293: bipush 1
      // 294: goto 29c
      // 297: invokestatic com/schnurritv/sexmod/V.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29a: athrow
      // 29b: bipush -1
      // 29c: istore 14
      // 29e: aload 10
      // 2a0: invokevirtual com/schnurritv/sexmod/c9.func_184614_ca ()Lnet/minecraft/item/ItemStack;
      // 2a3: astore 15
      // 2a5: aload 15
      // 2a7: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 2aa: instanceof net/minecraft/item/ItemFishingRod
      // 2ad: ifne 2b5
      // 2b0: iload 14
      // 2b2: ineg
      // 2b3: istore 14
      // 2b5: aload 10
      // 2b7: aload 10
      // 2b9: invokevirtual com/schnurritv/sexmod/c9.d ()Ljava/lang/Float;
      // 2bc: invokevirtual java/lang/Float.floatValue ()F
      // 2bf: putfield com/schnurritv/sexmod/c9.field_70177_z F
      // 2c2: aload 10
      // 2c4: aload 10
      // 2c6: invokevirtual com/schnurritv/sexmod/c9.d ()Ljava/lang/Float;
      // 2c9: invokevirtual java/lang/Float.floatValue ()F
      // 2cc: putfield com/schnurritv/sexmod/c9.field_70761_aq F
      // 2cf: aload 10
      // 2d1: aload 10
      // 2d3: invokevirtual com/schnurritv/sexmod/c9.o ()Lnet/minecraft/util/math/Vec3d;
      // 2d6: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 2d9: putfield com/schnurritv/sexmod/c9.field_70165_t D
      // 2dc: aload 10
      // 2de: aload 10
      // 2e0: invokevirtual com/schnurritv/sexmod/c9.o ()Lnet/minecraft/util/math/Vec3d;
      // 2e3: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 2e6: putfield com/schnurritv/sexmod/c9.field_70163_u D
      // 2e9: aload 10
      // 2eb: aload 10
      // 2ed: invokevirtual com/schnurritv/sexmod/c9.o ()Lnet/minecraft/util/math/Vec3d;
      // 2f0: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 2f3: putfield com/schnurritv/sexmod/c9.field_70161_v D
      // 2f6: aload 10
      // 2f8: aload 10
      // 2fa: invokevirtual com/schnurritv/sexmod/c9.o ()Lnet/minecraft/util/math/Vec3d;
      // 2fd: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 300: putfield com/schnurritv/sexmod/c9.field_70169_q D
      // 303: aload 10
      // 305: aload 10
      // 307: invokevirtual com/schnurritv/sexmod/c9.o ()Lnet/minecraft/util/math/Vec3d;
      // 30a: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 30d: putfield com/schnurritv/sexmod/c9.field_70167_r D
      // 310: aload 10
      // 312: aload 10
      // 314: invokevirtual com/schnurritv/sexmod/c9.o ()Lnet/minecraft/util/math/Vec3d;
      // 317: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 31a: putfield com/schnurritv/sexmod/c9.field_70166_s D
      // 31d: aload 10
      // 31f: getfield com/schnurritv/sexmod/c9.field_70760_ar F
      // 322: aload 10
      // 324: getfield com/schnurritv/sexmod/c9.field_70761_aq F
      // 327: aload 10
      // 329: getfield com/schnurritv/sexmod/c9.field_70760_ar F
      // 32c: fsub
      // 32d: fload 9
      // 32f: fmul
      // 330: fadd
      // 331: ldc 0.017453292
      // 333: fmul
      // 334: fstore 16
      // 336: fload 16
      // 338: invokestatic net/minecraft/util/math/MathHelper.func_76126_a (F)F
      // 33b: f2d
      // 33c: dstore 17
      // 33e: fload 16
      // 340: invokestatic net/minecraft/util/math/MathHelper.func_76134_b (F)F
      // 343: f2d
      // 344: dstore 19
      // 346: iload 14
      // 348: i2d
      // 349: ldc2_w 0.35
      // 34c: dmul
      // 34d: dstore 21
      // 34f: aload 10
      // 351: getfield com/schnurritv/sexmod/c9.field_70169_q D
      // 354: aload 10
      // 356: getfield com/schnurritv/sexmod/c9.field_70165_t D
      // 359: aload 10
      // 35b: getfield com/schnurritv/sexmod/c9.field_70169_q D
      // 35e: dsub
      // 35f: fload 9
      // 361: f2d
      // 362: dmul
      // 363: dadd
      // 364: dload 19
      // 366: dload 21
      // 368: dmul
      // 369: dsub
      // 36a: dload 17
      // 36c: ldc2_w 0.8
      // 36f: dmul
      // 370: dsub
      // 371: dstore 23
      // 373: aload 10
      // 375: getfield com/schnurritv/sexmod/c9.field_70167_r D
      // 378: aload 10
      // 37a: invokevirtual com/schnurritv/sexmod/c9.func_70047_e ()F
      // 37d: f2d
      // 37e: dadd
      // 37f: aload 10
      // 381: getfield com/schnurritv/sexmod/c9.field_70163_u D
      // 384: aload 10
      // 386: getfield com/schnurritv/sexmod/c9.field_70167_r D
      // 389: dsub
      // 38a: fload 9
      // 38c: f2d
      // 38d: dmul
      // 38e: dadd
      // 38f: ldc2_w 0.45
      // 392: dsub
      // 393: dstore 25
      // 395: aload 10
      // 397: getfield com/schnurritv/sexmod/c9.field_70166_s D
      // 39a: aload 10
      // 39c: getfield com/schnurritv/sexmod/c9.field_70161_v D
      // 39f: aload 10
      // 3a1: getfield com/schnurritv/sexmod/c9.field_70166_s D
      // 3a4: dsub
      // 3a5: fload 9
      // 3a7: f2d
      // 3a8: dmul
      // 3a9: dadd
      // 3aa: dload 17
      // 3ac: dload 21
      // 3ae: dmul
      // 3af: dsub
      // 3b0: dload 19
      // 3b2: ldc2_w 0.8
      // 3b5: dmul
      // 3b6: dadd
      // 3b7: dstore 27
      // 3b9: aload 10
      // 3bb: invokevirtual com/schnurritv/sexmod/c9.func_70093_af ()Z
      // 3be: ifeq 3cb
      // 3c1: ldc2_w -0.1875
      // 3c4: goto 3cc
      // 3c7: invokestatic com/schnurritv/sexmod/V.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3ca: athrow
      // 3cb: dconst_0
      // 3cc: dstore 29
      // 3ce: aload 1
      // 3cf: getfield com/schnurritv/sexmod/n.field_70169_q D
      // 3d2: aload 1
      // 3d3: getfield com/schnurritv/sexmod/n.field_70165_t D
      // 3d6: aload 1
      // 3d7: getfield com/schnurritv/sexmod/n.field_70169_q D
      // 3da: dsub
      // 3db: fload 9
      // 3dd: f2d
      // 3de: dmul
      // 3df: dadd
      // 3e0: aload 10
      // 3e2: invokevirtual com/schnurritv/sexmod/c9.d ()Ljava/lang/Float;
      // 3e5: invokevirtual java/lang/Float.floatValue ()F
      // 3e8: ldc 90.0
      // 3ea: fadd
      // 3eb: f2d
      // 3ec: ldc2_w 0.017453292519943295
      // 3ef: dmul
      // 3f0: invokestatic java/lang/Math.sin (D)D
      // 3f3: ldc2_w 0.1896224320030116
      // 3f6: dmul
      // 3f7: dsub
      // 3f8: aload 10
      // 3fa: invokevirtual com/schnurritv/sexmod/c9.d ()Ljava/lang/Float;
      // 3fd: invokevirtual java/lang/Float.floatValue ()F
      // 400: f2d
      // 401: ldc2_w 0.017453292519943295
      // 404: dmul
      // 405: invokestatic java/lang/Math.sin (D)D
      // 408: ldc2_w 0.08742380916962415
      // 40b: dmul
      // 40c: dsub
      // 40d: dstore 31
      // 40f: aload 1
      // 410: getfield com/schnurritv/sexmod/n.field_70167_r D
      // 413: aload 1
      // 414: getfield com/schnurritv/sexmod/n.field_70163_u D
      // 417: aload 1
      // 418: getfield com/schnurritv/sexmod/n.field_70167_r D
      // 41b: dsub
      // 41c: fload 9
      // 41e: f2d
      // 41f: dmul
      // 420: dadd
      // 421: ldc2_w 0.25
      // 424: dadd
      // 425: ldc2_w -0.5
      // 428: dadd
      // 429: dstore 33
      // 42b: aload 1
      // 42c: getfield com/schnurritv/sexmod/n.field_70166_s D
      // 42f: aload 1
      // 430: getfield com/schnurritv/sexmod/n.field_70161_v D
      // 433: aload 1
      // 434: getfield com/schnurritv/sexmod/n.field_70166_s D
      // 437: dsub
      // 438: fload 9
      // 43a: f2d
      // 43b: dmul
      // 43c: dadd
      // 43d: aload 10
      // 43f: invokevirtual com/schnurritv/sexmod/c9.d ()Ljava/lang/Float;
      // 442: invokevirtual java/lang/Float.floatValue ()F
      // 445: ldc 90.0
      // 447: fadd
      // 448: f2d
      // 449: ldc2_w 0.017453292519943295
      // 44c: dmul
      // 44d: invokestatic java/lang/Math.cos (D)D
      // 450: ldc2_w 0.1896224320030116
      // 453: dmul
      // 454: dadd
      // 455: aload 10
      // 457: invokevirtual com/schnurritv/sexmod/c9.d ()Ljava/lang/Float;
      // 45a: invokevirtual java/lang/Float.floatValue ()F
      // 45d: f2d
      // 45e: ldc2_w 0.017453292519943295
      // 461: dmul
      // 462: invokestatic java/lang/Math.cos (D)D
      // 465: ldc2_w 0.08742380916962415
      // 468: dmul
      // 469: dadd
      // 46a: dstore 35
      // 46c: dload 23
      // 46e: dload 31
      // 470: dsub
      // 471: d2f
      // 472: f2d
      // 473: dstore 37
      // 475: dload 25
      // 477: dload 33
      // 479: dsub
      // 47a: d2f
      // 47b: f2d
      // 47c: dload 29
      // 47e: dadd
      // 47f: dstore 39
      // 481: dload 27
      // 483: dload 35
      // 485: dsub
      // 486: d2f
      // 487: f2d
      // 488: dstore 41
      // 48a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179090_x ()V
      // 48d: invokestatic net/minecraft/client/renderer/GlStateManager.func_179140_f ()V
      // 490: aload 11
      // 492: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 495: getstatic net/minecraft/init/Items.field_190931_a Lnet/minecraft/item/Item;
      // 498: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 49b: ifeq 4fd
      // 49e: aload 13
      // 4a0: bipush 3
      // 4a1: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181706_f Lnet/minecraft/client/renderer/vertex/VertexFormat;
      // 4a4: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
      // 4a7: bipush 0
      // 4a8: istore 43
      // 4aa: iload 43
      // 4ac: bipush 16
      // 4ae: if_icmpgt 4f8
      // 4b1: iload 43
      // 4b3: i2f
      // 4b4: ldc 16.0
      // 4b6: fdiv
      // 4b7: fstore 44
      // 4b9: aload 13
      // 4bb: dload 2
      // 4bc: dload 37
      // 4be: fload 44
      // 4c0: f2d
      // 4c1: dmul
      // 4c2: dadd
      // 4c3: dload 4
      // 4c5: dload 39
      // 4c7: fload 44
      // 4c9: fload 44
      // 4cb: fmul
      // 4cc: fload 44
      // 4ce: fadd
      // 4cf: f2d
      // 4d0: dmul
      // 4d1: ldc2_w 0.5
      // 4d4: dmul
      // 4d5: dadd
      // 4d6: ldc2_w 0.25
      // 4d9: dadd
      // 4da: dload 6
      // 4dc: dload 41
      // 4de: fload 44
      // 4e0: f2d
      // 4e1: dmul
      // 4e2: dadd
      // 4e3: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
      // 4e6: bipush 0
      // 4e7: bipush 0
      // 4e8: bipush 0
      // 4e9: sipush 255
      // 4ec: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181669_b (IIII)Lnet/minecraft/client/renderer/BufferBuilder;
      // 4ef: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
      // 4f2: iinc 43 1
      // 4f5: goto 4aa
      // 4f8: aload 12
      // 4fa: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
      // 4fd: invokestatic net/minecraft/client/renderer/GlStateManager.func_179145_e ()V
      // 500: invokestatic net/minecraft/client/renderer/GlStateManager.func_179098_w ()V
      // 503: aload 0
      // 504: aload 1
      // 505: dload 2
      // 506: dload 4
      // 508: dload 6
      // 50a: fload 8
      // 50c: fload 9
      // 50e: invokespecial net/minecraft/client/renderer/entity/Render.func_76986_a (Lnet/minecraft/entity/Entity;DDDFF)V
      // 511: return
      // try (3 -> 8): 9 java/lang/RuntimeException
      // try (5 -> 16): 17 java/lang/RuntimeException
      // try (11 -> 20): 20 java/lang/RuntimeException
      // try (155 -> 172): 172 java/lang/RuntimeException
      // try (175 -> 193): 194 java/lang/RuntimeException
      // try (196 -> 223): 224 java/lang/RuntimeException
      // try (226 -> 293): 294 java/lang/RuntimeException
      // try (296 -> 304): 304 java/lang/RuntimeException
      // try (442 -> 447): 447 java/lang/RuntimeException
   }

   @Nullable
   protected ResourceLocation a(n var1) {
      return a;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
