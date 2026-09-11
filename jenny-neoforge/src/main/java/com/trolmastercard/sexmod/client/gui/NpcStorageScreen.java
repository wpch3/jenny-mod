package com.trolmastercard.sexmod.client.gui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class NpcStorageScreen extends AbstractContainerScreen<com.trolmastercard.sexmod.menu.NpcStorageMenu> {
    private static final ResourceLocation a = ResourceLocation.withDefaultNamespace("textures/gui/container/generic_54.png");

    public NpcStorageScreen(com.trolmastercard.sexmod.menu.NpcStorageMenu var1, Inventory var2, Component var3) {
        super(var1, var2, var3);
    }

    protected void renderBg(GuiGraphics var1, float var2, int var3, int var4) {
        var1.blit(a, this.leftPos, this.topPos, 0.0F, 0.0F, this.imageWidth, this.imageHeight, 256, 256);
    }
}
