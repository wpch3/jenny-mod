package com.trolmastercard.sexmod.f.b;

import com.trolmastercard.sexmod.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.BossEvent.BossBarColor;
import net.minecraft.world.BossEvent.BossBarOverlay;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.PlayerRideableJumping;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractBannerBlock;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.BaseTorchBlock;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityMountEvent;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.neoforge.event.entity.player.PlayerWakeUpEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent.Post;
import net.neoforged.neoforge.network.PacketDistributor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class e extends k implements PlayerRideableJumping {
    public static final com.trolmastercard.sexmod.m.n a = new com.trolmastercard.sexmod.m.n(0.83137256F, 0.6862745F, 0.21568628F);
    public static final Vec3 b = new Vec3(-1.049342, 2.0547214F, -0.050482392F);
    public static final Vec3 c = new Vec3(1.2522261F, 1.4357733F, 0.23570988F);
    public static final EntityDataAccessor<Integer> d = SynchedEntityData.defineId(e.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<Integer> e = SynchedEntityData.defineId(e.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<Boolean> f = SynchedEntityData.defineId(e.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Boolean> g = SynchedEntityData.defineId(e.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Boolean> h = SynchedEntityData.defineId(e.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Integer> i = SynchedEntityData.defineId(e.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<String> j = SynchedEntityData.defineId(e.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> k = SynchedEntityData.defineId(e.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Float> l = SynchedEntityData.defineId(e.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Boolean> m = SynchedEntityData.defineId(e.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<String> n = SynchedEntityData.defineId(e.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> o = SynchedEntityData.defineId(e.class, EntityDataSerializers.BOOLEAN);
    public com.trolmastercard.sexmod.f.i p = null;
    public Vec3 q = null;
    public Vec3 r = null;
    public Vec3 s = null;
    public int t = 0;
    public List<Entity> u = new ArrayList<>();
    public float v = 0.0F;
    public long w = -1L;
    public long x = -1L;
    public float y = 0.0F;
    public float z = 0.0F;
    boolean A = false;
    public Vec3 B = null;
    boolean C = false;
    float D = 0.0F;
    boolean E = false;
    public int F = 0;
    double G = 0.0;
    double H = 0.0;
    double I = 0.0;
    double J = 0.0;
    boolean K = false;
    e.a L = null;
    int M = 0;
    com.trolmastercard.sexmod.f.j N = null;
    int O = 0;
    int P = 0;
    int Q = 0;
    long R = 0L;
    boolean S = false;
    boolean T = false;
    int U = 0;
    boolean V = false;
    public boolean W = false;
    public boolean X = false;
    public boolean Y = false;
    public boolean Z = false;
    public boolean aa = false;
    public boolean ab = false;
    public boolean ac = true;
    public boolean ad = false;
    ServerBossEvent ae = new ServerBossEvent(Component.literal(this.a()), BossBarColor.RED, BossBarOverlay.PROGRESS);

    public e(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
        this.ae.setVisible(false);
    }

    @Nullable
    public static e a(Level var0, Player var1, Vec3 var2, boolean var3) {
        e var4 = (e)((EntityType)com.trolmastercard.sexmod.i.b.t.get()).create(var0);
        if (var4 == null) {
            return null;
        }

        UUID var5 = var1.getUUID();
        var4.getEntityData().set(ao, var5.toString());
        var4.b(false);
        var4.L = new e.a(var2.x, var2.y, var2.z);
        return var4;
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(d, -1);
        var1.define(e, 0);
        var1.define(f, true);
        var1.define(g, true);
        var1.define(h, false);
        var1.define(j, "null");
        var1.define(i, -1);
        var1.define(k, false);
        var1.define(l, 0.0F);
        var1.define(m, false);
        var1.define(n, "");
        var1.define(o, false);
    }

    @Override
    public String a() {
        return "Galath";
    }

    public boolean b() {
        return this.aw();
    }

    @Override
    public boolean e() {
        return (Boolean)this.entityData.get(m);
    }

    @Nullable
    public UUID j() {
        String var1 = (String)this.entityData.get(n);
        if ("".equals(var1)) {
            return null;
        }

        try {
            return UUID.fromString(var1);
        } catch (Exception var3) {
            return null;
        }
    }

    @Nullable
    public j a(boolean var1) {
        UUID var2 = this.j();
        if (var2 == null) {
            return null;
        }

        k var3 = var1 ? com.trolmastercard.sexmod.f.b.k.t(var2) : com.trolmastercard.sexmod.f.b.k.s(var2);
        return var3 instanceof j ? (j)var3 : null;
    }

    public void a(@Nullable UUID var1) {
        this.entityData.set(n, var1 == null ? "" : var1.toString());
    }

    public void k() {
        this.C = true;
        j var1 = this.a(true);
        if (var1 != null) {
            var1.l();
        }
    }

    public boolean l() {
        if (this.a(true) != null) {
            return false;
        }

        if (this.level() instanceof ServerLevel var1) {
            j var3 = (j)((EntityType)com.trolmastercard.sexmod.i.b.s.get()).create(var1);
            if (var3 == null) {
                return false;
            }

            this.a(var3.ah());
            var3.a(this.ah());
            var3.a(true);
            var3.c(com.trolmastercard.sexmod.f.j.ce);
            var3.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
            var1.addFreshEntity(var3);
            return true;
        } else {
            return false;
        }
    }

    public Vec3 m() {
        String[] var1 = ((String)this.entityData.get(j)).split("\\|");
        return new Vec3(Double.parseDouble(var1[0]), Double.parseDouble(var1[1]), Double.parseDouble(var1[2]));
    }

    public void a(@Nullable Vec3 var1) {
        this.entityData.set(j, var1.x + "|" + var1.y + "|" + var1.z);
    }

    public int n() {
        return (Integer)this.entityData.get(i);
    }

    public void a(int var1) {
        this.entityData.set(i, var1);
    }

    public void a(@Nullable LivingEntity var1) {
        this.entityData.set(d, var1 == null ? -1 : var1.getId());
    }

    public int o() {
        return (Integer)this.entityData.get(e);
    }

    public void b(int var1) {
        this.entityData.set(e, var1);
    }

    @Nullable
    public LivingEntity p() {
        int var1 = (Integer)this.entityData.get(d);
        if (-1 == var1) {
            return null;
        }

        Entity var2 = this.level().getEntity(var1);
        return var2 instanceof LivingEntity ? (LivingEntity)var2 : null;
    }

    @Override
    public void tick() {
        boolean var1 = this.b();
        if (var1) {
            this.q();
        } else {
            this.s();
        }

        this.r();
        super.tick();
        if (var1) {
            this.U();
        } else {
            this.V();
        }

        if (this.level().isClientSide()) {
            this.Y();
        }
    }

    void q() {
        this.setNoGravity(this.Z() != null);
    }

    void r() {
        Vec3 var1 = this.getDeltaMovement();
        this.G = this.G;
        this.I = this.G;
        this.J = this.H;
    }

    void s() {
        this.u();
        this.t();
        this.v();
    }

    void t() {
        if (this.ae != null) {
            float var1 = this.getMaxHealth();
            this.ae.setProgress(var1 <= 0.0F ? 0.0F : this.getHealth() / var1);
        }
    }

    void b(boolean var1) {
        if (this.ae != null) {
            this.ae.setVisible(var1);
        }
    }

    public void startSeenByPlayer(ServerPlayer var1) {
        super.startSeenByPlayer(var1);
        if (this.ae != null) {
            this.ae.addPlayer(var1);
        }
    }

    public void stopSeenByPlayer(ServerPlayer var1) {
        super.stopSeenByPlayer(var1);
        if (this.ae != null) {
            this.ae.removePlayer(var1);
        }
    }

    void u() {
        if (!(Boolean)this.entityData.get(k)) {
            this.setNoGravity(this.p() != null);
        }
    }

    void v() {
        if (this.ai() != com.trolmastercard.sexmod.f.j.bI) {
            this.F = 0;
        } else {
            if (this.F++ > 45) {
                this.F = 0;
            }
        }
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        if (this.T) {
            com.trolmastercard.sexmod.n.a.b(this);
        } else {
            this.w();
            super.customServerAiStep();
            if (this.b()) {
                this.x();
            } else {
                this.z();
            }
        }
    }

    void w() {
        if (!this.K) {
            this.K = true;
        }
    }

    void x() {
        this.b(false);
        if (!com.trolmastercard.sexmod.n.a.a(this)) {
            com.trolmastercard.sexmod.n.a.b(this);
        } else if (this.Z() != null) {
            this.F();
        } else {
            this.y();
        }
    }

    void y() {
        if (com.trolmastercard.sexmod.n.a.a(com.trolmastercard.sexmod.n.a.c(this))) {
            boolean var1 = this.l();
            if (var1) {
                Main.a.warn("mommy thinks she got no daughter but she actually does have one. Failsafe called. Hopefully its fixed");
            }
        }
    }

    void z() {
        this.b(true);
        this.A();
    }

    void A() {
        if (!com.trolmastercard.sexmod.f.j.a(this.ai(), com.trolmastercard.sexmod.f.j.cc, com.trolmastercard.sexmod.f.j.cd)) {
            if (this.al() == null) {
                this.B();
                this.I();
                this.C();
                this.G();
                this.L();
                this.M();
                this.N();
                this.O();
                this.P();
                this.S();
                this.R();
                this.T();
                this.Q();
                this.H();
            }
        }
    }

    void B() {
        if (this.b()) {
            if (this.p() == null) {
                if ((Integer)this.entityData.get(d) != -1) {
                    if (this.p != null) {
                        this.p.d(this);
                    }

                    this.p = null;
                    this.c(com.trolmastercard.sexmod.f.j.a);
                }
            }
        }
    }

    void C() {
        if (this.p() == null) {
            this.E();
        } else if (this.p == null) {
            this.D();
        } else {
            if (this.p.b(this)) {
                this.D();
            }
        }
    }

    void D() {
        if (!(Boolean)this.entityData.get(k)) {
            com.trolmastercard.sexmod.f.i var1 = this.p;
            if (this.al() != null) {
                if (var1 != null) {
                    var1.d(this);
                }

                this.p = null;
            } else if (var1 != null && var1.j) {
                var1.d(this);
                this.p = com.trolmastercard.sexmod.f.i.a;
                this.p.a(this);
            } else {
                com.trolmastercard.sexmod.f.i[] var2 = com.trolmastercard.sexmod.f.i.values();

                com.trolmastercard.sexmod.f.i var3;
                do {
                    var3 = var2[this.getRandom().nextInt(var2.length)];
                } while (!this.a(var3));

                this.p = var3;
                if (var1 != null) {
                    var1.d(this);
                }

                this.p.a(this);
            }
        }
    }

    void E() {
        this.p = null;
    }

    public void b(@Nullable Vec3 var1) {
        if (!(Boolean)this.entityData.get(k)) {
            this.entityData.set(k, true);
            if (this.p != null) {
                this.p.d(this);
            }

            this.p = null;
            Vec3 var2 = this.position();
            RandomSource var3 = this.getRandom();
            Vec3 var4 = var1 == null ? new Vec3(var3.nextDouble(), var3.nextDouble(), var3.nextDouble()).normalize() : var2.subtract(var1).normalize();
            this.setDeltaMovement(var4.x * 1.0, 1.0, var4.z * 1.0);
            this.c(com.trolmastercard.sexmod.f.j.bK);
            this.setNoGravity(false);
            this.noPhysics = false;
            this.getNavigation().stop();
            com.trolmastercard.sexmod.i.e.a(this, "galath", "aaa");
        }
    }

    void F() {
        this.L = null;
        this.M = 0;
        if (this.p != null) {
            this.p.d(this);
            this.p = null;
        }
    }

    void a(Entity var1) {
        com.trolmastercard.sexmod.f.b.k.a(this, ChatFormatting.YELLOW + "Galath is paralyzed! Now it's time to corrupt her");
        com.trolmastercard.sexmod.f.b.k.a(this, ChatFormatting.GRAY + "(Walk to her and right click her)");
        this.b((Vec3)null);
        this.entityData.set(m, true);
    }

    public static void a(e var0, Vec3 var1, Vec3 var2, Vec3 var3, RandomSource var4) {
        Vec3 var5 = var1.add(com.trolmastercard.sexmod.m.o.a(var3, 180.0F + var0.yBodyRot));
        Vec3 var6 = var2.subtract(var5).normalize();
        var6 = new Vec3(var6.x + var4.nextDouble() * 0.3, var6.y + var4.nextDouble() * 0.3, var6.z + var4.nextDouble() * 0.3).normalize();
        Vec3 var7 = new Vec3(var6.x * 0.4, var6.y * 0.4, var6.z * 0.4);
        com.trolmastercard.sexmod.f.b var8 = new com.trolmastercard.sexmod.f.b(
            (EntityType<? extends Mob>)com.trolmastercard.sexmod.i.b.A.get(), var0.level(), var0, var7
        );
        var8.moveTo(var5.x, var5.y, var5.z, 0.0F, 0.0F);
        var0.level().addFreshEntity(var8);
    }

    void G() {
        if (this.p != null) {
            this.p.c(this);
        }
    }

    void H() {
        if (!this.b()) {
            com.trolmastercard.sexmod.f.j var1 = this.ai();
            if (var1 != com.trolmastercard.sexmod.f.j.bS) {
                this.O = 0;
            } else {
                Player var2 = this.ak();
                if (var2 == null) {
                    this.O = 0;
                } else if (++this.O == 15) {
                    var2.hurt(new com.trolmastercard.sexmod.m.c(this), Float.MAX_VALUE);
                }
            }
        }
    }

    void I() {
        if (!this.K()) {
            if (this.al() == null) {
                boolean var1 = this.b();
                float var2 = var1 ? 7.0F : 20.0F;
                Vec3 var3 = this.position();
                AABB var4 = new AABB(var3.x - var2, var3.y - var2, var3.z - var2, var3.x + var2, var3.y + var2, var3.z + var2);
                Object var5 = var1 ? this.b(var4) : this.a(var4);
                if (var5 == null) {
                    this.J();
                } else {
                    this.a((LivingEntity)var5);
                    com.trolmastercard.sexmod.i.e.a(this, "galath", "dialog");
                    if (this.p != null) {
                        this.p.d(this);
                    }

                    this.p = com.trolmastercard.sexmod.f.i.a;
                    this.p.a(this);
                }
            }
        }
    }

    @Nullable
    Player a(AABB var1) {
        List var2 = this.level()
            .getEntitiesOfClass(Player.class, var1, var0 -> !com.trolmastercard.sexmod.f.c.a.b(var0) && !var0.getAbilities().instabuild && !var0.isSpectator());
        return var2.isEmpty() ? null : (Player)var2.get(0);
    }

    @Nullable
    Mob b(AABB var1) {
        List var2 = this.level().getEntitiesOfClass(Monster.class, var1);
        if (var2.isEmpty()) {
            return null;
        }

        ArrayList var3 = new ArrayList();

        for (Monster var5 : var2) {
            if (com.trolmastercard.sexmod.m.k.a(var5)) {
                var3.add(var5);
            }
        }

        Vec3 var7 = this.position().add(0.0, this.getEyeHeight(), 0.0);

        for (Monster var6 : var3) {
            if (com.trolmastercard.sexmod.m.k.a(this.level(), var7, var6)) {
                return var6;
            }
        }

        return null;
    }

    void J() {
        if (this.p() != null) {
            this.a((LivingEntity)null);
            if (this.p != null) {
                this.p.d(this);
            }

            this.p = null;
            if (!(Boolean)this.entityData.get(k)) {
                this.c(com.trolmastercard.sexmod.f.j.a);
            }
        }
    }

    boolean K() {
        LivingEntity var1 = this.p();
        if (var1 == null) {
            return false;
        }

        if (var1.isRemoved()) {
            return false;
        }

        if (var1.level() != this.level()) {
            return false;
        }

        float var2 = this.distanceTo(var1);
        float var3 = this.b() ? 16.0F : 30.0F;
        if (var2 > var3) {
            return false;
        }

        if (var1 instanceof Player var4) {
            if (com.trolmastercard.sexmod.f.b.k.v(var4.getUUID()) != null) {
                return false;
            } else {
                return var4.getAbilities().instabuild ? false : !var4.isSpectator();
            }
        } else {
            return true;
        }
    }

    void L() {
        if (this.p == com.trolmastercard.sexmod.f.i.a) {
            boolean var1 = this.o() == 0;
            this.noPhysics = var1;
            if (!this.level().isEmptyBlock(this.blockPosition())) {
                this.noPhysics = true;
            }
        }
    }

    void M() {
        if (this.ai() == com.trolmastercard.sexmod.f.j.bK) {
            BlockPos var1 = this.blockPosition();
            if (!this.level().getBlockState(var1).liquid()) {
                if (this.onGround()) {
                    this.c(com.trolmastercard.sexmod.f.j.bL);
                }
            } else {
                BlockPos var2 = var1;

                while (this.level().getBlockState(var2.above()).liquid()) {
                    var2 = var2.above();
                }

                for (int var3 = -1; var3 < 2; var3++) {
                    for (int var4 = -1; var4 < 2; var4++) {
                        this.level().setBlockAndUpdate(var2.offset(var3, 0, var4), Blocks.OBSIDIAN.defaultBlockState());
                    }
                }

                var2 = var2.above();
                this.moveTo(var2.getX(), var2.getY(), var2.getZ());
                this.d(Vec3.atLowerCornerOf(var2));
                this.c(com.trolmastercard.sexmod.f.j.bL);
            }
        }
    }

    void N() {
        com.trolmastercard.sexmod.f.j var1 = this.ai();
        if (var1 == com.trolmastercard.sexmod.f.j.bL || var1 == com.trolmastercard.sexmod.f.j.bM) {
            Vec3 var2 = this.getDeltaMovement();
            this.setDeltaMovement(0.0, this.entityData.get(m) ? 0.0 : var2.y, 0.0);
        }
    }

    void O() {
        if (this.ai() == com.trolmastercard.sexmod.f.j.bL) {
            if (!(Boolean)this.entityData.get(m)) {
                if (++this.Q >= 50) {
                    this.c(com.trolmastercard.sexmod.f.j.bM);
                    this.P = 0;
                    this.Q = 0;
                }
            }
        }
    }

    void P() {
        if (this.ai() == com.trolmastercard.sexmod.f.j.bM) {
            this.P++;
            if (this.P == 39) {
                this.setNoGravity(true);
                this.setDeltaMovement(0.0, 0.6, 0.0);
                Vec3 var1 = this.position();
                AABB var2 = new AABB(var1.x - 2.0, var1.y - 2.0, var1.z - 2.0, var1.x + 2.0, var1.y + 2.0, var1.z + 2.0);

                for (LivingEntity var5 : this.level().getEntitiesOfClass(LivingEntity.class, var2)) {
                    if (!(var5 instanceof e)) {
                        Vec3 var6 = var5.position().subtract(var1).normalize();
                        var5.setDeltaMovement(var6.x, 1.0, var6.z);
                        var5.hurtMarked = true;
                        var5.hurt(new com.trolmastercard.sexmod.m.d(this), 0.5F);
                    }
                }
            }

            if (this.P >= 58) {
                this.e(Vec3.ZERO);
                this.entityData.set(k, false);
                this.P = 0;
            }
        }
    }

    void Q() {
        LivingEntity var1 = this.p();
        if (var1 != null) {
            for (Entity var3 : this.u) {
                if (!var3.isRemoved() && !(var1.distanceTo(var3) < 15.0F)) {
                    var3.discard();
                }
            }
        }
    }

    void R() {
        if (this.level() instanceof ServerLevel var1) {
            for (Entity var3 : this.u) {
                if (!var3.isRemoved() && var3.tickCount % 10 == 0) {
                    var1.sendParticles(
                        ParticleTypes.DRAGON_BREATH,
                        var3.getX(),
                        var3.getY(),
                        var3.getZ(),
                        5,
                        0.2 * com.trolmastercard.sexmod.m.j.a(),
                        var3.getEyeHeight() / 2.0,
                        0.2 * com.trolmastercard.sexmod.m.j.a(),
                        0.0
                    );
                }
            }
        }
    }

    void S() {
        ArrayList var1 = new ArrayList();

        for (Entity var3 : this.u) {
            if (var3.isRemoved()) {
                var1.add(var3);
            }
        }

        this.u.removeAll(var1);
    }

    void T() {
        if ((Boolean)this.entityData.get(k)) {
            for (Entity var2 : this.u) {
                if (!var2.isRemoved()) {
                    var2.discard();
                }
            }

            this.u.clear();
        }
    }

    void U() {
        Vec3 var1 = this.getDeltaMovement();
        if (!this.isInWater() && !this.isNoGravity() && var1.y < 0.0 && this.ai() != com.trolmastercard.sexmod.f.j.cc) {
            this.setDeltaMovement(var1.x, var1.y * 0.4, var1.z);
        }

        this.X();
        if (this.p() == null) {
            this.aa = false;
        }
    }

    void V() {
        this.X();
        this.W();
    }

    void W() {
        if (!this.level().isClientSide()) {
            if (this.ai() == com.trolmastercard.sexmod.f.j.bV) {
                if (com.trolmastercard.sexmod.f.j.bV.cv[0] >= 30) {
                    this.c(com.trolmastercard.sexmod.f.j.cb);
                }
            }
        }
    }

    void X() {
        if ((Boolean)this.entityData.get(m)) {
            this.ad = true;
        } else {
            switch (this.ai()) {
                case bQ:
                case bP:
                case bS:
                case bO:
                case bR:
                case bT:
                case bU:
                case bV:
                case cc:
                    this.ad = true;
                case bN:
                    break;
                default:
                    this.ad = false;
            }
        }
    }

    void Y() {
    }

    boolean a(com.trolmastercard.sexmod.f.i var1) {
        return var1.k && !(this.p() instanceof Player) ? false : var1.e(this);
    }

    public InteractionResult mobInteract(Player var1, InteractionHand var2) {
        boolean var3 = this.b() ? this.a(var1, var2) : this.b(var1, var2);
        return var3 ? InteractionResult.SUCCESS : super.mobInteract(var1, var2);
    }

    boolean a(Player var1, InteractionHand var2) {
        if (!var1.getUUID().equals(this.ax())) {
            return false;
        }

        if (com.trolmastercard.sexmod.f.j.a(
            this.ai(),
            com.trolmastercard.sexmod.f.j.cd,
            com.trolmastercard.sexmod.f.j.aQ,
            com.trolmastercard.sexmod.f.j.bZ,
            com.trolmastercard.sexmod.f.j.ca,
            com.trolmastercard.sexmod.f.j.cc
        )) {
            return false;
        }

        boolean var3 = var1.getMainHandItem().getItem() instanceof com.trolmastercard.sexmod.k.c
            || var1.getOffhandItem().getItem() instanceof com.trolmastercard.sexmod.k.c;
        if (var3) {
            return false;
        }

        ArrayList var4 = new ArrayList();
        var4.add("action.names.cowgirl");
        var4.add("action.names.anal");
        if (this.a(false) != null) {
            var4.add("action.names.threesome");
        }

        var4.add("action.names.ride");
        com.trolmastercard.sexmod.f.b.k.a(var1, this, var4.toArray(new String[0]), true);
        return true;
    }

    @Override
    public void a(String var1, UUID var2) {
        super.a(var1, var2);
        if (!this.level().isClientSide()) {
            if ("action.names.threesome".equals(var1)) {
                this.b(var2);
            } else if ("action.names.ride".equals(var1)) {
                this.c(var2);
            } else {
                com.trolmastercard.sexmod.f.j var3;
                if ("action.names.cowgirl".equals(var1)) {
                    var3 = com.trolmastercard.sexmod.f.j.bQ;
                } else {
                    if (!"action.names.anal".equals(var1)) {
                        return;
                    }

                    var3 = com.trolmastercard.sexmod.f.j.bT;
                }

                Player var4 = this.level().getPlayerByUUID(var2);
                if (var4 != null) {
                    this.c(var3);
                    this.q(var2);
                    this.d(true);
                    this.d(this.position());
                    this.a_(var4.getYRot());
                    var4.teleportTo(this.getX(), this.getY(), this.getZ());
                }
            }
        }
    }

    private void b(UUID var1) {
        j var2 = this.a(false);
        if (var2 != null) {
            Player var3 = this.level().getPlayerByUUID(var1);
            if (var3 != null) {
                this.c(com.trolmastercard.sexmod.f.j.ci);
                this.q(var1);
                this.d(true);
                this.d(this.position());
                this.a_(var3.getYRot());
                var2.c(com.trolmastercard.sexmod.f.j.cf);
                var2.q(var1);
                var2.d(true);
                var2.d(this.position());
                var2.a_(var3.getYRot());
                var3.teleportTo(this.getX(), this.getY(), this.getZ());
            }
        }
    }

    private void c(UUID var1) {
        if (this.level().getPlayerByUUID(var1) instanceof Player var2) {
            this.c(com.trolmastercard.sexmod.f.j.bX);
            var2.startRiding(this, true);
            this.setDeltaMovement(this.getDeltaMovement().x, 0.25, this.getDeltaMovement().z);
        }
    }

    @Nullable
    public LivingEntity getControllingPassenger() {
        Entity var1 = this.getFirstPassenger();
        return var1 instanceof Player && com.trolmastercard.sexmod.f.j.a(this.ai(), com.trolmastercard.sexmod.f.j.bX, com.trolmastercard.sexmod.f.j.bY)
            ? (Player)var1
            : null;
    }

    protected Vec3 getRiddenInput(Player var1, Vec3 var2) {
        return new Vec3(var1.xxa * 0.5, 0.0, var1.zza);
    }

    protected float getRiddenSpeed(Player var1) {
        return (float)this.getAttributeValue(Attributes.MOVEMENT_SPEED) * 2.0F;
    }

    protected void tickRidden(Player var1, Vec3 var2) {
        super.tickRidden(var1, var2);
        this.setRot(var1.getYRot(), var1.getXRot() * 0.5F);
        this.yRotO = this.yBodyRot = this.yHeadRot = this.getYRot();
    }

    public boolean canJump() {
        return this.ai() == com.trolmastercard.sexmod.f.j.bX && (!this.level().isClientSide() || com.trolmastercard.sexmod.b.b.c());
    }

    public void handleStartJump(int var1) {
        this.c(new Vec3(0.0, 0.5, 0.0));
        this.c(com.trolmastercard.sexmod.f.j.bY);
    }

    public void onPlayerJump(int var1) {
        if (this.level().isClientSide()) {
            com.trolmastercard.sexmod.b.b.d();
        }
    }

    public void handleStopJump() {
    }

    boolean b(Player var1, InteractionHand var2) {
        if (!(Boolean)this.entityData.get(k)) {
            return false;
        }

        if (this.ai() != com.trolmastercard.sexmod.f.j.bL) {
            return false;
        }

        if (this.level().isClientSide()) {
            return true;
        }

        this.c(com.trolmastercard.sexmod.f.j.bW);
        this.q(var1.getUUID());
        this.d(true);
        this.d(this.position());
        this.a_(var1.getYRot());
        var1.teleportTo(this.getX(), this.getY(), this.getZ());
        return true;
    }

    public boolean canBeAffected(MobEffectInstance var1) {
        return false;
    }

    public boolean hurt(DamageSource var1, float var2) {
        if (var1.is(DamageTypes.IN_FIRE) || var1.is(DamageTypes.ON_FIRE) || var1.is(DamageTypes.LAVA) || var1.is(DamageTypes.HOT_FLOOR)) {
            return false;
        }

        if (var1.is(DamageTypes.DROWN)) {
            return false;
        }

        if (var1.is(DamageTypes.CACTUS)) {
            return false;
        }

        if (var1.is(DamageTypes.FALL)) {
            return false;
        }

        if (var1.is(DamageTypes.FLY_INTO_WALL)) {
            return false;
        }

        this.a(var2);
        return super.hurt(var1, var2);
    }

    void a(float var1) {
        if (this.level().isClientSide()) {
            if (!(this.getHealth() - var1 <= 0.0F)) {
                long var2 = System.currentTimeMillis();
                if (var2 >= this.R + 1000L) {
                    com.trolmastercard.sexmod.i.e.b(this, "galath", "uuh");
                    this.R = var2;
                }
            }
        }
    }

    void c(boolean var1) {
        Player var2 = this.ak();
        if (var2 != null) {
            Vec3 var3 = new Vec3(var1 ? -0.5 : 0.5, 0.5F - var2.getEyeHeight(), 0.4F);
            Vec3 var4 = var1 ? var3.add(this.am()) : com.trolmastercard.sexmod.m.o.a(var3, this.e_()).add(this.am());
            var2.moveTo(var4.x, var4.y, var4.z, var2.getYRot(), var2.getXRot());
        }
    }

    @Nullable
    public Player Z() {
        List var1 = this.getPassengers();
        if (var1.isEmpty()) {
            return null;
        } else {
            return var1.get(0) instanceof Player ? (Player)var1.get(0) : null;
        }
    }

    public void aa() {
        this.q((UUID)null);
        this.c((com.trolmastercard.sexmod.f.j)null);
    }

    public void c(Vec3 var1) {
        Vec3 var2 = this.getDeltaMovement();
        this.setDeltaMovement(var2.x + var1.x, var1.y / 2.0, var2.z + var1.z);
    }

    @Override
    public void a_() {
        this.a((LivingEntity)null);
        this.E();
    }

    @Nullable
    @Override
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        return null;
    }

    @Override
    protected com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.bU || var1 == com.trolmastercard.sexmod.f.j.bT) {
            return com.trolmastercard.sexmod.f.j.bV;
        }

        if (var1 == com.trolmastercard.sexmod.f.j.bP) {
            return com.trolmastercard.sexmod.f.j.bS;
        }

        if (com.trolmastercard.sexmod.f.j.a(var1, com.trolmastercard.sexmod.f.j.cl, com.trolmastercard.sexmod.f.j.cm)) {
            this.S = true;
        }

        return null;
    }

    @Override
    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.ca) {
            if (var2 != com.trolmastercard.sexmod.f.j.bV || var1 != com.trolmastercard.sexmod.f.j.bU && var1 != com.trolmastercard.sexmod.f.j.bT) {
                if (var2 != com.trolmastercard.sexmod.f.j.bS || var1 != com.trolmastercard.sexmod.f.j.bP) {
                    if (var2 != com.trolmastercard.sexmod.f.j.cn || var1 != com.trolmastercard.sexmod.f.j.cl && var1 != com.trolmastercard.sexmod.f.j.cm) {
                        if (!this.level().isClientSide()
                            && com.trolmastercard.sexmod.f.j.a(
                                var2, com.trolmastercard.sexmod.f.j.bV, com.trolmastercard.sexmod.f.j.bS, com.trolmastercard.sexmod.f.j.cn
                            )) {
                            com.trolmastercard.sexmod.n.a.a(this.al(), this.level().getGameTime());
                        }

                        if (var1 == com.trolmastercard.sexmod.f.j.bT) {
                            this.V = false;
                            if (var2 == com.trolmastercard.sexmod.f.j.bW) {
                                this.c(false);
                            }
                        }

                        if (this.b() && var2 == com.trolmastercard.sexmod.f.j.a) {
                            this.c(true);
                        }

                        if (var2 == com.trolmastercard.sexmod.f.j.cb && var1 == com.trolmastercard.sexmod.f.j.a && !this.level().isClientSide()) {
                            this.ad();
                        }

                        if (var2 == com.trolmastercard.sexmod.f.j.cd && var1 == com.trolmastercard.sexmod.f.j.a) {
                            this.ac();
                        }

                        if (var2 == com.trolmastercard.sexmod.f.j.cn && var1 == com.trolmastercard.sexmod.f.j.a) {
                            this.ab();
                        }

                        super.c(var1);
                    }
                }
            }
        }
    }

    void ab() {
        if (this.ak() instanceof ServerPlayer var2) {
            com.trolmastercard.sexmod.l.n.a(var2);
        }

        com.trolmastercard.sexmod.l.n.a(this);
    }

    void ac() {
        this.d(false);
        j var1 = this.a(true);
        if (var1 != null) {
            var1.a(true);
        }
    }

    void ad() {
        Player var1 = this.ak();
        if (var1 != null) {
            ItemStack var2 = var1.getMainHandItem();
            var1.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack((ItemLike)com.trolmastercard.sexmod.i.c.s.get()));
            if (!var2.isEmpty()) {
                var1.getInventory().add(var2);
            }

            this.q((UUID)null);
            this.a((LivingEntity)null);
            var1.displayClientMessage(
                Component.literal(
                    ChatFormatting.GRAY
                        + "Defeating a succubus makes her accept the victor as her master, granting him a coin to which her soul is bound. Using the coin summons her, offering services on demand. If her master uses the coin on her or goes too far, she returns to the coin"
                ),
                false
            );
            com.trolmastercard.sexmod.n.a.b(this);
            var1.teleportTo(var1.getX(), Math.ceil(var1.getY()) + 1.0, var1.getZ());
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag var1) {
        super.addAdditionalSaveData(var1);
        var1.putString("sexmod:master", (String)this.entityData.get(ao));
        if (this.C) {
            var1.putBoolean("sexmod:despawned", true);
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        this.entityData.set(ao, var1.getString("sexmod:master"));
        if (var1.getBoolean("sexmod:despawned")) {
            this.T = true;
        }
    }

    @Override
    protected boolean ae() {
        return false;
    }

    @Override
    public void a(String var1) {
        super.a(var1);
    }

    @Override
    public String af() {
        Player var1 = this.ay();
        return var1 == null ? super.af() : String.format("%s %s[%s]", super.af(), ChatFormatting.DARK_PURPLE, var1.getName().getString());
    }

    @Override
    protected boolean a(com.trolmastercard.sexmod.f.j var1, String var2, boolean var3, AnimationState<k> var4) {
        if (var1 == com.trolmastercard.sexmod.f.j.cj && this.W) {
            this.W = false;
            this.a("animation.galath.masterbating_sitting", true, var4, true);
            return true;
        } else if (var1 == com.trolmastercard.sexmod.f.j.cm && this.S) {
            this.c(com.trolmastercard.sexmod.f.j.cn);
            return true;
        } else if (var1 == com.trolmastercard.sexmod.f.j.cm && this.Y) {
            this.a("animation.shared.bed_fast", true, var4, true);
            this.Y = false;
            return true;
        } else if (var1 == com.trolmastercard.sexmod.f.j.cn) {
            this.c((com.trolmastercard.sexmod.f.j)null);
            return true;
        } else if (var1 == com.trolmastercard.sexmod.f.j.ci && this.X) {
            this.X = false;
            this.a("animation.galath.pussy_licking", true, var4, true);
            return true;
        } else if (var1 == com.trolmastercard.sexmod.f.j.cl && this.S) {
            this.Y = true;
            this.c(com.trolmastercard.sexmod.f.j.cm);
            this.a("animation.shared.bed_soft", true, var4, true);
            return true;
        } else if (var1 == com.trolmastercard.sexmod.f.j.cl && this.Z) {
            this.Z = false;
            this.a("animation.shared.bed_slow", true, var4, true);
            return true;
        } else if (var1 == com.trolmastercard.sexmod.f.j.cm) {
            this.c(com.trolmastercard.sexmod.f.j.cl);
            this.Z = true;
            this.a("animation.shared.bed_back", true, var4, true);
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected String h() {
        return "animation.galath.idle";
    }

    @Override
    protected PlayState a(AnimationState<k> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                com.trolmastercard.sexmod.f.j var5 = this.ai();
                if (var5.cq && var5 != com.trolmastercard.sexmod.f.j.ca) {
                    this.a("animation.galath.blink", true, var1);
                    return PlayState.CONTINUE;
                }

                return PlayState.STOP;
            case "movement":
                if (this.ai() != com.trolmastercard.sexmod.f.j.a) {
                    return PlayState.STOP;
                } else {
                    if (!this.onGround()) {
                        this.a("animation.galath.controlled_flight", true, var1);
                        return PlayState.CONTINUE;
                    }

                    if (Math.abs(this.xOld - this.getX()) + Math.abs(this.zOld - this.getZ()) > 0.0) {
                        this.setYRot(this.getYHeadRot());
                        this.a("animation.galath." + (this.entityData.get(o) ? "run" : "walk"), true, var1);
                    } else {
                        this.a("animation.galath.idle", true, var1);
                    }

                    return PlayState.CONTINUE;
                }
            case "action":
                switch (this.ai()) {
                    case cd:
                        this.a("animation.galath.hug_mang", true, var1);
                        break;
                    case cl:
                        this.a(this.Z ? "animation.shared.bed_back" : "animation.shared.bed_slow", true, var1);
                        break;
                    case cm:
                        if (this.Y) {
                            this.a("animation.shared.bed_soft", true, var1);
                        } else {
                            this.a("animation.shared.bed_fast", 4, 0.75F, var1);
                        }
                        break;
                    case cn:
                        this.a("animation.shared.bed_cum", true, var1);
                        break;
                    case bQ:
                        this.a("animation.galath.rape_intro", true, var1);
                        break;
                    case bP:
                        this.a("animation.galath.rape" + this.U, true, var1);
                        break;
                    case bS:
                        this.a("animation.galath.rape_cum", true, var1);
                        break;
                    case bO:
                        this.a("animation.galath.rape_charge", true, var1);
                        break;
                    case bR:
                        this.a("animation.galath.rape_cum_idle", true, var1);
                        break;
                    case bT:
                        this.a("animation.galath.corrupt_slow", true, var1);
                        break;
                    case bU:
                        this.a("animation.galath.corrupt_" + (this.V ? "hard" : "soft"), true, var1);
                        break;
                    case bV:
                        this.a("animation.galath.corrupt_cum", true, var1);
                        break;
                    case cc:
                        this.a("animation.galath.masterbate", true, var1);
                        break;
                    case bN:
                        this.a("animation.galath.rape_prepare", true, var1);
                    case z:
                    default:
                        break;
                    case a:
                        return PlayState.STOP;
                    case bH:
                        this.a("animation.galath.idle_flying", true, var1);
                        break;
                    case bI:
                        this.a("animation.galath.summon_skeleton" + (this.entityData.get(h) ? "Mirrored" : ""), true, var1);
                        break;
                    case bJ:
                        this.a("animation.galath.attack", true, var1);
                        break;
                    case bK:
                        this.a("animation.galath.knockout_air", true, var1);
                        break;
                    case bL:
                        this.a("animation.galath.knocked_out", true, var1);
                        break;
                    case bM:
                        this.a("animation.galath.knocked_out_stand_up", true, var1);
                        break;
                    case bW:
                        this.a("animation.galath.corrupt_intro", true, var1);
                        break;
                    case bX:
                        this.a("animation.galath.controlled_flight", true, var1);
                        break;
                    case bY:
                        this.a("animation.galath.boost", true, var1);
                        break;
                    case bZ:
                        this.a("animation.galath.summon", false, var1);
                        break;
                    case ca:
                        this.a("animation.galath.desummon" + (this.onGround() ? "_standing" : ""), true, var1);
                        break;
                    case cb:
                        this.a("animation.galath.give_coin", true, var1);
                        break;
                    case aQ:
                        this.a("animation.galath.running", true, var1);
                        break;
                    case ci:
                        this.a(this.X ? "animation.galath.pussy_licking_forward" : "animation.galath.pussy_licking", true, var1);
                        break;
                    case cj:
                        this.a(this.W ? "animation.galath.pussy_licking_back" : "animation.galath.masterbating_sitting", true, var1);
                        break;
                    case ck:
                        this.a("animation.galath.masterbating_sitting_cum", true, var1);
                }

                return PlayState.CONTINUE;
            default:
                return PlayState.CONTINUE;
        }
    }

    @Override
    public void registerControllers(ControllerRegistrar var1) {
        super.registerControllers(var1);
        this.aB.setSoundKeyframeHandler(var0 -> {});
    }

    public static Float a(e var0, float var1) {
        com.trolmastercard.sexmod.f.j var2 = var0.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.bH && var2 != com.trolmastercard.sexmod.f.j.bI && var2 != com.trolmastercard.sexmod.f.j.bN) {
            return null;
        }

        LivingEntity var3 = var0.p();
        if (var3 == null) {
            return null;
        }

        Vec3 var4 = com.trolmastercard.sexmod.m.i.a(new Vec3(var3.xo, var3.yo, var3.zo), var3.position(), var1);
        Vec3 var5 = com.trolmastercard.sexmod.m.i.a(new Vec3(var0.xo, var0.yo, var0.zo), var0.position(), var1);
        Vec3 var6 = var4.subtract(var5);
        float var7 = (float)com.trolmastercard.sexmod.m.a.a(Math.atan2(var6.z, var6.x)) - 90.0F;
        var0.setYBodyRot(var7);
        return var7;
    }

    private record a() {
        private final double a;
        private final double b;
        private final double c;

        private a(double var1, double var3, double var5) {
            this.a = var1;
            this.b = var3;
            this.c = var5;
        }
    }

    @EventBusSubscriber(modid = "sexmod")
    public static final class b {
        static final Class<?>[] a = new Class[]{
            AirBlock.class,
            CarpetBlock.class,
            BushBlock.class,
            ButtonBlock.class,
            LadderBlock.class,
            BaseTorchBlock.class,
            SignBlock.class,
            AbstractBannerBlock.class
        };
        private static final List<e.b.a> b = new ArrayList<>();

        @SubscribeEvent(priority = EventPriority.HIGH)
        public static void onLivingDeath(LivingDeathEvent var0) {
            if (var0.getEntity() instanceof e var1) {
                if (!var0.getSource().is(DamageTypes.FELL_OUT_OF_WORLD)) {
                    if (!var1.A) {
                        if (!var1.level().isClientSide()) {
                            if (var1.b()) {
                                com.trolmastercard.sexmod.k.c.a(var1);
                                UUID var3 = com.trolmastercard.sexmod.n.a.c(var1);
                                PacketDistributor.sendToPlayersTrackingEntity(
                                    var1,
                                    new com.trolmastercard.sexmod.l.g(var1.ah().toString(), var3 == null ? "" : var3.toString()),
                                    new CustomPacketPayload[0]
                                );
                                com.trolmastercard.sexmod.n.a.b(var1);
                                var1.A = true;
                            } else {
                                var1.a(var1.getKillCredit());
                            }

                            var1.setHealth(1.0F);
                            var0.setCanceled(true);
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onDismount(EntityMountEvent var0) {
            if (!var0.isMounting()) {
                if (var0.getEntityBeingMounted() instanceof e var1) {
                    if (com.trolmastercard.sexmod.f.j.a(var1.ai(), com.trolmastercard.sexmod.f.j.bX, com.trolmastercard.sexmod.f.j.bY)) {
                        var1.aa();
                    }
                }
            }
        }

        static boolean a(Level var0, BlockPos var1, Direction var2) {
            if (var2 == Direction.NORTH) {
                var1 = var1.west();
                return !a(var0, var1) && !a(var0, var1.above()) && !a(var0, var1.south()) && !a(var0, var1.south().above());
            } else if (var2 == Direction.WEST) {
                var1 = var1.south();
                return !a(var0, var1) && !a(var0, var1.above()) && !a(var0, var1.east()) && !a(var0, var1.east().above());
            } else if (var2 == Direction.SOUTH) {
                var1 = var1.east();
                return !a(var0, var1) && !a(var0, var1.above()) && !a(var0, var1.north()) && !a(var0, var1.north().above());
            } else if (var2 != Direction.EAST) {
                Main.a.error("Weird bed orientation, when checking for space next to bed, on galaths morning blowjob animation: " + var2);
                return false;
            } else {
                var1 = var1.north();
                return !a(var0, var1) && !a(var0, var1.above()) && !a(var0, var1.west()) && !a(var0, var1.west().above());
            }
        }

        static boolean a(Level var0, BlockPos var1) {
            Block var2 = var0.getBlockState(var1).getBlock();

            for (Class var6 : a) {
                if (var6.isInstance(var2)) {
                    return false;
                }
            }

            return true;
        }

        @SubscribeEvent
        public static void onPlayerWakeUp(PlayerWakeUpEvent var0) {
            Player var1 = var0.getEntity();
            if (!var1.level().isClientSide()) {
                if (com.trolmastercard.sexmod.n.a.a(var1.getUUID(), var1.level())) {
                    Vec3 var2 = var1.position();
                    BlockPos var3 = (BlockPos)var1.getSleepingPos().orElseGet(var1::blockPosition);
                    BlockState var4 = var1.level().getBlockState(var3);
                    if (var4.getBlock() instanceof BedBlock) {
                        Direction var5 = (Direction)var4.getValue(BedBlock.FACING);
                        if (!a(var1.level(), var3, var5)) {
                            var1.displayClientMessage(
                                Component.literal("For Galath and Manglelie to ")
                                    .withStyle(ChatFormatting.GRAY)
                                    .append(Component.literal("wake you up with a blowjob").withStyle(ChatFormatting.DARK_RED))
                                    .append(Component.literal(", you have to provide enough space to the ").withStyle(ChatFormatting.GRAY))
                                    .append(Component.literal("right side").withStyle(ChatFormatting.DARK_RED))
                                    .append(Component.literal(" of your bed. This includes the ").withStyle(ChatFormatting.GRAY))
                                    .append(Component.literal("top and bottom half").withStyle(ChatFormatting.DARK_RED))
                                    .append(Component.literal(" of the bed.").withStyle(ChatFormatting.GRAY)),
                                false
                            );
                        } else {
                            float var6 = switch (var5) {
                                case NORTH -> 180.0F;
                                case EAST -> -90.0F;
                                case WEST -> 90.0F;
                                default -> 0.0F;
                            };
                            Vec3 var7 = new Vec3(var3.getX() + 0.5, var3.getY(), var3.getZ() + 0.5);
                            UUID var8 = com.trolmastercard.sexmod.n.a.a(var1);
                            if (var8 != null) {
                                k var9 = com.trolmastercard.sexmod.f.b.k.t(var8);
                                if (var9 instanceof e) {
                                    com.trolmastercard.sexmod.n.a.b((e)var9);
                                }
                            }

                            e var10 = com.trolmastercard.sexmod.f.b.e.a(var1.level(), var1, var2, true);
                            if (var10 != null) {
                                var10.moveTo(var2.x, var2.y, var2.z, var10.getYRot(), var10.getXRot());
                                var1.level().addFreshEntity(var10);
                                com.trolmastercard.sexmod.n.a.a(var1, var10);
                                var10.l();
                                var10.d(var7);
                                var10.a_(var6);
                                var10.d(true);
                                var10.q(var1.getUUID());
                                var10.c(com.trolmastercard.sexmod.f.j.cl);
                                b.add(new e.b.a(var1.getUUID(), var2, 10));
                            }
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onServerTickPost(Post var0) {
            if (!b.isEmpty()) {
                Iterator var1 = b.iterator();

                while (var1.hasNext()) {
                    e.b.a var2 = (e.b.a)var1.next();
                    if (--var2.c <= 0) {
                        var1.remove();
                        ServerPlayer var3 = var0.getServer().getPlayerList().getPlayer(var2.a);
                        if (var3 != null) {
                            var3.teleportTo(var2.b.x, var2.b.y, var2.b.z);
                        }
                    }
                }
            }
        }

        private static final class a {
            final UUID a;
            final Vec3 b;
            int c;

            a(UUID var1, Vec3 var2, int var3) {
                this.a = var1;
                this.b = var2;
                this.c = var3;
            }
        }
    }
}
