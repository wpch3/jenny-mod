package com.trolmastercard.sexmod.b.b;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class i extends EntityRenderer<com.trolmastercard.sexmod.f.b> {
    static final ResourceLocation a = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/galath/energy_ball.png");
    static final RenderType b = RenderType.entityTranslucentEmissive(a);
    static final com.trolmastercard.sexmod.m.b c = new com.trolmastercard.sexmod.m.b(0, 255, 251, 255);
    static final com.trolmastercard.sexmod.m.b d = new com.trolmastercard.sexmod.m.b(255, 0, 236, 255);
    static final com.trolmastercard.sexmod.m.b e = new com.trolmastercard.sexmod.m.b(255, 255, 255, 0);

    public i(Context var1) {
        super(var1);
    }

    public void a(com.trolmastercard.sexmod.f.b var1, float var2, float var3, PoseStack var4, MultiBufferSource var5, int var6) {
        var4.pushPose();
        var4.mulPose(this.entityRenderDispatcher.camera.rotation());
        int var7 = 15728880;
        VertexConsumer var8 = var5.getBuffer(b);
        Pose var9 = var4.last();
        a(var8, var9, d, -0.1F, var7);
        a(var8, var9, e, 0.0F, var7);
        a(var8, var9, c, 0.1F, var7);
        var4.popPose();
        super.render(var1, var2, var3, var4, var5, var6);
    }

    private static void a(VertexConsumer var0, Pose var1, com.trolmastercard.sexmod.m.b var2, float var3, int var4) {
        a(var0, var1, -0.25F, 0.0F, var3, 0.0F, 0.0F, var2, var4);
        a(var0, var1, 0.25F, 0.0F, var3, 1.0F, 0.0F, var2, var4);
        a(var0, var1, 0.25F, 0.5F, var3, 1.0F, 1.0F, var2, var4);
        a(var0, var1, -0.25F, 0.5F, var3, 0.0F, 1.0F, var2, var4);
    }

    private static void a(
        VertexConsumer var0, Pose var1, float var2, float var3, float var4, float var5, float var6, com.trolmastercard.sexmod.m.b var7, int var8
    ) {
        var0.addVertex(var1, var2, var3, var4)
            .setColor(var7.a, var7.b, var7.c, var7.d)
            .setUv(var5, var6)
            .setOverlay(OverlayTexture.NO_OVERLAY)
            .setLight(var8)
            .setNormal(var1, 0.0F, 0.0F, 1.0F);
    }

    public ResourceLocation a(com.trolmastercard.sexmod.f.b var1) {
        return a;
    }
}
