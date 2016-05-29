package by.alesnax.hotel.service.impl;

import by.alesnax.hotel.dao.DAOFactory;
import by.alesnax.hotel.dao.RoomDAO;
import by.alesnax.hotel.dao.exception.DAOException;
import by.alesnax.hotel.service.RoomService;
import by.alesnax.hotel.service.exception.ServiceException;

public class RoomServiceImpl implements RoomService {

	@Override
	public void addNewRoom(String type, String price_a_day) throws ServiceException {
		if (type == null || type.isEmpty()) {
			throw new ServiceException("add new room exception");
		}

		if (price_a_day == null || price_a_day.isEmpty()) {
			throw new ServiceException("add new room exception");
		}

		DAOFactory daoFactory = DAOFactory.getInstance();
		RoomDAO dao = daoFactory.getRoomDAO();

		try {
			dao.addNewRoom(type, price_a_day);
		} catch (DAOException e) {
			throw new ServiceException("Error in source!", e);

		}

	}

}
