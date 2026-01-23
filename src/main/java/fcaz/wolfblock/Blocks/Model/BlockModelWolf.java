package fcaz.wolfblock.Blocks.Model;

//Stolen piston model which was stolen by WigglyMiggly a.k.a fringus! a.k.a frigub. :3

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.*;

@Environment(EnvType.CLIENT)
public class BlockModelWolf<T extends BlockLogic> extends BlockModelStandard<T> {
	protected IconCoordinate[] texCoords = new IconCoordinate[6];
	public static final int[] orientationLookUp = new int[]{0, 1, 3, 2, 4, 5, 0, 1, 3, 2, 4, 5, 0, 1, 2, 3, 5, 4, 0, 1, 3, 2, 4, 5, 0, 1, 4, 5, 2, 3, 0, 1, 5, 4, 3, 2};

	public BlockModelWolf(Block<T> block, String type) {
		super(block);
		texCoords[0] = TextureRegistry.getTexture("wolfblock:block/"+type+"/bottom");
		texCoords[1] = TextureRegistry.getTexture("wolfblock:block/"+type+"/top");
		texCoords[2] = TextureRegistry.getTexture("wolfblock:block/"+type+"/front");
		texCoords[3] = TextureRegistry.getTexture("wolfblock:block/"+type+"/back");
		texCoords[4] = TextureRegistry.getTexture("wolfblock:block/"+type+"/left");
		texCoords[5] = TextureRegistry.getTexture("wolfblock:block/"+type+"/right");
	}

	public boolean render(Tessellator tessellator, int x, int y, int z) {
		int meta = renderBlocks.blockAccess.getBlockMetadata(x, y, z);
		switch (meta) {
			case 1:
				renderBlocks.uvRotateSouth = 3;
				renderBlocks.uvRotateNorth = 3;
				renderBlocks.uvRotateWest = 3;
				renderBlocks.uvRotateEast = 3;
				break;
			case 2:
				renderBlocks.uvRotateTop = 3;
				renderBlocks.uvRotateBottom = 3;
				renderBlocks.uvRotateNorth = 1;
				renderBlocks.uvRotateSouth = 2;
				break;
			case 3:
				renderBlocks.uvRotateSouth = 1;
				renderBlocks.uvRotateNorth = 2;
				break;
			case 4:
				renderBlocks.uvRotateTop = 1;
				renderBlocks.uvRotateBottom = 2;
				renderBlocks.uvRotateWest = 1;
				renderBlocks.uvRotateEast = 2;
				break;
			case 5:
				renderBlocks.uvRotateTop=2;
				renderBlocks.uvRotateBottom = 1;
				renderBlocks.uvRotateWest = 2;
				renderBlocks.uvRotateEast = 1;
				break;
			default:
				break;
		}
		boolean result = super.render(tessellator, x, y, z);
		this.resetRenderBlocks();
		return true;
	}

	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		int meta = (data * 6) + side.getId();
		int sideLookup = orientationLookUp[meta];
		return texCoords[sideLookup];
	}
}
