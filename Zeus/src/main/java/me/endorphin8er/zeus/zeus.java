/*
This file is part of Zeus.

Zeus is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Zeus is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Zeus.  If not, see http://www.gnu.org/licenses/.
*/

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
		this.logger.info(pdfFile.getName() + " Is Now Disabled!");
	}
	

		
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Is Now Enabled!");
	}

			
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("zeus")) {
			if(args.length == 0) {
				if(player.isOp()) {
					player.sendMessage("----" + ChatColor.GREEN + "Zeus Help" + ChatColor.WHITE + "----");
					player.sendMessage(ChatColor.GOLD + "Use A Blazrod For The Power Of Thor!");
					player.sendMessage(ChatColor.GRAY + "Use Gunpowder For The Power Of The Creeper Lord!");
				}
			}
			else {
				player.sendMessage(ChatColor.DARK_RED + "You Are Not A God");
			}
		}
		return false;
	}
}