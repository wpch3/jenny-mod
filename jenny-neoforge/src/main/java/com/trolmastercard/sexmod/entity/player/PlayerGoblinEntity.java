package com.trolmastercard.sexmod.entity.player;

import com.trolmastercard.sexmod.entity.OwnableNpc;
import com.trolmastercard.sexmod.entity.VariantGirlEntity;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
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

public class PlayerGoblinEntity extends PlayerVariantGirlEntity implements OwnableNpc {
    public static final EntityDataAccessor<String> s = SynchedEntityData.defineId(PlayerGoblinEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> t = SynchedEntityData.defineId(PlayerGoblinEntity.class, EntityDataSerializers.BOOLEAN);
    int u = -1;
    int v = 0;
    int w = 0;
    com.trolmastercard.sexmod.entity.ScenePose x = com.trolmastercard.sexmod.entity.ScenePose.a;
    int y = -1;
    boolean z = true;
    boolean O = false;

    public PlayerGoblinEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(t, false);
        var1.define(s, "");
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(0.75F);
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[]{"anal", "paizuri"}, false);
        return true;
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.I) {
            return com.trolmastercard.sexmod.entity.ScenePose.J;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.bo) {
            return com.trolmastercard.sexmod.entity.ScenePose.bp;
        } else {
            return var1 == com.trolmastercard.sexmod.entity.ScenePose.bc ? com.trolmastercard.sexmod.entity.ScenePose.bf : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose b(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.I || var1 == com.trolmastercard.sexmod.entity.ScenePose.J) {
            return com.trolmastercard.sexmod.entity.ScenePose.L;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.bo || var1 == com.trolmastercard.sexmod.entity.ScenePose.bp) {
            return com.trolmastercard.sexmod.entity.ScenePose.bq;
        } else {
            return var1 != com.trolmastercard.sexmod.entity.ScenePose.bc && var1 != com.trolmastercard.sexmod.entity.ScenePose.bf ? null : com.trolmastercard.sexmod.entity.ScenePose.bh;
        }
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        com.trolmastercard.sexmod.entity.ScenePose var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.entity.ScenePose.L || var1 != com.trolmastercard.sexmod.entity.ScenePose.I && var1 != com.trolmastercard.sexmod.entity.ScenePose.J) {
            if (var2 != com.trolmastercard.sexmod.entity.ScenePose.bq || var1 != com.trolmastercard.sexmod.entity.ScenePose.bo && var1 != com.trolmastercard.sexmod.entity.ScenePose.bp) {
                if (var2 != com.trolmastercard.sexmod.entity.ScenePose.bh || var1 != com.trolmastercard.sexmod.entity.ScenePose.bc && var1 != com.trolmastercard.sexmod.entity.ScenePose.bf) {
                    if (var1 == com.trolmastercard.sexmod.entity.ScenePose.G && !this.level().isClientSide()) {
                        this.x();
                    }

                    if (var1 == com.trolmastercard.sexmod.entity.ScenePose.bn && !this.level().isClientSide()) {
                        this.w();
                    }

                    if (var1 == com.trolmastercard.sexmod.entity.ScenePose.bq) {
                        this.entityData.set(t, true);
                    }

                    if (var2 == com.trolmastercard.sexmod.entity.ScenePose.bq && var1 != com.trolmastercard.sexmod.entity.ScenePose.bq) {
                        this.entityData.set(t, false);
                    }

                    super.c(var1);
                }
            }
        }
    }

    void w() {
        Player var1 = this.level().getPlayerByUUID(this.al());
        if (var1 != null) {
            this.a_(var1.getYRot());
            this.noPhysics = true;
            this.setNoGravity(true);
            var1.setNoGravity(true);
            var1.noPhysics = true;
            var1.teleportTo(var1.getX(), var1.getY(), var1.getZ() - 1.0);
        }
    }

    void x() {
        Player var1 = this.level().getPlayerByUUID(this.al());
        if (var1 != null) {
            this.a_(var1.getYRot() + 180.0F);
            this.noPhysics = true;
            this.setNoGravity(true);
            var1.setNoGravity(true);
            var1.noPhysics = true;
            var1.teleportTo(var1.getX(), var1.getY() - 0.5, var1.getZ() - 0.6);
            var1.setXRot(70.0F);
            var1.xRotO = 70.0F;
        }
    }

    @Override
    protected String a(StringBuilder var1) {
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, 3);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, 2);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, 2);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, 7);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, 7);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, 5);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, com.trolmastercard.sexmod.entity.GoblinColorA.values().length - 1);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, com.trolmastercard.sexmod.entity.GoblinColorB.values().length - 1);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, com.trolmastercard.sexmod.entity.GoblinColorC.values().length - 1);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.b(var1, 0);
        return var1.toString();
    }

    @Override
    public void a(List<Integer> var1) {
        StringBuilder var2 = new StringBuilder();

        for (int var4 : var1) {
            com.trolmastercard.sexmod.entity.VariantGirlEntity.b(var2, var4);
        }

        com.trolmastercard.sexmod.entity.VariantGirlEntity.b(var2, 1);
        this.entityData.set(n, var2.toString());
    }

    @Override
    protected void v() {
    }

    @Override
    public void a_() {
        super.a_();
        this.entityData.set(t, false);
        if (this.g_() != null) {
            this.a((UUID)null);
        }
    }

    @Override
    public void tick() {
        com.trolmastercard.sexmod.entity.GoblinEntity.d(this);
        this.z();
        this.y();
        super.tick();
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        com.trolmastercard.sexmod.entity.GoblinEntity.e(this);
        this.A();
        this.B();
    }

    void y() {
        com.trolmastercard.sexmod.entity.ScenePose var1 = this.ai();
        if (var1 != com.trolmastercard.sexmod.entity.ScenePose.aV) {
            if (var1 != com.trolmastercard.sexmod.entity.ScenePose.aU || this.C() <= 15) {
                UUID var2 = this.g_();
                if (var2 != null) {
                    Player var3 = this.level().getPlayerByUUID(var2);
                    if (var3 != null) {
                        Player var4 = this.q();
                        if (var4 != null) {
                            var4.noPhysics = true;
                            var4.setNoGravity(true);
                            var4.moveTo(var3.getX(), var3.getY() + 2.0, var3.getZ(), var4.getYRot(), var4.getXRot());
                        }
                    }
                }
            }
        }
    }

    void z() {
        int var1 = this.C();
        if (var1 != -1) {
            this.a(++var1);
            Player var2 = this.q();
            if (var2 != null) {
                if (var1 == 15) {
                    float var3 = com.trolmastercard.sexmod.entity.GoblinEntity.c(this);
                    float var4 = com.trolmastercard.sexmod.entity.GoblinEntity.b(this);
                    Vec3 var5 = com.trolmastercard.sexmod.entity.GoblinEntity.a(new Vec3(0.0, 0.0, 1.5), var3, var4);
                    var2.setDeltaMovement(var5.x, var5.y, var5.z);
                    if (!this.level().isClientSide()) {
                        this.a_(var4);
                    }
                }

                var2.noPhysics = false;
                var2.setNoGravity(false);
                if (var1 == 39) {
                    this.a(-1);
                    this.c(com.trolmastercard.sexmod.entity.ScenePose.aV);
                    this.q((UUID)null);
                    this.a((UUID)null);
                }
            }
        }
    }

    void A() {
        if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.aV) {
            Player var1 = this.q();
            if (var1 != null) {
                if (var1.onGround()) {
                    int var2 = this.D() + 1;
                    this.c(var2);
                    if (var2 >= 30) {
                        this.c(0);
                        this.c(com.trolmastercard.sexmod.entity.ScenePose.bm);
                    }
                }
            }
        }
    }

    void B() {
        if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.bm) {
            if (++this.w >= 37) {
                this.w = 0;
                this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
            }
        }
    }

    @Nullable
    @Override
    public UUID g_() {
        String var1 = (String)this.entityData.get(s);
        if ("".equals(var1)) {
            return null;
        }

        try {
            return UUID.fromString((String)this.entityData.get(s));
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Override
    public void a(UUID var1) {
        this.entityData.set(s, var1 == null ? "" : var1.toString());
    }

    @Override
    public void a(int var1) {
        this.u = var1;
    }

    public int C() {
        return this.u;
    }

    public void c(int var1) {
        this.v = var1;
    }

    public int D() {
        return this.v;
    }

    @Override
    public void a(com.trolmastercard.sexmod.entity.ScenePose var1) {
        this.x = var1;
    }

    @Override
    public com.trolmastercard.sexmod.entity.ScenePose c() {
        return this.x;
    }

    @Override
    public void b(int var1) {
        this.y = var1;
    }

    @Override
    public int b() {
        return this.y;
    }

    @Override
    protected PlayState a(AnimationState<com.trolmastercard.sexmod.entity.GirlEntity> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a) {
                    this.a("animation.goblin.blink", true, var1);
                } else {
                    this.a("animation.goblin.null", true, var1);
                }
                break;
            case "movement":
                if (this.ai() != com.trolmastercard.sexmod.entity.ScenePose.a) {
                    this.a("animation.goblin.null", true, var1);
                } else {
                    double var5 = Math.abs(this.xOld - this.getX()) + Math.abs(this.zOld - this.getZ());
                    if (!(Boolean)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ap) && var5 > 0.0) {
                        if (this.onGround() && Math.abs(Math.abs(this.yOld) - Math.abs(this.getY())) < 0.1 && var5 > 0.2) {
                            this.a("animation.goblin.walk", true, var1);
                            this.setYRot(this.getYHeadRot());
                        } else {
                            this.a("animation.goblin.fly", true, var1);
                        }
                    } else {
                        this.a("animation.goblin.idle", true, var1);
                    }
                }
                break;
            case "action":
                switch (this.ai()) {
                    case a:
                        this.a("animation.goblin.null", true, var1);
                        break;
                    case aO:
                        this.a("animation.goblin.shoulder_idle", true, var1);
                        break;
                    case aP:
                        this.a("animation.goblin.pick_up_3person", true, var1);
                        break;
                    case D:
                        this.a("animation.goblin.sit", true, var1);
                        break;
                    case aQ:
                        if (this.onGround()) {
                            this.a("animation.goblin.running", true, var1);
                        } else {
                            this.a("animation.goblin.fly", true, var1);
                        }
                        break;
                    case aR:
                        this.a("animation.goblin.catch_3person", true, var1);
                        break;
                    case aS:
                        this.a("animation.goblin.catch_3personBj", true, var1);
                        break;
                    case aT:
                        this.a("animation.goblin.catch_3personBj_idle", true, var1);
                        break;
                    case aU:
                        this.a("animation.goblin.throw_3person", true, var1);
                        break;
                    case aV:
                        this.a("animation.goblin.thrown", true, var1);
                        break;
                    case G:
                        this.a("animation.goblin.paizuri_start", true, var1);
                        break;
                    case I:
                        this.a("animation.goblin.paizuri_slow", true, var1);
                        break;
                    case J:
                        this.a("animation.goblin.paizuri_fast", true, var1);
                        break;
                    case K:
                        this.a("animation.goblin.paizuri_fast_countinues", true, var1);
                        break;
                    case H:
                        this.a("animation.goblin.paizuri_idle", true, var1);
                        break;
                    case L:
                        this.a("animation.goblin.paizuri_cum", true, var1);
                        break;
                    case aW:
                        this.a("animation.goblin.jump_1", true, var1);
                        break;
                    case aX:
                        this.a("animation.goblin.jump_2", true, var1);
                        break;
                    case aY:
                        this.a("animation.goblin.jump_3", true, var1);
                        break;
                    case aZ:
                        this.a("animation.goblin.breeding_intro_1", true, var1);
                        break;
                    case ba:
                        this.a("animation.goblin.breeding_intro_2", true, var1);
                        break;
                    case bb:
                        this.a("animation.goblin.breeding_intro_3", true, var1);
                        break;
                    case bc:
                        this.a("animation.goblin.breeding_slow_1r", true, var1);
                        break;
                    case be:
                        this.a("animation.goblin.breeding_slow_3", true, var1);
                        break;
                    case bf:
                        this.a("animation.goblin.breeding_fast_1" + (this.z ? "c" : "s"), true, var1);
                        break;
                    case bg:
                        this.a("animation.goblin.breeding_fast_3", true, var1);
                        break;
                    case bh:
                        this.a("animation.goblin.breeding_cum_1", true, var1);
                        break;
                    case bi:
                        this.a("animation.goblin.breeding_cum_2", true, var1);
                        break;
                    case bj:
                        this.a("animation.goblin.breeding_cum_3", true, var1);
                        break;
                    case bd:
                        this.a("animation.goblin.breeding_2", true, var1);
                        break;
                    case bk:
                        this.a("animation.goblin.await_pick_up", true, var1);
                        break;
                    case bm:
                        this.a("animation.goblin.stand_up", false, var1);
                        break;
                    case bn:
                        this.a("animation.goblin.nelson_intro", true, var1);
                        break;
                    case bo:
                        this.a("animation.goblin.nelson_slow" + (this.O ? "" : "2"), true, var1);
                        break;
                    case bp:
                        this.a("animation.goblin.nelson_fasts", true, var1);
                        break;
                    case bq:
                        this.a("animation.goblin.nelson_cum", true, var1);
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
