package com.trolmastercard.sexmod.b.b;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.SlimeModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.layers.SlimeOuterLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class j extends MobRenderer<com.trolmastercard.sexmod.f.c, SlimeModel<com.trolmastercard.sexmod.f.c>> {
    static final ResourceLocation a = ResourceLocation.withDefaultNamespace("textures/entity/slime/slime.png");

    public j(Context var1) {
        super(var1, new SlimeModel(var1.bakeLayer(ModelLayers.SLIME)), 0.25F);
        this.addLayer(new SlimeOuterLayer(this, var1.getModelSet()));
    }

    public void a(com.trolmastercard.sexmod.f.c var1, float var2, float var3, PoseStack var4, MultiBufferSource var5, int var6) {
        this.shadowRadius = 0.25F * var1.b();
        super.render(var1, var2, var3, var4, var5, var6);
    }

    protected void a(com.trolmastercard.sexmod.f.c var1, PoseStack var2, float var3) {
        var2.scale(0.999F, 0.999F, 0.999F);
        var2.translate(0.0F, 0.001F, 0.0F);
        float var4 = var1.b();
        float var5 = Mth.lerp(var3, var1.d, var1.c) / (var4 * 0.5F + 1.0F);
        float var6 = 1.0F / (var5 + 1.0F);
        var2.scale(var6 * var4, 1.0F / var6 * var4, var6 * var4);
    }

    public ResourceLocation a(com.trolmastercard.sexmod.f.c var1) {
        return a;
    }
}
