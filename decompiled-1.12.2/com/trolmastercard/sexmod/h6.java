package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.HashSet;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class h6 implements IMessage {
    boolean b = false;
    HashSet<BlockPos> c = new HashSet<>();
    boolean a;

    public h6() {
    }

    public h6(HashSet<BlockPos> var1, boolean var2) {
        this.c = var1;
        this.a = var2;
    }

    public h6(BlockPos var1, boolean var2) {
        this.c.add(var1);
        this.a = var2;
    }

    public void fromBytes(ByteBuf var1) {
        this.a = var1.readBoolean();
        int var2 = var1.readInt();
        int var3 = 0;

        try {
            while (var3 < var2) {
                this.c.add(new BlockPos(var1.readInt(), var1.readInt(), var1.readInt()));
                var3++;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        this.b = true;
    }

    public void toBytes(ByteBuf var1) {
        var1.writeBoolean(this.a);
        var1.writeInt(this.c.size());

        for (BlockPos var3 : this.c) {
            var1.writeInt(var3.func_177958_n());
            var1.writeInt(var3.func_177956_o());
            var1.writeInt(var3.func_177952_p());
        }
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }

    public static class a implements IMessageHandler<h6, IMessage> {
        public IMessage a(h6 param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/h6.b Z
            // 04: ifne 15
            // 07: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 0a: ldc "received an invalid Message @SendBlocks :("
            // 0c: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 0f: aconst_null
            // 10: areturn
            // 11: invokestatic com/trolmastercard/sexmod/h6$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 14: athrow
            // 15: aload 2
            // 16: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 19: invokevirtual net/minecraftforge/fml/relauncher/Side.isClient ()Z
            // 1c: ifeq 44
            // 1f: aload 1
            // 20: getfield com/trolmastercard/sexmod/h6.a Z
            // 23: ifeq 3b
            // 26: goto 2d
            // 29: invokestatic com/trolmastercard/sexmod/h6$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 2c: athrow
            // 2d: aload 1
            // 2e: getfield com/trolmastercard/sexmod/h6.c Ljava/util/HashSet;
            // 31: invokestatic com/trolmastercard/sexmod/gm.a (Ljava/util/HashSet;)V
            // 34: goto 42
            // 37: invokestatic com/trolmastercard/sexmod/h6$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 3a: athrow
            // 3b: aload 1
            // 3c: getfield com/trolmastercard/sexmod/h6.c Ljava/util/HashSet;
            // 3f: invokestatic com/trolmastercard/sexmod/gm.b (Ljava/util/HashSet;)V
            // 42: aconst_null
            // 43: areturn
            // 44: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
            // 47: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
            // 4a: aload 2
            // 4b: aload 1
            // 4c: invokedynamic run (Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;Lcom/trolmastercard/sexmod/h6;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/trolmastercard/sexmod/h6$a.lambda$onMessage$0 (Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;Lcom/trolmastercard/sexmod/h6;)V, ()V ]
            // 51: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
            // 54: pop
            // 55: aconst_null
            // 56: areturn
            // try (0 -> 8): 8 java/lang/RuntimeException
            // try (10 -> 17): 18 java/lang/RuntimeException
            // try (14 -> 24): 24 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
