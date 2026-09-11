package com.trolmastercard.sexmod.f.b;

import com.trolmastercard.sexmod.f.p;
import java.util.UUID;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class g extends l implements p {
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public static final EntityDataAccessor<Boolean> d = SynchedEntityData.defineId(g.class, EntityDataSerializers.BOOLEAN);
    int e = 0;
    int f = 0;
    boolean g = false;
    int h = 0;
    boolean i = false;
    private int j;

    public g(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
        this.B = 140;
        this.C = 50;
        this.D = 140;
        this.E = new Vec3(0.0, -0.029999997854232782, -0.2);
    }

    @Override
    public String a() {
        return "Jenny";
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(d, false);
    }

    @Override
    public void i_() {
        this.d("Alright, this is my new Home~");
        com.trolmastercard.sexmod.i.e.a(this, "jenny", "happyoh");
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(1.64F);
    }

    protected SoundEvent getDeathSound() {
        return com.trolmastercard.sexmod.i.e.b("girls.jenny.sigh");
    }

    protected SoundEvent getHurtSound(DamageSource var1) {
        return null;
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        this.e();
        Player var2 = this.level().getNearestPlayer(this, 15.0);
        if (this.c && var2 != null && var2.position().distanceTo(this.position()) < 0.5) {
            this.c = false;
            this.entityData.set(k.aw, this.level().getNearestPlayer(this, 15.0).getUUID().toString());
            ServerPlayer var3 = this.level().getServer().getPlayerList().getPlayer(this.al());
            this.entityData.set(k.aw, var3.getUUID().toString());
            var3.teleportTo(this.position().x, this.position().y, this.position().z);
            this.a(var3, false);
            var3.moveRelative(0.0F, Vec3.ZERO);
            this.a(0.0, 0.0, 0.4, 0.0F, 60.0F);
            this.ah = null;
            this.c(com.trolmastercard.sexmod.f.j.j);
        }

        if (this.a) {
            if (!(this.position().distanceTo(this.am()) < 0.6) && this.f <= 200) {
                this.f++;
                if (this.f == 60 || this.f == 120) {
                    this.getNavigation().stop();
                    this.getNavigation().moveTo(this.am().x, this.am().y, this.am().z, 0.35);
                }
            } else {
                this.a = false;
                this.entityData.set(k.ap, true);
                this.f = 0;
                this.noPhysics = true;
                this.setNoGravity(true);
                this.setDeltaMovement(0.0, 0.0, 0.0);
                this.c(com.trolmastercard.sexmod.f.j.h);
            }
        }

        if (this.b) {
            this.e++;
            if (!this.position().equals(k.aq) && this.e <= 40) {
                this.setYRot(this.e_());
                this.d(this.aE());
                this.setNoGravity(false);
                Vec3 var5 = com.trolmastercard.sexmod.m.i.a(this.position(), this.am(), 40 - this.e);
                this.setPos(var5.x, var5.y, var5.z);
            } else {
                this.b = false;
                this.e = 0;
                Player var4 = this.level().getPlayerByUUID(this.al());
                this.a_((var4 != null ? var4.getYRot() : this.getYRot()) + 180.0F);
                this.entityData.set(k.ap, true);
                this.getNavigation().stop();
                if ((Boolean)this.entityData.get(d)) {
                    this.c_();
                    return;
                }

                this.c(com.trolmastercard.sexmod.f.j.g);
            }
        }
    }

    public InteractionResult mobInteract(Player var1, InteractionHand var2) {
        InteractionResult var3 = super.mobInteract(var1, var2);
        if (var3 != InteractionResult.PASS) {
            return var3;
        }

        if (this.level().isClientSide() && !this.a(var1)) {
            this.d("jenny.dialogue.busy");
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.level().isClientSide()) {
            this.entityData.set(d, false);
        }
    }

    @Override
    public boolean a(Player var1) {
        if (this.al() != null) {
            return false;
        } else if (this.aw() && !((String)this.entityData.get(k.ao)).equals(com.trolmastercard.sexmod.b.b.a().toString())) {
            return false;
        } else {
            String[] var2 = new String[]{
                "action.names.blowjob",
                "action.names.boobjob",
                "action.names.doggy",
                this.entityData.get(k.at) == 1 ? "action.names.strip" : "action.names.dressup"
            };
            if ((Boolean)this.entityData.get(d)) {
                k.a(var1, this, var2, true);
                return true;
            } else {
                ItemStack[] var3 = new ItemStack[]{
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(Items.ENDER_PEARL, 2),
                    new ItemStack(Items.DIAMOND, 2),
                    this.entityData.get(k.at) == 1 ? new ItemStack(Items.GOLD_INGOT, 1) : new ItemStack(Items.AIR, 0)
                };
                k.a(var1, this, var2, var3, true);
                return true;
            }
        }
    }

    @Override
    public void a(String var1, UUID var2) {
        super.a(var1, var2);
        if ("action.names.blowjob".equals(var1)) {
            this.a("animationFollowUp", "blowjob");
            this.a(true, var2);
        } else if ("action.names.boobjob".equals(var1)) {
            this.a("animationFollowUp", "boobjob");
            this.a(true, var2);
        } else if ("action.names.doggy".equals(var1)) {
            this.a("animationFollowUp", "doggy");
            this.a(true, var2);
        } else if ("action.names.strip".equals(var1)) {
            this.a("animationFollowUp", "strip");
            this.a(true, var2);
        } else if ("action.names.dressup".equals(var1)) {
            this.c(com.trolmastercard.sexmod.f.j.n);
        }
    }

    protected void a(boolean var1, UUID var2) {
        super.a(var1, true, var2);
    }

    @Override
    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.m || var1 != com.trolmastercard.sexmod.f.j.k && var1 != com.trolmastercard.sexmod.f.j.l) {
            if (var2 != com.trolmastercard.sexmod.f.j.e || var1 != com.trolmastercard.sexmod.f.j.f && var1 != com.trolmastercard.sexmod.f.j.c) {
                if (var2 != com.trolmastercard.sexmod.f.j.L || var1 != com.trolmastercard.sexmod.f.j.I && var1 != com.trolmastercard.sexmod.f.j.J) {
                    super.c(var1);
                    if (var2 == com.trolmastercard.sexmod.f.j.b || var2 == com.trolmastercard.sexmod.f.j.G) {
                        UUID var3 = this.al();
                        if (var3 != null) {
                            Player var4 = this.level().getPlayerByUUID(var3);
                            if (var4 != null) {
                                Vec3 var5 = com.trolmastercard.sexmod.m.o.a(new Vec3(0.0, 0.0, 0.2), this.e_() + 180.0F);
                                var4.teleportTo(var4.getX() + var5.x, var4.getY(), var4.getZ() + var5.z);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.c || var1 == com.trolmastercard.sexmod.f.j.f) {
            this.a(0.0, 0.0, 0.0, 0.0F, 70.0F);
            return com.trolmastercard.sexmod.f.j.e;
        } else if (var1 == com.trolmastercard.sexmod.f.j.k || var1 == com.trolmastercard.sexmod.f.j.l) {
            return com.trolmastercard.sexmod.f.j.m;
        } else {
            return var1 != com.trolmastercard.sexmod.f.j.J && var1 != com.trolmastercard.sexmod.f.j.I ? null : com.trolmastercard.sexmod.f.j.L;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        return switch (var1) {
            case b -> com.trolmastercard.sexmod.f.j.c;
            case c -> com.trolmastercard.sexmod.f.j.f;
            case f -> com.trolmastercard.sexmod.f.j.e;
            case h -> com.trolmastercard.sexmod.f.j.j;
            case j -> com.trolmastercard.sexmod.f.j.k;
            case k -> com.trolmastercard.sexmod.f.j.l;
            case l -> com.trolmastercard.sexmod.f.j.m;
            case G -> com.trolmastercard.sexmod.f.j.I;
            case I -> com.trolmastercard.sexmod.f.j.J;
            case J -> com.trolmastercard.sexmod.f.j.L;
            default -> null;
        };
    }

    @Override
    public void d_() {
        this.b = true;
    }

    private void e() {
        com.trolmastercard.sexmod.f.j var1 = this.ai();
        if (var1 != null && var1.cp && this.al() != null) {
            if (++this.j >= 28) {
                this.j = 0;
                String var2 = var1.name();
                if (var2.endsWith("CUM")) {
                    com.trolmastercard.sexmod.i.e.a(this, "jenny", "aftersessionmoan");
                } else if (var2.contains("BLOWJOB")) {
                    com.trolmastercard.sexmod.i.e.a(this, "jenny", "bjmoan");
                } else if (this.getRandom().nextBoolean()) {
                    com.trolmastercard.sexmod.i.e.a(this, "jenny", "moan");
                } else {
                    com.trolmastercard.sexmod.i.e.a(this, "misc.pounding");
                }
            }
        } else {
            this.j = 0;
        }
    }

    @Override
    public void a_() {
    }

    @Override
    protected void c_() {
    }

    @Override
    protected String h() {
        return "animation.jenny.idle";
    }

    @Override
    protected PlayState a(AnimationState<k> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() == com.trolmastercard.sexmod.f.j.a && this.ai().cq) {
                    this.a("animation.jenny.fhappy", true, var1);
                } else {
                    this.a("animation.jenny.null", true, var1);
                }
                break;
            case "movement":
                if (this.ai() != null && this.ai().cp) {
                    return PlayState.STOP;
                }

                if (this.ai() != null && this.ai() != com.trolmastercard.sexmod.f.j.a) {
                    this.a("animation.jenny.sit", true, var1);
                } else if (this.isPassenger()) {
                    this.a("animation.jenny.sit", true, var1);
                } else {
                    switch (this.ag()) {
                        case c:
                            this.a("animation.jenny.run", true, var1);
                            return PlayState.CONTINUE;
                        case b:
                            this.a("animation.jenny.fastwalk", true, var1);
                            return PlayState.CONTINUE;
                        case a:
                            this.a("animation.jenny.walk", true, var1);
                            return PlayState.CONTINUE;
                        default:
                            this.a("animation.jenny.idle", true, var1);
                    }
                }
                break;
            case "action":
                switch (this.ai()) {
                    case b:
                        this.a("animation.jenny.blowjobintro", true, var1);
                        break;
                    case c:
                        this.a("animation.jenny.blowjobsuck", true, var1);
                        break;
                    case f:
                        this.a("animation.jenny.blowjobthrust", true, var1);
                        break;
                    case h:
                        this.a("animation.jenny.doggygoonbed", true, var1);
                        break;
                    case j:
                        this.a("animation.jenny.doggystart", true, var1);
                        break;
                    case k:
                        this.a("animation.jenny.doggyslow", true, var1);
                        break;
                    case l:
                        this.a("animation.jenny.doggyfast_hard", true, var1);
                        break;
                    case G:
                        this.a("animation.jenny.paizuri_start", true, var1);
                        break;
                    case I:
                        this.a("animation.jenny.paizuri_slow", true, var1);
                        break;
                    case J:
                        this.a("animation.jenny.paizuri_fast", true, var1);
                        break;
                    case n:
                        this.a("animation.jenny.strip", true, var1);
                        break;
                    case g:
                        this.a("animation.jenny.payment", true, var1);
                        break;
                    case e:
                        this.a("animation.jenny.blowjobcum", true, var1);
                        break;
                    case i:
                        this.a("animation.jenny.doggywait", true, var1);
                        break;
                    case m:
                        this.a("animation.jenny.doggycum", true, var1);
                        break;
                    case A:
                        this.a("animation.jenny.attack0", true, var1);
                        break;
                    case B:
                        this.a("animation.jenny.bowcharge", true, var1);
                        break;
                    case C:
                        this.a("animation.jenny.ride", true, var1);
                        break;
                    case D:
                        this.a("animation.jenny.sit", true, var1);
                        break;
                    case E:
                        this.a("animation.jenny.throwpearl", true, var1);
                        break;
                    case F:
                        this.a("animation.jenny.downed", true, var1);
                        break;
                    case L:
                        this.a("animation.jenny.paizuri_cum", true, var1);
                }
        }

        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(ControllerRegistrar var1) {
        super.registerControllers(var1);
        this.aB.setSoundKeyframeHandler(var0 -> {});
    }
}
