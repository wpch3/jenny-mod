package com.trolmastercard.sexmod.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.UUID;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public abstract class GirlRenderer<T extends com.trolmastercard.sexmod.entity.GirlEntity> extends GeoEntityRenderer<T> {
    static final ResourceLocation c = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/boy.png");
    private int a = -1;
    private static final String[] b = new String[]{"cock", "ballL", "ballR"};
    private static final String[] d = new String[]{"Head2", "LeftArm", "RightArm", "RightLeg", "LeftLeg"};

    protected GirlRenderer(Context var1, GeoModel<T> var2) {
        super(var1, var2);
    }

    private static ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var0) {
        UUID var1 = var0.al();
        return var1 != null && var0.level().getPlayerByUUID(var1) instanceof AbstractClientPlayer var3 ? var3.getSkin().texture() : c;
    }

    private static boolean b(com.trolmastercard.sexmod.entity.GirlEntity var0) {
        return var0.al() != null && var0.ai() != null && var0.ai().cp;
    }

    @Override
    public void preRender(
        PoseStack var1, T var2, BakedGeoModel var3, MultiBufferSource var4, VertexConsumer var5, boolean var6, float var7, int var8, int var9, int var10
    ) {
        var3.getBone("items").ifPresent(var0 -> var0.setHidden(true));
        if (!var6) {
            var3.getBone("steve").ifPresent(var0 -> {
                var0.setHidden(true);
                var0.setChildrenHidden(true);
            });
        }

        super.preRender(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @Override
    public void actuallyRender(
        PoseStack var1,
        T var2,
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

    @Override
    public void renderRecursively(
        PoseStack var1,
        T var2,
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
        int var12 = this.a((T)var2, var3.getName());
        int var13 = var12 < 0 ? this.a : this.a & 0xFF000000 | var12 & 16777215;
        super.renderRecursively(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var13);
    }

    protected int a(T var1, String var2) {
        return -1;
    }

    @Override
    public void postRender(
        PoseStack var1, T var2, BakedGeoModel var3, MultiBufferSource var4, VertexConsumer var5, boolean var6, float var7, int var8, int var9, int var10
    ) {
        super.postRender(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
        if (!var6 && b(var2)) {
            var3.getBone("steve").ifPresent(var9x -> {
                var9x.setHidden(false);
                var9x.setChildrenHidden(false);
                a(var3, true);
                RenderType var10x = RenderType.entityCutoutNoCull(a(var2));
                this.renderRecursively(var1, (T)var2, var9x, var10x, var4, var4.getBuffer(var10x), true, var7, var8, var9, var10);
                b(var3, true);
                a(var3, false);
                RenderType var11 = RenderType.entityCutoutNoCull(c);
                this.renderRecursively(var1, (T)var2, var9x, var11, var4, var4.getBuffer(var11), true, var7, var8, var9, var10);
                b(var3, false);
            });
        }
    }

    private static void a(BakedGeoModel var0, boolean var1) {
        for (String var5 : b) {
            var0.getBone(var5).ifPresent(var1x -> {
                var1x.setHidden(var1);
                var1x.setChildrenHidden(var1);
            });
        }
    }

    private static void b(BakedGeoModel var0, boolean var1) {
        var0.getBone("Torso2").ifPresent(var1x -> {
            var1x.setHidden(var1);
            var1x.setChildrenHidden(false);
        });

        for (String var5 : d) {
            var0.getBone(var5).ifPresent(var1x -> {
                var1x.setHidden(var1);
                var1x.setChildrenHidden(var1);
            });
        }
    }
}
