package net.andreashiller.minecraft.conversionmod.blocks;

import java.util.Random;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockXPNetherRack extends Block {

	public BlockXPNetherRack(Material material) {
		super(material);
		setCreativeTab(ConversionMod.tabConversionBall);
		setBlockName("BlockXPNetherRack");
		setBlockTextureName("minecraft:netherrack");
		setHarvestLevel("pickaxe", 0);
		setHardness(2.0F);
		setResistance(2.0F);
		setStepSound(soundTypeStone);
	}
	
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 2);
	}
	
	public Item getItemDropped(int i, Random par2Random, int j) {
		return Item.getItemFromBlock(Blocks.netherrack);
	}

}
