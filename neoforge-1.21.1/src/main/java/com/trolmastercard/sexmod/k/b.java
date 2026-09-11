package com.trolmastercard.sexmod.k;

import java.util.function.Consumer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

@EventBusSubscriber(modid = "sexmod")
public class b extends Item implements GeoItem {
    private final AnimatableInstanceCache a = GeckoLibUtil.createInstanceCache(this);

    public b(Properties var1) {
        super(var1);
    }

    public InteractionResultHolder<ItemStack> use(Level var1, Player var2, InteractionHand var3) {
        return InteractionResultHolder.fail(var2.getItemInHand(var3));
    }

    @SubscribeEvent
    public static void onRightClickItem(RightClickItem var0) {
        Player var1 = var0.getEntity();
        if (var1.getMainHandItem().getItem() instanceof b || var1.getOffhandItem().getItem() instanceof b) {
            if (var1.level().isClientSide()) {
                com.trolmastercard.sexmod.b.b.g();
            }
        }
    }

    @SubscribeEvent
    public static void onRightClickBlock(RightClickBlock var0) {
        Player var1 = var0.getEntity();
        if (var1.getMainHandItem().getItem() instanceof b || var1.getOffhandItem().getItem() instanceof b) {
            Block var2 = var0.getLevel().getBlockState(var0.getPos()).getBlock();
            if (var2 instanceof BedBlock) {
                var0.setCancellationResult(InteractionResult.FAIL);
                var0.setCanceled(true);
            }

            if (var2 instanceof ChestBlock) {
                var0.setCancellationResult(InteractionResult.FAIL);
                var0.setCanceled(true);
            }
        }
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.a;
    }

    public void registerControllers(ControllerRegistrar var1) {
    }

    public void createGeoRenderer(Consumer<GeoRenderProvider> var1) {
        var1.accept(new GeoRenderProvider() {
            private GeoItemRenderer<b> a;

            public GeoItemRenderer<?> a() {
                if (this.a == null) {
                    this.a = new com.trolmastercard.sexmod.b.b.g();
                }

                return this.a;
            }
        });
    }
}
