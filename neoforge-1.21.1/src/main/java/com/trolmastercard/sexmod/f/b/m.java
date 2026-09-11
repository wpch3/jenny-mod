package com.trolmastercard.sexmod.f.b;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.world.Container;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.items.ItemStackHandler;

public abstract class m extends k implements Container {
    public static final EntityDataAccessor<Boolean> d = SynchedEntityData.defineId(m.class, EntityDataSerializers.BOOLEAN);
    public ItemStackHandler e = new ItemStackHandler(27);

    protected m(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(d, false);
    }

    public int getContainerSize() {
        return 27;
    }

    public boolean isEmpty() {
        return false;
    }

    public ItemStack getItem(int var1) {
        return var1 >= this.e.getSlots() ? ItemStack.EMPTY : this.e.getStackInSlot(var1);
    }

    public ItemStack removeItem(int var1, int var2) {
        ItemStack var3 = this.e.getStackInSlot(var1);
        if (!var3.isEmpty() && var2 > 0) {
            int var4 = Math.min(var2, var3.getCount());
            ItemStack var5 = var3.copyWithCount(var4);
            this.e.setStackInSlot(var1, var3.copyWithCount(var3.getCount() - var4));
            return var5;
        } else {
            return ItemStack.EMPTY;
        }
    }

    public ItemStack removeItemNoUpdate(int var1) {
        ItemStack var2 = this.e.getStackInSlot(var1);
        this.e.setStackInSlot(var1, ItemStack.EMPTY);
        return var2;
    }

    public void setItem(int var1, ItemStack var2) {
        this.e.setStackInSlot(var1, var2);
    }

    public int getMaxStackSize() {
        return 64;
    }

    public void setChanged() {
    }

    public boolean stillValid(Player var1) {
        return true;
    }

    public void clearContent() {
    }
}
