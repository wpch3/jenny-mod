package com.trolmastercard.sexmod.m;

import net.minecraft.core.Vec3i;

public enum h {
    a(255, 0, 0),
    b(132, 30, 156),
    c(243, 247, 0),
    d(105, 60, 9),
    e(0, 206, 217),
    f(0, 0, 255);

    private final Vec3i g;

    h(int var3, int var4, int var5) {
        this.g = new Vec3i(var3, var4, var5);
    }

    public Vec3i a() {
        return this.g;
    }
}
