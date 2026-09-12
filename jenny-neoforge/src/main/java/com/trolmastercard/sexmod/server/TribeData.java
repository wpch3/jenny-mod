package com.trolmastercard.sexmod.server;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.trolmastercard.sexmod.Sexmod;
import com.trolmastercard.sexmod.entity.KoboldDayPhase;
import com.trolmastercard.sexmod.entity.ScenePose;
import com.trolmastercard.sexmod.entity.KoboldEntity;
import com.trolmastercard.sexmod.entity.GirlEntity;
import com.trolmastercard.sexmod.entity.VariantGirlEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.UUIDUtil;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.datafix.DataFixTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Player.BedSleepingProblem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.saveddata.SavedData.Factory;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.CanPlayerSleepEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent.Post;
import com.trolmastercard.sexmod.util.ModState;

@EventBusSubscriber(modid = "sexmod")
public class TribeData {
    private static final HashMap<UUID, TribeData.a> e = new HashMap<>();
    static TribeData.b a;
    static final Vec3[] q = new Vec3[]{
        new Vec3(0.0, 0.0, 0.0), new Vec3(0.5, 0.0, 0.0), new Vec3(-0.5, 0.0, 0.0), new Vec3(0.0, 0.0, 0.5), new Vec3(0.0, 0.0, -0.5)
    };
    static HashMap<KoboldEntity, BlockPos[]> c = new HashMap<>();
    public static final Factory<TribeData.b> d = new Factory<>(TribeData.b::new, TribeData.b::a, DataFixTypes.LEVEL);

    static void a() {
        if (a != null) {
            a.setDirty();
        }
    }

    @SubscribeEvent
    public static void onServerTick(Post var0) {
        MinecraftServer var1 = var0.getServer();
        ServerLevel var2 = var1.overworld();
        if (var2 != null) {
            a(var2);
            ArrayList<UUID> var3 = new ArrayList<>();

            for (Entry var5 : e.entrySet()) {
                TribeData.a var6 = (TribeData.a)var5.getValue();
                if (var6.d.isEmpty() && var6.k.isEmpty()) {
                    var3.add((UUID)var5.getKey());
                }
            }

            if (!var3.isEmpty()) {
                for (UUID var8 : var3) {
                    e.remove(var8);
                }

                a();
            }
        }
    }

    @SubscribeEvent
    public static void onCanPlayerSleep(CanPlayerSleepEvent var0) {
        if (a(var0.getPos())) {
            var0.setProblem(BedSleepingProblem.OTHER_PROBLEM);
        }
    }

