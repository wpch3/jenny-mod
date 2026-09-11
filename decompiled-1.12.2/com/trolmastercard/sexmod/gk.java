package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class gk implements IMessage {
    boolean a = false;
    UUID b;

    public gk() {
    }

    public gk(UUID var1) {
        this.b = var1;
    }

    public void fromBytes(ByteBuf var1) {
        this.b = UUID.fromString(ByteBufUtils.readUTF8String(var1));
        this.a = true;
    }

    public void toBytes(ByteBuf var1) {
        ByteBufUtils.writeUTF8String(var1, this.b.toString());
    }

    public static class a implements IMessageHandler<gk, IMessage> {
        public IMessage a(gk param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/gk.a Z
            // 04: ifeq 1b
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: invokevirtual net/minecraftforge/fml/relauncher/Side.equals (Ljava/lang/Object;)Z
            // 11: ifne 29
            // 14: goto 1b
            // 17: invokestatic com/trolmastercard/sexmod/gk$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1a: athrow
            // 1b: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1e: ldc "received an invalid message @CatEatingDone :("
            // 20: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 23: aconst_null
            // 24: areturn
            // 25: invokestatic com/trolmastercard/sexmod/gk$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 28: athrow
            // 29: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
            // 2c: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
            // 2f: aload 1
            // 30: invokedynamic run (Lcom/trolmastercard/sexmod/gk;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/trolmastercard/sexmod/gk$a.lambda$onMessage$0 (Lcom/trolmastercard/sexmod/gk;)V, ()V ]
            // 35: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
            // 38: pop
            // 39: aconst_null
            // 3a: areturn
            // try (0 -> 8): 9 java/lang/RuntimeException
            // try (3 -> 16): 16 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
