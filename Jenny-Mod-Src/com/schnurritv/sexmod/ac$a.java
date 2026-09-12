package com.schnurritv.sexmod;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ac$a implements IMessageHandler<ac, IMessage> {
   public IMessage a(ac param1, MessageContext param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield com/schnurritv/sexmod/ac.d Z
      // 04: ifne 15
      // 07: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0a: ldc "received an invalid message @ResetController :("
      // 0c: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0f: aconst_null
      // 10: areturn
      // 11: invokestatic com/schnurritv/sexmod/ac$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aload 2
      // 16: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
      // 19: invokevirtual net/minecraftforge/fml/relauncher/Side.isServer ()Z
      // 1c: ifeq a3
      // 1f: aload 1
      // 20: getfield com/schnurritv/sexmod/ac.a Ljava/util/UUID;
      // 23: invokestatic com/schnurritv/sexmod/bi.d (Ljava/util/UUID;)Lcom/schnurritv/sexmod/bi;
      // 26: astore 3
      // 27: aload 2
      // 28: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/MessageContext.getServerHandler ()Lnet/minecraft/network/NetHandlerPlayServer;
      // 2b: getfield net/minecraft/network/NetHandlerPlayServer.field_147369_b Lnet/minecraft/entity/player/EntityPlayerMP;
      // 2e: invokevirtual net/minecraft/entity/player/EntityPlayerMP.getPersistentID ()Ljava/util/UUID;
      // 31: astore 4
      // 33: aload 3
      // 34: invokevirtual com/schnurritv/sexmod/bi.D ()Lcom/schnurritv/sexmod/bj;
      // 37: bipush 0
      // 38: putfield com/schnurritv/sexmod/bj.ticksPlaying I
      // 3b: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
      // 3e: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
      // 41: invokevirtual net/minecraft/server/MinecraftServer.func_184103_al ()Lnet/minecraft/server/management/PlayerList;
      // 44: invokevirtual net/minecraft/server/management/PlayerList.func_181057_v ()Ljava/util/List;
      // 47: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4c: astore 5
      // 4e: aload 5
      // 50: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 55: ifeq a1
      // 58: aload 5
      // 5a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5f: checkcast net/minecraft/entity/player/EntityPlayerMP
      // 62: astore 6
      // 64: aload 4
      // 66: aload 6
      // 68: invokevirtual net/minecraft/entity/player/EntityPlayerMP.getPersistentID ()Ljava/util/UUID;
      // 6b: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 6e: ifne 9e
      // 71: aload 6
      // 73: aload 3
      // 74: invokevirtual net/minecraft/entity/player/EntityPlayerMP.func_70032_d (Lnet/minecraft/entity/Entity;)F
      // 77: ldc 100.0
      // 79: fcmpg
      // 7a: ifge 9e
      // 7d: goto 84
      // 80: invokestatic com/schnurritv/sexmod/ac$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 83: athrow
      // 84: getstatic com/schnurritv/sexmod/at.a Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
      // 87: new com/schnurritv/sexmod/ac
      // 8a: dup
      // 8b: aload 1
      // 8c: getfield com/schnurritv/sexmod/ac.a Ljava/util/UUID;
      // 8f: invokespecial com/schnurritv/sexmod/ac.<init> (Ljava/util/UUID;)V
      // 92: aload 6
      // 94: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendTo (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;Lnet/minecraft/entity/player/EntityPlayerMP;)V
      // 97: goto 9e
      // 9a: invokestatic com/schnurritv/sexmod/ac$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9d: athrow
      // 9e: goto 4e
      // a1: aconst_null
      // a2: areturn
      // a3: aload 1
      // a4: getfield com/schnurritv/sexmod/ac.a Ljava/util/UUID;
      // a7: invokestatic com/schnurritv/sexmod/bi.f (Ljava/util/UUID;)Lcom/schnurritv/sexmod/bi;
      // aa: astore 3
      // ab: aload 3
      // ac: ifnull ba
      // af: aload 3
      // b0: invokevirtual com/schnurritv/sexmod/bi.I ()V
      // b3: goto ba
      // b6: invokestatic com/schnurritv/sexmod/ac$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b9: athrow
      // ba: aconst_null
      // bb: areturn
      // try (0 -> 8): 8 java/lang/RuntimeException
      // try (40 -> 51): 52 java/lang/RuntimeException
      // try (45 -> 62): 63 java/lang/RuntimeException
      // try (72 -> 76): 77 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
