package com.trolmastercard.sexmod.entity.player;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class PlayerAllieEntity extends com.trolmastercard.sexmod.entity.player.PlayerGirlEntity {
    public float l = 0.0F;
    Player m = null;
    boolean n = false;
    int o = 1;
    int p = 1;

    public PlayerAllieEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(1.63F);
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[]{"action.names.deepthroat", "Reverse cowgirl"}, false);
        return true;
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        com.trolmastercard.sexmod.entity.ScenePose var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.entity.ScenePose.ak || var1 != com.trolmastercard.sexmod.entity.ScenePose.aj && var1 != com.trolmastercard.sexmod.entity.ScenePose.ai) {
            if (var2 != com.trolmastercard.sexmod.entity.ScenePose.bD
                || var1 != com.trolmastercard.sexmod.entity.ScenePose.bA && var1 != com.trolmastercard.sexmod.entity.ScenePose.bB && var1 != com.trolmastercard.sexmod.entity.ScenePose.bC) {
                super.c(var1);
            }
        }
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        if (this.p() != null) {
            Player var2 = this.level().getPlayerByUUID(this.p());
            if (var2 != null && this.m == null) {
                this.a(true);
            }

            this.m = var2;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide()) {
            this.u();
        }
    }

    void u() {
        if (this.tickCount % 10 == 0) {
            int var1 = this.getRandom().nextInt(8);
            Vec3 var2 = this.e("tail" + var1).add(this.position());
            this.level()
                .addParticle(
                    ParticleTypes.PORTAL,
                    var2.x,
                    var2.y,
                    var2.z,
                    this.getRandom().nextGaussian() * 0.01,
                    this.getRandom().nextGaussian() * 0.01,
                    this.getRandom().nextGaussian() * 0.01
                );
        }
    }

    @Override
    public void r() {
        this.a(true);
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.ai) {
            return com.trolmastercard.sexmod.entity.ScenePose.aj;
        } else {
            return var1 == com.trolmastercard.sexmod.entity.ScenePose.bA ? com.trolmastercard.sexmod.entity.ScenePose.bB : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose b(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.aj || var1 == com.trolmastercard.sexmod.entity.ScenePose.ai) {
            return com.trolmastercard.sexmod.entity.ScenePose.ak;
        } else {
            return var1 != com.trolmastercard.sexmod.entity.ScenePose.bA && var1 != com.trolmastercard.sexmod.entity.ScenePose.bB && var1 != com.trolmastercard.sexmod.entity.ScenePose.bC
                ? null
                : com.trolmastercard.sexmod.entity.ScenePose.bD;
        }
    }

    @Override
    protected PlayState a(AnimationState<com.trolmastercard.sexmod.entity.GirlEntity> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() != com.trolmastercard.sexmod.entity.ScenePose.a || !this.ai().cq) {
                    this.a("animation.allie.null", true, var1);
                }
                break;
            case "movement":
                this.a("animation.allie.tail", true, var1);
                break;
            case "action":
                switch (this.ai()) {
                    case al:
                        this.a("animation.allie.deepthroat_normal_prepare", false, var1);
                        break;
                    case ah:
                        this.a("animation.allie.deepthroat_start", false, var1);
                        break;
                    case ak:
                        this.a("animation.allie.deepthroat_cum", false, var1);
                        break;
                    case aj:
                        this.a("animation.allie.deepthroat_fast", true, var1);
                        break;
                    case ag:
                        this.a("animation.allie.deepthroat_prepare", false, var1);
                        break;
                    case ai:
                        this.a("animation.allie.deepthroat_slow", true, var1);
                        break;
                    case ad:
                        this.a("animation.allie.summon", false, var1);
                        break;
                    case am:
                        this.a("animation.allie.summon_normal", false, var1);
                        break;
                    case ao:
                        this.a("animation.allie.summon_normal_wait", true, var1);
                        break;
                    case ae:
                        this.a("animation.allie.summon_wait", true, var1);
                        break;
                    case ap:
                        this.a("animation.allie.rich", false, var1);
                        break;
                    case aq:
                        this.a("animation.allie.rich_normal", false, var1);
                        break;
                    case an:
                        this.a("animation.allie.summon_sand", false, var1);
                        break;
                    case bE:
                        this.a("animation.allie.reverse_cowgirl_start", true, var1);
                        break;
                    case bA:
                        this.a("animation.allie.reverse_cowgirl_slow" + this.o, true, var1);
                        break;
                    case bC:
                        this.a("animation.allie.reverse_cowgirl_fastc" + this.p, true, var1);
                        break;
                    case bB:
                        this.a("animation.allie.reverse_cowgirl_fasts", true, var1);
                        break;
                    case bD:
                        this.a("animation.allie.reverse_cowgirl_cum", true, var1);
                        break;
                    case a:
                        this.a("animation.allie.null", true, var1);
                        break;
                    case A:
                        this.a("animation.allie.attack0", true, var1);
                        break;
                    case B:
                        this.a("animation.allie.bowcharge", true, var1);
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
