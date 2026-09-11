package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class gd implements IMessage {
    boolean d = false;
    UUID c;
    int b;
    fp a;

    public gd() {
    }

    public gd(UUID var1, int var2, fp var3) {
        this.c = var1;
        this.b = var2;
        this.a = var3;
    }

    public void fromBytes(ByteBuf var1) {
        this.c = UUID.fromString(ByteBufUtils.readUTF8String(var1));
        this.b = var1.readInt();
        this.a = fp.valueOf(ByteBufUtils.readUTF8String(var1));
        this.d = true;
    }

    public void toBytes(ByteBuf var1) {
        ByteBufUtils.writeUTF8String(var1, this.c.toString());
        var1.writeInt(this.b);
        ByteBufUtils.writeUTF8String(var1, this.a.toString());
    }

    public static class a implements IMessageHandler<gd, IMessage> {
        public IMessage a(gd param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/gd.d Z
            // 04: ifeq 1b
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.CLIENT Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: invokevirtual net/minecraftforge/fml/relauncher/Side.equals (Ljava/lang/Object;)Z
            // 11: ifne 29
            // 14: goto 1b
            // 17: invokestatic com/trolmastercard/sexmod/gd$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1a: athrow
            // 1b: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1e: ldc "received an invalid message @ForcePlayerGirlUpdate :("
            // 20: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 23: aconst_null
            // 24: areturn
            // 25: invokestatic com/trolmastercard/sexmod/gd$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 28: athrow
            // 29: aload 1
            // 2a: getfield com/trolmastercard/sexmod/gd.c Ljava/util/UUID;
            // 2d: invokestatic com/trolmastercard/sexmod/ei.d (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/ei;
            // 30: astore 3
            // 31: aload 3
            // 32: ifnonnull 3b
            // 35: aconst_null
            // 36: areturn
            // 37: invokestatic com/trolmastercard/sexmod/gd$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 3a: athrow
            // 3b: aload 3
            // 3c: invokevirtual com/trolmastercard/sexmod/ei.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
            // 3f: getstatic com/trolmastercard/sexmod/em.J Lnet/minecraft/network/datasync/DataParameter;
            // 42: aload 1
            // 43: getfield com/trolmastercard/sexmod/gd.a Lcom/trolmastercard/sexmod/fp;
            // 46: invokevirtual com/trolmastercard/sexmod/fp.toString ()Ljava/lang/String;
            // 49: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
            // 4c: aload 3
            // 4d: invokevirtual com/trolmastercard/sexmod/ei.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
            // 50: getstatic com/trolmastercard/sexmod/em.D Lnet/minecraft/network/datasync/DataParameter;
            // 53: aload 1
            // 54: getfield com/trolmastercard/sexmod/gd.b I
            // 57: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
            // 5a: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
            // 5d: aconst_null
            // 5e: areturn
            // try (0 -> 8): 9 java/lang/RuntimeException
            // try (3 -> 16): 16 java/lang/RuntimeException
            // try (22 -> 26): 26 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
