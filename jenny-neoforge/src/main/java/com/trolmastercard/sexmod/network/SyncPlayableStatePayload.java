package com.trolmastercard.sexmod.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public final class SyncPlayableStatePayload implements CustomPacketPayload {
    private final String c;
    private final int d;
    private final String e;
    public static final Type<SyncPlayableStatePayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "sync_playable_state"));
    public static final StreamCodec<RegistryFriendlyByteBuf, SyncPlayableStatePayload> b = StreamCodec.composite(
        ByteBufCodecs.STRING_UTF8, SyncPlayableStatePayload::a, ByteBufCodecs.VAR_INT, SyncPlayableStatePayload::b, ByteBufCodecs.STRING_UTF8, SyncPlayableStatePayload::c, SyncPlayableStatePayload::new
    );

    public SyncPlayableStatePayload(String var1, int var2, String var3) {
        this.c = var1;
        this.d = var2;
        this.e = var3;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }
}
