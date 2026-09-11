package com.trolmastercard.sexmod.entity.player;

import com.trolmastercard.sexmod.entity.FriendlySlimeEntity;
import com.trolmastercard.sexmod.network.ResetPlayablePayload;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public abstract class PlayerGirlEntity extends com.trolmastercard.sexmod.entity.HumanoidGirlEntity {
    public static boolean a = true;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public static final EntityDataAccessor<String> g = SynchedEntityData.defineId(PlayerGirlEntity.class, EntityDataSerializers.STRING);
    public static Hashtable<UUID, PlayerGirlEntity> h = new Hashtable<>();
    public static List<PlayerGirlEntity> i = new ArrayList<>();
    int j = -1;
    public boolean k = true;

    protected PlayerGirlEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
        PlayerJennyEntity.add(this);
    }

    public void b(UUID var1) {
        this.entityData.set(g, var1 == null ? "" : var1.toString());
    }

    public static void a(ServerPlayer var0, EntityType<? extends PlayerGirlEntity> var1) {
        if (var0.level() instanceof ServerLevel var2) {
            b(var0);
            PlayerGirlEntity var4 = (PlayerGirlEntity)var1.create(var2);
            if (var4 != null) {
                var4.b(var0.getUUID());
                var4.setNoGravity(true);
                var4.noPhysics = true;
                var4.setDeltaMovement(Vec3.ZERO);
                var4.setPos(var0.getX(), var0.getY(), var0.getZ());
                var2.addFreshEntity(var4);
                var4.r();
                s();
                var0.setInvisible(true);
            }
        }
    }

    public static void b(ServerPlayer var0) {
        s();
        PlayerGirlEntity var1 = c(var0.getUUID());
        if (var1 == null) {
            var0.setInvisible(false);
        } else {
            ResetPlayablePayload.a(var1);
            var0.setInvisible(false);
            var1.discard();
        }
    }

    @Nullable
    public static PlayerGirlEntity c(UUID var0) {
        return PlayerGoblinEntity.get(var0);
    }

    public boolean isPickable() {
        return false;
    }

    public boolean h(String var1) {
        return false;
    }

    @Override
    public String a() {
        UUID var1 = this.p();
        if (var1 != null) {
            Player var2 = this.level().getPlayerByUUID(var1);
            if (var2 != null) {
                return var2.getName().getString();
            }
        }

        return "anonymous horny girl";
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(g, "");
    }

    @Override
    public void f_() {
        this.ah = null;
        this.setNoGravity(false);
        if (this.level().isClientSide()) {
            this.b_();
        }
    }

    @Override
    protected void b_() {
        if (this.aB() || this.m()) {
            com.trolmastercard.sexmod.client.ClientUtils.f();
            this.entityData.set(ap, false);
            com.trolmastercard.sexmod.client.ClientUtils.a(new ResetPlayablePayload(this.ah()));
        }
    }

    protected void a(boolean var1) {
        if (a) {
            UUID var2 = this.p();
            if (var2 != null) {
                Player var3 = this.level().getPlayerByUUID(var2);
                if (var3 != null) {
                    var3.getAbilities().mayfly = var1;
                    if (!var1) {
                        var3.getAbilities().flying = false;
                    }

                    var3.onUpdateAbilities();
                }
            }
        }
    }

    public static boolean d(UUID var0) {
        s();

        for (Entry var2 : PlayerGoblinEntity.entrySet()) {
            if (var0.equals(var2.getKey())) {
                return true;
            }
        }

        return false;
    }

    public static boolean b(Player var0) {
        return var0 == null ? false : d(var0.getUUID());
    }

    protected Player e() {
        Player var1 = null;
        UUID var2 = this.p();

        for (Player var4 : this.level().players()) {
            if (var2 == null || !var4.getUUID().equals(var2)) {
                if (var1 == null) {
                    var1 = var4;
                } else {
                    double var5 = var1.distanceToSqr(this.l().x, this.l().y, this.l().z);
                    double var7 = var4.distanceToSqr(this.l().x, this.l().y, this.l().z);
                    if (var7 < var5) {
                        var1 = var4;
                    }
                }
            }
        }

        return var1;
    }

    public Vec3 l() {
        return new Vec3(this.getX(), this.getY(), this.getZ());
    }

    @Override
    public void tick() {
        this.noPhysics = true;
        this.setNoGravity(true);
        super.tick();
        this.n();
        if (this.level().isClientSide()) {
            s();
        }
    }

    public boolean m() {
        UUID var1 = this.p();
        return var1 == null ? false : com.trolmastercard.sexmod.client.ClientUtils.a(var1);
    }

    void c(Player var1) {
        String var2 = var1.getPersistentData().getString("sexmod:CustomModel" + com.trolmastercard.sexmod.entity.NpcType.a(this));
        if (!"".equals(var2)) {
            this.b(var2);
        }
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        s();
        this.at();
        this.as();
        UUID var2 = this.p();
        if (var2 != null) {
            Player var3 = this.level().getPlayerByUUID(var2);
            if (var3 == null) {
                this.teleportTo(this.getX(), 0.0, this.getZ());
            } else {
                this.c(var3);
                if (this.an()) {
                    Vec3 var4 = this.am();
                    this.teleportTo(var4.x, var4.y, var4.z);
                } else {
                    this.teleportTo(var3.getX(), var3.getY(), var3.getZ());
                }

                com.trolmastercard.sexmod.entity.ScenePose var5 = this.ai();
                if (var5 == com.trolmastercard.sexmod.entity.ScenePose.a && var3.swinging) {
                    this.c(com.trolmastercard.sexmod.entity.ScenePose.A);
                } else if (var5 == com.trolmastercard.sexmod.entity.ScenePose.A && !var3.swinging) {
                    this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
                }
            }
        }
    }

    void n() {
        if (this.j != -1) {
            this.j++;
            if (!this.level().isClientSide() && this.j == 65) {
                this.d(this.aj() != 0 ? 1 : 0);
            }

            if (this.j >= 100) {
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.n) {
                    if (this.level().isClientSide()) {
                        this.o();
                    } else {
                        this.c(com.trolmastercard.sexmod.entity.ScenePose.a);
                    }
                }
            }
        }
    }

    void o() {
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
    }

    public UUID p() {
        String var1 = (String)this.entityData.get(g);
        return var1 != null && !var1.isEmpty() ? UUID.fromString(var1) : null;
    }

    @Nullable
    public Player q() {
        UUID var1 = this.p();
        return var1 == null ? null : this.level().getPlayerByUUID(var1);
    }

    public void r() {
    }

    public static void s() {
        ArrayList var0 = new ArrayList();

        for (PlayerGirlEntity var2 : i) {
            if (var2.p() != null) {
                PlayerGoblinEntity.put(var2.p(), var2);
                var0.add(var2);
            }
        }

        for (PlayerGirlEntity var4 : var0) {
            PlayerJennyEntity.remove(var4);
        }

        t();
    }

    static void t() {
        ArrayList var0 = new ArrayList();

        for (Entry var2 : PlayerGoblinEntity.entrySet()) {
            if (((PlayerGirlEntity)var2.getValue()).isRemoved()) {
                var0.add((UUID)var2.getKey());
            }
        }

        for (UUID var4 : var0) {
            PlayerGoblinEntity.remove(var4);
        }
    }

    protected boolean e(UUID var1) {
        return var1 == null ? false : c(var1) != null;
    }

    @Override
    public void a(String var1, UUID var2) {
        if (!this.h(var1)) {
            if (this.p() != null) {
                this.k = true;
            }
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag var1) {
        super.addAdditionalSaveData(var1);
        UUID var2 = this.p();
        if (var2 != null) {
            var1.putString("owner", var2.toString());
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        String var2 = var1.getString("owner");
        if (!var2.isEmpty()) {
            this.entityData.set(g, var2);
        }

        PlayerJennyEntity.add(this);
    }

    @Override
    protected void c_() {
    }
}
