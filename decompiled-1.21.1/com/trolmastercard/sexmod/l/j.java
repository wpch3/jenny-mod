package com.trolmastercard.sexmod.l;

import net.minecraft.core.BlockPos;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record j() implements CustomPacketPayload {
    private final int c;
    private final int d;
    private final int e;
    public static final Type<j> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "request_cancel_task"));
    public static final StreamCodec<RegistryFriendlyByteBuf, j> b = StreamCodec.composite(
        ByteBufCodecs.INT, j::b, ByteBufCodecs.INT, j::c, ByteBufCodecs.INT, j::d, j::new
    );

    public j(BlockPos var1) {
        this(var1.getX(), var1.getY(), var1.getZ());
    }

    public j(int var1, int var2, int var3) {
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
