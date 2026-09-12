package com.schnurritv.sexmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.world.World;

public class c1 extends EntityAIBase {
   private final EntityVillager b;
   private EntityVillager d;
   private final World a;
   private int c;

   public c1(EntityVillager var1) {
      this.b = var1;
      this.a = var1.field_70170_p;
      this.func_75248_a(3);
   }

   public boolean func_75250_a() {
      try {
         if (this.c != 0) {
            return false;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      Entity var1 = this.a.func_72857_a(EntityVillager.class, this.b.func_174813_aQ().func_72314_b(8.0, 3.0, 8.0), this.b);

      try {
         if (var1 == null) {
            return false;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      this.d = (EntityVillager)var1;
      return true;
   }

   public void func_75249_e() {
      this.c = 300;
      this.b.func_70947_e(true);
   }

   public void func_75251_c() {
   }

   public boolean func_75253_b() {
      return true;
   }

   public void func_75246_d() {
      try {
         this.c--;
         this.b.func_70671_ap().func_75651_a(this.d, 10.0F, 30.0F);
         if (this.b.func_70068_e(this.d) > 2.25) {
            this.b.func_70661_as().func_75497_a(this.d, 0.25);
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      try {
         if (this.c <= 0) {
            this.a();
            this.b.field_70714_bg.func_85156_a(this);
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      try {
         if (this.b.func_70681_au().nextInt(35) == 0) {
            this.a.func_72960_a(this.b, (byte)12);
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }
   }

   private void a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/c1.b Lnet/minecraft/entity/passive/EntityVillager;
      // 04: aload 0
      // 05: getfield com/schnurritv/sexmod/c1.d Lnet/minecraft/entity/passive/EntityVillager;
      // 08: invokevirtual net/minecraft/entity/passive/EntityVillager.func_90011_a (Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityVillager;
      // 0b: astore 1
      // 0c: aload 0
      // 0d: getfield com/schnurritv/sexmod/c1.d Lnet/minecraft/entity/passive/EntityVillager;
      // 10: sipush 6000
      // 13: invokevirtual net/minecraft/entity/passive/EntityVillager.func_70873_a (I)V
      // 16: aload 0
      // 17: getfield com/schnurritv/sexmod/c1.b Lnet/minecraft/entity/passive/EntityVillager;
      // 1a: sipush 6000
      // 1d: invokevirtual net/minecraft/entity/passive/EntityVillager.func_70873_a (I)V
      // 20: aload 0
      // 21: getfield com/schnurritv/sexmod/c1.d Lnet/minecraft/entity/passive/EntityVillager;
      // 24: bipush 0
      // 25: invokevirtual net/minecraft/entity/passive/EntityVillager.func_175549_o (Z)V
      // 28: aload 0
      // 29: getfield com/schnurritv/sexmod/c1.b Lnet/minecraft/entity/passive/EntityVillager;
      // 2c: bipush 0
      // 2d: invokevirtual net/minecraft/entity/passive/EntityVillager.func_175549_o (Z)V
      // 30: new net/minecraftforge/event/entity/living/BabyEntitySpawnEvent
      // 33: dup
      // 34: aload 0
      // 35: getfield com/schnurritv/sexmod/c1.b Lnet/minecraft/entity/passive/EntityVillager;
      // 38: aload 0
      // 39: getfield com/schnurritv/sexmod/c1.d Lnet/minecraft/entity/passive/EntityVillager;
      // 3c: aload 1
      // 3d: invokespecial net/minecraftforge/event/entity/living/BabyEntitySpawnEvent.<init> (Lnet/minecraft/entity/EntityLiving;Lnet/minecraft/entity/EntityLiving;Lnet/minecraft/entity/EntityAgeable;)V
      // 40: astore 2
      // 41: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS Lnet/minecraftforge/fml/common/eventhandler/EventBus;
      // 44: aload 2
      // 45: invokevirtual net/minecraftforge/fml/common/eventhandler/EventBus.post (Lnet/minecraftforge/fml/common/eventhandler/Event;)Z
      // 48: ifne 59
      // 4b: aload 2
      // 4c: invokevirtual net/minecraftforge/event/entity/living/BabyEntitySpawnEvent.getChild ()Lnet/minecraft/entity/EntityAgeable;
      // 4f: ifnonnull 5e
      // 52: goto 59
      // 55: invokestatic com/schnurritv/sexmod/c1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 58: athrow
      // 59: return
      // 5a: invokestatic com/schnurritv/sexmod/c1.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5d: athrow
      // 5e: aload 2
      // 5f: invokevirtual net/minecraftforge/event/entity/living/BabyEntitySpawnEvent.getChild ()Lnet/minecraft/entity/EntityAgeable;
      // 62: astore 1
      // 63: aload 1
      // 64: sipush -24000
      // 67: invokevirtual net/minecraft/entity/EntityAgeable.func_70873_a (I)V
      // 6a: aload 1
      // 6b: aload 0
      // 6c: getfield com/schnurritv/sexmod/c1.b Lnet/minecraft/entity/passive/EntityVillager;
      // 6f: getfield net/minecraft/entity/passive/EntityVillager.field_70165_t D
      // 72: aload 0
      // 73: getfield com/schnurritv/sexmod/c1.b Lnet/minecraft/entity/passive/EntityVillager;
      // 76: getfield net/minecraft/entity/passive/EntityVillager.field_70163_u D
      // 79: aload 0
      // 7a: getfield com/schnurritv/sexmod/c1.b Lnet/minecraft/entity/passive/EntityVillager;
      // 7d: getfield net/minecraft/entity/passive/EntityVillager.field_70161_v D
      // 80: fconst_0
      // 81: fconst_0
      // 82: invokevirtual net/minecraft/entity/EntityAgeable.func_70012_b (DDDFF)V
      // 85: aload 0
      // 86: getfield com/schnurritv/sexmod/c1.a Lnet/minecraft/world/World;
      // 89: aload 1
      // 8a: invokevirtual net/minecraft/world/World.func_72838_d (Lnet/minecraft/entity/Entity;)Z
      // 8d: pop
      // 8e: aload 0
      // 8f: getfield com/schnurritv/sexmod/c1.a Lnet/minecraft/world/World;
      // 92: aload 1
      // 93: bipush 12
      // 95: invokevirtual net/minecraft/world/World.func_72960_a (Lnet/minecraft/entity/Entity;B)V
      // 98: return
      // try (31 -> 38): 39 java/lang/RuntimeException
      // try (35 -> 42): 42 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
