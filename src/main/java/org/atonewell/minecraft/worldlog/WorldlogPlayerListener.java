package org.atonewell.minecraft.worldlog;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Event listener for Player events.
 */
public final class WorldlogPlayerListener implements Listener {

    /**
     * The instantiating plugin.
     */
    private final WorldlogPlugin plugin;

    /**
     * Constructor.
     *
     * @param instance the instantiating plugin.
     */
    public WorldlogPlayerListener(final WorldlogPlugin instance) {
        plugin = instance;
    }

    /**
     * {@link @PlayerJoinEvent} Listener.
     *
     * @param event the {@link @PlayerJoinEvent} event
     */
    @EventHandler
    public void onPlayerJoin(final PlayerJoinEvent event) {
        try {
            plugin.getLogger().info(event.getPlayer().getName()
                    + " joined world "
                    + event.getPlayer().getLocation().getWorld().getName());
        } catch (Exception ex) {
            plugin.getLogger().severe("Unhandled error: " + ex.getMessage());
        }
    }

    /**
     * {@link @PlayerChangedWorldEvent} Listener.
     *
     * @param event the {@link @PlayerChangedWorldEvent} event
     */
    @EventHandler
    public void onPlayerChangedWorld(final PlayerChangedWorldEvent event) {
        try {
            plugin.getLogger().info(event.getPlayer().getName()
                    + " ported to "
                    + event.getPlayer().getLocation().getWorld().getName());
        } catch (Exception ex) {
            plugin.getLogger().severe("Unhandled error: " + ex.getMessage());
        }
    }
}
