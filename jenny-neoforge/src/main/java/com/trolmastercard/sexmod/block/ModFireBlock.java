package com.trolmastercard.sexmod.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ModFireBlock extends FireBlock {
    public static final MapCodec<FireBlock> a = simpleCodec(ModFireBlock::new);

    public ModFireBlock(Properties var1) {
        super(var1);
    }

    public MapCodec<FireBlock> codec() {
        return a;
    }

    protected void tick(BlockState var1, ServerLevel var2, BlockPos var3, RandomSource var4) {
    }
}
