package net.andreashiller.minecraft.conversionmod.gui;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.handlers.ConfigurationHandler;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class GuiInGameConfig extends GuiConfig {
	public GuiInGameConfig(GuiScreen parent) {
		super(parent,
				new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				ConversionMod.MODID,
				false,
				false,
				"Conversion Mod: V"+ConversionMod.VERSION);
				titleLine2 = ConfigurationHandler.config.getConfigFile().getAbsolutePath();
	}
	
	@Override
    public void initGui()
    {
        // You can add buttons and initialize fields here
        super.initGui();
    }

    
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        // You can do things like create animations, draw additional elements, etc. here
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        // You can process any additional buttons you may have added here
        super.actionPerformed(button);
    }
}
