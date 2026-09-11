package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record b() implements CustomPacketPayload {
    private final boolean c;
    public static final Type<b> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "advance_scene"));
    public static final StreamCodec<RegistryFriendlyByteBuf, b> b = StreamCodec.composite(ByteBufCodecs.BOOL, b::a, b::new);

    public b(boolean var1) {
        this.c = var1;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public boolean a() {
        return this.c;
    }
}
