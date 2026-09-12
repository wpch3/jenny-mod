package com.schnurritv.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class aw$a implements IMessageHandler<aw, IMessage> {
   public IMessage a(aw var1, MessageContext var2) {
      try {
         if (!var1.c) {
            System.out.println("recieved an unvalid message @SendChatMessage :(");
            return null;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      try {
         if (var2.side.isClient()) {
            Minecraft.func_71410_x().field_71439_g.func_145747_a(new TextComponentString(var1.a));
            return null;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
         Vec3d var1x = ((bi)bi.i(var1.d).get(0)).p();
         at.a.sendToAllAround(new aw(var1.a, var1.b, var1.d), new TargetPoint(var1.b, var1x.field_72450_a, var1x.field_72448_b, var1x.field_72449_c, 40.0));
      });
      return null;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
