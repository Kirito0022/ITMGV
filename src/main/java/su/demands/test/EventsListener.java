package su.demands.test;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class EventsListener implements Listener {
    ItemJoin plugin;

    public EventsListener(ItemJoin plugin) {

        this.plugin = plugin;
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        PlayerInventory i = player.getInventory();
        ItemStack emerald = new ItemStack(Material.EMERALD);
        ItemMeta cmeta = emerald.getItemMeta();
        cmeta.setDisplayName(ChatColor.AQUA + ("Я ГУЛЬ"));
        emerald.setItemMeta(cmeta);
        if (!event.getPlayer().hasPlayedBefore())
        player.getInventory().addItem(emerald);

    }
}
