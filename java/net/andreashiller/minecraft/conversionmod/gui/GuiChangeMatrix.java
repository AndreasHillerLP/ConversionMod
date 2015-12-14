package net.andreashiller.minecraft.conversionmod.gui;

import org.lwjgl.opengl.GL11;

import sun.java2d.pipe.DrawImage;
import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.container.ContainerConversionWand;
import net.andreashiller.minecraft.conversionmod.handlers.ItemHandler;
import net.andreashiller.minecraft.conversionmod.items.ItemConversionWand;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLabel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

public class GuiChangeMatrix extends GuiContainer {
	
	public int guiWidth = 176;
	public int guiHeight = 158;
	
	GuiButton decreaseBtn;
	GuiButton increaseBtn;	
	
	public String matrixString;
	public Integer usageByMatrix;
	
	private ItemStack draggedStack;
	
	public GuiChangeMatrix(EntityPlayer player) {
		
		super(new ContainerConversionWand(player));		
		
	}
	
	@Override
	protected void actionPerformed(GuiButton button){
		switch(button.id){
			case 0: if(ConversionMod.matrix >= 1) {ConversionMod.matrix = ConversionMod.matrix - 1;} break;
			case 1: if(ConversionMod.matrix <= 3) {ConversionMod.matrix = ConversionMod.matrix + 1;} break;
		}
	}
	
	//@Override
	protected void drawGuiContainerBackgroundLayer(float ticks, int x, int y) {

		switch(ConversionMod.matrix) {
			case 0: matrixString="1x1"; usageByMatrix=1; break;
			case 1: matrixString="3x3"; usageByMatrix=9; break;
			case 2: matrixString="5x5"; usageByMatrix=25; break;
			case 3: matrixString="7x7"; usageByMatrix=49; break;
			case 4: matrixString="9x9"; usageByMatrix=81; break;
			default: matrixString="1x1"; usageByMatrix=1; break;
		}
		
		Integer itemDamageUsed = 1000 - ItemConversionWand.itemDamage;
		Integer itemPercentDamage = Math.round(((float)itemDamageUsed / (float)999) * (float)100);
		Integer itemUsage = Math.round((float)itemDamageUsed / (float)usageByMatrix);
		
		GL11.glColor4f(1F, 1F, 1F, 1F);
		GL11.glDisable(GL11.GL_LIGHTING);
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(ConversionMod.MODID, "textures/gui/container/conversionwandsettings.png"));
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, guiWidth, guiHeight);
		drawTexturedModalRect(guiLeft+68, guiTop+62, 0, 163, itemPercentDamage, 15);
		fontRendererObj.drawStringWithShadow(I18n.format("container.wandsettings", new Object[0]), guiLeft + 7, guiTop + 7, 0xFFFFFF);
		fontRendererObj.drawString(I18n.format("container.selecteditem", new Object[0]), guiLeft + 7, guiTop + 27, 0x000000);
		fontRendererObj.drawString(I18n.format("container.matrixsize",new Object[0]), guiLeft + 7, guiTop + 46, 0x000000);
		fontRendererObj.drawString(matrixString, guiLeft + 139, guiTop + 46, 0x000000);
		fontRendererObj.drawString(I18n.format("container.usage",new Object[0]), guiLeft + 7, guiTop + 63, 0x000000);
		fontRendererObj.drawString(itemUsage.toString()+ I18n.format("container.usagesleft", new Object[0]), guiLeft + 70, guiTop + 63, 0x000000);
		drawItemStack(new ItemStack(ItemConversionWand.curBlock,1,ItemConversionWand.curBlockMeta),guiLeft+152, guiTop+22, "");
		
		
		buttonList.clear();
		buttonList.add(decreaseBtn = new GuiButton(0, guiLeft + 125, guiTop + 40, 10, 20, "<"));
		buttonList.add(increaseBtn = new GuiButton(1, guiLeft + 159, guiTop + 40, 10, 20, ">"));
		
	}
	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	private void drawItemStack(ItemStack p_146982_1_, int p_146982_2_, int p_146982_3_, String p_146982_4_)
    {
        GL11.glTranslatef(0.0F, 0.0F, 32.0F);
        this.zLevel = 200.0F;
        itemRender.zLevel = 200.0F;
        FontRenderer font = null;
        if (p_146982_1_ != null) font = p_146982_1_.getItem().getFontRenderer(p_146982_1_);
        if (font == null) font = fontRendererObj;
        itemRender.renderItemAndEffectIntoGUI(font, this.mc.getTextureManager(), p_146982_1_, p_146982_2_, p_146982_3_);
        itemRender.renderItemOverlayIntoGUI(font, this.mc.getTextureManager(), p_146982_1_, p_146982_2_, p_146982_3_ - (this.draggedStack == null ? 0 : 8), p_146982_4_);
        this.zLevel = 0.0F;
        itemRender.zLevel = 0.0F;
    }
}