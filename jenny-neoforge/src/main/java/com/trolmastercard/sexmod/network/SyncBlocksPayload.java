package com.trolmastercard.sexmod.network;

import net.minecraft.core.BlockPos;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public final class SyncBlocksPayload implements CustomPacketPayload {
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    public static final Type<SyncBlocksPayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "sync_blocks"));
    public static final StreamCodec<RegistryFriendlyByteBuf, SyncBlocksPayload> b = StreamCodec.composite(
        ByteBufCodecs.INT, SyncBlocksPayload::a, ByteBufCodecs.INT, SyncBlocksPayload::b, ByteBufCodecs.INT, SyncBlocksPayload::c, ByteBufCodecs.BOOL, SyncBlocksPayload::d, SyncBlocksPayload::new
    );

    public SyncBlocksPayload(BlockPos var1, boolean var2) {
        this(var1.getX(), var1.getY(), var1.getZ(), var2);
    }

    public SyncBlocksPayload(int var1, int var2, int var3, boolean var4) {
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
