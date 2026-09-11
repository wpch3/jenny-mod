package com.trolmastercard.sexmod.item;

import com.trolmastercard.sexmod.entity.ScenePose;
import com.trolmastercard.sexmod.entity.GirlEntity;
import com.trolmastercard.sexmod.util.RotationMath;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerLoggedOutEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.animation.Animation.LoopType;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

@EventBusSubscriber(modid = "sexmod")
public class AllieLampItem extends Item implements GeoItem {
    private final AnimatableInstanceCache c = GeckoLibUtil.createInstanceCache(this);
    static final Integer a = 95;
    static final Integer b = 50;

    public AllieLampItem(Properties var1) {
        super(var1);
    }

    public void inventoryTick(ItemStack var1, Level var2, Entity var3, int var4, boolean var5) {
        super.inventoryTick(var1, var2, var3, var4, var5);
        if (!var2.isClientSide()) {
            if (var3 instanceof Player var6) {
                CompoundTag var7 = var3.getPersistentData();
                if (var1.equals(var6.getMainHandItem()) || var1.equals(var6.getOffhandItem())) {
                    boolean var8 = var7.getBoolean("sexmodAllieInUse");
                    int var9 = var7.getInt("sexmodAllieInUseTicks");
                    if (var8) {
                        var7.putInt("sexmodAllieInUseTicks", var9 + 1);
                        if (var9 >= a) {
                            var7.putBoolean("sexmodAllieInUse", false);
                            var7.putInt("sexmodAllieInUseTicks", 0);
                            a(var1, a(var1) + 1);
                            com.trolmastercard.sexmod.entity.AllieEntity var10 = (com.trolmastercard.sexmod.entity.AllieEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.q.get())
                                .create(var2);
                            if (var10 != null) {
                                var10.getEntityData().set(com.trolmastercard.sexmod.entity.AllieEntity.i, var6.getMainHandItem());
                                var10.q(var6.getUUID());
                                Vec3 var11 = this.a(var6);
                                var10.moveTo(var11.x, var11.y, var11.z, var6.getYRot() + 180.0F, var6.getXRot());
                                var10.d(var10.position());
                                var10.a_(var6.getYRot() + 180.0F);
                                var10.d(true);
                                var10.setNoGravity(true);
                                var10.noPhysics = true;
                                var2.addFreshEntity(var10);
                                BlockPos var12 = var10.blockPosition().offset(0, -1, 0);
                                if (var10.level().getBlockState(var12).getBlock() == Blocks.SAND) {
                                    var10.c(ScenePose.an);
                                } else {
                                    var10.c(var10.b() ? ScenePose.ad : ScenePose.am);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    Vec3 a(Player var1) {
        return var1.position().add(RotationMath.a(new Vec3(0.0, 0.0, 2.0), var1.yHeadRot));
    }

    static int a(ItemStack var0) {
        CompoundTag var1 = ((CustomData)var0.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag();
        return var1.getInt("sexmodUses");
    }

    static void a(ItemStack var0, int var1) {
        CompoundTag var2 = ((CustomData)var0.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag();
        var2.putInt("sexmodUses", var1);
        var0.set(DataComponents.CUSTOM_DATA, CustomData.of(var2));
    }

    @SubscribeEvent
    public static void onRightClickItem(RightClickItem var0) {
        Player var1 = var0.getEntity();
        InteractionHand var2 = var0.getHand();
        ItemStack var3 = var1.getItemInHand(var2);
        if (!com.trolmastercard.sexmod.entity.player.PlayerGirlEntity.b(var1)) {
            if (!var1.level().isClientSide()) {
                for (GirlEntity var5 : GirlEntity.ap()) {
                    if (!var5.isRemoved() && var5 instanceof com.trolmastercard.sexmod.entity.AllieEntity var6) {
                        ItemStack var7 = (ItemStack)var6.getEntityData().get(com.trolmastercard.sexmod.entity.AllieEntity.i);
                        if (var3.equals(var7)) {
                            return;
                        }
                    }
                }

                if (var3.getItem() instanceof AllieLampItem) {
                    if (a(var3) < 3) {
                        CompoundTag var8 = var1.getPersistentData();
                        if (!var8.getBoolean("sexmodAllieInUse")) {
                            var8.putBoolean("sexmodAllieInUse", true);
                            var8.putInt("sexmodAllieInUseTicks", 0);
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerLoggedOut(PlayerLoggedOutEvent var0) {
        var0.getEntity().getPersistentData().putBoolean("sexmodAllieInUse", false);
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.c;
    }

    public void registerControllers(ControllerRegistrar var1) {
        var1.add(new AnimationController(this, "controller", 2, AllieLampItem::a));
    }

    private static PlayState a(AnimationState<AllieLampItem> var0) {
        CompoundTag var1 = Minecraft.getInstance().player.getPersistentData();
        if (!var1.getBoolean("sexmodAllieInUse")) {
            return PlayState.STOP;
        }

        var0.setAnimation(RawAnimation.begin().then("animation.lamp.rub", LoopType.HOLD_ON_LAST_FRAME));
        return PlayState.CONTINUE;
    }

    public void createGeoRenderer(Consumer<GeoRenderProvider> var1) {
        var1.accept(new GeoRenderProvider() {
            private GeoItemRenderer<AllieLampItem> a;

            @Override
            public GeoItemRenderer<?> getGeoItemRenderer() {
                if (this.a == null) {
                    this.a = new com.trolmastercard.sexmod.client.renderer.AllieLampRenderer();
                }

                return this.a;
            }
        });
    }
}
