package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class bv implements IMessage {
    Vec3d a;
    boolean c;
    boolean b = false;

    public bv() {
    }

    public bv(Vec3d var1, boolean var2) {
        this.a = var1;
        this.c = var2;
    }

    public void fromBytes(ByteBuf var1) {
        this.a = new Vec3d(var1.readDouble(), var1.readDouble(), var1.readDouble());
        this.c = var1.readBoolean();
        this.b = true;
    }

    public void toBytes(ByteBuf var1) {
        var1.writeDouble(this.a.field_72450_a);
        var1.writeDouble(this.a.field_72448_b);
        var1.writeDouble(this.a.field_72449_c);
        var1.writeBoolean(this.c);
    }

    public static class a implements IMessageHandler<bv, IMessage> {
        public IMessage a(bv param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/bv.b Z
            // 04: ifeq 1b
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.CLIENT Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: invokevirtual net/minecraftforge/fml/relauncher/Side.equals (Ljava/lang/Object;)Z
            // 11: ifne 29
            // 14: goto 1b
            // 17: invokestatic com/trolmastercard/sexmod/bv$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1a: athrow
            // 1b: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1e: ldc "received an invalid message @SpawnEnergyBallParticles :("
            // 20: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 23: aconst_null
            // 24: areturn
            // 25: invokestatic com/trolmastercard/sexmod/bv$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 28: athrow
            // 29: aload 1
            // 2a: getfield com/trolmastercard/sexmod/bv.c Z
            // 2d: ifeq 3e
            // 30: aload 1
            // 31: getfield com/trolmastercard/sexmod/bv.a Lnet/minecraft/util/math/Vec3d;
            // 34: invokestatic com/trolmastercard/sexmod/c4.a (Lnet/minecraft/util/math/Vec3d;)V
            // 37: goto 45
            // 3a: invokestatic com/trolmastercard/sexmod/bv$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 3d: athrow
            // 3e: aload 1
            // 3f: getfield com/trolmastercard/sexmod/bv.a Lnet/minecraft/util/math/Vec3d;
            // 42: invokestatic com/trolmastercard/sexmod/c4.c (Lnet/minecraft/util/math/Vec3d;)V
            // 45: aconst_null
            // 46: areturn
            // try (0 -> 8): 9 java/lang/RuntimeException
            // try (3 -> 16): 16 java/lang/RuntimeException
            // try (18 -> 25): 25 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
