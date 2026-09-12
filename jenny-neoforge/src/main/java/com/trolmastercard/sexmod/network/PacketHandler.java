package com.trolmastercard.sexmod.network;

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
public final class PacketHandler {
    @SubscribeEvent
    public static void register(RegisterPayloadHandlersEvent var0) {
        PayloadRegistrar var1 = var0.registrar("1");
        var1.playToServer(MenuActionPayload.a, MenuActionPayload.b, PacketHandler::a);
        var1.playToServer(AdvanceScenePayload.a, AdvanceScenePayload.b, PacketHandler::a);
        var1.playToServer(EndScenePayload.a, EndScenePayload.b, PacketHandler::a);
        var1.playToClient(SyncPlayableStatePayload.a, SyncPlayableStatePayload.b, PacketHandler::a);
        var1.playToServer(RequestSitNpcPayload.a, RequestSitNpcPayload.b, PacketHandler::a);
        var1.playToClient(SendChatMessagePayload.a, SendChatMessagePayload.b, PacketHandler::a);
        var1.playToServer(SyncNpcDialoguePayload.a, SyncNpcDialoguePayload.b, PacketHandler::a);
        var1.playToServer(SetNpcHomePayload.a, SetNpcHomePayload.b, PacketHandler::a);
        var1.playToServer(SendCompanionHomePayload.a, SendCompanionHomePayload.b, PacketHandler::a);
        var1.playToServer(RequestNpcActionPayload.a, RequestNpcActionPayload.b, PacketHandler::a);
        var1.playToServer(OpenBeeChestPayload.a, OpenBeeChestPayload.b, PacketHandler::a);
        var1.playToServer(ClaimTribePayload.a, ClaimTribePayload.b, PacketHandler::a);
        var1.playToServer(SyncBlocksPayload.a, SyncBlocksPayload.b, PacketHandler::a);
        var1.playToServer(SetTribeFollowModePayload.a, SetTribeFollowModePayload.b, PacketHandler::a);
        var1.playToServer(RequestCancelTaskPayload.a, RequestCancelTaskPayload.b, PacketHandler::a);
        var1.playToServer(FellTreePayload.a, FellTreePayload.b, PacketHandler::a);
        var1.playToServer(RequestMinePayload.a, RequestMinePayload.b, PacketHandler::a);
        var1.playToServer(ResetPlayablePayload.a, ResetPlayablePayload.b, PacketHandler::a);
        var1.playToClient(NotifyOwnershipPayload.a, NotifyOwnershipPayload.b, PacketHandler::a);
        var1.playToClient(NotifyGalathCoinGiftPayload.a, NotifyGalathCoinGiftPayload.b, PacketHandler::a);
        var1.playToClient(SyncNpcSpecificsPayload.a, SyncNpcSpecificsPayload.b, PacketHandler::a);
        var1.playToServer(UploadModelStringPayload.a, UploadModelStringPayload.b, PacketHandler::a);
    }

