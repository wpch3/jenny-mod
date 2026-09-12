package com.trolmastercard.sexmod.client.model;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class KoboldStaffModel extends GeoModel<com.trolmastercard.sexmod.item.KoboldStaffItem> {
    @Override
    public ResourceLocation getModelResource(com.trolmastercard.sexmod.item.KoboldStaffItem var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "geo/kobold/staff.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(com.trolmastercard.sexmod.item.KoboldStaffItem var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/kobold/staff.png");
    }

    @Override
    public ResourceLocation getAnimationResource(com.trolmastercard.sexmod.item.KoboldStaffItem var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "animations/kobold/staff.animation.json");
    }
}
