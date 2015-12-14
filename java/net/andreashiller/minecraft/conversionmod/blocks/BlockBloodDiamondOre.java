package net.andreashiller.minecraft.conversionmod.blocks;

import java.util.Random;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockBloodDiamondOre extends Block {

	public BlockBloodDiamondOre(Material material) {
		super(material);
		setCreativeTab(ConversionMod.tabConversionBall);
		setBlockName("BlockBloodDiamondOre");
		setStepSound(Block.soundTypeStone);
		setBlockTextureName(ConversionMod.MODID+":blockblooddiamondore");
		setHarvestLevel("pickaxe", 2);
		setHardness(3.0F);
		setResistance(5.0F);
	}
	
	public int quantityDropped(Random random)
    {
        return 1;
    }

	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return ItemHandler.itemBloodDiamond;
	}
	
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 1);
	}
}
