package net.andreashiller.minecraft.conversionmod.items;


import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemBloodDiamondAxe extends ItemAxe {

	public ItemBloodDiamondAxe(ToolMaterial material) {
		super(material);

		setCreativeTab(ConversionMod.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamondAxe");
		setTextureName(ConversionMod.MODID+":itemblooddiamondaxe");
		canRepair = true;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1, ItemStack par2)
    {
        return ItemHandler.itemBloodDiamond == par2.getItem() ? true : super.getIsRepairable(par1, par2);
    }

}
