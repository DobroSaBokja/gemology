package net.dobrosabokja.gemology.datagen.loot;

import net.dobrosabokja.gemology.blocks.ModBlocks;
import net.dobrosabokja.gemology.items.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.GARNET_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_GARNET_BLOCK.get());

        this.add(ModBlocks.GARNET_ORE.get(),
                block -> createOreDrop(
                        ModBlocks.GARNET_ORE.get(),
                        ModItems.RAW_GARNET.get()
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
