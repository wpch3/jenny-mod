package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record e() implements CustomPacketPayload {
    public static final Type<e> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "end_scene"));
    public static final StreamCodec<RegistryFriendlyByteBuf, e> b = StreamCodec.unit(new e());

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }
}
