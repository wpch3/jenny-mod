package com.trolmastercard.sexmod.f.c;

import com.trolmastercard.sexmod.f.c;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class g extends c.a {
    boolean l = false;
    int m = 0;
    boolean n = false;
    boolean o = false;

    public g(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    @Override
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        return null;
    }

    @Override
    protected com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.bU || var1 == com.trolmastercard.sexmod.f.j.bT) {
            return com.trolmastercard.sexmod.f.j.bV;
        } else {
            return var1 == com.trolmastercard.sexmod.f.j.bP ? com.trolmastercard.sexmod.f.j.bS : null;
        }
    }

    @Override
    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.bV || var1 != com.trolmastercard.sexmod.f.j.bU && var1 != com.trolmastercard.sexmod.f.j.bT) {
            if (var2 != com.trolmastercard.sexmod.f.j.bS || var1 != com.trolmastercard.sexmod.f.j.bP) {
                if (var2 != com.trolmastercard.sexmod.f.j.bS || var1 != com.trolmastercard.sexmod.f.j.bR) {
                    if (var1 == com.trolmastercard.sexmod.f.j.bT) {
                        this.n = false;
                    }

                    super.c(var1);
                }
            }
        }
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.f.b.k.a(var1, this, new String[]{"cowgirl", "mating press", "ride"}, false);
        return true;
    }

    @Override
    public void r() {
        this.a(true);
    }

    @Override
    public void tick() {
        super.tick();
        this.v();
        if (this.level().isClientSide()) {
            this.u();
        }
    }

    void u() {
        if (this.aB()) {
            if (this.ai() == com.trolmastercard.sexmod.f.j.bQ) {
                ;
            }
        }
    }

    void v() {
        com.trolmastercard.sexmod.f.j var1 = this.ai();
        this.l = var1 == com.trolmastercard.sexmod.f.j.bV
            || var1 == com.trolmastercard.sexmod.f.j.bU
            || var1 == com.trolmastercard.sexmod.f.j.bT
            || var1 == com.trolmastercard.sexmod.f.j.bQ
            || var1 == com.trolmastercard.sexmod.f.j.bP
            || var1 == com.trolmastercard.sexmod.f.j.bS
            || var1 == com.trolmastercard.sexmod.f.j.bO
            || var1 == com.trolmastercard.sexmod.f.j.bR;
    }

    @Override
    protected PlayState a(AnimationState<com.trolmastercard.sexmod.f.b.k> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                com.trolmastercard.sexmod.f.j var5 = this.ai();
                if (var5.cq && var5 != com.trolmastercard.sexmod.f.j.ca) {
                    this.a("animation.galath.blink", true, var1);
                    return PlayState.CONTINUE;
                }

                return PlayState.STOP;
            case "movement":
                if (this.ai() != com.trolmastercard.sexmod.f.j.a) {
                    return PlayState.STOP;
                } else {
                    if (!this.onGround()) {
                        this.a("animation.galath.controlled_flight", true, var1);
                        return PlayState.CONTINUE;
                    }

                    if (Math.abs(this.xOld - this.getX()) + Math.abs(this.zOld - this.getZ()) > 0.0) {
                        this.setYRot(this.getYHeadRot());
                        this.a("animation.galath.walk", true, var1);
                    } else {
                        this.a("animation.galath.idle", true, var1);
                    }

                    return PlayState.CONTINUE;
                }
            case "action":
                switch (this.ai()) {
                    case bV:
                        this.a("animation.galath.corrupt_cum", true, var1);
                        break;
                    case bU:
                        this.a("animation.galath.corrupt_soft", true, var1);
                        break;
                    case bT:
                        this.a("animation.galath.corrupt_slow", true, var1);
                    case z:
                    default:
                        break;
                    case a:
                        return PlayState.STOP;
                    case bQ:
                        this.a("animation.galath.rape_intro", true, var1);
                        break;
                    case bP:
                        this.a("animation.galath.rape1", true, var1);
                        break;
                    case bS:
                        this.a("animation.galath.rape_cum", true, var1);
                        break;
                    case bR:
                        this.a("animation.galath.rape_cum_idle", true, var1);
                }

                return PlayState.CONTINUE;
            default:
                return PlayState.CONTINUE;
        }
    }

    @Override
    public void registerControllers(ControllerRegistrar var1) {
        super.registerControllers(var1);
        this.aB.setSoundKeyframeHandler(var0 -> {});
    }
}
