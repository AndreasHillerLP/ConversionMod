package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.gui.GuiChangeMatrix;
import net.andreashiller.minecraft.conversionmod.handlers.BlockHandler;
import net.andreashiller.minecraft.conversionmod.handlers.ConfigurationHandler;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class ItemConversionWand extends Item {
	
	public static Block curBlock = Blocks.grass;
	public static int curBlockMeta = 0;
	public static int itemDamage;
	public static int itemMaxDamage;
	
	
	public ItemConversionWand() {
		setCreativeTab(ConversionMod.tabConversionBall);
		setUnlocalizedName("ItemConversionWand");
		setTextureName(ConversionMod.MODID+":itemconversionwand");
		setMaxStackSize(1);
		setMaxDamage(999);
		if(ConfigurationHandler.CWRepairable == true)  {
			canRepair = true;
		} else {
			canRepair = false;
		}
		canItemEditBlocks();
	}
	
	public boolean onItemUse(ItemStack tool,EntityPlayer player, World world, int x, int y, int z, int side, float xFloat, float yFloat, float zFloat)
	{	
		
		boolean goesNot = false;
		
		if(ConfigurationHandler.EnableBlockFilter == true) {
			for(int c = 1; c < 101; c++) {
				switch(c) {
					case 1: if(world.getBlock(x, y, z).hasTileEntity()){goesNot=true;} break;
					case 2: if(world.getBlock(x, y, z).getUnlocalizedName().contains("ore")){goesNot=true;} break;
					case 3: if(world.getBlock(x, y, z).getUnlocalizedName().contains("Ore")){goesNot=true;} break;
					case 4: if(world.getBlock(x, y, z).equals(Blocks.crafting_table)){goesNot=true;} break;
					case 5: if(world.getBlock(x, y, z).equals(Blocks.anvil)){goesNot=true;} break;
					case 6: if(world.getBlock(x, y, z).equals(Blocks.bedrock)){goesNot=true;} break;
					case 7: if(world.getBlock(x, y, z).equals(Blocks.redstone_block)){goesNot=true;} break;
					case 8: if(world.getBlock(x, y, z).equals(Blocks.redstone_wire)){goesNot=true;} break;
					case 9: if(world.getBlock(x, y, z).equals(Blocks.redstone_torch)){goesNot=true;} break;
					case 10: if(world.getBlock(x, y, z).equals(Blocks.torch)){goesNot=true;} break;
					case 11: if(world.getBlock(x, y, z).equals(Blocks.end_portal)){goesNot=true;} break;
					case 12: if(world.getBlock(x, y, z).equals(Blocks.end_portal_frame)){goesNot=true;} break;
					case 13: if(world.getBlock(x, y, z).equals(Blocks.rail)){goesNot=true;} break;
					case 14: if(world.getBlock(x, y, z).equals(Blocks.detector_rail)){goesNot=true;} break;
					case 15: if(world.getBlock(x, y, z).equals(Blocks.activator_rail)){goesNot=true;} break;
					case 16: if(world.getBlock(x, y, z).equals(Blocks.golden_rail)){goesNot=true;} break;
					case 17: if(world.getBlock(x, y, z).equals(BlockHandler.blockRedCoal)){goesNot=true;} break;
					case 18: if(world.getBlock(x, y, z).equals(BlockHandler.blockXPStone)){goesNot=true;} break;
					case 19: if(world.getBlock(x, y, z).equals(Blocks.emerald_block)){goesNot=true;} break;
					case 20: if(world.getBlock(x, y, z).equals(Blocks.diamond_block)){goesNot=true;} break;
					case 21: if(world.getBlock(x, y, z).equals(Blocks.gold_block)){goesNot=true;} break;
					case 22: if(world.getBlock(x, y, z).equals(Blocks.iron_block)){goesNot=true;} break;
					case 23: if(world.getBlock(x, y, z).equals(Blocks.redstone_lamp)){goesNot=true;} break;
					case 24: if(world.getBlock(x, y, z).equals(BlockHandler.blockNetherBloodDiamond)){goesNot=true;} break;
					case 25: if(world.getBlock(x, y, z).equals(BlockHandler.blockNetherRedCoal)){goesNot=true;} break;
					case 26: if(world.getBlock(x, y, z).equals(BlockHandler.blockXPNetherRack)){goesNot=true;} break;
					case 27: if(world.getBlock(x, y, z).equals(Blocks.coal_block)){goesNot=true;} break;
					case 28: if(world.getBlock(x, y, z).equals(Blocks.quartz_ore)){goesNot=true;} break;
					case 29: if(world.getBlock(x, y, z).equals(Blocks.wooden_door)){goesNot=true;} break;
					case 30: if(world.getBlock(x, y, z).equals(Blocks.iron_door)){goesNot=true;} break;
					default: goesNot=false; break;
				}
			
				if(goesNot == true) {
					break;
				}
			}
		}
		
		if(goesNot == false && !world.isRemote)
		{
		if (player.isSneaking() && !world.isRemote)
		{
				curBlock = world.getBlock(x, y, z);
				curBlockMeta = world.getBlockMetadata(x, y, z);
				player.addChatMessage(new ChatComponentText("Selected Block: "+curBlock.getLocalizedName()));
		} 
		else
		{
			if (!player.canPlayerEdit(x, y, z, side, tool))
			{
				return false;
			}
			else
			{  
				if(tool.getItemDamage() < tool.getMaxDamage())
				{
						if (ConversionMod.matrix == 0) {
							world.setBlock(x, y, z, curBlock, curBlockMeta, side);
							world.markBlockForUpdate(x, y, z);
							this.setDamage(tool, tool.getItemDamage()+1);
						} else if (ConversionMod.matrix == 1) {
							for(int a=x-1; a<x+2; a++) {
								for(int b=z-1; b<z+2; b++) {
									world.setBlock(a, y, b, curBlock, curBlockMeta, side);
									world.markBlockForUpdate(a, y, b);
									this.setDamage(tool, tool.getItemDamage()+1);
								}
							}
						} else if (ConversionMod.matrix == 2) {
							for(int a=x-2; a<x+3; a++) {
								for(int b=z-2; b<z+3; b++) {
									world.setBlock(a, y, b, curBlock, curBlockMeta, side);
									world.markBlockForUpdate(a, y, b);
									this.setDamage(tool, tool.getItemDamage()+1);
								}
							}
						} else if (ConversionMod.matrix == 3) {
							for(int a=x-3; a<x+4; a++) {
								for(int b=z-3; b<z+4; b++) {
									world.setBlock(a, y, b, curBlock, curBlockMeta, side);
									world.markBlockForUpdate(a, y, b);
									this.setDamage(tool, tool.getItemDamage()+1);
								}
							}
						} else if (ConversionMod.matrix == 4) {
							for(int a=x-4; a<x+5; a++) {
								for(int b=z-4; b<z+5; b++) {
									world.setBlock(a, y, b, curBlock, curBlockMeta, side);
									world.markBlockForUpdate(a, y, b);
									this.setDamage(tool, tool.getItemDamage()+1);
								}
							}
						} else {
							System.out.println("There was an error");
						}
				}
				else
				{
					if(!world.isRemote)
					{
						player.addChatMessage(new ChatComponentText("The Conversion Wand is damaged. Please repair it with Red Coal in an anvil!"));
					}
				}
				
			}
		}
		} else {
			if(!world.isRemote) {
				player.addChatMessage(new ChatComponentText("The selected block can't be used for replacing Blocks!"));
			}
		}
			return true;
		}
	
	
	//@Override
	public boolean getIsRepairable(ItemStack par1, ItemStack par2)
    {
		if (ConfigurationHandler.CWRepairable == true) {
			return ItemHandler.itemBloodDiamond == par2.getItem() ? true : super.getIsRepairable(par1, par2);
		} else {
			return ItemHandler.itemBloodDiamond == par2.getItem() ? false : super.getIsRepairable(par1, par2);
		}
    }
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
		if(!player.isSneaking()) {
			player.openGui(ConversionMod.instance, ConversionMod.guiIDConversionWandSettings, world, 0, 0, 0);
			return itemstack;
		}else {
			return null;
		}
        
    }
	
	public double getDurabilityForDisplay(ItemStack stack)
    { 
		itemMaxDamage = stack.getMaxDamage();
		itemDamage = stack.getItemDamageForDisplay();
		
        return (double)stack.getItemDamageForDisplay() / (double)stack.getMaxDamage();
    }
	
	

}