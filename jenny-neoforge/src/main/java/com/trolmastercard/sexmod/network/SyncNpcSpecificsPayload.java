package com.trolmastercard.sexmod.network;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;

public record SyncNpcSpecificsPayload() implements CustomPacketPayload {
    private final Map<com.trolmastercard.sexmod.entity.NpcType, String> c;
    public static final Type<SyncNpcSpecificsPayload> a = new Type(ResourceLocation.fromNamespaceAndPath("sexmod", "sync_npc_specifics"));
    public static final StreamCodec<RegistryFriendlyByteBuf, SyncNpcSpecificsPayload> b = StreamCodec.of((var0, var1) -> {
        var0.writeVarInt(var1.c.size());

        for (Entry var3 : var1.c.entrySet()) {
            ByteBufCodecs.STRING_UTF8.encode(var0, ((com.trolmastercard.sexmod.entity.NpcType)var3.getKey()).name());
            ByteBufCodecs.STRING_UTF8.encode(var0, (String)var3.getValue());
        }
    }, var0 -> {
        int var1 = var0.readVarInt();
        LinkedHashMap var2 = new LinkedHashMap();

        for (int var3 = 0; var3 < var1; var3++) {
            String var4 = (String)ByteBufCodecs.STRING_UTF8.decode(var0);
            String var5 = (String)ByteBufCodecs.STRING_UTF8.decode(var0);
            var2.put(com.trolmastercard.sexmod.entity.NpcType.a(var4), var5);
        }

        return new SyncNpcSpecificsPayload(var2);
    });

    public SyncNpcSpecificsPayload(Map<com.trolmastercard.sexmod.entity.NpcType, String> var1) {
        this.c = var1;
    }

    public Type<? extends CustomPacketPayload> type() {
        return a;
    }

    public Map<com.trolmastercard.sexmod.entity.NpcType, String> a() {
        return this.c;
    }
}
