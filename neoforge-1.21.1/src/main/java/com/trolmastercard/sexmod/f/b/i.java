package com.trolmastercard.sexmod.f.b;

import com.trolmastercard.sexmod.f.p;
import java.util.HashSet;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.registries.DeferredHolder;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class i extends l implements p {
    public static double a = 0.01;
    public ItemStack b = new ItemStack((ItemLike)com.trolmastercard.sexmod.i.c.q.get());
    public static final EntityDataAccessor<Float> c = SynchedEntityData.defineId(i.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<ItemStack> d = SynchedEntityData.defineId(i.class, EntityDataSerializers.ITEM_STACK);
    public static final EntityDataAccessor<Boolean> e = SynchedEntityData.defineId(i.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<ItemStack> f = SynchedEntityData.defineId(i.class, EntityDataSerializers.ITEM_STACK);
    @Nullable
    public com.trolmastercard.sexmod.f.e g;
    public float h = 1.0F;
    public float i = 0.0F;
    int j = 8000;
    public boolean k = false;
    int l = 0;
    boolean m = false;
    int n = 0;
    int o = 0;
    public BlockPos p;
    int q = 0;
    int r = 0;
    boolean s;
    long t = 0L;
    boolean u = false;
    Path v = null;
    int w = 0;
    HashSet<BlockPos> x = new HashSet<>();
    boolean y = false;
    boolean z = false;

    public i(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
        this.B = 230;
        this.C = 150;
        this.D = 320;
        this.E = new Vec3(0.0, -0.05999999718368053, 0.10000001192092894);
        if (this.G.getStackInSlot(0).isEmpty()) {
            this.G.setStackInSlot(0, new ItemStack(Items.IRON_AXE));
        }

        if (this.G.getStackInSlot(6).isEmpty()) {
            this.G.setStackInSlot(6, new ItemStack(Items.FISHING_ROD));
        }
    }

    @Override
    public String a() {
        return "Luna";
    }

    @Override
    protected void defineSynchedData(Builder var1) {
        super.defineSynchedData(var1);
        var1.define(c, 0.0F);
        var1.define(d, ItemStack.EMPTY);
        var1.define(e, false);
        var1.define(f, ItemStack.EMPTY);
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(1.34F);
    }

    @Override
    public void i_() {
        this.d("Love it here owo");
        com.trolmastercard.sexmod.i.e.a(this, "luna", "owo");
    }

    @Override
    public void c(com.trolmastercard.sexmod.f.j var1) {
        com.trolmastercard.sexmod.f.j var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.f.j.aH || var1 != com.trolmastercard.sexmod.f.j.aF && var1 != com.trolmastercard.sexmod.f.j.aG) {
            if (var2 != com.trolmastercard.sexmod.f.j.aC || var1 != com.trolmastercard.sexmod.f.j.aB && var1 != com.trolmastercard.sexmod.f.j.aA) {
                super.c(var1);
            }
        }
    }

    @Override
    public void d_() {
        this.k = true;
    }

    public InteractionResult mobInteract(Player var1, InteractionHand var2) {
        InteractionResult var3 = super.mobInteract(var1, var2);
        if (var3 != InteractionResult.PASS) {
            return var3;
        }

        ItemStack var4 = var1.getItemInHand(var2);
        if (var4.getItem() == Items.NAME_TAG) {
            var4.interactLivingEntity(var1, this, var2);
            return InteractionResult.SUCCESS;
        }

        if (this.level().isClientSide() && !this.a(var1)) {
            this.d("bia.dialogue.busy");
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public boolean a(Player var1) {
        String[] var2 = new String[]{"action.names.sex", "action.names.touchboobs", "action.names.headpat"};
        ItemStack[] var3 = new ItemStack[]{new ItemStack(Items.COD, 3), new ItemStack(Items.SALMON, 2), null};
        com.trolmastercard.sexmod.f.b.k.a(var1, this, var2, var3, false);
        return true;
    }

    public void a(ItemStack var1) {
        this.entityData.set(f, var1);
    }

    @Override
    public void a_() {
    }

    @Override
    protected void customServerAiStep() {
        ServerLevel var1 = (ServerLevel)this.level();
        super.customServerAiStep();
        this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(this.aw() ? 0.5 : 1.0);
        this.q();
        this.m();
        this.entityData.set(e, this.g != null && ((ItemStack)this.entityData.get(f)).isEmpty());
        if (this.t == this.level().getGameTime() && this.g != null) {
            this.g.discard();
            this.g = null;
        }

        if (this.m) {
            double var2 = this.am().distanceTo(this.position());
            if (!(var2 < 0.5) && this.n <= 200) {
                if (++this.n == 60 || this.n == 120) {
                    this.getNavigation().stop();
                    this.getNavigation().moveTo(this.am().x, this.am().y, this.am().z, 0.2);
                }
            } else {
                this.m = false;
                this.n = 0;
                this.entityData.set(com.trolmastercard.sexmod.f.b.k.ap, true);
                this.noPhysics = true;
                this.setNoGravity(true);
                this.setDeltaMovement(0.0, 0.0, 0.0);
                this.c(com.trolmastercard.sexmod.f.j.aD);
            }
        }

        if (this.k) {
            this.l++;
            if (!this.position().equals(this.am()) && this.l <= 40) {
                this.setYRot(this.e_());
                this.setNoGravity(false);
                Vec3 var5 = com.trolmastercard.sexmod.m.i.a(this.position(), this.am(), 40 - this.l);
                this.setPos(var5.x, var5.y, var5.z);
            } else {
                this.k = false;
                this.l = 0;
                Player var4 = this.level().getPlayerByUUID(this.al());
                this.a_((var4 != null ? var4.getYRot() : this.getYRot()) + 180.0F);
                this.entityData.set(com.trolmastercard.sexmod.f.b.k.ap, true);
                this.getNavigation().stop();
                this.c_();
            }
        }

        this.e();
        this.entityData.set(d, this.G.getStackInSlot(6));
    }

    void e() {
        ItemStack var1 = (ItemStack)this.entityData.get(d);
        if (!var1.equals(ItemStack.EMPTY)) {
            ItemEnchantments var2 = EnchantmentHelper.getEnchantmentsForCrafting(var1);
            EnchantmentHelper.setEnchantments(this.b, var2);
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (com.trolmastercard.sexmod.f.j.aD.equals(this.ai())) {
            this.j();
        } else {
            this.o = 0;
        }
    }

    void j() {
        Player var1 = this.level().getNearestPlayer(this, 10.0);
        if (var1 != null) {
            if (!(var1.distanceTo(this) > 1.25F)) {
                if (this.level().isClientSide()) {
                    this.a(var1, this.o);
                } else if (this.o == 25) {
                    this.q(var1.getUUID());
                    var1.setDeltaMovement(0.0, 0.0, 0.0);
                    Vec3 var2 = this.position();
                    var1.teleportTo(var2.x, var2.y, var2.z);
                    this.c(com.trolmastercard.sexmod.f.j.aE);
                    float var3 = this.e_() + 180.0F;
                    var1.setYHeadRot(var3);
                    var1.setYRot(var3);
                    var1.yRotO = var3;
                    this.ai = var3;
                    this.a(0.0, -0.075, -0.7109375, 0.0F, 0.0F);
                    this.entityData.set(com.trolmastercard.sexmod.f.b.k.at, 0);
                }

                this.o++;
            }
        }
    }

    void a(Player var1, int var2) {
        Player var3 = com.trolmastercard.sexmod.b.b.b();
        if (var3 != null) {
            if (var2 == 0 && var3.getUUID().equals(var1.getUUID())) {
                var3.setDeltaMovement(0.0, 0.0, 0.0);
            }

            if (var2 == 25 && var3.getUUID().equals(var1.getUUID())) {
                com.trolmastercard.sexmod.b.b.e();
            }
        }
    }

    public void l() {
        this.p = null;
        this.q = 0;
        this.r = 0;
        this.s = false;
        this.entityData.set(com.trolmastercard.sexmod.f.b.k.ap, false);
        this.entityData.set(f, ItemStack.EMPTY);
        this.setSilent(false);
        this.c(com.trolmastercard.sexmod.f.j.a);
        if (this.g != null) {
            this.g.discard();
            this.g = null;
        }

        if (this.al() == null) {
            ;
        }
    }

    void m() {
        if (!this.aw() && this.al() == null) {
            if (this.u) {
                if ((Boolean)this.entityData.get(e)) {
                    this.l();
                }
            } else {
                this.j++;
                if (this.j >= 1200) {
                    if (this.g != null && this.g.a == 15) {
                        ((com.trolmastercard.sexmod.k.e)this.b.getItem()).a(this.level(), this, InteractionHand.MAIN_HAND);
                        this.t = this.level().getGameTime() + 20L;
                        ItemStack var1 = (ItemStack)this.entityData.get(f);
                        if (!var1.isEmpty()) {
                            if (var1.has(DataComponents.FOOD)) {
                                this.c(com.trolmastercard.sexmod.f.j.ax);
                            } else {
                                this.c(com.trolmastercard.sexmod.f.j.ay);
                            }
                        }
                    }

                    if (!this.ai().toString().toLowerCase().contains("fishing")) {
                        this.p();
                        this.o();
                    }

                    if (this.p == null || this.v != null) {
                        this.v = this.getNavigation().getPath();
                    } else if (this.getNavigation().getPath() != null) {
                        this.v = this.getNavigation().getPath();
                    } else if (this.isInWater()) {
                        this.v = this.getNavigation().getPath();
                    } else if (!this.onGround()) {
                        this.v = this.getNavigation().getPath();
                    } else {
                        this.setSilent(true);
                        if (this.ai() == com.trolmastercard.sexmod.f.j.a) {
                            this.c(com.trolmastercard.sexmod.f.j.av);
                            this.d(this.position());
                            this.entityData.set(com.trolmastercard.sexmod.f.b.k.ap, true);
                            this.a_((float)(Math.atan2(this.getZ() - this.p.getZ(), this.getX() - this.p.getX()) * 57.29578) + 90.0F);
                        } else if (this.ai() == com.trolmastercard.sexmod.f.j.av && this.g == null) {
                            ((com.trolmastercard.sexmod.k.e)this.b.getItem()).a(this.level(), this, InteractionHand.MAIN_HAND);
                            this.c(com.trolmastercard.sexmod.f.j.aw);
                        }
                    }
                }
            }
        } else {
            if ((Boolean)this.entityData.get(e)) {
                this.l();
            }
        }
    }

    public void n() {
        this.x.add(this.p);
        this.l();
    }

    void o() {
        if (this.p != null) {
            PathNavigation var1 = this.getNavigation();
            var1.moveTo(this.p.getX(), this.p.getY(), this.p.getZ(), 0.35);
            Path var2 = var1.getPath();
            if (var2 != null) {
                if (var2.getNodeCount() > var2.getNextNodeIndex() + 1) {
                    Node var3 = var2.getNode(var2.getNextNodeIndex() + 1);
                    Node var4 = var2.getNode(var2.getNodeCount() - 1);
                    Vec3 var5 = new Vec3(var4.x, var4.y, var4.z);
                    BlockPos var6 = new BlockPos(var3.x, var3.y, var3.z);
                    if (this.position().distanceTo(var5) < 0.75) {
                        var1.stop();
                        this.setPos(var5.x, var5.y, var5.z);
                    }

                    if (this.level().getBlockState(var6.offset(0, 1, 0)).getBlock() == Blocks.WATER) {
                        var1.stop();
                    }

                    if (this.level().getBlockState(var6).getBlock() == Blocks.WATER) {
                        var1.stop();
                    }

                    if (this.level().getBlockState(var6.offset(0, -1, 0)).getBlock() == Blocks.WATER) {
                        var1.stop();
                    }
                }
            }
        }
    }

    void p() {
        int var1 = 0;
        BlockPos var2 = null;
        int var3 = 0;

        while (++var1 < 50) {
            BlockPos var4 = this.a(this.blockPosition(), var1 + 1, Blocks.WATER, 60, 10, null);
            if (var4 == null) {
                break;
            }

            while (this.level().getBlockState(var4.offset(0, 1, 0)).getBlock() == Blocks.WATER) {
                var4 = var4.offset(0, 1, 0);
            }

            int var5 = 1;

            for (BlockPos var6 = var4; this.level().getBlockState(var6.offset(0, -1, 0)).getBlock() == Blocks.WATER; var5++) {
                var6 = var6.offset(0, -1, 0);
            }

            if (!this.x.contains(var4)) {
                if (var2 == null) {
                    var2 = var4;
                    var3 = var5;
                } else if (var5 > var3) {
                    var2 = var4;
                    var3 = var5;
                    if (var3 >= 6) {
                        break;
                    }
                }
            }
        }

        if (var2 != null) {
            if (this.p == null || this.q < var3) {
                this.p = var2;
                this.q = var3;
            }

            if (this.p.equals(var2)) {
                this.r = 0;
            } else {
                if (++this.r > 20) {
                    this.p = var2;
                    this.q = var3;
                }
            }
        }
    }

    void q() {
        Path var1 = this.getNavigation().getPath();
        if (var1 != null) {
            Node var2 = var1.getEndNode();
            if (var2 != null) {
                Node var3 = new Node(
                    com.trolmastercard.sexmod.m.j.a(this.getX()), com.trolmastercard.sexmod.m.j.a(this.getY()), com.trolmastercard.sexmod.m.j.a(this.getZ())
                );
                this.entityData.set(c, var2.distanceTo(var3));
            }
        }
    }

    @Override
    public void a(String var1, UUID var2) {
        super.a(var1, var2);
        if ("action.names.touchboobs".equals(var1)) {
            this.q(var2);
            this.a(true, true, var2);
            this.a("animationFollowUp", "touch_boobs");
            this.a("currentModel", "0");
        } else if ("action.names.sex".equals(var1)) {
            this.q(var2);
            this.a(true, true, var2);
            this.a("animationFollowUp", "sex");
        } else if ("action.names.headpat".equals(var1)) {
            this.q(var2);
            this.a(true, true, var2);
            this.a("animationFollowUp", "headpat");
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j a_(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.az) {
            return com.trolmastercard.sexmod.f.j.aA;
        } else if (var1 == com.trolmastercard.sexmod.f.j.aE) {
            return com.trolmastercard.sexmod.f.j.aF;
        } else if (var1 == com.trolmastercard.sexmod.f.j.aA) {
            return com.trolmastercard.sexmod.f.j.aB;
        } else {
            return var1 == com.trolmastercard.sexmod.f.j.aF ? com.trolmastercard.sexmod.f.j.aG : null;
        }
    }

    @Override
    protected com.trolmastercard.sexmod.f.j b(com.trolmastercard.sexmod.f.j var1) {
        if (var1 == com.trolmastercard.sexmod.f.j.aA || var1 == com.trolmastercard.sexmod.f.j.aB) {
            return com.trolmastercard.sexmod.f.j.aC;
        } else {
            return var1 != com.trolmastercard.sexmod.f.j.aG && var1 != com.trolmastercard.sexmod.f.j.aF ? null : com.trolmastercard.sexmod.f.j.aH;
        }
    }

    @Override
    protected void c_() {
        String var1 = (String)this.entityData.get(com.trolmastercard.sexmod.f.b.k.av);
        if ("touch_boobs".equals(var1)) {
            if (this.ai() != com.trolmastercard.sexmod.f.j.g) {
                this.c(com.trolmastercard.sexmod.f.j.g);
                return;
            }

            this.c(com.trolmastercard.sexmod.f.j.az);
        } else if ("sex".equals(var1)) {
            if (this.ai() == com.trolmastercard.sexmod.f.j.g) {
                return;
            }

            this.c(com.trolmastercard.sexmod.f.j.g);
        } else if ("headpat".equals(var1)) {
            this.c(com.trolmastercard.sexmod.f.j.af);
        }

        if (this.level().isClientSide()) {
            this.a("animationFollowUp", "");
        } else {
            this.entityData.set(com.trolmastercard.sexmod.f.b.k.av, "");
        }
    }

    protected void playHurtSound(DamageSource var1) {
        com.trolmastercard.sexmod.i.e.a(this, "luna", "ouu");
    }

    protected SoundEvent getDeathSound() {
        if (this.getRandom().nextFloat() * 100.0F > 95.0F) {
            DeferredHolder var1 = com.trolmastercard.sexmod.i.e.a("girls.allie.scawy.scawy2");
            if (var1 != null) {
                return (SoundEvent)var1.get();
            }
        }

        DeferredHolder var2 = com.trolmastercard.sexmod.i.e.a("girls.luna.ouu.ouu12");
        return var2 != null ? (SoundEvent)var2.get() : super.getDeathSound();
    }

    protected float getJumpPower() {
        return this.isInWater() ? 1.0F : 0.5F;
    }

    @Override
    public void readAdditionalSaveData(CompoundTag var1) {
        super.readAdditionalSaveData(var1);
        this.setNoGravity(false);
    }

    @Override
    protected String h() {
        return "animation.cat.idle";
    }

    @Override
    protected PlayState a(AnimationState<k> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "eyes":
                if (this.ai() != com.trolmastercard.sexmod.f.j.a) {
                    this.a("animation.cat.null", true, var1);
                } else {
                    this.a("animation.cat.blink", true, var1);
                }
                break;
            case "movement":
                if (this.ai() != com.trolmastercard.sexmod.f.j.a) {
                    this.a("animation.cat.null", true, var1);
                } else if (this.isPassenger()) {
                    this.a("animation.cat.sit", true, var1);
                } else if (Math.abs(this.xOld - this.getX()) + Math.abs(this.zOld - this.getZ()) > 0.0) {
                    if (this.onGround() && Math.abs(Math.abs(this.yOld) - Math.abs(this.getY())) < 0.1) {
                        String var5 = this.entityData.get(c) < 3.0F ? "animation.cat.walk" : "animation.cat.run";
                        this.a(var5, true, var1);
                    } else {
                        this.a("animation.cat.fly", true, var1);
                        this.setYRot(this.getYHeadRot());
                    }
                } else {
                    this.a("animation.cat.idle" + (this.z ? "2" : ""), true, var1);
                }
                break;
            case "action":
                switch (this.ai()) {
                    case a:
                        this.a("animation.cat.null", true, var1);
                        break;
                    case A:
                        this.a("animation.cat.attack" + this.A, false, var1);
                        break;
                    case C:
                    case D:
                        this.a("animation.cat.sit", true, var1);
                        break;
                    case B:
                        this.a("animation.cat.bowcharge", false, var1);
                        break;
                    case E:
                        this.a("animation.cat.throwpearl", true, var1);
                        break;
                    case F:
                        this.a("animation.cat.downed", true, var1);
                        break;
                    case av:
                        this.a("animation.cat.start_fishing", false, var1);
                        break;
                    case aw:
                        this.a("animation.cat.idle_fishing", true, var1);
                        break;
                    case ax:
                        this.a("animation.cat.eat_fishing", false, var1);
                        break;
                    case ay:
                        this.a("animation.cat.throw_away", false, var1);
                        break;
                    case g:
                        this.a("animation.cat.payment", false, var1);
                        break;
                    case az:
                        this.a("animation.cat.touch_boobs_intro", false, var1);
                        break;
                    case aA:
                        this.a("animation.cat.touch_boobs_slow" + (this.y ? "1" : ""), true, var1);
                        break;
                    case aB:
                        this.a("animation.cat.touch_boobs_fast", true, var1);
                        break;
                    case aC:
                        this.a("animation.cat.touch_boobs_cum", false, var1);
                        break;
                    case aD:
                        this.a("animation.cat.wait", false, var1);
                        break;
                    case aE:
                        this.a("animation.cat.sitting_intro", false, var1);
                        break;
                    case aF:
                        this.a("animation.cat.sitting_slow", true, var1);
                        break;
                    case aG:
                        this.a("animation.cat.sitting_fast", true, var1);
                        break;
                    case aH:
                        this.a("animation.cat.sitting_cum", false, var1);
                        break;
                    case af:
                        this.a("animation.cat.head_pat", true, var1);
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
