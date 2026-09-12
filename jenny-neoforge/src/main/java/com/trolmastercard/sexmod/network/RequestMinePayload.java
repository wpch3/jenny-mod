package com.trolmastercard.sexmod.network;

import java.util.HashSet;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public final class RequestMinePayload implements CustomPacketPayload {
    private final int c;
    private final int d;
    private final int e;
    private final String f;
    public static final Type<RequestMinePayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "request_mine"));
    public static final StreamCodec<RegistryFriendlyByteBuf, RequestMinePayload> b = StreamCodec.composite(
        ByteBufCodecs.INT, RequestMinePayload::c, ByteBufCodecs.INT, RequestMinePayload::d, ByteBufCodecs.INT, RequestMinePayload::e, ByteBufCodecs.STRING_UTF8, RequestMinePayload::f, RequestMinePayload::new
    );

    public RequestMinePayload(BlockPos var1, Direction var2) {
        this(var1.getX(), var1.getY(), var1.getZ(), var2.getSerializedName());
    }

    public RequestMinePayload(int var1, int var2, int var3, String var4) {
        this.c = var1;
        this.d = var2;
        this.e = var3;
        this.f = var4;
    }

    public BlockPos a() {
        return new BlockPos(this.c, this.d, this.e);
    }

    public Direction b() {
        Direction var1 = Direction.byName(this.f);
        return var1 != null ? var1 : Direction.NORTH;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public static BlockPos a(Direction var0) {
        Vec3i var1 = var0.getNormal();
        return new BlockPos(var1.getZ(), var1.getY(), -var1.getX());
    }

    public static HashSet<BlockPos> a(BlockPos var0, Direction var1) {
        HashSet var2 = new HashSet();
        BlockPos var3 = var0;
        BlockPos var4 = a(var1);

        for (int var5 = 0; var5 < 30; var5++) {
            var2.add(var3.offset(var4));
            var2.add(var3.offset(var4).above());
            var2.add(var3.offset(var4).above().above());
            var2.add(var3);
            var2.add(var3.above());
            var2.add(var3.above().above());
            var2.add(var3.offset(-var4.getX(), -var4.getY(), -var4.getZ()));
            var2.add(var3.offset(-var4.getX(), -var4.getY(), -var4.getZ()).above());
            var2.add(var3.offset(-var4.getX(), -var4.getY(), -var4.getZ()).above().above());
            var3 = var3.relative(var1);
        }

        return var2;
    }
}
