package net.pgfmc.spawnegg.events;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerEvents implements Listener {
	
	@EventHandler
	public void onMobDeath(EntityDeathEvent e)
	{
		Random r = new Random();
		
		int ran1= r.nextInt(10000);

		if (ran1 != 10000) { return; }// 1/10,000 drop chance of spawn eggs from these mobs: V

		
		
		List<String> whitelist = Arrays.asList("STRIDER_SPAWN_EGG", "RABBIT_SPAWN_EGG", "SALMON_SPAWN_EGG", "PIG_SPAWN_EGG", "SPIDER_SPAWN_EGG", "BLAZE_SPAWN_EGG", "SQUID_SPAWN_EGG", "TROPICAL_FISH_SPAWN_EGG", "ZOMBIE_SPAWN_EGG", "CHICKEN_SPAWN_EGG", "COD_SPAWN_EGG", "COW_SPAWN_EGG", "CREEPER_SPAWN_EGG", "ENDERMAN_SPAWN_EGG", "SKELETON_SPAWN_EGG", "SLIME_SPAWN_EGG", "SKELETON_HORSE_SPAWN_EGG", "CAVE_SPIDER_SPAWN_EGG", "SILVERFISH_SPAWN_EGG", "SHEEP_SPAWN_EGG");
		
		String name = e.getEntityType().toString() + "_SPAWN_EGG";  // ------------------  retrieves spawn egg name from mob type
		
		if (name.equals("MOOSHROOM_SPAWN_EGG")) { name = "MUSHROOM_COW_SPAWN_EGG"; } // -- implements Mooshroom support
		
		boolean onWhitelist = false; // variable for the for loop
		
		
		for(String i : whitelist)
		{
			if (name.equals(i))
			{
				onWhitelist = true;
			}
		}
		
		if (!onWhitelist) { return; } // ends function if killed mob isn't on whitelist
		
		
		
		Location loc = e.getEntity().getLocation();
		Material mat = Material.getMaterial(name);
		
		loc.getWorld().dropItemNaturally(loc, new ItemStack(mat));
	}

}
//edit? que?
//gamer