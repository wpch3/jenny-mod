package com.trolmastercard.sexmod.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record NotifyGalathCoinGiftPayload() implements CustomPacketPayload {
    private final String c;
    private final String d;
    public static final Type<NotifyGalathCoinGiftPayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "notify_galath_coin_gift"));
    public static final StreamCodec<RegistryFriendlyByteBuf, NotifyGalathCoinGiftPayload> b = StreamCodec.composite(
        ByteBufCodecs.STRING_UTF8, NotifyGalathCoinGiftPayload::a, ByteBufCodecs.STRING_UTF8, NotifyGalathCoinGiftPayload::b, NotifyGalathCoinGiftPayload::new
    );

    public NotifyGalathCoinGiftPayload(String var1, String var2) {
        this.c = var1;
        this.d = var2;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }
}
