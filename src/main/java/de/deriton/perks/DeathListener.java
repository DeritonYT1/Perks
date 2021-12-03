package de.deriton.perks;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {
    public DeathListener() {
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        event.getKeepInventory();
    }
}
