package by.alesnax.htp3.jd01.notebook.ControllerClientHelper;

import java.util.Scanner;

import by.alesnax.htp3.jd01.notebook.bean.Request;
import by.alesnax.htp3.jd01.notebook.bean.Responce;
import by.alesnax.htp3.jd01.notebook.controller.Controller;


public class ClientInput {
	boolean switchOn = true;
	Controller controller = new Controller();
	
	public ClientInput() {
	}

	// CONTROL METHOD
	public void act() {
		PrintIstruction.hello();
		login();
		continueOn();
	}

	// ASKING CLIENT TO CONTINUE OR NOT AND CALLING doAction METHOD
	void continueOn() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (switchOn) {
			System.out.println("Enter 'Y' button to continue, another to exit");
			if (scanner.hasNextLine()) {
				String str = scanner.next();
				if (str.equals("y".toLowerCase())) {
					doAction();
				} else {
					switchOn = false;
					PrintIstruction.exit();
					break;
				}
			}
		}
	}

	// CHOOSING METHOD BY CLIENT AND EXCECUTING IT
	Responce doAction() {

		Responce responce = new Responce();
		Request request = new Request();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		PrintIstruction.instruction();
		if (scanner.hasNextInt()) {

			int i = scanner.nextInt();

			switch (i) {
			default: {
				PrintIstruction.exitMenu();
				switchOn = false;
				break;
			}
			
			case 1: {
				request = new Request();
				request.setCommandName("ADD_NOTE_COMMAND");
				responce = controller.doAction(request);
				break;
			}
			case 2: {
				request = new Request();
				request.setCommandName("PRINT_ALL_NOTES");
				responce = controller.doAction(request);
				break;
			}
			case 3: {
				request = new Request();
				request.setCommandName("FIND_DEFINITE_NOTE");
				responce = controller.doAction(request);
				break;
			}
			}
		}
		return responce;
	}

	// LOGINATION (LOGIN AND PASSWORD INPUT FROM CNSOLE AND CHECKIN)
	Responce login() {
		Responce responce1 = null;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		PrintIstruction.login();
		do {
			responce1 = new Responce();
			Request request1 = new Request();
			String login;
			String password;
			
			if (scanner.hasNext()) {
				login = scanner.next();
				password = scanner.next();

				request1.setCommandName("AUTHORIZATION_COMMAND");
				request1.setLogin(login);
				request1.setPassword(password);

				responce1 = controller.doAction(request1);
				if(!responce1.isActivate()){
					System.out.println(responce1.getErrorMessage());
				}
			}
		}while (!responce1.isActivate());
		return responce1;
	}

}
