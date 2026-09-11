package com.trolmastercard.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class fh extends GuiScreen {
    public static final int d = 1200;
    private static boolean b = false;
    private static double e = 0.0;
    static ResourceLocation c = new ResourceLocation("sexmod", "textures/gui/transitionscreen.png");
    static ResourceLocation f = new ResourceLocation("sexmod", "textures/gui/mirroredtransitionscreen.png");
    static ResourceLocation a = new ResourceLocation("sexmod", "textures/gui/blackscreen.png");

    public static boolean a() {
        return b;
    }

    public static void b() {
        b = true;
    }

    public static void a(Runnable var0) {
        b = true;
        be.a(1200, var0);
    }

    public boolean func_73868_f() {
        return false;
    }

    @SubscribeEvent
    public void a(RenderGameOverlayEvent var1) {
        try {
            if (!b) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (var1.getType() != ElementType.TEXT) {
                return;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        Minecraft var2 = Minecraft.func_71410_x();
        e = e + var2.func_193989_ak() * 0.75F;
        int var4 = var2.field_71474_y.field_74335_Z;
        float var3;
        if (var4 == 1) {
            var3 = (float)b6.b(-1800.0, 1000.0, 0.5 * Math.cos(e / 25.0) + 0.5);
        } else if (var4 == 2) {
            var3 = (float)b6.b(-900.0, 750.0, 0.5 * Math.cos(e / 25.0) + 0.5);
        } else {
            var3 = (float)b6.b(-900.0, 600.0, 0.5 * Math.cos(e / 25.0) + 0.5);
        }

        try {
            GlStateManager.func_179094_E();
            if (var4 == 1) {
                GlStateManager.func_179152_a(2.0F, 2.0F, 2.0F);
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        try {
            if (var4 == 2) {
                GlStateManager.func_179139_a(1.5, 1.5, 1.5);
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        try {
            var2.field_71446_o.func_110577_a(c);
            this.func_175174_a(var3, 0.0F, 0, (int)(e * 1.5), 256, 256);
            this.func_175174_a(var3, 256.0F, 0, (int)(e * 1.5), 256, 256);
            this.func_175174_a(var3, 512.0F, 0, (int)(e * 1.5), 256, 256);
            var2.field_71446_o.func_110577_a(f);
            this.func_175174_a(var3 + 600.0F, 0.0F, 0, (int)(e * 1.5), 256, 256);
            this.func_175174_a(var3 + 600.0F, 256.0F, 0, (int)(e * 1.5), 256, 256);
            this.func_175174_a(var3 + 600.0F, 512.0F, 0, (int)(e * 1.5), 256, 256);
            var2.field_71446_o.func_110577_a(a);
            this.func_175174_a(var3 + 200.0F, 0.0F, 0, 0, 400, 256);
            this.func_175174_a(var3 + 200.0F, 256.0F, 0, 0, 400, 256);
            this.func_175174_a(var3 + 200.0F, 512.0F, 0, 0, 400, 256);
            if (e > 30.0) {
                ds.c();
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        try {
            if (e > 69.0) {
                e = 0.0;
                b = false;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        GlStateManager.func_179121_F();
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
