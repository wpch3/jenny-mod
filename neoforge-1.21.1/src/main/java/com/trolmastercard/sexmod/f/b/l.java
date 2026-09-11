package com.trolmastercard.sexmod.f.b;

import com.trolmastercard.sexmod.l.p;
import com.trolmastercard.sexmod.l.q;
import java.util.List;
import java.util.UUID;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.neoforge.event.entity.living.LivingHealEvent;
import net.neoforged.neoforge.items.ItemStackHandler;

public abstract class l extends k {
    public int A = 1;
    public int B;
    public int C = 0;
    public int D;
    public Vec3 E = Vec3.ZERO;
    public boolean F;
    public ItemStackHandler G = new ItemStackHandler(7);
    public static final EntityDataAccessor<ItemStack> H = SynchedEntityData.defineId(l.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<ItemStack> I = SynchedEntityData.defineId(l.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<ItemStack> J = SynchedEntityData.defineId(l.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<ItemStack> K = SynchedEntityData.defineId(l.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<ItemStack> L = SynchedEntityData.defineId(l.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<ItemStack> M = SynchedEntityData.defineId(l.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<Integer> N = SynchedEntityData.defineId(l.class, EntityDataSerializers.INT);

    protected l(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
        if (this.G.getStackInSlot(0).isEmpty()) {
            this.G.setStackInSlot(0, new ItemStack(Items.IRON_SWORD));
        }

        if (this.G.getStackInSlot(1).isEmpty()) {
            this.G.setStackInSlot(1, new ItemStack(Items.BOW));
        }
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(N, 0);
        var1.define(H, ItemStack.EMPTY);
        var1.define(I, ItemStack.EMPTY);
        var1.define(J, ItemStack.EMPTY);
        var1.define(K, ItemStack.EMPTY);
        var1.define(L, ItemStack.EMPTY);
        var1.define(M, ItemStack.EMPTY);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new com.trolmastercard.sexmod.f.a.a(this));
    }

    public ItemStack getItemBySlot(EquipmentSlot var1) {
        return switch (var1) {
            case MAINHAND -> this.G.getStackInSlot(0);
            case OFFHAND -> this.G.getStackInSlot(1);
            default -> super.getItemBySlot(var1);
        };
    }

    public void i_() {
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        if (this.tickCount % 80 == 0 && this.getHealth() != this.getMaxHealth()) {
            if (this.aw()) {
                List var2 = this.level()
                    .getEntitiesOfClass(
                        Monster.class,
                        new AABB(this.getX() - 7.0, this.getY() - 1.0, this.getZ() - 7.0, this.getX() + 7.0, this.getY() + 1.0, this.getZ() + 7.0)
                    );
                int var3 = var2.isEmpty() ? 4 : 1;
                this.heal(var3);
                var1.sendParticles(
                    ParticleTypes.HEART,
                    this.getX(),
                    this.getY() + 1.0 + com.trolmastercard.sexmod.d.f.a.nextDouble(),
                    this.getZ(),
                    var3,
                    1.0,
                    1.0,
                    1.0,
                    com.trolmastercard.sexmod.d.f.a.nextGaussian()
                );
            } else {
                this.heal(1.0F);
            }
        }

        if (this.F && !this.aw()) {
            this.F = false;
        }

        this.av();
        this.entityData.set(H, this.G.getStackInSlot(0));
        this.entityData.set(I, this.G.getStackInSlot(1));
        this.entityData.set(J, this.G.getStackInSlot(2));
        this.entityData.set(K, this.G.getStackInSlot(3));
        this.entityData.set(L, this.G.getStackInSlot(4));
        this.entityData.set(M, this.G.getStackInSlot(5));
    }

    @Override
    public void a(String var1, UUID var2) {
        if ("action.names.followme".equals(var1)) {
            this.a("master", var2.toString());
        } else if ("action.names.stopfollowme".equals(var1)) {
            this.i();
        } else if ("action.names.equipment".equals(var1)) {
            if (this.level().isClientSide()) {
                com.trolmastercard.sexmod.b.b.a(new com.trolmastercard.sexmod.l.l(this.ah().toString()));
            }
        } else if ("action.names.gohome".equals(var1)) {
            this.i();
            if (this.level().isClientSide()) {
                com.trolmastercard.sexmod.b.b.a(new p(this.ah().toString()));
            }
        } else if ("action.names.setnewhome".equals(var1)) {
            this.i_();
            if (this.level().isClientSide()) {
                BlockPos var3 = this.blockPosition();
                com.trolmastercard.sexmod.b.b.a(new q(this.ah().toString(), var3.getX(), var3.getY(), var3.getZ()));
            }
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag var1) {
        var1.put("inventory", this.G.serializeNBT(this.registryAccess()));
        super.addAdditionalSaveData(var1);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        this.G.deserializeNBT(this.registryAccess(), var1.getCompound("inventory"));
    }

    @EventBusSubscriber(modid = "sexmod")
    public static final class a {
        @SubscribeEvent(priority = EventPriority.HIGH)
        public static void onLivingDeath(LivingDeathEvent var0) {
            if (var0.getEntity() instanceof l var1) {
                if (!var0.getSource().is(DamageTypes.FELL_OUT_OF_WORLD)) {
                    if (!var1.level().isClientSide() && var1.aw()) {
                        var1.F = true;
                        var1.setHealth(1.0F);
                        var1.getNavigation().stop();
                        var1.c(com.trolmastercard.sexmod.f.j.F);
                        var0.setCanceled(true);
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onLivingHeal(LivingHealEvent var0) {
            if (var0.getEntity() instanceof l var1 && var1.F) {
                if (var1.getHealth() + var0.getAmount() >= var1.getMaxHealth()) {
                    var1.F = false;
                    var1.c(com.trolmastercard.sexmod.f.j.a);
                }
            }
        }
    }
}
