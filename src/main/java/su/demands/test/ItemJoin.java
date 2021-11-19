package su.demands.test;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemJoin extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new EventsListener(this), this);
        pm.registerEvents(new DropPrevent(this), (this));
    }
}