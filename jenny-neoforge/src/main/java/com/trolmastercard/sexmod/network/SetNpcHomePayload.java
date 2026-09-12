package com.trolmastercard.sexmod.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public final class SetNpcHomePayload implements CustomPacketPayload {
    private final String c;
    private final double d;
    private final double e;
    private final double f;
    public static final Type<SetNpcHomePayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "set_npc_home"));
    public static final StreamCodec<RegistryFriendlyByteBuf, SetNpcHomePayload> b = StreamCodec.composite(
        ByteBufCodecs.STRING_UTF8, SetNpcHomePayload::a, ByteBufCodecs.DOUBLE, SetNpcHomePayload::b, ByteBufCodecs.DOUBLE, SetNpcHomePayload::c, ByteBufCodecs.DOUBLE, SetNpcHomePayload::d, SetNpcHomePayload::new
    );

    public SetNpcHomePayload(String var1, double var2, double var4, double var6) {
        this.c = var1;
        this.d = var2;
        this.e = var4;
        this.f = var6;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public String a() {
        return this.c;
    }

    public double b() {
        return this.d;
    }

    public double c() {
        return this.e;
    }

    public double d() {
        return this.f;
    }
}
