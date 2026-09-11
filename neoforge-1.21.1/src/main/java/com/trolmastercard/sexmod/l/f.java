package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record f() implements CustomPacketPayload {
    private final int c;
    private final String d;
    public static final Type<f> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "menu_action"));
    public static final StreamCodec<RegistryFriendlyByteBuf, f> b = StreamCodec.composite(ByteBufCodecs.VAR_INT, f::a, ByteBufCodecs.STRING_UTF8, f::b, f::new);

    public f(int var1, String var2) {
        this.c = var1;
        this.d = var2;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public int a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }
}
