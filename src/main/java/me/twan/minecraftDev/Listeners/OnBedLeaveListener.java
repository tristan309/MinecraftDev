package me.twan.minecraftDev.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class OnBedLeaveListener implements Listener {
    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent event) throws InterruptedException {

        Player p = event.getPlayer();
        p.playSound(p.getLocation(), Sound.ITEM_GOAT_HORN_SOUND_0, 1.00f, 1.00f);
        p.sendTitle(ChatColor.GOLD + "Did Yo Sleep Well...","");
        p.sendMessage(ChatColor.RED + "I WAS WATCHING YOU!");
        p.setHealth(-1);
        Thread.sleep(5000);
        p.sendMessage(ChatColor.RED + "HAHAHAHA.");
        p.kickPlayer(p.getName());
    }
}
