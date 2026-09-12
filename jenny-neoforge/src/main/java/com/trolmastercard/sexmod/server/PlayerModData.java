package com.trolmastercard.sexmod.server;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.trolmastercard.sexmod.Sexmod;
import com.trolmastercard.sexmod.entity.GalathEntity;
import com.trolmastercard.sexmod.entity.ManglelieEntity;
import com.trolmastercard.sexmod.entity.GirlEntity;
import com.trolmastercard.sexmod.network.NotifyOwnershipPayload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.core.UUIDUtil;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.datafix.DataFixTypes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.saveddata.SavedData.Factory;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent.Post;
import net.neoforged.neoforge.network.PacketDistributor;

@EventBusSubscriber(modid = "sexmod")
public class PlayerModData {
    public static boolean ag = true;
    static com.trolmastercard.sexmod.util.BiMap<UUID, UUID> b = new com.trolmastercard.sexmod.util.BiMap<>();
    static HashMap<UUID, Long> c = new HashMap<>();
    static HashSet<UUID> d = new HashSet<>();
    static com.trolmastercard.sexmod.server.PlayerModData.a e;
    public static final Factory<com.trolmastercard.sexmod.server.PlayerModData.a> f = new Factory<>(
        com.trolmastercard.sexmod.server.PlayerModData.a::new, com.trolmastercard.sexmod.server.PlayerModData.a::a, DataFixTypes.LEVEL
    );

    static void a() {
        if (e != null) {
            e.setDirty();
        }
    }

    public static boolean a(UUID var0) {
        return d.contains(var0);
    }

    public static boolean a(GalathEntity var0) {
        UUID var1 = b.b(var0.ah());
        if (var1 == null) {
            return false;
        } else {
            Level var2 = var0.level();
            Player var3 = var2.getPlayerByUUID(var1);
            if (var3 == null) {
                return true;
            } else {
                return var3.level().dimension() != var0.level().dimension() ? false : !(var3.distanceTo(var0) > 60.0F);
            }
        }
    }

    public static void b(GalathEntity var0) {
        ManglelieEntity var1 = var0.a(true);
        if (var1 != null) {
            var1.discard();
        }

        UUID var2 = b.b(var0.ah());
        if (var2 == null) {
            var0.discard();
        } else {
            Level var3 = var0.level();
            Player var4 = var3.getPlayerByUUID(var2);
            var0.discard();
            b.c(var2);
            a();
            if (var4 instanceof ServerPlayer var5) {
                a(var5, false);
            }
        }
    }

    public static boolean b(UUID var0) {
        return b.a(var0) != null;
    }

    public static UUID c(UUID var0) {
        return b.b(var0);
    }

    public static UUID c(GalathEntity var0) {
        return var0 == null ? null : c(var0.ah());
    }

    public static UUID d(UUID var0) {
        return b.a(var0);
    }

    public static UUID a(Player var0) {
        return var0 == null ? null : d(var0.getUUID());
    }

    public static void a(UUID var0, UUID var1) {
        b.a(var0, var1);
        a();
    }

    public static void a(Player var0, GalathEntity var1) {
        if (var0 != null) {
            if (var1 != null) {
                a(var0.getUUID(), var1.ah());
            }
        }
    }

    public static boolean a(UUID var0, Level var1) {
        Long var2 = c.get(var0);
        if (!a(var0)) {
            return false;
        } else {
            return var2 == null ? true : var1.getGameTime() - var2 > 0L;
        }
    }

    public static void a(UUID var0, Long var1) {
        if (var0 == null) {
            Sexmod.a.warn("tried to save last cum dosage time on NULL player");
        } else {
            c.put(var0, var1);
            a();
        }
    }

    @SubscribeEvent
    public static void onServerTick(Post var0) {
        MinecraftServer var1 = var0.getServer();
        ServerLevel var2 = var1.overworld();
        if (var2 != null) {
            a(var2);
        }

        ArrayList<ServerPlayer> var3 = new ArrayList<>();

        for (Entry var5 : b.a()) {
            UUID var6 = (UUID)var5.getKey();
            UUID var7 = (UUID)var5.getValue();
            ServerPlayer var8 = var1.getPlayerList().getPlayer(var6);
            if (var8 != null && GirlEntity.t(var7) == null) {
                var3.add(var8);
            }
        }

        for (ServerPlayer var10 : var3) {
            b.c(var10.getUUID());
            a();
            a(var10, false);
        }
    }

