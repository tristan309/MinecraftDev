package me.twan.minecraftDev.Listeners;

import me.twan.minecraftDev.MinecraftDev;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class send implements Listener {
    private final MinecraftDev plugin;

    public send(MinecraftDev plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void chatListener(PlayerChatEvent event){

        if(plugin.getConfig().getBoolean("Listener") == true){
            Player p = event.getPlayer();
            if(event.getMessage().equals("Start"))
                plugin.getConfig().set("Stage", "0");
                plugin.saveConfig();
                p.sendTitle(ChatColor.GOLD+"Yes", "It Worked" );
                if(event.getMessage().equals("yes")){
                    plugin.getConfig().set("Stage", "2");
                    plugin.saveConfig();
                    p.sendMessage();
            }
        }



    }
}