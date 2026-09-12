package com.trolmastercard.sexmod.entity;

import com.trolmastercard.sexmod.entity.Triggerable;
import java.util.UUID;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class EllieEntity extends HumanoidGirlEntity implements Triggerable {
    int a = -1;
    boolean b = false;
    boolean c = false;
    boolean d = false;
    int e = -1;
    int f = -1;
    int g = -1;
    int h = -1;
    boolean i = false;
    Object[] j;
    int k = -1;
    int l = 1;
    boolean m = false;

    public EllieEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
        this.B = -85;
        this.C = -175;
        this.D = -85;
        this.E = new Vec3(-0.1, 0.05, 0.0);
    }

    @Override
    public void i_() {
        this.d("Okay, I will be residing here then..");
        com.trolmastercard.sexmod.registry.ModSounds.a(this, "ellie", "huh");
    }

    @Override
    public String a() {
        return "Ellie";
    }

    boolean e() {
        return this.ao() ? false : this.level().getBlockState(this.blockPosition().offset(0, 2, 0)).getBlock() != Blocks.AIR;
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(this.e() ? 1.53F : 1.9F);
    }

    @Override
    public void d_() {
        UUID var1 = this.al();
        if (var1 == null) {
            this.v();
        } else {
            Player var2 = this.level().getPlayerByUUID(var1);
            if (var2 == null) {
                this.v();
            } else {
                float var3 = var2.getYRot() - 180.0F;
                this.a_(var3);
                this.c(com.trolmastercard.sexmod.entity.ScenePose.bu);
                this.d(true);
            }
        }
    }

    public boolean a(Player var1, boolean var2) {
        if (var2) {
            com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[]{"action.names.cowgirl", "action.names.missionary"}, false);
            return true;
        } else if ((Integer)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.at) == 0) {
            com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[]{"action.names.dressup"}, true);
            return true;
        } else {
            com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[]{"Face fuck"}, true);
            return true;
        }
    }

    @Override
    public void i() {
        super.i();
        this.d("stay safe darling~");
        com.trolmastercard.sexmod.registry.ModSounds.a(this, "ellie", "sigh");
    }

    @Override
    public void a(String var1, UUID var2) {
        super.a(var1, var2);
        if ("action.names.cowgirl".equals(var1)) {
            this.a("scene", "cowgirl");
            this.a(true, var2);
        } else if ("action.names.missionary".equals(var1)) {
            this.a("scene", "Missionary");
            this.a(true, var2);
        } else if ("action.names.dressup".equals(var1)) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.n);
        } else if ("Face fuck".equals(var1)) {
            this.a("scene", "Missionary");
            this.a(true, var2);
        }
    }

    protected void a(boolean var1, UUID var2) {
        super.a(var1, true, var2);
    }

    @Override
    protected void a(ServerPlayer var1, boolean var2) {
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        com.trolmastercard.sexmod.entity.ScenePose var2 = this.ai();
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.r && !this.level().isClientSide()) {
            this.h = 79;
        }

        if (var2 != com.trolmastercard.sexmod.entity.ScenePose.P || var1 != com.trolmastercard.sexmod.entity.ScenePose.O && var1 != com.trolmastercard.sexmod.entity.ScenePose.N) {
            if (var2 != com.trolmastercard.sexmod.entity.ScenePose.z || var1 != com.trolmastercard.sexmod.entity.ScenePose.x && var1 != com.trolmastercard.sexmod.entity.ScenePose.y) {
                if (var2 != com.trolmastercard.sexmod.entity.ScenePose.bt || var1 != com.trolmastercard.sexmod.entity.ScenePose.br && var1 != com.trolmastercard.sexmod.entity.ScenePose.bs) {
                    if (var1 == com.trolmastercard.sexmod.entity.ScenePose.bu) {
                        this.a = 0;
                    }

                    super.c(var1);
                }
            }
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide()) {
            if (this.c) {
                this.a(com.trolmastercard.sexmod.client.ClientUtils.b(), true);
                this.c = false;
            }

            this.l();
            this.j();
        }
    }

    void j() {
        if (!com.trolmastercard.sexmod.client.HornyMeterOverlay.a()) {
            if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.br) {
                com.trolmastercard.sexmod.client.HornyMeterOverlay.d();
            }
        }
    }

    void k() {
        if (this.a != -1) {
            if (++this.a >= 110) {
                this.a = -1;
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.bu) {
                    UUID var1 = this.al();
                    if (var1 != null) {
                        Player var2 = this.level().getPlayerByUUID(var1);
                        if (var2 != null) {
                            float var3 = this.e_();
                            Vec3 var4 = this.am().add(com.trolmastercard.sexmod.util.RotationMath.a(new Vec3(0.0, 2.5625F - var2.getEyeHeight(), -0.3125), 180.0F + var3));
                            var2.teleportTo(var4.x, var4.y, var4.z);
                        }
                    }
                }
            }
        }
    }

    void l() {
        if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.v) {
            Player var1 = this.level().getNearestPlayer(this, 10.0);
            if (var1 != null) {
                if (!(this.distanceTo(var1) > 1.5F)) {
                    if (com.trolmastercard.sexmod.client.ClientUtils.a(var1.getUUID())) {
                    }
                }
            }
        }
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        this.m();
        this.t();
        this.u();
        this.r();
        this.q();
        this.p();
        this.o();
        this.n();
        this.k();
    }

    void m() {
        if (!this.d) {
            this.d = true;
            this.noPhysics = false;
            this.setNoGravity(false);
        }
    }

    @Override
    protected void c_() {
        String var1 = (String)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.av);
        if ("Missionary".equals(var1)) {
            this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.at, 0);
            this.c(com.trolmastercard.sexmod.entity.ScenePose.M);
            UUID var2 = this.al();
            if (var2 == null) {
                return;
            }

            Player var3 = this.level().getPlayerByUUID(var2);
            if (var3 == null) {
                this.f_();
                return;
            }

            var3.setNoGravity(true);
            var3.noPhysics = true;
            Vec3 var4 = this.am();
            var3.setYRot(this.e_());
            Vec3 var5 = com.trolmastercard.sexmod.util.RotationMath.a(new Vec3(0.0, 0.0, 0.1), var3.getYRot());
            var4 = var4.add(var5);
            var3.teleportTo(var4.x, var4.y, var4.z);
        }

        if ("cowgirl".equals(var1)) {
            this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.at, 0);
            this.c(com.trolmastercard.sexmod.entity.ScenePose.w);
            UUID var6 = this.al();
            if (var6 == null) {
                return;
            }

            Player var7 = this.level().getPlayerByUUID(var6);
            if (var7 == null) {
                this.f_();
                return;
            }

            var7.setNoGravity(true);
            var7.noPhysics = true;
            Vec3 var9 = this.am();
            var7.setYRot(this.e_() + 180.0F);
            Vec3 var11 = com.trolmastercard.sexmod.util.RotationMath.a(new Vec3(0.0, 1.0 - var7.getEyeHeight(), -1.8125), var7.getYRot());
            var9 = var9.add(var11);
            var7.teleportTo(var9.x, var9.y, var9.z);
        }
    }

    void n() {
        if (--this.e == 0) {
            this.c_();
        }
    }

    void o() {
        if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.v && this.e < 0) {
            Player var1 = this.level().getNearestPlayer(this, 10.0);
            if (var1 != null) {
                if (!(this.distanceTo(var1) > 1.5F)) {
                    this.e = 20;
                    this.q(var1.getUUID());
                }
            }
        }
    }

    void p() {
        if (--this.f == 0) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.q);
        }
    }

    void q() {
        if (--this.g == 0) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.v);
        }
    }

    void r() {
        if (--this.h == 0 && !this.i) {
            this.i = true;
            this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ap, false);
            this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
            this.noPhysics = false;
            this.setNoGravity(false);
            if (this.j == null) {
                this.j = this.s();
            }

            if (this.j == null) {
                this.c("no bed in sight...");
                com.trolmastercard.sexmod.registry.ModSounds.a(this, "ellie", "sigh");
                this.az();
                this.v();
            } else {
                Player var1 = this.level().getPlayerByUUID(this.al());
                if (var1 != null) {
                    var1.setNoGravity(false);
                    var1.noPhysics = false;
                }

                Vec3 var2 = (Vec3)this.j[0];
                int var3 = (Integer)this.j[1];
                if (var2.distanceTo(this.position()) > 1.0) {
                    this.getNavigation().moveTo(var2.x, var2.y, var2.z, 0.35F);
                    this.au();
                } else {
                    this.d(var2);
                    this.a_(var3);
                    this.c(com.trolmastercard.sexmod.entity.ScenePose.u);
                    this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ap, true);
                    this.g = 109;
                    this.noPhysics = true;
                    this.setNoGravity(true);
                    this.i = false;
                    this.j = null;
                }
            }
        }
    }

    @Override
    public void a_() {
        super.a_();
        this.f = -1;
    }

    Object[] s() {
        int var3 = -1;
        int var4 = 0;
        Vec3[][] var5 = new Vec3[][]{
            {new Vec3(0.5, 0.0, -0.18), new Vec3(0.0, 0.0, -1.0), new Vec3(0.0, 0.0, 1.0)},
            {new Vec3(0.5, 0.0, 1.18), new Vec3(0.0, 0.0, 1.0), new Vec3(0.0, 0.0, -1.0)},
            {new Vec3(-0.18, 0.0, 0.5), new Vec3(-1.0, 0.0, 0.0), new Vec3(1.0, 0.0, 0.0)},
            {new Vec3(1.18, 0.0, 0.5), new Vec3(1.0, 0.0, 0.0), new Vec3(-1.0, 0.0, 0.0)}
        };
        int[] var6 = new int[]{0, 180, -90, 90};

        Vec3 var1;
        do {
            BlockPos var2;
            if ((var2 = this.a(this.blockPosition(), ++var4)) == null) {
                return null;
            }

            var1 = new Vec3(var2.getX(), var2.getY(), var2.getZ());

            for (int var7 = 0; var7 < var5.length; var7++) {
                Vec3 var8 = var1.add(var5[var7][1]);
                Block var9 = this.level().getBlockState(BlockPos.containing(var8.x, var8.y, var8.z)).getBlock();
                Vec3 var10 = var1.add(var5[var7][2]);
                Block var11 = this.level().getBlockState(BlockPos.containing(var10.x, var10.y, var10.z)).getBlock();
                if (var9 == Blocks.AIR && var11 == Blocks.RED_BED) {
                    if (var3 == -1) {
                        var3 = var7;
                    } else {
                        double var12 = this.position().distanceToSqr(var1.add(var5[var3][0]));
                        double var14 = this.position().distanceToSqr(var1.add(var5[var7][0]));
                        if (var14 < var12) {
                            var3 = var7;
                        }
                    }
                }
            }
        } while (var3 == -1);

        Vec3 var16 = var1.add(var5[var3][0]);
        return new Object[]{var16, var6[var3]};
    }

    void t() {
    }

    void u() {
        if (--this.k == 0) {
            UUID var1 = this.al();
            if (var1 == null) {
                this.v();
            } else {
                Player var2 = this.level().getPlayerByUUID(var1);
                if (var2 == null) {
                    this.v();
                } else {
                    var2.setNoGravity(true);
                    var2.noPhysics = true;
                    Vec3 var3 = com.trolmastercard.sexmod.util.RotationMath.a(new Vec3(0.0, 0.0, -0.5), var2.getYRot());
                    Vec3 var4 = var3.add(var2.position());
                    this.d(var4);
                    this.a_(var2.getYRot());
                    this.c(com.trolmastercard.sexmod.entity.ScenePose.p);
                    this.f = 150;
                }
            }
        }
    }

    void v() {
        this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ap, false);
        this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
        this.q((UUID)null);
        this.noPhysics = false;
        this.setNoGravity(false);
        this.i = false;
        this.f = -1;
        this.k = -1;
        this.h = -1;
        this.j = null;
    }

    public InteractionResult mobInteract(Player var1, InteractionHand var2) {
        if (com.trolmastercard.sexmod.entity.GirlEntity.d(var1) != null) {
            return InteractionResult.PASS;
        }

        if (this.al() != null) {
            return InteractionResult.PASS;
        }

        if (this.level().isClientSide()) {
            String var3 = (Integer)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.at) == 0
                ? "action.names.dressup"
                : "action.names.strip";
            com.trolmastercard.sexmod.entity.GirlEntity.a(
                var1, this, new String[]{"action.names.cowgirl", "action.names.missionary", "Face fuck", var3}, true
            );
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose b(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.y || var1 == com.trolmastercard.sexmod.entity.ScenePose.x) {
            return com.trolmastercard.sexmod.entity.ScenePose.z;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.O || var1 == com.trolmastercard.sexmod.entity.ScenePose.N) {
            return com.trolmastercard.sexmod.entity.ScenePose.P;
        } else {
            return var1 != com.trolmastercard.sexmod.entity.ScenePose.br && var1 != com.trolmastercard.sexmod.entity.ScenePose.bs ? null : com.trolmastercard.sexmod.entity.ScenePose.bt;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.w) {
            return com.trolmastercard.sexmod.entity.ScenePose.x;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.M) {
            return com.trolmastercard.sexmod.entity.ScenePose.N;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.x) {
            return com.trolmastercard.sexmod.entity.ScenePose.y;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.N) {
            return com.trolmastercard.sexmod.entity.ScenePose.O;
        } else {
            return var1 == com.trolmastercard.sexmod.entity.ScenePose.br ? com.trolmastercard.sexmod.entity.ScenePose.bs : null;
        }
    }

    @Override
    protected String h() {
        return "animation.ellie.idle";
    }

    @Override
    protected PlayState a(AnimationState<GirlEntity> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a && this.ai().cq) {
                    this.a("animation.ellie.eyes", true, var1);
                } else {
                    this.a("animation.ellie.null", true, var1);
                }
                break;
            case "movement":
                if (this.ai() != null && this.ai().cp) {
                    return PlayState.STOP;
                }

                if (this.ai() != null && this.ai() != com.trolmastercard.sexmod.entity.ScenePose.a) {
                    this.a("animation.ellie.sit", true, var1);
                } else if (this.isPassenger()) {
                    this.a("animation.ellie.sit", true, var1);
                } else if (Math.abs(this.xOld - this.getX()) + Math.abs(this.zOld - this.getZ()) > 0.0) {
                    switch (this.ag()) {
                        case c:
                            this.a("animation.ellie.run", true, var1);
                            return PlayState.CONTINUE;
                        case b:
                            this.a("animation.ellie.fastwalk", true, var1);
                            return PlayState.CONTINUE;
                        case a:
                            this.a("animation.ellie.walk", true, var1);
                            return PlayState.CONTINUE;
                        default:
                            this.a("animation.ellie.idle", true, var1);
                    }
                } else {
                    this.a("animation.ellie.idle", true, var1);
                }
                break;
            case "action":
                switch (this.ai()) {
                    case a:
                        return PlayState.STOP;
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
                        break;
                    case C:
                        this.a("animation.ellie.ride", true, var1);
                        break;
                    case D:
                        this.a("animation.ellie.sit", true, var1);
                        break;
                    case E:
                        this.a("animation.ellie.throwpearl", true, var1);
                        break;
                    case F:
                        this.a("animation.ellie.downed", true, var1);
                        break;
                    case A:
                        this.a("animation.ellie.attack0", true, var1);
                        break;
                    case B:
                        this.a("animation.ellie.bowcharge", true, var1);
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
