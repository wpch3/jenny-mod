package com.trolmastercard.sexmod.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public final class ClaimTribePayload implements CustomPacketPayload {
    private final String c;
    private final String d;
    private final String e;
    public static final Type<ClaimTribePayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "claim_tribe"));
    public static final StreamCodec<RegistryFriendlyByteBuf, ClaimTribePayload> b = StreamCodec.composite(
        ByteBufCodecs.STRING_UTF8, ClaimTribePayload::a, ByteBufCodecs.STRING_UTF8, ClaimTribePayload::b, ByteBufCodecs.STRING_UTF8, ClaimTribePayload::c, ClaimTribePayload::new
    );

    public ClaimTribePayload(String var1, String var2, String var3) {
        this.c = var1;
        this.d = var2;
        this.e = var3;
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

    public String c() {
        return this.e;
    }
}
