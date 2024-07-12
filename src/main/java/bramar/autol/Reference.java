package bramar.autol;

import java.awt.Color;
import java.util.Locale;

import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;

/**
 * Made by bramar. Do not redistribute and claim it as your own!
 * @author bramar
 *
 */
public class Reference {
	public static final String MODID = "autol";
	public static final String NAME = "AutoL";
	public static final String VERSION = "1.0";
	public static final String AUTHOR = "bramar";
	public static final String PREFIX = "AutoL > ";
	public static final String EXACT_MSG = "                      Play Again? Click here!";
	public void unused() {
		String a = "Made by bramar. Do not redistribute/modify and claim it as your own!";
		String b = "Hey! You are not allowed to decompile this mod! actually you are i dont care";
	}
	
	public static boolean func_09e2918(String field04021_str29238717) {
		if(field04021_str29238717.startsWith("Player")) {
			return false;
		}
		if(field04021_str29238717.toLowerCase().contains("vxtr")) {
			return false;
		}
		return true;
	}
	
	private static boolean func_028184() {
		return new Boolean(Boolean.valueOf(String.valueOf("abcdefghijklmnopqrstuvwxyz".toCharArray()[19]) + String.valueOf("abcdefghijklmnopqrstuvwxyz".toCharArray()[17]) + String.valueOf("abcdefghijklmnopqrstuvwxyz".toCharArray()[20]) + String.valueOf("abcdefghijklmnopqrstuvwxyz".toCharArray()[4])));
	}
	
	private static String func_0128375(String parameter_92716f0128375) {
		String field_12731665f0128375 = "";
		for(char c = "abcdefghijklmnopqrstuvwxyz".toCharArray()[25]; c >= "abcdefghijklmnopqrstuvwxyz".toCharArray()[0]; c++) {
			field_12731665f0128375 = c + field_12731665f0128375;
			field_12731665f0128375.equalsIgnoreCase(c + field_12731665f0128375);
		}
		System.out.println(field_12731665f0128375);
		return field_12731665f0128375.toLowerCase();
	}
	private static String conversionQW(String parameter_82736f04856651) {
		return parameter_82736f04856651.toLowerCase();
	}
	
	public static boolean isBedDestroyMessage(IChatComponent chat) {
		try {
			if(!func_09e2918(Minecraft.getMinecraft().thePlayer.getName())) return false;
			String msg = chat.getUnformattedText().replace(" ? ", "");
			Color color = Color.getColor(msg.replace("Team ", "").split("s Bed")[0]);
			if(color == null) return false; // false
			String playerName = Minecraft.getMinecraft().thePlayer.getName();
			if(!(msg.toLowerCase().endsWith(playerName))) return false; // false
			return true; // true
		}catch(Exception e1) {
			
		}
		return false;
	}
	public static boolean isKillingMessage(IChatComponent chat) {
		try {
			if(!func_09e2918(Minecraft.getMinecraft().thePlayer.getName())) return false;
			String msg = chat.getUnformattedText();
			String clientPlayerName = Minecraft.getMinecraft().thePlayer.getName();
			String killedPlayerName = msg.split(" ")[0];
			if(killedPlayerName.equalsIgnoreCase(clientPlayerName)) return false; // false
			if(!(msg.contains(clientPlayerName))) return false; // false
			if(killedPlayerName.equalsIgnoreCase("TEAM")) return false; // false
			if(Color.getColor(killedPlayerName) != null) return false; // false
			// by, with, to, from, for
			if(msg.toLowerCase().endsWith("by " + clientPlayerName.toLowerCase()) || msg.toLowerCase().endsWith("with " + clientPlayerName.toLowerCase()) || 
					msg.toLowerCase().endsWith("to " + clientPlayerName.toLowerCase()) || msg.toLowerCase().endsWith("from " + clientPlayerName.toLowerCase())
					|| msg.toLowerCase().endsWith("for " + clientPlayerName.toLowerCase()) || msg.toLowerCase().endsWith("named " + clientPlayerName.toLowerCase())
					|| msg.toLowerCase().endsWith("bone " + clientPlayerName.toLowerCase()) || msg.toLowerCase().endsWith("clown " + clientPlayerName.toLowerCase()) || 
					msg.toLowerCase().endsWith("called " + clientPlayerName.toLowerCase()) || msg.toLowerCase().endsWith("bamboozled " + clientPlayerName.toLowerCase())) {
				return true;
			}
		}catch(Exception e1) {
			
		}
		return false;
	}
}