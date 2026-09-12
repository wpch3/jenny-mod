package com.trolmastercard.sexmod.client.model;

import com.trolmastercard.sexmod.entity.ScenePose;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.cache.object.GeoBone;

// Port of the 1.12.2 c9 model logic (kobold variant customization, crown/egg,
// tongue and mating-position offsets). Shared by the NPC and player kobold
// models. Robustness improvements over the original: every bone lookup is
// null-safe, every code parse is guarded, and short customization strings
// fall back to defaults instead of throwing.
public final class VariantModelEffects {
    private VariantModelEffects() {
    }

    // Crown/egg visibility (c9 main head, gated on ff + !h() there).
    public static void applyCrownAndEgg(AnimationProcessor<?> proc, boolean showCrown, boolean showEgg) {
        setHidden(proc, "crown", !showCrown);
        setHidden(proc, "egg", !showEgg);
    }

    // Full variant customization from the dash-separated custom string
    // (c9 main: horns, boobs, eyes, freckles, backpack).
    public static void applyCustomization(AnimationProcessor<?> proc, String[] custom, ScenePose pose) {
        if (custom == null) {
            return;
        }
        selectHorns(proc, "hornUL", "hornUR", codeAt(custom, 0));
        selectHorns(proc, "hornDL", "hornDR", codeAt(custom, 1));
        scaleBones(proc, codeAt(custom, 2), 0.75F, 1.35F, "boobL", "boobR", "armorBoobs");
        String eyeCode = codeAt(custom, 3);
        scaleBones(proc, eyeCode, 1.0F, 1.2F, "eyeL", "eyeR");
        shiftEyes(proc, eyeCode, 1.0F, 1.2F);
        selectFreckles(proc, codeAt(custom, 4), "frecklesAR1", "frecklesAR2", "frecklesAL1", "frecklesAL2");
        selectFreckles(proc, codeAt(custom, 5), "frecklesHR1", "frecklesHR2", "frecklesHL1", "frecklesHL2");
        applyBackpack(proc, codeAt(custom, 6), pose);
    }

    // Tongue bone is only out during the blowjob poses (c9 tounge switch).
    public static void applyTounge(AnimationProcessor<?> proc, ScenePose pose) {
        boolean show = pose == ScenePose.b || pose == ScenePose.d || pose == ScenePose.f || pose == ScenePose.e;
        setHidden(proc, "tounge", !show);
    }

    // Mating-position body offsets, only while the action controller is
    // blending (c9.b: Transitioning gate + 0.25 - bodySize scale).
    public static void applySexOffsets(AnimationProcessor<?> proc, ScenePose pose, float bodySize, AnimationController<?> actionController) {
        if (actionController == null || actionController.getAnimationState() != AnimationController.State.TRANSITIONING) {
            return;
        }
        float scale = 0.25F - bodySize;
        GeoBone body = getBone(proc, "body");
        if (body == null) {
            return;
        }
        if (pose == ScenePose.d || pose == ScenePose.e || pose == ScenePose.f) {
            body.setPosZ(11.43F + scale * -7.0F);
        } else if (pose == ScenePose.aa || pose == ScenePose.X || pose == ScenePose.Y || pose == ScenePose.V) {
            body.setPosX(1.78F + scale * -1.5F);
            body.setPosY(13.07F + scale * -11.0F);
            body.setPosZ(2.05F + scale * -8.0F);
        } else if (pose == ScenePose.aK || pose == ScenePose.aL || pose == ScenePose.aM || pose == ScenePose.aN) {
            body.setPosX(0.0F);
            body.setPosY(2.85F);
            body.setPosZ(-7.0F + scale * 4.7F);
        }
    }

