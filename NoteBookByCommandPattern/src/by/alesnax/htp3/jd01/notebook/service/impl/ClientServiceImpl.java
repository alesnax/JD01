package by.alesnax.htp3.jd01.notebook.service.impl;

import by.alesnax.htp3.jd01.notebook.dao.CommonDao;
import by.alesnax.htp3.jd01.notebook.dao.DAOFactory;
import by.alesnax.htp3.jd01.notebook.service.ClientService;

public class ClientServiceImpl implements ClientService{

	@Override
	public boolean logination(String login, String password) {
		// parameters validation
		if (login == null || login.isEmpty()){
			return false;
		}
		
		
		DAOFactory factory = DAOFactory.getInstance();
		CommonDao commonDao = factory.getCommonDao();
		
		boolean result = commonDao.authorization(login, password);
		
		return result;
	}

}
