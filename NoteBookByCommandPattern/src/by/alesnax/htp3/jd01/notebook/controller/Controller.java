package by.alesnax.htp3.jd01.notebook.controller;

import by.alesnax.htp3.jd01.notebook.bean.Request;
import by.alesnax.htp3.jd01.notebook.bean.Responce;
import by.alesnax.htp3.jd01.notebook.command.Command;

public class Controller {
	private final CommandHelper helper = new CommandHelper();
	
	public Controller(){}
	
	public Responce doAction(Request request){
		
		String commandName = request.getCommandName();
		Command command = helper.getCommand(commandName);
		Responce responce = new Responce();
		
		//BLOCK WHICH ASK FOR REGISTRATION
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
