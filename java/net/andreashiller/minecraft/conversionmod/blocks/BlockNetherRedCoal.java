package net.andreashiller.minecraft.conversionmod.blocks;

import java.util.Random;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockNetherRedCoal extends Block {

	public BlockNetherRedCoal(Material material) {
		super(material);
		setCreativeTab(ConversionMod.tabConversionBall);
		setBlockName("BlockNetherRedCoal");
		setBlockTextureName(ConversionMod.MODID+":"+"blocknetherredcoal");
		setHarvestLevel("pickaxe", 1);
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(soundTypeStone);
	}
	
	public int quantityDropped(Random random)
    {
        return 4;
    }

	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return ItemHandler.itemRedCoal;
	}
	
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 1);
	}

}
