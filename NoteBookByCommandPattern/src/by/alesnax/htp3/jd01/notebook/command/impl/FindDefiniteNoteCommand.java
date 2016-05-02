package by.alesnax.htp3.jd01.notebook.command.impl;


import by.alesnax.htp3.jd01.notebook.bean.Request;
import by.alesnax.htp3.jd01.notebook.bean.Responce;
import by.alesnax.htp3.jd01.notebook.command.Command;
import by.alesnax.htp3.jd01.notebook.service.NoteBookService;
import by.alesnax.htp3.jd01.notebook.service.ServiceFactory;

public class FindDefiniteNoteCommand implements Command {

	@Override
	public Responce execute(Request request) {
		
		ServiceFactory factory = ServiceFactory.getInstance();
		NoteBookService service = factory.getNoteBookService();
		service.findDefiniteNote(/*request.getNote()*/);
	
		Responce responce = new Responce();
		responce.setErrorMessage(null);
		
		
		/*responce.setContainsNote(isFind);
		if(isFind){
			responce.setMessage("NoteBook contains note: " + request.getNote());
		}else{
			responce.setMessage("NoteBook doesn't contain note: " + request.getNote());
		}*/
		
		return responce;
	}
}
