package com.example.mod.core;

import com.example.mod.JarvisCraftingCore;
import com.example.mod.block.entity.JarvisCoreBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, JarvisCraftingCore.MOD_ID);

    public static final RegistryObject<BlockEntityType<JarvisCoreBlockEntity>> JARVIS_CORE_BLOCK_ENTITY = 
            BLOCK_ENTITIES.register("jarvis_core_block_entity", () -> 
                    BlockEntityType.Builder.of(JarvisCoreBlockEntity::new, ModBlocks.JARVIS_CORE_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
