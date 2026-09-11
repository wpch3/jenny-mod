package com.trolmastercard.sexmod.f.c;

import com.trolmastercard.sexmod.f.c;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class k extends c.a {
    int l = 0;
    boolean m = false;
    boolean n = false;
    boolean o = false;

    public k(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(1.34F);
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.f.b.k.a(var1, this, new String[]{"action.names.touchboobs", "action.names.headpat"}, false);
        return true;
    }

    @Override
    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.aH || var1 != com.trolmastercard.sexmod.f.j.aF && var1 != com.trolmastercard.sexmod.f.j.aG) {
            if (var2 != com.trolmastercard.sexmod.f.j.aC || var1 != com.trolmastercard.sexmod.f.j.aB && var1 != com.trolmastercard.sexmod.f.j.aA) {
                super.c(var1);
            }
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (com.trolmastercard.sexmod.f.j.aD.equals(this.ai())) {
            this.u();
        } else {
            this.l = 0;
        }
    }

    void u() {
        Player var1 = this.e();
        if (var1 != null) {
            if (!(var1.distanceToSqr(this.getX(), this.l().y, this.getZ()) > 1.5625)) {
                if (this.level().isClientSide()) {
                    this.a(var1, this.l);
                } else if (this.l == 25) {
                    this.q(var1.getUUID());
                    var1.teleportTo(this.position().x, this.l().y, this.position().z);
                    this.c(com.trolmastercard.sexmod.f.j.aE);
                    var1.setYHeadRot(this.e_() + 180.0F);
                    var1.setYRot(this.e_() + 180.0F);
                    var1.yRotO = this.e_() + 180.0F;
                    this.ai = this.e_() + 180.0F;
                    this.a(0.0, -0.075, -0.7109375, 0.0F, 0.0F);
                    this.entityData.set(at, 0);
                }

                this.l++;
            }
        }
    }

    void a(Player var1, int var2) {
        if (var2 == 0) {
            Player var3 = com.trolmastercard.sexmod.b.b.b();
            if (var3 != null && var3.getUUID().equals(var1.getUUID())) {
                var3.setDeltaMovement(0.0, 0.0, 0.0);
            }
        }

        if (var2 == 25) {
            Player var4 = com.trolmastercard.sexmod.b.b.b();
            if (var4 != null && var4.getUUID().equals(var1.getUUID())) {
                com.trolmastercard.sexmod.b.b.e();
            }
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.aA) {
            return com.trolmastercard.sexmod.f.j.aB;
        } else {
            return var1 == com.trolmastercard.sexmod.f.j.aF ? com.trolmastercard.sexmod.f.j.aG : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.aA || var1 == com.trolmastercard.sexmod.f.j.aB) {
            return com.trolmastercard.sexmod.f.j.aC;
        } else {
            return var1 != com.trolmastercard.sexmod.f.j.aG && var1 != com.trolmastercard.sexmod.f.j.aF ? null : com.trolmastercard.sexmod.f.j.aH;
        }
    }

    @Override
    protected PlayState a(AnimationState<com.trolmastercard.sexmod.f.b.k> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() != com.trolmastercard.sexmod.f.j.a) {
                    this.a("animation.cat.null", true, var1);
                } else {
                    this.a("animation.cat.blink", true, var1);
                }
                break;
            case "movement":
                if (this.ai() != com.trolmastercard.sexmod.f.j.a) {
                    this.a("animation.cat.null", true, var1);
                } else if (this.isPassenger()) {
                    this.a("animation.cat.sit", true, var1);
                } else if (Math.abs(this.xOld - this.getX()) + Math.abs(this.zOld - this.getZ()) > 0.0) {
                    if (this.onGround() && Math.abs(Math.abs(this.yOld) - Math.abs(this.getY())) < 0.1) {
                        this.a("animation.cat.walk", true, var1);
                    } else {
                        this.a("animation.cat.fly", true, var1);
                        this.setYRot(this.getYHeadRot());
                    }
                } else {
                    this.a("animation.cat.idle", true, var1);
                }
                break;
            case "action":
                switch (this.ai()) {
                    case a:
                        this.a("animation.cat.null", true, var1);
                        break;
                    case A:
                        this.a("animation.cat.attack" + this.A, false, var1);
                        break;
                    case C:
                    case D:
                        this.a("animation.cat.sit", true, var1);
                        break;
                    case B:
                        this.a("animation.cat.bowcharge", false, var1);
                        break;
                    case E:
                        this.a("animation.cat.throwpearl", true, var1);
                        break;
                    case F:
                        this.a("animation.cat.downed", true, var1);
                        break;
                    case av:
                        this.a("animation.cat.start_fishing", false, var1);
                        break;
                    case aw:
                        this.a("animation.cat.idle_fishing", true, var1);
                        break;
                    case ax:
                        this.a("animation.cat.eat_fishing", false, var1);
                        break;
                    case ay:
                        this.a("animation.cat.throw_away", false, var1);
                        break;
                    case g:
                        this.a("animation.cat.payment", false, var1);
                        break;
                    case az:
                        this.a("animation.cat.touch_boobs_intro", false, var1);
                        break;
                    case aA:
                        this.a("animation.cat.touch_boobs_slow", true, var1);
                        break;
                    case aB:
                        this.a("animation.cat.touch_boobs_fast", true, var1);
                        break;
                    case aC:
                        this.a("animation.cat.touch_boobs_cum", false, var1);
                        break;
                    case aD:
                        this.a("animation.cat.wait", false, var1);
                        break;
                    case aE:
                        this.a("animation.cat.sitting_intro", false, var1);
                        break;
                    case aF:
                        this.a("animation.cat.sitting_slow", true, var1);
                        break;
                    case aG:
                        this.a("animation.cat.sitting_fast", true, var1);
                        break;
                    case aH:
                        this.a("animation.cat.sitting_cum", false, var1);
                        break;
                    case af:
                        this.a("animation.cat.head_pat", true, var1);
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
