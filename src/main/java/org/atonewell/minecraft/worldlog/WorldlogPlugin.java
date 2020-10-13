package org.atonewell.minecraft.worldlog;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * WordLog Plugin.
 */
public class WorldlogPlugin extends JavaPlugin {

    /**
     * Player Event Listener.
     */
    private final WorldlogPlayerListener playerListener
            = new WorldlogPlayerListener(this);

    /**
     * @see JavaPlugin#onEnable()
     */
    @Override
    public void onEnable() {
        // Register Events
        final PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(playerListener, this);
    }

}
