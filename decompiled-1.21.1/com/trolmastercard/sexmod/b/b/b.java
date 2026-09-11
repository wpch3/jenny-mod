package com.trolmastercard.sexmod.b.b;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.core.Vec3i;

public class B extends t<com.trolmastercard.sexmod.f.c.j> {
    public B(Context var1) {
        super(var1, new com.trolmastercard.sexmod.b.a.A());
    }

    protected int a(com.trolmastercard.sexmod.f.c.j var1, String var2) {
        if (o.a.contains(var2)) {
            return o.a(a(var1).a());
        } else if (o.b.contains(var2)) {
            return o.a(a(var1).b());
        } else {
            return !"irisR".equals(var2) && !"irisL".equals(var2) ? -1 : o.a((Vec3i)var1.getEntityData().get(com.trolmastercard.sexmod.f.c.b.m));
        }
    }

    private static com.trolmastercard.sexmod.a a(com.trolmastercard.sexmod.f.c.j var0) {
        return com.trolmastercard.sexmod.a.a((String)var0.getEntityData().get(com.trolmastercard.sexmod.f.c.b.l));
    }
}
