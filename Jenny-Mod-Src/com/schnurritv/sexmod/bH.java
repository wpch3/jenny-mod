package com.schnurritv.sexmod;

import java.util.HashSet;
import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bh extends bW {
   public bh(RenderManager var1, AnimatedGeoModel var2, double var3) {
      super(var1, var2, var3);
   }

   @Override
   protected HashSet<String> b() {
      return new HashSet<String>() {
         {
            this.add("boobs");
            this.add("booty");
            this.add("vagina");
            this.add("fuckhole");
            this.add("leaf7");
            this.add("leaf8");
         }
      };
   }
}
