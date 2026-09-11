package com.trolmastercard.sexmod.f;

import net.minecraft.world.entity.Entity;

public enum h {
    a(com.trolmastercard.sexmod.f.b.g.class, 177013, com.trolmastercard.sexmod.f.c.i.class, 12388645),
    b(com.trolmastercard.sexmod.f.b.d.class, 228922, com.trolmastercard.sexmod.f.c.f.class, 46348348),
    c(com.trolmastercard.sexmod.f.b.c.class, 230053, com.trolmastercard.sexmod.f.c.e.class, 65456415),
    d(com.trolmastercard.sexmod.f.b.o.class, 168597, com.trolmastercard.sexmod.f.c.l.class, 54816432),
    e(com.trolmastercard.sexmod.f.b.b.class, 4663354, com.trolmastercard.sexmod.f.c.d.class, 48648638),
    f(com.trolmastercard.sexmod.f.b.a.class, 5614613, com.trolmastercard.sexmod.f.c.c.class, 64867483),
    g(com.trolmastercard.sexmod.f.b.i.class, 6816463, com.trolmastercard.sexmod.f.c.k.class, 81234824),
    h(com.trolmastercard.sexmod.f.b.h.class, 5648456, com.trolmastercard.sexmod.f.c.j.class, 62484851, true),
    i(com.trolmastercard.sexmod.f.b.f.class, 4567275, com.trolmastercard.sexmod.f.c.h.class, 6584344, true),
    j(com.trolmastercard.sexmod.f.b.e.class, 314351, com.trolmastercard.sexmod.f.c.g.class, 652535516),
    k(com.trolmastercard.sexmod.f.b.j.class, 618151);

    public final int l;
    public final int m;
    public final Class<? extends com.trolmastercard.sexmod.f.b.k> n;
    public final Class<? extends com.trolmastercard.sexmod.f.c.a> o;
    public final boolean p;
    public final int q;
    public final boolean r;

    h(Class<? extends com.trolmastercard.sexmod.f.b.k> var3, int var4, Class<? extends com.trolmastercard.sexmod.f.c.a> var5, int var6, boolean var7) {
        this.l = var4;
        this.m = var6;
        this.n = var3;
        this.o = var5;
        this.p = false;
        this.r = var7;
        this.q = com.trolmastercard.sexmod.d.f.b++;
    }

    h(Class<? extends com.trolmastercard.sexmod.f.b.k> var3, int var4, Class<? extends com.trolmastercard.sexmod.f.c.a> var5, int var6) {
        this.l = var4;
        this.m = var6;
        this.n = var3;
        this.o = var5;
        this.p = false;
        this.r = false;
        this.q = com.trolmastercard.sexmod.d.f.b++;
    }

    h(Class<? extends com.trolmastercard.sexmod.f.b.k> var3, int var4) {
        this.l = var4;
        this.n = var3;
        this.p = true;
        this.r = false;
        this.q = com.trolmastercard.sexmod.d.f.b++;
        this.o = null;
        this.m = 0;
    }

    public static h a(String var0) {
        for (h var4 : values()) {
            if (var4.toString().equalsIgnoreCase(var0)) {
                return var4;
            }
        }

        return a;
    }

    public static h a(Entity var0) {
        if (var0 instanceof com.trolmastercard.sexmod.f.b.k var1) {
            Class var2 = var1.getClass();

            for (h var6 : values()) {
                if (var2.equals(var6.n)) {
                    return var6;
                }

                if (var2.equals(var6.o)) {
                    return var6;
                }
            }

            return null;
        } else {
            return null;
        }
    }
}
