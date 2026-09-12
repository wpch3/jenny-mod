package com.schnurritv.sexmod;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;
import net.minecraft.world.storage.MapData.MapInfo;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class e extends ItemMap {
   public static final e a = new e();

   public static ItemStack a(World var0, double var1, double var3, byte var5, boolean var6, boolean var7) {
      ItemStack var8 = new ItemStack(a, 1, var0.func_72841_b("map"));
      String var9 = "map_" + var8.func_77960_j();
      MapData var10 = new MapData(var9);
      var0.func_72823_a(var9, var10);
      var10.field_76197_d = var5;
      var10.func_176054_a(var1, var3, var10.field_76197_d);
      var10.field_76200_c = var0.field_73011_w.getDimension();
      var10.field_186210_e = var6;
      var10.field_191096_f = var7;
      var10.func_76185_a();
      e var11 = (e)var8.func_77973_b();
      List var12 = var0.func_73046_m().func_184103_al().func_181057_v();

      try {
         if (var12.size() == 0) {
            return var8;
         }
      } catch (RuntimeException var15) {
         throw a(var15);
      }

      EntityPlayer var13 = (EntityPlayer)var12.get(0);

      try {
         if (var13 != null) {
            var11.func_77872_a(var0, var13, var10);
         }

         return var8;
      } catch (RuntimeException var14) {
         throw a(var14);
      }
   }

   @SideOnly(Side.CLIENT)
   InputStream b() throws Exception {
      return Minecraft.func_71410_x().func_110442_L().func_110536_a(new ResourceLocation("sexmod", "textures/colors.txt")).func_110527_b();
   }

   public void func_77872_a(World var1, Entity var2, MapData var3) {
      short var4 = 128;
      MapInfo var5 = var3.func_82568_a((EntityPlayer)var2);
      InputStream var6 = null;
      if (var1.field_72995_K) {
         try {
            var6 = this.b();
         } catch (Exception var12) {
            var12.printStackTrace();
         }
      }

      try {
         if (var6 == null) {
            return;
         }
      } catch (Exception var16) {
         throw a(var16);
      }

      try {
         Scanner var7 = new Scanner(var6);
         int[] var8 = new int[16385];
         int var9 = 0;

         while (var7.hasNextInt()) {
            int var10 = var7.nextInt();

            try {
               var8[var9++] = var10;
               if (var9 >= var8.length) {
                  break;
               }
            } catch (Exception var14) {
               throw a(var14);
            }
         }

         for (int var17 = 0; var17 < var4; var17++) {
            int var11 = 0;

            try {
               while (var11 < var4) {
                  var3.field_76198_e[var17 + var11 * var4] = (byte)var8[var17 + var11 * var4];
                  var5.func_176102_a(var17, var11);
                  var11++;
               }
            } catch (Exception var13) {
               throw a(var13);
            }
         }

         var7.close();
         var6.close();
      } catch (Exception var15) {
         var15.printStackTrace();
      }
   }

   public static void a() {
      a.setRegistryName("sexmod", "item_map_secret");
      a.func_77655_b("item_map_secret");
      MinecraftForge.EVENT_BUS.register(e.class);
   }

   @SubscribeEvent
   public static void a(Register<Item> var0) {
      var0.getRegistry().register(a);
   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public static void a(ModelRegistryEvent var0) {
      ModelLoader.setCustomModelResourceLocation(a, 0, new ModelResourceLocation("sexmod:item_map_secret"));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
