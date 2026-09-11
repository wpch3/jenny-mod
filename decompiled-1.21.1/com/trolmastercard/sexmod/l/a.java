package com.trolmastercard.sexmod.l;

import java.util.HashSet;
import java.util.UUID;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@EventBusSubscriber(modid = "sexmod")
public final class a {
    @SubscribeEvent
    public static void register(RegisterPayloadHandlersEvent var0) {
        PayloadRegistrar var1 = var0.registrar("1");
        var1.playToServer(f.a, f.b, a::a);
        var1.playToServer(b.a, b.b, a::a);
        var1.playToServer(e.a, e.b, a::a);
        var1.playToClient(v.a, v.b, a::a);
        var1.playToServer(m.a, m.b, a::a);
        var1.playToClient(o.a, o.b, a::a);
        var1.playToServer(t.a, t.b, a::a);
        var1.playToServer(q.a, q.b, a::a);
        var1.playToServer(p.a, p.b, a::a);
        var1.playToServer(l.a, l.b, a::a);
        var1.playToServer(i.a, i.b, a::a);
        var1.playToServer(c.a, c.b, a::a);
        var1.playToServer(s.a, s.b, a::a);
        var1.playToServer(r.a, r.b, a::a);
        var1.playToServer(j.a, j.b, a::a);
        var1.playToServer(d.a, d.b, a::a);
        var1.playToServer(k.a, k.b, a::a);
        var1.playToServer(n.a, n.b, a::a);
        var1.playToClient(h.a, h.b, a::a);
        var1.playToClient(g.a, g.b, a::a);
        var1.playToClient(u.a, u.b, a::a);
        var1.playToServer(w.a, w.b, a::a);
    }

