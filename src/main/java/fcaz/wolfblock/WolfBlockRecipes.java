package fcaz.wolfblock;

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
import static fcaz.wolfblock.Main.wolfBlockWild;

public class WolfBlockRecipes extends RecipeRegistry {

	public static void InitRecipes() {
		RecipeBuilder.Shaped(MOD_ID, "SSS", "SPS", "SDS")
			.addInput('S', Items.STRING)
			.addInput('P', Items.FOOD_PORKCHOP_RAW)
			.addInput('D', Items.DUST_REDSTONE)
			.create("wolfblock.wild", new ItemStack(wolfBlockWild, 1));

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
	}
}
