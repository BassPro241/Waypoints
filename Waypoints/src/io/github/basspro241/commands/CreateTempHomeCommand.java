package io.github.basspro241.commands;

import io.github.basspro241.Waypoints;

import org.bukkit.command.CommandSender;

public class CreateTempHomeCommand extends WaypointCommand implements Command{

	private Waypoints plugin;

	public CreateTempHomeCommand(String name) {
		super("SetHome");
		this.plugin = plugin;
	}

	@Override
	public boolean execute(CommandSender executor, String identifier,
			String[] args) {
		return false;
	}
	
	

}
