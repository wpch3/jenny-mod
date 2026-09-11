package com.trolmastercard.sexmod.f.c;

import com.trolmastercard.sexmod.f.b.n;
import java.util.ArrayList;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class j extends b {
    public static final EntityDataAccessor<Float> s = SynchedEntityData.defineId(j.class, EntityDataSerializers.FLOAT);

    public j(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(s, 0.0F);
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.f.b.k.a(var1, this, new String[]{"anal", "oral", "mating"}, false);
        return true;
    }

    public boolean w() {
        BlockPos var1 = this.blockPosition().above();
        return !this.level().getBlockState(var1).getCollisionShape(this.level(), var1).isEmpty();
    }

    @Override
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.d) {
            return com.trolmastercard.sexmod.f.j.f;
        } else {
            return var1 == com.trolmastercard.sexmod.f.j.aa ? com.trolmastercard.sexmod.f.j.ab : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.f || var1 == com.trolmastercard.sexmod.f.j.d) {
            return com.trolmastercard.sexmod.f.j.e;
        } else if (var1 == com.trolmastercard.sexmod.f.j.aa || var1 == com.trolmastercard.sexmod.f.j.ab) {
            return com.trolmastercard.sexmod.f.j.ac;
        } else {
            return var1 != com.trolmastercard.sexmod.f.j.aM && var1 != com.trolmastercard.sexmod.f.j.aL ? null : com.trolmastercard.sexmod.f.j.aN;
        }
    }

    @Override
    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.aN || var1 != com.trolmastercard.sexmod.f.j.aL && var1 != com.trolmastercard.sexmod.f.j.aM) {
            if (var2 != com.trolmastercard.sexmod.f.j.ac || var1 != com.trolmastercard.sexmod.f.j.aa && var1 != com.trolmastercard.sexmod.f.j.ab) {
                if (var2 != com.trolmastercard.sexmod.f.j.e || var1 != com.trolmastercard.sexmod.f.j.c && var1 != com.trolmastercard.sexmod.f.j.f) {
                    super.c(var1);
                }
            }
        }
    }

    @Override
    protected String a(StringBuilder var1) {
        com.trolmastercard.sexmod.f.b.n.d(var1, 8);
        com.trolmastercard.sexmod.f.b.n.d(var1, 3);
        com.trolmastercard.sexmod.f.b.n.b(var1);
        com.trolmastercard.sexmod.f.b.n.b(var1);
        com.trolmastercard.sexmod.f.b.n.c(var1, 2);
        com.trolmastercard.sexmod.f.b.n.c(var1, 2);
        com.trolmastercard.sexmod.f.b.n.c(var1, 1);
        com.trolmastercard.sexmod.f.b.n.c(var1, 1);
        return var1.toString();
    }

    @Override
    public ArrayList<Integer> aG() {
        ArrayList var1 = new ArrayList();
        var1.add(Math.round((Float)this.entityData.get(s) * 100.0F / 0.25F));
        var1.add(com.trolmastercard.sexmod.a.a(com.trolmastercard.sexmod.a.a((String)this.entityData.get(l))));
        var1.add(com.trolmastercard.sexmod.a.a(com.trolmastercard.sexmod.a.a((Vec3i)this.entityData.get(m))));
        return var1;
    }

    @Override
    protected void v() {
    }

    @Override
    protected PlayState a(AnimationState<com.trolmastercard.sexmod.f.b.k> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() == com.trolmastercard.sexmod.f.j.a) {
                    this.a("animation.kobold.blink", true, var1);
                } else {
                    this.a("animation.kobold.null", true, var1);
                }
                break;
            case "movement":
                boolean var5 = this.xOld != this.getX() || this.zOld != this.getZ();
                if (this.isPassenger()) {
                    this.a("animation.kobold.sit", true, var1);
                } else if (!(Boolean)this.entityData.get(com.trolmastercard.sexmod.f.b.k.ap) && var5) {
                    if (!this.onGround() && this.yo > this.getY()) {
                        this.a("animation.kobold.fly", true, var1);
                    } else {
                        if (this.aC != null) {
                            this.aC.setAnimationSpeed(1.0);
                        }

                        if (this.w()) {
                            this.a("animation.kobold.crouch_walk", true, var1);
                        } else {
                            switch (this.ag()) {
                                case c:
                                    this.a("animation.kobold.run", true, var1);
                                    return PlayState.CONTINUE;
                                case a:
                                case b:
                                    this.a("animation.kobold.walk", true, var1);
                                    return PlayState.CONTINUE;
                                default:
                                    this.a("animation.kobold.idle", true, var1);
                            }
                        }
                    }
                } else if (this.w()) {
                    this.a("animation.kobold.crouch_idle", true, var1);
                } else {
                    this.a("animation.kobold.idle", true, var1);
                }
                break;
            case "action":
                switch (this.ai()) {
                    case A:
                        this.a("animation.kobold.attack", true, var1);
                        break;
                    case C:
                    case D:
                        this.a("animation.kobold.sit", true, var1);
                        break;
                    case aI:
                        this.a("animation.kobold.fall_tree", true, var1);
                        break;
                    case g:
                        this.a("animation.kobold.paymentBackpack", true, var1);
                        break;
                    case b:
                        this.a("animation.kobold.blowjobStart", true, var1);
                        break;
                    case d:
                        this.a("animation.kobold.blowjobSlowL", true, var1);
                        break;
                    case f:
                        this.a("animation.kobold.blowjobFast", true, var1);
                        break;
                    case e:
                        this.a("animation.kobold.blowjobCum", true, var1);
                        break;
                    case Z:
                        this.a("animation.kobold.analStart", true, var1);
                        break;
                    case aa:
                        this.a("animation.kobold.analSoft", true, var1);
                        break;
                    case ab:
                        this.a("animation.kobold.analHard", true, var1);
                        break;
                    case ac:
                        this.a("animation.kobold.analCum", true, var1);
                        break;
                    case aJ:
                        this.a("animation.kobold.sleep", true, var1);
                        break;
                    case aK:
                        this.a("animation.kobold.mating_press_start", true, var1);
                        break;
                    case aL:
                        this.a("animation.kobold.mating_press_soft", true, var1);
                        break;
                    case aM:
                        this.a("animation.kobold.mating_press_hard", true, var1);
                        break;
                    case aN:
                        this.a("animation.kobold.mating_press_cum", true, var1);
                        break;
                    case a:
                        this.a("animation.kobold.null", true, var1);
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
