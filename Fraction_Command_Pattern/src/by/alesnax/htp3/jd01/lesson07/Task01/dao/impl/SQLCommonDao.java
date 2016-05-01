package by.alesnax.htp3.jd01.lesson07.Task01.dao.impl;

import by.alesnax.htp3.jd01.lesson07.Task01.dao.CommonDao;

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
