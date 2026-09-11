package com.trolmastercard.sexmod;

import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ds extends Gui {
    static ResourceLocation e = new ResourceLocation("sexmod", "textures/gui/buttons.png");
    static ResourceLocation b = new ResourceLocation("sexmod", "textures/gui/hornymeter.png");
    public static boolean d = false;
    public static double c = 0.0;
    static double a = c;
    static float f = 0.0F;
    static float g = 0.0F;
    static boolean i = false;
    static boolean h = true;

    public static void d() {
        try {
            if (d) {
                return;
            }
        } catch (RuntimeException var0) {
            throw a(var0);
        }

        b();
        d = true;
        h = true;
    }

    public static void a(boolean var0) {
        try {
            if (d) {
                return;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        b();
        d = true;
        h = var0;
    }

    public static void c() {
        b();
        d = false;
        h = true;
    }

    public static boolean a() {
        return d;
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
        // 000: getstatic com/trolmastercard/sexmod/ds.d Z
        // 003: ifeq 21e
        // 006: aload 1
        // 007: invokevirtual net/minecraftforge/client/event/RenderGameOverlayEvent.getType ()Lnet/minecraftforge/client/event/RenderGameOverlayEvent$ElementType;
        // 00a: getstatic net/minecraftforge/client/event/RenderGameOverlayEvent$ElementType.TEXT Lnet/minecraftforge/client/event/RenderGameOverlayEvent$ElementType;
        // 00d: if_acmpne 21e
        // 010: goto 017
        // 013: invokestatic com/trolmastercard/sexmod/ds.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 016: athrow
        // 017: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 01a: astore 2
        // 01b: getstatic com/trolmastercard/sexmod/ds.f F
        // 01e: fconst_1
        // 01f: fcmpg
        // 020: ifge 038
        // 023: getstatic com/trolmastercard/sexmod/ds.f F
        // 026: aload 2
        // 027: invokevirtual net/minecraft/client/Minecraft.func_193989_ak ()F
        // 02a: ldc 25.0
        // 02c: fdiv
        // 02d: fadd
        // 02e: putstatic com/trolmastercard/sexmod/ds.f F
        // 031: goto 03c
        // 034: invokestatic com/trolmastercard/sexmod/ds.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 037: athrow
        // 038: fconst_1
        // 039: putstatic com/trolmastercard/sexmod/ds.f F
        // 03c: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
        // 03f: aload 2
        // 040: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
        // 043: getstatic com/trolmastercard/sexmod/ds.e Lnet/minecraft/util/ResourceLocation;
        // 046: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
        // 049: ldc 0.35
        // 04b: ldc 0.35
        // 04d: ldc 0.35
        // 04f: invokestatic org/lwjgl/opengl/GL11.glScalef (FFF)V
        // 052: getstatic com/trolmastercard/sexmod/ds.c D
        // 055: dconst_1
        // 056: dcmpl
        // 057: iflt 097
        // 05a: getstatic com/trolmastercard/sexmod/d3.a Z
        // 05d: ifeq 072
        // 060: goto 067
        // 063: invokestatic com/trolmastercard/sexmod/ds.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 066: athrow
        // 067: bipush 1
        // 068: putstatic com/trolmastercard/sexmod/ds.i Z
        // 06b: goto 072
        // 06e: invokestatic com/trolmastercard/sexmod/ds.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 071: athrow
        // 072: getstatic com/trolmastercard/sexmod/ds.i Z
        // 075: ifeq 081
        // 078: bipush 54
        // 07a: goto 082
        // 07d: invokestatic com/trolmastercard/sexmod/ds.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 080: athrow
        // 081: bipush 0
        // 082: istore 3
        // 083: aload 0
        // 084: sipush 240
        // 087: sipush 160
        // 08a: bipush 0
        // 08b: bipush 108
        // 08d: iload 3
        // 08e: iadd
        // 08f: sipush 256
        // 092: bipush 52
        // 094: invokevirtual com/trolmastercard/sexmod/ds.func_73729_b (IIIIII)V
        // 097: getstatic com/trolmastercard/sexmod/ds.h Z
        // 09a: ifeq 0db
        // 09d: getstatic com/trolmastercard/sexmod/ds.i Z
        // 0a0: ifne 0db
        // 0a3: goto 0aa
        // 0a6: invokestatic com/trolmastercard/sexmod/ds.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a9: athrow
        // 0aa: getstatic com/trolmastercard/sexmod/d3.d Z
        // 0ad: ifeq 0c0
        // 0b0: goto 0b7
        // 0b3: invokestatic com/trolmastercard/sexmod/ds.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b6: athrow
        // 0b7: bipush 54
        // 0b9: goto 0c1
        // 0bc: invokestatic com/trolmastercard/sexmod/ds.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0bf: athrow
        // 0c0: bipush 0
        // 0c1: istore 3
        // 0c2: aload 0
        // 0c3: ldc -200.0
        // 0c5: ldc 98.0
        // 0c7: getstatic com/trolmastercard/sexmod/ds.f F
        // 0ca: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 0cd: f2i
        // 0ce: sipush 405
        // 0d1: bipush 0
        // 0d2: iload 3
        // 0d3: sipush 158
        // 0d6: bipush 54
        // 0d8: invokevirtual com/trolmastercard/sexmod/ds.func_73729_b (IIIIII)V
        // 0db: ldc 2.857143
        // 0dd: ldc 2.857143
        // 0df: ldc 2.857143
        // 0e1: invokestatic org/lwjgl/opengl/GL11.glScalef (FFF)V
        // 0e4: aload 2
        // 0e5: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
        // 0e8: getstatic com/trolmastercard/sexmod/ds.b Lnet/minecraft/util/ResourceLocation;
        // 0eb: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
        // 0ee: ldc 0.75
        // 0f0: ldc 0.75
        // 0f2: ldc 0.75
        // 0f4: invokestatic org/lwjgl/opengl/GL11.glScalef (FFF)V
        // 0f7: aload 0
        // 0f8: bipush 10
        // 0fa: ldc -200.0
        // 0fc: ldc 10.0
        // 0fe: getstatic com/trolmastercard/sexmod/ds.f F
        // 101: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 104: f2i
        // 105: bipush 0
        // 106: bipush 0
        // 107: sipush 146
        // 10a: sipush 175
        // 10d: invokevirtual com/trolmastercard/sexmod/ds.func_73729_b (IIIIII)V
        // 110: getstatic com/trolmastercard/sexmod/ds.a D
        // 113: getstatic com/trolmastercard/sexmod/ds.c D
        // 116: aload 2
        // 117: invokevirtual net/minecraft/client/Minecraft.func_193989_ak ()F
        // 11a: f2d
        // 11b: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 11e: putstatic com/trolmastercard/sexmod/ds.a D
        // 121: dconst_0
        // 122: ldc2_w 160.0
        // 125: getstatic com/trolmastercard/sexmod/ds.a D
        // 128: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 12b: d2i
        // 12c: istore 3
        // 12d: ldc2_w 167.0
        // 130: ldc2_w 8.0
        // 133: getstatic com/trolmastercard/sexmod/ds.a D
        // 136: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 139: d2i
        // 13a: istore 4
        // 13c: ldc2_w 178.0
        // 13f: ldc2_w 18.0
        // 142: getstatic com/trolmastercard/sexmod/ds.a D
        // 145: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 148: dstore 5
        // 14a: getstatic com/trolmastercard/sexmod/ds.i Z
        // 14d: ifne 1f2
        // 150: aload 0
        // 151: bipush 67
        // 153: ldc2_w -45.0
        // 156: dload 5
        // 158: getstatic com/trolmastercard/sexmod/ds.f F
        // 15b: f2d
        // 15c: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 15f: d2i
        // 160: sipush 159
        // 163: iload 4
        // 165: bipush 32
        // 167: iload 3
        // 168: invokevirtual com/trolmastercard/sexmod/ds.func_73729_b (IIIIII)V
        // 16b: aload 0
        // 16c: bipush 120
        // 16e: ldc2_w -58.0
        // 171: ldc2_w 178.0
        // 174: ldc2_w 149.0
        // 177: dconst_1
        // 178: getstatic com/trolmastercard/sexmod/ds.a D
        // 17b: dsub
        // 17c: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 17f: getstatic com/trolmastercard/sexmod/ds.f F
        // 182: f2d
        // 183: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 186: d2i
        // 187: sipush 212
        // 18a: ldc2_w 169.0
        // 18d: ldc2_w 141.0
        // 190: dconst_1
        // 191: getstatic com/trolmastercard/sexmod/ds.a D
        // 194: dsub
        // 195: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 198: d2i
        // 199: bipush 28
        // 19b: dconst_1
        // 19c: ldc2_w 29.0
        // 19f: dconst_1
        // 1a0: getstatic com/trolmastercard/sexmod/ds.a D
        // 1a3: dsub
        // 1a4: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 1a7: d2i
        // 1a8: invokevirtual com/trolmastercard/sexmod/ds.func_73729_b (IIIIII)V
        // 1ab: aload 0
        // 1ac: bipush 18
        // 1ae: ldc2_w -58.0
        // 1b1: ldc2_w 178.0
        // 1b4: ldc2_w 149.0
        // 1b7: dconst_1
        // 1b8: getstatic com/trolmastercard/sexmod/ds.a D
        // 1bb: dsub
        // 1bc: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 1bf: getstatic com/trolmastercard/sexmod/ds.f F
        // 1c2: f2d
        // 1c3: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 1c6: d2i
        // 1c7: sipush 212
        // 1ca: ldc2_w 169.0
        // 1cd: ldc2_w 141.0
        // 1d0: dconst_1
        // 1d1: getstatic com/trolmastercard/sexmod/ds.a D
        // 1d4: dsub
        // 1d5: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 1d8: d2i
        // 1d9: bipush 28
        // 1db: dconst_1
        // 1dc: ldc2_w 29.0
        // 1df: dconst_1
        // 1e0: getstatic com/trolmastercard/sexmod/ds.a D
        // 1e3: dsub
        // 1e4: invokestatic com/trolmastercard/sexmod/b6.b (DDD)D
        // 1e7: d2i
        // 1e8: invokevirtual com/trolmastercard/sexmod/ds.func_73729_b (IIIIII)V
        // 1eb: goto 21b
        // 1ee: invokestatic com/trolmastercard/sexmod/ds.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1f1: athrow
        // 1f2: getstatic com/trolmastercard/sexmod/ds.g F
        // 1f5: aload 2
        // 1f6: invokevirtual net/minecraft/client/Minecraft.func_193989_ak ()F
        // 1f9: ldc 15.0
        // 1fb: fdiv
        // 1fc: fadd
        // 1fd: putstatic com/trolmastercard/sexmod/ds.g F
        // 200: aload 0
        // 201: bipush 67
        // 203: ldc 18.0
        // 205: ldc -300.0
        // 207: getstatic com/trolmastercard/sexmod/ds.g F
        // 20a: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 20d: f2i
        // 20e: sipush 159
        // 211: bipush 8
        // 213: bipush 32
        // 215: sipush 160
        // 218: invokevirtual com/trolmastercard/sexmod/ds.func_73729_b (IIIIII)V
        // 21b: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
        // 21e: return
        // try (0 -> 6): 7 java/lang/RuntimeException
        // try (11 -> 23): 23 java/lang/RuntimeException
        // try (27 -> 42): 43 java/lang/RuntimeException
        // try (40 -> 47): 48 java/lang/RuntimeException
        // try (50 -> 54): 54 java/lang/RuntimeException
        // try (68 -> 72): 73 java/lang/RuntimeException
        // try (70 -> 77): 78 java/lang/RuntimeException
        // try (75 -> 82): 82 java/lang/RuntimeException
        // try (146 -> 222): 222 java/lang/RuntimeException
    }

    public static void a(double var0) {
        double var10000;
        label16: {
            try {
                c += var0;
                if (c > 1.0) {
                    var10000 = 1.0;
                    break label16;
                }
            } catch (RuntimeException var2) {
                throw a(var2);
            }

            var10000 = c;
        }

        c = var10000;
    }

    public static void b() {
        c = 0.0;
        i = false;
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
