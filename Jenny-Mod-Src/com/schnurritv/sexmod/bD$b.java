package com.schnurritv.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class bD$b implements IMessageHandler<bD, IMessage> {
   static int a = 0;

   @SideOnly(Side.CLIENT)
   void a(String var1) {
      Minecraft.func_71410_x().field_71439_g.func_145747_a(new TextComponentString(var1));
   }

   @SideOnly(Side.CLIENT)
   void a() {
      Minecraft.func_71410_x().func_152343_a(() -> bk.a(true));
   }

   public IMessage a(bD param1, MessageContext param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield com/schnurritv/sexmod/bD.f Z
      // 004: ifne 015
      // 007: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 00a: ldc "received an invalid Message @DownloadServerModel :("
      // 00c: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 00f: aconst_null
      // 010: areturn
      // 011: invokestatic com/schnurritv/sexmod/bD$b.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: aload 2
      // 016: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
      // 019: invokevirtual net/minecraftforge/fml/relauncher/Side.isClient ()Z
      // 01c: ifeq 1fb
      // 01f: invokestatic com/schnurritv/sexmod/bk.h ()Z
      // 022: ifne 032
      // 025: goto 02c
      // 028: invokestatic com/schnurritv/sexmod/bD$b.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: aconst_null
      // 02d: areturn
      // 02e: invokestatic com/schnurritv/sexmod/bD$b.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: aload 1
      // 033: getfield com/schnurritv/sexmod/bD.c Ljava/lang/String;
      // 036: astore 3
      // 037: aload 1
      // 038: getfield com/schnurritv/sexmod/bD.b Lcom/schnurritv/sexmod/bD$a;
      // 03b: astore 4
      // 03d: aload 1
      // 03e: getfield com/schnurritv/sexmod/bD.e [B
      // 041: astore 5
      // 043: new java/lang/StringBuilder
      // 046: dup
      // 047: invokespecial java/lang/StringBuilder.<init> ()V
      // 04a: invokestatic com/schnurritv/sexmod/bk.f ()Ljava/lang/String;
      // 04d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 050: ldc "/"
      // 052: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 055: aload 3
      // 056: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 059: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 05c: astore 6
      // 05e: new java/io/File
      // 061: dup
      // 062: aload 6
      // 064: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 067: astore 7
      // 069: aload 7
      // 06b: invokevirtual java/io/File.mkdirs ()Z
      // 06e: pop
      // 06f: new java/io/File
      // 072: dup
      // 073: new java/lang/StringBuilder
      // 076: dup
      // 077: invokespecial java/lang/StringBuilder.<init> ()V
      // 07a: aload 6
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: ldc "/"
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: aload 3
      // 085: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 088: aload 4
      // 08a: getfield com/schnurritv/sexmod/bD$a.ending Ljava/lang/String;
      // 08d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 090: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 093: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 096: astore 8
      // 098: new java/io/FileOutputStream
      // 09b: dup
      // 09c: aload 8
      // 09e: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 0a1: astore 9
      // 0a3: aconst_null
      // 0a4: astore 10
      // 0a6: aload 9
      // 0a8: aload 5
      // 0aa: invokevirtual java/io/FileOutputStream.write ([B)V
      // 0ad: aload 9
      // 0af: ifnull 10b
      // 0b2: aload 10
      // 0b4: ifnull 0cb
      // 0b7: aload 9
      // 0b9: invokevirtual java/io/FileOutputStream.close ()V
      // 0bc: goto 10b
      // 0bf: astore 11
      // 0c1: aload 10
      // 0c3: aload 11
      // 0c5: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0c8: goto 10b
      // 0cb: aload 9
      // 0cd: invokevirtual java/io/FileOutputStream.close ()V
      // 0d0: goto 10b
      // 0d3: astore 11
      // 0d5: aload 11
      // 0d7: astore 10
      // 0d9: aload 11
      // 0db: athrow
      // 0dc: astore 12
      // 0de: aload 9
      // 0e0: ifnull 108
      // 0e3: aload 10
      // 0e5: ifnull 103
      // 0e8: goto 0ef
      // 0eb: invokestatic com/schnurritv/sexmod/bD$b.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: aload 9
      // 0f1: invokevirtual java/io/FileOutputStream.close ()V
      // 0f4: goto 108
      // 0f7: astore 13
      // 0f9: aload 10
      // 0fb: aload 13
      // 0fd: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 100: goto 108
      // 103: aload 9
      // 105: invokevirtual java/io/FileOutputStream.close ()V
      // 108: aload 12
      // 10a: athrow
      // 10b: goto 115
      // 10e: astore 9
      // 110: aload 9
      // 112: invokevirtual java/io/IOException.printStackTrace ()V
      // 115: bipush 0
      // 116: istore 9
      // 118: invokestatic com/schnurritv/sexmod/bD$a.values ()[Lcom/schnurritv/sexmod/bD$a;
      // 11b: arraylength
      // 11c: istore 10
      // 11e: invokestatic com/schnurritv/sexmod/bD$a.values ()[Lcom/schnurritv/sexmod/bD$a;
      // 121: astore 11
      // 123: aload 11
      // 125: arraylength
      // 126: istore 12
      // 128: bipush 0
      // 129: istore 13
      // 12b: iload 13
      // 12d: iload 12
      // 12f: if_icmpge 176
      // 132: aload 11
      // 134: iload 13
      // 136: aaload
      // 137: astore 14
      // 139: new java/io/File
      // 13c: dup
      // 13d: new java/lang/StringBuilder
      // 140: dup
      // 141: invokespecial java/lang/StringBuilder.<init> ()V
      // 144: aload 6
      // 146: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 149: ldc "/"
      // 14b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14e: aload 3
      // 14f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 152: aload 14
      // 154: getfield com/schnurritv/sexmod/bD$a.ending Ljava/lang/String;
      // 157: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 160: invokevirtual java/io/File.exists ()Z
      // 163: ifeq 170
      // 166: iinc 9 1
      // 169: goto 170
      // 16c: invokestatic com/schnurritv/sexmod/bD$b.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: iinc 13 1
      // 173: goto 12b
      // 176: iload 9
      // 178: iload 10
      // 17a: if_icmpne 1a7
      // 17d: aload 0
      // 17e: ldc "%sSuccessfully downloaded the custom model '%s%s%s'!"
      // 180: bipush 4
      // 181: anewarray 11
      // 184: dup
      // 185: bipush 0
      // 186: getstatic net/minecraft/util/text/TextFormatting.GREEN Lnet/minecraft/util/text/TextFormatting;
      // 189: aastore
      // 18a: dup
      // 18b: bipush 1
      // 18c: getstatic net/minecraft/util/text/TextFormatting.YELLOW Lnet/minecraft/util/text/TextFormatting;
      // 18f: aastore
      // 190: dup
      // 191: bipush 2
      // 192: aload 3
      // 193: aastore
      // 194: dup
      // 195: bipush 3
      // 196: getstatic net/minecraft/util/text/TextFormatting.GREEN Lnet/minecraft/util/text/TextFormatting;
      // 199: aastore
      // 19a: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 19d: invokevirtual com/schnurritv/sexmod/bD$b.a (Ljava/lang/String;)V
      // 1a0: goto 1db
      // 1a3: invokestatic com/schnurritv/sexmod/bD$b.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: ldc "%sdownloading custom model '%s%s%s' (%s/%s)..."
      // 1aa: bipush 6
      // 1ac: anewarray 11
      // 1af: dup
      // 1b0: bipush 0
      // 1b1: getstatic net/minecraft/util/text/TextFormatting.GRAY Lnet/minecraft/util/text/TextFormatting;
      // 1b4: aastore
      // 1b5: dup
      // 1b6: bipush 1
      // 1b7: getstatic net/minecraft/util/text/TextFormatting.YELLOW Lnet/minecraft/util/text/TextFormatting;
      // 1ba: aastore
      // 1bb: dup
      // 1bc: bipush 2
      // 1bd: aload 3
      // 1be: aastore
      // 1bf: dup
      // 1c0: bipush 3
      // 1c1: getstatic net/minecraft/util/text/TextFormatting.GRAY Lnet/minecraft/util/text/TextFormatting;
      // 1c4: aastore
      // 1c5: dup
      // 1c6: bipush 4
      // 1c7: iload 9
      // 1c9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1cc: aastore
      // 1cd: dup
      // 1ce: bipush 5
      // 1cf: iload 10
      // 1d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d4: aastore
      // 1d5: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1d8: invokevirtual com/schnurritv/sexmod/bD$b.a (Ljava/lang/String;)V
      // 1db: getstatic com/schnurritv/sexmod/bD$b.a I
      // 1de: bipush 1
      // 1df: iadd
      // 1e0: dup
      // 1e1: putstatic com/schnurritv/sexmod/bD$b.a I
      // 1e4: aload 1
      // 1e5: getfield com/schnurritv/sexmod/bD.a I
      // 1e8: if_icmpge 1f1
      // 1eb: aconst_null
      // 1ec: areturn
      // 1ed: invokestatic com/schnurritv/sexmod/bD$b.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f0: athrow
      // 1f1: bipush 0
      // 1f2: putstatic com/schnurritv/sexmod/bD$b.a I
      // 1f5: aload 0
      // 1f6: invokevirtual com/schnurritv/sexmod/bD$b.a ()V
      // 1f9: aconst_null
      // 1fa: areturn
      // 1fb: invokestatic net/minecraftforge/fml/common/FMLCommonHandler.instance ()Lnet/minecraftforge/fml/common/FMLCommonHandler;
      // 1fe: invokevirtual net/minecraftforge/fml/common/FMLCommonHandler.getMinecraftServerInstance ()Lnet/minecraft/server/MinecraftServer;
      // 201: astore 3
      // 202: aload 3
      // 203: aload 1
      // 204: aload 3
      // 205: aload 2
      // 206: invokedynamic run (Lcom/schnurritv/sexmod/bD;Lnet/minecraft/server/MinecraftServer;Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/schnurritv/sexmod/bD$b.lambda$onMessage$2 (Lcom/schnurritv/sexmod/bD;Lnet/minecraft/server/MinecraftServer;Lnet/minecraftforge/fml/common/network/simpleimpl/MessageContext;)V, ()V ]
      // 20b: invokevirtual net/minecraft/server/MinecraftServer.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
      // 20e: pop
      // 20f: aconst_null
      // 210: areturn
      // try (14 -> 21): 21 java/lang/Throwable
      // try (10 -> 16): 17 java/lang/Throwable
      // try (0 -> 8): 8 java/lang/Throwable
      // try (82 -> 84): 85 java/lang/Throwable
      // try (75 -> 78): 93 java/lang/Throwable
      // try (75 -> 78): 98 null
      // try (106 -> 108): 109 java/lang/Throwable
      // try (93 -> 99): 98 null
      // try (99 -> 103): 104 java/lang/Throwable
      // try (68 -> 118): 119 java/io/IOException
      // try (141 -> 160): 161 java/lang/Throwable
      // try (165 -> 191): 191 java/lang/Throwable
      // try (225 -> 235): 235 java/lang/Throwable
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
