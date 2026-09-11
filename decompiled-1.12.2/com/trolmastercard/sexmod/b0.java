package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class b0 implements IMessage {
    boolean a;
    UUID c;
    UUID b;

    public b0() {
        this.a = false;
    }

    public b0(UUID var1, UUID var2) {
        this.c = var1;
        this.b = var2;
        this.a = true;
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

    public static class a implements IMessageHandler<b0, IMessage> {
        public IMessage a(b0 param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/b0.a Z
            // 04: ifeq 18
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: if_acmpeq 26
            // 11: goto 18
            // 14: invokestatic com/trolmastercard/sexmod/b0$a.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
            // 17: athrow
            // 18: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1b: ldc "received an invalid message @SetPlayerForGirl :("
            // 1d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 20: aconst_null
            // 21: areturn
            // 22: invokestatic com/trolmastercard/sexmod/b0$a.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
            // 25: athrow
            // 26: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
            // 29: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
            // 2c: aload 1
            // 2d: invokedynamic run (Lcom/trolmastercard/sexmod/b0;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/trolmastercard/sexmod/b0$a.lambda$onMessage$0 (Lcom/trolmastercard/sexmod/b0;)V, ()V ]
            // 32: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
            // 35: pop
            // 36: aconst_null
            // 37: areturn
            // try (0 -> 7): 8 java/lang/NullPointerException
            // try (3 -> 15): 15 java/lang/NullPointerException
        }

        private static NullPointerException a(NullPointerException var0) {
            return var0;
        }
    }
}
