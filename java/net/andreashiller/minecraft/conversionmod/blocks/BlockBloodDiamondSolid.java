package net.andreashiller.minecraft.conversionmod.blocks;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBloodDiamondSolid extends Block {

	public BlockBloodDiamondSolid(Material material) {
		super(material);
		setCreativeTab(ConversionMod.tabConversionBall);
		setBlockName("BlockBloodDiamondSolid");
		setStepSound(Block.soundTypeStone);
		setBlockTextureName(ConversionMod.MODID+":blockblooddiamondsolid");
		setHarvestLevel("pickaxe", 2);
		setHardness(3.0F);
		setResistance(5.0F);
	}

}
