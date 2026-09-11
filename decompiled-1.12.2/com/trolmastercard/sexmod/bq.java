package com.trolmastercard.sexmod;

import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class bq {
    @SubscribeEvent
    public void a(GuiOpenEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: invokevirtual net/minecraftforge/client/event/GuiOpenEvent.getGui ()Lnet/minecraft/client/gui/GuiScreen;
        // 04: instanceof net/minecraft/client/gui/GuiMainMenu
        // 07: ifne 1b
        // 0a: aload 1
        // 0b: invokevirtual net/minecraftforge/client/event/GuiOpenEvent.getGui ()Lnet/minecraft/client/gui/GuiScreen;
        // 0e: instanceof net/minecraft/client/gui/GuiMultiplayer
        // 11: ifeq 30
        // 14: goto 1b
        // 17: invokestatic com/trolmastercard/sexmod/bq.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1a: athrow
        // 1b: getstatic com/trolmastercard/sexmod/ei.Z Ljava/util/List;
        // 1e: invokeinterface java/util/List.clear ()V 1
        // 23: getstatic com/trolmastercard/sexmod/ei.al Ljava/util/Hashtable;
        // 26: invokevirtual java/util/Hashtable.clear ()V
        // 29: goto 30
        // 2c: invokestatic com/trolmastercard/sexmod/bq.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2f: athrow
        // 30: return
        // try (0 -> 8): 9 java/lang/RuntimeException
        // try (4 -> 15): 16 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
