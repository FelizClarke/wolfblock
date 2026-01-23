package fcaz.wolfblock;

import fcaz.wolfblock.Blocks.BlockBuilder.WolfBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeRegistry;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;

import static fcaz.wolfblock.Main.MOD_ID;

public class WolfBlockRecipes extends RecipeRegistry {

	public static void InitRecipes() {
		RecipeBuilder.Shaped(MOD_ID, "SSS", "SPS", "SDS")
			.addInput('S', Items.STRING)
			.addInput('P', Items.FOOD_PORKCHOP_RAW)
			.addInput('D', Items.DUST_REDSTONE)
			.create("wolfblock.wild", new ItemStack(WolfBlocks.wolfBlockWild, 1));
		RecipeBuilder.Shaped(MOD_ID, "C", "W")
			.addInput('C', Items.CLOTH)
			.addInput('W', WolfBlocks.wolfBlockWild)
			.create("wolfblock.tame", new ItemStack(WolfBlocks.wolfBlockTame, 1));
		RecipeBuilder.Shaped(MOD_ID, "F", "W")
			.addInput('F', Items.TOOL_FIRESTRIKER_IRON)
			.addInput('W', WolfBlocks.wolfBlockWild)
			.create("wolfblock.angry", new ItemStack(WolfBlocks.wolfBlockAngry, 1));
		RecipeBuilder.Shaped(MOD_ID, "F", "W")
			.addInput('F', Items.TOOL_FIRESTRIKER_STEEL)
			.addInput('W', WolfBlocks.wolfBlockWild)
			.create("wolfblock.angry", new ItemStack(WolfBlocks.wolfBlockAngry, 1));
		RecipeBuilder.Shaped(MOD_ID, "F", "W")
			.addInput('F', Items.TOOL_FIRESTRIKER_IRON)
			.addInput('W', WolfBlocks.wolfBlockTame)
			.create("wolfblock.angry", new ItemStack(WolfBlocks.wolfBlockAngry, 1));
		RecipeBuilder.Shaped(MOD_ID, "F", "W")
			.addInput('F', Items.TOOL_FIRESTRIKER_STEEL)
			.addInput('W', WolfBlocks.wolfBlockTame)
			.create("wolfblock.angry", new ItemStack(WolfBlocks.wolfBlockAngry, 1));
		RecipeBuilder.Shaped(MOD_ID, "B", "W")
			.addInput('B', Items.BUCKET_WATER)
			.addInput('W', WolfBlocks.wolfBlockAngry)
			.create("wolfblock.wild", new ItemStack(WolfBlocks.wolfBlockWild, 1));
	}

	public static void InitNameSpace(String modId) {
		RecipeNamespace WOLFBLOCK = new RecipeNamespace();

		final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH =
			new RecipeGroup<>(
				new RecipeSymbol(
					new ItemStack(Blocks.WORKBENCH)
				)
			);

		WOLFBLOCK.register("workbench", WORKBENCH);

		Registries.RECIPES.register("tile.wolfblock.wolfblock.wild", WOLFBLOCK);
		Registries.RECIPES.register("tile.wolfblock.wolfblock.tame", WOLFBLOCK);
		Registries.RECIPES.register("tile.wolfblock.wolfblock.angry", WOLFBLOCK);
	}
}
