package de.Nickname.test.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.Nickname.test.commands.HealCommand;

public class Main extends JavaPlugin{

		public void onEnable() {
			getCommand("heal").setExecutor(new HealCommand());
		}
		
}
