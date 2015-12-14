package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPortableCraftingTable extends Item {
	
	public ItemPortableCraftingTable() {
		setCreativeTab(ConversionMod.tabConversionBall);
		setUnlocalizedName("ItemPortableCraftingTable");
		setTextureName(ConversionMod.MODID+":itemportablecraftingtable");
		setMaxStackSize(1);
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
		if(!player.isSneaking()) {
			player.openGui(ConversionMod.instance, ConversionMod.guiIDPortableCraftingTable, world, 0, 0, 0);
			return stack;
		} else {
			return null;
		}
    }
}