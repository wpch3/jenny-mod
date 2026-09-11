package com.trolmastercard.sexmod.l;

import net.minecraft.core.BlockPos;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record d() implements CustomPacketPayload {
    private final int c;
    private final int d;
    private final int e;
    public static final Type<d> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "do_fell_tree"));
    public static final StreamCodec<RegistryFriendlyByteBuf, d> b = StreamCodec.composite(
        ByteBufCodecs.INT, d::b, ByteBufCodecs.INT, d::c, ByteBufCodecs.INT, d::d, d::new
    );

    public d(BlockPos var1) {
        this(var1.getX(), var1.getY(), var1.getZ());
    }

    public d(int var1, int var2, int var3) {
        this.c = var1;
        this.d = var2;
        this.e = var3;
    }

    public BlockPos a() {
        return new BlockPos(this.c, this.d, this.e);
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }
}
