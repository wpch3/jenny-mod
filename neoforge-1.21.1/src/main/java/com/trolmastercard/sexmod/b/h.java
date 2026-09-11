package com.trolmastercard.sexmod.b;

import com.trolmastercard.sexmod.b.b.A;
import com.trolmastercard.sexmod.b.b.B;
import com.trolmastercard.sexmod.b.b.C;
import com.trolmastercard.sexmod.b.b.D;
import com.trolmastercard.sexmod.b.b.E;
import com.trolmastercard.sexmod.b.b.F;
import com.trolmastercard.sexmod.b.b.m;
import com.trolmastercard.sexmod.b.b.n;
import com.trolmastercard.sexmod.b.b.o;
import com.trolmastercard.sexmod.b.b.p;
import com.trolmastercard.sexmod.b.b.q;
import com.trolmastercard.sexmod.b.b.r;
import com.trolmastercard.sexmod.b.b.s;
import com.trolmastercard.sexmod.b.b.u;
import com.trolmastercard.sexmod.b.b.v;
import com.trolmastercard.sexmod.b.b.w;
import com.trolmastercard.sexmod.b.b.x;
import com.trolmastercard.sexmod.b.b.y;
import com.trolmastercard.sexmod.b.b.z;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterRenderers;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class h {
    @SubscribeEvent
    public static void registerMenuScreens(RegisterMenuScreensEvent var0) {
        var0.register((MenuType)com.trolmastercard.sexmod.i.d.b.get(), com.trolmastercard.sexmod.h.e::new);
        var0.register((MenuType)com.trolmastercard.sexmod.i.d.c.get(), com.trolmastercard.sexmod.h.f::new);
    }

    @SubscribeEvent
    public static void registerRenderers(RegisterRenderers var0) {
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.b.get(), n::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.c.get(), A::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.d.get(), x::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.e.get(), D::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.f.get(), w::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.g.get(), v::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.h.get(), u::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.i.get(), C::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.j.get(), y::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.k.get(), B::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.l.get(), z::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.m.get(), com.trolmastercard.sexmod.b.b.h::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.n.get(), com.trolmastercard.sexmod.b.b.e::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.o.get(), F::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.p.get(), com.trolmastercard.sexmod.b.b.d::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.q.get(), com.trolmastercard.sexmod.b.b.b::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.r.get(), q::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.s.get(), s::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.t.get(), com.trolmastercard.sexmod.b.b.k::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.u.get(), o::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.v.get(), m::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.w.get(), com.trolmastercard.sexmod.b.b.f::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.x.get(), com.trolmastercard.sexmod.b.b.j::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.y.get(), E::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.z.get(), r::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.A.get(), com.trolmastercard.sexmod.b.b.i::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.i.b.B.get(), p::new);
    }

    private h() {
    }
}
