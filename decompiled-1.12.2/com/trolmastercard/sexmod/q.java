package com.trolmastercard.sexmod;

import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;

public class q {
    static final UUID b = UUID.fromString("b91e6484-8911-4def-ab04-9fa3452fca5f");
    static final UUID a = UUID.fromString("adf20149-2adc-4a9d-9af5-8e9aeda019d6");

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
        // 03e: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 041: athrow
        // 042: aload 2
        // 043: getfield net/minecraft/entity/player/EntityPlayerMP.field_71075_bZ Lnet/minecraft/entity/player/PlayerCapabilities;
        // 046: bipush 0
        // 047: putfield net/minecraft/entity/player/PlayerCapabilities.field_75100_b Z
        // 04a: goto 051
        // 04d: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 050: athrow
        // 051: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 054: new com/trolmastercard/sexmod/gz
        // 057: dup
        // 058: bipush 1
        // 059: invokespecial com/trolmastercard/sexmod/gz.<init> (Z)V
        // 05c: aload 2
        // 05d: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
        // 060: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 063: new com/trolmastercard/sexmod/gf
        // 066: dup
        // 067: aload 2
        // 068: invokevirtual net/minecraft/entity/player/EntityPlayerMP.getPersistentID ()Ljava/util/UUID;
        // 06b: invokestatic com/trolmastercard/sexmod/v.c (Ljava/util/UUID;)Z
        // 06e: invokespecial com/trolmastercard/sexmod/gf.<init> (Z)V
        // 071: aload 2
        // 072: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
        // 075: aload 2
        // 076: getfield net/minecraft/entity/player/EntityPlayerMP.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
        // 079: getfield net/minecraft/entity/player/InventoryPlayer.field_70462_a Lnet/minecraft/util/NonNullList;
        // 07c: invokevirtual net/minecraft/util/NonNullList.iterator ()Ljava/util/Iterator;
        // 07f: astore 3
        // 080: aload 3
        // 081: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 086: ifeq 0c5
        // 089: aload 3
        // 08a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 08f: checkcast net/minecraft/item/ItemStack
        // 092: astore 4
        // 094: aload 4
        // 096: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 099: getstatic com/trolmastercard/sexmod/ap.b Lcom/trolmastercard/sexmod/ap;
        // 09c: if_acmpne 0c2
        // 09f: aload 4
        // 0a1: invokevirtual net/minecraft/item/ItemStack.func_77942_o ()Z
        // 0a4: ifeq 0c2
        // 0a7: goto 0ae
        // 0aa: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0ad: athrow
        // 0ae: aload 4
        // 0b0: invokevirtual net/minecraft/item/ItemStack.func_77978_p ()Lnet/minecraft/nbt/NBTTagCompound;
        // 0b3: ldc "user"
        // 0b5: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 0b8: invokevirtual net/minecraft/nbt/NBTTagCompound.func_186854_a (Ljava/lang/String;Ljava/util/UUID;)V
        // 0bb: goto 0c2
        // 0be: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0c1: athrow
        // 0c2: goto 080
        // 0c5: aload 2
        // 0c6: invokevirtual net/minecraft/entity/player/EntityPlayerMP.getPersistentID ()Ljava/util/UUID;
        // 0c9: invokestatic com/trolmastercard/sexmod/ax.a (Ljava/util/UUID;)Ljava/util/UUID;
        // 0cc: astore 3
        // 0cd: aload 3
        // 0ce: ifnull 0e8
        // 0d1: aload 3
        // 0d2: invokestatic com/trolmastercard/sexmod/ax.d (Ljava/util/UUID;)Ljava/util/HashSet;
        // 0d5: astore 4
        // 0d7: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 0da: new com/trolmastercard/sexmod/h6
        // 0dd: dup
        // 0de: aload 4
        // 0e0: bipush 1
        // 0e1: invokespecial com/trolmastercard/sexmod/h6.<init> (Ljava/util/HashSet;Z)V
        // 0e4: aload 2
        // 0e5: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
        // 0e8: invokestatic com/trolmastercard/sexmod/ei.C ()V
        // 0eb: aload 1
        // 0ec: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedInEvent.player Lnet/minecraft/entity/player/EntityPlayer;
        // 0ef: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 0f2: invokestatic com/trolmastercard/sexmod/ei.d (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/ei;
        // 0f5: astore 4
        // 0f7: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
        // 0fa: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
        // 0fd: invokevirtual net/minecraft/server/MinecraftServer.func_130014_f_ ()Lnet/minecraft/world/World;
        // 100: astore 5
        // 102: aload 0
        // 103: aload 5
        // 105: aload 2
        // 106: aload 4
        // 108: invokevirtual com/trolmastercard/sexmod/q.a (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lcom/trolmastercard/sexmod/ei;)V
        // 10b: aload 4
        // 10d: ifnull 12a
        // 110: aload 4
        // 112: bipush 0
        // 113: invokevirtual com/trolmastercard/sexmod/ei.a (Z)V
        // 116: aload 4
        // 118: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 11b: invokevirtual com/trolmastercard/sexmod/ei.b (Lcom/trolmastercard/sexmod/fp;)V
        // 11e: aload 4
        // 120: invokestatic com/trolmastercard/sexmod/s$a.a (Lcom/trolmastercard/sexmod/em;)V
        // 123: goto 12a
        // 126: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 129: athrow
        // 12a: aload 1
        // 12b: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedInEvent.player Lnet/minecraft/entity/player/EntityPlayer;
        // 12e: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 131: astore 6
        // 133: aload 6
        // 135: getstatic com/trolmastercard/sexmod/q.b Ljava/util/UUID;
        // 138: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 13b: ifeq 14e
        // 13e: aload 0
        // 13f: aload 5
        // 141: aload 2
        // 142: aload 6
        // 144: invokevirtual com/trolmastercard/sexmod/q.a (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Ljava/util/UUID;)V
        // 147: goto 14e
        // 14a: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 14d: athrow
        // 14e: aload 6
        // 150: getstatic com/trolmastercard/sexmod/q.a Ljava/util/UUID;
        // 153: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 156: ifeq 169
        // 159: aload 0
        // 15a: aload 5
        // 15c: aload 2
        // 15d: aload 6
        // 15f: invokevirtual com/trolmastercard/sexmod/q.b (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Ljava/util/UUID;)V
        // 162: goto 169
        // 165: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 168: athrow
        // 169: aload 2
        // 16a: invokestatic com/trolmastercard/sexmod/f_.c (Lnet/minecraft/entity/player/EntityPlayer;)V
        // 16d: return
        // try (10 -> 27): 28 java/util/ConcurrentModificationException
        // try (23 -> 34): 35 java/util/ConcurrentModificationException
        // try (65 -> 72): 73 java/util/ConcurrentModificationException
        // try (69 -> 80): 81 java/util/ConcurrentModificationException
        // try (111 -> 126): 127 java/util/ConcurrentModificationException
        // try (133 -> 142): 143 java/util/ConcurrentModificationException
        // try (145 -> 154): 155 java/util/ConcurrentModificationException
    }

    void a(World var1, EntityPlayer var2, UUID var3) {
        eg var4 = new eg(var1, var3);
        var4.func_189654_d(true);
        var4.field_70145_X = true;
        var4.field_70159_w = 0.0;
        var4.field_70181_x = 0.0;
        var4.field_70179_y = 0.0;
        var4.func_70107_b(var2.field_70165_t, var2.field_70163_u + 69.0, var2.field_70161_v);
        var1.func_72838_d(var4);
        var4.B();
    }

    void b(World var1, EntityPlayer var2, UUID var3) {
        ee var4 = new ee(var1, var3);
        var4.func_189654_d(true);
        var4.field_70145_X = true;
        var4.field_70159_w = 0.0;
        var4.field_70181_x = 0.0;
        var4.field_70179_y = 0.0;
        var4.func_70107_b(var2.field_70165_t, var2.field_70163_u + 69.0, var2.field_70161_v);
        var1.func_72838_d(var4);
        var4.B();
    }

    void a(World param1, EntityPlayer param2, ei param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, com/trolmastercard/sexmod/q.lambda$deleteOldPlayerGirls$0 (Lcom/trolmastercard/sexmod/ei;)Z, (Lcom/trolmastercard/sexmod/ei;)Z ]
        // 05: astore 4
        // 07: aload 1
        // 08: ldc com/trolmastercard/sexmod/ei
        // 0a: aload 4
        // 0c: dup
        // 0d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
        // 10: pop
        // 11: invokedynamic apply (Ljava/util/function/Predicate;)Lcom/google/common/base/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, java/util/function/Predicate.test (Ljava/lang/Object;)Z, (Lcom/trolmastercard/sexmod/ei;)Z ]
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
        // 35: checkcast com/trolmastercard/sexmod/ei
        // 38: astore 7
        // 3a: aload 7
        // 3c: invokevirtual com/trolmastercard/sexmod/ei.m ()Ljava/util/UUID;
        // 3f: aload 2
        // 40: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 43: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 46: ifne 50
        // 49: goto 24
        // 4c: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 4f: athrow
        // 50: aload 3
        // 51: ifnull 6e
        // 54: aload 7
        // 56: invokevirtual com/trolmastercard/sexmod/ei.func_145782_y ()I
        // 59: aload 3
        // 5a: invokevirtual com/trolmastercard/sexmod/ei.func_145782_y ()I
        // 5d: if_icmpne 6e
        // 60: goto 67
        // 63: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 66: athrow
        // 67: goto 24
        // 6a: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
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
        // 00: aload 1
        // 01: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedOutEvent.player Lnet/minecraft/entity/player/EntityPlayer;
        // 04: astore 2
        // 05: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 0d: astore 3
        // 0e: aload 3
        // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 14: ifeq ef
        // 17: aload 3
        // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 1d: checkcast com/trolmastercard/sexmod/em
        // 20: astore 4
        // 22: aload 4
        // 24: instanceof com/trolmastercard/sexmod/ei
        // 27: ifeq 3a
        // 2a: aload 4
        // 2c: checkcast com/trolmastercard/sexmod/ei
        // 2f: aload 2
        // 30: invokevirtual com/trolmastercard/sexmod/ei.b (Lnet/minecraft/entity/player/EntityPlayer;)V
        // 33: goto 3a
        // 36: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 39: athrow
        // 3a: aload 4
        // 3c: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 3f: ifnonnull 49
        // 42: goto 0e
        // 45: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 48: athrow
        // 49: aload 4
        // 4b: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 4e: aload 2
        // 4f: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 52: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 55: ifne 6e
        // 58: aload 4
        // 5a: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 5d: aload 2
        // 5e: invokevirtual net/minecraft/entity/player/EntityPlayer.func_110124_au ()Ljava/util/UUID;
        // 61: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 64: ifeq 88
        // 67: goto 6e
        // 6a: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 6d: athrow
        // 6e: aload 4
        // 70: invokestatic com/trolmastercard/sexmod/s$a.a (Lcom/trolmastercard/sexmod/em;)V
        // 73: aload 4
        // 75: bipush 0
        // 76: invokevirtual com/trolmastercard/sexmod/em.a (Z)V
        // 79: aload 4
        // 7b: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 7e: invokevirtual com/trolmastercard/sexmod/em.b (Lcom/trolmastercard/sexmod/fp;)V
        // 81: goto 88
        // 84: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 87: athrow
        // 88: aload 4
        // 8a: instanceof com/trolmastercard/sexmod/ei
        // 8d: ifeq ec
        // 90: aload 4
        // 92: checkcast com/trolmastercard/sexmod/ei
        // 95: invokevirtual com/trolmastercard/sexmod/ei.m ()Ljava/util/UUID;
        // 98: aload 2
        // 99: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 9c: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 9f: ifeq ec
        // a2: goto a9
        // a5: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // a8: athrow
        // a9: aload 4
        // ab: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // ae: ifnull ec
        // b1: goto b8
        // b4: invokestatic com/trolmastercard/sexmod/q.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // b7: athrow
        // b8: aload 1
        // b9: getfield net/minecraftforge/fml/common/gameevent/PlayerEvent$PlayerLoggedOutEvent.player Lnet/minecraft/entity/player/EntityPlayer;
        // bc: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
        // bf: aload 4
        // c1: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // c4: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // c7: checkcast net/minecraft/entity/player/EntityPlayerMP
        // ca: astore 5
        // cc: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // cf: new com/trolmastercard/sexmod/gz
        // d2: dup
        // d3: bipush 1
        // d4: invokespecial com/trolmastercard/sexmod/gz.<init> (Z)V
        // d7: aload 5
        // d9: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
        // dc: aload 5
        // de: invokestatic com/trolmastercard/sexmod/s$a.a (Lnet/minecraft/entity/player/EntityPlayerMP;)V
        // e1: aload 2
        // e2: bipush 0
        // e3: invokevirtual net/minecraft/entity/player/EntityPlayer.func_82142_c (Z)V
        // e6: aload 4
        // e8: aconst_null
        // e9: invokevirtual com/trolmastercard/sexmod/em.e (Ljava/util/UUID;)V
        // ec: goto 0e
        // ef: goto f3
        // f2: astore 3
        // f3: return
        // try (58 -> 71): 72 java/util/ConcurrentModificationException
        // try (55 -> 65): 66 java/util/ConcurrentModificationException
        // try (35 -> 52): 53 java/util/ConcurrentModificationException
        // try (29 -> 41): 42 java/util/ConcurrentModificationException
        // try (23 -> 27): 27 java/util/ConcurrentModificationException
        // try (13 -> 20): 21 java/util/ConcurrentModificationException
        // try (3 -> 98): 99 java/util/ConcurrentModificationException
    }

    private static ConcurrentModificationException a(ConcurrentModificationException var0) {
        return var0;
    }
}
