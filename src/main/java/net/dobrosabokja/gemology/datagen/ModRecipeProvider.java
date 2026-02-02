package net.dobrosabokja.gemology.datagen;

import net.dobrosabokja.gemology.blocks.ModBlocks;
import net.dobrosabokja.gemology.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        // Garnet
        compress_and_decompress_material(ModBlocks.GARNET_BLOCK.get(), ModItems.GARNET.get(), pWriter);
        compress_and_decompress_material(ModBlocks.RAW_GARNET_BLOCK.get(), ModItems.RAW_GARNET.get(), pWriter);

        // Amber
        compress_and_decompress_material(ModBlocks.AMBER_BLOCK.get(), ModItems.AMBER.get(), pWriter);
        compress_and_decompress_material(ModBlocks.RAW_AMBER_BLOCK.get(), ModItems.RAW_AMBER.get(), pWriter);
    }

    private void compress_and_decompress_material(Block pBlock, Item pItem, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pBlock)
                .pattern("GGG")
                .pattern("GGG")
                .pattern("GGG")
                .define('G', pItem)
                .unlockedBy(getHasName(pItem), has(pItem))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pItem, 9)
                .requires(pBlock)
                .unlockedBy(getHasName(pBlock), has(pBlock))
                .save(pWriter);
    }
}
