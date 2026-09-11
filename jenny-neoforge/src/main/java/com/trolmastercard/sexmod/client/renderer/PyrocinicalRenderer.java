package com.trolmastercard.sexmod.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.registries.DeferredHolder;

public class PyrocinicalRenderer extends EntityRenderer<com.trolmastercard.sexmod.entity.PyrocinicalEntity> {
    static final ResourceLocation a = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/pyrocinical/standing.png");
    static final ResourceLocation b = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/pyrocinical/praising.png");
    static final ResourceLocation c = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/pyrocinical/walking1.png");
    static final ResourceLocation d = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/pyrocinical/walking2.png");
    static final RenderType e = RenderType.entityTranslucent(a);
    static final RenderType f = RenderType.entityTranslucent(b);
    static final RenderType g = RenderType.entityTranslucent(c);
    static final RenderType h = RenderType.entityTranslucent(d);
    static final RenderType[] i = new RenderType[30];
    private RenderType j = null;
    private long k = 0L;

    public PyrocinicalRenderer(Context var1) {
        super(var1);
    }

    @Override
    public void render(com.trolmastercard.sexmod.entity.PyrocinicalEntity var1, float var2, float var3, PoseStack var4, MultiBufferSource var5, int var6) {
        int var7 = 15728880;
        LocalPlayer var13 = Minecraft.getInstance().player;
        RenderType var8;
        float var9;
        float var10;
        double var11;
        if (var13 == null) {
            var8 = e;
            var9 = 1.0F;
            var10 = 1.4F;
            var11 = 0.0;
        } else {
            Vec3 var14 = com.trolmastercard.sexmod.util.LerpUtils.a(new Vec3(var1.xOld, var1.yOld, var1.zOld), var1.position(), var3);
            Vec3 var15 = com.trolmastercard.sexmod.util.LerpUtils.a(new Vec3(var13.xOld, var13.yOld, var13.zOld), var13.position(), var3);
            Vec3 var16 = var14.subtract(var15);
            double var17 = Math.abs(var16.x) + Math.abs(var16.y) + Math.abs(var16.z);
            var8 = this.a(var1, var17, var13);
            var9 = b(var1, var13, var3);
            var10 = 1.4F + a(var1, var13, var3);
            var11 = var8 != g && var8 != h ? 0.0 : Math.sin(var13.tickCount * 0.75F) * 0.1F;
            if (var8 == f && this.j != f) {
                long var19 = System.currentTimeMillis();
                if (var19 > this.k + 60000L) {
                    DeferredHolder var21 = com.trolmastercard.sexmod.registry.ModSounds.a("misc.pyro.pyro0");
                    if (var21 != null) {
                        var13.playSound((SoundEvent)var21.value(), 1.0F, 1.0F);
                    }

                    this.k = var19;
                }
            }

            this.j = var8;
        }

        var4.pushPose();
        var4.translate(0.0, var11, 0.0);
        var4.mulPose(Axis.YP.rotationDegrees(180.0F - Minecraft.getInstance().gameRenderer.getMainCamera().getYRot()));
        var4.scale(var10, var10, var10);
        int var22 = (int)(var9 * 255.0F);
        VertexConsumer var23 = var5.getBuffer(var8);
        Pose var24 = var4.last();
        a(var23, var24, -1.0F, 0.0F, 0.0F, 1.0F, var22, var7);
        a(var23, var24, 1.0F, 0.0F, 1.0F, 1.0F, var22, var7);
        a(var23, var24, 1.0F, 2.0F, 1.0F, 0.0F, var22, var7);
        a(var23, var24, -1.0F, 2.0F, 0.0F, 0.0F, var22, var7);
        var4.popPose();
        super.render(var1, var2, var3, var4, var5, var6);
    }

    private static void a(VertexConsumer var0, Pose var1, float var2, float var3, float var4, float var5, int var6, int var7) {
        var0.addVertex(var1, var2, var3, 0.0F)
            .setColor(255, 255, 255, var6)
            .setUv(var4, var5)
            .setOverlay(OverlayTexture.NO_OVERLAY)
            .setLight(var7)
            .setNormal(var1, 0.0F, 1.0F, 0.0F);
    }

    RenderType a(com.trolmastercard.sexmod.entity.PyrocinicalEntity var1, double var2, LocalPlayer var4) {
        if (var1.d != -1) {
            return i[a(var1, var4) - 1];
        } else if (var2 < 3.0) {
            return f;
        } else {
            Vec3 var5 = new Vec3(var1.xOld, var1.yOld, var1.zOld).subtract(var1.position());
            if (Math.abs(var5.x) + Math.abs(var5.y) + Math.abs(var5.z) == 0.0) {
                return e;
            } else {
                return Math.sin(var4.tickCount * 0.75F) > 0.0 ? g : h;
            }
        }
    }

    static int a(com.trolmastercard.sexmod.entity.PyrocinicalEntity var0, LocalPlayer var1) {
        return var0.d == -1 ? 0 : (int)com.trolmastercard.sexmod.util.MiscUtils.a(var1.tickCount - var0.d, 1.0F, 30.0F);
    }

    static float a(com.trolmastercard.sexmod.entity.PyrocinicalEntity var0, LocalPlayer var1, float var2) {
        if (var0.d == -1) {
            return 0.0F;
        }

        int var3 = a(var0, var1);
        return var3 == 30 ? 1.0F : (var3 + var2) / 30.0F;
    }

    static float b(com.trolmastercard.sexmod.entity.PyrocinicalEntity var0, LocalPlayer var1, float var2) {
        if (var0.d == -1) {
            return 1.0F;
        }

        if (var1.tickCount - var0.d > 120) {
            return 0.0F;
        }

        byte var3 = 90;
        float var4 = com.trolmastercard.sexmod.util.MiscUtils.a(var1.tickCount - var0.d, var3, 120.0F) - var3;
        float var5 = (var4 + var2) / 30.0F;
        return 1.0F - var5;
    }

    @Override
    public ResourceLocation getTextureLocation(com.trolmastercard.sexmod.entity.PyrocinicalEntity var1) {
        return a;
    }

    static {
        for (int var0 = 1; var0 <= 30; var0++) {
            i[var0 - 1] = RenderType.entityTranslucent(
                ResourceLocation.fromNamespaceAndPath("sexmod", String.format("%s%s.png", "textures/entity/pyrocinical/fat/", var0))
            );
        }
    }
}
