package com.trolmastercard.sexmod.client.gui;

import com.trolmastercard.sexmod.network.RequestCancelTaskPayload;
import com.trolmastercard.sexmod.network.RequestMinePayload;
import com.trolmastercard.sexmod.network.SetTribeFollowModePayload;
import com.trolmastercard.sexmod.network.SyncBlocksPayload;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.state.BlockState;

public class DragonStaffScreen extends Screen {
    private static boolean a = false;
    private final BlockPos b;
    private final Direction c;

    public DragonStaffScreen(BlockPos var1, Direction var2) {
        super(Component.literal("Dragon Staff"));
        this.b = var1;
        this.c = var2;
    }

    public static void a(BlockPos var0, Direction var1) {
        Minecraft var2 = Minecraft.getInstance();
        var2.execute(() -> var2.setScreen(new DragonStaffScreen(var0, var1)));
    }

    protected void init() {
        int var1 = this.width / 2;
        int var2 = this.height / 2 - 30;
        this.addRenderableWidget(Button.builder(Component.literal("Mark/Unmark"), var1x -> this.a()).bounds(var1 - 50, var2, 100, 20).build());
        this.addRenderableWidget(Button.builder(Component.literal("Toggle Follow Mode"), var1x -> this.b()).bounds(var1 - 50, var2 + 24, 100, 20).build());
        this.addRenderableWidget(Button.builder(Component.literal("Fell/Mine"), var1x -> this.c()).bounds(var1 - 50, var2 + 48, 100, 20).build());
    }

    private void a() {
        ClientLevel var1 = Minecraft.getInstance().level;
        if (var1 != null) {
            BlockState var2 = var1.getBlockState(this.b);
            if (!(var2.getBlock() instanceof BedBlock) && !(var2.getBlock() instanceof ChestBlock)) {
                boolean var3 = !com.trolmastercard.sexmod.client.BedChestHighlighter.a(this.b);
                com.trolmastercard.sexmod.client.BedChestHighlighter.a(this.b, var3);
                com.trolmastercard.sexmod.client.ClientUtils.a(new SyncBlocksPayload(this.b, var3));
                this.onClose();
            }
        }
    }

    private void b() {
        a = !a;
        com.trolmastercard.sexmod.client.ClientUtils.a(new SetTribeFollowModePayload(a));
        this.onClose();
    }

    private void c() {
        ClientLevel var1 = Minecraft.getInstance().level;
        if (var1 != null) {
            BlockState var2 = var1.getBlockState(this.b);
            if (var2.is(BlockTags.LOGS)) {
                boolean var3 = !com.trolmastercard.sexmod.client.BedChestHighlighter.a(this.b);
                com.trolmastercard.sexmod.client.BedChestHighlighter.a(this.b, var3);
                if (var3) {
                    com.trolmastercard.sexmod.client.ClientUtils.a(new com.trolmastercard.sexmod.network.FellTreePayload(this.b));
                } else {
                    com.trolmastercard.sexmod.client.ClientUtils.a(new RequestCancelTaskPayload(this.b));
                }
            }

            BlockPos var5 = this.d();
            if (var5 != null) {
                boolean var4 = !com.trolmastercard.sexmod.client.BedChestHighlighter.a(var5);
                com.trolmastercard.sexmod.client.BedChestHighlighter.a(var5, var4);
                if (var4) {
                    com.trolmastercard.sexmod.client.ClientUtils.a(new RequestMinePayload(var5, this.c));
                } else {
                    com.trolmastercard.sexmod.client.ClientUtils.a(new RequestCancelTaskPayload(var5));
                }
            }

            this.onClose();
        }
    }

    private BlockPos d() {
        ClientLevel var1 = Minecraft.getInstance().level;
        LocalPlayer var2 = Minecraft.getInstance().player;
        if (var1 != null && var2 != null) {
            BlockState var3 = var1.getBlockState(this.b);
            boolean var4 = var3.is(BlockTags.MINEABLE_WITH_PICKAXE) || var3.is(BlockTags.MINEABLE_WITH_SHOVEL);
            if (!var4) {
                return null;
            }

            if (var2.blockPosition().getY() > this.b.getY()) {
                return null;
            }

            BlockPos var5 = this.b;
            Direction var6 = this.c.getOpposite();

            while (var1.getBlockState(var5.below().relative(var6)).isAir()) {
                var5 = var5.below();
            }

            return this.b.getY() - var5.getY() > 3 ? null : var5;
        } else {
            return null;
        }
    }

    public boolean isPauseScreen() {
        return false;
    }
}
