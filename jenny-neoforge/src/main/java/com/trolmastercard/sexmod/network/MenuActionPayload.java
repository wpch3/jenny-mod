package com.trolmastercard.sexmod.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record MenuActionPayload() implements CustomPacketPayload {
    private final int c;
    private final String d;
    public static final Type<MenuActionPayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "menu_action"));
    public static final StreamCodec<RegistryFriendlyByteBuf, MenuActionPayload> b = StreamCodec.composite(ByteBufCodecs.VAR_INT, MenuActionPayload::a, ByteBufCodecs.STRING_UTF8, MenuActionPayload::b, MenuActionPayload::new);

    public MenuActionPayload(int var1, String var2) {
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
