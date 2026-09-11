package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.HashSet;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class e6 implements IMessage {
    boolean c = false;
    BlockPos a;
    EnumFacing b;

    public e6() {
    }

    public e6(BlockPos var1, EnumFacing var2) {
        this.a = var1;
        this.b = var2;
    }

    public void fromBytes(ByteBuf var1) {
        this.a = new BlockPos(var1.readInt(), var1.readInt(), var1.readInt());
        this.b = EnumFacing.func_176739_a(ByteBufUtils.readUTF8String(var1));
        this.c = true;
    }

    public void toBytes(ByteBuf var1) {
        var1.writeInt(this.a.func_177958_n());
        var1.writeInt(this.a.func_177956_o());
        var1.writeInt(this.a.func_177952_p());
        ByteBufUtils.writeUTF8String(var1, this.b.func_176610_l());
    }

    public static class a implements IMessageHandler<e6, IMessage> {
        public IMessage a(e6 param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/e6.c Z
            // 04: ifeq 1b
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: invokevirtual net/minecraftforge/fml/relauncher/Side.equals (Ljava/lang/Object;)Z
            // 11: ifne 29
            // 14: goto 1b
            // 17: invokestatic com/trolmastercard/sexmod/e6$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1a: athrow
            // 1b: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1e: ldc "received an invalid Message @Mine :("
            // 20: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 23: aconst_null
            // 24: areturn
            // 25: invokestatic com/trolmastercard/sexmod/e6$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 28: athrow
            // 29: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
            // 2c: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
            // 2f: aload 0
            // 30: aload 2
            // 31: aload 1
            // 32: invokedynamic run (Lcom/trolmastercard/sexmod/e6$a;Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;Lcom/trolmastercard/sexmod/e6;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/trolmastercard/sexmod/e6$a.lambda$onMessage$0 (Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;Lcom/trolmastercard/sexmod/e6;)V, ()V ]
            // 37: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
            // 3a: pop
            // 3b: aconst_null
            // 3c: areturn
            // try (0 -> 8): 9 java/lang/RuntimeException
            // try (3 -> 16): 16 java/lang/RuntimeException
        }

        HashSet<BlockPos> a(BlockPos var1, EnumFacing var2) {
            HashSet var3 = new HashSet();
            BlockPos var4 = var1;

            for (int var5 = 0; var5 < 30; var5++) {
                var3.add(var4.func_177973_b(this.a(var2)));
                var3.add(var4.func_177973_b(this.a(var2)).func_177984_a());
                var3.add(var4.func_177973_b(this.a(var2)).func_177984_a().func_177984_a());
                var3.add(var4);
                var3.add(var4.func_177984_a());
                var3.add(var4.func_177984_a().func_177984_a());
                var3.add(var4.func_177971_a(this.a(var2)));
                var3.add(var4.func_177971_a(this.a(var2)).func_177984_a());
                var3.add(var4.func_177971_a(this.a(var2)).func_177984_a().func_177984_a());
                var4 = var4.func_177971_a(var2.func_176730_m());
            }

            return var3;
        }

        BlockPos a(EnumFacing var1) {
            Vec3i var2 = var1.func_176730_m();
            return new BlockPos(var2.func_177952_p(), var2.func_177956_o(), -var2.func_177958_n());
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
