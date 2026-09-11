package com.trolmastercard.sexmod.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record SyncNpcDialoguePayload() implements CustomPacketPayload {
    private final String c;
    private final String d;
    private final String e;
    public static final Type<SyncNpcDialoguePayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "sync_npc_dialogue"));
    public static final StreamCodec<RegistryFriendlyByteBuf, SyncNpcDialoguePayload> b = StreamCodec.composite(
        ByteBufCodecs.STRING_UTF8, SyncNpcDialoguePayload::a, ByteBufCodecs.STRING_UTF8, SyncNpcDialoguePayload::b, ByteBufCodecs.STRING_UTF8, SyncNpcDialoguePayload::c, SyncNpcDialoguePayload::new
    );

    public SyncNpcDialoguePayload(String var1, String var2, String var3) {
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
