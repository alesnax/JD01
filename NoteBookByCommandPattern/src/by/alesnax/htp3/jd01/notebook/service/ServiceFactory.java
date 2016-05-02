package by.alesnax.htp3.jd01.notebook.service;

import by.alesnax.htp3.jd01.notebook.service.impl.ClientServiceImpl;
import by.alesnax.htp3.jd01.notebook.service.impl.NoteBookServiceImpl;

public class ServiceFactory {
	
	private static ServiceFactory factory = new ServiceFactory();

	private final ClientService clientService = new ClientServiceImpl();
	private final NoteBookService noteBookService = new NoteBookServiceImpl();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return factory;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public NoteBookService getNoteBookService() {
		return noteBookService;
	}
}
