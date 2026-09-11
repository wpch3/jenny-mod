package com.trolmastercard.sexmod.b.b;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.core.Vec3i;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class p extends GeoEntityRenderer<com.trolmastercard.sexmod.f.d> {
    private int a = -1;

    public p(Context var1) {
        super(var1, new com.trolmastercard.sexmod.b.a.p());
    }

    private int a(com.trolmastercard.sexmod.f.d var1, String var2) {
        if ("shell".equals(var2)) {
            return 14667419;
        } else if ("colorSpots".equals(var2)) {
            com.trolmastercard.sexmod.a var3 = com.trolmastercard.sexmod.a.a((String)var1.getEntityData().get(com.trolmastercard.sexmod.f.d.b));
            Vec3i var4 = var3.a();
            return var4.getX() << 16 | var4.getY() << 8 | var4.getZ();
        } else {
            return -1;
        }
    }

    public void a(
        PoseStack var1,
        com.trolmastercard.sexmod.f.d var2,
        BakedGeoModel var3,
        RenderType var4,
        MultiBufferSource var5,
        VertexConsumer var6,
        boolean var7,
        float var8,
        int var9,
        int var10,
        int var11
    ) {
        this.a = var11;
        super.actuallyRender(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
    }

    public void a(
        PoseStack var1,
        com.trolmastercard.sexmod.f.d var2,
        GeoBone var3,
        RenderType var4,
        MultiBufferSource var5,
        VertexConsumer var6,
        boolean var7,
        float var8,
        int var9,
        int var10,
        int var11
    ) {
        int var12 = this.a(var2, var3.getName());
        int var13 = var12 < 0 ? this.a : this.a & 0xFF000000 | var12 & 16777215;
        super.renderRecursively(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var13);
    }
}
