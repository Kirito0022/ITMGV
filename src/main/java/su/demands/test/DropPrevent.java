package su.demands.test;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;


public class DropPrevent implements Listener {
    ItemJoin plugin;

    public DropPrevent(ItemJoin plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void handleItemDrop(PlayerDropItemEvent e) {
        e.setCancelled(true);
    }
}
