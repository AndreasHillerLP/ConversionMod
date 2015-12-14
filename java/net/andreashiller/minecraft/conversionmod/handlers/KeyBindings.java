package net.andreashiller.minecraft.conversionmod.handlers;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;

public class KeyBindings {
	public static KeyBinding mplus;
	public static KeyBinding mminus;
	
	public static void init() {
		mplus = new KeyBinding("key.mplus", Keyboard.KEY_ADD, "key.categories.ConversionMod");
		mminus = new KeyBinding("key.mminus",Keyboard.KEY_SUBTRACT, "key.categories.ConversionMod");
		
		ClientRegistry.registerKeyBinding(mplus);
		ClientRegistry.registerKeyBinding(mminus);
	}
}
