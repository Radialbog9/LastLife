package uk.radialbog9.spigot.lastlife;

import lombok.Getter;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

public class Utils {
    @Getter
    private static final String noPermissionMessage = ChatColor.RED + "You don't have permission to execute this!";
    @Getter
    private static final String topSeparator = ChatColor.GRAY + "------------------------------";
    @Getter
    private static final String botSeparator = ChatColor.GRAY + "------------------------------";

    public static String getMsgColor(String msg) {
        //Get colored message and return it
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static TextComponent genTextComponentRunCommand(@NotNull String text, @NotNull String command, String hover) {
        TextComponent tc = new TextComponent(getMsgColor(text));
        if(hover != null) tc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(getMsgColor(hover))));
        tc.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, command));
        return tc;
    }
    public static TextComponent genTextComponentRunCommand(@NotNull String text, @NotNull String command) {
        return genTextComponentRunCommand(text, command, null);
    }
    public static TextComponent genTextComponentSuggestCommand(@NotNull String text, @NotNull String command, String hover) {
        TextComponent tc = new TextComponent(getMsgColor(text));
        if(hover != null) tc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(getMsgColor(hover))));
        tc.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, command));
        return tc;
    }
}
