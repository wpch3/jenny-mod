package com.schnurritv.sexmod;

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

public class a0 {
   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public void b(RenderWorldLastEvent var1) {
      Minecraft var2 = Minecraft.func_71410_x();

      try {
         if (var2.field_71474_y.field_74320_O != 0) {
            return;
         }
      } catch (ConcurrentModificationException var16) {
         throw a(var16);
      }

      UUID var3 = var2.field_71439_g.getPersistentID();
      ct var4 = null;

      try {
         for (bi var6 : bi.J()) {
            try {
               if (var6 == null) {
                  continue;
               }
            } catch (ConcurrentModificationException var14) {
               throw a(var14);
            }

            try {
               if (!var6.field_70170_p.field_72995_K) {
                  continue;
               }
            } catch (ConcurrentModificationException var13) {
               throw a(var13);
            }

            try {
               if (!(var6 instanceof ct)) {
                  continue;
               }
            } catch (ConcurrentModificationException var12) {
               throw a(var12);
            }

            ct var7 = (ct)var6;
            if (var3.equals(var7.a())) {
               var4 = var7;
               break;
            }
         }
      } catch (ConcurrentModificationException var15) {
      }

      try {
         if (var4 == null) {
            return;
         }
      } catch (ConcurrentModificationException var11) {
         throw a(var11);
      }

      Render var17 = var2.func_175598_ae().func_78713_a(var4);

      try {
         if (var17 == null) {
            return;
         }
      } catch (ConcurrentModificationException var9) {
         throw a(var9);
      }

      try {
         if (!(var17 instanceof bG)) {
            return;
         }
      } catch (ConcurrentModificationException var10) {
         throw a(var10);
      }

      bG var18 = (bG)var17;
      float var19 = var2.field_71439_g.field_70177_z;
      var18.I = (float)(var2.field_71439_g.field_71158_b.field_78902_a * bG.D.field_72450_a);
      var18.I = var18.I + -(var19 - var18.O) * 3.0F;
      var18.I = b1.a(var18.N, var18.I, 0.1F);
      float var8 = -var2.field_71439_g.field_70125_A;
      var18.S = (float)(var2.field_71439_g.field_71158_b.field_192832_b * bG.D.field_72449_c + (float)var2.field_71439_g.field_70181_x * bG.D.field_72448_b);
      var18.S = var18.S + -(var8 - var18.E) * 3.0F;
      var18.S = b1.a(var18.F, var18.S, 0.1F);
      var18.b(var4, var1.getPartialTicks());
      var18.O = var19;
      var18.N = var18.I;
      var18.E = var8;
      var18.F = var18.S;
      GlStateManager.func_179145_e();
      GlStateManager.func_179126_j();
      GlStateManager.func_179141_d();
   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public void a(RenderWorldLastEvent param1) {
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
      // 0c: invokestatic com/schnurritv/sexmod/a0.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 0f: athrow
      // 10: aload 2
      // 11: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 14: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
      // 17: astore 3
      // 18: invokestatic com/schnurritv/sexmod/bi.J ()Ljava/util/HashSet;
      // 1b: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 1e: astore 4
      // 20: aload 4
      // 22: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 27: ifeq a7
      // 2a: aload 4
      // 2c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 31: checkcast com/schnurritv/sexmod/bi
      // 34: astore 5
      // 36: aload 5
      // 38: getfield com/schnurritv/sexmod/bi.field_70170_p Lnet/minecraft/world/World;
      // 3b: getfield net/minecraft/world/World.field_72995_K Z
      // 3e: ifne 48
      // 41: goto 20
      // 44: invokestatic com/schnurritv/sexmod/a0.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 47: athrow
      // 48: aload 5
      // 4a: instanceof com/schnurritv/sexmod/ct
      // 4d: ifne 57
      // 50: goto 20
      // 53: invokestatic com/schnurritv/sexmod/a0.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 56: athrow
      // 57: aload 5
      // 59: checkcast com/schnurritv/sexmod/ct
      // 5c: astore 6
      // 5e: aload 5
      // 60: invokevirtual com/schnurritv/sexmod/bi.D ()Lcom/schnurritv/sexmod/bj;
      // 63: getstatic com/schnurritv/sexmod/bj.START_THROWING Lcom/schnurritv/sexmod/bj;
      // 66: if_acmpne a4
      // 69: aload 6
      // 6b: bipush 1
      // 6c: putfield com/schnurritv/sexmod/ct.aB Z
      // 6f: aload 2
      // 70: invokevirtual net/minecraft/client/Minecraft.func_175598_ae ()Lnet/minecraft/client/renderer/entity/RenderManager;
      // 73: aload 6
      // 75: dconst_0
      // 76: dconst_0
      // 77: dconst_0
      // 78: aload 3
      // 79: aload 6
      // 7b: invokevirtual com/schnurritv/sexmod/ct.a ()Ljava/util/UUID;
      // 7e: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 81: ifeq 94
      // 84: goto 8b
      // 87: invokestatic com/schnurritv/sexmod/a0.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 8a: athrow
      // 8b: ldc -420.69
      // 8d: goto 95
      // 90: invokestatic com/schnurritv/sexmod/a0.a (Ljava/util/ConcurrentModificationException;)Ljava/util/ConcurrentModificationException;
      // 93: athrow
      // 94: fconst_0
      // 95: aload 2
      // 96: invokevirtual net/minecraft/client/Minecraft.func_184121_ak ()F
      // 99: bipush 0
      // 9a: invokevirtual net/minecraft/client/renderer/entity/RenderManager.func_188391_a (Lnet/minecraft/entity/Entity;DDDFFZ)V
      // 9d: aload 6
      // 9f: bipush 0
      // a0: putfield com/schnurritv/sexmod/ct.aB Z
      // a3: return
      // a4: goto 20
      // a7: goto ac
      // aa: astore 4
      // ac: invokestatic net/minecraft/client/renderer/GlStateManager.func_179145_e ()V
      // af: invokestatic net/minecraft/client/renderer/GlStateManager.func_179126_j ()V
      // b2: invokestatic net/minecraft/client/renderer/GlStateManager.func_179141_d ()V
      // b5: return
      // try (42 -> 61): 61 java/util/ConcurrentModificationException
      // try (38 -> 56): 57 java/util/ConcurrentModificationException
      // try (29 -> 33): 33 java/util/ConcurrentModificationException
      // try (22 -> 27): 27 java/util/ConcurrentModificationException
      // try (2 -> 6): 6 java/util/ConcurrentModificationException
      // try (12 -> 71): 74 java/util/ConcurrentModificationException
      // try (72 -> 73): 74 java/util/ConcurrentModificationException
   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public void a(RenderHandEvent var1) {
      Minecraft var2 = Minecraft.func_71410_x();
      UUID var3 = var2.field_71439_g.getPersistentID();

      try {
         for (bi var5 : bi.J()) {
            try {
               if (!(var5 instanceof ct)) {
                  continue;
               }
            } catch (ConcurrentModificationException var9) {
               throw a(var9);
            }

            ct var6 = (ct)var5;

            try {
               if (var5.D() != bj.PICK_UP) {
                  continue;
               }
            } catch (ConcurrentModificationException var8) {
               throw a(var8);
            }

            try {
               if (var3.equals(var6.a())) {
                  var1.setCanceled(true);
                  break;
               }
            } catch (ConcurrentModificationException var7) {
               throw a(var7);
            }
         }
      } catch (ConcurrentModificationException var10) {
      }
   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public void a(Pre var1) {
      UUID var2 = var1.getEntityPlayer().getPersistentID();

      try {
         for (bi var4 : bi.J()) {
            try {
               if (!(var4 instanceof ct)) {
                  continue;
               }
            } catch (ConcurrentModificationException var8) {
               throw a(var8);
            }

            ct var5 = (ct)var4;

            try {
               if (var4.D() != bj.PICK_UP) {
                  continue;
               }
            } catch (ConcurrentModificationException var7) {
               throw a(var7);
            }

            try {
               if (var2.equals(var5.a())) {
                  var1.setCanceled(true);
                  break;
               }
            } catch (ConcurrentModificationException var6) {
               throw a(var6);
            }
         }
      } catch (ConcurrentModificationException var9) {
      }
   }

   private static ConcurrentModificationException a(ConcurrentModificationException var0) {
      return var0;
   }
}
