package com.trolmastercard.sexmod.client.model;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class KoboldEggModel extends GeoModel<com.trolmastercard.sexmod.entity.KoboldEggEntity> {
    @Override
    public ResourceLocation getModelResource(com.trolmastercard.sexmod.entity.KoboldEggEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "geo/kobold/koboldegg.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(com.trolmastercard.sexmod.entity.KoboldEggEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/kobold/koboldegg.png");
    }

    @Override
    public ResourceLocation getAnimationResource(com.trolmastercard.sexmod.entity.KoboldEggEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "animations/kobold/egg.animation.json");
    }
}
