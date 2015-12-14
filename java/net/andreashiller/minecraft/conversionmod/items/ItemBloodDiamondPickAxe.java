package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemBloodDiamondPickAxe extends ItemPickaxe {

	public ItemBloodDiamondPickAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(ConversionMod.tabConversionBall);
		setUnlocalizedName("ItemBloodDiamondPickAxe");
		setTextureName(ConversionMod.MODID+":itemblooddiamondpickaxe");
		canRepair = true;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1, ItemStack par2)
    {
        return ItemHandler.itemBloodDiamond == par2.getItem() ? true : super.getIsRepairable(par1, par2);
    }

}
