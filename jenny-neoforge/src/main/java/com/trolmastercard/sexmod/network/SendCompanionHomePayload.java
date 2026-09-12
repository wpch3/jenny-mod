package com.trolmastercard.sexmod.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public final class SendCompanionHomePayload implements CustomPacketPayload {
    private final String c;
    public static final Type<SendCompanionHomePayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "send_companion_home"));
    public static final StreamCodec<RegistryFriendlyByteBuf, SendCompanionHomePayload> b = StreamCodec.composite(ByteBufCodecs.STRING_UTF8, SendCompanionHomePayload::a, SendCompanionHomePayload::new);

    public SendCompanionHomePayload(String var1) {
        this.c = var1;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public String a() {
        return this.c;
    }
}
