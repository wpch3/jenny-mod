package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class cB extends GuiContainer {
   static final ResourceLocation c = new ResourceLocation("sexmod", "textures/gui/girlinventory.png");
   UUID d;
   c9 b;
   UUID a;

   public cB(c9 var1, InventoryPlayer var2, UUID var3) {
      super(new av(var1, var2, var3));
      this.d = var3;
      this.b = var1;
      this.a = var2.field_70458_d.getPersistentID();
   }

   public void func_73863_a(int var1, int var2, float var3) {
      this.func_146276_q_();
      super.func_73863_a(var1, var2, var3);
      this.func_191948_b(var1, var2);
   }

   public void func_146281_b() {
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
      // 00: aload 0
      // 01: invokespecial net/minecraft/client/gui/inventory/GuiContainer.func_146281_b ()V
      // 04: getstatic com/schnurritv/sexmod/av.c Ljava/util/List;
      // 07: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c: astore 1
      // 0d: aload 1
      // 0e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13: ifeq b6
      // 16: aload 1
      // 17: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c: checkcast com/schnurritv/sexmod/av
      // 1f: astore 2
      // 20: aload 2
      // 21: getfield com/schnurritv/sexmod/av.a Ljava/util/UUID;
      // 24: aload 0
      // 25: getfield com/schnurritv/sexmod/cB.d Ljava/util/UUID;
      // 28: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 2b: ifeq b3
      // 2e: bipush 43
      // 30: anewarray 87
      // 33: astore 3
      // 34: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 37: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 3a: getfield net/minecraft/client/entity/EntityPlayerSP.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
      // 3d: getfield net/minecraft/entity/player/InventoryPlayer.field_70462_a Lnet/minecraft/util/NonNullList;
      // 40: aload 3
      // 41: invokevirtual net/minecraft/util/NonNullList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 44: pop
      // 45: aload 3
      // 46: bipush 36
      // 48: aload 2
      // 49: bipush 0
      // 4a: invokevirtual com/schnurritv/sexmod/av.func_75139_a (I)Lnet/minecraft/inventory/Slot;
      // 4d: invokevirtual net/minecraft/inventory/Slot.func_75211_c ()Lnet/minecraft/item/ItemStack;
      // 50: aastore
      // 51: aload 3
      // 52: bipush 37
      // 54: aload 2
      // 55: bipush 1
      // 56: invokevirtual com/schnurritv/sexmod/av.func_75139_a (I)Lnet/minecraft/inventory/Slot;
      // 59: invokevirtual net/minecraft/inventory/Slot.func_75211_c ()Lnet/minecraft/item/ItemStack;
      // 5c: aastore
      // 5d: aload 3
      // 5e: bipush 38
      // 60: aload 2
      // 61: bipush 2
      // 62: invokevirtual com/schnurritv/sexmod/av.func_75139_a (I)Lnet/minecraft/inventory/Slot;
      // 65: invokevirtual net/minecraft/inventory/Slot.func_75211_c ()Lnet/minecraft/item/ItemStack;
      // 68: aastore
      // 69: aload 3
      // 6a: bipush 39
      // 6c: aload 2
      // 6d: bipush 3
      // 6e: invokevirtual com/schnurritv/sexmod/av.func_75139_a (I)Lnet/minecraft/inventory/Slot;
      // 71: invokevirtual net/minecraft/inventory/Slot.func_75211_c ()Lnet/minecraft/item/ItemStack;
      // 74: aastore
      // 75: aload 3
      // 76: bipush 40
      // 78: aload 2
      // 79: bipush 4
      // 7a: invokevirtual com/schnurritv/sexmod/av.func_75139_a (I)Lnet/minecraft/inventory/Slot;
      // 7d: invokevirtual net/minecraft/inventory/Slot.func_75211_c ()Lnet/minecraft/item/ItemStack;
      // 80: aastore
      // 81: aload 3
      // 82: bipush 41
      // 84: aload 2
      // 85: bipush 5
      // 86: invokevirtual com/schnurritv/sexmod/av.func_75139_a (I)Lnet/minecraft/inventory/Slot;
      // 89: invokevirtual net/minecraft/inventory/Slot.func_75211_c ()Lnet/minecraft/item/ItemStack;
      // 8c: aastore
      // 8d: aload 3
      // 8e: bipush 42
      // 90: aload 2
      // 91: bipush 6
      // 93: invokevirtual com/schnurritv/sexmod/av.func_75139_a (I)Lnet/minecraft/inventory/Slot;
      // 96: invokevirtual net/minecraft/inventory/Slot.func_75211_c ()Lnet/minecraft/item/ItemStack;
      // 99: aastore
      // 9a: getstatic com/schnurritv/sexmod/at.a Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
      // 9d: new com/schnurritv/sexmod/ar
      // a0: dup
      // a1: aload 0
      // a2: getfield com/schnurritv/sexmod/cB.b Lcom/schnurritv/sexmod/c9;
      // a5: invokevirtual com/schnurritv/sexmod/c9.A ()Ljava/util/UUID;
      // a8: aload 0
      // a9: getfield com/schnurritv/sexmod/cB.a Ljava/util/UUID;
      // ac: aload 3
      // ad: invokespecial com/schnurritv/sexmod/ar.<init> (Ljava/util/UUID;Ljava/util/UUID;[Lnet/minecraft/item/ItemStack;)V
      // b0: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
      // b3: goto 0d
      // b6: return
   }

   protected void func_146976_a(float var1, int var2, int var3) {
      GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.field_71446_o.func_110577_a(c);
      this.func_73729_b(this.field_146294_l / 2 - 88, this.field_146295_m / 2 - 7 - 24, 80, 142, 176, 114);
   }
}
