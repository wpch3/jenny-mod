package com.trolmastercard.sexmod.h;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class i extends Screen {
    private final UUID a;
    private EditBox b;

    public i(UUID var1) {
        super(Component.literal("Name Tribe"));
        this.a = var1;
    }

    public static void a(UUID var0) {
        Minecraft var1 = Minecraft.getInstance();
        var1.execute(() -> var1.setScreen(new i(var0)));
    }

    protected void init() {
        int var1 = this.width / 2;
        int var2 = this.height / 2;
        this.b = new EditBox(this.font, var1 - 50, var2 - 10, 100, 20, Component.literal("Name Tribe"));
        this.b.setMaxLength(15);
        this.b.setFocused(true);
        this.addRenderableWidget(this.b);
        this.addRenderableWidget(Button.builder(Component.literal("set"), var1x -> this.a()).bounds(var1 - 25, var2 + 20, 50, 20).build());
    }

    private void a() {
        String var1 = this.b.getValue().trim();
        if (!var1.isEmpty()) {
            UUID var2 = com.trolmastercard.sexmod.b.b.a();
            if (var2 != null) {
                com.trolmastercard.sexmod.b.b.a(new com.trolmastercard.sexmod.l.c(this.a.toString(), var2.toString(), var1));
                this.onClose();
            }
        }
    }

    public void render(GuiGraphics var1, int var2, int var3, float var4) {
        super.render(var1, var2, var3, var4);
        var1.drawCenteredString(this.font, "Name Tribe", this.width / 2, this.height / 2 - 25, 16777215);
    }

    public boolean isPauseScreen() {
        return false;
    }
}
