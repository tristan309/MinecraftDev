package me.twan.minecraftDev.Listeners;

import net.md_5.bungee.chat.SelectorComponentSerializer;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Join implements Listener {
    @EventHandler
    public void join(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        if (p.hasPlayedBefore()) {
            event.setJoinMessage(ChatColor.GREEN + "Yo Fakka Niggas " + ChatColor.GOLD + p.getName() + ChatColor.GREEN + "Is Back" + ChatColor.RED + "Didn't Expact You Here So Soon...");
        } else {
            event.setJoinMessage(ChatColor.GOLD + "Yo Fakka Niggas " + p.getName() + "Is New Here Say Hello Bitches");
        }


    }
    @EventHandler
    public void quit(PlayerQuitEvent event){
        Player p = event.getPlayer();
        if(p.hasPlayedBefore()){
            event.setQuitMessage (ChatColor.GREEN + "Yo Fakka Niggas " + ChatColor.GOLD + p.getName() +ChatColor.GREEN + "Just Left " + ChatColor.RED + "That Was Fast...");
            else{
                event.setQuitMessage(ChatColor.GOLD + "Yo Fakka Niggas " +p.getName() + "Is Now Not Here Anymore Bitches" );
            }
        }
}


