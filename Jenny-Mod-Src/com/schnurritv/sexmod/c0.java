package com.schnurritv.sexmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@EventBusSubscriber
public class c0 extends Potion {
   public static final Potion b = new c0("horny potion", false, 16736968, 0, 0);
   public static final PotionType a = (PotionType)new PotionType(
         "horny_potion", new PotionEffect[]{new PotionEffect(b, 3600), new PotionEffect(MobEffects.field_76431_k, 200, 1)}
      )
      .setRegistryName("horny_potion");

   public c0() {
      super(false, 0);
   }

   public c0(String var1, boolean var2, int var3, int var4, int var5) {
      super(var2, var3);
      this.func_76390_b(var1);
      this.func_76399_b(var4, var5);
      this.setRegistryName(new ResourceLocation("sexmod:" + var1));
   }

   public static void a() {
      ForgeRegistries.POTIONS.register(b);
      ForgeRegistries.POTION_TYPES.register(a);
      PotionHelper.func_193357_a(PotionTypes.field_185231_c, Item.func_150898_a(Blocks.field_150328_O), a);
   }

   @SubscribeEvent
   public void a(PlayerTickEvent var1) {
      EntityPlayer var2 = var1.player;
      PotionEffect var3 = var2.func_70660_b(b);

      try {
         if (var2.field_70170_p.field_72995_K) {
            return;
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      try {
         if (var3 == null) {
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      try {
         if (var3.func_76459_b() > 3500) {
            return;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      var2.func_184589_d(b);
      at.a.sendTo(new i(var2), (EntityPlayerMP)var2);
   }

   @SubscribeEvent
   public void a(LivingUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraftforge/event/entity/living/LivingEvent$LivingUpdateEvent.getEntity ()Lnet/minecraft/entity/Entity;
      // 04: instanceof net/minecraft/entity/passive/EntityVillager
      // 07: ifeq 3a
      // 0a: aload 1
      // 0b: invokevirtual net/minecraftforge/event/entity/living/LivingEvent$LivingUpdateEvent.getEntity ()Lnet/minecraft/entity/Entity;
      // 0e: checkcast net/minecraft/entity/passive/EntityVillager
      // 11: astore 2
      // 12: aload 2
      // 13: getstatic com/schnurritv/sexmod/c0.b Lnet/minecraft/potion/Potion;
      // 16: invokevirtual net/minecraft/entity/passive/EntityVillager.func_70644_a (Lnet/minecraft/potion/Potion;)Z
      // 19: ifeq 3a
      // 1c: aload 2
      // 1d: getfield net/minecraft/entity/passive/EntityVillager.field_70714_bg Lnet/minecraft/entity/ai/EntityAITasks;
      // 20: bipush 2
      // 21: new com/schnurritv/sexmod/c1
      // 24: dup
      // 25: aload 2
      // 26: invokespecial com/schnurritv/sexmod/c1.<init> (Lnet/minecraft/entity/passive/EntityVillager;)V
      // 29: invokevirtual net/minecraft/entity/ai/EntityAITasks.func_75776_a (ILnet/minecraft/entity/ai/EntityAIBase;)V
      // 2c: aload 2
      // 2d: getstatic com/schnurritv/sexmod/c0.b Lnet/minecraft/potion/Potion;
      // 30: invokevirtual net/minecraft/entity/passive/EntityVillager.func_184589_d (Lnet/minecraft/potion/Potion;)V
      // 33: goto 3a
      // 36: invokestatic com/schnurritv/sexmod/c0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 39: athrow
      // 3a: aload 1
      // 3b: invokevirtual net/minecraftforge/event/entity/living/LivingEvent$LivingUpdateEvent.getEntity ()Lnet/minecraft/entity/Entity;
      // 3e: instanceof net/minecraft/entity/passive/EntityAnimal
      // 41: ifne 49
      // 44: return
      // 45: invokestatic com/schnurritv/sexmod/c0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: aload 1
      // 4a: invokevirtual net/minecraftforge/event/entity/living/LivingEvent$LivingUpdateEvent.getEntity ()Lnet/minecraft/entity/Entity;
      // 4d: checkcast net/minecraft/entity/passive/EntityAnimal
      // 50: astore 2
      // 51: aload 2
      // 52: getstatic com/schnurritv/sexmod/c0.b Lnet/minecraft/potion/Potion;
      // 55: invokevirtual net/minecraft/entity/passive/EntityAnimal.func_70644_a (Lnet/minecraft/potion/Potion;)Z
      // 58: ifeq 8f
      // 5b: aload 2
      // 5c: invokevirtual net/minecraft/entity/passive/EntityAnimal.func_70874_b ()I
      // 5f: iflt 88
      // 62: goto 69
      // 65: invokestatic com/schnurritv/sexmod/c0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 68: athrow
      // 69: aload 2
      // 6a: bipush 0
      // 6b: invokevirtual net/minecraft/entity/passive/EntityAnimal.func_70873_a (I)V
      // 6e: aload 2
      // 6f: invokevirtual net/minecraft/entity/passive/EntityAnimal.func_70875_t ()V
      // 72: aload 2
      // 73: aload 2
      // 74: getfield net/minecraft/entity/passive/EntityAnimal.field_70170_p Lnet/minecraft/world/World;
      // 77: aload 2
      // 78: ldc2_w 30.0
      // 7b: invokevirtual net/minecraft/world/World.func_72890_a (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
      // 7e: invokevirtual net/minecraft/entity/passive/EntityAnimal.func_146082_f (Lnet/minecraft/entity/player/EntityPlayer;)V
      // 81: goto 88
      // 84: invokestatic com/schnurritv/sexmod/c0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 87: athrow
      // 88: aload 2
      // 89: getstatic com/schnurritv/sexmod/c0.b Lnet/minecraft/potion/Potion;
      // 8c: invokevirtual net/minecraft/entity/passive/EntityAnimal.func_184589_d (Lnet/minecraft/potion/Potion;)V
      // 8f: return
      // try (8 -> 23): 24 java/lang/RuntimeException
      // try (26 -> 31): 31 java/lang/RuntimeException
      // try (37 -> 44): 45 java/lang/RuntimeException
      // try (41 -> 59): 60 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
