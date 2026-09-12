package com;

import java.io.File;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.GameType;
import net.minecraft.world.MinecraftException;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.storage.IChunkLoader;
import net.minecraft.world.gen.structure.template.TemplateManager;
import net.minecraft.world.storage.IPlayerFileData;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class b extends WorldClient {
   public Biome getBiomeForCoordsBody(BlockPos var1) {
      return new BiomePlains(false, new BiomeProperties("Plains").func_185398_c(0.125F).func_185400_d(0.05F).func_185400_d(0.8F).func_185395_b(0.4F));
   }

   public void func_175685_c(BlockPos var1, Block var2, boolean var3) {
      super.func_175685_c(var1, var2, var3);
   }

   public void markAndNotifyBlock(BlockPos var1, Chunk var2, IBlockState var3, IBlockState var4, int var5) {
   }

   public float getSunBrightnessFactor(float var1) {
      return 1.0F;
   }

   @SideOnly(Side.CLIENT)
   public float getSunBrightnessBody(float var1) {
      return 1.0F;
   }

   public void updateWeatherBody() {
   }

   public boolean canBlockFreezeBody(BlockPos var1, boolean var2) {
      return false;
   }

   public boolean canSnowAtBody(BlockPos var1, boolean var2) {
      return false;
   }

   public b() {
      super(
         new com.c(Minecraft.func_71410_x()),
         new WorldSettings(0L, GameType.SURVIVAL, false, false, WorldType.field_77138_c),
         0,
         EnumDifficulty.HARD,
         new Profiler()
      );
      this.field_73011_w.func_76558_a(this);
   }

   public boolean canMineBlockBody(EntityPlayer var1, BlockPos var2) {
      return false;
   }

   public boolean isSideSolid(BlockPos var1, EnumFacing var2) {
      try {
         if (var1.func_177956_o() <= 63) {
            return true;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return false;
   }

   public boolean isSideSolid(BlockPos var1, EnumFacing var2, boolean var3) {
      try {
         if (var1.func_177956_o() <= 63) {
            return true;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      return false;
   }

   public int countEntities(EnumCreatureType var1, boolean var2) {
      return 0;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   protected static class a extends WorldProvider {
      public void setDimension(int var1) {
      }

      public String getSaveFolder() {
         return null;
      }

      public BlockPos getRandomizedSpawnPoint() {
         return new BlockPos(0, 64, 0);
      }

      public boolean shouldMapSpin(String var1, double var2, double var4, double var6) {
         return false;
      }

      public int getRespawnDimension(EntityPlayerMP var1) {
         return 0;
      }

      public Biome getBiomeForCoords(BlockPos var1) {
         return new BiomePlains(false, new BiomeProperties("Plains").func_185398_c(0.125F).func_185400_d(0.05F).func_185400_d(0.8F).func_185395_b(0.4F));
      }

      public boolean isDaytime() {
         return true;
      }

      public void setAllowedSpawnTypes(boolean var1, boolean var2) {
      }

      public void calculateInitialWeather() {
      }

      public void updateWeather() {
      }

      public boolean canBlockFreeze(BlockPos var1, boolean var2) {
         return false;
      }

      public boolean canSnowAt(BlockPos var1, boolean var2) {
         return false;
      }

      public long getSeed() {
         return 1L;
      }

      public long getWorldTime() {
         return 1L;
      }

      public void setWorldTime(long var1) {
      }

      public boolean canMineBlock(EntityPlayer var1, BlockPos var2) {
         return false;
      }

      public boolean isBlockHighHumidity(BlockPos var1) {
         return false;
      }

      public int getHeight() {
         return 256;
      }

      public int getActualHeight() {
         return 256;
      }

      public void resetRainAndThunder() {
      }

      public boolean canDoLightning(Chunk var1) {
         return false;
      }

      public boolean canDoRainSnowIce(Chunk var1) {
         return false;
      }

      public DimensionType func_186058_p() {
         return DimensionType.OVERWORLD;
      }

      public BlockPos getSpawnPoint() {
         return new BlockPos(0, 64, 0);
      }
   }

   protected static class c implements IChunkProvider {
      @Nullable
      public Chunk func_186026_b(int var1, int var2) {
         return null;
      }

      public Chunk func_186025_d(int var1, int var2) {
         return null;
      }

      public boolean func_73156_b() {
         return false;
      }

      public String func_73148_d() {
         return null;
      }

      public boolean func_191062_e(int var1, int var2) {
         return true;
      }
   }

   protected static class d implements ISaveHandler {
      @Nullable
      public WorldInfo func_75757_d() {
         return null;
      }

      public void func_75762_c() throws MinecraftException {
      }

      public IChunkLoader func_75763_a(WorldProvider var1) {
         return null;
      }

      public void func_75755_a(WorldInfo var1, NBTTagCompound var2) {
      }

      public void func_75761_a(WorldInfo var1) {
      }

      public IPlayerFileData func_75756_e() {
         return null;
      }

      public void func_75759_a() {
      }

      public File func_75765_b() {
         return null;
      }

      public File func_75758_b(String var1) {
         return null;
      }

      public TemplateManager func_186340_h() {
         return new TemplateManager("", Minecraft.func_71410_x().func_184126_aj());
      }
   }
}
