package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class aq implements IMessage {
    boolean d = false;
    float a;
    float b;
    int c;

    public aq() {
    }

    public aq(float var1, float var2, int var3) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
    }

    public void fromBytes(ByteBuf var1) {
        this.a = var1.readFloat();
        this.b = var1.readFloat();
        this.c = var1.readInt();
        this.d = true;
    }

    public void toBytes(ByteBuf var1) {
        var1.writeFloat(this.a);
        var1.writeFloat(this.b);
        var1.writeInt(this.c);
    }

    public static class a implements IMessageHandler<aq, IMessage> {
        public IMessage a(aq param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/aq.d Z
            // 04: ifeq 18
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.CLIENT Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: if_acmpeq 26
            // 11: goto 18
            // 14: invokestatic com/trolmastercard/sexmod/aq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 17: athrow
            // 18: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1b: ldc "received an invalid message @SetPlayerCam :("
            // 1d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 20: aconst_null
            // 21: areturn
            // 22: invokestatic com/trolmastercard/sexmod/aq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 25: athrow
            // 26: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 29: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
            // 2c: invokevirtual java/lang/Thread.getName ()Ljava/lang/String;
            // 2f: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 32: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
            // 35: astore 3
            // 36: aload 3
            // 37: aload 3
            // 38: aload 1
            // 39: invokedynamic run (Lnet/minecraft/client/Minecraft;Lcom/trolmastercard/sexmod/aq;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/trolmastercard/sexmod/aq$a.lambda$onMessage$0 (Lnet/minecraft/client/Minecraft;Lcom/trolmastercard/sexmod/aq;)V, ()V ]
            // 3e: invokevirtual net/minecraft/client/Minecraft.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
            // 41: pop
            // 42: aconst_null
            // 43: areturn
            // try (0 -> 7): 8 java/lang/RuntimeException
            // try (3 -> 15): 15 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