    static void a(ServerPlayer var0, boolean var1) {
        PacketDistributor.sendToPlayer(var0, new NotifyOwnershipPayload(var1), new CustomPacketPayload[0]);
    }

    public static com.trolmastercard.sexmod.server.PlayerModData.a a(ServerLevel var0) {
        com.trolmastercard.sexmod.server.PlayerModData.a var1 = (com.trolmastercard.sexmod.server.PlayerModData.a)var0.getDataStorage().computeIfAbsent(f, "sexmod_galath_owner_ship");
        e = var1;
        return var1;
    }

    public static class a extends SavedData {
        public static final Codec<com.trolmastercard.sexmod.server.PlayerModData.a> a = RecordCodecBuilder.create(
            var0 -> var0.group(
                    com.trolmastercard.sexmod.server.PlayerModData.a.b.a.listOf().fieldOf("ownership").forGetter(var0x -> a()),
                    UUIDUtil.CODEC.listOf().fieldOf("mangs").forGetter(var0x -> new ArrayList<>(com.trolmastercard.sexmod.server.PlayerModData.d))
                )
                .apply(var0, (var0x, var1) -> {
                    for (com.trolmastercard.sexmod.server.PlayerModData.a.b var3 : var0x) {
                        com.trolmastercard.sexmod.server.PlayerModData.a(var3.b, var3.c);
                        com.trolmastercard.sexmod.server.PlayerModData.c.put(var3.b, var3.d);
                    }

                    com.trolmastercard.sexmod.server.PlayerModData.d.addAll(var1);
                    return new com.trolmastercard.sexmod.server.PlayerModData.a();
                })
        );

        public CompoundTag save(CompoundTag var1, Provider var2) {
            a.encodeStart(NbtOps.INSTANCE, this).result().ifPresent(var1x -> var1.put("galathOwnership", var1x));
            return var1;
        }

        public static com.trolmastercard.sexmod.server.PlayerModData.a a(CompoundTag var0, Provider var1) {
            return a.parse(NbtOps.INSTANCE, var0.get("galathOwnership")).result().orElseGet(com.trolmastercard.sexmod.server.PlayerModData.a::new);
        }

        private static List<com.trolmastercard.sexmod.server.PlayerModData.a.b> a() {
            ArrayList var0 = new ArrayList();

            for (Entry var2 : com.trolmastercard.sexmod.server.PlayerModData.b.a()) {
                Long var3 = com.trolmastercard.sexmod.server.PlayerModData.c.get(var2.getKey());
                var0.add(new com.trolmastercard.sexmod.server.PlayerModData.a.b((UUID)var2.getKey(), (UUID)var2.getValue(), var3 == null ? 0L : var3));
            }

            return var0;
        }

        public static final class b {
            private final UUID b;
            private final UUID c;
            private final long d;
            static final Codec<com.trolmastercard.sexmod.server.PlayerModData.a.b> a = RecordCodecBuilder.create(
                var0 -> var0.group(
                        UUIDUtil.CODEC.fieldOf("master").forGetter(com.trolmastercard.sexmod.server.PlayerModData.a.b::a),
                        UUIDUtil.CODEC.fieldOf("galath").forGetter(com.trolmastercard.sexmod.server.PlayerModData.a.b::b),
                        Codec.LONG.fieldOf("lastcumdosage").forGetter(com.trolmastercard.sexmod.server.PlayerModData.a.b::c)
                    )
                    .apply(var0, com.trolmastercard.sexmod.server.PlayerModData.a.b::new)
            );

            public b(UUID var1, UUID var2, long var3) {
                this.b = var1;
                this.c = var2;
                this.d = var3;
            }

            public UUID a() {
                return this.b;
            }

            public UUID b() {
                return this.c;
            }

            public long c() {
                return this.d;
            }
        }
    }
}
