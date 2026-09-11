package com.trolmastercard.sexmod.b.b;

import java.util.Arrays;
import java.util.HashSet;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.core.Vec3i;

public class o extends t<com.trolmastercard.sexmod.f.b.h> {
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

    public o(Context var1) {
        super(var1, new com.trolmastercard.sexmod.b.a.o());
    }

    protected int a(com.trolmastercard.sexmod.f.b.h var1, String var2) {
        if (a.contains(var2)) {
            return a(a(var1).a());
        } else if (b.contains(var2)) {
            return a(a(var1).b());
        } else {
            return !"irisR".equals(var2) && !"irisL".equals(var2) ? -1 : a((Vec3i)var1.getEntityData().get(com.trolmastercard.sexmod.f.b.n.V));
        }
    }

    private static com.trolmastercard.sexmod.a a(com.trolmastercard.sexmod.f.b.h var0) {
        return com.trolmastercard.sexmod.a.a((String)var0.getEntityData().get(com.trolmastercard.sexmod.f.b.n.U));
    }

    static int a(Vec3i var0) {
        return var0.getX() << 16 | var0.getY() << 8 | var0.getZ();
    }
}
