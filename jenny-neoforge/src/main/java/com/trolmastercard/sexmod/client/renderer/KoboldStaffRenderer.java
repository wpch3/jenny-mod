package com.trolmastercard.sexmod.client.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

public class KoboldStaffRenderer extends GeoItemRenderer<com.trolmastercard.sexmod.item.KoboldStaffItem> {
    public KoboldStaffRenderer() {
        super(new com.trolmastercard.sexmod.client.model.KoboldStaffModel());
        this.withScale(0.35F);
    }
}
