package com.trolmastercard.sexmod.client.renderer;

import java.util.Arrays;
import java.util.HashSet;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.core.Vec3i;

public class KoboldRenderer extends GirlRenderer<com.trolmastercard.sexmod.entity.KoboldEntity> {
    static final HashSet<String> a = new HashSet<>(
        Arrays.asList(
            "colorSpots",
            "neck",
            "head",
            "snout",
            "midSectionR",
            "midSectionL",
            "innerCheekLR",
            "innerCheekRR",
            "gayL",
            "gayR",
            "legR",
            "legL",
            "shinL",
            "toesL",
            "kneeL",
            "curvesL",
            "shinR",
            "toesR",
            "kneeR",
            "curvesR",
            "sideL",
            "sideR",
            "hip",
            "torsoL",
            "torsoR",
            "armR",
            "lowerArmR",
            "ellbowR",
            "armL",
            "lowerArmL",
            "ellbowL",
            "hornUL",
            "hornUR",
            "tail",
            "tail2",
            "tail3",
            "tail4",
            "tail5",
            "hornDL2",
            "hornDR2",
            "hornDR3M",
            "hornDL3M",
            "frecklesAL1",
            "frecklesAL2",
            "frecklesAR1",
            "frecklesAR2",
            "frecklesHL1",
            "frecklesHL2",
            "frecklesHR1",
            "frecklesHR2"
        )
    );
    static final HashSet<String> b = new HashSet<>(
        Arrays.asList(
            "boobR",
            "boobL",
            "frontNeck",
            "Rside",
            "Lside",
            "frontAndInside",
            "innerCheekLL",
            "innerCheekRL",
            "layer",
            "layer2",
            "down",
            "down2",
            "down3",
            "down4",
            "down5",
            "fuckhole",
            "hornDR3S",
            "hornDL3S",
            "assholeCoverUp",
            "assholeCoverUp2"
        )
    );

    public KoboldRenderer(Context var1) {
        super(var1, new com.trolmastercard.sexmod.client.model.KoboldModel());
    }

    @Override
    protected int a(com.trolmastercard.sexmod.entity.GirlEntity var1, String var2) {
        return this.a((com.trolmastercard.sexmod.entity.KoboldEntity)var1, var2);
    }

    protected int a(com.trolmastercard.sexmod.entity.KoboldEntity var1, String var2) {
        if (a.contains(var2)) {
            return a(a(var1).a());
        } else if (b.contains(var2)) {
            return a(a(var1).b());
        } else {
            return !"irisR".equals(var2) && !"irisL".equals(var2) ? -1 : a((Vec3i)var1.getEntityData().get(com.trolmastercard.sexmod.entity.VariantGirlEntity.V));
        }
    }

    private static com.trolmastercard.sexmod.EyeAndKoboldColor a(com.trolmastercard.sexmod.entity.KoboldEntity var0) {
        return com.trolmastercard.sexmod.EyeAndKoboldColor.a((String)var0.getEntityData().get(com.trolmastercard.sexmod.entity.VariantGirlEntity.U));
    }

    static int a(Vec3i var0) {
        return var0.getX() << 16 | var0.getY() << 8 | var0.getZ();
    }
}
