package com.schnurritv.sexmod;

import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class by extends bW {
   float w;

   public by(RenderManager var1, AnimatedGeoModel var2, double var3) {
      super(var1, var2, var3);
   }

   @Override
   protected ItemStack a(@Nullable ItemStack var1) {
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
      // 00: getstatic com/schnurritv/sexmod/by$a.a [I
      // 03: aload 0
      // 04: getfield com/schnurritv/sexmod/by.g Lcom/schnurritv/sexmod/bi;
      // 07: invokevirtual com/schnurritv/sexmod/bi.D ()Lcom/schnurritv/sexmod/bj;
      // 0a: invokevirtual com/schnurritv/sexmod/bj.ordinal ()I
      // 0d: iaload
      // 0e: lookupswitch 95 2 1 26 2 26
      // 28: aload 0
      // 29: getfield com/schnurritv/sexmod/by.g Lcom/schnurritv/sexmod/bi;
      // 2c: checkcast com/schnurritv/sexmod/c9
      // 2f: getfield com/schnurritv/sexmod/c9.ar Lnet/minecraft/item/ItemStack;
      // 32: astore 2
      // 33: aload 0
      // 34: getfield com/schnurritv/sexmod/by.g Lcom/schnurritv/sexmod/bi;
      // 37: invokevirtual com/schnurritv/sexmod/bi.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 3a: getstatic com/schnurritv/sexmod/c9.X Lnet/minecraft/network/datasync/DataParameter;
      // 3d: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 40: checkcast net/minecraft/item/ItemStack
      // 43: astore 3
      // 44: aload 3
      // 45: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 48: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 4b: ifeq 54
      // 4e: aload 2
      // 4f: areturn
      // 50: invokestatic com/schnurritv/sexmod/by.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: aload 3
      // 55: invokestatic net/minecraft/enchantment/EnchantmentHelper.func_82781_a (Lnet/minecraft/item/ItemStack;)Ljava/util/Map;
      // 58: astore 4
      // 5a: aload 4
      // 5c: aload 2
      // 5d: invokestatic net/minecraft/enchantment/EnchantmentHelper.func_82782_a (Ljava/util/Map;Lnet/minecraft/item/ItemStack;)V
      // 60: aload 0
      // 61: getfield com/schnurritv/sexmod/by.g Lcom/schnurritv/sexmod/bi;
      // 64: getstatic net/minecraft/util/EnumHand.MAIN_HAND Lnet/minecraft/util/EnumHand;
      // 67: aload 2
      // 68: invokevirtual com/schnurritv/sexmod/bi.func_184611_a (Lnet/minecraft/util/EnumHand;Lnet/minecraft/item/ItemStack;)V
      // 6b: aload 2
      // 6c: areturn
      // 6d: aload 1
      // 6e: areturn
      // try (19 -> 25): 25 java/lang/RuntimeException
   }

   boolean a() {
      return (Boolean)this.g.func_184212_Q().func_187225_a(bi.z);
   }

   @Override
   protected void a(BufferBuilder var1, String var2, GeoBone var3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at java.base/java.util.concurrent.ConcurrentHashMap.resizeStamp(ConcurrentHashMap.java:2285)
      //   at java.base/java.util.concurrent.ConcurrentHashMap.helpTransfer(ConcurrentHashMap.java:2367)
      //   at java.base/java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1719)
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
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 003: invokevirtual net/minecraft/client/Minecraft.func_147113_T ()Z
      // 006: ifeq 00e
      // 009: return
      // 00a: invokestatic com/schnurritv/sexmod/by.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 00d: athrow
      // 00e: aload 2
      // 00f: astore 4
      // 011: bipush -1
      // 012: istore 5
      // 014: aload 4
      // 016: invokevirtual java/lang/String.hashCode ()I
      // 019: lookupswitch 184 7 -1870254701 122 -1870254695 106 -1548738978 170 -345841663 138 -345841657 154 3198432 67 2120576361 90
      // 05c: aload 4
      // 05e: ldc "head"
      // 060: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 063: ifeq 0d1
      // 066: goto 06d
      // 069: invokestatic com/schnurritv/sexmod/by.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06c: athrow
      // 06d: bipush 0
      // 06e: istore 5
      // 070: goto 0d1
      // 073: aload 4
      // 075: ldc "backHair"
      // 077: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07a: ifeq 0d1
      // 07d: bipush 1
      // 07e: istore 5
      // 080: goto 0d1
      // 083: aload 4
      // 085: ldc "sideHairR"
      // 087: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08a: ifeq 0d1
      // 08d: bipush 2
      // 08e: istore 5
      // 090: goto 0d1
      // 093: aload 4
      // 095: ldc "sideHairL"
      // 097: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 09a: ifeq 0d1
      // 09d: bipush 3
      // 09e: istore 5
      // 0a0: goto 0d1
      // 0a3: aload 4
      // 0a5: ldc "frontHairL"
      // 0a7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0aa: ifeq 0d1
      // 0ad: bipush 4
      // 0ae: istore 5
      // 0b0: goto 0d1
      // 0b3: aload 4
      // 0b5: ldc "frontHairR"
      // 0b7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ba: ifeq 0d1
      // 0bd: bipush 5
      // 0be: istore 5
      // 0c0: goto 0d1
      // 0c3: aload 4
      // 0c5: ldc "offhand"
      // 0c7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ca: ifeq 0d1
      // 0cd: bipush 6
      // 0cf: istore 5
      // 0d1: iload 5
      // 0d3: tableswitch 351 0 6 41 56 119 119 171 171 197
      // 0fc: aload 0
      // 0fd: aload 3
      // 0fe: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
      // 101: putfield com/schnurritv/sexmod/by.w F
      // 104: goto 232
      // 107: invokestatic com/schnurritv/sexmod/by.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10a: athrow
      // 10b: aload 0
      // 10c: invokevirtual com/schnurritv/sexmod/by.a ()Z
      // 10f: ifeq 119
      // 112: goto 232
      // 115: invokestatic com/schnurritv/sexmod/by.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 118: athrow
      // 119: aload 0
      // 11a: getfield com/schnurritv/sexmod/by.w F
      // 11d: ldc 45.0
      // 11f: invokestatic com/schnurritv/sexmod/b1.b (F)F
      // 122: fdiv
      // 123: f2d
      // 124: dstore 6
      // 126: dconst_0
      // 127: ldc2_w 0.75
      // 12a: dload 6
      // 12c: invokestatic com/schnurritv/sexmod/b1.a (DDD)D
      // 12f: d2f
      // 130: fstore 8
      // 132: aload 3
      // 133: fload 8
      // 135: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPositionZ (F)V
      // 138: aload 3
      // 139: fload 8
      // 13b: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPositionY (F)V
      // 13e: aload 3
      // 13f: aload 0
      // 140: getfield com/schnurritv/sexmod/by.w F
      // 143: fneg
      // 144: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
      // 147: goto 232
      // 14a: aload 0
      // 14b: invokevirtual com/schnurritv/sexmod/by.a ()Z
      // 14e: ifeq 158
      // 151: goto 232
      // 154: invokestatic com/schnurritv/sexmod/by.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 157: athrow
      // 158: aload 0
      // 159: getfield com/schnurritv/sexmod/by.w F
      // 15c: ldc 45.0
      // 15e: invokestatic com/schnurritv/sexmod/b1.b (F)F
      // 161: fdiv
      // 162: f2d
      // 163: dstore 6
      // 165: dconst_0
      // 166: ldc2_w 1.2999999523162842
      // 169: dload 6
      // 16b: invokestatic com/schnurritv/sexmod/b1.a (DDD)D
      // 16e: d2f
      // 16f: fstore 8
      // 171: aload 3
      // 172: fload 8
      // 174: fneg
      // 175: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPositionZ (F)V
      // 178: aload 3
      // 179: fload 8
      // 17b: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setPositionY (F)V
      // 17e: aload 0
      // 17f: invokevirtual com/schnurritv/sexmod/by.a ()Z
      // 182: ifeq 18c
      // 185: goto 232
      // 188: invokestatic com/schnurritv/sexmod/by.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18b: athrow
      // 18c: aload 3
      // 18d: aload 0
      // 18e: getfield com/schnurritv/sexmod/by.w F
      // 191: fneg
      // 192: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
      // 195: goto 232
      // 198: aload 0
      // 199: getfield com/schnurritv/sexmod/by.g Lcom/schnurritv/sexmod/bi;
      // 19c: checkcast com/schnurritv/sexmod/c9
      // 19f: astore 9
      // 1a1: aload 0
      // 1a2: getfield com/schnurritv/sexmod/by.g Lcom/schnurritv/sexmod/bi;
      // 1a5: invokevirtual com/schnurritv/sexmod/bi.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 1a8: getstatic com/schnurritv/sexmod/c9.ah Lnet/minecraft/network/datasync/DataParameter;
      // 1ab: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
      // 1ae: checkcast net/minecraft/item/ItemStack
      // 1b1: astore 10
      // 1b3: aload 10
      // 1b5: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 1b8: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1bb: ifeq 1c5
      // 1be: goto 232
      // 1c1: invokestatic com/schnurritv/sexmod/by.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c4: athrow
      // 1c5: aload 9
      // 1c7: getfield com/schnurritv/sexmod/c9.am F
      // 1ca: fconst_1
      // 1cb: fcmpl
      // 1cc: ifeq 1d6
      // 1cf: goto 232
      // 1d2: invokestatic com/schnurritv/sexmod/by.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d5: athrow
      // 1d6: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
      // 1d9: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
      // 1dc: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
      // 1df: getstatic software/bernie/geckolib3/renderers/geo/IGeoRenderer.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
      // 1e2: aload 3
      // 1e3: invokestatic com/schnurritv/sexmod/Q.a (Lsoftware/bernie/geckolib3/util/MatrixStack;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
      // 1e6: ldc 90.0
      // 1e8: fconst_1
      // 1e9: fconst_0
      // 1ea: fconst_0
      // 1eb: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
      // 1ee: aload 9
      // 1f0: getfield com/schnurritv/sexmod/c9.V F
      // 1f3: aload 9
      // 1f5: getfield com/schnurritv/sexmod/c9.V F
      // 1f8: aload 9
      // 1fa: getfield com/schnurritv/sexmod/c9.V F
      // 1fd: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
      // 200: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 203: invokevirtual net/minecraft/client/Minecraft.func_175597_ag ()Lnet/minecraft/client/renderer/ItemRenderer;
      // 206: aload 0
      // 207: getfield com/schnurritv/sexmod/by.g Lcom/schnurritv/sexmod/bi;
      // 20a: aload 10
      // 20c: getstatic net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType.THIRD_PERSON_RIGHT_HAND Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;
      // 20f: invokevirtual net/minecraft/client/renderer/ItemRenderer.func_178099_a (Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V
      // 212: getstatic com/schnurritv/sexmod/bW.c Lnet/minecraft/client/renderer/BufferBuilder;
      // 215: bipush 7
      // 217: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l Lnet/minecraft/client/renderer/vertex/VertexFormat;
      // 21a: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
      // 21d: aload 0
      // 21e: aload 0
      // 21f: aload 0
      // 220: getfield com/schnurritv/sexmod/by.g Lcom/schnurritv/sexmod/bi;
      // 223: invokevirtual com/schnurritv/sexmod/by.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
      // 226: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 229: checkcast net/minecraft/util/ResourceLocation
      // 22c: invokevirtual com/schnurritv/sexmod/by.func_110776_a (Lnet/minecraft/util/ResourceLocation;)V
      // 22f: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
      // 232: return
      // try (0 -> 4): 4 java/lang/RuntimeException
      // try (10 -> 17): 18 java/lang/RuntimeException
      // try (64 -> 71): 71 java/lang/RuntimeException
      // try (73 -> 77): 77 java/lang/RuntimeException
      // try (104 -> 108): 108 java/lang/RuntimeException
      // try (130 -> 134): 134 java/lang/RuntimeException
      // try (153 -> 158): 158 java/lang/RuntimeException
      // try (160 -> 166): 166 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
