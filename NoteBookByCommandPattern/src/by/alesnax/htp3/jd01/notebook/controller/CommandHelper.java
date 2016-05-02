package by.alesnax.htp3.jd01.notebook.controller;

import java.util.HashMap;
import java.util.Map;

import by.alesnax.htp3.jd01.notebook.command.Command;
import by.alesnax.htp3.jd01.notebook.command.impl.AddNoteCommand;
import by.alesnax.htp3.jd01.notebook.command.impl.AuthorizationCommand;
import by.alesnax.htp3.jd01.notebook.command.impl.PrintAllNotesCommand;
import by.alesnax.htp3.jd01.notebook.command.impl.FindDefiniteNoteCommand;

public class CommandHelper {
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandHelper(){
		commands.put(CommandName.AUTHORIZATION_COMMAND, new AuthorizationCommand());
		commands.put(CommandName.ADD_NOTE_COMMAND, new AddNoteCommand());
		commands.put(CommandName.FIND_DEFINITE_NOTE, new FindDefiniteNoteCommand());
		commands.put(CommandName.PRINT_ALL_NOTES, new PrintAllNotesCommand());
	}
	
	public Command getCommand(String commandName){//"REGISTER_USER"
		CommandName command = CommandName.valueOf(commandName);
		Command executeCommand = commands.get(command);
		return executeCommand;
	}
	

}
