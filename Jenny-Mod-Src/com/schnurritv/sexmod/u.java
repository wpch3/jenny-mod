package com.schnurritv.sexmod;

import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;

public class U {
   static final UUID a = UUID.fromString("b91e6484-8911-4def-ab04-9fa3452fca5f");
   static final UUID b = UUID.fromString("adf20149-2adc-4a9d-9af5-8e9aeda019d6");

   @SubscribeEvent
   public void a(PlayerLoggedInEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedInEvent.player Lnet/minecraft/entity/player/EntityPlayer;
      // 004: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
      // 007: invokevirtual net/minecraft/world/World.func_73046_m ()Lnet/minecraft/server/MinecraftServer;
      // 00a: invokevirtual net/minecraft/server/MinecraftServer.func_184103_al ()Lnet/minecraft/server/management/PlayerList;
      // 00d: aload 1
      // 00e: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedInEvent.player Lnet/minecraft/entity/player/EntityPlayer;
      // 011: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
      // 014: invokevirtual net/minecraft/server/management/PlayerList.func_177451_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayerMP;
      // 017: astore 2
      // 018: aload 2
      // 019: bipush 0
      // 01a: invokevirtual net/minecraft/entity/player/EntityPlayerMP.func_82142_c (Z)V
      // 01d: aload 2
      // 01e: bipush 0
      // 01f: invokevirtual net/minecraft/entity/player/EntityPlayerMP.func_189654_d (Z)V
      // 022: aload 2
      // 023: bipush 0
      // 024: putfield net/minecraft/entity/player/EntityPlayerMP.field_70145_X Z
      // 027: aload 2
      // 028: getfield net/minecraft/entity/player/EntityPlayerMP.field_71075_bZ Lnet/minecraft/entity/player/PlayerCapabilities;
      // 02b: getfield net/minecraft/entity/player/PlayerCapabilities.field_75098_d Z
      // 02e: ifne 051
      // 031: aload 2
      // 032: getfield net/minecraft/entity/player/EntityPlayerMP.field_71075_bZ Lnet/minecraft/entity/player/PlayerCapabilities;
      // 035: getfield net/minecraft/entity/player/PlayerCapabilities.field_75100_b Z
      // 038: ifeq 051
      // 03b: goto 042
      // 03e: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 041: athrow
      // 042: aload 2
      // 043: getfield net/minecraft/entity/player/EntityPlayerMP.field_71075_bZ Lnet/minecraft/entity/player/PlayerCapabilities;
      // 046: bipush 0
      // 047: putfield net/minecraft/entity/player/PlayerCapabilities.field_75100_b Z
      // 04a: goto 051
      // 04d: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 050: athrow
      // 051: getstatic com/schnurritv/sexmod/at.a Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
      // 054: new com/schnurritv/sexmod/a5
      // 057: dup
      // 058: bipush 1
      // 059: invokespecial com/schnurritv/sexmod/a5.<init> (Z)V
      // 05c: aload 2
      // 05d: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
      // 060: aload 2
      // 061: getfield net/minecraft/entity/player/EntityPlayerMP.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
      // 064: getfield net/minecraft/entity/player/InventoryPlayer.field_70462_a Lnet/minecraft/util/NonNullList;
      // 067: invokevirtual net/minecraft/util/NonNullList.iterator ()Ljava/util/Iterator;
      // 06a: astore 3
      // 06b: aload 3
      // 06c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 071: ifeq 0b0
      // 074: aload 3
      // 075: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 07a: checkcast net/minecraft/item/ItemStack
      // 07d: astore 4
      // 07f: aload 4
      // 081: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 084: getstatic com/schnurritv/sexmod/K.i Lcom/schnurritv/sexmod/K;
      // 087: if_acmpne 0ad
      // 08a: aload 4
      // 08c: invokevirtual net/minecraft/item/ItemStack.func_77942_o ()Z
      // 08f: ifeq 0ad
      // 092: goto 099
      // 095: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 098: athrow
      // 099: aload 4
      // 09b: invokevirtual net/minecraft/item/ItemStack.func_77978_p ()Lnet/minecraft/nbt/NBTTagCompound;
      // 09e: ldc "user"
      // 0a0: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 0a3: invokevirtual net/minecraft/nbt/NBTTagCompound.func_186854_a (Ljava/lang/String;Ljava/util/UUID;)V
      // 0a6: goto 0ad
      // 0a9: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 0ac: athrow
      // 0ad: goto 06b
      // 0b0: aload 2
      // 0b1: invokevirtual net/minecraft/entity/player/EntityPlayerMP.getPersistentID ()Ljava/util/UUID;
      // 0b4: invokestatic com/schnurritv/sexmod/bK.g (Ljava/util/UUID;)Ljava/util/UUID;
      // 0b7: astore 3
      // 0b8: aload 3
      // 0b9: ifnull 0d3
      // 0bc: aload 3
      // 0bd: invokestatic com/schnurritv/sexmod/bK.l (Ljava/util/UUID;)Ljava/util/HashSet;
      // 0c0: astore 4
      // 0c2: getstatic com/schnurritv/sexmod/at.a Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
      // 0c5: new com/schnurritv/sexmod/aR
      // 0c8: dup
      // 0c9: aload 4
      // 0cb: bipush 1
      // 0cc: invokespecial com/schnurritv/sexmod/aR.<init> (Ljava/util/HashSet;Z)V
      // 0cf: aload 2
      // 0d0: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
      // 0d3: invokestatic com/schnurritv/sexmod/bg.h ()V
      // 0d6: aload 1
      // 0d7: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedInEvent.player Lnet/minecraft/entity/player/EntityPlayer;
      // 0da: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
      // 0dd: invokestatic com/schnurritv/sexmod/bg.e (Ljava/util/UUID;)Lcom/schnurritv/sexmod/bg;
      // 0e0: astore 4
      // 0e2: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
      // 0e5: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
      // 0e8: invokevirtual net/minecraft/server/MinecraftServer.func_130014_f_ ()Lnet/minecraft/world/World;
      // 0eb: astore 5
      // 0ed: aload 0
      // 0ee: aload 5
      // 0f0: aload 2
      // 0f1: aload 4
      // 0f3: invokevirtual com/schnurritv/sexmod/U.a (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lcom/schnurritv/sexmod/bg;)V
      // 0f6: aload 4
      // 0f8: ifnull 115
      // 0fb: aload 4
      // 0fd: bipush 0
      // 0fe: invokevirtual com/schnurritv/sexmod/bg.a (Z)V
      // 101: aload 4
      // 103: getstatic com/schnurritv/sexmod/bj.NULL Lcom/schnurritv/sexmod/bj;
      // 106: invokevirtual com/schnurritv/sexmod/bg.b (Lcom/schnurritv/sexmod/bj;)V
      // 109: aload 4
      // 10b: invokestatic com/schnurritv/sexmod/R$a.a (Lcom/schnurritv/sexmod/bi;)V
      // 10e: goto 115
      // 111: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 114: athrow
      // 115: aload 1
      // 116: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedInEvent.player Lnet/minecraft/entity/player/EntityPlayer;
      // 119: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
      // 11c: astore 6
      // 11e: aload 6
      // 120: getstatic com/schnurritv/sexmod/U.a Ljava/util/UUID;
      // 123: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 126: ifeq 139
      // 129: aload 0
      // 12a: aload 5
      // 12c: aload 2
      // 12d: aload 6
      // 12f: invokevirtual com/schnurritv/sexmod/U.b (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Ljava/util/UUID;)V
      // 132: goto 139
      // 135: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 138: athrow
      // 139: aload 6
      // 13b: getstatic com/schnurritv/sexmod/U.b Ljava/util/UUID;
      // 13e: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 141: ifeq 154
      // 144: aload 0
      // 145: aload 5
      // 147: aload 2
      // 148: aload 6
      // 14a: invokevirtual com/schnurritv/sexmod/U.a (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Ljava/util/UUID;)V
      // 14d: goto 154
      // 150: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 153: athrow
      // 154: return
      // try (10 -> 27): 28 java/util/ConcurrentModificationException
      // try (23 -> 34): 35 java/util/ConcurrentModificationException
      // try (56 -> 63): 64 java/util/ConcurrentModificationException
      // try (60 -> 71): 72 java/util/ConcurrentModificationException
      // try (102 -> 117): 118 java/util/ConcurrentModificationException
      // try (124 -> 133): 134 java/util/ConcurrentModificationException
      // try (136 -> 145): 146 java/util/ConcurrentModificationException
   }