    // Horn selector (c9.b/e): hide the whole numbered set, show the rolled one.
    private static void selectHorns(AnimationProcessor<?> proc, String leftPrefix, String rightPrefix, String code) {
        hideNumberedSet(proc, leftPrefix);
        hideNumberedSet(proc, rightPrefix);
        int index = parseIntOr(code, 0);
        setHidden(proc, leftPrefix + index, false);
        setHidden(proc, rightPrefix + index, false);
    }

    private static void hideNumberedSet(AnimationProcessor<?> proc, String prefix) {
        for (int i = 0; ; i++) {
            GeoBone bone = getBone(proc, prefix + i);
            if (bone == null) {
                return;
            }
            bone.setHidden(true);
        }
    }

    // Percent lerp scale (c9.a with bone list): code 0-100 -> min-max.
    private static void scaleBones(AnimationProcessor<?> proc, String code, float min, float max, String... bones) {
        float scale = min + (max - min) * (parseFloatOr(code, 0.0F) / 100.0F);
        for (String name : bones) {
            GeoBone bone = getBone(proc, name);
            if (bone != null) {
                bone.setScaleX(scale);
                bone.setScaleY(scale);
                bone.setScaleZ(scale);
            }
        }
    }

    // Eye spacing shift (c9.a eyeL/eyeR): symmetric position nudge.
    private static void shiftEyes(AnimationProcessor<?> proc, String code, float min, float max) {
        float shift = min + (max - min) * (parseFloatOr(code, 0.0F) / 100.0F) - 1.0F;
        GeoBone eyeL = getBone(proc, "eyeL");
        if (eyeL != null) {
            eyeL.setPosX(eyeL.getPosX() + shift);
        }
        GeoBone eyeR = getBone(proc, "eyeR");
        if (eyeR != null) {
            eyeR.setPosX(eyeR.getPosX() - shift);
        }
    }

    // Freckle set selector (c9.a/d): code picks set 1 (R1+L1) or set 2 (R2+L2).
    private static void selectFreckles(AnimationProcessor<?> proc, String code, String set1Right, String set2Right, String set1Left, String set2Left) {
        int set = parseIntOr(code, 0);
        setHidden(proc, set1Left, set != 1);
        setHidden(proc, set1Right, set != 1);
        setHidden(proc, set2Left, set != 2);
        setHidden(proc, set2Right, set != 2);
    }

    // Backpack/tailpack visibility (c9.a(em, proc, String)).
    private static void applyBackpack(AnimationProcessor<?> proc, String code, ScenePose pose) {
        switch (parseIntOr(code, 0)) {
            case 0:
                setHidden(proc, "backpack", false);
                setHidden(proc, "tailpack", true);
                break;
            case 1:
                setHidden(proc, "backpack", false);
                setHidden(proc, "tailpack", false);
                break;
            case 2:
                setHidden(proc, "backpack", true);
                setHidden(proc, "tailpack", false);
                break;
            case 3:
                setHidden(proc, "backpack", true);
                setHidden(proc, "tailpack", true);
                break;
            default:
                break;
        }
        if (pose == ScenePose.g) {
            setHidden(proc, "backpack", false);
        }
    }

    private static String codeAt(String[] custom, int index) {
        if (index < 0 || index >= custom.length || custom[index] == null) {
            return "0";
        }
        return custom[index];
    }

    private static int parseIntOr(String code, int fallback) {
        try {
            return Integer.parseInt(code.trim());
        } catch (RuntimeException e) {
            return fallback;
        }
    }

    private static float parseFloatOr(String code, float fallback) {
        try {
            return Float.parseFloat(code.trim());
        } catch (RuntimeException e) {
            return fallback;
        }
    }

    private static GeoBone getBone(AnimationProcessor<?> proc, String name) {
        try {
            return proc.getBone(name);
        } catch (RuntimeException e) {
            return null;
        }
    }

    private static void setHidden(AnimationProcessor<?> proc, String name, boolean hidden) {
        GeoBone bone = getBone(proc, name);
        if (bone != null) {
            bone.setHidden(hidden);
        }
    }
}
