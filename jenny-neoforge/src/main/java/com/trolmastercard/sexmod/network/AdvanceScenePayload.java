package com.trolmastercard.sexmod.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public final class AdvanceScenePayload implements CustomPacketPayload {
    private final boolean c;
    public static final Type<AdvanceScenePayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "advance_scene"));
    public static final StreamCodec<RegistryFriendlyByteBuf, AdvanceScenePayload> b = StreamCodec.composite(ByteBufCodecs.BOOL, AdvanceScenePayload::a, AdvanceScenePayload::new);

    public AdvanceScenePayload(boolean var1) {
        this.c = var1;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public boolean a() {
        return this.c;
    }
}
