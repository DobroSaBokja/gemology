package net.dobrosabokja.gemology.datagen;

import net.dobrosabokja.gemology.blocks.ModBlocks;
import net.dobrosabokja.gemology.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GARNET_BLOCK.get())
                .pattern("GGG")
                .pattern("GGG")
                .pattern("GGG")
                .define('G', ModItems.GARNET.get())
                .unlockedBy(getHasName(ModItems.GARNET.get()), has(ModItems.GARNET.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GARNET.get(), 9)
                .requires(ModBlocks.GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.GARNET_BLOCK.get()), has(ModBlocks.GARNET_BLOCK.get()))
                .save(pWriter);
    }
}
