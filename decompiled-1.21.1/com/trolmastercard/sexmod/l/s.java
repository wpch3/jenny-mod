package com.trolmastercard.sexmod.l;

import net.minecraft.core.BlockPos;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record s() implements CustomPacketPayload {
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    public static final Type<s> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "sync_blocks"));
    public static final StreamCodec<RegistryFriendlyByteBuf, s> b = StreamCodec.composite(
        ByteBufCodecs.INT, s::a, ByteBufCodecs.INT, s::b, ByteBufCodecs.INT, s::c, ByteBufCodecs.BOOL, s::d, s::new
    );

    public s(BlockPos var1, boolean var2) {
        this(var1.getX(), var1.getY(), var1.getZ(), var2);
    }

    public s(int var1, int var2, int var3, boolean var4) {
        this.c = var1;
        this.d = var2;
        this.e = var3;
        this.f = var4;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }
}
