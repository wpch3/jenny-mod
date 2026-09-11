package com.trolmastercard.sexmod;

import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class dm extends d_ {
    public static boolean v = false;
    ItemStack s = ItemStack.field_190927_a;
    ItemStack x = ItemStack.field_190927_a;
    boolean r = false;
    boolean u = false;
    protected ei w;
    protected float y;
    float t = 0.0F;

    public dm(RenderManager var1, AnimatedGeoModel var2) {
        super(var1, var2, 0.0);
    }

    public void func_76979_b(Entity var1, double var2, double var4, double var6, float var8, float var9) {
    }

    boolean a(em var1) {
        try {
            if (var1.h()) {
                return true;
            }
        } catch (IllegalStateException var3) {
            throw b(var3);
        }

        boolean var2 = v;
        v = false;
        return var2;
    }

    @Override
    public void a(em var1, double var2, double var4, double var6, float var8, float var9) {
        try {
            if (!this.a(var1)) {
                return;
            }
        } catch (IllegalStateException var15) {
            throw b(var15);
        }

        ei var10 = (ei)var1;

        try {
            if (var10.m() == null) {
                return;
            }
        } catch (IllegalStateException var14) {
            throw b(var14);
        }

        EntityPlayer var11 = Minecraft.func_71410_x().field_71439_g.field_70170_p.func_152378_a(var10.m());

        try {
            if (var11 == null) {
                return;
            }
        } catch (IllegalStateException var12) {
            throw b(var12);
        }

        try {
            this.s = var11.func_184614_ca();
            this.x = var11.func_184592_cb();
            this.u = var10.ah;
            this.r = var10.ad;
            this.w = (ei)var1;
            this.y = var9;
            var10.f(var11);
            if (this.a(var11, var1)) {
                this.func_147906_a(var1, var11.func_70005_c_(), var2, var4 + var10.i(), var6, 300);
            }
        } catch (IllegalStateException var13) {
            throw b(var13);
        }

        super.a(var1, var2, var4, var6, var8, var9);
    }

    @Override
    public Entity c(em var1) {
        try {
            if (!(var1 instanceof ei)) {
                return var1;
            }
        } catch (IllegalStateException var5) {
            throw b(var5);
        }

        ei var2 = (ei)var1;
        EntityPlayer var3 = var2.k();

        try {
            return (Entity)(var3 == null ? var1 : var3);
        } catch (IllegalStateException var4) {
            throw b(var4);
        }
    }

    boolean a(EntityPlayer var1, em var2) {
        try {
            if (var1.getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID())) {
                return false;
            }
        } catch (IllegalStateException var6) {
            throw b(var6);
        }

        fp var3 = var2.y();

        try {
            if (var3 == null) {
                return true;
            }
        } catch (IllegalStateException var4) {
            throw b(var4);
        }

        try {
            if (!var3.hideNameTag) {
                return true;
            }
        } catch (IllegalStateException var5) {
            throw b(var5);
        }

        return false;
    }

    protected void a(String var1, GeoBone var2) {
    }

    protected void a(String var1, GeoBone var2, ei var3, BufferBuilder var4) {
    }

    @Override
    public void renderRecursively(BufferBuilder param1, GeoBone param2, float param3, float param4, float param5, float param6) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 2
        // 001: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
        // 004: astore 7
        // 006: aload 0
        // 007: getfield com/trolmastercard/sexmod/dm.r Z
        // 00a: ifeq 04c
        // 00d: aload 7
        // 00f: ldc "upperBody"
        // 011: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 014: ifeq 030
        // 017: goto 01e
        // 01a: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 01d: athrow
        // 01e: aload 2
        // 01f: aload 2
        // 020: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
        // 023: ldc 0.5
        // 025: fsub
        // 026: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 029: goto 030
        // 02c: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 02f: athrow
        // 030: aload 7
        // 032: ldc "head"
        // 034: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 037: ifeq 04c
        // 03a: aload 2
        // 03b: aload 2
        // 03c: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
        // 03f: ldc 0.5
        // 041: fadd
        // 042: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 045: goto 04c
        // 048: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 04b: athrow
        // 04c: aload 7
        // 04e: ldc "head"
        // 050: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 053: ifeq 06b
        // 056: aload 0
        // 057: aload 1
        // 058: aload 2
        // 059: fload 3
        // 05a: fload 4
        // 05c: fload 5
        // 05e: invokestatic software/bernie/geckolib3/core/util/Color.ofRGB (FFF)Lsoftware/bernie/geckolib3/core/util/Color;
        // 061: invokevirtual com/trolmastercard/sexmod/dm.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Lsoftware/bernie/geckolib3/core/util/Color;)V
        // 064: goto 06b
        // 067: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 06a: athrow
        // 06b: aload 0
        // 06c: aload 7
        // 06e: aload 2
        // 06f: invokevirtual com/trolmastercard/sexmod/dm.a (Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 072: aload 0
        // 073: aload 7
        // 075: aload 2
        // 076: aload 0
        // 077: getfield com/trolmastercard/sexmod/dm.w Lcom/trolmastercard/sexmod/ei;
        // 07a: aload 1
        // 07b: invokevirtual com/trolmastercard/sexmod/dm.a (Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Lcom/trolmastercard/sexmod/ei;Lnet/minecraft/client/renderer/BufferBuilder;)V
        // 07e: aload 0
        // 07f: getfield com/trolmastercard/sexmod/dm.u Z
        // 082: ifeq 11d
        // 085: aload 0
        // 086: getfield com/trolmastercard/sexmod/dm.s Lnet/minecraft/item/ItemStack;
        // 089: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 08c: instanceof net/minecraft/item/ItemBow
        // 08f: ifne 0ad
        // 092: goto 099
        // 095: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 098: athrow
        // 099: aload 0
        // 09a: getfield com/trolmastercard/sexmod/dm.x Lnet/minecraft/item/ItemStack;
        // 09d: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 0a0: instanceof net/minecraft/item/ItemBow
        // 0a3: ifeq 11d
        // 0a6: goto 0ad
        // 0a9: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0ac: athrow
        // 0ad: aload 7
        // 0af: ldc "armR"
        // 0b1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 0b4: ifeq 0d8
        // 0b7: goto 0be
        // 0ba: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0bd: athrow
        // 0be: aload 2
        // 0bf: aload 2
        // 0c0: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
        // 0c3: aload 0
        // 0c4: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 0c7: getfield com/trolmastercard/sexmod/em.field_70125_A F
        // 0ca: ldc 50.0
        // 0cc: fdiv
        // 0cd: fsub
        // 0ce: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 0d1: goto 0d8
        // 0d4: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0d7: athrow
        // 0d8: aload 7
        // 0da: ldc "armL"
        // 0dc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 0df: ifeq 0fc
        // 0e2: aload 2
        // 0e3: aload 2
        // 0e4: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationY ()F
        // 0e7: aload 0
        // 0e8: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 0eb: getfield com/trolmastercard/sexmod/em.field_70125_A F
        // 0ee: ldc 50.0
        // 0f0: fdiv
        // 0f1: fsub
        // 0f2: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationY (F)V
        // 0f5: goto 0fc
        // 0f8: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0fb: athrow
        // 0fc: aload 0
        // 0fd: getfield com/trolmastercard/sexmod/dm.x Lnet/minecraft/item/ItemStack;
        // 100: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 103: instanceof net/minecraft/item/ItemBow
        // 106: ifeq 11d
        // 109: aload 0
        // 10a: getfield com/trolmastercard/sexmod/dm.x Lnet/minecraft/item/ItemStack;
        // 10d: astore 8
        // 10f: aload 0
        // 110: aload 0
        // 111: getfield com/trolmastercard/sexmod/dm.s Lnet/minecraft/item/ItemStack;
        // 114: putfield com/trolmastercard/sexmod/dm.x Lnet/minecraft/item/ItemStack;
        // 117: aload 0
        // 118: aload 8
        // 11a: putfield com/trolmastercard/sexmod/dm.s Lnet/minecraft/item/ItemStack;
        // 11d: aload 0
        // 11e: getfield com/trolmastercard/sexmod/dm.u Z
        // 121: ifeq 18b
        // 124: aload 0
        // 125: getfield com/trolmastercard/sexmod/dm.s Lnet/minecraft/item/ItemStack;
        // 128: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 12b: instanceof net/minecraft/item/ItemShield
        // 12e: ifeq 18b
        // 131: goto 138
        // 134: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 137: athrow
        // 138: aload 7
        // 13a: ldc "armR"
        // 13c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 13f: ifeq 15b
        // 142: goto 149
        // 145: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 148: athrow
        // 149: aload 2
        // 14a: fconst_0
        // 14b: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationZ (F)V
        // 14e: aload 2
        // 14f: ldc 0.5
        // 151: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 154: goto 18b
        // 157: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 15a: athrow
        // 15b: aload 0
        // 15c: getfield com/trolmastercard/sexmod/dm.x Lnet/minecraft/item/ItemStack;
        // 15f: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 162: instanceof net/minecraft/item/ItemShield
        // 165: ifeq 18b
        // 168: aload 7
        // 16a: ldc "armL"
        // 16c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 16f: ifeq 18b
        // 172: goto 179
        // 175: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 178: athrow
        // 179: aload 2
        // 17a: fconst_0
        // 17b: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationZ (F)V
        // 17e: aload 2
        // 17f: ldc 0.5
        // 181: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.setRotationX (F)V
        // 184: goto 18b
        // 187: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 18a: athrow
        // 18b: aload 7
        // 18d: ldc "weapon"
        // 18f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 192: ifeq 1b4
        // 195: aload 0
        // 196: getfield com/trolmastercard/sexmod/dm.s Lnet/minecraft/item/ItemStack;
        // 199: invokevirtual net/minecraft/item/ItemStack.func_190926_b ()Z
        // 19c: ifne 1b4
        // 19f: goto 1a6
        // 1a2: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 1a5: athrow
        // 1a6: aload 0
        // 1a7: aload 1
        // 1a8: aload 2
        // 1a9: bipush 0
        // 1aa: invokevirtual com/trolmastercard/sexmod/dm.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
        // 1ad: goto 1b4
        // 1b0: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 1b3: athrow
        // 1b4: aload 7
        // 1b6: ldc "offhand"
        // 1b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 1bb: ifeq 1dd
        // 1be: aload 0
        // 1bf: getfield com/trolmastercard/sexmod/dm.x Lnet/minecraft/item/ItemStack;
        // 1c2: invokevirtual net/minecraft/item/ItemStack.func_190926_b ()Z
        // 1c5: ifne 1dd
        // 1c8: goto 1cf
        // 1cb: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 1ce: athrow
        // 1cf: aload 0
        // 1d0: aload 1
        // 1d1: aload 2
        // 1d2: bipush 1
        // 1d3: invokevirtual com/trolmastercard/sexmod/dm.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Z)V
        // 1d6: goto 1dd
        // 1d9: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 1dc: athrow
        // 1dd: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 1e0: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
        // 1e3: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 1e6: aload 2
        // 1e7: invokevirtual software/bernie/geckolib3/util/MatrixStack.translate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 1ea: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 1ed: aload 2
        // 1ee: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 1f1: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 1f4: aload 2
        // 1f5: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 1f8: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 1fb: aload 2
        // 1fc: invokevirtual software/bernie/geckolib3/util/MatrixStack.scale (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 1ff: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 202: aload 2
        // 203: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 206: ldc "Head2"
        // 208: aload 7
        // 20a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 20d: ifeq 229
        // 210: aload 0
        // 211: invokevirtual com/trolmastercard/sexmod/dm.c ()Z
        // 214: ifne 229
        // 217: goto 21e
        // 21a: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 21d: athrow
        // 21e: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 221: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 224: return
        // 225: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 228: athrow
        // 229: ldc "neck"
        // 22b: aload 7
        // 22d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 230: ifne 244
        // 233: ldc "head"
        // 235: aload 7
        // 237: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 23a: ifeq 25d
        // 23d: goto 244
        // 240: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 243: athrow
        // 244: aload 0
        // 245: invokevirtual com/trolmastercard/sexmod/dm.a ()Z
        // 248: ifne 25d
        // 24b: goto 252
        // 24e: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 251: athrow
        // 252: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 255: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 258: return
        // 259: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 25c: athrow
        // 25d: aload 2
        // 25e: getfield software/bernie/geckolib3/geo/render/built/GeoBone.isHidden Z
        // 261: ifne 334
        // 264: aload 0
        // 265: aload 7
        // 267: fload 3
        // 268: fload 4
        // 26a: fload 5
        // 26c: invokevirtual com/trolmastercard/sexmod/dm.a (Ljava/lang/String;FFF)Ljavax/vecmath/Vector4f;
        // 26f: astore 8
        // 271: aload 8
        // 273: getfield javax/vecmath/Vector4f.x F
        // 276: fstore 3
        // 277: aload 8
        // 279: getfield javax/vecmath/Vector4f.y F
        // 27c: fstore 4
        // 27e: aload 8
        // 280: getfield javax/vecmath/Vector4f.z F
        // 283: fstore 5
        // 285: aload 8
        // 287: getfield javax/vecmath/Vector4f.w F
        // 28a: f2d
        // 28b: dstore 9
        // 28d: aload 0
        // 28e: getfield com/trolmastercard/sexmod/dm.p Ljava/util/HashSet;
        // 291: aload 7
        // 293: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 296: ifne 2e4
        // 299: aload 2
        // 29a: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childCubes Ljava/util/List;
        // 29d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 2a2: astore 11
        // 2a4: aload 11
        // 2a6: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 2ab: ifeq 2e4
        // 2ae: aload 11
        // 2b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 2b5: checkcast software/bernie/geckolib3/geo/render/built/GeoCube
        // 2b8: astore 12
        // 2ba: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 2bd: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
        // 2c0: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 2c3: aload 0
        // 2c4: aload 2
        // 2c5: putfield com/trolmastercard/sexmod/dm.q Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
        // 2c8: aload 0
        // 2c9: aload 1
        // 2ca: aload 12
        // 2cc: fload 3
        // 2cd: fload 4
        // 2cf: fload 5
        // 2d1: fload 6
        // 2d3: dload 9
        // 2d5: invokevirtual com/trolmastercard/sexmod/dm.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;FFFFD)V
        // 2d8: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 2db: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 2de: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 2e1: goto 2a4
        // 2e4: aload 2
        // 2e5: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childBones Ljava/util/List;
        // 2e8: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 2ed: astore 11
        // 2ef: aload 11
        // 2f1: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 2f6: ifeq 334
        // 2f9: aload 11
        // 2fb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 300: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
        // 303: astore 12
        // 305: dload 9
        // 307: dconst_0
        // 308: dcmpl
        // 309: ifne 321
        // 30c: aload 0
        // 30d: aload 1
        // 30e: aload 12
        // 310: fload 3
        // 311: fload 4
        // 313: fload 5
        // 315: fload 6
        // 317: invokevirtual com/trolmastercard/sexmod/dm.renderRecursively (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFF)V
        // 31a: goto 331
        // 31d: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 320: athrow
        // 321: aload 0
        // 322: aload 1
        // 323: aload 12
        // 325: fload 3
        // 326: fload 4
        // 328: fload 5
        // 32a: fload 6
        // 32c: dload 9
        // 32e: invokevirtual com/trolmastercard/sexmod/dm.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
        // 331: goto 2ef
        // 334: getstatic com/trolmastercard/sexmod/dm.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 337: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 33a: goto 33f
        // 33d: astore 8
        // 33f: return
        // try (341 -> 354): 354 java/lang/IllegalStateException
        // try (261 -> 270): 270 java/lang/IllegalStateException
        // try (254 -> 264): 265 java/lang/IllegalStateException
        // try (250 -> 258): 259 java/lang/IllegalStateException
        // try (239 -> 248): 248 java/lang/IllegalStateException
        // try (218 -> 242): 243 java/lang/IllegalStateException
        // try (203 -> 215): 216 java/lang/IllegalStateException
        // try (199 -> 207): 208 java/lang/IllegalStateException
        // try (184 -> 196): 197 java/lang/IllegalStateException
        // try (180 -> 188): 189 java/lang/IllegalStateException
        // try (164 -> 177): 178 java/lang/IllegalStateException
        // try (159 -> 168): 169 java/lang/IllegalStateException
        // try (143 -> 157): 157 java/lang/IllegalStateException
        // try (135 -> 147): 148 java/lang/IllegalStateException
        // try (132 -> 140): 141 java/lang/IllegalStateException
        // try (100 -> 114): 115 java/lang/IllegalStateException
        // try (80 -> 97): 98 java/lang/IllegalStateException
        // try (72 -> 84): 85 java/lang/IllegalStateException
        // try (64 -> 77): 78 java/lang/IllegalStateException
        // try (50 -> 69): 70 java/lang/IllegalStateException
        // try (35 -> 47): 48 java/lang/IllegalStateException
        // try (22 -> 32): 33 java/lang/IllegalStateException
        // try (6 -> 19): 20 java/lang/IllegalStateException
        // try (3 -> 10): 11 java/lang/IllegalStateException
        // try (366 -> 368): 369 java/lang/IllegalStateException
    }

    boolean a() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 04: checkcast com/trolmastercard/sexmod/ei
        // 07: invokevirtual com/trolmastercard/sexmod/ei.f ()Z
        // 0a: ifne 13
        // 0d: bipush 1
        // 0e: ireturn
        // 0f: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 12: athrow
        // 13: getstatic com/trolmastercard/sexmod/dm.i Lnet/minecraft/client/Minecraft;
        // 16: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 19: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 1c: ifeq 25
        // 1f: bipush 1
        // 20: ireturn
        // 21: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 24: athrow
        // 25: getstatic com/trolmastercard/sexmod/dm.i Lnet/minecraft/client/Minecraft;
        // 28: getfield net/minecraft/client/Minecraft.field_71462_r Lnet/minecraft/client/gui/GuiScreen;
        // 2b: instanceof net/minecraft/client/gui/inventory/GuiInventory
        // 2e: ifne 44
        // 31: getstatic com/trolmastercard/sexmod/dm.i Lnet/minecraft/client/Minecraft;
        // 34: getfield net/minecraft/client/Minecraft.field_71462_r Lnet/minecraft/client/gui/GuiScreen;
        // 37: instanceof net/minecraft/client/gui/inventory/GuiContainerCreative
        // 3a: ifeq 4c
        // 3d: goto 44
        // 40: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 43: athrow
        // 44: bipush 1
        // 45: goto 4d
        // 48: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 4b: athrow
        // 4c: bipush 0
        // 4d: ireturn
        // try (0 -> 7): 7 java/lang/IllegalStateException
        // try (9 -> 15): 15 java/lang/IllegalStateException
        // try (17 -> 25): 26 java/lang/IllegalStateException
        // try (21 -> 30): 30 java/lang/IllegalStateException
    }

    void a(BufferBuilder var1, GeoBone var2, Color var3) {
        GlStateManager.func_179094_E();
        Tessellator.func_178181_a().func_78381_a();
        com.trolmastercard.sexmod.p.a(IGeoRenderer.MATRIX_STACK, var2);
        GL11.glEnable(2896);
        this.c();
        new bu(this).render(this.j, this.j.field_184619_aG, this.j.field_70721_aZ, this.y, 0.0F, 0.0F, 0.0F, var3);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
        var1.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        GlStateManager.func_179147_l();
        GlStateManager.func_187401_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
        GL11.glDisable(2896);
        GlStateManager.func_179121_F();
    }

    protected void c() {
    }

    void a(BufferBuilder param1, GeoBone param2, boolean param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 003: invokevirtual net/minecraft/client/Minecraft.func_175597_ag ()Lnet/minecraft/client/renderer/ItemRenderer;
        // 006: astore 4
        // 008: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 00b: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
        // 00e: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
        // 011: getstatic software/bernie/geckolib3/renderers/geo/IGeoRenderer.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 014: aload 2
        // 015: invokestatic com/trolmastercard/sexmod/p.a (Lsoftware/bernie/geckolib3/util/MatrixStack;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 018: sipush 2896
        // 01b: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
        // 01e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179147_l ()V
        // 021: getstatic net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        // 024: getstatic net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        // 027: invokestatic net/minecraft/client/renderer/GlStateManager.func_187401_a (Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
        // 02a: iload 3
        // 02b: ifeq 039
        // 02e: aload 0
        // 02f: getfield com/trolmastercard/sexmod/dm.x Lnet/minecraft/item/ItemStack;
        // 032: goto 03d
        // 035: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 038: athrow
        // 039: aload 0
        // 03a: getfield com/trolmastercard/sexmod/dm.s Lnet/minecraft/item/ItemStack;
        // 03d: astore 5
        // 03f: getstatic com/trolmastercard/sexmod/dm$a.a [I
        // 042: aload 5
        // 044: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 047: aload 5
        // 049: invokevirtual net/minecraft/item/Item.func_77661_b (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumAction;
        // 04c: invokevirtual net/minecraft/item/EnumAction.ordinal ()I
        // 04f: iaload
        // 050: lookupswitch 49 2 1 28 2 40
        // 06c: aload 0
        // 06d: iload 3
        // 06e: invokevirtual com/trolmastercard/sexmod/dm.a (Z)V
        // 071: goto 081
        // 074: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 077: athrow
        // 078: aload 0
        // 079: iload 3
        // 07a: aload 0
        // 07b: getfield com/trolmastercard/sexmod/dm.u Z
        // 07e: invokevirtual com/trolmastercard/sexmod/dm.a (ZZ)V
        // 081: aload 0
        // 082: getfield com/trolmastercard/sexmod/dm.u Z
        // 085: ifeq 0ea
        // 088: iload 3
        // 089: ifne 0ea
        // 08c: goto 093
        // 08f: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 092: athrow
        // 093: aload 5
        // 095: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 098: instanceof net/minecraft/item/ItemBow
        // 09b: ifeq 0ea
        // 09e: goto 0a5
        // 0a1: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0a4: athrow
        // 0a5: aload 0
        // 0a6: dup
        // 0a7: getfield com/trolmastercard/sexmod/dm.t F
        // 0aa: ldc 0.015
        // 0ac: fadd
        // 0ad: putfield com/trolmastercard/sexmod/dm.t F
        // 0b0: aload 0
        // 0b1: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 0b4: aload 0
        // 0b5: getfield com/trolmastercard/sexmod/dm.t F
        // 0b8: fneg
        // 0b9: ldc 20.0
        // 0bb: fmul
        // 0bc: aload 5
        // 0be: invokevirtual net/minecraft/item/ItemStack.func_77988_m ()I
        // 0c1: i2f
        // 0c2: fadd
        // 0c3: invokestatic java/lang/Math.round (F)I
        // 0c6: invokevirtual com/trolmastercard/sexmod/em.d (I)V
        // 0c9: aload 0
        // 0ca: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 0cd: aload 5
        // 0cf: invokevirtual com/trolmastercard/sexmod/em.a (Lnet/minecraft/item/ItemStack;)V
        // 0d2: aload 0
        // 0d3: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 0d6: getstatic net/minecraft/util/EnumHand.MAIN_HAND Lnet/minecraft/util/EnumHand;
        // 0d9: invokevirtual com/trolmastercard/sexmod/em.func_184598_c (Lnet/minecraft/util/EnumHand;)V
        // 0dc: aload 0
        // 0dd: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 0e0: invokevirtual com/trolmastercard/sexmod/em.W ()V
        // 0e3: goto 108
        // 0e6: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 0e9: athrow
        // 0ea: aload 0
        // 0eb: fconst_0
        // 0ec: putfield com/trolmastercard/sexmod/dm.t F
        // 0ef: aload 0
        // 0f0: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 0f3: bipush 0
        // 0f4: invokevirtual com/trolmastercard/sexmod/em.d (I)V
        // 0f7: aload 0
        // 0f8: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 0fb: getstatic net/minecraft/item/ItemStack.field_190927_a Lnet/minecraft/item/ItemStack;
        // 0fe: invokevirtual com/trolmastercard/sexmod/em.a (Lnet/minecraft/item/ItemStack;)V
        // 101: aload 0
        // 102: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 105: invokevirtual com/trolmastercard/sexmod/em.W ()V
        // 108: aload 0
        // 109: iload 3
        // 10a: aload 5
        // 10c: invokevirtual com/trolmastercard/sexmod/dm.a (ZLnet/minecraft/item/ItemStack;)V
        // 10f: ldc 0.75
        // 111: ldc 0.75
        // 113: ldc 0.75
        // 115: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
        // 118: aload 4
        // 11a: aload 0
        // 11b: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 11e: aload 5
        // 120: getstatic net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType.THIRD_PERSON_RIGHT_HAND Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;
        // 123: invokevirtual net/minecraft/client/renderer/ItemRenderer.func_178099_a (Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V
        // 126: aload 1
        // 127: bipush 7
        // 129: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l Lnet/minecraft/client/renderer/vertex/VertexFormat;
        // 12c: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
        // 12f: aload 0
        // 130: aload 0
        // 131: aload 0
        // 132: getfield com/trolmastercard/sexmod/dm.j Lcom/trolmastercard/sexmod/em;
        // 135: invokevirtual com/trolmastercard/sexmod/dm.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
        // 138: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
        // 13b: checkcast net/minecraft/util/ResourceLocation
        // 13e: invokevirtual com/trolmastercard/sexmod/dm.func_110776_a (Lnet/minecraft/util/ResourceLocation;)V
        // 141: sipush 2896
        // 144: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
        // 147: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 14a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179147_l ()V
        // 14d: getstatic net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        // 150: getstatic net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        // 153: invokestatic net/minecraft/client/renderer/GlStateManager.func_187401_a (Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
        // 156: return
        // try (3 -> 20): 20 java/lang/IllegalStateException
        // try (25 -> 37): 37 java/lang/IllegalStateException
        // try (44 -> 49): 50 java/lang/IllegalStateException
        // try (47 -> 56): 57 java/lang/IllegalStateException
        // try (52 -> 90): 90 java/lang/IllegalStateException
    }

    protected void a(boolean var1, ItemStack var2) {
        float var10000;
        label16: {
            try {
                if (var1) {
                    var10000 = 200.0F;
                    break label16;
                }
            } catch (IllegalStateException var3) {
                throw b(var3);
            }

            var10000 = 90.0F;
        }

        GlStateManager.func_179114_b(var10000, 1.0F, 0.0F, 0.0F);
    }

    protected void a(boolean var1) {
        GlStateManager.func_179114_b(20.0F, 1.0F, 0.0F, 0.0F);
    }

    protected void a(boolean param1, boolean param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: iload 1
        // 01: ifeq 45
        // 04: ldc 180.0
        // 06: fconst_0
        // 07: fconst_1
        // 08: fconst_0
        // 09: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 0c: ldc 90.0
        // 0e: fconst_1
        // 0f: fconst_0
        // 10: fconst_0
        // 11: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 14: iload 2
        // 15: ifeq 67
        // 18: goto 1f
        // 1b: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 1e: athrow
        // 1f: ldc -90.0
        // 21: fconst_0
        // 22: fconst_1
        // 23: fconst_0
        // 24: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 27: ldc 35.0
        // 29: fconst_0
        // 2a: fconst_0
        // 2b: fconst_1
        // 2c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 2f: ldc -20.0
        // 31: fconst_1
        // 32: fconst_0
        // 33: fconst_0
        // 34: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 37: fconst_0
        // 38: fconst_0
        // 39: ldc 0.228
        // 3b: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 3e: goto 67
        // 41: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 44: athrow
        // 45: iload 2
        // 46: ifeq 67
        // 49: ldc -90.0
        // 4b: fconst_1
        // 4c: fconst_0
        // 4d: fconst_0
        // 4e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 51: ldc -90.0
        // 53: fconst_0
        // 54: fconst_0
        // 55: fconst_1
        // 56: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 59: fconst_0
        // 5a: ldc 0.165
        // 5c: fconst_0
        // 5d: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 60: goto 67
        // 63: invokestatic com/trolmastercard/sexmod/dm.b (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        // 66: athrow
        // 67: return
        // try (0 -> 14): 15 java/lang/IllegalStateException
        // try (2 -> 37): 37 java/lang/IllegalStateException
        // try (39 -> 55): 56 java/lang/IllegalStateException
    }

    private static IllegalStateException b(IllegalStateException var0) {
        return var0;
    }
}
