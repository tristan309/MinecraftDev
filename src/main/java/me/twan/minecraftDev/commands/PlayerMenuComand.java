package me.twan.minecraftDev.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerMenuComand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player p){
            Inventory menu = Bukkit.createInventory(p, 9, ChatColor.GOLD + "Custom Gui Jonge");
            ItemStack feed = new ItemStack(Material.COOKED_BEEF);
            ItemStack kill = new ItemStack(Material.BARRIER);
            ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);


            ItemMeta feedMeta = feed.getItemMeta();
            feedMeta.setDisplayName(ChatColor.GREEN + "EAT MOTHERFOCKER");
            feed.setItemMeta(feedMeta);

            ItemMeta killMeta = feed.getItemMeta();
            killMeta.setDisplayName(ChatColor.RED + "YOU GOT TO DIE SOMETIME");
            feed.setItemMeta(killMeta);

            ItemMeta swordMeta = feed.getItemMeta();
            swordMeta.setDisplayName(ChatColor.GREEN + "JUST KILL SOMEONE");
            feed.setItemMeta(swordMeta);

            menu.setItem(0, feed);
            menu.setItem(4, kill);
            menu.setItem(8, sword);

            p.openInventory(menu);
        }else{
            sender.sendMessage("OELEH ALLEEN SPELAAS");
        }





        return true;
    }
}