    public static void a(UUID var0, com.trolmastercard.sexmod.EyeAndKoboldColor var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 != null) {
            System.out.println("tribe of UUID " + var0.toString() + " does already exist lol");
        } else {
            e.put(var0, new TribeData.a(var0, var1));
            a();
        }
    }

    public static void a(Level var0, Vec3 var1) {
        UUID var2 = UUID.randomUUID();
        float[] var3 = new float[4];
        var3[0] = 0.25F;

        for (int var4 = 1; var4 < var3.length; var4++) {
            var3[var4] = KoboldEntity.b();
        }

        ArrayList<KoboldEntity> var10 = new ArrayList<>();

        for (float var8 : var3) {
            KoboldEntity var9 = KoboldEntity.a(var0, var2, var8);
            if (var9 != null) {
                var10.add(var9);
            }
        }

        com.trolmastercard.sexmod.EyeAndKoboldColor var11 = com.trolmastercard.sexmod.EyeAndKoboldColor.values()[ModState.a.nextInt(com.trolmastercard.sexmod.EyeAndKoboldColor.values().length)];
        a(var2, var11);

        for (KoboldEntity var14 : var10) {
            b(var2, var14);
        }

        if (!var10.isEmpty()) {
            a(var2, (KoboldEntity)var10.get(0));
        }

        int var13 = 0;

        for (KoboldEntity var16 : var10) {
            var16.setPos(var1.x + q[var13].x, var1.y, var1.z + q[var13].z);
            var0.addFreshEntity(var16);
            var13++;
        }
    }

    public static boolean a(UUID var0) {
        return e.get(var0) != null;
    }

    public static void a(UUID var0, UUID var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 != null) {
            var2.a(var1);
            a();
        }
    }

    public static void a(UUID var0, KoboldEntity var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
        } else {
            var2.c = var1;
        }
    }

    public static void b(UUID var0, KoboldEntity var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
        } else {
            var2.a(var1);
            e.replace(var0, var2);
            var1.getEntityData().set(KoboldEntity.i, var0.toString());
            if (!var1.G) {
                var1.getEntityData().set(VariantGirlEntity.U, var2.e.name());
            }
        }
    }

    public static void b(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
        } else {
            KoboldEntity var2 = var1.c;
            if (var2 == null || var2.isRemoved()) {
                var1.c = var1.f();
            }
        }
    }

    public static void c(UUID var0, KoboldEntity var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
        } else {
            var2.b(var1);
            var2.b(var1.ah());
            if (var2.c != null && var2.c.getId() == var1.getId()) {
                KoboldEntity var3 = var2.f();
                if (var3 != null) {
                    var2.c = var3;
                }
            }

            for (KoboldDen var4 : var2.m) {
                var4.b(var1);
            }

            if (!var2.d.isEmpty()) {
                e.replace(var0, var2);
                a();
            } else if (var1.aw()) {
                Player var6 = var1.ay();
                if (var6 != null) {
                    e.remove(var0);
                    a();
                }
            }
        }
    }

    @Nullable
    public static KoboldEntity c(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return null;
        } else {
            return var1.c;
        }
    }

    public static boolean d(UUID var0, KoboldEntity var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return false;
        } else {
            return var2.c == null ? false : var2.c.getId() == var1.getId();
        }
    }

    public static List<KoboldEntity> d(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return new ArrayList<>();
        } else {
            return var1.d;
        }
    }

    public static boolean e(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return false;
        }

        for (KoboldEntity var3 : var1.d) {
            if (var3.al() != null) {
                return true;
            }
        }

        return false;
    }

    public static int f(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return 0;
        } else {
            return var1.c();
        }
    }

    public static com.trolmastercard.sexmod.EyeAndKoboldColor g(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return com.trolmastercard.sexmod.EyeAndKoboldColor.d;
        } else {
            return var1.e;
        }
    }

    public static boolean a(BlockPos var0) {
        for (Entry var2 : c.entrySet()) {
            BlockPos[] var3 = (BlockPos[])var2.getValue();
            if (var3[0].equals(var0)) {
                return true;
            }

            if (var3[1].equals(var0)) {
                return true;
            }
        }

        return false;
    }

    public static BlockPos[] a(KoboldEntity var0) {
        return c.get(var0);
    }

    public static void a(KoboldEntity var0, BlockPos var1) {
        Level var2 = var0.level();
        BlockPos var3 = null;
        if (var2.getBlockState(var1.north()).getBlock() instanceof BedBlock) {
            var3 = var1.north();
        }

        if (var2.getBlockState(var1.east()).getBlock() instanceof BedBlock) {
            var3 = var1.east();
        }

        if (var2.getBlockState(var1.south()).getBlock() instanceof BedBlock) {
            var3 = var1.south();
        }

        if (var2.getBlockState(var1.west()).getBlock() instanceof BedBlock) {
            var3 = var1.west();
        }

        if (var3 == null) {
            System.out.println("bed @" + var1.toString() + " apparently doesn't have another half.. wtf");
        } else {
            c.put(var0, new BlockPos[]{var1, var3});
        }
    }

    public static void b(KoboldEntity var0) {
        c.remove(var0);
    }

    public static HashSet<BlockPos> h(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return new HashSet<>();
        } else {
            return var1.j;
        }
    }

    public static void a(UUID var0, BlockPos var1) {
        if (var1 != null) {
            TribeData.a var2 = e.get(var0);
            if (var2 == null) {
                System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            } else {
                var2.j.add(var1);
                a();
            }
        }
    }

    @Nullable
    public static HashSet<BlockPos> i(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return null;
        } else {
            return var1.i;
        }
    }

    public static void b(UUID var0, BlockPos var1) {
        if (var1 != null) {
            TribeData.a var2 = e.get(var0);
            if (var2 == null) {
                System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            } else {
                var2.i.add(var1);
                a();
            }
        }
    }

    @Nullable
    public static Collection<KoboldDen> j(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return null;
        } else {
            return var1.m;
        }
    }

    public static HashSet<BlockPos> a(UUID var0, KoboldDen var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return new HashSet<>();
        } else if (var1 != null) {
            var2.b(var1);
            return var1.c;
        } else {
            return new HashSet<>();
        }
    }

    public static HashSet<BlockPos> c(UUID var0, BlockPos var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return new HashSet<>();
        }

        KoboldDen var3 = null;

        for (KoboldDen var5 : var2.m) {
            if (var5.c.contains(var1)) {
                var3 = var5;
                break;
            }
        }

        return a(var0, var3);
    }

    public static void b(UUID var0, KoboldDen var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
        } else {
            var2.a(var1);
        }
    }

    public static void e(UUID var0, KoboldEntity var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
        } else {
            KoboldDen var3 = null;

            for (KoboldDen var5 : var2.m) {
                if (var5.c(var1)) {
                    var3 = var5;
                }
            }

            if (var3 == null) {
                System.out.println("task of worker " + var1.ah() + " not found uwu");
            } else {
                var2.b(var3);
            }
        }
    }

    public static KoboldDayPhase k(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return KoboldDayPhase.b;
        } else {
            return var1.e();
        }
    }

    public static void a(UUID var0, KoboldDayPhase var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
        } else {
            var2.a(var1);
        }
    }

    public static void d(UUID var0, BlockPos var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
        } else {
            var2.a(var1);
        }
    }

    @Nullable
    public static BlockPos l(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return null;
        } else {
            return var1.d();
        }
    }

    public static boolean m(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return false;
        } else {
            return var1.l;
        }
    }

    public static void a(UUID var0, String var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
        } else {
            var2.n = var1;
            a();
        }
    }

    public static void a(UUID var0, boolean var1) {
        TribeData.a var2 = e.get(var0);
        if (var2 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
        } else {
            var2.o = var1;
        }
    }

    @Nullable
    public static UUID n(UUID var0) {
        if (var0 == null) {
            return null;
        }

        for (Entry var2 : e.entrySet()) {
            TribeData.a var3 = (TribeData.a)var2.getValue();
            if ((var3.b().size() != 0 || var3.c() != 0) && var0.equals(((TribeData.a)var2.getValue()).a())) {
                return (UUID)var2.getKey();
            }
        }

        return null;
    }

    @Nullable
    public static UUID o(UUID var0) {
        TribeData.a var1 = e.get(var0);
        if (var1 == null) {
            System.out.println("tribe of UUID " + var0.toString() + " not found uwu");
            return null;
        }

        List var2 = var1.d;
        if (var2.isEmpty()) {
            return null;
        }

        KoboldEntity var3 = (KoboldEntity)var2.get(0);
        if (!var3.aw()) {
            return null;
        }

        String var4 = (String)((KoboldEntity)var2.get(0)).getEntityData().get(GirlEntity.ao);
        return UUID.fromString(var4);
    }

    public static TribeData.b a(ServerLevel var0) {
        TribeData.b var1 = (TribeData.b)var0.getDataStorage().computeIfAbsent(d, "sexmod_tribes");
        a = var1;
        return var1;
    }

    public static class a {
        UUID a;
        UUID b;
        KoboldEntity c;
        List<KoboldEntity> d;
        com.trolmastercard.sexmod.EyeAndKoboldColor e;
        KoboldDayPhase f = KoboldDayPhase.b;
        BlockPos g = null;
        HashSet<LivingEntity> h = new HashSet<>();
        HashSet<BlockPos> i = new HashSet<>();
        HashSet<BlockPos> j = new HashSet<>();
        HashMap<UUID, BlockPos> k = new HashMap<>();
        boolean l = false;
        Collection<KoboldDen> m = new ArrayList<>();
        String n = "";
        boolean o = false;

        public a(UUID var1, com.trolmastercard.sexmod.EyeAndKoboldColor var2) {
            this.a = var1;
            this.e = var2;
            this.d = new ArrayList<>();
        }

        public void a(UUID var1) {
            this.b = var1;
        }

        public UUID a() {
            return this.b;
        }

        public HashMap<UUID, BlockPos> b() {
            return this.k;
        }

        public void b(UUID var1) {
            this.k.remove(var1);
        }

        public int c() {
            HashSet var1 = new HashSet();

            for (KoboldEntity var3 : this.d) {
                var1.add(var3.ah());
            }

            for (Entry var5 : this.k.entrySet()) {
                var1.add((UUID)var5.getKey());
            }

            return var1.size();
        }

        public BlockPos d() {
            return this.g;
        }

        public void a(BlockPos var1) {
            this.g = var1;
        }

        public KoboldDayPhase e() {
            return this.f;
        }

        public void a(KoboldDayPhase var1) {
            this.f = var1;
        }

        public void a(KoboldDen var1) {
            this.m.add(var1);
        }

        public void b(KoboldDen var1) {
            if (this.m.contains(var1)) {
                for (KoboldEntity var3 : var1.e()) {
                    var3.c(ScenePose.a);
                    var3.setNoGravity(false);
                    var3.noPhysics = false;
                    var3.getEntityData().set(GirlEntity.ap, false);
                }

                this.m.remove(var1);
            }
        }

        public void a(KoboldEntity var1) {
            if (!this.d.contains(var1)) {
                UUID var2 = var1.ah();
                ArrayList<KoboldEntity> var3 = new ArrayList<>();

                for (KoboldEntity var5 : this.d) {
                    if (var5.ah().equals(var2)) {
                        var3.add(var5);
                    }
                }

                for (KoboldEntity var7 : var3) {
                    Sexmod.a.warn(String.format("Removed old entry of kobold called %s with UUID %s owned by %s", var7.a(), var7.ah(), this.b));
                    this.b(var7);
                }

                this.d.add(var1);
            }
        }

        public void b(KoboldEntity var1) {
            this.d.remove(var1);
        }

        KoboldEntity f() {
            KoboldEntity var1 = null;

            for (KoboldEntity var3 : this.d) {
                if (!var3.isRemoved()) {
                    if (var1 == null) {
                        var1 = var3;
                    } else {
                        float var4 = (Float)var1.getEntityData().get(KoboldEntity.b);
                        float var5 = (Float)var3.getEntityData().get(KoboldEntity.b);
                        if (var5 < var4) {
                            var1 = var3;
                        }
                    }
                }
            }

            return var1;
        }
    }

    public static class b extends SavedData {
        public static final Codec<TribeData.b> p = TribeData.b.a.a.listOf().xmap(var0 -> {
            for (TribeData.b.a var2 : var0) {
                com.trolmastercard.sexmod.server.TribeData.a(var2.b, var2.c);
                if (var2.d.isPresent()) {
                    com.trolmastercard.sexmod.server.TribeData.a(var2.b, var2.d.get());
                }

                for (BlockPos var4 : var2.e) {
                    com.trolmastercard.sexmod.server.TribeData.a(var2.b, var4);
                }

                for (BlockPos var6 : var2.f) {
                    com.trolmastercard.sexmod.server.TribeData.b(var2.b, var6);
                }

                if (!var2.g.isEmpty()) {
                    com.trolmastercard.sexmod.server.TribeData.a(var2.b, var2.g);
                }
            }

            return new TribeData.b();
        }, var0 -> {
            ArrayList var1 = new ArrayList();

            for (Entry var3 : com.trolmastercard.sexmod.server.TribeData.e.entrySet()) {
                TribeData.a var4 = (TribeData.a)var3.getValue();
                var1.add(new TribeData.b.a((UUID)var3.getKey(), var4.e, Optional.ofNullable(var4.a()), new ArrayList<>(var4.j), new ArrayList<>(var4.i), var4.n));
            }

            return var1;
        });

        public CompoundTag save(CompoundTag var1, Provider var2) {
            p.encodeStart(NbtOps.INSTANCE, this).result().ifPresent(var1x -> var1.put("tribes", var1x));
            return var1;
        }

        public static TribeData.b a(CompoundTag var0, Provider var1) {
            return p.parse(NbtOps.INSTANCE, var0.get("tribes")).result().orElseGet(TribeData.b::new);
        }

        public static final class a {
            private final UUID b;
            private final com.trolmastercard.sexmod.EyeAndKoboldColor c;
            private final Optional<UUID> d;
            private final List<BlockPos> e;
            private final List<BlockPos> f;
            private final String g;
            static final Codec<TribeData.b.a> a = RecordCodecBuilder.create(
                var0 -> var0.group(
                        UUIDUtil.CODEC.fieldOf("id").forGetter(TribeData.b.a::a),
                        Codec.STRING.xmap(com.trolmastercard.sexmod.EyeAndKoboldColor::a, Enum::name).fieldOf("color").forGetter(TribeData.b.a::b),
                        UUIDUtil.CODEC.optionalFieldOf("owner").forGetter(TribeData.b.a::c),
                        BlockPos.CODEC.listOf().fieldOf("beds").forGetter(TribeData.b.a::d),
                        BlockPos.CODEC.listOf().fieldOf("chests").forGetter(TribeData.b.a::e),
                        Codec.STRING.optionalFieldOf("name", "").forGetter(TribeData.b.a::f)
                    )
                    .apply(var0, TribeData.b.a::new)
            );

            public a(UUID var1, com.trolmastercard.sexmod.EyeAndKoboldColor var2, Optional<UUID> var3, List<BlockPos> var4, List<BlockPos> var5, String var6) {
                this.b = var1;
                this.c = var2;
                this.d = var3;
                this.e = var4;
                this.f = var5;
                this.g = var6;
            }

            public UUID a() {
                return this.b;
            }

            public com.trolmastercard.sexmod.EyeAndKoboldColor b() {
                return this.c;
            }

            public Optional<UUID> c() {
                return this.d;
            }

            public List<BlockPos> d() {
                return this.e;
            }

            public List<BlockPos> e() {
                return this.f;
            }

            public String f() {
                return this.g;
            }
        }
    }
}
