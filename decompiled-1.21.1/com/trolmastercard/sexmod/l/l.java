package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record l() implements CustomPacketPayload {
    private final String c;
    public static final Type<l> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "request_npc_action"));
    public static final StreamCodec<RegistryFriendlyByteBuf, l> b = StreamCodec.composite(ByteBufCodecs.STRING_UTF8, l::a, l::new);

    public l(String var1) {
        this.c = var1;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public String a() {
        return this.c;
    }
}
