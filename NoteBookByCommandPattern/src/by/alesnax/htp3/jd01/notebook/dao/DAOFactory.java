package by.alesnax.htp3.jd01.notebook.dao;

import by.alesnax.htp3.jd01.notebook.dao.impl.SQLCommonDao;


public class DAOFactory {
private static final DAOFactory factory = new DAOFactory();
	
	private final CommonDao commonDao = new SQLCommonDao();
	
	
	private DAOFactory(){}
	
	public static DAOFactory getInstance(){
		return factory;
	}

	public CommonDao getCommonDao() {
		return commonDao;
	}

	
}
