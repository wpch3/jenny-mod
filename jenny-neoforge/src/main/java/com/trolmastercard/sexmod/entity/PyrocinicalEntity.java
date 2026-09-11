package com.trolmastercard.sexmod.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.phys.Vec3;

public class PyrocinicalEntity extends Mob {
    BlockPos a = null;
    int b = 0;
    boolean c = false;
    public int d = -1;

    public PyrocinicalEntity(EntityType<? extends Mob> var1, Level var2) {
        super(var1, var2);
    }

    public static Builder a() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0).add(Attributes.MOVEMENT_SPEED, 0.3).add(Attributes.FOLLOW_RANGE, 16.0);
    }

    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        this.b();
    }

    void b() {
        if (this.c) {
            this.getNavigation().stop();
        } else {
            Player var1 = this.level().getNearestPlayer(this, 15.0);
            if (var1 != null && var1.distanceTo(this) < 3.0F) {
                this.getNavigation().stop();
            } else {
                boolean var2 = this.a != null && this.distanceToSqr(this.a.getX(), this.a.getY(), this.a.getZ()) <= this.d() * this.d();
                if (this.a == null || var2 && this.b > 175) {
                    int var3 = (this.getRandom().nextBoolean() ? 1 : -1) * this.getRandom().nextInt(10);
                    int var4 = (this.getRandom().nextBoolean() ? 1 : -1) * this.getRandom().nextInt(10);
                    int var5;
                    if (this.level().dimension() == Level.NETHER) {
                        var5 = (int)Math.ceil(this.getY());
                    } else {
                        var5 = this.blockPosition().getY();
                    }

                    this.a = new BlockPos(this.blockPosition().getX() + var3, var5, this.blockPosition().getZ() + var4);
                    this.b = 0;
                }

                if (Math.sqrt(this.a.distSqr(this.blockPosition())) > 2.0) {
                    this.getNavigation().moveTo(this.a.getX(), this.a.getY(), this.a.getZ(), 0.35);
                    this.c();
                } else {
                    this.b++;
                }
            }
        }
    }

    void c() {
        Path var1 = this.getNavigation().getPath();
        if (var1 != null) {
            if (this.onGround() || this.isInWater()) {
                int var2 = var1.getNextNodeIndex();
                int var3 = var1.getNodeCount();
                if (var3 != var2 && var3 - 1 != var2) {
                    Node var4 = var1.getNode(var2);
                    Node var5 = var1.getNode(var2 + 1);
                    Vec3 var6 = new Vec3(var5.x - var4.x, var5.y - var4.y, var5.z - var4.z);
                    Vec3 var7 = this.getDeltaMovement();
                    this.setDeltaMovement(var6.x / 7.0, var7.y, var6.z / 7.0);
                }
            }
        }
    }

    public boolean hurt(DamageSource var1, float var2) {
        if (var1.is(DamageTypes.FELL_OUT_OF_WORLD)) {
            this.discard();
            return true;
        }

        if (!(var1.getEntity() instanceof Player)) {
            return false;
        }

        this.c = true;
        return false;
    }

    double d() {
        return Math.sqrt(1800.0);
    }

    public boolean checkSpawnRules(LevelAccessor var1, MobSpawnType var2) {
        return this.getRandom().nextInt(100) < 1 && this.getRandom().nextInt(100) < 10;
    }
}
