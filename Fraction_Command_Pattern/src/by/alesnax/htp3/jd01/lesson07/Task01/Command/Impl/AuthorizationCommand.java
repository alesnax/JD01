package by.alesnax.htp3.jd01.lesson07.Task01.Command.Impl;

import by.alesnax.htp3.jd01.lesson07.Task01.Command.Command;
import by.alesnax.htp3.jd01.lesson07.Task01.bean.Request;
import by.alesnax.htp3.jd01.lesson07.Task01.bean.Responce;
import by.alesnax.htp3.jd01.lesson07.Task01.service.ClientService;
import by.alesnax.htp3.jd01.lesson07.Task01.service.ServiceFactory;

public class AuthorizationCommand implements Command {

	@Override
	public Responce execute(Request request) {

		String login = request.getLogin();
		String password = request.getPassword();

		ServiceFactory factory = ServiceFactory.getInstance();
		ClientService service = factory.getClientService();

		boolean result = service.logination(login, password);

		Responce responce = new Responce();
		responce.setActivate(result);
		if (!result) {
			responce.setMessage("Logination is failed");
			responce.setErrorMessage("This is the end, tadada, all my de-ar friends...");
		} else {
			responce.setMessage("Logination is OK");
			responce.setErrorMessage(null);
		}
		return responce;
	}

}