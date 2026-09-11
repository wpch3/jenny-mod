package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class c9 extends cv {
    static final float g = 1.2F;
    static final float f = 1.0F;

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{
            new ResourceLocation("sexmod", "geo/kobold/kobold.geo.json"), new ResourceLocation("sexmod", "geo/kobold/armored.geo.json")
        };
    }

    @Override
    public ResourceLocation b() {
        return new ResourceLocation("sexmod", "textures/entity/kobold/kobold.png");
    }

    @Override
    public ResourceLocation b(em var1) {
        return new ResourceLocation("sexmod", "animations/kobold/kobold.animation.json");
    }

    @Override
    public void a(em param1, Integer param2, AnimationEvent param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: aload 1
        // 002: aload 2
        // 003: aload 3
        // 004: invokespecial com/trolmastercard/sexmod/cv.a (Lcom/trolmastercard/sexmod/em;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
        // 007: aload 1
        // 008: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 00b: instanceof com/trolmastercard/sexmod/gj
        // 00e: ifeq 016
        // 011: return
        // 012: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 015: athrow
        // 016: aload 0
        // 017: invokevirtual com/trolmastercard/sexmod/c9.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 01a: astore 4
        // 01c: aload 1
        // 01d: invokevirtual com/trolmastercard/sexmod/em.h ()Z
        // 020: ifne 082
        // 023: aload 1
        // 024: instanceof com/trolmastercard/sexmod/ff
        // 027: ifeq 082
        // 02a: goto 031
        // 02d: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 030: athrow
        // 031: aload 4
        // 033: ldc "crown"
        // 035: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 038: aload 1
        // 039: invokevirtual com/trolmastercard/sexmod/em.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 03c: getstatic com/trolmastercard/sexmod/ff.aZ Lnet/minecraft/network/datasync/DataParameter;
        // 03f: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 042: checkcast java/lang/Boolean
        // 045: invokevirtual java/lang/Boolean.booleanValue ()Z
        // 048: ifne 05a
        // 04b: goto 052
        // 04e: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 051: athrow
        // 052: bipush 1
        // 053: goto 05b
        // 056: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 059: athrow
        // 05a: bipush 0
        // 05b: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 060: aload 4
        // 062: ldc "egg"
        // 064: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 067: aload 1
        // 068: checkcast com/trolmastercard/sexmod/ff
        // 06b: getfield com/trolmastercard/sexmod/ff.Q Z
        // 06e: ifne 079
        // 071: bipush 1
        // 072: goto 07a
        // 075: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 078: athrow
        // 079: bipush 0
        // 07a: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 07f: goto 09c
        // 082: aload 4
        // 084: ldc "crown"
        // 086: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 089: bipush 1
        // 08a: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 08f: aload 4
        // 091: ldc "egg"
        // 093: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 096: bipush 1
        // 097: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 09c: aload 1
        // 09d: invokestatic com/trolmastercard/sexmod/e4.a (Lcom/trolmastercard/sexmod/em;)[Ljava/lang/String;
        // 0a0: astore 5
        // 0a2: aload 0
        // 0a3: aload 4
        // 0a5: aload 5
        // 0a7: bipush 0
        // 0a8: aaload
        // 0a9: invokevirtual com/trolmastercard/sexmod/c9.b (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;)V
        // 0ac: aload 0
        // 0ad: aload 4
        // 0af: aload 5
        // 0b1: bipush 1
        // 0b2: aaload
        // 0b3: invokevirtual com/trolmastercard/sexmod/c9.e (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;)V
        // 0b6: aload 0
        // 0b7: aload 4
        // 0b9: aload 5
        // 0bb: bipush 2
        // 0bc: aaload
        // 0bd: ldc 0.75
        // 0bf: ldc 1.35
        // 0c1: bipush 3
        // 0c2: anewarray 181
        // 0c5: dup
        // 0c6: bipush 0
        // 0c7: ldc "boobL"
        // 0c9: aastore
        // 0ca: dup
        // 0cb: bipush 1
        // 0cc: ldc "boobR"
        // 0ce: aastore
        // 0cf: dup
        // 0d0: bipush 2
        // 0d1: ldc "armorBoobs"
        // 0d3: aastore
        // 0d4: invokevirtual com/trolmastercard/sexmod/c9.a (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;FF[Ljava/lang/String;)V
        // 0d7: aload 0
        // 0d8: aload 4
        // 0da: aload 5
        // 0dc: bipush 3
        // 0dd: aaload
        // 0de: fconst_1
        // 0df: ldc 1.2
        // 0e1: bipush 2
        // 0e2: anewarray 181
        // 0e5: dup
        // 0e6: bipush 0
        // 0e7: ldc "eyeL"
        // 0e9: aastore
        // 0ea: dup
        // 0eb: bipush 1
        // 0ec: ldc "eyeR"
        // 0ee: aastore
        // 0ef: invokevirtual com/trolmastercard/sexmod/c9.a (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;FF[Ljava/lang/String;)V
        // 0f2: aload 0
        // 0f3: aload 4
        // 0f5: aload 5
        // 0f7: bipush 3
        // 0f8: aaload
        // 0f9: fconst_1
        // 0fa: ldc 1.2
        // 0fc: invokevirtual com/trolmastercard/sexmod/c9.a (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;FF)V
        // 0ff: aload 0
        // 100: aload 4
        // 102: aload 5
        // 104: bipush 4
        // 105: aaload
        // 106: invokevirtual com/trolmastercard/sexmod/c9.a (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;)V
        // 109: aload 0
        // 10a: aload 4
        // 10c: aload 5
        // 10e: bipush 5
        // 10f: aaload
        // 110: invokevirtual com/trolmastercard/sexmod/c9.d (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;)V
        // 113: aload 0
        // 114: aload 1
        // 115: aload 4
        // 117: aload 5
        // 119: bipush 6
        // 11b: aaload
        // 11c: invokevirtual com/trolmastercard/sexmod/c9.a (Lcom/trolmastercard/sexmod/em;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Ljava/lang/String;)V
        // 11f: getstatic com/trolmastercard/sexmod/c9$a.a [I
        // 122: aload 1
        // 123: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 126: invokevirtual com/trolmastercard/sexmod/fp.ordinal ()I
        // 129: iaload
        // 12a: tableswitch 50 1 4 30 30 30 30
        // 148: aload 4
        // 14a: ldc "tounge"
        // 14c: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 14f: bipush 0
        // 150: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 155: goto 169
        // 158: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 15b: athrow
        // 15c: aload 4
        // 15e: ldc "tounge"
        // 160: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 163: bipush 1
        // 164: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 169: aload 0
        // 16a: aload 1
        // 16b: aload 4
        // 16d: invokevirtual com/trolmastercard/sexmod/c9.b (Lcom/trolmastercard/sexmod/em;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;)V
        // 170: return
        // try (0 -> 10): 10 java/lang/RuntimeException
        // try (15 -> 21): 22 java/lang/RuntimeException
        // try (18 -> 34): 35 java/lang/RuntimeException
        // try (24 -> 39): 39 java/lang/RuntimeException
        // try (42 -> 52): 52 java/lang/RuntimeException
        // try (70 -> 161): 161 java/lang/RuntimeException
    }

    void b(em var1, AnimationProcessor var2) {
        try {
            if (var1.C.getAnimationState() != AnimationState.Transitioning) {
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        float var3 = (Float)var1.func_184212_Q().func_187225_a(ff.aE);
        var3 = 0.25F - var3;
        switch (var1.y()) {
            case SUCKBLOWJOB_BLINK:
            case THRUSTBLOWJOB:
            case CUMBLOWJOB:
                IBone var8 = var2.getBone("body");
                var8.setPositionZ(11.43F + var3 * -7.0F);
                return;
            case KOBOLD_ANAL_SLOW:
            case ANAL_FAST:
            case ANAL_CUM:
            case ANAL_START:
                IBone var7 = var2.getBone("body");
                var7.setPositionX(1.78F + var3 * -1.5F);
                var7.setPositionY(13.07F + var3 * -11.0F);
                var7.setPositionZ(2.05F + var3 * -8.0F);
                return;
            case MATING_PRESS_CUM:
            case MATING_PRESS_HARD:
            case MATING_PRESS_SOFT:
            case MATING_PRESS_START:
                IBone var4 = var2.getBone("body");
                var4.setPositionX(0.0F);
                var4.setPositionY(2.85F);
                var4.setPositionZ(-7.0F + var3 * 4.7F);
                return;
        }
    }

    void a(em var1, AnimationProcessor var2, String var3) {
        int var4 = Integer.parseInt(var3);
        IBone var5 = var2.getBone("backpack");
        IBone var6 = var2.getBone("tailpack");

        label34: {
            label33: {
                label32: {
                    try {
                        switch (var4) {
                            case 0:
                                var5.setHidden(false);
                                var6.setHidden(true);
                                break label34;
                            case 1:
                                break label33;
                            case 2:
                                break label32;
                            case 3:
                                break;
                            default:
                                break label34;
                        }
                    } catch (RuntimeException var8) {
                        throw a(var8);
                    }

                    var5.setHidden(true);
                    var6.setHidden(true);
                    break label34;
                }

                var5.setHidden(true);
                var6.setHidden(false);
                break label34;
            }

            var5.setHidden(false);
            var6.setHidden(false);
        }

        try {
            if (var1.y() == fp.PAYMENT) {
                var5.setHidden(false);
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }
    }

    void d(AnimationProcessor var1, String var2) {
        int var3 = Integer.parseInt(var2);
        IBone var4 = var1.getBone("frecklesHR1");
        IBone var5 = var1.getBone("frecklesHR2");
        IBone var6 = var1.getBone("frecklesHL1");
        IBone var7 = var1.getBone("frecklesHL2");

        IBone var10000;
        boolean var10001;
        label53: {
            try {
                var10000 = var6;
                if (var3 != 1) {
                    var10001 = true;
                    break label53;
                }
            } catch (RuntimeException var11) {
                throw a(var11);
            }

            var10001 = false;
        }

        label46: {
            try {
                var10000.setHidden(var10001);
                var10000 = var4;
                if (var3 != 1) {
                    var10001 = true;
                    break label46;
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            var10001 = false;
        }

        label39: {
            try {
                var10000.setHidden(var10001);
                var10000 = var7;
                if (var3 != 2) {
                    var10001 = true;
                    break label39;
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }

            var10001 = false;
        }

        label32: {
            try {
                var10000.setHidden(var10001);
                var10000 = var5;
                if (var3 != 2) {
                    var10001 = true;
                    break label32;
                }
            } catch (RuntimeException var8) {
                throw a(var8);
            }

            var10001 = false;
        }

        var10000.setHidden(var10001);
    }

    void a(AnimationProcessor var1, String var2) {
        int var3 = Integer.parseInt(var2);
        IBone var4 = var1.getBone("frecklesAR1");
        IBone var5 = var1.getBone("frecklesAR2");
        IBone var6 = var1.getBone("frecklesAL1");
        IBone var7 = var1.getBone("frecklesAL2");

        IBone var10000;
        boolean var10001;
        label53: {
            try {
                var10000 = var6;
                if (var3 != 1) {
                    var10001 = true;
                    break label53;
                }
            } catch (RuntimeException var11) {
                throw a(var11);
            }

            var10001 = false;
        }

        label46: {
            try {
                var10000.setHidden(var10001);
                var10000 = var4;
                if (var3 != 1) {
                    var10001 = true;
                    break label46;
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            var10001 = false;
        }

        label39: {
            try {
                var10000.setHidden(var10001);
                var10000 = var7;
                if (var3 != 2) {
                    var10001 = true;
                    break label39;
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }

            var10001 = false;
        }

        label32: {
            try {
                var10000.setHidden(var10001);
                var10000 = var5;
                if (var3 != 2) {
                    var10001 = true;
                    break label32;
                }
            } catch (RuntimeException var8) {
                throw a(var8);
            }

            var10001 = false;
        }

        var10000.setHidden(var10001);
    }

    void a(AnimationProcessor var1, String var2, float var3, float var4) {
        try {
            if (Minecraft.func_71410_x().func_147113_T()) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        float var5 = Float.parseFloat(var2);
        var5 /= 100.0F;
        var5 = var3 + (var4 - var3) * var5 - 1.0F;
        IBone var6 = var1.getBone("eyeL");
        var6.setPositionX(var6.getPositionX() + var5);
        IBone var7 = var1.getBone("eyeR");
        var7.setPositionX(var7.getPositionX() - var5);
    }

    void a(AnimationProcessor var1, String var2, float var3, float var4, String... var5) {
        float var6 = Float.parseFloat(var2);
        var6 /= 100.0F;
        var6 = var3 + (var4 - var3) * var6;

        for (String var10 : var5) {
            IBone var11 = var1.getBone(var10);

            try {
                if (var11 == null) {
                    continue;
                }
            } catch (RuntimeException var12) {
                throw a(var12);
            }

            var11.setScaleX(var6);
            var11.setScaleY(var6);
            var11.setScaleZ(var6);
        }
    }

    void e(AnimationProcessor var1, String var2) {
        List var3 = this.c(var1, "hornDL");
        List var4 = this.c(var1, "hornDR");
        this.a(var3);
        this.a(var4);
        int var5 = new Integer(var2);
        var1.getBone("hornDL" + var5).setHidden(false);
        var1.getBone("hornDR" + var5).setHidden(false);
    }

    void b(AnimationProcessor var1, String var2) {
        List var3 = this.c(var1, "hornUL");
        List var4 = this.c(var1, "hornUR");
        this.a(var3);
        this.a(var4);
        int var5 = new Integer(var2);
        var1.getBone("hornUL" + var5).setHidden(false);
        var1.getBone("hornUR" + var5).setHidden(false);
    }

    List<IBone> c(AnimationProcessor var1, String var2) {
        ArrayList var3 = new ArrayList();
        int var4 = 0;

        while (true) {
            IBone var5 = var1.getBone(var2 + var4);

            try {
                if (var5 == null) {
                    return var3;
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }

            var3.add(var5);
            var4++;
        }
    }

    void a(List<IBone> var1) {
        for (IBone var3 : var1) {
            var3.setHidden(true);
        }
    }

    @Override
    protected void a(em param1, AnimationProcessor param2, AnimationEvent param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 04: instanceof com/trolmastercard/sexmod/gj
        // 07: ifeq 0f
        // 0a: return
        // 0b: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e: athrow
        // 0f: getstatic com/trolmastercard/sexmod/c9$a.a [I
        // 12: aload 1
        // 13: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 16: invokevirtual com/trolmastercard/sexmod/fp.ordinal ()I
        // 19: iaload
        // 1a: lookupswitch 127 1 13 18
        // 2c: aload 1
        // 2d: getfield com/trolmastercard/sexmod/em.field_70169_q D
        // 30: aload 1
        // 31: getfield com/trolmastercard/sexmod/em.field_70165_t D
        // 34: dsub
        // 35: invokestatic java/lang/Math.abs (D)D
        // 38: aload 1
        // 39: getfield com/trolmastercard/sexmod/em.field_70166_s D
        // 3c: aload 1
        // 3d: getfield com/trolmastercard/sexmod/em.field_70161_v D
        // 40: dsub
        // 41: invokestatic java/lang/Math.abs (D)D
        // 44: dadd
        // 45: dconst_0
        // 46: dcmpg
        // 47: ifge 58
        // 4a: goto 51
        // 4d: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 50: athrow
        // 51: goto 9a
        // 54: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 57: athrow
        // 58: aload 1
        // 59: getfield com/trolmastercard/sexmod/em.field_70122_E Z
        // 5c: ifeq 86
        // 5f: aload 1
        // 60: getfield com/trolmastercard/sexmod/em.field_70167_r D
        // 63: invokestatic java/lang/Math.abs (D)D
        // 66: aload 1
        // 67: getfield com/trolmastercard/sexmod/em.field_70163_u D
        // 6a: invokestatic java/lang/Math.abs (D)D
        // 6d: dsub
        // 6e: invokestatic java/lang/Math.abs (D)D
        // 71: ldc2_w 0.10000000149011612
        // 74: dcmpl
        // 75: ifle 86
        // 78: goto 7f
        // 7b: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 7e: athrow
        // 7f: goto 9a
        // 82: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 85: athrow
        // 86: aload 1
        // 87: checkcast com/trolmastercard/sexmod/dr
        // 8a: invokeinterface com/trolmastercard/sexmod/dr.a ()Z 1
        // 8f: ifne 99
        // 92: goto 9a
        // 95: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 98: athrow
        // 99: return
        // 9a: aload 3
        // 9b: ldc software/bernie/geckolib3/model/provider/data/EntityModelData
        // 9d: invokevirtual software/bernie/geckolib3/core/event/predicate/AnimationEvent.getExtraDataOfType (Ljava/lang/Class;)Ljava/util/List;
        // a0: bipush 0
        // a1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
        // a6: checkcast software/bernie/geckolib3/model/provider/data/EntityModelData
        // a9: astore 4
        // ab: aload 2
        // ac: ldc "head"
        // ae: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // b1: astore 5
        // b3: aload 5
        // b5: aload 4
        // b7: getfield software/bernie/geckolib3/model/provider/data/EntityModelData.netHeadYaw F
        // ba: ldc 0.017453292
        // bc: fmul
        // bd: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // c2: aload 5
        // c4: aload 4
        // c6: getfield software/bernie/geckolib3/model/provider/data/EntityModelData.headPitch F
        // c9: ldc 0.017453292
        // cb: fmul
        // cc: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // d1: aload 2
        // d2: ldc "body"
        // d4: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // d7: ifnonnull e7
        // da: aload 2
        // db: ldc "dd"
        // dd: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // e0: goto ed
        // e3: invokestatic com/trolmastercard/sexmod/c9.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // e6: athrow
        // e7: aload 2
        // e8: ldc "body"
        // ea: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // ed: astore 6
        // ef: aload 6
        // f1: fconst_0
        // f2: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // f7: return
        // try (0 -> 5): 5 java/lang/RuntimeException
        // try (7 -> 29): 30 java/lang/RuntimeException
        // try (13 -> 33): 33 java/lang/RuntimeException
        // try (35 -> 49): 50 java/lang/RuntimeException
        // try (38 -> 53): 53 java/lang/RuntimeException
        // try (55 -> 60): 60 java/lang/RuntimeException
        // try (74 -> 94): 94 java/lang/RuntimeException
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
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
        return new String[]{
            "armorBootyR",
            "armorBootyL",
            "armorPantsLowL",
            "armorPantsLowR",
            "armorPantsLowR",
            "armorPantsUpR",
            "armorPantsUpL",
            "armorHip",
            "armorKneeR",
            "armorKneeL"
        };
    }

    @Override
    public String[] e() {
        return new String[]{"fleshL", "fleshR", "vagina", "fuckhole", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

    @Override
    public String[] d() {
        return new String[]{"toesR", "toesL"};
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
