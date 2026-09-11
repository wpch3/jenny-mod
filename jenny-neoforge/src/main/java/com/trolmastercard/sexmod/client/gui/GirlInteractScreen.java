package com.trolmastercard.sexmod.client.gui;

import com.trolmastercard.sexmod.entity.GirlEntity;
import com.trolmastercard.sexmod.entity.HumanoidGirlEntity;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.network.PacketDistributor;

public class GirlInteractScreen extends Screen {
    private static final ResourceLocation a = ResourceLocation.fromNamespaceAndPath("sexmod", "textures/gui/girlinventory.png");
    private static final String[] b = new String[]{
        "action.names.followme", "action.names.stopfollowme", "action.names.gohome", "action.names.setnewhome", "action.names.equipment"
    };
    private static final Set<String> c = Set.of(
        "action.names.blowjob",
        "action.names.boobjob",
        "action.names.doggy",
        "doggy",
        "action.names.anal",
        "action.names.cowgirl",
        "action.names.missionary",
        "Face fuck",
        "action.names.touchboobs",
        "action.names.sex",
        "action.names.deepthroat",
        "Reverse cowgirl",
        "action.names.strip",
        "action.names.dressup"
    );
    private static final EntityDataAccessor<ItemStack>[] d = a();
    private final GirlEntity e;
    private final Player f;
    private final String[] g;
    @Nullable
    private final ItemStack[] h;
    private final boolean i;

    public GirlInteractScreen(GirlEntity var1, Player var2) {
        this(var1, var2, new String[0], new ItemStack[0], true);
    }

    public GirlInteractScreen(GirlEntity var1, Player var2, String[] var3, @Nullable ItemStack[] var4, boolean var5) {
        super(Component.empty());
        this.e = var1;
        this.f = var2;
        this.g = var3;
        this.h = var4;
        this.i = var5;
    }

    protected void init() {
        int var1 = this.width - 120;
        int var2 = this.height - 70 - Math.max(0, this.g.length - 1) * 24;

        for (int var3 = 0; var3 < this.g.length; var3++) {
            String var4 = this.g[var3];
            this.addRenderableWidget(Button.builder(Component.translatable(var4), var2x -> this.a(var4)).bounds(var1, var2 + var3 * 24, 100, 20).build());
        }

        if (this.i) {
            byte var6 = 70;

            for (int var7 = 0; var7 < b.length; var7++) {
                String var5 = b[var7];
                this.addRenderableWidget(Button.builder(Component.translatable(var5), var2x -> this.b(var5)).bounds(8, var6 + var7 * 24, 110, 20).build());
            }
        }
    }

    private void a(String var1) {
        if (c.contains(var1)) {
            PacketDistributor.sendToServer(new com.trolmastercard.sexmod.network.MenuActionPayload(this.e.getId(), var1), new CustomPacketPayload[0]);
        } else {
            this.e.a(var1, this.f.getUUID());
        }

        this.onClose();
    }

    private void b(String var1) {
        this.e.a(var1, this.f.getUUID());
        this.onClose();
    }

    public void render(GuiGraphics var1, int var2, int var3, float var4) {
        if (this.i) {
            this.a(var1);
        }

        super.render(var1, var2, var3, var4);
        if (this.h != null) {
            int var5 = this.width - 120;
            int var6 = this.height - 70 - Math.max(0, this.g.length - 1) * 24;

            for (int var7 = 0; var7 < this.g.length && var7 < this.h.length; var7++) {
                ItemStack var8 = this.h[var7];
                if (var8 != null && !var8.isEmpty()) {
                    int var9 = var6 + var7 * 24 + 2;
                    var1.renderItem(var8, var5 - 20, var9);
                    var1.renderItemDecorations(this.font, var8, var5 - 20, var9);
                }
            }
        }
    }

    private void a(GuiGraphics var1) {
        var1.blit(a, 2, 60, 0.0F, 0.0F, 32, 130, 256, 256);
        int[] var2 = new int[]{68, 87, 106, 124, 143, 162};
        SynchedEntityData var3 = this.e.getEntityData();

        for (int var4 = 0; var4 < CharacterSelectScreen.length; var4++) {
            ItemStack var5 = (ItemStack)var3.get(d[var4]);
            if (!var5.isEmpty()) {
                var1.renderItem(var5, 8, var2[var4]);
                var1.renderItemDecorations(this.font, var5, 8, var2[var4]);
            }
        }
    }

    public boolean isPauseScreen() {
        return false;
    }

    public void onClose() {
        super.onClose();
        this.e.h_();
    }

    private static EntityDataAccessor<ItemStack>[] a() {
        return new EntityDataAccessor[]{HumanoidGirlEntity.H, HumanoidGirlEntity.I, HumanoidGirlEntity.J, HumanoidGirlEntity.K, HumanoidGirlEntity.L, HumanoidGirlEntity.M};
    }
}
