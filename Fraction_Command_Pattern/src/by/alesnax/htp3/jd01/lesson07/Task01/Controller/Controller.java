package by.alesnax.htp3.jd01.lesson07.Task01.Controller;

import by.alesnax.htp3.jd01.lesson07.Task01.Command.Command;
import by.alesnax.htp3.jd01.lesson07.Task01.bean.Request;
import by.alesnax.htp3.jd01.lesson07.Task01.bean.Responce;

public class Controller {
	private final CommandHelper helper = new CommandHelper();

	public Controller() {
	}

	public Responce doAction(Request request) {

		String commandName = request.getCommandName();
		Command command = helper.getCommand(commandName);
		Responce responce = new Responce();
		
		while (request.getCommandName().equals("AUTHORIZATION_COMMAND")) {
			responce = command.execute(request);
			if (!responce.isActivate()) {
				responce.setErrorMessage("You've not authorized in System. Please, Login! ");
			} else {
				System.out.println(responce.getMessage());
			}
			break;
		}

		if (!request.getCommandName().equals("AUTHORIZATION_COMMAND")) {
			if (!responce.isActivate()) {
				responce.setErrorMessage("You've not authorized in System. Please, Login! ");
				System.out.println(responce.getErrorMessage());
			} else {
				responce = command.execute(request);
			}
		}
		return responce;
	}

}
