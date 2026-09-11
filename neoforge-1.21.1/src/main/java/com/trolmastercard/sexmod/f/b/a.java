package com.trolmastercard.sexmod.f.b;

import java.util.UUID;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class a extends k {
    public static final Vec3 a = new Vec3(0.5, 1.0, 0.0);
    public float b = 1.0F;
    public boolean c = false;
    boolean d = true;
    int e = 1;
    int f = 1;
    boolean g = false;
    boolean h = false;
    public static final EntityDataAccessor<ItemStack> i = SynchedEntityData.defineId(com.trolmastercard.sexmod.f.b.a.class, EntityDataSerializers.ITEM_STACK);

    public a(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    @Override
    public String a() {
        return "Allie";
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(i, ItemStack.EMPTY);
    }

    public boolean b() {
        return true;
    }

    @Override
    protected void registerGoals() {
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        if (this.ai() == com.trolmastercard.sexmod.f.j.a) {
            this.discard();
        }

        UUID var2 = this.al();
        if (var2 != null) {
            Player var3 = this.level().getPlayerByUUID(var2);
            if (var3 == null) {
                this.discard();
            }
        }
    }

    @Override
    public void h_() {
        if (!this.h) {
            this.c = true;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.b != 1.0F && this.b != -69.0F && this.b <= 0.0F) {
            if (this.aB()) {
            }

            this.b = -69.0F;
        }

        if (this.level().isClientSide()) {
            if (this.c) {
                this.f();
            }

            if (this.d) {
                this.e();
            }

            this.d();
        }
    }

    void d() {
        if (this.tickCount % 10 == 0) {
            int var1 = this.getRandom().nextInt(8);
            Vec3 var2 = this.e("tail" + var1).add(this.position());
            this.level()
                .addParticle(
                    ParticleTypes.PORTAL,
                    var2.x,
                    var2.y,
                    var2.z,
                    this.getRandom().nextGaussian() * 0.01,
                    this.getRandom().nextGaussian() * 0.01,
                    this.getRandom().nextGaussian() * 0.01
                );
        }
    }

    void e() {
        this.d = false;

        for (int var1 = 0; var1 < 300; var1++) {
            double var2 = 0.75 + this.getRandom().nextDouble() * 0.75;
            double var4 = this.getRandom().nextDouble() * Math.PI * 2.0;
            double var6 = this.getRandom().nextDouble() * Math.PI;
            double var8 = var2 * Math.sin(var6) * Math.cos(var4);
            double var10 = var2 * Math.cos(var6);
            double var12 = var2 * Math.sin(var6) * Math.sin(var4);
            Vec3 var14 = this.position();
            this.level().addParticle(ParticleTypes.PORTAL, var14.x, var14.y + 1.0, var14.z, var8, var10, var12);
        }
    }

    void f() {
        Player var1 = com.trolmastercard.sexmod.b.b.b();
        if (var1 != null) {
            this.a(var1);
        }

        this.c = false;
    }

    @Override
    public boolean a(Player var1) {
        this.h = false;
        String[] var2 = new String[]{"action.names.makemerichallie", "action.names.deepthroat", "Reverse cowgirl"};
        k.a(var1, this, var2, false);
        return true;
    }

    @Override
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.ah) {
            return com.trolmastercard.sexmod.f.j.ai;
        } else if (var1 == com.trolmastercard.sexmod.f.j.bE) {
            return com.trolmastercard.sexmod.f.j.bA;
        } else if (var1 == com.trolmastercard.sexmod.f.j.bB) {
            return com.trolmastercard.sexmod.f.j.bC;
        } else if (var1 == com.trolmastercard.sexmod.f.j.ai) {
            return com.trolmastercard.sexmod.f.j.aj;
        } else {
            return var1 == com.trolmastercard.sexmod.f.j.bA ? com.trolmastercard.sexmod.f.j.bB : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.aj || var1 == com.trolmastercard.sexmod.f.j.ai) {
            return com.trolmastercard.sexmod.f.j.ak;
        } else {
            return var1 != com.trolmastercard.sexmod.f.j.bA && var1 != com.trolmastercard.sexmod.f.j.bB && var1 != com.trolmastercard.sexmod.f.j.bC
                ? null
                : com.trolmastercard.sexmod.f.j.bD;
        }
    }

    @Override
    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.ak || var1 != com.trolmastercard.sexmod.f.j.aj && var1 != com.trolmastercard.sexmod.f.j.ai) {
            if (var2 != com.trolmastercard.sexmod.f.j.bD
                || var1 != com.trolmastercard.sexmod.f.j.bA && var1 != com.trolmastercard.sexmod.f.j.bB && var1 != com.trolmastercard.sexmod.f.j.bC) {
                if (!this.level().isClientSide() && var1 == com.trolmastercard.sexmod.f.j.bE) {
                    this.g();
                }

                super.c(var1);
            }
        }
    }

    void g() {
        Player var1 = this.ak();
        if (var1 != null) {
            Vec3 var2 = this.am();
            var1.teleportTo(var2.x, var2.y, var2.z);
        }
    }

    @Override
    public void a(String var1, UUID var2) {
        this.h = true;
        if ("action.names.makemerichallie".equals(var1)) {
            this.c(this.b() ? com.trolmastercard.sexmod.f.j.ap : com.trolmastercard.sexmod.f.j.aq);
        } else {
            String var3 = "action.names.deepthroat".equals(var1) ? "deepthroat" : "reverse_cowgirl";
            this.a("animationFollowUp", var3);
            this.c(this.b() ? com.trolmastercard.sexmod.f.j.ag : com.trolmastercard.sexmod.f.j.al);
        }
    }

    @Override
    protected String h() {
        return "animation.allie.null";
    }

    @Override
    protected PlayState a(AnimationState<k> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() != com.trolmastercard.sexmod.f.j.a || !this.ai().cq) {
                    this.a("animation.allie.null", true, var1);
                }
                break;
            case "movement":
                this.a("animation.allie.tail", true, var1);
                break;
            case "action":
                switch (this.ai()) {
                    case ad:
                        this.a("animation.allie.summon", false, var1);
                        break;
                    case am:
                        this.a("animation.allie.summon_normal", false, var1);
                        break;
                    case ao:
                        this.a("animation.allie.summon_normal_wait", true, var1);
                        break;
                    case ae:
                        this.a("animation.allie.summon_wait", true, var1);
                        break;
                    case ag:
                        this.a("animation.allie.deepthroat_prepare", false, var1);
                        break;
                    case al:
                        this.a("animation.allie.deepthroat_normal_prepare", false, var1);
                        break;
                    case ah:
                        this.a("animation.allie.deepthroat_start", false, var1);
                        break;
                    case ai:
                        this.a("animation.allie.deepthroat_slow", true, var1);
                        break;
                    case aj:
                        this.a("animation.allie.deepthroat_fast", true, var1);
                        break;
                    case ak:
                        this.a("animation.allie.deepthroat_cum", false, var1);
                        break;
                    case ap:
                        this.a("animation.allie.rich", false, var1);
                        break;
                    case aq:
                        this.a("animation.allie.rich_normal", false, var1);
                        break;
                    case an:
                        this.a("animation.allie.summon_sand", false, var1);
                        break;
                    case bE:
                        this.a("animation.allie.reverse_cowgirl_start", true, var1);
                        break;
                    case bA:
                        this.a("animation.allie.reverse_cowgirl_slow" + this.e, true, var1);
                        break;
                    case bC:
                        this.a("animation.allie.reverse_cowgirl_fastc" + this.f, true, var1);
                        break;
                    case bB:
                        this.a("animation.allie.reverse_cowgirl_fasts", true, var1);
                        break;
                    case bD:
                        this.a("animation.allie.reverse_cowgirl_cum", true, var1);
                }
        }

        return PlayState.CONTINUE;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag var1) {
        super.addAdditionalSaveData(var1);
        ItemStack.CODEC
            .encodeStart(this.registryAccess().createSerializationContext(NbtOps.INSTANCE), (ItemStack)this.entityData.get(i))
            .result()
            .ifPresent(var1x -> var1.put("lampStack", var1x));
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        this.entityData
            .set(
                i,
                ItemStack.CODEC
                    .parse(this.registryAccess().createSerializationContext(NbtOps.INSTANCE), var1.get("lampStack"))
                    .result()
                    .orElse(ItemStack.EMPTY)
            );
    }

    @Override
    public void registerControllers(ControllerRegistrar var1) {
        super.registerControllers(var1);
        this.aB.setSoundKeyframeHandler(var0 -> {});
    }
}
