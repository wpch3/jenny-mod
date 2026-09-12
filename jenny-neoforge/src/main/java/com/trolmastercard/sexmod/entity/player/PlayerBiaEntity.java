package com.trolmastercard.sexmod.entity.player;

import com.trolmastercard.sexmod.entity.FriendlySlimeEntity;
import com.trolmastercard.sexmod.util.RotationMath;
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

public class PlayerBiaEntity extends PlayerGirlEntity {
    int l = -1;
    boolean m = false;
    int n = 1;

    public PlayerBiaEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(1.5F);
    }

    @Override
    public boolean h(String var1) {
        if ("anal".equals(var1)) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.T);
            this.d(0);
            return true;
        } else if ("doggy".equals(var1)) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.u);
            this.d(0);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[]{"action.names.headpat"}, false);
        return true;
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        com.trolmastercard.sexmod.entity.ScenePose var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.entity.ScenePose.Y || var1 != com.trolmastercard.sexmod.entity.ScenePose.X && var1 != com.trolmastercard.sexmod.entity.ScenePose.W) {
            if (var2 != com.trolmastercard.sexmod.entity.ScenePose.bz || var1 != com.trolmastercard.sexmod.entity.ScenePose.bx && var1 != com.trolmastercard.sexmod.entity.ScenePose.bw) {
                super.c(var1);
            }
        }
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.W) {
            return com.trolmastercard.sexmod.entity.ScenePose.X;
        } else {
            return var1 == com.trolmastercard.sexmod.entity.ScenePose.bv ? com.trolmastercard.sexmod.entity.ScenePose.by : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose b(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.W || var1 == com.trolmastercard.sexmod.entity.ScenePose.X) {
            return com.trolmastercard.sexmod.entity.ScenePose.Y;
        } else {
            return var1 != com.trolmastercard.sexmod.entity.ScenePose.bw && var1 != com.trolmastercard.sexmod.entity.ScenePose.bx ? null : com.trolmastercard.sexmod.entity.ScenePose.bz;
        }
    }

    @Override
    public void tick() {
        super.tick();
        this.u();
    }

    @Override
    protected void b_() {
        super.b_();
        this.l = -1;
    }

    private boolean e(Player var1) {
        return com.trolmastercard.sexmod.client.ClientUtils.a(var1.getUUID());
    }

    void u() {
        com.trolmastercard.sexmod.entity.ScenePose var1 = this.ai();
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.U || var1 == com.trolmastercard.sexmod.entity.ScenePose.v) {
            Player var2 = this.e();
            if (var2 != null) {
                if (!(var2.distanceTo(this) > 1.0F)) {
                    if (!this.level().isClientSide() || this.e(var2)) {
                        if (this.l == -1) {
                            if (!this.level().isClientSide()) {
                                this.q(var2.getUUID());
                            }

                            this.l = com.trolmastercard.sexmod.entity.GirlEntity.af;
                        } else if (--this.l <= 0) {
                            this.l = -1;
                            var2.noPhysics = true;
                            var2.setNoGravity(true);
                            if (var1 == com.trolmastercard.sexmod.entity.ScenePose.U) {
                                if (!this.level().isClientSide()) {
                                    this.c(com.trolmastercard.sexmod.entity.ScenePose.V);
                                    Vec3 var8 = this.am().add(RotationMath.a(-0.3, -1.0, -0.5, this.e_()));
                                    var2.teleportTo(var8.x, var8.y, var8.z);
                                } else if (this.aB()) {
                                }
                            } else {
                                float var3 = this.e_();
                                var2.setYRot(var3);
                                var2.setXRot(60.0F);
                                if (!this.level().isClientSide()) {
                                    this.d(0);
                                    this.c(com.trolmastercard.sexmod.entity.ScenePose.bv);
                                    Vec3 var4 = this.am();
                                    Vec3 var5 = var4.add(RotationMath.a(0.0, 0.0, 1.0, var3));
                                    this.d(var5);
                                    Player var6 = this.q();
                                    if (var6 != null) {
                                        var6.teleportTo(var5.x, var5.y, var5.z);
                                    }

                                    Vec3 var7 = var4.add(RotationMath.a(0.0, 1.1875 - var2.getEyeHeight(), 0.5, var3));
                                    var2.teleportTo(var7.x, var7.y, var7.z);
                                    this.d(true);
                                }
                            }
                        }
                    }
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
                    this.a("animation.bia.fhappy", true, var1);
                } else {
                    this.a("animation.bia.null", true, var1);
                }
                break;
            case "movement":
                if (this.ai() != com.trolmastercard.sexmod.entity.ScenePose.a) {
                    this.a("animation.bia.null", true, var1);
                } else if (this.isPassenger()) {
                    this.a("animation.bia.sit", true, var1);
                } else if (Math.abs(this.xOld - this.getX()) + Math.abs(this.zOld - this.getZ()) > 0.0) {
                    switch (this.ag()) {
                        case c:
                            this.a("animation.bia.run", true, var1);
                            break;
                        case b:
                            this.a("animation.bia.fastwalk", true, var1);
                            break;
                        case a:
                            this.a("animation.bia.walk", true, var1);
                    }

                    this.setYRot(this.getYHeadRot());
                } else {
                    this.a("animation.bia.idle", true, var1);
                }
                break;
            case "action":
                switch (this.ai()) {
                    case a:
                        this.a("animation.bia.null", true, var1);
                        break;
                    case n:
                        this.a("animation.bia.strip", false, var1);
                        break;
                    case A:
                        this.a("animation.bia.attack" + this.A, false, var1);
                        break;
                    case B:
                        this.a("animation.bia.bowcharge", false, var1);
                        break;
                    case C:
                        this.a("animation.bia.ride", true, var1);
                        break;
                    case D:
                        this.a("animation.bia.sit", true, var1);
                        break;
                    case E:
                        this.a("animation.bia.throwpearl", false, var1);
                        break;
                    case F:
                        this.a("animation.bia.downed", true, var1);
                        break;
                    case Q:
                        this.a("animation.bia.talk_horny2", true, var1);
                        break;
                    case R:
                        this.a("animation.bia.talk_idle2", true, var1);
                        break;
                    case S:
                        this.a("animation.bia.talk_response", true, var1);
                        break;
                    case T:
                        this.a("animation.bia.anal_prepare", false, var1);
                        break;
                    case U:
                        this.a("animation.bia.anal_wait", false, var1);
                        break;
                    case V:
                        this.a("animation.bia.anal_start", true, var1);
                        break;
                    case W:
                        this.a("animation.bia.anal_slow", true, var1);
                        break;
                    case X:
                        this.a("animation.bia.anal_fast", true, var1);
                        break;
                    case Y:
                        this.a("animation.bia.anal_cum", false, var1);
                        break;
                    case af:
                        this.a("animation.bia.headpat", false, var1);
                        break;
                    case u:
                        this.a("animation.bia.sitdown", false, var1);
                        break;
                    case v:
                        this.a("animation.bia.sitdownidle", true, var1);
                        break;
                    case bv:
                        this.a("animation.bia.prone_doggy_intro", true, var1);
                        break;
                    case by:
                        this.a("animation.bia.prone_doggy_insert", true, var1);
                        break;
                    case bw:
                        this.a("animation.bia.prone_doggy_soft", true, var1);
                        break;
                    case bx:
                        this.a("animation.bia.prone_doggy_hard" + this.n, true, var1);
                        break;
                    case bz:
                        this.a("animation.bia.prone_doggy_cum", true, var1);
                        break;
                    case bF:
                        this.a("animation.bia.wave_idle", true, var1);
                        break;
                    case bG:
                        this.a("animation.bia.wave", true, var1);
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
