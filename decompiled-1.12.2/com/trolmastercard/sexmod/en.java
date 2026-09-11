package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class en implements IMessage {
    boolean d = false;
    UUID c;
    String b;
    int a;

    public en() {
    }

    public en(UUID var1, String var2) {
        this.c = var1;
        this.b = var2;
        this.a = 1;
    }

    public en(UUID var1, String var2, int var3) {
        this.c = var1;
        this.b = var2;
        this.a = var3;
    }

    public void fromBytes(ByteBuf var1) {
        this.c = UUID.fromString(ByteBufUtils.readUTF8String(var1));
        this.b = ByteBufUtils.readUTF8String(var1);
        this.a = var1.readInt();
        this.d = true;
    }

    public void toBytes(ByteBuf var1) {
        ByteBufUtils.writeUTF8String(var1, this.c.toString());
        ByteBufUtils.writeUTF8String(var1, this.b);
        var1.writeInt(this.a);
    }

    public static class a implements IMessageHandler<en, IMessage> {
        public IMessage a(en param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/en.d Z
            // 04: ifeq 1b
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.CLIENT Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: invokevirtual net/minecraftforge/fml/relauncher/Side.equals (Ljava/lang/Object;)Z
            // 11: ifne 29
            // 14: goto 1b
            // 17: invokestatic com/trolmastercard/sexmod/en$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1a: athrow
            // 1b: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1e: ldc "received an invalid message @SpawnParticle :("
            // 20: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 23: aconst_null
            // 24: areturn
            // 25: invokestatic com/trolmastercard/sexmod/en$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 28: athrow
            // 29: aload 1
            // 2a: getfield com/trolmastercard/sexmod/en.c Ljava/util/UUID;
            // 2d: invokestatic com/trolmastercard/sexmod/em.g (Ljava/util/UUID;)Ljava/util/ArrayList;
            // 30: astore 3
            // 31: aload 3
            // 32: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
            // 35: astore 4
            // 37: aload 4
            // 39: invokeinterface java/util/Iterator.hasNext ()Z 1
            // 3e: ifeq 84
            // 41: aload 4
            // 43: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
            // 48: checkcast com/trolmastercard/sexmod/em
            // 4b: astore 5
            // 4d: aload 5
            // 4f: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
            // 52: getfield net/minecraft/world/World.field_72995_K Z
            // 55: ifne 5f
            // 58: goto 37
            // 5b: invokestatic com/trolmastercard/sexmod/en$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 5e: athrow
            // 5f: bipush 0
            // 60: istore 6
            // 62: iload 6
            // 64: aload 1
            // 65: getfield com/trolmastercard/sexmod/en.a I
            // 68: if_icmpge 81
            // 6b: aload 1
            // 6c: getfield com/trolmastercard/sexmod/en.b Ljava/lang/String;
            // 6f: invokestatic net/minecraft/util/EnumParticleTypes.func_186831_a (Ljava/lang/String;)Lnet/minecraft/util/EnumParticleTypes;
            // 72: aload 5
            // 74: invokestatic com/trolmastercard/sexmod/em.a (Lnet/minecraft/util/EnumParticleTypes;Lcom/trolmastercard/sexmod/em;)V
            // 77: iinc 6 1
            // 7a: goto 62
            // 7d: invokestatic com/trolmastercard/sexmod/en$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 80: athrow
            // 81: goto 84
            // 84: aconst_null
            // 85: areturn
            // try (0 -> 8): 9 java/lang/RuntimeException
            // try (3 -> 16): 16 java/lang/RuntimeException
            // try (32 -> 37): 37 java/lang/RuntimeException
            // try (41 -> 52): 52 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
