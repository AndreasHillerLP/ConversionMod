package net.andreashiller.minecraft.conversionmod.handlers;

import net.andreashiller.minecraft.conversionmod.ConversionMod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputHandler {
	
	@SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
		
        if(KeyBindings.mplus.isPressed() && ConversionMod.matrix < 4){
        	ConversionMod.matrix++;
        }        
        
        if(KeyBindings.mminus.isPressed() && ConversionMod.matrix >= 1){
        	ConversionMod.matrix--;
        }
    }

}
