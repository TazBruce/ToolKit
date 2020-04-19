package io.github.TazBruce.ToolKit;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enabled!");
        getCommand("ToolKit").setExecutor(new CommandToolKit());
        getCommand("Toolkit").setTabCompleter(new ToolKitTabCompleter());

    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled!");
    }
}

