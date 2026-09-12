package com.trolmastercard.sexmod.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

// Hand-written: source missing from decompilation; reconstructed from jar
// fingerprints (ctor wires Context + CrossModel).
public class CustomModelEntityRenderer extends GeoEntityRenderer<com.trolmastercard.sexmod.entity.CustomModelEntity> {
    public CustomModelEntityRenderer(Context var1) {
        super(var1, new com.trolmastercard.sexmod.client.model.CrossModel());
    }
}
