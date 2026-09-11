package com.trolmastercard.sexmod;

import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class di extends dm {
    float z = 0.0F;

    public di(RenderManager var1, AnimatedGeoModel var2) {
        super(var1, var2);
    }

    @Override
    protected void c() {
        GlStateManager.func_179109_b(0.0F, -1.0F, 0.0F);
        GlStateManager.func_179152_a(0.65F, 0.65F, 0.65F);
    }

    @Override
    protected ItemStack a(@Nullable ItemStack var1) {
        switch (this.j.y()) {
            case FISHING_IDLE:
            case FISHING_START:
                ItemStack var2 = ((eb)this.j).ao;
                this.j.func_184611_a(EnumHand.MAIN_HAND, var2);
                return var2;
            default:
                return var1;
        }
    }

    boolean b() {
        return (Boolean)this.j.func_184212_Q().func_187225_a(em.G);
    }

    @Override
    protected void a(String var1, GeoBone var2) {
        try {
            if (Minecraft.func_71410_x().func_147113_T()) {
                return;
            }
        } catch (RuntimeException var12) {
            throw a(var12);
        }

        String var3 = var1;
        byte var4 = -1;

        label76: {
            label75: {
                label74: {
                    label73: {
                        try {
                            switch (var3.hashCode()) {
                                case -345841663:
                                    break label73;
                                case -345841657:
                                    break label74;
                                case 3198432:
                                    if (!var3.equals("head")) {
                                        break label76;
                                    }
                                    break label75;
                                case 2120576361:
                                    break;
                                default:
                                    break label76;
                            }
                        } catch (RuntimeException var11) {
                            throw a(var11);
                        }

                        if (var3.equals("backHair")) {
                            var4 = 1;
                        }
                        break label76;
                    }

                    if (var3.equals("frontHairL")) {
                        var4 = 2;
                    }
                    break label76;
                }

                if (var3.equals("frontHairR")) {
                    var4 = 3;
                }
                break label76;
            }

            var4 = 0;
        }

        label96: {
            try {
                switch (var4) {
                    case 0:
                        this.z = var2.getRotationX();
                        return;
                    case 1:
                        break;
                    case 2:
                    case 3:
                        break label96;
                    default:
                        return;
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            try {
                if (this.b()) {
                    return;
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }

            if (this.z > 0.0F) {
                double var5 = this.z / gc.c(45.0F);
                float var7 = (float)b6.b(0.0, 0.75, var5);
                var2.setPositionZ(var7);
                var2.setPositionY(var7);
                var2.setRotationX(-this.z);
            }

            return;
        }

        try {
            if (this.b()) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        var2.setRotationX(-this.z);
    }

    @Override
    protected void a(boolean var1, ItemStack var2) {
        try {
            super.a(var1, var2);
            switch (var2.func_77973_b().func_77661_b(var2)) {
                case BLOCK:
                case BOW:
                    return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        float var10000;
        label21: {
            try {
                if (var1) {
                    var10000 = 60.0F;
                    break label21;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            var10000 = 150.0F;
        }

        GlStateManager.func_179114_b(var10000, 1.0F, 0.0F, 0.0F);
        GlStateManager.func_179137_b(0.0, 0.08, -0.05);
    }

    @Override
    protected void a(boolean var1) {
        float var10000;
        label24: {
            try {
                if (var1) {
                    var10000 = 60.0F;
                    break label24;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            var10000 = 150.0F;
        }

        try {
            GlStateManager.func_179114_b(var10000, 1.0F, 0.0F, 0.0F);
            if (var1) {
                GlStateManager.func_179137_b(0.12, 0.0, 0.0);
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
        // 07: ifne 22
        // 0a: iload 2
        // 0b: ifeq 22
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/di.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14: athrow
        // 15: ldc 120.0
        // 17: fconst_0
        // 18: fconst_1
        // 19: fconst_0
        // 1a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 1d: return
        // 1e: invokestatic com/trolmastercard/sexmod/di.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 21: athrow
        // 22: iload 1
        // 23: ifne 48
        // 26: iload 2
        // 27: ifne 48
        // 2a: goto 31
        // 2d: invokestatic com/trolmastercard/sexmod/di.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 30: athrow
        // 31: dconst_0
        // 32: ldc2_w 0.3
        // 35: ldc2_w -0.15
        // 38: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 3b: ldc -45.0
        // 3d: fconst_1
        // 3e: fconst_0
        // 3f: fconst_0
        // 40: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 43: return
        // 44: invokestatic com/trolmastercard/sexmod/di.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 47: athrow
        // 48: iload 1
        // 49: ifeq 66
        // 4c: iload 2
        // 4d: ifne 66
        // 50: goto 57
        // 53: invokestatic com/trolmastercard/sexmod/di.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 56: athrow
        // 57: ldc2_w -0.025
        // 5a: ldc2_w -0.05
        // 5d: dconst_0
        // 5e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 61: return
        // 62: invokestatic com/trolmastercard/sexmod/di.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 65: athrow
        // 66: return
        // try (0 -> 8): 9 java/lang/RuntimeException
        // try (6 -> 17): 17 java/lang/RuntimeException
        // try (19 -> 23): 24 java/lang/RuntimeException
        // try (21 -> 36): 36 java/lang/RuntimeException
        // try (38 -> 42): 43 java/lang/RuntimeException
        // try (40 -> 50): 50 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
