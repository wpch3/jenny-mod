package com.schnurritv.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class a2 extends GuiContainer {
   private static final ResourceLocation e = new ResourceLocation("textures/gui/container/generic_54.png");
   private final IInventory f;
   private final IInventory g;
   private final int c;
   UUID a;
   bi d;
   UUID b;

   public a2(EntityPlayer var1, bi var2, UUID var3) {
      super(new b4(var1.field_71071_by, (IInventory)var2, var1, var3));
      this.a = var3;
      this.d = var2;
      this.b = var1.getPersistentID();
      this.f = var1.field_71071_by;
      this.g = (IInventory)var2;
      this.field_146291_p = false;
      this.c = ((IInventory)var2).func_70302_i_() / 9;
      this.field_147000_g = 114 + this.c * 18;
   }

   public void func_73863_a(int var1, int var2, float var3) {
      this.func_146276_q_();
      super.func_73863_a(var1, var2, var3);
      this.func_191948_b(var1, var2);
   }

   protected void func_146979_b(int var1, int var2) {
      this.field_146289_q.func_78276_b(this.d.P(), 8, 6, 4210752);
      this.field_146289_q.func_78276_b(this.f.func_145748_c_().func_150260_c(), 8, this.field_147000_g - 96 + 2, 4210752);
   }

   protected void func_146976_a(float var1, int var2, int var3) {
      GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.func_110434_K().func_110577_a(e);
      int var4 = (this.field_146294_l - this.field_146999_f) / 2;
      int var5 = (this.field_146295_m - this.field_147000_g) / 2;
      this.func_73729_b(var4, var5, 0, 0, this.field_146999_f, this.c * 18 + 17);
      this.func_73729_b(var4, var5 + this.c * 18 + 17, 0, 126, this.field_146999_f, 96);
   }

   public void func_146281_b() {
      super.func_146281_b();

      for (a7 var2 : a7.b) {
         if (var2.d.equals(this.a)) {
            ItemStack[] var3 = new ItemStack[63];
            Minecraft.func_71410_x().field_71439_g.field_71071_by.field_70462_a.toArray(var3);
            int var4 = 0;

            try {
               while (var4 < 27) {
                  var3[var4 + 36] = var2.func_75139_a(var4).func_75211_c();
                  var4++;
               }
            } catch (RuntimeException var5) {
               throw a(var5);
            }

            at.a.sendToServer(new ar(this.d.A(), this.b, var3));
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
