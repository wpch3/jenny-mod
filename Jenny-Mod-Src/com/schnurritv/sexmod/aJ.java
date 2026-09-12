package com.schnurritv.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.storage.MapData;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class aj {
   Minecraft d;
   float a = 2.0F;
   boolean h = false;
   private static final ResourceLocation f = new ResourceLocation("textures/map/map_background.png");
   p b;
   ResourceLocation e;
   Vec3i c;
   float g = 0.0F;

   @SubscribeEvent
   public void a(RenderSpecificHandEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: invokestatic com/schnurritv/sexmod/bg.h ()V
      // 003: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 006: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 009: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 00c: invokestatic com/schnurritv/sexmod/bg.e (Ljava/util/UUID;)Lcom/schnurritv/sexmod/bg;
      // 00f: astore 2
      // 010: aload 2
      // 011: ifnonnull 019
      // 014: return
      // 015: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 2
      // 01a: invokevirtual com/schnurritv/sexmod/bg.L ()I
      // 01d: istore 3
      // 01e: aload 0
      // 01f: aload 2
      // 020: iload 3
      // 021: invokevirtual com/schnurritv/sexmod/bg.b (I)Lcom/schnurritv/sexmod/p;
      // 024: putfield com/schnurritv/sexmod/aj.b Lcom/schnurritv/sexmod/p;
      // 027: aload 0
      // 028: new net/minecraft/util/ResourceLocation
      // 02b: dup
      // 02c: ldc "sexmod"
      // 02e: aload 2
      // 02f: iload 3
      // 030: invokevirtual com/schnurritv/sexmod/bg.c (I)Ljava/lang/String;
      // 033: invokespecial net/minecraft/util/ResourceLocation.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 036: putfield com/schnurritv/sexmod/aj.e Lnet/minecraft/util/ResourceLocation;
      // 039: aload 0
      // 03a: aload 2
      // 03b: iload 3
      // 03c: invokevirtual com/schnurritv/sexmod/bg.a (I)Lnet/minecraft/util/math/Vec3i;
      // 03f: putfield com/schnurritv/sexmod/aj.c Lnet/minecraft/util/math/Vec3i;
      // 042: aload 0
      // 043: getfield com/schnurritv/sexmod/aj.b Lcom/schnurritv/sexmod/p;
      // 046: ifnonnull 056
      // 049: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 04c: ldc "HAND IS NULL uwu did you forget to assign this girl a hand owo?"
      // 04e: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 051: return
      // 052: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: aload 0
      // 057: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 05a: putfield com/schnurritv/sexmod/aj.d Lnet/minecraft/client/Minecraft;
      // 05d: fconst_0
      // 05e: fstore 4
      // 060: fconst_0
      // 061: fstore 5
      // 063: aload 0
      // 064: getfield com/schnurritv/sexmod/aj.d Lnet/minecraft/client/Minecraft;
      // 067: invokevirtual net/minecraft/client/Minecraft.func_175597_ag ()Lnet/minecraft/client/renderer/ItemRenderer;
      // 06a: astore 6
      // 06c: getstatic net/minecraft/launchwrapper/Launch.blackboard Ljava/util/Map;
      // 06f: ldc "fml.deobfuscatedEnvironment"
      // 071: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 076: checkcast java/lang/Boolean
      // 079: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07c: ifeq 0a4
      // 07f: ldc net/minecraft/client/renderer/ItemRenderer
      // 081: aload 6
      // 083: ldc "prevEquippedProgressMainHand"
      // 085: invokestatic net/minecraftforge/fml/common/ObfuscationReflectionHelper.getPrivateValue (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
      // 088: checkcast java/lang/Float
      // 08b: invokevirtual java/lang/Float.floatValue ()F
      // 08e: fstore 4
      // 090: ldc net/minecraft/client/renderer/ItemRenderer
      // 092: aload 6
      // 094: ldc "equippedProgressMainHand"
      // 096: invokestatic net/minecraftforge/fml/common/ObfuscationReflectionHelper.getPrivateValue (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
      // 099: checkcast java/lang/Float
      // 09c: invokevirtual java/lang/Float.floatValue ()F
      // 09f: fstore 5
      // 0a1: goto 0c6
      // 0a4: ldc net/minecraft/client/renderer/ItemRenderer
      // 0a6: aload 6
      // 0a8: ldc "field_187470_g"
      // 0aa: invokestatic net/minecraftforge/fml/common/ObfuscationReflectionHelper.getPrivateValue (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
      // 0ad: checkcast java/lang/Float
      // 0b0: invokevirtual java/lang/Float.floatValue ()F
      // 0b3: fstore 4
      // 0b5: ldc net/minecraft/client/renderer/ItemRenderer
      // 0b7: aload 6
      // 0b9: ldc "field_187469_f"
      // 0bb: invokestatic net/minecraftforge/fml/common/ObfuscationReflectionHelper.getPrivateValue (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
      // 0be: checkcast java/lang/Float
      // 0c1: invokevirtual java/lang/Float.floatValue ()F
      // 0c4: fstore 5
      // 0c6: aload 0
      // 0c7: fconst_2
      // 0c8: fload 4
      // 0ca: fload 5
      // 0cc: fload 4
      // 0ce: fsub
      // 0cf: aload 1
      // 0d0: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.getPartialTicks ()F
      // 0d3: fmul
      // 0d4: fadd
      // 0d5: fsub
      // 0d6: putfield com/schnurritv/sexmod/aj.a F
      // 0d9: goto 10b
      // 0dc: astore 6
      // 0de: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0e1: ldc "couldnt do the reflection thingy"
      // 0e3: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0e6: new java/io/StringWriter
      // 0e9: dup
      // 0ea: invokespecial java/io/StringWriter.<init> ()V
      // 0ed: astore 7
      // 0ef: aload 6
      // 0f1: new java/io/PrintWriter
      // 0f4: dup
      // 0f5: aload 7
      // 0f7: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 0fa: invokevirtual java/lang/Exception.printStackTrace (Ljava/io/PrintWriter;)V
      // 0fd: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 100: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 103: aload 7
      // 105: invokevirtual java/io/StringWriter.toString ()Ljava/lang/String;
      // 108: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_71165_d (Ljava/lang/String;)V
      // 10b: aload 0
      // 10c: getfield com/schnurritv/sexmod/aj.d Lnet/minecraft/client/Minecraft;
      // 10f: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 112: astore 6
      // 114: aload 6
      // 116: aload 1
      // 117: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.getPartialTicks ()F
      // 11a: invokevirtual net/minecraft/client/entity/AbstractClientPlayer.func_70678_g (F)F
      // 11d: fstore 7
      // 11f: aload 0
      // 120: getfield com/schnurritv/sexmod/aj.d Lnet/minecraft/client/Minecraft;
      // 123: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 126: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184614_ca ()Lnet/minecraft/item/ItemStack;
      // 129: astore 8
      // 12b: aload 0
      // 12c: getfield com/schnurritv/sexmod/aj.c Lnet/minecraft/util/math/Vec3i;
      // 12f: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
      // 132: i2f
      // 133: ldc 255.0
      // 135: fdiv
      // 136: aload 0
      // 137: getfield com/schnurritv/sexmod/aj.c Lnet/minecraft/util/math/Vec3i;
      // 13a: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
      // 13d: i2f
      // 13e: ldc 255.0
      // 140: fdiv
      // 141: aload 0
      // 142: getfield com/schnurritv/sexmod/aj.c Lnet/minecraft/util/math/Vec3i;
      // 145: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
      // 148: i2f
      // 149: ldc 255.0
      // 14b: fdiv
      // 14c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179124_c (FFF)V
      // 14f: aload 1
      // 150: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.getHand ()Lnet/minecraft/util/EnumHand;
      // 153: getstatic net/minecraft/util/EnumHand.MAIN_HAND Lnet/minecraft/util/EnumHand;
      // 156: if_acmpne 1d9
      // 159: aload 8
      // 15b: invokevirtual net/minecraft/item/ItemStack.func_190926_b ()Z
      // 15e: ifne 17a
      // 161: goto 168
      // 164: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: aload 8
      // 16a: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 16d: instanceof net/minecraft/item/ItemMap
      // 170: ifeq 19d
      // 173: goto 17a
      // 176: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: aload 1
      // 17b: bipush 1
      // 17c: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.setCanceled (Z)V
      // 17f: aload 0
      // 180: aload 8
      // 182: aload 1
      // 183: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.getPartialTicks ()F
      // 186: aload 6
      // 188: aload 0
      // 189: getfield com/schnurritv/sexmod/aj.a F
      // 18c: fload 7
      // 18e: invokevirtual com/schnurritv/sexmod/aj.a (Lnet/minecraft/item/ItemStack;FLnet/minecraft/client/entity/AbstractClientPlayer;FF)V
      // 191: aload 0
      // 192: bipush 1
      // 193: putfield com/schnurritv/sexmod/aj.h Z
      // 196: goto 211
      // 199: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: fload 5
      // 19f: fload 4
      // 1a1: fcmpg
      // 1a2: ifge 1d1
      // 1a5: aload 0
      // 1a6: getfield com/schnurritv/sexmod/aj.h Z
      // 1a9: ifeq 211
      // 1ac: goto 1b3
      // 1af: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: aload 1
      // 1b4: bipush 1
      // 1b5: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.setCanceled (Z)V
      // 1b8: aload 0
      // 1b9: aload 8
      // 1bb: aload 1
      // 1bc: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.getPartialTicks ()F
      // 1bf: aload 6
      // 1c1: aload 0
      // 1c2: getfield com/schnurritv/sexmod/aj.a F
      // 1c5: fload 7
      // 1c7: invokevirtual com/schnurritv/sexmod/aj.a (Lnet/minecraft/item/ItemStack;FLnet/minecraft/client/entity/AbstractClientPlayer;FF)V
      // 1ca: goto 211
      // 1cd: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d0: athrow
      // 1d1: aload 0
      // 1d2: bipush 0
      // 1d3: putfield com/schnurritv/sexmod/aj.h Z
      // 1d6: goto 211
      // 1d9: aload 0
      // 1da: getfield com/schnurritv/sexmod/aj.d Lnet/minecraft/client/Minecraft;
      // 1dd: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1e0: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184592_cb ()Lnet/minecraft/item/ItemStack;
      // 1e3: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 1e6: instanceof net/minecraft/item/ItemMap
      // 1e9: ifeq 211
      // 1ec: aload 1
      // 1ed: bipush 1
      // 1ee: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.setCanceled (Z)V
      // 1f1: aload 0
      // 1f2: getstatic net/minecraft/util/EnumHandSide.LEFT Lnet/minecraft/util/EnumHandSide;
      // 1f5: aload 0
      // 1f6: getfield com/schnurritv/sexmod/aj.a F
      // 1f9: fconst_1
      // 1fa: fsub
      // 1fb: fload 7
      // 1fd: aload 0
      // 1fe: getfield com/schnurritv/sexmod/aj.d Lnet/minecraft/client/Minecraft;
      // 201: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 204: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184592_cb ()Lnet/minecraft/item/ItemStack;
      // 207: invokevirtual com/schnurritv/sexmod/aj.a (Lnet/minecraft/util/EnumHandSide;FFLnet/minecraft/item/ItemStack;)V
      // 20a: goto 211
      // 20d: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 210: athrow
      // 211: invokestatic net/minecraft/client/renderer/GlStateManager.func_179117_G ()V
      // 214: return
      // try (14 -> 40): 40 java/lang/Exception
      // try (6 -> 9): 9 java/lang/Exception
      // try (49 -> 100): 101 java/lang/Exception
      // try (134 -> 160): 161 java/lang/Exception
      // try (157 -> 167): 168 java/lang/Exception
      // try (163 -> 186): 186 java/lang/Exception
      // try (188 -> 195): 196 java/lang/Exception
      // try (192 -> 211): 211 java/lang/Exception
      // try (217 -> 239): 240 java/lang/Exception
   }

   void a(ItemStack param1, float param2, AbstractClientPlayer param3, float param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 04: instanceof net/minecraft/item/ItemMap
      // 07: ifeq 3c
      // 0a: aload 3
      // 0b: invokevirtual net/minecraft/client/entity/AbstractClientPlayer.func_184592_cb ()Lnet/minecraft/item/ItemStack;
      // 0e: invokevirtual net/minecraft/item/ItemStack.func_190926_b ()Z
      // 11: ifeq 2b
      // 14: goto 1b
      // 17: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: aload 3
      // 1e: fload 5
      // 20: fload 2
      // 21: invokevirtual com/schnurritv/sexmod/aj.a (Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/entity/AbstractClientPlayer;FF)V
      // 24: goto 43
      // 27: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getstatic net/minecraft/util/EnumHandSide.RIGHT Lnet/minecraft/util/EnumHandSide;
      // 2f: fload 4
      // 31: fconst_1
      // 32: fsub
      // 33: fload 5
      // 35: aload 1
      // 36: invokevirtual com/schnurritv/sexmod/aj.a (Lnet/minecraft/util/EnumHandSide;FFLnet/minecraft/item/ItemStack;)V
      // 39: goto 43
      // 3c: aload 0
      // 3d: fload 5
      // 3f: fload 2
      // 40: invokevirtual com/schnurritv/sexmod/aj.a (FF)V
      // 43: return
      // try (0 -> 8): 9 java/lang/RuntimeException
      // try (4 -> 18): 18 java/lang/RuntimeException
   }

   void a(EnumHandSide param1, float param2, float param3, ItemStack param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getstatic net/minecraft/util/EnumHandSide.RIGHT Lnet/minecraft/util/EnumHandSide;
      // 004: if_acmpne 00f
      // 007: fconst_1
      // 008: goto 011
      // 00b: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00e: athrow
      // 00f: ldc -1.0
      // 011: fstore 5
      // 013: fload 5
      // 015: ldc 0.125
      // 017: fmul
      // 018: ldc -0.125
      // 01a: fconst_0
      // 01b: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 01e: aload 0
      // 01f: getfield com/schnurritv/sexmod/aj.d Lnet/minecraft/client/Minecraft;
      // 022: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 025: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_82150_aj ()Z
      // 028: ifne 08b
      // 02b: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 02e: fload 5
      // 030: ldc 10.0
      // 032: fmul
      // 033: fconst_0
      // 034: fconst_0
      // 035: fconst_1
      // 036: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 039: aload 0
      // 03a: fload 2
      // 03b: fload 3
      // 03c: aload 1
      // 03d: invokespecial com/schnurritv/sexmod/aj.a (FFLnet/minecraft/util/EnumHandSide;)V
      // 040: ldc -0.5
      // 042: ldc -1.1
      // 044: fconst_0
      // 045: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 048: aload 1
      // 049: getstatic net/minecraft/util/EnumHandSide.RIGHT Lnet/minecraft/util/EnumHandSide;
      // 04c: if_acmpne 065
      // 04f: goto 056
      // 052: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: ldc 0.48
      // 058: ldc 0.15
      // 05a: fconst_0
      // 05b: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 05e: goto 06d
      // 061: invokestatic com/schnurritv/sexmod/aj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: ldc 0.44
      // 067: ldc 1.3
      // 069: fconst_1
      // 06a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 06d: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 070: invokevirtual net/minecraft/client/Minecraft.func_110434_K ()Lnet/minecraft/client/renderer/texture/TextureManager;
      // 073: aload 0
      // 074: getfield com/schnurritv/sexmod/aj.e Lnet/minecraft/util/ResourceLocation;
      // 077: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
      // 07a: aload 0
      // 07b: getfield com/schnurritv/sexmod/aj.b Lcom/schnurritv/sexmod/p;
      // 07e: invokeinterface com/schnurritv/sexmod/p.a ()Lnet/minecraft/client/model/ModelRenderer; 1
      // 083: ldc 0.175
      // 085: invokevirtual net/minecraft/client/model/ModelRenderer.func_78785_a (F)V
      // 088: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 08b: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 08e: fload 5
      // 090: ldc 0.51
      // 092: fmul
      // 093: ldc -0.08
      // 095: fload 2
      // 096: ldc -1.2
      // 098: fmul
      // 099: fadd
      // 09a: ldc -0.75
      // 09c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 09f: fload 3
      // 0a0: invokestatic net/minecraft/util/math/MathHelper.func_76129_c (F)F
      // 0a3: fstore 6
      // 0a5: fload 6
      // 0a7: ldc 3.1415927
      // 0a9: fmul
      // 0aa: invokestatic net/minecraft/util/math/MathHelper.func_76126_a (F)F
      // 0ad: fstore 7
      // 0af: ldc -0.5
      // 0b1: fload 7
      // 0b3: fmul
      // 0b4: fstore 8
      // 0b6: ldc 0.4
      // 0b8: fload 6
      // 0ba: ldc 6.2831855
      // 0bc: fmul
      // 0bd: invokestatic net/minecraft/util/math/MathHelper.func_76126_a (F)F
      // 0c0: fmul
      // 0c1: fstore 9
      // 0c3: ldc -0.3
      // 0c5: fload 3
      // 0c6: ldc 3.1415927
      // 0c8: fmul
      // 0c9: invokestatic net/minecraft/util/math/MathHelper.func_76126_a (F)F
      // 0cc: fmul
      // 0cd: fstore 10
      // 0cf: fload 5
      // 0d1: fload 8
      // 0d3: fmul
      // 0d4: fload 9
      // 0d6: ldc 0.3
      // 0d8: fload 7
      // 0da: fmul
      // 0db: fsub
      // 0dc: fload 10
      // 0de: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
      // 0e1: fload 7
      // 0e3: ldc -45.0
      // 0e5: fmul
      // 0e6: fconst_1
      // 0e7: fconst_0
      // 0e8: fconst_0
      // 0e9: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 0ec: fload 5
      // 0ee: fload 7
      // 0f0: fmul
      // 0f1: ldc -30.0
      // 0f3: fmul
      // 0f4: fconst_0
      // 0f5: fconst_1
      // 0f6: fconst_0
      // 0f7: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 0fa: aload 0
      // 0fb: aload 4
      // 0fd: invokevirtual com/schnurritv/sexmod/aj.a (Lnet/minecraft/item/ItemStack;)V
      // 100: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 103: return
      // try (0 -> 5): 5 java/lang/RuntimeException
      // try (9 -> 40): 41 java/lang/RuntimeException
      // try (20 -> 48): 48 java/lang/RuntimeException
   }

   void a(ItemStack var1, AbstractClientPlayer var2, float var3, float var4) {
      float var5 = var2.field_70127_C + (var2.field_70125_A - var2.field_70127_C) * var4;
      float var6 = MathHelper.func_76129_c(var3);
      float var7 = -0.2F * MathHelper.func_76126_a(var3 * (float) Math.PI);
      float var8 = -0.4F * MathHelper.func_76126_a(var6 * (float) Math.PI);
      GlStateManager.func_179109_b(0.0F, -var7 / 2.0F, var8);
      float var9 = this.a(var5);
      GlStateManager.func_179109_b(0.0F, 0.04F + (this.a - 1.0F) * -1.2F + var9 * -0.5F, -0.72F);
      GlStateManager.func_179114_b(var9 * -85.0F, 1.0F, 0.0F, 0.0F);
      GlStateManager.func_179129_p();
      GlStateManager.func_179094_E();
      GlStateManager.func_179114_b(90.0F, 0.0F, 1.0F, 0.0F);
      this.a(EnumHandSide.RIGHT);
      this.a(EnumHandSide.LEFT);
      GlStateManager.func_179121_F();
      GlStateManager.func_179089_o();
      float var10 = MathHelper.func_76126_a(var6 * (float) Math.PI);
      GlStateManager.func_179114_b(var10 * 20.0F, 1.0F, 0.0F, 0.0F);
      GlStateManager.func_179152_a(2.0F, 2.0F, 2.0F);
      this.a(var1);
      GlStateManager.func_179145_e();
   }

   void a(ItemStack var1) {
      GlStateManager.func_179117_G();
      GlStateManager.func_179114_b(180.0F, 0.0F, 1.0F, 0.0F);
      GlStateManager.func_179114_b(180.0F, 0.0F, 0.0F, 1.0F);
      GlStateManager.func_179152_a(0.38F, 0.38F, 0.38F);
      GlStateManager.func_179140_f();
      this.d.func_110434_K().func_110577_a(f);
      Tessellator var2 = Tessellator.func_178181_a();
      BufferBuilder var3 = var2.func_178180_c();
      GlStateManager.func_179109_b(-0.5F, -0.5F, 0.0F);
      GlStateManager.func_179152_a(0.0078125F, 0.0078125F, 0.0078125F);
      var3.func_181668_a(7, DefaultVertexFormats.field_181707_g);
      var3.func_181662_b(-7.0, 135.0, 0.0).func_187315_a(0.0, 1.0).func_181675_d();
      var3.func_181662_b(135.0, 135.0, 0.0).func_187315_a(1.0, 1.0).func_181675_d();
      var3.func_181662_b(135.0, -7.0, 0.0).func_187315_a(1.0, 0.0).func_181675_d();
      var3.func_181662_b(-7.0, -7.0, 0.0).func_187315_a(0.0, 0.0).func_181675_d();
      var2.func_78381_a();
      MapData var4 = ((ItemMap)var1.func_77973_b()).func_77873_a(var1, this.d.field_71441_e);

      try {
         if (var4 != null) {
            this.d.field_71460_t.func_147701_i().func_148250_a(var4, false);
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      GlStateManager.func_179124_c(this.c.func_177958_n() / 255.0F, this.c.func_177956_o() / 255.0F, this.c.func_177952_p() / 255.0F);
   }

   private void a(EnumHandSide var1) {
      float var10000;
      label30: {
         try {
            GlStateManager.func_179094_E();
            if (var1 == EnumHandSide.RIGHT) {
               var10000 = 1.0F;
               break label30;
            }
         } catch (RuntimeException var4) {
            throw a(var4);
         }

         var10000 = -1.0F;
      }

      float var2 = var10000;

      label22: {
         try {
            GlStateManager.func_179114_b(92.0F, 0.0F, 1.0F, 0.0F);
            GlStateManager.func_179114_b(45.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.func_179114_b(var2 * -41.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.func_179109_b(var2 * 0.3F, -1.1F, 0.45F);
            if (var1 == EnumHandSide.RIGHT) {
               GlStateManager.func_179109_b(0.63F, 0.36F, 0.0F);
               break label22;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         GlStateManager.func_179109_b(1.6F, 0.35F, 0.0F);
      }

      Minecraft.func_71410_x().func_110434_K().func_110577_a(this.e);
      this.b.a().func_78785_a(0.175F);
      GlStateManager.func_179121_F();
   }

   private float a(float var1) {
      float var2 = 1.0F - var1 / 45.0F + 0.1F;
      var2 = MathHelper.func_76131_a(var2, 0.0F, 1.0F);
      return -MathHelper.func_76134_b(var2 * (float) Math.PI) * 0.5F + 0.5F;
   }

   void a(float var1, float var2) {
      GlStateManager.func_179129_p();
      GlStateManager.func_179094_E();
      this.a(this.a, var1, EnumHandSide.RIGHT);
      Minecraft.func_71410_x().func_110434_K().func_110577_a(this.e);
      this.b.a().func_78785_a(0.175F);
      GlStateManager.func_179084_k();
      GlStateManager.func_179089_o();
      GlStateManager.func_179121_F();
   }

   private void a(float var1, float var2, EnumHandSide var3) {
      boolean var10000;
      label30: {
         try {
            if (var3 != EnumHandSide.LEFT) {
               var10000 = true;
               break label30;
            }
         } catch (RuntimeException var13) {
            throw a(var13);
         }

         var10000 = false;
      }

      boolean var4 = var10000;

      label22: {
         try {
            if (var4) {
               var14 = 1.0F;
               break label22;
            }
         } catch (RuntimeException var12) {
            throw a(var12);
         }

         var14 = -1.0F;
      }

      float var5 = var14;
      float var6 = MathHelper.func_76129_c(var2);
      float var7 = -0.3F * MathHelper.func_76126_a(var6 * (float) Math.PI);
      float var8 = 0.4F * MathHelper.func_76126_a(var6 * (float) (Math.PI * 2));
      float var9 = -0.4F * MathHelper.func_76126_a(var2 * (float) Math.PI);
      GlStateManager.func_179109_b(var5 * (var7 + 0.64000005F), var8 + -0.6F + var1 * -0.6F, var9 + -0.71999997F);
      GlStateManager.func_179114_b(var5 * 45.0F, 0.0F, 1.0F, 0.0F);
      float var10 = MathHelper.func_76126_a(var2 * var2 * (float) Math.PI);
      float var11 = MathHelper.func_76126_a(var6 * (float) Math.PI);
      GlStateManager.func_179114_b(var5 * var11 * 70.0F, 0.0F, 1.0F, 0.0F);
      GlStateManager.func_179114_b(var5 * var10 * -20.0F, 0.0F, 0.0F, 1.0F);
      GlStateManager.func_179109_b(var5 * -1.0F, 3.6F, 3.5F);
      GlStateManager.func_179114_b(var5 * 120.0F, 0.0F, 0.0F, 1.0F);
      GlStateManager.func_179114_b(200.0F, 1.0F, 0.0F, 0.0F);
      GlStateManager.func_179114_b(var5 * -135.0F, 0.0F, 1.0F, 0.0F);
      GlStateManager.func_179109_b(var5 * 5.6F, 0.0F, 0.0F);
      GlStateManager.func_179109_b(0.5F, 1.1F, 0.0F);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
