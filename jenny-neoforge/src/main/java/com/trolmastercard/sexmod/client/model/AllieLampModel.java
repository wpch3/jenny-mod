package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.item.AllieLampItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

// Hand-written: source missing from decompilation; reconstructed from jar
// fingerprints (bridge methods map getModelResource->a, getTextureResource->b,
// getAnimationResource->c).
public class AllieLampModel extends GeoModel<AllieLampItem> {
    @Override
    public ResourceLocation getModelResource(AllieLampItem var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "geo/allie/lamp.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AllieLampItem var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/allie/lamp.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AllieLampItem var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "animations/allie/lamp.animation.json");
    }
}
