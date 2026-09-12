package com.schnurritv.sexmod;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class as$a implements IMessageHandler<as, IMessage> {
   public IMessage a(as param1, MessageContext param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield com/schnurritv/sexmod/as.a Z
      // 04: ifne 15
      // 07: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0a: ldc "received an invalid Message @RequestServerModelAvailability :("
      // 0c: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0f: aconst_null
      // 10: areturn
      // 11: invokestatic com/schnurritv/sexmod/as$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aload 2
      // 16: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
      // 19: invokevirtual net/minecraftforge/fml/relauncher/Side.isClient ()Z
      // 1c: ifeq bc
      // 1f: invokestatic com/schnurritv/sexmod/bk.h ()Z
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic com/schnurritv/sexmod/as$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: aconst_null
      // 2d: areturn
      // 2e: invokestatic com/schnurritv/sexmod/as$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 31: athrow
      // 32: new java/util/ArrayList
      // 35: dup
      // 36: invokespecial java/util/ArrayList.<init> ()V
      // 39: astore 3
      // 3a: aload 1
      // 3b: getfield com/schnurritv/sexmod/as.b Ljava/util/HashMap;
      // 3e: invokevirtual java/util/HashMap.entrySet ()Ljava/util/Set;
      // 41: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 46: astore 4
      // 48: aload 4
      // 4a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4f: ifeq b3
      // 52: aload 4
      // 54: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 59: checkcast java/util/Map$Entry
      // 5c: astore 5
      // 5e: aload 5
      // 60: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 65: checkcast java/lang/String
      // 68: astore 6
      // 6a: aload 6
      // 6c: invokestatic com/schnurritv/sexmod/bk.k (Ljava/lang/String;)Z
      // 6f: ifne 82
      // 72: aload 3
      // 73: aload 6
      // 75: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7a: pop
      // 7b: goto 48
      // 7e: invokestatic com/schnurritv/sexmod/as$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 81: athrow
      // 82: aload 6
      // 84: invokestatic com/schnurritv/sexmod/bk.d (Ljava/lang/String;)F
      // 87: fstore 7
      // 89: aload 5
      // 8b: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 90: checkcast java/lang/Float
      // 93: invokevirtual java/lang/Float.floatValue ()F
      // 96: fstore 8
      // 98: fload 8
      // 9a: fload 7
      // 9c: fcmpl
      // 9d: ifle b0
      // a0: aload 3
      // a1: aload 6
      // a3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a8: pop
      // a9: goto b0
      // ac: invokestatic com/schnurritv/sexmod/as$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // af: athrow
      // b0: goto 48
      // b3: new com/schnurritv/sexmod/bD
      // b6: dup
      // b7: aload 3
      // b8: invokespecial com/schnurritv/sexmod/bD.<init> (Ljava/util/List;)V
      // bb: areturn
      // bc: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
      // bf: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
      // c2: aload 2
      // c3: invokedynamic run (Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/schnurritv/sexmod/as$a.lambda$onMessage$0 (Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;)V, ()V ]
      // c8: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
      // cb: pop
      // cc: aconst_null
      // cd: areturn
      // try (0 -> 8): 8 java/lang/RuntimeException
      // try (10 -> 16): 17 java/lang/RuntimeException
      // try (14 -> 21): 21 java/lang/RuntimeException
      // try (43 -> 51): 51 java/lang/RuntimeException
      // try (61 -> 69): 70 java/lang/RuntimeException
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
