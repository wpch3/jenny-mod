package com.trolmastercard.sexmod;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.IClientCommand;

public class fd extends CommandBase implements IClientCommand {
    public static final fd a = new fd();

    public String func_71517_b() {
        return "whitelistserver";
    }

    public String func_71518_a(ICommandSender var1) {
        return "/whitelistserver";
    }

    public boolean allowUsageWithoutPrefix(ICommandSender var1, String var2) {
        return false;
    }

    public boolean func_184882_a(MinecraftServer var1, ICommandSender var2) {
        return true;
    }

    public void func_184881_a(MinecraftServer param1, ICommandSender param2, String[] param3) throws CommandException {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: invokestatic com/trolmastercard/sexmod/br.g ()Ljava/lang/String;
        // 003: astore 4
        // 005: aload 4
        // 007: ifnonnull 031
        // 00a: aload 2
        // 00b: new net/minecraft/util/text/TextComponentString
        // 00e: dup
        // 00f: new java/lang/StringBuilder
        // 012: dup
        // 013: invokespecial java/lang/StringBuilder.<init> ()V
        // 016: getstatic net/minecraft/util/text/TextFormatting.YELLOW Lnet/minecraft/util/text/TextFormatting;
        // 019: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 01c: ldc "This is a multiplayer feature only"
        // 01e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 021: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 024: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 027: invokeinterface net/minecraft/command/ICommandSender.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V 2
        // 02c: return
        // 02d: invokestatic com/trolmastercard/sexmod/fd.a (Lnet/minecraft/command/CommandException;)Lnet/minecraft/command/CommandException;
        // 030: athrow
        // 031: aload 4
        // 033: invokestatic com/trolmastercard/sexmod/br.l (Ljava/lang/String;)Z
        // 036: ifeq 060
        // 039: aload 2
        // 03a: new net/minecraft/util/text/TextComponentString
        // 03d: dup
        // 03e: new java/lang/StringBuilder
        // 041: dup
        // 042: invokespecial java/lang/StringBuilder.<init> ()V
        // 045: getstatic net/minecraft/util/text/TextFormatting.GREEN Lnet/minecraft/util/text/TextFormatting;
        // 048: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 04b: ldc "Server is already whitelisted :)"
        // 04d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 050: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 053: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 056: invokeinterface net/minecraft/command/ICommandSender.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V 2
        // 05b: return
        // 05c: invokestatic com/trolmastercard/sexmod/fd.a (Lnet/minecraft/command/CommandException;)Lnet/minecraft/command/CommandException;
        // 05f: athrow
        // 060: aload 3
        // 061: arraylength
        // 062: ifle 07f
        // 065: ldc "confirm"
        // 067: aload 3
        // 068: bipush 0
        // 069: aaload
        // 06a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 06d: ifeq 07f
        // 070: goto 077
        // 073: invokestatic com/trolmastercard/sexmod/fd.a (Lnet/minecraft/command/CommandException;)Lnet/minecraft/command/CommandException;
        // 076: athrow
        // 077: bipush 1
        // 078: goto 080
        // 07b: invokestatic com/trolmastercard/sexmod/fd.a (Lnet/minecraft/command/CommandException;)Lnet/minecraft/command/CommandException;
        // 07e: athrow
        // 07f: bipush 0
        // 080: istore 5
        // 082: iload 5
        // 084: ifne 114
        // 087: aload 2
        // 088: new net/minecraft/util/text/TextComponentString
        // 08b: dup
        // 08c: new java/lang/StringBuilder
        // 08f: dup
        // 090: invokespecial java/lang/StringBuilder.<init> ()V
        // 093: getstatic net/minecraft/util/text/TextFormatting.YELLOW Lnet/minecraft/util/text/TextFormatting;
        // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 099: ldc "By whitelisting this server, you allow the server to send you the custom models that are used on it"
        // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 09e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 0a1: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 0a4: invokeinterface net/minecraft/command/ICommandSender.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V 2
        // 0a9: aload 2
        // 0aa: new net/minecraft/util/text/TextComponentString
        // 0ad: dup
        // 0ae: new java/lang/StringBuilder
        // 0b1: dup
        // 0b2: invokespecial java/lang/StringBuilder.<init> ()V
        // 0b5: getstatic net/minecraft/util/text/TextFormatting.RED Lnet/minecraft/util/text/TextFormatting;
        // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 0bb: ldc "ONLY WHITELIST SERVERS, WHOSE SERVER OWNER YOU KNOW AND TRUST"
        // 0bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 0c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 0c3: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 0c6: invokeinterface net/minecraft/command/ICommandSender.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V 2
        // 0cb: aload 2
        // 0cc: new net/minecraft/util/text/TextComponentString
        // 0cf: dup
        // 0d0: new java/lang/StringBuilder
        // 0d3: dup
        // 0d4: invokespecial java/lang/StringBuilder.<init> ()V
        // 0d7: getstatic net/minecraft/util/text/TextFormatting.YELLOW Lnet/minecraft/util/text/TextFormatting;
        // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 0dd: ldc "to confirm your decision type:"
        // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 0e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 0e5: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 0e8: invokeinterface net/minecraft/command/ICommandSender.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V 2
        // 0ed: aload 2
        // 0ee: new net/minecraft/util/text/TextComponentString
        // 0f1: dup
        // 0f2: new java/lang/StringBuilder
        // 0f5: dup
        // 0f6: invokespecial java/lang/StringBuilder.<init> ()V
        // 0f9: getstatic net/minecraft/util/text/TextFormatting.GREEN Lnet/minecraft/util/text/TextFormatting;
        // 0fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 0ff: ldc "/whitelistserver confirm"
        // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 104: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 107: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 10a: invokeinterface net/minecraft/command/ICommandSender.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V 2
        // 10f: return
        // 110: invokestatic com/trolmastercard/sexmod/fd.a (Lnet/minecraft/command/CommandException;)Lnet/minecraft/command/CommandException;
        // 113: athrow
        // 114: aload 4
        // 116: invokestatic com/trolmastercard/sexmod/br.h (Ljava/lang/String;)V
        // 119: aload 2
        // 11a: new net/minecraft/util/text/TextComponentString
        // 11d: dup
        // 11e: new java/lang/StringBuilder
        // 121: dup
        // 122: invokespecial java/lang/StringBuilder.<init> ()V
        // 125: getstatic net/minecraft/util/text/TextFormatting.GREEN Lnet/minecraft/util/text/TextFormatting;
        // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 12b: ldc "confirmed :)"
        // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 130: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 133: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 136: invokeinterface net/minecraft/command/ICommandSender.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V 2
        // 13b: invokestatic com/trolmastercard/sexmod/br.a ()V
        // 13e: return
        // try (2 -> 18): 18 net/minecraft/command/CommandException
        // try (20 -> 37): 37 net/minecraft/command/CommandException
        // try (39 -> 48): 49 net/minecraft/command/CommandException
        // try (42 -> 53): 53 net/minecraft/command/CommandException
        // try (57 -> 112): 112 net/minecraft/command/CommandException
    }

    private static CommandException a(CommandException var0) {
        return var0;
    }
}
