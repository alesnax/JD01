package by.alesnax.hotel.dao;

import by.alesnax.hotel.dao.exception.DAOException;

public interface RoomDAO {
	void addNewRoom(String type, String price_a_day) throws DAOException;
}
