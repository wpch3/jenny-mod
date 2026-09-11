package com.trolmastercard.sexmod.b;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderGuiEvent.Post;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class f {
    private static final ResourceLocation b = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/gui/buttons.png");
    private static final ResourceLocation c = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/gui/hornymeter.png");
    public static boolean a;
    private static boolean d;
    private static double e;
    private static double f;
    private static float g;
    private static float h;

    public static boolean a() {
        return d;
    }

    public static void b() {
        e = 0.0;
        f = 0.0;
        g = 0.0F;
        h = 0.0F;
        d = true;
    }

    public static void c() {
        d = false;
        e = 0.0;
        f = 0.0;
        g = 0.0F;
        h = 0.0F;
    }

    public static void d() {
        e = Math.min(1.0, e + 0.012);
    }

    public static boolean e() {
        return e >= 1.0;
    }

    @SubscribeEvent
    public static void onRenderGui(Post var0) {
        GuiGraphics var1 = var0.getGuiGraphics();
        DeltaTracker var2 = var0.getPartialTick();
        Minecraft var3 = Minecraft.getInstance();
        if (d && var3.player != null) {
            float var4 = var2.getGameTimeDeltaPartialTick(false);
            if (g < 1.0F) {
                g += var4 / 25.0F;
            } else {
                g = 1.0F;
            }

            boolean var5 = e >= 1.0;
            int var6 = var5 ? 54 : 0;
            PoseStack var7 = var1.pose();
            var7.pushPose();
            var7.scale(0.35F, 0.35F, 1.0F);
            var1.blit(b, 240, 160, 0.0F, 108 + var6, 256, 52, 256, 256);
            int var8 = (int)com.trolmastercard.sexmod.m.i.a(-200.0F, 98.0F, g);
            var1.blit(b, var8, 405, 0.0F, 0.0F, 158, 54, 256, 256);
            var7.popPose();
            var7.pushPose();
            var7.scale(0.75F, 0.75F, 1.0F);
            int var9 = (int)com.trolmastercard.sexmod.m.i.a(-200.0F, 10.0F, g);
            var1.blit(c, 10, var9, 0.0F, 0.0F, 146, 175, 256, 256);
            f = com.trolmastercard.sexmod.m.i.a(f, e, var4);
            int var10 = (int)com.trolmastercard.sexmod.m.i.a(0.0, 160.0, f);
            int var11 = (int)com.trolmastercard.sexmod.m.i.a(167.0, 8.0, f);
            double var12 = com.trolmastercard.sexmod.m.i.a(178.0, 18.0, f);
            if (!var5) {
                int var14 = (int)com.trolmastercard.sexmod.m.i.a(-45.0, var12, g);
                var1.blit(c, 67, var14, 159.0F, var11, 32, var10, 256, 256);
                double var15 = com.trolmastercard.sexmod.m.i.a(178.0, 149.0, 1.0 - f);
                int var17 = (int)com.trolmastercard.sexmod.m.i.a(169.0, 141.0, 1.0 - f);
                int var18 = (int)com.trolmastercard.sexmod.m.i.a(1.0, 29.0, 1.0 - f);
                int var19 = (int)com.trolmastercard.sexmod.m.i.a(-58.0, var15, g);
                var1.blit(c, 120, var19, 212.0F, var17, 28, var18, 256, 256);
                var1.blit(c, 18, var19, 212.0F, var17, 28, var18, 256, 256);
            } else {
                h += var4 / 15.0F;
                int var20 = (int)com.trolmastercard.sexmod.m.i.a(18.0F, -300.0F, h);
                var1.blit(c, 67, var20, 159.0F, 8.0F, 32, 160, 256, 256);
            }

            var7.popPose();
        }
    }

    private f() {
    }
}
