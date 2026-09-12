package com.schnurritv.sexmod;

import javax.annotation.Nullable;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class aG extends AnimatedGeoModel<a8> {
   public ResourceLocation a(a8 var1) {
      try {
         if (var1.d) {
            return new ResourceLocation("sexmod", "geo/cross.geo.json");
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return bk.h(var1.b());
   }

   public ResourceLocation b(a8 var1) {
      try {
         if (var1.d) {
            return new ResourceLocation("sexmod", "textures/cross.png");
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return bk.c(var1.b());
   }

   public ResourceLocation c(a8 var1) {
      return new ResourceLocation("sexmod", "animations/slime/slime.animation.json");
   }

   public void a(a8 var1, Integer var2, @Nullable AnimationEvent var3) {
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
