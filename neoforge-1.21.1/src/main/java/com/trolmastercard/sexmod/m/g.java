package com.trolmastercard.sexmod.m;

import net.minecraft.core.Vec3i;

public enum g {
    a(213, 239, 150),
    b(189, 165, 91),
    c(160, 183, 135),
    d(234, 176, 102),
    e(187, 203, 252);

    private final Vec3i f;

    g(int var3, int var4, int var5) {
        this.f = new Vec3i(var3, var4, var5);
    }

    public Vec3i a() {
        return this.f;
    }
}
