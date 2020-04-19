package io.github.TazBruce.ToolKit;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandToolKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if ((sender instanceof Player) && (args.length > 0)) {
            Player player = (Player) sender;
            ItemStack pickaxe = null;
            ItemStack axe = null;
            ItemStack shovel = null;
            boolean correct = true;

            if (args[0].equalsIgnoreCase("wood")) {
                pickaxe = new ItemStack(Material.WOODEN_PICKAXE);
                axe = new ItemStack(Material.WOODEN_AXE);
                shovel = new ItemStack(Material.WOODEN_SHOVEL);

            } else if (args[0].equalsIgnoreCase("stone")) {
                pickaxe = new ItemStack(Material.STONE_PICKAXE);
                axe = new ItemStack(Material.STONE_AXE);
                shovel = new ItemStack(Material.STONE_SHOVEL);

            } else if (args[0].equalsIgnoreCase("iron")) {
                pickaxe = new ItemStack(Material.IRON_PICKAXE);
                axe = new ItemStack(Material.IRON_AXE);
                shovel = new ItemStack(Material.IRON_SHOVEL);

            } else if (args[0].equalsIgnoreCase("gold")) {
                pickaxe = new ItemStack(Material.GOLDEN_PICKAXE);
                axe = new ItemStack(Material.GOLDEN_AXE);
                shovel = new ItemStack(Material.GOLDEN_SHOVEL);

            } else if (args[0].equalsIgnoreCase("diamond")) {
                pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
                axe = new ItemStack(Material.DIAMOND_AXE);
                shovel = new ItemStack(Material.DIAMOND_SHOVEL);

            } else {
                player.sendMessage("§4Invalid material!");
                correct = false;
            }

            if (correct) {
                if (args.length == 2) {
                    Player target = Bukkit.getPlayer(args[1]);
                    target.getInventory().addItem(pickaxe, axe, shovel);
                    target.sendMessage("§2Tools received!");
                }
                else {
                    player.getInventory().addItem(pickaxe, axe, shovel);
                    player.sendMessage("§2Tools received!");
                }
            }
            return true;
        }
        else return false;
    }
}

