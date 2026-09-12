package com.schnurritv.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.client.event.EntityViewRenderEvent.CameraSetup;
import net.minecraftforge.client.event.RenderPlayerEvent.Pre;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class d {
   public static final float a = 1.2345679F;
   Vec3d e = null;
   Vec3d d = null;
   bg c = null;
   boolean b = false;

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

      bg.h();
      bg var2 = bg.e(var1.getEntityPlayer().getPersistentID());

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
   public static void a(bg param0, EntityPlayer param1, double param2, double param4, double param6, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 003: astore 9
      // 005: aload 1
      // 006: aload 9
      // 008: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 00b: invokevirtual net/minecraft/entity/player/EntityPlayer.func_98034_c (Lnet/minecraft/entity/player/EntityPlayer;)Z
      // 00e: ifeq 016
      // 011: return
      // 012: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 015: athrow
      // 016: aload 9
      // 018: invokevirtual net/minecraft/client/Minecraft.func_175598_ae ()Lnet/minecraft/client/renderer/entity/RenderManager;
      // 01b: astore 10
      // 01d: aload 0
      // 01e: aload 1
      // 01f: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
      // 022: putfield com/schnurritv/sexmod/bg.field_70177_z F
      // 025: aload 0
      // 026: aload 1
      // 027: getfield net/minecraft/entity/player/EntityPlayer.field_70758_at F
      // 02a: putfield com/schnurritv/sexmod/bg.field_70758_at F
      // 02d: aload 0
      // 02e: aload 1
      // 02f: getfield net/minecraft/entity/player/EntityPlayer.field_70759_as F
      // 032: putfield com/schnurritv/sexmod/bg.field_70759_as F
      // 035: aload 0
      // 036: aload 1
      // 037: getfield net/minecraft/entity/player/EntityPlayer.field_70127_C F
      // 03a: putfield com/schnurritv/sexmod/bg.field_70127_C F
      // 03d: aload 0
      // 03e: aload 1
      // 03f: getfield net/minecraft/entity/player/EntityPlayer.field_70125_A F
      // 042: putfield com/schnurritv/sexmod/bg.field_70125_A F
      // 045: aload 0
      // 046: aload 1
      // 047: getfield net/minecraft/entity/player/EntityPlayer.field_70126_B F
      // 04a: putfield com/schnurritv/sexmod/bg.field_70126_B F
      // 04d: aload 0
      // 04e: aload 1
      // 04f: getfield net/minecraft/entity/player/EntityPlayer.field_70169_q D
      // 052: putfield com/schnurritv/sexmod/bg.field_70169_q D
      // 055: aload 0
      // 056: aload 1
      // 057: getfield net/minecraft/entity/player/EntityPlayer.field_70167_r D
      // 05a: putfield com/schnurritv/sexmod/bg.field_70167_r D
      // 05d: aload 0
      // 05e: aload 1
      // 05f: getfield net/minecraft/entity/player/EntityPlayer.field_70166_s D
      // 062: putfield com/schnurritv/sexmod/bg.field_70166_s D
      // 065: aload 0
      // 066: aload 1
      // 067: getfield net/minecraft/entity/player/EntityPlayer.field_70761_aq F
      // 06a: putfield com/schnurritv/sexmod/bg.field_70761_aq F
      // 06d: aload 0
      // 06e: aload 1
      // 06f: getfield net/minecraft/entity/player/EntityPlayer.field_70760_ar F
      // 072: putfield com/schnurritv/sexmod/bg.field_70760_ar F
      // 075: aload 0
      // 076: aload 1
      // 077: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70093_af ()Z
      // 07a: putfield com/schnurritv/sexmod/bg.ab Z
      // 07d: aload 0
      // 07e: aload 1
      // 07f: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70051_ag ()Z
      // 082: putfield com/schnurritv/sexmod/bg.Z Z
      // 085: aload 0
      // 086: aload 1
      // 087: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184218_aH ()Z
      // 08a: putfield com/schnurritv/sexmod/bg.V Z
      // 08d: aload 0
      // 08e: aload 1
      // 08f: getfield net/minecraft/entity/player/EntityPlayer.field_70122_E Z
      // 092: putfield com/schnurritv/sexmod/bg.ac Z
      // 095: aload 0
      // 096: aload 1
      // 097: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184605_cv ()I
      // 09a: ifeq 0a5
      // 09d: bipush 1
      // 09e: goto 0a6
      // 0a1: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a4: athrow
      // 0a5: bipush 0
      // 0a6: putfield com/schnurritv/sexmod/bg.ah Z
      // 0a9: aload 1
      // 0aa: getfield net/minecraft/entity/player/EntityPlayer.field_70142_S D
      // 0ad: aload 1
      // 0ae: getfield net/minecraft/entity/player/EntityPlayer.field_70165_t D
      // 0b1: dsub
      // 0b2: dstore 11
      // 0b4: aload 1
      // 0b5: getfield net/minecraft/entity/player/EntityPlayer.field_70161_v D
      // 0b8: aload 1
      // 0b9: getfield net/minecraft/entity/player/EntityPlayer.field_70136_U D
      // 0bc: dsub
      // 0bd: dstore 13
      // 0bf: ldc2_w 0.017453292519943295
      // 0c2: aload 1
      // 0c3: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
      // 0c6: f2d
      // 0c7: dmul
      // 0c8: dstore 15
      // 0ca: aload 0
      // 0cb: new javax/vecmath/Vector2f
      // 0ce: dup
      // 0cf: dload 11
      // 0d1: dload 15
      // 0d3: invokestatic java/lang/Math.cos (D)D
      // 0d6: dmul
      // 0d7: dload 13
      // 0d9: dload 15
      // 0db: invokestatic java/lang/Math.sin (D)D
      // 0de: dmul
      // 0df: dadd
      // 0e0: d2f
      // 0e1: dload 11
      // 0e3: dload 15
      // 0e5: invokestatic java/lang/Math.sin (D)D
      // 0e8: dmul
      // 0e9: dload 13
      // 0eb: dload 15
      // 0ed: invokestatic java/lang/Math.cos (D)D
      // 0f0: dmul
      // 0f1: dadd
      // 0f2: d2f
      // 0f3: invokespecial javax/vecmath/Vector2f.<init> (FF)V
      // 0f6: putfield com/schnurritv/sexmod/bg.U Ljavax/vecmath/Vector2f;
      // 0f9: fconst_0
      // 0fa: fstore 17
      // 0fc: aload 0
      // 0fd: invokevirtual com/schnurritv/sexmod/bg.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 100: getstatic com/schnurritv/sexmod/bi.z Lnet/minecraft/network/datasync/DataParameter;
      // 103: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 106: checkcast java/lang/Boolean
      // 109: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10c: ifne 1c7
      // 10f: aload 1
      // 110: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184614_ca ()Lnet/minecraft/item/ItemStack;
      // 113: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 116: instanceof net/minecraft/item/ItemBow
      // 119: ifne 137
      // 11c: goto 123
      // 11f: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 122: athrow
      // 123: aload 1
      // 124: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184592_cb ()Lnet/minecraft/item/ItemStack;
      // 127: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 12a: instanceof net/minecraft/item/ItemBow
      // 12d: ifeq 153
      // 130: goto 137
      // 133: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 136: athrow
      // 137: aload 0
      // 138: getfield com/schnurritv/sexmod/bg.ah Z
      // 13b: ifeq 153
      // 13e: goto 145
      // 141: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 144: athrow
      // 145: aload 0
      // 146: getstatic com/schnurritv/sexmod/bj.BOW Lcom/schnurritv/sexmod/bj;
      // 149: invokevirtual com/schnurritv/sexmod/bg.b (Lcom/schnurritv/sexmod/bj;)V
      // 14c: goto 153
      // 14f: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 152: athrow
      // 153: aload 0
      // 154: invokevirtual com/schnurritv/sexmod/bg.D ()Lcom/schnurritv/sexmod/bj;
      // 157: getstatic com/schnurritv/sexmod/bj.BOW Lcom/schnurritv/sexmod/bj;
      // 15a: if_acmpne 179
      // 15d: aload 0
      // 15e: getfield com/schnurritv/sexmod/bg.ah Z
      // 161: ifne 179
      // 164: goto 16b
      // 167: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16a: athrow
      // 16b: aload 0
      // 16c: getstatic com/schnurritv/sexmod/bj.NULL Lcom/schnurritv/sexmod/bj;
      // 16f: invokevirtual com/schnurritv/sexmod/bg.b (Lcom/schnurritv/sexmod/bj;)V
      // 172: goto 179
      // 175: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 178: athrow
      // 179: aload 0
      // 17a: invokevirtual com/schnurritv/sexmod/bg.D ()Lcom/schnurritv/sexmod/bj;
      // 17d: getstatic com/schnurritv/sexmod/bj.BOW Lcom/schnurritv/sexmod/bj;
      // 180: if_acmpne 1a2
      // 183: aload 0
      // 184: aload 0
      // 185: getfield com/schnurritv/sexmod/bg.field_70759_as F
      // 188: putfield com/schnurritv/sexmod/bg.field_70177_z F
      // 18b: aload 0
      // 18c: aload 0
      // 18d: getfield com/schnurritv/sexmod/bg.field_70759_as F
      // 190: putfield com/schnurritv/sexmod/bg.field_70761_aq F
      // 193: aload 0
      // 194: aload 0
      // 195: getfield com/schnurritv/sexmod/bg.field_70758_at F
      // 198: putfield com/schnurritv/sexmod/bg.field_70760_ar F
      // 19b: goto 1a2
      // 19e: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a1: athrow
      // 1a2: aload 0
      // 1a3: getfield com/schnurritv/sexmod/bg.V Z
      // 1a6: ifeq 1c7
      // 1a9: aload 1
      // 1aa: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184187_bx ()Lnet/minecraft/entity/Entity;
      // 1ad: instanceof net/minecraft/entity/item/EntityBoat
      // 1b0: ifeq 1c3
      // 1b3: goto 1ba
      // 1b6: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b9: athrow
      // 1ba: ldc 0.4
      // 1bc: goto 1c5
      // 1bf: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c2: athrow
      // 1c3: ldc 0.2
      // 1c5: fstore 17
      // 1c7: bipush 1
      // 1c8: putstatic com/schnurritv/sexmod/bM.x Z
      // 1cb: aload 10
      // 1cd: aload 0
      // 1ce: dload 2
      // 1cf: dload 4
      // 1d1: fload 17
      // 1d3: f2d
      // 1d4: dadd
      // 1d5: dload 6
      // 1d7: ldc 90.0
      // 1d9: fload 8
      // 1db: bipush 0
      // 1dc: invokevirtual net/minecraft/client/renderer/entity/RenderManager.func_188391_a (Lnet/minecraft/entity/Entity;DDDFFZ)V
      // 1df: return
      // try (2 -> 8): 8 java/lang/RuntimeException
      // try (13 -> 79): 79 java/lang/RuntimeException
      // try (128 -> 140): 141 java/lang/RuntimeException
      // try (135 -> 148): 149 java/lang/RuntimeException
      // try (143 -> 154): 155 java/lang/RuntimeException
      // try (151 -> 160): 161 java/lang/RuntimeException
      // try (163 -> 170): 171 java/lang/RuntimeException
      // try (167 -> 176): 177 java/lang/RuntimeException
      // try (179 -> 195): 196 java/lang/RuntimeException
      // try (198 -> 205): 206 java/lang/RuntimeException
      // try (201 -> 210): 210 java/lang/RuntimeException
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
      // 00c: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 00f: athrow
      // 010: aload 1
      // 011: getfield net/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent.phase Lnet/minecraftforge/fml/common/gameevent/TickEvent$Phase;
      // 014: getstatic net/minecraftforge/fml/common/gameevent/TickEvent$Phase.END Lnet/minecraftforge/fml/common/gameevent/TickEvent$Phase;
      // 017: if_acmpne 080
      // 01a: aload 0
      // 01b: getfield com/schnurritv/sexmod/d.e Lnet/minecraft/util/math/Vec3d;
      // 01e: ifnull 07f
      // 021: goto 028
      // 024: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 027: athrow
      // 028: aload 2
      // 029: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 02c: aload 0
      // 02d: getfield com/schnurritv/sexmod/d.e Lnet/minecraft/util/math/Vec3d;
      // 030: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 033: aload 0
      // 034: getfield com/schnurritv/sexmod/d.e Lnet/minecraft/util/math/Vec3d;
      // 037: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 03a: aload 0
      // 03b: getfield com/schnurritv/sexmod/d.e Lnet/minecraft/util/math/Vec3d;
      // 03e: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 041: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70107_b (DDD)V
      // 044: aload 2
      // 045: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 048: aload 0
      // 049: getfield com/schnurritv/sexmod/d.d Lnet/minecraft/util/math/Vec3d;
      // 04c: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 04f: putfield net/minecraft/client/entity/EntityPlayerSP.field_70142_S D
      // 052: aload 2
      // 053: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 056: aload 0
      // 057: getfield com/schnurritv/sexmod/d.d Lnet/minecraft/util/math/Vec3d;
      // 05a: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 05d: putfield net/minecraft/client/entity/EntityPlayerSP.field_70137_T D
      // 060: aload 2
      // 061: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 064: aload 0
      // 065: getfield com/schnurritv/sexmod/d.d Lnet/minecraft/util/math/Vec3d;
      // 068: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 06b: putfield net/minecraft/client/entity/EntityPlayerSP.field_70136_U D
      // 06e: aload 0
      // 06f: aconst_null
      // 070: putfield com/schnurritv/sexmod/d.e Lnet/minecraft/util/math/Vec3d;
      // 073: aload 0
      // 074: aconst_null
      // 075: putfield com/schnurritv/sexmod/d.d Lnet/minecraft/util/math/Vec3d;
      // 078: goto 07f
      // 07b: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07e: athrow
      // 07f: return
      // 080: aload 2
      // 081: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
      // 084: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
      // 087: ifeq 08f
      // 08a: return
      // 08b: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08e: athrow
      // 08f: aload 2
      // 090: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 093: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 096: invokestatic com/schnurritv/sexmod/bg.e (Ljava/util/UUID;)Lcom/schnurritv/sexmod/bg;
      // 099: astore 3
      // 09a: aload 3
      // 09b: ifnonnull 0a3
      // 09e: return
      // 09f: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a2: athrow
      // 0a3: aload 3
      // 0a4: invokevirtual com/schnurritv/sexmod/bg.j ()Z
      // 0a7: ifne 0af
      // 0aa: return
      // 0ab: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: aload 2
      // 0b1: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 0b4: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 0b7: putfield com/schnurritv/sexmod/d.e Lnet/minecraft/util/math/Vec3d;
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
      // 0d7: putfield com/schnurritv/sexmod/d.d Lnet/minecraft/util/math/Vec3d;
      // 0da: aload 3
      // 0db: ldc "girlCam"
      // 0dd: invokevirtual com/schnurritv/sexmod/bg.d (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3d;
      // 0e0: astore 4
      // 0e2: aload 4
      // 0e4: aload 0
      // 0e5: getfield com/schnurritv/sexmod/d.d Lnet/minecraft/util/math/Vec3d;
      // 0e8: aload 0
      // 0e9: getfield com/schnurritv/sexmod/d.e Lnet/minecraft/util/math/Vec3d;
      // 0ec: aload 1
      // 0ed: getfield net/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent.renderTickTime F
      // 0f0: f2d
      // 0f1: invokestatic com/schnurritv/sexmod/b1.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
      // 0f4: invokevirtual net/minecraft/util/math/Vec3d.func_178787_e (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
      // 0f7: astore 4
      // 0f9: aload 2
      // 0fa: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 0fd: aload 4
      // 0ff: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 102: putfield net/minecraft/client/entity/EntityPlayerSP.field_70165_t D
      // 105: aload 2
      // 106: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 109: aload 4
      // 10b: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 10e: aload 2
      // 10f: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 112: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70047_e ()F
      // 115: f2d
      // 116: dsub
      // 117: putfield net/minecraft/client/entity/EntityPlayerSP.field_70163_u D
      // 11a: aload 2
      // 11b: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 11e: aload 4
      // 120: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 123: putfield net/minecraft/client/entity/EntityPlayerSP.field_70161_v D
      // 126: aload 2
      // 127: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 12a: aload 4
      // 12c: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 12f: putfield net/minecraft/client/entity/EntityPlayerSP.field_70142_S D
      // 132: aload 2
      // 133: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 136: aload 4
      // 138: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 13b: aload 2
      // 13c: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 13f: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70047_e ()F
      // 142: f2d
      // 143: dsub
      // 144: putfield net/minecraft/client/entity/EntityPlayerSP.field_70137_T D
      // 147: aload 2
      // 148: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 14b: aload 4
      // 14d: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 150: putfield net/minecraft/client/entity/EntityPlayerSP.field_70136_U D
      // 153: aload 3
      // 154: invokevirtual com/schnurritv/sexmod/bg.D ()Lcom/schnurritv/sexmod/bj;
      // 157: astore 5
      // 159: aload 3
      // 15a: invokevirtual com/schnurritv/sexmod/bg.d ()Ljava/lang/Float;
      // 15d: invokevirtual java/lang/Float.floatValue ()F
      // 160: fstore 6
      // 162: aload 5
      // 164: getfield com/schnurritv/sexmod/bj.flipGirlYaw Z
      // 167: ifeq 171
      // 16a: fload 6
      // 16c: ldc 180.0
      // 16e: fadd
      // 16f: fstore 6
      // 171: aload 2
      // 172: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 175: getfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
      // 178: aload 5
      // 17a: getfield com/schnurritv/sexmod/bj.maxGirlPitch F
      // 17d: fcmpl
      // 17e: ifle 1a0
      // 181: aload 2
      // 182: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 185: aload 5
      // 187: getfield com/schnurritv/sexmod/bj.maxGirlPitch F
      // 18a: putfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
      // 18d: aload 2
      // 18e: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 191: aload 5
      // 193: getfield com/schnurritv/sexmod/bj.maxGirlPitch F
      // 196: putfield net/minecraft/client/entity/EntityPlayerSP.field_70127_C F
      // 199: goto 1a0
      // 19c: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19f: athrow
      // 1a0: aload 2
      // 1a1: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1a4: getfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
      // 1a7: aload 5
      // 1a9: getfield com/schnurritv/sexmod/bj.minGirlPitch F
      // 1ac: fcmpg
      // 1ad: ifge 1cf
      // 1b0: aload 2
      // 1b1: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1b4: aload 5
      // 1b6: getfield com/schnurritv/sexmod/bj.minGirlPitch F
      // 1b9: putfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
      // 1bc: aload 2
      // 1bd: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1c0: aload 5
      // 1c2: getfield com/schnurritv/sexmod/bj.minGirlPitch F
      // 1c5: putfield net/minecraft/client/entity/EntityPlayerSP.field_70127_C F
      // 1c8: goto 1cf
      // 1cb: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ce: athrow
      // 1cf: aload 2
      // 1d0: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1d3: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 1d6: fload 6
      // 1d8: ldc 90.0
      // 1da: fadd
      // 1db: fcmpl
      // 1dc: ifle 1fe
      // 1df: aload 2
      // 1e0: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1e3: fload 6
      // 1e5: ldc 90.0
      // 1e7: fadd
      // 1e8: putfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 1eb: aload 2
      // 1ec: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 1ef: fload 6
      // 1f1: ldc 90.0
      // 1f3: fadd
      // 1f4: putfield net/minecraft/client/entity/EntityPlayerSP.field_70126_B F
      // 1f7: goto 1fe
      // 1fa: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1fd: athrow
      // 1fe: aload 2
      // 1ff: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 202: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 205: fload 6
      // 207: ldc 90.0
      // 209: fsub
      // 20a: fcmpg
      // 20b: ifge 22d
      // 20e: aload 2
      // 20f: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 212: fload 6
      // 214: ldc 90.0
      // 216: fsub
      // 217: putfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
      // 21a: aload 2
      // 21b: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 21e: fload 6
      // 220: ldc 90.0
      // 222: fsub
      // 223: putfield net/minecraft/client/entity/EntityPlayerSP.field_70126_B F
      // 226: goto 22d
      // 229: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22c: athrow
      // 22d: return
      // try (2 -> 6): 6 java/lang/RuntimeException
      // try (8 -> 15): 16 java/lang/RuntimeException
      // try (12 -> 54): 55 java/lang/RuntimeException
      // try (58 -> 63): 63 java/lang/RuntimeException
      // try (70 -> 73): 73 java/lang/RuntimeException
      // try (75 -> 79): 79 java/lang/RuntimeException
      // try (169 -> 186): 187 java/lang/RuntimeException
      // try (189 -> 206): 207 java/lang/RuntimeException
      // try (209 -> 229): 230 java/lang/RuntimeException
      // try (232 -> 252): 253 java/lang/RuntimeException
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

      bg var3 = bg.e(var2.field_71439_g.getPersistentID());

      try {
         if (var3 == null) {
            return;
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      try {
         if (!var3.n()) {
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      try {
         if (!var3.j()) {
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
         if (this.e == null) {
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

      bg var3 = bg.e(var2.field_71439_g.getPersistentID());

      try {
         if (var3 == null) {
            return;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      Vec3d var4 = var2.field_71439_g.func_174791_d();
      Vec3d var5 = b1.a(this.d, this.e, var1.getPartialTicks());
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
      // 0c: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent.phase Lnet/minecraftforge/fml/common/gameevent/TickEvent$Phase;
      // 14: getstatic net/minecraftforge/fml/common/gameevent/TickEvent$Phase.END Lnet/minecraftforge/fml/common/gameevent/TickEvent$Phase;
      // 17: if_acmpne 1f
      // 1a: return
      // 1b: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: aload 2
      // 20: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 23: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 26: invokestatic com/schnurritv/sexmod/bg.e (Ljava/util/UUID;)Lcom/schnurritv/sexmod/bg;
      // 29: astore 3
      // 2a: aload 3
      // 2b: ifnonnull 57
      // 2e: aload 0
      // 2f: getfield com/schnurritv/sexmod/d.b Z
      // 32: ifeq 56
      // 35: goto 3c
      // 38: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3b: athrow
      // 3c: aload 0
      // 3d: bipush 0
      // 3e: putfield com/schnurritv/sexmod/d.b Z
      // 41: aload 2
      // 42: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 45: aload 2
      // 46: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 49: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getDefaultEyeHeight ()F
      // 4c: putfield net/minecraft/client/entity/EntityPlayerSP.eyeHeight F
      // 4f: goto 56
      // 52: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: return
      // 57: aload 3
      // 58: invokevirtual com/schnurritv/sexmod/bg.j ()Z
      // 5b: ifeq 87
      // 5e: aload 0
      // 5f: getfield com/schnurritv/sexmod/d.b Z
      // 62: ifeq 86
      // 65: goto 6c
      // 68: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6b: athrow
      // 6c: aload 0
      // 6d: bipush 0
      // 6e: putfield com/schnurritv/sexmod/d.b Z
      // 71: aload 2
      // 72: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 75: aload 2
      // 76: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 79: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getDefaultEyeHeight ()F
      // 7c: putfield net/minecraft/client/entity/EntityPlayerSP.eyeHeight F
      // 7f: goto 86
      // 82: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 85: athrow
      // 86: return
      // 87: aload 0
      // 88: getfield com/schnurritv/sexmod/d.c Lcom/schnurritv/sexmod/bg;
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
      // 9d: invokestatic com/schnurritv/sexmod/d.a (Lcom/schnurritv/sexmod/bg;Lnet/minecraft/entity/player/EntityPlayer;DDDF)V
      // a0: aload 0
      // a1: aload 3
      // a2: putfield com/schnurritv/sexmod/d.c Lcom/schnurritv/sexmod/bg;
      // a5: goto ac
      // a8: invokestatic com/schnurritv/sexmod/d.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ab: athrow
      // ac: aload 2
      // ad: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // b0: aload 3
      // b1: invokevirtual com/schnurritv/sexmod/bg.H ()F
      // b4: putfield net/minecraft/client/entity/EntityPlayerSP.eyeHeight F
      // b7: aload 0
      // b8: bipush 1
      // b9: putfield com/schnurritv/sexmod/d.b Z
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
