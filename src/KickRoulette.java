package com.danieltmc.kickroulette;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KickRoulette implements CommandExecutor
{
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			Player player = (Player) sender;
			if (System.currentTimeMillis() % 6 == 0)
			{
				// Kick player
				player.kickPlayer("Not so lucky...");
				return true;
			}
			// Say in chat "you were lucky"
			player.sendMessage("You survived... this time");
		}
		return false;
	}
}
