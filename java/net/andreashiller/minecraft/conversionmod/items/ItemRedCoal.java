package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.minecraft.item.Item;

public class ItemRedCoal extends Item {
	public ItemRedCoal() {
		setCreativeTab(ConversionMod.tabConversionBall);
		this.setUnlocalizedName("ItemRedCoal");
		this.setMaxDamage(64);
		this.setTextureName(ConversionMod.MODID+":"+"itemredcoal");
	}
}
