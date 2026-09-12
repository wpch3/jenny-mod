package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class b4 extends Container {
   private final IInventory d;
   private final int a;
   public static List<b4> c = new ArrayList<>();
   public UUID b;

   public b4(IInventory var1, IInventory var2, EntityPlayer var3, UUID var4) {
      this.b = var4;
      c.add(this);
      this.d = var2;
      var2.func_174889_b(var3);
      this.a = 3;
      byte var5 = -18;

      for (int var6 = 0; var6 < 3; var6++) {
         int var7 = 0;

         try {
            while (var7 < 9) {
               this.func_75146_a(new Slot(var2, var7 + var6 * 9, 8 + var7 * 18, 18 + var6 * 18));
               var7++;
            }
         } catch (RuntimeException var10) {
            throw a(var10);
         }
      }

      for (int var11 = 0; var11 < 3; var11++) {
         int var13 = 0;

         try {
            while (var13 < 9) {
               this.func_75146_a(new Slot(var1, var13 + var11 * 9 + 9, 8 + var13 * 18, 103 + var11 * 18 + var5));
               var13++;
            }
         } catch (RuntimeException var9) {
            throw a(var9);
         }
      }

      int var12 = 0;

      try {
         while (var12 < 9) {
            this.func_75146_a(new Slot(var1, var12, 8 + var12 * 18, 161 + var5));
            var12++;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }
   }

   public boolean func_75145_c(EntityPlayer var1) {
      return this.d.func_70300_a(var1);
   }

   public ItemStack func_82846_b(EntityPlayer param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 03: astore 3
      // 04: aload 0
      // 05: getfield com/schnurritv/sexmod/b4.field_75151_b Ljava/util/List;
      // 08: iload 2
      // 09: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e: checkcast net/minecraft/inventory/Slot
      // 11: astore 4
      // 13: aload 4
      // 15: ifnull 9e
      // 18: aload 4
      // 1a: invokevirtual net/minecraft/inventory/Slot.func_75216_d ()Z
      // 1d: ifeq 9e
      // 20: goto 27
      // 23: invokestatic com/schnurritv/sexmod/b4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26: athrow
      // 27: aload 4
      // 29: invokevirtual net/minecraft/inventory/Slot.func_75211_c ()Lnet/minecraft/item/ItemStack;
      // 2c: astore 5
      // 2e: aload 5
      // 30: invokevirtual net/minecraft/item/ItemStack.func_77946_l ()Lnet/minecraft/item/ItemStack;
      // 33: astore 3
      // 34: iload 2
      // 35: aload 0
      // 36: getfield com/schnurritv/sexmod/b4.a I
      // 39: bipush 9
      // 3b: imul
      // 3c: if_icmpge 68
      // 3f: aload 0
      // 40: aload 5
      // 42: aload 0
      // 43: getfield com/schnurritv/sexmod/b4.a I
      // 46: bipush 9
      // 48: imul
      // 49: aload 0
      // 4a: getfield com/schnurritv/sexmod/b4.field_75151_b Ljava/util/List;
      // 4d: invokeinterface java/util/List.size ()I 1
      // 52: bipush 1
      // 53: invokevirtual com/schnurritv/sexmod/b4.func_75135_a (Lnet/minecraft/item/ItemStack;IIZ)Z
      // 56: ifne 82
      // 59: goto 60
      // 5c: invokestatic com/schnurritv/sexmod/b4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5f: athrow
      // 60: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 63: areturn
      // 64: invokestatic com/schnurritv/sexmod/b4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 67: athrow
      // 68: aload 0
      // 69: aload 5
      // 6b: bipush 0
      // 6c: aload 0
      // 6d: getfield com/schnurritv/sexmod/b4.a I
      // 70: bipush 9
      // 72: imul
      // 73: bipush 0
      // 74: invokevirtual com/schnurritv/sexmod/b4.func_75135_a (Lnet/minecraft/item/ItemStack;IIZ)Z
      // 77: ifne 82
      // 7a: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 7d: areturn
      // 7e: invokestatic com/schnurritv/sexmod/b4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 81: athrow
      // 82: aload 5
      // 84: invokevirtual net/minecraft/item/ItemStack.func_190926_b ()Z
      // 87: ifeq 99
      // 8a: aload 4
      // 8c: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
      // 8f: invokevirtual net/minecraft/inventory/Slot.func_75215_d (Lnet/minecraft/item/ItemStack;)V
      // 92: goto 9e
      // 95: invokestatic com/schnurritv/sexmod/b4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 98: athrow
      // 99: aload 4
      // 9b: invokevirtual net/minecraft/inventory/Slot.func_75218_e ()V
      // 9e: aload 3
      // 9f: areturn
      // try (8 -> 13): 14 java/lang/RuntimeException
      // try (22 -> 40): 41 java/lang/RuntimeException
      // try (28 -> 45): 45 java/lang/RuntimeException
      // try (47 -> 59): 59 java/lang/RuntimeException
      // try (61 -> 68): 68 java/lang/RuntimeException
   }

   public void func_75134_a(EntityPlayer var1) {
      super.func_75134_a(var1);
      this.d.func_174886_c(var1);
   }

   public IInventory a() {
      return this.d;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
