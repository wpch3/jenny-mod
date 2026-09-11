package com.trolmastercard.sexmod.b.a;

import java.util.UUID;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.resources.PlayerSkin.Model;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animation.AnimationProcessor;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.data.EntityModelData;

public abstract class s<T extends com.trolmastercard.sexmod.f.b.k> extends l<T> implements b {
    public static boolean a = true;
    protected ResourceLocation[] b = this.i();

    protected s() {
    }

    @Override
    protected abstract ResourceLocation[] i();

    @Override
    public abstract ResourceLocation j();

    @Override
    public abstract ResourceLocation a(com.trolmastercard.sexmod.f.b.k var1);

    @Override
    public ResourceLocation b(T var1) {
        return b(this.a(var1));
    }

    @Override
    public ResourceLocation c(T var1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.StackOverflowError
        //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
        //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
        //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
        //   at org.jetbrains.java.decompiler.struct.attr.StructLineNumberTableAttribute.initContent(StructLineNumberTableAttribute.java:24)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
        //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
        //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
        //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
        //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
        //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
        //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
        //
        // Bytecode:
        // 00: aload 1
        // 01: invokevirtual com/trolmastercard/sexmod/f/b/k.aj ()I
        // 04: istore 2
        // 05: iload 2
        // 06: aload 0
        // 07: getfield com/trolmastercard/sexmod/b/a/s.b [Lnet/minecraft/resources/ResourceLocation;
        // 0a: arraylength
        // 0b: if_icmpge 12
        // 0e: iload 2
        // 0f: ifge 1b
        // 12: aload 0
        // 13: getfield com/trolmastercard/sexmod/b/a/s.b [Lnet/minecraft/resources/ResourceLocation;
        // 16: bipush 0
        // 17: aaload
        // 18: goto 21
        // 1b: aload 0
        // 1c: getfield com/trolmastercard/sexmod/b/a/s.b [Lnet/minecraft/resources/ResourceLocation;
        // 1f: iload 2
        // 20: aaload
        // 21: astore 3
        // 22: aload 3
        // 23: invokestatic com/trolmastercard/sexmod/b/a/s.a (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/resources/ResourceLocation;
        // 26: areturn
    }

    @Override
    public ResourceLocation d(T var1) {
        return this.j();
    }

    static ResourceLocation a(ResourceLocation var0) {
        return ResourceLocation.fromNamespaceAndPath(var0.getNamespace(), "geo/" + var0.getPath() + ".geo.json");
    }

    static ResourceLocation b(ResourceLocation var0) {
        return ResourceLocation.fromNamespaceAndPath(var0.getNamespace(), "animations/" + var0.getPath() + ".animation.json");
    }

