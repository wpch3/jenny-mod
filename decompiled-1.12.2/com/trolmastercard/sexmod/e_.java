package com.trolmastercard.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.client.event.EntityViewRenderEvent.CameraSetup;
import net.minecraftforge.client.event.RenderPlayerEvent.Pre;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class e_ {
    public static final float c = 1.2345679F;
    Vec3d b = null;
    Vec3d d = null;
    ei a = null;
    boolean e = false;

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(Pre var1) {
        try {
            if (var1.getPartialRenderTick() == 1.2345679F) {
                return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        ei.C();
        ei var2 = ei.d(var1.getEntityPlayer().getPersistentID());

        try {
            if (var2 == null) {
                return;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        var1.setCanceled(true);
        a(var2, var1.getEntityPlayer(), var1.getX(), var1.getY(), var1.getZ(), var1.getPartialRenderTick());
    }

    @SideOnly(Side.CLIENT)
    public static void a(ei param0, EntityPlayer param1, double param2, double param4, double param6, float param8) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 003: astore 9
        // 005: aload 0
        // 006: aload 1
        // 007: invokevirtual com/trolmastercard/sexmod/ei.c (Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/entity/player/EntityPlayer;
        // 00a: astore 1
        // 00b: aload 1
        // 00c: aload 9
        // 00e: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 011: invokevirtual net/minecraft/entity/player/EntityPlayer.func_98034_c (Lnet/minecraft/entity/player/EntityPlayer;)Z
        // 014: ifeq 02a
        // 017: aload 0
        // 018: invokevirtual com/trolmastercard/sexmod/ei.E ()Z
        // 01b: ifne 02a
        // 01e: goto 025
        // 021: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 024: athrow
        // 025: return
        // 026: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 029: athrow
        // 02a: aload 9
        // 02c: invokevirtual net/minecraft/client/Minecraft.func_175598_ae ()Lnet/minecraft/client/renderer/entity/RenderManager;
        // 02f: astore 10
        // 031: aload 0
        // 032: aload 1
        // 033: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
        // 036: putfield com/trolmastercard/sexmod/ei.field_70177_z F
        // 039: aload 0
        // 03a: aload 1
        // 03b: getfield net/minecraft/entity/player/EntityPlayer.field_70758_at F
        // 03e: putfield com/trolmastercard/sexmod/ei.field_70758_at F
        // 041: aload 0
        // 042: aload 1
        // 043: getfield net/minecraft/entity/player/EntityPlayer.field_70759_as F
        // 046: putfield com/trolmastercard/sexmod/ei.field_70759_as F
        // 049: aload 0
        // 04a: aload 1
        // 04b: getfield net/minecraft/entity/player/EntityPlayer.field_70127_C F
        // 04e: putfield com/trolmastercard/sexmod/ei.field_70127_C F
        // 051: aload 0
        // 052: aload 1
        // 053: getfield net/minecraft/entity/player/EntityPlayer.field_70125_A F
        // 056: putfield com/trolmastercard/sexmod/ei.field_70125_A F
        // 059: aload 0
        // 05a: aload 1
        // 05b: getfield net/minecraft/entity/player/EntityPlayer.field_70126_B F
        // 05e: putfield com/trolmastercard/sexmod/ei.field_70126_B F
        // 061: aload 0
        // 062: aload 1
        // 063: getfield net/minecraft/entity/player/EntityPlayer.field_70169_q D
        // 066: putfield com/trolmastercard/sexmod/ei.field_70169_q D
        // 069: aload 0
        // 06a: aload 1
        // 06b: getfield net/minecraft/entity/player/EntityPlayer.field_70167_r D
        // 06e: putfield com/trolmastercard/sexmod/ei.field_70167_r D
        // 071: aload 0
        // 072: aload 1
        // 073: getfield net/minecraft/entity/player/EntityPlayer.field_70166_s D
        // 076: putfield com/trolmastercard/sexmod/ei.field_70166_s D
        // 079: aload 0
        // 07a: aload 1
        // 07b: getfield net/minecraft/entity/player/EntityPlayer.field_70142_S D
        // 07e: putfield com/trolmastercard/sexmod/ei.field_70142_S D
        // 081: aload 0
        // 082: aload 1
        // 083: getfield net/minecraft/entity/player/EntityPlayer.field_70137_T D
        // 086: putfield com/trolmastercard/sexmod/ei.field_70137_T D
        // 089: aload 0
        // 08a: aload 1
        // 08b: getfield net/minecraft/entity/player/EntityPlayer.field_70136_U D
        // 08e: putfield com/trolmastercard/sexmod/ei.field_70136_U D
        // 091: aload 0
        // 092: aload 1
        // 093: getfield net/minecraft/entity/player/EntityPlayer.field_70761_aq F
        // 096: putfield com/trolmastercard/sexmod/ei.field_70761_aq F
        // 099: aload 0
        // 09a: aload 1
        // 09b: getfield net/minecraft/entity/player/EntityPlayer.field_70760_ar F
        // 09e: putfield com/trolmastercard/sexmod/ei.field_70760_ar F
        // 0a1: aload 0
        // 0a2: aload 1
        // 0a3: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70093_af ()Z
        // 0a6: putfield com/trolmastercard/sexmod/ei.ad Z
        // 0a9: aload 0
        // 0aa: aload 1
        // 0ab: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70051_ag ()Z
        // 0ae: putfield com/trolmastercard/sexmod/ei.aj Z
        // 0b1: aload 0
        // 0b2: aload 1
        // 0b3: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184218_aH ()Z
        // 0b6: putfield com/trolmastercard/sexmod/ei.ak Z
        // 0b9: aload 0
        // 0ba: aload 1
        // 0bb: getfield net/minecraft/entity/player/EntityPlayer.field_70122_E Z
        // 0be: putfield com/trolmastercard/sexmod/ei.af Z
        // 0c1: aload 0
        // 0c2: aload 1
        // 0c3: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184605_cv ()I
        // 0c6: ifeq 0d1
        // 0c9: bipush 1
        // 0ca: goto 0d2
        // 0cd: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0d0: athrow
        // 0d1: bipush 0
        // 0d2: putfield com/trolmastercard/sexmod/ei.ah Z
        // 0d5: aload 1
        // 0d6: getfield net/minecraft/entity/player/EntityPlayer.field_70142_S D
        // 0d9: aload 1
        // 0da: getfield net/minecraft/entity/player/EntityPlayer.field_70165_t D
        // 0dd: dsub
        // 0de: dstore 11
        // 0e0: aload 1
        // 0e1: getfield net/minecraft/entity/player/EntityPlayer.field_70161_v D
        // 0e4: aload 1
        // 0e5: getfield net/minecraft/entity/player/EntityPlayer.field_70136_U D
        // 0e8: dsub
        // 0e9: dstore 13
        // 0eb: ldc2_w 0.017453292519943295
        // 0ee: aload 1
        // 0ef: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
        // 0f2: f2d
        // 0f3: dmul
        // 0f4: dstore 15
        // 0f6: aload 0
        // 0f7: new javax/vecmath/Vector2f
        // 0fa: dup
        // 0fb: dload 11
        // 0fd: dload 15
        // 0ff: invokestatic java/lang/Math.cos (D)D
        // 102: dmul
        // 103: dload 13
        // 105: dload 15
        // 107: invokestatic java/lang/Math.sin (D)D
        // 10a: dmul
        // 10b: dadd
        // 10c: d2f
        // 10d: dload 11
        // 10f: dload 15
        // 111: invokestatic java/lang/Math.sin (D)D
        // 114: dmul
        // 115: dload 13
        // 117: dload 15
        // 119: invokestatic java/lang/Math.cos (D)D
        // 11c: dmul
        // 11d: dadd
        // 11e: d2f
        // 11f: invokespecial javax/vecmath/Vector2f.<init> (FF)V
        // 122: putfield com/trolmastercard/sexmod/ei.ao Ljavax/vecmath/Vector2f;
        // 125: aload 0
        // 126: invokevirtual com/trolmastercard/sexmod/ei.z ()Z
        // 129: ifeq 138
        // 12c: aload 0
        // 12d: aload 1
        // 12e: invokestatic com/trolmastercard/sexmod/e_.a (Lcom/trolmastercard/sexmod/ei;Lnet/minecraft/entity/player/EntityPlayer;)F
        // 131: goto 139
        // 134: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 137: athrow
        // 138: fconst_0
        // 139: fstore 17
        // 13b: bipush 1
        // 13c: putstatic com/trolmastercard/sexmod/dm.v Z
        // 13f: aload 10
        // 141: aload 0
        // 142: dload 2
        // 143: dload 4
        // 145: fload 17
        // 147: f2d
        // 148: dadd
        // 149: dload 6
        // 14b: ldc 90.0
        // 14d: fload 8
        // 14f: bipush 0
        // 150: invokevirtual net/minecraft/client/renderer/entity/RenderManager.func_188391_a (Lnet/minecraft/entity/Entity;DDDFFZ)V
        // 153: return
        // try (6 -> 14): 15 java/lang/RuntimeException
        // try (11 -> 18): 18 java/lang/RuntimeException
        // try (23 -> 101): 101 java/lang/RuntimeException
        // try (123 -> 155): 155 java/lang/RuntimeException
    }

    static float a(ei param0, EntityPlayer param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/ei.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 04: getstatic com/trolmastercard/sexmod/em.G Lnet/minecraft/network/datasync/DataParameter;
        // 07: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 0a: checkcast java/lang/Boolean
        // 0d: invokevirtual java/lang/Boolean.booleanValue ()Z
        // 10: ifeq 19
        // 13: fconst_0
        // 14: freturn
        // 15: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 18: athrow
        // 19: aload 1
        // 1a: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184614_ca ()Lnet/minecraft/item/ItemStack;
        // 1d: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 20: instanceof net/minecraft/item/ItemBow
        // 23: ifne 3a
        // 26: aload 1
        // 27: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184592_cb ()Lnet/minecraft/item/ItemStack;
        // 2a: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 2d: instanceof net/minecraft/item/ItemBow
        // 30: ifeq 56
        // 33: goto 3a
        // 36: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 39: athrow
        // 3a: aload 0
        // 3b: getfield com/trolmastercard/sexmod/ei.ah Z
        // 3e: ifeq 56
        // 41: goto 48
        // 44: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 47: athrow
        // 48: aload 0
        // 49: getstatic com/trolmastercard/sexmod/fp.BOW Lcom/trolmastercard/sexmod/fp;
        // 4c: invokevirtual com/trolmastercard/sexmod/ei.b (Lcom/trolmastercard/sexmod/fp;)V
        // 4f: goto 56
        // 52: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 55: athrow
        // 56: aload 0
        // 57: invokevirtual com/trolmastercard/sexmod/ei.y ()Lcom/trolmastercard/sexmod/fp;
        // 5a: getstatic com/trolmastercard/sexmod/fp.BOW Lcom/trolmastercard/sexmod/fp;
        // 5d: if_acmpne 7c
        // 60: aload 0
        // 61: getfield com/trolmastercard/sexmod/ei.ah Z
        // 64: ifne 7c
        // 67: goto 6e
        // 6a: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 6d: athrow
        // 6e: aload 0
        // 6f: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 72: invokevirtual com/trolmastercard/sexmod/ei.b (Lcom/trolmastercard/sexmod/fp;)V
        // 75: goto 7c
        // 78: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 7b: athrow
        // 7c: aload 0
        // 7d: invokevirtual com/trolmastercard/sexmod/ei.y ()Lcom/trolmastercard/sexmod/fp;
        // 80: getstatic com/trolmastercard/sexmod/fp.BOW Lcom/trolmastercard/sexmod/fp;
        // 83: if_acmpne a5
        // 86: aload 0
        // 87: aload 0
        // 88: getfield com/trolmastercard/sexmod/ei.field_70759_as F
        // 8b: putfield com/trolmastercard/sexmod/ei.field_70177_z F
        // 8e: aload 0
        // 8f: aload 0
        // 90: getfield com/trolmastercard/sexmod/ei.field_70759_as F
        // 93: putfield com/trolmastercard/sexmod/ei.field_70761_aq F
        // 96: aload 0
        // 97: aload 0
        // 98: getfield com/trolmastercard/sexmod/ei.field_70758_at F
        // 9b: putfield com/trolmastercard/sexmod/ei.field_70760_ar F
        // 9e: goto a5
        // a1: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // a4: athrow
        // a5: aload 0
        // a6: getfield com/trolmastercard/sexmod/ei.ak Z
        // a9: ifeq c9
        // ac: aload 1
        // ad: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184187_bx ()Lnet/minecraft/entity/Entity;
        // b0: instanceof net/minecraft/entity/item/EntityBoat
        // b3: ifeq c6
        // b6: goto bd
        // b9: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // bc: athrow
        // bd: ldc 0.4
        // bf: goto c8
        // c2: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // c5: athrow
        // c6: ldc 0.2
        // c8: freturn
        // c9: fconst_0
        // ca: freturn
        // try (0 -> 9): 9 java/lang/RuntimeException
        // try (11 -> 21): 22 java/lang/RuntimeException
        // try (16 -> 27): 28 java/lang/RuntimeException
        // try (24 -> 33): 34 java/lang/RuntimeException
        // try (36 -> 43): 44 java/lang/RuntimeException
        // try (40 -> 49): 50 java/lang/RuntimeException
        // try (52 -> 68): 69 java/lang/RuntimeException
        // try (71 -> 78): 79 java/lang/RuntimeException
        // try (74 -> 83): 83 java/lang/RuntimeException
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
        // 00c: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 00f: athrow
        // 010: aload 1
        // 011: getfield net/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent.phase Lnet/minecraftforge/fml/common/gameevent/TickEvent$Phase;
        // 014: getstatic net/minecraftforge/fml/common/gameevent/TickEvent$Phase.END Lnet/minecraftforge/fml/common/gameevent/TickEvent$Phase;
        // 017: if_acmpne 080
        // 01a: aload 0
        // 01b: getfield com/trolmastercard/sexmod/e_.b Lnet/minecraft/util/math/Vec3d;
        // 01e: ifnull 07f
        // 021: goto 028
        // 024: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 027: athrow
        // 028: aload 2
        // 029: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 02c: aload 0
        // 02d: getfield com/trolmastercard/sexmod/e_.b Lnet/minecraft/util/math/Vec3d;
        // 030: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 033: aload 0
        // 034: getfield com/trolmastercard/sexmod/e_.b Lnet/minecraft/util/math/Vec3d;
        // 037: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 03a: aload 0
        // 03b: getfield com/trolmastercard/sexmod/e_.b Lnet/minecraft/util/math/Vec3d;
        // 03e: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 041: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70107_b (DDD)V
        // 044: aload 2
        // 045: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 048: aload 0
        // 049: getfield com/trolmastercard/sexmod/e_.d Lnet/minecraft/util/math/Vec3d;
        // 04c: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 04f: putfield net/minecraft/client/entity/EntityPlayerSP.field_70142_S D
        // 052: aload 2
        // 053: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 056: aload 0
        // 057: getfield com/trolmastercard/sexmod/e_.d Lnet/minecraft/util/math/Vec3d;
        // 05a: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 05d: putfield net/minecraft/client/entity/EntityPlayerSP.field_70137_T D
        // 060: aload 2
        // 061: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 064: aload 0
        // 065: getfield com/trolmastercard/sexmod/e_.d Lnet/minecraft/util/math/Vec3d;
        // 068: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 06b: putfield net/minecraft/client/entity/EntityPlayerSP.field_70136_U D
        // 06e: aload 0
        // 06f: aconst_null
        // 070: putfield com/trolmastercard/sexmod/e_.b Lnet/minecraft/util/math/Vec3d;
        // 073: aload 0
        // 074: aconst_null
        // 075: putfield com/trolmastercard/sexmod/e_.d Lnet/minecraft/util/math/Vec3d;
        // 078: goto 07f
        // 07b: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 07e: athrow
        // 07f: return
        // 080: aload 2
        // 081: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 084: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 087: ifeq 08f
        // 08a: return
        // 08b: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 08e: athrow
        // 08f: aload 2
        // 090: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 093: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 096: invokestatic com/trolmastercard/sexmod/ei.d (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/ei;
        // 099: astore 3
        // 09a: aload 3
        // 09b: ifnonnull 0a3
        // 09e: return
        // 09f: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a2: athrow
        // 0a3: aload 3
        // 0a4: invokevirtual com/trolmastercard/sexmod/ei.o ()Z
        // 0a7: ifne 0af
        // 0aa: return
        // 0ab: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ae: athrow
        // 0af: aload 0
        // 0b0: aload 2
        // 0b1: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0b4: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 0b7: putfield com/trolmastercard/sexmod/e_.b Lnet/minecraft/util/math/Vec3d;
        // 0ba: aload 0
        // 0bb: new net/minecraft/util/math/Vec3d
        // 0be: dup
        // 0bf: aload 2
        // 0c0: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0c3: getfield net/minecraft/client/entity/EntityPlayerSP.field_70142_S D
        // 0c6: aload 2
        // 0c7: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0ca: getfield net/minecraft/client/entity/EntityPlayerSP.field_70137_T D
        // 0cd: aload 2
        // 0ce: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0d1: getfield net/minecraft/client/entity/EntityPlayerSP.field_70136_U D
        // 0d4: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 0d7: putfield com/trolmastercard/sexmod/e_.d Lnet/minecraft/util/math/Vec3d;
        // 0da: aload 3
        // 0db: ldc "girlCam"
        // 0dd: invokevirtual com/trolmastercard/sexmod/ei.b (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3d;
        // 0e0: astore 4
        // 0e2: aload 3
        // 0e3: aload 4
        // 0e5: aload 1
        // 0e6: getfield net/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent.renderTickTime F
        // 0e9: invokevirtual com/trolmastercard/sexmod/ei.b (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 0ec: astore 4
        // 0ee: aload 4
        // 0f0: aload 0
        // 0f1: getfield com/trolmastercard/sexmod/e_.d Lnet/minecraft/util/math/Vec3d;
        // 0f4: aload 0
        // 0f5: getfield com/trolmastercard/sexmod/e_.b Lnet/minecraft/util/math/Vec3d;
        // 0f8: aload 1
        // 0f9: getfield net/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent.renderTickTime F
        // 0fc: f2d
        // 0fd: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 100: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 103: astore 4
        // 105: aload 2
        // 106: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 109: aload 4
        // 10b: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 10e: putfield net/minecraft/client/entity/EntityPlayerSP.field_70165_t D
        // 111: aload 2
        // 112: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 115: aload 4
        // 117: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 11a: aload 2
        // 11b: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 11e: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70047_e ()F
        // 121: f2d
        // 122: dsub
        // 123: putfield net/minecraft/client/entity/EntityPlayerSP.field_70163_u D
        // 126: aload 2
        // 127: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 12a: aload 4
        // 12c: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 12f: putfield net/minecraft/client/entity/EntityPlayerSP.field_70161_v D
        // 132: aload 2
        // 133: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 136: aload 4
        // 138: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 13b: putfield net/minecraft/client/entity/EntityPlayerSP.field_70142_S D
        // 13e: aload 2
        // 13f: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 142: aload 4
        // 144: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 147: aload 2
        // 148: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 14b: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70047_e ()F
        // 14e: f2d
        // 14f: dsub
        // 150: putfield net/minecraft/client/entity/EntityPlayerSP.field_70137_T D
        // 153: aload 2
        // 154: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 157: aload 4
        // 159: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 15c: putfield net/minecraft/client/entity/EntityPlayerSP.field_70136_U D
        // 15f: aload 3
        // 160: invokevirtual com/trolmastercard/sexmod/ei.y ()Lcom/trolmastercard/sexmod/fp;
        // 163: astore 5
        // 165: aload 3
        // 166: invokevirtual com/trolmastercard/sexmod/ei.I ()Ljava/lang/Float;
        // 169: invokevirtual java/lang/Float.floatValue ()F
        // 16c: fstore 6
        // 16e: aload 3
        // 16f: aload 5
        // 171: aload 2
        // 172: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 175: invokevirtual com/trolmastercard/sexmod/ei.a (Lcom/trolmastercard/sexmod/fp;Lnet/minecraft/entity/player/EntityPlayer;)Z
        // 178: ifeq 180
        // 17b: return
        // 17c: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 17f: athrow
        // 180: aload 5
        // 182: getfield com/trolmastercard/sexmod/fp.flipGirlYaw Z
        // 185: ifeq 18f
        // 188: fload 6
        // 18a: ldc 180.0
        // 18c: fadd
        // 18d: fstore 6
        // 18f: aload 2
        // 190: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 193: getfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
        // 196: aload 5
        // 198: getfield com/trolmastercard/sexmod/fp.maxGirlPitch F
        // 19b: fcmpl
        // 19c: ifle 1be
        // 19f: aload 2
        // 1a0: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1a3: aload 5
        // 1a5: getfield com/trolmastercard/sexmod/fp.maxGirlPitch F
        // 1a8: putfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
        // 1ab: aload 2
        // 1ac: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1af: aload 5
        // 1b1: getfield com/trolmastercard/sexmod/fp.maxGirlPitch F
        // 1b4: putfield net/minecraft/client/entity/EntityPlayerSP.field_70127_C F
        // 1b7: goto 1be
        // 1ba: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1bd: athrow
        // 1be: aload 2
        // 1bf: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1c2: getfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
        // 1c5: aload 5
        // 1c7: getfield com/trolmastercard/sexmod/fp.minGirlPitch F
        // 1ca: fcmpg
        // 1cb: ifge 1ed
        // 1ce: aload 2
        // 1cf: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1d2: aload 5
        // 1d4: getfield com/trolmastercard/sexmod/fp.minGirlPitch F
        // 1d7: putfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
        // 1da: aload 2
        // 1db: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1de: aload 5
        // 1e0: getfield com/trolmastercard/sexmod/fp.minGirlPitch F
        // 1e3: putfield net/minecraft/client/entity/EntityPlayerSP.field_70127_C F
        // 1e6: goto 1ed
        // 1e9: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1ec: athrow
        // 1ed: aload 2
        // 1ee: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1f1: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 1f4: fload 6
        // 1f6: ldc 90.0
        // 1f8: fadd
        // 1f9: fcmpl
        // 1fa: ifle 21c
        // 1fd: aload 2
        // 1fe: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 201: fload 6
        // 203: ldc 90.0
        // 205: fadd
        // 206: putfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 209: aload 2
        // 20a: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 20d: fload 6
        // 20f: ldc 90.0
        // 211: fadd
        // 212: putfield net/minecraft/client/entity/EntityPlayerSP.field_70126_B F
        // 215: goto 21c
        // 218: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 21b: athrow
        // 21c: aload 2
        // 21d: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 220: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 223: fload 6
        // 225: ldc 90.0
        // 227: fsub
        // 228: fcmpg
        // 229: ifge 24b
        // 22c: aload 2
        // 22d: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 230: fload 6
        // 232: ldc 90.0
        // 234: fsub
        // 235: putfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 238: aload 2
        // 239: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 23c: fload 6
        // 23e: ldc 90.0
        // 240: fsub
        // 241: putfield net/minecraft/client/entity/EntityPlayerSP.field_70126_B F
        // 244: goto 24b
        // 247: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 24a: athrow
        // 24b: return
        // try (2 -> 6): 6 java/lang/RuntimeException
        // try (8 -> 15): 16 java/lang/RuntimeException
        // try (12 -> 54): 55 java/lang/RuntimeException
        // try (58 -> 63): 63 java/lang/RuntimeException
        // try (70 -> 73): 73 java/lang/RuntimeException
        // try (75 -> 79): 79 java/lang/RuntimeException
        // try (168 -> 175): 175 java/lang/RuntimeException
        // try (184 -> 201): 202 java/lang/RuntimeException
        // try (204 -> 221): 222 java/lang/RuntimeException
        // try (224 -> 244): 245 java/lang/RuntimeException
        // try (247 -> 267): 268 java/lang/RuntimeException
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(CameraSetup var1) {
        Minecraft var2 = Minecraft.func_71410_x();

        try {
            if (var2.field_71439_g == null) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        ei var3 = ei.d(var2.field_71439_g.getPersistentID());

        try {
            if (var3 == null) {
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        try {
            if (!var3.F()) {
                return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        try {
            if (!var3.Q()) {
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        var1.setRoll(180.0F);
        var1.setPitch(-var1.getPitch());
        var1.setYaw(-var1.getYaw());
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(RenderWorldLastEvent var1) {
        Minecraft var2 = Minecraft.func_71410_x();

        try {
            if (this.b == null) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (var2.field_71474_y.field_74320_O != 0) {
                return;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        ei var3 = ei.d(var2.field_71439_g.getPersistentID());

        try {
            if (var3 == null) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        Vec3d var4 = var2.field_71439_g.func_174791_d();
        Vec3d var5 = b6.a(this.d, this.b, var1.getPartialTicks());
        Vec3d var6 = var5.func_178788_d(var4);
        a(var3, var2.field_71439_g, var6.field_72450_a, var6.field_72448_b, var6.field_72449_c, var1.getPartialTicks());
        GlStateManager.func_179145_e();
        GlStateManager.func_179126_j();
        GlStateManager.func_179141_d();
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void b(RenderTickEvent param1) {
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
        // 08: ifnonnull 10
        // 0b: return
        // 0c: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0f: athrow
        // 10: aload 1
        // 11: getfield net/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent.phase Lnet/minecraftforge/fml/common/gameevent/TickEvent$Phase;
        // 14: getstatic net/minecraftforge/fml/common/gameevent/TickEvent$Phase.END Lnet/minecraftforge/fml/common/gameevent/TickEvent$Phase;
        // 17: if_acmpne 1f
        // 1a: return
        // 1b: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1e: athrow
        // 1f: aload 2
        // 20: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 23: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 26: invokestatic com/trolmastercard/sexmod/ei.d (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/ei;
        // 29: astore 3
        // 2a: aload 3
        // 2b: ifnonnull 57
        // 2e: aload 0
        // 2f: getfield com/trolmastercard/sexmod/e_.e Z
        // 32: ifeq 56
        // 35: goto 3c
        // 38: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3b: athrow
        // 3c: aload 0
        // 3d: bipush 0
        // 3e: putfield com/trolmastercard/sexmod/e_.e Z
        // 41: aload 2
        // 42: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 45: aload 2
        // 46: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 49: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getDefaultEyeHeight ()F
        // 4c: putfield net/minecraft/client/entity/EntityPlayerSP.eyeHeight F
        // 4f: goto 56
        // 52: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 55: athrow
        // 56: return
        // 57: aload 3
        // 58: invokevirtual com/trolmastercard/sexmod/ei.Q ()Z
        // 5b: ifeq 87
        // 5e: aload 0
        // 5f: getfield com/trolmastercard/sexmod/e_.e Z
        // 62: ifeq 86
        // 65: goto 6c
        // 68: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 6b: athrow
        // 6c: aload 0
        // 6d: bipush 0
        // 6e: putfield com/trolmastercard/sexmod/e_.e Z
        // 71: aload 2
        // 72: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 75: aload 2
        // 76: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 79: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getDefaultEyeHeight ()F
        // 7c: putfield net/minecraft/client/entity/EntityPlayerSP.eyeHeight F
        // 7f: goto 86
        // 82: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 85: athrow
        // 86: return
        // 87: aload 0
        // 88: getfield com/trolmastercard/sexmod/e_.a Lcom/trolmastercard/sexmod/ei;
        // 8b: aload 3
        // 8c: if_acmpeq ac
        // 8f: aload 3
        // 90: aload 2
        // 91: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 94: dconst_0
        // 95: ldc2_w 500.0
        // 98: dconst_0
        // 99: aload 1
        // 9a: getfield net/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent.renderTickTime F
        // 9d: invokestatic com/trolmastercard/sexmod/e_.a (Lcom/trolmastercard/sexmod/ei;Lnet/minecraft/entity/player/EntityPlayer;DDDF)V
        // a0: aload 0
        // a1: aload 3
        // a2: putfield com/trolmastercard/sexmod/e_.a Lcom/trolmastercard/sexmod/ei;
        // a5: goto ac
        // a8: invokestatic com/trolmastercard/sexmod/e_.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // ab: athrow
        // ac: aload 2
        // ad: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // b0: aload 3
        // b1: invokevirtual com/trolmastercard/sexmod/ei.R ()F
        // b4: putfield net/minecraft/client/entity/EntityPlayerSP.eyeHeight F
        // b7: aload 0
        // b8: bipush 1
        // b9: putfield com/trolmastercard/sexmod/e_.e Z
        // bc: return
        // try (2 -> 6): 6 java/lang/RuntimeException
        // try (8 -> 13): 13 java/lang/RuntimeException
        // try (20 -> 25): 26 java/lang/RuntimeException
        // try (22 -> 37): 38 java/lang/RuntimeException
        // try (41 -> 47): 48 java/lang/RuntimeException
        // try (44 -> 59): 60 java/lang/RuntimeException
        // try (63 -> 79): 80 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
