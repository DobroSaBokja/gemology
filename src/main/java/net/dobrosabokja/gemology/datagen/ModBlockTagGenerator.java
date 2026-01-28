package net.dobrosabokja.gemology.datagen;

import net.dobrosabokja.gemology.Gemology;
import net.dobrosabokja.gemology.blocks.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Gemology.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.GARNET_BLOCK.get(),
                        ModBlocks.RAW_GARNET_BLOCK.get(),
                        ModBlocks.GARNET_ORE.get()
                );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(
                        ModBlocks.GARNET_BLOCK.get(),
                        ModBlocks.RAW_GARNET_BLOCK.get(),
                        ModBlocks.GARNET_ORE.get()
                );
    }
}
