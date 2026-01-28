package net.dobrosabokja.gemology.datagen;

import net.dobrosabokja.gemology.Gemology;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Gemology.MOD_ID, existingFileHelper);
    }

    // Will gonna be added later when we actually need them
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

    }
}
