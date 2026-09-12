package com.schnurritv.sexmod;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class a4 extends GuiScreen {
   public static final ResourceLocation r = new ResourceLocation("sexmod", "textures/gui/clothing_icons.png");
   static final int i = 20;
   static final float g = 0.25F;
   int p = 0;
   int b = 0;
   float m = 0.0F;
   public static float l = 0.0F;
   protected static List<Integer> k = new ArrayList<>();
   protected static int c = 0;
   protected static int t = 0;
   bi q;
   boolean h = false;
   bT a;
   public static List<Entry<bQ, Entry<List<String>, Integer>>> j = new ArrayList<>();
   final UUID s;
   int d;
   int n;
   public boolean f = false;
   int e = 0;
   int o = 1;

   public a4(@Nonnull bi var1) {
      this.field_146297_k = Minecraft.func_71410_x();
      this.s = var1.A();
      k var2 = com.schnurritv.sexmod.k.a(var1);
      if (var2 == null) {
         var2 = com.schnurritv.sexmod.k.JENNY;
      }

      try {
         Constructor var3 = var2.npcClass.getConstructor(World.class);
         this.q = (bi)var3.newInstance(this.field_146297_k.field_71441_e);
         this.q.j = true;
      } catch (Exception var11) {
         var11.printStackTrace();
      }

      this.c();
      String var15 = var1.M();
      this.q.func_184212_Q().func_187227_b(bi.c, var15);
      int var4 = 0;

      for (String var6 : this.q.K()) {
         bQ var7 = bk.g(var6);

         try {
            if (bQ.CUSTOM_BONE.equals(var7)) {
               var4++;
            }
         } catch (Exception var14) {
            throw a(var14);
         }

         Entry var8 = null;

         label65: {
            label79: {
               try {
                  if (bQ.CUSTOM_BONE.equals(var7) && var4 > 1) {
                     break label79;
                  }
               } catch (Exception var13) {
                  throw a(var13);
               }

               Iterator var9 = j.iterator();

               while (true) {
                  if (!var9.hasNext()) {
                     break label65;
                  }

                  Entry var10 = (Entry)var9.next();
                  if (((bQ)var10.getKey()).equals(var7)) {
                     var8 = var10;
                  }
               }
            }

            var8 = b(this.q);
         }

         try {
            if (var8 == null) {
               continue;
            }
         } catch (Exception var12) {
            throw a(var12);
         }

         j.remove(var8);
         int var16 = ((List)((Entry)var8.getValue()).getKey()).indexOf(var6);
         if (var16 == -1) {
            var16 = 0;
         }

         ((Entry)var8.getValue()).setValue(var16);
         j.add(var8);
      }
   }

   public void func_146274_d() throws IOException {
      super.func_146274_d();
      this.a.func_178039_p();
   }

   public static HashSet<String> d() {
      HashSet var0 = new HashSet();

      for (Entry var2 : j) {
         try {
            if (((List)((Entry)var2.getValue()).getKey()).size() == 1) {
               continue;
            }
         } catch (RuntimeException var6) {
            throw a(var6);
         }

         Entry var3 = (Entry)var2.getValue();
         List var4 = (List)var3.getKey();
         Integer var5 = (Integer)var3.getValue();
         var0.add(var4.get(var5));
      }

      return var0;
   }

   public static Entry<bQ, Entry<List<String>, Integer>> b(bi var0) {
      ArrayList var1 = new ArrayList();
      var1.add("cross");
      var1.addAll((Collection)bk.a(var0).get(bQ.CUSTOM_BONE));
      return new SimpleEntry<>(bQ.CUSTOM_BONE, new SimpleEntry<>(var1, 0));
   }

   void c() {
      j.clear();
      List var1 = this.q.a(this.s);
      this.d = var1.size();
      j.addAll(var1);

      for (bQ var5 : bQ.values()) {
         try {
            if (var5 == bQ.GIRL_SPECIFIC) {
               continue;
            }
         } catch (RuntimeException var8) {
            throw a(var8);
         }

         ArrayList var6 = new ArrayList();
         var6.add("cross");
         j.add(new SimpleEntry<>(var5, new SimpleEntry<>(var6, 0)));
      }

      for (Entry var10 : bk.a(this.q).entrySet()) {
         Entry var11 = null;

         for (Entry var14 : j) {
            if (((bQ)var10.getKey()).equals(var14.getKey())) {
               var11 = var14;
            }
         }

         try {
            if (var11 == null) {
               continue;
            }
         } catch (RuntimeException var7) {
            throw a(var7);
         }

         int var13 = j.indexOf(var11);
         j.remove(var11);
         ((List)((Entry)var11.getValue()).getKey()).addAll((Collection)var10.getValue());
         j.add(var13, var11);
      }
   }

   public void func_73866_w_() {
      this.a = new bT(this.field_146297_k, this);
   }

   public void func_146280_a(Minecraft var1, int var2, int var3) {
      super.func_146280_a(var1, var2, var3);
      this.p = this.b(76.0F);
      this.b = this.a(89.0F);
      this.m = 90.0F;
   }

   boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (var1 < var3) {
            return false;
         }
      } catch (RuntimeException var10) {
         throw a(var10);
      }

      try {
         if (var1 > var5) {
            return false;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      try {
         if (var2 < var4) {
            return false;
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      try {
         return var2 <= var6;
      } catch (RuntimeException var7) {
         throw a(var7);
      }
   }

   public void func_73863_a(int var1, int var2, float var3) {
      try {
         super.func_73863_a(var1, var2, var3);
         if (this.h) {
            l = l + b1.a(t, c, var3);
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      this.b();
      this.field_146297_k.field_71446_o.func_110577_a(r);
      int var4 = this.p - this.b(15.0F);
      int var5 = this.b - 20;

      a4 var10000;
      int var10001;
      int var10002;
      byte var10003;
      byte var10004;
      label32: {
         try {
            var10000 = this;
            var10001 = var4;
            var10002 = var5;
            var10003 = 100;
            if (this.a(var1, var2, var4, var5, var4 + 20, var5 + 20)) {
               var10004 = 40;
               break label32;
            }
         } catch (RuntimeException var7) {
            throw a(var7);
         }

         var10004 = 20;
      }

      try {
         var10000.func_73729_b(var10001, var10002, var10003, var10004, 20, 20);
         if (this.field_146297_k.func_147104_D() == null) {
            this.b(var4, var1, var2);
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      this.a(this.p, this.b, this.m, this.q, 1.2345679F);
      this.q.func_70071_h_();
      this.a.func_148128_a(var1, var2, var3);
   }

   void b(int var1, int var2, int var3) {
      int var4 = this.b - 40;

      a4 var10000;
      int var10001;
      int var10002;
      byte var10003;
      byte var10004;
      label41: {
         try {
            var10000 = this;
            var10001 = var1;
            var10002 = var4;
            var10003 = 120;
            if (this.a(var2, var3, var1, var4, var1 + 20, var4 + 20)) {
               var10004 = 40;
               break label41;
            }
         } catch (RuntimeException var7) {
            throw a(var7);
         }

         var10004 = 20;
      }

      label34: {
         try {
            var10000.func_73729_b(var10001, var10002, var10003, var10004, 20, 20);
            var4 -= 20;
            var10000 = this;
            var10001 = var1;
            var10002 = var4;
            var10003 = 20;
            if (this.a(var2, var3, var1, var4, var1 + 20, var4 + 20)) {
               var10004 = 170;
               break label34;
            }
         } catch (RuntimeException var6) {
            throw a(var6);
         }

         var10004 = 150;
      }

      label27: {
         try {
            var10000.func_73729_b(var10001, var10002, var10003, var10004, 20, 20);
            var4 -= 20;
            var10000 = this;
            var10001 = var1;
            var10002 = var4;
            var10003 = 0;
            if (this.a(var2, var3, var1, var4, var1 + 20, var4 + 20)) {
               var10004 = 170;
               break label27;
            }
         } catch (RuntimeException var5) {
            throw a(var5);
         }

         var10004 = 150;
      }

      var10000.func_73729_b(var10001, var10002, var10003, var10004, 20, 20);
   }

   public boolean func_73868_f() {
      return false;
   }

   void a() {
      this.field_146297_k.func_147118_V().func_147682_a(PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
      HashSet var1 = new HashSet();
      ArrayList var2 = new ArrayList();

      for (Entry var4 : j) {
         try {
            if (var4.getKey() == bQ.GIRL_SPECIFIC) {
               var2.add(((Entry)var4.getValue()).getValue());
               continue;
            }
         } catch (RuntimeException var9) {
            throw a(var9);
         }

         Entry var5 = (Entry)var4.getValue();
         Integer var6 = (Integer)var5.getValue();

         try {
            if (var6 == 0) {
               continue;
            }
         } catch (RuntimeException var8) {
            throw a(var8);
         }

         String var7 = (String)((List)var5.getKey()).get(var6);
         var1.add(var7);
      }

      at.a.sendToServer(new c8(bi.a(var1), this.s, var2));
      this.field_146297_k.field_71439_g.func_71053_j();
   }

   public void a(bQ var1, boolean var2, int var3) {
      this.field_146297_k.func_147118_V().func_147682_a(PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      int var6 = 0;

      for (Entry var8 : j) {
         try {
            if (((bQ)var8.getKey()).equals(var1)) {
               var4.add(var8);
               var5.add(var6);
            }
         } catch (RuntimeException var20) {
            throw a(var20);
         }

         var6++;
      }

      try {
         if (var4.size() == 0) {
            return;
         }
      } catch (RuntimeException var16) {
         throw a(var16);
      }

      Entry var21;
      int var22;
      if (var4.size() == 1) {
         var21 = (Entry)var4.get(0);
         var22 = (Integer)var5.get(0);
      } else {
         int var9;
         label87: {
            label86: {
               try {
                  if (this.d == 0 || var3 > this.d - 1 + bQ.a()) {
                     break label86;
                  }
               } catch (RuntimeException var19) {
                  throw a(var19);
               }

               var9 = var3;
               break label87;
            }

            var9 = var3 - (this.d + bQ.a());
         }

         var21 = (Entry)var4.get(var9);
         var22 = (Integer)var5.get(var9);
      }

      try {
         if (var21 == null) {
            return;
         }
      } catch (RuntimeException var18) {
         throw a(var18);
      }

      Entry var23 = (Entry)var21.getValue();
      int var10 = (Integer)var23.getValue();
      int var11 = ((List)var23.getKey()).size();

      label71: {
         label70: {
            try {
               if (var2) {
                  if (++var10 < var11) {
                     break label71;
                  }
                  break label70;
               }
            } catch (RuntimeException var17) {
               throw a(var17);
            }

            if (--var10 < 0) {
               var10 = var11 - 1;
            }
            break label71;
         }

         var10 = 0;
      }

      j.set(var22, new SimpleEntry<>((bQ)var21.getKey(), new SimpleEntry<>((List<String>)((Entry)var21.getValue()).getKey(), var10)));
      ArrayList var12 = new ArrayList();

      for (Entry var14 : j) {
         try {
            if (var14.getKey() == bQ.GIRL_SPECIFIC) {
               var12.add(var14);
            }
         } catch (RuntimeException var15) {
            throw a(var15);
         }
      }

      this.q.a(var12);
   }

   public void a(int var1, int var2, float var3, a8 var4) {
      this.a(var1, var2, var3, var4, 1.876945F);
   }

   public void a(a8 var1) {
      a4 var10000;
      int var10001;
      int var10002;
      float var10003;
      a8 var10004;
      float var10005;
      byte var10006;
      label16: {
         try {
            var10000 = this;
            var10001 = this.p;
            var10002 = this.b;
            var10003 = this.m;
            var10004 = var1;
            var10005 = 2.876945F;
            if (var1.d) {
               var10006 = 1;
               break label16;
            }
         } catch (RuntimeException var2) {
            throw a(var2);
         }

         var10006 = 0;
      }

      var10000.a(var10001, var10002, var10003, var10004, var10005, var10006);
   }

   public void a(String var1, int var2, int var3) {
      this.func_146279_a(var1, var2, var3);
   }

   protected void func_146273_a(int var1, int var2, int var3, long var4) {
      try {
         super.func_146273_a(var1, var2, var3, var4);
         if (var3 != 0) {
            return;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      try {
         if (var1 < this.field_146294_l / 2) {
            return;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      int var6 = var1 - this.n;
      k.add(var6);
      this.n = var1;
   }

   protected void func_73864_a(int var1, int var2, int var3) throws IOException {
      try {
         super.func_73864_a(var1, var2, var3);
         this.a.func_148179_a(var1, var2, var3);
         if (var3 != 0) {
            return;
         }
      } catch (URISyntaxException var15) {
         throw a(var15);
      }

      this.f = true;
      this.h = true;
      this.n = var1;
      int var4 = this.p - this.b(15.0F);
      int var5 = this.b - 20;

      try {
         if (this.a(var1, var2, var4, var5, var4 + 20, var5 + 20)) {
            this.a();
         }
      } catch (URISyntaxException var14) {
         throw a(var14);
      }

      try {
         if (this.field_146297_k.func_147104_D() != null) {
            return;
         }
      } catch (URISyntaxException var10) {
         throw a(var10);
      }

      var5 = this.b - 40;
      if (this.a(var1, var2, var4, var5, var4 + 20, var5 + 20)) {
         this.field_146297_k.func_147118_V().func_147682_a(PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
         this.field_146297_k.field_71439_g.func_71053_j();
         int var19 = bk.a(true);

         try {
            if (var19 != 0) {
               bk.c = true;
               return;
            }
         } catch (URISyntaxException var11) {
            throw a(var11);
         }

         bi var7 = bi.f(this.s);

         try {
            if (var7 != null) {
               a(var7);
            }
         } catch (URISyntaxException var8) {
            throw a(var8);
         }
      } else {
         try {
            var5 -= 20;
            if (this.a(var1, var2, var4, var5, var4 + 20, var5 + 20)) {
               System.out.println("folder");
               Desktop.getDesktop().open(new File(bk.b()));
               return;
            }
         } catch (URISyntaxException var9) {
            throw a(var9);
         }

         URISyntaxException var6;
         try {
            var5 -= 20;
            if (!this.a(var1, var2, var4, var5, var4 + 20, var5 + 20)) {
               return;
            }

            System.out.println("info");

            try {
               Desktop.getDesktop().browse(new URI("https://www.schnurritv.com/devlogs/1.9.mp4"));
               return;
            } catch (URISyntaxException var12) {
               var6 = var12;
            }
         } catch (IOException var13) {
            throw a(var13);
         }

         throw new RuntimeException(var6);
      }
   }

   protected void func_146286_b(int var1, int var2, int var3) {
      try {
         super.func_146286_b(var1, var2, var3);
         if (var3 == 0) {
            this.h = false;
            this.f = false;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      this.e = t;
   }

   int b(float var1) {
      return Math.round(this.field_146294_l * (var1 / 100.0F));
   }

   int a(float var1) {
      return Math.round(this.field_146295_m * (var1 / 100.0F));
   }

   public void func_146281_b() {
      super.func_146281_b();
      this.q.field_70170_p.func_72973_f(this.q);
      k.clear();
      j.clear();
   }

   public bi e() {
      return this.q;
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.field_146297_k.field_71446_o.func_110577_a(r);
      this.func_73729_b(var1, var2, var3, var4, 20, 20);
   }

   public void a(int var1, int var2, int var3) {
      this.a(var1, var2, var3, 0);
   }

   public void a(int var1, int var2, am var3) {
      this.a(var1, var2, var3.b, var3.c);
   }

   void a(int var1, int var2, float var3, EntityLivingBase var4, float var5) {
      this.a(var1, var2, var3, var4, var5, 0);
   }

   void a(int var1, int var2, float var3, EntityLivingBase var4, float var5, int var6) {
      float var7 = var4.field_70761_aq;
      float var8 = var4.field_70177_z;
      float var9 = var4.field_70125_A;
      float var10 = var4.field_70758_at;
      float var11 = var4.field_70759_as;
      var4.field_70761_aq = 0.0F;
      var4.field_70177_z = 0.0F;
      var4.field_70125_A = 0.0F;
      var4.field_70758_at = 0.0F;
      var4.field_70759_as = 0.0F;
      GlStateManager.func_179142_g();
      GlStateManager.func_179094_E();
      GlStateManager.func_179109_b(var1, var2, 50.0F);
      GlStateManager.func_179152_a(-var3, var3, var3);
      GlStateManager.func_179114_b(180.0F, 0.0F, 0.0F, 1.0F);
      GlStateManager.func_179114_b(135.0F, 0.0F, 1.0F, 0.0F);
      RenderHelper.func_74519_b();
      GlStateManager.func_179114_b(-135.0F, 0.0F, 1.0F, 0.0F);
      GlStateManager.func_179109_b(0.0F, 0.0F, var6);
      GlStateManager.func_179114_b(l, 0.0F, 1.0F, 0.0F);
      GlStateManager.func_179114_b(0.25F, 1.0F, 0.0F, 0.0F);
      GlStateManager.func_179109_b(0.0F, 0.0F, 0.0F);
      RenderManager var12 = Minecraft.func_71410_x().func_175598_ae();
      var12.func_178631_a(180.0F);
      var12.func_178633_a(false);
      var12.func_188391_a(var4, 0.0, 0.0, 0.0, 0.0F, var5, false);
      var12.func_178633_a(true);
      GlStateManager.func_179121_F();
      RenderHelper.func_74518_a();
      GlStateManager.func_179101_C();
      GlStateManager.func_179138_g(OpenGlHelper.field_77476_b);
      GlStateManager.func_179090_x();
      GlStateManager.func_179138_g(OpenGlHelper.field_77478_a);
      var4.field_70761_aq = var7;
      var4.field_70177_z = var8;
      var4.field_70125_A = var9;
      var4.field_70758_at = var10;
      var4.field_70759_as = var11;
   }

   void b() {
      try {
         if (this.h) {
            return;
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      float var1 = Minecraft.func_175610_ah();
      if (var1 == 0.0F) {
         var1 = 0.1F;
      }

      try {
         if (this.e == 0) {
            l = l + this.o * 10 / var1;
            return;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      try {
         l = l + this.e / var1;
         this.e = (int)(this.e * (1.0F - 0.25F / var1));
         if (Math.abs(this.e) > 10) {
            return;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      a4 var10000;
      byte var10001;
      label33: {
         try {
            var10000 = this;
            if (this.e > 0) {
               var10001 = 1;
               break label33;
            }
         } catch (RuntimeException var3) {
            throw a(var3);
         }

         var10001 = -1;
      }

      var10000.o = var10001;
      this.e = 0;
   }

   @SideOnly(Side.CLIENT)
   public static void a(@Nonnull bi param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
      // 03: astore 1
      // 04: aload 1
      // 05: getfield net/minecraft/client/Minecraft.field_71462_r Lnet/minecraft/client/gui/GuiScreen;
      // 08: instanceof com/schnurritv/sexmod/a4
      // 0b: ifeq 13
      // 0e: return
      // 0f: invokestatic com/schnurritv/sexmod/a4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual net/minecraft/client/Minecraft.func_147104_D ()Lnet/minecraft/client/multiplayer/ServerData;
      // 17: ifnull 27
      // 1a: invokestatic com/schnurritv/sexmod/bk.h ()Z
      // 1d: ifeq 2f
      // 20: goto 27
      // 23: invokestatic com/schnurritv/sexmod/a4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: bipush 1
      // 28: goto 30
      // 2b: invokestatic com/schnurritv/sexmod/a4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: bipush 0
      // 30: istore 2
      // 31: iload 2
      // 32: ifne 63
      // 35: aload 1
      // 36: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
      // 39: new net/minecraft/util/text/TextComponentString
      // 3c: dup
      // 3d: new java/lang/StringBuilder
      // 40: dup
      // 41: invokespecial java/lang/StringBuilder.<init> ()V
      // 44: ldc "You have to whitelist the server to use its custom models. "
      // 46: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49: getstatic net/minecraft/util/text/TextFormatting.YELLOW Lnet/minecraft/util/text/TextFormatting;
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4f: ldc "/whitelistserver"
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 57: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
      // 5a: bipush 1
      // 5b: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_146105_b (Lnet/minecraft/util/text/ITextComponent;Z)V
      // 5e: return
      // 5f: invokestatic com/schnurritv/sexmod/a4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: aload 1
      // 64: aload 1
      // 65: aload 0
      // 66: invokedynamic run (Lnet/minecraft/client/Minecraft;Lcom/schnurritv/sexmod/bi;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/schnurritv/sexmod/a4.lambda$openUI$0 (Lnet/minecraft/client/Minecraft;Lcom/schnurritv/sexmod/bi;)V, ()V ]
      // 6b: invokevirtual net/minecraft/client/Minecraft.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
      // 6e: pop
      // 6f: return
      // try (2 -> 7): 7 java/lang/RuntimeException
      // try (9 -> 14): 15 java/lang/RuntimeException
      // try (12 -> 19): 19 java/lang/RuntimeException
      // try (23 -> 43): 43 java/lang/RuntimeException
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public static class a {
      @SubscribeEvent
      @SideOnly(Side.CLIENT)
      public void a(KeyInputEvent param1) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
         //
         // Bytecode:
         // 00: getstatic com/schnurritv/sexmod/ClientProxy.keyBindings [Lnet/minecraft/client/settings/KeyBinding;
         // 03: bipush 1
         // 04: aaload
         // 05: invokevirtual net/minecraft/client/settings/KeyBinding.func_151468_f ()Z
         // 08: ifne 10
         // 0b: return
         // 0c: invokestatic com/schnurritv/sexmod/a4$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 0f: athrow
         // 10: getstatic com/schnurritv/sexmod/bk.c Z
         // 13: ifeq 3c
         // 16: bipush 0
         // 17: bipush 1
         // 18: invokestatic com/schnurritv/sexmod/bk.a (Z)I
         // 1b: if_icmpeq 2d
         // 1e: goto 25
         // 21: invokestatic com/schnurritv/sexmod/a4$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 24: athrow
         // 25: bipush 1
         // 26: goto 2e
         // 29: invokestatic com/schnurritv/sexmod/a4$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 2c: athrow
         // 2d: bipush 0
         // 2e: putstatic com/schnurritv/sexmod/bk.c Z
         // 31: getstatic com/schnurritv/sexmod/bk.c Z
         // 34: ifeq 3c
         // 37: return
         // 38: invokestatic com/schnurritv/sexmod/a4$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 3b: athrow
         // 3c: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
         // 3f: astore 2
         // 40: aload 2
         // 41: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
         // 44: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
         // 47: invokestatic com/schnurritv/sexmod/bg.e (Ljava/util/UUID;)Lcom/schnurritv/sexmod/bg;
         // 4a: astore 3
         // 4b: aload 3
         // 4c: ifnonnull 65
         // 4f: aload 2
         // 50: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
         // 53: new net/minecraft/util/text/TextComponentString
         // 56: dup
         // 57: ldc "You have to turn into the girl you want to customize"
         // 59: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
         // 5c: bipush 1
         // 5d: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_146105_b (Lnet/minecraft/util/text/ITextComponent;Z)V
         // 60: return
         // 61: invokestatic com/schnurritv/sexmod/a4$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
         // 64: athrow
         // 65: aload 3
         // 66: invokestatic com/schnurritv/sexmod/a4.a (Lcom/schnurritv/sexmod/bi;)V
         // 69: return
         // try (0 -> 6): 6 java/lang/RuntimeException
         // try (8 -> 14): 15 java/lang/RuntimeException
         // try (10 -> 19): 19 java/lang/RuntimeException
         // try (22 -> 26): 26 java/lang/RuntimeException
         // try (35 -> 46): 46 java/lang/RuntimeException
      }

      @SubscribeEvent
      @SideOnly(Side.CLIENT)
      public void a(ClientTickEvent var1) {
         a4.t = a4.c;
         a4.c = 0;

         for (Integer var3 : a4.k) {
            a4.c = a4.c + var3;
         }

         a4.k.clear();
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }
}
