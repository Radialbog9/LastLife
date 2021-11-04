package uk.radialbog9.spigot.lastlife.setup;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import uk.radialbog9.spigot.lastlife.LLGlobalVars;

public class SetupResponseHandler {
    public static void continueSetup(@NotNull Player p, String response) {
        int step = LLGlobalVars.getSetupStages().getOrDefault(p, -1);
        if(step < 0) return;
        else if (step == 0) {
            p.sendMessage(
                    ChatColor.DARK_GREEN +
                    "You have now entered setup. Type your responses in the chat, or type 'cancel' to stop setup."
            );
            p.sendMessage(ChatColor.GREEN + "Step 1: World Spawn/Border Center");
            p.sendMessage(ChatColor.DARK_GREEN + "Stand at where you want the center of the world to be, or type 'default' to keep the default spawnpoint.");

        }
    }
}
