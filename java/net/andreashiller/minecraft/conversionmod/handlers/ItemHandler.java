package net.andreashiller.minecraft.conversionmod.handlers;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.items.ItemBloodDiamond;
import net.andreashiller.minecraft.conversionmod.items.ItemBloodDiamondArmor;
import net.andreashiller.minecraft.conversionmod.items.ItemBloodDiamondAxe;
import net.andreashiller.minecraft.conversionmod.items.ItemBloodDiamondDust;
import net.andreashiller.minecraft.conversionmod.items.ItemBloodDiamondHoe;
import net.andreashiller.minecraft.conversionmod.items.ItemBloodDiamondIngot;
import net.andreashiller.minecraft.conversionmod.items.ItemBloodDiamondPickAxe;
import net.andreashiller.minecraft.conversionmod.items.ItemBloodDiamondSpade;
import net.andreashiller.minecraft.conversionmod.items.ItemBloodDiamondSword;
import net.andreashiller.minecraft.conversionmod.items.ItemConversionBall;
import net.andreashiller.minecraft.conversionmod.items.ItemConversionWand;
import net.andreashiller.minecraft.conversionmod.items.ItemPortableCraftingTable;
import net.andreashiller.minecraft.conversionmod.items.ItemRedCoal;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {

	// -- DECLARATION ITEMS -------------------------------------------------------------------------------------------------	
	
	public static Item itemBloodDiamond;
	public static Item itemConversionBall;
	public static Item itemConversionWand;
	public static Item itemBloodDiamondAxe;
	public static Item itemBloodDiamondPickAxe;
	public static Item itemBloodDiamondSpade;
	public static Item itemBloodDiamondHoe;
	public static Item itemBloodDiamondSword;
	public static Item itemBloodDiamondHelmet;
	public static Item itemBloodDiamondChestplate;
	public static Item itemBloodDiamondLeggings;
	public static Item itemBloodDiamondBoots;
	public static Item itemRedCoal;
	public static Item itemBloodDiamondIngot;
	public static Item itemBloodDiamondDust;
	public static Item itemSmallBag;
	public static Item itemMediumBag;
	public static Item itemBigBag;
	public static Item itemPortableCraftingTable;
	public static Item itemElectricConversionWand;
		
	// Create new Items
	public static void createNewItems() {
		itemBloodDiamond = new ItemBloodDiamond();
		itemConversionBall = new ItemConversionBall();
		itemConversionWand = new ItemConversionWand();
		itemBloodDiamondAxe = new ItemBloodDiamondAxe(ConversionMod.BloodDiamondToolMaterial);
		itemBloodDiamondPickAxe = new ItemBloodDiamondPickAxe(ConversionMod.BloodDiamondToolMaterial);
		itemBloodDiamondSpade = new ItemBloodDiamondSpade(ConversionMod.BloodDiamondToolMaterial);
		itemBloodDiamondHoe = new ItemBloodDiamondHoe(ConversionMod.BloodDiamondToolMaterial);
		itemBloodDiamondSword = new ItemBloodDiamondSword(ConversionMod.BloodDiamondToolMaterial);
		itemBloodDiamondHelmet = new ItemBloodDiamondArmor(ConversionMod.BloodDiamondArmorMaterial, ConversionMod.helmetID, 0).setUnlocalizedName("ItemBloodDiamondHelmet");
		itemBloodDiamondChestplate = new ItemBloodDiamondArmor(ConversionMod.BloodDiamondArmorMaterial, ConversionMod.chestplateID, 1).setUnlocalizedName("ItemBloodDiamondChestplate");
		itemBloodDiamondLeggings = new ItemBloodDiamondArmor(ConversionMod.BloodDiamondArmorMaterial, ConversionMod.leggingsID, 2).setUnlocalizedName("ItemBloodDiamondLeggings");
		itemBloodDiamondBoots = new ItemBloodDiamondArmor(ConversionMod.BloodDiamondArmorMaterial, ConversionMod.bootsID, 3).setUnlocalizedName("ItemBloodDiamondBoots");
		itemRedCoal = new ItemRedCoal();
		itemBloodDiamondIngot = new ItemBloodDiamondIngot();
		if(ConversionMod.isIndustrialCraftInstalled()) {
			itemBloodDiamondDust = new ItemBloodDiamondDust();
		}
		itemPortableCraftingTable = new ItemPortableCraftingTable();
		
	}	
	
	// Register Items
	public static void registerNewItems() {
		GameRegistry.registerItem(itemBloodDiamond, "ItemBloodDiamond");
		GameRegistry.registerItem(itemConversionBall, "ItemConversionBall");
		GameRegistry.registerItem(itemConversionWand, "ItemConversionWand");
		GameRegistry.registerItem(itemBloodDiamondAxe, "ItemBloodDiamondAxe");
		GameRegistry.registerItem(itemBloodDiamondPickAxe, "ItemBloodDiamondPickAxe");
		GameRegistry.registerItem(itemBloodDiamondSpade, "ItemBloodDiamondSpade");
		GameRegistry.registerItem(itemBloodDiamondHoe,"ItemBloodDiamondHoe");
		GameRegistry.registerItem(itemBloodDiamondSword, "ItemBloodDiamondSword");
		GameRegistry.registerItem(itemBloodDiamondHelmet, "ItemBloodDiamondHelment");
		GameRegistry.registerItem(itemBloodDiamondChestplate, "ItemBloodDiamondChestplate");
		GameRegistry.registerItem(itemBloodDiamondLeggings, "ItemBloodDiamondLeggings");
		GameRegistry.registerItem(itemBloodDiamondBoots, "ItemBloodDiamondBoots");
		GameRegistry.registerItem(itemRedCoal, "ItemRedCoal");
		GameRegistry.registerItem(itemBloodDiamondIngot, "ItemBloodDiamondIngot");
		if(ConversionMod.isIndustrialCraftInstalled()) {
			GameRegistry.registerItem(itemBloodDiamondDust, "ItemBloodDiamondDust");
		}
		GameRegistry.registerItem(itemPortableCraftingTable, "ItemPortableCraftingTable");
	}
	
}