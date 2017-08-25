package com.Pokeeee;

import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

@Mod(modid = reference.Mod_ID, name = reference.Mod_NAME, version = reference.VERSION)
public class inGameKeyBind {

	private KeyBinding toggle;
	private testClientGUI gui;
	private Minecraft mc;
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(this);
		toggle = new KeyBinding("Test Client", 23, "Client");
		ClientRegistry.registerKeyBinding(toggle);
		
		
		mc = Minecraft.getMinecraft();
	}
	
	@SubscribeEvent
	public void onTick(ClientTickEvent event)
	{ 
        if(toggle.isPressed())
        {
        	gui = new testClientGUI();
            //mc.thePlayer.sendChatMessage("Test");
        }
            
	}
	
}
