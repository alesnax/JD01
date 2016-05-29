package by.alesnax.hotel.service.impl;

import by.alesnax.hotel.bean.User;
import by.alesnax.hotel.dao.DAOFactory;
import by.alesnax.hotel.dao.UserDAO;
import by.alesnax.hotel.dao.exception.DAOException;
import by.alesnax.hotel.service.UserService;
import by.alesnax.hotel.service.exception.ServiceAuthException;
import by.alesnax.hotel.service.exception.ServiceException;

public class UserServiceImpl implements UserService {

	@Override
	public User authorisation(String login, String password) throws ServiceException, ServiceAuthException{
		if(!Validation.validate(login, password)){
			throw new ServiceAuthException("Wrong parameters!");
		}
		
		DAOFactory daoFactory = DAOFactory.getInstance();
		UserDAO dao = daoFactory.getUserDAO();
		
		User user;
		try {
			user = dao.authorisation(login, password);
			
			if(user == null){
				throw new ServiceAuthException("Wrong login or password!");
			}
			
		} catch (DAOException e) {
			
			throw new ServiceException("Error in source!", e);
			
		}
		
		return user;
	}
	
	
	static class Validation{
		static boolean validate(String login, String password){
			if(login == null || login.isEmpty()){
				return false;
			}
			
			if(password == null || password.isEmpty()){
				return false;
			}
			
			return true;			
		}
	}

}
