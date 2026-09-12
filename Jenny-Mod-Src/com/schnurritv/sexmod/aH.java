package com.schnurritv.sexmod;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class ah extends EntityEnderPearl {
   public ah(World var1) {
      super(var1);
   }

   public ah(World var1, EntityLivingBase var2) {
      super(var1, var2);
   }

   protected void func_70184_a(RayTraceResult param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual com/schnurritv/sexmod/ah.func_85052_h ()Lnet/minecraft/entity/EntityLivingBase;
      // 004: astore 2
      // 005: aload 1
      // 006: getfield net/minecraft/util/math/RayTraceResult.field_72313_a Lnet/minecraft/util/math/RayTraceResult$Type;
      // 009: getstatic net/minecraft/util/math/RayTraceResult$Type.BLOCK Lnet/minecraft/util/math/RayTraceResult$Type;
      // 00c: if_acmpne 06a
      // 00f: aload 1
      // 010: invokevirtual net/minecraft/util/math/RayTraceResult.func_178782_a ()Lnet/minecraft/util/math/BlockPos;
      // 013: astore 3
      // 014: aload 0
      // 015: getfield com/schnurritv/sexmod/ah.field_70170_p Lnet/minecraft/world/World;
      // 018: aload 3
      // 019: invokevirtual net/minecraft/world/World.func_175625_s (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/tileentity/TileEntity;
      // 01c: astore 4
      // 01e: aload 4
      // 020: instanceof net/minecraft/tileentity/TileEntityEndGateway
      // 023: ifeq 06a
      // 026: aload 4
      // 028: checkcast net/minecraft/tileentity/TileEntityEndGateway
      // 02b: astore 5
      // 02d: aload 2
      // 02e: ifnull 063
      // 031: aload 2
      // 032: instanceof net/minecraft/entity/player/EntityPlayerMP
      // 035: ifeq 058
      // 038: goto 03f
      // 03b: invokestatic com/schnurritv/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03e: athrow
      // 03f: getstatic net/minecraft/advancements/CriteriaTriggers.field_192124_d Lnet/minecraft/advancements/critereon/EnterBlockTrigger;
      // 042: aload 2
      // 043: checkcast net/minecraft/entity/player/EntityPlayerMP
      // 046: aload 0
      // 047: getfield com/schnurritv/sexmod/ah.field_70170_p Lnet/minecraft/world/World;
      // 04a: aload 3
      // 04b: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 04e: invokevirtual net/minecraft/advancements/critereon/EnterBlockTrigger.func_192193_a (Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/block/state/IBlockState;)V
      // 051: goto 058
      // 054: invokestatic com/schnurritv/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 057: athrow
      // 058: aload 5
      // 05a: aload 2
      // 05b: invokevirtual net/minecraft/tileentity/TileEntityEndGateway.func_184306_a (Lnet/minecraft/entity/Entity;)V
      // 05e: aload 0
      // 05f: invokevirtual com/schnurritv/sexmod/ah.func_70106_y ()V
      // 062: return
      // 063: aload 5
      // 065: aload 0
      // 066: invokevirtual net/minecraft/tileentity/TileEntityEndGateway.func_184306_a (Lnet/minecraft/entity/Entity;)V
      // 069: return
      // 06a: bipush 0
      // 06b: istore 3
      // 06c: iload 3
      // 06d: bipush 32
      // 06f: if_icmpge 0b0
      // 072: aload 0
      // 073: getfield com/schnurritv/sexmod/ah.field_70170_p Lnet/minecraft/world/World;
      // 076: getstatic net/minecraft/util/EnumParticleTypes.PORTAL Lnet/minecraft/util/EnumParticleTypes;
      // 079: aload 0
      // 07a: getfield com/schnurritv/sexmod/ah.field_70165_t D
      // 07d: aload 0
      // 07e: getfield com/schnurritv/sexmod/ah.field_70163_u D
      // 081: aload 0
      // 082: getfield com/schnurritv/sexmod/ah.field_70146_Z Ljava/util/Random;
      // 085: invokevirtual java/util/Random.nextDouble ()D
      // 088: ldc2_w 2.0
      // 08b: dmul
      // 08c: dadd
      // 08d: aload 0
      // 08e: getfield com/schnurritv/sexmod/ah.field_70161_v D
      // 091: aload 0
      // 092: getfield com/schnurritv/sexmod/ah.field_70146_Z Ljava/util/Random;
      // 095: invokevirtual java/util/Random.nextGaussian ()D
      // 098: dconst_0
      // 099: aload 0
      // 09a: getfield com/schnurritv/sexmod/ah.field_70146_Z Ljava/util/Random;
      // 09d: invokevirtual java/util/Random.nextGaussian ()D
      // 0a0: bipush 0
      // 0a1: newarray 10
      // 0a3: invokevirtual net/minecraft/world/World.func_175688_a (Lnet/minecraft/util/EnumParticleTypes;DDDDDD[I)V
      // 0a6: iinc 3 1
      // 0a9: goto 06c
      // 0ac: invokestatic com/schnurritv/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: getfield com/schnurritv/sexmod/ah.field_70170_p Lnet/minecraft/world/World;
      // 0b4: getfield net/minecraft/world/World.field_72995_K Z
      // 0b7: ifne 131
      // 0ba: aload 2
      // 0bb: ifnull 12d
      // 0be: goto 0c5
      // 0c1: invokestatic com/schnurritv/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c4: athrow
      // 0c5: aload 2
      // 0c6: checkcast com/schnurritv/sexmod/bi
      // 0c9: astore 3
      // 0ca: aload 3
      // 0cb: getfield com/schnurritv/sexmod/bi.d Lnet/minecraft/util/math/Vec3d;
      // 0ce: aload 0
      // 0cf: invokevirtual com/schnurritv/sexmod/ah.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 0d2: invokevirtual net/minecraft/util/math/Vec3d.func_72438_d (Lnet/minecraft/util/math/Vec3d;)D
      // 0d5: ldc2_w 5.0
      // 0d8: dcmpg
      // 0d9: ifge 12d
      // 0dc: new net/minecraftforge/event/entity/living/EnderTeleportEvent
      // 0df: dup
      // 0e0: aload 2
      // 0e1: aload 0
      // 0e2: getfield com/schnurritv/sexmod/ah.field_70165_t D
      // 0e5: aload 0
      // 0e6: getfield com/schnurritv/sexmod/ah.field_70163_u D
      // 0e9: aload 0
      // 0ea: getfield com/schnurritv/sexmod/ah.field_70161_v D
      // 0ed: ldc 5.0
      // 0ef: invokespecial net/minecraftforge/event/entity/living/EnderTeleportEvent.<init> (Lnet/minecraft/entity/EntityLivingBase;DDDF)V
      // 0f2: astore 4
      // 0f4: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS Lnet/minecraftforge/fml/common/eventhandler/EventBus;
      // 0f7: aload 4
      // 0f9: invokevirtual net/minecraftforge/fml/common/eventhandler/EventBus.post (Lnet/minecraftforge/fml/common/eventhandler/Event;)Z
      // 0fc: ifne 12d
      // 0ff: aload 2
      // 100: invokevirtual net/minecraft/entity/EntityLivingBase.func_184218_aH ()Z
      // 103: ifeq 118
      // 106: goto 10d
      // 109: invokestatic com/schnurritv/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10c: athrow
      // 10d: aload 2
      // 10e: invokevirtual net/minecraft/entity/EntityLivingBase.func_184210_p ()V
      // 111: goto 118
      // 114: invokestatic com/schnurritv/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 117: athrow
      // 118: aload 2
      // 119: aload 0
      // 11a: getfield com/schnurritv/sexmod/ah.field_70165_t D
      // 11d: aload 0
      // 11e: getfield com/schnurritv/sexmod/ah.field_70163_u D
      // 121: aload 0
      // 122: getfield com/schnurritv/sexmod/ah.field_70161_v D
      // 125: invokevirtual net/minecraft/entity/EntityLivingBase.func_70634_a (DDD)V
      // 128: aload 2
      // 129: fconst_0
      // 12a: putfield net/minecraft/entity/EntityLivingBase.field_70143_R F
      // 12d: aload 0
      // 12e: invokevirtual com/schnurritv/sexmod/ah.func_70106_y ()V
      // 131: return
      // try (21 -> 26): 27 java/lang/RuntimeException
      // try (23 -> 37): 38 java/lang/RuntimeException
      // try (52 -> 82): 82 java/lang/RuntimeException
      // try (84 -> 90): 91 java/lang/RuntimeException
      // try (116 -> 123): 124 java/lang/RuntimeException
      // try (120 -> 128): 129 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   public static class a {
      @SubscribeEvent
      public void a(EnderTeleportEvent var1) {
         if (var1.getEntityLiving() instanceof bi) {
            bi var2 = (bi)var1.getEntityLiving();
            var2.a = null;
            var2.b(bj.NULL);
            var2.func_184212_Q().func_187227_b(bi.z, false);
            var2.m();
         }
      }
   }
}
