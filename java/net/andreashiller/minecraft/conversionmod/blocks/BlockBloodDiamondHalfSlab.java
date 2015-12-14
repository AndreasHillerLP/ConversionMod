package net.andreashiller.minecraft.conversionmod.blocks;

import java.util.Random;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.handlers.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBloodDiamondHalfSlab extends BlockSlab {
	
	@SideOnly(Side.CLIENT)
	private IIcon SlabTop;
	
	@SideOnly(Side.CLIENT)
	private IIcon SlabSide;

	public BlockBloodDiamondHalfSlab(boolean fullblock, Material material) {
		super(fullblock, material);
		this.setBlockName("BlockBloodDiamondHalfSlab");
		if (!fullblock)
		{
			this.setCreativeTab(ConversionMod.tabConversionBall);
			setHarvestLevel("pickaxe", 2);
			setHardness(3.0F);
			setResistance(5.0F);
			setStepSound(Block.soundTypeStone);
		}
		else
		{
			setHarvestLevel("pickaxe", 2);
			setHardness(3.0F);
			setResistance(5.0F);
			setStepSound(Block.soundTypeStone);
		}
		
		this.setLightOpacity(0);
	}
	
	public IIcon getIcon(int side, int metadata) {
		return side == 1 ? this.SlabTop : side == 0 ? this.SlabTop : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(ConversionMod.MODID+":blockblooddiamondsolid");
		this.SlabTop = iconRegister.registerIcon(ConversionMod.MODID+":blockblooddiamondsolid");
		this.SlabSide = iconRegister.registerIcon(ConversionMod.MODID+":blockblooddiamondsolid");
	}
	
	@Override
	public Item getItemDropped(int meta, Random rand, int fortune) {
	        return Item.getItemFromBlock(BlockHandler.blockBloodDiamondHalfSlab);
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	        return this.field_150004_a ? 2 : 1;
	}

	@Override
	public String func_150002_b(int var1) {
		return super.getUnlocalizedName();
	}

}
