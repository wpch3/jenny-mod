package com.trolmastercard.sexmod.l;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record m() implements CustomPacketPayload {
    private final String c;
    private final String d;
    private final boolean e;
    private final boolean f;
    public static final Type<m> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "request_sit_npc"));
    public static final StreamCodec<RegistryFriendlyByteBuf, m> b = StreamCodec.composite(
        ByteBufCodecs.STRING_UTF8, m::a, ByteBufCodecs.STRING_UTF8, m::b, ByteBufCodecs.BOOL, m::c, ByteBufCodecs.BOOL, m::d, m::new
    );

    public m(String var1, String var2, boolean var3, boolean var4) {
        this.c = var1;
        this.d = var2;
        this.e = var3;
        this.f = var4;
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

    public boolean c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }
}
