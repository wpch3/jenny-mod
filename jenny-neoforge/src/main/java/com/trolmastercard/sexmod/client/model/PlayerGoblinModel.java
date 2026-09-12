package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.entity.player.PlayerGoblinEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;

public class PlayerGoblinModel extends GirlModel<PlayerGoblinEntity> {
    public PlayerGoblinModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{ResourceLocation.fromNamespaceAndPath("sexmod", "goblin/goblin"), ResourceLocation.fromNamespaceAndPath("sexmod", "goblin/armored")};
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/goblin/goblin.png");
    }

    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "goblin/goblin");
    }

    @Override
    public void setCustomAnimations(PlayerGoblinEntity entity, long instanceId, AnimationState<PlayerGoblinEntity> state) {
        super.setCustomAnimations(entity, instanceId, state);
        AnimationProcessor<PlayerGoblinEntity> proc = this.getAnimationProcessor();
        GeoBone preggy = proc.getBone("s");
        if (preggy != null) {
            preggy.setHidden(true);
        }
        GoblinModelEffects.applyThrowAndTracking(entity, proc, state, entity.ai(), false, entity.C());
    }

    // ci.f: fall back to the owner's skin when the girl has none of her own.
    @Override
    protected boolean e(PlayerGoblinEntity var1) {
        java.util.UUID skinId = var1.al() != null ? var1.al() : var1.ax();
        if (skinId == null) {
            return true;
        }
        net.minecraft.world.entity.player.Player player = var1.level().getPlayerByUUID(skinId);
        if (player instanceof net.minecraft.client.player.AbstractClientPlayer clientPlayer) {
            return clientPlayer.getSkin().model() == net.minecraft.client.resources.PlayerSkin.Model.WIDE;
        }
        return true;
    }

    // Official ci groups (shared with the NPC model; g stays empty).
    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorBoobL", "armorBoobR"};
    }

    @Override
    public String[] a() {
        return new String[]{"nippleL", "nippleR"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorCheekR", "armorCheekL", "armorLegL", "armorLegR", "armorShinL", "armorShinR", "armorTorso"};
    }

    @Override
    public String[] e() {
        return new String[]{"fuckhole", "vagina", "meatCheekR", "meatCheekL", "meatLegL", "meatLegR", "meatShinL", "meatShinR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorFootL", "armorFootR"};
    }

    @Override
    public String[] d() {
        return new String[]{"meatFootL", "meatFootR"};
    }

}
