package by.alesnax.htp3.jd01.notebook.bean;

public class Request {
	private String commandName;
	private String login;
	private String password;
	private String note;
	private NoteBook notebook;
	
	
	public Request(){
	}
	
	public Request(String note) {
		this.note = note;
	}

	public NoteBook getNotebook() {
		return notebook;
	}

	public void setNotebook(NoteBook notebook) {
		this.notebook = notebook;
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

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
