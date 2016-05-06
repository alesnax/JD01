package by.alesnax.htp3.jd01.notebook.service.impl;



import java.util.ArrayList;
import java.util.Scanner;

import by.alesnax.htp3.jd01.notebook.bean.Book1;
import by.alesnax.htp3.jd01.notebook.bean.Note;
import by.alesnax.htp3.jd01.notebook.bean.NoteBook;
import by.alesnax.htp3.jd01.notebook.service.NoteBookService;



public class NoteBookServiceImpl implements NoteBookService{

	@Override
	public void addNote() {
		ArrayList<NoteBook> books= Book1.getBooks();
		System.out.print("Enter note that you want to add into notebook: ");
		String note = enterNote();
		if(books.isEmpty()){
			String bookName = "first book";
			books.add(new NoteBook(bookName));
			books.get(0).addNote(note);
		}else{
			books.get(0).addNote(note);
		}
		System.out.println("Note \"" + note + "\" has successfully added into notebook!\n");
		
	}

	@Override
	public void printAllNotes() {
		ArrayList<NoteBook> books= Book1.getBooks();
		if(books.isEmpty()){
			System.out.println("There are no notebooks in  storage");
		}else{
			if(books.get(0).getNotes().isEmpty()){
				System.out.println("There are no notes in a " + books.get(0).getName() + " notebook!");
			}else {
				System.out.println("----------------------------------");
				System.out.println("THERE IS A LIST OF NOTES OF " + books.get(0).getName());
				int i = 1;
				for(Note note : books.get(0).getNotes()){
					System.out.println("Note #" + i + " : " + note.getNote());
					i++;
				}
				System.out.println("----------------------------------");
			}
		}
		
	}

	@Override
	public void findDefiniteNote() {
		System.out.print("Enter note that you want to find in notebook: ");
		String note = enterNote();
		boolean isContain = checkNote(note);
		if(isContain){
			System.out.println("NoteBook contains note: " + note);
		}else{
			System.out.println("NoteBook doesn't contains note: " + note);
		}
	}

	private boolean checkNote(String note){
		ArrayList<NoteBook> books= Book1.getBooks();
		
		if(books.isEmpty()){
			System.out.println("There are no notebooks in  storage");
		}else{
			if(books.get(0).getNotes().isEmpty()){
				System.out.println("There are no notes in a " + books.get(0).getName() + " notebook!");
			}else {				
				for(Note word : books.get(0).getNotes()){
					if((word.getNote()).equals(note)){
						return true;
					}
				}
			}
		}
		return false;
		
	}
	
	@Override
	public NoteBook getNoteBook() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	public  String enterNote() {
		String note = "";
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextLine()) {
				note = scanner.nextLine();
				break;
			} else {
				System.out.println("Incorrect input, try again!");
			}
		}
		return note;
	}
	
	
	
	
	
	
	
	
	
	
	
	
/*	@Override
	public void addNote(String note) {
		ArrayList<NoteBook> books= Book1.getBooks();
		if(books.isEmpty()){
			String bookName = "notebook_first";
			books.add(new NoteBook(bookName));
			books.get(0).addNote(note);
		}else{
			books.get(0).addNote(note);
		}
		
	}

	@Override
	public void printAllNotes() {
		ArrayList<NoteBook> books= Book1.getBooks();
		if(books.isEmpty()){
			System.out.println("There are no notebooks in  storage");
		}else{
			if(books.get(0).getNotes().isEmpty()){
				System.out.println("There are no notes in a " + books.get(0).getName() + " notebook!");
			}else {
				System.out.println("----------------------------------");
				System.out.println("THERE ARE LIST OF NOTES OF A " + books.get(0).getName());
				int i = 1;
				for(Note note : books.get(0).getNotes()){
					System.out.println("Note #" + i + " : " + note.getNote());
					i++;
				}
				System.out.println("----------------------------------");
			}
		}
		
	}

	@Override
	public boolean findDefiniteNote(String note) {
		ArrayList<NoteBook> books= Book1.getBooks();
		if(books.isEmpty()){
			System.out.println("There are no notebooks in  storage");
		}else{
			if(books.get(0).getNotes().isEmpty()){
				System.out.println("There are no notes in a " + books.get(0).getName() + " notebook!");
			}else {				
				for(Note word : books.get(0).getNotes()){
					if((word.getNote()).equals(note)){
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public NoteBook getNoteBook() {
		// TODO Auto-generated method stub
		return null;
	}*/



}

















