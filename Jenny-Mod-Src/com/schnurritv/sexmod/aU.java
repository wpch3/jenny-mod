package com.schnurritv.sexmod;

import java.util.Random;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class au extends ab {
   public au(String var1) {
      super(var1);
   }

   @Override
   public boolean func_180709_b(World var1, Random var2, BlockPos var3) {
      try {
         this.a(var1, var3);
         if (f.a.nextInt(5) != 0) {
            return true;
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      EntityItemFrame var4 = new EntityItemFrame(var1, var3.func_177982_a(2, 2, 6), EnumFacing.EAST);
      ItemStack var5 = e.a(var1, var3.func_177958_n(), var3.func_177952_p(), (byte)0, false, false);
      var1.func_72838_d(var4);
      var4.func_82334_a(var5);
      return true;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
