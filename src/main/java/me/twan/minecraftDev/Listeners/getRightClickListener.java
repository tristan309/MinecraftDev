package me.twan.minecraftDev.Listeners;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class getRightClickListener implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null && event.getItem().getType() == Material.BOOK) {
                p.sendMessage("Je heb op een boek geklik");
                p.playSound(p.getLocation(), Sound.ITEM_GOAT_HORN_SOUND_0, 1000.00f, 1.00f);
            }
        }
    }
@EventHandler
    public void pibbie(PlayerInteractAtEntityEvent event){
        Player p = (Player) event.getPlayer();
        if(event.getRightClicked().getType() == EntityType.PIG){

            Pig pig = (Pig)event.getRightClicked();
            pig.getWorld().createExplosion(pig.getLocation(), 100000000);

        }
}

}