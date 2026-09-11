package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ab implements IMessage {
    boolean c = false;
    UUID a;
    UUID b;

    public ab() {
    }

    public ab(UUID var1, UUID var2) {
        this.a = var1;
        this.b = var2;
    }

    public void fromBytes(ByteBuf var1) {
        try {
            this.a = UUID.fromString(ByteBufUtils.readUTF8String(var1));
        } catch (Exception var4) {
            this.a = null;
        }

        try {
            this.b = UUID.fromString(ByteBufUtils.readUTF8String(var1));
        } catch (Exception var3) {
            this.b = null;
        }

        this.c = true;
    }

    public void toBytes(ByteBuf var1) {
        ByteBuf var10000;
        String var10001;
        label28: {
            try {
                var10000 = var1;
                if (this.a == null) {
                    var10001 = "trol was here";
                    break label28;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            var10001 = this.a.toString();
        }

        label21: {
            try {
                ByteBufUtils.writeUTF8String(var10000, var10001);
                var10000 = var1;
                if (this.b == null) {
                    var10001 = "trol was here";
                    break label21;
                }
            } catch (RuntimeException var2) {
                throw a(var2);
            }

            var10001 = this.b.toString();
        }

        ByteBufUtils.writeUTF8String(var10000, var10001);
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }

    public static class a implements IMessageHandler<ab, IMessage> {
        public IMessage a(ab param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/ab.c Z
            // 04: ifeq 1b
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.CLIENT Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: invokevirtual net/minecraftforge/fml/relauncher/Side.equals (Ljava/lang/Object;)Z
            // 11: ifne 29
            // 14: goto 1b
            // 17: invokestatic com/trolmastercard/sexmod/ab$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1a: athrow
            // 1b: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1e: ldc "received an invalid message @SpawnEnergyBallParticles :("
            // 20: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 23: aconst_null
            // 24: areturn
            // 25: invokestatic com/trolmastercard/sexmod/ab$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 28: athrow
            // 29: aload 1
            // 2a: getfield com/trolmastercard/sexmod/ab.a Ljava/util/UUID;
            // 2d: invokestatic com/trolmastercard/sexmod/em.b (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/em;
            // 30: astore 3
            // 31: aload 3
            // 32: instanceof com/trolmastercard/sexmod/f_
            // 35: ifne 46
            // 38: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 3b: ldc "doesnt exit"
            // 3d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 40: aconst_null
            // 41: areturn
            // 42: invokestatic com/trolmastercard/sexmod/ab$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 45: athrow
            // 46: aload 1
            // 47: getfield com/trolmastercard/sexmod/ab.b Ljava/util/UUID;
            // 4a: aload 3
            // 4b: checkcast com/trolmastercard/sexmod/f_
            // 4e: invokestatic com/trolmastercard/sexmod/cc.a (Ljava/util/UUID;Lcom/trolmastercard/sexmod/f_;)V
            // 51: aconst_null
            // 52: areturn
            // try (0 -> 8): 9 java/lang/RuntimeException
            // try (3 -> 16): 16 java/lang/RuntimeException
            // try (22 -> 30): 30 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
