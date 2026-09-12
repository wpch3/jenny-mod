package com.schnurritv.sexmod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class b2 extends SlotItemHandler {
   b2.a a;

   public b2(b2.a var1, IItemHandler var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.a = var1;
   }

   public static boolean a(ItemStack var0, int var1) {
      return a(var0, b2.a.a(var1));
   }

   public boolean func_75214_a(ItemStack var1) {
      return a(var1, this.a);
   }

   static boolean a(ItemStack param0, b2.a param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
      // 04: astore 2
      // 05: getstatic com/schnurritv/sexmod/b2$b.a [I
      // 08: aload 1
      // 09: invokevirtual com/schnurritv/sexmod/b2$a.ordinal ()I
      // 0c: iaload
      // 0d: tableswitch 239 1 7 43 81 86 123 160 197 234
      // 38: aload 2
      // 39: instanceof net/minecraft/item/ItemSword
      // 3c: ifne 54
      // 3f: goto 46
      // 42: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 45: athrow
      // 46: aload 2
      // 47: instanceof net/minecraft/item/ItemTool
      // 4a: ifeq 5c
      // 4d: goto 54
      // 50: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: bipush 1
      // 55: goto 5d
      // 58: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5b: athrow
      // 5c: bipush 0
      // 5d: ireturn
      // 5e: aload 2
      // 5f: instanceof net/minecraft/item/ItemBow
      // 62: ireturn
      // 63: aload 2
      // 64: instanceof net/minecraft/item/ItemArmor
      // 67: ifeq 86
      // 6a: aload 2
      // 6b: checkcast net/minecraft/item/ItemArmor
      // 6e: getfield net/minecraft/item/ItemArmor.field_77881_a Lnet/minecraft/inventory/EntityEquipmentSlot;
      // 71: getstatic net/minecraft/inventory/EntityEquipmentSlot.HEAD Lnet/minecraft/inventory/EntityEquipmentSlot;
      // 74: if_acmpne 86
      // 77: goto 7e
      // 7a: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7d: athrow
      // 7e: bipush 1
      // 7f: goto 87
      // 82: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 85: athrow
      // 86: bipush 0
      // 87: ireturn
      // 88: aload 2
      // 89: instanceof net/minecraft/item/ItemArmor
      // 8c: ifeq ab
      // 8f: aload 2
      // 90: checkcast net/minecraft/item/ItemArmor
      // 93: getfield net/minecraft/item/ItemArmor.field_77881_a Lnet/minecraft/inventory/EntityEquipmentSlot;
      // 96: getstatic net/minecraft/inventory/EntityEquipmentSlot.CHEST Lnet/minecraft/inventory/EntityEquipmentSlot;
      // 99: if_acmpne ab
      // 9c: goto a3
      // 9f: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a2: athrow
      // a3: bipush 1
      // a4: goto ac
      // a7: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // aa: athrow
      // ab: bipush 0
      // ac: ireturn
      // ad: aload 2
      // ae: instanceof net/minecraft/item/ItemArmor
      // b1: ifeq d0
      // b4: aload 2
      // b5: checkcast net/minecraft/item/ItemArmor
      // b8: getfield net/minecraft/item/ItemArmor.field_77881_a Lnet/minecraft/inventory/EntityEquipmentSlot;
      // bb: getstatic net/minecraft/inventory/EntityEquipmentSlot.LEGS Lnet/minecraft/inventory/EntityEquipmentSlot;
      // be: if_acmpne d0
      // c1: goto c8
      // c4: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c7: athrow
      // c8: bipush 1
      // c9: goto d1
      // cc: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // cf: athrow
      // d0: bipush 0
      // d1: ireturn
      // d2: aload 2
      // d3: instanceof net/minecraft/item/ItemArmor
      // d6: ifeq f5
      // d9: aload 2
      // da: checkcast net/minecraft/item/ItemArmor
      // dd: getfield net/minecraft/item/ItemArmor.field_77881_a Lnet/minecraft/inventory/EntityEquipmentSlot;
      // e0: getstatic net/minecraft/inventory/EntityEquipmentSlot.FEET Lnet/minecraft/inventory/EntityEquipmentSlot;
      // e3: if_acmpne f5
      // e6: goto ed
      // e9: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ec: athrow
      // ed: bipush 1
      // ee: goto f6
      // f1: invokestatic com/schnurritv/sexmod/b2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // f4: athrow
      // f5: bipush 0
      // f6: ireturn
      // f7: aload 2
      // f8: instanceof net/minecraft/item/ItemFishingRod
      // fb: ireturn
      // fc: bipush 0
      // fd: ireturn
      // try (3 -> 11): 12 java/lang/RuntimeException
      // try (8 -> 17): 18 java/lang/RuntimeException
      // try (14 -> 22): 22 java/lang/RuntimeException
      // try (29 -> 37): 38 java/lang/RuntimeException
      // try (32 -> 42): 42 java/lang/RuntimeException
      // try (46 -> 54): 55 java/lang/RuntimeException
      // try (49 -> 59): 59 java/lang/RuntimeException
      // try (63 -> 71): 72 java/lang/RuntimeException
      // try (66 -> 76): 76 java/lang/RuntimeException
      // try (80 -> 88): 89 java/lang/RuntimeException
      // try (83 -> 93): 93 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   public enum a {
      WEAPON(0),
      BOW(1),
      HELMET(2),
      CHEST_PLATE(3),
      PANTS(4),
      SHOES(5),
      ROD(6);

      public int id;

      public static b2.a a(int var0) {
         try {
            switch (var0) {
               case 0:
                  return WEAPON;
               case 1:
                  return BOW;
               case 2:
                  return HELMET;
               case 3:
                  return CHEST_PLATE;
               case 4:
                  return PANTS;
               case 5:
                  return SHOES;
               case 6:
                  return ROD;
            }
         } catch (NullPointerException var1) {
            throw a(var1);
         }

         throw new NullPointerException("Girls don't have a slot nr. " + var0);
      }

      a(int var3) {
         this.id = var3;
      }

      private static NullPointerException a(NullPointerException var0) {
         return var0;
      }
   }
}
