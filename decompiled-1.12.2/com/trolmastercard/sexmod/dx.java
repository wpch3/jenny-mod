package com.trolmastercard.sexmod;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import javax.annotation.Nullable;
import javax.vecmath.Vector4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class dx extends dm {
    static final HashSet<String> z = new HashSet<>(
        Arrays.asList(
            "kneeL",
            "kneeR",
            "shinL",
            "shinR",
            "armorHelmet",
            "sockL",
            "sockR",
            "braBoobL",
            "braBoobR",
            "armorNippleR",
            "armorNippleL",
            "slip",
            "turnable",
            "static"
        )
    );

    public dx(RenderManager var1, AnimatedGeoModel var2) {
        super(var1, var2);
    }

    @Nullable
    @Override
    protected f7 e(em var1) {
        try {
            if (var1.field_70170_p instanceof gj) {
                return null;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        try {
            if (((b7)var1).c()) {
                return null;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        return da.y;
    }

    @Override
    public HashSet<String> a() {
        HashSet var1 = da.E;
        da.E.addAll(gx.a);
        return da.E;
    }

    @Override
    protected void b(Tessellator var1, BufferBuilder var2, em var3, f7 var4, float var5) {
        a(var1, var2, var3, var4, var5);
    }

    @Override
    public void a(em param1, double param2, double param4, double param6, float param8, float param9) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: aload 1
        // 02: dload 2
        // 03: dload 4
        // 05: dload 6
        // 07: fload 8
        // 09: fload 9
        // 0b: invokespecial com/trolmastercard/sexmod/dm.a (Lcom/trolmastercard/sexmod/em;DDDFF)V
        // 0e: getstatic com/trolmastercard/sexmod/dx.i Lnet/minecraft/client/Minecraft;
        // 11: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 14: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 17: ifne 4a
        // 1a: getstatic com/trolmastercard/sexmod/dx.i Lnet/minecraft/client/Minecraft;
        // 1d: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 20: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 23: aload 1
        // 24: checkcast com/trolmastercard/sexmod/ei
        // 27: invokevirtual com/trolmastercard/sexmod/ei.m ()Ljava/util/UUID;
        // 2a: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 2d: ifeq 4a
        // 30: goto 37
        // 33: invokestatic com/trolmastercard/sexmod/dx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 36: athrow
        // 37: aload 1
        // 38: invokevirtual com/trolmastercard/sexmod/em.Q ()Z
        // 3b: ifne 4a
        // 3e: goto 45
        // 41: invokestatic com/trolmastercard/sexmod/dx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 44: athrow
        // 45: return
        // 46: invokestatic com/trolmastercard/sexmod/dx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 49: athrow
        // 4a: aload 1
        // 4b: fload 9
        // 4d: invokestatic com/trolmastercard/sexmod/da.a (Lcom/trolmastercard/sexmod/em;F)V
        // 50: return
        // try (0 -> 20): 21 java/lang/RuntimeException
        // try (12 -> 26): 27 java/lang/RuntimeException
        // try (23 -> 30): 30 java/lang/RuntimeException
    }

    @Override
    protected void a(boolean var1) {
        try {
            super.a(var1);
            if (var1) {
                GlStateManager.func_179137_b(0.15, 0.0, 0.0);
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }
    }

    @Override
    protected void a(boolean param1, boolean param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: iload 1
        // 02: iload 2
        // 03: invokespecial com/trolmastercard/sexmod/dm.a (ZZ)V
        // 06: iload 1
        // 07: ifeq 48
        // 0a: dconst_0
        // 0b: ldc2_w -0.05
        // 0e: ldc2_w -0.05
        // 11: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 14: ldc 15.0
        // 16: fconst_1
        // 17: fconst_0
        // 18: fconst_0
        // 19: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 1c: iload 2
        // 1d: ifeq 6b
        // 20: goto 27
        // 23: invokestatic com/trolmastercard/sexmod/dx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 26: athrow
        // 27: ldc2_w 0.3
        // 2a: ldc2_w 0.2
        // 2d: dconst_0
        // 2e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 31: ldc -30.0
        // 33: fconst_1
        // 34: fconst_0
        // 35: fconst_0
        // 36: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 39: ldc 15.0
        // 3b: fconst_0
        // 3c: fconst_0
        // 3d: fconst_1
        // 3e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 41: goto 6b
        // 44: invokestatic com/trolmastercard/sexmod/dx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 47: athrow
        // 48: dconst_0
        // 49: dconst_0
        // 4a: ldc2_w 0.1
        // 4d: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 50: ldc 30.0
        // 52: fconst_1
        // 53: fconst_0
        // 54: fconst_0
        // 55: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 58: iload 2
        // 59: ifeq 6b
        // 5c: ldc -29.0
        // 5e: fconst_1
        // 5f: fconst_0
        // 60: fconst_0
        // 61: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 64: goto 6b
        // 67: invokestatic com/trolmastercard/sexmod/dx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 6a: athrow
        // 6b: return
        // try (0 -> 17): 18 java/lang/RuntimeException
        // try (6 -> 35): 35 java/lang/RuntimeException
        // try (37 -> 53): 54 java/lang/RuntimeException
    }

    @Override
    protected Vector4f a(String var1, float var2, float var3, float var4) {
        try {
            if (!z.contains(var1)) {
                return this.a(var2, var3, var4);
            }
        } catch (RuntimeException var11) {
            throw a(var11);
        }

        try {
            if ("armorHelmet".equals(var1)) {
                return super.a(var1, var2, var3, var4);
            }
        } catch (RuntimeException var15) {
            throw a(var15);
        }

        ItemStack var5 = ItemStack.field_190927_a;
        String var6 = var1;
        int var7 = -1;

        label138: {
            label137: {
                label136: {
                    label135: {
                        label134: {
                            label133: {
                                label132: {
                                    label131: {
                                        label130: {
                                            label129: {
                                                label128: {
                                                    label127: {
                                                        label126: {
                                                            try {
                                                                switch (var6.hashCode()) {
                                                                    case -1626323751:
                                                                        break label127;
                                                                    case -1626323745:
                                                                        break label126;
                                                                    case -892481938:
                                                                        break label129;
                                                                    case -65677861:
                                                                        if (!var6.equals("braBoobL")) {
                                                                            break label138;
                                                                        }
                                                                        break label137;
                                                                    case -65677855:
                                                                        break;
                                                                    case 3533120:
                                                                        break label130;
                                                                    case 102194025:
                                                                        break label135;
                                                                    case 102194031:
                                                                        break label136;
                                                                    case 109407570:
                                                                        break label131;
                                                                    case 109407576:
                                                                        break label132;
                                                                    case 109610248:
                                                                        break label133;
                                                                    case 109610254:
                                                                        break label134;
                                                                    case 134582103:
                                                                        break label128;
                                                                    default:
                                                                        break label138;
                                                                }
                                                            } catch (RuntimeException var14) {
                                                                throw a(var14);
                                                            }

                                                            if (var6.equals("braBoobR")) {
                                                                var7 = 1;
                                                            }
                                                            break label138;
                                                        }

                                                        if (var6.equals("armorNippleR")) {
                                                            var7 = 2;
                                                        }
                                                        break label138;
                                                    }

                                                    if (var6.equals("armorNippleL")) {
                                                        var7 = 3;
                                                    }
                                                    break label138;
                                                }

                                                if (var6.equals("turnable")) {
                                                    var7 = 4;
                                                }
                                                break label138;
                                            }

                                            if (var6.equals("static")) {
                                                var7 = 5;
                                            }
                                            break label138;
                                        }

                                        if (var6.equals("slip")) {
                                            var7 = 6;
                                        }
                                        break label138;
                                    }

                                    if (var6.equals("shinL")) {
                                        var7 = 7;
                                    }
                                    break label138;
                                }

                                if (var6.equals("shinR")) {
                                    var7 = 8;
                                }
                                break label138;
                            }

                            if (var6.equals("sockL")) {
                                var7 = 9;
                            }
                            break label138;
                        }

                        if (var6.equals("sockR")) {
                            var7 = 10;
                        }
                        break label138;
                    }

                    if (var6.equals("kneeL")) {
                        var7 = 11;
                    }
                    break label138;
                }

                if (var6.equals("kneeR")) {
                    var7 = 12;
                }
                break label138;
            }

            var7 = 0;
        }

        switch (var7) {
            case 0:
            case 1:
            case 2:
            case 3:
                var5 = (ItemStack)this.j.func_184212_Q().func_187225_a(e2.T);
                break;
            case 4:
            case 5:
            case 6:
                var5 = (ItemStack)this.j.func_184212_Q().func_187225_a(e2.U);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                var5 = (ItemStack)this.j.func_184212_Q().func_187225_a(e2.W);
        }

        try {
            if (!(var5.func_77973_b() instanceof ItemArmor)) {
                return this.a(var2, var3, var4);
            }
        } catch (RuntimeException var13) {
            throw a(var13);
        }

        ItemArmor var19 = (ItemArmor)var5.func_77973_b();

        try {
            switch (var19.func_82812_d()) {
                case GOLD:
                    return new Vector4f(var2, var3, var4, -0.15625F);
                case IRON:
                case CHAIN:
                    return new Vector4f(var2, var3, var4, -0.125F);
                case LEATHER:
                    break;
                default:
                    return new Vector4f(var2, var3, var4, -0.1875F);
            }
        } catch (RuntimeException var12) {
            throw a(var12);
        }

        var7 = var19.func_82814_b(var5);
        float var8 = (var7 >> 16 & 0xFF) / 255.0F;
        float var9 = (var7 >> 8 & 0xFF) / 255.0F;
        float var10 = (var7 & 0xFF) / 255.0F;
        var2 *= var8;
        var3 *= var9;
        var4 *= var10;
        return new Vector4f(var2, var3, var4, -0.09375F);
    }

    @Override
    protected void a(GeoModel var1, BufferBuilder var2, em var3, float var4, float var5, float var6, float var7, float var8) {
        GeoBone var9 = var1.topLevelBones.get(0);
        GeoBone var10 = null;
        GeoBone var11 = null;

        for (GeoBone var13 : var9.childBones) {
            String var14 = var13.getName();
            byte var15 = -1;

            label44: {
                label43: {
                    try {
                        switch (var14.hashCode()) {
                            case 3029410:
                                break;
                            case 109761491:
                                if (!var14.equals("steve")) {
                                    break label44;
                                }
                                break label43;
                            default:
                                break label44;
                        }
                    } catch (IOException var17) {
                        throw a(var17);
                    }

                    if (var14.equals("body")) {
                        var15 = 1;
                    }
                    break label44;
                }

                var15 = 0;
            }

            switch (var15) {
                case 0:
                    var11 = var13;
                    break;
                case 1:
                    var10 = var13;
            }
        }

        MATRIX_STACK.push();
        MATRIX_STACK.translate(var9);
        MATRIX_STACK.moveToPivot(var9);
        MATRIX_STACK.rotate(var9);
        MATRIX_STACK.scale(var9);
        MATRIX_STACK.moveBackFromPivot(var9);
        this.renderRecursively(var2, var10, var4, var5, var6, var7);
        Tessellator.func_178181_a().func_78381_a();
        var2.func_181668_a(7, DefaultVertexFormats.field_181712_l);

        try {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.d(this.j));
        } catch (IOException var16) {
            var16.printStackTrace();
        }

        this.renderRecursively(var2, var11, var4, var5, var6, this.j.v());
        Tessellator.func_178181_a().func_78381_a();
        MATRIX_STACK.pop();
    }

    private static Exception a(Exception var0) {
        return var0;
    }
}
