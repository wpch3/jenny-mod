package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record i() implements CustomPacketPayload {
    private final String c;
    public static final Type<i> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "open_bee_chest"));
    public static final StreamCodec<RegistryFriendlyByteBuf, i> b = StreamCodec.composite(ByteBufCodecs.STRING_UTF8, i::a, i::new);

    public i(String var1) {
        this.c = var1;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public String a() {
        return this.c;
    }
}
