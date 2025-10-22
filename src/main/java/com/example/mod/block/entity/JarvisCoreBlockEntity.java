package com.example.mod.block.entity;

import com.example.mod.core.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class JarvisCoreBlockEntity extends BlockEntity {
    public JarvisCoreBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.JARVIS_CORE_BLOCK_ENTITY.get(), pPos, pBlockState);
    }

    public void tick(Level level, BlockPos pos, BlockState state) {
        // This is where the core logic will go.
        // For example: scanning nearby chests, processing crafting queues, managing energy, etc.
        // This tick method is called once per tick on the server side.
    }
}
