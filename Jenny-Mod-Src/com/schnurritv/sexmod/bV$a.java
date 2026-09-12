package com.schnurritv.sexmod;

import java.util.HashMap;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor.ArmorMaterial;

class bV$a {
   public static HashMap<String, Integer[]> a = new HashMap<>();

   public static int b(EntityEquipmentSlot var0, ArmorMaterial var1) {
      try {
         return a.get(var0.toString() + var1.toString())[0];
      } catch (NullPointerException var3) {
         return 3;
      }
   }

   public static int a(EntityEquipmentSlot var0, ArmorMaterial var1) {
      try {
         return a.get(var0.toString() + var1.toString())[1];
      } catch (NullPointerException var3) {
         return 0;
      }
   }

   public static void a(EntityEquipmentSlot var0, ArmorMaterial var1, int var2, int var3) {
      a.put(var0.toString() + var1.toString(), new Integer[]{var2, var3});
   }
}
