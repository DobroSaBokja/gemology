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
        // Garnet
        this.dropSelf(ModBlocks.GARNET_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_GARNET_BLOCK.get());

        this.add(ModBlocks.GARNET_ORE.get(),
                block -> createOreDrop(
                        ModBlocks.GARNET_ORE.get(),
                        ModItems.RAW_GARNET.get()
                )
        );

        // Amber
        this.dropSelf(ModBlocks.AMBER_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_AMBER_BLOCK.get());

        this.add(ModBlocks.AMBER_ORE.get(),
                block -> createOreDrop(
                        ModBlocks.AMBER_ORE.get(),
                        ModItems.RAW_AMBER.get()
                )
        );

        this.add(ModBlocks.DEEPSLATE_AMBER_ORE.get(),
                block -> createOreDrop(
                        ModBlocks.AMBER_ORE.get(),
                        ModItems.RAW_AMBER.get()
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
