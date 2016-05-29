package by.alesnax.hotel.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import by.alesnax.hotel.dao.impl.pool.ConnectionPool;
import by.alesnax.hotel.dao.impl.pool.ConnectionPoolException;

public class HotelContextCreateListener implements ServletContextListener {

	private ConnectionPool pool;
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		pool.destroyPool();	
		System.out.println("tyta2");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		try {
			pool = ConnectionPool.getInstance();
			pool.init2();
			System.out.println("tyta");
		} catch (ConnectionPoolException e) {
			throw new RuntimeException("JDBC Driver error", e);
		}

	
	}

}
