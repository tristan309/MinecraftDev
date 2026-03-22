package me.twan.minecraftDev.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Item implements Listener {
    @EventHandler
    public void rightclick(InventoryClickEvent event){
        Player p = (Player) event.getWhoClicked();
        if(event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            if (event.getClick().isRightClick() && event.getCurrentItem() != null && event.getCurrentItem().getType() == Material.BOOK) {
                p.sendMessage("Jij heb op een itemframe geklikt");

            }
        }

    }
}