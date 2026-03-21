package me.twan.minecraftDev;

import me.twan.minecraftDev.commands.die;
import me.twan.minecraftDev.commands.itemCommand;
import me.twan.minecraftDev.commands.name;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftDev extends JavaPlugin {

    @Override
    public void onEnable() {
       getCommand("die") .setExecutor(new die());
       getCommand("name") .setExecutor(new name());
       getCommand("item") .setExecutor(new itemCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
