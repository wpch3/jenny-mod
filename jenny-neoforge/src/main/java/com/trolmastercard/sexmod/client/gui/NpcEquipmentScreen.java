package com.trolmastercard.sexmod.client.gui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class NpcEquipmentScreen extends AbstractContainerScreen<com.trolmastercard.sexmod.menu.NpcEquipmentMenu> {
    private static final ResourceLocation a = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/gui/girlinventory.png");

    public NpcEquipmentScreen(com.trolmastercard.sexmod.menu.NpcEquipmentMenu var1, Inventory var2, Component var3) {
        super(var1, var2, var3);
        this.imageWidth = 184;
        this.imageHeight = 116;
    }

    protected void renderBg(GuiGraphics var1, float var2, int var3, int var4) {
        var1.blit(a, this.leftPos, this.topPos, 32.0F, 14.0F, this.imageWidth, this.imageHeight, 256, 256);
    }

    @Override
    protected void renderLabels(GuiGraphics var1, int var2, int var3) {
    }
}
