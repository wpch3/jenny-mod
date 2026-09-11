package com.trolmastercard.sexmod.entity;

import java.util.EnumSet;
import javax.annotation.Nullable;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.control.MoveControl.Operation;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

public class FriendlySlimeEntity extends Mob {
    public static int a = 8400;
    private static final EntityDataAccessor<Integer> e = SynchedEntityData.defineId(com.trolmastercard.sexmod.entity.FriendlySlimeEntity.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Integer> f = SynchedEntityData.defineId(com.trolmastercard.sexmod.entity.FriendlySlimeEntity.class, EntityDataSerializers.INT);
    public float b;
    public float c;
    public float d;
    private boolean g;

    public FriendlySlimeEntity(EntityType<? extends Mob> var1, Level var2) {
        super(var1, var2);
        this.moveControl = new FriendlySlimeEntity.c(this);
    }

    public static Builder a() {
        return Mob.createMobAttributes()
            .add(Attributes.MAX_HEALTH, 1.0)
            .add(Attributes.MOVEMENT_SPEED, 0.3)
            .add(Attributes.FOLLOW_RANGE, 16.0)
            .add(Attributes.ATTACK_DAMAGE, 0.0);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FriendlySlimeEntity.a(this));
        this.goalSelector.addGoal(5, new FriendlySlimeEntity.b(this));
        this.goalSelector.addGoal(2, new FriendlySlimeEntity.d(this));
    }

    protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder var1) {
        super.defineSynchedData(var1);
        var1.define(e, 1);
        var1.define(f, 0);
    }

    protected void a(int var1, boolean var2) {
        this.entityData.set(e, var1);
        this.reapplyPosition();
        this.refreshDimensions();
        AttributeInstance var3 = this.getAttribute(Attributes.MAX_HEALTH);
        if (var3 != null) {
            var3.setBaseValue(var1 * var1);
        }

        AttributeInstance var4 = this.getAttribute(Attributes.MOVEMENT_SPEED);
        if (var4 != null) {
            var4.setBaseValue(0.2F + 0.1F * var1);
        }

        if (var2) {
            this.setHealth(this.getMaxHealth());
        }

        this.xpReward = var1;
    }

    public int b() {
        return (Integer)this.entityData.get(e);
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        float var2 = 0.51000005F * this.b();
        return EntityDimensions.scalable(var2, var2).withEyeHeight(0.625F * var2);
    }

    public boolean causeFallDamage(float var1, float var2, DamageSource var3) {
        return false;
    }

    public boolean removeWhenFarAway(double var1) {
        return false;
    }

    public void addAdditionalSaveData(CompoundTag var1) {
        super.addAdditionalSaveData(var1);
        var1.putInt("Size", this.b() - 1);
        var1.putBoolean("wasOnGround", this.g);
        var1.putInt("ageInTicks", (Integer)this.entityData.get(f));
    }

    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        int var2 = var1.getInt("Size");
        if (var2 < 0) {
            var2 = 0;
        }

        this.a(var2 + 1, false);
        this.g = var1.getBoolean("wasOnGround");
        this.entityData.set(f, var1.getInt("ageInTicks"));
    }

    public boolean c() {
        return this.b() <= 1;
    }

    public void onSyncedDataUpdated(EntityDataAccessor<?> var1) {
        if (LunaHookEntity.equals(var1)) {
            this.refreshDimensions();
            this.setYRot(this.yHeadRot);
            this.setYBodyRot(this.yHeadRot);
        }

        super.onSyncedDataUpdated(var1);
    }

    public void die(DamageSource var1) {
        int var2 = this.b();
        if (!this.level().isClientSide() && var2 > 1 && this.isDeadOrDying()) {
            int var3 = 2 + this.random.nextInt(3);

            for (int var4 = 0; var4 < var3; var4++) {
                float var5 = (var4 % 2 - 0.5F) * var2 / 4.0F;
                float var6 = (var4 / 2 - 0.5F) * var2 / 4.0F;
                com.trolmastercard.sexmod.entity.FriendlySlimeEntity var7 = this.h();
                if (this.hasCustomName()) {
                    var7.setCustomName(this.getCustomName());
                }

                if (this.isPersistenceRequired()) {
                    var7.setPersistenceRequired();
                }

                var7.a(var2 / 2, true);
                var7.moveTo(this.getX() + var5, this.getY() + 0.5, this.getZ() + var6, this.random.nextFloat() * 360.0F, 0.0F);
                this.level().addFreshEntity(var7);
            }
        }

        super.die(var1);
    }

    protected SoundEvent getHurtSound(DamageSource var1) {
        return this.c() ? SoundEvents.SLIME_HURT_SMALL : SoundEvents.SLIME_HURT;
    }

    protected SoundEvent getDeathSound() {
        return this.c() ? SoundEvents.SLIME_DEATH_SMALL : SoundEvents.SLIME_DEATH;
    }

    protected SoundEvent d() {
        return this.c() ? SoundEvents.SLIME_SQUISH_SMALL : SoundEvents.SLIME_SQUISH;
    }

    protected SoundEvent e() {
        return this.c() ? SoundEvents.SLIME_JUMP_SMALL : SoundEvents.SLIME_JUMP;
    }

    protected float getSoundVolume() {
        return 0.4F * this.b();
    }

    public int getMaxHeadXRot() {
        return 0;
    }

    protected boolean f() {
        return this.b() > 0;
    }

    protected float getJumpPower() {
        return 0.42F;
    }

    @Nullable
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor var1, DifficultyInstance var2, MobSpawnType var3, @Nullable SpawnGroupData var4) {
        this.a(1, true);
        return super.finalizeSpawn(var1, var2, var3, var4);
    }

    protected int g() {
        return this.random.nextInt(100) + 50;
    }

    protected com.trolmastercard.sexmod.entity.FriendlySlimeEntity h() {
        EntityType var1 = (EntityType)com.trolmastercard.sexmod.registry.ModEntities.x.get();
        return (com.trolmastercard.sexmod.entity.FriendlySlimeEntity)var1.create(this.level());
    }

    public void tick() {
        super.tick();
        this.c = this.c + (this.b - this.c) * 0.5F;
        this.d = this.c;
        if (this.onGround() && !this.g) {
            if (this.f()) {
                this.playSound(this.d(), this.getSoundVolume(), ((this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F) * 0.8F);
            }

            this.b = -0.5F;
        } else if (!this.onGround() && this.g) {
            this.b = 1.0F;
        }

        this.g = this.onGround();
        this.b *= 0.6F;
    }

    static class a extends Goal {
        private final com.trolmastercard.sexmod.entity.FriendlySlimeEntity a;

        public a(com.trolmastercard.sexmod.entity.FriendlySlimeEntity var1) {
            this.a = var1;
            this.setFlags(EnumSet.of(Flag.JUMP, Flag.MOVE));
            if (var1.getNavigation() instanceof GroundPathNavigation var2) {
                var2.setCanFloat(true);
            }
        }

        public boolean canUse() {
            return (this.a.isInWater() || this.a.isInLava()) && this.a.getMoveControl() instanceof FriendlySlimeEntity.c;
        }

        public void tick() {
            if (this.a.getRandom().nextFloat() < 0.8F) {
                this.a.getJumpControl().jump();
            }

            ((FriendlySlimeEntity.c)this.a.getMoveControl()).a(1.2);
        }
    }

    static class b extends Goal {
        private final com.trolmastercard.sexmod.entity.FriendlySlimeEntity a;

        public b(com.trolmastercard.sexmod.entity.FriendlySlimeEntity var1) {
            this.a = var1;
            this.setFlags(EnumSet.of(Flag.JUMP, Flag.MOVE));
        }

        public boolean canUse() {
            return true;
        }

        public void tick() {
            ((FriendlySlimeEntity.c)this.a.getMoveControl()).a(1.0);
        }
    }

    static class c extends MoveControl {
        private float a;
        private int b;
        private final com.trolmastercard.sexmod.entity.FriendlySlimeEntity c;
        private boolean d;

        public c(com.trolmastercard.sexmod.entity.FriendlySlimeEntity var1) {
            super(var1);
            this.c = var1;
            this.a = 180.0F * var1.getYRot() / (float) Math.PI;
        }

        public void a(float var1, boolean var2) {
            this.a = var1;
            this.d = var2;
        }

        public void a(double var1) {
            this.speedModifier = var1;
            this.operation = Operation.MOVE_TO;
        }

        public void tick() {
            this.mob.setYRot(this.rotlerp(this.mob.getYRot(), this.a, 90.0F));
            this.mob.yHeadRot = this.mob.getYRot();
            this.mob.yBodyRot = this.mob.getYRot();
            if (this.operation != Operation.MOVE_TO) {
                this.mob.setZza(0.0F);
            } else {
                this.operation = Operation.WAIT;
                if (this.mob.onGround()) {
                    this.mob.setSpeed((float)(this.speedModifier * this.mob.getAttributeValue(Attributes.MOVEMENT_SPEED)));
                    if (this.b-- <= 0) {
                        this.b = this.c.g();
                        if (this.d) {
                            this.b /= 3;
                        }

                        this.c.getJumpControl().jump();
                        if (this.c.f()) {
                            this.c
                                .playSound(
                                    this.c.e(),
                                    this.c.getSoundVolume(),
                                    ((this.c.getRandom().nextFloat() - this.c.getRandom().nextFloat()) * 0.2F + 1.0F) * 0.8F
                                );
                        }
                    } else {
                        this.c.xxa = 0.0F;
                        this.c.zza = 0.0F;
                        this.mob.setSpeed(0.0F);
                    }
                } else {
                    this.mob.setSpeed((float)(this.speedModifier * this.mob.getAttributeValue(Attributes.MOVEMENT_SPEED)));
                }
            }
        }
    }

    static class d extends Goal {
        private final com.trolmastercard.sexmod.entity.FriendlySlimeEntity a;
        private float b;
        private int c;

        public d(com.trolmastercard.sexmod.entity.FriendlySlimeEntity var1) {
            this.a = var1;
            this.setFlags(EnumSet.of(Flag.LOOK));
        }

        public boolean canUse() {
            return true;
        }

        public void tick() {
            if (--this.c <= 0) {
                this.c = 40 + this.a.getRandom().nextInt(60);
                this.b = this.a.getRandom().nextInt(360);
            }

            ((FriendlySlimeEntity.c)this.a.getMoveControl()).a(this.b, false);
        }
    }
}
