package com.trolmastercard.sexmod.j;

import com.trolmastercard.sexmod.f.b.l;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class c implements Container {
    private final l a;

    public c(l var1) {
        this.a = var1;
    }

    public int getContainerSize() {
        return 7;
    }

    public boolean isEmpty() {
        for (int var1 = 0; var1 < 7; var1++) {
            if (!this.getItem(var1).isEmpty()) {
                return false;
            }
        }

        return true;
    }

    public ItemStack getItem(int var1) {
        return this.a.G.getStackInSlot(var1);
    }

    public ItemStack removeItem(int var1, int var2) {
        ItemStack var3 = this.getItem(var1);
        if (var3.isEmpty()) {
            return ItemStack.EMPTY;
        }

        ItemStack var4 = var3.split(var2);
        this.setItem(var1, var3);
        return var4;
    }

    public ItemStack removeItemNoUpdate(int var1) {
        ItemStack var2 = this.getItem(var1);
        this.setItem(var1, ItemStack.EMPTY);
        return var2;
    }

    public void setItem(int var1, ItemStack var2) {
        this.a.G.setStackInSlot(var1, var2);
    }

    public void setChanged() {
    }

    public boolean stillValid(Player var1) {
        return this.a.isAlive() && var1.distanceToSqr(this.a) < 64.0;
    }

    public void clearContent() {
        for (int var1 = 0; var1 < 7; var1++) {
            this.setItem(var1, ItemStack.EMPTY);
        }
    }
}
