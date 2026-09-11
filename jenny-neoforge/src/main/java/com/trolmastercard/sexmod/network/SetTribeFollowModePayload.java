package com.trolmastercard.sexmod.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record SetTribeFollowModePayload() implements CustomPacketPayload {
    private final boolean c;
    public static final Type<SetTribeFollowModePayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "set_tribe_follow_mode"));
    public static final StreamCodec<RegistryFriendlyByteBuf, SetTribeFollowModePayload> b = StreamCodec.composite(ByteBufCodecs.BOOL, SetTribeFollowModePayload::a, SetTribeFollowModePayload::new);

    public SetTribeFollowModePayload(boolean var1) {
        this.c = var1;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public boolean a() {
        return this.c;
    }
}
