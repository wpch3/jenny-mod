package com.trolmastercard.sexmod.f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public enum i {
    a(
        var0 -> {
            Level var1 = var0.level();
            BlockPos var2 = var0.blockPosition();
            LivingEntity var3 = var0.p();
            if (var3 != null) {
                BlockPos var4 = var3.blockPosition();
                ArrayList var5 = new ArrayList();
                HashMap var6 = new HashMap();
                int var7 = 0;
                boolean var8 = !var1.isEmptyBlock(var2.below());

                for (int var9 = -10; var9 < 10; var9++) {
                    for (int var10 = -10; var10 < 10; var10++) {
                        for (int var11 = -10; var11 < 10; var11++) {
                            if (var9 != 0 || var10 != 0 || var11 != 0) {
                                BlockPos var12 = var4.offset(var9, var10, var11);
                                if ((!var8 || var2.getY() < var12.getY())
                                    && var1.isEmptyBlock(var12)
                                    && var1.isEmptyBlock(var12.above())
                                    && var1.isEmptyBlock(var12.above().above())) {
                                    BlockHitResult var13 = var1.clip(
                                        new ClipContext(Vec3.atLowerCornerOf(var2), Vec3.atLowerCornerOf(var12), Block.COLLIDER, Fluid.NONE, var0)
                                    );
                                    if (var13 == null || var13.getType() != Type.BLOCK) {
                                        int var14 = var12.getY();

                                        do {
                                            var14--;
                                        } while (
                                            var14 >= var1.getMinBuildHeight() && var1.getBlockState(new BlockPos(var12.getX(), var14, var12.getZ())).isAir()
                                        );

                                        BlockState var15 = var1.getBlockState(new BlockPos(var12.getX(), var14, var12.getZ()));
                                        if (!var15.liquid()) {
                                            var5.add(var12);
                                            if (var1.isEmptyBlock(var12.below())
                                                && var1.isEmptyBlock(var12.below().below())
                                                && !(Math.sqrt(var4.distSqr(var12)) < 5.0)
                                                && !(Math.sqrt(var2.distSqr(var12)) < 3.0)) {
                                                int var16 = 0;

                                                for (int var17 = -1; var17 < 2; var17++) {
                                                    for (int var18 = -1; var18 < 2; var18++) {
                                                        for (int var19 = -1; var19 < 4; var19++) {
                                                            if (var1.isEmptyBlock(var12.offset(var17, var19, var18))) {
                                                                var16++;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (var16 >= 25) {
                                                    var6.put(var12, var16);
                                                    if (var16 > var7) {
                                                        var7 = var16;
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

                if (!var6.isEmpty()) {
                    ArrayList var20 = new ArrayList(var6.entrySet());
                    var20.sort((var0x, var1x) -> ((Integer)var1x.getValue()).compareTo((Integer)var0x.getValue()));
                    var0.q = Vec3.atLowerCornerOf((Vec3i)((Entry)var20.get(com.trolmastercard.sexmod.m.j.a(var20.size() - 1))).getKey());
                } else if (var5.isEmpty()) {
                    var0.q = Vec3.atLowerCornerOf(var4)
                        .add(
                            com.trolmastercard.sexmod.m.j.a(10.0F, true),
                            com.trolmastercard.sexmod.m.j.a(10.0F, false),
                            com.trolmastercard.sexmod.m.j.a(10.0F, true)
                        );
                } else {
                    var0.q = Vec3.atLowerCornerOf((Vec3i)var5.get(com.trolmastercard.sexmod.d.f.a.nextInt(var5.size())));
                }

                var0.r = null;
                var0.b(0);
                var0.c(com.trolmastercard.sexmod.f.j.bH);
            }
        },
        var0 -> {
            Vec3 var1 = var0.position();
            Vec3 var2 = var0.q;
            if (var2 != null) {
                var0.r = var1;
                int var3 = var0.o();
                var0.b(var3 + 1);
                if (var3 == 0) {
                    Vec3 var4 = var2.subtract(var1).normalize();
                    var0.setDeltaMovement(var4.x * 0.6, com.trolmastercard.sexmod.m.j.b(var2.subtract(var1).y * 0.6, -0.6, 0.6), var4.z * 0.6);
                }
            }
        },
        var0 -> var0.o() > 23,
        var0 -> {
            var0.e(Vec3.ZERO);
            var0.b(0);
            var0.r = null;
        },
        false,
        var0 -> true,
        false
    ),
    b(var0 -> {
        var0.c(com.trolmastercard.sexmod.f.j.bI);
        var0.F = 0;
        var0.getEntityData().set(com.trolmastercard.sexmod.f.b.e.f, true);
        var0.getEntityData().set(com.trolmastercard.sexmod.f.b.e.g, true);
        var0.getEntityData().set(com.trolmastercard.sexmod.f.b.e.h, var0.getRandom().nextBoolean());
        com.trolmastercard.sexmod.i.e.a(var0, "galath", "strongcharge");
    }, var0 -> {
        var0.e(Vec3.ZERO);
        if (var0.F == 30) {
            com.trolmastercard.sexmod.f.b.e.a(var0, 0.0F);
            LivingEntity var1 = var0.p();
            if (var1 != null) {
                Vec3 var2 = var0.position();
                Vec3 var3 = var1.position();
                RandomSource var4 = var0.getRandom();
                boolean var5 = (Boolean)var0.getEntityData().get(com.trolmastercard.sexmod.f.b.e.h);
                if ((Boolean)var0.getEntityData().get(com.trolmastercard.sexmod.f.b.e.f)) {
                    Vec3 var6 = var5 ? com.trolmastercard.sexmod.m.o.a(com.trolmastercard.sexmod.f.b.e.b) : com.trolmastercard.sexmod.f.b.e.b;
                    com.trolmastercard.sexmod.f.b.e.a(var0, var2, var3, var6, var4);
                }

                if ((Boolean)var0.getEntityData().get(com.trolmastercard.sexmod.f.b.e.g)) {
                    Vec3 var7 = var5 ? com.trolmastercard.sexmod.m.o.a(com.trolmastercard.sexmod.f.b.e.c) : com.trolmastercard.sexmod.f.b.e.c;
                    com.trolmastercard.sexmod.f.b.e.a(var0, var2, var3, var7, var4);
                }
            }
        }
    }, var0 -> var0.F >= 45, var0 -> var0.F = 0, true, var0 -> var0.u.size() < 2, true),
    c(var0 -> {
        var0.a(0);
        var0.c(com.trolmastercard.sexmod.f.j.bJ);
        var0.e(Vec3.ZERO);
        Vec3 var1 = var0.position();
        var0.a(var1);
        LivingEntity var2 = var0.p();
        if (var2 != null) {
            Vec3 var3 = var2.position();
            com.trolmastercard.sexmod.m.m var4 = new com.trolmastercard.sexmod.m.m(var3.x - var1.x, var3.z - var1.z);
            double var5 = com.trolmastercard.sexmod.m.a.a(Math.atan2(var4.b, var4.a)) - 90.0;
            var0.d(true);
            var0.d(var1);
            var0.a_((float)var5);
            com.trolmastercard.sexmod.i.e.a(var0, "galath", "strongcharge");
        }
    }, var0 -> {
        LivingEntity var1 = var0.p();
        if (var1 != null) {
            int var2 = var0.n() + 1;
            var0.a(var2);
            if (com.trolmastercard.sexmod.m.j.a(var2, 24.0, 32.0)) {
                Vec3 var12 = var1.position().add(0.0, var1.getEyeHeight(), 0.0);
                com.trolmastercard.sexmod.m.m var13 = new com.trolmastercard.sexmod.m.m(var12.x - var0.getX(), var12.z - var0.getZ());
                double var5 = com.trolmastercard.sexmod.m.a.a(Math.atan2(var13.b, var13.a)) - 90.0;
                var0.a_((float)var5);
                Vec3 var7 = com.trolmastercard.sexmod.m.o.a(new Vec3(0.0, 0.0, 3.0), (float)(var5 + 180.0));
                Vec3 var8 = var0.m();
                Vec3 var9 = var12.add(var7);
                float var10 = (var2 - 24) / 8.0F;
                var0.d(com.trolmastercard.sexmod.m.i.a(var8, var9, var10));
            } else if (com.trolmastercard.sexmod.m.j.a(var2, 32.0, 54.0)) {
                Vec3 var11 = com.trolmastercard.sexmod.m.o.a(new Vec3(0.0, 0.0, 1.5), var0.e_() + 180.0F);
                var0.d(var1.position().add(var11));
                com.trolmastercard.sexmod.m.d var4 = new com.trolmastercard.sexmod.m.d(var0);
                var1.hurtTime = 0;
                var1.invulnerableTime = 0;
                if (var2 == 36) {
                    var1.hurt(var4, 5.0F);
                }

                if (var2 == 40) {
                    var1.hurt(var4, 5.0F);
                }
            } else if (var2 == 54) {
                var0.d(false);
                var0.c(com.trolmastercard.sexmod.f.j.bH);
                Vec3 var3 = var0.m().subtract(var0.position()).normalize();
                var0.setDeltaMovement(var3.x * 0.6, var3.y * 0.6, var3.z * 0.6);
                var0.b(1);
            } else {
                var0.b(var0.o() + 1);
            }
        }
    }, var0 -> var0.o() > 23, var0 -> {
        var0.b(0);
        var0.e(Vec3.ZERO);
        var0.a(-1);
        var0.d(false);
    }, true, var0 -> true, false),
    d(
        var0 -> {
            var0.c(com.trolmastercard.sexmod.f.j.bN);
            var0.t = 0;
            var0.s = null;
            var0.q = null;
            var0.getEntityData().set(com.trolmastercard.sexmod.f.b.e.l, 0.0F);
        },
        var0 -> {
            if (++var0.t >= 48) {
                var0.c(com.trolmastercard.sexmod.f.j.bO);
                LivingEntity var1 = var0.p();
                if (var1 != null) {
                    if (var0.s == null) {
                        var0.q = var1.position().add(0.0, var1.getEyeHeight() / 2.0F, 0.0);
                        var0.s = var0.position();
                        Vec3 var2 = var1.position().subtract(var0.position()).normalize();
                        var0.a_((float)(com.trolmastercard.sexmod.m.a.a(Math.atan2(var2.z, var2.x)) - 90.0));
                    }

                    Vec3 var17 = var0.position();
                    AABB var3 = new AABB(var17.x - 0.65, var17.y - 0.65, var17.z - 0.65, var17.x + 0.65, var17.y + 0.65, var17.z + 0.65);

                    for (Player var6 : var0.level().getEntitiesOfClass(Player.class, var3)) {
                        if (!var6.isRemoved() && var6.onGround() && com.trolmastercard.sexmod.f.b.k.a(var6.getUUID(), true) == null) {
                            Vec3 var7 = var17.subtract(var6.position());
                            Vec3 var8 = com.trolmastercard.sexmod.m.o.a(var7, var0.e_());
                            if (!(Math.abs(var8.x) > 0.65)) {
                                for (Entity var10 : var0.u) {
                                    var10.discard();
                                }

                                var0.u.clear();
                                var0.d(var6.position());
                                var0.q(var6.getUUID());
                                var0.d(true);
                                var0.c(com.trolmastercard.sexmod.f.j.bQ);
                                float var23 = Mth.floor((var0.e_() + 180.0F) * 256.0F / 360.0F) * 360.0F / 256.0F;
                                var6.setDeltaMovement(0.0, 0.0, 0.0);
                                var6.hurtMarked = true;
                                var6.moveTo(var6.getX(), var6.getY(), var6.getZ(), var23, -19.6875F);
                                return;
                            }
                        }
                    }

                    Vec3 var18 = var0.s;
                    Vec3 var19 = var0.q;
                    Vec3 var20 = var19.subtract(var18);
                    Vec3 var21 = var19.add(var20);
                    var21 = new Vec3(var21.x, var18.y, var21.z);
                    boolean var24 = var17.distanceTo(new Vec3(var18.x, var17.y, var18.z)) > var17.distanceTo(new Vec3(var21.x, var17.y, var21.z));
                    double var12;
                    double var25;
                    if (var24) {
                        var25 = com.trolmastercard.sexmod.m.o.a(var19, var21, var17);
                        var12 = var19.distanceTo(var21);
                    } else {
                        var25 = com.trolmastercard.sexmod.m.o.a(var18, var19, var17);
                        var12 = var18.distanceTo(var19);
                    }

                    double var14 = var12 / 0.05;
                    var25 += 1.0 / var14 * 20.0;
                    if (!var24 && var25 < 0.9) {
                        var0.q = var1.position().add(0.0, var1.getEyeHeight() / 2.0F, 0.0);
                    }

                    Vec3 var16 = var24
                        ? new Vec3(
                            com.trolmastercard.sexmod.m.i.a(var19.x, var21.x, Math.min(1.0, var25)),
                            com.trolmastercard.sexmod.m.i.a(var19.y, var21.y, Math.min(1.0, com.trolmastercard.sexmod.m.i.c(var25))),
                            com.trolmastercard.sexmod.m.i.a(var19.z, var21.z, Math.min(1.0, var25))
                        )
                        : new Vec3(
                            com.trolmastercard.sexmod.m.i.a(var18.x, var19.x, var25),
                            com.trolmastercard.sexmod.m.i.a(var18.y, var19.y, com.trolmastercard.sexmod.m.i.a(var25)),
                            com.trolmastercard.sexmod.m.i.a(var18.z, var19.z, var25)
                        );
                    var0.setPos(var16.x, var16.y, var16.z);
                    if (var24) {
                        var0.getEntityData().set(com.trolmastercard.sexmod.f.b.e.l, (float)var25);
                    }
                }
            }
        },
        var0 -> {
            if (var0.ai() == com.trolmastercard.sexmod.f.j.bQ) {
                return true;
            }

            Vec3 var1 = var0.s;
            Vec3 var2 = var0.q;
            if (var1 == null) {
                return false;
            }

            Vec3 var3 = var2.subtract(var1);
            Vec3 var4 = var2.add(var3);
            var4 = new Vec3(var4.x, var1.y, var4.z);
            return var0.distanceToSqr(var4.x, var4.y, var4.z) < 0.010000000000000002;
        },
        var0 -> {
            var0.q = null;
            var0.s = null;
            var0.t = 0;
            var0.getEntityData().set(com.trolmastercard.sexmod.f.b.e.l, 0.0F);
        },
        true,
        var0 -> true,
        true
    );

    final l e;
    final k f;
    final m g;
    final n h;
    final o i;
    public final boolean j;
    public final boolean k;

    i(k var3, m var4, l var5, n var6, boolean var7, o var8, boolean var9) {
        this.e = var5;
        this.f = var3;
        this.g = var4;
        this.h = var6;
        this.j = var7;
        this.i = var8;
        this.k = var9;
    }

    public void a(com.trolmastercard.sexmod.f.b.e var1) {
        this.f.a(var1);
    }

    public boolean b(com.trolmastercard.sexmod.f.b.e var1) {
        return this.e.a(var1);
    }

    public void c(com.trolmastercard.sexmod.f.b.e var1) {
        this.g.a(var1);
    }

    public void d(com.trolmastercard.sexmod.f.b.e var1) {
        this.h.a(var1);
    }

    public boolean e(com.trolmastercard.sexmod.f.b.e var1) {
        return this.i.a(var1);
    }
}
