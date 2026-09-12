package com.schnurritv.sexmod;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class j extends GuiScreen {
   List<EntityLivingBase> c = new ArrayList<>();
   int b = 0;
   static float a = 0.0F;

   public j(HashMap<k, String> var1) {
      this.field_146297_k = Minecraft.func_71410_x();

      for (k var5 : k.values()) {
         try {
            if (var5.isNpcOnly) {
               continue;
            }
         } catch (Exception var10) {
            throw a(var10);
         }

         try {
            Constructor var6 = var5.npcClass.getConstructor(World.class);
            bi var7 = (bi)var6.newInstance(this.field_146297_k.field_71441_e);
            var7.j = true;
            this.c.add(var7);
            String var8 = (String)var1.get(var5);
            if (var8 != null) {
               var7.c(bi.e(var8));
            }
         } catch (Exception var9) {
            var9.printStackTrace();
         }
      }

      this.c.add(this.field_146297_k.field_71439_g);
   }

   public void func_73863_a(int var1, int var2, float var3) {
      super.func_73863_a(var1, var2, var3);
      this.field_146292_n.clear();
      a(this.field_146294_l / 2, this.field_146295_m / 2 + 20, 30, this.c.get(this.b));
      this.field_146292_n.add(new GuiButton(1, this.field_146294_l / 2 + 30, this.field_146295_m / 2 - 10, 20, 20, ">"));
      this.field_146292_n.add(new GuiButton(2, this.field_146294_l / 2 - 50, this.field_146295_m / 2 - 10, 20, 20, "<"));
      this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 - 30, this.field_146295_m / 2 + 30, 60, 20, "pick"));
   }

   protected void func_146284_a(GuiButton param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: ldc ">"
      // 02: aload 1
      // 03: getfield net/minecraft/client/gui/GuiButton.field_146126_j Ljava/lang/String;
      // 06: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 09: ifeq 36
      // 0c: aload 0
      // 0d: dup
      // 0e: getfield com/schnurritv/sexmod/j.b I
      // 11: bipush 1
      // 12: iadd
      // 13: dup_x1
      // 14: putfield com/schnurritv/sexmod/j.b I
      // 17: aload 0
      // 18: getfield com/schnurritv/sexmod/j.c Ljava/util/List;
      // 1b: invokeinterface java/util/List.size ()I 1
      // 20: if_icmplt 36
      // 23: goto 2a
      // 26: invokestatic com/schnurritv/sexmod/j.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: bipush 0
      // 2c: putfield com/schnurritv/sexmod/j.b I
      // 2f: goto 36
      // 32: invokestatic com/schnurritv/sexmod/j.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: ldc "<"
      // 38: aload 1
      // 39: getfield net/minecraft/client/gui/GuiButton.field_146126_j Ljava/lang/String;
      // 3c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3f: ifeq 6d
      // 42: aload 0
      // 43: dup
      // 44: getfield com/schnurritv/sexmod/j.b I
      // 47: bipush 1
      // 48: isub
      // 49: dup_x1
      // 4a: putfield com/schnurritv/sexmod/j.b I
      // 4d: ifge 6d
      // 50: goto 57
      // 53: invokestatic com/schnurritv/sexmod/j.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: aload 0
      // 58: aload 0
      // 59: getfield com/schnurritv/sexmod/j.c Ljava/util/List;
      // 5c: invokeinterface java/util/List.size ()I 1
      // 61: bipush 1
      // 62: isub
      // 63: putfield com/schnurritv/sexmod/j.b I
      // 66: goto 6d
      // 69: invokestatic com/schnurritv/sexmod/j.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: aload 1
      // 6e: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
      // 71: ifne c6
      // 74: getstatic com/schnurritv/sexmod/at.a Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
      // 77: new com/schnurritv/sexmod/b6
      // 7a: dup
      // 7b: aload 0
      // 7c: getfield com/schnurritv/sexmod/j.c Ljava/util/List;
      // 7f: aload 0
      // 80: getfield com/schnurritv/sexmod/j.b I
      // 83: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 88: checkcast net/minecraft/entity/Entity
      // 8b: invokestatic com/schnurritv/sexmod/k.a (Lnet/minecraft/entity/Entity;)Lcom/schnurritv/sexmod/k;
      // 8e: invokespecial com/schnurritv/sexmod/b6.<init> (Lcom/schnurritv/sexmod/k;)V
      // 91: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
      // 94: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 97: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 9a: astore 2
      // 9b: aload 2
      // 9c: invokevirtual net/minecraft/entity/player/EntityPlayer.func_71053_j ()V
      // 9f: aload 2
      // a0: aload 2
      // a1: invokevirtual net/minecraft/entity/player/EntityPlayer.getDefaultEyeHeight ()F
      // a4: putfield net/minecraft/entity/player/EntityPlayer.eyeHeight F
      // a7: aload 2
      // a8: getfield net/minecraft/entity/player/EntityPlayer.field_71075_bZ Lnet/minecraft/entity/player/PlayerCapabilities;
      // ab: getfield net/minecraft/entity/player/PlayerCapabilities.field_75101_c Z
      // ae: ifne c6
      // b1: aload 2
      // b2: getfield net/minecraft/entity/player/EntityPlayer.field_71075_bZ Lnet/minecraft/entity/player/PlayerCapabilities;
      // b5: aload 2
      // b6: getfield net/minecraft/entity/player/EntityPlayer.field_71075_bZ Lnet/minecraft/entity/player/PlayerCapabilities;
      // b9: getfield net/minecraft/entity/player/PlayerCapabilities.field_75098_d Z
      // bc: putfield net/minecraft/entity/player/PlayerCapabilities.field_75101_c Z
      // bf: goto c6
      // c2: invokestatic com/schnurritv/sexmod/j.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c5: athrow
      // c6: return
      // try (0 -> 16): 17 java/lang/RuntimeException
      // try (5 -> 22): 23 java/lang/RuntimeException
      // try (25 -> 38): 39 java/lang/RuntimeException
      // try (30 -> 48): 49 java/lang/RuntimeException
      // try (69 -> 85): 86 java/lang/RuntimeException
   }

   public boolean func_73868_f() {
      return false;
   }

   public static void a(int var0, int var1, int var2, EntityLivingBase var3) {
      float var4 = var3.field_70761_aq;
      float var5 = var3.field_70177_z;
      float var6 = var3.field_70125_A;
      float var7 = var3.field_70758_at;
      float var8 = var3.field_70759_as;

      try {
         if (!(var3 instanceof EntityPlayer)) {
            var3.field_70165_t = 0.0;
            var3.field_70163_u = 0.0;
            var3.field_70161_v = 0.0;
         }
      } catch (RuntimeException var11) {
         throw a(var11);
      }

      var3.field_70761_aq = 0.0F;
      var3.field_70177_z = 0.0F;
      var3.field_70125_A = 0.0F;
      var3.field_70758_at = 0.0F;
      var3.field_70759_as = 0.0F;
      float var9 = Minecraft.func_175610_ah();
      if (var9 == 0.0F) {
         var9 = 0.1F;
      }

      a += 60.0F / var9;
      GlStateManager.func_179142_g();
      GlStateManager.func_179094_E();
      GlStateManager.func_179109_b(var0, var1, 50.0F);
      GlStateManager.func_179152_a(-var2, var2, var2);
      GlStateManager.func_179114_b(180.0F, 0.0F, 0.0F, 1.0F);
      GlStateManager.func_179114_b(135.0F, 0.0F, 1.0F, 0.0F);
      RenderHelper.func_74519_b();
      GlStateManager.func_179114_b(-135.0F, 0.0F, 1.0F, 0.0F);
      GlStateManager.func_179114_b(a, 0.0F, 1.0F, 0.0F);
      GlStateManager.func_179109_b(0.0F, 0.0F, 0.0F);
      RenderManager var10 = Minecraft.func_71410_x().func_175598_ae();
      var10.func_178631_a(180.0F);
      var10.func_178633_a(false);
      var10.func_188391_a(var3, 0.0, 0.0, 0.0, 0.0F, 1.2345679F, false);
      var10.func_178633_a(true);
      GlStateManager.func_179121_F();
      RenderHelper.func_74518_a();
      GlStateManager.func_179101_C();
      GlStateManager.func_179138_g(OpenGlHelper.field_77476_b);
      GlStateManager.func_179090_x();
      GlStateManager.func_179138_g(OpenGlHelper.field_77478_a);
      var3.field_70761_aq = var4;
      var3.field_70177_z = var5;
      var3.field_70125_A = var6;
      var3.field_70758_at = var7;
      var3.field_70759_as = var8;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
