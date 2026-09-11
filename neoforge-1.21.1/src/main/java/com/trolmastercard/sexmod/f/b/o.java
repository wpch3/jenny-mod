package com.trolmastercard.sexmod.f.b;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class o extends k {
    o.a a;
    public static final EntityDataAccessor<Integer> b = SynchedEntityData.defineId(o.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<Float> c = SynchedEntityData.defineId(o.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Integer> d = SynchedEntityData.defineId(o.class, EntityDataSerializers.INT);
    int e;
    boolean f;
    boolean g;
    int h;

    public o(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
        this.a = o.a.a;
        this.e = 0;
        this.f = true;
        this.g = false;
        this.h = 0;
        this.a = o.a.a;
        this.e = 0;
        this.f = true;
        this.g = false;
        this.h = 0;
    }

    @Override
    public String a() {
        return "Slime";
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
    protected void registerGoals() {
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(b, 0);
        var1.define(c, 0.0F);
        var1.define(d, -1);
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
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.c) {
            return com.trolmastercard.sexmod.f.j.f;
        } else {
            return var1 == com.trolmastercard.sexmod.f.j.k ? com.trolmastercard.sexmod.f.j.l : null;
        }
    }

    protected float getJumpPower() {
        return 0.9F;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag var1) {
        super.addAdditionalSaveData(var1);
        var1.putInt("hornyLevel", (Integer)this.entityData.get(b));
        var1.putInt("ticksUntilBirth", (Integer)this.entityData.get(d));
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        this.entityData.set(b, var1.getInt("hornyLevel"));
        this.entityData.set(d, var1.contains("ticksUntilBirth") ? var1.getInt("ticksUntilBirth") : -1);
        if ((Integer)this.entityData.get(b) != 0) {
            this.entityData.set(k.at, 0);
        }

        this.noPhysics = false;
        this.setNoGravity(false);
    }

    @Override
    public void a_() {
        this.entityData.set(b, 0);
        this.entityData.set(k.at, 1);
    }

    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();
        this.m();
        this.l();
    }

    @Override
    public void tick() {
        super.tick();
        if (this.ai() == com.trolmastercard.sexmod.f.j.a) {
            this.n();
        }

        if ((Integer)this.entityData.get(b) >= 2 && this.tickCount % 10 == 0) {
            a(ParticleTypes.HEART, this);
        }

        if (this.level().isClientSide()) {
            this.e();
            this.b();
        }
    }

    @Override
    void b() {
        if (this.al() != null) {
            Player var1 = com.trolmastercard.sexmod.b.b.b();
            if (var1 != null && this.al().equals(var1.getUUID())) {
                Vec3 var2 = this.position();
                Vec3 var3 = com.trolmastercard.sexmod.m.o.a(new Vec3(0.0, 0.0, 0.65), this.e_());
                Vec3 var4 = var2.add(var3);
                var1.setPos(var4.x, var4.y, var4.z);
                var1.setDeltaMovement(0.0, 0.0, 0.0);
            }
        }
    }

    void e() {
        int var1 = (Integer)this.entityData.get(d);
        if (var1 != -1) {
            a(ParticleTypes.WITCH, this);
            if (var1 == 0) {
                com.trolmastercard.sexmod.i.e.a(this, "misc.plob");
            }
        }
    }

    void l() {
        int var1 = (Integer)this.entityData.get(d);
        if (var1 != -1) {
            this.entityData.set(d, var1 - 1);
            if (--var1 < 0) {
                this.entityData.set(d, -1);
            }
        }
    }

    void m() {
        int var1 = (Integer)this.entityData.get(b);
        if (var1 >= 2) {
            if (var1 >= 4 && this.onGround() && this.ai() == com.trolmastercard.sexmod.f.j.a) {
                this.d(this.position());
                this.a_(this.getYRot());
                this.entityData.set(k.ap, true);
                this.setNoGravity(true);
                this.noPhysics = true;
                this.c(com.trolmastercard.sexmod.f.j.h);
            } else {
                Player var2 = this.level().getNearestPlayer(this, 1.0);
                if (var2 != null && var2.onGround() && d(var2) == null) {
                    this.d(this.position());
                    this.a_(this.getYRot());
                    this.entityData.set(k.ap, true);
                    this.setNoGravity(true);
                    this.noPhysics = true;
                    var2.setNoGravity(true);
                    var2.noPhysics = true;
                    this.q(var2.getUUID());
                    var2.setYRot(this.e_());
                    Vec3 var3 = com.trolmastercard.sexmod.m.o.a(new Vec3(0.0, 0.0, 0.65), this.e_());
                    var2.setPos(this.getX() + var3.x, this.getY(), this.getZ() + var3.z);
                    if (this.ai() == com.trolmastercard.sexmod.f.j.i) {
                        this.c(com.trolmastercard.sexmod.f.j.j);
                    } else {
                        this.c(com.trolmastercard.sexmod.f.j.c);
                    }
                }
            }
        }
    }

    void n() {
        if (this.level().isClientSide()) {
            if (this.e == 90) {
                this.a = o.a.b;
            }

            if (!this.f && this.onGround()) {
                this.a = o.a.d;
                this.e = 0;
            }

            float var1 = (Float)this.entityData.get(c);
            this.setYRot(var1);
            this.setYHeadRot(var1);
            this.setYBodyRot(var1);
        } else {
            if (this.e == 85) {
                this.entityData.set(c, this.p());
            }

            if (this.e == 100) {
                this.o();
            }

            if (!this.f && this.onGround()) {
                this.g = (Integer)this.entityData.get(d) == -1 && this.getRandom().nextFloat() < 0.1F;
            }

            if (this.g && this.e == 50) {
                int var3 = (Integer)this.entityData.get(b);
                int var2 = var3 + 1;
                this.entityData.set(b, var2);
                if (var2 == 1) {
                    this.c(com.trolmastercard.sexmod.f.j.s);
                }
            }
        }

        if (this.onGround()) {
            this.e++;
        }

        this.f = this.onGround();
    }

    void o() {
        float var1 = (Float)this.entityData.get(c);
        this.setYRot(var1);
        this.yRotO = var1;
        this.jumpFromGround();
        Vec3 var2 = com.trolmastercard.sexmod.m.o.a(new Vec3(0.0, 0.0, 0.7), var1);
        Vec3 var3 = this.getDeltaMovement();
        this.setDeltaMovement(var2.x, var3.y, var2.z);
        this.e = 0;
    }

    float p() {
        int var1 = (Integer)this.entityData.get(b);
        if ((Integer)this.entityData.get(d) != -1) {
            return this.q();
        } else if (var1 < 2) {
            return this.q();
        } else {
            Player var2 = this.level().getNearestPlayer(this, 30.0);
            if (var2 == null) {
                return this.q();
            } else {
                return d(var2) != null ? this.q() : (float)Math.atan2(this.getZ() - var2.getZ(), this.getX() - var2.getX()) * (float) (180.0 / Math.PI) + 90.0F;
            }
        }
    }

    float q() {
        return com.trolmastercard.sexmod.d.f.a.nextFloat() * 360.0F;
    }

    public boolean causeFallDamage(float var1, float var2, DamageSource var3) {
        return false;
    }

    @Override
    protected String h() {
        return "animation.slime.idle";
    }

    @Override
    protected PlayState a(AnimationState<k> var1) {
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
                    this.a(this.a.a(), true, var1);
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

    enum a {
        a("animation.slime.idle"),
        b("animation.slime.jumpstart"),
        c("animation.slime.jumpair"),
        d("animation.slime.jumpend");

        final String e;

        public String a() {
            return this.e;
        }

        a(String var3) {
            this.e = var3;
        }
    }
}
