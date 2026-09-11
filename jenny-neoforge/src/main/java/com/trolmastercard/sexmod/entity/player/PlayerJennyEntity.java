package com.trolmastercard.sexmod.entity.player;

import com.trolmastercard.sexmod.entity.FriendlySlimeEntity;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class PlayerJennyEntity extends PlayerGirlEntity {
    public PlayerJennyEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(1.64F);
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.i) {
            Player var2 = this.e();
            if (var2 != null && var2.distanceToSqr(this.l().x, this.l().y, this.l().z) < 1.0) {
                if (this.e(var2.getUUID())) {
                    var2.displayClientMessage(Component.literal("sowy no lesbo action yet uwu").withStyle(ChatFormatting.DARK_PURPLE), false);
                } else {
                    this.q(var2.getUUID());
                    var2.teleportTo(this.position().x, this.l().y, this.position().z);
                    var2.getAbilities().flying = true;
                    var2.onUpdateAbilities();
                    Player var3 = this.q();
                    if (var3 != null) {
                        var3.getAbilities().flying = true;
                        var3.onUpdateAbilities();
                    }

                    this.a(0.0, 0.0, 0.4, 0.0F, 60.0F);
                    this.ah = null;
                    this.c(com.trolmastercard.sexmod.entity.ScenePose.j);
                }
            }
        }
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[]{"action.names.blowjob", "action.names.boobjob"}, false);
        return true;
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        return switch (var1) {
            case b -> com.trolmastercard.sexmod.entity.ScenePose.c;
            case c -> com.trolmastercard.sexmod.entity.ScenePose.f;
            case f -> com.trolmastercard.sexmod.entity.ScenePose.e;
            case h -> com.trolmastercard.sexmod.entity.ScenePose.j;
            case j -> com.trolmastercard.sexmod.entity.ScenePose.k;
            case k -> com.trolmastercard.sexmod.entity.ScenePose.l;
            case l -> com.trolmastercard.sexmod.entity.ScenePose.m;
            case G -> com.trolmastercard.sexmod.entity.ScenePose.I;
            case I -> com.trolmastercard.sexmod.entity.ScenePose.J;
            case J -> com.trolmastercard.sexmod.entity.ScenePose.L;
            default -> null;
        };
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose b(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.c || var1 == com.trolmastercard.sexmod.entity.ScenePose.f) {
            this.a(0.0, 0.0, 0.0, 0.0F, 70.0F);
            return com.trolmastercard.sexmod.entity.ScenePose.e;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.k || var1 == com.trolmastercard.sexmod.entity.ScenePose.l) {
            return com.trolmastercard.sexmod.entity.ScenePose.m;
        } else {
            return var1 != com.trolmastercard.sexmod.entity.ScenePose.J && var1 != com.trolmastercard.sexmod.entity.ScenePose.I ? null : com.trolmastercard.sexmod.entity.ScenePose.L;
        }
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        com.trolmastercard.sexmod.entity.ScenePose var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.entity.ScenePose.m || var1 != com.trolmastercard.sexmod.entity.ScenePose.k && var1 != com.trolmastercard.sexmod.entity.ScenePose.l) {
            if (var2 != com.trolmastercard.sexmod.entity.ScenePose.e || var1 != com.trolmastercard.sexmod.entity.ScenePose.f && var1 != com.trolmastercard.sexmod.entity.ScenePose.c) {
                if (var2 != com.trolmastercard.sexmod.entity.ScenePose.L || var1 != com.trolmastercard.sexmod.entity.ScenePose.I && var1 != com.trolmastercard.sexmod.entity.ScenePose.J) {
                    super.c(var1);
                }
            }
        }
    }

    @Override
    protected PlayState a(AnimationState<com.trolmastercard.sexmod.entity.GirlEntity> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a && this.ai().cq) {
                    this.a("animation.jenny.fhappy", true, var1);
                } else {
                    this.a("animation.jenny.null", true, var1);
                }
                break;
            case "movement":
                if (this.ai() != null && this.ai().cp) {
                    return PlayState.STOP;
                }

                if (this.ai() != null && this.ai() != com.trolmastercard.sexmod.entity.ScenePose.a) {
                    this.a("animation.jenny.sit", true, var1);
                } else {
                    this.a("animation.jenny.idle", true, var1);
                }
                break;
            case "action":
                switch (this.ai()) {
                    case b:
                        this.a("animation.jenny.blowjobintro", true, var1);
                        break;
                    case c:
                        this.a("animation.jenny.blowjobsuck", true, var1);
                        break;
                    case f:
                        this.a("animation.jenny.blowjobthrust", true, var1);
                        break;
                    case h:
                        this.a("animation.jenny.doggygoonbed", true, var1);
                        break;
                    case j:
                        this.a("animation.jenny.doggystart", true, var1);
                        break;
                    case k:
                        this.a("animation.jenny.doggyslow", true, var1);
                        break;
                    case l:
                        this.a("animation.jenny.doggyfast_hard", true, var1);
                        break;
                    case G:
                        this.a("animation.jenny.paizuri_start", true, var1);
                        break;
                    case I:
                        this.a("animation.jenny.paizuri_slow", true, var1);
                        break;
                    case J:
                        this.a("animation.jenny.paizuri_fast", true, var1);
                        break;
                    case n:
                        this.a("animation.jenny.strip", true, var1);
                        break;
                    case e:
                        this.a("animation.jenny.blowjobcum", true, var1);
                        break;
                    case i:
                        this.a("animation.jenny.doggywait", true, var1);
                        break;
                    case m:
                        this.a("animation.jenny.doggycum", true, var1);
                        break;
                    case L:
                        this.a("animation.jenny.paizuri_cum", true, var1);
                }
        }

        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(ControllerRegistrar var1) {
        super.registerControllers(var1);
        this.aB.setSoundKeyframeHandler(var0 -> {});
    }
}
