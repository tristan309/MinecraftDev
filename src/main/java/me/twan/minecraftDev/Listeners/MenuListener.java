package me.twan.minecraftDev.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuListener implements Listener {
    @EventHandler
    public void onInvClick(InventoryClickEvent event){
        if(event.getView().getTitle().equals(ChatColor.GOLD + "Custom Gui Jonge")){

            event.setCancelled(true);
            if(!event.getClick().isLeftClick()) return;
            Player p = (Player) event.getWhoClicked();
            switch (event.getCurrentItem().getType()){
                case COOKED_BEEF:
                    p.setFoodLevel(20);
                    p.sendMessage(ChatColor.GOLD + "Yummie!");
                    p.playSound(p.getLocation(), Sound.ITEM_GOAT_HORN_SOUND_0, 1.00f, 1.00f);
                case BARRIER:
                    p.setHealth(0);
                    Bukkit.broadcastMessage(ChatColor.DARK_RED + p.getName()+" CHOSE THE EASY WAY OUT!");
                case NETHERITE_SWORD:
                    p.getInventory().addItem(new ItemStack(Material.NETHERITE_SWORD));
                    break;
            }
        }
    }

}
