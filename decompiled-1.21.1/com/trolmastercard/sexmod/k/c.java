package com.trolmastercard.sexmod.k;

import com.trolmastercard.sexmod.b.b.l;
import com.trolmastercard.sexmod.f.j;
import com.trolmastercard.sexmod.f.b.k;
import java.util.UUID;
import java.util.function.Consumer;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerChangedDimensionEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

@EventBusSubscriber(modid = "sexmod")
public class c extends Item implements GeoItem {
    private final AnimatableInstanceCache b = GeckoLibUtil.createInstanceCache(this);
    public static c a;

    public c(Properties var1) {
        super(var1);
        a = this;
    }

    public InteractionResultHolder<ItemStack> use(Level var1, Player var2, InteractionHand var3) {
        CompoundTag var4 = var2.getPersistentData();
        if ((var4.contains("sexmod:galath_coin_deactivation_time") ? var4.getLong("sexmod:galath_coin_deactivation_time") : 0L) != 0L) {
            return InteractionResultHolder.fail(var2.getItemInHand(var3));
        } else if ((var4.contains("sexmod:galath_coin_activation_time") ? var4.getLong("sexmod:galath_coin_activation_time") : 0L) != 0L) {
            return InteractionResultHolder.fail(var2.getItemInHand(var3));
        } else if (!this.a(var1, var2)) {
            com.trolmastercard.sexmod.i.e.b(var2, "misc.beew.beew0");
            return InteractionResultHolder.success(var2.getItemInHand(var3));
        } else {
            com.trolmastercard.sexmod.i.e.b(var2, "misc.weoweo.weoweo1");
            var4.putLong("sexmod:galath_coin_activation_time", System.currentTimeMillis());
            return InteractionResultHolder.success(var2.getItemInHand(var3));
        }
    }

    boolean a(Level var1, Player var2) {
        return var1.isClientSide() ? !com.trolmastercard.sexmod.n.a.a : !com.trolmastercard.sexmod.n.a.b(var2.getUUID());
    }

    @SubscribeEvent
    public static void onEntityInteract(EntityInteract var0) {
        Player var1 = var0.getEntity();
        ItemStack var2 = var1.getItemInHand(var0.getHand());
        if (var2.getItem() instanceof c) {
            if (var0.getTarget() instanceof com.trolmastercard.sexmod.f.b.e var4) {
                if (var1.getUUID().equals(var4.ax())) {
                    com.trolmastercard.sexmod.i.e.b(var1, "misc.weoweo.weoweo0");
                    var1.getPersistentData().putLong("sexmod:galath_coin_deactivation_time", System.currentTimeMillis());
                    var0.setCanceled(true);
                }
            }
        }
    }

    public void inventoryTick(ItemStack var1, Level var2, Entity var3, int var4, boolean var5) {
        super.inventoryTick(var1, var2, var3, var4, var5);
        if (var3 instanceof Player var6) {
            CompoundTag var7 = var6.getPersistentData();
            long var8 = var7.contains("sexmod:galath_coin_activation_time") ? var7.getLong("sexmod:galath_coin_activation_time") : 0L;
            long var10 = var7.contains("sexmod:galath_coin_deactivation_time") ? var7.getLong("sexmod:galath_coin_deactivation_time") : 0L;
            long var12 = System.currentTimeMillis();
            this.a(var6, var7, var12, var8);
            this.b(var6, var7, var12, var10);
            if (var10 != 0L && var12 > var10 + 4000L) {
                var7.putLong("sexmod:galath_coin_deactivation_time", 0L);
                var7.putBoolean("sexmod:galath_coin_de_summoning_animation_time", false);
            }
        }
    }

