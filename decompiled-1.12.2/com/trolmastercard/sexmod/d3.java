package com.trolmastercard.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.MovementInput;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class d3 {
    private static boolean c = true;
    public static boolean d = false;
    public static boolean a = false;
    public static MovementInput b;

    @SubscribeEvent
    public void a(InputUpdateEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: invokevirtual net/minecraftforge/client/event/InputUpdateEvent.getMovementInput ()Lnet/minecraft/util/MovementInput;
        // 04: putstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 07: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 0a: getfield net/minecraft/util/MovementInput.field_78899_d Z
        // 0d: putstatic com/trolmastercard/sexmod/d3.d Z
        // 10: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 13: getfield net/minecraft/util/MovementInput.field_78901_c Z
        // 16: putstatic com/trolmastercard/sexmod/d3.a Z
        // 19: getstatic com/trolmastercard/sexmod/d3.c Z
        // 1c: ifeq 24
        // 1f: return
        // 20: invokestatic com/trolmastercard/sexmod/d3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 23: athrow
        // 24: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 27: getfield net/minecraft/util/MovementInput.field_78901_c Z
        // 2a: ifeq 37
        // 2d: invokestatic com/trolmastercard/sexmod/ei.i ()V
        // 30: goto 37
        // 33: invokestatic com/trolmastercard/sexmod/d3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 36: athrow
        // 37: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 3a: getfield net/minecraft/util/MovementInput.field_78899_d Z
        // 3d: ifeq 53
        // 40: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 43: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 46: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 49: invokestatic com/trolmastercard/sexmod/em.k (Ljava/util/UUID;)V
        // 4c: goto 53
        // 4f: invokestatic com/trolmastercard/sexmod/d3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 52: athrow
        // 53: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 56: getfield net/minecraft/util/MovementInput.field_78901_c Z
        // 59: ifeq 7e
        // 5c: getstatic com/trolmastercard/sexmod/ds.c D
        // 5f: dconst_1
        // 60: dcmpl
        // 61: iflt 7e
        // 64: goto 6b
        // 67: invokestatic com/trolmastercard/sexmod/d3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 6a: athrow
        // 6b: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 6e: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 71: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 74: invokestatic com/trolmastercard/sexmod/em.f (Ljava/util/UUID;)V
        // 77: goto 7e
        // 7a: invokestatic com/trolmastercard/sexmod/d3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 7d: athrow
        // 7e: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 81: bipush 0
        // 82: putfield net/minecraft/util/MovementInput.field_187256_d Z
        // 85: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 88: bipush 0
        // 89: putfield net/minecraft/util/MovementInput.field_187255_c Z
        // 8c: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 8f: bipush 0
        // 90: putfield net/minecraft/util/MovementInput.field_187257_e Z
        // 93: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 96: bipush 0
        // 97: putfield net/minecraft/util/MovementInput.field_187258_f Z
        // 9a: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // 9d: bipush 0
        // 9e: putfield net/minecraft/util/MovementInput.field_78899_d Z
        // a1: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // a4: bipush 0
        // a5: putfield net/minecraft/util/MovementInput.field_78901_c Z
        // a8: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // ab: fconst_0
        // ac: putfield net/minecraft/util/MovementInput.field_192832_b F
        // af: getstatic com/trolmastercard/sexmod/d3.b Lnet/minecraft/util/MovementInput;
        // b2: fconst_0
        // b3: putfield net/minecraft/util/MovementInput.field_78902_a F
        // b6: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // b9: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // bc: dconst_0
        // bd: dconst_0
        // be: dconst_0
        // bf: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70016_h (DDD)V
        // c2: return
        // try (0 -> 12): 12 java/lang/RuntimeException
        // try (14 -> 18): 19 java/lang/RuntimeException
        // try (21 -> 28): 29 java/lang/RuntimeException
        // try (31 -> 38): 39 java/lang/RuntimeException
        // try (34 -> 45): 46 java/lang/RuntimeException
    }

    public static boolean b() {
        return c;
    }

    public static void a(boolean var0) {
        try {
            c = var0;
            if (!var0) {
                a();
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }
    }

    @SideOnly(Side.CLIENT)
    static void a() {
        EntityPlayerSP var0 = Minecraft.func_71410_x().field_71439_g;

        try {
            if (!ei.e(var0)) {
                return;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        var0.func_146105_b(new TextComponentString("Jump to get out of the animation"), true);
    }

    @SubscribeEvent
    public void a(MouseEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/d3.c Z
        // 03: ifne 20
        // 06: aload 1
        // 07: invokevirtual net/minecraftforge/client/event/MouseEvent.isButtonstate ()Z
        // 0a: ifeq 20
        // 0d: goto 14
        // 10: invokestatic com/trolmastercard/sexmod/d3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 13: athrow
        // 14: aload 1
        // 15: bipush 1
        // 16: invokevirtual net/minecraftforge/client/event/MouseEvent.setCanceled (Z)V
        // 19: goto 20
        // 1c: invokestatic com/trolmastercard/sexmod/d3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1f: athrow
        // 20: return
        // try (0 -> 5): 6 java/lang/RuntimeException
        // try (2 -> 11): 12 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
