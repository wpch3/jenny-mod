package com.trolmastercard.sexmod.entity.player;

import com.trolmastercard.sexmod.entity.FriendlySlimeEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.nbt.CompoundTag;

public class PlayerSlimeEntity extends PlayerGirlEntity {
    public static final EntityDataAccessor<ItemStack> OUTFIT_HEAD = SynchedEntityData.defineId(PlayerSlimeEntity.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<ItemStack> OUTFIT_CHEST = SynchedEntityData.defineId(PlayerSlimeEntity.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<ItemStack> OUTFIT_LEGS = SynchedEntityData.defineId(PlayerSlimeEntity.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<ItemStack> OUTFIT_FEET = SynchedEntityData.defineId(PlayerSlimeEntity.class, EntityDataSerializers.ITEM_STACK);

    public PlayerSlimeEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder var1) {
        super.defineSynchedData(var1);
        var1.define(OUTFIT_HEAD, ItemStack.EMPTY);
        var1.define(OUTFIT_CHEST, ItemStack.EMPTY);
        var1.define(OUTFIT_LEGS, ItemStack.EMPTY);
        var1.define(OUTFIT_FEET, ItemStack.EMPTY);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag var1) {
        super.addAdditionalSaveData(var1);
        var1.put("outfitHead", ((ItemStack)this.entityData.get(OUTFIT_HEAD)).save(this.registryAccess()));
        var1.put("outfitChest", ((ItemStack)this.entityData.get(OUTFIT_CHEST)).save(this.registryAccess()));
        var1.put("outfitLegs", ((ItemStack)this.entityData.get(OUTFIT_LEGS)).save(this.registryAccess()));
        var1.put("outfitFeet", ((ItemStack)this.entityData.get(OUTFIT_FEET)).save(this.registryAccess()));
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        this.entityData.set(OUTFIT_HEAD, var1.contains("outfitHead") ? ItemStack.parseOptional(this.registryAccess(), var1.get("outfitHead")) : ItemStack.EMPTY);
        this.entityData.set(OUTFIT_CHEST, var1.contains("outfitChest") ? ItemStack.parseOptional(this.registryAccess(), var1.get("outfitChest")) : ItemStack.EMPTY);
        this.entityData.set(OUTFIT_LEGS, var1.contains("outfitLegs") ? ItemStack.parseOptional(this.registryAccess(), var1.get("outfitLegs")) : ItemStack.EMPTY);
        this.entityData.set(OUTFIT_FEET, var1.contains("outfitFeet") ? ItemStack.parseOptional(this.registryAccess(), var1.get("outfitFeet")) : ItemStack.EMPTY);
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(1.64F);
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[]{"action.names.blowjob"}, false);
        return true;
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        com.trolmastercard.sexmod.entity.ScenePose var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.entity.ScenePose.e || var1 != com.trolmastercard.sexmod.entity.ScenePose.f && var1 != com.trolmastercard.sexmod.entity.ScenePose.c) {
            if (var2 != com.trolmastercard.sexmod.entity.ScenePose.m || var1 != com.trolmastercard.sexmod.entity.ScenePose.l && var1 != com.trolmastercard.sexmod.entity.ScenePose.k) {
                super.c(var1);
            }
        }
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.c) {
            return com.trolmastercard.sexmod.entity.ScenePose.f;
        } else {
            return var1 == com.trolmastercard.sexmod.entity.ScenePose.k ? com.trolmastercard.sexmod.entity.ScenePose.l : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose b(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.c || var1 == com.trolmastercard.sexmod.entity.ScenePose.f) {
            return com.trolmastercard.sexmod.entity.ScenePose.e;
        } else {
            return var1 != com.trolmastercard.sexmod.entity.ScenePose.k && var1 != com.trolmastercard.sexmod.entity.ScenePose.l ? null : com.trolmastercard.sexmod.entity.ScenePose.m;
        }
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.i) {
            Player var2 = this.e();
            if (var2 != null && !(var2.position().distanceTo(this.l()) > 1.0)) {
                this.q(var2.getUUID());
                var2.setYRot(this.e_());
                this.ai = this.e_();
                var2.teleportTo(this.l().x, this.l().y, this.l().z);
                this.a(0.0, 0.0, 0.4, 0.0F, 60.0F);
                this.c(com.trolmastercard.sexmod.entity.ScenePose.j);
                var2.setNoGravity(true);
                var2.noPhysics = true;
                var2.getAbilities().flying = true;
                var2.onUpdateAbilities();
                Player var3 = this.q();
                if (var3 != null) {
                    var3.setNoGravity(true);
                    var3.getAbilities().flying = true;
                    var3.onUpdateAbilities();
                }
            }
        }
    }

    @Override
    protected PlayState a(AnimationState<com.trolmastercard.sexmod.entity.GirlEntity> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a && this.ai().cq) {
                    this.a("animation.slime.fhappy", true, var1);
                } else {
                    this.a("animation.slime.null", true, var1);
                }
                break;
            case "action":
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a) {
                    this.a("animation.slime.idle", true, var1);
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
}
