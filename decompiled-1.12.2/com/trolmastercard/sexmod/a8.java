package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class a8 implements IMessage {
    boolean b;
    String c;
    Vec3d e;
    float a;
    float d;

    public a8() {
        this.b = false;
    }

    public a8(String var1, Vec3d var2) {
        this.c = var1;
        this.e = var2;
        this.a = 0.0F;
        this.d = 0.0F;
        this.b = true;
    }

    public a8(String var1, Vec3d var2, float var3, float var4) {
        this.c = var1;
        this.e = var2;
        this.a = var3;
        this.d = var4;
        this.b = true;
    }

    public a8(String var1, double var2, double var4, double var6, float var8, float var9) {
        this.c = var1;
        this.e = new Vec3d(var2, var4, var6);
        this.a = var8;
        this.d = var9;
        this.b = true;
    }

    public void fromBytes(ByteBuf var1) {
        this.c = ByteBufUtils.readUTF8String(var1);
        this.e = new Vec3d(var1.readDouble(), var1.readDouble(), var1.readDouble());
        this.a = var1.readFloat();
        this.d = var1.readFloat();
        this.b = true;
    }

    public void toBytes(ByteBuf var1) {
        ByteBufUtils.writeUTF8String(var1, this.c);
        var1.writeDouble(this.e.field_72450_a);
        var1.writeDouble(this.e.field_72448_b);
        var1.writeDouble(this.e.field_72449_c);
        var1.writeFloat(this.a);
        var1.writeFloat(this.d);
        this.b = true;
    }

    public static class a implements IMessageHandler<a8, IMessage> {
        public IMessage a(a8 param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/a8.b Z
            // 04: ifeq 18
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: if_acmpeq 26
            // 11: goto 18
            // 14: invokestatic com/trolmastercard/sexmod/a8$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 17: athrow
            // 18: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1b: ldc "received an invalid message @TeleportPlayer :("
            // 1d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 20: aconst_null
            // 21: areturn
            // 22: invokestatic com/trolmastercard/sexmod/a8$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 25: athrow
            // 26: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
            // 29: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
            // 2c: aload 1
            // 2d: invokedynamic run (Lcom/trolmastercard/sexmod/a8;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/trolmastercard/sexmod/a8$a.lambda$onMessage$0 (Lcom/trolmastercard/sexmod/a8;)V, ()V ]
            // 32: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
            // 35: pop
            // 36: aconst_null
            // 37: areturn
            // try (0 -> 7): 8 java/lang/RuntimeException
            // try (3 -> 15): 15 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
