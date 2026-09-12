package com.trolmastercard.sexmod.entity;

import com.trolmastercard.sexmod.network.SendCompanionHomePayload;
import com.trolmastercard.sexmod.network.SetNpcHomePayload;
import java.util.UUID;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class BeeEntity extends ContainerGirlEntity {
    public float a = 3200.0F;
    int b = 0;
    public static final EntityDataAccessor<Boolean> c = SynchedEntityData.defineId(BeeEntity.class, EntityDataSerializers.BOOLEAN);

    public BeeEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
        this.moveControl = new FlyingMoveControl(this, 20, true);
    }

    @Override
    public String a() {
        return "Bee";
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(c, false);
    }

    protected PathNavigation createNavigation(Level var1) {
        FlyingPathNavigation var2 = new FlyingPathNavigation(this, var1);
        var2.setCanOpenDoors(false);
        var2.setCanFloat(true);
        this.aj = var2;
        return var2;
    }

    public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder b() {
        return PathfinderMob.createMobAttributes()
            .add(Attributes.MAX_HEALTH, 12.0)
            .add(Attributes.MOVEMENT_SPEED, 0.2)
            .add(Attributes.FLYING_SPEED, 0.4)
            .add(Attributes.FOLLOW_RANGE, 16.0);
    }

    @Override
    protected void registerGoals() {
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (this.ai() != com.trolmastercard.sexmod.entity.ScenePose.au || var1 != com.trolmastercard.sexmod.entity.ScenePose.at && var1 != com.trolmastercard.sexmod.entity.ScenePose.x) {
            super.c(var1);
        }
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        this.d();
        if (this.ai().equals(com.trolmastercard.sexmod.entity.ScenePose.au)) {
            this.b = Math.max(1, this.b);
        }

        this.f();
        this.e();
    }

    void d() {
        if (this.al() == null) {
            if (!this.aw()) {
                this.a++;
                if (!(this.a < 4800.0F)) {
                    Player var1 = this.level().getNearestPlayer(this, 10.0);
                    if (var1 != null) {
                        if (d(var1) == null) {
                            if (var1.distanceTo(this) < 1.5F) {
                                this.a = 0.0F;
                                this.q(var1.getUUID());
                                this.entityData.set(GirlEntity.ap, true);
                                this.d(this.aE());
                                this.a_(var1.getYRot() - 180.0F);
                                this.aj.stop();
                                this.c(com.trolmastercard.sexmod.entity.ScenePose.ar);
                                Vec3 var2 = this.a(0.2);
                                var1.teleportTo(var2.x, var2.y, var2.z);
                            } else {
                                this.aj.stop();
                                this.aj.moveTo(var1, 1.0);
                            }
                        }
                    }
                }
            }
        }
    }

    void e() {
        Vec3 var1 = this.position();
        Vec3 var2 = new Vec3(this.getX(), 0.0, this.getZ());
        BlockHitResult var3 = this.level().clip(new ClipContext(var1, var2, Block.COLLIDER, Fluid.NONE, this));
        if (var3.getType() != Type.MISS) {
            double var4 = this.getY() - var3.getBlockPos().getY();
            if (var4 > 3.0 && this.getDeltaMovement().y > 0.0) {
                Vec3 var6 = this.getDeltaMovement();
                this.setDeltaMovement(var6.x, 0.0, var6.z);
            }
        }
    }

    void f() {
        if (this.b != 0) {
            ServerLevel var1 = (ServerLevel)this.level();
            this.b++;
            if ((Boolean)this.entityData.get(c)) {
                if (this.b >= 40) {
                    this.b = 0;
                } else {
                    this.a(var1, ParticleTypes.HEART, 1);
                }
            } else if (this.b < 200) {
                this.a(var1, ParticleTypes.WITCH, 1);
            } else if (this.b == 200) {
                this.entityData.set(c, this.getRandom().nextBoolean());
            } else if (this.b < 250) {
                this.a(var1, this.entityData.get(c) ? ParticleTypes.HEART : ParticleTypes.ANGRY_VILLAGER, 3);
            } else {
                this.b = 0;
            }

            this.a(var1, ParticleTypes.WITCH, 10);
        }
    }

    private void a(ServerLevel var1, ParticleOptions var2, int var3) {
        var1.sendParticles(var2, this.getX(), this.getY() + 0.3, this.getZ(), var3, 0.2, 0.3, 0.2, 0.25);
    }

    public boolean causeFallDamage(float var1, float var2, DamageSource var3) {
        return false;
    }

    @Override
    public void tick() {
        super.tick();
        if (this.a < 4800.0F && !this.onGround() && this.getDeltaMovement().y < 0.0) {
            Vec3 var1 = this.getDeltaMovement();
            this.setDeltaMovement(var1.x, var1.y * 0.4, var1.z);
        }
    }

    public InteractionResult mobInteract(Player var1, InteractionHand var2) {
        if ((Boolean)this.entityData.get(c) && !(Boolean)this.entityData.get(ContainerGirlEntity.d) && var1.getItemInHand(var2).getItem() == Items.CHEST) {
            this.entityData.set(ContainerGirlEntity.d, true);
            var1.getItemInHand(var2).shrink(1);
            return super.mobInteract(var1, var2);
        }

        if (this.level().isClientSide()) {
            this.b(var1);
        }

        return super.mobInteract(var1, var2);
    }

    void b(Player var1) {
        com.trolmastercard.sexmod.client.gui.NpcActionScreen.a(this, var1);
    }

    public void a(String var1, Player var2) {
        if (this.level().isClientSide()) {
            if ("action.names.followme".equals(var1)) {
                this.a("master", var2.getUUID().toString());
            } else if ("action.names.stopfollowme".equals(var1)) {
                this.i();
            } else if ("action.names.gohome".equals(var1)) {
                this.i();
                com.trolmastercard.sexmod.client.ClientUtils.a(new SendCompanionHomePayload(this.ah().toString()));
            } else if ("action.names.setnewhome".equals(var1)) {
                BlockPos var3 = this.blockPosition();
                com.trolmastercard.sexmod.client.ClientUtils.a(new SetNpcHomePayload(this.ah().toString(), var3.getX(), var3.getY(), var3.getZ()));
            }
        }
    }

    @Override
    public boolean a(Player var1) {
        return false;
    }

    @Override
    public void a(String var1, UUID var2) {
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.ar) {
            return com.trolmastercard.sexmod.entity.ScenePose.as;
        }

        return var1 == com.trolmastercard.sexmod.entity.ScenePose.as ? com.trolmastercard.sexmod.entity.ScenePose.at : null;
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose b(com.trolmastercard.sexmod.entity.ScenePose var1) {
        return var1 != com.trolmastercard.sexmod.entity.ScenePose.at && var1 != com.trolmastercard.sexmod.entity.ScenePose.as && var1 != com.trolmastercard.sexmod.entity.ScenePose.ar ? null : com.trolmastercard.sexmod.entity.ScenePose.au;
    }

    @Override
    protected void c_() {
    }

    @Override
    public void addAdditionalSaveData(CompoundTag var1) {
        super.addAdditionalSaveData(var1);
        var1.putBoolean("isTamed", (Boolean)this.entityData.get(c));
        var1.putBoolean("hasChest", (Boolean)this.entityData.get(ContainerGirlEntity.d));
        var1.put("inventory", this.e.serializeNBT(this.registryAccess()));
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        this.entityData.set(c, var1.contains("isTamed") ? var1.getBoolean("isTamed") : (Boolean)this.entityData.get(c));
        this.entityData.set(ContainerGirlEntity.d, var1.getBoolean("hasChest"));
        this.e.deserializeNBT(this.registryAccess(), var1.getCompound("inventory"));
    }

    @Override
    protected PlayState a(AnimationState<GirlEntity> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "movement":
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a) {
                    String var5 = this.entityData.get(ContainerGirlEntity.d) ? "idle_has_chest" : "idle";
                    this.a("animation.bee." + var5, true, var1);
                } else {
                    this.a("animation.bee.null", true, var1);
                }
                break;
            case "action":
                switch (this.ai()) {
                    case a:
                        return PlayState.STOP;
                    case ar:
                        this.a("animation.bee.sex_start", false, var1);
                        break;
                    case as:
                        this.a("animation.bee.sex_slow", true, var1);
                        break;
                    case at:
                        this.a("animation.bee.sex_fast", true, var1);
                        break;
                    case au:
                        this.a("animation.bee.sex_cum", false, var1);
                        break;
                    case E:
                        this.a("animation.bee.throw_pearl", true, var1);
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
