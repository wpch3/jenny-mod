package com.schnurritv.sexmod;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import javax.vecmath.Vector3f;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed.EnumPartType;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class b1 {
   public static float[] a = new float[60];

   public static Vec3d a(Vec3d var0, Vec3d var1, int var2) {
      try {
         if (var2 == 0) {
            return var1;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      Vec3d var3 = var1.func_178788_d(var0);
      return var0.func_72441_c(var3.field_72450_a / var2, var3.field_72448_b / var2, var3.field_72449_c / var2);
   }

   public static double a(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static float a(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   public static Vec3d a(Vec3d var0, Vec3d var1, double var2) {
      Vec3d var4 = var1.func_178788_d(var0);
      return var0.func_178787_e(new Vec3d(var4.field_72450_a * var2, var4.field_72448_b * var2, var4.field_72449_c * var2));
   }

   public static Vec3i a(Vec3i var0, Vec3i var1, double var2) {
      Vec3d var4 = new Vec3d(
         var1.func_177958_n() - var0.func_177958_n(), var1.func_177956_o() - var0.func_177956_o(), var1.func_177952_p() - var0.func_177952_p()
      );
      return new Vec3i(
         var0.func_177958_n() + var4.field_72450_a * var2, var0.func_177956_o() + var4.field_72448_b * var2, var0.func_177952_p() + var4.field_72449_c * var2
      );
   }

   public static void b(String var0) {
      Clipboard var1 = Toolkit.getDefaultToolkit().getSystemClipboard();
      StringSelection var2 = new StringSelection(var0);
      var1.setContents(var2, null);
   }

   public static String a(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 12
      // 04: aload 0
      // 05: invokevirtual java/lang/String.isEmpty ()Z
      // 08: ifeq 18
      // 0b: goto 12
      // 0e: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: aload 0
      // 13: areturn
      // 14: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: new java/lang/StringBuilder
      // 1b: dup
      // 1c: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f: aload 0
      // 20: bipush 0
      // 21: invokevirtual java/lang/String.charAt (I)C
      // 24: invokestatic java/lang/Character.toUpperCase (C)C
      // 27: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2a: aload 0
      // 2b: bipush 1
      // 2c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2f: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 32: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 38: areturn
      // try (0 -> 5): 6 java/lang/RuntimeException
      // try (2 -> 10): 10 java/lang/RuntimeException
   }

   public static Vec3d a(EntityLivingBase var0, float var1) {
      World var2 = var0.field_70170_p;

      try {
         if (var2 instanceof com.b) {
            return new Vec3d(0.0, 1.0, 0.0);
         }
      } catch (RuntimeException var11) {
         throw a(var11);
      }

      BlockPos var3 = new BlockPos(Math.floor(var0.field_70165_t), Math.floor(var0.field_70163_u), Math.floor(var0.field_70161_v));
      HashMap var4 = new HashMap();
      int var5 = 0;

      for (int var6 = -1; var6 < 2; var6++) {
         for (int var7 = -1; var7 < 2; var7++) {
            for (int var8 = -1; var8 < 2; var8++) {
               int var9 = var2.func_175721_c(var3.func_177982_a(var6, var7, var8), false);
               var4.put(new Vec3d(var6, var7, var8), var9);
               if (var9 > var5) {
                  var5 = var9;
               }
            }
         }
      }

      Vec3d var12 = null;

      for (Entry var17 : var4.entrySet()) {
         try {
            if ((Integer)var17.getValue() != var5) {
               continue;
            }
         } catch (RuntimeException var10) {
            throw a(var10);
         }

         if (var12 != null) {
            var12 = null;
            break;
         }

         var12 = (Vec3d)var17.getKey();
      }

      if (var12 == null) {
         var12 = new Vec3d(0.2, 0.8, 0.0);
      } else {
         var12 = new Vec3d(var12.field_72450_a, var12.field_72448_b, -var12.field_72449_c);
         float var16 = -a(var0.field_70760_ar, var0.field_70761_aq, var1);
         var12 = a(var12, var16);
      }

      return var12.func_72432_b();
   }

   public static double a(Vector3f var0, Vec3d var1) {
      return var0.x * var1.field_72450_a + var0.y * var1.field_72448_b + var0.z * var1.field_72449_c;
   }

   public static double d(double var0) {
      return 1.0 - Math.pow(1.0 - var0, 4.0);
   }

   public static double e(double var0) {
      return -(Math.cos(Math.PI * var0) - 1.0) / 2.0;
   }

   public static double c(double var0) {
      return 1.0 - Math.cos(Math.PI * var0 / 2.0);
   }

   public static float a(float var0) {
      float var2;
      float var10000 = var2 = var0 % 360.0F;

      try {
         if (var10000 >= 0.0F) {
            return var2;
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      return var2 + 360.0F;
   }

   public static double b(double var0) {
      double var3;
      double var10000 = var3 = var0 % 360.0;

      try {
         if (var10000 >= 0.0) {
            return var3;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var3 + 360.0;
   }

   public static double c(double var0, double var2, double var4) {
      double var6 = (1.0 - Math.cos(var4 * Math.PI)) / 2.0;
      return var0 * (1.0 - var6) + var2 * var6;
   }

   public static float b(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static double b(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static float c(float param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: fload 0
      // 01: fload 1
      // 02: fsub
      // 03: invokestatic java/lang/Math.abs (F)F
      // 06: fload 2
      // 07: fcmpg
      // 08: ifgt 11
      // 0b: fload 0
      // 0c: freturn
      // 0d: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10: athrow
      // 11: fload 0
      // 12: invokestatic java/lang/Math.abs (F)F
      // 15: fload 1
      // 16: invokestatic java/lang/Math.abs (F)F
      // 19: fcmpg
      // 1a: ifge 36
      // 1d: fload 1
      // 1e: fconst_0
      // 1f: fcmpl
      // 20: ifle 32
      // 23: goto 2a
      // 26: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29: athrow
      // 2a: fload 1
      // 2b: fload 2
      // 2c: fsub
      // 2d: freturn
      // 2e: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 31: athrow
      // 32: fload 1
      // 33: fload 2
      // 34: fadd
      // 35: freturn
      // 36: fload 0
      // 37: fconst_0
      // 38: fcmpl
      // 39: ifle 44
      // 3c: fload 0
      // 3d: fload 2
      // 3e: fsub
      // 3f: freturn
      // 40: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43: athrow
      // 44: fload 0
      // 45: fload 2
      // 46: fadd
      // 47: freturn
      // try (0 -> 9): 9 java/lang/RuntimeException
      // try (11 -> 21): 22 java/lang/RuntimeException
      // try (17 -> 28): 28 java/lang/RuntimeException
      // try (34 -> 42): 42 java/lang/RuntimeException
   }

   public static float b(float var0) {
      return (float)((Math.PI * 2) / (360.0 / var0));
   }

   public static int a(double var0) {
      return Math.round((float)var0);
   }

   public static Vec3d a(double var0, double var2, double var4, float var6) {
      return a(new Vec3d(var0, var2, var4), var6);
   }

   public static Vec3d a(Vec3d var0, float var1) {
      return a(var0, 0.0F, var1);
   }

   public static Vec3d a(Vec3d var0, float var1, float var2) {
      Vec3d var3 = new Vec3d(
         var0.field_72450_a,
         var0.field_72448_b * Math.cos(var1 * (Math.PI / 180.0)) - var0.field_72449_c * Math.sin(var1 * (Math.PI / 180.0)),
         var0.field_72448_b * Math.sin(var1 * (Math.PI / 180.0)) + var0.field_72449_c * Math.cos(var1 * (Math.PI / 180.0))
      );
      return new Vec3d(
         -Math.sin((var2 + 90.0F) * (Math.PI / 180.0)) * var3.field_72450_a - Math.sin(var2 * (Math.PI / 180.0)) * var3.field_72449_c,
         var3.field_72448_b,
         Math.cos((var2 + 90.0F) * (Math.PI / 180.0)) * var3.field_72450_a + Math.cos(var2 * (Math.PI / 180.0)) * var3.field_72449_c
      );
   }

   public static int a(World var0, int var1, int var2) {
      HashSet var3 = Sets.newHashSet(
         new Block[]{Blocks.field_150349_c, Blocks.field_150354_m, Blocks.field_180395_cM, Blocks.field_150355_j, Blocks.field_150348_b, Blocks.field_150347_e}
      );
      int var4 = var0.func_72800_K();
      boolean var5 = false;

      while (true) {
         try {
            if (var5 || var4-- < 0) {
               return var4;
            }
         } catch (RuntimeException var7) {
            throw a(var7);
         }

         Block var6 = var0.func_180495_p(new BlockPos(var1, var4, var2)).func_177230_c();
         var5 = var3.contains(var6);
      }
   }

   public static boolean a(World var0, BlockPos var1) {
      return a(var0, var1, null, null, null);
   }

   public static boolean a(World param0, BlockPos param1, Vec3d param2, EnumFacing param3, EntityPlayer param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 05: astore 5
      // 07: aload 5
      // 09: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 0e: astore 6
      // 10: aload 6
      // 12: aload 5
      // 14: aload 0
      // 15: aload 1
      // 16: aconst_null
      // 17: invokevirtual net/minecraft/block/Block.isBed (Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;)Z
      // 1a: ifeq 23
      // 1d: bipush 1
      // 1e: ireturn
      // 1f: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: aload 0
      // 24: aload 1
      // 25: invokevirtual net/minecraft/world/World.func_175625_s (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/tileentity/TileEntity;
      // 28: astore 7
      // 2a: aload 7
      // 2c: ifnull 69
      // 2f: aload 7
      // 31: invokevirtual net/minecraft/tileentity/TileEntity.func_145748_c_ ()Lnet/minecraft/util/text/ITextComponent;
      // 34: astore 8
      // 36: aload 8
      // 38: ifnull 69
      // 3b: aload 8
      // 3d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 40: ldc " bed"
      // 42: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 45: ifne 63
      // 48: goto 4f
      // 4b: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: aload 8
      // 51: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 54: ldc "bed "
      // 56: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 59: ifeq 69
      // 5c: goto 63
      // 5f: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 62: athrow
      // 63: bipush 1
      // 64: ireturn
      // 65: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 68: athrow
      // 69: aload 3
      // 6a: ifnull 78
      // 6d: aload 2
      // 6e: ifnonnull 7e
      // 71: goto 78
      // 74: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 77: athrow
      // 78: bipush 0
      // 79: ireturn
      // 7a: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7d: athrow
      // 7e: aload 6
      // 80: aload 5
      // 82: new net/minecraft/util/math/RayTraceResult
      // 85: dup
      // 86: aload 2
      // 87: aload 3
      // 88: invokespecial net/minecraft/util/math/RayTraceResult.<init> (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumFacing;)V
      // 8b: aload 0
      // 8c: aload 1
      // 8d: aload 4
      // 8f: invokevirtual net/minecraft/block/Block.getPickBlock (Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/RayTraceResult;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
      // 92: invokevirtual net/minecraft/item/ItemStack.func_82833_r ()Ljava/lang/String;
      // 95: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 98: astore 8
      // 9a: aload 8
      // 9c: ldc " bed"
      // 9e: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // a1: ifne b5
      // a4: aload 8
      // a6: ldc "bed "
      // a8: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // ab: ifeq bb
      // ae: goto b5
      // b1: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b4: athrow
      // b5: bipush 1
      // b6: ireturn
      // b7: invokestatic com/schnurritv/sexmod/b1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ba: athrow
      // bb: bipush 0
      // bc: ireturn
      // try (7 -> 16): 16 java/lang/RuntimeException
      // try (27 -> 34): 35 java/lang/RuntimeException
      // try (29 -> 42): 43 java/lang/RuntimeException
      // try (37 -> 47): 47 java/lang/RuntimeException
      // try (49 -> 53): 54 java/lang/RuntimeException
      // try (51 -> 58): 58 java/lang/RuntimeException
      // try (74 -> 82): 83 java/lang/RuntimeException
      // try (78 -> 87): 87 java/lang/RuntimeException
   }

   public static void a(World var0, EnumParticleTypes var1, Vec3d var2, int var3, double var4, double var6) {
      for (int var8 = 0; var8 < var3; var8++) {
         float var9 = (float)var8 / var3;
         double var10 = (Math.PI * 2) * var9;
         double var12 = Math.sin(var10);
         double var14 = Math.cos(var10);
         var12 *= var4;
         var14 *= var4;
         var0.func_175688_a(var1, var2.field_72450_a + var12, var2.field_72448_b, var2.field_72449_c + var14, 0.0, f.a.nextFloat() * var6, 0.0, new int[0]);
      }
   }

   public static BlockPos a(BlockPos var0, IBlockState var1) {
      ImmutableMap var2 = var1.func_177228_b();
      EnumFacing var3 = null;
      EnumPartType var4 = null;
      UnmodifiableIterator var5 = var2.entrySet().iterator();

      while (var5.hasNext()) {
         Entry var6 = (Entry)var5.next();
         if (var6.getKey() instanceof PropertyDirection) {
            var3 = (EnumFacing)var6.getValue();
         } else if (var6.getKey() instanceof PropertyEnum) {
            var4 = (EnumPartType)var6.getValue();
         }
      }

      try {
         if (var3 == null) {
            System.out.println("bed is fucked up - it has no facing value");
            return null;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      try {
         if (var4 == null) {
            System.out.println("bed is fucked up - it has no partType value");
            return null;
         }
      } catch (RuntimeException var10) {
         throw a(var10);
      }

      BlockPos var11 = null;

      label91: {
         label92: {
            label72: {
               try {
                  if (var4 != EnumPartType.FOOT) {
                     break label92;
                  }

                  if (var3 != EnumFacing.NORTH) {
                     break label72;
                  }
               } catch (RuntimeException var9) {
                  throw a(var9);
               }

               var11 = var0.func_177978_c();
            }

            if (var3 == EnumFacing.EAST) {
               var11 = var0.func_177974_f();
            }

            if (var3 == EnumFacing.SOUTH) {
               var11 = var0.func_177968_d();
            }

            if (var3 == EnumFacing.WEST) {
               var11 = var0.func_177976_e();
            }
            break label91;
         }

         if (var3 == EnumFacing.NORTH) {
            var11 = var0.func_177968_d();
         }

         if (var3 == EnumFacing.EAST) {
            var11 = var0.func_177976_e();
         }

         if (var3 == EnumFacing.SOUTH) {
            var11 = var0.func_177978_c();
         }

         if (var3 == EnumFacing.WEST) {
            var11 = var0.func_177974_f();
         }
      }

      try {
         if (var11 == null) {
            System.out.println("bed is fucked up - it appears to be positioned vertically (wtf?)");
            return null;
         } else {
            return var11;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   public static class a {
      @SideOnly(Side.CLIENT)
      @SubscribeEvent
      public void c(ClientChatEvent var1) {
         try {
            if (!(Boolean)Launch.blackboard.get("fml.deobfuscatedEnvironment")) {
               return;
            }
         } catch (RuntimeException var2) {
            throw a(var2);
         }

         try {
            if (!"resetcolor".equalsIgnoreCase(var1.getMessage())) {
               return;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         bf.a();
         bu.b();
         bG.a();
         bb.b();
      }

      @SideOnly(Side.CLIENT)
      @SubscribeEvent
      public void b(ClientChatEvent var1) {
         try {
            if (!(Boolean)Launch.blackboard.get("fml.deobfuscatedEnvironment")) {
               return;
            }
         } catch (Exception var10) {
            throw a(var10);
         }

         String var2 = var1.getOriginalMessage();
         String[] var3 = var2.split(" ");

         try {
            if (var3.length != 3) {
               return;
            }
         } catch (Exception var9) {
            throw a(var9);
         }

         try {
            if (!"set".equalsIgnoreCase(var3[0])) {
               return;
            }
         } catch (Exception var7) {
            throw a(var7);
         }

         int var4;
         float var5;
         try {
            var4 = Integer.parseInt(var3[1]);
            var5 = Float.parseFloat(var3[2]);
            if (b1.a.length - 1 < var4) {
               return;
            }
         } catch (Exception var8) {
            return;
         }

         Minecraft.func_71410_x()
            .field_71439_g
            .func_145747_a(new TextComponentString(String.format("%sSet dev float N.%s from %s to %s", TextFormatting.GRAY, var4, b1.a[var4], var5)));
         b1.a[var4] = var5;
         var1.setCanceled(true);
      }

      @SideOnly(Side.CLIENT)
      @SubscribeEvent
      public void a(ClientChatEvent var1) {
         try {
            if (!(Boolean)Launch.blackboard.get("fml.deobfuscatedEnvironment")) {
               return;
            }
         } catch (Exception var9) {
            throw a(var9);
         }

         String var2 = var1.getOriginalMessage();
         String[] var3 = var2.split(" ");

         try {
            if (var3.length != 2) {
               return;
            }
         } catch (Exception var8) {
            throw a(var8);
         }

         try {
            if (!"get".equalsIgnoreCase(var3[0])) {
               return;
            }
         } catch (Exception var6) {
            throw a(var6);
         }

         int var4;
         try {
            var4 = Integer.parseInt(var3[1]);
            if (b1.a.length - 1 < var4) {
               return;
            }
         } catch (Exception var7) {
            return;
         }

         Minecraft.func_71410_x()
            .field_71439_g
            .func_145747_a(new TextComponentString(String.format("%sdev float N.%s is %s", TextFormatting.YELLOW, var4, b1.a[var4])));
         var1.setCanceled(true);
      }

      private static Exception a(Exception var0) {
         return var0;
      }
   }
}
