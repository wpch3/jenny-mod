package com.trolmastercard.sexmod;

import java.util.ConcurrentModificationException;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent.Pre;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class l {
    Vec3d b = null;
    Vec3d a = null;

    @SubscribeEvent
    public void a(Pre param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 03: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 08: astore 2
        // 09: aload 2
        // 0a: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 0f: ifeq 80
        // 12: aload 2
        // 13: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 18: checkcast com/trolmastercard/sexmod/em
        // 1b: astore 3
        // 1c: aload 3
        // 1d: getfield com/trolmastercard/sexmod/em.field_70128_L Z
        // 20: ifne 09
        // 23: aload 3
        // 24: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 27: ifnull 09
        // 2a: aload 3
        // 2b: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 2e: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 31: if_acmpne 3b
        // 34: goto 09
        // 37: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 3a: athrow
        // 3b: aload 1
        // 3c: invokevirtual net/minecraftforge/client/event/RenderPlayerEvent$Pre.getEntityPlayer ()Lnet/minecraft/entity/player/EntityPlayer;
        // 3f: astore 4
        // 41: aload 3
        // 42: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 45: getfield com/trolmastercard/sexmod/fp.hasPlayer Z
        // 48: ifeq 7d
        // 4b: aload 3
        // 4c: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 4f: aload 4
        // 51: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 54: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 57: ifne 77
        // 5a: goto 61
        // 5d: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 60: athrow
        // 61: aload 3
        // 62: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 65: aload 4
        // 67: invokevirtual net/minecraft/entity/player/EntityPlayer.func_110124_au ()Ljava/util/UUID;
        // 6a: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 6d: ifeq 7d
        // 70: goto 77
        // 73: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 76: athrow
        // 77: aload 1
        // 78: bipush 1
        // 79: invokevirtual net/minecraftforge/client/event/RenderPlayerEvent$Pre.setCanceled (Z)V
        // 7c: return
        // 7d: goto 09
        // 80: goto 84
        // 83: astore 2
        // 84: return
        // try (30 -> 45): 46 java/util/ConcurrentModificationException
        // try (26 -> 36): 37 java/util/ConcurrentModificationException
        // try (16 -> 21): 21 java/util/ConcurrentModificationException
        // try (0 -> 51): 54 java/util/ConcurrentModificationException
        // try (52 -> 53): 54 java/util/ConcurrentModificationException
    }

    @SubscribeEvent
    public void a(RenderHandEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 03: astore 2
        // 04: aload 2
        // 05: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 08: astore 3
        // 09: aload 3
        // 0a: invokestatic com/trolmastercard/sexmod/ei.g (Lnet/minecraft/entity/player/EntityPlayer;)Lcom/trolmastercard/sexmod/ei;
        // 0d: astore 4
        // 0f: aload 4
        // 11: ifnull 2d
        // 14: aload 4
        // 16: invokevirtual com/trolmastercard/sexmod/ei.Q ()Z
        // 19: ifeq 2d
        // 1c: goto 23
        // 1f: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 22: athrow
        // 23: aload 1
        // 24: bipush 1
        // 25: invokevirtual net/minecraftforge/client/event/RenderHandEvent.setCanceled (Z)V
        // 28: return
        // 29: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 2c: athrow
        // 2d: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 30: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 35: astore 5
        // 37: aload 5
        // 39: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 3e: ifeq ab
        // 41: aload 5
        // 43: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 48: checkcast com/trolmastercard/sexmod/em
        // 4b: astore 6
        // 4d: aload 6
        // 4f: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 52: astore 7
        // 54: aload 6
        // 56: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 59: astore 8
        // 5b: aload 6
        // 5d: getfield com/trolmastercard/sexmod/em.field_70128_L Z
        // 60: ifne 37
        // 63: aload 7
        // 65: ifnull 37
        // 68: aload 8
        // 6a: ifnonnull 74
        // 6d: goto 37
        // 70: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 73: athrow
        // 74: aload 8
        // 76: getfield com/trolmastercard/sexmod/fp.hasPlayer Z
        // 79: ifeq a8
        // 7c: aload 7
        // 7e: aload 3
        // 7f: invokevirtual net/minecraft/entity/player/EntityPlayer.func_110124_au ()Ljava/util/UUID;
        // 82: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 85: ifne a2
        // 88: goto 8f
        // 8b: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 8e: athrow
        // 8f: aload 7
        // 91: aload 3
        // 92: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 95: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 98: ifeq a8
        // 9b: goto a2
        // 9e: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // a1: athrow
        // a2: aload 1
        // a3: bipush 1
        // a4: invokevirtual net/minecraftforge/client/event/RenderHandEvent.setCanceled (Z)V
        // a7: return
        // a8: goto 37
        // ab: goto b0
        // ae: astore 5
        // b0: return
        // try (51 -> 64): 65 java/util/ConcurrentModificationException
        // try (48 -> 56): 57 java/util/ConcurrentModificationException
        // try (43 -> 46): 46 java/util/ConcurrentModificationException
        // try (10 -> 20): 20 java/util/ConcurrentModificationException
        // try (8 -> 13): 14 java/util/ConcurrentModificationException
        // try (22 -> 70): 73 java/util/ConcurrentModificationException
        // try (71 -> 72): 73 java/util/ConcurrentModificationException
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(RenderTickEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 003: astore 2
        // 004: aload 2
        // 005: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 008: ifnonnull 010
        // 00b: return
        // 00c: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 00f: athrow
        // 010: aload 1
        // 011: getfield net/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent.phase Lnet/minecraftforge/fml/common/gameevent/TickEvent$Phase;
        // 014: getstatic net/minecraftforge/fml/common/gameevent/TickEvent$Phase.END Lnet/minecraftforge/fml/common/gameevent/TickEvent$Phase;
        // 017: if_acmpne 080
        // 01a: aload 0
        // 01b: getfield com/trolmastercard/sexmod/l.b Lnet/minecraft/util/math/Vec3d;
        // 01e: ifnull 07f
        // 021: goto 028
        // 024: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 027: athrow
        // 028: aload 2
        // 029: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 02c: aload 0
        // 02d: getfield com/trolmastercard/sexmod/l.b Lnet/minecraft/util/math/Vec3d;
        // 030: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 033: aload 0
        // 034: getfield com/trolmastercard/sexmod/l.b Lnet/minecraft/util/math/Vec3d;
        // 037: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 03a: aload 0
        // 03b: getfield com/trolmastercard/sexmod/l.b Lnet/minecraft/util/math/Vec3d;
        // 03e: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 041: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70107_b (DDD)V
        // 044: aload 2
        // 045: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 048: aload 0
        // 049: getfield com/trolmastercard/sexmod/l.a Lnet/minecraft/util/math/Vec3d;
        // 04c: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 04f: putfield net/minecraft/client/entity/EntityPlayerSP.field_70142_S D
        // 052: aload 2
        // 053: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 056: aload 0
        // 057: getfield com/trolmastercard/sexmod/l.a Lnet/minecraft/util/math/Vec3d;
        // 05a: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 05d: putfield net/minecraft/client/entity/EntityPlayerSP.field_70137_T D
        // 060: aload 2
        // 061: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 064: aload 0
        // 065: getfield com/trolmastercard/sexmod/l.a Lnet/minecraft/util/math/Vec3d;
        // 068: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 06b: putfield net/minecraft/client/entity/EntityPlayerSP.field_70136_U D
        // 06e: aload 0
        // 06f: aconst_null
        // 070: putfield com/trolmastercard/sexmod/l.b Lnet/minecraft/util/math/Vec3d;
        // 073: aload 0
        // 074: aconst_null
        // 075: putfield com/trolmastercard/sexmod/l.a Lnet/minecraft/util/math/Vec3d;
        // 078: goto 07f
        // 07b: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 07e: athrow
        // 07f: return
        // 080: aload 2
        // 081: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 084: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 087: ifeq 08f
        // 08a: return
        // 08b: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 08e: athrow
        // 08f: aload 2
        // 090: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 093: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 096: bipush 0
        // 097: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
        // 09a: invokestatic com/trolmastercard/sexmod/em.a (Ljava/util/UUID;Ljava/lang/Boolean;)Lcom/trolmastercard/sexmod/em;
        // 09d: astore 3
        // 09e: aload 3
        // 09f: ifnonnull 0a7
        // 0a2: return
        // 0a3: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0a6: athrow
        // 0a7: aload 3
        // 0a8: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 0ab: getfield com/trolmastercard/sexmod/fp.useBoyCam Z
        // 0ae: ifne 0b6
        // 0b1: return
        // 0b2: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0b5: athrow
        // 0b6: aload 3
        // 0b7: invokevirtual com/trolmastercard/sexmod/em.m ()Z
        // 0ba: ifeq 0c2
        // 0bd: return
        // 0be: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0c1: athrow
        // 0c2: aload 0
        // 0c3: aload 2
        // 0c4: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0c7: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 0ca: putfield com/trolmastercard/sexmod/l.b Lnet/minecraft/util/math/Vec3d;
        // 0cd: aload 0
        // 0ce: new net/minecraft/util/math/Vec3d
        // 0d1: dup
        // 0d2: aload 2
        // 0d3: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0d6: getfield net/minecraft/client/entity/EntityPlayerSP.field_70142_S D
        // 0d9: aload 2
        // 0da: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0dd: getfield net/minecraft/client/entity/EntityPlayerSP.field_70137_T D
        // 0e0: aload 2
        // 0e1: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0e4: getfield net/minecraft/client/entity/EntityPlayerSP.field_70136_U D
        // 0e7: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 0ea: putfield com/trolmastercard/sexmod/l.a Lnet/minecraft/util/math/Vec3d;
        // 0ed: aload 3
        // 0ee: invokevirtual com/trolmastercard/sexmod/em.Q ()Z
        // 0f1: ifeq 108
        // 0f4: aload 3
        // 0f5: ldc "boyCam"
        // 0f7: invokevirtual com/trolmastercard/sexmod/em.b (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3d;
        // 0fa: aload 3
        // 0fb: invokevirtual com/trolmastercard/sexmod/em.o ()Lnet/minecraft/util/math/Vec3d;
        // 0fe: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 101: goto 130
        // 104: invokestatic com/trolmastercard/sexmod/l.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 107: athrow
        // 108: aload 3
        // 109: ldc "boyCam"
        // 10b: invokevirtual com/trolmastercard/sexmod/em.b (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3d;
        // 10e: new net/minecraft/util/math/Vec3d
        // 111: dup
        // 112: aload 3
        // 113: getfield com/trolmastercard/sexmod/em.field_70142_S D
        // 116: aload 3
        // 117: getfield com/trolmastercard/sexmod/em.field_70137_T D
        // 11a: aload 3
        // 11b: getfield com/trolmastercard/sexmod/em.field_70136_U D
        // 11e: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 121: aload 3
        // 122: invokevirtual com/trolmastercard/sexmod/em.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 125: aload 1
        // 126: getfield net/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent.renderTickTime F
        // 129: f2d
        // 12a: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 12d: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 130: astore 4
        // 132: aload 2
        // 133: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 136: aload 4
        // 138: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 13b: putfield net/minecraft/client/entity/EntityPlayerSP.field_70165_t D
        // 13e: aload 2
        // 13f: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 142: aload 4
        // 144: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 147: aload 2
        // 148: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 14b: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70047_e ()F
        // 14e: f2d
        // 14f: dsub
        // 150: putfield net/minecraft/client/entity/EntityPlayerSP.field_70163_u D
        // 153: aload 2
        // 154: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 157: aload 4
        // 159: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 15c: putfield net/minecraft/client/entity/EntityPlayerSP.field_70161_v D
        // 15f: aload 2
        // 160: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 163: aload 4
        // 165: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 168: putfield net/minecraft/client/entity/EntityPlayerSP.field_70142_S D
        // 16b: aload 2
        // 16c: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 16f: aload 4
        // 171: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 174: aload 2
        // 175: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 178: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70047_e ()F
        // 17b: f2d
        // 17c: dsub
        // 17d: putfield net/minecraft/client/entity/EntityPlayerSP.field_70137_T D
        // 180: aload 2
        // 181: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 184: aload 4
        // 186: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 189: putfield net/minecraft/client/entity/EntityPlayerSP.field_70136_U D
        // 18c: return
        // try (2 -> 6): 6 java/util/ConcurrentModificationException
        // try (8 -> 15): 16 java/util/ConcurrentModificationException
        // try (12 -> 54): 55 java/util/ConcurrentModificationException
        // try (58 -> 63): 63 java/util/ConcurrentModificationException
        // try (72 -> 75): 75 java/util/ConcurrentModificationException
        // try (77 -> 82): 82 java/util/ConcurrentModificationException
        // try (84 -> 88): 88 java/util/ConcurrentModificationException
        // try (90 -> 119): 119 java/util/ConcurrentModificationException
    }

    private static ConcurrentModificationException a(ConcurrentModificationException var0) {
        return var0;
    }
}
