package com.trolmastercard.sexmod.f;

import java.util.List;
import java.util.UUID;
import net.minecraft.ChatFormatting;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.MinecraftServer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.animation.Animation.LoopType;
import software.bernie.geckolib.util.GeckoLibUtil;

public class d extends LivingEntity implements GeoEntity {
    private final AnimatableInstanceCache d = GeckoLibUtil.createInstanceCache(this);
    public UUID a = null;
    public static final EntityDataAccessor<String> b = SynchedEntityData.defineId(d.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Integer> c = SynchedEntityData.defineId(d.class, EntityDataSerializers.INT);

    public d(EntityType<? extends LivingEntity> var1, Level var2) {
        super(var1, var2);
    }

    public static Builder a() {
        return LivingEntity.createLivingAttributes();
    }

    protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder var1) {
        super.defineSynchedData(var1);
        var1.define(b, "null");
        var1.define(c, 0);
    }

    public void tick() {
        super.tick();
        int var1 = (Integer)this.entityData.get(c);
        if (var1 >= 12000) {
            this.b();
        }

        if (!this.level().isClientSide()) {
            this.entityData.set(c, var1 + 1);
        }
    }

    public boolean hurt(DamageSource var1, float var2) {
        boolean var3 = super.hurt(var1, var2);
        if (!var3) {
            return false;
        }

        this.discard();
        return true;
    }

    void b() {
        for (int var1 = 0; var1 < 30; var1++) {
            float var2 = (com.trolmastercard.sexmod.d.f.a.nextBoolean() ? 1 : -1) * com.trolmastercard.sexmod.d.f.a.nextFloat();
            float var3 = (com.trolmastercard.sexmod.d.f.a.nextBoolean() ? 1 : -1) * com.trolmastercard.sexmod.d.f.a.nextFloat();
            float var4 = (com.trolmastercard.sexmod.d.f.a.nextBoolean() ? 1 : -1) * com.trolmastercard.sexmod.d.f.a.nextFloat();
            this.level().addParticle(ParticleTypes.EXPLOSION, 0.5 + this.getX(), 0.5 + this.getY(), 0.5 + this.getZ(), var2, var3, var4);
        }

        if (!this.level().isClientSide()) {
            if (this.a == null) {
                this.a = UUID.randomUUID();
            }

            this.c();
            if (!com.trolmastercard.sexmod.d.c.a(this.a)) {
                com.trolmastercard.sexmod.d.c.a(this.a, com.trolmastercard.sexmod.a.a((String)this.entityData.get(b)));
            }

            com.trolmastercard.sexmod.f.b.h var8 = com.trolmastercard.sexmod.f.b.h.a(this.level(), this.a);
            if (var8 != null) {
                com.trolmastercard.sexmod.d.c.b(this.a, var8);
                UUID var9 = com.trolmastercard.sexmod.d.c.o(this.a);
                if (var9 != null) {
                    var8.getEntityData().set(com.trolmastercard.sexmod.f.b.k.ao, var9.toString());
                }

                List var10 = com.trolmastercard.sexmod.d.c.d(this.a);
                String var11 = null;

                for (com.trolmastercard.sexmod.f.b.h var6 : var10) {
                    String var7 = (String)var6.getEntityData().get(com.trolmastercard.sexmod.f.b.h.f);
                    if (!"".equals(var7)) {
                        var11 = var7;
                        break;
                    }
                }

                if (var11 != null) {
                    var8.getEntityData().set(com.trolmastercard.sexmod.f.b.h.f, var11);
                }

                var8.setPos(0.5 + this.getX(), this.getY(), 0.5 + this.getZ());
                this.level().addFreshEntity(var8);
                this.a(var8);
            }

            this.level().playSound(null, this.blockPosition(), (SoundEvent)SoundEvents.GENERIC_EXPLODE.value(), SoundSource.BLOCKS, 0.5F, 1.0F);
            this.discard();
        }
    }

    void a(com.trolmastercard.sexmod.f.b.h var1) {
        Player var2 = var1.ay();
        if (var2 != null) {
            com.trolmastercard.sexmod.a var3 = com.trolmastercard.sexmod.d.c.g(this.a);
            var2.displayClientMessage(
                Component.literal(
                    String.format(
                        "%s%s %shas become a %snew tribe member%s!", var3.c(), var1.a(), ChatFormatting.WHITE, ChatFormatting.RED, ChatFormatting.WHITE
                    )
                ),
                false
            );
            this.level().playSound(null, var2.getX(), var2.getY(), var2.getZ(), SoundEvents.PLAYER_LEVELUP, SoundSource.NEUTRAL, 1.0F, 1.0F);
            this.level()
                .playSound(null, var2.getX(), var2.getY(), var2.getZ(), (SoundEvent)SoundEvents.NOTE_BLOCK_PLING.value(), SoundSource.NEUTRAL, 1.0F, 1.0F);
        }
    }

    private void c() {
        if (!this.level().isClientSide()) {
            MinecraftServer var1 = this.level().getServer();
            if (var1 != null) {
                com.trolmastercard.sexmod.d.c.a(var1.overworld());
            }
        }
    }

    public void registerControllers(ControllerRegistrar var1) {
        var1.add(new AnimationController(this, "controller", 5, this::a));
    }

    protected PlayState a(AnimationState<d> var1) {
        int var2 = (Integer)this.entityData.get(c);
        if (12000 - var2 < 20) {
            var1.setAnimation(RawAnimation.begin().then("animation.model.hatch", LoopType.LOOP));
            return PlayState.CONTINUE;
        }

        float var3 = var2 / 12000.0F;
        if (var3 > 0.98) {
            var1.setAnimation(RawAnimation.begin().then("animation.model.veryfast", LoopType.LOOP));
        } else if (var3 > 0.85) {
            var1.setAnimation(RawAnimation.begin().then("animation.model.fast", LoopType.LOOP));
        } else if (var3 > 0.75) {
            var1.setAnimation(RawAnimation.begin().then("animation.model.medium", LoopType.LOOP));
        } else if (var3 > 0.5) {
            var1.setAnimation(RawAnimation.begin().then("animation.model.slow", LoopType.LOOP));
        }

        return PlayState.CONTINUE;
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.d;
    }

    public HumanoidArm getMainArm() {
        return HumanoidArm.LEFT;
    }

    public Iterable<ItemStack> getArmorSlots() {
        return List.of();
    }

    public ItemStack getItemBySlot(EquipmentSlot var1) {
        return ItemStack.EMPTY;
    }

    public void setItemSlot(EquipmentSlot var1, ItemStack var2) {
    }

    public void addAdditionalSaveData(CompoundTag var1) {
        if (this.a != null) {
            var1.putString("tribeID", this.a.toString());
        }

        var1.putString("egg_color", (String)this.entityData.get(b));
        var1.putInt("eggAge", (Integer)this.entityData.get(c));
        super.addAdditionalSaveData(var1);
    }

    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        String var2 = var1.getString("tribeID");
        if (!"".equals(var2)) {
            this.a = UUID.fromString(var2);
        }

        this.entityData.set(b, var1.contains("egg_color") ? var1.getString("egg_color") : "null");
        this.entityData.set(c, var1.getInt("eggAge"));
    }
}
