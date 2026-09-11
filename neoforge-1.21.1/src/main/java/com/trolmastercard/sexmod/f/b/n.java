package com.trolmastercard.sexmod.f.b;

import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;

public abstract class n extends k {
    public static final EntityDataAccessor<String> U = SynchedEntityData.defineId(n.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<BlockPos> V = SynchedEntityData.defineId(n.class, EntityDataSerializers.BLOCK_POS);
    public static final EntityDataAccessor<String> W = SynchedEntityData.defineId(n.class, EntityDataSerializers.STRING);
    private String a = null;
    private String b = null;
    private BlockPos c = null;

    protected n(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(U, "");
        var1.define(V, BlockPos.ZERO);
        var1.define(W, this.a(new StringBuilder()));
    }

    @Override
    public void tick() {
        super.tick();
        this.L();
    }

    void L() {
        if (this.level().isClientSide()) {
            String var1 = (String)this.entityData.get(U);
            String var2 = (String)this.entityData.get(W);
            BlockPos var3 = (BlockPos)this.entityData.get(V);
            if (this.a == null) {
                this.a = var1;
                this.b = var2;
                this.c = var3;
            } else {
                if (!this.b.equals(var2) || !this.a.equals(var1) || !this.c.equals(var3)) {
                    this.e();
                }

                this.a = var1;
                this.b = var2;
                this.c = var3;
            }
        }
    }

    protected abstract void e();

    protected abstract String a(StringBuilder var1);

    public static void b(StringBuilder var0, int var1) {
        if (var1 < 10) {
            var0.append(0);
        }

        var0.append(var1);
        var0.append("-");
    }

    public static void c(StringBuilder var0, int var1) {
        int var2 = com.trolmastercard.sexmod.d.f.a.nextInt(var1 + 1);
        if (var2 < 10) {
            var0.append(0);
        }

        var0.append(var2);
        var0.append("-");
    }

    public static void b(StringBuilder var0) {
        double var1 = com.trolmastercard.sexmod.d.f.a.nextDouble();
        double var3 = Math.pow(Math.E, -Math.pow(-2.5 + 5.0 * var1, 2.0));
        String var5 = String.format("%.2f", var3);
        String[] var6 = var5.split("\\.");
        if (var6.length < 2) {
            var6 = var5.split(",");
        }

        var5 = var6[1];
        var0.append(var5).append("-");
    }

    public static void d(StringBuilder var0, int var1) {
        int var2 = com.trolmastercard.sexmod.d.f.a.nextInt(var1);
        if (var2 < 10) {
            var0.append(0);
        }

        var0.append(var2);
        var0.append("-");
    }

    public static String[] f(k var0) {
        return ((String)var0.getEntityData().get(W)).split("-");
    }
}
