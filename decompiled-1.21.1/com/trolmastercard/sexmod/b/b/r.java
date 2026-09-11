package com.trolmastercard.sexmod.b.b;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.phys.Vec3;

public class r extends EntityRenderer<com.trolmastercard.sexmod.f.e> {
    private static final ResourceLocation a = ResourceLocation.withDefaultNamespace("textures/entity/fishing/fishing_hook.png");
    private static final RenderType b = RenderType.entityCutout(a);

    public r(Context var1) {
        super(var1);
    }

    public void a(com.trolmastercard.sexmod.f.e var1, float var2, float var3, PoseStack var4, MultiBufferSource var5, int var6) {
        com.trolmastercard.sexmod.f.b.i var8 = var1.c();
        Vec3 var7;
        if (var8 == null) {
            var7 = Vec3.ZERO;
        } else {
            Vec3 var9 = a(var8, var3);
            Vec3 var10 = var1.getPosition(var3).add(0.0, 0.25, 0.0);
            var7 = var9.subtract(var10);
        }

        var4.pushPose();
        var4.pushPose();
        var4.scale(0.5F, 0.5F, 0.5F);
        var4.mulPose(this.entityRenderDispatcher.camera.rotation());
        int var20 = var6;
        VertexConsumer var21 = var5.getBuffer(b);
        Pose var11 = var4.last();
        a(var21, var11, var20, 0.0F, 0, 0, 1);
        a(var21, var11, var20, 1.0F, 0, 1, 1);
        a(var21, var11, var20, 1.0F, 1, 1, 0);
        a(var21, var11, var20, 0.0F, 1, 0, 0);
        var4.popPose();
        float var12 = (float)var7.x;
        float var13 = (float)var7.y;
        float var14 = (float)var7.z;
        VertexConsumer var15 = var5.getBuffer(RenderType.lines());
        Pose var16 = var4.last();

        for (int var17 = 0; var17 < 16; var17++) {
            float var18 = a(var17, 16);
            float var19 = a(var17 + 1, 16);
            a(var12, var13, var14, var15, var16, var18, var19);
            a(var12, var13, var14, var15, var16, var19, var18);
        }

        var4.popPose();
        super.render(var1, var2, var3, var4, var5, var6);
    }

    public boolean a(com.trolmastercard.sexmod.f.e var1, Frustum var2, double var3, double var5, double var7) {
        return var1.shouldRender(var3, var5, var7);
    }

    private static Vec3 a(com.trolmastercard.sexmod.f.b.i var0, float var1) {
        int var2 = var0.getMainArm() == HumanoidArm.RIGHT ? 1 : -1;
        float var3 = Mth.lerp(var1, var0.yBodyRotO, var0.yBodyRot) * (float) (Math.PI / 180.0);
        double var4 = Mth.sin(var3);
        double var6 = Mth.cos(var3);
        float var8 = var0.getScale();
        double var9 = var2 * 0.35 * var8;
        double var11 = 0.8 * var8;
        float var13 = var0.isCrouching() ? -0.1875F : 0.0F;
        return var0.getEyePosition(var1).add(-var6 * var9 - var4 * var11, var13 - 0.45 * var8, -var4 * var9 + var6 * var11);
    }

    private static float a(int var0, int var1) {
        return (float)var0 / var1;
    }

    private static void a(VertexConsumer var0, Pose var1, int var2, float var3, int var4, int var5, int var6) {
        var0.addVertex(var1, var3 - 0.5F, var4 - 0.5F, 0.0F)
            .setColor(-1)
            .setUv(var5, var6)
            .setOverlay(OverlayTexture.NO_OVERLAY)
            .setLight(var2)
            .setNormal(var1, 0.0F, 1.0F, 0.0F);
    }

    private static void a(float var0, float var1, float var2, VertexConsumer var3, Pose var4, float var5, float var6) {
        float var7 = var0 * var5;
        float var8 = var1 * (var5 * var5 + var5) * 0.5F + 0.25F;
        float var9 = var2 * var5;
        float var10 = var0 * var6 - var7;
        float var11 = var1 * (var6 * var6 + var6) * 0.5F + 0.25F - var8;
        float var12 = var2 * var6 - var9;
        float var13 = Mth.sqrt(var10 * var10 + var11 * var11 + var12 * var12);
        var10 /= var13;
        var11 /= var13;
        var12 /= var13;
        var3.addVertex(var4, var7, var8, var9).setColor(-16777216).setNormal(var4, var10, var11, var12);
    }

    public ResourceLocation a(com.trolmastercard.sexmod.f.e var1) {
        return a;
    }
}
