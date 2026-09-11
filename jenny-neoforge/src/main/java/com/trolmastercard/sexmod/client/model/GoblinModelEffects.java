package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.entity.GirlEntity;
import com.trolmastercard.sexmod.entity.ScenePose;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;

// Port of the 1.12.2 ci model logic (goblin look-at tracking, throw flight
// pose, carried leg swing). Shared by the NPC and player goblin models.
public final class GoblinModelEffects {
    private GoblinModelEffects() {
    }

    // Full ci main sequence. npcGoblin selects the e3-only branches, charge is
    // the ai throw timer (NPCs have no synced charge so callers pass 15).
    public static void applyThrowAndTracking(GirlEntity girl, AnimationProcessor<?> proc, AnimationState<?> state, ScenePose pose, boolean npcGoblin, int charge) {
        GeoBone body = getBone(proc, "body");
        GeoBone head = getBone(proc, "head");
        if (body == null || head == null) {
            return;
        }
        if (pose == ScenePose.be || pose == ScenePose.bg || pose == ScenePose.bj
            && Minecraft.getInstance().options.getCameraType().isFirstPerson()) {
            body.setPosY(body.getPosY() + 1.5F);
        }
        if (npcGoblin && (pose == ScenePose.aO || pose == ScenePose.bl)) {
            lookAtNearestPlayer(girl, body, head);
        }
        if (pose == ScenePose.bl) {
            lookAtNearestPlayer(girl, body, head);
        }
        if (npcGoblin && pose == ScenePose.v) {
            trackHeadWhileSitting(girl, head);
        }
        if (pose == ScenePose.aU) {
            Player carrier = ownerPlayer(girl);
            if (carrier != null && carrier.getUUID().equals(girl.al())) {
                body.setHidden(charge < 15);
            } else {
                body.setHidden(false);
            }
        } else {
            body.setHidden(false);
        }
        if (pose == ScenePose.aV || !body.isHidden() && pose == ScenePose.aU) {
            Vec3 flight = throwFlightPose(girl);
            body.setRotX((float)flight.x);
            body.setPosY(body.getPosY() + (float)flight.y);
            body.setPosZ(body.getPosZ() + (float)flight.z);
        }
        if (npcGoblin && (pose == ScenePose.aU || pose == ScenePose.aP)) {
            swingLegsWithCarrier(girl, proc, state);
        }
        if (pose == ScenePose.aP
            && !(Minecraft.getInstance().options.getCameraType().isFirstPerson() && isOwnerClientPlayer(girl))) {
            body.setPosY(body.getPosY() - 32.0F);
            setPosY(proc, "steve", -32.0F);
        }
        if (pose == ScenePose.aU && Minecraft.getInstance().options.getCameraType().isFirstPerson() && isOwnerClientPlayer(girl)) {
            body.setHidden(true);
        }
    }

    // ci.a(em, body, head): turn body toward the nearest player, pitch head.
    private static void lookAtNearestPlayer(GirlEntity girl, GeoBone body, GeoBone head) {
        Player player = girl.level().getNearestPlayer(girl, 15.0);
        if (player == null) {
            return;
        }
        Vec3 diff = player.position().subtract(girl.position());
        float yaw = (float)(-(Math.atan2(diff.z, diff.x) * (180.0 / Math.PI))) + 90.0F;
        float pitch = clamp((float)(player.getEyeHeight() + player.position().y - (girl.getEyeHeight() + girl.position().y)), -0.75F, 0.75F);
        body.setRotY((float)Math.toRadians(yaw));
        head.setRotX(pitch);
    }

