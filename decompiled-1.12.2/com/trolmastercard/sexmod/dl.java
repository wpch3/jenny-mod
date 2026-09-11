package com.trolmastercard.sexmod;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class dl extends dm {
    public dl(RenderManager var1, AnimatedGeoModel var2) {
        super(var1, var2);
    }

    @Override
    protected void c() {
        GlStateManager.func_179109_b(0.0F, -1.5F, 0.0F);
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
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        float var10000;
        label31: {
            try {
                if (var1) {
                    var10000 = 90.0F;
                    break label31;
                }
            } catch (RuntimeException var4) {
                throw a(var4);
            }

            var10000 = 180.0F;
        }

        try {
            GlStateManager.func_179114_b(var10000, 1.0F, 0.0F, 0.0F);
            if (var1) {
                GlStateManager.func_179137_b(0.0, 0.23900000452995301, -0.1F);
                return;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        GlStateManager.func_179137_b(0.0, 0.1, -0.07);
    }

    @Override
    protected void a(boolean var1) {
        float var10000;
        label24: {
            try {
                if (var1) {
                    var10000 = 90.0F;
                    break label24;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            var10000 = 180.0F;
        }

        try {
            GlStateManager.func_179114_b(var10000, 1.0F, 0.0F, 0.0F);
            if (var1) {
                GlStateManager.func_179137_b(0.2, -0.2, 0.0);
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
        // 00: iload 1
        // 01: ifeq 46
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
        // 15: ifeq 8b
        // 18: goto 1f
        // 1b: invokestatic com/trolmastercard/sexmod/dl.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1e: athrow
        // 1f: ldc -90.0
        // 21: fconst_0
        // 22: fconst_1
        // 23: fconst_0
        // 24: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 27: ldc 90.0
        // 29: fconst_0
        // 2a: fconst_0
        // 2b: fconst_1
        // 2c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 2f: ldc -20.0
        // 31: fconst_1
        // 32: fconst_0
        // 33: fconst_0
        // 34: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 37: ldc 0.4
        // 39: fconst_0
        // 3a: ldc 0.228
        // 3c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 3f: goto 8b
        // 42: invokestatic com/trolmastercard/sexmod/dl.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 45: athrow
        // 46: fconst_0
        // 47: ldc 0.282
        // 49: ldc 0.141
        // 4b: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 4e: iload 2
        // 4f: ifeq 83
        // 52: ldc2_w 0.165
        // 55: ldc2_w -0.44999998807907104
        // 58: dconst_0
        // 59: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 5c: ldc -90.0
        // 5e: fconst_1
        // 5f: fconst_0
        // 60: fconst_0
        // 61: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 64: ldc -90.0
        // 66: fconst_0
        // 67: fconst_0
        // 68: fconst_1
        // 69: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 6c: ldc 180.0
        // 6e: fconst_0
        // 6f: fconst_1
        // 70: fconst_0
        // 71: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 74: ldc -27.0
        // 76: fconst_0
        // 77: fconst_1
        // 78: fconst_0
        // 79: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 7c: goto 8b
        // 7f: invokestatic com/trolmastercard/sexmod/dl.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 82: athrow
        // 83: dconst_0
        // 84: dconst_0
        // 85: ldc2_w -0.05
        // 88: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 8b: return
        // try (0 -> 14): 15 java/lang/RuntimeException
        // try (2 -> 37): 37 java/lang/RuntimeException
        // try (39 -> 70): 70 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
