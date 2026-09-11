package com.trolmastercard.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class ci extends cv {
    final float g = 60.0F;
    Minecraft f = Minecraft.func_71410_x();

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{
            new ResourceLocation("sexmod", "geo/goblin/goblin.geo.json"), new ResourceLocation("sexmod", "geo/goblin/armored.geo.json")
        };
    }

    @Override
    public ResourceLocation b() {
        return new ResourceLocation("sexmod", "textures/entity/goblin/goblin.png");
    }

    @Override
    public ResourceLocation b(em var1) {
        return new ResourceLocation("sexmod", "animations/goblin/goblin.animation.json");
    }

    @Override
    protected boolean f(em var1) {
        try {
            if (!(var1 instanceof e3)) {
                return super.f(var1);
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        e3 var2 = (e3)var1;
        UUID var3 = var2.ae();
        if (var3 == null) {
            var3 = var2.e();
        }

        try {
            if (var3 == null) {
                return true;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        World var4 = var2.field_70170_p;
        AbstractClientPlayer var5 = (AbstractClientPlayer)var4.func_152378_a(var3);

        try {
            if (var5 == null) {
                return true;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        return "default".equals(var5.func_175154_l());
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
        // 012: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 015: athrow
        // 016: aload 0
        // 017: invokevirtual com/trolmastercard/sexmod/ci.getAnimationProcessor ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // 01a: astore 4
        // 01c: aload 1
        // 01d: instanceof com/trolmastercard/sexmod/e3
        // 020: istore 5
        // 022: aload 4
        // 024: ldc "preggy"
        // 026: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 029: astore 6
        // 02b: aload 6
        // 02d: aload 1
        // 02e: invokevirtual com/trolmastercard/sexmod/em.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 031: getstatic com/trolmastercard/sexmod/e3.aV Lnet/minecraft/network/datasync/DataParameter;
        // 034: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 037: checkcast java/lang/Boolean
        // 03a: invokevirtual java/lang/Boolean.booleanValue ()Z
        // 03d: ifne 048
        // 040: bipush 1
        // 041: goto 049
        // 044: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 047: athrow
        // 048: bipush 0
        // 049: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 04e: aload 4
        // 050: ldc "body"
        // 052: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 055: astore 7
        // 057: aload 4
        // 059: ldc "head"
        // 05b: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 05e: astore 8
        // 060: aload 1
        // 061: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 064: astore 9
        // 066: aload 9
        // 068: getstatic com/trolmastercard/sexmod/fp.BREEDING_SLOW_2 Lcom/trolmastercard/sexmod/fp;
        // 06b: if_acmpeq 08c
        // 06e: aload 9
        // 070: getstatic com/trolmastercard/sexmod/fp.BREEDING_FAST_2 Lcom/trolmastercard/sexmod/fp;
        // 073: if_acmpeq 08c
        // 076: goto 07d
        // 079: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 07c: athrow
        // 07d: aload 9
        // 07f: getstatic com/trolmastercard/sexmod/fp.BREEDING_CUM_2 Lcom/trolmastercard/sexmod/fp;
        // 082: if_acmpne 0b8
        // 085: goto 08c
        // 088: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 08b: athrow
        // 08c: aload 0
        // 08d: getfield com/trolmastercard/sexmod/ci.f Lnet/minecraft/client/Minecraft;
        // 090: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 093: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 096: ifne 0b8
        // 099: goto 0a0
        // 09c: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 09f: athrow
        // 0a0: aload 7
        // 0a2: aload 7
        // 0a4: invokeinterface software/bernie/geckolib3/core/processor/IBone.getPositionY ()F 1
        // 0a9: ldc 1.5
        // 0ab: fadd
        // 0ac: invokeinterface software/bernie/geckolib3/core/processor/IBone.setPositionY (F)V 2
        // 0b1: goto 0b8
        // 0b4: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b7: athrow
        // 0b8: aload 1
        // 0b9: checkcast com/trolmastercard/sexmod/ai
        // 0bc: astore 10
        // 0be: iload 5
        // 0c0: ifeq 0d2
        // 0c3: aload 9
        // 0c5: getstatic com/trolmastercard/sexmod/fp.AWAIT_PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 0c8: if_acmpeq 0e1
        // 0cb: goto 0d2
        // 0ce: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0d1: athrow
        // 0d2: aload 9
        // 0d4: getstatic com/trolmastercard/sexmod/fp.VANISH Lcom/trolmastercard/sexmod/fp;
        // 0d7: if_acmpne 0f1
        // 0da: goto 0e1
        // 0dd: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e0: athrow
        // 0e1: aload 0
        // 0e2: aload 1
        // 0e3: aload 7
        // 0e5: aload 8
        // 0e7: invokevirtual com/trolmastercard/sexmod/ci.a (Lcom/trolmastercard/sexmod/em;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;)V
        // 0ea: goto 0f1
        // 0ed: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0f0: athrow
        // 0f1: iload 5
        // 0f3: ifeq 113
        // 0f6: aload 9
        // 0f8: getstatic com/trolmastercard/sexmod/fp.SIT Lcom/trolmastercard/sexmod/fp;
        // 0fb: if_acmpne 113
        // 0fe: goto 105
        // 101: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 104: athrow
        // 105: aload 0
        // 106: aload 1
        // 107: aload 8
        // 109: invokevirtual com/trolmastercard/sexmod/ci.a (Lcom/trolmastercard/sexmod/em;Lsoftware/bernie/geckolib3/core/processor/IBone;)V
        // 10c: goto 113
        // 10f: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 112: athrow
        // 113: aload 9
        // 115: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 118: if_acmpne 157
        // 11b: aload 0
        // 11c: getfield com/trolmastercard/sexmod/ci.f Lnet/minecraft/client/Minecraft;
        // 11f: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 122: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 125: aload 10
        // 127: invokeinterface com/trolmastercard/sexmod/ai.e ()Ljava/util/UUID; 1
        // 12c: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 12f: ifeq 14b
        // 132: goto 139
        // 135: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 138: athrow
        // 139: aload 0
        // 13a: aload 7
        // 13c: aload 4
        // 13e: aload 1
        // 13f: aload 10
        // 141: invokevirtual com/trolmastercard/sexmod/ci.a (Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/trolmastercard/sexmod/em;Lcom/trolmastercard/sexmod/ai;)V
        // 144: goto 15f
        // 147: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14a: athrow
        // 14b: aload 0
        // 14c: aload 7
        // 14e: aload 4
        // 150: aload 1
        // 151: invokevirtual com/trolmastercard/sexmod/ci.a (Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/trolmastercard/sexmod/em;)V
        // 154: goto 15f
        // 157: aload 7
        // 159: bipush 0
        // 15a: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 15f: aload 7
        // 161: invokeinterface software/bernie/geckolib3/core/processor/IBone.isHidden ()Z 1
        // 166: ifne 178
        // 169: aload 9
        // 16b: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 16e: if_acmpeq 187
        // 171: goto 178
        // 174: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 177: athrow
        // 178: aload 9
        // 17a: getstatic com/trolmastercard/sexmod/fp.THROWN Lcom/trolmastercard/sexmod/fp;
        // 17d: if_acmpne 1b4
        // 180: goto 187
        // 183: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 186: athrow
        // 187: aload 1
        // 188: invokestatic com/trolmastercard/sexmod/ci.d (Lcom/trolmastercard/sexmod/em;)Lnet/minecraft/util/math/Vec3d;
        // 18b: astore 11
        // 18d: aload 7
        // 18f: aload 11
        // 191: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 194: d2f
        // 195: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // 19a: aload 7
        // 19c: aload 11
        // 19e: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 1a1: d2f
        // 1a2: invokeinterface software/bernie/geckolib3/core/processor/IBone.setPositionY (F)V 2
        // 1a7: aload 7
        // 1a9: aload 11
        // 1ab: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 1ae: d2f
        // 1af: invokeinterface software/bernie/geckolib3/core/processor/IBone.setPositionZ (F)V 2
        // 1b4: aload 9
        // 1b6: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 1b9: if_acmpeq 1cb
        // 1bc: aload 9
        // 1be: getstatic com/trolmastercard/sexmod/fp.PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 1c1: if_acmpne 1db
        // 1c4: goto 1cb
        // 1c7: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1ca: athrow
        // 1cb: aload 0
        // 1cc: aload 4
        // 1ce: aload 10
        // 1d0: aload 1
        // 1d1: invokevirtual com/trolmastercard/sexmod/ci.a (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/trolmastercard/sexmod/ai;Lcom/trolmastercard/sexmod/em;)V
        // 1d4: goto 1db
        // 1d7: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1da: athrow
        // 1db: iload 5
        // 1dd: ifne 1f5
        // 1e0: aload 0
        // 1e1: aload 4
        // 1e3: aload 1
        // 1e4: invokevirtual com/trolmastercard/sexmod/ci.b (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/trolmastercard/sexmod/em;)V
        // 1e7: aload 0
        // 1e8: aload 4
        // 1ea: aload 1
        // 1eb: invokevirtual com/trolmastercard/sexmod/ci.a (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/trolmastercard/sexmod/em;)V
        // 1ee: goto 1f5
        // 1f1: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1f4: athrow
        // 1f5: return
        // try (0 -> 10): 10 java/lang/RuntimeException
        // try (22 -> 32): 32 java/lang/RuntimeException
        // try (47 -> 53): 54 java/lang/RuntimeException
        // try (50 -> 59): 60 java/lang/RuntimeException
        // try (56 -> 67): 68 java/lang/RuntimeException
        // try (62 -> 76): 77 java/lang/RuntimeException
        // try (82 -> 87): 88 java/lang/RuntimeException
        // try (84 -> 93): 94 java/lang/RuntimeException
        // try (90 -> 101): 102 java/lang/RuntimeException
        // try (104 -> 109): 110 java/lang/RuntimeException
        // try (106 -> 116): 117 java/lang/RuntimeException
        // try (119 -> 130): 131 java/lang/RuntimeException
        // try (122 -> 140): 140 java/lang/RuntimeException
        // try (151 -> 157): 158 java/lang/RuntimeException
        // try (154 -> 163): 164 java/lang/RuntimeException
        // try (184 -> 190): 191 java/lang/RuntimeException
        // try (187 -> 198): 199 java/lang/RuntimeException
        // try (201 -> 211): 212 java/lang/RuntimeException
    }

    void a(AnimationProcessor param1, em param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 2
        // 01: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 04: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 07: if_acmpeq 0f
        // 0a: return
        // 0b: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e: athrow
        // 0f: aload 0
        // 10: getfield com/trolmastercard/sexmod/ci.f Lnet/minecraft/client/Minecraft;
        // 13: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 16: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 19: ifne 3a
        // 1c: aload 0
        // 1d: getfield com/trolmastercard/sexmod/ci.f Lnet/minecraft/client/Minecraft;
        // 20: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 23: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 26: aload 2
        // 27: checkcast com/trolmastercard/sexmod/ei
        // 2a: invokevirtual com/trolmastercard/sexmod/ei.m ()Ljava/util/UUID;
        // 2d: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 30: ifne 3f
        // 33: goto 3a
        // 36: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 39: athrow
        // 3a: return
        // 3b: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3e: athrow
        // 3f: aload 1
        // 40: ldc "body"
        // 42: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 45: astore 3
        // 46: aload 3
        // 47: ifnonnull 4f
        // 4a: return
        // 4b: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4e: athrow
        // 4f: aload 3
        // 50: bipush 1
        // 51: invokeinterface software/bernie/geckolib3/core/processor/IBone.setHidden (Z)V 2
        // 56: return
        // try (0 -> 5): 5 java/lang/RuntimeException
        // try (7 -> 21): 22 java/lang/RuntimeException
        // try (12 -> 25): 25 java/lang/RuntimeException
        // try (31 -> 34): 34 java/lang/RuntimeException
    }

    void b(AnimationProcessor param1, em param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 2
        // 01: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 04: getstatic com/trolmastercard/sexmod/fp.PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 07: if_acmpeq 0f
        // 0a: return
        // 0b: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e: athrow
        // 0f: aload 0
        // 10: getfield com/trolmastercard/sexmod/ci.f Lnet/minecraft/client/Minecraft;
        // 13: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 16: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 19: ifne 41
        // 1c: aload 0
        // 1d: getfield com/trolmastercard/sexmod/ci.f Lnet/minecraft/client/Minecraft;
        // 20: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 23: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 26: aload 2
        // 27: checkcast com/trolmastercard/sexmod/ai
        // 2a: invokeinterface com/trolmastercard/sexmod/ai.e ()Ljava/util/UUID; 1
        // 2f: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 32: ifeq 41
        // 35: goto 3c
        // 38: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3b: athrow
        // 3c: return
        // 3d: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 40: athrow
        // 41: aload 1
        // 42: ldc "body"
        // 44: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 47: astore 3
        // 48: aload 3
        // 49: ifnonnull 51
        // 4c: return
        // 4d: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 50: athrow
        // 51: aload 1
        // 52: ldc "steve"
        // 54: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
        // 57: astore 4
        // 59: aload 4
        // 5b: ifnonnull 63
        // 5e: return
        // 5f: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 62: athrow
        // 63: aload 3
        // 64: aload 3
        // 65: invokeinterface software/bernie/geckolib3/core/processor/IBone.getPositionY ()F 1
        // 6a: ldc 32.0
        // 6c: fsub
        // 6d: invokeinterface software/bernie/geckolib3/core/processor/IBone.setPositionY (F)V 2
        // 72: aload 4
        // 74: aload 4
        // 76: invokeinterface software/bernie/geckolib3/core/processor/IBone.getPositionY ()F 1
        // 7b: ldc 32.0
        // 7d: fsub
        // 7e: invokeinterface software/bernie/geckolib3/core/processor/IBone.setPositionY (F)V 2
        // 83: return
        // try (0 -> 5): 5 java/lang/RuntimeException
        // try (7 -> 21): 22 java/lang/RuntimeException
        // try (12 -> 25): 25 java/lang/RuntimeException
        // try (31 -> 34): 34 java/lang/RuntimeException
        // try (40 -> 43): 43 java/lang/RuntimeException
    }

    void a(AnimationProcessor var1, ai var2, em var3) {
        UUID var4 = var2.e();

        try {
            if (var4 == null) {
                var3.ae();
            }
        } catch (RuntimeException var12) {
            throw a(var12);
        }

        try {
            if (var4 == null) {
                return;
            }
        } catch (RuntimeException var14) {
            throw a(var14);
        }

        EntityPlayer var5 = var3.field_70170_p.func_152378_a(var4);

        try {
            if (var5 == null) {
                return;
            }
        } catch (RuntimeException var13) {
            throw a(var13);
        }

        float var6 = b6.a(var5.field_184618_aE, var5.field_70721_aZ, this.f.func_184121_ak());
        float var7 = var5.field_184619_aG;
        float var8 = (float)Math.sin(var7);
        IBone var9 = var1.getBone("LeftLeg");
        IBone var10 = var1.getBone("RightLeg");
        float var11 = gc.c(60.0F * var8 * var6);
        var9.setRotationX(var11);
        var10.setRotationX(-var11);
    }

    void a(em param1, IBone param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 1
        // 001: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 004: aload 1
        // 005: ldc2_w 15.0
        // 008: invokevirtual net/minecraft/world/World.func_72890_a (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
        // 00b: astore 3
        // 00c: aload 3
        // 00d: ifnonnull 015
        // 010: return
        // 011: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 014: athrow
        // 015: aload 3
        // 016: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 019: astore 4
        // 01b: aload 1
        // 01c: invokevirtual com/trolmastercard/sexmod/em.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 01f: astore 5
        // 021: aload 4
        // 023: aload 5
        // 025: invokevirtual net/minecraft/util/math/Vec3d.func_178788_d (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 028: astore 6
        // 02a: aload 1
        // 02b: getfield com/trolmastercard/sexmod/em.field_70177_z F
        // 02e: fstore 7
        // 030: bipush 0
        // 031: istore 8
        // 033: fload 7
        // 035: f2i
        // 036: lookupswitch 158 4 -90 133 0 42 90 105 180 77
        // 060: aload 4
        // 062: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 065: aload 5
        // 067: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 06a: dcmpl
        // 06b: ifle 07d
        // 06e: goto 075
        // 071: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 074: athrow
        // 075: bipush 1
        // 076: goto 07e
        // 079: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 07c: athrow
        // 07d: bipush 0
        // 07e: istore 8
        // 080: goto 0d4
        // 083: aload 4
        // 085: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 088: aload 5
        // 08a: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 08d: dcmpg
        // 08e: ifge 099
        // 091: bipush 1
        // 092: goto 09a
        // 095: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 098: athrow
        // 099: bipush 0
        // 09a: istore 8
        // 09c: goto 0d4
        // 09f: aload 4
        // 0a1: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 0a4: aload 5
        // 0a6: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 0a9: dcmpg
        // 0aa: ifge 0b5
        // 0ad: bipush 1
        // 0ae: goto 0b6
        // 0b1: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b4: athrow
        // 0b5: bipush 0
        // 0b6: istore 8
        // 0b8: goto 0d4
        // 0bb: aload 4
        // 0bd: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 0c0: aload 5
        // 0c2: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 0c5: dcmpl
        // 0c6: ifle 0d1
        // 0c9: bipush 1
        // 0ca: goto 0d2
        // 0cd: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0d0: athrow
        // 0d1: bipush 0
        // 0d2: istore 8
        // 0d4: iload 8
        // 0d6: ifne 0e5
        // 0d9: aload 2
        // 0da: fconst_0
        // 0db: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 0e0: return
        // 0e1: invokestatic com/trolmastercard/sexmod/ci.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e4: athrow
        // 0e5: fconst_0
        // 0e6: fstore 9
        // 0e8: fload 7
        // 0ea: f2i
        // 0eb: lookupswitch 51 3 0 47 90 40 180 33
        // 10c: ldc 90.0
        // 10e: fstore 9
        // 110: goto 11e
        // 113: ldc 180.0
        // 115: fstore 9
        // 117: goto 11e
        // 11a: ldc -90.0
        // 11c: fstore 9
        // 11e: aload 6
        // 120: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 123: aload 6
        // 125: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 128: invokestatic net/minecraft/util/math/MathHelper.func_181159_b (DD)D
        // 12b: ldc2_w 57.29577951308232
        // 12e: dmul
        // 12f: fload 9
        // 131: f2d
        // 132: dadd
        // 133: dneg
        // 134: d2f
        // 135: fstore 10
        // 137: aload 3
        // 138: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70047_e ()F
        // 13b: f2d
        // 13c: aload 4
        // 13e: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 141: dadd
        // 142: aload 1
        // 143: invokevirtual com/trolmastercard/sexmod/em.func_70047_e ()F
        // 146: f2d
        // 147: aload 5
        // 149: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 14c: dadd
        // 14d: dsub
        // 14e: d2f
        // 14f: ldc -0.75
        // 151: ldc 0.75
        // 153: invokestatic com/trolmastercard/sexmod/be.b (FFF)F
        // 156: fstore 11
        // 158: aload 2
        // 159: fload 10
        // 15b: invokestatic com/trolmastercard/sexmod/gc.c (F)F
        // 15e: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationY (F)V 2
        // 163: aload 2
        // 164: fload 11
        // 166: invokeinterface software/bernie/geckolib3/core/processor/IBone.setRotationX (F)V 2
        // 16b: return
        // try (6 -> 9): 9 java/lang/RuntimeException
        // try (26 -> 35): 36 java/lang/RuntimeException
        // try (29 -> 40): 40 java/lang/RuntimeException
        // try (45 -> 53): 53 java/lang/RuntimeException
        // try (58 -> 66): 66 java/lang/RuntimeException
        // try (71 -> 79): 79 java/lang/RuntimeException
        // try (83 -> 89): 89 java/lang/RuntimeException
    }

    void a(em var1, IBone var2, IBone var3) {
        EntityPlayer var4 = var1.field_70170_p.func_72890_a(var1, 15.0);

        try {
            if (var4 == null) {
                return;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        Vec3d var5 = var4.func_174791_d();
        Vec3d var6 = var1.func_174791_d();
        Vec3d var7 = var5.func_178788_d(var6);
        float var8 = (float)(-(Math.atan2(var7.field_72449_c, var7.field_72450_a) * (180.0 / Math.PI))) + 90.0F;
        float var9 = be.b((float)(var4.func_70047_e() + var5.field_72448_b - (var1.func_70047_e() + var6.field_72448_b)), -0.75F, 0.75F);
        var2.setRotationY(gc.c(var8));
        var3.setRotationX(var9);
    }

    void a(IBone var1, AnimationProcessor var2, em var3) {
        try {
            if (var3.h()) {
                var1.setHidden(true);
                return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        var1.setHidden(false);
        var2.getBone("steve").setHidden(true);
    }

    void a(IBone var1, AnimationProcessor var2, em var3, ai var4) {
        label38: {
            try {
                if (var3.h()) {
                    var1.setHidden(true);
                    break label38;
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            IBone var10000;
            boolean var10001;
            label29: {
                try {
                    var10000 = var1;
                    if (var4.a() < 15) {
                        var10001 = true;
                        break label29;
                    }
                } catch (RuntimeException var6) {
                    throw a(var6);
                }

                var10001 = false;
            }

            var10000.setHidden(var10001);
        }

        try {
            if (!var3.h()) {
                var2.getBone("steve").setHidden(true);
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorBoobL", "armorBoobR"};
    }

    @Override
    public String[] a() {
        return new String[]{"nippleL", "nippleR"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorCheekR", "armorCheekL", "armorLegL", "armorLegR", "armorShinL", "armorShinR", "armorTorso"};
    }

    @Override
    public String[] e() {
        return new String[]{"fuckhole", "vagina", "meatCheekR", "meatCheekL", "meatLegL", "meatLegR", "meatShinL", "meatShinR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorFootL", "armorFootR"};
    }

    @Override
    public String[] d() {
        return new String[]{"meatFootL", "meatFootR"};
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
