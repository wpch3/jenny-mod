package com.schnurritv.sexmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class r {
   public static void a() {
      a("jenny", cK.class, k.JENNY.npcID, 3286592, 12655237);
      a("ellie", ca.class, k.ELLIE.npcID, 1447446, 9961472);
      a("slime", cZ.class, k.SLIME.npcID, 13167780, 8244330);
      a("bia", bH.class, k.BIA.npcID, 7488816, 7254603);
      a("bee", c4.class, k.BEE.npcID, 16701032, 4400155);
      a("luna", c9.class, k.LUNA.npcID, 7881787, 7940422);
      a("allie", bO.class, k.ALLIE.npcID);
      a("kobold", cA.class, k.KOBOLD.npcID);
      a("kobold_egg", c7.class, 4674237);
      a("goblin", ct.class, k.GOBLIN.npcID, 39424, 19456);
      a("custom_model", a8.class, 6281823);
      b("player_jenny", cQ.class, k.JENNY.playerID);
      b("player_ellie", cw.class, k.ELLIE.playerID);
      b("player_slime", cT.class, k.SLIME.playerID);
      b("player_bia", cR.class, k.BIA.playerID);
      b("player_bee", bm.class, k.BEE.playerID);
      b("player_allie", br.class, k.ALLIE.playerID);
      b("player_luna", c2.class, k.LUNA.playerID);
      b("player_kobold", cn.class, k.KOBOLD.playerID);
      b("player_goblin", cU.class, k.GOBLIN.playerID);
      EntityRegistry.registerModEntity(new ResourceLocation("sexmod:friendly_slime"), aV.class, "friendly_slime", 5548484, Main.instance, 50, 1, true);
      EntityRegistry.registerModEntity(new ResourceLocation("sexmod:luna_hook"), n.class, "luna_hook", 4768742, Main.instance, 50, 1, true);
      EntityRegistry.addSpawn(cZ.class, 10, 1, 1, EnumCreatureType.CREATURE, new Biome[]{Biomes.field_76780_h, Biomes.field_150599_m});
      EntityRegistry.addSpawn(c4.class, 5, 1, 1, EnumCreatureType.CREATURE, new Biome[]{Biomes.field_76767_f, Biomes.field_76785_t});
   }

   private static void b(String var0, Class<? extends Entity> var1, int var2) {
      EntityRegistry.registerModEntity(new ResourceLocation("sexmod:" + var0), var1, var0, var2, Main.instance, 100, 1, false);
   }

   private static void a(String var0, Class<? extends Entity> var1, int var2, int var3, int var4) {
      EntityRegistry.registerModEntity(new ResourceLocation("sexmod:" + var0), var1, var0, var2, Main.instance, 50, 1, true, var3, var4);
   }

   private static void a(String var0, Class<? extends Entity> var1, int var2) {
      EntityRegistry.registerModEntity(new ResourceLocation("sexmod:" + var0), var1, "allie", var2, Main.instance, 50, 1, true);
   }
}
