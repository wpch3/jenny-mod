package com.trolmastercard.sexmod.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.core.Vec3i;

public class PlayerKoboldRenderer extends GirlRenderer<com.trolmastercard.sexmod.entity.player.PlayerKoboldEntity> {
    public PlayerKoboldRenderer(Context var1) {
        super(var1, new com.trolmastercard.sexmod.client.model.PlayerKoboldModel());
    }

    @Override
    protected int a(com.trolmastercard.sexmod.entity.GirlEntity var1, String var2) {
        return this.a((com.trolmastercard.sexmod.entity.player.PlayerKoboldEntity)var1, var2);
    }

    protected int a(com.trolmastercard.sexmod.entity.player.PlayerKoboldEntity var1, String var2) {
        if (KoboldRenderer.a.contains(var2)) {
            return KoboldRenderer.a(a(var1).a());
        } else if (KoboldRenderer.b.contains(var2)) {
            return KoboldRenderer.a(a(var1).b());
        } else {
            return !"irisR".equals(var2) && !"irisL".equals(var2) ? -1 : KoboldRenderer.a((Vec3i)var1.getEntityData().get(com.trolmastercard.sexmod.entity.player.PlayerVariantGirlEntity.m));
        }
    }

    private static com.trolmastercard.sexmod.EyeAndKoboldColor a(com.trolmastercard.sexmod.entity.player.PlayerKoboldEntity var0) {
        return com.trolmastercard.sexmod.EyeAndKoboldColor.a((String)var0.getEntityData().get(com.trolmastercard.sexmod.entity.player.PlayerVariantGirlEntity.l));
    }
}
