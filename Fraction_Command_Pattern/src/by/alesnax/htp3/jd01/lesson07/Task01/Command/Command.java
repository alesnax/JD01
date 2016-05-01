package by.alesnax.htp3.jd01.lesson07.Task01.Command;

import by.alesnax.htp3.jd01.lesson07.Task01.bean.Request;
import by.alesnax.htp3.jd01.lesson07.Task01.bean.Responce;

public interface Command {
	Responce execute(Request request);
}
