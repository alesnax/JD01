package by.alesnax.hotel.service;

import by.alesnax.hotel.bean.User;
import by.alesnax.hotel.service.exception.ServiceException;

public interface UserService {

	User authorisation(String login, String password) throws ServiceException;
}
