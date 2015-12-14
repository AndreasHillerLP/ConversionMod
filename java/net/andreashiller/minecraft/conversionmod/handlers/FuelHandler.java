package net.andreashiller.minecraft.conversionmod.handlers;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	
	@Override
	public int getBurnTime(ItemStack fuel) {
		
		System.out.println(fuel.toString());
		
		if (fuel.toString().contains("ItemRedCoal")) {
			return 3200;
		}
		
		else {
			return 0;
		}

	}
		
}
