package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class b_ implements IMessage {
   boolean a = false;
   UUID c;
   UUID b;

   public b_() {
   }

   public b_(UUID var1, UUID var2) {
      this.c = var1;
      this.b = var2;
   }

   public void fromBytes(ByteBuf var1) {
      this.c = UUID.fromString(ByteBufUtils.readUTF8String(var1));
      this.b = UUID.fromString(ByteBufUtils.readUTF8String(var1));
      this.a = true;
   }

   public void toBytes(ByteBuf var1) {
      ByteBufUtils.writeUTF8String(var1, this.c.toString());
      ByteBufUtils.writeUTF8String(var1, this.b.toString());
   }

   public static class a implements IMessageHandler<b_, IMessage> {
      public IMessage a(b_ var1, MessageContext var2) {
         try {
            if (!var1.a) {
               System.out.println("received an invalid message @BeeOpenChest :(");
               return null;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         FMLCommonHandler.instance()
            .getMinecraftServerInstance()
            .func_152344_a(
               () -> {
                  for (bi var3x : bi.i(var1.c)) {
                     try {
                        if (var3x.field_70170_p.field_72995_K) {
                           continue;
                        }
                     } catch (RuntimeException var9) {
                        throw a(var9);
                     }

                     try {
                        if (!(var3x instanceof c4)) {
                           continue;
                        }
                     } catch (RuntimeException var8) {
                        throw a(var8);
                     }

                     c4 var4 = (c4)var3x;

                     try {
                        if (!(Boolean)var4.func_184212_Q().func_187225_a(c4.K)) {
                           continue;
                        }
                     } catch (RuntimeException var7) {
                        throw a(var7);
                     }

                     EntityPlayerMP var5 = (EntityPlayerMP)var4.field_70170_p.func_152378_a(var1.b);

                     try {
                        if (var5 == null) {
                           continue;
                        }
                     } catch (RuntimeException var6) {
                        throw a(var6);
                     }

                     var5.openGui(
                        Main.instance,
                        1,
                        var3x.field_70170_p,
                        var3x.func_180425_c().func_177958_n(),
                        var3x.func_180425_c().func_177956_o(),
                        var3x.func_180425_c().func_177952_p()
                     );
                     return;
                  }
               }
            );
         return null;
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }
}
