package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class c3 implements IMessage {
   boolean b;
   UUID a;
   NBTTagCompound c;

   public c3() {
   }

   public c3(UUID var1, NBTTagCompound var2) {
      this.a = var1;
      this.c = var2;
   }

   public void fromBytes(ByteBuf var1) {
      this.a = UUID.fromString(ByteBufUtils.readUTF8String(var1));
      this.c = ByteBufUtils.readTag(var1);
      this.b = true;
   }

   public void toBytes(ByteBuf var1) {
      ByteBufUtils.writeUTF8String(var1, this.a.toString());
      ByteBufUtils.writeTag(var1, this.c);
   }

   public static class a implements IMessageHandler<c3, IMessage> {
      public IMessage a(c3 var1, MessageContext var2) {
         try {
            if (!var1.b) {
               System.out.println("received an invalid message @UpdateEquipment :(");
               return null;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            for (bi var3x : bi.i(var1.a)) {
               try {
                  if (var3x instanceof bs) {
                     ((bs)var3x).H.deserializeNBT(var1.c);
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
}
