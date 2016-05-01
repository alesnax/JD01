package by.alesnax.htp3.jd01.lesson05.Task02;

import java.util.ArrayList;

public class NoteBook {
	
	private String name;
	private ArrayList<Note> notes;
	
	public NoteBook(String name) {
		this.name = name;
		this.notes = new ArrayList<Note>();
	}
	
	/*public NoteBook(String name, ArrayList<Note> notes) {
		this.name = name;
		this.notes = notes;
	}
*/
	public String getName() {
		return name;
	}


	public ArrayList<Note> getNotes() {
		return notes;
	}

	/*private void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}*/
	
	public void addNote(String note){
		this.notes.add(new Note(note));
	}
	
	public void printAll(){
		System.out.println("Печать всех записей: ");
		for(int i = 0; i < this.notes.size(); i++){
			System.out.println("Note_" + (i + 1) + ": \"" + this.notes.get(i).getNote() + "\"");
		}
		System.out.println();
	}
	
	public void findNote(String note){
		boolean b = false;
		int num = 0;
		for(int i = 0; i < this.notes.size(); i++){
			if((this.notes.get(i).getNote()).equals(note)){
				b = true;
				num = i;
			}
		}
		if(b){
			System.out.println("Номер записи \"" + note + "\" - " + (num + 1));
		}else{
			System.out.println("Записи \"" + note + "\" в блокноте нет!");
		}
	}
}
