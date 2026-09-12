package com.schnurritv.sexmod;

import java.util.ConcurrentModificationException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class bz implements IGuiHandler {
   public Object getServerGuiElement(int param1, EntityPlayer param2, World param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 1
      // 001: ifne 0a5
      // 004: invokestatic com/schnurritv/sexmod/bi.J ()Ljava/util/HashSet;
      // 007: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 00a: astore 7
      // 00c: aload 7
      // 00e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 013: ifeq 0a0
      // 016: aload 7
      // 018: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 01d: checkcast com/schnurritv/sexmod/bi
      // 020: astore 8
      // 022: aload 8
      // 024: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 027: getfield net/minecraft/world/World.field_72995_K Z
      // 02a: ifne 09d
      // 02d: aload 8
      // 02f: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 032: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 035: iload 4
      // 037: if_icmpne 09d
      // 03a: goto 041
      // 03d: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 040: athrow
      // 041: aload 8
      // 043: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 046: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
      // 049: iload 5
      // 04b: if_icmpne 09d
      // 04e: goto 055
      // 051: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 054: athrow
      // 055: aload 8
      // 057: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 05a: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 05d: iload 6
      // 05f: if_icmpne 09d
      // 062: goto 069
      // 065: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 068: athrow
      // 069: aload 8
      // 06b: instanceof com/schnurritv/sexmod/c9
      // 06e: ifeq 08c
      // 071: goto 078
      // 074: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 077: athrow
      // 078: new com/schnurritv/sexmod/av
      // 07b: dup
      // 07c: aload 8
      // 07e: checkcast com/schnurritv/sexmod/c9
      // 081: aload 2
      // 082: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
      // 085: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 088: invokespecial com/schnurritv/sexmod/av.<init> (Lcom/schnurritv/sexmod/c9;Lnet/minecraft/entity/player/InventoryPlayer;Ljava/util/UUID;)V
      // 08b: areturn
      // 08c: new com/schnurritv/sexmod/a7
      // 08f: dup
      // 090: aload 8
      // 092: aload 2
      // 093: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
      // 096: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 099: invokespecial com/schnurritv/sexmod/a7.<init> (Lcom/schnurritv/sexmod/bi;Lnet/minecraft/entity/player/InventoryPlayer;Ljava/util/UUID;)V
      // 09c: areturn
      // 09d: goto 00c
      // 0a0: goto 0a5
      // 0a3: astore 7
      // 0a5: iload 1
      // 0a6: bipush 1
      // 0a7: if_icmpne 13f
      // 0aa: invokestatic com/schnurritv/sexmod/bi.J ()Ljava/util/HashSet;
      // 0ad: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 0b0: astore 7
      // 0b2: aload 7
      // 0b4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b9: ifeq 13a
      // 0bc: aload 7
      // 0be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c3: checkcast com/schnurritv/sexmod/bi
      // 0c6: astore 8
      // 0c8: aload 8
      // 0ca: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 0cd: getfield net/minecraft/world/World.field_72995_K Z
      // 0d0: ifne 137
      // 0d3: aload 8
      // 0d5: instanceof net/minecraft/inventory/IInventory
      // 0d8: ifeq 137
      // 0db: goto 0e2
      // 0de: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 0e1: athrow
      // 0e2: aload 8
      // 0e4: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 0e7: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 0ea: iload 4
      // 0ec: if_icmpne 137
      // 0ef: goto 0f6
      // 0f2: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 0f5: athrow
      // 0f6: aload 8
      // 0f8: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 0fb: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
      // 0fe: iload 5
      // 100: if_icmpne 137
      // 103: goto 10a
      // 106: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 109: athrow
      // 10a: aload 8
      // 10c: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 10f: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 112: iload 6
      // 114: if_icmpne 137
      // 117: goto 11e
      // 11a: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 11d: athrow
      // 11e: aload 8
      // 120: checkcast net/minecraft/inventory/IInventory
      // 123: astore 9
      // 125: new com/schnurritv/sexmod/b4
      // 128: dup
      // 129: aload 2
      // 12a: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
      // 12d: aload 9
      // 12f: aload 2
      // 130: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 133: invokespecial com/schnurritv/sexmod/b4.<init> (Lnet/minecraft/inventory/IInventory;Lnet/minecraft/inventory/IInventory;Lnet/minecraft/entity/player/EntityPlayer;Ljava/util/UUID;)V
      // 136: areturn
      // 137: goto 0b2
      // 13a: goto 13f
      // 13d: astore 7
      // 13f: aconst_null
      // 140: areturn
      // try (32 -> 43): 44 java/util/ConcurrentModificationException
      // try (24 -> 37): 38 java/util/ConcurrentModificationException
      // try (16 -> 29): 30 java/util/ConcurrentModificationException
      // try (12 -> 21): 22 java/util/ConcurrentModificationException
      // try (2 -> 54): 65 java/util/ConcurrentModificationException
      // try (55 -> 62): 65 java/util/ConcurrentModificationException
      // try (63 -> 64): 65 java/util/ConcurrentModificationException
      // try (97 -> 110): 111 java/util/ConcurrentModificationException
      // try (89 -> 102): 103 java/util/ConcurrentModificationException
      // try (83 -> 94): 95 java/util/ConcurrentModificationException
      // try (79 -> 86): 87 java/util/ConcurrentModificationException
      // try (69 -> 124): 127 java/util/ConcurrentModificationException
      // try (125 -> 126): 127 java/util/ConcurrentModificationException
   }

   public Object getClientGuiElement(int param1, EntityPlayer param2, World param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 1
      // 001: ifne 0a5
      // 004: invokestatic com/schnurritv/sexmod/bi.J ()Ljava/util/HashSet;
      // 007: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 00a: astore 7
      // 00c: aload 7
      // 00e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 013: ifeq 0a0
      // 016: aload 7
      // 018: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 01d: checkcast com/schnurritv/sexmod/bi
      // 020: astore 8
      // 022: aload 8
      // 024: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 027: getfield net/minecraft/world/World.field_72995_K Z
      // 02a: ifeq 09d
      // 02d: aload 8
      // 02f: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 032: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 035: iload 4
      // 037: if_icmpne 09d
      // 03a: goto 041
      // 03d: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 040: athrow
      // 041: aload 8
      // 043: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 046: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
      // 049: iload 5
      // 04b: if_icmpne 09d
      // 04e: goto 055
      // 051: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 054: athrow
      // 055: aload 8
      // 057: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 05a: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 05d: iload 6
      // 05f: if_icmpne 09d
      // 062: goto 069
      // 065: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 068: athrow
      // 069: aload 8
      // 06b: instanceof com/schnurritv/sexmod/c9
      // 06e: ifeq 08c
      // 071: goto 078
      // 074: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 077: athrow
      // 078: new com/schnurritv/sexmod/cB
      // 07b: dup
      // 07c: aload 8
      // 07e: checkcast com/schnurritv/sexmod/c9
      // 081: aload 2
      // 082: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
      // 085: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 088: invokespecial com/schnurritv/sexmod/cB.<init> (Lcom/schnurritv/sexmod/c9;Lnet/minecraft/entity/player/InventoryPlayer;Ljava/util/UUID;)V
      // 08b: areturn
      // 08c: new com/schnurritv/sexmod/ay
      // 08f: dup
      // 090: aload 8
      // 092: aload 2
      // 093: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
      // 096: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 099: invokespecial com/schnurritv/sexmod/ay.<init> (Lcom/schnurritv/sexmod/bi;Lnet/minecraft/entity/player/InventoryPlayer;Ljava/util/UUID;)V
      // 09c: areturn
      // 09d: goto 00c
      // 0a0: goto 0a5
      // 0a3: astore 7
      // 0a5: iload 1
      // 0a6: bipush 1
      // 0a7: if_icmpne 134
      // 0aa: invokestatic com/schnurritv/sexmod/bi.J ()Ljava/util/HashSet;
      // 0ad: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 0b0: astore 7
      // 0b2: aload 7
      // 0b4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b9: ifeq 12f
      // 0bc: aload 7
      // 0be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c3: checkcast com/schnurritv/sexmod/bi
      // 0c6: astore 8
      // 0c8: aload 8
      // 0ca: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 0cd: getfield net/minecraft/world/World.field_72995_K Z
      // 0d0: ifeq 12c
      // 0d3: aload 8
      // 0d5: instanceof net/minecraft/inventory/IInventory
      // 0d8: ifeq 12c
      // 0db: goto 0e2
      // 0de: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 0e1: athrow
      // 0e2: aload 8
      // 0e4: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 0e7: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 0ea: iload 4
      // 0ec: if_icmpne 12c
      // 0ef: goto 0f6
      // 0f2: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 0f5: athrow
      // 0f6: aload 8
      // 0f8: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 0fb: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
      // 0fe: iload 5
      // 100: if_icmpne 12c
      // 103: goto 10a
      // 106: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 109: athrow
      // 10a: aload 8
      // 10c: invokevirtual com/schnurritv/sexmod/bi.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
      // 10f: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 112: iload 6
      // 114: if_icmpne 12c
      // 117: goto 11e
      // 11a: invokestatic com/schnurritv/sexmod/bz.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 11d: athrow
      // 11e: new com/schnurritv/sexmod/a2
      // 121: dup
      // 122: aload 2
      // 123: aload 8
      // 125: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 128: invokespecial com/schnurritv/sexmod/a2.<init> (Lnet/minecraft/entity/player/EntityPlayer;Lcom/schnurritv/sexmod/bi;Ljava/util/UUID;)V
      // 12b: areturn
      // 12c: goto 0b2
      // 12f: goto 134
      // 132: astore 7
      // 134: aconst_null
      // 135: areturn
      // try (32 -> 43): 44 java/util/ConcurrentModificationException
      // try (24 -> 37): 38 java/util/ConcurrentModificationException
      // try (16 -> 29): 30 java/util/ConcurrentModificationException
      // try (12 -> 21): 22 java/util/ConcurrentModificationException
      // try (2 -> 54): 65 java/util/ConcurrentModificationException
      // try (55 -> 62): 65 java/util/ConcurrentModificationException
      // try (63 -> 64): 65 java/util/ConcurrentModificationException
      // try (97 -> 110): 111 java/util/ConcurrentModificationException
      // try (89 -> 102): 103 java/util/ConcurrentModificationException
      // try (83 -> 94): 95 java/util/ConcurrentModificationException
      // try (79 -> 86): 87 java/util/ConcurrentModificationException
      // try (69 -> 119): 122 java/util/ConcurrentModificationException
      // try (120 -> 121): 122 java/util/ConcurrentModificationException
   }

   private static ConcurrentModificationException a(ConcurrentModificationException var0) {
      return var0;
   }
}
