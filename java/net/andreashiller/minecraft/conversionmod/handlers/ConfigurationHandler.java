package net.andreashiller.minecraft.conversionmod.handlers;

import java.io.File;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static boolean CWCraftable;
	public static boolean CBCraftable;
	public static boolean CBRepairable;
	public static boolean CWRepairable;
	public static boolean ShowWelcomeMessage;
	public static boolean EnableBlockFilter;
	
	public static Configuration config;
	
	public static void init(File configFile) {
		if(config == null) {
			config = new Configuration(configFile);
			config.load();
			CWCraftable = config.get(Configuration.CATEGORY_GENERAL, "IsConverionWandCraftable", true, "If the Conversion Wand should be craftable set this value to true, if not set this value to false.\nDefault: true").getBoolean();
			CBCraftable = config.get(Configuration.CATEGORY_GENERAL, "IsConversionBallCraftable", true, "If the Conversion Ball should be craftable set this value to true, if not set this value to false.\nDefault: true").getBoolean();
			CWRepairable = config.get(Configuration.CATEGORY_GENERAL, "IsConversionWandRepairable", true, "If the Conversion Wand should be repairable set this value to true, if not set this value to false.\nDefault: true").getBoolean();
			CBRepairable = config.get(Configuration.CATEGORY_GENERAL, "IsConversionBallRepairable", true, "If the Conversion Ball should be repairable set this value to true, if not set this value to false.\nDefault: true").getBoolean();
			ShowWelcomeMessage = config.get(Configuration.CATEGORY_GENERAL,"ShowWelcomeMessage", true, "If this option is true every time you logged in to Minecraft a welcome message is showing.").getBoolean();
			EnableBlockFilter = config.get(Configuration.CATEGORY_GENERAL, "EnableBlockFilter", true, "If this option is false all Blocks can be used for replacing Blocks.\nDefault: true").getBoolean();
			config.save();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if(event.modID.equalsIgnoreCase(ConversionMod.MODID)) {
			loadConfiguration();
		}
	}
	
	public void loadConfiguration() {
		//config.load();
		CWCraftable = config.get(Configuration.CATEGORY_GENERAL, "IsConverionWandCraftable", true, "If the Conversion Wand should be craftable set this value to true, if not set this value to false.\nDefault: true").getBoolean();
		CBCraftable = config.get(Configuration.CATEGORY_GENERAL, "IsConversionBallCraftable", true, "If the Conversion Ball should be craftable set this value to true, if not set this value to false.\nDefault: true").getBoolean();
		CWRepairable = config.get(Configuration.CATEGORY_GENERAL, "IsConversionWandRepairable", true, "If the Conversion Wand should be repairable set this value to true, if not set this value to false.\nDefault: true").getBoolean();
		CBRepairable = config.get(Configuration.CATEGORY_GENERAL, "IsConversionBallRepairable", true, "If the Conversion Ball should be repairable set this value to true, if not set this value to false.\nDefault: true").getBoolean();
		ShowWelcomeMessage = config.get(Configuration.CATEGORY_GENERAL,"ShowWelcomeMessage", true, "If this option is true every time you logged in to Minecraft a welcome message is showing.").getBoolean();
		EnableBlockFilter = config.get(Configuration.CATEGORY_GENERAL, "EnableBlockFilter", true, "If this option is false all Blocks can be used for replacing Blocks.\nDefault: true").getBoolean();
	
		if (config.hasChanged()) {
			config.save();
		}
	}
	
}
