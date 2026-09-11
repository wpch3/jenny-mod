package com.trolmastercard.sexmod.j;

import com.trolmastercard.sexmod.f.b.m;
import com.trolmastercard.sexmod.i.d;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class b extends AbstractContainerMenu {
    private final Container a;

    public b(int var1, Inventory var2, m var3) {
        this(var1, var2, (Container)var3);
    }

    public b(int var1, Inventory var2, int var3) {
        this(var1, var2, a(var2, var3));
    }

    private b(int var1, Inventory var2, Container var3) {
        super((MenuType)d.c.get(), var1);
        this.a = var3;

        for (int var4 = 0; var4 < 3; var4++) {
            for (int var5 = 0; var5 < 9; var5++) {
                this.addSlot(new Slot(var3, var5 + var4 * 9, 8 + var5 * 18, 18 + var4 * 18));
            }
        }

        byte var7 = 85;

        for (int var8 = 0; var8 < 3; var8++) {
            for (int var6 = 0; var6 < 9; var6++) {
                this.addSlot(new Slot(var2, var6 + var8 * 9 + 9, 8 + var6 * 18, var7 + var8 * 18));
            }
        }

        for (int var9 = 0; var9 < 9; var9++) {
            this.addSlot(new Slot(var2, var9, 8 + var9 * 18, var7 + 58));
        }
    }

    private static Container a(Inventory var0, int var1) {
        return (Container)(var0.player.level().getEntity(var1) instanceof m var3 ? var3 : new SimpleContainer(27));
    }

    public boolean stillValid(Player var1) {
        return this.a.stillValid(var1);
    }

    public ItemStack quickMoveStack(Player var1, int var2) {
        ItemStack var3 = ItemStack.EMPTY;
        Slot var4 = (Slot)this.slots.get(var2);
        if (var4 != null && var4.hasItem()) {
            ItemStack var5 = var4.getItem();
            var3 = var5.copy();
            if (var2 < 27) {
                if (!this.moveItemStackTo(var5, 27, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(var5, 0, 27, false)) {
                return ItemStack.EMPTY;
            }

            if (var5.isEmpty()) {
                var4.setByPlayer(ItemStack.EMPTY);
            } else {
                var4.setChanged();
            }
        }

        return var3;
    }
}
