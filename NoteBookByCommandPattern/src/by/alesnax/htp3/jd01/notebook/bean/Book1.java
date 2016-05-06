package by.alesnax.htp3.jd01.notebook.bean;

import java.util.ArrayList;

public final class Book1 extends NoteBook{

	private static ArrayList<NoteBook> books; 

	private Book1(){}
	
	public static ArrayList<NoteBook> getBooks(){
		if(books == null){
			books = new ArrayList<NoteBook>();
		}
		return books;
	}
	
	
	/*public static ArrayList<NoteBook> getBooks() {
		return books;
	}*/

	public static void setBook(NoteBook book) {
		books.add(book);
	}
	
	
	
	
	
	
	
}
