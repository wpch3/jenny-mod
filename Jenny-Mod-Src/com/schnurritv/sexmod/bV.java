package com.schnurritv.sexmod;

import java.util.HashSet;
import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bv extends bW {
   public bv(RenderManager var1, AnimatedGeoModel var2, double var3) {
      super(var1, var2, var3);
   }

   @Override
   protected HashSet<String> b() {
      HashSet var1 = super.b();
      var1.add("figure");
      return var1;
   }
}
