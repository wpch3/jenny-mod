package com.trolmastercard.sexmod.entity;

import com.trolmastercard.sexmod.entity.Triggerable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.core.Direction.Axis;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.MinecraftServer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.Container;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.capabilities.Capabilities.ItemHandler;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.items.ItemStackHandler;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class KoboldEntity extends VariantGirlEntity implements Triggerable, Container {
    public static double a = 69.0;
    public static final EntityDataAccessor<Float> b = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<String> c = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> d = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Boolean> e = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<String> f = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> g = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Boolean> h = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<String> i = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> HAS_CROWN = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Boolean> HAS_EGG = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.BOOLEAN);
    boolean j = false;
    public int k = -1;
    public boolean l = false;
    boolean m = false;
    int n = 0;
    int o = 0;
    boolean p = false;
    BlockPos q = null;
    int r = 24;
    int s = 0;
    ItemStack t = null;
    BlockState u = null;
    BlockState v = null;
    BlockPos w = null;
    boolean x = true;
    Vec3 y = Vec3.ZERO;
    BlockPos z = null;
    int A = 0;
    int B = 0;
    int C = 0;
    int D = 0;
    BlockPos E = null;
    int F = 0;
    public boolean G = false;
    float H = Float.MAX_VALUE;
    static long I = Long.MIN_VALUE;
    public ItemStackHandler J = new ItemStackHandler(27);

    public KoboldEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    public static float b() {
        return (float)(Math.random() * 0.25);
    }

    @Nullable
    public static KoboldEntity a(Level var0, UUID var1, float var2) {
        a = 10.0 - var2 * 25.0;
        KoboldEntity var3 = (KoboldEntity)((EntityType)com.trolmastercard.sexmod.registry.ModEntities.u.get()).create(var0);
        if (var3 == null) {
            return null;
        }

        var3.getEntityData().set(i, var1.toString());
        var3.getEntityData().set(b, var2);
        return var3;
    }

    @Nullable
    public static KoboldEntity a(Level var0, UUID var1) {
        float var2 = b();
        return a(var0, var1, var2);
    }

    @Override
    protected String a(StringBuilder var1) {
        com.trolmastercard.sexmod.entity.VariantGirlEntity.d(var1, 8);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.d(var1, 3);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.b(var1);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.b(var1);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, 2);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, 2);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, 1);
        com.trolmastercard.sexmod.entity.VariantGirlEntity.c(var1, 1);
        return var1.toString();
    }

    @Override
    public String a() {
        return (String)this.entityData.get(c);
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(0.94F);
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(i, "");
        var1.define(b, 0.0F);
        var1.define(c, com.trolmastercard.sexmod.entity.KoboldAction.values()[this.getRandom().nextInt(com.trolmastercard.sexmod.entity.KoboldAction.values().length)].toString());
        var1.define(d, false);
        var1.define(e, false);
        var1.define(f, "null");
        var1.define(g, false);
        var1.define(h, false);
    }

    @Nullable
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor var1, DifficultyInstance var2, MobSpawnType var3, @Nullable SpawnGroupData var4) {
        com.trolmastercard.sexmod.EyeAndKoboldColor var5 = com.trolmastercard.sexmod.EyeAndKoboldColor.values()[this.getRandom().nextInt(com.trolmastercard.sexmod.EyeAndKoboldColor.values().length)];
        Vec3i var6 = var5.a();
        this.entityData.set(V, new BlockPos(var6.getX(), var6.getY(), var6.getZ()));
        this.entityData.set(U, com.trolmastercard.sexmod.EyeAndKoboldColor.d.name());
        return super.finalizeSpawn(var1, var2, var3, var4);
    }

    private void syncCrownWithTribeLeadership() {
        String tribeId = (String)this.entityData.get(i);
        boolean isLeader = false;
        if (!"".equals(tribeId)) {
            try {
                UUID tribeUuid = UUID.fromString(tribeId);
                if (com.trolmastercard.sexmod.server.TribeData.a(tribeUuid)) {
                    isLeader = com.trolmastercard.sexmod.server.TribeData.d(tribeUuid, this);
                }
            } catch (IllegalArgumentException var4) {
                isLeader = false;
            }
        }
        if ((Boolean)this.entityData.get(HAS_CROWN) != isLeader) {
            this.entityData.set(HAS_CROWN, isLeader);
        }
    }

    public void setHasEgg(boolean hasEgg) {
        this.entityData.set(HAS_EGG, hasEgg);
    }

    public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder j() {
        return PathfinderMob.createMobAttributes().add(Attributes.MAX_HEALTH, a).add(Attributes.MOVEMENT_SPEED, 0.5).add(Attributes.FOLLOW_RANGE, 30.0);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(8, new OpenDoorGoal(this, true));
        super.registerGoals();
    }

    protected float getJumpPower() {
        return 0.45F;
    }

    @Override
    public boolean isPushable() {
        return true;
    }

    public InteractionResult mobInteract(Player var1, InteractionHand var2) {
        if (this.al() != null) {
            return InteractionResult.PASS;
        }

        ItemStack var3 = var1.getItemInHand(InteractionHand.MAIN_HAND);
        if (!var3.getItem().equals(Items.NAME_TAG)) {
            var3 = var1.getItemInHand(InteractionHand.OFF_HAND);
        }

        if (var3.getItem().equals(Items.NAME_TAG) && var1.getUUID().toString().equals(this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao))) {
            this.entityData.set(c, var3.getHoverName().getString());
            var3.shrink(1);
            return InteractionResult.SUCCESS;
        }

        if ((Boolean)this.entityData.get(d)) {
            return InteractionResult.PASS;
        }

        if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.aJ) {
            return InteractionResult.PASS;
        }

        ItemStack var4 = var1.getMainHandItem();
        if (!(var4.getItem() instanceof com.trolmastercard.sexmod.item.KoboldStaffItem)) {
            var4 = var1.getOffhandItem();
        }

        boolean var5 = var4.getItem() instanceof com.trolmastercard.sexmod.item.KoboldStaffItem;
        if (!this.aw() && var5) {
            if (!this.level().isClientSide()) {
                return InteractionResult.SUCCESS;
            }

            String var6 = (String)this.entityData.get(i);
            if (var6.isEmpty()) {
                return InteractionResult.SUCCESS;
            }

            com.trolmastercard.sexmod.client.gui.TribeNameScreen.a(UUID.fromString(var6));
            return InteractionResult.SUCCESS;
        } else {
            if (this.aw() && var5 && var1.getUUID().toString().equals(this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao))) {
                return InteractionResult.SUCCESS;
            }

            if (!this.aw()) {
                this.q(var1.getUUID());
                this.getNavigation().stop();
                this.a_((float)(Math.atan2(this.getZ() - var1.getZ(), this.getX() - var1.getX()) * (180.0 / Math.PI) + 90.0));
                this.d(new Vec3(this.getX(), Math.floor(this.getY()), this.getZ()));
                this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ap, true);
                this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
                return InteractionResult.SUCCESS;
            }

            if (this.level().isClientSide() && ((String)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao)).equals(var1.getUUID().toString())) {
                this.a(var1);
            } else if (((String)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao)).equals(var1.getUUID().toString())) {
                com.trolmastercard.sexmod.registry.ModSounds.a(this, "kobold", "master");
            }

            return InteractionResult.SUCCESS;
        }
    }

    @Override
    public boolean a(Player var1) {
        if (this.aw() && var1.getUUID().toString().equals(this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao))) {
            com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[]{"anal", "oral", "mating"}, false);
            return true;
        } else {
            com.trolmastercard.sexmod.entity.GirlEntity.a(
                var1, this, new String[]{"anal", "oral"}, new ItemStack[]{new ItemStack(Items.GOLD_INGOT, 3), new ItemStack(Items.IRON_PICKAXE)}, false
            );
            return true;
        }
    }

    @Override
    public void h_() {
        if (this.j) {
            this.j = false;
        } else {
            this.q((UUID)null);
            this.a("shouldbeattargetpos", "false");
        }
    }

    @Override
    public void f_() {
        this.l = false;
        super.f_();
    }

    protected void a(boolean var1, UUID var2) {
        super.a(var1, true, var2);
    }

    @Override
    public void a(String var1, UUID var2) {
        this.j = true;
        if ("oral".equals(var1)) {
            this.a("animationFollowUp", com.trolmastercard.sexmod.entity.ScenePose.b.toString());
            this.a(true, var2);
        }

        if ("anal".equals(var1)) {
            this.a("animationFollowUp", com.trolmastercard.sexmod.entity.ScenePose.Z.toString());
            this.a(true, var2);
        }

        if ("mating".equals(var1)) {
            this.a("animationFollowUp", com.trolmastercard.sexmod.entity.ScenePose.aK.toString());
            this.a(true, var2);
        }
    }

    @Override
    public void d_() {
        this.m = true;
        this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ap, false);
    }

    @Override
    protected void e() {
    }

    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();
        this.p = false;
        String var1 = (String)this.entityData.get(i);
        if (!"".equals(var1)) {
            UUID var2 = UUID.fromString(var1);
            this.x();
            this.p(var2);
            com.trolmastercard.sexmod.server.TribeData.b(var2);
            com.trolmastercard.sexmod.server.TribeData.a(var2, this.r());
            Player var3 = this.ay();
            if (var3 != null) {
                com.trolmastercard.sexmod.server.TribeData.a(var2, var3.getUUID());
            }
        }

        if (!this.q()) {
            if (this.al() == null) {
                if (!(Boolean)this.entityData.get(d)) {
                    if (this.getHealth() == this.getMaxHealth()) {
                        this.o = 0;
                    } else if (++this.o >= 100) {
                        this.setHealth(this.getHealth() + 2.0F);
                        this.o = 0;
                    }
                } else {
                    this.o = 0;
                }

                if (!(Boolean)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ap)) {
                    this.setNoGravity(false);
                }

                if (!"".equals(var1)) {
                    UUID var4 = UUID.fromString(var1);
                    this.entityData.set(e, com.trolmastercard.sexmod.server.TribeData.d(var4, this));
                    this.entityData.set(g, com.trolmastercard.sexmod.server.TribeData.m(var4));
                    this.l();
                }
            }
        }
    }

    void l() {
        String var1 = (String)this.entityData.get(i);
        if (!"".equals(var1)) {
            UUID var2 = UUID.fromString(var1);
            if (!(Boolean)this.entityData.get(d) && com.trolmastercard.sexmod.server.TribeData.m(var2)) {
                if (this.aw()) {
                    Player var3 = this.ay();
                    if (var3 != null) {
                        Collection var4 = com.trolmastercard.sexmod.server.TribeData.j(var2);
                        if (var4 != null) {
                            for (com.trolmastercard.sexmod.server.KoboldDen var6 : var4) {
                                if (var6.c(this)) {
                                    var6.b(this);
                                    this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
                                    this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ap, false);
                                }
                            }
                        }

                        this.noPhysics = false;
                        this.setNoGravity(false);
                        double var7 = this.position().distanceTo(var3.position());
                        if (var7 > 2.0) {
                            this.getNavigation().moveTo(var3, this.a(var3, var7));
                            this.au();
                            if (var7 > 15.0) {
                                this.b(var3);
                            }
                        }
                    }
                }
            } else if (com.trolmastercard.sexmod.server.TribeData.d(var2, this)) {
                this.h(var2);
            } else {
                this.a(var2);
            }
        }
    }

    protected double a(Player var1, double var2) {
        double var4 = var1.isSprinting() ? 0.7 : 0.35;
        double var6 = Math.floor(var2 / 5.0) * 0.3;
        var4 += var6;
        if (this.isInWater()) {
            var4 *= 60.0;
        }

        return var4;
    }

    protected void b(Player var1) {
        int var3 = 0;

        BlockPos var2;
        do {
            var2 = var1.blockPosition().offset(com.trolmastercard.sexmod.util.ModState.a.nextInt(10), 0, com.trolmastercard.sexmod.util.ModState.a.nextInt(10));
        } while (++var3 < 20 && !this.randomTeleport(var2.getX(), var2.getY(), var2.getZ(), false));

        if (var3 == 20) {
            this.setPos(var1.getX(), var1.getY(), var1.getZ());
        }

        this.setDeltaMovement(0.0, 0.0, 0.0);
    }

    void a(UUID var1) {
        if (!this.d(var1)) {
            com.trolmastercard.sexmod.entity.KoboldDayPhase var2 = com.trolmastercard.sexmod.server.TribeData.k(var1);
            switch (var2) {
                case b:
                    this.e(var1);
                    return;
                case a:
                    this.b(var1);
                    return;
            }
        }
    }

    void b(UUID var1) {
        BlockPos var2 = com.trolmastercard.sexmod.server.TribeData.l(var1);
        if (var2 == null) {
            this.z = null;
            this.c(var1);
        } else {
            KoboldEntity var3 = com.trolmastercard.sexmod.server.TribeData.c(var1);
            if (com.trolmastercard.sexmod.server.TribeData.e(var1)) {
                this.getNavigation().stop();
                this.z = null;
            } else if (var3 == null) {
                System.out.println("leader of tribe " + var1 + " is null");
            } else {
                if (var3.distanceTo(this) > 20.0F) {
                    this.setPos(var3.getX(), var3.getY(), var3.getZ());
                    this.z = null;
                }

                if (this.tickCount % 40 == 0) {
                    if (this.y.equals(this.position())) {
                        this.z = this.m(var1);
                    }

                    this.y = this.position();
                }

                if (this.z == null || !(this.z.distSqr(this.blockPosition()) < 16.0)) {
                    this.z = this.m(var1);
                }

                this.getNavigation().moveTo(this.z.getX(), this.z.getY(), this.z.getZ(), 0.35);
                this.au();
            }
        }
    }

    void c(UUID var1) {
        if (this.al() == null) {
            Collection var2 = com.trolmastercard.sexmod.server.TribeData.j(var1);
            if (var2 != null) {
                com.trolmastercard.sexmod.server.KoboldDen var3 = null;

                for (com.trolmastercard.sexmod.server.KoboldDen var5 : var2) {
                    if (var5.c(this)) {
                        var3 = var5;
                        break;
                    }
                }

                if (var3 == null) {
                    for (com.trolmastercard.sexmod.server.KoboldDen var7 : var2) {
                        if (!this.aw() || this.a(var1, var7)) {
                            if (!this.a(var7)) {
                                this.p = true;
                            } else if (var7.a(this)) {
                                var3 = var7;
                                this.q = null;
                                if (var7.c() == com.trolmastercard.sexmod.server.KoboldDen.a.a) {
                                    this.c("Ima fall this tree owo");
                                } else {
                                    this.c("Ima go mine uwu");
                                    this.c(var7.b());
                                    this.level().setBlockAndUpdate(var7.b(), Blocks.AIR.defaultBlockState());
                                }
                                break;
                            }
                        }
                    }
                }

                if (var3 == null) {
                    this.o(var1);
                } else {
                    if (var3.c() == com.trolmastercard.sexmod.server.KoboldDen.a.a) {
                        this.a(var1, var3.b(), var3);
                    }

                    if (var3.c() == com.trolmastercard.sexmod.server.KoboldDen.a.b) {
                        this.b(var1, var3);
                    }
                }
            }
        }
    }

    void a(UUID var1, BlockPos var2, com.trolmastercard.sexmod.server.KoboldDen var3) {
        if (this.ai() != com.trolmastercard.sexmod.entity.ScenePose.aI) {
            this.a(var2, var1);
        } else {
            this.s--;
            if (this.s <= 0) {
                if (this.level().getBlockState(var2).isAir()) {
                    this.a(var1, var3, var2);
                } else {
                    this.r--;
                    if (this.r < 0) {
                        this.r = 24;
                        this.s = 78;
                        BlockState var4 = this.level().getBlockState(var2);
                        ItemStack var5 = var4.getCloneItemStack(null, this.level(), var2, null);
                        if (!var5.isEmpty()) {
                            this.b(var5);
                        }

                        this.t = this.a(var2);
                        this.level().removeBlock(var2, false);
                        var3.a(var2);
                        int var6 = 1;

                        while (true) {
                            BlockPos var7 = var2.offset(0, var6, 0);
                            BlockState var8 = this.level().getBlockState(var7);
                            if (var8.is(BlockTags.LOGS)) {
                                FallingBlockEntity var9 = FallingBlockEntity.fall(this.level(), var7, var8);
                                var9.time = 1;
                            }

                            if (!var3.d().contains(var7)) {
                                return;
                            }

                            var6++;
                        }
                    }
                }
            }
        }
    }

    void a(BlockPos var1, UUID var2) {
        BlockPos var3 = null;
        ArrayList var4 = new ArrayList();
        BlockPos[] var5 = new BlockPos[]{var1.north(), var1.east(), var1.south(), var1.west()};

        for (BlockPos var9 : var5) {
            BlockState var10 = this.level().getBlockState(var9.below());
            if (var10.isCollisionShapeFullBlock(this.level(), var9.below()) && !this.level().getBlockState(var9).isSolidRender(this.level(), var9)) {
                var4.add(var9);
            }
        }

        for (BlockPos var14 : var4) {
            if (var3 == null) {
                var3 = var14;
            } else {
                Vec3 var15 = new Vec3(var3.getX() + 0.5, var3.getY(), var3.getZ() + 0.5);
                Vec3 var18 = new Vec3(var14.getX() + 0.5, var14.getY(), var14.getZ() + 0.5);
                if (var18.distanceTo(this.position()) < var15.distanceTo(this.position())) {
                    var3 = var14;
                }
            }
        }

        if (var3 == null) {
            com.trolmastercard.sexmod.server.TribeData.e(var2, this);
            Player var13 = this.ay();
            if (var13 != null) {
                var13.displayClientMessage(Component.literal("Your kobolds cannot fall this tree because it starts underground"), false);
            }
        } else {
            double var12 = Math.sqrt(this.blockPosition().distSqr(var3));
            if (!(var12 > 1.0)) {
                float var16 = 0.0F;
                BlockPos var19 = var3.subtract(var1);
                if (var19.equals(new BlockPos(0, 0, -1))) {
                    var16 = 0.0F;
                }

                if (var19.equals(new BlockPos(1, 0, 0))) {
                    var16 = 90.0F;
                }

                if (var19.equals(new BlockPos(0, 0, 1))) {
                    var16 = 180.0F;
                }

                if (var19.equals(new BlockPos(-1, 0, 0))) {
                    var16 = -90.0F;
                }

                this.d(new Vec3(var3.getX() + 0.5, var3.getY(), var3.getZ() + 0.5));
                this.a_(var16);
                this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ap, true);
                this.entityData.set(h, true);
                this.c(com.trolmastercard.sexmod.entity.ScenePose.aI);
                this.level().removeBlock(var3.above(), false);
            } else if (Math.abs(this.blockPosition().getY() - var3.getY()) > 4) {
                this.c(var3);
            } else {
                BlockPos var17 = this.b(var3);
                this.getNavigation().moveTo(var17.getX() + 0.5, var17.getY(), var17.getZ() + 0.5, 0.35);
                this.au();
            }
        }
    }

    void a(UUID var1, com.trolmastercard.sexmod.server.KoboldDen var2, BlockPos var3) {
        if (this.t == null) {
            this.r = 24;
            this.s = 0;
            this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
            this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ap, false);
            com.trolmastercard.sexmod.server.TribeData.e(var1, this);
        } else {
            Block var4 = this.a(this.t);
            boolean var5 = var4 == Blocks.JUNGLE_SAPLING || var4 == Blocks.ACACIA_SAPLING;
            if (var5) {
                this.level().setBlockAndUpdate(var3, var4.defaultBlockState());
                this.level().setBlockAndUpdate(var3.north(), var4.defaultBlockState());
                this.level().setBlockAndUpdate(var3.west(), var4.defaultBlockState());
                this.level().setBlockAndUpdate(var3.north().west(), var4.defaultBlockState());
            } else {
                this.level().setBlockAndUpdate(var3, var4.defaultBlockState());
            }

            this.r = 24;
            this.s = 0;
            this.t = null;
            this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
            this.d(false);
            com.trolmastercard.sexmod.server.TribeData.e(var1, this);
        }
    }

    ItemStack a(BlockPos var1) {
        BlockState var2 = this.level().getBlockState(var1);
        ItemStack var3 = var2.getCloneItemStack(null, this.level(), var1, null);
        return var3.isEmpty() ? new ItemStack(Blocks.OAK_SAPLING) : var3;
    }

    Block a(ItemStack var1) {
        Item var2 = var1.getItem();
        if (var2 == Blocks.SPRUCE_LOG.asItem() || var2 == Blocks.STRIPPED_SPRUCE_LOG.asItem()) {
            return Blocks.SPRUCE_SAPLING;
        } else if (var2 == Blocks.BIRCH_LOG.asItem() || var2 == Blocks.STRIPPED_BIRCH_LOG.asItem()) {
            return Blocks.BIRCH_SAPLING;
        } else if (var2 == Blocks.JUNGLE_LOG.asItem() || var2 == Blocks.STRIPPED_JUNGLE_LOG.asItem()) {
            return Blocks.JUNGLE_SAPLING;
        } else if (var2 == Blocks.ACACIA_LOG.asItem() || var2 == Blocks.STRIPPED_ACACIA_LOG.asItem()) {
            return Blocks.ACACIA_SAPLING;
        } else {
            return var2 != Blocks.DARK_OAK_LOG.asItem() && var2 != Blocks.STRIPPED_DARK_OAK_LOG.asItem() ? Blocks.OAK_SAPLING : Blocks.DARK_OAK_SAPLING;
        }
    }

    BlockPos b(BlockPos var1) {
        BlockPos var2 = this.blockPosition();
        BlockPos var3 = var1.subtract(var2);
        if (Math.abs(var3.getX()) + Math.abs(var3.getZ()) < 20) {
            return var1;
        }

        double var4 = Math.min(Math.abs(var3.getX()), Math.abs(var3.getZ()));
        double var6 = Math.max(Math.abs(var3.getX()), Math.abs(var3.getZ()));
        double var8 = var4 / (var6 + var4);
        int var10 = var3.getX() > 0 ? 1 : -1;
        double var11 = var10 * 20;
        double var13 = var4 == Math.abs(var3.getX()) ? var8 : 1.0 - var8;
        int var15 = (int)(var11 * var13);
        int var16 = var3.getZ() > 0 ? 1 : -1;
        double var17 = var16 * 20;
        double var19 = var4 == Math.abs(var3.getZ()) ? var8 : 1.0 - var8;
        int var21 = (int)(var17 * var19);
        BlockPos var22 = this.blockPosition().offset(var15, 0, var21);
        return new BlockPos(var22.getX(), com.trolmastercard.sexmod.util.BlockPosUtils.a(this.level(), var22.getX(), var22.getZ()) + 1, var22.getZ());
    }

    void c(BlockPos var1) {
        this.setPos(0.5 + var1.getX(), var1.getY(), 0.5 + var1.getZ());
    }

    boolean a(UUID var1, com.trolmastercard.sexmod.server.KoboldDen var2) {
        List var3 = com.trolmastercard.sexmod.server.TribeData.d(var1);
        Collection var4 = com.trolmastercard.sexmod.server.TribeData.j(var1);
        KoboldEntity var5 = null;
        Vec3 var6 = new Vec3(var2.b().getX(), var2.b().getY(), var2.b().getZ());

        for (KoboldEntity var8 : var3) {
            boolean var9 = false;
            if (var4 != null) {
                for (com.trolmastercard.sexmod.server.KoboldDen var11 : var4) {
                    if (var11.c(var8)) {
                        var9 = true;
                        break;
                    }
                }
            }

            if (!var9 && var8.al() == null) {
                if (var5 == null) {
                    var5 = var8;
                } else if (var5.position().distanceTo(var6) > var8.position().distanceTo(var6)) {
                    var5 = var8;
                }
            }
        }

        return this.equals(var5);
    }

    boolean a(com.trolmastercard.sexmod.server.KoboldDen var1) {
        ArrayList var2 = new ArrayList();

        for (BlockPos var4 : var1.d()) {
            try {
                BlockState var5 = this.level().getBlockState(var4);
                ItemStack var6 = var5.getCloneItemStack(null, this.level(), var4, null);
                var2.add(var6);
            } catch (RuntimeException var7) {
            }
        }

        return this.b(var2);
    }

    boolean b(List<ItemStack> var1) {
        int var2 = this.J.getSlots();
        ItemStack[] var3 = new ItemStack[var2];

        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = this.J.getStackInSlot(var4).copy();
        }

        for (ItemStack var5 : var1) {
            if (!this.a(var3, var5)) {
                return false;
            }
        }

        return true;
    }

    private boolean a(ItemStack[] var1, ItemStack var2) {
        int var3 = var2.getCount();
        int var4 = Math.min(var2.getMaxStackSize(), 64);

        for (int var5 = 0; var5 < var1.length && var3 > 0; var5++) {
            if (!var1[var5].isEmpty() && ItemStack.isSameItemSameComponents(var1[var5], var2)) {
                int var6 = var4 - var1[var5].getCount();
                if (var6 > 0) {
                    int var7 = Math.min(var6, var3);
                    var1[var5].grow(var7);
                    var3 -= var7;
                }
            }
        }

        for (int var8 = 0; var8 < var1.length && var3 > 0; var8++) {
            if (var1[var8].isEmpty()) {
                int var9 = Math.min(var4, var3);
                var1[var8] = var2.copyWithCount(var9);
                var3 -= var9;
            }
        }

        return var3 <= 0;
    }

    boolean b(ItemStack var1) {
        int var2 = this.J.getSlots();
        int var3 = var1.getCount();
        int var4 = Math.min(var1.getMaxStackSize(), 64);

        for (int var5 = 0; var5 < var2 && var3 > 0; var5++) {
            ItemStack var6 = this.J.getStackInSlot(var5);
            if (!var6.isEmpty() && ItemStack.isSameItemSameComponents(var6, var1)) {
                int var7 = var4 - var6.getCount();
                if (var7 > 0) {
                    int var8 = Math.min(var7, var3);
                    this.J.setStackInSlot(var5, var6.copyWithCount(var6.getCount() + var8));
                    var3 -= var8;
                }
            }
        }

        for (int var9 = 0; var9 < var2 && var3 > 0; var9++) {
            ItemStack var10 = this.J.getStackInSlot(var9);
            if (var10.isEmpty()) {
                int var11 = Math.min(var4, var3);
                this.J.setStackInSlot(var9, var1.copyWithCount(var11));
                var3 -= var11;
            }
        }

        return var3 <= 0;
    }

    boolean c(ItemStack var1) {
        ArrayList var2 = new ArrayList();
        var2.add(var1);
        return this.b(var2);
    }

    boolean d(UUID var1) {
        return false;
    }

    void e(UUID var1) {
        Collection var2 = com.trolmastercard.sexmod.server.TribeData.j(var1);
        if (var2 != null) {
            for (com.trolmastercard.sexmod.server.KoboldDen var4 : var2) {
                var4.b(this);
            }
        }

        if (this.aw()) {
            this.f(var1);
        } else {
            this.g(var1);
        }
    }

    void f(UUID var1) {
        BlockPos[] var2 = com.trolmastercard.sexmod.server.TribeData.a(this);
        if (var2 != null) {
            Vec3 var9 = new Vec3(var2[0].getX() + 0.5F, var2[0].getY() + 0.5625, var2[0].getZ() + 0.5F);
            Vec3 var10 = new Vec3(var2[1].getX() + 0.5F, var2[1].getY() + 0.5625, var2[1].getZ() + 0.5F);
            boolean var12 = var9.subtract(var10).x == 0.0;
            Vec3 var13 = com.trolmastercard.sexmod.util.LerpUtils.a(var9, var10, 0.5);
            this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ap, true);
            this.d(var13);
            this.a_(var12 ? 0.0F : 90.0F);
            this.noPhysics = true;
            this.setNoGravity(true);
        } else {
            HashSet var3 = com.trolmastercard.sexmod.server.TribeData.h(var1);
            if (var3 != null) {
                BlockPos var4 = null;

                for (BlockPos var6 : var3) {
                    BlockState var7 = this.level().getBlockState(var6);
                    boolean var8 = false;
                    if (var7.getBlock() instanceof BedBlock && var7.hasProperty(BedBlock.OCCUPIED)) {
                        var8 = (Boolean)var7.getValue(BedBlock.OCCUPIED);
                    }

                    if (!var8 && !com.trolmastercard.sexmod.server.TribeData.a(var6)) {
                        if (var4 == null) {
                            var4 = var6;
                        } else if (this.distanceToSqr(Vec3.atCenterOf(var4)) > this.distanceToSqr(Vec3.atCenterOf(var6))) {
                            var4 = var6;
                        }
                    }
                }

                if (var4 != null) {
                    double var11 = Math.sqrt(this.blockPosition().distSqr(var4));
                    if (!(var11 > 2.0)) {
                        com.trolmastercard.sexmod.server.TribeData.a(this, var4);
                        this.c(com.trolmastercard.sexmod.entity.ScenePose.aJ);
                    } else if (Math.abs(var4.subtract(this.blockPosition()).getY()) > 4) {
                        this.c(var4.offset(0, 1, 0));
                    } else {
                        BlockPos var14 = this.b(var4);
                        this.getNavigation().moveTo(var14.getX(), var14.getY(), var14.getZ(), 0.35);
                        if (this.getNavigation().getPath() == null) {
                            this.c(var4.offset(0, 1, 0));
                        }
                    }
                }
            }
        }
    }

    void g(UUID var1) {
        BlockPos var2 = com.trolmastercard.sexmod.server.TribeData.l(var1);
        if (var2 == null && com.trolmastercard.sexmod.server.TribeData.d(var1, this)) {
            BlockPos var3 = this.blockPosition().offset(1, 0, 0);
            this.u = this.level().getBlockState(var3.offset(0, -1, 0));
            this.v = this.level().getBlockState(var3);
            this.level().setBlockAndUpdate(var3.offset(0, -1, 0), Blocks.NETHERRACK.defaultBlockState());
            this.level().setBlockAndUpdate(var3, ((com.trolmastercard.sexmod.EyeAndKoboldColor.a)com.trolmastercard.sexmod.registry.ModBlocks.b.get()).defaultBlockState());
            com.trolmastercard.sexmod.server.TribeData.d(var1, var3);
            var2 = var3;
        }

        if (var2 != null) {
            if (this.w == null) {
                int var5 = (com.trolmastercard.sexmod.server.TribeData.d(var1, this) && this.getRandom().nextBoolean() ? 1 : -1) * (this.getRandom().nextInt(2) + 1);
                int var4 = (this.getRandom().nextBoolean() ? 1 : -1) * (this.getRandom().nextInt(2) + 1);
                this.w = var2.offset(var5, 0, var4);
            }

            this.getNavigation().moveTo(this.w.getX(), this.w.getY(), this.w.getZ(), 0.35);
            this.au();
        }
    }

    void h(UUID var1) {
        if (!this.d(var1)) {
            if (!this.aw() && com.trolmastercard.sexmod.server.TribeData.e(var1)) {
                this.getNavigation().stop();
                this.z = null;
            } else {
                com.trolmastercard.sexmod.entity.KoboldDayPhase var2 = com.trolmastercard.sexmod.server.TribeData.k(var1);
                com.trolmastercard.sexmod.entity.KoboldDayPhase var3 = this.r();
                if (var2 != var3) {
                    com.trolmastercard.sexmod.server.TribeData.a(var1, var3);
                    switch (var3) {
                        case b:
                            this.i(var1);
                            com.trolmastercard.sexmod.server.TribeData.d(var1, (BlockPos)null);
                            this.c("okay resting time owo");
                            break;
                        case a:
                            this.k(var1);
                            this.j(var1);
                    }
                }

                switch (var3) {
                    case b:
                        this.e(var1);
                        break;
                    case a:
                        this.w = null;
                        this.l(var1);
                }
            }
        }
    }

    void i(UUID var1) {
        Collection var2 = com.trolmastercard.sexmod.server.TribeData.j(var1);
        if (var2 != null) {
            for (com.trolmastercard.sexmod.server.KoboldDen var4 : var2) {
                var4.f();
            }
        }
    }

    void j(UUID var1) {
        if (this.aw()) {
            for (KoboldEntity var4 : com.trolmastercard.sexmod.server.TribeData.d(var1)) {
                com.trolmastercard.sexmod.server.TribeData.b(var4);
                if (var4.al() == null) {
                    var4.noPhysics = false;
                    var4.setNoGravity(false);
                    var4.getEntityData().set(com.trolmastercard.sexmod.entity.GirlEntity.ap, false);
                    var4.c(com.trolmastercard.sexmod.entity.ScenePose.a);
                }
            }
        }
    }

    void k(UUID var1) {
        BlockPos var2 = com.trolmastercard.sexmod.server.TribeData.l(var1);
        if (var2 != null) {
            if (this.v != null) {
                this.level().setBlockAndUpdate(var2, this.v);
            }

            if (this.u != null) {
                this.level().setBlockAndUpdate(var2.offset(0, -1, 0), this.u);
            }
        }
    }

    void l(UUID var1) {
        if (this.aw()) {
            com.trolmastercard.sexmod.server.TribeData.e(var1, (KoboldEntity)null);
            this.c(var1);
        } else {
            Collection var2 = com.trolmastercard.sexmod.server.TribeData.j(var1);
            if (var2 != null) {
                if (this.x) {
                    this.z = null;
                    this.a(var1, var2);
                } else {
                    this.b(var1, var2);
                }
            }
        }
    }

    void a(UUID var1, Collection<com.trolmastercard.sexmod.server.KoboldDen> var2) {
        if (var2.isEmpty()) {
            this.x = false;
            this.n(var1);
            this.c("Lets go somewhere else");
        }
    }

    void b(UUID var1, Collection<com.trolmastercard.sexmod.server.KoboldDen> var2) {
        BlockPos var3 = com.trolmastercard.sexmod.server.TribeData.l(var1);
        if (var3 == null) {
            this.n(var1);
        } else {
            if (this.tickCount % 40 == 0) {
                if (this.y.equals(this.position())) {
                    this.n(var1);
                    this.z = null;
                }

                this.y = this.position();
            }

            if (this.z == null || !(this.z.distSqr(this.blockPosition()) < 16.0)) {
                this.z = this.m(var1);
            }

            this.getNavigation().moveTo(this.z.getX(), this.z.getY(), this.z.getZ(), 0.35);
            this.au();
            if (!(Math.sqrt(this.blockPosition().distSqr(var3)) > 5.0)) {
                this.x = true;
                this.c("Time to work bitches!");
                int var4 = com.trolmastercard.sexmod.server.TribeData.f(var1);

                for (int var5 = 1; var5 < var4; var5++) {
                    this.c(var1, var2);
                }

                com.trolmastercard.sexmod.server.TribeData.e(var1, (KoboldEntity)null);
            }
        }
    }

    BlockPos m(UUID var1) {
        BlockPos var2 = com.trolmastercard.sexmod.server.TribeData.l(var1);
        return var2 == null ? BlockPos.ZERO : this.b(var2);
    }

    void n(UUID var1) {
        BlockPos var2 = this.blockPosition();
        int var3 = 0;

        do {
            var3++;
            var2 = this.blockPosition();
            var2 = var2.offset(
                (50 + this.getRandom().nextInt(50)) * (this.getRandom().nextBoolean() ? 1 : -1),
                0,
                (50 + this.getRandom().nextInt(50)) * (this.getRandom().nextBoolean() ? 1 : -1)
            );
            var2 = new BlockPos(var2.getX(), com.trolmastercard.sexmod.util.BlockPosUtils.a(this.level(), var2.getX(), var2.getZ()), var2.getZ());
        } while ((var2.getY() <= 0 || !this.getNavigation().isStableDestination(var2)) && var3 < 100);

        com.trolmastercard.sexmod.server.TribeData.d(var1, var2);
    }

    void o(UUID var1) {
        if (!this.a(var1, false)) {
            this.m();
        }
    }

    void m() {
        Player var1 = this.level().getNearestPlayer(this, 15.0);
        if (this.aw()
            && var1 != null
            && var1.distanceTo(this) < 2.0F
            && ((String)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao)).equals(var1.getUUID().toString())) {
            this.getNavigation().stop();
        } else {
            boolean var2 = this.E == null;
            if (!var2) {
                double var3 = this.distanceToSqr(this.E.getX(), this.E.getY(), this.E.getZ());
                var2 = var3 <= this.n() * this.n();
            }

            if (!var2 && this.F > 100) {
                var2 = true;
            }

            if (var2) {
                int var6 = (this.getRandom().nextBoolean() ? 1 : -1) * this.getRandom().nextInt(5);
                int var4 = (this.getRandom().nextBoolean() ? 1 : -1) * this.getRandom().nextInt(5);
                int var5 = com.trolmastercard.sexmod.util.BlockPosUtils.a(this.level(), this.blockPosition().getX() + var6, this.blockPosition().getZ() + var4);
                this.E = new BlockPos(this.blockPosition().getX() + var6, var5, this.blockPosition().getZ() + var4);
                this.F = 0;
            }

            if (Math.sqrt(this.E.distSqr(this.blockPosition())) > 2.0) {
                this.getNavigation().moveTo(this.E.getX(), this.E.getY(), this.E.getZ(), 0.35);
                this.au();
            } else {
                this.F++;
            }
        }
    }

    double n() {
        return Math.sqrt(800.0);
    }

    boolean o() {
        for (int var1 = 0; var1 < this.J.getSlots(); var1++) {
            if (!this.J.getStackInSlot(var1).isEmpty()) {
                return false;
            }
        }

        return true;
    }

    boolean a(UUID var1, boolean var2) {
        if (this.o()) {
            return false;
        }

        if (this.b(var1, var2)) {
            this.D = 0;
            return true;
        }

        if (--this.D < 0 && this.p) {
            this.D = 300;
            Player var3 = this.level().getPlayerByUUID(UUID.fromString((String)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao)));
            com.trolmastercard.sexmod.EyeAndKoboldColor var4 = com.trolmastercard.sexmod.EyeAndKoboldColor.a((String)this.entityData.get(com.trolmastercard.sexmod.entity.VariantGirlEntity.U));
            if (var3 != null) {
                var3.displayClientMessage(
                    Component.literal(
                        var4.c()
                            + this.a()
                            + "s "
                            + ChatFormatting.WHITE
                            + "inventory is full and there are either no chests to put her items in or said chests are full as well"
                    ),
                    false
                );
            }
        }

        return false;
    }

    boolean b(UUID var1, boolean var2) {
        HashSet var3 = com.trolmastercard.sexmod.server.TribeData.i(var1);
        if (var3 == null) {
            return false;
        }

        BlockPos var4 = null;

        for (BlockPos var6 : var3) {
            IItemHandler var7 = (IItemHandler)this.level().getCapability(ItemHandler.BLOCK, var6, null);
            if (var7 != null) {
                boolean var8 = false;

                for (int var9 = 0; var9 < this.J.getSlots() && !var8; var9++) {
                    ItemStack var10 = this.J.getStackInSlot(var9);
                    if (!var10.isEmpty()) {
                        ItemStack var11 = ItemHandlerHelper.insertItemStacked(var7, var10, true);
                        if (var11.getCount() != var10.getCount()) {
                            var8 = true;
                        }
                    }
                }

                if (var8) {
                    if (var4 == null) {
                        var4 = var6;
                    } else if (this.distanceToSqr(Vec3.atCenterOf(var4)) > this.distanceToSqr(Vec3.atCenterOf(var6))) {
                        var4 = var6;
                    }
                }
            }
        }

        if (var4 == null) {
            return false;
        }

        if (this.distanceToSqr(var4.getX() + 0.5, var4.getY() + 0.5, var4.getZ() + 0.5) < 4.0) {
            IItemHandler var12 = (IItemHandler)this.level().getCapability(ItemHandler.BLOCK, var4, null);
            if (var12 != null) {
                for (int var14 = 0; var14 < this.J.getSlots(); var14++) {
                    ItemStack var15 = this.J.getStackInSlot(var14);
                    if (!var15.isEmpty()) {
                        ItemStack var16 = ItemHandlerHelper.insertItemStacked(var12, var15, false);
                        this.J.setStackInSlot(var14, var16);
                    }
                }
            }

            this.level().playSound(null, var4, SoundEvents.CHEST_OPEN, SoundSource.BLOCKS, 1.0F, 1.0F);
            return true;
        } else if (Math.abs(var4.getY() - this.blockPosition().getY()) <= 4) {
            BlockPos var13 = this.b(var4);
            this.getNavigation().moveTo(var13.getX(), var13.getY(), var13.getZ(), 0.35);
            if (this.getNavigation().getPath() == null && var2) {
                this.c(var4);
            }

            return true;
        } else if (var2) {
            this.c(var4);
            return true;
        } else {
            return false;
        }
    }

    void b(UUID var1, com.trolmastercard.sexmod.server.KoboldDen var2) {
        if (this.ai() != com.trolmastercard.sexmod.entity.ScenePose.aI) {
            this.c(var1, var2);
        } else {
            this.B--;
            this.A--;
            if (this.A == 0) {
                BlockState var3 = this.level().getBlockState(this.q.above());
                if (!(var3.getBlock() instanceof FallingBlock)) {
                    var2.a(this.q);
                }

                BlockState var4 = this.level().getBlockState(this.q);
                ItemStack var5 = var4.getCloneItemStack(null, this.level(), this.q, null);
                if (!var5.isEmpty()) {
                    this.b(var5);
                }

                this.level().removeBlock(this.q, false);
            }

            if (this.B <= 0) {
                this.B = 100;
                this.A = 24;
                this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
            }
        }
    }

    void c(UUID var1, com.trolmastercard.sexmod.server.KoboldDen var2) {
        if (this.q != null && var2.d().contains(this.q)) {
            BlockState var9 = this.level().getBlockState(this.q);
            ItemStack var12 = var9.getCloneItemStack(null, this.level(), this.q, null);
            if (!this.c(var12)) {
                this.p = true;
                this.a(var1, true);
            } else {
                Direction var13 = var2.a();
                boolean var6 = this.getDeltaMovement().x == 0.0
                    && this.getDeltaMovement().z == 0.0
                    && this.onGround()
                    && this.distanceToSqr(this.q.getX(), this.q.getY(), this.q.getZ()) <= 9.0;
                if (var6 && ++this.C >= 10) {
                    this.getNavigation().stop();
                    this.C = 0;
                    this.c(com.trolmastercard.sexmod.entity.ScenePose.aI);
                    float var14 = (float)(Math.atan2(this.getZ() - this.q.getZ(), this.getX() - this.q.getX()) * (180.0 / Math.PI) + 90.0);
                    this.setYRot(var14);
                    this.setYHeadRot(var14);
                    this.entityData.set(h, false);
                } else {
                    BlockPos var7 = this.q.relative(var13.getOpposite());
                    this.getNavigation().moveTo(var7.getX(), var7.getY(), var7.getZ(), 0.35);
                }
            }
        } else {
            this.q = this.a(var2, var1);
            if (this.q == null) {
                boolean var8 = var2.d().isEmpty();
                com.trolmastercard.sexmod.server.TribeData.a(var1, var2);
                UUID var11 = com.trolmastercard.sexmod.server.TribeData.o(var1);
                if (var11 != null) {
                    Player var5 = this.level().getPlayerByUUID(var11);
                    if (var5 != null) {
                        if (!var8) {
                            var5.displayClientMessage(Component.literal(String.format("<%s> It's impossible to mine here...", this.a())), false);
                        }
                    }
                }
            } else {
                Direction var3 = var2.a();
                if (Math.abs(this.blockPosition().getY() - var2.b().getY()) > 3) {
                    BlockPos var4 = var2.b().relative(var3.getOpposite());
                    this.level().setBlockAndUpdate(var4, Blocks.AIR.defaultBlockState());
                    this.c(var4);
                }

                BlockPos var10 = this.q.relative(var3.getOpposite());
                this.getNavigation().moveTo(var10.getX(), var10.getY(), var10.getZ(), 0.35);
            }
        }
    }

    BlockPos a(com.trolmastercard.sexmod.server.KoboldDen var1, UUID var2) {
        HashSet var3 = var1.d();
        Direction var4 = var1.a();
        ArrayList var5 = new ArrayList();
        Integer var6 = null;
        if (var3.isEmpty()) {
            return null;
        }

        for (BlockPos var8 : var3) {
            switch (var4) {
                case NORTH:
                    if (var6 == null || var8.getZ() >= var6) {
                        var6 = var8.getZ();
                        var5.add(var8);
                    }
                    break;
                case SOUTH:
                    if (var6 == null || var8.getZ() <= var6) {
                        var6 = var8.getZ();
                        var5.add(var8);
                    }
                    break;
                case EAST:
                    if (var6 == null || var8.getX() <= var6) {
                        var6 = var8.getX();
                        var5.add(var8);
                    }
                    break;
                case WEST:
                    if (var6 == null || var8.getX() >= var6) {
                        var6 = var8.getX();
                        var5.add(var8);
                    }
            }
        }

        ArrayList var15 = new ArrayList();
        if (var6 != null) {
            for (BlockPos var9 : var5) {
                boolean var10 = var4 != Direction.NORTH && var4 != Direction.SOUTH ? var9.getX() == var6 : var9.getZ() == var6;
                if (var10) {
                    var15.add(var9);
                }
            }
        }

        if (var15.isEmpty()) {
            return null;
        }

        ArrayList var17 = new ArrayList();
        BlockPos var18 = var1.b();
        if (var4.getAxis() == Axis.Z) {
            BlockPos var19 = new BlockPos(var18.getX(), var18.getY(), ((BlockPos)var15.get(0)).getZ());
            var19 = var4 == Direction.NORTH ? var19.north() : var19.south();
            BlockPos var11 = var19.below();
            var17.add(var11);
            var17.add(var11.east());
            var17.add(var11.east().east());
            var17.add(var11.above());
            var17.add(var11.below().east().east().above());
            var17.add(var19);
            var17.add(var19.east());
            var17.add(var19.east().above());
            var17.add(var19.north());
            var17.add(var19.north().above());
        } else if (var4.getAxis() == Axis.X) {
            BlockPos var21 = new BlockPos(((BlockPos)var15.get(0)).getX(), var18.getY(), var18.getZ());
            var21 = var4 == Direction.EAST ? var21.east() : var21.west();
            BlockPos var24 = var21.below();
            var17.add(var24);
            var17.add(var24.south());
            var17.add(var24.south().south());
            var17.add(var24.above());
            var17.add(var24.south().south().above());
            var17.add(var21);
            var17.add(var21.south());
            var17.add(var21.south().above());
            var17.add(var21.east());
            var17.add(var21.east().above());
        }

        HashSet var23 = new HashSet();

        for (BlockPos var12 : var17) {
            BlockState var13 = this.level().getBlockState(var12);
            if (!var13.getFluidState().isEmpty()) {
                this.level().setBlock(var12, Blocks.COBBLESTONE.defaultBlockState(), 2);
                if (var15.contains(var12)) {
                    var23.add(var12);
                }
            }
        }

        if (!var23.isEmpty()) {
            var1.a(var23);
        }

        for (BlockPos var28 : var17) {
            BlockState var31 = this.level().getBlockState(var28);
            if (var31.canBeReplaced()) {
                this.level().setBlockAndUpdate(var28, Blocks.COBBLESTONE.defaultBlockState());
            }
        }

        HashSet var27 = new HashSet();

        for (BlockPos var32 : var15) {
            if (this.level().getBlockState(var32).isAir()) {
                var27.add(var32);
            }
        }

        if (!var27.isEmpty()) {
            var15.removeAll(var27);
            var1.b(var27);
        }

        if (var15.isEmpty()) {
            return this.a(var1, var2);
        }

        BlockPos var30 = null;
        List var33 = var1.e();

        for (int var14 = 0; var14 < var33.size(); var14++) {
            if (((KoboldEntity)var33.get(var14)).getId() != this.getId()) {
                if (var14 == 0) {
                    var30 = this.a(var15, -1, var4, var18);
                    if (var30 == null) {
                        var30 = this.a(var15, 0, var4, var18);
                        if (var30 == null) {
                            var30 = this.a(var15, 1, var4, var18);
                        }
                    }
                    break;
                }

                if (var14 == 1) {
                    var30 = this.a(var15, 1, var4, var18);
                    if (var30 == null) {
                        var30 = this.a(var15, 0, var4, var18);
                        if (var30 == null) {
                            var30 = this.a(var15, -1, var4, var18);
                        }
                    }
                    break;
                }

                if (var14 == 2) {
                    var30 = this.a(var15, 0, var4, var18);
                    if (var30 == null) {
                        var30 = this.a(var15, 1, var4, var18);
                        if (var30 == null) {
                            var30 = this.a(var15, -1, var4, var18);
                        }
                    }
                    break;
                }
            }
        }

        return var30;
    }

    @Nullable
    BlockPos a(List<BlockPos> var1, int var2, Direction var3, BlockPos var4) {
        if (var1.isEmpty()) {
            return null;
        }

        ArrayList var5 = new ArrayList();
        ArrayList var6 = new ArrayList();
        ArrayList var7 = new ArrayList();
        int var8 = var3 != Direction.SOUTH && var3 != Direction.WEST ? 1 : -1;
        if (var3.getAxis() == Axis.Z) {
            BlockPos var9 = new BlockPos(var4.getX(), var4.getY(), ((BlockPos)var1.get(0)).getZ());
            var7.add(var9);
            var7.add(var9.above());
            var7.add(var9.above().above());
            var7.add(var9.west());
            var7.add(var9.west().above());
            var7.add(var9.west().above().above());
            var7.add(var9.east());
            var7.add(var9.east().above());
            var7.add(var9.east().above().above());
            if (var2 == 0) {
                for (BlockPos var11 : var7) {
                    var6.add(var11.east(2));
                    var6.add(var11.east(-2));
                }

                for (BlockPos var20 : var1) {
                    if (!var6.contains(var20)) {
                        var5.add(var20);
                    }
                }
            } else {
                for (BlockPos var21 : var7) {
                    var6.add(var21.east(var8 * 2 * var2));
                }

                for (BlockPos var22 : var6) {
                    if (var1.contains(var22)) {
                        var5.add(var22);
                    }
                }
            }
        }

        if (var3.getAxis() == Axis.X) {
            BlockPos var12 = new BlockPos(((BlockPos)var1.get(0)).getX(), var4.getY(), var4.getZ());
            var7.add(var12);
            var7.add(var12.above());
            var7.add(var12.above().above());
            var7.add(var12.north());
            var7.add(var12.north().above());
            var7.add(var12.north().above().above());
            var7.add(var12.south());
            var7.add(var12.south().above());
            var7.add(var12.south().above().above());
            if (var2 == 0) {
                for (BlockPos var23 : var7) {
                    var6.add(var23.south(2));
                    var6.add(var23.south(-2));
                }

                for (BlockPos var24 : var1) {
                    if (!var6.contains(var24)) {
                        var5.add(var24);
                    }
                }
            } else {
                for (BlockPos var25 : var7) {
                    var6.add(var25.south(var8 * 2 * var2));
                }

                for (BlockPos var26 : var6) {
                    if (var1.contains(var26)) {
                        var5.add(var26);
                    }
                }
            }
        }

        return var5.isEmpty() ? null : (BlockPos)var5.get(this.getRandom().nextInt(var5.size()));
    }

    void p() {
        if (this.level().isClientSide()) {
            UUID var1 = this.al();
            if (var1 != null) {
                if ((Boolean)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ap)) {
                    if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a) {
                        Player var2 = this.level().getPlayerByUUID(var1);
                        if (var2 != null) {
                            this.c(var2);
                        }
                    }
                }
            }
        }
    }

    void c(Player var1) {
        float var2 = var1.getEyeHeight();
        Vec3 var3 = new Vec3(var1.getX(), var1.getY() + var2, var1.getZ());
        Vec3 var4 = new Vec3(this.getX(), this.getY() + this.getEyeHeight(), this.getZ());
        double var5 = var4.distanceTo(var3);
        double var7 = var3.y - var4.y;
        this.setXRot((float)(-(Math.sin(var7 / var5) * (180.0 / Math.PI))));
    }

    boolean q() {
        if (!this.m) {
            return false;
        }

        this.n++;
        this.noPhysics = false;
        this.setNoGravity(false);
        if (this.n > 40) {
            this.m = false;
            this.n = 0;
            Player var6 = this.level().getPlayerByUUID(this.al());
            this.a_(var6.getYRot() + 180.0F);
            this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ap, true);
            var6.noPhysics = true;
            var6.setNoGravity(true);
            this.noPhysics = true;
            this.setNoGravity(true);
            this.getNavigation().stop();
            this.c_();
            return true;
        }

        this.setYRot(this.e_());
        this.setNoGravity(false);
        Vec3 var1 = com.trolmastercard.sexmod.util.LerpUtils.a(this.position(), this.am(), 40 - this.n);
        this.setPos(var1.x, var1.y, var1.z);
        this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
        String var2 = (String)this.entityData.get(i);
        if ("".equals(var2)) {
            return true;
        }

        Collection var3 = com.trolmastercard.sexmod.server.TribeData.j(UUID.fromString(var2));
        if (var3 == null) {
            return true;
        }

        for (com.trolmastercard.sexmod.server.KoboldDen var5 : var3) {
            var5.b(this);
        }

        return true;
    }

    void p(UUID var1) {
        if (this.k != -1) {
            if (++this.k >= 132) {
                this.k = -1;
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.aN) {
                    UUID var2 = this.al();
                    if (var2 != null) {
                        Player var3 = this.level().getPlayerByUUID(var2);
                        if (var3 != null) {
                            com.trolmastercard.sexmod.EyeAndKoboldColor var4 = com.trolmastercard.sexmod.server.TribeData.g(var1);
                            ItemStack var5 = new ItemStack((ItemLike)com.trolmastercard.sexmod.registry.ModItems.r.get());
                            CompoundTag var6 = ((CustomData)var5.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)).copyTag();
                            var6.putString("tribeID", var1.toString());
                            var6.putString("tribeColor", var4.name());
                            var5.set(DataComponents.CUSTOM_DATA, CustomData.of(var6));
                            var3.getInventory().add(var5);
                        }
                    }
                }
            }
        }
    }

    com.trolmastercard.sexmod.entity.KoboldDayPhase r() {
        long var1 = this.level().getGameTime() % 24000L;
        return var1 < 12000L ? com.trolmastercard.sexmod.entity.KoboldDayPhase.a : com.trolmastercard.sexmod.entity.KoboldDayPhase.b;
    }

    void c(UUID var1, Collection<com.trolmastercard.sexmod.server.KoboldDen> var2) {
        List var3 = this.a(this.blockPosition(), RotatedPillarBlock.class, 30, 4, null);
        BlockPos var4 = null;

        for (BlockPos var6 : var3) {
            BlockState var7 = this.level().getBlockState(var6.below());
            if (!var7.is(BlockTags.LOGS) && !var7.isAir()) {
                boolean var8 = false;

                for (com.trolmastercard.sexmod.server.KoboldDen var10 : var2) {
                    if (var10.b(var6)) {
                        var8 = true;
                        break;
                    }
                }

                if (!var8) {
                    var4 = var6;
                    break;
                }
            }
        }

        if (var4 != null) {
            com.trolmastercard.sexmod.server.KoboldDen.a(this.level(), var4, var1);
            this.c("Someone, go fall this tree!");
        }
    }

    @Override
    protected void c_() {
        String var1 = (String)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.av);
        boolean var2 = false;
        boolean var3 = false;
        if (this.aw() && this.al() != null) {
            var3 = ((String)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao)).equals(this.al().toString());
        }

        boolean var4 = var2 || var3;
        if (var1.equals(com.trolmastercard.sexmod.entity.ScenePose.b.toString())) {
            if (!var4 && this.ai() != com.trolmastercard.sexmod.entity.ScenePose.g) {
                this.c(com.trolmastercard.sexmod.entity.ScenePose.g);
            } else {
                this.c(com.trolmastercard.sexmod.entity.ScenePose.b);
            }
        }

        if (var1.equals(com.trolmastercard.sexmod.entity.ScenePose.Z.toString())) {
            if (!var4 && this.ai() != com.trolmastercard.sexmod.entity.ScenePose.g) {
                this.c(com.trolmastercard.sexmod.entity.ScenePose.g);
            } else {
                this.c(com.trolmastercard.sexmod.entity.ScenePose.Z);
            }
        }

        if (var1.equals(com.trolmastercard.sexmod.entity.ScenePose.aK.toString())) {
            this.c(com.trolmastercard.sexmod.entity.ScenePose.aK);
        }
    }

    @Override
    public void tick() {
        super.tick();
        this.s();
        this.p();
        this.t();
        if (this.level().isClientSide()) {
            this.v();
        }

        this.u();
    }

    void s() {
    }

    void t() {
        if (this.level().isClientSide()) {
            if (this.ai() != com.trolmastercard.sexmod.entity.ScenePose.aJ) {
                if ((Boolean)this.entityData.get(g)) {
                    if (this.aw()) {
                        Player var1 = this.level().getPlayerByUUID(UUID.fromString((String)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao)));
                        if (var1 != null) {
                            this.c(var1);
                        }
                    }
                }
            }
        }
    }

    void u() {
    }

    void v() {
        if (this.level().isClientSide()) {
            if (this.level().getGameTime() - 300L >= I) {
                if (this.aw()) {
                    if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a) {
                        if ("".equals(this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.av))) {
                            if (!(Boolean)this.entityData.get(g)) {
                                String var1 = (String)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao);
                                Player var2 = this.level().getNearestPlayer(this, 10.0);
                                if (var2 == null) {
                                    this.H = Float.MAX_VALUE;
                                } else if (var2.getUUID().toString().equals(var1)) {
                                    float var3 = this.distanceTo(var2);
                                    if (var3 < 2.0F && this.H > 2.0F) {
                                        com.trolmastercard.sexmod.registry.ModSounds.a(this, "kobold", "heymaster");
                                        this.d("Hey master!");
                                        I = this.level().getGameTime();
                                    }

                                    this.H = var3;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        com.trolmastercard.sexmod.entity.ScenePose var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.entity.ScenePose.aN || var1 != com.trolmastercard.sexmod.entity.ScenePose.aL && var1 != com.trolmastercard.sexmod.entity.ScenePose.aM) {
            if (var2 != com.trolmastercard.sexmod.entity.ScenePose.ac || var1 != com.trolmastercard.sexmod.entity.ScenePose.aa && var1 != com.trolmastercard.sexmod.entity.ScenePose.ab) {
                if (var2 != com.trolmastercard.sexmod.entity.ScenePose.e || var1 != com.trolmastercard.sexmod.entity.ScenePose.c && var1 != com.trolmastercard.sexmod.entity.ScenePose.f) {
                    if (var1 == com.trolmastercard.sexmod.entity.ScenePose.aN) {
                        this.k = 0;
                    }

                    super.c(var1);
                }
            }
        }
    }

    public void die(DamageSource var1) {
        super.die(var1);
        if (!this.level().isClientSide()) {
            String var2 = (String)this.entityData.get(i);
            if (!"".equals(var2)) {
                this.x();
                com.trolmastercard.sexmod.server.TribeData.c(UUID.fromString(var2), this);
                if (this.aw()) {
                    Player var3 = this.ay();
                    if (var3 != null) {
                        var3.displayClientMessage(
                            Component.literal(
                                String.format("%s%s%s has perished %suwu", ChatFormatting.RED, this.a(), ChatFormatting.WHITE, ChatFormatting.RED)
                            ),
                            false
                        );
                    }
                }
            }
        }
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.d) {
            return com.trolmastercard.sexmod.entity.ScenePose.f;
        } else {
            return var1 == com.trolmastercard.sexmod.entity.ScenePose.aa ? com.trolmastercard.sexmod.entity.ScenePose.ab : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose b(com.trolmastercard.sexmod.entity.ScenePose var1) {
        if (var1 == com.trolmastercard.sexmod.entity.ScenePose.f || var1 == com.trolmastercard.sexmod.entity.ScenePose.d) {
            return com.trolmastercard.sexmod.entity.ScenePose.e;
        } else if (var1 == com.trolmastercard.sexmod.entity.ScenePose.aa || var1 == com.trolmastercard.sexmod.entity.ScenePose.ab) {
            return com.trolmastercard.sexmod.entity.ScenePose.ac;
        } else {
            return var1 != com.trolmastercard.sexmod.entity.ScenePose.aM && var1 != com.trolmastercard.sexmod.entity.ScenePose.aL ? null : com.trolmastercard.sexmod.entity.ScenePose.aN;
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag var1) {
        var1.putFloat("body_size", (Float)this.entityData.get(b));
        var1.putInt("eyeColorX", ((BlockPos)this.entityData.get(V)).getX());
        var1.putInt("eyeColorY", ((BlockPos)this.entityData.get(V)).getY());
        var1.putInt("eyeColorZ", ((BlockPos)this.entityData.get(V)).getZ());
        var1.putString("model", (String)this.entityData.get(W));
        var1.putString("name", (String)this.entityData.get(c));
        var1.putString("master", (String)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ao));
        var1.put("inventory", this.J.serializeNBT(this.registryAccess()));
        var1.putString("bodyColor", (String)this.entityData.get(U));
        var1.putBoolean("editedColorManually", this.G);
        String var2 = (String)this.entityData.get(i);
        if (!"".equals(var2)) {
            var1.putString("tribeId", var2);
            var1.putBoolean("isLeader", com.trolmastercard.sexmod.server.TribeData.d(UUID.fromString(var2), this));
            var1.putString("tribeName", (String)this.entityData.get(f));
        }

        super.addAdditionalSaveData(var1);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        String var2 = var1.getString("model");
        if (!"".equals(var2)) {
            this.entityData.set(W, var2);
        }

        BlockPos var3 = new BlockPos(var1.getInt("eyeColorX"), var1.getInt("eyeColorY"), var1.getInt("eyeColorZ"));
        if (!BlockPos.ZERO.equals(var3)) {
            this.entityData.set(V, var3);
        }

        this.entityData.set(b, var1.getFloat("body_size"));
        this.entityData.set(c, var1.getString("name"));
        this.entityData.set(com.trolmastercard.sexmod.entity.GirlEntity.ao, var1.getString("master"));
        this.J.deserializeNBT(this.registryAccess(), var1.getCompound("inventory"));
        String var4 = var1.getString("bodyColor");
        if (!"".equals(var4)) {
            this.entityData.set(U, var4);
        }

        this.G = var1.getBoolean("editedColorManually");
        String var5 = var1.getString("tribeId");
        if (!"".equals(var5) && !this.isRemoved()) {
            UUID var6 = UUID.fromString(var5);
            this.entityData.set(i, var5);
            this.x();
            if (!com.trolmastercard.sexmod.server.TribeData.a(var6)) {
                com.trolmastercard.sexmod.server.TribeData.a(var6, com.trolmastercard.sexmod.EyeAndKoboldColor.a((String)this.entityData.get(U)));
            }

            com.trolmastercard.sexmod.server.TribeData.b(var6, this);
            if (var1.getBoolean("isLeader")) {
                com.trolmastercard.sexmod.server.TribeData.a(var6, this);
            }

            this.entityData.set(f, var1.getString("tribeName"));
        }
    }

    private void x() {
        if (!this.level().isClientSide()) {
            MinecraftServer var1 = this.level().getServer();
            if (var1 != null) {
                com.trolmastercard.sexmod.server.TribeData.a(var1.overworld());
            }
        }
    }

    public boolean w() {
        if (this.ao()) {
            return false;
        }

        BlockPos var1 = this.blockPosition().above();
        return !this.level().getBlockState(var1).getCollisionShape(this.level(), var1).isEmpty();
    }

    @Override
    protected String h() {
        return "animation.kobold.idle";
    }

    @Override
    protected PlayState a(AnimationState<GirlEntity> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a) {
                    this.a("animation.kobold.blink", true, var1);
                } else {
                    this.a("animation.kobold.null", true, var1);
                }
                break;
            case "movement":
                boolean var6 = this.xOld != this.getX() || this.zOld != this.getZ();
                if (this.isPassenger()) {
                    this.a("animation.kobold.sit", true, var1);
                } else if (!(Boolean)this.entityData.get(com.trolmastercard.sexmod.entity.GirlEntity.ap) && var6) {
                    if (!this.onGround() && this.yo > this.getY()) {
                        this.a("animation.kobold.fly", true, var1);
                    } else {
                        if (this.aC != null) {
                            this.aC.setAnimationSpeed(1.0);
                        }

                        if (this.w()) {
                            this.a("animation.kobold.crouch_walk", true, var1);
                        } else if ((Boolean)this.entityData.get(d)) {
                            this.a("animation.kobold.run_armed", true, var1);
                        } else {
                            switch (this.ag()) {
                                case c:
                                    this.a("animation.kobold.run", true, var1);
                                    return PlayState.CONTINUE;
                                case a:
                                case b:
                                    this.a("animation.kobold.walk", true, var1);
                                    return PlayState.CONTINUE;
                                default:
                                    this.a("animation.kobold.idle", true, var1);
                            }
                        }
                    }
                } else if (this.w()) {
                    this.a("animation.kobold.crouch_idle", true, var1);
                } else if ((Boolean)this.entityData.get(d)) {
                    this.a("animation.kobold.idle_armed", true, var1);
                } else {
                    this.a("animation.kobold.idle", true, var1);
                }
                break;
            case "action":
                switch (this.ai()) {
                    case A:
                        this.a("animation.kobold.attack", true, var1);
                        break;
                    case C:
                    case D:
                        this.a("animation.kobold.sit", true, var1);
                        break;
                    case aI:
                        this.a("animation.kobold.fall_tree", true, var1);
                        break;
                    case g:
                        this.a("animation.kobold.paymentBackpack", true, var1);
                        break;
                    case b:
                        this.a("animation.kobold.blowjobStart", true, var1);
                        break;
                    case d:
                        String var5 = "animation.kobold.blowjobSlowL";
                        this.a(var5, true, var1);
                        break;
                    case f:
                        this.a("animation.kobold.blowjobFast", true, var1);
                        break;
                    case e:
                        this.a("animation.kobold.blowjobCum", true, var1);
                        break;
                    case Z:
                        this.a("animation.kobold.analStart", true, var1);
                        break;
                    case aa:
                        this.a("animation.kobold.analSoft", true, var1);
                        break;
                    case ab:
                        this.a("animation.kobold.analHard", true, var1);
                        break;
                    case ac:
                        this.a("animation.kobold.analCum", true, var1);
                        break;
                    case aJ:
                        this.a("animation.kobold.sleep", true, var1);
                        break;
                    case aK:
                        this.a("animation.kobold.mating_press_start", true, var1);
                        break;
                    case aL:
                        this.a("animation.kobold.mating_press_soft", true, var1);
                        break;
                    case aM:
                        this.a("animation.kobold.mating_press_hard", true, var1);
                        break;
                    case aN:
                        this.a("animation.kobold.mating_press_cum", true, var1);
                        break;
                    case a:
                        this.a("animation.kobold.null", true, var1);
                }
        }

        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(ControllerRegistrar var1) {
        super.registerControllers(var1);
        if (this.aC != null) {
            this.aC.transitionLength(10);
        }

        this.aB.setSoundKeyframeHandler(var0 -> {});
    }

    public int getContainerSize() {
        return 27;
    }

    public boolean isEmpty() {
        return false;
    }

    public ItemStack getItem(int var1) {
        return var1 >= this.J.getSlots() ? ItemStack.EMPTY : this.J.getStackInSlot(var1);
    }

    public ItemStack removeItem(int var1, int var2) {
        ItemStack var3 = this.J.getStackInSlot(var1);
        if (!var3.isEmpty() && var2 > 0) {
            int var4 = Math.min(var2, var3.getCount());
            ItemStack var5 = var3.copyWithCount(var4);
            this.J.setStackInSlot(var1, var3.copyWithCount(var3.getCount() - var4));
            return var5;
        } else {
            return ItemStack.EMPTY;
        }
    }

    public ItemStack removeItemNoUpdate(int var1) {
        ItemStack var2 = this.J.getStackInSlot(var1);
        this.J.setStackInSlot(var1, ItemStack.EMPTY);
        return var2;
    }

    public void setItem(int var1, ItemStack var2) {
        this.J.setStackInSlot(var1, var2);
    }

    public int getMaxStackSize() {
        return 64;
    }

    public void setChanged() {
    }

    public boolean stillValid(Player var1) {
        return true;
    }

    public void clearContent() {
    }
public int getMaxStackSize() {
        return 64;
    }

    public void setChanged() {
    }

    public boolean stillValid(Player var1) {
        return true;
    }

    public void clearContent() {
    }
}
