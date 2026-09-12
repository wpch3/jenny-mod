package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class cF implements IMessage {
   boolean a = false;
   String e;
   UUID c;
   UUID b;
   boolean d;

   public cF() {
   }

   public cF(String var1, UUID var2, UUID var3, boolean var4) {
      this.e = var1;
      this.c = var2;
      this.b = var3;
      this.d = var4;
   }

   public void fromBytes(ByteBuf var1) {
      this.e = ByteBufUtils.readUTF8String(var1);
      this.c = UUID.fromString(ByteBufUtils.readUTF8String(var1));
      this.b = UUID.fromString(ByteBufUtils.readUTF8String(var1));
      this.d = var1.readBoolean();
      this.a = true;
   }

   public void toBytes(ByteBuf var1) {
      ByteBufUtils.writeUTF8String(var1, this.e);
      ByteBufUtils.writeUTF8String(var1, this.c.toString());
      ByteBufUtils.writeUTF8String(var1, this.b.toString());
      var1.writeBoolean(this.d);
   }

   public static class a implements IMessageHandler<cF, IMessage> {
      public IMessage a(cF var1, MessageContext var2) {
         try {
            if (!var1.a) {
               System.out.println("received an invalid message @SexPrompt :(");
               return null;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         try {
            if (var2.side.equals(Side.CLIENT)) {
               b3.b.a(new b3.a(var1.e, var1.c, var1.b, var1.d));
               return null;
            }
         } catch (RuntimeException var4) {
            throw a(var4);
         }

         FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            World var2x = var2.getServerHandler().field_147369_b.field_70170_p;
            EntityPlayer var3x = var2x.func_152378_a(var1.b);
            EntityPlayer var4x = var2x.func_152378_a(var1.c);

            try {
               if (var3x == null) {
                  System.out.println("Sex prompt invalid -> female player not found");
                  return;
               }
            } catch (RuntimeException var7) {
               throw a(var7);
            }

            try {
               if (var4x == null) {
                  System.out.println("Sex prompt invalid -> male player not found");
                  return;
               }
            } catch (RuntimeException var5) {
               throw a(var5);
            }

            SimpleNetworkWrapper var10000;
            cF var10001;
            EntityPlayer var10002;
            label27: {
               try {
                  var10000 = at.a;
                  var10001 = new cF(var1.e, var1.c, var1.b, var1.d);
                  if (var1.d) {
                     var10002 = var3x;
                     break label27;
                  }
               } catch (RuntimeException var6) {
                  throw a(var6);
               }

               var10002 = var4x;
            }

            var10000.sendTo(var10001, (EntityPlayerMP & EntityPlayerMP)var10002);
         });
         return null;
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }
}
