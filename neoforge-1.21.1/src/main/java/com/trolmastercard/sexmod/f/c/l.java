package com.trolmastercard.sexmod.f.c;

import com.trolmastercard.sexmod.f.c;
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

public class l extends c.a {
    public l(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(1.64F);
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.f.b.k.a(var1, this, new String[]{"action.names.blowjob"}, false);
        return true;
    }

    @Override
    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.e || var1 != com.trolmastercard.sexmod.f.j.f && var1 != com.trolmastercard.sexmod.f.j.c) {
            if (var2 != com.trolmastercard.sexmod.f.j.m || var1 != com.trolmastercard.sexmod.f.j.l && var1 != com.trolmastercard.sexmod.f.j.k) {
                super.c(var1);
            }
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.c) {
            return com.trolmastercard.sexmod.f.j.f;
        } else {
            return var1 == com.trolmastercard.sexmod.f.j.k ? com.trolmastercard.sexmod.f.j.l : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.c || var1 == com.trolmastercard.sexmod.f.j.f) {
            return com.trolmastercard.sexmod.f.j.e;
        } else {
            return var1 != com.trolmastercard.sexmod.f.j.k && var1 != com.trolmastercard.sexmod.f.j.l ? null : com.trolmastercard.sexmod.f.j.m;
        }
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        if (this.ai() == com.trolmastercard.sexmod.f.j.i) {
            Player var2 = this.e();
            if (var2 != null && !(var2.position().distanceTo(this.l()) > 1.0)) {
                this.q(var2.getUUID());
                var2.setYRot(this.e_());
                this.ai = this.e_();
                var2.teleportTo(this.l().x, this.l().y, this.l().z);
                this.a(0.0, 0.0, 0.4, 0.0F, 60.0F);
                this.c(com.trolmastercard.sexmod.f.j.j);
                var2.setNoGravity(true);
                var2.noPhysics = true;
                var2.getAbilities().flying = true;
                var2.onUpdateAbilities();
                Player var3 = this.q();
                if (var3 != null) {
                    var3.setNoGravity(true);
                    var3.getAbilities().flying = true;
                    var3.onUpdateAbilities();
                }
            }
        }
    }

    @Override
    protected PlayState a(AnimationState<com.trolmastercard.sexmod.f.b.k> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() == com.trolmastercard.sexmod.f.j.a && this.ai().cq) {
                    this.a("animation.slime.fhappy", true, var1);
                } else {
                    this.a("animation.slime.null", true, var1);
                }
                break;
            case "action":
                if (this.ai() == com.trolmastercard.sexmod.f.j.a) {
                    this.a("animation.slime.idle", true, var1);
                } else {
                    switch (this.ai()) {
                        case s:
                            this.a("animation.slime.undress", false, var1);
                            break;
                        case t:
                            this.a("animation.slime.dress", false, var1);
                            break;
                        case n:
                            this.a("animation.slime.strip", false, var1);
                            break;
                        case b:
                            this.a("animation.slime.blowjobintro", false, var1);
                            break;
                        case c:
                            this.a("animation.slime.blowjobsuck", true, var1);
                            break;
                        case f:
                            this.a("animation.slime.blowjobthrust", true, var1);
                            break;
                        case e:
                            this.a("animation.slime.blowjobcum", false, var1);
                            break;
                        case h:
                            this.a("animation.slime.doggygoonbed", false, var1);
                            break;
                        case i:
                            this.a("animation.slime.doggywait", true, var1);
                            break;
                        case j:
                            this.a("animation.slime.doggystart", false, var1);
                            break;
                        case k:
                            this.a("animation.slime.doggyslow", true, var1);
                            break;
                        case l:
                            this.a("animation.slime.doggyfast", true, var1);
                            break;
                        case m:
                            this.a("animation.slime.doggycum", false, var1);
                    }
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
