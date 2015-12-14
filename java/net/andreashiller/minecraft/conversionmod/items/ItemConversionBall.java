package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.handlers.ConfigurationHandler;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemConversionBall extends Item {
	public ItemConversionBall() {
		setCreativeTab(ConversionMod.tabConversionBall);
		setUnlocalizedName("ItemConversionBall");
		setTextureName(ConversionMod.MODID+":itemconversionball");
		setMaxStackSize(1);
		setMaxDamage(1999);
		if(ConfigurationHandler.CBRepairable == true) {
			canRepair = true;
		} else {
			canRepair = false;
		}
	}
	
	//@Override
	public boolean getIsRepairable(ItemStack par1, ItemStack par2)
    {
		if(ConfigurationHandler.CBRepairable == true) {
        	return ItemHandler.itemBloodDiamond == par2.getItem() ? true : super.getIsRepairable(par1, par2);
		} else {
			return ItemHandler.itemBloodDiamond == par2.getItem() ? false : super.getIsRepairable(par1, par2);
		}
    }
}
