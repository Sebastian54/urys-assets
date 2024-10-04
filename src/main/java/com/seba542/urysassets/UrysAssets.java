package com.seba542.urysassets;

import com.seba542.urysassets.block.ModBlocks;
import com.seba542.urysassets.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UrysAssets implements ModInitializer {
	public static final String MOD_ID = "urys-assets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}