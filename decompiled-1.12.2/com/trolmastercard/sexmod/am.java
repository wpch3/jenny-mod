package com.trolmastercard.sexmod;

import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.client.event.RenderPlayerEvent.Pre;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class am {
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(RenderWorldLastEvent var1) {
        Minecraft var2 = Minecraft.func_71410_x();

        try {
            if (var2.field_71474_y.field_74320_O != 0) {
                return;
            }
        } catch (ConcurrentModificationException var15) {
            throw a(var15);
        }

        UUID var3 = var2.field_71439_g.getPersistentID();
        em var4 = null;

        try {
            for (em var6 : em.ad()) {
                try {
                    if (var6 == null) {
                        continue;
                    }
                } catch (ConcurrentModificationException var13) {
                    throw a(var13);
                }

                try {
                    if (var6.field_70128_L) {
                        continue;
                    }
                } catch (ConcurrentModificationException var12) {
                    throw a(var12);
                }

                try {
                    if (!var6.field_70170_p.field_72995_K) {
                        continue;
                    }
                } catch (ConcurrentModificationException var11) {
                    throw a(var11);
                }

                try {
                    if (!(var6 instanceof ai)) {
                        continue;
                    }
                } catch (ConcurrentModificationException var10) {
                    throw a(var10);
                }

                ai var7 = (ai)var6;
                if (var3.equals(var7.e())) {
                    var4 = var6;
                    break;
                }
            }
        } catch (ConcurrentModificationException var14) {
        }

        try {
            if (var4 == null) {
                return;
            }
        } catch (ConcurrentModificationException var9) {
            throw a(var9);
        }

        Render var16 = var2.func_175598_ae().func_78713_a(var4);

        try {
            if (var16 == null) {
                return;
            }
        } catch (ConcurrentModificationException var8) {
            throw a(var8);
        }

        float var17 = var2.field_71439_g.field_70177_z;
        dy.N = (float)(var2.field_71439_g.field_71158_b.field_78902_a * dy.G.field_72450_a);
        dy.N = dy.N + -(var17 - dy.H) * 3.0F;
        dy.N = b6.a(dy.I, dy.N, 0.1F);
        float var18 = -var2.field_71439_g.field_70125_A;
        dy.x = (float)(var2.field_71439_g.field_71158_b.field_192832_b * dy.G.field_72449_c + (float)var2.field_71439_g.field_70181_x * dy.G.field_72448_b);
        dy.x = dy.x + -(var18 - dy.t) * 3.0F;
        dy.x = b6.a(dy.E, dy.x, 0.1F);
        dy.a(var4, var1.getPartialTicks());
        dy.H = var17;
        dy.I = dy.N;
        dy.t = var18;
        dy.E = dy.x;
        GlStateManager.func_179145_e();
        GlStateManager.func_179126_j();
        GlStateManager.func_179141_d();
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void b(RenderWorldLastEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 03: astore 2
        // 04: aload 2
        // 05: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 08: ifnonnull 10
        // 0b: return
        // 0c: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 0f: athrow
        // 10: aload 2
        // 11: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 14: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 17: astore 3
        // 18: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 1b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 20: astore 4
        // 22: aload 4
        // 24: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 29: ifeq ba
        // 2c: aload 4
        // 2e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 33: checkcast com/trolmastercard/sexmod/em
        // 36: astore 5
        // 38: aload 5
        // 3a: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 3d: getfield net/minecraft/world/World.field_72995_K Z
        // 40: ifne 4a
        // 43: goto 22
        // 46: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 49: athrow
        // 4a: aload 5
        // 4c: getfield com/trolmastercard/sexmod/em.field_70128_L Z
        // 4f: ifeq 59
        // 52: goto 22
        // 55: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 58: athrow
        // 59: aload 5
        // 5b: instanceof com/trolmastercard/sexmod/ai
        // 5e: ifne 68
        // 61: goto 22
        // 64: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 67: athrow
        // 68: aload 5
        // 6a: checkcast com/trolmastercard/sexmod/ai
        // 6d: astore 6
        // 6f: aload 5
        // 71: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 74: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 77: if_acmpne b7
        // 7a: aload 5
        // 7c: bipush 1
        // 7d: invokevirtual com/trolmastercard/sexmod/em.b (Z)V
        // 80: aload 2
        // 81: invokevirtual net/minecraft/client/Minecraft.func_175598_ae ()Lnet/minecraft/client/renderer/entity/RenderManager;
        // 84: aload 5
        // 86: dconst_0
        // 87: dconst_0
        // 88: dconst_0
        // 89: aload 3
        // 8a: aload 6
        // 8c: invokeinterface com/trolmastercard/sexmod/ai.e ()Ljava/util/UUID; 1
        // 91: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 94: ifeq a7
        // 97: goto 9e
        // 9a: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 9d: athrow
        // 9e: ldc -420.69
        // a0: goto a8
        // a3: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // a6: athrow
        // a7: fconst_0
        // a8: aload 2
        // a9: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
        // ac: bipush 0
        // ad: invokevirtual net/minecraft/client/renderer/entity/RenderManager.func_188391_a (Lnet/minecraft/entity/Entity;DDDFFZ)V
        // b0: aload 5
        // b2: bipush 0
        // b3: invokevirtual com/trolmastercard/sexmod/em.b (Z)V
        // b6: return
        // b7: goto 22
        // ba: goto bf
        // bd: astore 4
        // bf: invokestatic net/minecraft/client/renderer/GlStateManager.func_179145_e ()V
        // c2: invokestatic net/minecraft/client/renderer/GlStateManager.func_179126_j ()V
        // c5: invokestatic net/minecraft/client/renderer/GlStateManager.func_179141_d ()V
        // c8: return
        // try (48 -> 67): 67 java/util/ConcurrentModificationException
        // try (44 -> 62): 63 java/util/ConcurrentModificationException
        // try (35 -> 39): 39 java/util/ConcurrentModificationException
        // try (29 -> 33): 33 java/util/ConcurrentModificationException
        // try (22 -> 27): 27 java/util/ConcurrentModificationException
        // try (2 -> 6): 6 java/util/ConcurrentModificationException
        // try (12 -> 77): 80 java/util/ConcurrentModificationException
        // try (78 -> 79): 80 java/util/ConcurrentModificationException
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(RenderHandEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 03: astore 2
        // 04: aload 2
        // 05: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 08: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 0b: astore 3
        // 0c: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 14: astore 4
        // 16: aload 4
        // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 1d: ifeq 88
        // 20: aload 4
        // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 27: checkcast com/trolmastercard/sexmod/em
        // 2a: astore 5
        // 2c: aload 5
        // 2e: instanceof com/trolmastercard/sexmod/ai
        // 31: ifne 3b
        // 34: goto 16
        // 37: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 3a: athrow
        // 3b: aload 5
        // 3d: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 40: astore 6
        // 42: aload 6
        // 44: getstatic com/trolmastercard/sexmod/fp.PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 47: if_acmpeq 60
        // 4a: aload 6
        // 4c: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 4f: if_acmpeq 60
        // 52: goto 59
        // 55: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 58: athrow
        // 59: goto 16
        // 5c: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 5f: athrow
        // 60: aload 5
        // 62: checkcast com/trolmastercard/sexmod/ai
        // 65: astore 7
        // 67: aload 7
        // 69: invokeinterface com/trolmastercard/sexmod/ai.e ()Ljava/util/UUID; 1
        // 6e: astore 8
        // 70: aload 3
        // 71: aload 8
        // 73: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 76: ifeq 85
        // 79: aload 1
        // 7a: bipush 1
        // 7b: invokevirtual net/minecraftforge/client/event/RenderHandEvent.setCanceled (Z)V
        // 7e: goto 88
        // 81: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 84: athrow
        // 85: goto 16
        // 88: goto 8d
        // 8b: astore 4
        // 8d: return
        // try (43 -> 51): 51 java/util/ConcurrentModificationException
        // try (28 -> 35): 35 java/util/ConcurrentModificationException
        // try (25 -> 31): 32 java/util/ConcurrentModificationException
        // try (16 -> 20): 20 java/util/ConcurrentModificationException
        // try (6 -> 54): 55 java/util/ConcurrentModificationException
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void a(Pre param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: invokevirtual net/minecraftforge/client/event/RenderPlayerEvent$Pre.getEntityPlayer ()Lnet/minecraft/entity/player/EntityPlayer;
        // 04: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 07: astore 2
        // 08: invokestatic com/trolmastercard/sexmod/em.ad ()Ljava/util/List;
        // 0b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 10: astore 3
        // 11: aload 3
        // 12: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 17: ifeq 7d
        // 1a: aload 3
        // 1b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 20: checkcast com/trolmastercard/sexmod/em
        // 23: astore 4
        // 25: aload 4
        // 27: instanceof com/trolmastercard/sexmod/ai
        // 2a: ifne 34
        // 2d: goto 11
        // 30: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 33: athrow
        // 34: aload 4
        // 36: checkcast com/trolmastercard/sexmod/ai
        // 39: astore 5
        // 3b: aload 4
        // 3d: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 40: astore 6
        // 42: aload 6
        // 44: getstatic com/trolmastercard/sexmod/fp.PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 47: if_acmpeq 60
        // 4a: aload 6
        // 4c: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 4f: if_acmpeq 60
        // 52: goto 59
        // 55: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 58: athrow
        // 59: goto 11
        // 5c: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 5f: athrow
        // 60: aload 2
        // 61: aload 5
        // 63: invokeinterface com/trolmastercard/sexmod/ai.e ()Ljava/util/UUID; 1
        // 68: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 6b: ifeq 7a
        // 6e: aload 1
        // 6f: bipush 1
        // 70: invokevirtual net/minecraftforge/client/event/RenderPlayerEvent$Pre.setCanceled (Z)V
        // 73: goto 7d
        // 76: invokestatic com/trolmastercard/sexmod/am.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
        // 79: athrow
        // 7a: goto 11
        // 7d: goto 81
        // 80: astore 3
        // 81: return
        // try (38 -> 47): 47 java/util/ConcurrentModificationException
        // try (29 -> 36): 36 java/util/ConcurrentModificationException
        // try (26 -> 32): 33 java/util/ConcurrentModificationException
        // try (14 -> 18): 18 java/util/ConcurrentModificationException
        // try (4 -> 50): 51 java/util/ConcurrentModificationException
    }

    private static ConcurrentModificationException a(ConcurrentModificationException var0) {
        return var0;
    }
}
