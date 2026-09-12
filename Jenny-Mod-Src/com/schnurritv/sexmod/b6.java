package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ConcurrentModificationException;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class b6 implements IMessage {
   boolean a = false;
   k b;

   public b6() {
   }

   public b6(k var1) {
      this.b = var1;
   }

   public void fromBytes(ByteBuf var1) {
      String var2 = ByteBufUtils.readUTF8String(var1);

      label17: {
         try {
            if ("player".equals(var2)) {
               this.b = null;
               break label17;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         this.b = k.valueOf(var2);
      }

      this.a = true;
   }

   public void toBytes(ByteBuf var1) {
      try {
         if (this.b == null) {
            ByteBufUtils.writeUTF8String(var1, "player");
            return;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      ByteBufUtils.writeUTF8String(var1, this.b.toString());
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   public static class a implements IMessageHandler<b6, IMessage> {
      public IMessage a(b6 param1, MessageContext param2) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
         //
         // Bytecode:
         // 00: aload 1
         // 01: getfield com/schnurritv/sexmod/b6.a Z
         // 04: ifeq 18
         // 07: aload 2
         // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
         // 0b: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
         // 0e: if_acmpeq 26
         // 11: goto 18
         // 14: invokestatic com/schnurritv/sexmod/b6$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
         // 17: athrow
         // 18: getstatic java/lang/System.out Ljava/io/PrintStream;
         // 1b: ldc "received an invalid message @UpdatePlayerModel :("
         // 1d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
         // 20: aconst_null
         // 21: areturn
         // 22: invokestatic com/schnurritv/sexmod/b6$a.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
         // 25: athrow
         // 26: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
         // 29: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
         // 2c: aload 2
         // 2d: aload 1
         // 2e: invokedynamic run (Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;Lcom/schnurritv/sexmod/b6;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/schnurritv/sexmod/b6$a.lambda$onMessage$0 (Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;Lcom/schnurritv/sexmod/b6;)V, ()V ]
         // 33: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
         // 36: pop
         // 37: aconst_null
         // 38: areturn
         // try (0 -> 7): 8 java/util/ConcurrentModificationException
         // try (3 -> 15): 15 java/util/ConcurrentModificationException
      }

      private static ConcurrentModificationException a(ConcurrentModificationException var0) {
         return var0;
      }
   }
}
