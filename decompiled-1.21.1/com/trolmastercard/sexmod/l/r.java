package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record r() implements CustomPacketPayload {
    private final boolean c;
    public static final Type<r> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "set_tribe_follow_mode"));
    public static final StreamCodec<RegistryFriendlyByteBuf, r> b = StreamCodec.composite(ByteBufCodecs.BOOL, r::a, r::new);

    public r(boolean var1) {
        this.c = var1;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public boolean a() {
        return this.c;
    }
}
