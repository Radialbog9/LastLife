package uk.radialbog9.spigot.lastlife.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import uk.radialbog9.spigot.lastlife.LLGlobalVars;
import uk.radialbog9.spigot.lastlife.Utils;
import uk.radialbog9.spigot.lastlife.setup.SetupResponseHandler;

import java.util.ArrayList;
import java.util.List;

public class SetupCommand implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            if(sender.hasPermission("lastlife.admin")) {
                if(args.length == 0) {
                    sender.sendMessage(ChatColor.DARK_GREEN + "This will permanently clear all teams and scoreboards. If you are fine with this, type '/setup continue' to continue the setup");
                } else if (args[0].equalsIgnoreCase("continue")) {
                    LLGlobalVars.getSetupStages().put((Player) sender, 0);
                    SetupResponseHandler.continueSetup((Player) sender, null);
                }
            } else sender.sendMessage(Utils.getNoPermissionMessage());
        } else {
            sender.sendMessage(ChatColor.RED + "Unfortunately, you can't configure setup from the console.");
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(command.getLabel().equalsIgnoreCase("setup")) {
            return new ArrayList<>();
        }
        return null;
    }
}
