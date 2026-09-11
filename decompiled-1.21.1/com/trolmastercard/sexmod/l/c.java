package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record c() implements CustomPacketPayload {
    private final String c;
    private final String d;
    private final String e;
    public static final Type<c> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "claim_tribe"));
    public static final StreamCodec<RegistryFriendlyByteBuf, c> b = StreamCodec.composite(
        ByteBufCodecs.STRING_UTF8, c::a, ByteBufCodecs.STRING_UTF8, c::b, ByteBufCodecs.STRING_UTF8, c::c, c::new
    );

    public c(String var1, String var2, String var3) {
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

    public String b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }
}
