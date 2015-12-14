package net.andreashiller.minecraft.conversionmod.handlers;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.container.ContainerConversionWand;
import net.andreashiller.minecraft.conversionmod.container.ContainerPortableCraftingTable;
import net.andreashiller.minecraft.conversionmod.gui.GuiChangeMatrix;
import net.andreashiller.minecraft.conversionmod.gui.GuiPortableCraftingTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler{

	public GuiHandler() {
		NetworkRegistry.INSTANCE.registerGuiHandler(ConversionMod.instance, this);
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) {
			default: return 0; 
			case 1: return new ContainerPortableCraftingTable(player); 
			case 2: return new ContainerConversionWand(player);
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) {
			default: return 0;
			case 1: return new GuiPortableCraftingTable(player);
			case 2: return new GuiChangeMatrix(player);
		}
	}

}
