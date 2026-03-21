package me.twan.minecraftDev.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class die implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player p = (Player) commandSender;
        p.sendTitle("Jij Bent Dood..", "");
        p.sendMessage(ChatColor.RED + "Haha!...    JIJ BENT DOOD!...");
        p.setHealth(0.00);

        return true;
    }
}
