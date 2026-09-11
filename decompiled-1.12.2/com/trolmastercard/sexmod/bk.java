package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class bk implements IMessage {
    boolean a = false;

    public void fromBytes(ByteBuf var1) {
        this.a = true;
    }

    public void toBytes(ByteBuf var1) {
    }

    public static class a implements IMessageHandler<bk, IMessage> {
        public IMessage a(bk param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/bk.a Z
            // 04: ifeq 1b
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: invokevirtual net/minecraftforge/fml/relauncher/Side.equals (Ljava/lang/Object;)Z
            // 11: ifne 29
            // 14: goto 1b
            // 17: invokestatic com/trolmastercard/sexmod/bk$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1a: athrow
            // 1b: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1e: ldc "received an invalid message @RequestRiding :("
            // 20: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 23: aconst_null
            // 24: areturn
            // 25: invokestatic com/trolmastercard/sexmod/bk$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 28: athrow
            // 29: aload 2
            // 2a: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/MessageContext.getServerHandler ()Lnet/minecraft/network/NetHandlerPlayServer;
            // 2d: getfield net/minecraft/network/NetHandlerPlayServer.field_147369_b Lnet/minecraft/entity/player/EntityPlayerMP;
            // 30: astore 3
            // 31: aload 3
            // 32: invokestatic com/trolmastercard/sexmod/v.b (Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/UUID;
            // 35: astore 4
            // 37: aload 4
            // 39: invokestatic com/trolmastercard/sexmod/em.a (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/em;
            // 3c: astore 5
            // 3e: aload 5
            // 40: ifnonnull 49
            // 43: aconst_null
            // 44: areturn
            // 45: invokestatic com/trolmastercard/sexmod/bk$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 48: athrow
            // 49: aload 3
            // 4a: aload 5
            // 4c: bipush 1
            // 4d: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184205_a (Lnet/minecraft/entity/Entity;Z)Z
            // 50: pop
            // 51: aload 5
            // 53: getstatic com/trolmastercard/sexmod/fp.CONTROLLED_FLIGHT Lcom/trolmastercard/sexmod/fp;
            // 56: invokevirtual com/trolmastercard/sexmod/em.b (Lcom/trolmastercard/sexmod/fp;)V
            // 59: aload 5
            // 5b: aload 3
            // 5c: invokevirtual com/trolmastercard/sexmod/em.a (Lnet/minecraft/entity/player/EntityPlayer;)V
            // 5f: aload 5
            // 61: ldc2_w 0.25
            // 64: putfield com/trolmastercard/sexmod/em.field_70181_x D
            // 67: aload 3
            // 68: getfield net/minecraft/entity/player/EntityPlayer.field_70170_p Lnet/minecraft/world/World;
            // 6b: aload 5
            // 6d: invokevirtual com/trolmastercard/sexmod/em.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
            // 70: invokevirtual net/minecraft/world/World.func_175726_f (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/chunk/Chunk;
            // 73: aload 5
            // 75: invokevirtual net/minecraft/world/chunk/Chunk.func_76622_b (Lnet/minecraft/entity/Entity;)V
            // 78: aconst_null
            // 79: areturn
            // try (0 -> 8): 9 java/lang/RuntimeException
            // try (3 -> 16): 16 java/lang/RuntimeException
            // try (28 -> 32): 32 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
