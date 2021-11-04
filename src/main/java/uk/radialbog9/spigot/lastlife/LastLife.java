package uk.radialbog9.spigot.lastlife;

import org.bukkit.plugin.java.JavaPlugin;

public final class LastLife extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