    void a(Player var1, CompoundTag var2, long var3, long var5) {
        if (var5 != 0L) {
            if (var3 - var5 > 4000L) {
                var2.putLong("sexmod:galath_coin_activation_time", 0L);
                Vec3 var7 = var1.position().add(0.0, var1.getEyeHeight(), 0.0);
                Vec3 var8 = var7.add(var1.getLookAngle().normalize().scale(2.0));
                if (var1.level() instanceof ServerLevel var9) {
                    RandomSource var19 = var1.getRandom();

                    for (int var11 = 0; var11 < 100; var11++) {
                        double var12 = (2.0F * var19.nextFloat() - 1.0F) * 0.2F;
                        double var14 = (2.0F * var19.nextFloat() - 1.0F) * 0.2F;
                        double var16 = (2.0F * var19.nextFloat() - 1.0F) * 0.2F;
                        var9.sendParticles(ParticleTypes.DRAGON_BREATH, var8.x, var8.y, var8.z, 0, var12, var14, var16, 1.0);
                    }
                }

                com.trolmastercard.sexmod.f.b.e var18 = com.trolmastercard.sexmod.f.b.e.a(var1.level(), var1, var8, false);
                if (var18 != null) {
                    var18.moveTo(var8.x, var8.y, var8.z, var18.getYRot(), var18.getXRot());
                    com.trolmastercard.sexmod.n.a.a(var1, var18);
                    var1.level().addFreshEntity(var18);
                    if (com.trolmastercard.sexmod.n.a.a(var1.getUUID())) {
                        var18.l();
                    }
                }
            }
        }
    }

    void b(Player var1, CompoundTag var2, long var3, long var5) {
        if (var5 != 0L) {
            long var7 = var3 - var5;
            boolean var9 = var2.contains("sexmod:galath_coin_de_summoning_animation_time")
                ? var2.getBoolean("sexmod:galath_coin_de_summoning_animation_time")
                : false;
            if (!var9 && var7 > 1000L) {
                var2.putBoolean("sexmod:galath_coin_de_summoning_animation_time", true);
                this.a(var1);
            }

            if (var3 - var5 > 3000L) {
                UUID var10 = com.trolmastercard.sexmod.n.a.a(var1);
                k var11 = k.t(var10);
                if (var11 instanceof com.trolmastercard.sexmod.f.b.e) {
                    com.trolmastercard.sexmod.n.a.b((com.trolmastercard.sexmod.f.b.e)var11);
                }
            }
        }
    }

    void a(Player var1) {
        if (!var1.level().isClientSide()) {
            this.b(var1);
        }
    }

    void b(Player var1) {
        UUID var2 = com.trolmastercard.sexmod.n.a.a(var1);
        if (k.t(var2) instanceof com.trolmastercard.sexmod.f.b.e var4) {
            a(var4);
            if (var4.level() instanceof ServerLevel var5) {
                Vec3 var15 = (var4.an() ? var4.am() : var4.position()).add(0.0, 1.5, 0.0);
                RandomSource var7 = var4.getRandom();

                for (int var8 = 0; var8 < 100; var8++) {
                    double var9 = (var7.nextFloat() * 2.0F - 1.0F) * 1.5;
                    double var11 = (var7.nextFloat() * 2.0F - 1.0F) * 1.5;
                    double var13 = (var7.nextFloat() * 2.0F - 1.0F) * 1.5;
                    var5.sendParticles(
                        ParticleTypes.DRAGON_BREATH, var15.x + var9, var15.y + var11, var15.z + var13, 0, var9 * -0.03, var11 * -0.03, var13 * -0.03, 1.0
                    );
                }
            }
        }
    }

    public static void a(com.trolmastercard.sexmod.f.b.e var0) {
        var0.c(j.ca);
        var0.k();
        var0.d(true);
        var0.d(var0.position());
        var0.a_(var0.getYRot());
    }

    @SubscribeEvent
    public static void onPlayerChangedDimension(PlayerChangedDimensionEvent var0) {
        Player var1 = var0.getEntity();
        if (!var1.level().isClientSide()) {
            UUID var2 = com.trolmastercard.sexmod.n.a.a(var1);
            k var3 = k.t(var2);
            if (var3 != null) {
                com.trolmastercard.sexmod.n.a.b((com.trolmastercard.sexmod.f.b.e)var3);
            }
        }
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.b;
    }

    public void registerControllers(ControllerRegistrar var1) {
    }

    public void createGeoRenderer(Consumer<GeoRenderProvider> var1) {
        var1.accept(new GeoRenderProvider() {
            private GeoItemRenderer<c> a;

            public GeoItemRenderer<?> a() {
                if (this.a == null) {
                    this.a = new l();
                }

                return this.a;
            }
        });
    }
}
