package com.schnurritv.sexmod;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class bL extends RenderLiving<aV> {
   private static final ResourceLocation a = new ResourceLocation("textures/entity/slime/slime.png");

   public bL(RenderManager var1) {
      super(var1, new aO(), 0.25F);
      this.func_177094_a(new aA(this));
   }

   public void a(aV var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_76989_e = 0.25F * var1.i();
      super.func_76986_a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(aV var1, float var2) {
      float var3 = 0.999F;
      GlStateManager.func_179152_a(0.999F, 0.999F, 0.999F);
      float var4 = var1.i();
      float var5 = (var1.c + (var1.b - var1.c) * var2) / (var4 * 0.5F + 1.0F);
      float var6 = 1.0F / (var5 + 1.0F);
      GlStateManager.func_179152_a(var6 * var4, 1.0F / var6 * var4, var6 * var4);
   }

   protected ResourceLocation a(aV var1) {
      return a;
   }
}
