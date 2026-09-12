package com.trolmastercard.sexmod.client;

import java.util.UUID;
import net.minecraft.client.Minecraft;

public final class NearbyNpcFinder {
    public static com.trolmastercard.sexmod.entity.GirlEntity a(Minecraft var0) {
        if (var0.player != null && var0.level != null) {
            UUID var1 = var0.player.getUUID();

            for (com.trolmastercard.sexmod.entity.GirlEntity var3 : var0.level
                .getEntitiesOfClass(com.trolmastercard.sexmod.entity.GirlEntity.class, var0.player.getBoundingBox().inflate(8.0))) {
                if (var1.equals(var3.al()) && var3.ai().cp) {
                    return var3;
                }
            }

            return null;
        } else {
            return null;
        }
    }
}
