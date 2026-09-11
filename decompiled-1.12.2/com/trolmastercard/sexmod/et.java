package com.trolmastercard.sexmod;

import java.io.File;
import java.util.ConcurrentModificationException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class et implements IGuiHandler {
    File b;
    File c;
    boolean a = false;

    public et() {
    }

    public et(boolean var1) {
        this.a();
    }

    @SideOnly(Side.CLIENT)
    void a() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: bipush 2
        // 001: istore 1
        // 002: iload 1
        // 003: ifne 0ac
        // 006: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 009: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 00e: astore 2
        // 00f: aload 2
        // 010: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 015: ifeq 0a8
        // 018: aload 2
        // 019: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 01e: checkcast com/trolmastercard/sexmod/em
        // 021: astore 3
        // 022: aload 3
        // 023: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 026: getfield net/minecraft/world/World.field_72995_K Z
        // 029: ifne 0a5
        // 02c: aload 3
        // 02d: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 030: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 033: bipush 5
        // 034: if_icmpne 0a5
        // 037: goto 03e
        // 03a: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 03d: athrow
        // 03e: aload 3
        // 03f: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 042: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 045: bipush 7
        // 047: if_icmpne 0a5
        // 04a: goto 051
        // 04d: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 050: athrow
        // 051: aload 3
        // 052: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 055: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 058: bipush 5
        // 059: if_icmpne 0a5
        // 05c: goto 063
        // 05f: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 062: athrow
        // 063: aload 3
        // 064: instanceof com/trolmastercard/sexmod/eb
        // 067: ifeq 090
        // 06a: goto 071
        // 06d: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 070: athrow
        // 071: new com/trolmastercard/sexmod/ca
        // 074: dup
        // 075: aload 3
        // 076: checkcast com/trolmastercard/sexmod/eb
        // 079: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 07c: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 07f: getfield net/minecraft/client/entity/EntityPlayerSP.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
        // 082: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 085: invokespecial com/trolmastercard/sexmod/ca.<init> (Lcom/trolmastercard/sexmod/eb;Lnet/minecraft/entity/player/InventoryPlayer;Ljava/util/UUID;)V
        // 088: pop
        // 089: goto 090
        // 08c: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 08f: athrow
        // 090: new com/trolmastercard/sexmod/d4
        // 093: dup
        // 094: aload 3
        // 095: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 098: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 09b: getfield net/minecraft/client/entity/EntityPlayerSP.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
        // 09e: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 0a1: invokespecial com/trolmastercard/sexmod/d4.<init> (Lcom/trolmastercard/sexmod/em;Lnet/minecraft/entity/player/InventoryPlayer;Ljava/util/UUID;)V
        // 0a4: pop
        // 0a5: goto 00f
        // 0a8: goto 0ac
        // 0ab: astore 2
        // 0ac: iload 1
        // 0ad: bipush 1
        // 0ae: if_icmpne 145
        // 0b1: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 0b4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 0b9: astore 2
        // 0ba: aload 2
        // 0bb: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 0c0: ifeq 141
        // 0c3: aload 2
        // 0c4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 0c9: checkcast com/trolmastercard/sexmod/em
        // 0cc: astore 3
        // 0cd: aload 3
        // 0ce: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 0d1: getfield net/minecraft/world/World.field_72995_K Z
        // 0d4: ifne 13e
        // 0d7: aload 3
        // 0d8: instanceof net/minecraft/inventory/IInventory
        // 0db: ifeq 13e
        // 0de: goto 0e5
        // 0e1: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0e4: athrow
        // 0e5: aload 3
        // 0e6: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 0e9: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 0ec: bipush 3
        // 0ed: if_icmpne 13e
        // 0f0: goto 0f7
        // 0f3: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0f6: athrow
        // 0f7: aload 3
        // 0f8: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 0fb: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 0fe: bipush 1
        // 0ff: if_icmpne 13e
        // 102: goto 109
        // 105: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 108: athrow
        // 109: aload 3
        // 10a: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 10d: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 110: bipush 7
        // 112: if_icmpne 13e
        // 115: goto 11c
        // 118: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 11b: athrow
        // 11c: aload 3
        // 11d: checkcast net/minecraft/inventory/IInventory
        // 120: astore 4
        // 122: new com/trolmastercard/sexmod/bx
        // 125: dup
        // 126: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 129: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 12c: getfield net/minecraft/client/entity/EntityPlayerSP.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
        // 12f: aload 4
        // 131: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 134: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 137: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 13a: invokespecial com/trolmastercard/sexmod/bx.<init> (Lnet/minecraft/inventory/IInventory;Lnet/minecraft/inventory/IInventory;Lnet/minecraft/entity/player/EntityPlayer;Ljava/util/UUID;)V
        // 13d: pop
        // 13e: goto 0ba
        // 141: goto 145
        // 144: astore 2
        // 145: return
        // try (42 -> 58): 59 java/util/ConcurrentModificationException
        // try (34 -> 45): 46 java/util/ConcurrentModificationException
        // try (26 -> 39): 40 java/util/ConcurrentModificationException
        // try (18 -> 31): 32 java/util/ConcurrentModificationException
        // try (14 -> 23): 24 java/util/ConcurrentModificationException
        // try (4 -> 71): 72 java/util/ConcurrentModificationException
        // try (104 -> 117): 118 java/util/ConcurrentModificationException
        // try (96 -> 109): 110 java/util/ConcurrentModificationException
        // try (90 -> 101): 102 java/util/ConcurrentModificationException
        // try (86 -> 93): 94 java/util/ConcurrentModificationException
        // try (76 -> 135): 136 java/util/ConcurrentModificationException
    }

    public Object getServerGuiElement(int param1, EntityPlayer param2, World param3, int param4, int param5, int param6) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: iload 1
        // 001: ifne 0a7
        // 004: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 007: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 00c: astore 7
        // 00e: aload 7
        // 010: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 015: ifeq 0a2
        // 018: aload 7
        // 01a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 01f: checkcast com/trolmastercard/sexmod/em
        // 022: astore 8
        // 024: aload 8
        // 026: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 029: getfield net/minecraft/world/World.field_72995_K Z
        // 02c: ifne 09f
        // 02f: aload 8
        // 031: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 034: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 037: iload 4
        // 039: if_icmpne 09f
        // 03c: goto 043
        // 03f: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 042: athrow
        // 043: aload 8
        // 045: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 048: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 04b: iload 5
        // 04d: if_icmpne 09f
        // 050: goto 057
        // 053: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 056: athrow
        // 057: aload 8
        // 059: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 05c: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 05f: iload 6
        // 061: if_icmpne 09f
        // 064: goto 06b
        // 067: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 06a: athrow
        // 06b: aload 8
        // 06d: instanceof com/trolmastercard/sexmod/eb
        // 070: ifeq 08e
        // 073: goto 07a
        // 076: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 079: athrow
        // 07a: new com/trolmastercard/sexmod/ca
        // 07d: dup
        // 07e: aload 8
        // 080: checkcast com/trolmastercard/sexmod/eb
        // 083: aload 2
        // 084: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
        // 087: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 08a: invokespecial com/trolmastercard/sexmod/ca.<init> (Lcom/trolmastercard/sexmod/eb;Lnet/minecraft/entity/player/InventoryPlayer;Ljava/util/UUID;)V
        // 08d: areturn
        // 08e: new com/trolmastercard/sexmod/d4
        // 091: dup
        // 092: aload 8
        // 094: aload 2
        // 095: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
        // 098: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 09b: invokespecial com/trolmastercard/sexmod/d4.<init> (Lcom/trolmastercard/sexmod/em;Lnet/minecraft/entity/player/InventoryPlayer;Ljava/util/UUID;)V
        // 09e: areturn
        // 09f: goto 00e
        // 0a2: goto 0a7
        // 0a5: astore 7
        // 0a7: iload 1
        // 0a8: bipush 1
        // 0a9: if_icmpne 143
        // 0ac: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 0af: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 0b4: astore 7
        // 0b6: aload 7
        // 0b8: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 0bd: ifeq 13e
        // 0c0: aload 7
        // 0c2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 0c7: checkcast com/trolmastercard/sexmod/em
        // 0ca: astore 8
        // 0cc: aload 8
        // 0ce: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 0d1: getfield net/minecraft/world/World.field_72995_K Z
        // 0d4: ifne 13b
        // 0d7: aload 8
        // 0d9: instanceof net/minecraft/inventory/IInventory
        // 0dc: ifeq 13b
        // 0df: goto 0e6
        // 0e2: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0e5: athrow
        // 0e6: aload 8
        // 0e8: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 0eb: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 0ee: iload 4
        // 0f0: if_icmpne 13b
        // 0f3: goto 0fa
        // 0f6: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0f9: athrow
        // 0fa: aload 8
        // 0fc: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 0ff: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 102: iload 5
        // 104: if_icmpne 13b
        // 107: goto 10e
        // 10a: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 10d: athrow
        // 10e: aload 8
        // 110: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 113: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 116: iload 6
        // 118: if_icmpne 13b
        // 11b: goto 122
        // 11e: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 121: athrow
        // 122: aload 8
        // 124: checkcast net/minecraft/inventory/IInventory
        // 127: astore 9
        // 129: new com/trolmastercard/sexmod/bx
        // 12c: dup
        // 12d: aload 2
        // 12e: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
        // 131: aload 9
        // 133: aload 2
        // 134: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 137: invokespecial com/trolmastercard/sexmod/bx.<init> (Lnet/minecraft/inventory/IInventory;Lnet/minecraft/inventory/IInventory;Lnet/minecraft/entity/player/EntityPlayer;Ljava/util/UUID;)V
        // 13a: areturn
        // 13b: goto 0b6
        // 13e: goto 143
        // 141: astore 7
        // 143: aconst_null
        // 144: areturn
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
        // 001: ifne 0a7
        // 004: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 007: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 00c: astore 7
        // 00e: aload 7
        // 010: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 015: ifeq 0a2
        // 018: aload 7
        // 01a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 01f: checkcast com/trolmastercard/sexmod/em
        // 022: astore 8
        // 024: aload 8
        // 026: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 029: getfield net/minecraft/world/World.field_72995_K Z
        // 02c: ifeq 09f
        // 02f: aload 8
        // 031: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 034: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 037: iload 4
        // 039: if_icmpne 09f
        // 03c: goto 043
        // 03f: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 042: athrow
        // 043: aload 8
        // 045: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 048: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 04b: iload 5
        // 04d: if_icmpne 09f
        // 050: goto 057
        // 053: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 056: athrow
        // 057: aload 8
        // 059: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 05c: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 05f: iload 6
        // 061: if_icmpne 09f
        // 064: goto 06b
        // 067: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 06a: athrow
        // 06b: aload 8
        // 06d: instanceof com/trolmastercard/sexmod/eb
        // 070: ifeq 08e
        // 073: goto 07a
        // 076: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 079: athrow
        // 07a: new com/trolmastercard/sexmod/az
        // 07d: dup
        // 07e: aload 8
        // 080: checkcast com/trolmastercard/sexmod/eb
        // 083: aload 2
        // 084: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
        // 087: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 08a: invokespecial com/trolmastercard/sexmod/az.<init> (Lcom/trolmastercard/sexmod/eb;Lnet/minecraft/entity/player/InventoryPlayer;Ljava/util/UUID;)V
        // 08d: areturn
        // 08e: new com/trolmastercard/sexmod/fb
        // 091: dup
        // 092: aload 8
        // 094: aload 2
        // 095: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
        // 098: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 09b: invokespecial com/trolmastercard/sexmod/fb.<init> (Lcom/trolmastercard/sexmod/em;Lnet/minecraft/entity/player/InventoryPlayer;Ljava/util/UUID;)V
        // 09e: areturn
        // 09f: goto 00e
        // 0a2: goto 0a7
        // 0a5: astore 7
        // 0a7: iload 1
        // 0a8: bipush 1
        // 0a9: if_icmpne 138
        // 0ac: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 0af: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 0b4: astore 7
        // 0b6: aload 7
        // 0b8: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 0bd: ifeq 133
        // 0c0: aload 7
        // 0c2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 0c7: checkcast com/trolmastercard/sexmod/em
        // 0ca: astore 8
        // 0cc: aload 8
        // 0ce: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 0d1: getfield net/minecraft/world/World.field_72995_K Z
        // 0d4: ifeq 130
        // 0d7: aload 8
        // 0d9: instanceof net/minecraft/inventory/IInventory
        // 0dc: ifeq 130
        // 0df: goto 0e6
        // 0e2: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0e5: athrow
        // 0e6: aload 8
        // 0e8: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 0eb: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 0ee: iload 4
        // 0f0: if_icmpne 130
        // 0f3: goto 0fa
        // 0f6: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0f9: athrow
        // 0fa: aload 8
        // 0fc: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 0ff: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 102: iload 5
        // 104: if_icmpne 130
        // 107: goto 10e
        // 10a: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 10d: athrow
        // 10e: aload 8
        // 110: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 113: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 116: iload 6
        // 118: if_icmpne 130
        // 11b: goto 122
        // 11e: invokestatic com/trolmastercard/sexmod/et.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 121: athrow
        // 122: new com/trolmastercard/sexmod/ek
        // 125: dup
        // 126: aload 2
        // 127: aload 8
        // 129: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
        // 12c: invokespecial com/trolmastercard/sexmod/ek.<init> (Lnet/minecraft/entity/player/EntityPlayer;Lcom/trolmastercard/sexmod/em;Ljava/util/UUID;)V
        // 12f: areturn
        // 130: goto 0b6
        // 133: goto 138
        // 136: astore 7
        // 138: aconst_null
        // 139: areturn
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
