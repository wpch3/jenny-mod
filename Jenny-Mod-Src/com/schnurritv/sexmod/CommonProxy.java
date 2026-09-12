package com.schnurritv.sexmod;

import java.io.IOException;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
   public void preInitRegistries(FMLPreInitializationEvent var1) {
      GameRegistry.registerWorldGenerator(new t(), 0);
      r.a();
      c0.a();
      e.a();
      K.a();
      m.a();
      ai.a();
      ag.a();
      g.a();
      S.a();
      bB.a();
   }

   public void initRegistries(FMLInitializationEvent var1) throws IOException {
      Main.setConfigs();
      az.a();
      NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new bz());
      cl.a(false);
      at.b();
   }

   public void postInit(FMLPostInitializationEvent var1) throws IOException {
      this.setUpCustomModelsOnServer();
   }

   void setUpCustomModelsOnServer() {
      try {
         if (!FMLCommonHandler.instance().getMinecraftServerInstance().func_71262_S()) {
            return;
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      bk.b(false);
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
