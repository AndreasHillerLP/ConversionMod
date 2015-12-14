package net.andreashiller.minecraft.conversionmod.blocks;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockBloodDiamondStairs extends BlockStairs {

	private Block block;
	
	public BlockBloodDiamondStairs(Block block) {
		super(block, 0);
		this.block = block;
		this.setCreativeTab(ConversionMod.tabConversionBall);
		this.setBlockName("BlockBloodDiamondStairs");
		this.setBlockTextureName(ConversionMod.MODID+":blockblooddiamondsolid");
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("pickaxe", 1);
		setHardness(3.0F);
		setResistance(5.0F);
		this.useNeighborBrightness=true;
	}

}
