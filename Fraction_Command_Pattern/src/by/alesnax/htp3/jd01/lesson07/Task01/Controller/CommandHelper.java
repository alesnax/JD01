package by.alesnax.htp3.jd01.lesson07.Task01.Controller;

import java.util.HashMap;
import java.util.Map;

import by.alesnax.htp3.jd01.lesson07.Task01.Command.Command;
import by.alesnax.htp3.jd01.lesson07.Task01.Command.Impl.AddFractionsCommand;
import by.alesnax.htp3.jd01.lesson07.Task01.Command.Impl.AuthorizationCommand;
import by.alesnax.htp3.jd01.lesson07.Task01.Command.Impl.DivideFractionsCommand;
import by.alesnax.htp3.jd01.lesson07.Task01.Command.Impl.MultyplyFractionsCommand;
import by.alesnax.htp3.jd01.lesson07.Task01.Command.Impl.SubtractFractionsCommand;

public class CommandHelper {

private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandHelper(){
		commands.put(CommandName.ADD, new AddFractionsCommand());
		commands.put(CommandName.SUB, new SubtractFractionsCommand());
		commands.put(CommandName.MULT, new MultyplyFractionsCommand());
		commands.put(CommandName.DIV, new DivideFractionsCommand());
		commands.put(CommandName.AUTHORIZATION_COMMAND, new AuthorizationCommand());
	}
	
	public Command getCommand(String commandName){//"REGISTER_USER"
		CommandName command = CommandName.valueOf(commandName);
		Command executeCommand = commands.get(command);
		return executeCommand;
	}
}
