package net.andreashiller.minecraft.conversionmod;

import java.util.Random;

import net.andreashiller.minecraft.conversionmod.handlers.AchievementHandler;
import net.andreashiller.minecraft.conversionmod.handlers.BlockHandler;
import net.andreashiller.minecraft.conversionmod.handlers.CBEventListener;
import net.andreashiller.minecraft.conversionmod.handlers.ConfigurationHandler;
import net.andreashiller.minecraft.conversionmod.handlers.CraftingHandler;
import net.andreashiller.minecraft.conversionmod.handlers.DropHandler;
import net.andreashiller.minecraft.conversionmod.handlers.FuelHandler;
import net.andreashiller.minecraft.conversionmod.handlers.GuiHandler;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.andreashiller.minecraft.conversionmod.handlers.KeyBindings;
import net.andreashiller.minecraft.conversionmod.handlers.KeyInputHandler;
import net.andreashiller.minecraft.conversionmod.handlers.MainWorldGen;
import net.andreashiller.minecraft.conversionmod.handlers.RecipeHandler;
import net.andreashiller.minecraft.conversionmod.misc.TabConversionBall;
import net.andreashiller.minecraft.conversionmod.misc.Version;
import net.andreashiller.minecraft.conversionmod.proxies.ServerProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=ConversionMod.MODID, name=ConversionMod.NAME, version=ConversionMod.VERSION, guiFactory="net.andreashiller.minecraft.conversionmod.gui.InGameConfigGui")

public class ConversionMod {
	public static final String MODID = "conversionmod";
	public static final String NAME = "Conversion Mod";
	public static final String VERSION = "1.0.11";
	
	public static final int Version = 1011;
	public static Integer matrix = 0;
	
	public static Random cookAmout;
	
	@Instance(value=ConversionMod.MODID)
	public static ConversionMod instance;
	
	@SidedProxy(clientSide="net.andreashiller.minecraft.conversionmod.proxies.ClientProxy", serverSide="net.andreashiller.minecraft.conversionmod.proxies.ServerProxy")
	public static ServerProxy proxy;
	
	// DECLARE CREATIVETAB
	public static CreativeTabs tabConversionBall = new TabConversionBall(CreativeTabs.getNextID(),"TabConversionBall");
	
	// WORLDGENERATOR
	public static MainWorldGen WorldGen = new MainWorldGen();	
	
	// -- DECLARATION TOOL MATERIALS ----------------------------------------------------------------------------------------
	
	public static ToolMaterial BloodDiamondToolMaterial = EnumHelper.addToolMaterial("BloodDiamondToolMaterial", 3, 3000, 10F, 8F, 30);
			
	// -- DECLARATION ARMOR MATERIAL ----------------------------------------------------------------------------------------
		
	public static ArmorMaterial BloodDiamondArmorMaterial = EnumHelper.addArmorMaterial("BloodDiamondArmorMaterial", 70, new int[]{3, 10, 9, 6}, 30);
		
	// -- DECLARATION ARMOR ID's --------------------------------------------------------------------------------------------
	
	public static int helmetID;
	public static int chestplateID;
	public static int leggingsID;
	public static int bootsID;
	
	public static final int guiIDPortableCraftingTable = 1;
	public static final int guiIDConversionWandSettings = 2;
	
	public static Configuration config;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		ItemHandler.createNewItems();
		BlockHandler.createNewBlocks();
		FMLCommonHandler.instance().bus().register(new KeyInputHandler());
		ConfigurationHandler configListener= new ConfigurationHandler();
		FMLCommonHandler.instance().bus().register(configListener);
		KeyBindings.init();
	}
	
	@EventHandler 
	public void Init(FMLInitializationEvent event) {
		
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		MinecraftForge.EVENT_BUS.register(new DropHandler());
		GameRegistry.registerFuelHandler(new FuelHandler());
		GameRegistry.registerWorldGenerator(WorldGen, 1);
		CBEventListener eventListener = new CBEventListener();
		FMLCommonHandler.instance().bus().register(eventListener);
		ItemHandler.registerNewItems();
		BlockHandler.registerNewBlocks();
		RecipeHandler.registerShaplessRecipes();
		RecipeHandler.registerShapedRecipes();
		RecipeHandler.registerSpecialRecipes();
		RecipeHandler.registerSmeltingRecipes();
		RecipeHandler.registerOres();
		if (isIndustrialCraftInstalled()) {
			RecipeHandler.registerMaceratorRecipes();
		}
		AchievementHandler.registerAchievements();
		
		new GuiHandler();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		new Version();
	}
	
	public static boolean isIndustrialCraftInstalled() {
		if(Loader.isModLoaded("IC2")) {
			return true;
		} else {
			return false;
		}
	}
}