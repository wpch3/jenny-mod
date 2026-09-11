package com.trolmastercard.sexmod.f.b;

import com.trolmastercard.sexmod.f.p;
import com.trolmastercard.sexmod.l.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.AbstractMap.SimpleEntry;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.entity.EntityTypeTest;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.server.ServerLifecycleHooks;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.animation.Animation.LoopType;
import software.bernie.geckolib.util.GeckoLibUtil;

public abstract class k extends PathfinderMob implements GeoEntity {
    public static int af = 22;
    public static HashSet<k> ag = new HashSet<>();
    public Vec3 ah;
    protected float ai;
    public PathNavigation aj;
    public Vec3 ak;
    public float al;
    public boolean am;
    private boolean a;
    HashMap<String, Vec3> an;
    public static final EntityDataAccessor<String> ao = SynchedEntityData.defineId(k.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> ap = SynchedEntityData.defineId(k.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<String> aq = SynchedEntityData.defineId(k.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Float> ar = SynchedEntityData.defineId(k.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<String> as = SynchedEntityData.defineId(k.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Integer> at = SynchedEntityData.defineId(k.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<String> au = SynchedEntityData.defineId(k.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> av = SynchedEntityData.defineId(k.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> aw = SynchedEntityData.defineId(k.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> ax = SynchedEntityData.defineId(k.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> ay = SynchedEntityData.defineId(k.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> az = SynchedEntityData.defineId(k.class, EntityDataSerializers.STRING);
    protected static final List<Item> aA = Arrays.asList(Items.EMERALD, Items.DIAMOND, Items.GOLD_INGOT, Items.ENDER_PEARL);
    public AnimationController<k> aB;
    public AnimationController<k> aC;
    public AnimationController<k> aD;
    HashMap<String, SimpleEntry<Integer, Integer>> aE;
    public List<String> aF;
    private final AnimatableInstanceCache b = GeckoLibUtil.createInstanceCache(this);
    private static final Ingredient c = Ingredient.of(new ItemLike[]{Items.EMERALD, Items.DIAMOND, Items.GOLD_INGOT, Items.ENDER_PEARL});
    private com.trolmastercard.sexmod.f.j d;
    private int e;
    private int f = -1;
    private int g = 1;

    public k.a ag() {
        return k.a.valueOf((String)this.entityData.get(ax));
    }

    protected void a(String var1, String var2) {
        if (this.level().isClientSide()) {
            com.trolmastercard.sexmod.b.b.a(new t(this.ah().toString(), var1, var2 == null ? "null" : var2));
        }
    }

    public UUID ah() {
        try {
            return UUID.fromString((String)this.entityData.get(as));
        } catch (Exception var3) {
            UUID var2 = UUID.randomUUID();
            this.entityData.set(as, var2.toString());
            return var2;
        }
    }

    public com.trolmastercard.sexmod.f.j ai() {
        return com.trolmastercard.sexmod.f.j.valueOf((String)this.entityData.get(au));
    }

    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != var1) {
            if (var1 != com.trolmastercard.sexmod.f.j.A || var2 == com.trolmastercard.sexmod.f.j.a) {
                var1 = var1 == null ? com.trolmastercard.sexmod.f.j.a : var1;
                if (this.level().isClientSide()) {
                    this.a("currentAction", var1.toString());
                } else {
                    var1.cv = new int[]{0, 0};
                    this.entityData.set(au, var1.toString());
                }
            }
        }
    }

    public int aj() {
        return (Integer)this.entityData.get(at);
    }

    public void d(int var1) {
        if (this.level().isClientSide()) {
            this.a("currentModel", "0");
        } else {
            this.entityData.set(at, var1);
        }
    }

    @Nullable
    public Player ak() {
        UUID var1 = this.al();
        return var1 == null ? null : this.level().getPlayerByUUID(var1);
    }

    public static void a(k var0, String var1) {
    }

    @Nullable
    public UUID al() {
        String var1 = (String)this.entityData.get(aw);
        return var1.equals("null") ? null : UUID.fromString(var1);
    }

    public void q(UUID var1) {
        if (this.level().isClientSide()) {
            if (var1 != null) {
                this.a("playerSheHasSexWith", var1.toString());
            } else {
                this.a("playerSheHasSexWith", (String)null);
            }
        } else {
            if (var1 != null) {
                this.entityData.set(aw, var1.toString());
            } else {
                this.entityData.set(aw, "null");
            }
        }
    }

    public Vec3 am() {
        String[] var1 = ((String)this.entityData.get(aq)).split("\\|");
        return new Vec3(Double.parseDouble(var1[0]), Double.parseDouble(var1[1]), Double.parseDouble(var1[2]));
    }

    public void d(Vec3 var1) {
        if (this.level().isClientSide()) {
            String var2 = var1.x + "f" + var1.y + "f" + var1.z + "f";
            this.a("targetPos", var2);
        } else {
            this.entityData.set(aq, var1.x + "|" + var1.y + "|" + var1.z);
        }
    }

    public Float e_() {
        return (Float)this.entityData.get(ar);
    }

    public void a_(float var1) {
        this.entityData.set(ar, var1);
    }

    public void d(boolean var1) {
        if (this.level().isClientSide()) {
            this.a("shouldbeattargetpos", String.valueOf(var1));
        } else {
            this.entityData.set(ap, var1);
        }
    }

    public boolean an() {
        return (Boolean)this.entityData.get(ap);
    }

    public boolean removeWhenFarAway(double var1) {
        return false;
    }

    protected k(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
        this.ak = Vec3.ZERO;
        this.al = 1.0F;
        this.am = false;
        this.a = false;
        this.an = new HashMap<>();
        this.aE = new HashMap<>();
        this.aF = new ArrayList<>();
        PathNavigation var3 = this.getNavigation();
        if (var3 instanceof GroundPathNavigation) {
            ((GroundPathNavigation)var3).setCanOpenDoors(true);
        }
    }

    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        this.aj = this.getNavigation();
        var1.define(as, UUID.randomUUID().toString());
        var1.define(at, 1);
        var1.define(au, com.trolmastercard.sexmod.f.j.a.toString());
        var1.define(av, "");
        var1.define(aw, "null");
        var1.define(ap, false);
        var1.define(ar, 0.0F);
        var1.define(aq, "0|0|0");
        var1.define(ao, "");
        var1.define(ax, k.a.a.toString());
        var1.define(ay, "");
        var1.define(az, "");
    }

    public boolean ao() {
        return this.a;
    }

    public static List<k> ap() {
        ArrayList var0 = new ArrayList();
        if (!com.trolmastercard.sexmod.m.l.a()) {
            com.trolmastercard.sexmod.b.b.a(var0);
            return var0;
        }

        MinecraftServer var1 = ServerLifecycleHooks.getCurrentServer();
        if (var1 == null) {
            return var0;
        }

        for (ServerLevel var3 : var1.getAllLevels()) {
            var0.addAll(var3.getEntities(EntityTypeTest.forClass(k.class), var0x -> true));
        }

        return var0;
    }

    public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder aq() {
        return PathfinderMob.createMobAttributes().add(Attributes.MAX_HEALTH, 20.0).add(Attributes.MOVEMENT_SPEED, 0.5).add(Attributes.FOLLOW_RANGE, 30.0);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(2, new TemptGoal(this, 0.4, c, false) {
            public boolean canUse() {
                return !k.this.ar() && super.canUse();
            }
        });
        this.goalSelector.addGoal(3, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 0.8) {
            public boolean canUse() {
                return !k.this.ar() && super.canUse();
            }
        });
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F) {
            public boolean canUse() {
                return !k.this.ar() && super.canUse();
            }
        });
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this) {
            public boolean canUse() {
                return !k.this.ar() && super.canUse();
            }
        });
    }

    public boolean ar() {
        return (Boolean)this.entityData.get(ap) || this.ai() != null && this.ai().cp;
    }

    public void addAdditionalSaveData(CompoundTag var1) {
        var1.putDouble("homeX", this.ak.x);
        var1.putDouble("homeY", this.ak.y);
        var1.putDouble("homeZ", this.ak.z);
        var1.putString("girlID", (String)this.entityData.get(as));
        String var2 = this.aC();
        if (!"".equals(var2)) {
            var1.putString("sexmod:customname", var2);
        }

        if (this.ae()) {
            var1.putString("sexmod:customModel", this.aH());
        }

        super.addAdditionalSaveData(var1);
    }

    protected boolean ae() {
        return b(this);
    }

    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        this.ak = new Vec3(var1.getDouble("homeX"), var1.getDouble("homeY"), var1.getDouble("homeZ"));
        String var2 = var1.getString("sexmod:customname");
        if (!"".equals(var2)) {
            this.a(var2);
        }

        String var3 = var1.getString("girlID");
        if (!"".equals(var3)) {
            UUID var4 = UUID.fromString(var3);
            this.entityData.set(as, var4.toString());
            if (this.ae()) {
                this.b(var1.getString("sexmod:customModel"));
            }
        }
    }

    public void e(Vec3 var1) {
        this.setDeltaMovement(var1);
    }

    protected void customServerAiStep() {
        if ((Boolean)this.entityData.get(ap)) {
            this.setYHeadRot(this.e_());
            this.moveTo(this.am().x, this.am().y, this.am().z, this.e_(), 0.0F);
            this.setYRot(this.e_());
        }

        if (this.ak.equals(Vec3.ZERO)) {
            this.ak = new Vec3(this.getX(), this.getY(), this.getZ());
        }

        this.as();
    }

    public void tick() {
        if (!com.trolmastercard.sexmod.d.e.a()) {
            if (!this.level().isClientSide()) {
                this.discard();
            }
        } else {
            super.tick();
            this.at();
            if (!this.level().isClientSide()) {
                this.b();
            }
        }
    }

    private void b() {
        if (this.d != null && --this.e <= 0) {
            this.entityData.set(at, 0);
            com.trolmastercard.sexmod.f.j var1 = this.d;
            this.d = null;
            this.c(var1);
        }

        if (this.al() != null && this.ai().cp && this.level().getPlayerByUUID(this.al()) instanceof ServerPlayer var8) {
            double var10 = Math.toRadians(this.e_().floatValue());
            double var4 = this.getX() - Math.sin(var10) * 0.8;
            double var6 = this.getZ() + Math.cos(var10) * 0.8;
            if (var8.distanceToSqr(var4, this.getY(), var6) > 0.04) {
                var8.connection.teleport(var4, this.getY(), var6, var8.getYRot(), var8.getXRot());
                var8.setDeltaMovement(Vec3.ZERO);
            }
        }

        if (!this.level().isClientSide()) {
            com.trolmastercard.sexmod.f.j var9 = this.ai();
            boolean var11 = var9.name().endsWith("CUM") || var9 == com.trolmastercard.sexmod.f.j.e;
            if (this.al() == null || !var9.cp || !var11) {
                this.f = -1;
            } else if (this.f < 0) {
                this.f = var9.cu > 0 ? var9.cu + 10 : 80;
            } else if (--this.f <= 0) {
                this.f = -1;
                this.aA();
            }
        }
    }

    protected void as() {
    }

    protected void at() {
        com.trolmastercard.sexmod.f.j var1 = this.ai();
        int var2 = this.level().isClientSide() ? 1 : 0;
        if (++var1.cv[var2] >= var1.cu) {
            if (var1.cw != null) {
                if (!this.level().isClientSide()) {
                    this.c(var1.cw);
                }
            }
        }
    }

    protected void au() {
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

    public void a_() {
    }

    public boolean a(Player var1) {
        return false;
    }

    protected static void a(Player var0, k var1, String[] var2, ItemStack[] var3, boolean var4) {
        if (var1.level().isClientSide()) {
            com.trolmastercard.sexmod.b.b.a(var1, var0, var2, var3, var4);
        }
    }

    protected static void a(Player var0, k var1, String[] var2, boolean var3) {
        if (var1.level().isClientSide()) {
            com.trolmastercard.sexmod.b.b.a(var1, var0, var2, null, var3);
        }
    }

    public void i() {
        if (this.level().isClientSide()) {
            this.a("master", "");
            this.a("walk speed", k.a.a.toString());
        } else {
            this.entityData.set(ao, "");
            this.entityData.set(ax, k.a.a.toString());
        }
    }

    protected void a(ServerPlayer var1, boolean var2) {
        var1.setDeltaMovement(0.0, 0.0, 0.0);
        if (var2) {
            Vec3 var3 = this.a(0.35);
            var1.teleportTo(var3.x, var3.y, var3.z);
        }
    }

    public void r(UUID var1) {
        Player var2 = this.level().getPlayerByUUID(var1);
        if (var2 != null) {
            var2.setDeltaMovement(0.0, 0.0, 0.0);
            Vec3 var3 = this.a(0.35);
            var2.teleportTo(var3.x, var3.y, var3.z);
            this.a_(var2.getYHeadRot() + 180.0F);
        }
    }

    protected void a(boolean var1, boolean var2, UUID var3) {
        if (this.level().isClientSide()) {
            com.trolmastercard.sexmod.b.b.a(new com.trolmastercard.sexmod.l.m(this.ah().toString(), var3 == null ? "null" : var3.toString(), var1, var2));
        } else {
            this.getNavigation().stop();
            this.setDeltaMovement(0.0, 0.0, 0.0);
            if (this.al() == null) {
                this.q(var3);
            }

            if (var2) {
                this.d(this.aE());
            }

            this.r(this.al());
            if (var1) {
                if (this instanceof p var4) {
                    var4.d_();
                }
            }
        }
    }

    public static void a(UUID var0, UUID var1, boolean var2, boolean var3) {
        for (k var5 : u(var0)) {
            if (!var5.level().isClientSide()) {
                var5.a(var2, var3, var1);
            }
        }
    }

    public static k s(UUID var0) {
        if (var0 == null) {
            return null;
        }

        for (k var2 : u(var0)) {
            if (var2.level().isClientSide()) {
                return var2;
            }
        }

        return null;
    }

    public static k t(UUID var0) {
        if (var0 == null) {
            return null;
        }

        for (k var2 : u(var0)) {
            if (!var2.level().isClientSide()) {
                return var2;
            }
        }

        return null;
    }

    public static ArrayList<k> u(UUID var0) {
        ArrayList var1 = new ArrayList();

        for (k var3 : ap()) {
            if (var3 != null && var3.ah().equals(var0)) {
                var1.add(var3);
            }
        }

        return var1;
    }

    public BlockPos a(BlockPos var1, int var2) {
        return this.a(var1, var2, Blocks.RED_BED, 22, 3, null);
    }

    public void av() {
    }

    public BlockPos a(BlockPos var1, int var2, Block var3, int var4, int var5, @Nullable HashSet<Biome> var6) {
        int var7 = 1;
        byte var8 = -1;
        BlockPos var9 = var1;
        int var10 = 0;

        while (var7 < var4) {
            for (int var11 = 0; var11 < 2; var11++) {
                var8 *= -1;

                for (int var13 = 0; var13 < var7; var13++) {
                    var9 = var9.offset(0, 0, var8);

                    for (int var12 = -var5; var12 < var5 + 1; var12++) {
                        if (this.level().getBlockState(var9.offset(0, var12, var8)).getBlock() == var3) {
                            var10++;
                            if (var10 >= var2 && (var6 == null || var6.contains(this.level().getBiome(var9.offset(var8, var12, 0)).value()))) {
                                return var9.offset(0, var12, var8);
                            }
                        }
                    }
                }

                for (int var15 = 0; var15 < var7; var15++) {
                    var9 = var9.offset(var8, 0, 0);

                    for (int var14 = -var5; var14 < var5 + 1; var14++) {
                        if (this.level().getBlockState(var9.offset(var8, var14, 0)).getBlock() == var3) {
                            var10++;
                            if (var10 >= var2 && (var6 == null || var6.contains(this.level().getBiome(var9.offset(var8, var14, 0)).value()))) {
                                return var9.offset(var8, var14, 0);
                            }
                        }
                    }
                }

                var7++;
            }
        }

        return null;
    }

    protected List<BlockPos> a(BlockPos var1, Class var2, int var3, int var4, @Nullable HashSet<Biome> var5) {
        int var6 = 1;
        byte var7 = -1;
        BlockPos var8 = var1;
        ArrayList var9 = new ArrayList();

        while (var6 < var3) {
            for (int var10 = 0; var10 < 2; var10++) {
                var7 *= -1;

                for (int var12 = 0; var12 < var6; var12++) {
                    var8 = var8.offset(0, 0, var7);

                    for (int var11 = -var4; var11 < var4 + 1; var11++) {
                        if (var2.isInstance(this.level().getBlockState(var8.offset(0, var11, var7)).getBlock())
                            && (var5 == null || var5.contains(this.level().getBiome(var8.offset(var7, var11, 0)).value()))) {
                            var9.add(var8.offset(0, var11, var7));
                        }
                    }
                }

                for (int var14 = 0; var14 < var6; var14++) {
                    var8 = var8.offset(var7, 0, 0);

                    for (int var13 = -var4; var13 < var4 + 1; var13++) {
                        if (var2.isInstance(this.level().getBlockState(var8.offset(var7, var13, 0)).getBlock())
                            && (var5 == null || var5.contains(this.level().getBiome(var8.offset(var7, var13, 0)).value()))) {
                            var9.add(var8.offset(var7, var13, 0));
                        }
                    }
                }

                var6++;
            }
        }

        return var9;
    }

    public boolean aw() {
        return !((String)this.entityData.get(ao)).equals("");
    }

    @Nullable
    public UUID ax() {
        String var1 = (String)this.entityData.get(ao);
        if ("".equals(var1)) {
            return null;
        }

        try {
            return UUID.fromString(var1);
        } catch (IllegalArgumentException var3) {
            return null;
        }
    }

    @Nullable
    public Player ay() {
        UUID var1 = this.ax();
        return var1 == null ? null : this.level().getPlayerByUUID(var1);
    }

    public void a(String var1, UUID var2) {
    }

    protected abstract PlayState a(AnimationState<k> var1);

    protected boolean a(com.trolmastercard.sexmod.f.j var1, String var2, boolean var3, AnimationState<k> var4) {
        return false;
    }

    protected void a(String var1, boolean var2, AnimationState<k> var3, boolean var4) {
        if (var4 || !this.b(0.0F) || !this.a(this.ai(), var1, this.e(), var3)) {
            LoopType var5 = var2 ? LoopType.LOOP : LoopType.HOLD_ON_LAST_FRAME;
            var3.getController().setAnimation(RawAnimation.begin().then(var1, var5));
            var3.getController().transitionLength(0);
        }
    }

    protected void a(String var1, boolean var2, AnimationState<k> var3) {
        this.a(var1, var2, var3, false);
    }

    protected void a(String var1, int var2, float var3, AnimationState<k> var4, boolean var5) {
        if (var5 || !this.b(0.0F) || !this.a(this.ai(), var1, this.e(), var4)) {
            AnimationController var6 = var4.getController();
            SimpleEntry var7 = this.aE.get(var1);
            if (var7 == null) {
                var7 = new SimpleEntry<>(0, 0);
            }

            int var8 = (Integer)var7.getKey();
            int var9 = (Integer)var7.getValue();
            if (this.b(0.0F)) {
                String var12 = var8 == 0 ? var1 : var1 + var8;
                var6.setAnimation(RawAnimation.begin().then(var12, LoopType.LOOP));
                var4.getController().transitionLength(0);
            } else {
                int var10 = this.a(var8, var9, var2, var3);
                String var11 = var10 == 0 ? var1 : var1 + var10;
                var6.setAnimation(RawAnimation.begin().then(var11, LoopType.LOOP));
                var6.transitionLength(0);
                this.aE.put(var1, new SimpleEntry<>(var10, var10 == 0 ? var9 : var10));
            }
        }
    }

    protected void a(String var1, int var2, float var3, AnimationState<k> var4) {
        this.a(var1, var2, var3, var4, false);
    }

    int a(int var1, int var2, int var3, float var4) {
        if (var1 != 0) {
            return 0;
        }

        RandomSource var5 = this.getRandom();
        if (var5.nextFloat() > var4) {
            return 0;
        }

        int var6;
        do {
            var6 = var5.nextInt(var3);
        } while ((var6 == var2 || var6 == 0) && var3 > 2);

        return var6;
    }

    public void registerControllers(ControllerRegistrar var1) {
        var1.add(this.aD = new AnimationController(this, "eyes", 10, this::a));
        var1.add(this.aC = new AnimationController(this, "movement", 5, this::a));
        var1.add(this.aB = new AnimationController(this, "action", 0, var1x -> {
            if (this.ai() == com.trolmastercard.sexmod.f.j.a) {
                String var2 = this.h();
                if (var2 != null) {
                    this.a(var2, true, var1x);
                    return PlayState.CONTINUE;
                } else {
                    return PlayState.STOP;
                }
            } else {
                return this.a(var1x);
            }
        }));
    }

    protected String h() {
        return null;
    }

    protected void az() {
        if (this.level().isClientSide()) {
            if (this.aB()) {
                this.ah = null;
                com.trolmastercard.sexmod.b.b.a(new com.trolmastercard.sexmod.l.n(this.ah().toString(), true));
            }
        } else {
            if (this.al() != null && this.level().getPlayerByUUID(this.al()) instanceof ServerPlayer var1) {
                com.trolmastercard.sexmod.l.n.a(var1);
            }
        }
    }

    public static k a(@Nonnull UUID var0, Boolean var1) {
        for (k var3 : ap()) {
            if (!var3.isRemoved() && var0.equals(var3.al())) {
                if (var1 == null) {
                    return var3;
                }

                boolean var4 = var3.level().isClientSide();
                if (var4 && !var1) {
                    return var3;
                }

                if (!var4 && var1) {
                    return var3;
                }
            }
        }

        return null;
    }

    @Nullable
    public static k v(@Nonnull UUID var0) {
        boolean var1 = ServerLifecycleHooks.getCurrentServer() == null;

        for (k var3 : ap()) {
            if (!var3.isRemoved()) {
                boolean var4 = var3.level().isClientSide();
                if (var4 == var1 && var0.equals(var3.al())) {
                    return var3;
                }
            }
        }

        return null;
    }

    public static k d(@Nonnull Player var0) {
        return v(var0.getUUID());
    }

    public void h_() {
    }

    public void f_() {
        this.ah = null;
        this.setNoGravity(false);
        this.c((com.trolmastercard.sexmod.f.j)null);
        if (this.level().isClientSide()) {
            this.b_();
        }
    }

    public static k a(ServerPlayer var0) {
        UUID var1 = var0.getUUID();

        for (k var3 : var0.level().getEntitiesOfClass(k.class, var0.getBoundingBox().inflate(8.0))) {
            if (var1.equals(var3.al()) && var3.ai().cp) {
                return var3;
            }
        }

        return null;
    }

    public void a(Player var1, com.trolmastercard.sexmod.f.j var2) {
        if (!this.level().isClientSide()) {
            float var3 = (float)(Mth.atan2(var1.getZ() - this.getZ(), var1.getX() - this.getX()) * (180.0 / Math.PI)) - 90.0F;
            this.a_(var3);
            this.d(this.position());
            this.ai = var3;
            this.ah = null;
            this.setYRot(var3);
            this.setYBodyRot(var3);
            this.setYHeadRot(var3);
            this.getNavigation().stop();
            this.setDeltaMovement(Vec3.ZERO);
            this.setNoGravity(true);
            this.setNoAi(true);
            this.entityData.set(ap, false);
            this.q(var1.getUUID());
            this.g = (Integer)this.entityData.get(at);
            this.d = var2;
            this.e = 50;
            this.c(com.trolmastercard.sexmod.f.j.n);
        }
    }

    public void e(boolean var1) {
        if (!this.level().isClientSide()) {
            com.trolmastercard.sexmod.f.j var2 = this.ai();
            if (var2.cp) {
                com.trolmastercard.sexmod.f.j var3 = var1 ? this.b(var2) : this.a_(var2);
                if (var3 != null && var3 != com.trolmastercard.sexmod.f.j.a) {
                    this.c(var3);
                }
            }
        }
    }

    public void aA() {
        if (!this.level().isClientSide()) {
            this.q((UUID)null);
            this.entityData.set(ap, false);
            this.setNoAi(false);
            this.setNoGravity(false);
            this.noPhysics = false;
            this.ah = null;
            this.d = null;
            this.f = -1;
            this.entityData.set(at, this.g);
            this.c(com.trolmastercard.sexmod.f.j.a);
        }
    }

    protected void b_() {
    }

    @Nullable
    protected abstract com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1);

    protected abstract com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1);

    protected void a(double var1, double var3, double var5, float var7, float var8) {
        if (this.al() == null) {
            System.out.println("couldnt move camera because the player isn't set");
        } else {
            Player var9 = this.level().getPlayerByUUID(this.al());
            if (this.ah == null) {
                this.ah = var9.position();
            }

            Vec3 var10 = this.ah;
            var10 = var10.add(-Math.sin((this.ai + 90.0F) * (Math.PI / 180.0)) * var1, 0.0, Math.cos((this.ai + 90.0F) * (Math.PI / 180.0)) * var1);
            var10 = var10.add(0.0, var3, 0.0);
            var10 = var10.add(-Math.sin(this.ai * (Math.PI / 180.0)) * var5, 0.0, Math.cos(this.ai * (Math.PI / 180.0)) * var5);
            if (!this.level().isClientSide()) {
                var9.moveTo(var10.x, var10.y, var10.z, this.ai + var7, var8);
                var9.teleportTo(var10.x, var10.y, var10.z);
                this.setDeltaMovement(0.0, 0.0, 0.0);
            }
        }
    }

    public boolean aB() {
        return false;
    }

    protected void c_() {
    }

    public void a(String var1) {
        this.entityData.set(az, var1);
    }

    public String aC() {
        return (String)this.entityData.get(az);
    }

    public abstract String a();

    public String af() {
        String var1 = (String)this.entityData.get(az);
        return !"".equals(var1) ? var1 : this.a();
    }

    public void c(String var1) {
        this.a(var1, false);
    }

    protected void a(String var1, boolean var2) {
        if (!this.level().isClientSide()) {
            String var3 = var2 ? var1 : "<" + this.af() + "> " + var1;
            PacketDistributor.sendToPlayersTrackingEntity(this, new com.trolmastercard.sexmod.l.o(var3), new CustomPacketPayload[0]);
        }
    }

    protected void d(String var1) {
        if (this.level().isClientSide()) {
            com.trolmastercard.sexmod.b.b.a(Component.literal("<" + this.af() + "> ").append(Component.translatable(var1)));
        }
    }

    public static boolean b(Entity var0) {
        return var0 == null ? false : var0 instanceof k;
    }

    public k aD() {
        return this;
    }

    public Vec3 aE() {
        return this.a(1.0);
    }

    public Vec3 a(double var1) {
        Player var3 = this.level().getPlayerByUUID(this.al());
        float var4 = var3 != null ? var3.getYRot() : this.getYRot();
        Vec3 var5 = var3 != null ? var3.position() : this.position();
        return var5.add(-Math.sin(var4 * (Math.PI / 180.0)) * var1, 0.0, Math.cos(var4 * (Math.PI / 180.0)) * var1);
    }

    public static void a(ParticleOptions var0, k var1) {
        double var2 = com.trolmastercard.sexmod.d.f.a.nextGaussian() * 0.02;
        double var4 = com.trolmastercard.sexmod.d.f.a.nextGaussian() * 0.02;
        double var6 = com.trolmastercard.sexmod.d.f.a.nextGaussian() * 0.02;
        float var8 = var1.getBbWidth();
        float var9 = var1.getBbHeight();
        var1.level()
            .addParticle(
                var0,
                var1.getX() + com.trolmastercard.sexmod.d.f.a.nextFloat() * var8 * 2.0F - var8,
                var1.getY() + 0.5 + com.trolmastercard.sexmod.d.f.a.nextFloat() * var9,
                var1.getZ() + com.trolmastercard.sexmod.d.f.a.nextFloat() * var8 * 2.0F - var8,
                var2,
                var4,
                var6
            );
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.b;
    }

    public boolean isPushable() {
        return false;
    }

    @Nullable
    protected SoundEvent getAmbientSound() {
        this.a("whopa", false);
        return com.trolmastercard.sexmod.i.e.b("misc.fart");
    }

    public Vec3 e(String var1) {
        Vec3 var2 = this.an.get(var1);
        if (var2 != null) {
            return var2;
        }

        if (!this.aF.contains(var1)) {
            this.aF.add(var1);
        }

        return Vec3.ZERO;
    }

    public void a(List<Integer> var1) {
        if (this instanceof n || this instanceof com.trolmastercard.sexmod.f.c.b) {
            StringBuilder var2 = new StringBuilder();

            for (int var4 : var1) {
                n.b(var2, var4);
            }

            if (this instanceof n) {
                this.entityData.set(n.W, var2.toString());
            } else {
                this.entityData.set(com.trolmastercard.sexmod.f.c.b.n, var2.toString());
            }
        }
    }

    public String aF() {
        if (this instanceof n) {
            return (String)this.entityData.get(n.W);
        } else {
            return this instanceof com.trolmastercard.sexmod.f.c.b ? (String)this.entityData.get(com.trolmastercard.sexmod.f.c.b.n) : "";
        }
    }

    public static String c(List<Integer> var0) {
        StringBuilder var1 = new StringBuilder();

        for (int var3 : var0) {
            var1.append(var3);
            var1.append("-");
        }

        return var1.toString();
    }

    public static List<Integer> f(String var0) {
        ArrayList var1 = new ArrayList();
        String[] var2 = var0.split("-");

        for (String var6 : var2) {
            var1.add(Integer.parseInt(var6));
        }

        return var1;
    }

    public static List<Integer> w(UUID var0) {
        k var1 = s(var0);
        if (var1 == null) {
            var1 = t(var0);
        }

        if (var1 == null) {
            return new ArrayList<>();
        }

        ArrayList var2 = new ArrayList<>(var1.aG());
        if (var1 instanceof n || var1 instanceof com.trolmastercard.sexmod.f.c.b) {
            var2.addAll(f(var1.aF()));
        }

        return var2;
    }

    public ArrayList<Integer> aG() {
        return new ArrayList<>();
    }

    public void g(String var1) {
        if (this instanceof n) {
            this.entityData.set(n.W, var1);
        } else if (this instanceof com.trolmastercard.sexmod.f.c.b) {
            this.entityData.set(com.trolmastercard.sexmod.f.c.b.n, var1);
        }
    }

    public void b(String var1) {
        this.entityData.set(ay, var1);
    }

    public String aH() {
        return (String)this.entityData.get(ay);
    }

    public static String a(HashSet<String> var0) {
        if (var0 == null) {
            return "";
        }

        if (var0.isEmpty()) {
            return "";
        }

        StringBuilder var1 = new StringBuilder();

        for (String var3 : var0) {
            var1.append(var3);
            var1.append("#");
        }

        return var1.toString();
    }

    private boolean b(float var1) {
        return false;
    }

    private boolean e() {
        return false;
    }

    public enum a {
        a,
        b,
        c;
    }
}
