package com.trolmastercard.sexmod.f;

import java.util.List;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class b extends Mob {
    public double a = 1.0;
    Vec3 b = Vec3.ZERO;
    boolean c = false;
    boolean d = true;
    com.trolmastercard.sexmod.f.b.e e;

    public b(EntityType<? extends Mob> var1, Level var2) {
        super(var1, var2);
    }

    public b(EntityType<? extends Mob> var1, Level var2, com.trolmastercard.sexmod.f.b.e var3, Vec3 var4) {
        this(var1, var2);
        this.b = var4;
        this.e = var3;
    }

    public static Builder a() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 1.0).add(Attributes.MOVEMENT_SPEED, 0.0);
    }

    protected boolean canAddPassenger(Entity var1) {
        return false;
    }

    public boolean isPushable() {
        return false;
    }

    public void tick() {
        if (!this.isRemoved()) {
            this.noPhysics = true;
            this.setNoGravity(true);
            this.setDeltaMovement(this.b.x, this.b.y, this.b.z);
            super.tick();
            if (this.level().isClientSide()) {
                this.a(
                    com.trolmastercard.sexmod.m.i.a(this.xo, this.getX(), 0.5),
                    com.trolmastercard.sexmod.m.i.a(this.yo, this.getY(), 0.5),
                    com.trolmastercard.sexmod.m.i.a(this.zo, this.getZ(), 0.5)
                );
                this.a(this.getX(), this.getY(), this.getZ());
            }

            this.b();
            if (!this.level().getBlockState(this.blockPosition()).isAir()) {
                this.c();
                this.discard();
            }
        }
    }

    private void a(double var1, double var3, double var5) {
        RandomSource var7 = this.getRandom();
        this.level()
            .addParticle(
                ParticleTypes.DRAGON_BREATH,
                var1 + var7.nextDouble() * 0.3F,
                var3 + 0.25 + var7.nextDouble() * 0.3F,
                var5 + var7.nextDouble() * 0.3F,
                0.0,
                0.0,
                0.0
            );
    }

    void b() {
        if (!this.level().isClientSide()) {
            if (this.c) {
                Vec3 var1 = this.position();
                AABB var2 = new AABB(var1.x - 0.75, var1.y - 0.75, var1.z - 0.75, var1.x + 0.75, var1.y + 0.75, var1.z + 0.75);
                List var3 = this.level().getEntitiesOfClass(com.trolmastercard.sexmod.f.b.e.class, var2);
                if (!var3.isEmpty()) {
                    this.level().explode(this, this.getX(), this.getY(), this.getZ(), 1.0F, ExplosionInteraction.MOB);

                    for (com.trolmastercard.sexmod.f.b.e var5 : var3) {
                        var5.b(this.position());
                    }

                    this.discard();
                }
            }
        }
    }

    void c() {
        if (!this.level().isClientSide()) {
            if (!this.isRemoved()) {
                if (this.d) {
                    Vec3 var1 = new Vec3(this.getX(), this.blockPosition().getY() + 1, this.getZ());
                    if (!this.a(var1)) {
                        this.level().explode(this, this.getX(), this.getY(), this.getZ(), 2.0F, ExplosionInteraction.MOB);
                        this.d = false;
                    } else {
                        WitherSkeleton var2 = (WitherSkeleton)((EntityType)BuiltInRegistries.ENTITY_TYPE
                                .get(ResourceLocation.withDefaultNamespace("wither_skeleton")))
                            .create(this.level());
                        if (var2 != null) {
                            var2.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.STONE_SWORD));
                            var2.moveTo(var1.x, var1.y, var1.z, 0.0F, 0.0F);
                            this.level().addFreshEntity(var2);
                            if (this.e != null) {
                                this.e.u.add(var2);
                            }
                        }
                    }
                }
            }
        }
    }

    boolean a(Vec3 var1) {
        if (this.e == null) {
            return true;
        }

        LivingEntity var2 = this.e.p();
        return var2 == null ? true : var2.distanceToSqr(var1.x, var1.y, var1.z) < 225.0;
    }

    public boolean hurt(DamageSource var1, float var2) {
        if (var1.is(DamageTypes.FELL_OUT_OF_WORLD)) {
            this.setHealth(0.0F);
            this.d = false;
            this.discard();
            return true;
        }

        if (var1.is(DamageTypes.ARROW)) {
            this.setHealth(0.0F);
            this.d = false;
            Entity var4 = var1.getDirectEntity();
            if (var4 != null) {
                var4.discard();
            }

            this.discard();
            return true;
        } else {
            Entity var3 = var1.getEntity();
            if (!(var3 instanceof Player)) {
                return false;
            }

            this.b = var3.getLookAngle();
            this.c = true;
            return true;
        }
    }

    public void readAdditionalSaveData(CompoundTag var1) {
        this.discard();
    }
}
