package com.schnurritv.sexmod;

import javax.annotation.Nullable;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class bB extends ItemFishingRod {
   public static final bB a = new bB();

   public bB() {
      this.func_77656_e(64);
      this.func_77625_d(1);
      this.func_185043_a(
         new ResourceLocation("cast"),
         new IItemPropertyGetter() {
            @SideOnly(Side.CLIENT)
            public float func_185085_a(ItemStack var1, @Nullable World var2, @Nullable EntityLivingBase var3) {
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
               // 00: aload 3
               // 01: ifnonnull 0a
               // 04: fconst_0
               // 05: freturn
               // 06: invokestatic com/schnurritv/sexmod/bB$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
               // 09: athrow
               // 0a: aload 3
               // 0b: instanceof com/schnurritv/sexmod/c9
               // 0e: ifne 17
               // 11: fconst_0
               // 12: freturn
               // 13: invokestatic com/schnurritv/sexmod/bB$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
               // 16: athrow
               // 17: aload 3
               // 18: invokevirtual net/minecraft/entity/EntityLivingBase.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
               // 1b: getstatic com/schnurritv/sexmod/c9.av Lnet/minecraft/network/datasync/DataParameter;
               // 1e: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
               // 21: checkcast java/lang/Boolean
               // 24: invokevirtual java/lang/Boolean.booleanValue ()Z
               // 27: ifeq 32
               // 2a: fconst_1
               // 2b: goto 33
               // 2e: invokestatic com/schnurritv/sexmod/bB$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
               // 31: athrow
               // 32: fconst_0
               // 33: freturn
               // try (0 -> 4): 4 java/lang/RuntimeException
               // try (6 -> 11): 11 java/lang/RuntimeException
               // try (13 -> 22): 22 java/lang/RuntimeException
            }

            private static RuntimeException a(RuntimeException var0) {
               return var0;
            }
         }
      );
   }

   public static void a() {
      a.setRegistryName("sexmod", "luna_rod");
      a.func_77655_b("luna_rod");
      MinecraftForge.EVENT_BUS.register(bB.class);
   }

   @SubscribeEvent
   public static void a(Register<Item> var0) {
      var0.getRegistry().register(a);
   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public static void a(ModelRegistryEvent var0) {
      ModelLoader.setCustomModelResourceLocation(a, 0, new ModelResourceLocation("fishing_rod"));
   }

   public ActionResult<ItemStack> a(World param1, c9 param2, EnumHand param3) {
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
      // 000: aload 2
      // 001: aload 3
      // 002: invokevirtual com/schnurritv/sexmod/c9.func_184586_b (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
      // 005: astore 4
      // 007: aload 2
      // 008: getfield com/schnurritv/sexmod/c9.W Lcom/schnurritv/sexmod/n;
      // 00b: ifnull 051
      // 00e: aload 2
      // 00f: getfield com/schnurritv/sexmod/c9.W Lcom/schnurritv/sexmod/n;
      // 012: invokevirtual com/schnurritv/sexmod/n.d ()I
      // 015: istore 5
      // 017: aload 4
      // 019: iload 5
      // 01b: aload 2
      // 01c: invokevirtual net/minecraft/item/ItemStack.func_77972_a (ILnet/minecraft/entity/EntityLivingBase;)V
      // 01f: aload 2
      // 020: aload 3
      // 021: invokevirtual com/schnurritv/sexmod/c9.func_184609_a (Lnet/minecraft/util/EnumHand;)V
      // 024: aload 1
      // 025: aconst_null
      // 026: checkcast net/minecraft/entity/player/EntityPlayer
      // 029: aload 2
      // 02a: getfield com/schnurritv/sexmod/c9.field_70165_t D
      // 02d: aload 2
      // 02e: getfield com/schnurritv/sexmod/c9.field_70163_u D
      // 031: aload 2
      // 032: getfield com/schnurritv/sexmod/c9.field_70161_v D
      // 035: getstatic net/minecraft/init/SoundEvents.field_193780_J Lnet/minecraft/util/SoundEvent;
      // 038: getstatic net/minecraft/util/SoundCategory.NEUTRAL Lnet/minecraft/util/SoundCategory;
      // 03b: fconst_1
      // 03c: ldc 0.4
      // 03e: getstatic com/schnurritv/sexmod/bB.field_77697_d Ljava/util/Random;
      // 041: invokevirtual java/util/Random.nextFloat ()F
      // 044: ldc 0.4
      // 046: fmul
      // 047: ldc 0.8
      // 049: fadd
      // 04a: fdiv
      // 04b: invokevirtual net/minecraft/world/World.func_184148_a (Lnet/minecraft/entity/player/EntityPlayer;DDDLnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;FF)V
      // 04e: goto 13d
      // 051: aload 1
      // 052: aconst_null
      // 053: checkcast net/minecraft/entity/player/EntityPlayer
      // 056: aload 2
      // 057: getfield com/schnurritv/sexmod/c9.field_70165_t D
      // 05a: aload 2
      // 05b: getfield com/schnurritv/sexmod/c9.field_70163_u D
      // 05e: aload 2
      // 05f: getfield com/schnurritv/sexmod/c9.field_70161_v D
      // 062: getstatic net/minecraft/init/SoundEvents.field_187612_G Lnet/minecraft/util/SoundEvent;
      // 065: getstatic net/minecraft/util/SoundCategory.NEUTRAL Lnet/minecraft/util/SoundCategory;
      // 068: ldc 0.5
      // 06a: ldc 0.4
      // 06c: getstatic com/schnurritv/sexmod/bB.field_77697_d Ljava/util/Random;
      // 06f: invokevirtual java/util/Random.nextFloat ()F
      // 072: ldc 0.4
      // 074: fmul
      // 075: ldc 0.8
      // 077: fadd
      // 078: fdiv
      // 079: invokevirtual net/minecraft/world/World.func_184148_a (Lnet/minecraft/entity/player/EntityPlayer;DDDLnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;FF)V
      // 07c: aload 1
      // 07d: getfield net/minecraft/world/World.field_72995_K Z
      // 080: ifne 138
      // 083: aload 2
      // 084: putstatic com/schnurritv/sexmod/n.l Lcom/schnurritv/sexmod/c9;
      // 087: aload 2
      // 088: invokevirtual com/schnurritv/sexmod/c9.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
      // 08b: new net/minecraft/util/math/Vec3d
      // 08e: dup
      // 08f: aload 2
      // 090: getfield com/schnurritv/sexmod/c9.at Lnet/minecraft/util/math/BlockPos;
      // 093: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 096: i2d
      // 097: aload 2
      // 098: getfield com/schnurritv/sexmod/c9.at Lnet/minecraft/util/math/BlockPos;
      // 09b: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
      // 09e: i2d
      // 09f: aload 2
      // 0a0: getfield com/schnurritv/sexmod/c9.at Lnet/minecraft/util/math/BlockPos;
      // 0a3: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 0a6: i2d
      // 0a7: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
      // 0aa: invokevirtual net/minecraft/util/math/Vec3d.func_72438_d (Lnet/minecraft/util/math/Vec3d;)D
      // 0ad: dstore 5
      // 0af: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0b2: new java/lang/StringBuilder
      // 0b5: dup
      // 0b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b9: ldc "chosenFishingSpot: "
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: aload 2
      // 0bf: getfield com/schnurritv/sexmod/c9.at Lnet/minecraft/util/math/BlockPos;
      // 0c2: invokevirtual net/minecraft/util/math/BlockPos.toString ()Ljava/lang/String;
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cb: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0ce: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0d1: new java/lang/StringBuilder
      // 0d4: dup
      // 0d5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d8: ldc "ROD_THROWING_STRENGTH: "
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: dload 5
      // 0df: getstatic com/schnurritv/sexmod/c9.ap D
      // 0e2: dmul
      // 0e3: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 0e6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e9: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0ec: new com/schnurritv/sexmod/n
      // 0ef: dup
      // 0f0: aload 1
      // 0f1: aload 2
      // 0f2: dload 5
      // 0f4: getstatic com/schnurritv/sexmod/c9.ap D
      // 0f7: dmul
      // 0f8: invokespecial com/schnurritv/sexmod/n.<init> (Lnet/minecraft/world/World;Lcom/schnurritv/sexmod/c9;D)V
      // 0fb: astore 7
      // 0fd: aload 4
      // 0ff: invokestatic net/minecraft/enchantment/EnchantmentHelper.func_191528_c (Lnet/minecraft/item/ItemStack;)I
      // 102: istore 8
      // 104: iload 8
      // 106: ifle 117
      // 109: aload 7
      // 10b: iload 8
      // 10d: invokevirtual com/schnurritv/sexmod/n.b (I)V
      // 110: goto 117
      // 113: invokestatic com/schnurritv/sexmod/bB.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 116: athrow
      // 117: aload 4
      // 119: invokestatic net/minecraft/enchantment/EnchantmentHelper.func_191529_b (Lnet/minecraft/item/ItemStack;)I
      // 11c: istore 9
      // 11e: iload 9
      // 120: ifle 131
      // 123: aload 7
      // 125: iload 9
      // 127: invokevirtual com/schnurritv/sexmod/n.a (I)V
      // 12a: goto 131
      // 12d: invokestatic com/schnurritv/sexmod/bB.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 130: athrow
      // 131: aload 1
      // 132: aload 7
      // 134: invokevirtual net/minecraft/world/World.func_72838_d (Lnet/minecraft/entity/Entity;)Z
      // 137: pop
      // 138: aload 2
      // 139: aload 3
      // 13a: invokevirtual com/schnurritv/sexmod/c9.func_184609_a (Lnet/minecraft/util/EnumHand;)V
      // 13d: new net/minecraft/util/ActionResult
      // 140: dup
      // 141: getstatic net/minecraft/util/EnumActionResult.SUCCESS Lnet/minecraft/util/EnumActionResult;
      // 144: aload 4
      // 146: invokespecial net/minecraft/util/ActionResult.<init> (Lnet/minecraft/util/EnumActionResult;Ljava/lang/Object;)V
      // 149: areturn
      // try (121 -> 126): 127 java/lang/RuntimeException
      // try (132 -> 137): 138 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
