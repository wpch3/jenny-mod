package com.trolmastercard.sexmod.network;

import java.util.UUID;
import net.minecraft.core.BlockPos;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public final class ResetPlayablePayload implements CustomPacketPayload {
    private final String c;
    private final boolean d;
    public static final Type<ResetPlayablePayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "reset_playable"));
    public static final StreamCodec<RegistryFriendlyByteBuf, ResetPlayablePayload> b = StreamCodec.composite(ByteBufCodecs.STRING_UTF8, ResetPlayablePayload::a, ByteBufCodecs.BOOL, ResetPlayablePayload::b, ResetPlayablePayload::new);

    public ResetPlayablePayload(UUID var1) {
        this(var1.toString(), false);
    }

    public ResetPlayablePayload(String var1, boolean var2) {
        this.c = var1;
        this.d = var2;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public static void a(com.trolmastercard.sexmod.entity.GirlEntity var0) {
        var0.a_();
        if (var0 instanceof com.trolmastercard.sexmod.entity.player.PlayerGirlEntity var1) {
            Player var2 = var1.p() == null ? null : var0.level().getPlayerByUUID(var1.p());
            if (var2 != null) {
                var0.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.at, 1);
                a(var2);
                var0.d(false);
                var0.c(com.trolmastercard.sexmod.entity.ScenePose.a);
                if (var0.al() != null) {
                    Player var3 = var0.level().getPlayerByUUID(var0.al());
                    if (var3 != null) {
                        a(var3);
                    }
                }
            }
        }

        var0.d(false);
        var0.q((UUID)null);
        var0.ah = null;
        var0.setNoGravity(false);
        var0.noPhysics = false;
        Vec3 var4 = a(var0.level(), var0.position());
        var0.teleportTo(var4.x, var4.y, var4.z);
    }

    public static void a(ServerPlayer var0) {
        if (var0 != null) {
            Vec3 var1 = a(var0.level(), var0.position());
            var0.teleportTo(var1.x, var1.y, var1.z);
            var0.setInvisible(false);
            a(var0);
        }
    }

    private static void a(Player var0) {
        var0.getAbilities().flying = false;
        var0.onUpdateAbilities();
        var0.setNoGravity(false);
        var0.noPhysics = false;
    }

    private static Vec3 a(Level var0, Vec3 var1) {
        while (!var0.getBlockState(BlockPos.containing(var1.x, var1.y, var1.z)).isAir()) {
            var1 = var1.add(0.0, 1.0, 0.0);
        }

        return var1;
    }

    public String a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }
}
