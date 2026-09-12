package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.entity.EllieEntity;
import com.trolmastercard.sexmod.entity.ScenePose;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import java.util.Map;

public class EllieModel extends GirlModel<EllieEntity> {
    // Official cx.f: rounded yaw -> [offset, min, max] head-track coefficients.
    private static final Map<Integer, float[]> HEAD_TRACK_COEFFS = Map.of(
        0, new float[]{0.0F, -1.2F, 1.2F},
        -90, new float[]{2.0F, -71.56F, -68.0F},
        90, new float[]{-2.0F, 68.0F, 70.5F});

    public EllieModel() {
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{ResourceLocation.fromNamespaceAndPath("sexmod", "ellie/nude"), ResourceLocation.fromNamespaceAndPath("sexmod", "ellie/dressed")};
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/ellie/ellie.png");
    }

    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.entity.GirlEntity var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "ellie/ellie");
    }

    // Official cx main: NPC ellies track players with the head while sitting.
    @Override
    public void setCustomAnimations(EllieEntity entity, long instanceId, AnimationState<EllieEntity> state) {
        super.setCustomAnimations(entity, instanceId, state);
        if (entity.ai() != ScenePose.v) {
            return;
        }
        Player player = entity.level().getNearestPlayer(entity, 15.0);
        if (player == null) {
            return;
        }
        AnimationProcessor<EllieEntity> proc = this.getAnimationProcessor();
        GeoBone head = proc.getBone("head");
        if (head == null) {
            return;
        }
        Vec3 diff = entity.position().subtract(player.position());
        float yaw = entity.getYRot();
        int yawKey = Math.round(yaw);
        float rotY;
        if (yawKey == 180) {
            rotY = (float)Math.atan2(diff.x, diff.z) * 1.2F;
            if (rotY > 0.0F) {
                rotY = Math.max(1.5F, Math.min(3.14F, rotY));
            } else {
                rotY = Math.max(-3.14F, Math.min(-1.5F, rotY));
            }
            if (rotY == 1.5F || rotY == 3.14F || rotY == -3.14F || rotY == -1.5F) {
                rotY = 0.0F;
            } else {
                rotY += 3.0F;
            }
        } else {
            float[] coeffs = HEAD_TRACK_COEFFS.get(yawKey);
            if (coeffs == null) {
                return;
            }
            rotY = ((float)Math.atan2(diff.x, diff.z) + coeffs[0] + yaw) * 0.8F;
            rotY = clamp(rotY, coeffs[1], coeffs[2]);
            if (rotY == coeffs[1] || rotY == coeffs[2]) {
                rotY = 0.0F;
            }
        }
        float pitch = 0.0F;
        if (rotY != 0.0F) {
            pitch = clamp((float)(player.position().y - entity.position().y) * 0.5F, -0.75F, 0.75F);
        }
        head.setRotY(rotY);
        head.setRotX(pitch);
    }

    private static float clamp(float value, float min, float max) {
        return value < min ? min : (value > max ? max : value);
    }

    // Official cx groups (d stays the gs empty default).
    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] g() {
        return new String[]{"headband"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs"};
    }

    @Override
    public String[] a() {
        return new String[]{"boobsFlesh", "upperBodyL", "upperBodyR"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip"};
    }

    @Override
    public String[] e() {
        return new String[]{"fleshL", "fleshR", "vagina", "hotpants", "slip", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

}
