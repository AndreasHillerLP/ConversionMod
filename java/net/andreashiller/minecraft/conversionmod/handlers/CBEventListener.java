package net.andreashiller.minecraft.conversionmod.handlers;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import net.andreashiller.minecraft.conversionmod.gui.GuiInGameConfig;
import net.andreashiller.minecraft.conversionmod.misc.Version;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.GuiOpenEvent;
import cpw.mods.fml.client.GuiIngameModOptions;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CBEventListener {
	
	public String message;
	public EntityPlayer player;
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event) {
		if (Version.hasNewVersion) {
			event.player.addChatComponentMessage(new ChatComponentText("A new version of the Conversion Mod is available. You can download it from Curse.com. The new version is: "+Version.remoteVersion));
		}
		if (ConfigurationHandler.ShowWelcomeMessage == true) {
			event.player.addChatComponentMessage(new ChatComponentText("Thank you "+event.player.getDisplayName().toUpperCase()+" for using the Conversion Mod V"+ConversionMod.VERSION));
		}
	}
	
	@SubscribeEvent
	public void onBloodDiamondWasMined(PlayerEvent.ItemPickupEvent event) {
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(ItemHandler.itemBloodDiamond))) {
			event.player.addStat(AchievementHandler.bloodDiamondAm, 1);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(ItemHandler.itemRedCoal))) {
			event.player.addStat(AchievementHandler.redCoalAm, 1);
		}
		
	}
	
	@SubscribeEvent
	public void onBloodDiamondToolWasCrafted(PlayerEvent.ItemCraftedEvent event) {
		if(event.crafting.getItem().equals(ItemHandler.itemBloodDiamondAxe)) {
			event.player.addStat(AchievementHandler.bloodDiamondAxeAm, 1);
		}
		
		if(event.crafting.getItem().equals(ItemHandler.itemBloodDiamondPickAxe)) {
			event.player.addStat(AchievementHandler.bloodDiamondPickAxeAm, 1);
		}
		
		if(event.crafting.getItem().equals(ItemHandler.itemBloodDiamondSpade)) {
			event.player.addStat(AchievementHandler.bloodDiamondSpadeAm, 1);
		}
		
		if(event.crafting.getItem().equals(ItemHandler.itemBloodDiamondHoe)) {
			event.player.addStat(AchievementHandler.bloodDiamondHoeAm, 1);
		}
		
		if(event.crafting.getItem().equals(ItemHandler.itemBloodDiamondSword)) {
			event.player.addStat(AchievementHandler.bloodDiamondSwordAm, 1);
		}
		
		if(event.crafting.getItem().equals(ItemHandler.itemBloodDiamondHelmet)) {
			event.player.addStat(AchievementHandler.bloodDiamondHelmetAm, 1);
		}
		
		if(event.crafting.getItem().equals(ItemHandler.itemBloodDiamondChestplate)) {
			event.player.addStat(AchievementHandler.bloodDiamondChestplateAm, 1);
		}
		
		if(event.crafting.getItem().equals(ItemHandler.itemBloodDiamondLeggings)) {
			event.player.addStat(AchievementHandler.bloodDiamondLeggingsAm, 1);
		}
		
		if(event.crafting.getItem().equals(ItemHandler.itemBloodDiamondBoots)) {
			event.player.addStat(AchievementHandler.bloodDiamondBootsAm, 1);
		}
		
		if(event.crafting.getItem().equals(ItemHandler.itemConversionBall)) {
			event.player.addStat(AchievementHandler.conversionBallAm, 1);
		}
		
		if(event.crafting.getItem().equals(ItemHandler.itemConversionWand)) {
			event.player.addStat(AchievementHandler.conversionWandAm, 1);
		}
	}
	
	@SubscribeEvent
	public void onBloodDiamondWasCooked(PlayerEvent.ItemSmeltedEvent event) {
		if(event.smelting.getItem().equals(ItemHandler.itemBloodDiamondIngot)) {
			event.player.addStat(AchievementHandler.bloodDiamondIngotAm, 1);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(GuiOpenEvent event)
	{
	    if (event.gui instanceof GuiIngameModOptions)
	    {
	        event.gui = new GuiInGameConfig(null);        
	    }
	}
}
