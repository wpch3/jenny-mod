package com.trolmastercard.sexmod.client.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GalathCoinRenderer extends GeoItemRenderer<com.trolmastercard.sexmod.item.GalathCoinItem> {
    public GalathCoinRenderer() {
        super(new com.trolmastercard.sexmod.client.model.GalathCoinModel());
        this.withScale(0.1F);
    }
}