    private static void a(UploadModelStringPayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var6;
                try {
                    var6 = UUID.fromString(var0.b());
                } catch (IllegalArgumentException var5) {
                    return;
                }

                com.trolmastercard.sexmod.entity.GirlEntity var4 = com.trolmastercard.sexmod.entity.GirlEntity.t(var6);
                if (var4 != null && var4.al() != null && var4.al().equals(var2.getUUID())) {
                    var2.getPersistentData().putString("sexmod:CustomModel" + com.trolmastercard.sexmod.entity.NpcType.a(var4), var0.a());
                }
            }
        });
    }

    private static void a(SyncNpcSpecificsPayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> com.trolmastercard.sexmod.client.ClientUtils.a(var0.a()));
    }

    private static void a(NotifyOwnershipPayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> com.trolmastercard.sexmod.server.PlayerModData.ag = var0.a());
    }

    private static void a(NotifyGalathCoinGiftPayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            UUID var1x;
            try {
                var1x = var0.b().isEmpty() ? null : UUID.fromString(var0.b());
            } catch (IllegalArgumentException var6) {
                var1x = null;
            }

            if (var1x != null && com.trolmastercard.sexmod.client.ClientUtils.a(var1x)) {
                com.trolmastercard.sexmod.server.PlayerModData.ag = false;
            }

            UUID var2;
            try {
                var2 = var0.a().isEmpty() ? null : UUID.fromString(var0.a());
            } catch (IllegalArgumentException var5) {
                var2 = null;
            }

            if (var2 != null) {
                if (com.trolmastercard.sexmod.entity.GirlEntity.s(var2) instanceof com.trolmastercard.sexmod.entity.GalathEntity var4) {
                    com.trolmastercard.sexmod.client.ClientUtils.a(var4);
                }
            }
        });
    }

    private static void a(ResetPlayablePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer) {
                UUID var2;
                try {
                    var2 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var7) {
                    return;
                }

                for (com.trolmastercard.sexmod.entity.GirlEntity var4 : com.trolmastercard.sexmod.entity.GirlEntity.u(var2)) {
                    if (!var4.level().isClientSide()) {
                        if (var4.al() != null && var4.level().getPlayerByUUID(var4.al()) instanceof ServerPlayer var5) {
                            ResetPlayablePayload.a(var5);
                        }

                        if (!var0.b()) {
                            ResetPlayablePayload.a(var4);
                        }
                    }
                }
            }
        });
    }

    private static void a(RequestNpcActionPayload var0, IPayloadContext var1) {
        var1.enqueueWork(
            () -> {
                if (var1.player() instanceof ServerPlayer var2) {
                    UUID var9;
                    try {
                        var9 = UUID.fromString(var0.a());
                    } catch (IllegalArgumentException var8) {
                        return;
                    }

                    for (com.trolmastercard.sexmod.entity.GirlEntity var5 : com.trolmastercard.sexmod.entity.GirlEntity.u(var9)) {
                        if (!var5.level().isClientSide() && var5 instanceof com.trolmastercard.sexmod.entity.HumanoidGirlEntity var6) {
                            int var7 = var5.getId();
                            var2.openMenu(
                                new SimpleMenuProvider((var1xx, var2x, var3) -> new com.trolmastercard.sexmod.menu.NpcEquipmentMenu(var1xx, var2x, var6), Component.empty()),
                                var1xx -> var1xx.writeVarInt(var7)
                            );
                            break;
                        }
                    }
                }
            }
        );
    }

    private static void a(OpenBeeChestPayload var0, IPayloadContext var1) {
        var1.enqueueWork(
            () -> {
                if (var1.player() instanceof ServerPlayer var2) {
                    UUID var9;
                    try {
                        var9 = UUID.fromString(var0.a());
                    } catch (IllegalArgumentException var8) {
                        return;
                    }

                    for (com.trolmastercard.sexmod.entity.GirlEntity var5 : com.trolmastercard.sexmod.entity.GirlEntity.u(var9)) {
                        if (!var5.level().isClientSide() && var5 instanceof com.trolmastercard.sexmod.entity.ContainerGirlEntity var6) {
                            int var7 = var5.getId();
                            var2.openMenu(
                                new SimpleMenuProvider((var1xx, var2x, var3) -> new com.trolmastercard.sexmod.menu.NpcStorageMenu(var1xx, var2x, var6), Component.empty()),
                                var1xx -> var1xx.writeVarInt(var7)
                            );
                            break;
                        }
                    }
                }
            }
        );
    }

    private static void a(ClaimTribePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var6;
                try {
                    var6 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var5) {
                    return;
                }

                UUID var4 = com.trolmastercard.sexmod.server.TribeData.o(var6);
                if (var4 != null && var4.equals(var2.getUUID())) {
                    com.trolmastercard.sexmod.server.TribeData.a(var6, var0.c());
                }
            }
        });
    }

    private static void a(SyncBlocksPayload var0, IPayloadContext var1) {
    }

    private static void a(SetTribeFollowModePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var4 = com.trolmastercard.sexmod.server.TribeData.n(var2.getUUID());
                if (var4 != null) {
                    com.trolmastercard.sexmod.server.TribeData.a(var4, var0.a());
                }
            }
        });
    }

    private static void a(RequestCancelTaskPayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var4 = com.trolmastercard.sexmod.server.TribeData.n(var2.getUUID());
                if (var4 != null) {
                    com.trolmastercard.sexmod.server.TribeData.c(var4, var0.a());
                }
            }
        });
    }

    private static void a(FellTreePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var4 = com.trolmastercard.sexmod.server.TribeData.n(var2.getUUID());
                if (var4 != null) {
                    com.trolmastercard.sexmod.server.KoboldDen.a(var2.level(), var0.a(), var4);
                }
            }
        });
    }

    private static void a(RequestMinePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                UUID var6 = com.trolmastercard.sexmod.server.TribeData.n(var2.getUUID());
                if (var6 != null) {
                    Direction var4 = var0.b();
                    HashSet var5 = RequestMinePayload.a(var0.a(), var4);
                    com.trolmastercard.sexmod.server.TribeData.b(var6, new com.trolmastercard.sexmod.server.KoboldDen(var0.a(), com.trolmastercard.sexmod.server.KoboldDen.a.b, var5, var4));
                }
            }
        });
    }

    private static void a(SendCompanionHomePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer) {
                UUID var2;
                try {
                    var2 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var7) {
                    return;
                }

                for (com.trolmastercard.sexmod.entity.GirlEntity var4 : com.trolmastercard.sexmod.entity.GirlEntity.u(var2)) {
                    if (var4.level() instanceof ServerLevel var5) {
                        Vec3 var8 = var4.ak;
                        if (var8 != null && !var8.equals(Vec3.ZERO)) {
                            var5.sendParticles(ParticleTypes.PORTAL, var4.getX(), var4.getY() + 1.0, var4.getZ(), 32, 0.2, 0.4, 0.2, 0.5);
                            var4.teleportTo(var8.x, var8.y, var8.z);
                            var4.c(com.trolmastercard.sexmod.entity.ScenePose.a);
                            var4.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.ap, false);
                            var4.i();
                        }
                    }
                }
            }
        });
    }

    private static void a(SetNpcHomePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer) {
                UUID var2;
                try {
                    var2 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var5) {
                    return;
                }

                for (com.trolmastercard.sexmod.entity.GirlEntity var4 : com.trolmastercard.sexmod.entity.GirlEntity.u(var2)) {
                    if (!var4.level().isClientSide()) {
                        var4.ak = new Vec3(var0.b(), Math.floor(var0.c()), var0.d());
                    }
                }
            }
        });
    }

    private static void a(SyncNpcDialoguePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer) {
                UUID var2;
                try {
                    var2 = UUID.fromString(var0.a());
                } catch (IllegalArgumentException var9) {
                    return;
                }

                String var3 = var0.c();

                for (com.trolmastercard.sexmod.entity.GirlEntity var5 : com.trolmastercard.sexmod.entity.GirlEntity.u(var2)) {
                    if (!var5.level().isClientSide()) {
                        switch (var0.b()) {
                            case "pregnant":
                                if (var5 instanceof com.trolmastercard.sexmod.entity.SlimeGirlEntity) {
                                    var5.getEntityData().set(com.trolmastercard.sexmod.entity.SlimeGirlEntity.d, Integer.valueOf(var3));
                                }
                                break;
                            case "currentModel":
                                var5.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.at, Integer.valueOf(var3));
                                break;
                            case "currentAction":
                                var5.c(com.trolmastercard.sexmod.entity.ScenePose.valueOf(var3));
                                break;
                            case "animationFollowUp":
                            case "scene":
                                var5.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.av, var3);
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
                                var5.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.ao, var3);
                                break;
                            case "walk speed":
                                var5.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.ax, var3);
                                break;
                            case "shouldbeattargetpos":
                                var5.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.ap, Boolean.valueOf(var3));
                        }
                    }
                }
            }
        });
    }

    private static void a(SendChatMessagePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> com.trolmastercard.sexmod.client.ClientUtils.a(Component.literal(var0.a())));
    }

    private static void a(RequestSitNpcPayload var0, IPayloadContext var1) {
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

                com.trolmastercard.sexmod.entity.GirlEntity.a(var2, var3, var0.c(), var0.d());
            }
        });
    }

    private static void a(SyncPlayableStatePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            UUID var1x;
            try {
                var1x = UUID.fromString(var0.a());
            } catch (IllegalArgumentException var3) {
                return;
            }

            com.trolmastercard.sexmod.entity.player.PlayerGirlEntity var2 = com.trolmastercard.sexmod.entity.player.PlayerGirlEntity.c(var1x);
            if (var2 != null) {
                var2.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.au, var0.c());
                var2.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.at, var0.b());
            }
        });
    }

    private static void a(MenuActionPayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                if (var2.level().getEntity(var0.a()) instanceof com.trolmastercard.sexmod.entity.GirlEntity var4) {
                    if (!(var4.distanceToSqr(var2) > 144.0)) {
                        com.trolmastercard.sexmod.entity.ScenePose var5 = a(var0.b());
                        if (var5 != null) {
                            ItemStack var6 = b(var0.b());
                            if (!var2.isCreative() && var6 != null && !a(var2, var6)) {
                                com.trolmastercard.sexmod.registry.ModSounds.c(var4, "jenny", "sadoh");
                                var2.displayClientMessage(Component.literal("<Jenny> you can't afford that..."), false);
                            } else if (!var0.b().equals("action.names.strip") && !var0.b().equals("action.names.dressup")) {
                                var4.a(var2, var5);
                            } else {
                                int var7 = (Integer)var4.getEntityData().get(com.trolmastercard.sexmod.entity.GirlEntity.at);
                                var4.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.at, var7 == 1 ? 0 : 1);
                                var4.c(com.trolmastercard.sexmod.entity.ScenePose.n);
                            }
                        }
                    }
                }
            }
        });
    }

    private static void a(AdvanceScenePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var2) {
                com.trolmastercard.sexmod.entity.GirlEntity var4 = com.trolmastercard.sexmod.entity.GirlEntity.a(var2);
                if (var4 != null) {
                    var4.e(var0.a());
                }
            }
        });
    }

    private static void a(EndScenePayload var0, IPayloadContext var1) {
        var1.enqueueWork(() -> {
            if (var1.player() instanceof ServerPlayer var1x) {
                com.trolmastercard.sexmod.entity.GirlEntity var3 = com.trolmastercard.sexmod.entity.GirlEntity.a(var1x);
                if (var3 != null) {
                    var3.aA();
                }
            }
        });
    }

    private static com.trolmastercard.sexmod.entity.ScenePose a(String var0) {
        return switch (var0) {
            case "action.names.blowjob" -> com.trolmastercard.sexmod.entity.ScenePose.b;
            case "action.names.boobjob" -> com.trolmastercard.sexmod.entity.ScenePose.G;
            case "action.names.doggy" -> com.trolmastercard.sexmod.entity.ScenePose.j;
            case "doggy" -> com.trolmastercard.sexmod.entity.ScenePose.bv;
            case "action.names.anal" -> com.trolmastercard.sexmod.entity.ScenePose.V;
            case "action.names.cowgirl" -> com.trolmastercard.sexmod.entity.ScenePose.w;
            case "action.names.missionary", "Face fuck" -> com.trolmastercard.sexmod.entity.ScenePose.M;
            case "action.names.touchboobs" -> com.trolmastercard.sexmod.entity.ScenePose.az;
            case "action.names.sex" -> com.trolmastercard.sexmod.entity.ScenePose.aE;
            case "action.names.deepthroat" -> com.trolmastercard.sexmod.entity.ScenePose.ah;
            case "Reverse cowgirl" -> com.trolmastercard.sexmod.entity.ScenePose.bE;
            case "action.names.strip", "action.names.dressup" -> com.trolmastercard.sexmod.entity.ScenePose.n;
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

    private PacketHandler() {
    }
}
