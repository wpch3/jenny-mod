package com.schnurritv.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class cS implements IMessage {
   boolean b = false;
   UUID c;
   int d;
   bj a;

   public cS() {
   }

   public cS(UUID var1, int var2, bj var3) {
      this.c = var1;
      this.d = var2;
      this.a = var3;
   }

   public void fromBytes(ByteBuf var1) {
      this.c = UUID.fromString(ByteBufUtils.readUTF8String(var1));
      this.d = var1.readInt();
      this.a = bj.valueOf(ByteBufUtils.readUTF8String(var1));
      this.b = true;
   }

   public void toBytes(ByteBuf var1) {
      ByteBufUtils.writeUTF8String(var1, this.c.toString());
      var1.writeInt(this.d);
      ByteBufUtils.writeUTF8String(var1, this.a.toString());
   }

   public static class a implements IMessageHandler<cS, IMessage> {
      public IMessage a(cS param1, MessageContext param2) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
         //
         // Bytecode:
         // 00: aload 1
         // 01: getfield com/schnurritv/sexmod/cS.b Z
         // 04: ifeq 1b
         // 07: aload 2
         // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
         // 0b: getstatic net/minecraftforge/fml/relauncher/Side.CLIENT Lnet/minecraftforge/fml/relauncher/Side;
         // 0e: invokevirtual net/minecraftforge/fml/relauncher/Side.equals (Ljava/lang/Object;)Z
         // 11: ifne 29
         // 14: goto 1b
         // 17: invokestatic com/schnurritv/sexmod/cS$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 1a: athrow
         // 1b: getstatic java/lang/System.out Ljava/io/PrintStream;
         // 1e: ldc "received an invalid message @ForcePlayerGirlUpdate :("
         // 20: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
         // 23: aconst_null
         // 24: areturn
         // 25: invokestatic com/schnurritv/sexmod/cS$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 28: athrow
         // 29: aload 1
         // 2a: getfield com/schnurritv/sexmod/cS.c Ljava/util/UUID;
         // 2d: invokestatic com/schnurritv/sexmod/bg.e (Ljava/util/UUID;)Lcom/schnurritv/sexmod/bg;
         // 30: astore 3
         // 31: aload 3
         // 32: ifnonnull 3b
         // 35: aconst_null
         // 36: areturn
         // 37: invokestatic com/schnurritv/sexmod/cS$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 3a: athrow
         // 3b: aload 3
         // 3c: invokevirtual com/schnurritv/sexmod/bg.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
         // 3f: getstatic com/schnurritv/sexmod/bi.k Lnet/minecraft/network/datasync/DataParameter;
         // 42: aload 1
         // 43: getfield com/schnurritv/sexmod/cS.a Lcom/schnurritv/sexmod/bj;
         // 46: invokevirtual com/schnurritv/sexmod/bj.toString ()Ljava/lang/String;
         // 49: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
         // 4c: aload 3
         // 4d: invokevirtual com/schnurritv/sexmod/bg.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
         // 50: getstatic com/schnurritv/sexmod/bi.t Lnet/minecraft/network/datasync/DataParameter;
         // 53: aload 1
         // 54: getfield com/schnurritv/sexmod/cS.d I
         // 57: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
         // 5a: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
         // 5d: aconst_null
         // 5e: areturn
         // try (0 -> 8): 9 java/lang/RuntimeException
         // try (3 -> 16): 16 java/lang/RuntimeException
         // try (22 -> 26): 26 java/lang/RuntimeException
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }
}
