package com.trolmastercard.sexmod.client.model;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

/**
 * Port of em.b(String) (official 1.12.2 bone world-offset lookup).
 *
 * <p>Officially the backing map is filled by the renderer every frame (dh), so values are
 * exact animated bone positions. The 1.21.1 port has no renderer hook, so this table returns
 * rest-pose geo pivots (model units, divided by 16) rotated by the entity body yaw. Callers
 * add the entity position themselves, matching the official call shapes
 * (dh.a(f_, F) = ak.a + galath.b("mangPos"), builder-1 arm aims, cb.k head offset).</p>
 */
public class BoneOffsetTable {
    private static final Map<String, float[]> GALATH = new HashMap<>();
    private static final Map<String, float[]> MANGLELIE = new HashMap<>();

    static {
        // Pivots copied from geo/galath/galath.geo.json (model units).
        GALATH.put("mangPos", new float[]{0.0F, 33.4F, -0.5F});
        GALATH.put("head", new float[]{0.0F, 25.866F, 0.0F});
        GALATH.put("armR", new float[]{-4.25552F, 25.60464F, 0.21384F});
        GALATH.put("armL", new float[]{4.25552F, 25.60464F, 0.21384F});
        // Pivots copied from geo/manglelie/manglelie.geo.json (model units).
        MANGLELIE.put("armR", new float[]{-3.2342F, 19.45953F, 0.16252F});
        MANGLELIE.put("armL", new float[]{3.2342F, 19.45953F, 0.16252F});
    }

    private BoneOffsetTable() {
    }

    /**
     * Entity-local bone offset in blocks (yaw-rotated rest pivot, no entity position added).
     */
    public static Vec3 localOffset(Entity entity, String bone, float partial) {
        Map<String, float[]> map;
        if (entity instanceof com.trolmastercard.sexmod.entity.GalathEntity
            || entity instanceof com.trolmastercard.sexmod.entity.player.PlayerGalathEntity) {
            map = GALATH;
        } else if (entity instanceof com.trolmastercard.sexmod.entity.ManglelieEntity) {
            map = MANGLELIE;
        } else {
            return Vec3.ZERO;
        }
        float[] pivot = map.get(bone);
        if (pivot == null) {
            return Vec3.ZERO;
        }
        double x = pivot[0] / 16.0;
        double y = pivot[1] / 16.0;
        double z = pivot[2] / 16.0;
        float yaw = entity.yRotO + (entity.getYRot() - entity.yRotO) * partial;
        double rad = Math.toRadians(yaw);
        double cos = Math.cos(rad);
        double sin = Math.sin(rad);
        return new Vec3(x * cos - z * sin, y, x * sin + z * cos);
    }
}
