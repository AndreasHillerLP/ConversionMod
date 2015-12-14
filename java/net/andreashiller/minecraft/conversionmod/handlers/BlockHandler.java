package net.andreashiller.minecraft.conversionmod.handlers;

import net.andreashiller.minecraft.conversionmod.blocks.BlockBloodDiamondHalfSlab;
import net.andreashiller.minecraft.conversionmod.blocks.BlockBloodDiamondOre;
import net.andreashiller.minecraft.conversionmod.blocks.BlockBloodDiamondSolid;
import net.andreashiller.minecraft.conversionmod.blocks.BlockBloodDiamondStairs;
import net.andreashiller.minecraft.conversionmod.blocks.BlockNetherBloodDiamond;
import net.andreashiller.minecraft.conversionmod.blocks.BlockNetherRedCoal;
import net.andreashiller.minecraft.conversionmod.blocks.BlockRedCoal;
import net.andreashiller.minecraft.conversionmod.blocks.BlockXPNetherRack;
import net.andreashiller.minecraft.conversionmod.blocks.BlockXPStone;
import net.andreashiller.minecraft.conversionmod.items.ItemBloodDiamondSlab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHandler {
	
	// -- DECLARATION BLOCKS ------------------------------------------------------------------------------------------------
	public static Block blockBloodDiamondOre;
	public static Block blockBloodDiamondSolid;
	public static Block blockBloodDiamondStairs;
	public static Block blockBloodDiamondHalfSlab;
	public static Block blockBloodDiamondDoubleSlab;
	public static Block blockRedCoal;
	public static Block blockXPStone;
	public static Block blockXPNetherRack;
	public static Block blockNetherRedCoal;
	public static Block blockNetherBloodDiamond;
	
	// Create new Blocks
	public static void createNewBlocks() {
		blockBloodDiamondOre = new BlockBloodDiamondOre(Material.rock);
		blockBloodDiamondSolid = new BlockBloodDiamondSolid(Material.rock);
		blockBloodDiamondStairs = new BlockBloodDiamondStairs(blockBloodDiamondSolid);
		blockBloodDiamondHalfSlab = new BlockBloodDiamondHalfSlab(false, Material.rock);
		blockBloodDiamondDoubleSlab = new BlockBloodDiamondHalfSlab(true, Material.rock);
		blockRedCoal = new BlockRedCoal(Material.rock);
		blockXPStone = new BlockXPStone(Material.rock);
		blockXPNetherRack = new BlockXPNetherRack(Material.rock);
		blockNetherRedCoal = new BlockNetherRedCoal(Material.rock);
		blockNetherBloodDiamond = new BlockNetherBloodDiamond(Material.rock);
	}
	
	// Register Blocks
	public static void registerNewBlocks() {
		GameRegistry.registerBlock(blockBloodDiamondOre, "BlockBloodDiamondOre");
		GameRegistry.registerBlock(blockBloodDiamondSolid, "BlockBloodDiamondSolid");
		GameRegistry.registerBlock(blockBloodDiamondStairs, "BlockBloodDiamondStairs");
		GameRegistry.registerBlock(blockBloodDiamondHalfSlab, ItemBloodDiamondSlab.class, "BlockBloodDiamondHalfSlab");
		GameRegistry.registerBlock(blockBloodDiamondDoubleSlab, ItemBloodDiamondSlab.class, "BlockBloodDiamondDoubleSlab");
		GameRegistry.registerBlock(blockRedCoal, "BlockRedCoal");
		GameRegistry.registerBlock(blockXPStone, "BlockXPStone");
		GameRegistry.registerBlock(blockXPNetherRack, "BlockXPNetherRack");
		GameRegistry.registerBlock(blockNetherRedCoal, "BlockNetherRedCoal");
		GameRegistry.registerBlock(blockNetherBloodDiamond, "BlockNetherBloodDiamond");
	}
}