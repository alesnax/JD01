package by.alesnax.htp3.jd01.notebook.bean;

import java.util.ArrayList;

public class NoteBook {
	
	private String name;
	private ArrayList<Note> notes;
	
	public NoteBook(){
	}
	
	public NoteBook(String name) {
		this.name = name;
		this.notes = new ArrayList<Note>();
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}
	
	public void addNote(String note){
		this.notes.add(new Note(note));
	}
}
