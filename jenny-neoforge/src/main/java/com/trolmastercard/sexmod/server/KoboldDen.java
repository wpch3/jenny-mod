package com.trolmastercard.sexmod.server;

import com.trolmastercard.sexmod.entity.ScenePose;
import com.trolmastercard.sexmod.entity.KoboldEntity;
import com.trolmastercard.sexmod.entity.GirlEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class KoboldDen {
    BlockPos a;
    KoboldDen.a b;
    HashSet<BlockPos> c;
    List<KoboldEntity> d = new ArrayList<>();
    Direction e = Direction.NORTH;

    public KoboldDen(BlockPos var1, KoboldDen.a var2, HashSet<BlockPos> var3) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
    }

    public KoboldDen(BlockPos var1, KoboldDen.a var2, HashSet<BlockPos> var3, Direction var4) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
        this.e = var4;
    }

    public Direction a() {
        return this.e;
    }

    public BlockPos b() {
        return this.a;
    }

    public KoboldDen.a c() {
        return this.b;
    }

    public HashSet<BlockPos> d() {
        return this.c;
    }

    public void a(HashSet<BlockPos> var1) {
        this.c.addAll(var1);
    }

    public void a(BlockPos var1) {
        this.c.remove(var1);
    }

    public void b(HashSet<BlockPos> var1) {
        if (!var1.isEmpty()) {
            this.c.removeAll(var1);
        }
    }

    public boolean b(BlockPos var1) {
        return this.c.contains(var1);
    }

    public boolean a(KoboldEntity var1) {
        if (this.b.c <= this.d.size()) {
            return false;
        }

        this.d.add(var1);
        return true;
    }

    public List<KoboldEntity> e() {
        return this.d;
    }

    public void f() {
        for (KoboldEntity var2 : this.d) {
            if (var2.al() == null) {
                var2.setNoGravity(false);
                var2.noPhysics = false;
                var2.c(ScenePose.a);
                var2.getEntityData().set(GirlEntity.ap, false);
            }
        }

        this.d.clear();
    }

    public void b(KoboldEntity var1) {
        this.d.remove(var1);
    }

    public boolean c(KoboldEntity var1) {
        return this.d.contains(var1);
    }

    public static HashSet<BlockPos> a(Level var0, BlockPos var1, UUID var2) {
        BlockPos var3 = var1;

        while (!b(var0, var3)) {
            var3 = var1.below();
        }

        BlockPos var4 = var1;

        while (!a(var0, var4)) {
            var4 = var4.above();
        }

        HashSet var5 = new HashSet();
        int var6 = var4.getY() - var3.getY();

        for (int var7 = 0; var7 <= var6; var7++) {
            var5.add(var3.offset(0, var7, 0));
        }

        HashSet var15 = c(var0, var3);
        HashSet var8 = new HashSet();

        for (BlockPos var10 : var15) {
            if (var10.getX() == var3.getX() && var10.getZ() == var3.getZ()) {
                var8.add(var10);
            }
        }

        for (BlockPos var18 : var8) {
            var15.remove(var18);
        }

        var5.addAll(var15);
        HashSet var17 = new HashSet();

        for (BlockPos var11 : var5) {
            for (KoboldDen var13 : com.trolmastercard.sexmod.server.TribeData.j(var2)) {
                HashSet var14 = var13.d();
                if (var14.contains(var11)) {
                    var17.add(var11);
                    break;
                }
            }
        }

        var5.removeAll(var17);
        KoboldDen var20 = new KoboldDen(var3, KoboldDen.a.a, var5);
        com.trolmastercard.sexmod.server.TribeData.b(var2, var20);
        return var5;
    }

    static boolean a(Level var0, BlockPos var1) {
        BlockState var2 = var0.getBlockState(var1.above());
        return !var2.is(BlockTags.LOGS);
    }

    static boolean b(Level var0, BlockPos var1) {
        BlockState var2 = var0.getBlockState(var1.below());
        return !var2.is(BlockTags.LOGS) && !var2.isAir();
    }

    static HashSet<BlockPos> c(Level var0, BlockPos var1) {
        return a(var0, var1, new HashSet<>());
    }

    static HashSet<BlockPos> a(Level var0, BlockPos var1, HashSet<BlockPos> var2) {
        if (var2.contains(var1)) {
            return new HashSet<>();
        }

        var2.add(var1);
        if (var0.getBlockState(var1.offset(1, 0, 0)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(1, 0, 0), var2));
        }

        if (var0.getBlockState(var1.offset(-1, 0, 0)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(-1, 0, 0), var2));
        }

        if (var0.getBlockState(var1.offset(0, 0, 1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(0, 0, 1), var2));
        }

        if (var0.getBlockState(var1.offset(0, 0, -1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(0, 0, -1), var2));
        }

        if (var0.getBlockState(var1.offset(1, 0, 1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(1, 0, 1), var2));
        }

        if (var0.getBlockState(var1.offset(-1, 0, -1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(-1, 0, -1), var2));
        }

        if (var0.getBlockState(var1.offset(-1, 0, 1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(-1, 0, 1), var2));
        }

        if (var0.getBlockState(var1.offset(1, 0, -1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(1, 0, -1), var2));
        }

        if (var0.getBlockState(var1.offset(0, 1, 0)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(0, 1, 0), var2));
        }

        if (var0.getBlockState(var1.offset(1, 1, 0)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(1, 1, 0), var2));
        }

        if (var0.getBlockState(var1.offset(-1, 1, 0)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(-1, 1, 0), var2));
        }

        if (var0.getBlockState(var1.offset(0, 1, 1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(0, 1, 1), var2));
        }

        if (var0.getBlockState(var1.offset(0, 1, -1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(0, 1, -1), var2));
        }

        if (var0.getBlockState(var1.offset(1, 1, 1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(1, 1, 1), var2));
        }

        if (var0.getBlockState(var1.offset(-1, 1, -1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(-1, 1, -1), var2));
        }

        if (var0.getBlockState(var1.offset(-1, 1, 1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(-1, 1, 1), var2));
        }

        if (var0.getBlockState(var1.offset(1, 1, -1)).is(BlockTags.LOGS)) {
            var2.addAll(a(var0, var1.offset(1, 1, -1), var2));
        }

        return var2;
    }

    public enum a {
        a(1),
        b(3);

        int c;

        a(int var3) {
            this.c = var3;
        }
    }
}
