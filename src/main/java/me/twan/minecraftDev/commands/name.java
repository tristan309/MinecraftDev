package me.twan.minecraftDev.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class name implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        String gup = p.getName();
        p.sendMessage(ChatColor.GREEN + "Het Luisterd Altijd... ");
        p.sendMessage(ChatColor.RED + "Maar Jij Kent De Naam En Het Niet..." );
        p.sendMessage(ChatColor.GOLD + "Je Naam Is:");
        p.sendMessage(ChatColor.GOLD + gup);

        return true;
    }
}
