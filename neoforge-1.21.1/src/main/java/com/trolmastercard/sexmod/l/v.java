package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record v() implements CustomPacketPayload {
    private final String c;
    private final int d;
    private final String e;
    public static final Type<v> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "sync_playable_state"));
    public static final StreamCodec<RegistryFriendlyByteBuf, v> b = StreamCodec.composite(
        ByteBufCodecs.STRING_UTF8, v::a, ByteBufCodecs.VAR_INT, v::b, ByteBufCodecs.STRING_UTF8, v::c, v::new
    );

    public v(String var1, int var2, String var3) {
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
