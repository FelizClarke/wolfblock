package fcaz.wolfblock;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelRotatable;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.util.ModelEntrypoint;

public class WolfBlockModel implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
dispatcher.addDispatch(new BlockModelStandard<>(Main.wolfBlockWild)
	.setTex(0, "wolfblock:block/top", Side.TOP)
	.setTex(0, "wolfblock:block/bottom", Side.BOTTOM)
	.setTex(0, "wolfblock:block/right", Side.EAST)
	.setTex(0, "wolfblock:block/left", Side.WEST)
	.setTex(0, "wolfblock:block/front_wild", Side.NORTH)
	.setTex(0, "wolfblock:block/back", Side.SOUTH)
);
dispatcher.addDispatch(new BlockModelStandard<>(Main.wolfBlockTame)
	.setTex(0, "wolfblock:block/top", Side.TOP)
	.setTex(0, "wolfblock:block/bottom", Side.BOTTOM)
	.setTex(0, "wolfblock:block/right", Side.EAST)
	.setTex(0, "wolfblock:block/left", Side.WEST)
	.setTex(0, "wolfblock:block/front_tamed", Side.NORTH)
	.setTex(0, "wolfblock:block/back", Side.SOUTH)
);
dispatcher.addDispatch(new BlockModelStandard<>(Main.wolfBlockAngry)
	.setTex(0, "wolfblock:block/top_angry", Side.TOP)
	.setTex(0, "wolfblock:block/bottom_angry", Side.BOTTOM)
	.setTex(0, "wolfblock:block/right_angry", Side.EAST)
	.setTex(0, "wolfblock:block/left_angry", Side.WEST)
	.setTex(0, "wolfblock:block/front_angry", Side.NORTH)
	.setTex(0, "wolfblock:block/back_angry", Side.SOUTH)
);

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
