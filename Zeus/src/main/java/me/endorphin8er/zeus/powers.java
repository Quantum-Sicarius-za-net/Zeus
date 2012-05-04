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