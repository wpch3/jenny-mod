package com.trolmastercard.sexmod.h;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class e extends AbstractContainerScreen<com.trolmastercard.sexmod.j.a> {
    private static final ResourceLocation a = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/gui/girlinventory.png");

    public e(com.trolmastercard.sexmod.j.a var1, Inventory var2, Component var3) {
        super(var1, var2, var3);
    }

    protected void renderBg(GuiGraphics var1, float var2, int var3, int var4) {
        var1.blit(a, this.leftPos, this.topPos, 33.0F, 16.0F, this.imageWidth, this.imageHeight, 256, 256);
    }
}
