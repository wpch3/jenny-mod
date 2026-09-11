package com.trolmastercard.sexmod.client.model;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

// Hand-written: the decompiler output kept only the obfuscated narrow
// overrides (a/b/c). Jar fingerprints prove the fan source overrode the three
// GeoModel resource hooks (synthetic forwarders getModelResource -> a,
// getTextureResource -> b, getAnimationResource -> c), restored here.
public class CrossModel extends GeoModel<com.trolmastercard.sexmod.entity.CustomModelEntity> {
    @Override
    public ResourceLocation getModelResource(com.trolmastercard.sexmod.entity.CustomModelEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "geo/cross.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(com.trolmastercard.sexmod.entity.CustomModelEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/cross.png");
    }

    @Override
    public ResourceLocation getAnimationResource(com.trolmastercard.sexmod.entity.CustomModelEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "animations/cross.animation.json");
    }
}
