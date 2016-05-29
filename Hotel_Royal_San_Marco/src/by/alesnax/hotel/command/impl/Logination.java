package by.alesnax.hotel.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.alesnax.hotel.bean.User;
import by.alesnax.hotel.command.Command;
import by.alesnax.hotel.command.util.QueryUtil;
import by.alesnax.hotel.service.ServiceFactory;
import by.alesnax.hotel.service.UserService;
import by.alesnax.hotel.service.exception.ServiceAuthException;
import by.alesnax.hotel.service.exception.ServiceException;

public class Logination implements Command{
	private static final String LOGIN = "login";
	private static final String PASSWORD = "password";
	

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String login = request.getParameter(LOGIN);
		String password = request.getParameter(PASSWORD);
		
		UserService userService = ServiceFactory.getInstance().getUserService();

		String query = QueryUtil.createHttpQueryString(request);
		request.getSession(true).setAttribute("prev_query", query);
		
		
		System.out.println(query);
		
		
		try {
			User user = userService.authorisation(login, password);
			
			request.setAttribute("user", user);
			
			request.getRequestDispatcher("/WEB-INF/jsp/user.jsp").forward(request, response);
		} catch (ServiceAuthException e) {
			
			request.setAttribute("errorMessage", "Wrong login or password");
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}  catch (ServiceException e) {
			request.getRequestDispatcher("error.jsp").forward(request, response);		
		}
		
		
	}
	
	
	
	

}
