package tk.pgfriends.spawnegg;

import org.bukkit.plugin.java.JavaPlugin;

import tk.pgfriends.spawnegg.events.PlayerEvents;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(new PlayerEvents(), this);
	}

}
