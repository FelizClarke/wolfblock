package fcaz.wolfblock;

import fcaz.wolfblock.Blocks.BlockBuilder.WolfBlocks;
import fcaz.wolfblock.Blocks.Model.BlockModelWolf;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

public class WolfBlockModel implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		ModelHelper.setBlockModel(WolfBlocks.wolfBlockWild, () ->{
			BlockModelWolf model = new BlockModelWolf(WolfBlocks.wolfBlockWild, "wolfBlockWild");
			return model;
		});
		ModelHelper.setBlockModel(WolfBlocks.wolfBlockTame, () ->{
			BlockModelWolf model = new BlockModelWolf(WolfBlocks.wolfBlockTame, "wolfBlockTame");
			return model;
		});
		ModelHelper.setBlockModel(WolfBlocks.wolfBlockAngry, () ->{
			BlockModelWolf model = new BlockModelWolf(WolfBlocks.wolfBlockAngry, "wolfBlockAngry");
			return model;
		});
	}

	@Override
	public void initItemModels(ItemModelDispatcher itemModelDispatcher) {

	}

	@Override
	public void initEntityModels(EntityRenderDispatcher entityRenderDispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher tileEntityRenderDispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher blockColorDispatcher) {

	}
}
