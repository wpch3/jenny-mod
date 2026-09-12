package com;

import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.EnumPacketDirection;

public class c extends NetHandlerPlayClient {
   public c(Minecraft var1) {
      super(var1, var1.field_71462_r, new a(EnumPacketDirection.CLIENTBOUND), var1.func_110432_I().func_148256_e());
   }
}
