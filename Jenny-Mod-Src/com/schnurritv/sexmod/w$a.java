package com.schnurritv.sexmod;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class w$a {
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
      // 04: instanceof com/schnurritv/sexmod/bs
      // 07: ifeq 73
      // 0a: aload 1
      // 0b: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.getEntityLiving ()Lnet/minecraft/entity/EntityLivingBase;
      // 0e: checkcast com/schnurritv/sexmod/bs
      // 11: astore 2
      // 12: aload 2
      // 13: getfield com/schnurritv/sexmod/bs.P Z
      // 16: ifeq 25
      // 19: aload 1
      // 1a: bipush 1
      // 1b: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.setCanceled (Z)V
      // 1e: goto 73
      // 21: invokestatic com/schnurritv/sexmod/w$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24: athrow
      // 25: aload 2
      // 26: invokevirtual com/schnurritv/sexmod/bs.func_110143_aJ ()F
      // 29: aload 1
      // 2a: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.getAmount ()F
      // 2d: fsub
      // 2e: fconst_0
      // 2f: fcmpg
      // 30: ifge 73
      // 33: aload 2
      // 34: invokevirtual com/schnurritv/sexmod/bs.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 37: getstatic com/schnurritv/sexmod/bs.h Lnet/minecraft/network/datasync/DataParameter;
      // 3a: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 3d: checkcast java/lang/String
      // 40: ldc ""
      // 42: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 45: ifne 73
      // 48: goto 4f
      // 4b: invokestatic com/schnurritv/sexmod/w$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: aload 2
      // 50: bipush 1
      // 51: putfield com/schnurritv/sexmod/bs.P Z
      // 54: aload 2
      // 55: getstatic com/schnurritv/sexmod/bj.DOWNED Lcom/schnurritv/sexmod/bj;
      // 58: invokevirtual com/schnurritv/sexmod/bs.b (Lcom/schnurritv/sexmod/bj;)V
      // 5b: aload 1
      // 5c: aload 2
      // 5d: invokevirtual com/schnurritv/sexmod/bs.func_110143_aJ ()F
      // 60: fconst_1
      // 61: fsub
      // 62: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.setAmount (F)V
      // 65: aload 2
      // 66: invokevirtual com/schnurritv/sexmod/bs.func_70661_as ()Lnet/minecraft/pathfinding/PathNavigate;
      // 69: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75499_g ()V
      // 6c: goto 73
      // 6f: invokestatic com/schnurritv/sexmod/w$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 72: athrow
      // 73: return
      // try (8 -> 15): 15 java/lang/RuntimeException
      // try (17 -> 33): 34 java/lang/RuntimeException
      // try (25 -> 51): 52 java/lang/RuntimeException
   }

   @SubscribeEvent
   public void a(LivingHealEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraftforge/event/entity/living/LivingHealEvent.getEntityLiving ()Lnet/minecraft/entity/EntityLivingBase;
      // 04: instanceof com/schnurritv/sexmod/bs
      // 07: ifeq 44
      // 0a: aload 1
      // 0b: invokevirtual net/minecraftforge/event/entity/living/LivingHealEvent.getEntityLiving ()Lnet/minecraft/entity/EntityLivingBase;
      // 0e: checkcast com/schnurritv/sexmod/bs
      // 11: astore 2
      // 12: aload 2
      // 13: getfield com/schnurritv/sexmod/bs.P Z
      // 16: ifeq 44
      // 19: aload 2
      // 1a: invokevirtual com/schnurritv/sexmod/bs.func_110143_aJ ()F
      // 1d: aload 1
      // 1e: invokevirtual net/minecraftforge/event/entity/living/LivingHealEvent.getAmount ()F
      // 21: fadd
      // 22: aload 2
      // 23: invokevirtual com/schnurritv/sexmod/bs.func_110138_aP ()F
      // 26: fcmpl
      // 27: iflt 44
      // 2a: goto 31
      // 2d: invokestatic com/schnurritv/sexmod/w$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 30: athrow
      // 31: aload 2
      // 32: bipush 0
      // 33: putfield com/schnurritv/sexmod/bs.P Z
      // 36: aload 2
      // 37: getstatic com/schnurritv/sexmod/bj.NULL Lcom/schnurritv/sexmod/bj;
      // 3a: invokevirtual com/schnurritv/sexmod/bs.b (Lcom/schnurritv/sexmod/bj;)V
      // 3d: goto 44
      // 40: invokestatic com/schnurritv/sexmod/w$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43: athrow
      // 44: return
      // try (8 -> 20): 21 java/lang/RuntimeException
      // try (11 -> 29): 30 java/lang/RuntimeException
   }

   @SubscribeEvent
   public void a(LivingDeathEvent var1) {
      if (var1.getEntityLiving() instanceof bs) {
         bs var2 = (bs)var1.getEntityLiving();

         try {
            if (var2.field_70170_p.field_72995_K) {
               return;
            }
         } catch (RuntimeException var6) {
            throw a(var6);
         }

         for (int var3 = 0; var3 < 6; var3++) {
            Item var4 = var2.H.getStackInSlot(var3).func_77973_b();

            try {
               if (var4 != Items.field_190931_a) {
                  var2.func_145779_a(var4, 1);
               }
            } catch (RuntimeException var5) {
               throw a(var5);
            }
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
