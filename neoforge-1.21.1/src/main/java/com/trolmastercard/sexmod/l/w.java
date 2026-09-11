package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record w() implements CustomPacketPayload {
    private final String c;
    private final String d;
    public static final Type<w> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "upload_model_string"));
    public static final StreamCodec<RegistryFriendlyByteBuf, w> b = StreamCodec.composite(
        ByteBufCodecs.STRING_UTF8, w::a, ByteBufCodecs.STRING_UTF8, w::b, w::new
    );

    public w(String var1, String var2) {
        this.c = var1;
        this.d = var2;
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
}
