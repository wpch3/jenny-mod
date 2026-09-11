package com.trolmastercard.sexmod.client.model;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GalathCoinModel extends GeoModel<com.trolmastercard.sexmod.item.GalathCoinItem> {
    @Override
    public ResourceLocation getModelResource(com.trolmastercard.sexmod.item.GalathCoinItem var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "geo/galath/galath_coin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(com.trolmastercard.sexmod.item.GalathCoinItem var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/item/galath_coin.png");
    }

    @Override
    public ResourceLocation getAnimationResource(com.trolmastercard.sexmod.item.GalathCoinItem var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "animations/galath/galath_coin.animation.json");
    }
}
