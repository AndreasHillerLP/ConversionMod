package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.minecraft.item.Item;

public class ItemBloodDiamondIngot extends Item {
	public ItemBloodDiamondIngot() {
		setCreativeTab(ConversionMod.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamondIngot");
		setTextureName(ConversionMod.MODID+":itemblooddiamondingot");
		setMaxStackSize(64);
	}
}
