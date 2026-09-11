package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class a1 implements IMessage {
    public static final int b = 100;
    boolean d;
    UUID a;
    UUID c;

    public a1() {
        this.d = false;
    }

    public a1(UUID var1) {
        this.a = var1;
        this.d = true;
    }

    public void fromBytes(ByteBuf var1) {
        this.a = UUID.fromString(ByteBufUtils.readUTF8String(var1));
        this.d = true;
    }

    public void toBytes(ByteBuf var1) {
        ByteBufUtils.writeUTF8String(var1, this.a.toString());
    }

    public static class a implements IMessageHandler<a1, IMessage> {
        public IMessage a(a1 param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/a1.d Z
            // 04: ifne 15
            // 07: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 0a: ldc "received an invalid message @ResetController :("
            // 0c: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 0f: aconst_null
            // 10: areturn
            // 11: invokestatic com/trolmastercard/sexmod/a1$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 14: athrow
            // 15: aload 2
            // 16: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 19: invokevirtual net/minecraftforge/fml/relauncher/Side.isServer ()Z
            // 1c: ifeq b7
            // 1f: aload 1
            // 20: getfield com/trolmastercard/sexmod/a1.a Ljava/util/UUID;
            // 23: invokestatic com/trolmastercard/sexmod/em.a (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/em;
            // 26: astore 3
            // 27: aload 3
            // 28: ifnonnull 31
            // 2b: aconst_null
            // 2c: areturn
            // 2d: invokestatic com/trolmastercard/sexmod/a1$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 30: athrow
            // 31: aload 2
            // 32: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/MessageContext.getServerHandler ()Lnet/minecraft/network/NetHandlerPlayServer;
            // 35: getfield net/minecraft/network/NetHandlerPlayServer.field_147369_b Lnet/minecraft/entity/player/EntityPlayerMP;
            // 38: invokevirtual net/minecraft/entity/player/EntityPlayerMP.getPersistentID ()Ljava/util/UUID;
            // 3b: astore 4
            // 3d: aload 3
            // 3e: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
            // 41: bipush 2
            // 42: newarray 10
            // 44: dup
            // 45: bipush 0
            // 46: bipush 0
            // 47: iastore
            // 48: dup
            // 49: bipush 1
            // 4a: bipush 0
            // 4b: iastore
            // 4c: putfield com/trolmastercard/sexmod/fp.ticksPlaying [I
            // 4f: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
            // 52: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
            // 55: invokevirtual net/minecraft/server/MinecraftServer.func_184103_al ()Lnet/minecraft/server/management/PlayerList;
            // 58: invokevirtual net/minecraft/server/management/PlayerList.func_181057_v ()Ljava/util/List;
            // 5b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
            // 60: astore 5
            // 62: aload 5
            // 64: invokeinterface java/util/Iterator.hasNext ()Z 1
            // 69: ifeq b5
            // 6c: aload 5
            // 6e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
            // 73: checkcast net/minecraft/entity/player/EntityPlayerMP
            // 76: astore 6
            // 78: aload 4
            // 7a: aload 6
            // 7c: invokevirtual net/minecraft/entity/player/EntityPlayerMP.getPersistentID ()Ljava/util/UUID;
            // 7f: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
            // 82: ifne b2
            // 85: aload 6
            // 87: aload 3
            // 88: invokevirtual net/minecraft/entity/player/EntityPlayerMP.func_70032_d (Lnet/minecraft/entity/Entity;)F
            // 8b: ldc 100.0
            // 8d: fcmpg
            // 8e: ifge b2
            // 91: goto 98
            // 94: invokestatic com/trolmastercard/sexmod/a1$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 97: athrow
            // 98: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
            // 9b: new com/trolmastercard/sexmod/a1
            // 9e: dup
            // 9f: aload 1
            // a0: getfield com/trolmastercard/sexmod/a1.a Ljava/util/UUID;
            // a3: invokespecial com/trolmastercard/sexmod/a1.<init> (Ljava/util/UUID;)V
            // a6: aload 6
            // a8: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
            // ab: goto b2
            // ae: invokestatic com/trolmastercard/sexmod/a1$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // b1: athrow
            // b2: goto 62
            // b5: aconst_null
            // b6: areturn
            // b7: aload 1
            // b8: getfield com/trolmastercard/sexmod/a1.a Ljava/util/UUID;
            // bb: invokestatic com/trolmastercard/sexmod/em.b (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/em;
            // be: astore 3
            // bf: aload 3
            // c0: ifnull ce
            // c3: aload 3
            // c4: invokevirtual com/trolmastercard/sexmod/em.ag ()V
            // c7: goto ce
            // ca: invokestatic com/trolmastercard/sexmod/a1$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // cd: athrow
            // ce: aconst_null
            // cf: areturn
            // try (0 -> 8): 8 java/lang/RuntimeException
            // try (18 -> 22): 22 java/lang/RuntimeException
            // try (55 -> 66): 67 java/lang/RuntimeException
            // try (60 -> 77): 78 java/lang/RuntimeException
            // try (87 -> 91): 92 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
