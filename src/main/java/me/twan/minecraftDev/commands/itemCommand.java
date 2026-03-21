package me.twan.minecraftDev.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class itemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if(sender instanceof Player p){

            //ItemStack stick = new ItemStack(Material.STICK, 1);
            //p.getInventory().setItem(1, stick);
            ItemStack stick = new ItemStack(Material.STICK, 1);
            ItemMeta stickMeta = stick.getItemMeta();
            stickMeta.setDisplayName(ChatColor.GOLD + "Knockback Stick");
            stickMeta.addEnchant(Enchantment.KNOCKBACK, 255, true);
            //add the meta
            stick.setItemMeta(stickMeta);
            p.getInventory().addItem(stick);
            //add the meta Is VERY IMPORTANT
        }



        return true;
    }
}
