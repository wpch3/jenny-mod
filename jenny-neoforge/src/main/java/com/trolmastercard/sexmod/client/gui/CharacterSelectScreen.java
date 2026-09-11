package com.trolmastercard.sexmod.client.gui;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;

public class CharacterSelectScreen extends Screen {
    private final List<CharacterSelectScreen.a> a = new ArrayList<>();
    private int b = 0;
    private int c = -1;

    public CharacterSelectScreen() {
        super(Component.literal("Character Select"));
    }

    protected void init() {
        if (this.a.isEmpty()) {
            ClientLevel var1 = Minecraft.getInstance().level;
            if (var1 != null) {
                this.a("jenny", (LivingEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.b.get()).create(var1));
                this.a("ellie", (LivingEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.m.get()).create(var1));
                this.a("bia", (LivingEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.n.get()).create(var1));
                this.a("slime", (LivingEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.o.get()).create(var1));
                this.a("bee", (LivingEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.p.get()).create(var1));
                this.a("allie", (LivingEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.q.get()).create(var1));
                this.a("luna", (LivingEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.r.get()).create(var1));
                this.a("kobold", (LivingEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.u.get()).create(var1));
                this.a("goblin", (LivingEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.v.get()).create(var1));
                this.a("galath", (LivingEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.t.get()).create(var1));
            }

            LocalPlayer var2 = Minecraft.getInstance().player;
            if (var2 != null) {
                this.a.add(new CharacterSelectScreen.a(var2, ""));
            }
        }

        int var3 = this.width / 2;
        int var4 = this.height / 2;
        this.addRenderableWidget(Button.builder(Component.literal("<"), var1x -> this.a(-1)).bounds(var3 - 50, var4 - 10, 20, 20).build());
        this.addRenderableWidget(Button.builder(Component.literal(">"), var1x -> this.a(1)).bounds(var3 + 30, var4 - 10, 20, 20).build());
        this.addRenderableWidget(Button.builder(Component.literal("pick"), var1x -> this.a()).bounds(var3 - 30, var4 + 30, 60, 20).build());
    }

    private void a(String var1, LivingEntity var2) {
        if (var2 != null) {
            var2.setId(this.c--);
            this.a.add(new CharacterSelectScreen.a(var2, "become " + var1));
        }
    }

    private void a(int var1) {
        if (!this.a.isEmpty()) {
            int var2 = this.b + var1;
            if (var2 >= this.a.size()) {
                var2 = 0;
            } else if (var2 < 0) {
                var2 = this.a.size() - 1;
            }

            this.b = var2;
        }
    }

    private void a() {
        if (this.a.isEmpty()) {
            this.onClose();
        } else {
            String var1 = this.a.get(this.b).b();
            String var2 = "sexmod " + (var1.isEmpty() ? "revert" : var1);
            Minecraft var3 = Minecraft.getInstance();
            if (var3.player != null) {
                var3.player.connection.sendCommand(var2);
            }

            this.onClose();
        }
    }

    public void render(GuiGraphics var1, int var2, int var3, float var4) {
        super.render(var1, var2, var3, var4);
        if (!this.a.isEmpty()) {
            LivingEntity var5 = this.a.get(this.b).a();
            int var6 = this.width / 2;
            int var7 = this.height / 2 + 20;
            InventoryScreen.renderEntityInInventoryFollowsMouse(var1, var6 - 45, var7 - 90, var6 + 45, var7, 30, 0.0625F, var2, var3, var5);
        }
    }

    public boolean isPauseScreen() {
        return false;
    }

    private record a() {
        private final LivingEntity a;
        private final String b;

        private a(LivingEntity var1, String var2) {
            this.a = var1;
            this.b = var2;
        }
    }
}
