package com.schnurritv.sexmod;

import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayer.SleepResult;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.client.event.GuiScreenEvent.ActionPerformedEvent;
import net.minecraftforge.client.event.GuiScreenEvent.InitGuiEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.world.GetCollisionBoxesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Z {
   static final int a = 284453;

   @SubscribeEvent
   public void a(PlayerSleepInBedEvent var1) {
      EntityPlayer var2 = var1.getEntityPlayer();
      bg var3 = bg.c(var2);

      try {
         if (var3 == null) {
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      try {
         if (!var2.func_70093_af()) {
            return;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      var1.setResult(SleepResult.OTHER_PROBLEM);
   }

   @SubscribeEvent
   public void a(GetCollisionBoxesEvent var1) {
   }

   @SubscribeEvent
   public void a(RightClickBlock var1) {
      bg var2 = bg.e(var1.getEntityPlayer().getPersistentID());
      BlockPos var3 = var1.getPos();
      World var4 = var1.getEntityPlayer().field_70170_p;
      EntityPlayer var5 = var1.getEntityPlayer();

      try {
         if (var2 == null) {
            return;
         }
      } catch (RuntimeException var29) {
         throw a(var29);
      }

      try {
         if (!var2.i()) {
            return;
         }
      } catch (RuntimeException var21) {
         throw a(var21);
      }

      try {
         if (!b1.a(var4, var3, var1.getHitVec(), var1.getFace(), var5)) {
            return;
         }
      } catch (RuntimeException var28) {
         throw a(var28);
      }

      try {
         if ((Boolean)var2.func_184212_Q().func_187225_a(bi.z)) {
            var1.setCanceled(true);
            return;
         }
      } catch (RuntimeException var20) {
         throw a(var20);
      }

      try {
         if (!var5.func_70093_af()) {
            return;
         }
      } catch (RuntimeException var27) {
         throw a(var27);
      }

      ArrayList var6 = new ArrayList();

      try {
         if (var4.func_180495_p(var3.func_177978_c()).func_177230_c() == Blocks.field_150350_a) {
            var6.add(var3.func_177978_c());
         }
      } catch (RuntimeException var19) {
         throw a(var19);
      }

      try {
         if (var4.func_180495_p(var3.func_177974_f()).func_177230_c() == Blocks.field_150350_a) {
            var6.add(var3.func_177974_f());
         }
      } catch (RuntimeException var26) {
         throw a(var26);
      }

      try {
         if (var4.func_180495_p(var3.func_177968_d()).func_177230_c() == Blocks.field_150350_a) {
            var6.add(var3.func_177968_d());
         }
      } catch (RuntimeException var18) {
         throw a(var18);
      }

      try {
         if (var4.func_180495_p(var3.func_177976_e()).func_177230_c() == Blocks.field_150350_a) {
            var6.add(var3.func_177976_e());
         }
      } catch (RuntimeException var25) {
         throw a(var25);
      }

      BlockPos var7 = null;

      for (BlockPos var9 : var6) {
         if (var7 == null) {
            var7 = var9;
         } else {
            Vec3d var10 = var5.func_174791_d();
            double var11 = this.a(
               var9.func_177958_n(), var9.func_177956_o(), var9.func_177952_p(), var10.field_72450_a, var10.field_72448_b, var10.field_72449_c
            );
            double var13 = this.a(
               var7.func_177958_n(), var7.func_177956_o(), var7.func_177952_p(), var10.field_72450_a, var10.field_72448_b, var10.field_72449_c
            );
            if (var11 < var13) {
               var7 = var9;
            }
         }
      }

      try {
         if (var7 == null) {
            var5.func_145747_a(new TextComponentString("Bed is obscured"));
            return;
         }
      } catch (RuntimeException var17) {
         throw a(var17);
      }

      try {
         var5.func_70107_b(var7.func_177958_n() + 0.5, var7.func_177956_o(), var7.func_177952_p() + 0.5);
         if (var3.func_177978_c().equals(var7)) {
            var5.field_70177_z = 0.0F;
         }
      } catch (RuntimeException var24) {
         throw a(var24);
      }

      try {
         if (var3.func_177974_f().equals(var7)) {
            var5.field_70177_z = 90.0F;
         }
      } catch (RuntimeException var16) {
         throw a(var16);
      }

      try {
         if (var3.func_177968_d().equals(var7)) {
            var5.field_70177_z = 180.0F;
         }
      } catch (RuntimeException var23) {
         throw a(var23);
      }

      try {
         if (var3.func_177976_e().equals(var7)) {
            var5.field_70177_z = -90.0F;
         }
      } catch (RuntimeException var15) {
         throw a(var15);
      }

      try {
         if (var1.getWorld().field_72995_K) {
            bE.a(false);
            var2.o();
            return;
         }
      } catch (RuntimeException var22) {
         throw a(var22);
      }

      var2.a(new Vec3d(var7.func_177958_n() + 0.5, var7.func_177956_o() + 0.0F, var7.func_177952_p() + 0.5));
      var2.b(var5.field_70177_z);
      var2.func_184212_Q().func_187227_b(bi.z, true);
      var2.r();
   }

   double a(double var1, double var3, double var5, double var7, double var9, double var11) {
      double var13 = var1 - var7;
      double var15 = var3 - var9;
      double var17 = var5 - var11;
      return Math.sqrt(var13 * var13 + var15 * var15 + var17 * var17);
   }

   @SubscribeEvent
   public void a(PlayerRespawnEvent var1) {
      EntityPlayer var2 = var1.player;

      try {
         if (var2 == null) {
            return;
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      bg var3 = bg.b(var2.getPersistentID());

      try {
         if (var3 == null) {
            return;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      Vec3d var4 = var2.func_174791_d();
      var3.field_71093_bK = var2.field_71093_bK;
      var3.func_70634_a(var4.field_72450_a, var4.field_72448_b, var4.field_72449_c);
      var3.func_70619_bc();
      System.out.println(var2.field_70170_p.func_175697_a(var3.func_180425_c(), 2));
   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public void a(EntityInteract var1) {
      try {
         if (!(var1.getTarget() instanceof EntityPlayer)) {
            return;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      try {
         if (!var1.getEntityPlayer().getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID())) {
            return;
         }
      } catch (RuntimeException var10) {
         throw a(var10);
      }

      EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
      bg var3 = bg.e(var2.getPersistentID());
      EntityPlayer var4 = (EntityPlayer)var1.getTarget();
      bg var5 = bg.c(var4);

      try {
         if (var5 == null) {
            return;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      try {
         if (var3 != null) {
            var2.func_146105_b(new TextComponentString("no lesbo yet owo"), true);
            return;
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      try {
         if (var5.k()) {
            var5.b(Minecraft.func_71410_x().field_71439_g);
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }
   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public void b(EntityInteract var1) {
      try {
         if (!(var1.getTarget() instanceof EntityPlayer)) {
            return;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      try {
         if (!var1.getEntityPlayer().getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID())) {
            return;
         }
      } catch (RuntimeException var10) {
         throw a(var10);
      }

      EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
      bg var3 = bg.e(var2.getPersistentID());

      try {
         if (var3 == null) {
            return;
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      EntityPlayer var4 = (EntityPlayer)var1.getTarget();
      bg var5 = bg.e(var4.getPersistentID());

      try {
         if (var5 != null) {
            var4.func_146105_b(new TextComponentString("no lesbo yet owo"), true);
            return;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      try {
         if (var3.k()) {
            var3.ai = false;
            var3.b(var4);
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }
   }

   @SubscribeEvent
   public void b(RightClickBlock param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getEntityPlayer ()Lnet/minecraft/entity/player/EntityPlayer;
      // 004: astore 2
      // 005: aload 2
      // 006: invokestatic com/schnurritv/sexmod/bg.c (Lnet/minecraft/entity/player/EntityPlayer;)Lcom/schnurritv/sexmod/bg;
      // 009: astore 3
      // 00a: aload 3
      // 00b: ifnonnull 013
      // 00e: return
      // 00f: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 012: athrow
      // 013: aload 3
      // 014: instanceof com/schnurritv/sexmod/cT
      // 017: ifne 01f
      // 01a: return
      // 01b: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01e: athrow
      // 01f: aload 2
      // 020: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70093_af ()Z
      // 023: ifne 02b
      // 026: return
      // 027: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 2
      // 02c: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184614_ca ()Lnet/minecraft/item/ItemStack;
      // 02f: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 032: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 035: ifne 03d
      // 038: return
      // 039: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03c: athrow
      // 03d: aload 3
      // 03e: invokevirtual com/schnurritv/sexmod/bg.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 041: getstatic com/schnurritv/sexmod/bi.z Lnet/minecraft/network/datasync/DataParameter;
      // 044: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 047: checkcast java/lang/Boolean
      // 04a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04d: ifeq 055
      // 050: return
      // 051: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 054: athrow
      // 055: aload 2
      // 056: getfield net/minecraft/entity/player/EntityPlayer.field_70125_A F
      // 059: ldc 20.0
      // 05b: fcmpg
      // 05c: ifge 064
      // 05f: return
      // 060: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 063: athrow
      // 064: aload 1
      // 065: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getHitVec ()Lnet/minecraft/util/math/Vec3d;
      // 068: astore 4
      // 06a: aload 4
      // 06c: ifnonnull 074
      // 06f: return
      // 070: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 073: athrow
      // 074: new net/minecraft/util/math/Vec3d
      // 077: dup
      // 078: aload 4
      // 07a: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 07d: aload 4
      // 07f: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 082: invokestatic java/lang/Math.floor (D)D
      // 085: dconst_0
      // 086: dadd
      // 087: aload 4
      // 089: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 08c: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 08f: astore 5
      // 091: aload 4
      // 093: aload 2
      // 094: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 097: invokevirtual net/minecraft/util/math/Vec3d.func_72438_d (Lnet/minecraft/util/math/Vec3d;)D
      // 09a: ldc2_w 3.0
      // 09d: dcmpl
      // 09e: ifle 0a6
      // 0a1: return
      // 0a2: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a5: athrow
      // 0a6: aload 2
      // 0a7: aload 5
      // 0a9: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // 0ac: aload 4
      // 0ae: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // 0b1: invokestatic java/lang/Math.floor (D)D
      // 0b4: aload 5
      // 0b6: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // 0b9: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70107_b (DDD)V
      // 0bc: aload 3
      // 0bd: aload 5
      // 0bf: invokevirtual com/schnurritv/sexmod/bg.a (Lnet/minecraft/util/math/Vec3d;)V
      // 0c2: aload 3
      // 0c3: aload 2
      // 0c4: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
      // 0c7: invokevirtual com/schnurritv/sexmod/bg.b (F)V
      // 0ca: aload 3
      // 0cb: invokevirtual com/schnurritv/sexmod/bg.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 0ce: getstatic com/schnurritv/sexmod/bi.z Lnet/minecraft/network/datasync/DataParameter;
      // 0d1: bipush 1
      // 0d2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d5: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
      // 0d8: aload 3
      // 0d9: invokevirtual com/schnurritv/sexmod/bg.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 0dc: getstatic com/schnurritv/sexmod/bi.t Lnet/minecraft/network/datasync/DataParameter;
      // 0df: bipush 0
      // 0e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e3: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
      // 0e6: aload 3
      // 0e7: getstatic com/schnurritv/sexmod/bj.STARTDOGGY Lcom/schnurritv/sexmod/bj;
      // 0ea: invokevirtual com/schnurritv/sexmod/bg.b (Lcom/schnurritv/sexmod/bj;)V
      // 0ed: aload 1
      // 0ee: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getWorld ()Lnet/minecraft/world/World;
      // 0f1: getfield net/minecraft/world/World.field_72995_K Z
      // 0f4: ifeq 11c
      // 0f7: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 0fa: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 0fd: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 100: aload 2
      // 101: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
      // 104: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 107: ifeq 11c
      // 10a: goto 111
      // 10d: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 110: athrow
      // 111: bipush 0
      // 112: invokestatic com/schnurritv/sexmod/bE.a (Z)V
      // 115: goto 11c
      // 118: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11b: athrow
      // 11c: return
      // try (6 -> 9): 9 java/lang/RuntimeException
      // try (11 -> 15): 15 java/lang/RuntimeException
      // try (17 -> 21): 21 java/lang/RuntimeException
      // try (23 -> 29): 29 java/lang/RuntimeException
      // try (31 -> 39): 39 java/lang/RuntimeException
      // try (41 -> 47): 47 java/lang/RuntimeException
      // try (52 -> 55): 55 java/lang/RuntimeException
      // try (70 -> 78): 78 java/lang/RuntimeException
      // try (80 -> 122): 123 java/lang/RuntimeException
      // try (115 -> 127): 128 java/lang/RuntimeException
   }

   @SubscribeEvent
   public void a(LivingHurtEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.getEntityLiving ()Lnet/minecraft/entity/EntityLivingBase;
      // 04: instanceof net/minecraft/entity/player/EntityPlayer
      // 07: ifne 0f
      // 0a: return
      // 0b: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: aload 1
      // 10: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.getSource ()Lnet/minecraft/util/DamageSource;
      // 13: getstatic net/minecraft/util/DamageSource.field_76379_h Lnet/minecraft/util/DamageSource;
      // 16: if_acmpeq 1e
      // 19: return
      // 1a: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.getEntityLiving ()Lnet/minecraft/entity/EntityLivingBase;
      // 22: checkcast net/minecraft/entity/player/EntityPlayer
      // 25: astore 2
      // 26: aload 2
      // 27: invokestatic com/schnurritv/sexmod/bg.c (Lnet/minecraft/entity/player/EntityPlayer;)Lcom/schnurritv/sexmod/bg;
      // 2a: astore 3
      // 2b: aload 3
      // 2c: ifnonnull 34
      // 2f: return
      // 30: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 33: athrow
      // 34: aload 3
      // 35: instanceof com/schnurritv/sexmod/br
      // 38: ifne 49
      // 3b: aload 3
      // 3c: instanceof com/schnurritv/sexmod/bm
      // 3f: ifeq 55
      // 42: goto 49
      // 45: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: aload 1
      // 4a: bipush 1
      // 4b: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.setCanceled (Z)V
      // 4e: goto 55
      // 51: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 54: athrow
      // 55: return
      // try (0 -> 5): 5 java/lang/RuntimeException
      // try (7 -> 12): 12 java/lang/RuntimeException
      // try (21 -> 24): 24 java/lang/RuntimeException
      // try (26 -> 32): 33 java/lang/RuntimeException
      // try (29 -> 38): 39 java/lang/RuntimeException
   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public void a(InitGuiEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraftforge/client/event/GuiScreenEvent$InitGuiEvent.getGui ()Lnet/minecraft/client/gui/GuiScreen;
      // 04: astore 2
      // 05: aload 2
      // 06: instanceof net/minecraft/client/gui/inventory/GuiInventory
      // 09: ifne 1f
      // 0c: aload 2
      // 0d: instanceof net/minecraft/client/gui/inventory/GuiContainerCreative
      // 10: ifne 1f
      // 13: goto 1a
      // 16: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: return
      // 1b: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 22: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 25: astore 3
      // 26: aload 3
      // 27: ifnonnull 2f
      // 2a: return
      // 2b: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e: athrow
      // 2f: aload 3
      // 30: invokestatic com/schnurritv/sexmod/bg.c (Lnet/minecraft/entity/player/EntityPlayer;)Lcom/schnurritv/sexmod/bg;
      // 33: astore 4
      // 35: aload 4
      // 37: ifnonnull 3f
      // 3a: return
      // 3b: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3e: athrow
      // 3f: aload 4
      // 41: invokevirtual com/schnurritv/sexmod/bg.s ()Z
      // 44: ifne 4c
      // 47: return
      // 48: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b: athrow
      // 4c: aload 1
      // 4d: invokevirtual net/minecraftforge/client/event/GuiScreenEvent$InitGuiEvent.getButtonList ()Ljava/util/List;
      // 50: astore 5
      // 52: aload 4
      // 54: invokevirtual com/schnurritv/sexmod/bg.L ()I
      // 57: ifne 63
      // 5a: ldc "action.names.dressup"
      // 5c: goto 65
      // 5f: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 62: athrow
      // 63: ldc "action.names.strip"
      // 65: bipush 0
      // 66: anewarray 13
      // 69: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 6c: astore 6
      // 6e: aload 5
      // 70: new net/minecraft/client/gui/GuiButton
      // 73: dup
      // 74: ldc 284453
      // 76: aload 2
      // 77: getfield net/minecraft/client/gui/GuiScreen.field_146294_l I
      // 7a: i2d
      // 7b: ldc2_w 0.5
      // 7e: dmul
      // 7f: ldc2_w 35.0
      // 82: dsub
      // 83: d2i
      // 84: aload 2
      // 85: getfield net/minecraft/client/gui/GuiScreen.field_146295_m I
      // 88: i2d
      // 89: ldc2_w 0.87
      // 8c: dmul
      // 8d: d2i
      // 8e: bipush 70
      // 90: bipush 20
      // 92: aload 6
      // 94: invokespecial net/minecraft/client/gui/GuiButton.<init> (IIIIILjava/lang/String;)V
      // 97: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9c: pop
      // 9d: aload 1
      // 9e: aload 5
      // a0: invokevirtual net/minecraftforge/client/event/GuiScreenEvent$InitGuiEvent.setButtonList (Ljava/util/List;)V
      // a3: return
      // try (3 -> 9): 10 java/lang/RuntimeException
      // try (6 -> 13): 13 java/lang/RuntimeException
      // try (18 -> 21): 21 java/lang/RuntimeException
      // try (26 -> 29): 29 java/lang/RuntimeException
      // try (31 -> 35): 35 java/lang/RuntimeException
      // try (40 -> 45): 45 java/lang/RuntimeException
   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public void a(ActionPerformedEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraftforge/client/event/GuiScreenEvent$ActionPerformedEvent.getGui ()Lnet/minecraft/client/gui/GuiScreen;
      // 04: astore 2
      // 05: aload 2
      // 06: instanceof net/minecraft/client/gui/inventory/GuiInventory
      // 09: ifne 1f
      // 0c: aload 2
      // 0d: instanceof net/minecraft/client/gui/inventory/GuiContainerCreative
      // 10: ifne 1f
      // 13: goto 1a
      // 16: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: return
      // 1b: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: aload 1
      // 20: invokevirtual net/minecraftforge/client/event/GuiScreenEvent$ActionPerformedEvent.getButton ()Lnet/minecraft/client/gui/GuiButton;
      // 23: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
      // 26: ldc 284453
      // 28: if_icmpeq 30
      // 2b: return
      // 2c: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 33: astore 3
      // 34: aload 3
      // 35: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 38: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 3b: invokestatic com/schnurritv/sexmod/bg.e (Ljava/util/UUID;)Lcom/schnurritv/sexmod/bg;
      // 3e: astore 4
      // 40: aload 4
      // 42: ifnonnull 4a
      // 45: return
      // 46: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 49: athrow
      // 4a: aload 4
      // 4c: invokevirtual com/schnurritv/sexmod/bg.s ()Z
      // 4f: ifne 57
      // 52: return
      // 53: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 56: athrow
      // 57: aload 4
      // 59: invokevirtual com/schnurritv/sexmod/bg.r ()Ljava/util/UUID;
      // 5c: ifnull 64
      // 5f: return
      // 60: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 63: athrow
      // 64: aload 4
      // 66: invokevirtual com/schnurritv/sexmod/bg.D ()Lcom/schnurritv/sexmod/bj;
      // 69: getstatic com/schnurritv/sexmod/bj.NULL Lcom/schnurritv/sexmod/bj;
      // 6c: if_acmpeq 74
      // 6f: return
      // 70: invokestatic com/schnurritv/sexmod/Z.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 73: athrow
      // 74: aload 3
      // 75: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
      // 78: bipush 2
      // 79: putfield net/minecraft/client/settings/GameSettings.field_74320_O I
      // 7c: aload 3
      // 7d: getfield net/minecraft/client/Minecraft.field_71460_t Lnet/minecraft/client/renderer/EntityRenderer;
      // 80: aconst_null
      // 81: invokevirtual net/minecraft/client/renderer/EntityRenderer.func_175066_a (Lnet/minecraft/entity/Entity;)V
      // 84: aload 4
      // 86: getstatic com/schnurritv/sexmod/bj.STRIP Lcom/schnurritv/sexmod/bj;
      // 89: invokevirtual com/schnurritv/sexmod/bg.b (Lcom/schnurritv/sexmod/bj;)V
      // 8c: bipush 0
      // 8d: invokestatic com/schnurritv/sexmod/bE.a (Z)V
      // 90: aload 3
      // 91: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 94: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_71053_j ()V
      // 97: return
      // try (3 -> 9): 10 java/lang/RuntimeException
      // try (6 -> 13): 13 java/lang/RuntimeException
      // try (15 -> 21): 21 java/lang/RuntimeException
      // try (30 -> 33): 33 java/lang/RuntimeException
      // try (35 -> 39): 39 java/lang/RuntimeException
      // try (41 -> 45): 45 java/lang/RuntimeException
      // try (47 -> 52): 52 java/lang/RuntimeException
   }

   @SubscribeEvent
   public void a(LivingDamageEvent var1) {
      try {
         if (var1.getSource() != DamageSource.field_76379_h) {
            return;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      EntityLivingBase var2 = var1.getEntityLiving();

      try {
         if (!(var2 instanceof EntityPlayer)) {
            return;
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      bg var3 = bg.e(var2.getPersistentID());

      try {
         if (var3 == null) {
            return;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      try {
         if (var3 instanceof cT) {
            var1.setResult(Result.DENY);
            var1.setAmount(0.0F);
            var1.setCanceled(true);
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
