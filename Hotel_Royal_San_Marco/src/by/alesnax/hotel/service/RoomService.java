package by.alesnax.hotel.service;

import by.alesnax.hotel.service.exception.ServiceException;

public interface RoomService {
	
	void addNewRoom(String type, String price_a_day)  throws ServiceException;

}
