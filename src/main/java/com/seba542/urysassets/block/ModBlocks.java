package com.seba542.urysassets.block;

import com.seba542.urysassets.UrysAssets;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block WARDROBE = registerBlock("wardrobe",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(4f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(UrysAssets.MOD_ID, name), block);  // Use Identifier.of here
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(UrysAssets.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));  // Use Identifier.of here as well
    }

    public static void registerModBlocks() {
        UrysAssets.LOGGER.info("Registering Mod Blocks for " + UrysAssets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.WARDROBE);
        });
    }
}
