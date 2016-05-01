package by.alesnax.htp3.jd01.lesson07.Task01.service;

import by.alesnax.htp3.jd01.lesson07.Task01.service.impl.ClientServiceImpl;
import by.alesnax.htp3.jd01.lesson07.Task01.service.impl.FractionServiceImpl;

public class ServiceFactory {
	
	private static ServiceFactory factory = new ServiceFactory();

	private final ClientService clientService = new ClientServiceImpl();
	private final FractionService fractionService = new FractionServiceImpl();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return factory;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public FractionService getFractionService() {
		return fractionService;
	}
}
