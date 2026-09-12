package com.schnurritv.sexmod;

import java.util.UUID;
import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class b3 {
   public static b3 b;
   private b3.a a;

   public void a() {
      try {
         if (b.a == null) {
            return;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      try {
         if (--b.a.a <= 0.0F) {
            Minecraft.func_71410_x()
               .field_71439_g
               .func_145747_a(new TextComponentString(TextFormatting.DARK_PURPLE + I18n.func_135052_a("genderswap.sexpromt.timeout", new Object[0])));
            this.b();
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }
   }

   public b3.a c() {
      return b.a;
   }

   void b() {
      b.a = null;
   }

   public void a(@Nonnull b3.a param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 003: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 006: getfield net/minecraft/client/entity/EntityPlayerSP.field_70170_p Lnet/minecraft/world/World;
      // 009: astore 2
      // 00a: aload 2
      // 00b: aload 1
      // 00c: getfield com/schnurritv/sexmod/b3$a.e Ljava/util/UUID;
      // 00f: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
      // 012: astore 3
      // 013: aload 2
      // 014: aload 1
      // 015: getfield com/schnurritv/sexmod/b3$a.c Ljava/util/UUID;
      // 018: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
      // 01b: astore 4
      // 01d: aload 4
      // 01f: ifnull 02d
      // 022: aload 3
      // 023: ifnonnull 032
      // 026: goto 02d
      // 029: invokestatic com/schnurritv/sexmod/b3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02c: athrow
      // 02d: return
      // 02e: invokestatic com/schnurritv/sexmod/b3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 031: athrow
      // 032: new net/minecraft/util/text/TextComponentString
      // 035: dup
      // 036: new java/lang/StringBuilder
      // 039: dup
      // 03a: invokespecial java/lang/StringBuilder.<init> ()V
      // 03d: getstatic net/minecraft/util/text/TextFormatting.LIGHT_PURPLE Lnet/minecraft/util/text/TextFormatting;
      // 040: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 043: aload 1
      // 044: getfield com/schnurritv/sexmod/b3$a.d Z
      // 047: ifeq 056
      // 04a: aload 4
      // 04c: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70005_c_ ()Ljava/lang/String;
      // 04f: goto 05a
      // 052: invokestatic com/schnurritv/sexmod/b3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 055: athrow
      // 056: aload 3
      // 057: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70005_c_ ()Ljava/lang/String;
      // 05a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05d: ldc " "
      // 05f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 062: getstatic net/minecraft/util/text/TextFormatting.DARK_PURPLE Lnet/minecraft/util/text/TextFormatting;
      // 065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 068: ldc "genderswap.sexpromt.playerxaskedfory"
      // 06a: bipush 0
      // 06b: anewarray 14
      // 06e: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 074: ldc " "
      // 076: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 079: getstatic net/minecraft/util/text/TextFormatting.LIGHT_PURPLE Lnet/minecraft/util/text/TextFormatting;
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 07f: aload 1
      // 080: getfield com/schnurritv/sexmod/b3$a.b Ljava/lang/String;
      // 083: bipush 0
      // 084: anewarray 14
      // 087: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 08a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 090: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
      // 093: astore 5
      // 095: new net/minecraft/util/text/TextComponentString
      // 098: dup
      // 099: new java/lang/StringBuilder
      // 09c: dup
      // 09d: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a0: getstatic net/minecraft/util/text/TextFormatting.DARK_PURPLE Lnet/minecraft/util/text/TextFormatting;
      // 0a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0a6: ldc "genderswap.sexpromt.autodeletion"
      // 0a8: bipush 0
      // 0a9: anewarray 14
      // 0ac: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b5: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
      // 0b8: astore 6
      // 0ba: new net/minecraft/util/text/TextComponentString
      // 0bd: dup
      // 0be: new java/lang/StringBuilder
      // 0c1: dup
      // 0c2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c5: getstatic net/minecraft/util/text/TextFormatting.DARK_PURPLE Lnet/minecraft/util/text/TextFormatting;
      // 0c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0cb: ldc "[ "
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d0: getstatic net/minecraft/util/text/TextFormatting.LIGHT_PURPLE Lnet/minecraft/util/text/TextFormatting;
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0d6: ldc "genderswap.sexpromt.accept"
      // 0d8: bipush 0
      // 0d9: anewarray 14
      // 0dc: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: getstatic net/minecraft/util/text/TextFormatting.DARK_PURPLE Lnet/minecraft/util/text/TextFormatting;
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e8: ldc " | "
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: getstatic net/minecraft/util/text/TextFormatting.LIGHT_PURPLE Lnet/minecraft/util/text/TextFormatting;
      // 0f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0f3: ldc "genderswap.sexpromt.decline"
      // 0f5: bipush 0
      // 0f6: anewarray 14
      // 0f9: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ff: getstatic net/minecraft/util/text/TextFormatting.DARK_PURPLE Lnet/minecraft/util/text/TextFormatting;
      // 102: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 105: ldc " ]"
      // 107: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10d: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
      // 110: astore 7
      // 112: aload 3
      // 113: aload 5
      // 115: invokevirtual net/minecraft/entity/player/EntityPlayer.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V
      // 118: aload 3
      // 119: aload 6
      // 11b: invokevirtual net/minecraft/entity/player/EntityPlayer.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V
      // 11e: aload 3
      // 11f: aload 7
      // 121: invokevirtual net/minecraft/entity/player/EntityPlayer.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V
      // 124: aload 0
      // 125: aload 1
      // 126: putfield com/schnurritv/sexmod/b3.a Lcom/schnurritv/sexmod/b3$a;
      // 129: return
      // try (14 -> 18): 19 java/lang/RuntimeException
      // try (16 -> 22): 22 java/lang/RuntimeException
      // try (24 -> 37): 37 java/lang/RuntimeException
   }

   @SubscribeEvent
   public void a(ClientChatEvent var1) {
      try {
         if (b.c() == null) {
            return;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      String var2 = var1.getMessage().toLowerCase();
      if (var2.equals(I18n.func_135052_a("genderswap.sexpromt.accept", new Object[0]).toLowerCase())) {
         b3.a var3 = b.c();
         this.a(var3.b, var3.e, var3.c);
         this.b();
         var1.setCanceled(true);
      }

      try {
         if (var2.equals(I18n.func_135052_a("genderswap.sexpromt.decline", new Object[0]).toLowerCase())) {
            Minecraft.func_71410_x()
               .field_71439_g
               .func_145747_a(
                  new TextComponentString(TextFormatting.DARK_PURPLE + I18n.func_135052_a("genderswap.sexpromt.declineconformation", new Object[0]))
               );
            this.b();
            var1.setCanceled(true);
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }
   }

   void a(String var1, UUID var2, UUID var3) {
      at.a.sendToServer(new bw(var2, var3, var1));
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   public static class a {
      public String b;
      public UUID c;
      public UUID e;
      public float a;
      boolean d;

      public a(String var1, UUID var2, UUID var3, boolean var4) {
         this.b = var1;
         this.c = var2;
         this.e = var3;
         this.a = 1200.0F;
         this.d = var4;
      }
   }
}
