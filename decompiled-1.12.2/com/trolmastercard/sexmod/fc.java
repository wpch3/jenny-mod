package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.BlockLog;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class fc implements IMessage {
    Boolean b = false;
    BlockPos a;

    public fc() {
    }

    public fc(BlockPos var1) {
        this.a = var1;
    }

    public void fromBytes(ByteBuf var1) {
        this.a = new BlockPos(var1.readInt(), var1.readInt(), var1.readInt());
        this.b = true;
    }

    public void toBytes(ByteBuf var1) {
        var1.writeInt(this.a.func_177958_n());
        var1.writeInt(this.a.func_177956_o());
        var1.writeInt(this.a.func_177952_p());
    }

    public static class a implements IMessageHandler<fc, IMessage> {
        public IMessage a(fc param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/fc.b Ljava/lang/Boolean;
            // 04: invokevirtual java/lang/Boolean.booleanValue ()Z
            // 07: ifeq 1e
            // 0a: aload 2
            // 0b: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
            // 11: invokevirtual net/minecraftforge/fml/relauncher/Side.equals (Ljava/lang/Object;)Z
            // 14: ifne 2c
            // 17: goto 1e
            // 1a: invokestatic com/trolmastercard/sexmod/fc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1d: athrow
            // 1e: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 21: ldc "received an invalid Message @FallTree :("
            // 23: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 26: aconst_null
            // 27: areturn
            // 28: invokestatic com/trolmastercard/sexmod/fc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 2b: athrow
            // 2c: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
            // 2f: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
            // 32: aload 0
            // 33: aload 2
            // 34: aload 1
            // 35: invokedynamic run (Lcom/trolmastercard/sexmod/fc$a;Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;Lcom/trolmastercard/sexmod/fc;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/trolmastercard/sexmod/fc$a.lambda$onMessage$0 (Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;Lcom/trolmastercard/sexmod/fc;)V, ()V ]
            // 3a: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
            // 3d: pop
            // 3e: aconst_null
            // 3f: areturn
            // try (0 -> 9): 10 java/lang/RuntimeException
            // try (4 -> 17): 17 java/lang/RuntimeException
        }

        BlockPos a(World var1, BlockPos var2) {
            try {
                if (var1.func_180495_p(var2.func_177982_a(0, -1, 0)).func_177230_c() instanceof BlockLog) {
                    return this.a(var1, var2.func_177982_a(0, -1, 0));
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            try {
                if (var1.func_180495_p(var2.func_177982_a(1, -1, 0)).func_177230_c() instanceof BlockLog) {
                    return this.a(var1, var2.func_177982_a(1, -1, 0));
                }
            } catch (RuntimeException var11) {
                throw a(var11);
            }

            try {
                if (var1.func_180495_p(var2.func_177982_a(-1, -1, 0)).func_177230_c() instanceof BlockLog) {
                    return this.a(var1, var2.func_177982_a(-1, -1, 0));
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }

            try {
                if (var1.func_180495_p(var2.func_177982_a(0, -1, 1)).func_177230_c() instanceof BlockLog) {
                    return this.a(var1, var2.func_177982_a(0, -1, 1));
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            try {
                if (var1.func_180495_p(var2.func_177982_a(0, -1, -1)).func_177230_c() instanceof BlockLog) {
                    return this.a(var1, var2.func_177982_a(0, -1, -1));
                }
            } catch (RuntimeException var5) {
                throw a(var5);
            }

            try {
                if (var1.func_180495_p(var2.func_177982_a(-1, -1, -1)).func_177230_c() instanceof BlockLog) {
                    return this.a(var1, var2.func_177982_a(-1, -1, -1));
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }

            try {
                if (var1.func_180495_p(var2.func_177982_a(1, -1, 1)).func_177230_c() instanceof BlockLog) {
                    return this.a(var1, var2.func_177982_a(1, -1, 1));
                }
            } catch (RuntimeException var4) {
                throw a(var4);
            }

            try {
                if (var1.func_180495_p(var2.func_177982_a(-1, -1, 1)).func_177230_c() instanceof BlockLog) {
                    return this.a(var1, var2.func_177982_a(-1, -1, 1));
                }
            } catch (RuntimeException var8) {
                throw a(var8);
            }

            try {
                return var1.func_180495_p(var2.func_177982_a(1, -1, -1)).func_177230_c() instanceof BlockLog
                    ? this.a(var1, var2.func_177982_a(1, -1, -1))
                    : var2;
            } catch (RuntimeException var3) {
                throw a(var3);
            }
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
