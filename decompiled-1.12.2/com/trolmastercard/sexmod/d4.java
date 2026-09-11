package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class d4 extends Container {
    em b;
    public Slot[] d;
    public UUID a;
    public static List<d4> c = new ArrayList<>();

    public d4(em var1, InventoryPlayer var2, UUID var3) {
        this.a = var3;
        c.add(this);
        if (var1.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH)) {
            IItemHandler var4 = (IItemHandler)var1.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);
            this.b = var1;
            this.d = new Slot[]{
                new fe(fe.b.WEAPON, var4, fe.b.WEAPON.id, 31, 60),
                new fe(fe.b.BOW, var4, fe.b.BOW.id, 50, 60),
                new fe(fe.b.HELMET, var4, fe.b.HELMET.id, 72, 60),
                new fe(fe.b.CHEST_PLATE, var4, fe.b.CHEST_PLATE.id, 91, 60),
                new fe(fe.b.PANTS, var4, fe.b.PANTS.id, 110, 60),
                new fe(fe.b.SHOES, var4, fe.b.SHOES.id, 129, 60)
            };
            ArrayList var5 = new ArrayList();

            for (int var6 = 0; var6 < 3; var6++) {
                int var7 = 0;

                try {
                    while (var7 < 9) {
                        var5.add(new Slot(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
                        var7++;
                    }
                } catch (RuntimeException var11) {
                    throw a(var11);
                }
            }

            int var12 = 0;

            try {
                while (var12 < 9) {
                    var5.add(new Slot(var2, var12, 8 + var12 * 18, 142));
                    var12++;
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            for (Slot var9 : this.d) {
                this.func_75146_a(var9);
            }

            for (Slot var16 : var5) {
                this.func_75146_a(var16);
            }
        }
    }

    public ItemStack func_82846_b(EntityPlayer param1, int param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
        // 03: astore 3
        // 04: aload 0
        // 05: getfield com/trolmastercard/sexmod/d4.field_75151_b Ljava/util/List;
        // 08: iload 2
        // 09: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
        // 0e: checkcast net/minecraft/inventory/Slot
        // 11: astore 4
        // 13: aload 4
        // 15: ifnull ae
        // 18: aload 4
        // 1a: invokevirtual net/minecraft/inventory/Slot.func_75216_d ()Z
        // 1d: ifeq ae
        // 20: goto 27
        // 23: invokestatic com/trolmastercard/sexmod/d4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 26: athrow
        // 27: aload 4
        // 29: invokevirtual net/minecraft/inventory/Slot.func_75211_c ()Lnet/minecraft/item/ItemStack;
        // 2c: astore 5
        // 2e: aload 5
        // 30: invokevirtual net/minecraft/item/ItemStack.func_77946_l ()Lnet/minecraft/item/ItemStack;
        // 33: astore 3
        // 34: aload 0
        // 35: getfield com/trolmastercard/sexmod/d4.field_75151_b Ljava/util/List;
        // 38: invokeinterface java/util/List.size ()I 1
        // 3d: aload 1
        // 3e: getfield net/minecraft/entity/player/EntityPlayer.field_71071_by Lnet/minecraft/entity/player/InventoryPlayer;
        // 41: getfield net/minecraft/entity/player/InventoryPlayer.field_70462_a Lnet/minecraft/util/NonNullList;
        // 44: invokevirtual net/minecraft/util/NonNullList.size ()I
        // 47: isub
        // 48: istore 6
        // 4a: iload 2
        // 4b: iload 6
        // 4d: if_icmpge 74
        // 50: aload 0
        // 51: aload 5
        // 53: iload 6
        // 55: aload 0
        // 56: getfield com/trolmastercard/sexmod/d4.field_75151_b Ljava/util/List;
        // 59: invokeinterface java/util/List.size ()I 1
        // 5e: bipush 1
        // 5f: invokevirtual com/trolmastercard/sexmod/d4.func_75135_a (Lnet/minecraft/item/ItemStack;IIZ)Z
        // 62: ifne 89
        // 65: goto 6c
        // 68: invokestatic com/trolmastercard/sexmod/d4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 6b: athrow
        // 6c: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
        // 6f: areturn
        // 70: invokestatic com/trolmastercard/sexmod/d4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 73: athrow
        // 74: aload 0
        // 75: aload 5
        // 77: bipush 0
        // 78: iload 6
        // 7a: bipush 0
        // 7b: invokevirtual com/trolmastercard/sexmod/d4.func_75135_a (Lnet/minecraft/item/ItemStack;IIZ)Z
        // 7e: ifne 89
        // 81: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
        // 84: areturn
        // 85: invokestatic com/trolmastercard/sexmod/d4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 88: athrow
        // 89: aload 5
        // 8b: invokevirtual net/minecraft/item/ItemStack.func_190916_E ()I
        // 8e: ifne a0
        // 91: aload 4
        // 93: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
        // 96: invokevirtual net/minecraft/inventory/Slot.func_75215_d (Lnet/minecraft/item/ItemStack;)V
        // 99: goto a5
        // 9c: invokestatic com/trolmastercard/sexmod/d4.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 9f: athrow
        // a0: aload 4
        // a2: invokevirtual net/minecraft/inventory/Slot.func_75218_e ()V
        // a5: aload 4
        // a7: aload 1
        // a8: aload 5
        // aa: invokevirtual net/minecraft/inventory/Slot.func_190901_a (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;
        // ad: pop
        // ae: aload 3
        // af: areturn
        // try (8 -> 13): 14 java/lang/RuntimeException
        // try (31 -> 43): 44 java/lang/RuntimeException
        // try (34 -> 48): 48 java/lang/RuntimeException
        // try (50 -> 59): 59 java/lang/RuntimeException
        // try (61 -> 68): 68 java/lang/RuntimeException
    }

    public void func_75141_a(int var1, ItemStack var2) {
        super.func_75141_a(var1, var2);
    }

    public boolean func_75145_c(EntityPlayer var1) {
        return true;
    }

    public void func_75134_a(EntityPlayer var1) {
        super.func_75134_a(var1);
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
