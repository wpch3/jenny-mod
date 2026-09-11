package com.trolmastercard.sexmod;

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

public class cn {
    Minecraft f;
    float g = 2.0F;
    boolean c = false;
    private static final ResourceLocation e = new ResourceLocation("textures/map/map_background.png");
    at d;
    ResourceLocation h;
    Vec3i b;
    float a = 0.0F;

    @SubscribeEvent
    public void a(RenderSpecificHandEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: invokestatic com/trolmastercard/sexmod/ei.C ()V
        // 003: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 006: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 009: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 00c: invokestatic com/trolmastercard/sexmod/ei.d (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/ei;
        // 00f: astore 2
        // 010: aload 2
        // 011: ifnonnull 019
        // 014: return
        // 015: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 018: athrow
        // 019: aload 2
        // 01a: invokevirtual com/trolmastercard/sexmod/ei.ah ()I
        // 01d: istore 3
        // 01e: aload 0
        // 01f: aload 2
        // 020: iload 3
        // 021: invokevirtual com/trolmastercard/sexmod/ei.a (I)Lcom/trolmastercard/sexmod/at;
        // 024: putfield com/trolmastercard/sexmod/cn.d Lcom/trolmastercard/sexmod/at;
        // 027: aload 0
        // 028: new net/minecraft/util/ResourceLocation
        // 02b: dup
        // 02c: ldc "sexmod"
        // 02e: aload 2
        // 02f: iload 3
        // 030: invokevirtual com/trolmastercard/sexmod/ei.c (I)Ljava/lang/String;
        // 033: invokespecial net/minecraft/util/ResourceLocation.<init> (Ljava/lang/String;Ljava/lang/String;)V
        // 036: putfield com/trolmastercard/sexmod/cn.h Lnet/minecraft/util/ResourceLocation;
        // 039: aload 0
        // 03a: aload 2
        // 03b: iload 3
        // 03c: invokevirtual com/trolmastercard/sexmod/ei.b (I)Lnet/minecraft/util/math/Vec3i;
        // 03f: putfield com/trolmastercard/sexmod/cn.b Lnet/minecraft/util/math/Vec3i;
        // 042: aload 0
        // 043: getfield com/trolmastercard/sexmod/cn.d Lcom/trolmastercard/sexmod/at;
        // 046: ifnonnull 056
        // 049: getstatic java/lang/System.out Ljava/io/PrintStream;
        // 04c: ldc "HAND IS NULL uwu did you forget to assign this girl a hand owo?"
        // 04e: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
        // 051: return
        // 052: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 055: athrow
        // 056: aload 0
        // 057: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 05a: putfield com/trolmastercard/sexmod/cn.f Lnet/minecraft/client/Minecraft;
        // 05d: fconst_0
        // 05e: fstore 4
        // 060: fconst_0
        // 061: fstore 5
        // 063: aload 0
        // 064: getfield com/trolmastercard/sexmod/cn.f Lnet/minecraft/client/Minecraft;
        // 067: invokevirtual net/minecraft/client/Minecraft.func_175597_ag ()Lnet/minecraft/client/renderer/ItemRenderer;
        // 06a: astore 6
        // 06c: invokestatic com/trolmastercard/sexmod/ad.a ()Z
        // 06f: ifeq 097
        // 072: ldc net/minecraft/client/renderer/ItemRenderer
        // 074: aload 6
        // 076: ldc "prevEquippedProgressMainHand"
        // 078: invokestatic net/minecraftforge/fml/common/ObfuscationReflectionHelper.getPrivateValue (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        // 07b: checkcast java/lang/Float
        // 07e: invokevirtual java/lang/Float.floatValue ()F
        // 081: fstore 4
        // 083: ldc net/minecraft/client/renderer/ItemRenderer
        // 085: aload 6
        // 087: ldc "equippedProgressMainHand"
        // 089: invokestatic net/minecraftforge/fml/common/ObfuscationReflectionHelper.getPrivateValue (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        // 08c: checkcast java/lang/Float
        // 08f: invokevirtual java/lang/Float.floatValue ()F
        // 092: fstore 5
        // 094: goto 0b9
        // 097: ldc net/minecraft/client/renderer/ItemRenderer
        // 099: aload 6
        // 09b: ldc "field_187470_g"
        // 09d: invokestatic net/minecraftforge/fml/common/ObfuscationReflectionHelper.getPrivateValue (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        // 0a0: checkcast java/lang/Float
        // 0a3: invokevirtual java/lang/Float.floatValue ()F
        // 0a6: fstore 4
        // 0a8: ldc net/minecraft/client/renderer/ItemRenderer
        // 0aa: aload 6
        // 0ac: ldc "field_187469_f"
        // 0ae: invokestatic net/minecraftforge/fml/common/ObfuscationReflectionHelper.getPrivateValue (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        // 0b1: checkcast java/lang/Float
        // 0b4: invokevirtual java/lang/Float.floatValue ()F
        // 0b7: fstore 5
        // 0b9: aload 0
        // 0ba: fconst_2
        // 0bb: fload 4
        // 0bd: fload 5
        // 0bf: fload 4
        // 0c1: fsub
        // 0c2: aload 1
        // 0c3: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.getPartialTicks ()F
        // 0c6: fmul
        // 0c7: fadd
        // 0c8: fsub
        // 0c9: putfield com/trolmastercard/sexmod/cn.g F
        // 0cc: goto 0fe
        // 0cf: astore 6
        // 0d1: getstatic java/lang/System.out Ljava/io/PrintStream;
        // 0d4: ldc "couldnt do the reflection thingy"
        // 0d6: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
        // 0d9: new java/io/StringWriter
        // 0dc: dup
        // 0dd: invokespecial java/io/StringWriter.<init> ()V
        // 0e0: astore 7
        // 0e2: aload 6
        // 0e4: new java/io/PrintWriter
        // 0e7: dup
        // 0e8: aload 7
        // 0ea: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
        // 0ed: invokevirtual java/lang/Exception.printStackTrace (Ljava/io/PrintWriter;)V
        // 0f0: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 0f3: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0f6: aload 7
        // 0f8: invokevirtual java/io/StringWriter.toString ()Ljava/lang/String;
        // 0fb: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_71165_d (Ljava/lang/String;)V
        // 0fe: aload 0
        // 0ff: getfield com/trolmastercard/sexmod/cn.f Lnet/minecraft/client/Minecraft;
        // 102: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 105: astore 6
        // 107: aload 6
        // 109: aload 1
        // 10a: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.getPartialTicks ()F
        // 10d: invokevirtual net/minecraft/client/entity/AbstractClientPlayer.func_70678_g (F)F
        // 110: fstore 7
        // 112: aload 0
        // 113: getfield com/trolmastercard/sexmod/cn.f Lnet/minecraft/client/Minecraft;
        // 116: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 119: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184614_ca ()Lnet/minecraft/item/ItemStack;
        // 11c: astore 8
        // 11e: aload 0
        // 11f: getfield com/trolmastercard/sexmod/cn.b Lnet/minecraft/util/math/Vec3i;
        // 122: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 125: i2f
        // 126: ldc 255.0
        // 128: fdiv
        // 129: aload 0
        // 12a: getfield com/trolmastercard/sexmod/cn.b Lnet/minecraft/util/math/Vec3i;
        // 12d: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
        // 130: i2f
        // 131: ldc 255.0
        // 133: fdiv
        // 134: aload 0
        // 135: getfield com/trolmastercard/sexmod/cn.b Lnet/minecraft/util/math/Vec3i;
        // 138: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 13b: i2f
        // 13c: ldc 255.0
        // 13e: fdiv
        // 13f: invokestatic net/minecraft/client/renderer/GlStateManager.func_179124_c (FFF)V
        // 142: aload 1
        // 143: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.getHand ()Lnet/minecraft/util/EnumHand;
        // 146: getstatic net/minecraft/util/EnumHand.MAIN_HAND Lnet/minecraft/util/EnumHand;
        // 149: if_acmpne 1cc
        // 14c: aload 8
        // 14e: invokevirtual net/minecraft/item/ItemStack.func_190926_b ()Z
        // 151: ifne 16d
        // 154: goto 15b
        // 157: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 15a: athrow
        // 15b: aload 8
        // 15d: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 160: instanceof net/minecraft/item/ItemMap
        // 163: ifeq 190
        // 166: goto 16d
        // 169: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 16c: athrow
        // 16d: aload 1
        // 16e: bipush 1
        // 16f: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.setCanceled (Z)V
        // 172: aload 0
        // 173: aload 8
        // 175: aload 1
        // 176: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.getPartialTicks ()F
        // 179: aload 6
        // 17b: aload 0
        // 17c: getfield com/trolmastercard/sexmod/cn.g F
        // 17f: fload 7
        // 181: invokevirtual com/trolmastercard/sexmod/cn.a (Lnet/minecraft/item/ItemStack;FLnet/minecraft/client/entity/AbstractClientPlayer;FF)V
        // 184: aload 0
        // 185: bipush 1
        // 186: putfield com/trolmastercard/sexmod/cn.c Z
        // 189: goto 204
        // 18c: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 18f: athrow
        // 190: fload 5
        // 192: fload 4
        // 194: fcmpg
        // 195: ifge 1c4
        // 198: aload 0
        // 199: getfield com/trolmastercard/sexmod/cn.c Z
        // 19c: ifeq 204
        // 19f: goto 1a6
        // 1a2: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1a5: athrow
        // 1a6: aload 1
        // 1a7: bipush 1
        // 1a8: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.setCanceled (Z)V
        // 1ab: aload 0
        // 1ac: aload 8
        // 1ae: aload 1
        // 1af: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.getPartialTicks ()F
        // 1b2: aload 6
        // 1b4: aload 0
        // 1b5: getfield com/trolmastercard/sexmod/cn.g F
        // 1b8: fload 7
        // 1ba: invokevirtual com/trolmastercard/sexmod/cn.a (Lnet/minecraft/item/ItemStack;FLnet/minecraft/client/entity/AbstractClientPlayer;FF)V
        // 1bd: goto 204
        // 1c0: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1c3: athrow
        // 1c4: aload 0
        // 1c5: bipush 0
        // 1c6: putfield com/trolmastercard/sexmod/cn.c Z
        // 1c9: goto 204
        // 1cc: aload 0
        // 1cd: getfield com/trolmastercard/sexmod/cn.f Lnet/minecraft/client/Minecraft;
        // 1d0: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1d3: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184592_cb ()Lnet/minecraft/item/ItemStack;
        // 1d6: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 1d9: instanceof net/minecraft/item/ItemMap
        // 1dc: ifeq 204
        // 1df: aload 1
        // 1e0: bipush 1
        // 1e1: invokevirtual net/minecraftforge/client/event/RenderSpecificHandEvent.setCanceled (Z)V
        // 1e4: aload 0
        // 1e5: getstatic net/minecraft/util/EnumHandSide.LEFT Lnet/minecraft/util/EnumHandSide;
        // 1e8: aload 0
        // 1e9: getfield com/trolmastercard/sexmod/cn.g F
        // 1ec: fconst_1
        // 1ed: fsub
        // 1ee: fload 7
        // 1f0: aload 0
        // 1f1: getfield com/trolmastercard/sexmod/cn.f Lnet/minecraft/client/Minecraft;
        // 1f4: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1f7: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_184592_cb ()Lnet/minecraft/item/ItemStack;
        // 1fa: invokevirtual com/trolmastercard/sexmod/cn.a (Lnet/minecraft/util/EnumHandSide;FFLnet/minecraft/item/ItemStack;)V
        // 1fd: goto 204
        // 200: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 203: athrow
        // 204: invokestatic net/minecraft/client/renderer/GlStateManager.func_179117_G ()V
        // 207: return
        // try (14 -> 40): 40 java/lang/Exception
        // try (6 -> 9): 9 java/lang/Exception
        // try (49 -> 96): 97 java/lang/Exception
        // try (130 -> 156): 157 java/lang/Exception
        // try (153 -> 163): 164 java/lang/Exception
        // try (159 -> 182): 182 java/lang/Exception
        // try (184 -> 191): 192 java/lang/Exception
        // try (188 -> 207): 207 java/lang/Exception
        // try (213 -> 235): 236 java/lang/Exception
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
        // 17: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1a: athrow
        // 1b: aload 0
        // 1c: aload 1
        // 1d: aload 3
        // 1e: fload 5
        // 20: fload 2
        // 21: invokevirtual com/trolmastercard/sexmod/cn.a (Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/entity/AbstractClientPlayer;FF)V
        // 24: goto 43
        // 27: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2a: athrow
        // 2b: aload 0
        // 2c: getstatic net/minecraft/util/EnumHandSide.RIGHT Lnet/minecraft/util/EnumHandSide;
        // 2f: fload 4
        // 31: fconst_1
        // 32: fsub
        // 33: fload 5
        // 35: aload 1
        // 36: invokevirtual com/trolmastercard/sexmod/cn.a (Lnet/minecraft/util/EnumHandSide;FFLnet/minecraft/item/ItemStack;)V
        // 39: goto 43
        // 3c: aload 0
        // 3d: fload 5
        // 3f: fload 2
        // 40: invokevirtual com/trolmastercard/sexmod/cn.a (FF)V
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
        // 00b: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
        // 01f: getfield com/trolmastercard/sexmod/cn.f Lnet/minecraft/client/Minecraft;
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
        // 03d: invokespecial com/trolmastercard/sexmod/cn.a (FFLnet/minecraft/util/EnumHandSide;)V
        // 040: ldc -0.5
        // 042: ldc -1.1
        // 044: fconst_0
        // 045: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 048: aload 1
        // 049: getstatic net/minecraft/util/EnumHandSide.RIGHT Lnet/minecraft/util/EnumHandSide;
        // 04c: if_acmpne 065
        // 04f: goto 056
        // 052: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 055: athrow
        // 056: ldc 0.48
        // 058: ldc 0.15
        // 05a: fconst_0
        // 05b: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 05e: goto 06d
        // 061: invokestatic com/trolmastercard/sexmod/cn.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 064: athrow
        // 065: ldc 0.44
        // 067: ldc 1.3
        // 069: fconst_1
        // 06a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 06d: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 070: invokevirtual net/minecraft/client/Minecraft.func_110434_K ()Lnet/minecraft/client/renderer/texture/TextureManager;
        // 073: aload 0
        // 074: getfield com/trolmastercard/sexmod/cn.h Lnet/minecraft/util/ResourceLocation;
        // 077: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
        // 07a: aload 0
        // 07b: getfield com/trolmastercard/sexmod/cn.d Lcom/trolmastercard/sexmod/at;
        // 07e: invokeinterface com/trolmastercard/sexmod/at.a ()Lnet/minecraft/client/model/ModelRenderer; 1
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
        // 0fd: invokevirtual com/trolmastercard/sexmod/cn.a (Lnet/minecraft/item/ItemStack;)V
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
        GlStateManager.func_179109_b(0.0F, 0.04F + (this.g - 1.0F) * -1.2F + var9 * -0.5F, -0.72F);
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
        this.f.func_110434_K().func_110577_a(e);
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
        MapData var4 = ((ItemMap)var1.func_77973_b()).func_77873_a(var1, this.f.field_71441_e);

        try {
            if (var4 != null) {
                this.f.field_71460_t.func_147701_i().func_148250_a(var4, false);
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        GlStateManager.func_179124_c(this.b.func_177958_n() / 255.0F, this.b.func_177956_o() / 255.0F, this.b.func_177952_p() / 255.0F);
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

        Minecraft.func_71410_x().func_110434_K().func_110577_a(this.h);
        this.d.a().func_78785_a(0.175F);
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
        this.a(this.g, var1, EnumHandSide.RIGHT);
        Minecraft.func_71410_x().func_110434_K().func_110577_a(this.h);
        this.d.a().func_78785_a(0.175F);
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
