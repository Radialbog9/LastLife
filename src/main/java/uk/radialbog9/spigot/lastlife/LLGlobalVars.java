package uk.radialbog9.spigot.lastlife;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class LLGlobalVars {
    @Getter
    @Setter
    public boolean setUp = false;

    @Getter
    @Setter
    private static Location worldBorderCenter = null;

    @Getter
    @Setter
    private static float worldBorderSize = 1000;

    @Getter
    @Setter
    private static Map<Player, Integer> setupStages = new HashMap<>();

    public static void loadSaveablesFromConfig() {

    }
    public static void saveSaveablesToConfig() {

    }
}
