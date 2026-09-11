package com.trolmastercard.sexmod;

import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ea extends GuiScreen {
    static final float j = 100.0F;
    static final float c = 15.0F;
    static final float k = 5.0F;
    static final float l = 0.5F;
    static final float b = 0.5F;
    static final ResourceLocation i = new ResourceLocation("sexmod", "textures/gui/command.png");
    float a = 0.0F;
    float g = 0.0F;
    float e = 0.0F;
    float d = 0.0F;
    float m = 0.0F;
    em f;
    boolean h = false;

    public ea(em var1) {
        this.f = var1;
        this.h = var1 instanceof e3;
    }

    public void func_146281_b() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokespecial net/minecraft/client/gui/GuiScreen.func_146281_b ()V
        // 04: aload 0
        // 05: getfield com/trolmastercard/sexmod/ea.d F
        // 08: fconst_0
        // 09: fcmpl
        // 0a: ifne 32
        // 0d: aload 0
        // 0e: getfield com/trolmastercard/sexmod/ea.m F
        // 11: fconst_0
        // 12: fcmpl
        // 13: ifne 32
        // 16: goto 1d
        // 19: invokestatic com/trolmastercard/sexmod/ea.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1c: athrow
        // 1d: aload 0
        // 1e: getfield com/trolmastercard/sexmod/ea.g F
        // 21: fconst_0
        // 22: fcmpl
        // 23: ifne 32
        // 26: goto 2d
        // 29: invokestatic com/trolmastercard/sexmod/ea.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2c: athrow
        // 2d: return
        // 2e: invokestatic com/trolmastercard/sexmod/ea.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 31: athrow
        // 32: aload 0
        // 33: getfield com/trolmastercard/sexmod/ea.g F
        // 36: fconst_0
        // 37: fcmpl
        // 38: ifle 44
        // 3b: aload 0
        // 3c: invokevirtual com/trolmastercard/sexmod/ea.c ()V
        // 3f: return
        // 40: invokestatic com/trolmastercard/sexmod/ea.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 43: athrow
        // 44: aload 0
        // 45: getfield com/trolmastercard/sexmod/ea.h Z
        // 48: ifne 50
        // 4b: return
        // 4c: invokestatic com/trolmastercard/sexmod/ea.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 4f: athrow
        // 50: aload 0
        // 51: getfield com/trolmastercard/sexmod/ea.d F
        // 54: aload 0
        // 55: getfield com/trolmastercard/sexmod/ea.m F
        // 58: fcmpl
        // 59: ifle 67
        // 5c: aload 0
        // 5d: invokevirtual com/trolmastercard/sexmod/ea.a ()V
        // 60: goto 6b
        // 63: invokestatic com/trolmastercard/sexmod/ea.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 66: athrow
        // 67: aload 0
        // 68: invokevirtual com/trolmastercard/sexmod/ea.b ()V
        // 6b: return
        // try (0 -> 12): 13 java/lang/NullPointerException
        // try (7 -> 20): 21 java/lang/NullPointerException
        // try (15 -> 24): 24 java/lang/NullPointerException
        // try (26 -> 34): 34 java/lang/NullPointerException
        // try (36 -> 40): 40 java/lang/NullPointerException
        // try (42 -> 51): 51 java/lang/NullPointerException
    }

    void a() {
        try {
            if (this.h) {
                ((e3)this.f).c(Minecraft.func_71410_x().field_71439_g.getPersistentID());
            }
        } catch (NullPointerException var1) {
            throw a(var1);
        }
    }

    void b() {
        ((e3)this.f).b(Minecraft.func_71410_x().field_71439_g.getPersistentID());
    }

    void c() {
        try {
            if (this.f.ae() != null) {
                return;
            }
        } catch (NullPointerException var1) {
            throw a(var1);
        }

        this.f.b(fp.START_THROWING);
    }

    public void func_146282_l() throws IOException {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/ClientProxy.keyBindings [Lnet/minecraft/client/settings/KeyBinding;
        // 03: bipush 0
        // 04: aaload
        // 05: invokevirtual net/minecraft/client/settings/KeyBinding.func_151463_i ()I
        // 08: invokestatic org/lwjgl/input/Keyboard.getEventKey ()I
        // 0b: if_icmpne 29
        // 0e: invokestatic org/lwjgl/input/Keyboard.getEventKeyState ()Z
        // 11: ifne 29
        // 14: goto 1b
        // 17: invokestatic com/trolmastercard/sexmod/ea.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1a: athrow
        // 1b: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 1e: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 21: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_71053_j ()V
        // 24: return
        // 25: invokestatic com/trolmastercard/sexmod/ea.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 28: athrow
        // 29: aload 0
        // 2a: invokespecial net/minecraft/client/gui/GuiScreen.func_146282_l ()V
        // 2d: return
        // try (0 -> 8): 9 java/io/IOException
        // try (6 -> 15): 15 java/io/IOException
    }

    public void func_73863_a(int var1, int var2, float var3) {
        super.func_73863_a(var1, var2, var3);
        GL11.glEnable(3042);
        OpenGlHelper.func_148821_a(770, 771, 1, 0);
        GL11.glBlendFunc(770, 771);

        try {
            this.a = Math.min(1.0F, this.a + this.field_146297_k.func_193989_ak() / 5.0F);
        } catch (NullPointerException var7) {
        }

        float var4 = (float)this.a(this.a);
        float var5 = (1.0F - var4) * 100.0F;

        ea var10000;
        float var10001;
        byte var10002;
        label78: {
            try {
                var10000 = this;
                var10001 = this.g;
                if (var1 < this.field_146294_l / 2) {
                    var10002 = 1;
                    break label78;
                }
            } catch (NullPointerException var12) {
                throw a(var12);
            }

            var10002 = -1;
        }

        label71: {
            try {
                var10000.g = var10001 + var10002 * this.field_146297_k.func_193989_ak();
                var10000 = this;
                var10001 = this.e;
                if (var1 > this.field_146294_l / 2) {
                    var10002 = 1;
                    break label71;
                }
            } catch (NullPointerException var11) {
                throw a(var11);
            }

            var10002 = -1;
        }

        label64: {
            try {
                var10000.e = var10001 + var10002 * this.field_146297_k.func_193989_ak();
                var10000 = this;
                var10001 = this.d;
                if (var2 < this.field_146295_m / 2 - 1) {
                    var10002 = 1;
                    break label64;
                }
            } catch (NullPointerException var10) {
                throw a(var10);
            }

            var10002 = -1;
        }

        label57: {
            try {
                var10000.d = var10001 + var10002 * this.field_146297_k.func_193989_ak();
                var10000 = this;
                var10001 = this.m;
                if (var2 > this.field_146295_m / 2) {
                    var10002 = 1;
                    break label57;
                }
            } catch (NullPointerException var9) {
                throw a(var9);
            }

            var10002 = -1;
        }

        try {
            var10000.m = var10001 + var10002 * this.field_146297_k.func_193989_ak();
            this.g = be.b(this.g, 0.0F, 1.0F);
            this.e = be.b(this.e, 0.0F, 1.0F);
            this.d = be.b(this.d, 0.0F, 1.0F);
            this.m = be.b(this.m, 0.0F, 1.0F);
            GlStateManager.func_179094_E();
            GlStateManager.func_179109_b(this.field_146294_l / 2.0F, this.field_146295_m / 2.0F, 0.0F);
            GlStateManager.func_179152_a(var4, var4, var4);
            this.field_146297_k.field_71446_o.func_110577_a(i);
            GlStateManager.func_179094_E();
            GlStateManager.func_179152_a(1.0F + this.g * 0.5F, 1.0F + this.g * 0.5F, 1.0F);
            this.func_175174_a(-62.0F + var5 - this.g * 15.0F, var5 - 32.0F, 0, 0, 64, 64);
            this.func_175174_a(-62.0F + var5 - this.g * 15.0F, var5 - 32.0F, 64, 128, 64, 64);
            GlStateManager.func_179121_F();
            if (!this.h) {
                GlStateManager.func_179121_F();
                GL11.glDisable(3042);
                return;
            }
        } catch (NullPointerException var6) {
            throw a(var6);
        }

        try {
            GlStateManager.func_179094_E();
            GlStateManager.func_179152_a(1.0F - this.e, 1.0F - this.e, 1.0F);
            this.func_175174_a(-2.0F - var5 + this.e * 32.0F, -var5 - 32.0F, 0, 0, 64, 64);
            this.func_175174_a(-2.0F - var5 + this.e * 32.0F, -var5 - 32.0F, 0, 128, 64, 64);
            GlStateManager.func_179121_F();
            if (this.e > 0.0F) {
                GlStateManager.func_179094_E();
                GlStateManager.func_179152_a(-1.0F + this.e + 1.0F + this.d * 0.5F, -1.0F + this.e + 1.0F + this.d * 0.5F, 1.0F);
                this.func_175174_a(-2.0F - var5 + this.d * 5.0F, -var5 - 64.0F - this.d * 5.0F / 2.0F, 0, 0, 64, 64);
                this.func_175174_a(-2.0F - var5 + this.d * 5.0F, -var5 - 64.0F - this.d * 5.0F / 2.0F, 128, 128, 64, 64);
                GlStateManager.func_179121_F();
                GlStateManager.func_179094_E();
                GlStateManager.func_179152_a(-1.0F + this.e + 1.0F + this.m * 0.5F, -1.0F + this.e + 1.0F + this.m * 0.5F, 1.0F);
                this.func_175174_a(-2.0F - var5 + this.m * 5.0F, -var5 + this.m * 5.0F / 2.0F, 0, 0, 64, 64);
                this.func_175174_a(-2.0F - var5 + this.m * 5.0F, -var5 + this.m * 5.0F / 2.0F, 192, 128, 64, 64);
                GlStateManager.func_179121_F();
            }
        } catch (NullPointerException var8) {
            throw a(var8);
        }

        GlStateManager.func_179121_F();
        GL11.glDisable(3042);
    }

    double a(double var1) {
        double var3 = 1.70158;
        double var5 = var3 + 1.0;
        return 1.0 + var5 * Math.pow(var1 - 1.0, 3.0) + var3 * Math.pow(var1 - 1.0, 2.0);
    }

    public boolean func_73868_f() {
        return false;
    }

    private static Exception a(Exception var0) {
        return var0;
    }
}
