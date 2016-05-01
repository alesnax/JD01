package by.alesnax.htp3.jd01.lesson07.Task01.bean;

public class Request {

	private String commandName;
	private String login;
	private String password;

	public Request() {
	}

	public Request(String commandName) {
		this.commandName = commandName;
	}

	public Request(String commandName, String title, String login, String password) {
		super();
		this.commandName = commandName;
		this.login = login;
		this.password = password;
	}

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
