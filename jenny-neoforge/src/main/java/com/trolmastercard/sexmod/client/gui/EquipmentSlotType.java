package com.trolmastercard.sexmod.client.gui;

public enum EquipmentSlotType {
    a,
    b(0, "customHead"),
    c(60, "customShoeL"),
    d(80, "customShoeR"),
    e(100, "customHandL"),
    f(120, "customHandR"),
    g(140);

    public int h;
    public int i;
    public String j = null;
    public int k = 0;

    EquipmentSlotType() {
    }

    EquipmentSlotType(int var3) {
        this.k = var3;
    }

    EquipmentSlotType(int var3, String var4) {
        this.k = var3;
        this.j = var4;
        com.trolmastercard.sexmod.util.ModState.c++;
        this.h = com.trolmastercard.sexmod.util.ModState.c++;
        this.i = com.trolmastercard.sexmod.util.ModState.c;
    }
}
