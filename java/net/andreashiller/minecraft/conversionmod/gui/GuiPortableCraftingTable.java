package net.andreashiller.minecraft.conversionmod.gui;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.container.ContainerPortableCraftingTable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GuiPortableCraftingTable extends GuiContainer{

	private ResourceLocation texture = new ResourceLocation(ConversionMod.MODID+":"+"textures/gui/container/portable_crafting_table.png");
	
	public GuiPortableCraftingTable(EntityPlayer player) {
		
		//, World world, int x, int y, int z
		
		super(new ContainerPortableCraftingTable(player));

		//, world, x, y, z
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		this.fontRendererObj.drawString(I18n.format("container.pcrafting", new Object[0]), 28, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_,int p_146976_2_, int p_146976_3_) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}