    @Override
    public void a(T var1, long var2, AnimationState<T> var4) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.StackOverflowError
        //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
        //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
        //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
        //   at java.base/java.io.DataInputStream.readUTF(DataInputStream.java:575)
        //   at java.base/java.io.DataInputStream.readUTF(DataInputStream.java:550)
        //   at org.jetbrains.java.decompiler.struct.consts.ConstantPool.<init>(ConstantPool.java:41)
        //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:60)
        //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
        //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
        //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
        //
        // Bytecode:
        // 000: aload 0
        // 001: aload 1
        // 002: lload 2
        // 003: aload 4
        // 005: invokespecial com/trolmastercard/sexmod/b/a/l.setCustomAnimations (Lsoftware/bernie/geckolib/animatable/GeoAnimatable;JLsoftware/bernie/geckolib/animation/AnimationState;)V
        // 008: aload 0
        // 009: invokevirtual com/trolmastercard/sexmod/b/a/s.getAnimationProcessor ()Lsoftware/bernie/geckolib/animation/AnimationProcessor;
        // 00c: astore 5
        // 00e: aload 0
        // 00f: aload 1
        // 010: invokevirtual com/trolmastercard/sexmod/b/a/s.e (Lcom/trolmastercard/sexmod/f/b/k;)Z
        // 013: istore 6
        // 015: aload 0
        // 016: aload 5
        // 018: ldc "rightArmAlex"
        // 01a: iload 6
        // 01c: invokevirtual com/trolmastercard/sexmod/b/a/s.a (Lsoftware/bernie/geckolib/animation/AnimationProcessor;Ljava/lang/String;Z)V
        // 01f: aload 0
        // 020: aload 5
        // 022: ldc "rightLowerArmAlex"
        // 024: iload 6
        // 026: invokevirtual com/trolmastercard/sexmod/b/a/s.a (Lsoftware/bernie/geckolib/animation/AnimationProcessor;Ljava/lang/String;Z)V
        // 029: aload 0
        // 02a: aload 5
        // 02c: ldc "rightArmSteve"
        // 02e: iload 6
        // 030: ifne 037
        // 033: bipush 1
        // 034: goto 038
        // 037: bipush 0
        // 038: invokevirtual com/trolmastercard/sexmod/b/a/s.a (Lsoftware/bernie/geckolib/animation/AnimationProcessor;Ljava/lang/String;Z)V
        // 03b: aload 0
        // 03c: aload 5
        // 03e: ldc "rightLowerArmSteve"
        // 040: iload 6
        // 042: ifne 049
        // 045: bipush 1
        // 046: goto 04a
        // 049: bipush 0
        // 04a: invokevirtual com/trolmastercard/sexmod/b/a/s.a (Lsoftware/bernie/geckolib/animation/AnimationProcessor;Ljava/lang/String;Z)V
        // 04d: aload 0
        // 04e: aload 5
        // 050: ldc "leftArmAlex"
        // 052: iload 6
        // 054: invokevirtual com/trolmastercard/sexmod/b/a/s.a (Lsoftware/bernie/geckolib/animation/AnimationProcessor;Ljava/lang/String;Z)V
        // 057: aload 0
        // 058: aload 5
        // 05a: ldc "leftLowerArmAlex"
        // 05c: iload 6
        // 05e: invokevirtual com/trolmastercard/sexmod/b/a/s.a (Lsoftware/bernie/geckolib/animation/AnimationProcessor;Ljava/lang/String;Z)V
        // 061: aload 0
        // 062: aload 5
        // 064: ldc "leftArmSteve"
        // 066: iload 6
        // 068: ifne 06f
        // 06b: bipush 1
        // 06c: goto 070
        // 06f: bipush 0
        // 070: invokevirtual com/trolmastercard/sexmod/b/a/s.a (Lsoftware/bernie/geckolib/animation/AnimationProcessor;Ljava/lang/String;Z)V
        // 073: aload 0
        // 074: aload 5
        // 076: ldc "leftLowerArmSteve"
        // 078: iload 6
        // 07a: ifne 081
        // 07d: bipush 1
        // 07e: goto 082
        // 081: bipush 0
        // 082: invokevirtual com/trolmastercard/sexmod/b/a/s.a (Lsoftware/bernie/geckolib/animation/AnimationProcessor;Ljava/lang/String;Z)V
        // 085: aload 5
        // 087: ldc "steve"
        // 089: invokevirtual software/bernie/geckolib/animation/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib/cache/object/GeoBone;
        // 08c: astore 7
        // 08e: aload 7
        // 090: ifnull 09f
        // 093: aload 7
        // 095: bipush 1
        // 096: invokevirtual software/bernie/geckolib/cache/object/GeoBone.setHidden (Z)V
        // 099: aload 7
        // 09b: bipush 1
        // 09c: invokevirtual software/bernie/geckolib/cache/object/GeoBone.setChildrenHidden (Z)V
        // 09f: aload 1
        // 0a0: invokevirtual com/trolmastercard/sexmod/f/b/k.ai ()Lcom/trolmastercard/sexmod/f/j;
        // 0a3: ifnull 0fe
        // 0a6: aload 1
        // 0a7: invokevirtual com/trolmastercard/sexmod/f/b/k.ai ()Lcom/trolmastercard/sexmod/f/j;
        // 0aa: getfield com/trolmastercard/sexmod/f/j.cp Z
        // 0ad: ifeq 0fe
        // 0b0: aload 1
        // 0b1: invokevirtual com/trolmastercard/sexmod/f/b/k.al ()Ljava/util/UUID;
        // 0b4: ifnull 0fe
        // 0b7: invokestatic net/minecraft/client/Minecraft.getInstance ()Lnet/minecraft/client/Minecraft;
        // 0ba: astore 8
        // 0bc: aload 8
        // 0be: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
        // 0c1: ifnull 0fe
        // 0c4: aload 8
        // 0c6: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
        // 0c9: invokevirtual net/minecraft/client/player/LocalPlayer.getUUID ()Ljava/util/UUID;
        // 0cc: aload 1
        // 0cd: invokevirtual com/trolmastercard/sexmod/f/b/k.al ()Ljava/util/UUID;
        // 0d0: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 0d3: ifeq 0fe
        // 0d6: aload 8
        // 0d8: getfield net/minecraft/client/Minecraft.options Lnet/minecraft/client/Options;
        // 0db: invokevirtual net/minecraft/client/Options.getCameraType ()Lnet/minecraft/client/CameraType;
        // 0de: invokevirtual net/minecraft/client/CameraType.isFirstPerson ()Z
        // 0e1: ifeq 0fe
        // 0e4: aload 5
        // 0e6: ldc "Head2"
        // 0e8: invokevirtual software/bernie/geckolib/animation/AnimationProcessor.getBone (Ljava/lang/String;)Lsoftware/bernie/geckolib/cache/object/GeoBone;
        // 0eb: astore 9
        // 0ed: aload 9
        // 0ef: ifnull 0fe
        // 0f2: aload 9
        // 0f4: bipush 1
        // 0f5: invokevirtual software/bernie/geckolib/cache/object/GeoBone.setHidden (Z)V
        // 0f8: aload 9
        // 0fa: bipush 1
        // 0fb: invokevirtual software/bernie/geckolib/cache/object/GeoBone.setChildrenHidden (Z)V
        // 0fe: aload 1
        // 0ff: invokevirtual com/trolmastercard/sexmod/f/b/k.getEntityData ()Lnet/minecraft/network/syncher/SynchedEntityData;
        // 102: getstatic com/trolmastercard/sexmod/f/b/k.ap Lnet/minecraft/network/syncher/EntityDataAccessor;
        // 105: invokevirtual net/minecraft/network/syncher/SynchedEntityData.get (Lnet/minecraft/network/syncher/EntityDataAccessor;)Ljava/lang/Object;
        // 108: checkcast java/lang/Boolean
        // 10b: invokevirtual java/lang/Boolean.booleanValue ()Z
        // 10e: ifeq 132
        // 111: aload 1
        // 112: aload 1
        // 113: invokevirtual com/trolmastercard/sexmod/f/b/k.am ()Lnet/minecraft/world/phys/Vec3;
        // 116: getfield net/minecraft/world/phys/Vec3.x D
        // 119: aload 1
        // 11a: invokevirtual com/trolmastercard/sexmod/f/b/k.am ()Lnet/minecraft/world/phys/Vec3;
        // 11d: getfield net/minecraft/world/phys/Vec3.y D
        // 120: aload 1
        // 121: invokevirtual com/trolmastercard/sexmod/f/b/k.am ()Lnet/minecraft/world/phys/Vec3;
        // 124: getfield net/minecraft/world/phys/Vec3.z D
        // 127: aload 1
        // 128: invokevirtual com/trolmastercard/sexmod/f/b/k.e_ ()Ljava/lang/Float;
        // 12b: invokevirtual java/lang/Float.floatValue ()F
        // 12e: fconst_0
        // 12f: invokevirtual com/trolmastercard/sexmod/f/b/k.moveTo (DDDFF)V
        // 132: aload 1
        // 133: getfield com/trolmastercard/sexmod/f/b/k.aB Lsoftware/bernie/geckolib/animation/AnimationController;
        // 136: ifnull 153
        // 139: aload 1
        // 13a: getfield com/trolmastercard/sexmod/f/b/k.aB Lsoftware/bernie/geckolib/animation/AnimationController;
        // 13d: aload 1
        // 13e: invokevirtual com/trolmastercard/sexmod/f/b/k.ai ()Lcom/trolmastercard/sexmod/f/j;
        // 141: ifnull 14e
        // 144: aload 1
        // 145: invokevirtual com/trolmastercard/sexmod/f/b/k.ai ()Lcom/trolmastercard/sexmod/f/j;
        // 148: getfield com/trolmastercard/sexmod/f/j.co I
        // 14b: goto 14f
        // 14e: bipush 5
        // 14f: invokevirtual software/bernie/geckolib/animation/AnimationController.transitionLength (I)Lsoftware/bernie/geckolib/animation/AnimationController;
        // 152: pop
        // 153: aload 0
        // 154: aload 1
        // 155: aload 5
        // 157: aload 4
        // 159: invokevirtual com/trolmastercard/sexmod/b/a/s.a (Lcom/trolmastercard/sexmod/f/b/k;Lsoftware/bernie/geckolib/animation/AnimationProcessor;Lsoftware/bernie/geckolib/animation/AnimationState;)V
        // 15c: aload 0
        // 15d: aload 5
        // 15f: invokevirtual com/trolmastercard/sexmod/b/a/s.a (Lsoftware/bernie/geckolib/animation/AnimationProcessor;)V
        // 162: return
    }

    private void a(AnimationProcessor<T> var1, String var2, boolean var3) {
        GeoBone var4 = var1.getBone(var2);
        if (var4 != null) {
            var4.setHidden(!var3);
            var4.setChildrenHidden(!var3);
        }
    }

    @Override
    protected void a(T var1, AnimationProcessor<T> var2, AnimationState<T> var3) {
        if (this.f(var1)) {
            com.trolmastercard.sexmod.f.j var4 = var1.ai();
            if (var4 == com.trolmastercard.sexmod.f.j.a || var4 == com.trolmastercard.sexmod.f.j.A || var4 == com.trolmastercard.sexmod.f.j.B) {
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

    @Override
    protected void a(AnimationProcessor<T> var1) {
        this.a(var1, false);
        this.b(var1, false);
        this.c(var1, false);
        this.d(var1, false);
    }

    private void a(AnimationProcessor<T> var1, boolean var2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.StackOverflowError
        //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
        //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
        //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
        //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
        //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
        //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
        //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
        //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
        //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
        //
        // Bytecode:
        // 00: aload 0
        // 01: aload 0
        // 02: invokevirtual com/trolmastercard/sexmod/b/a/s.a ()[Ljava/lang/String;
        // 05: iload 2
        // 06: aload 1
        // 07: invokevirtual com/trolmastercard/sexmod/b/a/s.a ([Ljava/lang/String;ZLsoftware/bernie/geckolib/animation/AnimationProcessor;)V
        // 0a: aload 0
        // 0b: aload 0
        // 0c: invokevirtual com/trolmastercard/sexmod/b/a/s.b ()[Ljava/lang/String;
        // 0f: iload 2
        // 10: ifne 17
        // 13: bipush 1
        // 14: goto 18
        // 17: bipush 0
        // 18: aload 1
        // 19: invokevirtual com/trolmastercard/sexmod/b/a/s.a ([Ljava/lang/String;ZLsoftware/bernie/geckolib/animation/AnimationProcessor;)V
        // 1c: return
    }

    private void b(AnimationProcessor<T> var1, boolean var2) {
        this.a(this.c(), var2, var1);
        this.a(this.d(), !var2, var1);
    }

    private void c(AnimationProcessor<T> var1, boolean var2) {
        this.a(this.e(), var2, var1);
        this.a(this.f(), !var2, var1);
    }

    private void d(AnimationProcessor<T> var1, boolean var2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.StackOverflowError
        //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
        //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
        //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:59)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
        //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
        //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
        //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
        //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
        //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
        //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
        //
        // Bytecode:
        // 00: aload 0
        // 01: aload 0
        // 02: invokevirtual com/trolmastercard/sexmod/b/a/s.g ()[Ljava/lang/String;
        // 05: iload 2
        // 06: aload 1
        // 07: invokevirtual com/trolmastercard/sexmod/b/a/s.a ([Ljava/lang/String;ZLsoftware/bernie/geckolib/animation/AnimationProcessor;)V
        // 0a: aload 0
        // 0b: aload 0
        // 0c: invokevirtual com/trolmastercard/sexmod/b/a/s.h ()[Ljava/lang/String;
        // 0f: iload 2
        // 10: ifne 17
        // 13: bipush 1
        // 14: goto 18
        // 17: bipush 0
        // 18: aload 1
        // 19: invokevirtual com/trolmastercard/sexmod/b/a/s.a ([Ljava/lang/String;ZLsoftware/bernie/geckolib/animation/AnimationProcessor;)V
        // 1c: return
    }

    private void a(String[] var1, boolean var2, AnimationProcessor<T> var3) {
        for (String var7 : var1) {
            GeoBone var8 = var3.getBone(var7);
            if (var8 != null) {
                var8.setHidden(!var2);
            }
        }
    }

    @Override
    protected boolean e(T var1) {
        UUID var2 = var1.al();
        if (var2 == null) {
            return true;
        } else {
            return var1.level().getPlayerByUUID(var2) instanceof AbstractClientPlayer var4 ? var4.getSkin().model() == Model.WIDE : true;
        }
    }

    @Override
    protected boolean f(T var1) {
        return true;
    }
}
