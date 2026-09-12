package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class cY implements IMessage {
   boolean a;
   UUID b;
   UUID c;

   public cY() {
   }

   public cY(UUID var1, UUID var2) {
      this.b = var1;
      this.c = var2;
      this.a = true;
   }

   public void fromBytes(ByteBuf var1) {
      this.b = UUID.fromString(ByteBufUtils.readUTF8String(var1));
      this.c = UUID.fromString(ByteBufUtils.readUTF8String(var1));
      this.a = true;
   }

   public void toBytes(ByteBuf var1) {
      ByteBufUtils.writeUTF8String(var1, this.b.toString());
      ByteBufUtils.writeUTF8String(var1, this.c.toString());
   }

   public static class a implements IMessageHandler<cY, IMessage> {
      public IMessage a(cY param1, MessageContext param2) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
         //
         // Bytecode:
         // 00: aload 1
         // 01: getfield com/schnurritv/sexmod/cY.a Z
         // 04: ifeq 18
         // 07: aload 2
         // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
         // 0b: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
         // 0e: if_acmpeq 1e
         // 11: goto 18
         // 14: invokestatic com/schnurritv/sexmod/cY$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 17: athrow
         // 18: aconst_null
         // 19: areturn
         // 1a: invokestatic com/schnurritv/sexmod/cY$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 1d: athrow
         // 1e: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
         // 21: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
         // 24: aload 1
         // 25: invokedynamic run (Lcom/schnurritv/sexmod/cY;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/schnurritv/sexmod/cY$a.lambda$onMessage$0 (Lcom/schnurritv/sexmod/cY;)V, ()V ]
         // 2a: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
         // 2d: pop
         // 2e: aconst_null
         // 2f: areturn
         // try (0 -> 7): 8 java/lang/RuntimeException
         // try (3 -> 12): 12 java/lang/RuntimeException
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }
}
