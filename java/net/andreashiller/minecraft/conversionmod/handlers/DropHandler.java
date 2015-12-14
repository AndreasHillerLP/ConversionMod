package net.andreashiller.minecraft.conversionmod.handlers;

import java.util.Random;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {
	public static Random random;
	public static int dropped;
	
	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		random = new Random();
		dropped = random.nextInt(2) + 1;
		
		if(event.entityLiving instanceof EntityCreeper) {
				event.entityLiving.entityDropItem(new ItemStack(ItemHandler.itemBloodDiamond), 1F);
		}
	}
}