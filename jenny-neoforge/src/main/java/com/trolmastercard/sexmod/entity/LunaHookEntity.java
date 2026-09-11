package com.trolmastercard.sexmod.entity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public class LunaHookEntity extends Entity {
    private static final EntityDataAccessor<String> c = SynchedEntityData.defineId(LunaHookEntity.class, EntityDataSerializers.STRING);
    private static final EntityDataAccessor<Integer> d = SynchedEntityData.defineId(LunaHookEntity.class, EntityDataSerializers.INT);
    private boolean e;
    private int f;
    private int g;
    public int a;
    private int h;
    private int i;
    private float j;
    public Entity b;
    private LunaHookEntity.a k = LunaHookEntity.a.a;
    private int l;
    private int m;

    public LunaHookEntity(EntityType<? extends Entity> var1, Level var2) {
        super(var1, var2);
    }

    public LunaHookEntity(EntityType<? extends Entity> var1, Level var2, com.trolmastercard.sexmod.entity.LunaEntity var3, double var4) {
        this(var1, var2);
        this.a(var3);
        var3.g = this;
        this.a(var4);
    }

    public void a(@Nullable com.trolmastercard.sexmod.entity.LunaEntity var1) {
        this.getEntityData().set(c, var1 == null ? "" : var1.ah().toString());
    }

    protected void defineSynchedData(Builder var1) {
        var1.define(c, "");
        var1.define(d, 0);
    }

    @Nullable
    com.trolmastercard.sexmod.entity.LunaEntity a() {
        String var1 = (String)this.getEntityData().get(c);
        if ("".equals(var1)) {
            return null;
        } else {
            return com.trolmastercard.sexmod.entity.GirlEntity.t(UUID.fromString(var1)) instanceof com.trolmastercard.sexmod.entity.LunaEntity var3 ? var3 : null;
        }
    }

    @Nullable
    com.trolmastercard.sexmod.entity.LunaEntity b() {
        String var1 = (String)this.getEntityData().get(c);
        if ("".equals(var1)) {
            return null;
        } else {
            return com.trolmastercard.sexmod.entity.GirlEntity.s(UUID.fromString(var1)) instanceof com.trolmastercard.sexmod.entity.LunaEntity var3 ? var3 : null;
        }
    }

    @Nullable
    public com.trolmastercard.sexmod.entity.LunaEntity c() {
        return this.b();
    }

    public void a(int var1) {
        this.m = var1;
    }

    public void b(int var1) {
        this.l = var1;
    }

    public void baseTick() {
        super.baseTick();
        if (!this.level().isClientSide()) {
            if (this.b != null || this.onGround()) {
                if (this.a == 0) {
                    com.trolmastercard.sexmod.entity.LunaEntity var1 = this.a();
                    if (var1 != null) {
                        var1.n();
                    }
                }
            }
        }
    }

    public void a(double var1) {
        com.trolmastercard.sexmod.entity.LunaEntity var3 = this.a();
        if (var3 != null) {
            BlockPos var4 = var3.p;
            float var5 = (float)Math.sqrt(var3.position().distanceToSqr(var4.getX(), var4.getY(), var4.getZ()));
            float var6 = -22.5F + 45.0F * (var5 / 7.0F);
            float var7 = var3.e_();
            float var8 = Mth.cos(-var7 * (float) (Math.PI / 180.0) - (float) Math.PI);
            float var9 = Mth.sin(-var7 * (float) (Math.PI / 180.0) - (float) Math.PI);
            float var10 = -Mth.cos(-var6 * (float) (Math.PI / 180.0));
            float var11 = Mth.sin(-var6 * (float) (Math.PI / 180.0));
            double var12 = var3.xo + (var3.getX() - var3.xo) - var9 * 0.3;
            double var14 = var3.yo + (var3.getY() - var3.yo) + var3.getEyeHeight();
            double var16 = var3.zo + (var3.getZ() - var3.zo) - var8 * 0.3;
            this.moveTo(var12, var14, var16, var7, var6);
            double var18 = var1 * -var9;
            double var20 = var1 * Mth.clamp(-(var11 / var10), -5.0F, 5.0F);
            double var22 = var1 * -var8;
            float var24 = Mth.sqrt((float)(var18 * var18 + var20 * var20 + var22 * var22));
            var18 *= 0.6 / var24 + 0.5 + this.getRandom().nextGaussian() * 0.0045;
            var20 *= 0.6 / var24 + 0.5 + this.getRandom().nextGaussian() * 0.0045;
            var22 *= 0.6 / var24 + 0.5 + this.getRandom().nextGaussian() * 0.0045;
            this.setDeltaMovement(var18, var20, var22);
            float var25 = Mth.sqrt((float)(var18 * var18 + var22 * var22));
            this.setYRot((float)(Mth.atan2(var18, var22) * (180.0 / Math.PI)));
            this.setXRot((float)(Mth.atan2(var20, var25) * (180.0 / Math.PI)));
            this.yRotO = this.getYRot();
            this.xRotO = this.getXRot();
        }
    }

    public void onSyncedDataUpdated(EntityDataAccessor<?> var1) {
        if (KoboldEggEntity.equals(var1)) {
            int var2 = (Integer)this.getEntityData().get(d);
            this.b = var2 > 0 ? this.level().getEntity(var2 - 1) : null;
        }

        super.onSyncedDataUpdated(var1);
    }

    public void tick() {
        super.tick();
        if (this.a() == null) {
            this.discard();
        } else if (this.level().isClientSide() || !this.f()) {
            if (this.e) {
                this.f++;
                if (this.f >= 1200) {
                    this.discard();
                    return;
                }
            }

            float var1 = 0.0F;
            BlockPos var2 = this.blockPosition();
            BlockState var3 = this.level().getBlockState(var2);
            boolean var4 = !var3.getFluidState().isEmpty();
            if (var4) {
                var1 = var3.getFluidState().getHeight(this.level(), var2);
            }

            Vec3 var5 = this.getDeltaMovement();
            double var6 = var5.x;
            double var8 = var5.y;
            double var10 = var5.z;
            if (this.k == LunaHookEntity.a.a) {
                if (this.b != null) {
                    this.setDeltaMovement(0.0, 0.0, 0.0);
                    this.k = LunaHookEntity.a.b;
                    return;
                }

                if (var1 > 0.0F) {
                    this.setDeltaMovement(var6 * 0.3, var8 * 0.2, var10 * 0.3);
                    this.k = LunaHookEntity.a.c;
                    return;
                }

                if (!this.level().isClientSide()) {
                    this.h();
                }

                if (!this.e && !this.onGround() && !this.horizontalCollision) {
                    this.g++;
                } else {
                    this.g = 0;
                    this.setDeltaMovement(0.0, 0.0, 0.0);
                }
            } else {
                if (this.k == LunaHookEntity.a.b) {
                    if (this.b != null) {
                        if (this.b.isRemoved()) {
                            this.b = null;
                            this.k = LunaHookEntity.a.a;
                        } else {
                            this.setPosRaw(this.b.getX(), this.b.getBoundingBox().minY + this.b.getBbHeight() * 0.8, this.b.getZ());
                            this.moveTo(this.getX(), this.getY(), this.getZ());
                        }
                    }

                    return;
                }

                if (this.k == LunaHookEntity.a.c) {
                    var5 = this.getDeltaMovement();
                    var6 = var5.x;
                    var8 = var5.y;
                    var10 = var5.z;
                    var6 *= 0.9;
                    var10 *= 0.9;
                    double var12 = this.getY() + var8 - var2.getY() - var1;
                    if (Math.abs(var12) < 0.01) {
                        var12 += Math.signum(var12) * 0.1;
                    }

                    var8 -= var12 * this.getRandom().nextFloat() * 0.2;
                    this.setDeltaMovement(var6, var8, var10);
                    if (!this.level().isClientSide() && var1 > 0.0F) {
                        this.a(var2);
                    }
                }
            }

            if (var3.getFluidState().isEmpty()) {
                var5 = this.getDeltaMovement();
                this.setDeltaMovement(var5.x, var5.y - 0.03, var5.z);
            }

            this.move(MoverType.SELF, this.getDeltaMovement());
            this.g();
            var5 = this.getDeltaMovement();
            this.setDeltaMovement(var5.x * 0.92, var5.y * 0.92, var5.z * 0.92);
            this.moveTo(this.getX(), this.getY(), this.getZ());
        }
    }

    private boolean f() {
        return false;
    }

    private void g() {
        Vec3 var1 = this.getDeltaMovement();
        float var2 = Mth.sqrt((float)(var1.x * var1.x + var1.z * var1.z));
        this.setYRot((float)(Mth.atan2(var1.x, var1.z) * (180.0 / Math.PI)));
        this.setXRot((float)(Mth.atan2(var1.y, var2) * (180.0 / Math.PI)));

        while (this.getXRot() - this.xRotO < -180.0F) {
            this.xRotO -= 360.0F;
        }

        while (this.getXRot() - this.xRotO >= 180.0F) {
            this.xRotO += 360.0F;
        }

        while (this.getYRot() - this.yRotO < -180.0F) {
            this.yRotO -= 360.0F;
        }

        while (this.getYRot() - this.yRotO >= 180.0F) {
            this.yRotO += 360.0F;
        }

        this.setXRot(this.xRotO + (this.getXRot() - this.xRotO) * 0.2F);
        this.setYRot(this.yRotO + (this.getYRot() - this.yRotO) * 0.2F);
    }

    private void h() {
        Vec3 var1 = new Vec3(this.getX(), this.getY(), this.getZ());
        Vec3 var2 = this.getDeltaMovement();
        Vec3 var3 = new Vec3(this.getX() + var2.x, this.getY() + var2.y, this.getZ() + var2.z);
        BlockHitResult var4 = this.level().clip(new ClipContext(var1, var3, Block.COLLIDER, Fluid.NONE, this));
        var1 = new Vec3(this.getX(), this.getY(), this.getZ());
        var3 = new Vec3(this.getX() + var2.x, this.getY() + var2.y, this.getZ() + var2.z);
        if (var4.getType() != Type.MISS) {
            var3 = var4.getLocation();
        }

        Entity var5 = null;
        AABB var6 = this.getBoundingBox().expandTowards(var2.x, var2.y, var2.z).inflate(1.0);
        List var7 = this.level().getEntities(this, var6, var1x -> this.a(var1x));
        double var8 = 0.0;

        for (Entity var11 : var7) {
            if (this.a(var11) && (var11 != this.a() || this.g >= 5)) {
                AABB var12 = var11.getBoundingBox().inflate(0.3F);
                Optional var13 = var12.clip(var1, var3);
                if (!var13.isEmpty()) {
                    double var14 = var1.distanceToSqr((Vec3)var13.get());
                    if (var14 < var8 || var8 == 0.0) {
                        var5 = var11;
                        var8 = var14;
                    }
                }
            }
        }

        if (var5 != null) {
            this.b = var5;
            this.i();
        } else {
            if (var4.getType() == Type.MISS) {
                this.e = true;
            }
        }
    }

    private void i() {
        this.getEntityData().set(d, this.b.getId() + 1);
    }

    private void a(BlockPos var1) {
        ServerLevel var2 = (ServerLevel)this.level();
        int var3 = 1;
        BlockPos var4 = var1.above();
        if (this.getRandom().nextFloat() < 0.25F && this.level().isRainingAt(var4)) {
            var3++;
        }

        if (this.getRandom().nextFloat() < 0.5F && !this.level().canSeeSky(var4)) {
            var3--;
        }

        if (this.a > 0) {
            this.a--;
            if (this.a <= 0) {
                this.h = 0;
                this.i = 0;
            } else {
                this.setDeltaMovement(this.getDeltaMovement().add(0.0, -0.2 * this.getRandom().nextFloat() * this.getRandom().nextFloat(), 0.0));
            }
        } else {
            if (this.i > 0) {
                this.i -= var3;
                if (this.i > 0) {
                    this.j = (float)(this.j + this.getRandom().nextGaussian() * 4.0);
                    float var5 = this.j * (float) (Math.PI / 180.0);
                    float var6 = Mth.sin(var5);
                    float var7 = Mth.cos(var5);
                    double var8 = this.getX() + var6 * this.i * 0.1F;
                    double var10 = Mth.floor(this.getBoundingBox().minY) + 1.0F;
                    double var12 = this.getZ() + var7 * this.i * 0.1F;
                    BlockState var14 = var2.getBlockState(BlockPos.containing(var8, var10 - 1.0, var12));
                    if (var14.getFluidState().isEmpty()) {
                        return;
                    }

                    if (this.getRandom().nextFloat() < 0.15F) {
                        var2.sendParticles(ParticleTypes.BUBBLE, var8, var10 - 0.1F, var12, 1, var6, 0.1, var7, 0.0);
                    }

                    float var15 = var6 * 0.04F;
                    float var16 = var7 * 0.04F;
                    var2.sendParticles(ParticleTypes.FISHING, var8, var10, var12, 0, var16, 0.01, -var15, 1.0);
                    var2.sendParticles(ParticleTypes.FISHING, var8, var10, var12, 0, -var16, 0.01, var15, 1.0);
                } else {
                    this.setDeltaMovement(this.getDeltaMovement().x, -0.4F * Mth.nextFloat(this.getRandom(), 0.6F, 1.0F), this.getDeltaMovement().z);
                    this.playSound(SoundEvents.FISHING_BOBBER_SPLASH, 0.25F, 1.0F + (this.getRandom().nextFloat() - this.getRandom().nextFloat()) * 0.4F);
                    double var17 = this.getBoundingBox().minY + 0.5;
                    var2.sendParticles(
                        ParticleTypes.BUBBLE,
                        this.getX(),
                        var17,
                        this.getZ(),
                        (int)(1.0F + this.getBbWidth() * 20.0F),
                        this.getBbWidth(),
                        0.0,
                        this.getBbWidth(),
                        0.2
                    );
                    var2.sendParticles(
                        ParticleTypes.FISHING,
                        this.getX(),
                        var17,
                        this.getZ(),
                        (int)(1.0F + this.getBbWidth() * 20.0F),
                        this.getBbWidth(),
                        0.0,
                        this.getBbWidth(),
                        0.2
                    );
                    this.a = Mth.nextInt(this.getRandom(), 20, 40);
                }
            } else if (this.h > 0) {
                this.h -= var3;
                float var18 = 0.15F;
                if (this.h < 20) {
                    var18 += (20 - this.h) * 0.05F;
                } else if (this.h < 40) {
                    var18 += (40 - this.h) * 0.02F;
                } else if (this.h < 60) {
                    var18 += (60 - this.h) * 0.01F;
                }

                if (this.getRandom().nextFloat() < var18) {
                    float var19 = Mth.nextFloat(this.getRandom(), 0.0F, 360.0F) * (float) (Math.PI / 180.0);
                    float var20 = Mth.nextFloat(this.getRandom(), 25.0F, 60.0F);
                    double var21 = this.getX() + Mth.sin(var19) * var20 * 0.1F;
                    double var22 = Mth.floor(this.getBoundingBox().minY) + 1.0F;
                    double var23 = this.getZ() + Mth.cos(var19) * var20 * 0.1F;
                    BlockState var24 = var2.getBlockState(BlockPos.containing((int)var21, (int)var22 - 1, (int)var23));
                    if (!var24.getFluidState().isEmpty()) {
                        var2.sendParticles(ParticleTypes.SPLASH, var21, var22, var23, 2 + this.getRandom().nextInt(2), 0.1F, 0.0, 0.1F, 0.0);
                    }
                }

                if (this.h <= 0) {
                    this.j = Mth.nextFloat(this.getRandom(), 0.0F, 360.0F);
                    this.i = Mth.nextInt(this.getRandom(), 20, 80);
                }
            } else {
                this.h = Mth.nextInt(this.getRandom(), 100, 600);
                this.h = this.h - this.m * 20 * 5;
            }
        }
    }

    protected boolean a(Entity var1) {
        return var1.isPickable() || var1 instanceof ItemEntity;
    }

    public int d() {
        if (!this.level().isClientSide() && this.a() != null) {
            byte var1 = 0;
            if (this.b != null) {
                this.e();
                this.level().broadcastEntityEvent(this, (byte)31);
                var1 = (byte)(this.b instanceof ItemEntity ? 3 : 5);
            } else if (this.a > 0) {
                ServerLevel var2 = (ServerLevel)this.level();
                LootParams var3 = new net.minecraft.world.level.storage.loot.LootParams.Builder(var2)
                    .withParameter(LootContextParams.ORIGIN, this.position())
                    .withParameter(LootContextParams.TOOL, ItemStack.EMPTY)
                    .create(LootContextParamSets.FISHING);

                for (ItemStack var6 : var2.getServer().reloadableRegistries().getLootTable(BuiltInLootTables.FISHING).getRandomItems(var3)) {
                    com.trolmastercard.sexmod.entity.LunaEntity var7 = this.a();
                    var7.a(var6);
                }

                this.a = 9999;
                var1 = 1;
            }

            if (this.e) {
                var1 = 2;
            }

            return var1;
        } else {
            return 0;
        }
    }

    protected void e() {
        com.trolmastercard.sexmod.entity.LunaEntity var1 = this.a();
        if (var1 != null && this.b != null) {
            double var2 = var1.getX() - this.getX();
            double var4 = var1.getY() - this.getY();
            double var6 = var1.getZ() - this.getZ();
            this.b.setDeltaMovement(this.b.getDeltaMovement().add(var2 * 0.1, var4 * 0.1, var6 * 0.1));
        }
    }

    public boolean shouldRenderAtSqrDistance(double var1) {
        return var1 < 4096.0;
    }

    public boolean hurt(DamageSource var1, float var2) {
        return false;
    }

    protected boolean canRide(Entity var1) {
        return false;
    }

    public EntityDimensions getDimensions(Pose var1) {
        return EntityDimensions.fixed(0.25F, 0.25F);
    }

    public void addAdditionalSaveData(CompoundTag var1) {
    }

    public void readAdditionalSaveData(CompoundTag var1) {
    }

    enum a {
        a,
        b,
        c;
    }
}
