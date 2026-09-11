package com.trolmastercard.sexmod.h;

import com.trolmastercard.sexmod.f.b.m;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

public class b extends Screen {
    private final com.trolmastercard.sexmod.f.b.b a;
    private final Player b;

    private b(com.trolmastercard.sexmod.f.b.b var1, Player var2) {
        super(Component.empty());
        this.a = var1;
        this.b = var2;
    }

    public static void a(com.trolmastercard.sexmod.f.b.b var0, Player var1) {
        Minecraft var2 = Minecraft.getInstance();
        var2.execute(() -> var2.setScreen(new b(var0, var1)));
    }

    protected void init() {
        boolean var1 = this.a.aw();
        int var2 = this.width / 2;
        int var3 = this.height / 2 - 50;
        this.addRenderableWidget(
            Button.builder(Component.translatable(var1 ? "action.names.stopfollowme" : "action.names.followme"), var1x -> this.a())
                .bounds(var2 - 50, var3, 100, 20)
                .build()
        );
        this.addRenderableWidget(Button.builder(Component.translatable("action.names.gohome"), var1x -> this.b()).bounds(var2 - 50, var3 + 24, 100, 20).build());
        this.addRenderableWidget(
            Button.builder(Component.translatable("action.names.setnewhome"), var1x -> this.c()).bounds(var2 - 50, var3 + 48, 100, 20).build()
        );
        boolean var4 = (Boolean)this.a.getEntityData().get(m.d);
        Button var5 = Button.builder(Component.literal("Chest"), var1x -> this.d()).bounds(var2 - 50, var3 + 72, 100, 20).build();
        var5.active = var4;
        this.addRenderableWidget(var5);
    }

    private void a() {
        if (this.a.aw()) {
            this.a.a("action.names.stopfollowme", this.b);
            com.trolmastercard.sexmod.b.b.a(Component.translatable("bee.dialogue.sad"));
        } else {
            this.a.a("action.names.followme", this.b);
            com.trolmastercard.sexmod.b.b.a(Component.translatable("bee.dialogue.exited"));
        }

        this.onClose();
    }

    private void b() {
        this.a.a("action.names.gohome", this.b);
        com.trolmastercard.sexmod.b.b.a(Component.translatable("bee.dialogue.home"));
        this.onClose();
    }

    private void c() {
        this.a.a("action.names.setnewhome", this.b);
        this.onClose();
    }

    private void d() {
        if ((Boolean)this.a.getEntityData().get(m.d)) {
            com.trolmastercard.sexmod.b.b.a(new com.trolmastercard.sexmod.l.i(this.a.ah().toString()));
            this.onClose();
        }
    }

    public boolean isPauseScreen() {
        return false;
    }
}
