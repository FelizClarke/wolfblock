package fcaz.wolfblock.Blocks.BlockBuilder;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicRotatable;
import net.minecraft.core.block.material.Material;
import turniplabs.halplibe.helper.BlockBuilder;

import fcaz.wolfblock.Main;
import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;

import static fcaz.wolfblock.Main.MOD_ID;

public class WolfBlocks {
	public static Block<?> wolfBlockWild;
	public static Block<?> wolfBlockTame;
	public static Block<?> wolfBlockAngry;

	public static int itemId;
	public static int blockId;
	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","8000");
		prop.setProperty("starting_item_id","28000");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		blockId = config.getInt("starting_block_id");
		itemId = config.getInt("starting_item_id");

		config.updateConfig();
	}

	public static void blockInit() {
		wolfBlockWild =new BlockBuilder(MOD_ID)
			.setHardness(1F)
			.build("wolfblock.wild", "wolfblock_wild", blockId++, (block)-> new BlockLogicRotatable(block, Material.cloth) {});
		wolfBlockTame =new BlockBuilder(MOD_ID)
			.setHardness(1F)
			.build("wolfblock.tame", "wolfblock_tame", blockId++, (block)-> new BlockLogicRotatable(block, Material.cloth) {});
		wolfBlockAngry =new BlockBuilder(MOD_ID)
			.setHardness(1F)
			.build("wolfblock.angry", "wolfblock_angry", blockId++, (block)-> new BlockLogicRotatable(block, Material.cloth) {});
	}
}
