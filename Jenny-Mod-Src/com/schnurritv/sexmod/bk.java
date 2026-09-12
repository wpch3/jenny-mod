package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockChest.Type;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer.SleepResult;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.event.world.WorldEvent.Load;
import net.minecraftforge.event.world.WorldEvent.Save;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class bK {
   static final int b = 4;
   private static final HashMap<UUID, bK.b> a = new HashMap<>();
   static final Vec3d[] c = new Vec3d[]{
      new Vec3d(0.0, 0.0, 0.0), new Vec3d(0.5, 0.0, 0.0), new Vec3d(-0.5, 0.0, 0.0), new Vec3d(0.0, 0.0, 0.5), new Vec3d(0.0, 0.0, -0.5)
   };
   static HashMap<cA, BlockPos[]> d = new HashMap<>();

   public static void a() {
      a.clear();
      d.clear();
   }

   public static void a(World param0, Vec3d param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 00: invokestatic java/util/UUID.randomUUID ()Ljava/util/UUID;
      // 03: astore 2
      // 04: bipush 4
      // 05: newarray 6
      // 07: astore 3
      // 08: aload 3
      // 09: bipush 0
      // 0a: ldc 0.25
      // 0c: fastore
      // 0d: bipush 1
      // 0e: istore 4
      // 10: iload 4
      // 12: aload 3
      // 13: arraylength
      // 14: if_icmpge 28
      // 17: aload 3
      // 18: iload 4
      // 1a: invokestatic com/schnurritv/sexmod/cA.p ()F
      // 1d: fastore
      // 1e: iinc 4 1
      // 21: goto 10
      // 24: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: new java/util/ArrayList
      // 2b: dup
      // 2c: invokespecial java/util/ArrayList.<init> ()V
      // 2f: astore 4
      // 31: aload 3
      // 32: astore 5
      // 34: aload 5
      // 36: arraylength
      // 37: istore 6
      // 39: bipush 0
      // 3a: istore 7
      // 3c: iload 7
      // 3e: iload 6
      // 40: if_icmpge 63
      // 43: aload 5
      // 45: iload 7
      // 47: faload
      // 48: fstore 8
      // 4a: aload 0
      // 4b: aload 2
      // 4c: fload 8
      // 4e: invokestatic com/schnurritv/sexmod/cA.a (Lnet/minecraft/world/World;Ljava/util/UUID;F)Lcom/schnurritv/sexmod/cA;
      // 51: astore 9
      // 53: aload 4
      // 55: aload 9
      // 57: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5c: pop
      // 5d: iinc 7 1
      // 60: goto 3c
      // 63: invokestatic com/schnurritv/sexmod/EyeAndKoboldColor.values ()[Lcom/schnurritv/sexmod/EyeAndKoboldColor;
      // 66: getstatic com/schnurritv/sexmod/f.a Ljava/util/Random;
      // 69: invokestatic com/schnurritv/sexmod/EyeAndKoboldColor.values ()[Lcom/schnurritv/sexmod/EyeAndKoboldColor;
      // 6c: arraylength
      // 6d: invokevirtual java/util/Random.nextInt (I)I
      // 70: aaload
      // 71: astore 5
      // 73: new com/schnurritv/sexmod/bK$b
      // 76: dup
      // 77: aload 2
      // 78: aload 5
      // 7a: aload 4
      // 7c: bipush 0
      // 7d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 82: checkcast com/schnurritv/sexmod/cA
      // 85: aload 4
      // 87: invokespecial com/schnurritv/sexmod/bK$b.<init> (Ljava/util/UUID;Lcom/schnurritv/sexmod/EyeAndKoboldColor;Lcom/schnurritv/sexmod/cA;Ljava/util/List;)V
      // 8a: astore 6
      // 8c: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 8f: aload 2
      // 90: aload 6
      // 92: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 95: pop
      // 96: bipush 0
      // 97: istore 7
      // 99: aload 4
      // 9b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // a0: astore 8
      // a2: aload 8
      // a4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a9: ifeq ea
      // ac: aload 8
      // ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // b3: checkcast com/schnurritv/sexmod/cA
      // b6: astore 9
      // b8: aload 9
      // ba: aload 1
      // bb: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // be: getstatic com/schnurritv/sexmod/bK.c [Lnet/minecraft/util/math/Vec3d;
      // c1: iload 7
      // c3: aaload
      // c4: getfield net/minecraft/util/math/Vec3d.field_72450_a D
      // c7: dadd
      // c8: aload 1
      // c9: getfield net/minecraft/util/math/Vec3d.field_72448_b D
      // cc: aload 1
      // cd: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // d0: getstatic com/schnurritv/sexmod/bK.c [Lnet/minecraft/util/math/Vec3d;
      // d3: iload 7
      // d5: aaload
      // d6: getfield net/minecraft/util/math/Vec3d.field_72449_c D
      // d9: dadd
      // da: invokevirtual com/schnurritv/sexmod/cA.func_70107_b (DDD)V
      // dd: aload 0
      // de: aload 9
      // e0: invokevirtual net/minecraft/world/World.func_72838_d (Lnet/minecraft/entity/Entity;)Z
      // e3: pop
      // e4: iinc 7 1
      // e7: goto a2
      // ea: return
      // try (11 -> 21): 21 java/lang/RuntimeException
   }

   public static boolean h(UUID var0) {
      try {
         if (a.get(var0) != null) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      return false;
   }

   public static void a(UUID var0, UUID var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.a(var1);
   }

   public static void a(UUID var0, EyeAndKoboldColor var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 != null) {
            System.out.println("tribe of UUID " + var0.toString() + " does already exist lol");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      a.put(var0, new bK.b(var0, var1));
   }

   public static boolean a(BlockPos var0) {
      for (Entry var2 : d.entrySet()) {
         BlockPos[] var3 = (BlockPos[])var2.getValue();

         try {
            if (var3[0].equals(var0)) {
               return true;
            }
         } catch (RuntimeException var5) {
            throw a(var5);
         }

         try {
            if (var3[1].equals(var0)) {
               return true;
            }
         } catch (RuntimeException var4) {
            throw a(var4);
         }
      }

      return false;
   }

   public static BlockPos[] b(cA var0) {
      return d.get(var0);
   }

   public static void a(cA var0, BlockPos var1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1721)
      //   at org.jetbrains.java.decompiler.struct.StructContext.getClass(StructContext.java:77)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:318)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getAllGenerics(StructClass.java:320)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/cA.field_70170_p Lnet/minecraft/world/World;
      // 04: astore 2
      // 05: aconst_null
      // 06: astore 3
      // 07: aload 2
      // 08: aload 1
      // 09: invokevirtual net/minecraft/util/math/BlockPos.func_177978_c ()Lnet/minecraft/util/math/BlockPos;
      // 0c: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 0f: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 14: instanceof net/minecraft/block/BlockBed
      // 17: ifeq 1f
      // 1a: aload 1
      // 1b: invokevirtual net/minecraft/util/math/BlockPos.func_177978_c ()Lnet/minecraft/util/math/BlockPos;
      // 1e: astore 3
      // 1f: aload 2
      // 20: aload 1
      // 21: invokevirtual net/minecraft/util/math/BlockPos.func_177974_f ()Lnet/minecraft/util/math/BlockPos;
      // 24: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 27: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 2c: instanceof net/minecraft/block/BlockBed
      // 2f: ifeq 37
      // 32: aload 1
      // 33: invokevirtual net/minecraft/util/math/BlockPos.func_177974_f ()Lnet/minecraft/util/math/BlockPos;
      // 36: astore 3
      // 37: aload 2
      // 38: aload 1
      // 39: invokevirtual net/minecraft/util/math/BlockPos.func_177968_d ()Lnet/minecraft/util/math/BlockPos;
      // 3c: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 3f: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 44: instanceof net/minecraft/block/BlockBed
      // 47: ifeq 4f
      // 4a: aload 1
      // 4b: invokevirtual net/minecraft/util/math/BlockPos.func_177968_d ()Lnet/minecraft/util/math/BlockPos;
      // 4e: astore 3
      // 4f: aload 2
      // 50: aload 1
      // 51: invokevirtual net/minecraft/util/math/BlockPos.func_177976_e ()Lnet/minecraft/util/math/BlockPos;
      // 54: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 57: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
      // 5c: instanceof net/minecraft/block/BlockBed
      // 5f: ifeq 67
      // 62: aload 1
      // 63: invokevirtual net/minecraft/util/math/BlockPos.func_177976_e ()Lnet/minecraft/util/math/BlockPos;
      // 66: astore 3
      // 67: aload 3
      // 68: ifnonnull 91
      // 6b: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 6e: new java/lang/StringBuilder
      // 71: dup
      // 72: invokespecial java/lang/StringBuilder.<init> ()V
      // 75: ldc "bed @"
      // 77: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a: aload 1
      // 7b: invokevirtual net/minecraft/util/math/BlockPos.toString ()Ljava/lang/String;
      // 7e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 81: ldc " apparently doesn't have another half.. wtf"
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 89: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 8c: return
      // 8d: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 90: athrow
      // 91: getstatic com/schnurritv/sexmod/bK.d Ljava/util/HashMap;
      // 94: aload 0
      // 95: bipush 2
      // 96: anewarray 199
      // 99: dup
      // 9a: bipush 0
      // 9b: aload 1
      // 9c: aastore
      // 9d: dup
      // 9e: bipush 1
      // 9f: aload 3
      // a0: aastore
      // a1: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // a4: pop
      // a5: return
      // try (45 -> 61): 61 java/lang/RuntimeException
   }

   public static void a(cA var0) {
      d.remove(var0);
   }

   public static void b(UUID var0, cA var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.c = var1;
   }

   public static void d(UUID var0, cA var1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 00: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 03: aload 0
      // 04: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07: checkcast com/schnurritv/sexmod/bK$b
      // 0a: astore 2
      // 0b: aload 2
      // 0c: ifnonnull 35
      // 0f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 12: new java/lang/StringBuilder
      // 15: dup
      // 16: invokespecial java/lang/StringBuilder.<init> ()V
      // 19: ldc "tribe of UUID "
      // 1b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e: aload 0
      // 1f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 22: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25: ldc " not found uwu"
      // 27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 30: return
      // 31: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 34: athrow
      // 35: aload 2
      // 36: aload 1
      // 37: invokevirtual com/schnurritv/sexmod/bK$b.a (Lcom/schnurritv/sexmod/cA;)V
      // 3a: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 3d: aload 0
      // 3e: aload 2
      // 3f: invokevirtual java/util/HashMap.replace (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 42: pop
      // 43: aload 1
      // 44: invokevirtual com/schnurritv/sexmod/cA.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 47: getstatic com/schnurritv/sexmod/cA.ae Lnet/minecraft/network/datasync/DataParameter;
      // 4a: aload 0
      // 4b: invokestatic com/google/common/base/Optional.of (Ljava/lang/Object;)Lcom/google/common/base/Optional;
      // 4e: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
      // 51: aload 1
      // 52: getfield com/schnurritv/sexmod/cA.aa Z
      // 55: ifne 70
      // 58: aload 1
      // 59: invokevirtual com/schnurritv/sexmod/cA.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 5c: getstatic com/schnurritv/sexmod/cA.G Lnet/minecraft/network/datasync/DataParameter;
      // 5f: aload 2
      // 60: getfield com/schnurritv/sexmod/bK$b.g Lcom/schnurritv/sexmod/EyeAndKoboldColor;
      // 63: invokevirtual com/schnurritv/sexmod/EyeAndKoboldColor.toString ()Ljava/lang/String;
      // 66: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
      // 69: goto 70
      // 6c: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6f: athrow
      // 70: return
      // try (5 -> 21): 21 java/lang/RuntimeException
      // try (23 -> 47): 48 java/lang/RuntimeException
   }

   public static void d(UUID param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 03: aload 0
      // 04: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07: checkcast com/schnurritv/sexmod/bK$b
      // 0a: astore 1
      // 0b: aload 1
      // 0c: ifnonnull 35
      // 0f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 12: new java/lang/StringBuilder
      // 15: dup
      // 16: invokespecial java/lang/StringBuilder.<init> ()V
      // 19: ldc "tribe of UUID "
      // 1b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e: aload 0
      // 1f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 22: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25: ldc " not found uwu"
      // 27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 30: return
      // 31: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 34: athrow
      // 35: aload 1
      // 36: getfield com/schnurritv/sexmod/bK$b.c Lcom/schnurritv/sexmod/cA;
      // 39: astore 2
      // 3a: aload 2
      // 3b: ifnull 4c
      // 3e: aload 2
      // 3f: getfield com/schnurritv/sexmod/cA.field_70128_L Z
      // 42: ifeq 5b
      // 45: goto 4c
      // 48: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b: athrow
      // 4c: aload 1
      // 4d: aload 1
      // 4e: invokevirtual com/schnurritv/sexmod/bK$b.f ()Lcom/schnurritv/sexmod/cA;
      // 51: putfield com/schnurritv/sexmod/bK$b.c Lcom/schnurritv/sexmod/cA;
      // 54: goto 5b
      // 57: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5a: athrow
      // 5b: return
      // try (5 -> 21): 21 java/lang/RuntimeException
      // try (26 -> 31): 32 java/lang/RuntimeException
      // try (28 -> 38): 39 java/lang/RuntimeException
   }

   public static void a(UUID var0, cA var1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 000: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 003: aload 0
      // 004: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 007: checkcast com/schnurritv/sexmod/bK$b
      // 00a: astore 2
      // 00b: aload 2
      // 00c: ifnonnull 035
      // 00f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 012: new java/lang/StringBuilder
      // 015: dup
      // 016: invokespecial java/lang/StringBuilder.<init> ()V
      // 019: ldc "tribe of UUID "
      // 01b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 01e: aload 0
      // 01f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 022: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 025: ldc " not found uwu"
      // 027: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 02d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 030: return
      // 031: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 034: athrow
      // 035: aload 2
      // 036: aload 1
      // 037: invokevirtual com/schnurritv/sexmod/bK$b.b (Lcom/schnurritv/sexmod/cA;)V
      // 03a: aload 2
      // 03b: aload 1
      // 03c: invokevirtual com/schnurritv/sexmod/cA.A ()Ljava/util/UUID;
      // 03f: invokevirtual com/schnurritv/sexmod/bK$b.b (Ljava/util/UUID;)V
      // 042: aload 2
      // 043: getfield com/schnurritv/sexmod/bK$b.c Lcom/schnurritv/sexmod/cA;
      // 046: ifnull 073
      // 049: aload 2
      // 04a: getfield com/schnurritv/sexmod/bK$b.c Lcom/schnurritv/sexmod/cA;
      // 04d: invokevirtual com/schnurritv/sexmod/cA.func_145782_y ()I
      // 050: aload 1
      // 051: invokevirtual com/schnurritv/sexmod/cA.func_145782_y ()I
      // 054: if_icmpne 073
      // 057: goto 05e
      // 05a: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05d: athrow
      // 05e: aload 2
      // 05f: invokevirtual com/schnurritv/sexmod/bK$b.f ()Lcom/schnurritv/sexmod/cA;
      // 062: astore 3
      // 063: aload 3
      // 064: ifnull 073
      // 067: aload 2
      // 068: aload 3
      // 069: putfield com/schnurritv/sexmod/bK$b.c Lcom/schnurritv/sexmod/cA;
      // 06c: goto 073
      // 06f: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 072: athrow
      // 073: aload 2
      // 074: getfield com/schnurritv/sexmod/bK$b.a Ljava/util/Collection;
      // 077: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 07c: astore 3
      // 07d: aload 3
      // 07e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 083: ifeq 09a
      // 086: aload 3
      // 087: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08c: checkcast com/schnurritv/sexmod/b5
      // 08f: astore 4
      // 091: aload 4
      // 093: aload 1
      // 094: invokevirtual com/schnurritv/sexmod/b5.a (Lcom/schnurritv/sexmod/cA;)V
      // 097: goto 07d
      // 09a: aload 2
      // 09b: getfield com/schnurritv/sexmod/bK$b.i Ljava/util/List;
      // 09e: invokeinterface java/util/List.isEmpty ()Z 1
      // 0a3: ifne 0b4
      // 0a6: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 0a9: aload 0
      // 0aa: aload 2
      // 0ab: invokevirtual java/util/HashMap.replace (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0ae: pop
      // 0af: return
      // 0b0: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b3: athrow
      // 0b4: aload 1
      // 0b5: invokevirtual com/schnurritv/sexmod/cA.O ()Z
      // 0b8: ifne 0c0
      // 0bb: return
      // 0bc: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0bf: athrow
      // 0c0: aload 1
      // 0c1: invokevirtual com/schnurritv/sexmod/cA.j ()Lnet/minecraft/entity/player/EntityPlayer;
      // 0c4: astore 3
      // 0c5: aload 3
      // 0c6: ifnull 155
      // 0c9: new java/util/HashSet
      // 0cc: dup
      // 0cd: invokespecial java/util/HashSet.<init> ()V
      // 0d0: astore 4
      // 0d2: aload 4
      // 0d4: aload 2
      // 0d5: getfield com/schnurritv/sexmod/bK$b.j Ljava/util/HashSet;
      // 0d8: invokevirtual java/util/HashSet.addAll (Ljava/util/Collection;)Z
      // 0db: pop
      // 0dc: aload 4
      // 0de: aload 2
      // 0df: getfield com/schnurritv/sexmod/bK$b.e Ljava/util/HashSet;
      // 0e2: invokevirtual java/util/HashSet.addAll (Ljava/util/Collection;)Z
      // 0e5: pop
      // 0e6: aload 2
      // 0e7: getfield com/schnurritv/sexmod/bK$b.a Ljava/util/Collection;
      // 0ea: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0ef: astore 5
      // 0f1: aload 5
      // 0f3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f8: ifeq 115
      // 0fb: aload 5
      // 0fd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 102: checkcast com/schnurritv/sexmod/b5
      // 105: astore 6
      // 107: aload 4
      // 109: aload 6
      // 10b: getfield com/schnurritv/sexmod/b5.d Ljava/util/HashSet;
      // 10e: invokevirtual java/util/HashSet.addAll (Ljava/util/Collection;)Z
      // 111: pop
      // 112: goto 0f1
      // 115: getstatic com/schnurritv/sexmod/at.a Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
      // 118: new com/schnurritv/sexmod/aR
      // 11b: dup
      // 11c: aload 4
      // 11e: bipush 0
      // 11f: invokespecial com/schnurritv/sexmod/aR.<init> (Ljava/util/HashSet;Z)V
      // 122: aload 3
      // 123: checkcast net/minecraft/entity/player/EntityPlayerMP
      // 126: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
      // 129: aload 3
      // 12a: new net/minecraft/util/text/TextComponentString
      // 12d: dup
      // 12e: ldc "ur %stribe %shas been %seradicated %suwu"
      // 130: bipush 4
      // 131: anewarray 14
      // 134: dup
      // 135: bipush 0
      // 136: getstatic net/minecraft/util/text/TextFormatting.RED Lnet/minecraft/util/text/TextFormatting;
      // 139: aastore
      // 13a: dup
      // 13b: bipush 1
      // 13c: getstatic net/minecraft/util/text/TextFormatting.WHITE Lnet/minecraft/util/text/TextFormatting;
      // 13f: aastore
      // 140: dup
      // 141: bipush 2
      // 142: getstatic net/minecraft/util/text/TextFormatting.RED Lnet/minecraft/util/text/TextFormatting;
      // 145: aastore
      // 146: dup
      // 147: bipush 3
      // 148: getstatic net/minecraft/util/text/TextFormatting.WHITE Lnet/minecraft/util/text/TextFormatting;
      // 14b: aastore
      // 14c: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 14f: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
      // 152: invokevirtual net/minecraft/entity/player/EntityPlayer.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V
      // 155: return
      // try (5 -> 21): 21 java/lang/RuntimeException
      // try (23 -> 39): 40 java/lang/RuntimeException
      // try (45 -> 50): 51 java/lang/RuntimeException
      // try (68 -> 78): 78 java/lang/RuntimeException
      // try (80 -> 84): 84 java/lang/RuntimeException
   }

   @Nullable
   public static cA m(UUID var0) {
      bK.b var1 = a.get(var0);

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return null;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1.c;
   }

   public static boolean e(UUID var0, cA var1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 00: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 03: aload 0
      // 04: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07: checkcast com/schnurritv/sexmod/bK$b
      // 0a: astore 2
      // 0b: aload 2
      // 0c: ifnonnull 36
      // 0f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 12: new java/lang/StringBuilder
      // 15: dup
      // 16: invokespecial java/lang/StringBuilder.<init> ()V
      // 19: ldc "tribe of UUID "
      // 1b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e: aload 0
      // 1f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 22: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25: ldc " not found uwu"
      // 27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 30: bipush 0
      // 31: ireturn
      // 32: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 35: athrow
      // 36: aload 2
      // 37: getfield com/schnurritv/sexmod/bK$b.c Lcom/schnurritv/sexmod/cA;
      // 3a: ifnonnull 43
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: aload 2
      // 44: getfield com/schnurritv/sexmod/bK$b.c Lcom/schnurritv/sexmod/cA;
      // 47: invokevirtual com/schnurritv/sexmod/cA.func_145782_y ()I
      // 4a: aload 1
      // 4b: invokevirtual com/schnurritv/sexmod/cA.func_145782_y ()I
      // 4e: if_icmpne 59
      // 51: bipush 1
      // 52: goto 5a
      // 55: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 58: athrow
      // 59: bipush 0
      // 5a: ireturn
      // try (5 -> 22): 22 java/lang/RuntimeException
      // try (24 -> 29): 29 java/lang/RuntimeException
      // try (31 -> 39): 39 java/lang/RuntimeException
   }

   public static EyeAndKoboldColor i(UUID var0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 00: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 03: aload 0
      // 04: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07: checkcast com/schnurritv/sexmod/bK$b
      // 0a: astore 1
      // 0b: aload 1
      // 0c: ifnonnull 38
      // 0f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 12: new java/lang/StringBuilder
      // 15: dup
      // 16: invokespecial java/lang/StringBuilder.<init> ()V
      // 19: ldc "tribe of UUID "
      // 1b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e: aload 0
      // 1f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 22: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25: ldc " not found uwu"
      // 27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 30: getstatic com/schnurritv/sexmod/cA.ag Lcom/schnurritv/sexmod/EyeAndKoboldColor;
      // 33: areturn
      // 34: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37: athrow
      // 38: aload 1
      // 39: getfield com/schnurritv/sexmod/bK$b.g Lcom/schnurritv/sexmod/EyeAndKoboldColor;
      // 3c: areturn
      // try (5 -> 22): 22 java/lang/RuntimeException
   }

   public static HashSet<BlockPos> q(UUID var0) {
      bK.b var1 = a.get(var0);

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return new HashSet<>();
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1.e;
   }

   public static void f(UUID var0, BlockPos var1) {
      try {
         if (var1 == null) {
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.e.add(var1);
   }

   public static void e(UUID var0, BlockPos var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.e.remove(var1);
   }

   public static HashSet<BlockPos> j(UUID var0) {
      bK.b var1 = a.get(var0);

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return null;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1.j;
   }

   public static void a(UUID var0, BlockPos var1) {
      try {
         if (var1 == null) {
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.j.add(var1);
   }

   public static void b(UUID var0, BlockPos var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.j.remove(var1);
   }

   public static HashSet<BlockPos> b(UUID var0, b5 var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return new HashSet<>();
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      try {
         if (var1 != null) {
            var2.b(var1);
            return var1.d;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      return new HashSet<>();
   }

   public static HashSet<BlockPos> d(UUID var0, BlockPos var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return new HashSet<>();
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      b5 var3 = null;

      for (b5 var5 : var2.a) {
         if (var5.d.contains(var1)) {
            var3 = var5;
            break;
         }
      }

      return b(var0, var3);
   }

   public static void a(UUID var0, b5 var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.a(var1);
   }

   public static void c(UUID var0, cA var1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 00: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 03: aload 0
      // 04: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07: checkcast com/schnurritv/sexmod/bK$b
      // 0a: astore 2
      // 0b: aload 2
      // 0c: ifnonnull 35
      // 0f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 12: new java/lang/StringBuilder
      // 15: dup
      // 16: invokespecial java/lang/StringBuilder.<init> ()V
      // 19: ldc "tribe of UUID "
      // 1b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e: aload 0
      // 1f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 22: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25: ldc " not found uwu"
      // 27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 30: return
      // 31: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 34: athrow
      // 35: aconst_null
      // 36: astore 3
      // 37: aload 2
      // 38: getfield com/schnurritv/sexmod/bK$b.a Ljava/util/Collection;
      // 3b: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 40: astore 4
      // 42: aload 4
      // 44: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 49: ifeq 67
      // 4c: aload 4
      // 4e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 53: checkcast com/schnurritv/sexmod/b5
      // 56: astore 5
      // 58: aload 5
      // 5a: aload 1
      // 5b: invokevirtual com/schnurritv/sexmod/b5.b (Lcom/schnurritv/sexmod/cA;)Z
      // 5e: ifeq 64
      // 61: aload 5
      // 63: astore 3
      // 64: goto 42
      // 67: aload 3
      // 68: ifnonnull 91
      // 6b: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 6e: new java/lang/StringBuilder
      // 71: dup
      // 72: invokespecial java/lang/StringBuilder.<init> ()V
      // 75: ldc "task of worker "
      // 77: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a: aload 1
      // 7b: invokevirtual com/schnurritv/sexmod/cA.A ()Ljava/util/UUID;
      // 7e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 81: ldc " not found uwu"
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 89: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 8c: return
      // 8d: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 90: athrow
      // 91: aload 2
      // 92: aload 3
      // 93: invokevirtual com/schnurritv/sexmod/bK$b.b (Lcom/schnurritv/sexmod/b5;)V
      // 96: return
      // try (5 -> 21): 21 java/lang/RuntimeException
      // try (43 -> 59): 59 java/lang/RuntimeException
   }

   @Nullable
   public static Collection<b5> a(UUID var0) {
      bK.b var1 = a.get(var0);

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return null;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1.a;
   }

   public static aL n(UUID var0) {
      bK.b var1 = a.get(var0);

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return aL.REST;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1.a();
   }

   public static void a(UUID var0, aL var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.a(var1);
   }

   public static int f(UUID var0) {
      bK.b var1 = a.get(var0);

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return 0;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1.e();
   }

   public static List<cA> p(UUID var0) {
      bK.b var1 = a.get(var0);

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return new ArrayList<>();
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1.i;
   }

   public static void c(UUID var0, BlockPos var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.a(var1);
   }

   @Nullable
   public static BlockPos k(UUID var0) {
      bK.b var1 = a.get(var0);

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return null;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1.b();
   }

   public static HashSet<EntityLivingBase> b(UUID var0) {
      bK.b var1 = a.get(var0);

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return new HashSet<>();
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1.g();
   }

   public static void b(UUID var0, EntityLivingBase var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.b(var1);
   }

   public static void a(UUID var0, EntityLivingBase var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.a(var1);
   }

   public static boolean e(UUID var0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 00: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 03: aload 0
      // 04: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07: checkcast com/schnurritv/sexmod/bK$b
      // 0a: astore 1
      // 0b: aload 1
      // 0c: ifnonnull 36
      // 0f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 12: new java/lang/StringBuilder
      // 15: dup
      // 16: invokespecial java/lang/StringBuilder.<init> ()V
      // 19: ldc "tribe of UUID "
      // 1b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e: aload 0
      // 1f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 22: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25: ldc " not found uwu"
      // 27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 30: bipush 0
      // 31: ireturn
      // 32: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 35: athrow
      // 36: aload 1
      // 37: getfield com/schnurritv/sexmod/bK$b.i Ljava/util/List;
      // 3a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3f: astore 2
      // 40: aload 2
      // 41: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 46: ifeq 63
      // 49: aload 2
      // 4a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4f: checkcast com/schnurritv/sexmod/cA
      // 52: astore 3
      // 53: aload 3
      // 54: invokevirtual com/schnurritv/sexmod/cA.r ()Ljava/util/UUID;
      // 57: ifnull 60
      // 5a: bipush 1
      // 5b: ireturn
      // 5c: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5f: athrow
      // 60: goto 40
      // 63: bipush 0
      // 64: ireturn
      // try (5 -> 22): 22 java/lang/RuntimeException
      // try (35 -> 40): 40 java/lang/RuntimeException
   }

   public static boolean c(UUID var0) {
      bK.b var1 = a.get(var0);

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return false;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1.b;
   }

   public static void a(UUID var0, boolean var1) {
      bK.b var2 = a.get(var0);

      try {
         if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      var2.b = var1;
   }

   @Nullable
   public static UUID g(UUID param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnonnull 0a
      // 04: aconst_null
      // 05: areturn
      // 06: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09: athrow
      // 0a: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 0d: invokevirtual java/util/HashMap.entrySet ()Ljava/util/Set;
      // 10: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 15: astore 1
      // 16: aload 1
      // 17: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1c: ifeq 76
      // 1f: aload 1
      // 20: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 25: checkcast java/util/Map$Entry
      // 28: astore 2
      // 29: aload 2
      // 2a: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 2f: checkcast com/schnurritv/sexmod/bK$b
      // 32: astore 3
      // 33: aload 3
      // 34: invokevirtual com/schnurritv/sexmod/bK$b.c ()Ljava/util/HashMap;
      // 37: invokevirtual java/util/HashMap.size ()I
      // 3a: ifne 52
      // 3d: aload 3
      // 3e: invokevirtual com/schnurritv/sexmod/bK$b.e ()I
      // 41: ifne 52
      // 44: goto 4b
      // 47: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4a: athrow
      // 4b: goto 16
      // 4e: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 51: athrow
      // 52: aload 0
      // 53: aload 2
      // 54: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 59: checkcast com/schnurritv/sexmod/bK$b
      // 5c: invokevirtual com/schnurritv/sexmod/bK$b.d ()Ljava/util/UUID;
      // 5f: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 62: ifeq 73
      // 65: aload 2
      // 66: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 6b: checkcast java/util/UUID
      // 6e: areturn
      // 6f: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 72: athrow
      // 73: goto 16
      // 76: aconst_null
      // 77: areturn
      // try (0 -> 4): 4 java/lang/RuntimeException
      // try (21 -> 28): 29 java/lang/RuntimeException
      // try (25 -> 32): 32 java/lang/RuntimeException
      // try (34 -> 45): 45 java/lang/RuntimeException
   }

   @Nullable
   public static UUID o(UUID var0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 00: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 03: aload 0
      // 04: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07: checkcast com/schnurritv/sexmod/bK$b
      // 0a: astore 1
      // 0b: aload 1
      // 0c: ifnonnull 36
      // 0f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 12: new java/lang/StringBuilder
      // 15: dup
      // 16: invokespecial java/lang/StringBuilder.<init> ()V
      // 19: ldc "tribe of UUID "
      // 1b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e: aload 0
      // 1f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 22: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25: ldc " not found uwu"
      // 27: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 30: aconst_null
      // 31: areturn
      // 32: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 35: athrow
      // 36: aload 1
      // 37: getfield com/schnurritv/sexmod/bK$b.i Ljava/util/List;
      // 3a: astore 2
      // 3b: aload 2
      // 3c: invokeinterface java/util/List.isEmpty ()Z 1
      // 41: ifeq 4a
      // 44: aconst_null
      // 45: areturn
      // 46: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 49: athrow
      // 4a: aload 2
      // 4b: bipush 0
      // 4c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 51: checkcast com/schnurritv/sexmod/cA
      // 54: astore 3
      // 55: aload 3
      // 56: invokevirtual com/schnurritv/sexmod/cA.O ()Z
      // 59: ifne 62
      // 5c: aconst_null
      // 5d: areturn
      // 5e: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 61: athrow
      // 62: aload 2
      // 63: bipush 0
      // 64: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 69: checkcast com/schnurritv/sexmod/cA
      // 6c: invokevirtual com/schnurritv/sexmod/cA.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 6f: getstatic com/schnurritv/sexmod/bi.h Lnet/minecraft/network/datasync/DataParameter;
      // 72: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 75: checkcast java/lang/String
      // 78: astore 4
      // 7a: aload 4
      // 7c: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 7f: areturn
      // try (5 -> 22): 22 java/lang/RuntimeException
      // try (27 -> 32): 32 java/lang/RuntimeException
      // try (39 -> 44): 44 java/lang/RuntimeException
   }

   public static HashSet<BlockPos> l(UUID var0) {
      bK.b var1 = a.get(var0);
      HashSet var2 = new HashSet();

      try {
         if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return var2;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      for (b5 var4 : var1.a) {
         var2.addAll(var4.d);
      }

      var2.addAll(var1.j);
      var2.addAll(var1.e);
      return var2;
   }

   public static HashMap<UUID, BlockPos> a(UUID var0, World var1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
      //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
      //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
      //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
      //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
      //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
      //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
      //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
      //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
      //
      // Bytecode:
      // 000: getstatic com/schnurritv/sexmod/bK.a Ljava/util/HashMap;
      // 003: aload 0
      // 004: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 007: checkcast com/schnurritv/sexmod/bK$b
      // 00a: astore 2
      // 00b: aload 2
      // 00c: ifnonnull 03c
      // 00f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 012: new java/lang/StringBuilder
      // 015: dup
      // 016: invokespecial java/lang/StringBuilder.<init> ()V
      // 019: ldc "tribe of UUID "
      // 01b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 01e: aload 0
      // 01f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 022: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 025: ldc " not found uwu"
      // 027: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 02d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 030: new java/util/HashMap
      // 033: dup
      // 034: invokespecial java/util/HashMap.<init> ()V
      // 037: areturn
      // 038: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03b: athrow
      // 03c: aload 2
      // 03d: getfield com/schnurritv/sexmod/bK$b.m Ljava/util/HashMap;
      // 040: astore 3
      // 041: new java/util/ArrayList
      // 044: dup
      // 045: invokespecial java/util/ArrayList.<init> ()V
      // 048: astore 4
      // 04a: aload 3
      // 04b: invokevirtual java/util/HashMap.entrySet ()Ljava/util/Set;
      // 04e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 053: astore 5
      // 055: aload 5
      // 057: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05c: ifeq 112
      // 05f: aload 5
      // 061: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 066: checkcast java/util/Map$Entry
      // 069: astore 6
      // 06b: aload 6
      // 06d: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 072: checkcast net/minecraft/util/math/BlockPos
      // 075: astore 7
      // 077: aload 6
      // 079: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 07e: checkcast java/util/UUID
      // 081: astore 8
      // 083: aload 1
      // 084: aload 7
      // 086: bipush 5
      // 087: invokevirtual net/minecraft/world/World.func_175697_a (Lnet/minecraft/util/math/BlockPos;I)Z
      // 08a: ifne 094
      // 08d: goto 055
      // 090: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 093: athrow
      // 094: new net/minecraft/util/math/AxisAlignedBB
      // 097: dup
      // 098: aload 7
      // 09a: new net/minecraft/util/math/Vec3i
      // 09d: dup
      // 09e: bipush -3
      // 0a0: bipush -3
      // 0a2: bipush -3
      // 0a4: invokespecial net/minecraft/util/math/Vec3i.<init> (III)V
      // 0a7: invokevirtual net/minecraft/util/math/BlockPos.func_177973_b (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
      // 0aa: aload 7
      // 0ac: bipush 3
      // 0ad: bipush 3
      // 0ae: bipush 3
      // 0af: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
      // 0b2: invokespecial net/minecraft/util/math/AxisAlignedBB.<init> (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)V
      // 0b5: astore 9
      // 0b7: aload 1
      // 0b8: ldc com/schnurritv/sexmod/cA
      // 0ba: aload 9
      // 0bc: invokevirtual net/minecraft/world/World.func_72872_a (Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
      // 0bf: astore 10
      // 0c1: bipush 0
      // 0c2: istore 11
      // 0c4: aload 10
      // 0c6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0cb: astore 12
      // 0cd: aload 12
      // 0cf: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d4: ifeq 0f9
      // 0d7: aload 12
      // 0d9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0de: checkcast com/schnurritv/sexmod/cA
      // 0e1: astore 13
      // 0e3: aload 8
      // 0e5: aload 13
      // 0e7: invokevirtual com/schnurritv/sexmod/cA.A ()Ljava/util/UUID;
      // 0ea: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 0ed: ifeq 0f6
      // 0f0: bipush 1
      // 0f1: istore 11
      // 0f3: goto 0f9
      // 0f6: goto 0cd
      // 0f9: iload 11
      // 0fb: ifne 10f
      // 0fe: aload 4
      // 100: aload 8
      // 102: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 107: pop
      // 108: goto 10f
      // 10b: invokestatic com/schnurritv/sexmod/bK.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10e: athrow
      // 10f: goto 055
      // 112: aload 4
      // 114: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 119: astore 5
      // 11b: aload 5
      // 11d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 122: ifeq 143
      // 125: aload 5
      // 127: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12c: checkcast java/util/UUID
      // 12f: astore 6
      // 131: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 134: ldc "fail save of non existant members was called"
      // 136: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 139: aload 3
      // 13a: aload 6
      // 13c: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 13f: pop
      // 140: goto 11b
      // 143: aload 2
      // 144: aload 3
      // 145: putfield com/schnurritv/sexmod/bK$b.m Ljava/util/HashMap;
      // 148: aload 3
      // 149: areturn
      // try (5 -> 24): 24 java/lang/RuntimeException
      // try (52 -> 58): 58 java/lang/RuntimeException
      // try (103 -> 109): 110 java/lang/RuntimeException
   }

   public static void a(UUID var0, UUID var1, BlockPos var2) {
      bK.b var3 = a.get(var0);

      try {
         if (var3 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      var3.a(var1, var2);
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   public static class a extends WorldSavedData {
      public a(String var1) {
         super(var1);
      }

      @SubscribeEvent
      public void a(Save var1) {
         World var2 = var1.getWorld();
         var2.func_175693_T().func_75745_a("tribes", this);
         this.func_76185_a();
      }

      @SubscribeEvent
      public void a(Load var1) {
         World var2 = var1.getWorld();
         var2.func_175693_T().func_75742_a(bK.a.class, "tribes");
      }

      @SubscribeEvent
      public void a(PlayerSleepInBedEvent var1) {
         try {
            if (bK.a(var1.getPos())) {
               var1.setResult(SleepResult.OTHER_PROBLEM);
            }
         } catch (RuntimeException var2) {
            throw a(var2);
         }
      }

      @SubscribeEvent
      public void a(PlaceEvent var1) {
         BlockPos var2 = var1.getPos();
         IBlockState var3 = var1.getState();
         World var4 = var1.getWorld();

         try {
            if (var4.field_72995_K) {
               return;
            }
         } catch (RuntimeException var12) {
            throw a(var12);
         }

         try {
            if (!(var3.func_177230_c() instanceof BlockChest)) {
               return;
            }
         } catch (RuntimeException var21) {
            throw a(var21);
         }

         Type var5 = ((BlockChest)var4.func_180495_p(var2).func_177230_c()).field_149956_a;
         BlockPos var6 = null;

         label115: {
            try {
               if (!(var4.func_180495_p(var2.func_177978_c()).func_177230_c() instanceof BlockChest)
                  || !var5.equals(((BlockChest)var4.func_180495_p(var2.func_177978_c()).func_177230_c()).field_149956_a)) {
                  break label115;
               }
            } catch (RuntimeException var20) {
               throw a(var20);
            }

            var6 = var2.func_177978_c();
         }

         label108: {
            try {
               if (!(var4.func_180495_p(var2.func_177974_f()).func_177230_c() instanceof BlockChest)
                  || !var5.equals(((BlockChest)var4.func_180495_p(var2.func_177974_f()).func_177230_c()).field_149956_a)) {
                  break label108;
               }
            } catch (RuntimeException var19) {
               throw a(var19);
            }

            var6 = var2.func_177974_f();
         }

         label101: {
            try {
               if (!(var4.func_180495_p(var2.func_177968_d()).func_177230_c() instanceof BlockChest)
                  || !var5.equals(((BlockChest)var4.func_180495_p(var2.func_177968_d()).func_177230_c()).field_149956_a)) {
                  break label101;
               }
            } catch (RuntimeException var18) {
               throw a(var18);
            }

            var6 = var2.func_177968_d();
         }

         label94: {
            try {
               if (!(var4.func_180495_p(var2.func_177976_e()).func_177230_c() instanceof BlockChest)
                  || !var5.equals(((BlockChest)var4.func_180495_p(var2.func_177976_e()).func_177230_c()).field_149956_a)) {
                  break label94;
               }
            } catch (RuntimeException var17) {
               throw a(var17);
            }

            var6 = var2.func_177976_e();
         }

         try {
            if (var6 == null) {
               return;
            }
         } catch (RuntimeException var16) {
            throw a(var16);
         }

         for (Entry var8 : bK.a.entrySet()) {
            bK.b var9 = (bK.b)var8.getValue();

            try {
               if (!var9.j.contains(var6)) {
                  continue;
               }
            } catch (RuntimeException var15) {
               throw a(var15);
            }

            var9.j.add(var2);
            UUID var10 = bK.o((UUID)var8.getKey());

            try {
               if (var10 == null) {
                  continue;
               }
            } catch (RuntimeException var14) {
               throw a(var14);
            }

            EntityPlayerMP var11 = (EntityPlayerMP)var4.func_152378_a(var10);

            try {
               if (var11 == null) {
                  continue;
               }
            } catch (RuntimeException var13) {
               throw a(var13);
            }

            at.a.sendTo(new aR(var2, true), var11);
         }
      }

      @SubscribeEvent
      public void a(EntityJoinWorldEvent var1) {
         Entity var2 = var1.getEntity();
         if (var2 instanceof EntityZombie) {
            EntityZombie var3 = (EntityZombie)var2;
            var3.field_70715_bh.func_75776_a(3, new ax(var3, true, false));
         }

         if (var2 instanceof AbstractSkeleton) {
            AbstractSkeleton var4 = (AbstractSkeleton)var2;
            var4.field_70715_bh.func_75776_a(3, new ax(var4, true, false));
         }

         if (var2 instanceof EntitySpider) {
            EntitySpider var5 = (EntitySpider)var2;
            var5.field_70715_bh.func_75776_a(3, new ax(var5, true, true));
         }
      }

      @SubscribeEvent
      public void a(BreakEvent var1) {
         BlockPos var2 = var1.getPos();
         World var3 = var1.getWorld();

         try {
            if (var3.field_72995_K) {
               return;
            }
         } catch (RuntimeException var13) {
            throw a(var13);
         }

         IBlockState var4 = var3.func_180495_p(var2);
         Block var5 = var4.func_177230_c();
         if (var5 instanceof BlockChest) {
            for (Entry var7 : bK.a.entrySet()) {
               bK.b var8 = (bK.b)var7.getValue();

               try {
                  if (!var8.j.contains(var2)) {
                     continue;
                  }
               } catch (RuntimeException var19) {
                  throw a(var19);
               }

               var8.j.remove(var2);
               UUID var9 = bK.o((UUID)var7.getKey());

               try {
                  if (var9 == null) {
                     continue;
                  }
               } catch (RuntimeException var18) {
                  throw a(var18);
               }

               EntityPlayerMP var10 = (EntityPlayerMP)var3.func_152378_a(var9);

               try {
                  if (var10 == null) {
                     continue;
                  }
               } catch (RuntimeException var17) {
                  throw a(var17);
               }

               at.a.sendTo(new aR(var2, false), var10);
            }
         }

         if (var5 instanceof BlockBed) {
            for (Entry var21 : bK.a.entrySet()) {
               bK.b var22 = (bK.b)var21.getValue();

               try {
                  if (!var22.e.contains(var2)) {
                     continue;
                  }
               } catch (RuntimeException var16) {
                  throw a(var16);
               }

               BlockPos var23 = b1.a(var2, var4);
               var22.e.remove(var2);
               var22.e.remove(var23);
               UUID var24 = bK.o((UUID)var21.getKey());

               try {
                  if (var24 == null) {
                     continue;
                  }
               } catch (RuntimeException var15) {
                  throw a(var15);
               }

               EntityPlayerMP var11 = (EntityPlayerMP)var3.func_152378_a(var24);

               try {
                  if (var11 == null) {
                     continue;
                  }
               } catch (RuntimeException var14) {
                  throw a(var14);
               }

               HashSet var12 = new HashSet();
               var12.add(var2);
               var12.add(var23);
               at.a.sendTo(new aR(var12, false), var11);
            }
         }
      }

      String a(String var1, NBTTagCompound var2) {
         String var3 = var2.func_74779_i(var1);
         var2.func_74778_a(var1, "");
         return var3;
      }

      public void func_76184_a(NBTTagCompound var1) {
         int var2 = 0;

         while (true) {
            String var3 = this.a("tribeId" + var2, var1);

            try {
               if ("".equals(var3)) {
                  return;
               }
            } catch (RuntimeException var29) {
               throw a(var29);
            }

            UUID var4 = UUID.fromString(var3);
            EyeAndKoboldColor var5 = EyeAndKoboldColor.valueOf(this.a("tribeColor" + var2, var1));
            bK.a(var4, var5);
            String var6 = this.a("tribeMaster" + var2, var1);

            try {
               if (!"".equals(var6)) {
                  bK.a(var4, UUID.fromString(var6));
               }
            } catch (RuntimeException var28) {
               throw a(var28);
            }

            int var7 = 0;

            while (true) {
               String var8 = this.a(var4.toString() + "member" + var7 + "pos", var1);

               try {
                  if ("".equals(var8)) {
                     break;
                  }
               } catch (RuntimeException var27) {
                  throw a(var27);
               }

               String var9 = this.a(var4.toString() + "member" + var7 + "id", var1);

               try {
                  if ("".equals(var9)) {
                     break;
                  }
               } catch (RuntimeException var26) {
                  throw a(var26);
               }

               String[] var10 = var8.split("\\|");
               BlockPos var11 = new BlockPos(Integer.parseInt(var10[0]), Integer.parseInt(var10[1]), Integer.parseInt(var10[2]));
               UUID var12 = UUID.fromString(var9);
               bK.a(var4, var12, var11);
               var7++;
            }

            int var30 = 0;

            while (true) {
               String var31 = this.a(var4.toString() + "bed" + var30, var1);

               try {
                  if ("".equals(var31)) {
                     break;
                  }
               } catch (RuntimeException var25) {
                  throw a(var25);
               }

               String[] var33 = var31.split("\\|");
               BlockPos var36 = new BlockPos(Integer.parseInt(var33[0]), Integer.parseInt(var33[1]), Integer.parseInt(var33[2]));
               bK.f(var4, var36);
               var30++;
            }

            int var32 = 0;

            while (true) {
               String var34 = this.a(var4.toString() + "chest" + var32, var1);

               try {
                  if ("".equals(var34)) {
                     break;
                  }
               } catch (RuntimeException var24) {
                  throw a(var24);
               }

               String[] var37 = var34.split("\\|");
               BlockPos var39 = new BlockPos(Integer.parseInt(var37[0]), Integer.parseInt(var37[1]), Integer.parseInt(var37[2]));
               bK.a(var4, var39);
               var32++;
            }

            int var35 = 0;

            label82:
            while (true) {
               String var38 = this.a(var4.toString() + var35 + "taskKind", var1);

               label132: {
                  try {
                     if ("".equals(var38)) {
                        break label132;
                     }
                  } catch (RuntimeException var23) {
                     throw a(var23);
                  }

                  String var40 = this.a(var4.toString() + var35 + "facing", var1);
                  EnumFacing var13 = EnumFacing.NORTH;
                  if (!"".equals(var40)) {
                     var13 = EnumFacing.func_176739_a(var40);
                  }

                  String var14 = this.a(var4.toString() + var35 + "pos", var1);
                  String[] var15 = var14.split("\\|");
                  BlockPos var16 = new BlockPos(Integer.parseInt(var15[0]), Integer.parseInt(var15[1]), Integer.parseInt(var15[2]));
                  HashSet var17 = new HashSet();
                  int var18 = 0;

                  while (true) {
                     String var19 = this.a(var4.toString() + var35 + "block" + var18, var1);

                     label70: {
                        try {
                           if (!"".equals(var19)) {
                              break label70;
                           }
                        } catch (RuntimeException var22) {
                           throw a(var22);
                        }

                        bK.a(var4, new b5(var16, b5.a.valueOf(var38), var17, var13));
                        var35++;
                        continue label82;
                     }

                     String[] var20 = var19.split("\\|");
                     BlockPos var21 = new BlockPos(Integer.parseInt(var20[0]), Integer.parseInt(var20[1]), Integer.parseInt(var20[2]));
                     var17.add(var21);
                     var18++;
                  }
               }

               var2++;
               break;
            }
         }
      }

      public NBTTagCompound func_189551_b(NBTTagCompound var1) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.StackOverflowError
         //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
         //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
         //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
         //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
         //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
         //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
         //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
         //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
         //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
         //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
         //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
         //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
         //
         // Bytecode:
         // 000: bipush 0
         // 001: istore 2
         // 002: invokestatic com/schnurritv/sexmod/bK.access$000 ()Ljava/util/HashMap;
         // 005: invokevirtual java/util/HashMap.entrySet ()Ljava/util/Set;
         // 008: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
         // 00d: astore 3
         // 00e: aload 3
         // 00f: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 014: ifeq 489
         // 017: aload 3
         // 018: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 01d: checkcast java/util/Map$Entry
         // 020: astore 4
         // 022: aload 4
         // 024: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
         // 029: checkcast com/schnurritv/sexmod/bK$b
         // 02c: astore 5
         // 02e: aload 4
         // 030: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
         // 035: checkcast java/util/UUID
         // 038: astore 6
         // 03a: aload 5
         // 03c: invokevirtual com/schnurritv/sexmod/bK$b.d ()Ljava/util/UUID;
         // 03f: astore 7
         // 041: aload 1
         // 042: new java/lang/StringBuilder
         // 045: dup
         // 046: invokespecial java/lang/StringBuilder.<init> ()V
         // 049: ldc "tribeId"
         // 04b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 04e: iload 2
         // 04f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 052: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 055: aload 6
         // 057: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 05a: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 05d: aload 1
         // 05e: new java/lang/StringBuilder
         // 061: dup
         // 062: invokespecial java/lang/StringBuilder.<init> ()V
         // 065: ldc "tribeColor"
         // 067: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 06a: iload 2
         // 06b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 06e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 071: aload 5
         // 073: getfield com/schnurritv/sexmod/bK$b.g Lcom/schnurritv/sexmod/EyeAndKoboldColor;
         // 076: invokevirtual com/schnurritv/sexmod/EyeAndKoboldColor.toString ()Ljava/lang/String;
         // 079: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 07c: aload 7
         // 07e: ifnull 0a4
         // 081: aload 1
         // 082: new java/lang/StringBuilder
         // 085: dup
         // 086: invokespecial java/lang/StringBuilder.<init> ()V
         // 089: ldc "tribeMaster"
         // 08b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 08e: iload 2
         // 08f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 092: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 095: aload 7
         // 097: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 09a: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 09d: goto 0a4
         // 0a0: invokestatic com/schnurritv/sexmod/bK$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 0a3: athrow
         // 0a4: bipush 0
         // 0a5: istore 8
         // 0a7: new java/util/HashSet
         // 0aa: dup
         // 0ab: invokespecial java/util/HashSet.<init> ()V
         // 0ae: astore 9
         // 0b0: aload 5
         // 0b2: getfield com/schnurritv/sexmod/bK$b.i Ljava/util/List;
         // 0b5: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
         // 0ba: astore 10
         // 0bc: aload 10
         // 0be: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 0c3: ifeq 178
         // 0c6: aload 10
         // 0c8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 0cd: checkcast com/schnurritv/sexmod/cA
         // 0d0: astore 11
         // 0d2: aload 11
         // 0d4: getfield com/schnurritv/sexmod/cA.field_70128_L Z
         // 0d7: ifeq 0e1
         // 0da: goto 0bc
         // 0dd: invokestatic com/schnurritv/sexmod/bK$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 0e0: athrow
         // 0e1: aload 11
         // 0e3: invokevirtual com/schnurritv/sexmod/cA.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
         // 0e6: astore 12
         // 0e8: aload 11
         // 0ea: invokevirtual com/schnurritv/sexmod/cA.A ()Ljava/util/UUID;
         // 0ed: astore 13
         // 0ef: aload 1
         // 0f0: new java/lang/StringBuilder
         // 0f3: dup
         // 0f4: invokespecial java/lang/StringBuilder.<init> ()V
         // 0f7: aload 6
         // 0f9: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 0fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 0ff: ldc "member"
         // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 104: iload 8
         // 106: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 109: ldc "pos"
         // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 10e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 111: new java/lang/StringBuilder
         // 114: dup
         // 115: invokespecial java/lang/StringBuilder.<init> ()V
         // 118: aload 12
         // 11a: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
         // 11d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 120: ldc "|"
         // 122: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 125: aload 12
         // 127: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
         // 12a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 12d: ldc "|"
         // 12f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 132: aload 12
         // 134: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
         // 137: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 13a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 13d: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 140: aload 1
         // 141: new java/lang/StringBuilder
         // 144: dup
         // 145: invokespecial java/lang/StringBuilder.<init> ()V
         // 148: aload 6
         // 14a: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 150: ldc "member"
         // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 155: iload 8
         // 157: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 15a: ldc "id"
         // 15c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 15f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 162: aload 13
         // 164: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 167: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 16a: aload 9
         // 16c: aload 13
         // 16e: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
         // 171: pop
         // 172: iinc 8 1
         // 175: goto 0bc
         // 178: aload 5
         // 17a: getfield com/schnurritv/sexmod/bK$b.m Ljava/util/HashMap;
         // 17d: invokevirtual java/util/HashMap.entrySet ()Ljava/util/Set;
         // 180: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
         // 185: astore 10
         // 187: aload 10
         // 189: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 18e: ifeq 24f
         // 191: aload 10
         // 193: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 198: checkcast java/util/Map$Entry
         // 19b: astore 11
         // 19d: aload 11
         // 19f: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
         // 1a4: checkcast java/util/UUID
         // 1a7: astore 12
         // 1a9: aload 11
         // 1ab: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
         // 1b0: checkcast net/minecraft/util/math/BlockPos
         // 1b3: astore 13
         // 1b5: aload 9
         // 1b7: aload 12
         // 1b9: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
         // 1bc: ifeq 1c6
         // 1bf: goto 187
         // 1c2: invokestatic com/schnurritv/sexmod/bK$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 1c5: athrow
         // 1c6: aload 1
         // 1c7: new java/lang/StringBuilder
         // 1ca: dup
         // 1cb: invokespecial java/lang/StringBuilder.<init> ()V
         // 1ce: aload 6
         // 1d0: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 1d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 1d6: ldc "member"
         // 1d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 1db: iload 8
         // 1dd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 1e0: ldc "pos"
         // 1e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 1e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 1e8: new java/lang/StringBuilder
         // 1eb: dup
         // 1ec: invokespecial java/lang/StringBuilder.<init> ()V
         // 1ef: aload 13
         // 1f1: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
         // 1f4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 1f7: ldc "|"
         // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 1fc: aload 13
         // 1fe: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
         // 201: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 204: ldc "|"
         // 206: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 209: aload 13
         // 20b: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
         // 20e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 211: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 214: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 217: aload 1
         // 218: new java/lang/StringBuilder
         // 21b: dup
         // 21c: invokespecial java/lang/StringBuilder.<init> ()V
         // 21f: aload 6
         // 221: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 224: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 227: ldc "member"
         // 229: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 22c: iload 8
         // 22e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 231: ldc "id"
         // 233: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 236: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 239: aload 12
         // 23b: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 23e: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 241: aload 9
         // 243: aload 12
         // 245: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
         // 248: pop
         // 249: iinc 8 1
         // 24c: goto 187
         // 24f: bipush 0
         // 250: istore 10
         // 252: aload 5
         // 254: getfield com/schnurritv/sexmod/bK$b.e Ljava/util/HashSet;
         // 257: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
         // 25a: astore 11
         // 25c: aload 11
         // 25e: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 263: ifeq 2c4
         // 266: aload 11
         // 268: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 26d: checkcast net/minecraft/util/math/BlockPos
         // 270: astore 12
         // 272: aload 1
         // 273: new java/lang/StringBuilder
         // 276: dup
         // 277: invokespecial java/lang/StringBuilder.<init> ()V
         // 27a: aload 6
         // 27c: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 27f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 282: ldc "bed"
         // 284: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 287: iload 10
         // 289: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 28c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 28f: new java/lang/StringBuilder
         // 292: dup
         // 293: invokespecial java/lang/StringBuilder.<init> ()V
         // 296: aload 12
         // 298: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
         // 29b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 29e: ldc "|"
         // 2a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 2a3: aload 12
         // 2a5: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
         // 2a8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 2ab: ldc "|"
         // 2ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 2b0: aload 12
         // 2b2: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
         // 2b5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 2b8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 2bb: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 2be: iinc 10 1
         // 2c1: goto 25c
         // 2c4: bipush 0
         // 2c5: istore 11
         // 2c7: aload 5
         // 2c9: getfield com/schnurritv/sexmod/bK$b.j Ljava/util/HashSet;
         // 2cc: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
         // 2cf: astore 12
         // 2d1: aload 12
         // 2d3: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 2d8: ifeq 339
         // 2db: aload 12
         // 2dd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 2e2: checkcast net/minecraft/util/math/BlockPos
         // 2e5: astore 13
         // 2e7: aload 1
         // 2e8: new java/lang/StringBuilder
         // 2eb: dup
         // 2ec: invokespecial java/lang/StringBuilder.<init> ()V
         // 2ef: aload 6
         // 2f1: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 2f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 2f7: ldc "chest"
         // 2f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 2fc: iload 11
         // 2fe: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 301: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 304: new java/lang/StringBuilder
         // 307: dup
         // 308: invokespecial java/lang/StringBuilder.<init> ()V
         // 30b: aload 13
         // 30d: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
         // 310: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 313: ldc "|"
         // 315: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 318: aload 13
         // 31a: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
         // 31d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 320: ldc "|"
         // 322: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 325: aload 13
         // 327: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
         // 32a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 32d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 330: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 333: iinc 11 1
         // 336: goto 2d1
         // 339: bipush 0
         // 33a: istore 12
         // 33c: aload 5
         // 33e: getfield com/schnurritv/sexmod/bK$b.a Ljava/util/Collection;
         // 341: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
         // 346: astore 13
         // 348: aload 13
         // 34a: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 34f: ifeq 483
         // 352: aload 13
         // 354: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 359: checkcast com/schnurritv/sexmod/b5
         // 35c: astore 14
         // 35e: aload 1
         // 35f: new java/lang/StringBuilder
         // 362: dup
         // 363: invokespecial java/lang/StringBuilder.<init> ()V
         // 366: aload 6
         // 368: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 36b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 36e: iload 12
         // 370: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 373: ldc "taskKind"
         // 375: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 378: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 37b: aload 14
         // 37d: getfield com/schnurritv/sexmod/b5.e Lcom/schnurritv/sexmod/b5$a;
         // 380: invokevirtual com/schnurritv/sexmod/b5$a.toString ()Ljava/lang/String;
         // 383: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 386: aload 1
         // 387: new java/lang/StringBuilder
         // 38a: dup
         // 38b: invokespecial java/lang/StringBuilder.<init> ()V
         // 38e: aload 6
         // 390: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 393: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 396: iload 12
         // 398: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 39b: ldc "pos"
         // 39d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 3a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 3a3: new java/lang/StringBuilder
         // 3a6: dup
         // 3a7: invokespecial java/lang/StringBuilder.<init> ()V
         // 3aa: aload 14
         // 3ac: getfield com/schnurritv/sexmod/b5.a Lnet/minecraft/util/math/BlockPos;
         // 3af: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
         // 3b2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 3b5: ldc "|"
         // 3b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 3ba: aload 14
         // 3bc: getfield com/schnurritv/sexmod/b5.a Lnet/minecraft/util/math/BlockPos;
         // 3bf: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
         // 3c2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 3c5: ldc "|"
         // 3c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 3ca: aload 14
         // 3cc: getfield com/schnurritv/sexmod/b5.a Lnet/minecraft/util/math/BlockPos;
         // 3cf: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
         // 3d2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 3d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 3d8: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 3db: aload 1
         // 3dc: new java/lang/StringBuilder
         // 3df: dup
         // 3e0: invokespecial java/lang/StringBuilder.<init> ()V
         // 3e3: aload 6
         // 3e5: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 3e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 3eb: iload 12
         // 3ed: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 3f0: ldc "facing"
         // 3f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 3f5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 3f8: aload 14
         // 3fa: getfield com/schnurritv/sexmod/b5.c Lnet/minecraft/util/EnumFacing;
         // 3fd: invokevirtual net/minecraft/util/EnumFacing.func_176610_l ()Ljava/lang/String;
         // 400: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 403: bipush 0
         // 404: istore 15
         // 406: aload 14
         // 408: getfield com/schnurritv/sexmod/b5.d Ljava/util/HashSet;
         // 40b: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
         // 40e: astore 16
         // 410: aload 16
         // 412: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 417: ifeq 47d
         // 41a: aload 16
         // 41c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 421: checkcast net/minecraft/util/math/BlockPos
         // 424: astore 17
         // 426: aload 1
         // 427: new java/lang/StringBuilder
         // 42a: dup
         // 42b: invokespecial java/lang/StringBuilder.<init> ()V
         // 42e: aload 6
         // 430: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
         // 433: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 436: iload 12
         // 438: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 43b: ldc "block"
         // 43d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 440: iload 15
         // 442: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 445: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 448: new java/lang/StringBuilder
         // 44b: dup
         // 44c: invokespecial java/lang/StringBuilder.<init> ()V
         // 44f: aload 17
         // 451: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
         // 454: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 457: ldc "|"
         // 459: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 45c: aload 17
         // 45e: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
         // 461: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 464: ldc "|"
         // 466: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 469: aload 17
         // 46b: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
         // 46e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
         // 471: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 474: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74778_a (Ljava/lang/String;Ljava/lang/String;)V
         // 477: iinc 15 1
         // 47a: goto 410
         // 47d: iinc 12 1
         // 480: goto 348
         // 483: iinc 2 1
         // 486: goto 00e
         // 489: aload 1
         // 48a: areturn
         // try (24 -> 63): 64 java/lang/RuntimeException
         // try (83 -> 87): 87 java/lang/RuntimeException
         // try (170 -> 175): 175 java/lang/RuntimeException
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }

   public static class b {
      UUID h;
      UUID f;
      cA c;
      List<cA> i;
      EyeAndKoboldColor g;
      aL k = aL.REST;
      BlockPos d = null;
      Collection<b5> a = new ArrayList<>();
      HashSet<EntityLivingBase> l = new HashSet<>();
      HashSet<BlockPos> j = new HashSet<>();
      HashSet<BlockPos> e = new HashSet<>();
      HashMap<UUID, BlockPos> m = new HashMap<>();
      boolean b = false;

      public b(UUID var1, EyeAndKoboldColor var2, cA var3, List<cA> var4) {
         this.h = var1;
         this.g = var2;
         this.c = var3;
         this.i = var4;
      }

      public b(UUID var1, EyeAndKoboldColor var2) {
         this.h = var1;
         this.g = var2;
         this.i = new ArrayList<>();
      }

      public void a(UUID var1) {
         this.f = var1;
      }

      public UUID d() {
         return this.f;
      }

      public void b(b5 param1) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
         //
         // Bytecode:
         // 00: aload 0
         // 01: getfield com/schnurritv/sexmod/bK$b.a Ljava/util/Collection;
         // 04: aload 1
         // 05: invokeinterface java/util/Collection.contains (Ljava/lang/Object;)Z 2
         // 0a: ifne 12
         // 0d: return
         // 0e: invokestatic com/schnurritv/sexmod/bK$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 11: athrow
         // 12: aload 1
         // 13: getfield com/schnurritv/sexmod/b5.f Ljava/util/List;
         // 16: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
         // 1b: astore 2
         // 1c: aload 2
         // 1d: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 22: ifeq 51
         // 25: aload 2
         // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 2b: checkcast com/schnurritv/sexmod/cA
         // 2e: astore 3
         // 2f: aload 3
         // 30: getstatic com/schnurritv/sexmod/bj.NULL Lcom/schnurritv/sexmod/bj;
         // 33: invokevirtual com/schnurritv/sexmod/cA.b (Lcom/schnurritv/sexmod/bj;)V
         // 36: aload 3
         // 37: bipush 0
         // 38: invokevirtual com/schnurritv/sexmod/cA.func_189654_d (Z)V
         // 3b: aload 3
         // 3c: bipush 0
         // 3d: putfield com/schnurritv/sexmod/cA.field_70145_X Z
         // 40: aload 3
         // 41: invokevirtual com/schnurritv/sexmod/cA.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
         // 44: getstatic com/schnurritv/sexmod/bi.z Lnet/minecraft/network/datasync/DataParameter;
         // 47: bipush 0
         // 48: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 4b: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
         // 4e: goto 1c
         // 51: aload 0
         // 52: getfield com/schnurritv/sexmod/bK$b.a Ljava/util/Collection;
         // 55: aload 1
         // 56: invokeinterface java/util/Collection.remove (Ljava/lang/Object;)Z 2
         // 5b: pop
         // 5c: aload 1
         // 5d: getfield com/schnurritv/sexmod/b5.d Ljava/util/HashSet;
         // 60: invokevirtual java/util/HashSet.isEmpty ()Z
         // 63: ifne 74
         // 66: aload 0
         // 67: getfield com/schnurritv/sexmod/bK$b.f Ljava/util/UUID;
         // 6a: ifnonnull 79
         // 6d: goto 74
         // 70: invokestatic com/schnurritv/sexmod/bK$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 73: athrow
         // 74: return
         // 75: invokestatic com/schnurritv/sexmod/bK$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 78: athrow
         // 79: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
         // 7c: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
         // 7f: invokevirtual net/minecraft/server/MinecraftServer.func_184103_al ()Lnet/minecraft/server/management/PlayerList;
         // 82: aload 0
         // 83: getfield com/schnurritv/sexmod/bK$b.f Ljava/util/UUID;
         // 86: invokevirtual net/minecraft/server/management/PlayerList.func_177451_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayerMP;
         // 89: astore 2
         // 8a: aload 2
         // 8b: ifnonnull 93
         // 8e: return
         // 8f: invokestatic com/schnurritv/sexmod/bK$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 92: athrow
         // 93: getstatic com/schnurritv/sexmod/at.a Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
         // 96: new com/schnurritv/sexmod/aR
         // 99: dup
         // 9a: aload 1
         // 9b: getfield com/schnurritv/sexmod/b5.d Ljava/util/HashSet;
         // 9e: bipush 0
         // 9f: invokespecial com/schnurritv/sexmod/aR.<init> (Ljava/util/HashSet;Z)V
         // a2: aload 2
         // a3: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
         // a6: return
         // try (0 -> 6): 6 java/lang/RuntimeException
         // try (35 -> 47): 48 java/lang/RuntimeException
         // try (44 -> 51): 51 java/lang/RuntimeException
         // try (60 -> 63): 63 java/lang/RuntimeException
      }

      public HashMap<UUID, BlockPos> c() {
         return this.m;
      }

      public void a(UUID var1, BlockPos var2) {
         this.m.put(var1, var2);
      }

      public void b(UUID var1) {
         this.m.remove(var1);
      }

      public void a(EntityLivingBase var1) {
         this.l.remove(var1);
      }

      public void b(EntityLivingBase var1) {
         this.l.add(var1);
      }

      public HashSet<EntityLivingBase> g() {
         return this.l;
      }

      public int e() {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.StackOverflowError
         //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
         //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
         //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
         //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
         //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
         //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
         //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
         //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
         //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
         //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
         //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
         //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
         //
         // Bytecode:
         // 00: new java/util/HashSet
         // 03: dup
         // 04: invokespecial java/util/HashSet.<init> ()V
         // 07: astore 1
         // 08: aload 0
         // 09: getfield com/schnurritv/sexmod/bK$b.i Ljava/util/List;
         // 0c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
         // 11: astore 2
         // 12: aload 2
         // 13: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 18: ifeq 31
         // 1b: aload 2
         // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 21: checkcast com/schnurritv/sexmod/cA
         // 24: astore 3
         // 25: aload 1
         // 26: aload 3
         // 27: invokevirtual com/schnurritv/sexmod/cA.A ()Ljava/util/UUID;
         // 2a: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
         // 2d: pop
         // 2e: goto 12
         // 31: aload 0
         // 32: getfield com/schnurritv/sexmod/bK$b.m Ljava/util/HashMap;
         // 35: invokevirtual java/util/HashMap.entrySet ()Ljava/util/Set;
         // 38: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
         // 3d: astore 2
         // 3e: aload 2
         // 3f: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 44: ifeq 5f
         // 47: aload 2
         // 48: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 4d: checkcast java/util/Map$Entry
         // 50: astore 3
         // 51: aload 1
         // 52: aload 3
         // 53: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
         // 58: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
         // 5b: pop
         // 5c: goto 3e
         // 5f: aload 1
         // 60: invokevirtual java/util/HashSet.size ()I
         // 63: ireturn
      }

      public BlockPos b() {
         return this.d;
      }

      public void a(BlockPos var1) {
         this.d = var1;
      }

      public void a(b5 var1) {
         this.a.add(var1);
      }

      public aL a() {
         return this.k;
      }

      public void a(aL var1) {
         this.k = var1;
      }

      public void a(cA var1) {
         try {
            if (!this.i.contains(var1)) {
               this.i.add(var1);
            }
         } catch (RuntimeException var2) {
            throw a(var2);
         }
      }

      public void b(cA var1) {
         this.i.remove(var1);
      }

      cA f() {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.StackOverflowError
         //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
         //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
         //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
         //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:41)
         //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
         //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
         //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
         //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
         //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
         //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
         //
         // Bytecode:
         // 00: aconst_null
         // 01: astore 1
         // 02: aload 0
         // 03: getfield com/schnurritv/sexmod/bK$b.i Ljava/util/List;
         // 06: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
         // 0b: astore 2
         // 0c: aload 2
         // 0d: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 12: ifeq 67
         // 15: aload 2
         // 16: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 1b: checkcast com/schnurritv/sexmod/cA
         // 1e: astore 3
         // 1f: aload 3
         // 20: getfield com/schnurritv/sexmod/cA.field_70128_L Z
         // 23: ifeq 2d
         // 26: goto 0c
         // 29: invokestatic com/schnurritv/sexmod/bK$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 2c: athrow
         // 2d: aload 1
         // 2e: ifnonnull 36
         // 31: aload 3
         // 32: astore 1
         // 33: goto 0c
         // 36: aload 1
         // 37: invokevirtual com/schnurritv/sexmod/cA.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
         // 3a: getstatic com/schnurritv/sexmod/cA.ar Lnet/minecraft/network/datasync/DataParameter;
         // 3d: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
         // 40: checkcast java/lang/Float
         // 43: invokevirtual java/lang/Float.floatValue ()F
         // 46: fstore 4
         // 48: aload 3
         // 49: invokevirtual com/schnurritv/sexmod/cA.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
         // 4c: getstatic com/schnurritv/sexmod/cA.ar Lnet/minecraft/network/datasync/DataParameter;
         // 4f: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
         // 52: checkcast java/lang/Float
         // 55: invokevirtual java/lang/Float.floatValue ()F
         // 58: fstore 5
         // 5a: fload 5
         // 5c: fload 4
         // 5e: fcmpg
         // 5f: ifge 64
         // 62: aload 3
         // 63: astore 1
         // 64: goto 0c
         // 67: aload 1
         // 68: areturn
         // try (13 -> 17): 17 java/lang/RuntimeException
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }
}
