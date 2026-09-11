package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class gz implements IMessage {
    boolean a;
    boolean b;

    public gz(boolean var1) {
        this.b = var1;
        this.a = true;
    }

    public gz() {
        this.a = false;
    }

    public void fromBytes(ByteBuf var1) {
        this.b = var1.readBoolean();
        this.a = true;
    }

    public void toBytes(ByteBuf var1) {
        var1.writeBoolean(this.b);
        this.a = true;
    }

    public static class a implements IMessageHandler<gz, IMessage> {
        public IMessage a(gz param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/gz.a Z
            // 04: ifeq 18
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.CLIENT Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: if_acmpeq 26
            // 11: goto 18
            // 14: invokestatic com/trolmastercard/sexmod/gz$a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
            // 17: athrow
            // 18: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1b: ldc "received an invalid message @SetPlayerMovement :("
            // 1d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 20: aconst_null
            // 21: areturn
            // 22: invokestatic com/trolmastercard/sexmod/gz$a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
            // 25: athrow
            // 26: aload 1
            // 27: getfield com/trolmastercard/sexmod/gz.b Z
            // 2a: invokestatic com/trolmastercard/sexmod/d3.a (Z)V
            // 2d: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
            // 30: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
            // 33: dconst_0
            // 34: dconst_0
            // 35: dconst_0
            // 36: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70016_h (DDD)V
            // 39: goto 3d
            // 3c: astore 3
            // 3d: aload 1
            // 3e: getfield com/trolmastercard/sexmod/gz.b Z
            // 41: ifeq 4e
            // 44: invokestatic com/trolmastercard/sexmod/ds.c ()V
            // 47: goto 4e
            // 4a: invokestatic com/trolmastercard/sexmod/gz$a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
            // 4d: athrow
            // 4e: aconst_null
            // 4f: areturn
            // try (3 -> 15): 15 java/lang/Exception
            // try (0 -> 7): 8 java/lang/Exception
            // try (20 -> 26): 27 java/lang/Exception
            // try (28 -> 32): 33 java/lang/Exception
        }

        private static Exception a(Exception var0) {
            return var0;
        }
    }
}
