package net.andreashiller.minecraft.conversionmod.items;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;



public class ItemBloodDiamondArmor extends ItemArmor {

	public ItemBloodDiamondArmor(ArmorMaterial material, int id,int placement) {
		super(material, id, placement);
		this.setCreativeTab(ConversionMod.tabConversionBall);
		
		if(placement == 0) {
			this.setTextureName(ConversionMod.MODID+":itemblooddiamondhelmet");
		}
		else if(placement == 1) {
			this.setTextureName(ConversionMod.MODID+":itemblooddiamondchestplate");
		}
		else if(placement == 2) {
			this.setTextureName(ConversionMod.MODID+":itemblooddiamondleggings");
		}
		else if(placement == 3) {
			this.setTextureName(ConversionMod.MODID+":itemblooddiamondboots");
		}
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == ItemHandler.itemBloodDiamondHelmet || stack.getItem() == ItemHandler.itemBloodDiamondChestplate || stack.getItem() == ItemHandler.itemBloodDiamondBoots) {
			return ConversionMod.MODID + ":" + "textures/models/armor/blooddiamond_layer_1.png";
		}
		if(stack.getItem() == ItemHandler.itemBloodDiamondLeggings) {
			return ConversionMod.MODID + ":" + "textures/models/armor/blooddiamond_layer_2.png";
		}
		else {
			return null;
		}
	}

}
