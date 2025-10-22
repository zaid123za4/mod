package com.example.mod;

import com.example.mod.core.ModBlockEntities;
import com.example.mod.core.ModBlocks;
import com.example.mod.core.ModCreativeModeTabs;
import com.example.mod.core.ModItems;
import com.example.mod.datagen.DataGenerators;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(JarvisCraftingCore.MOD_ID)
public class JarvisCraftingCore {
    public static final String MOD_ID = "jarviscraftingcore";
    private static final Logger LOGGER = LogUtils.getLogger();

    public JarvisCraftingCore() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(DataGenerators::gatherData);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("JARVIS Core Initializing...");
    }
}
