package com.example.mod.datagen;

import com.example.mod.core.ModBlocks;
import com.example.mod.core.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AI_CORE_CRYSTAL.get())
                .requires(Items.AMETHYST_SHARD)
                .requires(Items.QUARTZ)
                .requires(Items.REDSTONE)
                .requires(Items.ENDER_EYE)
                .unlockedBy(getHasName(Items.ENDER_EYE), has(Items.ENDER_EYE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JARVIS_CORE_BLOCK.get())
                .pattern("DRD")
                .pattern("RNC")
                .pattern("DOD")
                .define('D', Items.DIAMOND_BLOCK)
                .define('R', Items.REDSTONE_BLOCK)
                .define('N', Items.NETHER_STAR)
                .define('C', ModItems.AI_CORE_CRYSTAL.get())
                .define('O', Items.OBSERVER)
                .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
                .save(pWriter);
    }
}
