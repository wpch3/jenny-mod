package com.trolmastercard.sexmod.b;

import java.util.UUID;
import net.minecraft.client.Minecraft;

public final class j {
    public static com.trolmastercard.sexmod.f.b.k a(Minecraft var0) {
        if (var0.player != null && var0.level != null) {
            UUID var1 = var0.player.getUUID();

            for (com.trolmastercard.sexmod.f.b.k var3 : var0.level
                .getEntitiesOfClass(com.trolmastercard.sexmod.f.b.k.class, var0.player.getBoundingBox().inflate(8.0))) {
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
