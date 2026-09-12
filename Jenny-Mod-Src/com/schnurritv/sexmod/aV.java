package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class av extends Container {
   c9 d;
   public Slot[] b;
   public UUID a;
   public static List<av> c = new ArrayList<>();

   public av(c9 var1, InventoryPlayer var2, UUID var3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial net/minecraft/inventory/Container.<init> ()V
      // 004: aload 0
      // 005: aload 3
      // 006: putfield com/schnurritv/sexmod/av.a Ljava/util/UUID;
      // 009: getstatic com/schnurritv/sexmod/av.c Ljava/util/List;
      // 00c: aload 0
      // 00d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 012: pop
      // 013: aload 1
      // 014: getstatic net/minecraftforge/items/CapabilityItemHandler.ITEM_HANDLER_CAPABILITY Lnet/minecraftforge/common/capabilities/Capability;
      // 017: getstatic net/minecraft/util/EnumFacing.NORTH Lnet/minecraft/util/EnumFacing;
      // 01a: invokevirtual com/schnurritv/sexmod/c9.hasCapability (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/util/EnumFacing;)Z
      // 01d: ifeq 1c8
      // 020: aload 1
      // 021: getstatic net/minecraftforge/items/CapabilityItemHandler.ITEM_HANDLER_CAPABILITY Lnet/minecraftforge/common/capabilities/Capability;
      // 024: getstatic net/minecraft/util/EnumFacing.NORTH Lnet/minecraft/util/EnumFacing;
      // 027: invokevirtual com/schnurritv/sexmod/c9.getCapability (Lnet/minecraftforge/common/capabilities/Capability;Lnet/minecraft/util/EnumFacing;)Ljava/lang/Object;
      // 02a: checkcast net/minecraftforge/items/IItemHandler
      // 02d: astore 4
      // 02f: aload 0
      // 030: aload 1
      // 031: putfield com/schnurritv/sexmod/av.d Lcom/schnurritv/sexmod/c9;
      // 034: aload 0
      // 035: bipush 7
      // 037: anewarray 62
      // 03a: dup
      // 03b: bipush 0
      // 03c: new com/schnurritv/sexmod/b2
      // 03f: dup
      // 040: getstatic com/schnurritv/sexmod/b2$a.WEAPON Lcom/schnurritv/sexmod/b2$a;
      // 043: aload 4
      // 045: getstatic com/schnurritv/sexmod/b2$a.WEAPON Lcom/schnurritv/sexmod/b2$a;
      // 048: getfield com/schnurritv/sexmod/b2$a.id I
      // 04b: bipush 41
      // 04d: bipush 60
      // 04f: invokespecial com/schnurritv/sexmod/b2.<init> (Lcom/schnurritv/sexmod/b2$a;Lnet/minecraftforge/items/IItemHandler;III)V
      // 052: aastore
      // 053: dup
      // 054: bipush 1
      // 055: new com/schnurritv/sexmod/b2
      // 058: dup
      // 059: getstatic com/schnurritv/sexmod/b2$a.BOW Lcom/schnurritv/sexmod/b2$a;
      // 05c: aload 4
      // 05e: getstatic com/schnurritv/sexmod/b2$a.BOW Lcom/schnurritv/sexmod/b2$a;
      // 061: getfield com/schnurritv/sexmod/b2$a.id I
      // 064: bipush 59
      // 066: bipush 60
      // 068: invokespecial com/schnurritv/sexmod/b2.<init> (Lcom/schnurritv/sexmod/b2$a;Lnet/minecraftforge/items/IItemHandler;III)V
      // 06b: aastore
      // 06c: dup
      // 06d: bipush 2
      // 06e: new com/schnurritv/sexmod/b2
      // 071: dup
      // 072: getstatic com/schnurritv/sexmod/b2$a.HELMET Lcom/schnurritv/sexmod/b2$a;
      // 075: aload 4
      // 077: getstatic com/schnurritv/sexmod/b2$a.HELMET Lcom/schnurritv/sexmod/b2$a;
      // 07a: getfield com/schnurritv/sexmod/b2$a.id I
      // 07d: bipush 81
      // 07f: bipush 60
      // 081: invokespecial com/schnurritv/sexmod/b2.<init> (Lcom/schnurritv/sexmod/b2$a;Lnet/minecraftforge/items/IItemHandler;III)V
      // 084: aastore
      // 085: dup
      // 086: bipush 3
      // 087: new com/schnurritv/sexmod/b2
      // 08a: dup
      // 08b: getstatic com/schnurritv/sexmod/b2$a.CHEST_PLATE Lcom/schnurritv/sexmod/b2$a;
      // 08e: aload 4
      // 090: getstatic com/schnurritv/sexmod/b2$a.CHEST_PLATE Lcom/schnurritv/sexmod/b2$a;
      // 093: getfield com/schnurritv/sexmod/b2$a.id I
      // 096: bipush 100
      // 098: bipush 60
      // 09a: invokespecial com/schnurritv/sexmod/b2.<init> (Lcom/schnurritv/sexmod/b2$a;Lnet/minecraftforge/items/IItemHandler;III)V
      // 09d: aastore
      // 09e: dup
      // 09f: bipush 4
      // 0a0: new com/schnurritv/sexmod/b2
      // 0a3: dup
      // 0a4: getstatic com/schnurritv/sexmod/b2$a.PANTS Lcom/schnurritv/sexmod/b2$a;
      // 0a7: aload 4
      // 0a9: getstatic com/schnurritv/sexmod/b2$a.PANTS Lcom/schnurritv/sexmod/b2$a;
      // 0ac: getfield com/schnurritv/sexmod/b2$a.id I
      // 0af: bipush 119
      // 0b1: bipush 60
      // 0b3: invokespecial com/schnurritv/sexmod/b2.<init> (Lcom/schnurritv/sexmod/b2$a;Lnet/minecraftforge/items/IItemHandler;III)V
      // 0b6: aastore
      // 0b7: dup
      // 0b8: bipush 5
      // 0b9: new com/schnurritv/sexmod/b2
      // 0bc: dup
      // 0bd: getstatic com/schnurritv/sexmod/b2$a.SHOES Lcom/schnurritv/sexmod/b2$a;
      // 0c0: aload 4
      // 0c2: getstatic com/schnurritv/sexmod/b2$a.SHOES Lcom/schnurritv/sexmod/b2$a;
      // 0c5: getfield com/schnurritv/sexmod/b2$a.id I
      // 0c8: sipush 138
      // 0cb: bipush 60
      // 0cd: invokespecial com/schnurritv/sexmod/b2.<init> (Lcom/schnurritv/sexmod/b2$a;Lnet/minecraftforge/items/IItemHandler;III)V
      // 0d0: aastore
      // 0d1: dup
      // 0d2: bipush 6
      // 0d4: new com/schnurritv/sexmod/b2
      // 0d7: dup
      // 0d8: getstatic com/schnurritv/sexmod/b2$a.ROD Lcom/schnurritv/sexmod/b2$a;
      // 0db: aload 4
      // 0dd: getstatic com/schnurritv/sexmod/b2$a.ROD Lcom/schnurritv/sexmod/b2$a;
      // 0e0: getfield com/schnurritv/sexmod/b2$a.id I
      // 0e3: bipush 22
      // 0e5: bipush 60
      // 0e7: invokespecial com/schnurritv/sexmod/b2.<init> (Lcom/schnurritv/sexmod/b2$a;Lnet/minecraftforge/items/IItemHandler;III)V
      // 0ea: aastore
      // 0eb: putfield com/schnurritv/sexmod/av.b [Lnet/minecraft/inventory/Slot;
      // 0ee: new java/util/ArrayList
      // 0f1: dup
      // 0f2: invokespecial java/util/ArrayList.<init> ()V
      // 0f5: astore 5
      // 0f7: bipush 0
      // 0f8: istore 6
      // 0fa: iload 6
      // 0fc: bipush 3
      // 0fd: if_icmpge 145
      // 100: bipush 0
      // 101: istore 7
      // 103: iload 7
      // 105: bipush 9
      // 107: if_icmpge 13f
      // 10a: aload 5
      // 10c: new net/minecraft/inventory/Slot
      // 10f: dup
      // 110: aload 2
      // 111: iload 7
      // 113: iload 6
      // 115: bipush 9
      // 117: imul
      // 118: iadd
      // 119: bipush 9
      // 11b: iadd
      // 11c: bipush 8
      // 11e: iload 7
      // 120: bipush 18
      // 122: imul
      // 123: iadd
      // 124: bipush 84
      // 126: iload 6
      // 128: bipush 18
      // 12a: imul
      // 12b: iadd
      // 12c: invokespecial net/minecraft/inventory/Slot.<init> (Lnet/minecraft/inventory/IInventory;III)V
      // 12f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 134: pop
      // 135: iinc 7 1
      // 138: goto 103
      // 13b: invokestatic com/schnurritv/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13e: athrow
      // 13f: iinc 6 1
      // 142: goto 0fa
      // 145: bipush 0
      // 146: istore 6
      // 148: iload 6
      // 14a: bipush 9
      // 14c: if_icmpge 176
      // 14f: aload 5
      // 151: new net/minecraft/inventory/Slot
      // 154: dup
      // 155: aload 2
      // 156: iload 6
      // 158: bipush 8
      // 15a: iload 6
      // 15c: bipush 18
      // 15e: imul
      // 15f: iadd
      // 160: sipush 142
      // 163: invokespecial net/minecraft/inventory/Slot.<init> (Lnet/minecraft/inventory/IInventory;III)V
      // 166: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16b: pop
      // 16c: iinc 6 1
      // 16f: goto 148
      // 172: invokestatic com/schnurritv/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 175: athrow
      // 176: aload 0
      // 177: getfield com/schnurritv/sexmod/av.b [Lnet/minecraft/inventory/Slot;
      // 17a: astore 6
      // 17c: aload 6
      // 17e: arraylength
      // 17f: istore 7
      // 181: bipush 0
      // 182: istore 8
      // 184: iload 8
      // 186: iload 7
      // 188: if_icmpge 19f
      // 18b: aload 6
      // 18d: iload 8
      // 18f: aaload
      // 190: astore 9
      // 192: aload 0
      // 193: aload 9
      // 195: invokevirtual com/schnurritv/sexmod/av.func_75146_a (Lnet/minecraft/inventory/Slot;)Lnet/minecraft/inventory/Slot;
      // 198: pop
      // 199: iinc 8 1
      // 19c: goto 184
      // 19f: aload 5
      // 1a1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1a6: astore 6
      // 1a8: aload 6
      // 1aa: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1af: ifeq 1c8
      // 1b2: aload 6
      // 1b4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1b9: checkcast net/minecraft/inventory/Slot
      // 1bc: astore 7
      // 1be: aload 0
      // 1bf: aload 7
      // 1c1: invokevirtual com/schnurritv/sexmod/av.func_75146_a (Lnet/minecraft/inventory/Slot;)Lnet/minecraft/inventory/Slot;
      // 1c4: pop
      // 1c5: goto 1a8
      // 1c8: return
      // try (122 -> 151): 151 java/lang/RuntimeException
      // try (157 -> 176): 176 java/lang/RuntimeException
   }

   public ItemStack func_82846_b(EntityPlayer param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 03: astore 3
      // 04: aload 0
      // 05: getfield com/schnurritv/sexmod/av.field_75151_b Ljava/util/List;
      // 08: iload 2
      // 09: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e: checkcast net/minecraft/inventory/Slot
      // 11: astore 4
      // 13: aload 4
      // 15: ifnull ae
      // 18: aload 4
      // 1a: invokevirtual net/minecraft/inventory/Slot.func_75216_d ()Z
      // 1d: ifeq ae
      // 20: goto 27
      // 23: invokestatic com/schnurritv/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26: athrow
      // 27: aload 4
      // 29: invokevirtual net/minecraft/inventory/Slot.func_75211_c ()Lnet/minecraft/item/ItemStack;
      // 2c: astore 5
      // 2e: aload 5
      // 30: invokevirtual net/minecraft/item/ItemStack.func_77946_l ()Lnet/minecraft/item/ItemStack;
      // 33: astore 3
      // 34: aload 0
      // 35: getfield com/schnurritv/sexmod/av.field_75151_b Ljava/util/List;
      // 38: invokeinterface java/util/List.size ()I 1
      // 3d: aload 1
      // 3e: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
      // 41: getfield net/minecraft/entity/player/InventoryPlayer.field_70462_a Lnet/minecraft/util/NonNullList;
      // 44: invokevirtual net/minecraft/util/NonNullList.size ()I
      // 47: isub
      // 48: istore 6
      // 4a: iload 2
      // 4b: iload 6
      // 4d: if_icmpge 74
      // 50: aload 0
      // 51: aload 5
      // 53: iload 6
      // 55: aload 0
      // 56: getfield com/schnurritv/sexmod/av.field_75151_b Ljava/util/List;
      // 59: invokeinterface java/util/List.size ()I 1
      // 5e: bipush 1
      // 5f: invokevirtual com/schnurritv/sexmod/av.func_75135_a (Lnet/minecraft/item/ItemStack;IIZ)Z
      // 62: ifne 89
      // 65: goto 6c
      // 68: invokestatic com/schnurritv/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6b: athrow
      // 6c: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 6f: areturn
      // 70: invokestatic com/schnurritv/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 73: athrow
      // 74: aload 0
      // 75: aload 5
      // 77: bipush 0
      // 78: iload 6
      // 7a: bipush 0
      // 7b: invokevirtual com/schnurritv/sexmod/av.func_75135_a (Lnet/minecraft/item/ItemStack;IIZ)Z
      // 7e: ifne 89
      // 81: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 84: areturn
      // 85: invokestatic com/schnurritv/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 88: athrow
      // 89: aload 5
      // 8b: invokevirtual net/minecraft/item/ItemStack.func_190916_E ()I
      // 8e: ifne a0
      // 91: aload 4
      // 93: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 96: invokevirtual net/minecraft/inventory/Slot.func_75215_d (Lnet/minecraft/item/ItemStack;)V
      // 99: goto a5
      // 9c: invokestatic com/schnurritv/sexmod/av.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9f: athrow
      // a0: aload 4
      // a2: invokevirtual net/minecraft/inventory/Slot.func_75218_e ()V
      // a5: aload 4
      // a7: aload 1
      // a8: aload 5
      // aa: invokevirtual net/minecraft/inventory/Slot.func_190901_a (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;
      // ad: pop
      // ae: aload 3
      // af: areturn
      // try (8 -> 13): 14 java/lang/RuntimeException
      // try (31 -> 43): 44 java/lang/RuntimeException
      // try (34 -> 48): 48 java/lang/RuntimeException
      // try (50 -> 59): 59 java/lang/RuntimeException
      // try (61 -> 68): 68 java/lang/RuntimeException
   }

   public void func_75141_a(int var1, ItemStack var2) {
      super.func_75141_a(var1, var2);
   }

   public boolean func_75145_c(EntityPlayer var1) {
      return true;
   }

   public void func_75134_a(EntityPlayer var1) {
      super.func_75134_a(var1);
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
