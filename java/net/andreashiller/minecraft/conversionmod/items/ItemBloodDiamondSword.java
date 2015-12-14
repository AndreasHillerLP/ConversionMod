package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemBloodDiamondSword extends ItemSword {

	public ItemBloodDiamondSword(ToolMaterial material) {
		super(material);
		setCreativeTab(ConversionMod.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamondSword");
		setTextureName(ConversionMod.MODID+":itemblooddiamondsword");
		canRepair = true;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1, ItemStack par2)
    {
        return ItemHandler.itemBloodDiamond == par2.getItem() ? true : super.getIsRepairable(par1, par2);
    }
	
}