package de.deriton.perks;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getCommand("perks").setExecutor(new command());
        PluginManager plm = getServer().getPluginManager();
        plm.registerEvents(new InvListener(), this);
        plm.registerEvents(new DeathListener(), this);
    }
}