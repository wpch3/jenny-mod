package com.trolmastercard.sexmod;

import javax.vecmath.Vector4f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3i;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class de extends d9 {
    public de(RenderManager var1, AnimatedGeoModel var2) {
        super(var1, var2);
    }

    @Override
    protected Vec3i a(String param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/de.j Lcom/trolmastercard/sexmod/em;
        // 04: invokevirtual com/trolmastercard/sexmod/em.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 07: astore 2
        // 08: aload 2
        // 09: getstatic com/trolmastercard/sexmod/ff.N Lnet/minecraft/network/datasync/DataParameter;
        // 0c: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 0f: checkcast java/lang/String
        // 12: invokestatic com/trolmastercard/sexmod/EyeAndKoboldColor.valueOf (Ljava/lang/String;)Lcom/trolmastercard/sexmod/EyeAndKoboldColor;
        // 15: astore 3
        // 16: aload 2
        // 17: getstatic com/trolmastercard/sexmod/ff.K Lnet/minecraft/network/datasync/DataParameter;
        // 1a: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 1d: checkcast net/minecraft/util/math/BlockPos
        // 20: astore 4
        // 22: getstatic com/trolmastercard/sexmod/dj.t Ljava/util/HashSet;
        // 25: aload 1
        // 26: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 29: ifeq 35
        // 2c: aload 3
        // 2d: invokevirtual com/trolmastercard/sexmod/EyeAndKoboldColor.getMainColor ()Lnet/minecraft/util/math/Vec3i;
        // 30: areturn
        // 31: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 34: athrow
        // 35: getstatic com/trolmastercard/sexmod/dj.u Ljava/util/HashSet;
        // 38: aload 1
        // 39: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 3c: ifeq 48
        // 3f: aload 3
        // 40: invokevirtual com/trolmastercard/sexmod/EyeAndKoboldColor.getSecondaryColor ()Lnet/minecraft/util/math/Vec3i;
        // 43: areturn
        // 44: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 47: athrow
        // 48: ldc "irisR"
        // 4a: aload 1
        // 4b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 4e: ifne 61
        // 51: ldc "irisL"
        // 53: aload 1
        // 54: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 57: ifeq 68
        // 5a: goto 61
        // 5d: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 60: athrow
        // 61: aload 4
        // 63: areturn
        // 64: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 67: athrow
        // 68: getstatic com/trolmastercard/sexmod/de.z Lnet/minecraft/util/math/Vec3i;
        // 6b: areturn
        // try (15 -> 22): 22 java/lang/RuntimeException
        // try (24 -> 31): 31 java/lang/RuntimeException
        // try (33 -> 41): 42 java/lang/RuntimeException
        // try (37 -> 46): 46 java/lang/RuntimeException
    }

    @Override
    protected Vector4f a(String var1, float var2, float var3, float var4) {
        if ("mouth".equals(var1)) {
            String[] var5 = e4.a(this.j);
            int var6 = Integer.parseInt(var5[7]);

            try {
                if (var6 == 1) {
                    return new Vector4f(var2, var3, var4, -0.078125F);
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }
        }

        return super.a(var1, var2, var3, var4);
    }

    @Override
    protected void d() {
        float var1 = 0.25F - (Float)this.j.func_184212_Q().func_187225_a(e7.aA);
        GlStateManager.func_179152_a(1.0F - var1, 1.0F - var1, 1.0F - var1);
    }

    @Override
    protected void b() {
        float var1 = 0.25F - (Float)this.j.func_184212_Q().func_187225_a(e7.aA);
        double var2 = 1.0 / (1.0 - var1);
        GlStateManager.func_179139_a(var2, var2, var2);
    }

    @Override
    protected void c() {
        GlStateManager.func_179137_b(0.0, -0.8F, 0.05);
        GlStateManager.func_179139_a(0.5, 0.5, 0.5);
    }

    @Override
    protected void a(boolean param1, ItemStack param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: iload 1
        // 02: aload 2
        // 03: invokespecial com/trolmastercard/sexmod/d9.a (ZLnet/minecraft/item/ItemStack;)V
        // 06: aload 2
        // 07: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 0a: aload 2
        // 0b: invokevirtual net/minecraft/item/Item.func_77661_b (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumAction;
        // 0e: getstatic net/minecraft/item/EnumAction.BOW Lnet/minecraft/item/EnumAction;
        // 11: if_acmpne 41
        // 14: iload 1
        // 15: ifne 2e
        // 18: goto 1f
        // 1b: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1e: athrow
        // 1f: ldc 170.0
        // 21: fconst_1
        // 22: fconst_0
        // 23: fconst_0
        // 24: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 27: goto 2e
        // 2a: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2d: athrow
        // 2e: iload 1
        // 2f: ifeq 40
        // 32: ldc 0.1
        // 34: fconst_0
        // 35: fconst_0
        // 36: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 39: goto 40
        // 3c: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3f: athrow
        // 40: return
        // 41: iload 1
        // 42: ifeq 4e
        // 45: ldc 80.0
        // 47: goto 50
        // 4a: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4d: athrow
        // 4e: ldc 180.0
        // 50: fconst_1
        // 51: fconst_0
        // 52: fconst_0
        // 53: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 56: return
        // try (0 -> 12): 13 java/lang/RuntimeException
        // try (10 -> 20): 21 java/lang/RuntimeException
        // try (23 -> 29): 30 java/lang/RuntimeException
        // try (33 -> 37): 37 java/lang/RuntimeException
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
        // 03: invokespecial com/trolmastercard/sexmod/d9.a (ZZ)V
        // 06: iload 1
        // 07: ifeq 53
        // 0a: iload 2
        // 0b: ifeq 3e
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14: athrow
        // 15: ldc2_w 0.06
        // 18: dconst_0
        // 19: ldc2_w -0.13
        // 1c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 1f: ldc 60.0
        // 21: fconst_0
        // 22: fconst_1
        // 23: fconst_0
        // 24: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 27: ldc 38.0
        // 29: fconst_1
        // 2a: fconst_0
        // 2b: fconst_0
        // 2c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 2f: ldc 90.0
        // 31: fconst_0
        // 32: fconst_0
        // 33: fconst_1
        // 34: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 37: goto 78
        // 3a: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3d: athrow
        // 3e: ldc 90.0
        // 40: fconst_1
        // 41: fconst_0
        // 42: fconst_0
        // 43: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 46: dconst_0
        // 47: ldc2_w -0.30000001192092896
        // 4a: ldc2_w -0.13
        // 4d: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 50: goto 78
        // 53: iload 2
        // 54: ifeq 6e
        // 57: ldc 150.0
        // 59: fconst_0
        // 5a: fconst_1
        // 5b: fconst_0
        // 5c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 5f: dconst_0
        // 60: ldc2_w -0.35
        // 63: dconst_0
        // 64: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 67: goto 78
        // 6a: invokestatic com/trolmastercard/sexmod/de.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 6d: athrow
        // 6e: dconst_0
        // 6f: ldc2_w -0.1
        // 72: ldc2_w -0.08299999684095383
        // 75: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 78: return
        // try (0 -> 8): 9 java/lang/RuntimeException
        // try (6 -> 31): 31 java/lang/RuntimeException
        // try (43 -> 55): 55 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
