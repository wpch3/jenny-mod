package com.schnurritv.sexmod;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class a extends GuiScreen {
   final bi n;
   final EntityPlayer f;
   final String[] k;
   @Nullable
   final ItemStack[] h;
   static final ResourceLocation m = new ResourceLocation("sexmod", "textures/gui/girlinventory.png");
   EntityDataManager a;
   final boolean l;
   float c = 0.0F;
   float b = 0.0F;
   String[] i = new String[]{"action.names.followme", "action.names.stopfollowme", "action.names.gohome", "action.names.setnewhome", "action.names.equipment"};
   int[] e = new int[]{0, 0, 0, 0, 0};
   int[] d = new int[]{64, 80, 47, 32, 96};
   int[] j = new int[]{4, 4, 5, 5, 4};
   int[] g = new int[]{50, 90, 50, 80, 60};

   public a(bi var1, EntityPlayer var2) {
      this.n = var1;
      this.f = var2;
      this.k = new String[0];
      this.h = new ItemStack[0];
      this.l = true;
      this.a = var1.func_184212_Q();
   }

   public a(bi var1, EntityPlayer var2, String[] var3, @Nullable ItemStack[] var4, boolean var5) {
      this.n = var1;
      this.f = var2;
      this.k = var3;
      this.h = var4;
      this.l = var5;
      this.a = var1.func_184212_Q();
   }

   public boolean func_73868_f() {
      return false;
   }

   @SideOnly(Side.CLIENT)
   public void func_146281_b() {
      super.func_146281_b();
      this.n.y();
   }

   protected void func_146284_a(GuiButton param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
      // 004: bipush 5
      // 005: if_icmplt 03f
      // 008: aload 0
      // 009: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 00c: ifnull 03f
      // 00f: goto 016
      // 012: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 015: athrow
      // 016: aload 0
      // 017: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 01a: aload 1
      // 01b: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
      // 01e: bipush 5
      // 01f: isub
      // 020: aaload
      // 021: ifnull 03f
      // 024: goto 02b
      // 027: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: getfield com/schnurritv/sexmod/a.f Lnet/minecraft/entity/player/EntityPlayer;
      // 02f: getfield net/minecraft/entity/player/EntityPlayer.field_71075_bZ Lnet/minecraft/entity/player/PlayerCapabilities;
      // 032: getfield net/minecraft/entity/player/PlayerCapabilities.field_75098_d Z
      // 035: ifeq 049
      // 038: goto 03f
      // 03b: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03e: athrow
      // 03f: aload 0
      // 040: aload 1
      // 041: invokevirtual com/schnurritv/sexmod/a.a (Lnet/minecraft/client/gui/GuiButton;)V
      // 044: return
      // 045: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: aload 0
      // 04a: getfield com/schnurritv/sexmod/a.f Lnet/minecraft/entity/player/EntityPlayer;
      // 04d: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
      // 050: getfield net/minecraft/entity/player/InventoryPlayer.field_70462_a Lnet/minecraft/util/NonNullList;
      // 053: invokevirtual net/minecraft/util/NonNullList.iterator ()Ljava/util/Iterator;
      // 056: astore 2
      // 057: aload 2
      // 058: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05d: ifeq 0e6
      // 060: aload 2
      // 061: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 066: checkcast net/minecraft/item/ItemStack
      // 069: astore 3
      // 06a: aload 3
      // 06b: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 06e: aload 0
      // 06f: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 072: aload 1
      // 073: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
      // 076: bipush 5
      // 077: isub
      // 078: aaload
      // 079: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 07c: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 07f: ifeq 0e3
      // 082: aload 3
      // 083: invokevirtual net/minecraft/item/ItemStack.func_190916_E ()I
      // 086: aload 0
      // 087: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 08a: aload 1
      // 08b: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
      // 08e: bipush 5
      // 08f: isub
      // 090: aaload
      // 091: invokevirtual net/minecraft/item/ItemStack.func_190916_E ()I
      // 094: if_icmplt 0e3
      // 097: goto 09e
      // 09a: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09d: athrow
      // 09e: aload 3
      // 09f: invokevirtual net/minecraft/item/ItemStack.func_77960_j ()I
      // 0a2: aload 0
      // 0a3: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 0a6: aload 1
      // 0a7: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
      // 0aa: bipush 5
      // 0ab: isub
      // 0ac: aaload
      // 0ad: invokevirtual net/minecraft/item/ItemStack.func_77960_j ()I
      // 0b0: if_icmpne 0e3
      // 0b3: goto 0ba
      // 0b6: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b9: athrow
      // 0ba: getstatic com/schnurritv/sexmod/at.a Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
      // 0bd: new com/schnurritv/sexmod/aM
      // 0c0: dup
      // 0c1: aload 0
      // 0c2: getfield com/schnurritv/sexmod/a.f Lnet/minecraft/entity/player/EntityPlayer;
      // 0c5: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
      // 0c8: aload 0
      // 0c9: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 0cc: aload 1
      // 0cd: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
      // 0d0: bipush 5
      // 0d1: isub
      // 0d2: aaload
      // 0d3: invokespecial com/schnurritv/sexmod/aM.<init> (Ljava/util/UUID;Lnet/minecraft/item/ItemStack;)V
      // 0d6: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
      // 0d9: aload 0
      // 0da: aload 1
      // 0db: invokevirtual com/schnurritv/sexmod/a.a (Lnet/minecraft/client/gui/GuiButton;)V
      // 0de: return
      // 0df: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e2: athrow
      // 0e3: goto 057
      // 0e6: aload 0
      // 0e7: getfield com/schnurritv/sexmod/a.f Lnet/minecraft/entity/player/EntityPlayer;
      // 0ea: new net/minecraft/util/text/TextComponentString
      // 0ed: dup
      // 0ee: new java/lang/StringBuilder
      // 0f1: dup
      // 0f2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f5: ldc "<"
      // 0f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fa: aload 0
      // 0fb: getfield com/schnurritv/sexmod/a.n Lcom/schnurritv/sexmod/bi;
      // 0fe: invokevirtual com/schnurritv/sexmod/bi.func_70005_c_ ()Ljava/lang/String;
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104: ldc "> you cannot afford that..."
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 109: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10c: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
      // 10f: invokevirtual net/minecraft/entity/player/EntityPlayer.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V
      // 112: aload 0
      // 113: getfield com/schnurritv/sexmod/a.n Lcom/schnurritv/sexmod/bi;
      // 116: getstatic com/schnurritv/sexmod/az.GIRLS_JENNY_SADOH [Lnet/minecraft/util/SoundEvent;
      // 119: bipush 1
      // 11a: aaload
      // 11b: invokevirtual com/schnurritv/sexmod/bi.a (Lnet/minecraft/util/SoundEvent;)V
      // 11e: return
      // try (0 -> 7): 8 java/lang/RuntimeException
      // try (4 -> 18): 19 java/lang/RuntimeException
      // try (10 -> 26): 27 java/lang/RuntimeException
      // try (21 -> 33): 33 java/lang/RuntimeException
      // try (48 -> 71): 72 java/lang/RuntimeException
      // try (60 -> 85): 86 java/lang/RuntimeException
      // try (74 -> 107): 107 java/lang/RuntimeException
   }

   void a(GuiButton var1) {
      String var2;
      if (var1.field_146127_k < 5) {
         var2 = this.i[var1.field_146127_k];
      } else {
         var2 = this.k[var1.field_146127_k - 5];
      }

      this.n.a(var2, this.f.getPersistentID());
      Minecraft.func_71410_x().field_71439_g.func_71053_j();
   }

   public void func_73863_a(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: iload 1
      // 002: iload 2
      // 003: fload 3
      // 004: invokespecial net/minecraft/client/gui/GuiScreen.func_73863_a (IIF)V
      // 007: aload 0
      // 008: getfield com/schnurritv/sexmod/a.field_146292_n Ljava/util/List;
      // 00b: invokeinterface java/util/List.clear ()V 1
      // 010: new net/minecraft/client/gui/ScaledResolution
      // 013: dup
      // 014: aload 0
      // 015: getfield com/schnurritv/sexmod/a.field_146297_k Lnet/minecraft/client/Minecraft;
      // 018: invokespecial net/minecraft/client/gui/ScaledResolution.<init> (Lnet/minecraft/client/Minecraft;)V
      // 01b: astore 4
      // 01d: aload 4
      // 01f: invokevirtual net/minecraft/client/gui/ScaledResolution.func_78326_a ()I
      // 022: istore 5
      // 024: aload 4
      // 026: invokevirtual net/minecraft/client/gui/ScaledResolution.func_78328_b ()I
      // 029: istore 6
      // 02b: aload 0
      // 02c: fconst_1
      // 02d: aload 0
      // 02e: getfield com/schnurritv/sexmod/a.c F
      // 031: aload 0
      // 032: getfield com/schnurritv/sexmod/a.field_146297_k Lnet/minecraft/client/Minecraft;
      // 035: invokevirtual net/minecraft/client/Minecraft.func_193989_ak ()F
      // 038: ldc 5.0
      // 03a: fdiv
      // 03b: fadd
      // 03c: invokestatic java/lang/Math.min (FF)F
      // 03f: putfield com/schnurritv/sexmod/a.c F
      // 042: aload 0
      // 043: getfield com/schnurritv/sexmod/a.c F
      // 046: fconst_1
      // 047: fcmpl
      // 048: ifne 069
      // 04b: aload 0
      // 04c: fconst_1
      // 04d: aload 0
      // 04e: getfield com/schnurritv/sexmod/a.b F
      // 051: aload 0
      // 052: getfield com/schnurritv/sexmod/a.field_146297_k Lnet/minecraft/client/Minecraft;
      // 055: invokevirtual net/minecraft/client/Minecraft.func_193989_ak ()F
      // 058: ldc 5.0
      // 05a: fdiv
      // 05b: fadd
      // 05c: invokestatic java/lang/Math.min (FF)F
      // 05f: putfield com/schnurritv/sexmod/a.b F
      // 062: goto 069
      // 065: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 068: athrow
      // 069: ldc 115.0
      // 06b: ldc 161.0
      // 06d: aload 0
      // 06e: getfield com/schnurritv/sexmod/a.b F
      // 071: invokestatic com/schnurritv/sexmod/b1.a (FFF)F
      // 074: f2i
      // 075: istore 7
      // 077: ldc 91.0
      // 079: ldc 137.0
      // 07b: aload 0
      // 07c: getfield com/schnurritv/sexmod/a.b F
      // 07f: invokestatic com/schnurritv/sexmod/b1.a (FFF)F
      // 082: f2i
      // 083: istore 8
      // 085: ldc -30.0
      // 087: ldc 120.0
      // 089: aload 0
      // 08a: getfield com/schnurritv/sexmod/a.c F
      // 08d: invokestatic com/schnurritv/sexmod/b1.a (FFF)F
      // 090: f2i
      // 091: istore 9
      // 093: bipush 70
      // 095: istore 10
      // 097: bipush 52
      // 099: istore 11
      // 09b: bipush 68
      // 09d: istore 12
      // 09f: bipush 5
      // 0a0: istore 13
      // 0a2: iload 13
      // 0a4: aload 0
      // 0a5: getfield com/schnurritv/sexmod/a.k [Ljava/lang/String;
      // 0a8: arraylength
      // 0a9: bipush 5
      // 0aa: iadd
      // 0ab: if_icmpge 1ac
      // 0ae: aload 0
      // 0af: getfield com/schnurritv/sexmod/a.b F
      // 0b2: fconst_0
      // 0b3: fcmpl
      // 0b4: ifle 16c
      // 0b7: goto 0be
      // 0ba: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 0c2: ifnull 16c
      // 0c5: goto 0cc
      // 0c8: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 0d0: iload 13
      // 0d2: bipush 5
      // 0d3: isub
      // 0d4: aaload
      // 0d5: ifnull 16c
      // 0d8: goto 0df
      // 0db: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 0e3: iload 13
      // 0e5: bipush 5
      // 0e6: isub
      // 0e7: aaload
      // 0e8: invokevirtual net/minecraft/item/ItemStack.func_190916_E ()I
      // 0eb: ifeq 16c
      // 0ee: goto 0f5
      // 0f1: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: ldc -300.0
      // 0f8: putfield com/schnurritv/sexmod/a.field_73735_i F
      // 0fb: aload 0
      // 0fc: getfield com/schnurritv/sexmod/a.field_146296_j Lnet/minecraft/client/renderer/RenderItem;
      // 0ff: ldc -300.0
      // 101: putfield net/minecraft/client/renderer/RenderItem.field_77023_b F
      // 104: aload 0
      // 105: bipush 1
      // 106: anewarray 64
      // 109: dup
      // 10a: bipush 0
      // 10b: new java/lang/StringBuilder
      // 10e: dup
      // 10f: invokespecial java/lang/StringBuilder.<init> ()V
      // 112: aload 0
      // 113: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 116: iload 13
      // 118: bipush 5
      // 119: isub
      // 11a: aaload
      // 11b: invokevirtual net/minecraft/item/ItemStack.func_190916_E ()I
      // 11e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 121: ldc "x    "
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 129: aastore
      // 12a: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 12d: iload 5
      // 12f: iload 7
      // 131: isub
      // 132: iload 6
      // 134: iload 11
      // 136: isub
      // 137: aload 0
      // 138: getfield com/schnurritv/sexmod/a.field_146289_q Lnet/minecraft/client/gui/FontRenderer;
      // 13b: invokevirtual com/schnurritv/sexmod/a.a (Ljava/util/List;IILnet/minecraft/client/gui/FontRenderer;)V
      // 13e: aload 0
      // 13f: getfield com/schnurritv/sexmod/a.field_146296_j Lnet/minecraft/client/renderer/RenderItem;
      // 142: aload 0
      // 143: getfield com/schnurritv/sexmod/a.h [Lnet/minecraft/item/ItemStack;
      // 146: iload 13
      // 148: bipush 5
      // 149: isub
      // 14a: aaload
      // 14b: iload 5
      // 14d: iload 8
      // 14f: isub
      // 150: iload 6
      // 152: iload 12
      // 154: isub
      // 155: invokevirtual net/minecraft/client/renderer/RenderItem.func_175042_a (Lnet/minecraft/item/ItemStack;II)V
      // 158: aload 0
      // 159: fconst_0
      // 15a: putfield com/schnurritv/sexmod/a.field_73735_i F
      // 15d: aload 0
      // 15e: getfield com/schnurritv/sexmod/a.field_146296_j Lnet/minecraft/client/renderer/RenderItem;
      // 161: fconst_0
      // 162: putfield net/minecraft/client/renderer/RenderItem.field_77023_b F
      // 165: goto 16c
      // 168: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16b: athrow
      // 16c: aload 0
      // 16d: getfield com/schnurritv/sexmod/a.field_146292_n Ljava/util/List;
      // 170: new net/minecraft/client/gui/GuiButton
      // 173: dup
      // 174: iload 13
      // 176: iload 5
      // 178: iload 9
      // 17a: isub
      // 17b: iload 6
      // 17d: iload 10
      // 17f: isub
      // 180: bipush 100
      // 182: bipush 20
      // 184: aload 0
      // 185: getfield com/schnurritv/sexmod/a.k [Ljava/lang/String;
      // 188: iload 13
      // 18a: bipush 5
      // 18b: isub
      // 18c: aaload
      // 18d: bipush 0
      // 18e: anewarray 165
      // 191: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 194: invokespecial net/minecraft/client/gui/GuiButton.<init> (IIIIILjava/lang/String;)V
      // 197: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 19c: pop
      // 19d: iinc 10 30
      // 1a0: iinc 11 30
      // 1a3: iinc 12 30
      // 1a6: iinc 13 1
      // 1a9: goto 0a2
      // 1ac: aload 0
      // 1ad: getfield com/schnurritv/sexmod/a.l Z
      // 1b0: ifeq 1c0
      // 1b3: aload 0
      // 1b4: iload 1
      // 1b5: iload 2
      // 1b6: invokevirtual com/schnurritv/sexmod/a.a (II)V
      // 1b9: goto 1c0
      // 1bc: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1bf: athrow
      // 1c0: return
      // try (20 -> 49): 50 java/lang/RuntimeException
      // try (81 -> 93): 94 java/lang/RuntimeException
      // try (88 -> 99): 100 java/lang/RuntimeException
      // try (96 -> 109): 110 java/lang/RuntimeException
      // try (102 -> 120): 121 java/lang/RuntimeException
      // try (112 -> 182): 183 java/lang/RuntimeException
      // try (215 -> 222): 223 java/lang/RuntimeException
   }

   void a(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: ldc -30.0
      // 002: ldc 120.0
      // 004: aload 0
      // 005: getfield com/schnurritv/sexmod/a.c F
      // 008: invokestatic com/schnurritv/sexmod/b1.a (FFF)F
      // 00b: f2i
      // 00c: istore 3
      // 00d: aload 0
      // 00e: getfield com/schnurritv/sexmod/a.field_146296_j Lnet/minecraft/client/renderer/RenderItem;
      // 011: aload 0
      // 012: getfield com/schnurritv/sexmod/a.a Lnet/minecraft/network/datasync/EntityDataManager;
      // 015: getstatic com/schnurritv/sexmod/bs.K Lnet/minecraft/network/datasync/DataParameter;
      // 018: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 01b: checkcast net/minecraft/item/ItemStack
      // 01e: iload 3
      // 01f: bipush 105
      // 021: isub
      // 022: bipush 68
      // 024: invokevirtual net/minecraft/client/renderer/RenderItem.func_175042_a (Lnet/minecraft/item/ItemStack;II)V
      // 027: aload 0
      // 028: getfield com/schnurritv/sexmod/a.field_146296_j Lnet/minecraft/client/renderer/RenderItem;
      // 02b: aload 0
      // 02c: getfield com/schnurritv/sexmod/a.a Lnet/minecraft/network/datasync/EntityDataManager;
      // 02f: getstatic com/schnurritv/sexmod/bs.N Lnet/minecraft/network/datasync/DataParameter;
      // 032: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 035: checkcast net/minecraft/item/ItemStack
      // 038: iload 3
      // 039: bipush 105
      // 03b: isub
      // 03c: bipush 87
      // 03e: invokevirtual net/minecraft/client/renderer/RenderItem.func_175042_a (Lnet/minecraft/item/ItemStack;II)V
      // 041: aload 0
      // 042: getfield com/schnurritv/sexmod/a.field_146296_j Lnet/minecraft/client/renderer/RenderItem;
      // 045: aload 0
      // 046: getfield com/schnurritv/sexmod/a.a Lnet/minecraft/network/datasync/EntityDataManager;
      // 049: getstatic com/schnurritv/sexmod/bs.G Lnet/minecraft/network/datasync/DataParameter;
      // 04c: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 04f: checkcast net/minecraft/item/ItemStack
      // 052: iload 3
      // 053: bipush 105
      // 055: isub
      // 056: bipush 109
      // 058: invokevirtual net/minecraft/client/renderer/RenderItem.func_175042_a (Lnet/minecraft/item/ItemStack;II)V
      // 05b: aload 0
      // 05c: getfield com/schnurritv/sexmod/a.field_146296_j Lnet/minecraft/client/renderer/RenderItem;
      // 05f: aload 0
      // 060: getfield com/schnurritv/sexmod/a.a Lnet/minecraft/network/datasync/EntityDataManager;
      // 063: getstatic com/schnurritv/sexmod/bs.T Lnet/minecraft/network/datasync/DataParameter;
      // 066: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 069: checkcast net/minecraft/item/ItemStack
      // 06c: iload 3
      // 06d: bipush 105
      // 06f: isub
      // 070: bipush 127
      // 072: invokevirtual net/minecraft/client/renderer/RenderItem.func_175042_a (Lnet/minecraft/item/ItemStack;II)V
      // 075: aload 0
      // 076: getfield com/schnurritv/sexmod/a.field_146296_j Lnet/minecraft/client/renderer/RenderItem;
      // 079: aload 0
      // 07a: getfield com/schnurritv/sexmod/a.a Lnet/minecraft/network/datasync/EntityDataManager;
      // 07d: getstatic com/schnurritv/sexmod/bs.Q Lnet/minecraft/network/datasync/DataParameter;
      // 080: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 083: checkcast net/minecraft/item/ItemStack
      // 086: iload 3
      // 087: bipush 105
      // 089: isub
      // 08a: sipush 146
      // 08d: invokevirtual net/minecraft/client/renderer/RenderItem.func_175042_a (Lnet/minecraft/item/ItemStack;II)V
      // 090: aload 0
      // 091: getfield com/schnurritv/sexmod/a.field_146296_j Lnet/minecraft/client/renderer/RenderItem;
      // 094: aload 0
      // 095: getfield com/schnurritv/sexmod/a.a Lnet/minecraft/network/datasync/EntityDataManager;
      // 098: getstatic com/schnurritv/sexmod/bs.S Lnet/minecraft/network/datasync/DataParameter;
      // 09b: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 09e: checkcast net/minecraft/item/ItemStack
      // 0a1: iload 3
      // 0a2: bipush 105
      // 0a4: isub
      // 0a5: sipush 166
      // 0a8: invokevirtual net/minecraft/client/renderer/RenderItem.func_175042_a (Lnet/minecraft/item/ItemStack;II)V
      // 0ab: aload 0
      // 0ac: getfield com/schnurritv/sexmod/a.b F
      // 0af: fconst_0
      // 0b0: fcmpl
      // 0b1: ifne 0b9
      // 0b4: return
      // 0b5: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield com/schnurritv/sexmod/a.a Lnet/minecraft/network/datasync/EntityDataManager;
      // 0bd: getstatic com/schnurritv/sexmod/bi.h Lnet/minecraft/network/datasync/DataParameter;
      // 0c0: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 0c3: checkcast java/lang/String
      // 0c6: ldc ""
      // 0c8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0cb: ifne 0d6
      // 0ce: bipush 1
      // 0cf: goto 0d7
      // 0d2: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d5: athrow
      // 0d6: bipush 0
      // 0d7: istore 4
      // 0d9: bipush 35
      // 0db: istore 5
      // 0dd: bipush 70
      // 0df: istore 6
      // 0e1: bipush 0
      // 0e2: istore 7
      // 0e4: iload 7
      // 0e6: bipush 5
      // 0e7: if_icmpge 253
      // 0ea: iload 7
      // 0ec: ifne 108
      // 0ef: goto 0f6
      // 0f2: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f5: athrow
      // 0f6: iload 4
      // 0f8: ifeq 108
      // 0fb: goto 102
      // 0fe: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 101: athrow
      // 102: bipush 1
      // 103: istore 7
      // 105: goto 11d
      // 108: iload 7
      // 10a: bipush 1
      // 10b: if_icmpne 11d
      // 10e: iload 4
      // 110: ifne 11d
      // 113: goto 11a
      // 116: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 119: athrow
      // 11a: bipush 2
      // 11b: istore 7
      // 11d: iload 1
      // 11e: iload 5
      // 120: if_icmplt 17a
      // 123: iload 1
      // 124: iload 5
      // 126: bipush 23
      // 128: iadd
      // 129: aload 0
      // 12a: getfield com/schnurritv/sexmod/a.e [I
      // 12d: iload 7
      // 12f: iaload
      // 130: iadd
      // 131: if_icmpgt 17a
      // 134: goto 13b
      // 137: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13a: athrow
      // 13b: iload 2
      // 13c: iload 6
      // 13e: if_icmplt 17a
      // 141: goto 148
      // 144: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 147: athrow
      // 148: iload 2
      // 149: iload 6
      // 14b: bipush 20
      // 14d: iadd
      // 14e: if_icmpgt 17a
      // 151: goto 158
      // 154: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 157: athrow
      // 158: aload 0
      // 159: getfield com/schnurritv/sexmod/a.e [I
      // 15c: iload 7
      // 15e: aload 0
      // 15f: getfield com/schnurritv/sexmod/a.g [I
      // 162: iload 7
      // 164: iaload
      // 165: aload 0
      // 166: getfield com/schnurritv/sexmod/a.e [I
      // 169: iload 7
      // 16b: iaload
      // 16c: bipush 7
      // 16e: iadd
      // 16f: invokestatic java/lang/Math.min (II)I
      // 172: iastore
      // 173: goto 18f
      // 176: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 179: athrow
      // 17a: aload 0
      // 17b: getfield com/schnurritv/sexmod/a.e [I
      // 17e: iload 7
      // 180: bipush 0
      // 181: aload 0
      // 182: getfield com/schnurritv/sexmod/a.e [I
      // 185: iload 7
      // 187: iaload
      // 188: bipush 7
      // 18a: isub
      // 18b: invokestatic java/lang/Math.max (II)I
      // 18e: iastore
      // 18f: new java/lang/StringBuilder
      // 192: dup
      // 193: aload 0
      // 194: getfield com/schnurritv/sexmod/a.i [Ljava/lang/String;
      // 197: iload 7
      // 199: aaload
      // 19a: bipush 0
      // 19b: anewarray 165
      // 19e: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1a1: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 1a4: astore 8
      // 1a6: bipush 0
      // 1a7: istore 9
      // 1a9: iload 9
      // 1ab: aload 0
      // 1ac: getfield com/schnurritv/sexmod/a.j [I
      // 1af: iload 7
      // 1b1: iaload
      // 1b2: if_icmpge 1c7
      // 1b5: aload 8
      // 1b7: ldc " "
      // 1b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bc: pop
      // 1bd: iinc 9 1
      // 1c0: goto 1a9
      // 1c3: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c6: athrow
      // 1c7: aload 0
      // 1c8: getfield com/schnurritv/sexmod/a.field_146297_k Lnet/minecraft/client/Minecraft;
      // 1cb: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
      // 1ce: getstatic com/schnurritv/sexmod/a.m Lnet/minecraft/util/ResourceLocation;
      // 1d1: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
      // 1d4: aload 0
      // 1d5: aload 0
      // 1d6: getfield com/schnurritv/sexmod/a.e [I
      // 1d9: iload 7
      // 1db: iaload
      // 1dc: iload 5
      // 1de: iadd
      // 1df: bipush 18
      // 1e1: isub
      // 1e2: fconst_0
      // 1e3: ldc 23.0
      // 1e5: aload 0
      // 1e6: getfield com/schnurritv/sexmod/a.b F
      // 1e9: invokestatic com/schnurritv/sexmod/b1.a (FFF)F
      // 1ec: f2i
      // 1ed: iadd
      // 1ee: iload 6
      // 1f0: bipush 2
      // 1f1: iadd
      // 1f2: aload 0
      // 1f3: getfield com/schnurritv/sexmod/a.d [I
      // 1f6: iload 7
      // 1f8: iaload
      // 1f9: bipush 0
      // 1fa: bipush 16
      // 1fc: bipush 16
      // 1fe: invokevirtual com/schnurritv/sexmod/a.func_73729_b (IIIIII)V
      // 201: aload 0
      // 202: getfield com/schnurritv/sexmod/a.field_146292_n Ljava/util/List;
      // 205: new net/minecraft/client/gui/GuiButton
      // 208: dup
      // 209: iload 7
      // 20b: iload 5
      // 20d: bipush 1
      // 20e: iadd
      // 20f: iload 6
      // 211: fconst_0
      // 212: ldc 23.0
      // 214: aload 0
      // 215: getfield com/schnurritv/sexmod/a.b F
      // 218: invokestatic com/schnurritv/sexmod/b1.a (FFF)F
      // 21b: aload 0
      // 21c: getfield com/schnurritv/sexmod/a.e [I
      // 21f: iload 7
      // 221: iaload
      // 222: i2f
      // 223: fadd
      // 224: f2i
      // 225: bipush 20
      // 227: aload 0
      // 228: getfield com/schnurritv/sexmod/a.e [I
      // 22b: iload 7
      // 22d: iaload
      // 22e: bipush 14
      // 230: if_icmpgt 23c
      // 233: ldc ""
      // 235: goto 241
      // 238: invokestatic com/schnurritv/sexmod/a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23b: athrow
      // 23c: aload 8
      // 23e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 241: invokespecial net/minecraft/client/gui/GuiButton.<init> (IIIIILjava/lang/String;)V
      // 244: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 249: pop
      // 24a: iinc 6 30
      // 24d: iinc 7 1
      // 250: goto 0e4
      // 253: aload 0
      // 254: getfield com/schnurritv/sexmod/a.field_146297_k Lnet/minecraft/client/Minecraft;
      // 257: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
      // 25a: getstatic com/schnurritv/sexmod/a.m Lnet/minecraft/util/ResourceLocation;
      // 25d: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
      // 260: aload 0
      // 261: iload 3
      // 262: bipush 113
      // 264: isub
      // 265: bipush 60
      // 267: bipush 0
      // 268: bipush 0
      // 269: bipush 32
      // 26b: sipush 130
      // 26e: invokevirtual com/schnurritv/sexmod/a.func_73729_b (IIIIII)V
      // 271: return
      // try (7 -> 85): 85 java/lang/RuntimeException
      // try (87 -> 97): 97 java/lang/RuntimeException
      // try (107 -> 112): 113 java/lang/RuntimeException
      // try (110 -> 117): 118 java/lang/RuntimeException
      // try (123 -> 128): 129 java/lang/RuntimeException
      // try (133 -> 146): 147 java/lang/RuntimeException
      // try (136 -> 152): 153 java/lang/RuntimeException
      // try (149 -> 160): 161 java/lang/RuntimeException
      // try (155 -> 179): 179 java/lang/RuntimeException
      // try (206 -> 218): 218 java/lang/RuntimeException
      // try (220 -> 282): 282 java/lang/RuntimeException
   }

   void a(List<String> var1, int var2, int var3, FontRenderer var4) {
      GlStateManager.func_179101_C();
      RenderHelper.func_74518_a();
      GlStateManager.func_179140_f();
      int var5 = 0;

      for (String var7 : var1) {
         int var8 = this.field_146289_q.func_78256_a(var7);
         if (var8 > var5) {
            var5 = var8;
         }
      }

      int var12 = var2 + 12;
      int var13 = var3 - 12;
      int var14 = 8;
      if (var1.size() > 1) {
         var14 += 2 + (var1.size() - 1) * 10;
      }

      if (var12 + var5 > this.field_146294_l) {
         var12 -= 28 + var5;
      }

      if (var13 + var14 + 6 > this.field_146295_m) {
         var13 = this.field_146295_m - var14 - 6;
      }

      this.func_73733_a(var12 - 3, var13 - 4, var12 + var5 + 3, var13 - 3, -267386864, -267386864);
      this.func_73733_a(var12 - 3, var13 + var14 + 3, var12 + var5 + 3, var13 + var14 + 4, -267386864, -267386864);
      this.func_73733_a(var12 - 3, var13 - 3, var12 + var5 + 3, var13 + var14 + 3, -267386864, -267386864);
      this.func_73733_a(var12 - 4, var13 - 3, var12 - 3, var13 + var14 + 3, -267386864, -267386864);
      this.func_73733_a(var12 + var5 + 3, var13 - 3, var12 + var5 + 4, var13 + var14 + 3, -267386864, -267386864);
      this.func_73733_a(var12 - 3, var13 - 3 + 1, var12 - 3 + 1, var13 + var14 + 3 - 1, 1347420415, 1344798847);
      this.func_73733_a(var12 + var5 + 2, var13 - 3 + 1, var12 + var5 + 3, var13 + var14 + 3 - 1, 1347420415, 1344798847);
      this.func_73733_a(var12 - 3, var13 - 3, var12 + var5 + 3, var13 - 3 + 1, 1347420415, 1347420415);
      this.func_73733_a(var12 - 3, var13 + var14 + 2, var12 + var5 + 3, var13 + var14 + 3, 1344798847, 1344798847);

      for (int var9 = 0; var9 < var1.size(); var9++) {
         String var10 = (String)var1.get(var9);

         try {
            this.field_146289_q.func_175063_a(var10, var12, var13, -1);
            if (var9 == 0) {
               var13 += 2;
            }
         } catch (RuntimeException var11) {
            throw a(var11);
         }

         var13 += 10;
      }

      GlStateManager.func_179145_e();
      RenderHelper.func_74519_b();
      GlStateManager.func_179091_B();
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
