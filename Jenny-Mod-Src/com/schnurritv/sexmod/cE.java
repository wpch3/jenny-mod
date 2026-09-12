package com.schnurritv.sexmod;

import javax.swing.JFrame;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class cE extends JFrame {
   public boolean a = false;

   @SubscribeEvent
   public void a(ClientTickEvent var1) {
      try {
         if (this.a) {
            return;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      this.a = true;
      X.a();
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
