package com.trolmastercard.sexmod;

import java.util.ConcurrentModificationException;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class gn extends CommandBase {
    public static final gn a = new gn();

    public String func_71517_b() {
        return "locatenearestgoblinlair";
    }

    public String func_71518_a(ICommandSender var1) {
        return "/locatenearestgoblinlair";
    }

    public void func_184881_a(MinecraftServer param1, ICommandSender param2, String[] param3) throws CommandException {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 2
        // 001: invokeinterface net/minecraft/command/ICommandSender.func_174793_f ()Lnet/minecraft/entity/Entity; 1
        // 006: astore 4
        // 008: aload 4
        // 00a: ifnull 083
        // 00d: aload 4
        // 00f: getfield net/minecraft/entity/Entity.field_71093_bK I
        // 012: ifeq 083
        // 015: goto 01c
        // 018: invokestatic com/trolmastercard/sexmod/gn.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 01b: athrow
        // 01c: aload 2
        // 01d: new net/minecraft/util/text/TextComponentString
        // 020: dup
        // 021: new java/lang/StringBuilder
        // 024: dup
        // 025: invokespecial java/lang/StringBuilder.<init> ()V
        // 028: getstatic net/minecraft/util/text/TextFormatting.YELLOW Lnet/minecraft/util/text/TextFormatting;
        // 02b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 02e: ldc "goblin lairs don't exist in the "
        // 030: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 033: aload 4
        // 035: getfield net/minecraft/entity/Entity.field_71093_bK I
        // 038: bipush -1
        // 039: if_icmpne 05f
        // 03c: goto 043
        // 03f: invokestatic com/trolmastercard/sexmod/gn.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 042: athrow
        // 043: new java/lang/StringBuilder
        // 046: dup
        // 047: invokespecial java/lang/StringBuilder.<init> ()V
        // 04a: getstatic net/minecraft/util/text/TextFormatting.RED Lnet/minecraft/util/text/TextFormatting;
        // 04d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 050: ldc "Nether"
        // 052: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 055: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 058: goto 074
        // 05b: invokestatic com/trolmastercard/sexmod/gn.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 05e: athrow
        // 05f: new java/lang/StringBuilder
        // 062: dup
        // 063: invokespecial java/lang/StringBuilder.<init> ()V
        // 066: getstatic net/minecraft/util/text/TextFormatting.DARK_PURPLE Lnet/minecraft/util/text/TextFormatting;
        // 069: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 06c: ldc "End"
        // 06e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 071: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 074: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 077: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 07a: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 07d: invokeinterface net/minecraft/command/ICommandSender.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V 2
        // 082: return
        // 083: aconst_null
        // 084: astore 5
        // 086: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 089: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 08e: astore 6
        // 090: aload 6
        // 092: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 097: ifeq 0f8
        // 09a: aload 6
        // 09c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 0a1: checkcast com/trolmastercard/sexmod/em
        // 0a4: astore 7
        // 0a6: aload 7
        // 0a8: instanceof com/trolmastercard/sexmod/e3
        // 0ab: ifne 0b5
        // 0ae: goto 090
        // 0b1: invokestatic com/trolmastercard/sexmod/gn.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0b4: athrow
        // 0b5: aload 7
        // 0b7: checkcast com/trolmastercard/sexmod/e3
        // 0ba: astore 8
        // 0bc: aload 8
        // 0be: getfield com/trolmastercard/sexmod/e3.aX Z
        // 0c1: ifne 0cb
        // 0c4: goto 090
        // 0c7: invokestatic com/trolmastercard/sexmod/gn.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0ca: athrow
        // 0cb: aload 5
        // 0cd: ifnonnull 0d7
        // 0d0: aload 8
        // 0d2: astore 5
        // 0d4: goto 090
        // 0d7: aload 8
        // 0d9: aload 2
        // 0da: invokeinterface net/minecraft/command/ICommandSender.func_180425_c ()Lnet/minecraft/util/math/BlockPos; 1
        // 0df: invokevirtual com/trolmastercard/sexmod/e3.func_174818_b (Lnet/minecraft/util/math/BlockPos;)D
        // 0e2: aload 5
        // 0e4: aload 2
        // 0e5: invokeinterface net/minecraft/command/ICommandSender.func_180425_c ()Lnet/minecraft/util/math/BlockPos; 1
        // 0ea: invokevirtual com/trolmastercard/sexmod/e3.func_174818_b (Lnet/minecraft/util/math/BlockPos;)D
        // 0ed: dcmpg
        // 0ee: ifge 0f5
        // 0f1: aload 8
        // 0f3: astore 5
        // 0f5: goto 090
        // 0f8: goto 0fd
        // 0fb: astore 6
        // 0fd: aload 5
        // 0ff: ifnonnull 129
        // 102: aload 2
        // 103: new net/minecraft/util/text/TextComponentString
        // 106: dup
        // 107: new java/lang/StringBuilder
        // 10a: dup
        // 10b: invokespecial java/lang/StringBuilder.<init> ()V
        // 10e: getstatic net/minecraft/util/text/TextFormatting.RED Lnet/minecraft/util/text/TextFormatting;
        // 111: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 114: ldc "No nearby goblin lair found uwu"
        // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 119: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 11c: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 11f: invokeinterface net/minecraft/command/ICommandSender.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V 2
        // 124: return
        // 125: invokestatic com/trolmastercard/sexmod/gn.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 128: athrow
        // 129: aload 5
        // 12b: invokevirtual com/trolmastercard/sexmod/e3.func_180425_c ()Lnet/minecraft/util/math/BlockPos;
        // 12e: astore 6
        // 130: aload 2
        // 131: new net/minecraft/util/text/TextComponentString
        // 134: dup
        // 135: ldc "%sgoblin lair found at %s%s %s%s %s%s"
        // 137: bipush 7
        // 139: anewarray 127
        // 13c: dup
        // 13d: bipush 0
        // 13e: getstatic net/minecraft/util/text/TextFormatting.YELLOW Lnet/minecraft/util/text/TextFormatting;
        // 141: aastore
        // 142: dup
        // 143: bipush 1
        // 144: getstatic net/minecraft/util/text/TextFormatting.RED Lnet/minecraft/util/text/TextFormatting;
        // 147: aastore
        // 148: dup
        // 149: bipush 2
        // 14a: aload 6
        // 14c: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
        // 14f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 152: aastore
        // 153: dup
        // 154: bipush 3
        // 155: getstatic net/minecraft/util/text/TextFormatting.GREEN Lnet/minecraft/util/text/TextFormatting;
        // 158: aastore
        // 159: dup
        // 15a: bipush 4
        // 15b: aload 6
        // 15d: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
        // 160: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 163: aastore
        // 164: dup
        // 165: bipush 5
        // 166: getstatic net/minecraft/util/text/TextFormatting.BLUE Lnet/minecraft/util/text/TextFormatting;
        // 169: aastore
        // 16a: dup
        // 16b: bipush 6
        // 16d: aload 6
        // 16f: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
        // 172: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 175: aastore
        // 176: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        // 179: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 17c: invokeinterface net/minecraft/command/ICommandSender.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V 2
        // 181: return
        // try (73 -> 77): 77 java/util/ConcurrentModificationException
        // try (64 -> 68): 68 java/util/ConcurrentModificationException
        // try (11 -> 37): 37 java/util/ConcurrentModificationException
        // try (5 -> 25): 26 java/util/ConcurrentModificationException
        // try (3 -> 8): 9 java/util/ConcurrentModificationException
        // try (54 -> 97): 98 java/util/ConcurrentModificationException
        // try (99 -> 115): 115 java/util/ConcurrentModificationException
    }

    private static ConcurrentModificationException a(ConcurrentModificationException var0) {
        return var0;
    }
}
