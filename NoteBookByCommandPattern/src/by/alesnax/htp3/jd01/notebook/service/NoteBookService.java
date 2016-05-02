package by.alesnax.htp3.jd01.notebook.service;

import by.alesnax.htp3.jd01.notebook.bean.NoteBook;

public interface NoteBookService {

	void addNote();
	void printAllNotes();
	void findDefiniteNote();
	NoteBook getNoteBook();	
}

