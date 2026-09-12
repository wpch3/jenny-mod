package com.trolmastercard.sexmod.client.renderer;

import com.trolmastercard.sexmod.entity.GirlEntity;
import com.trolmastercard.sexmod.entity.OwnableNpc;
import com.trolmastercard.sexmod.entity.ScenePose;
import java.util.UUID;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;

// Hand-written: source missing from decompilation; control flow reconstructed
// instruction-by-instruction from the jar bytecode (the redundant pose check
// below is faithful to the original: either comparison alone is always true).
public class NpcRenderUtils {
    public static float a(GirlEntity var0, float var1, float var2) {
        if (!(var0 instanceof OwnableNpc)) {
            return var1;
        }
        OwnableNpc var3 = (OwnableNpc)var0;
        ScenePose var4 = var0.ai();
        if (var4 != ScenePose.aO || var4 != ScenePose.aP) {
            UUID var5 = var3.g_();
            if (var5 == null) {
                return var1;
            }
            Player var6 = var0.level().getPlayerByUUID(var5);
            if (var6 == null) {
                return var1;
            }
            return var4 == ScenePose.aO ? Mth.rotLerp(var2, var6.yBodyRotO, var6.yBodyRot) : var6.getYHeadRot();
        }
        return var1;
    }
}
