package com.danieltmc.kickroulette;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor
{
	@Override
	public void onEnable()
	{
		// Executes when the server runs the plugin
		this.getCommand("kickroulette").setExecutor(new com.danieltmc.kickroulette.KickRoulette());
	}

	@Override
	public void onDisable()
	{
		// Executes when the server stops the plugin
		return;
	}
}
