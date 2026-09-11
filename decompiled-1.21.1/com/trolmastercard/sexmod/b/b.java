package com.trolmastercard.sexmod.b;

import com.trolmastercard.sexmod.Main;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.client.CameraType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.PacketDistributor;

public final class b {
    @Nullable
    public static UUID a() {
        LocalPlayer var0 = Minecraft.getInstance().player;
        return var0 == null ? null : var0.getUUID();
    }

    public static boolean a(@Nullable UUID var0) {
        LocalPlayer var1 = Minecraft.getInstance().player;
        return var1 != null && var0 != null && var1.getUUID().equals(var0);
    }

    @Nullable
    public static Player b() {
        return Minecraft.getInstance().player;
    }

    public static void a(Component var0) {
        LocalPlayer var1 = Minecraft.getInstance().player;
        if (var1 != null) {
            var1.displayClientMessage(var0, false);
        }
    }

    public static void a(CustomPacketPayload var0) {
        PacketDistributor.sendToServer(var0, new CustomPacketPayload[0]);
    }

    public static boolean c() {
        return g.a();
    }

    public static void d() {
        g.b();
    }

    public static void a(com.trolmastercard.sexmod.f.b.k var0) {
        com.trolmastercard.sexmod.h.c.a(var0);
    }

    public static void a(Map<com.trolmastercard.sexmod.f.h, String> var0) {
        Main.a.debug("PacketSyncNpcSpecifics received ({} forms) \u2014 GuiCharacterSelect deferred", var0.size());
    }

    public static void a(com.trolmastercard.sexmod.f.b.k var0, Player var1, String[] var2, @Nullable ItemStack[] var3, boolean var4) {
        Minecraft.getInstance().setScreen(new com.trolmastercard.sexmod.h.h(var0, var1, var2, var3, var4));
    }

    public static void a(List<com.trolmastercard.sexmod.f.b.k> var0) {
        ClientLevel var1 = Minecraft.getInstance().level;
        if (var1 != null) {
            for (Entity var3 : var1.entitiesForRendering()) {
                if (var3 instanceof com.trolmastercard.sexmod.f.b.k var4) {
                    var0.add(var4);
                }
            }
        }
    }

    public static void e() {
        Minecraft.getInstance().options.setCameraType(CameraType.THIRD_PERSON_FRONT);
    }

    public static void f() {
        LocalPlayer var0 = Minecraft.getInstance().player;
        if (var0 != null) {
            var0.setInvisible(false);
            var0.setNoGravity(false);
            var0.noPhysics = false;
        }
    }

    public static void a(com.trolmastercard.sexmod.f.b.e var0) {
        Vec3 var1 = (var0.an() ? var0.am() : var0.position()).add(0.0, 1.5, 0.0);
        RandomSource var2 = var0.getRandom();

        for (int var3 = 0; var3 < 100; var3++) {
            double var4 = (var2.nextFloat() * 2.0F - 1.0F) * 1.5;
            double var6 = (var2.nextFloat() * 2.0F - 1.0F) * 1.5;
            double var8 = (var2.nextFloat() * 2.0F - 1.0F) * 1.5;
            var0.level().addParticle(ParticleTypes.DRAGON_BREATH, var1.x + var4, var1.y + var6, var1.z + var8, var4 * -0.03, var6 * -0.03, var8 * -0.03);
        }
    }

    public static void b(com.trolmastercard.sexmod.f.b.e var0) {
        Vec3 var1 = var0.position();
        RandomSource var2 = var0.getRandom();
        float var3 = com.trolmastercard.sexmod.m.a.a(1.8F);

        for (float var4 = 0.0F; var4 < (float) (Math.PI * 2); var4 += var3) {
            double var5 = Math.sin(var4);
            double var7 = Math.cos(var4);
            var0.level().addParticle(ParticleTypes.SMOKE, var1.x + var5 * 0.5, var1.y, var1.z + var7 * 0.5, var5 * 0.15, var2.nextDouble() * 0.15, var7 * 0.15);
        }
    }

    public static void g() {
        if (Minecraft.getInstance().hitResult instanceof BlockHitResult var1) {
            BlockPos var2 = var1.getBlockPos();
            Direction var3 = var1.getDirection() != null ? var1.getDirection().getOpposite() : Direction.NORTH;
            com.trolmastercard.sexmod.h.g.a(var2, var3);
        }
    }
}
