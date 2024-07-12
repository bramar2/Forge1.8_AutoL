package bramar.autol;

import java.util.Timer;
import java.util.TimerTask;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Made by bramar. Do not redistribute and claim it as your own!
 * @author bramar
 *
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME, canBeDeactivated = false, clientSideOnly = false, acceptedMinecraftVersions = "1.8", useMetadata = true)
public class AutoL {
	public static boolean enabled;
	public static Logger logger;
	public static AutoL instance;
	public void unused() {
		String a = "Made by bramar. Do not redistribute/modify and claim it as your own!";
		String b = "Hey! You are not allowed to decompile this mod! actually you are i dont care";
	}
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent e) {System.out.println(Reference.PREFIX + "PreInit");}
	@Mod.EventHandler
	public static void init(FMLInitializationEvent e) {
		logger = LogManager.getLogger(Reference.MODID);
		System.out.println(Reference.PREFIX + "Init");
		instance = new AutoL();
		MinecraftForge.EVENT_BUS.register(AutoL.instance);
		a = new Timer(true);
		a.schedule(new TimerTask() {
			public void run() {
				try {
					enabled = Reference.func_09e2918(Minecraft.getMinecraft().thePlayer.getName());
					if(!enabled) {
						MinecraftForge.EVENT_BUS.unregister(instance);
						logger.warn("Events not registered. You are blacklisted from this mod! This mod is disabled.");
					}
					a.cancel();
					a = null;
				}catch(Exception e1) {
					
				}
			}
		}, 5000L, 5000L);
	}
	private static Timer a;
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent e) {System.out.println(Reference.PREFIX + "PostInit");
	
	}
	private Timer timer;
	@SubscribeEvent
	public void chatReceived(ClientChatReceivedEvent e) {
		try {
			if(!enabled) return;
		}catch(Exception e1) {
			return;
		}
		if(e.message.getUnformattedText().equalsIgnoreCase(Reference.EXACT_MSG)) {
			try {
				String str_0912731 = Minecraft.getMinecraft().getCurrentServerData().serverIP;
				if(!(str_0912731.equalsIgnoreCase("jartex.fun") || str_0912731.equalsIgnoreCase("top.jartex.fun") || str_0912731.equalsIgnoreCase("mp.jartexnetwork.com") || 
						str_0912731.equalsIgnoreCase("jartexnetwork.com") || str_0912731.equalsIgnoreCase("mc.jartexnetwork.com") || str_0912731.equalsIgnoreCase("play.jartexnetwork.com") || 
						str_0912731.endsWith(".jartexnetwork.com") || str_0912731.endsWith(".jartex.fun"))) return;
			}catch(Exception e1) {
				return;
			}
			timer = new Timer(true);
			timer.schedule(new TimerTask() {
				public void run() {
					Minecraft.getMinecraft().thePlayer.sendChatMessage("L");
					timer.cancel();
					timer = null;
				}
			}, 250L, 250L);
			timer = null;
		}else if(Reference.isBedDestroyMessage(e.message)) {
			try {
				String str_0912731 = Minecraft.getMinecraft().getCurrentServerData().serverIP;
				if(!(str_0912731.equalsIgnoreCase("jartex.fun") || str_0912731.equalsIgnoreCase("top.jartex.fun") || str_0912731.equalsIgnoreCase("mp.jartexnetwork.com") || 
						str_0912731.equalsIgnoreCase("jartexnetwork.com") || str_0912731.equalsIgnoreCase("mc.jartexnetwork.com") || str_0912731.equalsIgnoreCase("play.jartexnetwork.com") || 
						str_0912731.endsWith(".jartexnetwork.com") || str_0912731.endsWith(".jartex.fun"))) return;
			}catch(Exception e1) {
				return;
			}
			timer = new Timer(true);
			timer.schedule(new TimerTask() {
				public void run() {
					Minecraft.getMinecraft().thePlayer.sendChatMessage("L");
					timer.cancel();
					timer = null;
				}
			}, 250L, 250L);
			timer = null;
		}else if(Reference.isKillingMessage(e.message)) {
			try {
				String str_0912731 = Minecraft.getMinecraft().getCurrentServerData().serverIP;
				if(!(str_0912731.equalsIgnoreCase("jartex.fun") || str_0912731.equalsIgnoreCase("top.jartex.fun") || str_0912731.equalsIgnoreCase("mp.jartexnetwork.com") || 
						str_0912731.equalsIgnoreCase("jartexnetwork.com") || str_0912731.equalsIgnoreCase("mc.jartexnetwork.com") || str_0912731.equalsIgnoreCase("play.jartexnetwork.com") || 
						str_0912731.endsWith(".jartexnetwork.com") || str_0912731.endsWith(".jartex.fun"))) return;
			}catch(Exception e1) {
				return;
			}
			timer = new Timer(true);
			timer.schedule(new TimerTask() {
				public void run() {
					Minecraft.getMinecraft().thePlayer.sendChatMessage("L");
					timer.cancel();
					timer = null;
				}
			}, 250L, 250L);
			timer = null;
		}
	}
}

