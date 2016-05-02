package by.alesnax.htp3.jd01.notebook.dao.impl;

import by.alesnax.htp3.jd01.notebook.dao.CommonDao;

public class SQLCommonDao implements CommonDao{

	@Override
	public boolean authorization(String login, String password) {
		if (login.equals("alesnax")) {
			return true;
		}else{
			return false;
		}
	}

}
