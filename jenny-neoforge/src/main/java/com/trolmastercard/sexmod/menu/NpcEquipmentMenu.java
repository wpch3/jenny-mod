package com.trolmastercard.sexmod.menu;

import com.trolmastercard.sexmod.entity.HumanoidGirlEntity;
import com.trolmastercard.sexmod.registry.ModMenus;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class NpcEquipmentMenu extends AbstractContainerMenu {
    private static final int[] a = new int[]{31, 50, 72, 91, 110, 129};
    private final Container b;

    public NpcEquipmentMenu(int var1, Inventory var2, HumanoidGirlEntity var3) {
        this(var1, var2, new NpcContainer(var3));
    }

    public NpcEquipmentMenu(int var1, Inventory var2, int var3) {
        this(var1, var2, a(var2, var3));
    }

    private NpcEquipmentMenu(int var1, Inventory var2, Container var3) {
        super((MenuType)ModMenus.b.get(), var1);
        this.b = var3;

        for (int var4 = 0; var4 < 6; var4++) {
            this.addSlot(new Slot(var3, var4, a[var4], 18));
        }

        for (int var6 = 0; var6 < 3; var6++) {
            for (int var5 = 0; var5 < 9; var5++) {
                this.addSlot(new Slot(var2, var5 + var6 * 9 + 9, 8 + var5 * 18, 84 + var6 * 18));
            }
        }

        for (int var7 = 0; var7 < 9; var7++) {
            this.addSlot(new Slot(var2, var7, 8 + var7 * 18, 142));
        }
    }

    private static Container a(Inventory var0, int var1) {
        return (Container)(var0.player.level().getEntity(var1) instanceof HumanoidGirlEntity var3 ? new NpcContainer(var3) : new SimpleContainer(7));
    }

    public boolean stillValid(Player var1) {
        return this.b.stillValid(var1);
    }

    public ItemStack quickMoveStack(Player var1, int var2) {
        ItemStack var3 = ItemStack.EMPTY;
        Slot var4 = (Slot)this.slots.get(var2);
        if (var4 != null && var4.hasItem()) {
            ItemStack var5 = var4.getItem();
            var3 = var5.copy();
            byte var6 = 6;
            int var7 = this.slots.size();
            if (var2 < var6) {
                if (!this.moveItemStackTo(var5, var6, var7, true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(var5, 0, var6, false)) {
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
