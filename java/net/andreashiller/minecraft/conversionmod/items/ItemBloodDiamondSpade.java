package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemBloodDiamondSpade extends ItemSpade {

	public ItemBloodDiamondSpade(ToolMaterial material) {
		super(material);
		setCreativeTab(ConversionMod.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamondSpade");
		setTextureName(ConversionMod.MODID+":itemblooddiamondspade");
		canRepair = true;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1, ItemStack par2)
    {
        return ItemHandler.itemBloodDiamond == par2.getItem() ? true : super.getIsRepairable(par1, par2);
    }
	
}
