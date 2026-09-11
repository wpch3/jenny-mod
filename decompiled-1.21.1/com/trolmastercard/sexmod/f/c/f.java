package com.trolmastercard.sexmod.f.c;

import com.trolmastercard.sexmod.f.c;
import java.util.UUID;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class f extends c.a {
    public f(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    private boolean u() {
        Player var1 = this.q();
        return var1 == null ? false : this.level().getBlockState(var1.blockPosition().above().above()).getBlock() != Blocks.AIR;
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(this.u() ? 1.53F : 1.9F);
    }

    @Override
    public void a(String var1, UUID var2) {
        if ("action.names.cowgirl".equals(var1)) {
            this.a("animationFollowUp", "Cowgirl");
        } else if ("action.names.missionary".equals(var1)) {
            this.a("animationFollowUp", "Missionary");
        } else {
            super.a(var1, var2);
        }
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.f.b.k.a(var1, this, new String[]{"Face fuck"}, false);
        return true;
    }

    @Override
    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.P || var1 != com.trolmastercard.sexmod.f.j.O && var1 != com.trolmastercard.sexmod.f.j.N) {
            if (var2 != com.trolmastercard.sexmod.f.j.z || var1 != com.trolmastercard.sexmod.f.j.x && var1 != com.trolmastercard.sexmod.f.j.y) {
                super.c(var1);
            }
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.x) {
            return com.trolmastercard.sexmod.f.j.y;
        } else if (var1 == com.trolmastercard.sexmod.f.j.N) {
            return com.trolmastercard.sexmod.f.j.O;
        } else {
            return var1 == com.trolmastercard.sexmod.f.j.br ? com.trolmastercard.sexmod.f.j.bs : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.y || var1 == com.trolmastercard.sexmod.f.j.x) {
            return com.trolmastercard.sexmod.f.j.z;
        } else if (var1 == com.trolmastercard.sexmod.f.j.O || var1 == com.trolmastercard.sexmod.f.j.N) {
            return com.trolmastercard.sexmod.f.j.P;
        } else {
            return var1 != com.trolmastercard.sexmod.f.j.br && var1 != com.trolmastercard.sexmod.f.j.bs ? null : com.trolmastercard.sexmod.f.j.bt;
        }
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        if (this.ai() == com.trolmastercard.sexmod.f.j.v) {
            String var2 = (String)this.entityData.get(com.trolmastercard.sexmod.f.b.k.av);
            if ("Missionary".equals(var2) || "Cowgirl".equals(var2)) {
                Player var3 = this.e();
                if (var3 != null && !(var3.distanceToSqr(this.l().x, this.l().y, this.l().z) > 1.0)) {
                    this.entityData.set(com.trolmastercard.sexmod.f.b.k.av, "");
                    this.entityData.set(com.trolmastercard.sexmod.f.b.k.at, 0);
                    this.q(var3.getUUID());
                    Player var4 = this.q();
                    var3.getAbilities().flying = true;
                    var3.noPhysics = true;
                    var3.setNoGravity(true);
                    var3.onUpdateAbilities();
                    if (var4 != null) {
                        var4.getAbilities().flying = true;
                        var4.noPhysics = true;
                        var4.setNoGravity(true);
                        var4.onUpdateAbilities();
                    }

                    if ("Missionary".equals(var2)) {
                        this.c(com.trolmastercard.sexmod.f.j.M);
                        Vec3 var5 = this.l().subtract(0.0, 0.1, 0.0);
                        var3.setYRot(this.e_());
                        var3.setXRot(60.0F);
                        var3.teleportTo(var5.x, var5.y, var5.z);
                    } else {
                        this.c(com.trolmastercard.sexmod.f.j.w);
                        double var8 = this.e_().floatValue() * (Math.PI / 180.0);
                        Vec3 var7 = this.l().add(-Math.sin(var8) * 1.8, -0.65, Math.cos(var8) * 1.8);
                        var3.setYRot(180.0F + this.e_());
                        var3.setXRot(-30.0F);
                        var3.teleportTo(var7.x, var7.y, var7.z);
                    }
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
                    this.a("animation.ellie.eyes", true, var1);
                } else {
                    this.a("animation.ellie.null", true, var1);
                }
                break;
            case "movement":
                if (this.ai() != null && this.ai().cp) {
                    return PlayState.STOP;
                }

                if (this.ai() != null && this.ai() != com.trolmastercard.sexmod.f.j.a) {
                    this.a("animation.ellie.sit", true, var1);
                } else {
                    this.a("animation.ellie.idle", true, var1);
                }
                break;
            case "action":
                switch (this.ai()) {
                    case n:
                        this.a("animation.ellie.strip", true, var1);
                        break;
                    case w:
                        this.a("animation.ellie.cowgirlstart", true, var1);
                        break;
                    case x:
                        this.a("animation.ellie.cowgirlslow2", true, var1);
                        break;
                    case y:
                        this.a("animation.ellie.cowgirlfast", true, var1);
                        break;
                    case z:
                        this.a("animation.ellie.cowgirlcum", true, var1);
                        break;
                    case M:
                        this.a("animation.ellie.missionary_start", true, var1);
                        break;
                    case N:
                        this.a("animation.ellie.missionary_slow", true, var1);
                        break;
                    case O:
                        this.a("animation.ellie.missionary_fast", true, var1);
                        break;
                    case P:
                        this.a("animation.ellie.missionary_cum", true, var1);
                        break;
                    case bu:
                        this.a("animation.ellie.carry_intro", true, var1);
                        break;
                    case br:
                        this.a("animation.ellie.carry_slow1", true, var1);
                        break;
                    case bs:
                        this.a("animation.ellie.carry_fast", true, var1);
                        break;
                    case bt:
                        this.a("animation.ellie.carry_cum", true, var1);
                        break;
                    case p:
                        this.a("animation.ellie.hug", true, var1);
                        break;
                    case q:
                        this.a("animation.ellie.hugidle", true, var1);
                        break;
                    case r:
                        this.a("animation.ellie.hugselected", true, var1);
                        break;
                    case u:
                        this.a("animation.ellie.sitdown", true, var1);
                        break;
                    case v:
                        this.a("animation.ellie.sitdownidle", true, var1);
                        break;
                    case o:
                        this.a("animation.ellie.dash", true, var1);
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
