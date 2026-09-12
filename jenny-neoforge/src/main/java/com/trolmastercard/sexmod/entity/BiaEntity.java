package com.trolmastercard.sexmod.entity;

import com.trolmastercard.sexmod.entity.Triggerable;
import java.util.UUID;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class BiaEntity extends HumanoidGirlEntity implements Triggerable {
    public boolean a = false;
    int b = 0;
    boolean c = false;
    int d = 0;
    boolean e = true;
    int f = -1;
    boolean g = false;
    final int[] h = new int[]{0, 180, -90, 90};
    final Vec3[][] i = new Vec3[][]{
        {new Vec3(0.5, 0.0, -0.5), new Vec3(0.0, 0.0, -1.0)},
        {new Vec3(0.5, 0.0, 1.5), new Vec3(0.0, 0.0, 1.0)},
        {new Vec3(-0.5, 0.0, 0.5), new Vec3(-1.0, 0.0, 0.0)},
        {new Vec3(1.5, 0.0, 0.5), new Vec3(1.0, 0.0, 0.0)}
    };
    int j = 1;

    public BiaEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
        this.B = 140;
        this.C = 50;
        this.D = 140;
        this.E = new Vec3(0.0, -0.029999997854232782, -0.2);
    }

    @Override
    public String a() {
        return "Bia";
    }

    @Override
    public void i_() {
        this.d("I am living here now nya~");
        com.trolmastercard.sexmod.registry.ModSounds.a(this, "bia", "breath");
    }

    @Override
    public void d_() {
        this.a = true;
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        com.trolmastercard.sexmod.entity.ScenePose var2 = this.ai();
        if (var2 == com.trolmastercard.sexmod.entity.ScenePose.Y || var2 == com.trolmastercard.sexmod.entity.ScenePose.bz) {
            this.entityData.set(GirlEntity.av, "");
        }

        if (var2 != com.trolmastercard.sexmod.entity.ScenePose.Y || var1 != com.trolmastercard.sexmod.entity.ScenePose.X && var1 != com.trolmastercard.sexmod.entity.ScenePose.W) {
            if (var2 != com.trolmastercard.sexmod.entity.ScenePose.bz || var1 != com.trolmastercard.sexmod.entity.ScenePose.bx && var1 != com.trolmastercard.sexmod.entity.ScenePose.bw) {
                super.c(var1);
            }
        }
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        if (this.e) {
            this.setNoGravity(false);
            this.noPhysics = false;
            this.e = false;
        }

        if (this.a) {
            this.b++;
            if (!this.position().equals(GirlEntity.aq) && this.b <= 40) {
                this.setYRot(this.e_());
                this.d(this.aE());
                this.setNoGravity(false);
                Vec3 var3 = com.trolmastercard.sexmod.util.LerpUtils.a(this.position(), this.am(), 40 - this.b);
                this.setPos(var3.x, var3.y, var3.z);
            } else {
                this.a = false;
                this.b = 0;
                Player var2 = this.level().getPlayerByUUID(this.al());
                this.a_((var2 != null ? var2.getYRot() : this.getYRot()) + 180.0F);
                this.entityData.set(GirlEntity.ap, true);
                this.getNavigation().stop();
                this.c_();
            }
        }

        if (this.c) {
            if (!(this.position().distanceTo(this.am()) < 0.6) && this.d <= 200) {
                this.d++;
                if (this.d == 60 || this.d == 120) {
                    this.getNavigation().stop();
                    this.getNavigation().moveTo(this.am().x, this.am().y, this.am().z, 0.35);
                }
            } else {
                this.c = false;
                this.entityData.set(GirlEntity.ap, true);
                this.d = 0;
                this.noPhysics = true;
                this.setNoGravity(true);
                this.setDeltaMovement(0.0, 0.0, 0.0);
                if ("anal".equals(this.entityData.get(GirlEntity.av))) {
                    this.c(com.trolmastercard.sexmod.entity.ScenePose.T);
                    this.d(0);
                } else {
                    this.c(com.trolmastercard.sexmod.entity.ScenePose.u);
                }
            }
        }
    }

    public InteractionResult mobInteract(Player var1, InteractionHand var2) {
        InteractionResult var3 = super.mobInteract(var1, var2);
        if (var3 != InteractionResult.PASS) {
            return var3;
        }

        if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.v) {
            return InteractionResult.SUCCESS;
        }

        ItemStack var4 = var1.getItemInHand(var2);
        if (var4.getItem() == Items.NAME_TAG) {
            var4.interactLivingEntity(var1, this, var2);
            return InteractionResult.SUCCESS;
        }

        if (this.level().isClientSide() && !this.a(var1)) {
            this.d("bia.dialogue.busy");
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public boolean a(Player var1) {
        if (this.al() != null) {
            return false;
        }

        if (this.aw() && !((String)this.entityData.get(GirlEntity.ao)).equals(com.trolmastercard.sexmod.client.ClientUtils.a().toString())) {
            return false;
        }

        String[] var2 = new String[]{
            "action.names.anal",
            "doggy",
            this.entityData.get(GirlEntity.at) == 1 ? "action.names.strip" : "action.names.dressup",
            "action.names.talk",
            "action.names.headpat"
        };
        GirlEntity.a(var1, this, var2, true);
        return true;
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide() && this.aB() && this.ai() == com.trolmastercard.sexmod.entity.ScenePose.bv) {
            com.trolmastercard.sexmod.client.HornyMeterOverlay.d();
        }

        this.e();
    }

    @Override
    public void h_() {
        if (this.an() && !this.g) {
            this.f_();
        }

        this.g = false;
    }

    @Override
    protected void b_() {
        super.b_();
        this.f = -1;
    }

    void e() {
        com.trolmastercard.sexmod.entity.ScenePose var1 = this.ai();
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.U || var1 == com.trolmastercard.sexmod.entity.ScenePose.v) {
            Player var2 = this.level().getNearestPlayer(this, 10.0);
            if (var2 != null) {
                if (!(var2.distanceTo(this) > 1.0F)) {
                    if (this.f == -1) {
                        if (!this.level().isClientSide()) {
                            this.q(var2.getUUID());
                        }

                        this.f = GirlEntity.af;
                    } else if (--this.f <= 0) {
                        this.f = -1;
                        var2.noPhysics = true;
                        var2.setNoGravity(true);
                        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.U) {
                            if (!this.level().isClientSide()) {
                                this.c(com.trolmastercard.sexmod.entity.ScenePose.V);
                                Vec3 var7 = this.am().add(com.trolmastercard.sexmod.util.RotationMath.a(-0.3, -1.0, -0.5, this.e_()));
                                var2.teleportTo(var7.x, var7.y, var7.z);
                            } else if (this.aB()) {
                                com.trolmastercard.sexmod.client.HornyMeterOverlay.d();
                            }
                        } else {
                            float var3 = this.e_();
                            var2.setYRot(var3);
                            var2.setXRot(60.0F);
                            if (!this.level().isClientSide()) {
                                this.d(0);
                                this.c(com.trolmastercard.sexmod.entity.ScenePose.bv);
                                Vec3 var4 = this.am();
                                Vec3 var5 = var4.add(com.trolmastercard.sexmod.util.RotationMath.a(0.0, 0.0, 1.0, var3));
                                this.d(var5);
                                Vec3 var6 = var4.add(com.trolmastercard.sexmod.util.RotationMath.a(0.0, 1.1875 - var2.getEyeHeight(), 0.5, var3));
                                var2.teleportTo(var6.x, var6.y, var6.z);
                                this.d(true);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void a_() {
    }

    @Override
    public void a(String var1, UUID var2) {
        super.a(var1, var2);
        if ("action.names.talk".equals(var1)) {
            this.q(com.trolmastercard.sexmod.client.ClientUtils.a());
            this.a("playerSheHasSexWith", com.trolmastercard.sexmod.client.ClientUtils.a().toString());
            this.a("animationFollowUp", "talkHorny");
            this.a(var2);
        } else if ("action.names.headpat".equals(var1)) {
            this.q(com.trolmastercard.sexmod.client.ClientUtils.a());
            this.a("playerSheHasSexWith", com.trolmastercard.sexmod.client.ClientUtils.a().toString());
            this.a("animationFollowUp", "Headpat");
            this.a(var2);
        } else if ("action.names.anal".equals(var1)) {
            this.a("animationFollowUp", "anal");
            this.c(com.trolmastercard.sexmod.entity.ScenePose.S);
            this.g = true;
        } else if ("doggy".equals(var1)) {
            this.a("animationFollowUp", "doggy");
            this.c(com.trolmastercard.sexmod.entity.ScenePose.S);
            this.g = true;
        } else if ("action.names.dressup".equals(var1) || "action.names.strip".equals(var1)) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.n);
        }
    }

    public void die(DamageSource var1) {
        super.die(var1);
        if (!this.level().isClientSide()) {
            ItemStack var2 = new ItemStack(Blocks.BROWN_WOOL, this.getRandom().nextInt(4));
            this.spawnAtLocation(var2);
        }
    }

    void a(UUID var1) {
        this.a(true, true, var1);
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
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.V) {
            return com.trolmastercard.sexmod.entity.ScenePose.W;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.W) {
            return com.trolmastercard.sexmod.entity.ScenePose.X;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.X) {
            return com.trolmastercard.sexmod.entity.ScenePose.Y;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.bv) {
            return com.trolmastercard.sexmod.entity.ScenePose.by;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.by) {
            return com.trolmastercard.sexmod.entity.ScenePose.bw;
        } else {
            return var1 == com.trolmastercard.sexmod.entity.ScenePose.bw ? com.trolmastercard.sexmod.entity.ScenePose.bx : (var1 == com.trolmastercard.sexmod.entity.ScenePose.bx ? com.trolmastercard.sexmod.entity.ScenePose.bz : null);
        }
    }

    @Override
    protected void c_() {
        String var1 = (String)this.entityData.get(GirlEntity.av);
        if ("talkHorny".equals(var1)) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.Q);
        } else if ("Headpat".equals(var1)) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.af);
        } else if (!"doggy".equals(var1) && !"anal".equals(var1)) {
            if (this.level().isClientSide()) {
                this.a("animationFollowUp", "");
            } else {
                this.entityData.set(GirlEntity.av, "");
            }
        } else {
            this.f_();
        }
    }

    @Override
    protected String h() {
        return "animation.bia.idle";
    }

    @Override
    protected PlayState a(AnimationState<GirlEntity> var1) {
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
                        this.a("animation.bia.prone_doggy_hard" + this.j, true, var1);
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
