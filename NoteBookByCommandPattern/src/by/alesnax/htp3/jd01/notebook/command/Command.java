package by.alesnax.htp3.jd01.notebook.command;

import by.alesnax.htp3.jd01.notebook.bean.Request;
import by.alesnax.htp3.jd01.notebook.bean.Responce;

public interface Command {
	Responce execute(Request request);
}
