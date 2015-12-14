package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.minecraft.item.Item;

public class ItemBloodDiamondDust extends Item {
	public ItemBloodDiamondDust() {
		setCreativeTab(ConversionMod.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamondDust");
		setTextureName(ConversionMod.MODID+":itemblooddiamonddust");
		setMaxStackSize(64);
	}
}
