package com.trolmastercard.sexmod.f.b;

import com.trolmastercard.sexmod.f.q;
import com.trolmastercard.sexmod.m.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
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
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class f extends n implements q {
    public static final com.trolmastercard.sexmod.m.g a = com.trolmastercard.sexmod.m.g.c;
    public static final Vec3i b = new Vec3i(11, 6, 11);
    public static final Vec3 c = new Vec3(5.0, 1.0, 9.0);
    public static final Vec3 d = new Vec3(3.0, -1.0, 6.0);
    public static final Vec3 e = new Vec3(1.0, 1.0, 5.0);
    public static final Vec3 f = new Vec3(-6.0, -1.0, 3.0);
    public static final Vec3 g = new Vec3(5.0, 1.0, 1.0);
    public static final Vec3 h = new Vec3(-3.0, -1.0, -6.0);
    public static final Vec3 i = new Vec3(9.0, 1.0, 5.0);
    public static final Vec3 j = new Vec3(0.0, -1.0, -4.0);
    public static final Vec3 k = new Vec3(1.0, -1.0, -3.0);
    public static final Vec3 l = new Vec3(-1.0, -1.0, -3.0);
    public static final Vec3 m = new Vec3(6.0, -1.0, -3.0);
    static final HashSet<Item> n = new HashSet<>(
        Arrays.asList(
            Items.GOLDEN_HOE,
            Items.GOLDEN_HORSE_ARMOR,
            Items.GOLD_INGOT,
            Items.GOLDEN_APPLE,
            Items.GOLDEN_AXE,
            Items.GOLDEN_SHOVEL,
            Items.GOLDEN_PICKAXE,
            Items.GOLDEN_SWORD,
            Items.GOLDEN_CARROT,
            Items.GOLDEN_HELMET,
            Items.GOLDEN_BOOTS,
            Items.GOLDEN_CHESTPLATE,
            Items.GOLDEN_LEGGINGS,
            Items.GOLD_INGOT,
            Items.GOLD_NUGGET,
            Blocks.GOLD_BLOCK.asItem(),
            Blocks.GOLD_ORE.asItem()
        )
    );
    public static final EntityDataAccessor<String> o = SynchedEntityData.defineId(f.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> p = SynchedEntityData.defineId(f.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<ItemStack> q = SynchedEntityData.defineId(f.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<Boolean> r = SynchedEntityData.defineId(f.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Boolean> s = SynchedEntityData.defineId(f.class, EntityDataSerializers.BOOLEAN);
    public boolean t = false;
    public float u = 0.0F;
    public long v = -1L;
    public Vec3 w = Vec3.ZERO;
    List<UUID> x = new ArrayList<>();
    int y = 31520;
    int z = -1;
    public int A = -1;
    boolean B = false;
    BlockPos C = null;
    int D = 0;
    int E = 0;
    int F = 0;
    int G = -1;
    int H = 0;
    long I = 0L;
    List<f> J = new ArrayList<>();
    int K = -1;
    int L = -1;
    com.trolmastercard.sexmod.f.j M = null;
    public float N = 1.0F;
    int O = -1;
    boolean P = true;
    boolean Q = true;
    boolean R = false;
    String S = "";
    boolean T = false;

    public f(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    public void a(@Nonnull String var1, int var2) {
        this.entityData.set(p, var1);
        this.entityData.set(W, this.a(new StringBuilder(), var2));
    }

    public void a(boolean var1) {
        this.entityData.set(r, var1);
    }

    @Override
    public void a_() {
        super.a_();
        this.a((UUID)null);
        this.noPhysics = false;
        this.setNoGravity(false);
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(o, "");
        var1.define(p, "");
        var1.define(q, ItemStack.EMPTY);
        var1.define(r, false);
        var1.define(s, false);
    }

    @Nullable
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor var1, DifficultyInstance var2, MobSpawnType var3, @Nullable SpawnGroupData var4) {
        com.trolmastercard.sexmod.m.h var5 = com.trolmastercard.sexmod.m.h.values()[this.getRandom().nextInt(com.trolmastercard.sexmod.m.h.values().length)];
        Vec3i var6 = var5.a();
        this.entityData.set(V, new BlockPos(var6.getX(), var6.getY(), var6.getZ()));
        this.entityData.set(U, a.name());
        return super.finalizeSpawn(var1, var2, var3, var4);
    }

    @Override
    protected void e() {
    }

    public void remove(RemovalReason var1) {
        super.remove(var1);
        this.a((UUID)null);
        if (!this.level().isClientSide()) {
            ItemStack var2 = (ItemStack)this.entityData.get(q);
            if (!var2.isEmpty()) {
                if (this.level() instanceof ServerLevel var3) {
                    this.spawnAtLocation(var2);
                }
            }
        }
    }

    @Override
    public void a(String var1, UUID var2) {
        if ("take ur stuff back".equals(var1)) {
            this.c(com.trolmastercard.sexmod.f.j.aU);
        }

        if ("use her".equals(var1)) {
            this.b(var2);
        }
    }

    public void b(UUID var1) {
        this.K = 0;
        this.q(var1);
    }

    @Override
    public String a() {
        return "Goblin";
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(0.75F);
    }

    @Override
    public void a(@Nullable UUID var1) {
        this.entityData.set(o, var1 == null ? "" : var1.toString());
    }

    @Nullable
    @Override
    public UUID g_() {
        String var1 = (String)this.entityData.get(o);
        if ("".equals(var1)) {
            return null;
        }

        try {
            return UUID.fromString(var1);
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Override
    public int b() {
        return this.z;
    }

    @Override
    public void b(int var1) {
        this.z = var1;
    }

    @Override
    public void a(int var1) {
        this.A = var1;
    }

    public int j() {
        return this.A;
    }

    public void c(int var1) {
        this.F = var1;
    }

    public int k() {
        return this.F;
    }

    @Override
    public com.trolmastercard.sexmod.f.j c() {
        return this.M;
    }

    @Override
    public void a(com.trolmastercard.sexmod.f.j var1) {
        this.M = var1;
    }

    @Override
    protected String a(StringBuilder var1) {
        c(var1, 3);
        c(var1, 2);
        c(var1, 2);
        c(var1, 8);
        c(var1, 8);
        c(var1, 5);
        c(var1, com.trolmastercard.sexmod.m.f.values().length - 1);
        c(var1, com.trolmastercard.sexmod.m.g.values().length - 1);
        c(var1, com.trolmastercard.sexmod.m.h.values().length - 1);
        b(var1, 0);
        return var1.toString();
    }

    protected String a(StringBuilder var1, int var2) {
        c(var1, 3);
        c(var1, 2);
        c(var1, 2);
        c(var1, 7);
        c(var1, 7);
        c(var1, 5);
        c(var1, com.trolmastercard.sexmod.m.f.values().length - 1);
        b(var1, var2);
        c(var1, com.trolmastercard.sexmod.m.h.values().length - 1);
        b(var1, 0);
        return var1.toString();
    }

    @Override
    public void a(List<Integer> var1) {
        StringBuilder var2 = new StringBuilder();

        for (int var4 : var1) {
            b(var2, var4);
        }

        String[] var5 = com.trolmastercard.sexmod.f.b.n.f(this);
        if (var5.length > 9) {
            b(var2, Integer.parseInt(var5[9]));
        }

        this.entityData.set(W, var2.toString());
    }

    int l() {
        String[] var1 = com.trolmastercard.sexmod.f.b.n.f(this);
        return var1.length > 7 ? Integer.parseInt(var1[7]) : 0;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag var1) {
        var1.putString("bodyColor", (String)this.entityData.get(U));
        var1.putInt("eyeColorX", ((BlockPos)this.entityData.get(V)).getX());
        var1.putInt("eyeColorY", ((BlockPos)this.entityData.get(V)).getY());
        var1.putInt("eyeColorZ", ((BlockPos)this.entityData.get(V)).getZ());
        var1.putString("model", (String)this.entityData.get(W));
        var1.putString("girlID", (String)this.entityData.get(com.trolmastercard.sexmod.f.b.k.as));
        var1.putString("queen", (String)this.entityData.get(p));
        var1.putBoolean("isQueen", this.t);
        var1.putBoolean("isTamed", (Boolean)this.entityData.get(r));
        var1.putInt("robTicks", this.y);
        super.addAdditionalSaveData(var1);
        if (this.t) {
            var1.putBoolean("preggo", (Boolean)this.entityData.get(s));
            var1.putFloat("throneRot", this.u);
            var1.putDouble("thronePosX", this.w.x);
            var1.putDouble("thronePosY", this.w.y);
            var1.putDouble("thronePosZ", this.w.z);
            var1.putLong("impregnationTick", this.v);

            for (int var2 = 0; var2 < this.x.size(); var2++) {
                var1.putString("guard" + var2, this.x.get(var2).toString());
            }
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        this.t = var1.getBoolean("isQueen");
        this.entityData.set(W, var1.getString("model"));
        this.entityData.set(U, var1.getString("bodyColor"));
        String[] var2 = com.trolmastercard.sexmod.f.b.n.f(this);
        if (var2.length > 4 && (Integer.parseInt(var2[3]) > 7 || Integer.parseInt(var2[4]) > 7)) {
            this.entityData.set(W, this.a(new StringBuilder(), this.l()));
        }

        this.entityData.set(V, new BlockPos(var1.getInt("eyeColorX"), var1.getInt("eyeColorY"), var1.getInt("eyeColorZ")));
        this.entityData.set(com.trolmastercard.sexmod.f.b.k.as, var1.getString("girlID"));
        this.entityData.set(p, var1.getString("queen"));
        this.entityData.set(r, var1.getBoolean("isTamed"));
        this.y = var1.getInt("robTicks");
        if (this.t) {
            this.u = var1.getFloat("throneRot");
            this.w = new Vec3(var1.getDouble("thronePosX"), var1.getDouble("thronePosY"), var1.getDouble("thronePosZ"));

            for (int var3 = 0; !"".equals(var1.getString("guard" + var3)); var3++) {
                this.x.add(UUID.fromString(var1.getString("guard" + var3)));
            }

            this.entityData.set(s, var1.getBoolean("preggo"));
            this.v = var1.getLong("impregnationTick");
        }
    }

    public InteractionResult mobInteract(Player var1, InteractionHand var2) {
        if (this.level().isClientSide()) {
            return InteractionResult.SUCCESS;
        }

        if (this.t) {
            return InteractionResult.SUCCESS;
        }

        if (this.ai() == com.trolmastercard.sexmod.f.j.aQ) {
            if (this.distanceTo(var1) > 3.5) {
                var1.displayClientMessage(Component.literal("get a bit closer..."), false);
                return InteractionResult.SUCCESS;
            } else {
                this.d(var1.position());
                this.a_(var1.getYRot());
                this.c(com.trolmastercard.sexmod.f.j.aR);
                this.entityData.set(com.trolmastercard.sexmod.f.b.k.av, "bj");
                this.a(var1.getUUID());
                this.q(var1.getUUID());
                this.getNavigation().stop();
                this.setDeltaMovement(Vec3.ZERO);
                return InteractionResult.SUCCESS;
            }
        } else if (c(var1.getUUID())) {
            var1.displayClientMessage(Component.literal("you are already carrying a Goblin"), false);
            return InteractionResult.SUCCESS;
        } else {
            this.a(var1.getUUID());
            this.c(com.trolmastercard.sexmod.f.j.aP);
            this.z = 45;
            this.d(false);
            this.entityData.set(r, true);
            this.getNavigation().stop();
            return InteractionResult.SUCCESS;
        }
    }

    public static boolean c(UUID var0) {
        if (var0 == null) {
            return false;
        }

        for (k var2 : com.trolmastercard.sexmod.f.b.k.ap()) {
            if (var2 instanceof q && !var2.level().isClientSide() && !var2.isRemoved() && var0.equals(((q)var2).g_())) {
                return true;
            }
        }

        return false;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.removeAllGoals(var0 -> var0 instanceof TemptGoal);
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        this.x();
        e(this);
        this.B();
        this.A();
        this.z();
        this.v();
        this.u();
        this.t();
        this.s();
        this.r();
        this.q();
        this.p();
        this.o();
        this.m();
    }

    public boolean isPickable() {
        com.trolmastercard.sexmod.f.j var1 = this.ai();
        if (var1 == com.trolmastercard.sexmod.f.j.aV) {
            return false;
        } else if (var1 == com.trolmastercard.sexmod.f.j.aQ) {
            return super.isPickable();
        } else if (var1 == com.trolmastercard.sexmod.f.j.bk) {
            return super.isPickable();
        } else if (this.g_() != null) {
            return false;
        } else {
            return var1 != com.trolmastercard.sexmod.f.j.a ? false : super.isPickable();
        }
    }

    void b(Player var1) {
        com.trolmastercard.sexmod.f.c.a var2 = com.trolmastercard.sexmod.f.c.a.c(var1.getUUID());
        float var3 = var2 == null ? var1.getEyeHeight() : var2.getEyeHeight();
        Vec3 var4 = new Vec3(var1.getX(), var1.getY() + var3, var1.getZ());
        Vec3 var5 = new Vec3(this.getX(), this.getY() + this.getEyeHeight(), this.getZ());
        double var6 = var5.distanceTo(var4);
        double var8 = var4.y - var5.y;
        this.setXRot((float)(-(Math.sin(var8 / var6) * (180.0 / Math.PI))));
    }

    void m() {
        if ((Boolean)this.entityData.get(r)) {
            if (this.al() == null) {
                if (this.ai() == com.trolmastercard.sexmod.f.j.a) {
                    Player var1 = this.level().getNearestPlayer(this, 15.0);
                    if (var1 != null && var1.distanceTo(this) < 2.0F) {
                        this.b(var1);
                        this.getNavigation().stop();
                    } else {
                        if (this.C == null || Math.sqrt(this.distanceToSqr(this.C.getX(), this.C.getY(), this.C.getZ())) > this.n() || this.D > 100) {
                            int var2 = this.getRandom().nextBoolean() ? 1 : -1;
                            int var3 = var2 * this.getRandom().nextInt(5);
                            int var4 = this.getRandom().nextBoolean() ? 1 : -1;
                            int var5 = var4 * this.getRandom().nextInt(5);
                            int var6 = com.trolmastercard.sexmod.m.p.a(this.level(), this.blockPosition().getX() + var3, this.blockPosition().getZ() + var5);
                            this.C = new BlockPos(this.blockPosition().getX() + var3, var6, this.blockPosition().getZ() + var5);
                            this.D = 0;
                        }

                        if (this.C.distSqr(this.blockPosition()) > 4.0) {
                            this.getNavigation().moveTo(this.C.getX(), this.C.getY(), this.C.getZ(), 0.3);
                            this.au();
                        } else {
                            this.D++;
                        }
                    }
                }
            }
        }
    }

    double n() {
        return Math.sqrt(800.0);
    }

    void o() {
        if (this.ai() == com.trolmastercard.sexmod.f.j.bm) {
            if (++this.E >= 37) {
                this.E = 0;
                this.c(com.trolmastercard.sexmod.f.j.a);
            }
        }
    }

    void p() {
        if (this.ai() == com.trolmastercard.sexmod.f.j.aV) {
            if (this.onGround()) {
                int var1 = this.k() + 1;
                this.c(var1);
                if (var1 >= 30) {
                    this.c(0);
                    this.c(com.trolmastercard.sexmod.f.j.bm);
                }
            }
        }
    }

    void q() {
        if (this.t) {
            if ((Boolean)this.entityData.get(s)) {
                if (this.v + 8400L < this.level().getGameTime()) {
                    this.entityData.set(s, false);
                }
            }
        }
    }

    void r() {
        if (this.t) {
            if (!this.J.isEmpty()) {
                boolean var1 = false;

                for (f var3 : this.J) {
                    if ((Boolean)var3.entityData.get(r)) {
                        var1 = true;
                    }
                }

                if (var1) {
                    this.c("Farewell my knight. You are welcome once I am breedable again.");

                    for (f var5 : this.J) {
                        if (!(Boolean)var5.entityData.get(r)) {
                            var5.c(com.trolmastercard.sexmod.f.j.bl);
                        }
                    }

                    this.J.clear();
                    this.q((UUID)null);
                }
            }
        }
    }

    void s() {
        if (this.t) {
            if (this.O != -1) {
                if (++this.O >= 100) {
                    this.O = -1;
                    UUID var1 = this.al();
                    if (var1 == null) {
                        this.f_();
                    } else {
                        Player var2 = this.level().getPlayerByUUID(var1);
                        if (var2 == null) {
                            this.f_();
                        } else {
                            this.q((UUID)null);

                            for (f var4 : this.J) {
                                var4.q((UUID)null);
                            }

                            List var10 = this.w();
                            if (var10.size() >= 2) {
                                float var11 = this.u + 180.0F;
                                Vec3 var5 = this.w.add(a(k, var11));
                                Vec3 var6 = this.w.add(a(l, var11));
                                Vec3 var7 = this.w.add(a(j, var11));
                                f var8 = (f)var10.get(0);
                                f var9 = (f)var10.get(1);
                                var8.d(var5);
                                var9.d(var6);
                                var8.a_(0.0F);
                                var9.a_(0.0F);
                                var8.d(true);
                                var9.d(true);
                                var8.c(com.trolmastercard.sexmod.f.j.bk);
                                var9.c(com.trolmastercard.sexmod.f.j.bk);
                                var8.setNoGravity(false);
                                var9.setNoGravity(false);
                                var2.setNoGravity(false);
                                var8.noPhysics = false;
                                var9.noPhysics = false;
                                var2.noPhysics = false;
                                var2.setYRot(var11);
                                var2.setXRot(30.0F);
                                var2.moveTo(var7.x, var7.y, var7.z, var11, 30.0F);
                                this.c(
                                    "Thanks to you, my clan is soon going to get a few new members! In return I will bear of one of my guards to serve as your personal Onahole. Choose wisely~"
                                );
                            }
                        }
                    }
                }
            }
        }
    }

    void t() {
        if (this.t) {
            if (this.G != -1) {
                if (++this.G >= 205) {
                    this.G = -1;
                    UUID var1 = this.al();
                    if (var1 != null) {
                        Player var2 = this.level().getPlayerByUUID(var1);
                        if (var2 != null) {
                            Vec3 var3 = a(new Vec3(0.0, 0.15625 - var2.getEyeHeight(), -0.8859375), this.u - 180.0F);
                            var3 = var3.add(this.am());
                            var2.moveTo(var3.x, var3.y, var3.z, var2.getYRot(), var2.getXRot());
                        }
                    }
                }
            }
        }
    }

    public static Vec3 a(Vec3 var0, float var1) {
        return a(var0, 0.0F, var1);
    }

    public static Vec3 a(Vec3 var0, float var1, float var2) {
        Vec3 var3 = new Vec3(
            var0.x,
            var0.y * Math.cos(var1 * (Math.PI / 180.0)) - var0.z * Math.sin(var1 * (Math.PI / 180.0)),
            var0.y * Math.sin(var1 * (Math.PI / 180.0)) + var0.z * Math.cos(var1 * (Math.PI / 180.0))
        );
        return new Vec3(
            -Math.sin((var2 + 90.0F) * (Math.PI / 180.0)) * var3.x - Math.sin(var2 * (Math.PI / 180.0)) * var3.z,
            var3.y,
            Math.cos((var2 + 90.0F) * (Math.PI / 180.0)) * var3.x + Math.cos(var2 * (Math.PI / 180.0)) * var3.z
        );
    }

    void u() {
        if (this.t) {
            if (this.ai() == com.trolmastercard.sexmod.f.j.aW) {
                if (++this.H >= 26) {
                    this.H = 0;

                    Vec3 var1 = switch ((int)this.u) {
                        case -90 -> this.w.add(m);
                        case 90 -> this.w.add(f);
                        case 180 -> this.w.add(h);
                        default -> this.w.add(d);
                    };
                    UUID var2 = this.al();
                    if (var2 != null) {
                        Player var3 = this.level().getPlayerByUUID(var2);
                        if (var3 != null) {
                            this.d(var1);
                            this.a_(this.u);
                            this.c(com.trolmastercard.sexmod.f.j.aZ);
                            this.noPhysics = true;
                            this.setNoGravity(true);
                            Vec3 var4 = a(new Vec3(0.0, 0.44375 - var3.getEyeHeight(), -0.7875), this.u - 180.0F);
                            var3.noPhysics = true;
                            var3.setNoGravity(true);
                            var3.moveTo(var4.x + var1.x, var4.y + var1.y, var4.z + var1.z, var3.getYRot(), var3.getXRot());
                            List var5 = this.w();
                            if (var5.size() >= 1) {
                                f var6 = (f)var5.get(0);
                                var6.d(var1);
                                var6.a_(this.u);
                                var6.c(com.trolmastercard.sexmod.f.j.ba);
                                var6.noPhysics = true;
                                var6.setNoGravity(true);
                            }

                            if (var5.size() >= 2) {
                                f var7 = (f)var5.get(1);
                                var7.d(var1);
                                var7.a_(this.u);
                                var7.c(com.trolmastercard.sexmod.f.j.bb);
                                var7.noPhysics = true;
                                var7.setNoGravity(true);
                            }

                            this.G = 0;
                        }
                    }
                }
            }
        }
    }

    AABB a(Vec3 var1, Vec3 var2) {
        return new AABB(var1.x, var1.y, var1.z, var2.x, var2.y, var2.z);
    }

    void v() {
        if (this.t) {
            if (this.al() == null) {
                Vec3 var1 = null;
                switch ((int)this.u) {
                    case -90:
                        var1 = e;
                        break;
                    case 0:
                        var1 = g;
                        break;
                    case 90:
                        var1 = i;
                        break;
                    case 180:
                        var1 = c;
                }

                if (var1 != null) {
                    Vec3 var2 = this.w.subtract(0.5, 0.0, 0.5).subtract(var1);
                    AABB var3 = this.a(var2, var2.add(b.getX(), b.getY(), b.getZ()));
                    List var4 = this.level().getEntitiesOfClass(Player.class, var3);
                    if (!var4.isEmpty()) {
                        Player var5 = (Player)var4.get(0);
                        if (var5.onGround()) {
                            if ((Boolean)this.entityData.get(s)) {
                                if (this.I + 1200L < this.level().getGameTime()) {
                                    var5.displayClientMessage(Component.literal("The Queen is still pregnant - so no breeding for you uwu"), false);
                                    this.I = this.level().getGameTime();
                                }
                            } else {
                                UUID var6 = var5.getUUID();
                                Vec3 var7 = var5.position();
                                float var8 = var5.getYRot() + 180.0F;
                                this.q(var6);
                                this.c(com.trolmastercard.sexmod.f.j.aW);
                                this.d(var7);
                                this.a_(var8);
                                this.d(true);
                                List var9 = this.w();
                                if (var9.size() > 0) {
                                    f var10 = (f)var9.get(0);
                                    var10.q(var6);
                                    var10.c(com.trolmastercard.sexmod.f.j.aX);
                                    var10.d(var7);
                                    var10.a_(var8);
                                    var10.d(true);
                                    if (var9.size() > 1) {
                                        f var11 = (f)var9.get(1);
                                        var11.q(var6);
                                        var11.c(com.trolmastercard.sexmod.f.j.aY);
                                        var11.d(var7);
                                        var11.a_(var8);
                                        var11.d(true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    List<f> w() {
        return new ArrayList<>();
    }

    void x() {
        if (!this.B) {
            this.noPhysics = false;
            this.setNoGravity(false);
            if (!this.t && !(Boolean)this.entityData.get(r) && ((String)this.entityData.get(p)).equals("") && this.ai() == com.trolmastercard.sexmod.f.j.a) {
                this.discard();
            }

            this.B = true;
        }
    }

    void y() {
        int var1 = this.j();
        if (var1 != -1) {
            this.a(++var1);
            if (var1 == 15) {
                Vec3 var2 = a(this);
                float var3 = c(this);
                float var4 = b(this);
                this.moveTo(var2.x, var2.y, var2.z, this.getYRot(), this.getXRot());
                Vec3 var5 = a(new Vec3(0.0, 0.0, 1.5), var3, var4);
                this.setDeltaMovement(var5.x, var5.y, var5.z);
                if (!this.level().isClientSide()) {
                    this.a_(var4);
                }
            }

            this.noPhysics = false;
            this.setNoGravity(false);
            if (var1 == 39) {
                this.a(-1);
                this.c(com.trolmastercard.sexmod.f.j.aV);
                this.q((UUID)null);
                this.a((UUID)null);
            }
        }
    }

    public static Vec3 a(k var0) {
        q var1 = (q)var0;
        UUID var2 = var1.g_();
        if (var2 == null) {
            return var0.position();
        }

        Player var3 = var0.level().getPlayerByUUID(var2);
        return var3 == null ? var0.position() : var3.position().add(0.0, var3.getEyeHeight(), 0.0).add(a(new Vec3(0.4F, 0.0, 0.0), c(var0), b(var0)));
    }

    public static float b(k var0) {
        q var1 = (q)var0;
        UUID var2 = var1.g_();
        if (var2 == null) {
            return 0.0F;
        }

        Player var3 = var0.level().getPlayerByUUID(var2);
        return var3 == null ? 0.0F : var3.getYHeadRot();
    }

    public static float c(k var0) {
        q var1 = (q)var0;
        UUID var2 = var1.g_();
        if (var2 == null) {
            return 0.0F;
        }

        Player var3 = var0.level().getPlayerByUUID(var2);
        return var3 == null ? 0.0F : var3.getXRot();
    }

    void z() {
        if (this.onGround()) {
            if (this.ai() == com.trolmastercard.sexmod.f.j.aQ) {
                Player var1 = this.level().getNearestPlayer(this, 100.0);
                if (var1 != null) {
                    double var2 = 20.0;

                    while (!(var2 <= 0.0)) {
                        Vec3 var5 = this.position().subtract(var1.position());
                        Vec3 var6 = new Vec3(Math.abs(var5.x), Math.abs(var5.y), Math.abs(var5.z));
                        double var7 = var6.x / (var6.x + var6.z);
                        double var9 = var6.z / (var6.x + var6.z);
                        int var11 = var5.x > 0.0 ? 1 : -1;
                        Vec3 var12 = new Vec3(var11 * var7 * var2, 0.0, (var5.z > 0.0 ? 1 : -1) * var9 * var2);
                        Vec3 var13 = this.position().add(var12);
                        this.getNavigation().stop();
                        boolean var4 = this.getNavigation().moveTo(var13.x, var13.y, var13.z, 0.825F);
                        var2--;
                        if (var4) {
                            return;
                        }
                    }
                }
            }
        }
    }

    protected float getJumpPower() {
        return super.getJumpPower();
    }

    void A() {
        if (this.t) {
            if (!(Boolean)this.entityData.get(r)) {
                if (!(Boolean)this.entityData.get(s)) {
                    if (this.ai() == com.trolmastercard.sexmod.f.j.D) {
                        if (++this.y >= 32000) {
                            Player var1 = this.level().getNearestPlayer(this, 3000.0);
                            if (var1 != null) {
                                if (var1.onGround()) {
                                    Integer var2 = this.c(var1);
                                    if (var2 != null) {
                                        Vec3 var3 = var1.position();
                                        Vec3 var4 = var3.subtract(this.position());
                                        double var5 = Math.sqrt(var4.x * var4.x + var4.z * var4.z);
                                        if (!(var5 > 100.0)) {
                                            if (this.level() instanceof ServerLevel var7) {
                                                ItemStack var11 = var1.getInventory().getItem(var2).copy();
                                                f var9 = (f)((EntityType)com.trolmastercard.sexmod.i.b.v.get()).create(var7);
                                                if (var9 != null) {
                                                    var9.a(this.ah().toString(), this.l());
                                                    Vec3 var10 = a(new Vec3(0.0, 0.0, -0.2F), var1.getYHeadRot());
                                                    var9.moveTo(var1.getX() + var10.x, var1.getY(), var1.getZ() + var10.z, 0.0F, 0.0F);
                                                    var9.c(com.trolmastercard.sexmod.f.j.aQ);
                                                    var7.addFreshEntity(var9);
                                                    var9.entityData.set(q, var11);
                                                    var1.displayClientMessage(
                                                        Component.literal(String.format("<%s> I got your %s hehe~", var9.a(), var11.getHoverName().getString())),
                                                        false
                                                    );
                                                    var1.getInventory().removeItem(var2, var11.getCount());
                                                    this.y = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Nullable
    Integer c(Player var1) {
        ArrayList var2 = new ArrayList();

        for (int var3 = 0; var3 < var1.getInventory().getContainerSize(); var3++) {
            ItemStack var4 = var1.getInventory().getItem(var3);
            if (!var4.isEmpty() && n.contains(var4.getItem())) {
                var2.add(var3);
            }
        }

        return var2.isEmpty() ? null : (Integer)var2.get(this.getRandom().nextInt(var2.size()));
    }

    void B() {
        if (this.t) {
            if (this.al() == null) {
                this.d(this.w);
                this.a_(this.u);
                this.d(true);
                this.setNoGravity(true);
                this.c(com.trolmastercard.sexmod.f.j.D);
            }
        }
    }

    @Override
    public void tick() {
        d(this);
        this.y();
        super.tick();
        this.K();
        this.D();
        this.C();
        if (this.level().isClientSide()) {
            this.E();
            this.F();
        }

        if (this.g_() != null) {
            this.noPhysics = true;
        }
    }

    public static void d(k var0) {
        com.trolmastercard.sexmod.f.j var1 = var0.ai();
        q var2 = (q)var0;
        if (var2.c() != com.trolmastercard.sexmod.f.j.aU && var1 == com.trolmastercard.sexmod.f.j.aU) {
            var2.a(0);
        }

        var2.a(var1);
    }

    void C() {
        if (this.ai() == com.trolmastercard.sexmod.f.j.bl) {
            this.N -= 0.05F;
            if (!(this.N > 0.0F)) {
                this.discard();
            }
        }
    }

    void D() {
        if (!(Boolean)this.entityData.get(r)) {
            if (this.ai() == com.trolmastercard.sexmod.f.j.aV) {
                if (this.onGround() || this.isInWater()) {
                    this.N -= 0.05F;
                    if (!(this.N > 0.0F)) {
                        if (!this.level().isClientSide()) {
                            this.c(com.trolmastercard.sexmod.f.j.a);
                            this.q((UUID)null);
                            this.a((UUID)null);
                            this.discard();
                        }
                    }
                }
            }
        }
    }

    void E() {
        if (this.K != -1) {
            if (++this.K == 15) {
                this.K = -1;
                this.c(com.trolmastercard.sexmod.f.j.G);
            }
        }
    }

    void F() {
        if (this.L != -1) {
            if (++this.L == 15) {
                this.L = -1;
                this.c(com.trolmastercard.sexmod.f.j.bn);
            }
        }
    }

    @Override
    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.L || var1 != com.trolmastercard.sexmod.f.j.I && var1 != com.trolmastercard.sexmod.f.j.J) {
            if (var2 != com.trolmastercard.sexmod.f.j.bq || var1 != com.trolmastercard.sexmod.f.j.bo && var1 != com.trolmastercard.sexmod.f.j.bp) {
                if (var2 != com.trolmastercard.sexmod.f.j.bh || var1 != com.trolmastercard.sexmod.f.j.bc && var1 != com.trolmastercard.sexmod.f.j.bf) {
                    if (var1 == com.trolmastercard.sexmod.f.j.aU && !this.level().isClientSide()) {
                        this.q(this.g_());
                        this.J();
                    }

                    if (var1 == com.trolmastercard.sexmod.f.j.G && !this.level().isClientSide()) {
                        this.I();
                    }

                    if (var1 == com.trolmastercard.sexmod.f.j.bn && !this.level().isClientSide()) {
                        this.H();
                    }

                    if (this.ai() == com.trolmastercard.sexmod.f.j.L && var1 == com.trolmastercard.sexmod.f.j.a && !this.level().isClientSide()) {
                        this.G();
                    }

                    if (var1 == com.trolmastercard.sexmod.f.j.bh) {
                        this.entityData.set(s, true);
                        this.v = this.level().getGameTime();
                        this.I = this.level().getGameTime();
                        this.O = 0;
                    }

                    if (var1 == com.trolmastercard.sexmod.f.j.bq) {
                        this.entityData.set(s, true);
                    }

                    if (var2 == com.trolmastercard.sexmod.f.j.bq && var1 != com.trolmastercard.sexmod.f.j.bq) {
                        this.entityData.set(s, false);
                    }

                    super.c(var1);
                }
            }
        }
    }

    void G() {
        if ((this.al() == null ? null : this.level().getPlayerByUUID(this.al())) instanceof ServerPlayer var2) {
            com.trolmastercard.sexmod.l.n.a(var2);
        }

        this.q((UUID)null);
        this.d(false);
        this.noPhysics = false;
        this.setNoGravity(false);
        this.entityData.set(q, ItemStack.EMPTY);
        if (!(Boolean)this.entityData.get(r)) {
            this.moveTo(this.ak.x, this.ak.y, this.ak.z, this.getYRot(), this.getXRot());
            this.discard();
        }
    }

    void H() {
        Player var1 = this.al() == null ? null : this.level().getPlayerByUUID(this.al());
        if (var1 != null) {
            this.a((UUID)null);
            this.d(var1.position());
            this.a_(var1.getYRot());
            this.d(true);
            this.noPhysics = true;
            this.setNoGravity(true);
            var1.setNoGravity(true);
            var1.noPhysics = true;
            this.q(var1.getUUID());
        }
    }

    void I() {
        Player var1 = this.al() == null ? null : this.level().getPlayerByUUID(this.al());
        if (var1 != null) {
            this.a((UUID)null);
            this.d(var1.position());
            this.a_(var1.getYRot() + 180.0F);
            this.d(true);
            this.noPhysics = true;
            this.setNoGravity(true);
            var1.setNoGravity(true);
            var1.noPhysics = true;
            this.q(var1.getUUID());
            var1.moveTo(var1.getX(), var1.getY() - 0.5, var1.getZ(), var1.getYRot(), 70.0F);
        }
    }

    void J() {
        ItemStack var1 = (ItemStack)this.entityData.get(q);
        if (!var1.isEmpty()) {
            Player var2 = this.al() == null ? null : this.level().getPlayerByUUID(this.al());
            if (var2 != null) {
                var2.getInventory().add(var1.copy());
                this.entityData.set(q, ItemStack.EMPTY);
            }
        }
    }

    public static void e(k var0) {
        if (var0.ai() == com.trolmastercard.sexmod.f.j.aP) {
            q var1 = (q)var0;
            UUID var2 = var1.g_();
            if (var2 == null) {
                var1.b(-1);
                var0.c(com.trolmastercard.sexmod.f.j.a);
                var1.a((UUID)null);
            } else {
                Player var3 = var0.level().getPlayerByUUID(var2);
                if (var3 == null) {
                    var1.b(-1);
                    var0.c(com.trolmastercard.sexmod.f.j.a);
                    var1.a((UUID)null);
                } else {
                    var0.moveTo(var3.getX(), var3.getY(), var3.getZ(), var0.getYRot(), var0.getXRot());
                    if (var0.position().distanceTo(var3.position()) > 10.0) {
                        var1.b(-1);
                        var0.c(com.trolmastercard.sexmod.f.j.a);
                        var1.a((UUID)null);
                    } else {
                        int var4 = var1.b() - 1;
                        var1.b(var4);
                        if (var4 == 0) {
                            var0.c(com.trolmastercard.sexmod.f.j.aO);
                            var0.noPhysics = true;
                        }
                    }
                }
            }
        }
    }

    void K() {
        if (this.ai() == com.trolmastercard.sexmod.f.j.aO) {
            UUID var1 = this.g_();
            if (var1 != null) {
                Player var2 = this.level().getPlayerByUUID(var1);
                if (var2 != null) {
                    this.moveTo(var2.getX(), var2.getY(), var2.getZ(), this.getYRot(), this.getXRot());
                    this.noPhysics = true;
                    this.setNoGravity(true);
                }
            }
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.H || var1 == com.trolmastercard.sexmod.f.j.I) {
            return com.trolmastercard.sexmod.f.j.J;
        } else if (var1 == com.trolmastercard.sexmod.f.j.bc) {
            return com.trolmastercard.sexmod.f.j.bf;
        } else if (var1 == com.trolmastercard.sexmod.f.j.be) {
            return com.trolmastercard.sexmod.f.j.bg;
        } else {
            return var1 == com.trolmastercard.sexmod.f.j.bo ? com.trolmastercard.sexmod.f.j.bp : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.I || var1 == com.trolmastercard.sexmod.f.j.J || var1 == com.trolmastercard.sexmod.f.j.K) {
            return com.trolmastercard.sexmod.f.j.L;
        }

        if (var1 == com.trolmastercard.sexmod.f.j.bd) {
            return com.trolmastercard.sexmod.f.j.bi;
        }

        if (var1 == com.trolmastercard.sexmod.f.j.be || var1 == com.trolmastercard.sexmod.f.j.bg) {
            return com.trolmastercard.sexmod.f.j.bj;
        }

        if (var1 == com.trolmastercard.sexmod.f.j.bo || var1 == com.trolmastercard.sexmod.f.j.bp) {
            return com.trolmastercard.sexmod.f.j.bq;
        }

        if (var1 != com.trolmastercard.sexmod.f.j.bc && var1 != com.trolmastercard.sexmod.f.j.bf) {
            return null;
        }

        for (f var3 : this.J) {
            var3.a(var1);
        }

        return com.trolmastercard.sexmod.f.j.bh;
    }

    public boolean causeFallDamage(float var1, float var2, DamageSource var3) {
        com.trolmastercard.sexmod.f.j var4 = this.ai();
        return var4 != com.trolmastercard.sexmod.f.j.aV && var4 != com.trolmastercard.sexmod.f.j.aU ? super.causeFallDamage(var1, var2, var3) : false;
    }

    private String M() {
        return "3";
    }

    @Override
    protected String h() {
        return "animation.goblin.idle";
    }

    @Override
    protected PlayState a(AnimationState<k> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() == com.trolmastercard.sexmod.f.j.a) {
                    this.a("animation.goblin.blink", true, var1);
                } else {
                    this.a("animation.goblin.null", true, var1);
                }
                break;
            case "movement":
                if (this.ai() != com.trolmastercard.sexmod.f.j.a) {
                    this.a("animation.goblin.null", true, var1);
                } else {
                    double var7 = Math.abs(this.xOld - this.getX()) + Math.abs(this.zOld - this.getZ());
                    if (!(Boolean)this.entityData.get(com.trolmastercard.sexmod.f.b.k.ap) && var7 > 0.0) {
                        if (this.onGround() && Math.abs(Math.abs(this.yOld) - Math.abs(this.getY())) < 0.1 && var7 > 0.2) {
                            this.a("animation.goblin.walk", true, var1);
                            this.setYRot(this.getYHeadRot());
                        } else {
                            this.a("animation.goblin.fly", true, var1);
                        }
                    } else {
                        this.a("animation.goblin.idle", true, var1);
                    }
                }
                break;
            case "action":
                String var5 = this.M();
                switch (this.ai()) {
                    case a:
                        this.a("animation.goblin.null", true, var1);
                        break;
                    case aO:
                        this.a("animation.goblin.shoulder_idle", true, var1);
                        break;
                    case aP:
                        this.a(String.format("animation.goblin.pick_up_%sperson", var5), true, var1);
                        break;
                    case D:
                        this.a("animation.goblin.sit", true, var1);
                        break;
                    case aQ:
                        if (this.onGround()) {
                            this.a("animation.goblin.running", true, var1);
                        } else {
                            this.a("animation.goblin.fly", true, var1);
                        }
                        break;
                    case aR:
                        this.a(String.format("animation.goblin.catch_%sperson", var5), true, var1);
                        break;
                    case aS:
                        this.a(String.format("animation.goblin.catch_%spersonBj", var5), true, var1);
                        break;
                    case aT:
                        this.a(String.format("animation.goblin.catch_%spersonBj_idle", var5), true, var1);
                        break;
                    case aU:
                        this.a(String.format("animation.goblin.throw_%sperson", var5), true, var1);
                        break;
                    case aV:
                        this.a("animation.goblin.thrown", true, var1);
                        break;
                    case G:
                        this.a("animation.goblin.paizuri_start", true, var1);
                        break;
                    case I:
                        this.a("animation.goblin.paizuri_slow" + this.S, true, var1);
                        break;
                    case J:
                        this.a("animation.goblin.paizuri_fast", true, var1);
                        break;
                    case K:
                        this.a("animation.goblin.paizuri_fast_countinues", true, var1);
                        break;
                    case H:
                        this.a("animation.goblin.paizuri_idle", true, var1);
                        break;
                    case L:
                        this.a("animation.goblin.paizuri_cum", true, var1);
                        break;
                    case aW:
                        this.a("animation.goblin.jump_1", true, var1);
                        break;
                    case aX:
                        this.a("animation.goblin.jump_2", true, var1);
                        break;
                    case aY:
                        this.a("animation.goblin.jump_3", true, var1);
                        break;
                    case aZ:
                        this.a("animation.goblin.breeding_intro_1", true, var1);
                        break;
                    case ba:
                        this.a("animation.goblin.breeding_intro_2", true, var1);
                        break;
                    case bb:
                        this.a("animation.goblin.breeding_intro_3", true, var1);
                        break;
                    case bc:
                        this.a("animation.goblin.breeding_slow_1" + (this.P ? "l" : "r"), true, var1);
                        break;
                    case be:
                        this.a("animation.goblin.breeding_slow_3", true, var1);
                        break;
                    case bf:
                        this.a("animation.goblin.breeding_fast_1" + (this.T ? "c" : "s"), true, var1);
                        break;
                    case bg:
                        this.a("animation.goblin.breeding_fast_3", true, var1);
                        break;
                    case bh:
                        this.a("animation.goblin.breeding_cum_1", true, var1);
                        break;
                    case bi:
                        this.a("animation.goblin.breeding_cum_2", true, var1);
                        break;
                    case bj:
                        this.a("animation.goblin.breeding_cum_3", true, var1);
                        break;
                    case bd:
                        this.a("animation.goblin.breeding_2", true, var1);
                        break;
                    case bk:
                        this.a("animation.goblin.await_pick_up", true, var1);
                        break;
                    case bm:
                        this.a("animation.goblin.stand_up", false, var1);
                        break;
                    case bn:
                        this.a("animation.goblin.nelson_intro", true, var1);
                        break;
                    case bo:
                        this.a("animation.goblin.nelson_slow" + (this.Q ? "" : "2"), true, var1);
                        break;
                    case bp:
                        this.a("animation.goblin.nelson_fast" + (this.R ? "c" : "s"), true, var1);
                        break;
                    case bq:
                        this.a("animation.goblin.nelson_cum", true, var1);
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
}
