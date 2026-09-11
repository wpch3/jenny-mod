package com.trolmastercard.sexmod.b;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.Input;
import net.minecraft.world.phys.Vec3;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.MovementInputUpdateEvent;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class l {
    @SubscribeEvent
    public static void onMovementInput(MovementInputUpdateEvent var0) {
        Minecraft var1 = Minecraft.getInstance();
        if (var1.player != null && j.a(var1) != null) {
            Input var2 = var0.getInput();
            var2.forwardImpulse = 0.0F;
            var2.leftImpulse = 0.0F;
            var2.up = false;
            var2.down = false;
            var2.left = false;
            var2.right = false;
            var2.jumping = false;
            var2.shiftKeyDown = false;
            Vec3 var3 = var1.player.getDeltaMovement();
            var1.player.setDeltaMovement(0.0, var3.y, 0.0);
        }
    }

    private l() {
    }
}
