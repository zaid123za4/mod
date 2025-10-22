package com.example.mod.core;

import com.example.mod.JarvisCraftingCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JarvisCraftingCore.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JARVIS_TAB = CREATIVE_MODE_TABS.register("jarvis_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.JARVIS_CORE_BLOCK.get()))
                    .title(Component.translatable("creativetab.jarvis_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AI_CORE_CRYSTAL.get());
                        pOutput.accept(ModBlocks.JARVIS_CORE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
