package by.alesnax.hotel.dao;

import by.alesnax.hotel.dao.impl.SQLRoomDAO;
import by.alesnax.hotel.dao.impl.SQLUserDAO;

public final class DAOFactory {

	private static final DAOFactory instance = new DAOFactory();

	private UserDAO userDAO = new SQLUserDAO();
	private RoomDAO roomDAO = new SQLRoomDAO();
	
	private DAOFactory(){}
	
	
	public UserDAO getUserDAO(){
		return userDAO;
	}
	
	public RoomDAO getRoomDAO(){
		return roomDAO;
	}
	
	
	public static DAOFactory getInstance(){
		return instance;
	}
	
}
