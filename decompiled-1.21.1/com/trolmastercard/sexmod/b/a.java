package com.trolmastercard.sexmod.b;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.core.BlockPos;
import net.minecraft.util.FastColor.ARGB32;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.Shapes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import net.neoforged.neoforge.client.event.RenderLevelStageEvent.Stage;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class a {
    private static final Set<BlockPos> a = new HashSet<>();

    public static boolean a(BlockPos var0) {
        return a.contains(var0);
    }

    public static void a(BlockPos var0, boolean var1) {
        if (var1) {
            a.add(var0);
        } else {
            a.remove(var0);
        }
    }

    public static void a(Collection<BlockPos> var0) {
        a.addAll(var0);
    }

    @SubscribeEvent
    public static void onRenderLevelStage(RenderLevelStageEvent var0) {
        if (var0.getStage() == Stage.AFTER_TRANSLUCENT_BLOCKS) {
            if (!a.isEmpty()) {
                Minecraft var1 = Minecraft.getInstance();
                if (var1.player != null && var1.level != null) {
                    boolean var2 = var1.player.getMainHandItem().getItem() instanceof com.trolmastercard.sexmod.k.b
                        || var1.player.getOffhandItem().getItem() instanceof com.trolmastercard.sexmod.k.b;
                    if (var2) {
                        ClientLevel var3 = var1.level;
                        PoseStack var4 = var0.getPoseStack();
                        Vec3 var5 = var0.getCamera().getPosition();
                        BufferSource var6 = var1.renderBuffers().bufferSource();
                        VertexConsumer var7 = var6.getBuffer(RenderType.lines());

                        for (BlockPos var9 : a) {
                            int var10 = a(var3, var9);
                            LevelRenderer.renderVoxelShape(
                                var4,
                                var7,
                                Shapes.block(),
                                var9.getX() - var5.x,
                                var9.getY() - var5.y,
                                var9.getZ() - var5.z,
                                ARGB32.red(var10) / 255.0F,
                                ARGB32.green(var10) / 255.0F,
                                ARGB32.blue(var10) / 255.0F,
                                ARGB32.alpha(var10) / 255.0F,
                                false
                            );
                        }

                        var6.endBatch(RenderType.lines());
                    }
                }
            }
        }
    }

    private static int a(Level var0, BlockPos var1) {
        BlockState var2 = var0.getBlockState(var1);
        Block var3 = var2.getBlock();
        if (var3 instanceof BedBlock) {
            return ARGB32.color(255, 0, 0, 255);
        } else {
            return var3 instanceof ChestBlock ? ARGB32.color(255, 0, 255, 0) : ARGB32.color(255, 255, 0, 0);
        }
    }

    private a() {
    }
}
