package com.schnurritv.sexmod;

import java.util.ConcurrentModificationException;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;

public class K$a {
   @SubscribeEvent
   public void a(PlayerLoggedOutEvent var1) {
      var1.player.getEntityData().func_74757_a("sexmodAllieInUse", false);
   }

   @SubscribeEvent
   public void a(RightClickItem param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickItem.getEntityPlayer ()Lnet/minecraft/entity/player/EntityPlayer;
      // 004: astore 2
      // 005: aload 1
      // 006: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickItem.getHand ()Lnet/minecraft/util/EnumHand;
      // 009: astore 3
      // 00a: aload 2
      // 00b: aload 3
      // 00c: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184586_b (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
      // 00f: astore 4
      // 011: aload 2
      // 012: invokestatic com/schnurritv/sexmod/bg.e (Lnet/minecraft/entity/player/EntityPlayer;)Z
      // 015: ifeq 01d
      // 018: return
      // 019: invokestatic com/schnurritv/sexmod/K$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 01c: athrow
      // 01d: aload 2
      // 01e: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
      // 021: getfield net/minecraft/world/World.field_72995_K Z
      // 024: ifeq 039
      // 027: invokestatic com/schnurritv/sexmod/bE.b ()Z
      // 02a: ifne 039
      // 02d: goto 034
      // 030: invokestatic com/schnurritv/sexmod/K$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 033: athrow
      // 034: return
      // 035: invokestatic com/schnurritv/sexmod/K$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 038: athrow
      // 039: aload 2
      // 03a: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
      // 03d: getfield net/minecraft/world/World.field_72995_K Z
      // 040: ifne 0a9
      // 043: invokestatic com/schnurritv/sexmod/bi.J ()Ljava/util/HashSet;
      // 046: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 049: astore 5
      // 04b: aload 5
      // 04d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 052: ifeq 0a4
      // 055: aload 5
      // 057: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05c: checkcast com/schnurritv/sexmod/bi
      // 05f: astore 6
      // 061: aload 6
      // 063: getfield com/schnurritv/sexmod/bi.field_70128_L Z
      // 066: ifeq 070
      // 069: goto 04b
      // 06c: invokestatic com/schnurritv/sexmod/K$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 06f: athrow
      // 070: aload 6
      // 072: instanceof com/schnurritv/sexmod/bO
      // 075: ifne 07f
      // 078: goto 04b
      // 07b: invokestatic com/schnurritv/sexmod/K$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 07e: athrow
      // 07f: aload 6
      // 081: checkcast com/schnurritv/sexmod/bO
      // 084: astore 7
      // 086: aload 7
      // 088: invokevirtual com/schnurritv/sexmod/bO.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 08b: getstatic com/schnurritv/sexmod/bO.K Lnet/minecraft/network/datasync/DataParameter;
      // 08e: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 091: checkcast net/minecraft/item/ItemStack
      // 094: astore 8
      // 096: aload 4
      // 098: aload 8
      // 09a: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 09d: ifeq 0a1
      // 0a0: return
      // 0a1: goto 04b
      // 0a4: goto 0a9
      // 0a7: astore 5
      // 0a9: aload 4
      // 0ab: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 0ae: getstatic com/schnurritv/sexmod/K.i Lcom/schnurritv/sexmod/K;
      // 0b1: if_acmpeq 0b9
      // 0b4: return
      // 0b5: invokestatic com/schnurritv/sexmod/K$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 0b8: athrow
      // 0b9: aload 4
      // 0bb: invokevirtual net/minecraft/item/ItemStack.func_77978_p ()Lnet/minecraft/nbt/NBTTagCompound;
      // 0be: astore 5
      // 0c0: aload 5
      // 0c2: ifnull 0dc
      // 0c5: aload 5
      // 0c7: ldc "sexmodUses"
      // 0c9: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74762_e (Ljava/lang/String;)I
      // 0cc: bipush 3
      // 0cd: if_icmplt 0dc
      // 0d0: goto 0d7
      // 0d3: invokestatic com/schnurritv/sexmod/K$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 0d6: athrow
      // 0d7: return
      // 0d8: invokestatic com/schnurritv/sexmod/K$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 0db: athrow
      // 0dc: aload 2
      // 0dd: invokevirtual net/minecraft/entity/player/EntityPlayer.getEntityData ()Lnet/minecraft/nbt/NBTTagCompound;
      // 0e0: astore 6
      // 0e2: aload 6
      // 0e4: ldc "sexmodAllieInUse"
      // 0e6: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74767_n (Ljava/lang/String;)Z
      // 0e9: istore 7
      // 0eb: iload 7
      // 0ed: ifeq 0f5
      // 0f0: return
      // 0f1: invokestatic com/schnurritv/sexmod/K$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 0f4: athrow
      // 0f5: aload 6
      // 0f7: ldc "sexmodAllieInUse"
      // 0f9: bipush 1
      // 0fa: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74757_a (Ljava/lang/String;Z)V
      // 0fd: aload 6
      // 0ff: ldc "sexmodAllieInUseTicks"
      // 101: bipush 0
      // 102: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74768_a (Ljava/lang/String;I)V
      // 105: return
      // try (48 -> 52): 52 java/util/ConcurrentModificationException
      // try (42 -> 46): 46 java/util/ConcurrentModificationException
      // try (20 -> 26): 26 java/util/ConcurrentModificationException
      // try (16 -> 22): 23 java/util/ConcurrentModificationException
      // try (10 -> 14): 14 java/util/ConcurrentModificationException
      // try (32 -> 67): 70 java/util/ConcurrentModificationException
      // try (68 -> 69): 70 java/util/ConcurrentModificationException
      // try (71 -> 76): 76 java/util/ConcurrentModificationException
      // try (81 -> 88): 89 java/util/ConcurrentModificationException
      // try (83 -> 92): 92 java/util/ConcurrentModificationException
      // try (101 -> 104): 104 java/util/ConcurrentModificationException
   }

   private static ConcurrentModificationException a(ConcurrentModificationException var0) {
      return var0;
   }
}
