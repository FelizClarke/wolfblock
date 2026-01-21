package fcaz.wolfblock;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.Properties;


public class Main implements ModInitializer, GameStartEntrypoint {
	public static final String MOD_ID = "wolfblock";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
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

	public static Block<?> wolfBlockWild;
	public static Block<?> wolfBlockTame;
	public static Block<?> wolfBlockAngry;

	@Override
	public void onInitialize() {
		LOGGER.info("Wolf Block released. :3");
		wolfBlockWild =new BlockBuilder(MOD_ID)
			.setHardness(1F)
			.build("wolfblock.wild", "wolfblock_wild", blockId++, (block)-> new BlockLogic(block, Material.cloth));
		wolfBlockTame =new BlockBuilder(MOD_ID)
			.setHardness(1F)
			.build("wolfblock.tame", "wolfblock_tame", blockId++, (block)-> new BlockLogic(block, Material.cloth));
		wolfBlockAngry =new BlockBuilder(MOD_ID)
			.setHardness(1F)
			.build("wolfblock.angry", "wolfblock_angry", blockId++, (block)-> new BlockLogic(block, Material.cloth));
	}

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}
}
