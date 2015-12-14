package net.andreashiller.minecraft.conversionmod.handlers;

import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {

	// Smelting
	public static void registerShaplessRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.itemBloodDiamondIngot,9), BlockHandler.blockBloodDiamondSolid);
	}
	
	// Shaped Recipes
	public static void registerShapedRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(BlockHandler.blockBloodDiamondSolid,1), new Object[] {"XXX","XXX","XXX",'X',ItemHandler.itemBloodDiamondIngot});
		if (ConfigurationHandler.CBCraftable == true) {
			GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemConversionBall,1), new Object[] {"XXX","XYX","XXX",'X',ItemHandler.itemBloodDiamond,'Y',Items.diamond});
		}
		if (ConfigurationHandler.CWCraftable == true) {
			GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemConversionWand, 1), new Object[] {" Y","X ",'X',Items.stick,'Y',ItemHandler.itemConversionBall});
		}
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamondAxe,1), new Object[] {"XX","XY"," Y",'X',ItemHandler.itemBloodDiamond,'Y',Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamondPickAxe,1), new Object[] {"XXX"," Y "," Y ",'X',ItemHandler.itemBloodDiamond,'Y',Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamondSpade,1), new Object[] {"X","Y","Y",'X',ItemHandler.itemBloodDiamond,'Y',Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamondHoe,1), new Object[] {"XX"," Y"," Y",'X',ItemHandler.itemBloodDiamond,'Y',Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamondSword,1), new Object[] {"X","X","Y",'X',ItemHandler.itemBloodDiamond,'Y',Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamondHelmet,1), new Object[] {"XXX","X X",'X',ItemHandler.itemBloodDiamond});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamondChestplate,1), new Object[] {"X X","XXX","XXX",'X',ItemHandler.itemBloodDiamond});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamondLeggings,1), new Object[] {"XXX","X X","X X",'X',ItemHandler.itemBloodDiamond});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamondBoots,1), new Object[] {"X X","X X",'X',ItemHandler.itemBloodDiamond});
		GameRegistry.addShapedRecipe(new ItemStack(BlockHandler.blockBloodDiamondStairs,4), new Object[] {"X  ","XX ", "XXX", 'X', ItemHandler.itemBloodDiamondIngot});
		GameRegistry.addShapedRecipe(new ItemStack(BlockHandler.blockBloodDiamondHalfSlab ,6), new Object[] {"XXX", 'X', ItemHandler.itemBloodDiamondIngot});		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.torch,8), new Object[] {"X","#",'X',ItemHandler.itemRedCoal,'#',Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemPortableCraftingTable, 1), new Object[] {"Y","Z",'Z',Blocks.crafting_table,'Y',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE)});
	}
	
	// Special Recipes
	public static void registerSpecialRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(Items.diamond, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',ItemHandler.itemBloodDiamond});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamond, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.diamond});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamond, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',ItemHandler.itemBloodDiamondIngot});
		GameRegistry.addShapedRecipe(new ItemStack(ItemHandler.itemBloodDiamondIngot, 8),  new Object[] {"#X","X",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',ItemHandler.itemBloodDiamond});
		GameRegistry.addShapedRecipe(new ItemStack(Items.flint, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.cobblestone});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.cobblestone, 4),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.flint});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.gravel, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.dirt});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.dirt, 4),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.gravel});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sand, 4),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.sandstone});
        GameRegistry.addShapedRecipe(new ItemStack(Items.clay_ball, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.gravel});
        GameRegistry.addShapedRecipe(new ItemStack(Items.clay_ball, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.sandstone});
        GameRegistry.addShapedRecipe(new ItemStack(Items.clay_ball, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.flint});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.gravel, 4),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.clay_ball});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.obsidian, 1),  new Object[] {"#X ","X  ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.planks});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 2),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.obsidian});
        GameRegistry.addShapedRecipe(new ItemStack(Items.clay_ball, 4),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.clay});
        GameRegistry.addShapedRecipe(new ItemStack(Items.iron_ingot, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.obsidian});
        GameRegistry.addShapedRecipe(new ItemStack(Items.iron_ingot, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.clay});
        GameRegistry.addShapedRecipe(new ItemStack(Items.gold_ingot, 1),  new Object[] {"#XX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.iron_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(Items.iron_ingot, 8),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.gold_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(Items.diamond, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.gold_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(Items.gold_ingot, 8),  new Object[] {"#X ","X  ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.diamond});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 1),  new Object[] {"#X ","X  ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.stick});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.gold_block, 1),  new Object[] {"#XX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.iron_block});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.iron_block, 8),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.gold_block});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.gold_block, 4),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.diamond_block});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.diamond_block, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.gold_block});
        GameRegistry.addShapedRecipe(new ItemStack(Items.ender_pearl, 1),  new Object[] {"#X ","XX ","X  ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.iron_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(Items.iron_ingot, 4),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.ender_pearl});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.dirt, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.sand});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.cobblestone, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.dirt});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.grass, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.cobblestone});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sand, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.grass});
        GameRegistry.addShapedRecipe(new ItemStack(Items.melon_seeds, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.pumpkin_seeds});
        GameRegistry.addShapedRecipe(new ItemStack(Items.pumpkin_seeds, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.melon_seeds});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.melon_block, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.pumpkin});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.pumpkin, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.melon_block});
        GameRegistry.addShapedRecipe(new ItemStack(Items.reeds, 3),  new Object[] {"#X ","XX ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.paper});
        GameRegistry.addShapedRecipe(new ItemStack(Items.paper, 3),  new Object[] {"#X ","XX ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.reeds});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.gravel, 2),  new Object[] {"#XX","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.flint});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sandstone, 2),  new Object[] {"#XX","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.gravel});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.spruce_stairs, 1), new Object[] {"#X ","   ", "   ",'#', new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.oak_stairs});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.birch_stairs, 1), new Object[] {"#X ","   ", "   ",'#', new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.spruce_stairs});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.jungle_stairs, 1), new Object[] {"#X ","   ", "   ",'#', new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.birch_stairs});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.oak_stairs, 1), new Object[] {"#X ","   ", "   ",'#', new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.jungle_stairs});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.dark_oak_stairs, 1), new Object[] {"#X ","   ", "   ",'#', new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.acacia_stairs});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.acacia_stairs, 1), new Object[] {"#X ","   ", "   ",'#', new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.dark_oak_stairs});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 1,1), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.planks, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 1,2), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.planks, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 1,3), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.planks, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 1,0), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.planks, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 1,4), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.planks, 1, 5)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 1,5), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.planks, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.log, 1,1), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.log, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.log, 1,2), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.log, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.log, 1,3), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.log, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.log, 1,0), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.log, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.log2, 1,1), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.log2, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.log2, 1,0), new Object[] {"#X ","   ", "   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.log2, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wooden_slab,1,1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wooden_slab, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wooden_slab,1,2), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wooden_slab, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wooden_slab,1,3), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wooden_slab, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wooden_slab,1,0), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wooden_slab, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wooden_slab,1,4), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wooden_slab, 1, 5)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wooden_slab,1,5), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wooden_slab, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 2), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 3), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 4), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 5), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 6), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 5)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 7), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 6)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 8), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 7)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 9), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 8)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 10), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 9)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 11), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 10)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 12), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 11)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 13), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 12)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 14), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 13)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 15), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 14)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1, 0), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.wool, 1, 15)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 1, 1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stonebrick, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 1, 2), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stonebrick, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 1, 3), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stonebrick, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 1, 0), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stonebrick, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 2), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 3), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 4), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 5), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 6), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 5)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 7), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 6)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 8), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 7)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 9), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 8)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 10), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 9)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 11), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 10)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 12), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 11)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 13), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 12)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 14), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 13)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 15), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 14)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 2), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 3), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 4), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 5), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 6), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 5)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 7), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 6)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 8), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 7)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 9), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 8)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 10), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 9)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 11), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 10)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 12), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 11)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 13), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 12)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 14), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 13)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 15), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 14)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.carpet, 1, 0), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.carpet, 1, 15)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 2), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 3), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 4), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 5), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 6), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 5)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 7), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 6)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 8), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 7)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 9), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 8)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 10), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 9)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 11), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 10)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 12), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 11)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 13), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 12)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 14), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 13)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 15), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 14)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass, 1, 0), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass, 1, 15)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 2), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 3), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 4), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 5), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 6), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 5)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 7), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 6)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 8), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 7)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 9), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 8)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 10), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 9)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 11), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 10)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 12), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 11)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 13), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 12)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 14), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 13)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 15), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 14)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_glass_pane, 1, 0), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_glass_pane, 1, 15)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 2), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 3), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 4), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 5), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 6), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 5)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 7), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 6)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 8), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 7)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 9), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 8)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 10), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 9)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 11), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 10)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 12), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 11)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 13), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 12)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 14), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 13)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 15), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 14)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 0), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.stained_hardened_clay, 1, 15)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.bone, 1),  new Object[] {"#X ","XX ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Items.dye, 1, 15)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.blaze_rod, 1),  new Object[] {"#X ","X  ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Items.blaze_powder});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.cobblestone, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.stone});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sand, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.glass});
        GameRegistry.addShapedRecipe(new ItemStack(Items.glowstone_dust, 4),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.glowstone});
        GameRegistry.addShapedRecipe(new ItemStack(Items.brick, 1),  new Object[] {"#X ","   ","   ",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',Blocks.brick_block});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Blocks.cobblestone});
        GameRegistry.addShapedRecipe(new ItemStack(Items.brick, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Items.clay_ball});
        GameRegistry.addShapedRecipe(new ItemStack(Items.emerald, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Blocks.emerald_ore});
        GameRegistry.addShapedRecipe(new ItemStack(Items.cooked_fished, 7, 0),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X', new ItemStack(Items.fish, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.cooked_fished, 7, 1),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X', new ItemStack(Items.fish, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Blocks.sand});
        GameRegistry.addShapedRecipe(new ItemStack(Items.redstone, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Blocks.redstone_ore});
        GameRegistry.addShapedRecipe(new ItemStack(Items.gold_ingot, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Blocks.gold_ore});
        GameRegistry.addShapedRecipe(new ItemStack(Items.cooked_porkchop, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Items.porkchop});
        GameRegistry.addShapedRecipe(new ItemStack(Items.iron_ingot, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Blocks.iron_ore});
        GameRegistry.addShapedRecipe(new ItemStack(Items.coal, 7, 1),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',new ItemStack(Blocks.log, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.coal, 7, 1),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',new ItemStack(Blocks.log, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.coal, 7, 1),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',new ItemStack(Blocks.log, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.coal, 7, 1),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',new ItemStack(Blocks.log, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.coal, 7, 1),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',new ItemStack(Blocks.log2, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.coal, 7, 1),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',new ItemStack(Blocks.log2, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.coal, 7, 1),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Blocks.coal_ore});
        GameRegistry.addShapedRecipe(new ItemStack(Items.baked_potato, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Items.potato});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 7, 4),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Blocks.lapis_ore});
        GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 7, 2),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Blocks.cactus});
        GameRegistry.addShapedRecipe(new ItemStack(Items.cooked_chicken, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Items.chicken});
        GameRegistry.addShapedRecipe(new ItemStack(Items.diamond, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Blocks.diamond_ore});
        GameRegistry.addShapedRecipe(new ItemStack(Items.cooked_beef, 7, 4),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',Items.beef});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sandstone, 2, 1), new Object[] {"#X ", "X  ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.sandstone, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sandstone, 2, 2), new Object[] {"#X ", "X  ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.sandstone, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sandstone, 2, 0), new Object[] {"#X ", "X  ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.sandstone, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.leaves, 1, 1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.leaves, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.leaves, 1, 2), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.leaves, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.leaves, 1, 3), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.leaves, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.leaves, 1, 0), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.leaves, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.leaves2, 1, 1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.leaves2, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.leaves2, 1, 0), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.leaves2, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 1), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.sapling, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 2), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.sapling, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 3), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.sapling, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 4), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.sapling, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 5), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.sapling, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 0), new Object[] {"#X ", "   ", "   ", '#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',new ItemStack(Blocks.sapling, 1, 5)});
        
        if(ConversionMod.isIndustrialCraftInstalled()) {
        	GameRegistry.addShapedRecipe(new ItemStack(Items.iron_ingot, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',ic2.api.item.IC2Items.getItem("crushedIronOre")});
        	GameRegistry.addShapedRecipe(new ItemStack(Items.gold_ingot, 7),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',ic2.api.item.IC2Items.getItem("crushedGoldOre")});
        	GameRegistry.addShapedRecipe(new ItemStack(ic2.api.item.IC2Items.getItem("copperIngot").getItem(),7, 0),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',ic2.api.item.IC2Items.getItem("crushedCopperOre")});
        	GameRegistry.addShapedRecipe(new ItemStack(ic2.api.item.IC2Items.getItem("tinIngot").getItem(), 7, 1),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',ic2.api.item.IC2Items.getItem("crushedTinOre")});
        	GameRegistry.addShapedRecipe(new ItemStack(ic2.api.item.IC2Items.getItem("silverIngot").getItem(), 7, 6),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',ic2.api.item.IC2Items.getItem("crushedSilverOre")});
        	GameRegistry.addShapedRecipe(new ItemStack(ic2.api.item.IC2Items.getItem("leadIngot").getItem(), 7, 5),  new Object[] {"#YX","XXX","XXX",'#',new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'Y',Items.coal,'X',ic2.api.item.IC2Items.getItem("crushedLeadOre")});
        	GameRegistry.addShapedRecipe(new ItemStack(Items.coal, 1), new Object[] {"#X",'#', new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',ic2.api.item.IC2Items.getItem("coalDust")});
        	GameRegistry.addShapedRecipe(new ItemStack(Items.dye, 1, 4), new Object[] {"#X",'#', new ItemStack(ItemHandler.itemConversionBall, 1, OreDictionary.WILDCARD_VALUE),'X',ic2.api.item.IC2Items.getItem("lapiDust")});
        	GameRegistry.addShapedRecipe(new ItemStack(ic2.api.item.IC2Items.getItem("energiumDust").getItem(),9, 2), new Object[] {"X#X","#X#","X#X",'X',Items.redstone,'#',ItemHandler.itemBloodDiamondDust});
        	
        	//Small notes to me ;)
        	//GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.dirt, 1), new Object[]{"X",'X',"dustCopper"}));
        }
	}
	
	public static void registerSmeltingRecipes() {
		GameRegistry.addSmelting(BlockHandler.blockBloodDiamondOre, new ItemStack(ItemHandler.itemBloodDiamond, 4), 1F);
		GameRegistry.addSmelting(ItemHandler.itemBloodDiamond, new ItemStack(ItemHandler.itemBloodDiamondIngot, 2), 1F);
		GameRegistry.addSmelting(ItemHandler.itemBloodDiamondDust, new ItemStack(ItemHandler.itemBloodDiamondIngot, 1), 1F);
		GameRegistry.addSmelting(BlockHandler.blockRedCoal, new ItemStack(ItemHandler.itemRedCoal, 2), 1F);
	}	
	
	public static void registerOres() {
		OreDictionary.registerOre("gemBloodDiamond", ItemHandler.itemBloodDiamond);
		OreDictionary.registerOre("oreBloodDiamond", BlockHandler.blockBloodDiamondOre);
		OreDictionary.registerOre("ingotBloodDiamondIngot", ItemHandler.itemBloodDiamondIngot);
		if(ConversionMod.isIndustrialCraftInstalled()) {
			OreDictionary.registerOre("dustBloodDiamondDust", ItemHandler.itemBloodDiamondDust);
		}
	}
	
	public static void registerMaceratorRecipes() {
		if(ConversionMod.isIndustrialCraftInstalled()) {
			Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlockHandler.blockBloodDiamondOre)), null, new ItemStack(ItemHandler.itemBloodDiamond, 2));
			Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(ItemHandler.itemBloodDiamond)), null, new ItemStack(ItemHandler.itemBloodDiamondDust, 1));
			Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlockHandler.blockRedCoal)), null, new ItemStack(ItemHandler.itemRedCoal, 2));
			Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlockHandler.blockNetherRedCoal)), null, new ItemStack(ItemHandler.itemRedCoal, 4));
			Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlockHandler.blockNetherBloodDiamond)), null, new ItemStack(ItemHandler.itemBloodDiamond, 4));
		}
	}
	
}