package uk.radialbog9.spigot.lastlife.setup;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import uk.radialbog9.spigot.lastlife.LLGlobalVars;

public class SetupListener implements Listener {
    @EventHandler
    public void setupChatEvent(AsyncPlayerChatEvent e) {
        if (LLGlobalVars.getSetupStages().getOrDefault(e.getPlayer(), null) != null) {
            SetupResponseHandler.continueSetup(e.getPlayer(), e.getMessage());
        }
    }

    @EventHandler
    public void setupLeaveEvent(PlayerQuitEvent e) {
        LLGlobalVars.getSetupStages().remove(e.getPlayer());
    }
}
