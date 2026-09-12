package com.trolmastercard.sexmod.client;

import com.trolmastercard.sexmod.client.renderer.PlayerJennyRenderer;
import com.trolmastercard.sexmod.client.renderer.PlayerKoboldRenderer;
import com.trolmastercard.sexmod.client.renderer.PlayerLunaRenderer;
import com.trolmastercard.sexmod.client.renderer.PlayerSlimeRenderer;
import com.trolmastercard.sexmod.client.renderer.SlimeGirlRenderer;
import com.trolmastercard.sexmod.client.renderer.GoblinRenderer;
import com.trolmastercard.sexmod.client.renderer.JennyRenderer;
import com.trolmastercard.sexmod.client.renderer.KoboldRenderer;
import com.trolmastercard.sexmod.client.renderer.KoboldEggRenderer;
import com.trolmastercard.sexmod.client.renderer.LunaRenderer;
import com.trolmastercard.sexmod.client.renderer.LunaHookRenderer;
import com.trolmastercard.sexmod.client.renderer.ManglelieRenderer;
import com.trolmastercard.sexmod.client.renderer.PlayerAllieRenderer;
import com.trolmastercard.sexmod.client.renderer.PlayerBeeRenderer;
import com.trolmastercard.sexmod.client.renderer.PlayerBiaRenderer;
import com.trolmastercard.sexmod.client.renderer.PlayerEllieRenderer;
import com.trolmastercard.sexmod.client.renderer.PlayerGalathRenderer;
import com.trolmastercard.sexmod.client.renderer.PlayerGoblinRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterRenderers;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class ClientSetup {
    @SubscribeEvent
    public static void registerMenuScreens(RegisterMenuScreensEvent var0) {
        var0.register((MenuType)com.trolmastercard.sexmod.registry.ModMenus.b.get(), com.trolmastercard.sexmod.client.gui.NpcEquipmentScreen::new);
        var0.register((MenuType)com.trolmastercard.sexmod.registry.ModMenus.c.get(), com.trolmastercard.sexmod.client.gui.NpcStorageScreen::new);
    }

    @SubscribeEvent
    public static void registerRenderers(RegisterRenderers var0) {
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.b.get(), JennyRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.c.get(), PlayerJennyRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.d.get(), PlayerEllieRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.e.get(), PlayerSlimeRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.f.get(), PlayerBiaRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.g.get(), PlayerBeeRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.h.get(), PlayerAllieRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.i.get(), PlayerLunaRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.j.get(), PlayerGalathRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.k.get(), PlayerKoboldRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.l.get(), PlayerGoblinRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.m.get(), com.trolmastercard.sexmod.client.renderer.EllieRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.n.get(), com.trolmastercard.sexmod.client.renderer.BiaRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.o.get(), SlimeGirlRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.p.get(), com.trolmastercard.sexmod.client.renderer.BeeRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.q.get(), com.trolmastercard.sexmod.client.renderer.AllieRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.r.get(), LunaRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.s.get(), ManglelieRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.t.get(), com.trolmastercard.sexmod.client.renderer.GalathRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.u.get(), KoboldRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.v.get(), GoblinRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.w.get(), com.trolmastercard.sexmod.client.renderer.CustomModelEntityRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.x.get(), com.trolmastercard.sexmod.client.renderer.FriendlySlimeRenderer::new);

        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.z.get(), LunaHookRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.A.get(), com.trolmastercard.sexmod.client.renderer.EnergyBallRenderer::new);
        var0.registerEntityRenderer((EntityType)com.trolmastercard.sexmod.registry.ModEntities.B.get(), KoboldEggRenderer::new);
    }

    private ClientSetup() {
    }
}