    // ci.a(em, head) for SIT: head tracks the nearest player with yaw-quadrant
    // compensation; axis-aligned yaws use facing checks instead of distance.
    private static void trackHeadWhileSitting(GirlEntity girl, GeoBone head) {
        Player player = girl.level().getNearestPlayer(girl, 15.0);
        if (player == null) {
            return;
        }
        Vec3 playerPos = player.position();
        Vec3 girlPos = girl.position();
        Vec3 diff = playerPos.subtract(girlPos);
        boolean track;
        switch ((int)girl.getYRot()) {
            case 0:
                track = playerPos.z > girlPos.z;
                break;
            case 180:
                track = playerPos.z < girlPos.z;
                break;
            case 90:
                track = playerPos.x < girlPos.x;
                break;
            case -90:
                track = playerPos.x > girlPos.x;
                break;
            default:
                track = diff.x > 0.0;
                break;
        }
        if (!track) {
            head.setRotY(0.0F);
            return;
        }
        float offset;
        switch ((int)girl.getYRot()) {
            case 0:
                offset = -90.0F;
                break;
            case 90:
                offset = 180.0F;
                break;
            case 180:
                offset = 90.0F;
                break;
            default:
                offset = 0.0F;
                break;
        }
        float yaw = (float)(-(Math.atan2(diff.z, diff.x) * (180.0 / Math.PI)) + offset);
        float pitch = clamp((float)(player.getEyeHeight() + playerPos.y - (girl.getEyeHeight() + girlPos.y)), -0.75F, 0.75F);
        head.setRotY((float)Math.toRadians(yaw));
        head.setRotX(pitch);
    }

    // ci.a(proc, ai, em): carried legs dangle with the carrier's walk cycle.
    private static void swingLegsWithCarrier(GirlEntity girl, AnimationProcessor<?> proc, AnimationState<?> state) {
        if (girl.al() == null) {
            return;
        }
        Player carrier = girl.level().getPlayerByUUID(girl.al());
        if (carrier == null) {
            return;
        }
        float swing = carrier.walkAnimation.position() + (carrier.walkAnimation.position() - carrier.walkAnimation.speed()) * state.getPartialTick();
        float amount = carrier.walkAnimation.speed();
        float legRot = (float)Math.toRadians(60.0F * (float)Math.sin(amount) * swing);
        setRotX(proc, "LeftLeg", legRot);
        setRotX(proc, "RightLeg", -legRot);
    }

    // cv.d(em) + cv.a(Vec3d, Vec3d): throw flight rotation/lift from velocity.
    private static Vec3 throwFlightPose(GirlEntity girl) {
        Vec3 prev = new Vec3(girl.xOld, girl.yOld, girl.zOld);
        Vec3 current = girl.position();
        Vec3 velocity = current.subtract(prev);
        double total = Math.abs(velocity.x) + Math.abs(velocity.y) + Math.abs(velocity.z);
        double lift = (velocity.y > 0.0 ? 1.0 : -1.0) * (Math.abs(velocity.y) / total) / 2.0 + 0.5;
        float rotX = (float)Math.toRadians(-180.0 + (0.0 - -180.0) * lift);
        if (Float.isNaN(rotX)) {
            rotX = (float)Math.toRadians(-90.0);
        }
        float posY = lift < 0.5 ? 0.0F : (float)(0.0 + (16.0 - 0.0) * -lift);
        if (Float.isNaN(posY)) {
            posY = 0.0F;
        }
        float posZ = (float)(4.0 - Math.sin(Math.PI / 2.0 + lift * 2.0 * Math.PI) * 4.0);
        if (Float.isNaN(posZ)) {
            posZ = 8.0F;
        }
        return new Vec3(rotX, posY, posZ);
    }

    private static boolean isOwnerClientPlayer(GirlEntity girl) {
        Player clientPlayer = Minecraft.getInstance().player;
        return clientPlayer != null && clientPlayer.getUUID().equals(girl.al());
    }

    private static float clamp(float value, float min, float max) {
        return value < min ? min : (value > max ? max : value);
    }

    private static GeoBone getBone(AnimationProcessor<?> proc, String name) {
        try {
            return proc.getBone(name);
        } catch (RuntimeException e) {
            return null;
        }
    }

    private static void setPosY(AnimationProcessor<?> proc, String name, float delta) {
        GeoBone bone = getBone(proc, name);
        if (bone != null) {
            bone.setPosY(bone.getPosY() + delta);
        }
    }

    private static void setRotX(AnimationProcessor<?> proc, String name, float rot) {
        GeoBone bone = getBone(proc, name);
        if (bone != null) {
            bone.setRotX(rot);
        }
    }
}
