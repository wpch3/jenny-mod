package com.trolmastercard.sexmod.f.a;

import com.trolmastercard.sexmod.f.j;
import com.trolmastercard.sexmod.f.b.l;
import java.util.EnumSet;
import java.util.UUID;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class a extends Goal {
    private final l a;
    private Player b;
    private LivingEntity c;
    private int d;
    private int e;
    private boolean f;

    public a(l var1) {
        this.a = var1;
        this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET));
    }

    public boolean canUse() {
        return !this.a.F && !this.a.ar() && this.a() != null;
    }

    public boolean canContinueToUse() {
        return !this.a.F && !this.a.ar() && this.a() != null;
    }

    private Player a() {
        UUID var1 = this.a.ax();
        if (var1 == null) {
            return null;
        }

        Player var2 = this.a.level().getPlayerByUUID(var1);
        return var2 != null && var2.isAlive() ? var2 : null;
    }

    public void start() {
        this.b = this.a();
    }

    public void stop() {
        this.a.getNavigation().stop();
        this.b = null;
        this.c = null;
        if (this.f) {
            this.e();
        }
    }

    public void tick() {
        this.b = this.a();
        if (this.b != null) {
            if (this.b.getVehicle() instanceof AbstractHorse var2 && var2.isTamed()) {
                this.a(var2);
            } else {
                if (this.f) {
                    this.e();
                }

                if (this.c == null || !this.c.isAlive() || this.c.distanceToSqr(this.a) > 256.0) {
                    this.c = this.b();
                }

                if (this.c != null) {
                    this.a(this.c);
                } else {
                    this.d();
                }
            }
        }
    }

    private LivingEntity b() {
        LivingEntity var1 = this.a.getLastHurtByMob();
        if (var1 != null && var1.isAlive()) {
            return var1;
        }

        LivingEntity var2 = this.b.getLastHurtByMob();
        if (var2 != null && var2.isAlive() && var2.distanceToSqr(this.a) <= 256.0) {
            return var2;
        }

        AABB var3 = this.a.getBoundingBox().inflate(16.0);
        LivingEntity var4 = null;
        double var5 = Double.MAX_VALUE;

        for (LivingEntity var8 : this.a.level().getEntitiesOfClass(LivingEntity.class, var3, var0 -> var0 instanceof Enemy && var0.isAlive())) {
            double var9 = var8.distanceToSqr(this.a);
            if (var9 < var5) {
                var5 = var9;
                var4 = var8;
            }
        }

        return var4;
    }

    private void a(LivingEntity var1) {
        this.a.getLookControl().setLookAt(var1);
        if (this.a.distanceToSqr(var1) <= 4.0) {
            this.c();
            this.a.getNavigation().moveTo(var1, 1.2);
            if (this.d > 0) {
                this.d--;
            }

            if (this.d == 0 && this.a.level() instanceof ServerLevel) {
                this.a.doHurtTarget(var1);
                this.d = 20;
            }
        } else {
            ItemStack var2 = this.a.G.getStackInSlot(1);
            if (var2.getItem() instanceof BowItem && this.a.hasLineOfSight(var1)) {
                this.a.getNavigation().stop();
                if (this.e == 0) {
                    this.a.c(j.B);
                }

                if (++this.e >= 32) {
                    this.a(var1, var2);
                    this.c();
                }
            } else {
                this.c();
                this.a.getNavigation().moveTo(var1, 1.2);
            }
        }
    }

    private void c() {
        if (this.e > 0) {
            this.a.c(j.a);
        }

        this.e = 0;
    }

    private void a(LivingEntity var1, ItemStack var2) {
        if (this.a.level() instanceof ServerLevel var3) {
            AbstractArrow var13 = ProjectileUtil.getMobArrow(this.a, new ItemStack(Items.ARROW), 1.6F, var2);
            double var5 = var1.getX() - this.a.getX();
            double var7 = var1.getY(0.3333) - var13.getY();
            double var9 = var1.getZ() - this.a.getZ();
            double var11 = Math.sqrt(var5 * var5 + var9 * var9);
            var13.shoot(var5, var7 + var11 * 0.2, var9, 1.6F, 2.0F);
            var3.addFreshEntity(var13);
        }
    }

    private void d() {
        double var1 = this.a.distanceToSqr(this.b);
        if (var1 > 144.0) {
            this.a.getNavigation().moveTo(this.b, 1.0);
        } else if (var1 < 4.0) {
            this.a.getNavigation().stop();
        }
    }

    private void a(AbstractHorse var1) {
        this.a.getNavigation().stop();
        this.c();
        this.c = null;
        if (!this.f) {
            this.f = true;
            this.a.setNoGravity(true);
            this.a.noPhysics = true;
            this.a.c(j.C);
        }

        Vec3 var2 = var1.getLookAngle();
        Vec3 var3 = this.b.position().subtract(var2.x * 0.5, 0.0, var2.z * 0.5);
        this.a.setPos(var3.x, var3.y, var3.z);
        this.a.setDeltaMovement(Vec3.ZERO);
    }

    private void e() {
        this.f = false;
        this.a.setNoGravity(false);
        this.a.noPhysics = false;
        this.a.c(j.a);
    }
}
