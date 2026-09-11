package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record o() implements CustomPacketPayload {
    private final String c;
    public static final Type<o> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "send_chat_message"));
    public static final StreamCodec<RegistryFriendlyByteBuf, o> b = StreamCodec.composite(ByteBufCodecs.STRING_UTF8, o::a, o::new);

    public o(String var1) {
        this.c = var1;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public String a() {
        return this.c;
    }
}
