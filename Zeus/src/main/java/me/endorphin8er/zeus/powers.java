package me.endorphin8er.zeus;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class powers implements Listener {
	public static zeus plugin;
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		int blockId = player.getItemInHand().getType().getId();
				if (blockId == 369){
					Block block = player.getTargetBlock(null, 50);
					Location location = block.getLocation();
					World world = player.getWorld();
					world.strikeLightning(location);
					

		}
	}

}