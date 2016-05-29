package by.alesnax.hotel.controller;

import java.util.HashMap;
import java.util.Map;

import by.alesnax.hotel.command.Command;
import by.alesnax.hotel.command.impl.AddNewRoom;
import by.alesnax.hotel.command.impl.AddNewRoomForm;
import by.alesnax.hotel.command.impl.ChangeLanguage;
import by.alesnax.hotel.command.impl.GetFreeRooms;
import by.alesnax.hotel.command.impl.Logination;

public final class CommandHelper {

	private static final CommandHelper instance = new CommandHelper();

	private Map<CommandName, Command> commands = new HashMap<>();

	private CommandHelper() {
		commands.put(CommandName.LOGINATION, new Logination());
		commands.put(CommandName.CHANGE_LANGUAGE, new ChangeLanguage());
		commands.put(CommandName.SHOW_FREE_ROOMS, new GetFreeRooms());
		commands.put(CommandName.ADD_NEW_ROOM, new AddNewRoom());
		commands.put(CommandName.ADD_NEW_ROOM_FORM, new AddNewRoomForm());

	}

	public Command getCommand(String name) {
		name = name.replace('-', '_');
		CommandName commandName = CommandName.valueOf(name.toUpperCase());

		Command command = commands.get(commandName);

		return command;
	}

	public static CommandHelper getInstance() {
		return instance;
	}

}
