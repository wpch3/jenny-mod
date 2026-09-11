package com.trolmastercard.sexmod.f.c;

import com.trolmastercard.sexmod.f.c;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public abstract class b extends c.a {
    public static final EntityDataAccessor<String> l = SynchedEntityData.defineId(b.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<BlockPos> m = SynchedEntityData.defineId(b.class, EntityDataSerializers.BLOCK_POS);
    public static final EntityDataAccessor<String> n = SynchedEntityData.defineId(b.class, EntityDataSerializers.STRING);
    boolean o = true;
    String p = null;
    String q = null;
    BlockPos r = null;

    protected b(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(l, "");
        var1.define(m, BlockPos.ZERO);
        var1.define(n, this.a(new StringBuilder()));
    }

    protected abstract String a(StringBuilder var1);

    @Override
    public void tick() {
        super.tick();
        this.u();
        if (this.o) {
            if (this.level().isClientSide()) {
                this.v();
                this.o = true;
            } else {
                Player var1 = this.q();
                if (var1 != null) {
                    this.o = false;
                    CompoundTag var2 = var1.getPersistentData();
                    String var3 = var2.getString("sexmod:GirlSpecific" + com.trolmastercard.sexmod.f.h.a(this));
                    if (!"".equals(var3)) {
                        this.a(com.trolmastercard.sexmod.f.b.k.f(var3));
                    }
                }
            }
        }
    }

    void u() {
        if (this.level().isClientSide()) {
            String var1 = (String)this.entityData.get(l);
            String var2 = (String)this.entityData.get(n);
            BlockPos var3 = (BlockPos)this.entityData.get(m);
            if (this.p == null) {
                this.p = var1;
                this.q = var2;
                this.r = var3;
            } else {
                if (!this.q.equals(var2) || !this.p.equals(var1) || !this.r.equals(var3)) {
                    this.v();
                }

                this.p = var1;
                this.q = var2;
                this.r = var3;
            }
        }
    }

    protected abstract void v();
}
