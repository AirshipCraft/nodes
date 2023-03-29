package tk.airshipcraft.nodes;

import org.bukkit.plugin.java.JavaPlugin;

public final class Nodes extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enabled successfully!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabled!");
    }
}
