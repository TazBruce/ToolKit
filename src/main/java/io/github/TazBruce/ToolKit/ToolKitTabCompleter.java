package io.github.TazBruce.ToolKit;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class ToolKitTabCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String label, String[] args) {
        if (args.length == 1) {
            List<String> materials = new ArrayList<String>();
            materials.add("wood");
            materials.add("stone");
            materials.add("iron");
            materials.add("gold");
            materials.add("diamond");

            return materials;
            }
            else if (args.length == 2) {
                List<String> playerNames = new ArrayList<String>();
                Player[] players = new Player[Bukkit.getServer().getOnlinePlayers().size()];
                Bukkit.getServer().getOnlinePlayers().toArray(players);
                for (int i = 0; i < players.length; i++){
                    playerNames.add(players[i].getName());
                }

                return playerNames;
        }

        return null;
    }
}
