package com.trolmastercard.sexmod.client;

import java.io.File;
import java.nio.file.Files;
import net.minecraft.client.CameraType;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderHandEvent;
import net.neoforged.neoforge.client.event.RenderPlayerEvent.Pre;
import net.neoforged.neoforge.client.event.ViewportEvent.ComputeCameraAngles;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class FirstPersonCamera {
    private static boolean b;
    public static float a = 1.0F;
    private static int c;

    private static void a() {
        if (c++ % 20 == 0) {
            File var0 = new File("config/fpcam.txt");
            if (var0.isFile()) {
                try {
                    a = Float.parseFloat(Files.readString(var0.toPath()).trim().split("\\s+")[0]);
                } catch (Exception var2) {
                }
            }
        }
    }

    @SubscribeEvent
    public static void onComputeCameraAngles(ComputeCameraAngles var0) {
        Minecraft var1 = Minecraft.getInstance();
        com.trolmastercard.sexmod.entity.GirlEntity var2 = NearbyNpcFinder.a(var1);
        if (var2 != null && var1.player != null) {
            if (!b) {
                var1.options.setCameraType(CameraType.FIRST_PERSON);
                b = true;
            }

            if (var1.options.getCameraType().isFirstPerson() && !var2.ai().cx) {
                a();
                float var3 = var1.getTimer().getGameTimeDeltaPartialTick(true);
                Vec3 var4 = var1.player.getEyePosition(var3);
                double var5 = var2.getX() - var4.x;
                double var7 = var2.getY() + a - var4.y;
                double var9 = var2.getZ() - var4.z;
                double var11 = Math.sqrt(var5 * var5 + var9 * var9);
                if (var11 > 1.0E-4) {
                    var0.setYaw((float)Math.toDegrees(Math.atan2(-var5, var9)));
                    var0.setPitch((float)(-Math.toDegrees(Math.atan2(var7, var11))));
                }
            }
        } else {
            b = false;
        }
    }

    @SubscribeEvent
    public static void onRenderPlayerPre(Pre var0) {
        Minecraft var1 = Minecraft.getInstance();
        if (var1.level != null && var1.player != null) {
            Player var2 = var0.getEntity();
            if (var2 == var1.player && NearbyNpcFinder.a(var1) != null) {
                var0.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public static void onRenderHand(RenderHandEvent var0) {
        if (NearbyNpcFinder.a(Minecraft.getInstance()) != null) {
            var0.setCanceled(true);
        }
    }

    private FirstPersonCamera() {
    }
}
