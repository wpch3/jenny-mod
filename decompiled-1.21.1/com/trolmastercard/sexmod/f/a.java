package com.trolmastercard.sexmod.f;

import java.util.List;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.util.GeckoLibUtil;

public class a extends LivingEntity implements GeoEntity {
    public static final EntityDataAccessor<String> a = SynchedEntityData.defineId(a.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> b = SynchedEntityData.defineId(a.class, EntityDataSerializers.STRING);
    private final AnimatableInstanceCache e = GeckoLibUtil.createInstanceCache(this);
    public boolean c = false;
    public com.trolmastercard.sexmod.h.a d = null;

    public a(EntityType<? extends a> var1, Level var2) {
        super(var1, var2);
    }

    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(a, "");
        var1.define(b, "");
    }

    public boolean isPushable() {
        return false;
    }

    public boolean isPickable() {
        return false;
    }

    public boolean hurt(DamageSource var1, float var2) {
        return !var1.is(DamageTypes.FELL_OUT_OF_WORLD) ? false : super.hurt(var1, var2);
    }

    public HumanoidArm getMainArm() {
        return HumanoidArm.LEFT;
    }

    public Iterable<ItemStack> getArmorSlots() {
        return List.of();
    }

    public ItemStack getItemBySlot(EquipmentSlot var1) {
        return ItemStack.EMPTY;
    }

    public void setItemSlot(EquipmentSlot var1, ItemStack var2) {
    }

    public boolean shouldRender(double var1, double var3, double var5) {
        double var7 = this.getX() - var1;
        double var9 = this.getY() - var3;
        double var11 = this.getZ() - var5;
        double var13 = var7 * var7 + var9 * var9 + var11 * var11;
        return var13 < 11000.0;
    }

    public void registerControllers(ControllerRegistrar var1) {
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.e;
    }
}
