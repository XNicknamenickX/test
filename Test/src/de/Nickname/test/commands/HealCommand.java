package de.Nickname.test.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			player.setHealth(1);
			player.setHealthScale(1);
			player.sendMessage("HA Gottim");
		}else {
			System.out.println("You don't have the permissions to do that");
		}
		return false;
	}

}
