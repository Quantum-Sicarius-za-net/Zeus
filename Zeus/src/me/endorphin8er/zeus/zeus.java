package me.endorphin8er.zeus;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class zeus extends JavaPlugin{
	
	public static zeus Plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Is Now Disabled!");}
	

		
		@Override
		public void onEnable() {
			PluginDescriptionFile pdfFile = this.getDescription();
			this.logger.info(pdfFile.getName() + " Is Now Enabled!");}

			
		public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
			Player player = (Player) sender;
			if(commandLabel.equalsIgnoreCase("zeus")){
				if(args.length == 0){
					if(player.isOp());
			player.sendMessage("----" + ChatColor.GREEN + "Zeus Help" + ChatColor.WHITE + "----");
			player.sendMessage(ChatColor.GOLD + "Use A Blazrod For The Power Of Thor!");
			player.sendMessage(ChatColor.GRAY + "Use Gunpowder For The Power Of The Creeper Lord!");
				}else{
					player.sendMessage(ChatColor.DARK_RED + "You Are Not A God");

}}
			return false;}}