package com.trolmastercard.sexmod.util;

import com.google.common.collect.Sets;
import java.util.HashSet;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class BlockPosUtils {
    public static int a(Level var0, int var1, int var2) {
        HashSet var3 = Sets.newHashSet(new Block[]{Blocks.GRASS_BLOCK, Blocks.SAND, Blocks.RED_SAND, Blocks.WATER, Blocks.STONE, Blocks.COBBLESTONE});
        int var4 = var0.getMaxBuildHeight();
        boolean var5 = false;

        while (!var5 && var4-- >= var0.getMinBuildHeight()) {
            Block var6 = var0.getBlockState(new BlockPos(var1, var4, var2)).getBlock();
            var5 = var3.contains(var6);
        }

        return var4;
    }
}
