package com.trolmastercard.sexmod.client.model;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.resources.PlayerSkin.Model;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.data.EntityModelData;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;

public abstract class GirlModel<T extends com.trolmastercard.sexmod.entity.GirlEntity> extends GeoModelBase<T> implements BoneGroups {
    public static boolean a = true;
    protected ResourceLocation[] b = this.i();

    protected GirlModel() {
    }

    protected abstract ResourceLocation[] i();

    public abstract ResourceLocation j();

    public abstract ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1);

    @Override
    public ResourceLocation getAnimationResource(T var1) {
        return b(this.a(var1));
    }

    @Override
    public ResourceLocation getModelResource(T var1) {
        int var2 = var1.aj();
        ResourceLocation var3;
        if (var2 >= this.b.length || var2 < 0) {
            var3 = this.b[0];
        } else {
            var3 = this.b[var2];
        }
        return a(var3);
    }

    @Override
    public ResourceLocation getTextureResource(T var1) {
        return this.j();
    }

    static ResourceLocation a(ResourceLocation var0) {
        return ResourceLocation.fromNamespaceAndPath(var0.getNamespace(), "geo/" + var0.getPath() + ".geo.json");
    }

    static ResourceLocation b(ResourceLocation var0) {
        return ResourceLocation.fromNamespaceAndPath(var0.getNamespace(), "animations/" + var0.getPath() + ".animation.json");
    }

    @Override
    public void setCustomAnimations(T var1, long var2, AnimationState<T> var4) {
        super.setCustomAnimations(var1, var2, var4);
        AnimationProcessor<T> var5 = this.getAnimationProcessor();
        boolean var6 = this.e(var1);
        this.a(var5, "rightArmAlex", var6);
        this.a(var5, "rightLowerArmAlex", var6);
        this.a(var5, "rightArmSteve", !var6);
        this.a(var5, "rightLowerArmSteve", !var6);
        this.a(var5, "leftArmAlex", var6);
        this.a(var5, "leftLowerArmAlex", var6);
        this.a(var5, "leftArmSteve", !var6);
        this.a(var5, "leftLowerArmSteve", !var6);
        GeoBone var7 = var5.getBone("steve");
        if (var7 != null) {
            var7.setHidden(true);
            var7.setChildrenHidden(true);
        }
        if (var1.ai() != null && var1.ai().cp && var1.al() != null) {
            Minecraft var8 = Minecraft.getInstance();
            if (var8.player != null && var8.player.getUUID().equals(var1.al()) && var8.options.getCameraType().isFirstPerson()) {
                GeoBone var9 = var5.getBone("Head2");
                if (var9 != null) {
                    var9.setHidden(true);
                    var9.setChildrenHidden(true);
                }
            }
        }
        if (var1.getEntityData().get(com.trolmastercard.sexmod.entity.GirlEntity.ap)) {
            var1.moveTo(var1.am().x, var1.am().y, var1.am().z, var1.e_(), 0.0F);
        }
        if (var1.aB != null) {
            var1.aB.transitionLength(var1.ai() != null ? var1.ai().co : 2);
        }
        this.a(var1, var5, var4);
        this.applyOutfitVisibility(var1, var5);
    }

    private void a(AnimationProcessor<T> var1, String var2, boolean var3) {
        GeoBone var4 = var1.getBone(var2);
        if (var4 != null) {
            var4.setHidden(!var3);
            var4.setChildrenHidden(!var3);
        }
    }

    protected void a(T var1, AnimationProcessor<T> var2, AnimationState<T> var3) {
        if (this.f(var1)) {
            com.trolmastercard.sexmod.entity.ScenePose var4 = var1.ai();
            if (var4 == com.trolmastercard.sexmod.entity.ScenePose.a || var4 == com.trolmastercard.sexmod.entity.ScenePose.A || var4 == com.trolmastercard.sexmod.entity.ScenePose.B) {
                EntityModelData var5 = (EntityModelData)var3.getData(DataTickets.ENTITY_MODEL_DATA);
                if (var5 != null) {
                    float var6 = (float) (Math.PI / 180.0);
                    GeoBone var7 = var2.getBone("neck");
                    if (var7 != null) {
                        var7.setRotY(var5.netHeadYaw() * 0.5F * var6);
                    }

                    GeoBone var8 = var2.getBone("head");
                    if (var8 != null) {
                        var8.setRotY(var5.netHeadYaw() * var6);
                        var8.setRotX(var5.headPitch() * var6);
                    }

                    GeoBone var9 = var2.getBone("body") != null ? var2.getBone("body") : var2.getBone("dd");
                    if (var9 != null) {
                        var9.setRotY(0.0F);
                    }
                }
            }
        }
    }

    protected void a(AnimationProcessor<T> var1) {
        this.a(var1, false);
        this.b(var1, false);
        this.c(var1, false);
        this.d(var1, false);
    }

    // Official cv pairs (interleaved): feet=(b,d), body=(f,a), head=(c,g), legs=(h,e).
    private void a(AnimationProcessor<T> var1, boolean var2) {
        this.a(this.b(), var2, var1);
        this.a(this.d(), !var2, var1);
    }

    private void b(AnimationProcessor<T> var1, boolean var2) {
        this.a(this.f(), var2, var1);
        this.a(this.a(), !var2, var1);
    }

    private void c(AnimationProcessor<T> var1, boolean var2) {
        this.a(this.c(), var2, var1);
        this.a(this.g(), !var2, var1);
    }

    private void d(AnimationProcessor<T> var1, boolean var2) {
        this.a(this.h(), var2, var1);
        this.a(this.e(), !var2, var1);
    }

    // Official gs defaults: models override only the groups they use.
    public String[] a() {
        return new String[0];
    }

    public String[] b() {
        return new String[0];
    }

    public String[] c() {
        return new String[0];
    }

    public String[] d() {
        return new String[0];
    }

    public String[] e() {
        return new String[0];
    }

    public String[] f() {
        return new String[0];
    }

    public String[] g() {
        return new String[0];
    }

    public String[] h() {
        return new String[0];
    }

    private void a(String[] var1, boolean var2, AnimationProcessor<T> var3) {
        for (String var7 : var1) {
            GeoBone var8 = var3.getBone(var7);
            if (var8 != null) {
                var8.setHidden(!var2);
            }
        }
    }

    protected boolean e(T var1) {
        UUID var2 = var1.al();
        if (var2 == null) {
            return true;
        } else {
            return var1.level().getPlayerByUUID(var2) instanceof AbstractClientPlayer var4 ? var4.getSkin().model() == Model.WIDE : true;
        }
    }

    protected boolean f(T var1) {
        return true;
    }

    // Port of cv's outfit gate: girls with equipment data and a non-zero outfit
    // toggle armor/flesh bone pairs from their synced items, everyone else falls
    // back to the default (nude) visibility.
    protected void applyOutfitVisibility(T entity, AnimationProcessor<T> proc) {
        ItemStack[] equipment = getSyncedEquipment(entity);
        if (equipment != null) {
            applyArmorVisibility(proc, equipment[0], equipment[1], equipment[2], equipment[3]);
        } else {
            this.a(proc);
        }
    }

    // Returns {head, body, legs, feet} when this girl carries synced equipment,
    // or null to use default visibility. Subclasses override for their own slots.
    protected ItemStack[] getSyncedEquipment(T entity) {
        if (entity instanceof com.trolmastercard.sexmod.entity.HumanoidGirlEntity humanoid && !entity.ao() && entity.aj() != 0) {
            return new ItemStack[]{
                (ItemStack)humanoid.getEntityData().get(com.trolmastercard.sexmod.entity.HumanoidGirlEntity.J),
                (ItemStack)humanoid.getEntityData().get(com.trolmastercard.sexmod.entity.HumanoidGirlEntity.K),
                (ItemStack)humanoid.getEntityData().get(com.trolmastercard.sexmod.entity.HumanoidGirlEntity.L),
                (ItemStack)humanoid.getEntityData().get(com.trolmastercard.sexmod.entity.HumanoidGirlEntity.M)};
        }
        return null;
    }

    // Port of cv.a(AnimationProcessor, 4 x ItemStack): head/legs/feet pairs key
    // off non-empty stacks, the body pair only off real armor pieces.
    protected void applyArmorVisibility(AnimationProcessor<T> proc, ItemStack headStack, ItemStack bodyStack, ItemStack legStack, ItemStack feetStack) {
        this.a(proc, !headStack.isEmpty());
        this.b(proc, bodyStack.getItem() instanceof ArmorItem);
        this.c(proc, !legStack.isEmpty());
        this.d(proc, !feetStack.isEmpty());
    }
}
