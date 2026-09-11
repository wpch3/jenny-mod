package com.trolmastercard.sexmod.b;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent.Post;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class g {
    private static final ResourceLocation a = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/gui/galath_flight_ui.png");
    private static final int[] b = new int[]{0, 77, 128, 41};
    private static final int[] c = new int[]{0, 0, 23, 36};
    private static final int[] d = new int[]{0, 36, 23, 36};
    private static final int[] e = new int[]{23, 2, 20, 31};
    private static final float[] f = new float[]{-14.25F, -15.5F, -16.875F};
    private static final float[] g = new float[]{37.5F, 43.0F, 45.0F};
    private static boolean h;
    private static int i = 3;
    private static long j;
    private static long k;
    private static long l;
    private static long m = 9223372036854775307L;

    public static boolean a() {
        return i > 0 && System.currentTimeMillis() - j > 3000L;
    }

    public static void b() {
        i--;
        j = System.currentTimeMillis();
    }

    public static void c() {
        if (!h) {
            h = true;
            l = System.currentTimeMillis();
            m = 9223372036854775307L;
        }
    }

    public static void d() {
        m = System.currentTimeMillis();
    }

    public static void e() {
        h = false;
        m = 9223372036854775307L;
        l = 0L;
    }

    private static void f() {
        if (i != 3) {
            long var0 = System.currentTimeMillis();
            if (var0 - Math.max(j, k) >= 5000L) {
                i++;
                k = var0;
            }
        }
    }

    @SubscribeEvent
    public static void onClientTick(Post var0) {
        Minecraft var1 = Minecraft.getInstance();
        boolean var2 = var1.player != null && var1.player.getVehicle() instanceof com.trolmastercard.sexmod.f.b.e;
        if (var2) {
            c();
        } else if (h && m == 9223372036854775307L) {
            d();
        }
    }

    @SubscribeEvent
    public static void onRenderGui(net.neoforged.neoforge.client.event.RenderGuiEvent.Post var0) {
        f();
        if (h) {
            GuiGraphics var1 = var0.getGuiGraphics();
            int var2 = var1.guiWidth();
            int var3 = var1.guiHeight();
            int var4 = var2 / 2;
            long var5 = System.currentTimeMillis();
            if (var5 - m > 500L) {
                e();
            } else {
                float var7 = var5 < l + 500L ? (float)(var5 - l) / 500.0F : (var5 < m + 500L ? 1.0F + (float)(m - var5) / 500.0F : 1.0F);
                var7 = com.trolmastercard.sexmod.m.j.a(var7, 0.0F, 1.0F);
                a(var1, b, var4 - b[2] / 2, var3 - 70, var7);
                a(var1, e, (int)(var4 - 1.5F * c[2] + 1.0F), var3 - 70 + 3, var7);
                a(var1, e, var4 - c[2] / 2 + 1, var3 - 70 + 3, var7);
                a(var1, e, var4 + c[2] / 2 + 1, var3 - 70 + 3, var7);
                float var8 = (float)com.trolmastercard.sexmod.m.i.b(Math.min(1.0F, (float)(var5 - j) / 150.0F));
                float var9 = var8 == 1.0F ? com.trolmastercard.sexmod.m.j.a(1.0F - (float)(var5 - k) / 500.0F, 0.0F, 1.0F) : 0.0F;
                a(var1, 1, -1.5F * c[2], var9, var8, var4, var3, var7);
                a(var1, 2, -c[2] / 2.0F, var9, var8, var4, var3, var7);
                a(var1, 3, c[2] / 2.0F, var9, var8, var4, var3, var7);
            }
        }
    }

    private static void a(GuiGraphics var0, int var1, float var2, float var3, float var4, int var5, int var6, float var7) {
        float var8 = i >= var1 ? 0.0F : (i < var1 - 1 ? 1.0F : var4);
        float var9 = i == var1 ? var3 : 0.0F;
        float var10 = 1.0F + var8 * 0.075F + var9 * -0.15F;
        PoseStack var11 = var0.pose();
        var11.pushPose();
        var11.scale(var10, var10, 1.0F);
        var11.translate(var8 * f[var1 - 1] + var9 * g[var1 - 1], var8 * -11.25F + var9 * 37.5F, 0.0F);
        a(var0, c, (int)(var5 + var2), var6 - 70, var7 - var8 - var9);
        a(var0, d, (int)(var5 + var2), var6 - 70, (float)Math.sin(Math.PI * var8) * 0.5F);
        var11.popPose();
    }

    private static void a(GuiGraphics var0, int[] var1, int var2, int var3, float var4) {
        int var5 = (int)(com.trolmastercard.sexmod.m.j.a(var4, 0.0F, 1.0F) * 255.0F);
        if (var5 > 0) {
            var0.setColor(1.0F, 1.0F, 1.0F, var5 / 255.0F);
            var0.blit(a, var2, var3, var1[0], var1[1], var1[2], var1[3], 256, 256);
            var0.setColor(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    private g() {
    }
}
