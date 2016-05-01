package by.alesnax.htp3.jd01.lesson07.Task01.service.impl;

import by.alesnax.htp3.jd01.lesson07.Task01.dao.CommonDao;
import by.alesnax.htp3.jd01.lesson07.Task01.dao.DAOFactory;
import by.alesnax.htp3.jd01.lesson07.Task01.service.ClientService;

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
