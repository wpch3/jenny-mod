package com.trolmastercard.sexmod.entity;

import com.trolmastercard.sexmod.entity.Triggerable;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class ManglelieEntity extends GirlEntity implements Triggerable {
    public static final EntityDataAccessor<String> a = SynchedEntityData.defineId(ManglelieEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> b = SynchedEntityData.defineId(ManglelieEntity.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Integer> c = SynchedEntityData.defineId(ManglelieEntity.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<String> d = SynchedEntityData.defineId(ManglelieEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> e = SynchedEntityData.defineId(ManglelieEntity.class, EntityDataSerializers.BOOLEAN);
    private UUID v = null;
    public boolean f = true;
    public Vec3 g = Vec3.ZERO;
    public float h = 0.0F;
    boolean i = true;
    boolean j = false;
    boolean k = false;
    public float l = 0.0F;
    public float m = 0.0F;
    public float n = 0.0F;
    public float o = 0.0F;
    boolean p = false;
    boolean q = false;
    boolean r = false;
    boolean s = false;
    boolean t = false;
    public int u = 2;
    // Official f8 model-state fields (ce.d / ce.b / ce builders read/write these).
    public boolean aj = false;
    public float V = 0.0F;
    public Vec3 R = null;
    public int an = 0;
    public float T = 0.0F;
    public float af = 0.0F;
    public float ai = 0.0F;
    public float W = 0.0F;
    public float carryBlend = 0.0F;

    public ManglelieEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(a, "");
        var1.define(b, false);
        var1.define(c, -1);
        var1.define(d, "");
        var1.define(e, false);
    }

    @Override
    public String a() {
        return "Manglelie";
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new AvoidEntityGoal<Player>(this, Player.class, 20.0F, 1.0, 1.2) {
            public boolean canUse() {
                return !ManglelieEntity.this.A() && super.canUse();
            }

            public boolean canContinueToUse() {
                return !ManglelieEntity.this.A() && super.canContinueToUse();
            }

            public void start() {
                ManglelieEntity.this.entityData.set(com.trolmastercard.sexmod.entity.ManglelieEntity.e, true);
                super.start();
            }

            public void stop() {
                ManglelieEntity.this.entityData.set(com.trolmastercard.sexmod.entity.ManglelieEntity.e, false);
                super.stop();
            }
        });
    }

    private boolean A() {
        if (this.e() != null) {
            return true;
        }

        AABB var1 = this.getBoundingBox().inflate(20.0);

        for (GalathEntity var3 : this.level().getEntitiesOfClass(GalathEntity.class, var1)) {
            if (!var3.level().isClientSide() && !var3.isRemoved() && var3.b()) {
                return true;
            }
        }

        return false;
    }

    public void a(boolean var1) {
        this.entityData.set(b, var1);
    }

    public boolean b() {
        return (Boolean)this.entityData.get(b);
    }

    @Nullable
    public UUID e() {
        String var1 = (String)this.entityData.get(a);
        if ("".equals(var1)) {
            return null;
        }

        try {
            return UUID.fromString(var1);
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Nullable
    public GirlEntity b(boolean var1) {
        UUID var2 = this.e();
        if (var2 == null) {
            return null;
        } else {
            return var1 ? com.trolmastercard.sexmod.entity.GirlEntity.t(var2) : com.trolmastercard.sexmod.entity.GirlEntity.s(var2);
        }
    }

    public void a(UUID var1) {
        if (var1 == null) {
            this.entityData.set(a, "");
        } else {
            this.entityData.set(a, var1.toString());
        }
    }

    @Override
    public Float e_() {
        return super.e_();
    }

    public void l() {
        this.j = true;
    }

    @Override
    protected void customServerAiStep() {
        if (this.p) {
            this.discard();
        } else {
            this.y();
            this.w();
            super.customServerAiStep();
            this.v();
            this.x();
            this.s();
            this.u();
            this.t();
            this.q();
            this.p();
            this.n();
            this.m();
        }
    }

    void m() {
        if (this.e() != null) {
            this.i = false;
        }

        if (!this.i) {
            if (this.b(true) == null) {
                System.out.println("removed non-wild mang for lack of mommy");
                this.discard();
            }
        }
    }

    void n() {
        GirlEntity var1 = this.b(true);
        if (var1 != null) {
            ;
        }
    }

    public long o() {
        String var1 = (String)this.entityData.get(d);
        if ("".equals(var1)) {
            return -1L;
        }

        try {
            return Long.parseLong(var1);
        } catch (Exception var3) {
            return -1L;
        }
    }

    public void a(long var1) {
        this.entityData.set(d, Long.toString(var1));
        this.k = false;
    }

    void p() {
        long var1 = this.o();
        if (var1 != -1L) {
            long var3 = this.level().getGameTime();
            if (!((float)var3 < 28.0F + (float)var1)) {
                if (!this.k) {
                    Entity var5 = this.r();
                    if (var5 != null) {
                        GirlEntity var6 = this.b(true);
                        if (var6 != null) {
                            this.k = true;
                        }
                    }
                }
            }
        }
    }

    public boolean canBeAffected(MobEffectInstance var1) {
        return false;
    }

    void q() {
        boolean var1 = this.e() != null;
        this.setNoGravity(var1);
        this.noPhysics = var1;
    }

    public boolean isPickable() {
        return this.e() == null;
    }

    @Nullable
    public Entity r() {
        int var1 = (Integer)this.entityData.get(c);
        return var1 == -1 ? null : this.level().getEntity(var1);
    }

    void a(int var1) {
        this.entityData.set(c, var1);
        long var2 = var1 == -1 ? -1L : this.level().getGameTime();
        this.a(var2);
    }

    void s() {
        Entity var1 = this.r();
        if (var1 != null) {
            GirlEntity var2 = this.b(true);
            if (var2 == null) {
                this.a(-1);
            } else if (!this.b()) {
                this.a(-1);
            } else {
                if (a(var1, var2)) {
                    this.a(-1);
                }
            }
        }
    }

    public static boolean a(Entity var0, GirlEntity var1) {
        if (!var0.isAlive()) {
            return true;
        }

        if (var0.level().dimension() != var1.level().dimension()) {
            return true;
        }

        Vec3 var2 = var0.position().subtract(var1.position());
        return var2.x * var2.x + var2.z * var2.z > 225.0;
    }

    void t() {
        if (this.r() == null) {
            if (this.b()) {
                GirlEntity var1 = this.b(true);
                if (var1 != null) {
                    if (var1.al() == null) {
                        if (var1.ai() != com.trolmastercard.sexmod.entity.ScenePose.cc) {
                            ;
                        }
                    }
                }
            }
        }
    }

    void u() {
        Entity var1 = this.r();
        if (var1 != null) {
            GirlEntity var2 = this.b(true);
            if (var2 != null) {
                long var3 = this.o();
                if (var3 != -1L) {
                    long var5 = this.level().getGameTime();
                    long var7 = var5 - this.o();
                    if (!((float)var7 < 60.0F)) {
                        this.k = false;
                        this.a(-1);
                    }
                }
            }
        }
    }

    void v() {
        if (this.v != null) {
            GirlEntity var1 = com.trolmastercard.sexmod.entity.GirlEntity.t(this.v);
        }
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (this.ai() != com.trolmastercard.sexmod.entity.ScenePose.ch
            || !com.trolmastercard.sexmod.entity.ScenePose.a(var1, com.trolmastercard.sexmod.entity.ScenePose.cg, com.trolmastercard.sexmod.entity.ScenePose.cf)) {
            if (!this.level().isClientSide() && var1 == com.trolmastercard.sexmod.entity.ScenePose.ch) {
            }

            super.c(var1);
        }
    }

    @Override
    public InteractionResult mobInteract(Player var1, InteractionHand var2) {
        InteractionResult var3 = super.mobInteract(var1, var2);
        if (var3 != InteractionResult.PASS) {
            return var3;
        }

        if (this.level().isClientSide()) {
            this.a(var1);
        }

        return InteractionResult.SUCCESS;
    }

    public boolean a(Player var1) {
        if (this.al() != null) {
            return false;
        }

        com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[0], true);
        return true;
    }

    void w() {
        if (!this.b()
            || com.trolmastercard.sexmod.entity.ScenePose.a(this.ai(), com.trolmastercard.sexmod.entity.ScenePose.cf, com.trolmastercard.sexmod.entity.ScenePose.ch, com.trolmastercard.sexmod.entity.ScenePose.cg)
            )
         {
            GirlEntity var1 = this.b(true);
            if (var1 != null) {
                ;
            }
        }
    }

    @Override
    public void a_(float var1) {
        super.a_(var1);
    }

    void x() {
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        return null;
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose b(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (com.trolmastercard.sexmod.entity.ScenePose.a(var1, com.trolmastercard.sexmod.entity.ScenePose.cg, com.trolmastercard.sexmod.entity.ScenePose.cf)) {
            this.r = true;
        }

        return null;
    }

    @Override
    public void a_() {
        if (this.b()) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.ce);
            this.a_(0.0F);
        }
    }

    public boolean checkSpawnRules(LevelAccessor var1, MobSpawnType var2) {
        return super.checkSpawnRules(var1, var2);
    }

    @Override
    protected boolean a(com.trolmastercard.sexmod.entity.ScenePose var1, String var2, boolean var3, AnimationState<GirlEntity> var4) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.ch) {
            this.r = false;
            this.s = false;
            this.t = false;
            this.u = 2;
            this.f_();
            return true;
        } else if (this.r && var1 == com.trolmastercard.sexmod.entity.ScenePose.cg) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.ch);
            this.a("animation.shared.double_holding_cum", true, var4, true);
            return true;
        } else if ((this.r || var3) && var1 == com.trolmastercard.sexmod.entity.ScenePose.cf) {
            this.s = false;
            this.c(com.trolmastercard.sexmod.entity.ScenePose.cg);
            this.a("animation.shared.double_holding_soft", true, var4, true);
            return true;
        } else if (this.r) {
            return false;
        } else if (var3 && !this.s && var1 == com.trolmastercard.sexmod.entity.ScenePose.cg) {
            this.s = true;
            this.a("animation.shared.double_holding_hard", true, var4, true);
            return true;
        } else if (!var3 && var1 == com.trolmastercard.sexmod.entity.ScenePose.cg) {
            this.t = true;
            this.c(com.trolmastercard.sexmod.entity.ScenePose.cf);
            this.a("animation.shared.double_holding_back", true, var4, true);
            return true;
        } else if (this.t && var1 == com.trolmastercard.sexmod.entity.ScenePose.cf) {
            this.t = false;
            this.a("animation.shared.double_holding_slow", true, var4, true);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag var1) {
        super.addAdditionalSaveData(var1);
        UUID var2 = this.e();
        var1.putString("sexmod:mommy", var2 == null ? "" : var2.toString());
        var1.putBoolean("sexmod:iswild", this.i);
        if (this.j) {
            var1.putBoolean("sexmod:despawned", true);
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        String var2 = var1.getString("sexmod:mommy");
        if (!"".equals(var2)) {
            this.v = UUID.fromString(var2);
        }

        if (var1.getBoolean("sexmod:despawned")) {
            this.p = true;
        }

        this.i = var1.getBoolean("sexmod:iswild");
    }

    @Override
    protected boolean ae() {
        return false;
    }

    @Override
    public void b(String var1) {
        super.b(var1);
    }

    void y() {
        if (!this.q) {
            this.q = true;
        }
    }

    public boolean hurt(DamageSource var1, float var2) {
        if (var1.is(DamageTypes.FELL_OUT_OF_WORLD)) {
            return super.hurt(var1, var2);
        }

        GirlEntity var3 = this.b(true);
        return var3 == null ? super.hurt(var1, var2) : super.hurt(var1, var2);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide()) {
            this.z();
        }
    }

    void z() {
    }

    @Override
    public void d_() {
    }

    @Override
    protected String h() {
        return "animation.manglelie.idle";
    }

    @Override
    protected PlayState a(AnimationState<GirlEntity> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.r() == null) {
                    return PlayState.STOP;
                }

                this.a("animation.manglelie.angry_face", true, var1);
                return PlayState.CONTINUE;
            case "movement":
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a && this.b()) {
                    return PlayState.STOP;
                }

                if (Math.abs(this.xOld - this.getX()) + Math.abs(this.zOld - this.getZ()) > 0.0) {
                    if ((Boolean)this.entityData.get(e)) {
                        this.a("animation.manglelie.scared_run", true, var1);
                    } else {
                        this.a("animation.manglelie.walk", true, var1);
                    }

                    this.setYRot(this.getYHeadRot());
                } else {
                    this.a("animation.manglelie.idle", true, var1);
                }

                return PlayState.CONTINUE;
            case "action":
                switch (this.ai()) {
                    case a:
                        return PlayState.STOP;
                    case aQ:
                        this.a("animation.manglelie.running", true, var1);
                        break;
                    case ce:
                        this.a("animation.manglelie.sit_on_galath", true, var1);
                        break;
                    case cf:
                        if (this.t) {
                            this.a("animation.shared.double_holding_back", true, var1);
                        } else {
                            this.a("animation.shared.double_holding_slow", 4, 0.33F, var1);
                        }
                        break;
                    case cg:
                        if (this.s) {
                            this.a("animation.shared.double_holding_hard", 3, 0.33F, var1);
                        } else {
                            this.a("animation.shared.double_holding_soft", true, var1);
                        }
                        break;
                    case ch:
                        this.a("animation.shared.double_holding_cum", true, var1);
                        break;
                    default:
                        return PlayState.STOP;
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
