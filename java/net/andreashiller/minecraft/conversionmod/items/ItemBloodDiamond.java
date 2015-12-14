package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.minecraft.item.Item;

public class ItemBloodDiamond extends Item {
	public ItemBloodDiamond() {
		setCreativeTab(ConversionMod.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamond");
		setTextureName(ConversionMod.MODID+":itemblooddiamond");
		setMaxStackSize(64);
	}
	
}
