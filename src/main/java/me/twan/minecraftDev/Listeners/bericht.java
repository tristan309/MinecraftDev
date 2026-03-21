package me.twan.minecraftDev.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class bericht implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        // 1. Pak het bericht en de speler
        String bericht = event.getMessage().toLowerCase();
        Player p = event.getPlayer();

        // 2. De check: Zoek naar jouw specifieke woord
        if (bericht.contains("yes")) {

            // OPTIE A: Stuur een bericht terug naar de speler
            p.sendMessage("Ok");

            // OPTIE B: Blokkeer het bericht voor de rest van de server (uncomment om te gebruiken)
            // event.setCancelled(true);

            // OPTIE C: Voer een commando uit (bijv. geef ze een item)
            // Dit moet 'Sync' gebeuren omdat chat 'Async' is:
            // Bukkit.getScheduler().runTask(plugin, () -> speler.getInventory().addItem(new ItemStack(Material.APPLE)));
        }
    }
}
}
