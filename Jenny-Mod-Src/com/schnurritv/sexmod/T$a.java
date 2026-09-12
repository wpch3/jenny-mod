package com.schnurritv.sexmod;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class T$a implements IMessageHandler<T, IMessage> {
   public IMessage a(T var1, MessageContext var2) {
      try {
         if (!var1.b) {
            System.out.println("received an invalid message @SendGirlToSex :(");
            return null;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
         for (bi var3x : bi.i(var1.a)) {
            try {
               if (var3x.field_70170_p.field_72995_K) {
                  continue;
               }
            } catch (RuntimeException var5) {
               throw a(var5);
            }

            try {
               if (var3x instanceof aP) {
                  ((aP)var3x).a();
               }
            } catch (RuntimeException var4) {
               throw a(var4);
            }
         }
      });
      return null;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
