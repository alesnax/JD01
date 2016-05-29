package by.alesnax.hotel.service;

import by.alesnax.hotel.service.impl.RoomServiceImpl;
import by.alesnax.hotel.service.impl.UserServiceImpl;

public class ServiceFactory {
	
	private static final ServiceFactory instance = new ServiceFactory();
	
	
	private UserService userService = new UserServiceImpl();
	private RoomService roomService = new RoomServiceImpl();
	
	public static ServiceFactory getInstance(){
		return instance;
	}
	

	public UserService getUserService(){
		return userService;
	}
	
	public RoomService getRoomService(){
		return roomService;
	}
}
