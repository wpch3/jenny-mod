package com.trolmastercard.sexmod.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

public class PlayerGoblinRenderer extends GirlRenderer<com.trolmastercard.sexmod.entity.player.PlayerGoblinEntity> {
    public PlayerGoblinRenderer(Context var1) {
        super(var1, new com.trolmastercard.sexmod.client.model.PlayerGoblinModel());
    }

    @Override
    protected void applyRotations(com.trolmastercard.sexmod.entity.player.PlayerGoblinEntity var1, PoseStack var2, float var3, float var4, float var5, float var6) {
        super.applyRotations(var1, var2, var3, com.trolmastercard.sexmod.client.renderer.NpcRenderUtils.a(var1, var4, var5), var5, var6);
    }
}
