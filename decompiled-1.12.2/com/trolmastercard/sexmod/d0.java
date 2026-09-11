package com.trolmastercard.sexmod;

import java.util.HashSet;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class d0 extends dm {
    public d0(RenderManager var1, AnimatedGeoModel var2) {
        super(var1, var2);
    }

    @Override
    protected void c() {
        GlStateManager.func_179137_b(0.0, -1.0, -0.05);
        GlStateManager.func_179152_a(0.65F, 0.65F, 0.65F);
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
        // 07: ifne 3a
        // 0a: iload 2
        // 0b: ifne 3a
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/d0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14: athrow
        // 15: dconst_0
        // 16: ldc2_w -0.1
        // 19: ldc2_w 0.05
        // 1c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 1f: ldc 40.0
        // 21: fconst_1
        // 22: fconst_0
        // 23: fconst_0
        // 24: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 27: fconst_0
        // 28: fconst_0
        // 29: fconst_1
        // 2a: fconst_0
        // 2b: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 2e: fconst_0
        // 2f: fconst_0
        // 30: fconst_0
        // 31: fconst_1
        // 32: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 35: return
        // 36: invokestatic com/trolmastercard/sexmod/d0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 39: athrow
        // 3a: iload 1
        // 3b: ifeq 58
        // 3e: iload 2
        // 3f: ifne 58
        // 42: goto 49
        // 45: invokestatic com/trolmastercard/sexmod/d0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 48: athrow
        // 49: ldc2_w -0.025
        // 4c: ldc2_w -0.1
        // 4f: dconst_0
        // 50: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 53: return
        // 54: invokestatic com/trolmastercard/sexmod/d0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 57: athrow
        // 58: return
        // try (0 -> 8): 9 java/lang/RuntimeException
        // try (6 -> 31): 31 java/lang/RuntimeException
        // try (33 -> 37): 38 java/lang/RuntimeException
        // try (35 -> 45): 45 java/lang/RuntimeException
    }

    @Override
    public HashSet<String> a() {
        return new HashSet<String>() {
            {
                this.add("boobs");
                this.add("booty");
                this.add("vagina");
                this.add("fuckhole");
                this.add("leaf7");
                this.add("leaf8");
            }
        };
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