    private static void a(w var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var6;
                try {
                    var6 = UUID.fromString(var0.b());
                } catch (IllegalArgumentException var5) {
                    return;
                }

                com.trolmastercard.sexmod.f.b.k var4 = com.trolmastercard.sexmod.f.b.k.t(var6);
                if (var4 != null && var4.al() != null && var4.al().equals(var2.getUUID())) {
                    var2.getPersistentData().putString("sexmod:CustomModel" + com.trolmastercard.sexmod.f.h.a(var4), var0.a());
                }
            }
        });
    }

    private static void a(u var0, IPayloadContext var1) {
        var1.enqueueWork(() -> com.trolmastercard.sexmod.b.b.a(var0.a()));
    }

    private static void a(h var0, IPayloadContext var1) {
        var1.enqueueWork(() -> com.trolmastercard.sexmod.n.a.a = var0.a());
    }

    private static void a(g var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            UUID var1x;
            try {
                var1x = var0.b().isEmpty() ? null : UUID.fromString(var0.b());
            } catch (IllegalArgumentException var6) {
                var1x = null;
            }

            if (var1x != null && com.trolmastercard.sexmod.b.b.a(var1x)) {
                com.trolmastercard.sexmod.n.a.a = false;
            }

            UUID var2;
            try {
                var2 = var0.a().isEmpty() ? null : UUID.fromString(var0.a());
            } catch (IllegalArgumentException var5) {
                var2 = null;
            }

            if (var2 != null) {
                if (com.trolmastercard.sexmod.f.b.k.s(var2) instanceof com.trolmastercard.sexmod.f.b.e var4) {
                    com.trolmastercard.sexmod.b.b.a(var4);
                }
            }
        });
    }

    private static void a(n var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer) {
                UUID var2;
                try {
                    var2 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var7) {
                    return;
                }

                for (com.trolmastercard.sexmod.f.b.k var4 : com.trolmastercard.sexmod.f.b.k.u(var2)) {
                    if (!var4.level().isClientSide()) {
                        if (var4.al() != null && var4.level().getPlayerByUUID(var4.al()) instanceof ServerPlayer var5) {
                            n.a(var5);
                        }

                        if (!var0.b()) {
                            n.a(var4);
                        }
                    }
                }
            }
        });
    }

    private static void a(l var0, IPayloadContext var1) {
        var1.enqueueWork(
            () -> {
                if (var1.player() instanceof ServerPlayer var2) {
                    UUID var9;
                    try {
                        var9 = UUID.fromString(var0.a());
                    } catch (IllegalArgumentException var8) {
                        return;
                    }

                    for (com.trolmastercard.sexmod.f.b.k var5 : com.trolmastercard.sexmod.f.b.k.u(var9)) {
                        if (!var5.level().isClientSide() && var5 instanceof com.trolmastercard.sexmod.f.b.l var6) {
                            int var7 = var5.getId();
                            var2.openMenu(
                                new SimpleMenuProvider((var1xx, var2x, var3) -> new com.trolmastercard.sexmod.j.a(var1xx, var2x, var6), Component.empty()),
                                var1xx -> var1xx.writeVarInt(var7)
                            );
                            break;
                        }
                    }
                }
            }
        );
    }

    private static void a(i var0, IPayloadContext var1) {
        var1.enqueueWork(
            () -> {
                if (var1.player() instanceof ServerPlayer var2) {
                    UUID var9;
                    try {
                        var9 = UUID.fromString(var0.a());
                    } catch (IllegalArgumentException var8) {
                        return;
                    }

                    for (com.trolmastercard.sexmod.f.b.k var5 : com.trolmastercard.sexmod.f.b.k.u(var9)) {
                        if (!var5.level().isClientSide() && var5 instanceof com.trolmastercard.sexmod.f.b.m var6) {
                            int var7 = var5.getId();
                            var2.openMenu(
                                new SimpleMenuProvider((var1xx, var2x, var3) -> new com.trolmastercard.sexmod.j.b(var1xx, var2x, var6), Component.empty()),
                                var1xx -> var1xx.writeVarInt(var7)
                            );
                            break;
                        }
                    }
                }
            }
        );
    }

    private static void a(c var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var6;
                try {
                    var6 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var5) {
                    return;
                }

                UUID var4 = com.trolmastercard.sexmod.d.c.o(var6);
                if (var4 != null && var4.equals(var2.getUUID())) {
                    com.trolmastercard.sexmod.d.c.a(var6, var0.c());
                }
            }
        });
    }

    private static void a(s var0, IPayloadContext var1) {
    }

    private static void a(r var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var4 = com.trolmastercard.sexmod.d.c.n(var2.getUUID());
                if (var4 != null) {
                    com.trolmastercard.sexmod.d.c.a(var4, var0.a());
                }
            }
        });
    }

    private static void a(j var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var4 = com.trolmastercard.sexmod.d.c.n(var2.getUUID());
                if (var4 != null) {
                    com.trolmastercard.sexmod.d.c.c(var4, var0.a());
                }
            }
        });
    }

    private static void a(d var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var4 = com.trolmastercard.sexmod.d.c.n(var2.getUUID());
                if (var4 != null) {
                    com.trolmastercard.sexmod.d.d.a(var2.level(), var0.a(), var4);
                }
            }
        });
    }

    private static void a(k var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var6 = com.trolmastercard.sexmod.d.c.n(var2.getUUID());
                if (var6 != null) {
                    Direction var4 = var0.b();
                    HashSet var5 = k.a(var0.a(), var4);
                    com.trolmastercard.sexmod.d.c.b(var6, new com.trolmastercard.sexmod.d.d(var0.a(), com.trolmastercard.sexmod.d.d.a.b, var5, var4));
                }
            }
        });
    }

    private static void a(p var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer) {
                UUID var2;
                try {
                    var2 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var7) {
                    return;
                }

                for (com.trolmastercard.sexmod.f.b.k var4 : com.trolmastercard.sexmod.f.b.k.u(var2)) {
                    if (var4.level() instanceof ServerLevel var5) {
                        Vec3 var8 = var4.ak;
                        if (var8 != null && !var8.equals(Vec3.ZERO)) {
                            var5.sendParticles(ParticleTypes.PORTAL, var4.getX(), var4.getY() + 1.0, var4.getZ(), 32, 0.2, 0.4, 0.2, 0.5);
                            var4.teleportTo(var8.x, var8.y, var8.z);
                            var4.c(com.trolmastercard.sexmod.f.j.a);
                            var4.getEntityData().set(com.trolmastercard.sexmod.f.b.k.ap, false);
                            var4.i();
                        }
                    }
                }
            }
        });
    }

    private static void a(q var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer) {
                UUID var2;
                try {
                    var2 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var5) {
                    return;
                }

                for (com.trolmastercard.sexmod.f.b.k var4 : com.trolmastercard.sexmod.f.b.k.u(var2)) {
                    if (!var4.level().isClientSide()) {
                        var4.ak = new Vec3(var0.b(), Math.floor(var0.c()), var0.d());
                    }
                }
            }
        });
    }

    private static void a(t var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer) {
                UUID var2;
                try {
                    var2 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var9) {
                    return;
                }

                String var3 = var0.c();

                for (com.trolmastercard.sexmod.f.b.k var5 : com.trolmastercard.sexmod.f.b.k.u(var2)) {
                    if (!var5.level().isClientSide()) {
                        switch (var0.b()) {
                            case "pregnant":
                                if (var5 instanceof com.trolmastercard.sexmod.f.b.o) {
                                    var5.getEntityData().set(com.trolmastercard.sexmod.f.b.o.d, Integer.valueOf(var3));
                                }
                                break;
                            case "currentModel":
                                var5.getEntityData().set(com.trolmastercard.sexmod.f.b.k.at, Integer.valueOf(var3));
                                break;
                            case "currentAction":
                                var5.c(com.trolmastercard.sexmod.f.j.valueOf(var3));
                                break;
                            case "animationFollowUp":
                            case "scene":
                                var5.getEntityData().set(com.trolmastercard.sexmod.f.b.k.av, var3);
                                break;
                            case "playerSheHasSexWith":
                                var5.q("null".equals(var3) ? null : UUID.fromString(var3));
                                break;
                            case "targetPos":
                                String[] var8 = var3.split("f");
                                if (var8.length >= 3) {
                                    var5.d(new Vec3(Double.parseDouble(var8[0]), Double.parseDouble(var8[1]), Double.parseDouble(var8[2])));
                                }
                                break;
                            case "master":
                                var5.getEntityData().set(com.trolmastercard.sexmod.f.b.k.ao, var3);
                                break;
                            case "walk speed":
                                var5.getEntityData().set(com.trolmastercard.sexmod.f.b.k.ax, var3);
                                break;
                            case "shouldbeattargetpos":
                                var5.getEntityData().set(com.trolmastercard.sexmod.f.b.k.ap, Boolean.valueOf(var3));
                        }
                    }
                }
            }
        });
    }

    private static void a(o var0, IPayloadContext var1) {
        var1.enqueueWork(() -> com.trolmastercard.sexmod.b.b.a(Component.literal(var0.a())));
    }

    private static void a(m var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer) {
                UUID var2;
                try {
                    var2 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var6) {
                    return;
                }

                UUID var3 = null;
                if (!"null".equals(var0.b()) && !var0.b().isEmpty()) {
                    try {
                        var3 = UUID.fromString(var0.b());
                    } catch (IllegalArgumentException var5) {
                        var3 = null;
                    }
                }

                com.trolmastercard.sexmod.f.b.k.a(var2, var3, var0.c(), var0.d());
            }
        });
    }

    private static void a(v var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            UUID var1x;
            try {
                var1x = UUID.fromString(var0.a());
            } catch (IllegalArgumentException var3) {
                return;
            }

            com.trolmastercard.sexmod.f.c.a var2 = com.trolmastercard.sexmod.f.c.a.c(var1x);
            if (var2 != null) {
                var2.getEntityData().set(com.trolmastercard.sexmod.f.b.k.au, var0.c());
                var2.getEntityData().set(com.trolmastercard.sexmod.f.b.k.at, var0.b());
            }
        });
    }

    private static void a(f var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                if (var2.level().getEntity(var0.a()) instanceof com.trolmastercard.sexmod.f.b.k var4) {
                    if (!(var4.distanceToSqr(var2) > 144.0)) {
                        com.trolmastercard.sexmod.f.j var5 = a(var0.b());
                        if (var5 != null) {
                            ItemStack var6 = b(var0.b());
                            if (!var2.isCreative() && var6 != null && !a(var2, var6)) {
                                com.trolmastercard.sexmod.i.e.c(var4, "jenny", "sadoh");
                                var2.displayClientMessage(Component.literal("<Jenny> you can't afford that..."), false);
                            } else if (!var0.b().equals("action.names.strip") && !var0.b().equals("action.names.dressup")) {
                                var4.a(var2, var5);
                            } else {
                                int var7 = (Integer)var4.getEntityData().get(com.trolmastercard.sexmod.f.b.k.at);
                                var4.getEntityData().set(com.trolmastercard.sexmod.f.b.k.at, var7 == 1 ? 0 : 1);
                                var4.c(com.trolmastercard.sexmod.f.j.n);
                            }
                        }
                    }
                }
            }
        });
    }

    private static void a(b var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                com.trolmastercard.sexmod.f.b.k var4 = com.trolmastercard.sexmod.f.b.k.a(var2);
                if (var4 != null) {
                    var4.e(var0.a());
                }
            }
        });
    }

    private static void a(e var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var1x) {
                com.trolmastercard.sexmod.f.b.k var3 = com.trolmastercard.sexmod.f.b.k.a(var1x);
                if (var3 != null) {
                    var3.aA();
                }
            }
        });
    }

    private static com.trolmastercard.sexmod.f.j a(String var0) {
        return switch (var0) {
            case "action.names.blowjob" -> com.trolmastercard.sexmod.f.j.b;
            case "action.names.boobjob" -> com.trolmastercard.sexmod.f.j.G;
            case "action.names.doggy" -> com.trolmastercard.sexmod.f.j.j;
            case "doggy" -> com.trolmastercard.sexmod.f.j.bv;
            case "action.names.anal" -> com.trolmastercard.sexmod.f.j.V;
            case "action.names.cowgirl" -> com.trolmastercard.sexmod.f.j.w;
            case "action.names.missionary", "Face fuck" -> com.trolmastercard.sexmod.f.j.M;
            case "action.names.touchboobs" -> com.trolmastercard.sexmod.f.j.az;
            case "action.names.sex" -> com.trolmastercard.sexmod.f.j.aE;
            case "action.names.deepthroat" -> com.trolmastercard.sexmod.f.j.ah;
            case "Reverse cowgirl" -> com.trolmastercard.sexmod.f.j.bE;
            case "action.names.strip", "action.names.dressup" -> com.trolmastercard.sexmod.f.j.n;
            default -> null;
        };
    }

    private static ItemStack b(String var0) {
        return switch (var0) {
            case "action.names.blowjob" -> new ItemStack(Items.EMERALD, 3);
            case "action.names.boobjob" -> new ItemStack(Items.ENDER_PEARL, 2);
            case "action.names.doggy" -> new ItemStack(Items.DIAMOND, 2);
            case "action.names.strip" -> new ItemStack(Items.GOLD_INGOT, 1);
            default -> null;
        };
    }

    private static boolean a(ServerPlayer var0, ItemStack var1) {
        Inventory var2 = var0.getInventory();
        int var3 = var1.getCount();
        int var4 = 0;

        for (int var5 = 0; var5 < var2.getContainerSize(); var5++) {
            if (var2.getItem(var5).is(var1.getItem())) {
                var4 += var2.getItem(var5).getCount();
            }
        }

        if (var4 < var3) {
            return false;
        }

        for (int var8 = 0; var8 < var2.getContainerSize() && var3 > 0; var8++) {
            ItemStack var6 = var2.getItem(var8);
            if (var6.is(var1.getItem())) {
                int var7 = Math.min(var3, var6.getCount());
                var6.shrink(var7);
                var3 -= var7;
            }
        }

        return true;
    }

    private a() {
    }
}
