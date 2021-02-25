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
// i think we should start commenting code SUPER well, becasue we will be looking at eachother's code
// and i don't think that spending time figuring out what each other wrote is going to be very smart :0