   void b(World var1, EntityPlayer var2, UUID var3) {
      cR var4 = new cR(var1, var3);
      var4.func_189654_d(true);
      var4.field_70145_X = true;
      var4.field_70159_w = 0.0;
      var4.field_70181_x = 0.0;
      var4.field_70179_y = 0.0;
      var4.func_70107_b(var2.field_70165_t, var2.field_70163_u + 69.0, var2.field_70161_v);
      var1.func_72838_d(var4);
      var4.A();
   }

   void a(World var1, EntityPlayer var2, UUID var3) {
      cw var4 = new cw(var1, var3);
      var4.func_189654_d(true);
      var4.field_70145_X = true;
      var4.field_70159_w = 0.0;
      var4.field_70181_x = 0.0;
      var4.field_70179_y = 0.0;
      var4.func_70107_b(var2.field_70165_t, var2.field_70163_u + 69.0, var2.field_70161_v);
      var1.func_72838_d(var4);
      var4.A();
   }

   void a(World param1, EntityPlayer param2, bg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, com/schnurritv/sexmod/U.lambda$deleteOldPlayerGirls$0 (Lcom/schnurritv/sexmod/bg;)Z, (Lcom/schnurritv/sexmod/bg;)Z ]
      // 05: astore 4
      // 07: aload 1
      // 08: ldc com/schnurritv/sexmod/bg
      // 0a: aload 4
      // 0c: dup
      // 0d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 10: pop
      // 11: invokedynamic apply (Ljava/util/function/Predicate;)Lcom/google/common/base/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, java/util/function/Predicate.test (Ljava/lang/Object;)Z, (Lcom/schnurritv/sexmod/bg;)Z ]
      // 16: invokevirtual net/minecraft/world/World.func_175644_a (Ljava/lang/Class;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 19: astore 5
      // 1b: aload 5
      // 1d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 22: astore 6
      // 24: aload 6
      // 26: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b: ifeq 77
      // 2e: aload 6
      // 30: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 35: checkcast com/schnurritv/sexmod/bg
      // 38: astore 7
      // 3a: aload 7
      // 3c: invokevirtual com/schnurritv/sexmod/bg.q ()Ljava/util/UUID;
      // 3f: aload 2
      // 40: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
      // 43: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 46: ifne 50
      // 49: goto 24
      // 4c: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 4f: athrow
      // 50: aload 3
      // 51: ifnull 6e
      // 54: aload 7
      // 56: invokevirtual com/schnurritv/sexmod/bg.func_145782_y ()I
      // 59: aload 3
      // 5a: invokevirtual com/schnurritv/sexmod/bg.func_145782_y ()I
      // 5d: if_icmpne 6e
      // 60: goto 67
      // 63: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 66: athrow
      // 67: goto 24
      // 6a: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 6d: athrow
      // 6e: aload 1
      // 6f: aload 7
      // 71: invokevirtual net/minecraft/world/World.func_72900_e (Lnet/minecraft/entity/Entity;)V
      // 74: goto 24
      // 77: return
      // try (21 -> 28): 28 java/util/ConcurrentModificationException
      // try (30 -> 37): 38 java/util/ConcurrentModificationException
      // try (32 -> 41): 41 java/util/ConcurrentModificationException
   }

   @SubscribeEvent
   public void a(PlayerLoggedOutEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: invokestatic com/schnurritv/sexmod/bi.J ()Ljava/util/HashSet;
      // 03: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 06: astore 2
      // 07: aload 2
      // 08: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d: ifeq ce
      // 10: aload 2
      // 11: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 16: checkcast com/schnurritv/sexmod/bi
      // 19: astore 3
      // 1a: aload 3
      // 1b: invokevirtual com/schnurritv/sexmod/bi.r ()Ljava/util/UUID;
      // 1e: ifnonnull 28
      // 21: goto 07
      // 24: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 27: athrow
      // 28: aload 3
      // 29: invokevirtual com/schnurritv/sexmod/bi.r ()Ljava/util/UUID;
      // 2c: aload 1
      // 2d: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedOutEvent.player Lnet/minecraft/entity/player/EntityPlayer;
      // 30: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
      // 33: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 36: ifne 51
      // 39: aload 3
      // 3a: invokevirtual com/schnurritv/sexmod/bi.r ()Ljava/util/UUID;
      // 3d: aload 1
      // 3e: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedOutEvent.player Lnet/minecraft/entity/player/EntityPlayer;
      // 41: invokevirtual net/minecraft/entity/player/EntityPlayer.func_110124_au ()Ljava/util/UUID;
      // 44: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 47: ifeq 68
      // 4a: goto 51
      // 4d: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 50: athrow
      // 51: aload 3
      // 52: invokestatic com/schnurritv/sexmod/R$a.a (Lcom/schnurritv/sexmod/bi;)V
      // 55: aload 3
      // 56: bipush 0
      // 57: invokevirtual com/schnurritv/sexmod/bi.a (Z)V
      // 5a: aload 3
      // 5b: getstatic com/schnurritv/sexmod/bj.NULL Lcom/schnurritv/sexmod/bj;
      // 5e: invokevirtual com/schnurritv/sexmod/bi.b (Lcom/schnurritv/sexmod/bj;)V
      // 61: goto 68
      // 64: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 67: athrow
      // 68: aload 3
      // 69: instanceof com/schnurritv/sexmod/bg
      // 6c: ifeq cb
      // 6f: aload 3
      // 70: checkcast com/schnurritv/sexmod/bg
      // 73: invokevirtual com/schnurritv/sexmod/bg.q ()Ljava/util/UUID;
      // 76: aload 1
      // 77: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedOutEvent.player Lnet/minecraft/entity/player/EntityPlayer;
      // 7a: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
      // 7d: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 80: ifeq cb
      // 83: goto 8a
      // 86: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 89: athrow
      // 8a: aload 3
      // 8b: invokevirtual com/schnurritv/sexmod/bi.r ()Ljava/util/UUID;
      // 8e: ifnull cb
      // 91: goto 98
      // 94: invokestatic com/schnurritv/sexmod/U.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 97: athrow
      // 98: aload 1
      // 99: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedOutEvent.player Lnet/minecraft/entity/player/EntityPlayer;
      // 9c: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
      // 9f: aload 3
      // a0: invokevirtual com/schnurritv/sexmod/bi.r ()Ljava/util/UUID;
      // a3: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
      // a6: checkcast net/minecraft/entity/player/EntityPlayerMP
      // a9: astore 4
      // ab: getstatic com/schnurritv/sexmod/at.a Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
      // ae: new com/schnurritv/sexmod/a5
      // b1: dup
      // b2: bipush 1
      // b3: invokespecial com/schnurritv/sexmod/a5.<init> (Z)V
      // b6: aload 4
      // b8: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
      // bb: aload 4
      // bd: invokestatic com/schnurritv/sexmod/R$a.a (Lnet/minecraft/entity/player/EntityPlayerMP;)V
      // c0: aload 4
      // c2: bipush 0
      // c3: invokevirtual net/minecraft/entity/player/EntityPlayerMP.func_82142_c (Z)V
      // c6: aload 3
      // c7: aconst_null
      // c8: invokevirtual com/schnurritv/sexmod/bi.g (Ljava/util/UUID;)V
      // cb: goto 07
      // ce: goto d2
      // d1: astore 2
      // d2: return
      // try (47 -> 61): 62 java/util/ConcurrentModificationException
      // try (44 -> 55): 56 java/util/ConcurrentModificationException
      // try (23 -> 41): 42 java/util/ConcurrentModificationException
      // try (16 -> 30): 31 java/util/ConcurrentModificationException
      // try (10 -> 14): 14 java/util/ConcurrentModificationException
      // try (0 -> 88): 89 java/util/ConcurrentModificationException
   }

   private static ConcurrentModificationException a(ConcurrentModificationException var0) {
      return var0;
   }
}
