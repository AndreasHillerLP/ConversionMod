package net.andreashiller.minecraft.conversionmod.misc;

import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabConversionBall extends CreativeTabs {
	public TabConversionBall(int id, String name) {
		super(id, name);
	}
	
	@Override
	public Item getTabIconItem() {
		return ItemHandler.itemConversionBall;
	}
}