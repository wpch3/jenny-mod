package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class s implements IMessage {
    boolean b;
    UUID c;
    boolean a;

    public s() {
        this.b = false;
    }

    public s(UUID var1) {
        this.c = var1;
        this.a = false;
        this.b = true;
    }

    public s(UUID var1, boolean var2) {
        this.c = var1;
        this.a = var2;
        this.b = true;
    }

    public void fromBytes(ByteBuf var1) {
        this.c = UUID.fromString(ByteBufUtils.readUTF8String(var1));
        this.a = var1.readBoolean();
        this.b = true;
    }

    public void toBytes(ByteBuf var1) {
        ByteBufUtils.writeUTF8String(var1, this.c.toString());
        var1.writeBoolean(this.a);
        this.b = true;
    }

    public static class a implements IMessageHandler<s, IMessage> {
        public static void a(em var0) {
            label36: {
                try {
                    var0.g();
                    if (!(var0 instanceof ei) || var0.field_70170_p.func_152378_a(((ei)var0).m()) == null) {
                        break label36;
                    }
                } catch (RuntimeException var4) {
                    throw a(var4);
                }

                ge.b
                    .sendTo(
                        new gz(true),
                        (EntityPlayerMP)FMLCommonHandler.instance()
                            .getMinecraftServerInstance()
                            .func_71218_a(var0.field_71093_bK)
                            .func_152378_a(((ei)var0).m())
                    );
                var0.func_184212_Q().func_187227_b(em.D, 1);
                EntityPlayer var1 = var0.field_70170_p.func_152378_a(((ei)var0).m());
                var1.field_71075_bZ.field_75100_b = false;
                var1.func_189654_d(false);
                var1.field_70145_X = false;
                var0.a(false);
                var0.b(fp.NULL);
                if (var0.ae() != null) {
                    EntityPlayer var2 = var0.field_70170_p.func_152378_a(var0.ae());

                    try {
                        if (var2 != null) {
                            var2.field_71075_bZ.field_75100_b = false;
                            var2.func_189654_d(false);
                            var2.field_70145_X = false;
                        }
                    } catch (RuntimeException var3) {
                        throw a(var3);
                    }
                }
            }

            var0.a(false);
            var0.e((UUID)null);
            var0.B = null;
            var0.func_189654_d(false);
            var0.field_70145_X = false;
            World var5 = var0.field_70170_p;
            Vec3d var6 = var0.func_174791_d();

            while (var5.func_180495_p(new BlockPos(var6.field_72450_a, var6.field_72448_b, var6.field_72449_c)).func_177230_c() != Blocks.field_150350_a) {
                var6 = var6.func_72441_c(0.0, 1.0, 0.0);
            }

            var0.func_70634_a(var6.field_72450_a, var6.field_72448_b, var6.field_72449_c);
        }

        public static void a(EntityPlayerMP var0) {
            try {
                if (var0 == null) {
                    return;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            World var1 = var0.field_70170_p;
            Vec3d var2 = var0.func_174791_d();

            while (var1.func_180495_p(new BlockPos(var2.field_72450_a, var2.field_72448_b, var2.field_72449_c)).func_177230_c() != Blocks.field_150350_a) {
                var2 = var2.func_72441_c(0.0, 1.0, 0.0);
            }

            var0.func_70634_a(var2.field_72450_a, var2.field_72448_b, var2.field_72449_c);
            var0.func_82142_c(false);
            var0.field_70145_X = false;
            var0.func_189654_d(false);
            var0.field_71075_bZ.field_75100_b = false;
            ge.b.sendTo(new gz(true), var0);
        }

        public IMessage a(s param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/s.b Z
            // 04: ifeq 18
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: if_acmpeq 26
            // 11: goto 18
            // 14: invokestatic com/trolmastercard/sexmod/s$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 17: athrow
            // 18: getstatic java/lang/System.out Ljava/io/PrintStream;
            // 1b: ldc "recieved an unvalid message @ResetGirl :("
            // 1d: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
            // 20: aconst_null
            // 21: areturn
            // 22: invokestatic com/trolmastercard/sexmod/s$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 25: athrow
            // 26: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
            // 29: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
            // 2c: aload 1
            // 2d: invokedynamic run (Lcom/trolmastercard/sexmod/s;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/trolmastercard/sexmod/s$a.lambda$onMessage$0 (Lcom/trolmastercard/sexmod/s;)V, ()V ]
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
