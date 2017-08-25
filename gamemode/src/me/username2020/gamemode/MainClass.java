package me.username2020.gamemode;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {
	
	public void onEnable() {
		getLogger().info("----------\n\nStarting gamemode\n\n----------");
		getConfig().addDefault("By. 77Z", 0);
		saveConfig();
	}
	
	public void onDisable() {}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("gmc") && sender instanceof Player) {
			Player player = (Player) sender;
			
			player.sendMessage(ChatColor.GREEN
			+ player.getName()
			+ "'s Gamemode has been updated");
			player.getGameMode().equals(player);
		}
		
		return false;
	}

}
