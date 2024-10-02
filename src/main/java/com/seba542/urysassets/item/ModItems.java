package com.seba542.urysassets.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.seba542.urysassets.UrysAssets;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WARDROBE = registerItem("wardrobe", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(UrysAssets.MOD_ID, name), item);
    }

    public static void registerModItems() {
        UrysAssets.LOGGER.info("Registering Mod Items for " + UrysAssets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(WARDROBE);
        });
    }
}