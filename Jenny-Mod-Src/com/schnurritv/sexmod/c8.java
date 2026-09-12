package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class c8 implements IMessage {
   boolean b = false;
   String c;
   List<Integer> a = new ArrayList<>();
   UUID d;

   public c8() {
   }

   public c8(String var1, UUID var2) {
      this.c = var1;
      this.d = var2;
   }

   public c8(String var1, UUID var2, List<Integer> var3) {
      this.c = var1;
      this.d = var2;
      this.a = var3;
   }

   public void fromBytes(ByteBuf var1) {
      this.c = ByteBufUtils.readUTF8String(var1);
      this.d = UUID.fromString(ByteBufUtils.readUTF8String(var1));
      int var2 = var1.readInt();
      int var3 = 0;

      try {
         while (var3 < var2) {
            this.a.add(var1.readInt());
            var3++;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      this.b = true;
   }

   public void toBytes(ByteBuf var1) {
      ByteBufUtils.writeUTF8String(var1, this.c);
      ByteBufUtils.writeUTF8String(var1, this.d.toString());
      var1.writeInt(this.a.size());

      for (int var3 : this.a) {
         var1.writeInt(var3);
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   public static class a implements IMessageHandler<c8, IMessage> {
      public IMessage a(c8 param1, MessageContext param2) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
         //
         // Bytecode:
         // 00: aload 1
         // 01: getfield com/schnurritv/sexmod/c8.b Z
         // 04: ifeq 18
         // 07: aload 2
         // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
         // 0b: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
         // 0e: if_acmpeq 26
         // 11: goto 18
         // 14: invokestatic com/schnurritv/sexmod/c8$a.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
         // 17: athrow
         // 18: getstatic java/lang/System.out Ljava/io/PrintStream;
         // 1b: ldc "received an invalid message @UploadModelString :("
         // 1d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
         // 20: aconst_null
         // 21: areturn
         // 22: invokestatic com/schnurritv/sexmod/c8$a.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
         // 25: athrow
         // 26: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
         // 29: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
         // 2c: aload 0
         // 2d: aload 1
         // 2e: aload 2
         // 2f: invokedynamic run (Lcom/schnurritv/sexmod/c8$a;Lcom/schnurritv/sexmod/c8;Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/schnurritv/sexmod/c8$a.lambda$onMessage$0 (Lcom/schnurritv/sexmod/c8;Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;)V, ()V ]
         // 34: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
         // 37: pop
         // 38: aconst_null
         // 39: areturn
         // try (0 -> 7): 8 java/lang/IndexOutOfBoundsException
         // try (3 -> 15): 15 java/lang/IndexOutOfBoundsException
      }

      boolean a(bi var1, List<Integer> var2) {
         ArrayList var3 = var1.S();

         try {
            int var4 = 0;

            while (true) {
               try {
                  if (var4 >= var3.size()) {
                     return true;
                  }

                  if ((Integer)var3.get(var4) <= (Integer)var2.get(var4)) {
                     return false;
                  }
               } catch (IndexOutOfBoundsException var5) {
                  throw a(var5);
               }

               var4++;
            }
         } catch (IndexOutOfBoundsException var6) {
            return false;
         }
      }

      private static IndexOutOfBoundsException a(IndexOutOfBoundsException var0) {
         return var0;
      }
   }
}
