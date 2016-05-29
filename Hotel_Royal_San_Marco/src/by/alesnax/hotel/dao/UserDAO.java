package by.alesnax.hotel.dao;

import by.alesnax.hotel.bean.User;
import by.alesnax.hotel.dao.exception.DAOException;

public interface UserDAO {
	User authorisation(String login, String password) throws DAOException;
}
