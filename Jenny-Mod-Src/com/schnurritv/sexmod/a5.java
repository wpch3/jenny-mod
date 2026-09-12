package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class a5 implements IMessage {
   boolean b;
   boolean a;

   public a5(boolean var1) {
      this.a = var1;
      this.b = true;
   }

   public a5() {
      this.b = false;
   }

   public void fromBytes(ByteBuf var1) {
      this.a = var1.readBoolean();
      this.b = true;
   }

   public void toBytes(ByteBuf var1) {
      var1.writeBoolean(this.a);
      this.b = true;
   }

   public static class a implements IMessageHandler<a5, IMessage> {
      public IMessage a(a5 var1, MessageContext var2) {
         label35: {
            try {
               if (!var1.b || var2.side != Side.CLIENT) {
                  break label35;
               }
            } catch (Exception var6) {
               throw a(var6);
            }

            bE.a(var1.a);

            try {
               Minecraft.func_71410_x().field_71439_g.func_70016_h(0.0, 0.0, 0.0);
            } catch (Exception var5) {
            }

            try {
               if (var1.a) {
                  aT.d();
               }

               return null;
            } catch (Exception var4) {
               throw a(var4);
            }
         }

         System.out.println("received an invalid message @SetPlayerMovement :(");
         return null;
      }

      private static Exception a(Exception var0) {
         return var0;
      }
   }
}
