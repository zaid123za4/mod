package com.example.mod.datagen;

import com.example.mod.JarvisCraftingCore;
import com.example.mod.core.ModBlocks;
import com.example.mod.core.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, JarvisCraftingCore.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add(ModItems.AI_CORE_CRYSTAL.get(), "AI Core Crystal");
        add(ModBlocks.JARVIS_CORE_BLOCK.get(), "JARVIS Crafting Core");
        add("creativetab.jarvis_tab", "JARVIS Core");
    }
}
