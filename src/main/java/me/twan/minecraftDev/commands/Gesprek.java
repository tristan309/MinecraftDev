package me.twan.minecraftDev.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gesprek implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        p.sendMessage(ChatColor.GREEN+"Hi "+ChatColor.MAGIC+"tsiwiidieokei"+ChatColor.GREEN+" Did I Spell Your Name Correct");
if p.


        return true;
    }
}
