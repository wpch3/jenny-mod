package com.trolmastercard.sexmod;

import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class gb extends Gui {
    static final ResourceLocation l = new ResourceLocation("sexmod", "textures/gui/escape_minigame_ui.png");
    static final int f = 52;
    static final float a = 20.0F;
    static final int p = 35;
    static final float n = 0.08F;
    static final float h = 0.006F;
    static final int m = 2;
    static final float i = 0.33F;
    static boolean g = false;
    static gr q = null;
    static float k = 0.0F;
    static float j = 0.0F;
    static boolean b = true;
    static float d = 0.0F;
    static boolean c = false;
    static Minecraft e = Minecraft.func_71410_x();
    static boolean o = false;

    public static void e() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/gb.g Z
        // 03: ifne 0b
        // 06: return
        // 07: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a: athrow
        // 0b: getstatic com/trolmastercard/sexmod/gb.e Lnet/minecraft/client/Minecraft;
        // 0e: getfield net/minecraft/client/Minecraft.field_71441_e Lnet/minecraft/client/multiplayer/WorldClient;
        // 11: ifnonnull 33
        // 14: bipush 0
        // 15: putstatic com/trolmastercard/sexmod/gb.g Z
        // 18: bipush 0
        // 19: putstatic com/trolmastercard/sexmod/gb.o Z
        // 1c: fconst_0
        // 1d: putstatic com/trolmastercard/sexmod/gb.j F
        // 20: fconst_0
        // 21: putstatic com/trolmastercard/sexmod/gb.k F
        // 24: fconst_0
        // 25: putstatic com/trolmastercard/sexmod/gb.d F
        // 28: bipush 0
        // 29: putstatic com/trolmastercard/sexmod/gb.c Z
        // 2c: goto 33
        // 2f: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 32: athrow
        // 33: getstatic com/trolmastercard/sexmod/gb.c Z
        // 36: ifeq 61
        // 39: bipush 0
        // 3a: putstatic com/trolmastercard/sexmod/gb.b Z
        // 3d: getstatic com/trolmastercard/sexmod/gb.d F
        // 40: fconst_1
        // 41: fadd
        // 42: putstatic com/trolmastercard/sexmod/gb.d F
        // 45: getstatic com/trolmastercard/sexmod/gb.d F
        // 48: ldc 20.0
        // 4a: fcmpl
        // 4b: iflt 60
        // 4e: goto 55
        // 51: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 54: athrow
        // 55: bipush 0
        // 56: putstatic com/trolmastercard/sexmod/gb.g Z
        // 59: goto 60
        // 5c: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 5f: athrow
        // 60: return
        // 61: getstatic com/trolmastercard/sexmod/gb.j F
        // 64: fconst_1
        // 65: fadd
        // 66: putstatic com/trolmastercard/sexmod/gb.j F
        // 69: getstatic com/trolmastercard/sexmod/gb.j F
        // 6c: bipush 1
        // 6d: bipush 2
        // 6e: invokestatic java/lang/Math.max (II)I
        // 71: i2f
        // 72: frem
        // 73: fconst_0
        // 74: fcmpl
        // 75: ifne 91
        // 78: getstatic com/trolmastercard/sexmod/gb.b Z
        // 7b: ifne 8d
        // 7e: goto 85
        // 81: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 84: athrow
        // 85: bipush 1
        // 86: goto 8e
        // 89: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 8c: athrow
        // 8d: bipush 0
        // 8e: putstatic com/trolmastercard/sexmod/gb.b Z
        // 91: fconst_0
        // 92: getstatic com/trolmastercard/sexmod/gb.k F
        // 95: ldc 0.006
        // 97: fsub
        // 98: invokestatic java/lang/Math.max (FF)F
        // 9b: putstatic com/trolmastercard/sexmod/gb.k F
        // 9e: getstatic com/trolmastercard/sexmod/gb.j F
        // a1: ldc 20.0
        // a3: fcmpg
        // a4: ifge ac
        // a7: return
        // a8: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // ab: athrow
        // ac: getstatic com/trolmastercard/sexmod/gb.j F
        // af: ldc 35.0
        // b1: frem
        // b2: fconst_0
        // b3: fcmpl
        // b4: ifeq c4
        // b7: getstatic com/trolmastercard/sexmod/gb.q Lcom/trolmastercard/sexmod/gr;
        // ba: ifnonnull ce
        // bd: goto c4
        // c0: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // c3: athrow
        // c4: invokestatic com/trolmastercard/sexmod/gb.b ()V
        // c7: goto ce
        // ca: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // cd: athrow
        // ce: return
        // try (0 -> 3): 3 java/lang/RuntimeException
        // try (5 -> 20): 21 java/lang/RuntimeException
        // try (23 -> 35): 36 java/lang/RuntimeException
        // try (25 -> 40): 41 java/lang/RuntimeException
        // try (44 -> 59): 60 java/lang/RuntimeException
        // try (57 -> 64): 64 java/lang/RuntimeException
        // try (68 -> 79): 79 java/lang/RuntimeException
        // try (81 -> 89): 90 java/lang/RuntimeException
        // try (87 -> 93): 94 java/lang/RuntimeException
    }

    static void b() {
        gr var0 = q;
        Random var1 = new Random();

        try {
            do {
                q = gr.values()[var1.nextInt(gr.values().length)];
            } while (var0 == q);
        } catch (RuntimeException var2) {
            throw a(var2);
        }
    }

    static void c() {
        try {
            if (!g) {
                return;
            }
        } catch (RuntimeException var0) {
            throw a(var0);
        }

        try {
            if (o) {
                return;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        o = true;
        ge.b.sendToServer(new cd());
        d();
    }

    public static void a() {
        g = true;
        o = false;
        j = 0.0F;
        k = 0.0F;
        d = 0.0F;
        c = false;
    }

    public static void d() {
        c = true;
        d = 0.0F;
    }

    @SubscribeEvent
    public void a(RenderGameOverlayEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: getstatic com/trolmastercard/sexmod/gb.g Z
        // 003: ifne 00b
        // 006: return
        // 007: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 00a: athrow
        // 00b: aload 1
        // 00c: invokevirtual net/minecraftforge/client/event/RenderGameOverlayEvent.getType ()Lnet/minecraftforge/client/event/RenderGameOverlayEvent$ElementType;
        // 00f: getstatic net/minecraftforge/client/event/RenderGameOverlayEvent$ElementType.TEXT Lnet/minecraftforge/client/event/RenderGameOverlayEvent$ElementType;
        // 012: if_acmpeq 01a
        // 015: return
        // 016: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 019: athrow
        // 01a: aload 1
        // 01b: invokevirtual net/minecraftforge/client/event/RenderGameOverlayEvent.getResolution ()Lnet/minecraft/client/gui/ScaledResolution;
        // 01e: invokevirtual net/minecraft/client/gui/ScaledResolution.func_78326_a ()I
        // 021: istore 2
        // 022: aload 1
        // 023: invokevirtual net/minecraftforge/client/event/RenderGameOverlayEvent.getResolution ()Lnet/minecraft/client/gui/ScaledResolution;
        // 026: invokevirtual net/minecraft/client/gui/ScaledResolution.func_78328_b ()I
        // 029: istore 3
        // 02a: aload 1
        // 02b: invokevirtual net/minecraftforge/client/event/RenderGameOverlayEvent.getPartialTicks ()F
        // 02e: fstore 4
        // 030: getstatic com/trolmastercard/sexmod/gb.e Lnet/minecraft/client/Minecraft;
        // 033: invokevirtual net/minecraft/client/Minecraft.func_110434_K ()Lnet/minecraft/client/renderer/texture/TextureManager;
        // 036: getstatic com/trolmastercard/sexmod/gb.l Lnet/minecraft/util/ResourceLocation;
        // 039: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
        // 03c: getstatic com/trolmastercard/sexmod/gb.c Z
        // 03f: ifeq 056
        // 042: dconst_1
        // 043: getstatic com/trolmastercard/sexmod/gb.d F
        // 046: fload 4
        // 048: fadd
        // 049: ldc 20.0
        // 04b: fdiv
        // 04c: f2d
        // 04d: invokestatic com/trolmastercard/sexmod/b6.d (D)D
        // 050: dsub
        // 051: dstore 5
        // 053: goto 069
        // 056: dconst_1
        // 057: getstatic com/trolmastercard/sexmod/gb.j F
        // 05a: fload 4
        // 05c: fadd
        // 05d: ldc 20.0
        // 05f: fdiv
        // 060: f2d
        // 061: invokestatic com/trolmastercard/sexmod/b6.c (D)D
        // 064: invokestatic java/lang/Math.min (DD)D
        // 067: dstore 5
        // 069: iload 3
        // 06a: sipush 385
        // 06d: iadd
        // 06e: istore 7
        // 070: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 073: ldc 0.33
        // 075: ldc 0.33
        // 077: ldc 0.33
        // 079: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
        // 07c: ldc 485.0
        // 07e: fconst_0
        // 07f: fconst_0
        // 080: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 083: bipush 4
        // 084: iload 3
        // 085: imul
        // 086: istore 8
        // 088: aload 0
        // 089: iload 2
        // 08a: bipush 2
        // 08b: idiv
        // 08c: bipush 87
        // 08e: isub
        // 08f: iload 8
        // 091: i2d
        // 092: iload 7
        // 094: i2d
        // 095: dload 5
        // 097: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 09a: d2i
        // 09b: bipush 0
        // 09c: bipush 104
        // 09e: sipush 174
        // 0a1: bipush 48
        // 0a3: invokevirtual com/trolmastercard/sexmod/gb.func_73729_b (IIIIII)V
        // 0a6: aload 0
        // 0a7: iload 2
        // 0a8: i2f
        // 0a9: fconst_2
        // 0aa: fdiv
        // 0ab: ldc 78.0
        // 0ad: fsub
        // 0ae: f2i
        // 0af: iload 8
        // 0b1: i2d
        // 0b2: iload 7
        // 0b4: bipush 52
        // 0b6: isub
        // 0b7: i2d
        // 0b8: dload 5
        // 0ba: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 0bd: d2i
        // 0be: bipush 52
        // 0c0: getstatic com/trolmastercard/sexmod/gb.b Z
        // 0c3: ifeq 0df
        // 0c6: getstatic com/trolmastercard/sexmod/gb.q Lcom/trolmastercard/sexmod/gr;
        // 0c9: getstatic com/trolmastercard/sexmod/gr.A Lcom/trolmastercard/sexmod/gr;
        // 0cc: if_acmpne 0df
        // 0cf: goto 0d6
        // 0d2: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0d5: athrow
        // 0d6: bipush 52
        // 0d8: goto 0e0
        // 0db: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0de: athrow
        // 0df: bipush 0
        // 0e0: bipush 52
        // 0e2: bipush 52
        // 0e4: invokevirtual com/trolmastercard/sexmod/gb.func_73729_b (IIIIII)V
        // 0e7: aload 0
        // 0e8: iload 2
        // 0e9: i2f
        // 0ea: fconst_2
        // 0eb: fdiv
        // 0ec: ldc 26.0
        // 0ee: fsub
        // 0ef: f2i
        // 0f0: iload 8
        // 0f2: i2d
        // 0f3: iload 7
        // 0f5: bipush 52
        // 0f7: isub
        // 0f8: i2d
        // 0f9: dload 5
        // 0fb: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 0fe: d2i
        // 0ff: bipush 104
        // 101: getstatic com/trolmastercard/sexmod/gb.b Z
        // 104: ifeq 120
        // 107: getstatic com/trolmastercard/sexmod/gb.q Lcom/trolmastercard/sexmod/gr;
        // 10a: getstatic com/trolmastercard/sexmod/gr.S Lcom/trolmastercard/sexmod/gr;
        // 10d: if_acmpne 120
        // 110: goto 117
        // 113: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 116: athrow
        // 117: bipush 52
        // 119: goto 121
        // 11c: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 11f: athrow
        // 120: bipush 0
        // 121: bipush 52
        // 123: bipush 52
        // 125: invokevirtual com/trolmastercard/sexmod/gb.func_73729_b (IIIIII)V
        // 128: aload 0
        // 129: iload 2
        // 12a: i2f
        // 12b: fconst_2
        // 12c: fdiv
        // 12d: ldc 26.0
        // 12f: fadd
        // 130: f2i
        // 131: iload 8
        // 133: i2d
        // 134: iload 7
        // 136: bipush 52
        // 138: isub
        // 139: i2d
        // 13a: dload 5
        // 13c: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 13f: d2i
        // 140: sipush 156
        // 143: getstatic com/trolmastercard/sexmod/gb.b Z
        // 146: ifeq 162
        // 149: getstatic com/trolmastercard/sexmod/gb.q Lcom/trolmastercard/sexmod/gr;
        // 14c: getstatic com/trolmastercard/sexmod/gr.D Lcom/trolmastercard/sexmod/gr;
        // 14f: if_acmpne 162
        // 152: goto 159
        // 155: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 158: athrow
        // 159: bipush 52
        // 15b: goto 163
        // 15e: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 161: athrow
        // 162: bipush 0
        // 163: bipush 52
        // 165: bipush 52
        // 167: invokevirtual com/trolmastercard/sexmod/gb.func_73729_b (IIIIII)V
        // 16a: aload 0
        // 16b: iload 2
        // 16c: i2f
        // 16d: fconst_2
        // 16e: fdiv
        // 16f: ldc 26.0
        // 171: fsub
        // 172: f2i
        // 173: iload 8
        // 175: i2d
        // 176: iload 7
        // 178: bipush 104
        // 17a: isub
        // 17b: i2d
        // 17c: dload 5
        // 17e: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 181: d2i
        // 182: bipush 0
        // 183: getstatic com/trolmastercard/sexmod/gb.b Z
        // 186: ifeq 1a2
        // 189: getstatic com/trolmastercard/sexmod/gb.q Lcom/trolmastercard/sexmod/gr;
        // 18c: getstatic com/trolmastercard/sexmod/gr.W Lcom/trolmastercard/sexmod/gr;
        // 18f: if_acmpne 1a2
        // 192: goto 199
        // 195: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 198: athrow
        // 199: bipush 52
        // 19b: goto 1a3
        // 19e: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1a1: athrow
        // 1a2: bipush 0
        // 1a3: bipush 52
        // 1a5: bipush 52
        // 1a7: invokevirtual com/trolmastercard/sexmod/gb.func_73729_b (IIIIII)V
        // 1aa: aload 0
        // 1ab: iload 2
        // 1ac: bipush 2
        // 1ad: idiv
        // 1ae: bipush 87
        // 1b0: isub
        // 1b1: bipush 8
        // 1b3: iadd
        // 1b4: iload 8
        // 1b6: bipush 8
        // 1b8: isub
        // 1b9: i2d
        // 1ba: iload 7
        // 1bc: bipush 8
        // 1be: iadd
        // 1bf: i2d
        // 1c0: dload 5
        // 1c2: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 1c5: d2i
        // 1c6: bipush 8
        // 1c8: sipush 152
        // 1cb: ldc 158.0
        // 1cd: getstatic com/trolmastercard/sexmod/gb.k F
        // 1d0: fmul
        // 1d1: f2i
        // 1d2: bipush 32
        // 1d4: invokevirtual com/trolmastercard/sexmod/gb.func_73729_b (IIIIII)V
        // 1d7: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 1da: return
        // try (0 -> 3): 3 java/lang/RuntimeException
        // try (5 -> 10): 10 java/lang/RuntimeException
        // try (67 -> 108): 109 java/lang/RuntimeException
        // try (105 -> 113): 113 java/lang/RuntimeException
        // try (116 -> 142): 143 java/lang/RuntimeException
        // try (139 -> 147): 147 java/lang/RuntimeException
        // try (150 -> 176): 177 java/lang/RuntimeException
        // try (173 -> 181): 181 java/lang/RuntimeException
        // try (184 -> 210): 211 java/lang/RuntimeException
        // try (207 -> 215): 215 java/lang/RuntimeException
    }

    @SubscribeEvent
    public void a(ClientTickEvent var1) {
        try {
            if (var1.phase == Phase.END) {
                return;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        e();
    }

    @SubscribeEvent
    public void a(KeyInputEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 03: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 06: astore 2
        // 07: aload 2
        // 08: getfield net/minecraft/client/settings/GameSettings.field_74370_x Lnet/minecraft/client/settings/KeyBinding;
        // 0b: invokestatic net/minecraft/client/settings/GameSettings.func_100015_a (Lnet/minecraft/client/settings/KeyBinding;)Z
        // 0e: ifeq 3b
        // 11: getstatic com/trolmastercard/sexmod/gb.q Lcom/trolmastercard/sexmod/gr;
        // 14: getstatic com/trolmastercard/sexmod/gr.A Lcom/trolmastercard/sexmod/gr;
        // 17: if_acmpne 31
        // 1a: goto 21
        // 1d: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 20: athrow
        // 21: getstatic com/trolmastercard/sexmod/gb.k F
        // 24: ldc 0.08
        // 26: fadd
        // 27: putstatic com/trolmastercard/sexmod/gb.k F
        // 2a: goto 3a
        // 2d: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 30: athrow
        // 31: getstatic com/trolmastercard/sexmod/gb.k F
        // 34: ldc 0.04
        // 36: fsub
        // 37: putstatic com/trolmastercard/sexmod/gb.k F
        // 3a: return
        // 3b: aload 2
        // 3c: getfield net/minecraft/client/settings/GameSettings.field_74366_z Lnet/minecraft/client/settings/KeyBinding;
        // 3f: invokestatic net/minecraft/client/settings/GameSettings.func_100015_a (Lnet/minecraft/client/settings/KeyBinding;)Z
        // 42: ifeq 6f
        // 45: getstatic com/trolmastercard/sexmod/gb.q Lcom/trolmastercard/sexmod/gr;
        // 48: getstatic com/trolmastercard/sexmod/gr.D Lcom/trolmastercard/sexmod/gr;
        // 4b: if_acmpne 65
        // 4e: goto 55
        // 51: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 54: athrow
        // 55: getstatic com/trolmastercard/sexmod/gb.k F
        // 58: ldc 0.08
        // 5a: fadd
        // 5b: putstatic com/trolmastercard/sexmod/gb.k F
        // 5e: goto 6e
        // 61: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 64: athrow
        // 65: getstatic com/trolmastercard/sexmod/gb.k F
        // 68: ldc 0.04
        // 6a: fsub
        // 6b: putstatic com/trolmastercard/sexmod/gb.k F
        // 6e: return
        // 6f: aload 2
        // 70: getfield net/minecraft/client/settings/GameSettings.field_74351_w Lnet/minecraft/client/settings/KeyBinding;
        // 73: invokestatic net/minecraft/client/settings/GameSettings.func_100015_a (Lnet/minecraft/client/settings/KeyBinding;)Z
        // 76: ifeq a3
        // 79: getstatic com/trolmastercard/sexmod/gb.q Lcom/trolmastercard/sexmod/gr;
        // 7c: getstatic com/trolmastercard/sexmod/gr.W Lcom/trolmastercard/sexmod/gr;
        // 7f: if_acmpne 99
        // 82: goto 89
        // 85: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 88: athrow
        // 89: getstatic com/trolmastercard/sexmod/gb.k F
        // 8c: ldc 0.08
        // 8e: fadd
        // 8f: putstatic com/trolmastercard/sexmod/gb.k F
        // 92: goto a2
        // 95: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 98: athrow
        // 99: getstatic com/trolmastercard/sexmod/gb.k F
        // 9c: ldc 0.04
        // 9e: fsub
        // 9f: putstatic com/trolmastercard/sexmod/gb.k F
        // a2: return
        // a3: aload 2
        // a4: getfield net/minecraft/client/settings/GameSettings.field_74368_y Lnet/minecraft/client/settings/KeyBinding;
        // a7: invokestatic net/minecraft/client/settings/GameSettings.func_100015_a (Lnet/minecraft/client/settings/KeyBinding;)Z
        // aa: ifeq d7
        // ad: getstatic com/trolmastercard/sexmod/gb.q Lcom/trolmastercard/sexmod/gr;
        // b0: getstatic com/trolmastercard/sexmod/gr.S Lcom/trolmastercard/sexmod/gr;
        // b3: if_acmpne cd
        // b6: goto bd
        // b9: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // bc: athrow
        // bd: getstatic com/trolmastercard/sexmod/gb.k F
        // c0: ldc 0.08
        // c2: fadd
        // c3: putstatic com/trolmastercard/sexmod/gb.k F
        // c6: goto d6
        // c9: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // cc: athrow
        // cd: getstatic com/trolmastercard/sexmod/gb.k F
        // d0: ldc 0.04
        // d2: fsub
        // d3: putstatic com/trolmastercard/sexmod/gb.k F
        // d6: return
        // d7: getstatic com/trolmastercard/sexmod/gb.k F
        // da: fconst_1
        // db: fcmpl
        // dc: iflt e9
        // df: invokestatic com/trolmastercard/sexmod/gb.c ()V
        // e2: goto e9
        // e5: invokestatic com/trolmastercard/sexmod/gb.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // e8: athrow
        // e9: return
        // try (3 -> 10): 11 java/lang/RuntimeException
        // try (7 -> 18): 18 java/lang/RuntimeException
        // try (25 -> 32): 33 java/lang/RuntimeException
        // try (29 -> 40): 40 java/lang/RuntimeException
        // try (47 -> 54): 55 java/lang/RuntimeException
        // try (51 -> 62): 62 java/lang/RuntimeException
        // try (69 -> 76): 77 java/lang/RuntimeException
        // try (73 -> 84): 84 java/lang/RuntimeException
        // try (91 -> 96): 97 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
