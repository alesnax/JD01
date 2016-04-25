package by.alesnax.htp3.jd01.lesson05.Task02;


/*
 * Task5.2
 * 1. Create class Note and class NoteBook
 * 2. Implement addNote method to Notebook, printConcole all the Book method, 
 *     finding definite Note in NoteBook
 */

public class Main {

	public static void main(String[] args) {

		
		NoteBook usedBook = new NoteBook("usedBook");
		usedBook.addNote("это был замечательный день");
		usedBook.addNote("James Bonde was a very strange person");
		
		usedBook.printAll();
		usedBook.findNote("это был замечательный день");
		usedBook.findNote("что-то невероятное");
	}

}
