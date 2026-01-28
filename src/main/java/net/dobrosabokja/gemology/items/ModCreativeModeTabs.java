package net.dobrosabokja.gemology.items;

import net.dobrosabokja.gemology.Gemology;
import net.dobrosabokja.gemology.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gemology.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GEMOLOGY_TAB = CREATIVE_MODE_TABS.register("gemology_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.gemology_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GARNET.get());
                        output.accept(ModBlocks.GARNET_BLOCK.get());
                    }))
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
