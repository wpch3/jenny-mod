package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class b9 implements IMessage {
   boolean a;
   UUID c;
   Vec3d b;

   public b9() {
   }

   public b9(UUID var1, Vec3d var2) {
      this.c = var1;
      this.b = var2;
   }

   public void fromBytes(ByteBuf var1) {
      this.c = UUID.fromString(ByteBufUtils.readUTF8String(var1));
      this.b = new Vec3d(var1.readDouble(), var1.readDouble(), var1.readDouble());
      this.a = true;
   }

   public void toBytes(ByteBuf var1) {
      ByteBufUtils.writeUTF8String(var1, this.c.toString());
      var1.writeDouble(this.b.field_72450_a);
      var1.writeDouble(this.b.field_72448_b);
      var1.writeDouble(this.b.field_72449_c);
   }

   public static class a implements IMessageHandler<b9, IMessage> {
      public IMessage a(b9 var1, MessageContext var2) {
         try {
            if (!var1.a) {
               System.out.println("received an invalid message @SetNewHome :(");
               return null;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList var1x = bi.i(var1.c);

            try {
               if (var1x.isEmpty()) {
                  return;
               }
            } catch (RuntimeException var4) {
               throw a(var4);
            }

            for (bi var3x : var1x) {
               var3x.d = new Vec3d(var1.b.field_72450_a, Math.floor(var1.b.field_72448_b), var1.b.field_72449_c);
            }
         });
         return null;
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }
}
