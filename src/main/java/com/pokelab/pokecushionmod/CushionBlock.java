package com.pokelab.pokecushionmod;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class CushionBlock extends Block {
    public CushionBlock() {
        super(BlockBehaviour.Properties.of().mapColor(MapColor.WOOL).sound(SoundType.WOOL).strength(0.1f));
    }

    @Override
    public void fallOn(Level level, BlockState block_state, BlockPos block_Pos, Entity entity, float f) {
        entity.causeFallDamage(f, 0.0F, level.damageSources().fall());
    }
}
