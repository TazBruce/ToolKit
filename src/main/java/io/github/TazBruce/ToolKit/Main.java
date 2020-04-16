package io.github.TazBruce.ToolKit;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Enabled!");
        this.getCommand("ToolKit").setExecutor(new CommandToolKit());

    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}

