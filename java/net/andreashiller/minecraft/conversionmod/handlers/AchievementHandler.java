package net.andreashiller.minecraft.conversionmod.handlers;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class AchievementHandler {
	
	public static Achievement bloodDiamondAm;
	public static Achievement bloodDiamondAxeAm;
	public static Achievement bloodDiamondPickAxeAm;
	public static Achievement bloodDiamondSpadeAm;
	public static Achievement bloodDiamondHoeAm;
	public static Achievement bloodDiamondSwordAm;
	public static Achievement bloodDiamondHelmetAm;
	public static Achievement bloodDiamondChestplateAm;
	public static Achievement bloodDiamondLeggingsAm;
	public static Achievement bloodDiamondBootsAm;
	public static Achievement conversionBallAm;
	public static Achievement conversionWandAm;
	public static Achievement bloodDiamondIngotAm;
	public static Achievement redCoalAm;
	
	public static void registerAchievements() {
		bloodDiamondAm = new Achievement("achievement.bloodDiamondAm","bloodDiamondAm",0,0,new ItemStack(ItemHandler.itemBloodDiamond),(Achievement)null).initIndependentStat().registerStat();
		bloodDiamondAxeAm = new Achievement("achievement.bloodDiamondAxeAm","bloodDiamondAxeAm",1,2,new ItemStack(ItemHandler.itemBloodDiamondAxe),bloodDiamondAm).registerStat();
		bloodDiamondPickAxeAm = new Achievement("achievement.bloodDiamondPickAxeAm","bloodDiamondPickAxeAm",2,2,new ItemStack(ItemHandler.itemBloodDiamondPickAxe),bloodDiamondAm).registerStat();
		bloodDiamondSpadeAm = new Achievement("achievement.bloodDiamondSpadeAm","bloodDiamondSpadeAm",3,2,new ItemStack(ItemHandler.itemBloodDiamondSpade),bloodDiamondAm).registerStat();
		bloodDiamondHoeAm = new Achievement("achievement.bloodDiamondHoeAm","bloodDiamondHoeAm",4,2,new ItemStack(ItemHandler.itemBloodDiamondHoe),bloodDiamondAm).registerStat();
		bloodDiamondSwordAm = new Achievement("achievement.bloodDiamondSwordAm","bloodDiamondSwordAm",5,2,new ItemStack(ItemHandler.itemBloodDiamondSword),bloodDiamondAm).registerStat();
		bloodDiamondHelmetAm = new Achievement("achievement.bloodDiamondHelmetAm","bloodDiamondHelmetAm",1,3,new ItemStack(ItemHandler.itemBloodDiamondHelmet),bloodDiamondAm).registerStat();
		bloodDiamondChestplateAm = new Achievement("achievement.bloodDiamondChestplateAm","bloodDiamondChestplateAm",2,3,new ItemStack(ItemHandler.itemBloodDiamondChestplate),bloodDiamondAm).registerStat();
		bloodDiamondLeggingsAm = new Achievement("achievement.bloodDiamondLeggingsAm","bloodDiamondLeggingsAm",3,3,new ItemStack(ItemHandler.itemBloodDiamondLeggings),bloodDiamondAm).registerStat();
		bloodDiamondBootsAm = new Achievement("achievement.bloodDiamondBootsAm","bloodDiamondBootsAm",4,3,new ItemStack(ItemHandler.itemBloodDiamondBoots),bloodDiamondAm).registerStat();
		conversionBallAm = new Achievement("achievement.conversionBallAm","conversionBallAm",5,3,new ItemStack(ItemHandler.itemConversionBall),bloodDiamondAm).registerStat();
		conversionWandAm = new Achievement("achievement.conversionWandAm","conversionWandAm",5,5,new ItemStack(ItemHandler.itemConversionWand),conversionBallAm).registerStat();
		bloodDiamondIngotAm = new Achievement("achievement.bloodDiamondIngotAm","bloodDiamondIngotAm",0,6,new ItemStack(ItemHandler.itemBloodDiamondIngot),bloodDiamondAm).registerStat();
		redCoalAm = new Achievement("achievement.redCoalAm","redCoalAm",-2,0,new ItemStack(ItemHandler.itemRedCoal),(Achievement)null).registerStat();
		
		AchievementPage.registerAchievementPage(new AchievementPage("Conversion Mod", new Achievement[] {
			bloodDiamondAm, 
			bloodDiamondAxeAm, 
			bloodDiamondPickAxeAm, 
			bloodDiamondSpadeAm, 
			bloodDiamondHoeAm, 
			bloodDiamondSwordAm,
			bloodDiamondHelmetAm,
			bloodDiamondChestplateAm,
			bloodDiamondLeggingsAm,
			bloodDiamondBootsAm,
			conversionBallAm,
			conversionWandAm,
			bloodDiamondIngotAm,
			redCoalAm
		}));
	}
}