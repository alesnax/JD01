package by.alesnax.hotel.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import by.alesnax.hotel.bean.User;
import by.alesnax.hotel.dao.UserDAO;
import by.alesnax.hotel.dao.exception.DAOException;
import by.alesnax.hotel.dao.impl.pool.ConnectionPool;
import by.alesnax.hotel.dao.impl.pool.ConnectionPoolException;

public class SQLUserDAO implements UserDAO {

	// private static final String AUTH_QUERY = "select * from user where
	// login=\""+login+"\" and password=\""+password+"\"";

	@Override
	public User authorisation(String login, String password) throws DAOException {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			con = ConnectionPool.getInstance().takeConnection();

			st = con.prepareStatement("select * from user where login=? and password=?");
	
			st.setString(1, login);
			st.setString(2, password);
			
			rs = st.executeQuery();

			if (!rs.next()) {
				return null;
			}

			User user = new User();
			user.setName(rs.getString("name"));
			user.setSurname(rs.getString("surname"));

			return user;
			
		}  catch (SQLException e) {
			throw new DAOException("Logination sql error..", e);
		} catch (ConnectionPoolException e) {
			throw new DAOException("pool exception", e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// logging
				}
			}

			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// logging
				}
			}
			try {
				ConnectionPool.getInstance().returnConnection(con);
			} catch (ConnectionPoolException e) {
				//loggin error
			}

		}

	}

}
