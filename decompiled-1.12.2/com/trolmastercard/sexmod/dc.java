package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class dc implements IMessage {
    boolean c;
    UUID a;
    boolean b;
    boolean d;
    UUID e = null;

    public dc() {
        this.c = false;
    }

    public dc(UUID var1, UUID var2, boolean var3, boolean var4) {
        this.a = var1;
        this.b = var3;
        this.e = var2;
        this.d = var4;
        this.c = true;
    }

    public void fromBytes(ByteBuf var1) {
        this.a = UUID.fromString(ByteBufUtils.readUTF8String(var1));
        this.b = var1.readBoolean();
        this.d = var1.readBoolean();
        String var2 = ByteBufUtils.readUTF8String(var1);

        dc var10000;
        UUID var10001;
        label17: {
            try {
                var10000 = this;
                if (var2.equals("null")) {
                    var10001 = null;
                    break label17;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            var10001 = UUID.fromString(var2);
        }

        var10000.e = var10001;
        this.c = true;
    }

    public void toBytes(ByteBuf var1) {
        ByteBuf var10000;
        String var10001;
        label16: {
            try {
                ByteBufUtils.writeUTF8String(var1, this.a.toString());
                var1.writeBoolean(this.b);
                var1.writeBoolean(this.d);
                var10000 = var1;
                if (this.e == null) {
                    var10001 = "null";
                    break label16;
                }
            } catch (RuntimeException var2) {
                throw a(var2);
            }

            var10001 = this.e.toString();
        }

        ByteBufUtils.writeUTF8String(var10000, var10001);
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }

    public static class a implements IMessageHandler<dc, IMessage> {
        public static void a(UUID param0, UUID param1, boolean param2, boolean param3) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 0
            // 01: invokestatic com/trolmastercard/sexmod/em.g (Ljava/util/UUID;)Ljava/util/ArrayList;
            // 04: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
            // 07: astore 4
            // 09: aload 4
            // 0b: invokeinterface java/util/Iterator.hasNext ()Z 1
            // 10: ifeq e9
            // 13: aload 4
            // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
            // 1a: checkcast com/trolmastercard/sexmod/em
            // 1d: astore 5
            // 1f: aload 5
            // 21: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
            // 24: getfield net/minecraft/world/World.field_72995_K Z
            // 27: ifeq 31
            // 2a: goto 09
            // 2d: invokestatic com/trolmastercard/sexmod/dc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 30: athrow
            // 31: aload 5
            // 33: instanceof com/trolmastercard/sexmod/ex
            // 36: ifne 57
            // 39: aload 5
            // 3b: instanceof com/trolmastercard/sexmod/el
            // 3e: ifne 57
            // 41: goto 48
            // 44: invokestatic com/trolmastercard/sexmod/dc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 47: athrow
            // 48: aload 5
            // 4a: instanceof com/trolmastercard/sexmod/eb
            // 4d: ifeq 78
            // 50: goto 57
            // 53: invokestatic com/trolmastercard/sexmod/dc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 56: athrow
            // 57: aload 5
            // 59: getfield com/trolmastercard/sexmod/em.field_70714_bg Lnet/minecraft/entity/ai/EntityAITasks;
            // 5c: aload 5
            // 5e: getfield com/trolmastercard/sexmod/em.o Lcom/trolmastercard/sexmod/df;
            // 61: invokevirtual net/minecraft/entity/ai/EntityAITasks.func_85156_a (Lnet/minecraft/entity/ai/EntityAIBase;)V
            // 64: aload 5
            // 66: getfield com/trolmastercard/sexmod/em.field_70714_bg Lnet/minecraft/entity/ai/EntityAITasks;
            // 69: aload 5
            // 6b: getfield com/trolmastercard/sexmod/em.z Lnet/minecraft/entity/ai/EntityAIWanderAvoidWater;
            // 6e: invokevirtual net/minecraft/entity/ai/EntityAITasks.func_85156_a (Lnet/minecraft/entity/ai/EntityAIBase;)V
            // 71: goto 78
            // 74: invokestatic com/trolmastercard/sexmod/dc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 77: athrow
            // 78: aload 5
            // 7a: invokevirtual com/trolmastercard/sexmod/em.func_70661_as ()Lnet/minecraft/pathfinding/PathNavigate;
            // 7d: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75499_g ()V
            // 80: aload 5
            // 82: dconst_0
            // 83: putfield com/trolmastercard/sexmod/em.field_70159_w D
            // 86: aload 5
            // 88: dconst_0
            // 89: putfield com/trolmastercard/sexmod/em.field_70181_x D
            // 8c: aload 5
            // 8e: dconst_0
            // 8f: putfield com/trolmastercard/sexmod/em.field_70179_y D
            // 92: aload 5
            // 94: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
            // 97: ifnonnull a7
            // 9a: aload 5
            // 9c: aload 1
            // 9d: invokevirtual com/trolmastercard/sexmod/em.e (Ljava/util/UUID;)V
            // a0: goto a7
            // a3: invokestatic com/trolmastercard/sexmod/dc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // a6: athrow
            // a7: iload 3
            // a8: ifeq bc
            // ab: aload 5
            // ad: aload 5
            // af: invokevirtual com/trolmastercard/sexmod/em.aa ()Lnet/minecraft/util/math/Vec3d;
            // b2: invokevirtual com/trolmastercard/sexmod/em.c (Lnet/minecraft/util/math/Vec3d;)V
            // b5: goto bc
            // b8: invokestatic com/trolmastercard/sexmod/dc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // bb: athrow
            // bc: aload 5
            // be: aload 5
            // c0: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
            // c3: invokevirtual com/trolmastercard/sexmod/em.j (Ljava/util/UUID;)V
            // c6: iload 2
            // c7: ifne cb
            // ca: return
            // cb: aload 5
            // cd: instanceof com/trolmastercard/sexmod/bh
            // d0: ifne d8
            // d3: return
            // d4: invokestatic com/trolmastercard/sexmod/dc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // d7: athrow
            // d8: aload 5
            // da: checkcast com/trolmastercard/sexmod/bh
            // dd: astore 6
            // df: aload 6
            // e1: invokeinterface com/trolmastercard/sexmod/bh.b ()V 1
            // e6: goto 09
            // e9: goto ee
            // ec: astore 4
            // ee: return
            // try (67 -> 73): 74 java/util/ConcurrentModificationException
            // try (46 -> 64): 65 java/util/ConcurrentModificationException
            // try (27 -> 43): 44 java/util/ConcurrentModificationException
            // try (21 -> 30): 31 java/util/ConcurrentModificationException
            // try (18 -> 24): 25 java/util/ConcurrentModificationException
            // try (11 -> 16): 16 java/util/ConcurrentModificationException
            // try (0 -> 82): 96 java/util/ConcurrentModificationException
            // try (83 -> 86): 96 java/util/ConcurrentModificationException
            // try (83 -> 87): 87 java/lang/NullPointerException
            // try (89 -> 95): 96 java/util/ConcurrentModificationException
        }

        public IMessage a(dc param1, MessageContext param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: getfield com/trolmastercard/sexmod/dc.c Z
            // 04: ifeq 2f
            // 07: aload 2
            // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
            // 0b: getstatic net/minecraftforge/fml/relauncher/Side.SERVER Lnet/minecraftforge/fml/relauncher/Side;
            // 0e: if_acmpne 2f
            // 11: goto 18
            // 14: invokestatic com/trolmastercard/sexmod/dc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 17: athrow
            // 18: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
            // 1b: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
            // 1e: aload 1
            // 1f: invokedynamic run (Lcom/trolmastercard/sexmod/dc;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/trolmastercard/sexmod/dc$a.lambda$onMessage$0 (Lcom/trolmastercard/sexmod/dc;)V, ()V ]
            // 24: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
            // 27: pop
            // 28: goto 2f
            // 2b: invokestatic com/trolmastercard/sexmod/dc$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 2e: athrow
            // 2f: aconst_null
            // 30: areturn
            // try (0 -> 7): 8 java/util/ConcurrentModificationException
            // try (3 -> 16): 17 java/util/ConcurrentModificationException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
