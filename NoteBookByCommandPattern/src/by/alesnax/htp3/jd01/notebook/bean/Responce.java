package by.alesnax.htp3.jd01.notebook.bean;

public class Responce {
	
	private NoteBook noteBook;
	private String name;
	private String errorMessage;
	private String message;
	private boolean containsNote;
	private static boolean activate;

	public Responce() {
	}

	public boolean isActivate() {
		return activate;
	}

	public void setActivate(boolean isActivate) {
		activate = isActivate;
	}
	
	public NoteBook getNoteBook() {
		return noteBook;
	}
	public void setNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isContainsNote() {
		return containsNote;
	}
	public void setContainsNote(boolean containsNote) {
		this.containsNote = containsNote;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
