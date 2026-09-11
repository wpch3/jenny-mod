package com.trolmastercard.sexmod.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record EndScenePayload() implements CustomPacketPayload {
    public static final Type<EndScenePayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "end_scene"));
    public static final StreamCodec<RegistryFriendlyByteBuf, EndScenePayload> b = StreamCodec.unit(new EndScenePayload());

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }
}
