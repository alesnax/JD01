package by.alesnax.htp3.jd01.lesson07.Task01.Command.Impl;

import by.alesnax.htp3.jd01.lesson07.Task01.Command.Command;
import by.alesnax.htp3.jd01.lesson07.Task01.bean.Fraction;
import by.alesnax.htp3.jd01.lesson07.Task01.bean.Request;
import by.alesnax.htp3.jd01.lesson07.Task01.bean.Responce;
import by.alesnax.htp3.jd01.lesson07.Task01.service.FractionService;
import by.alesnax.htp3.jd01.lesson07.Task01.service.ServiceFactory;

public class SubtractFractionsCommand implements Command {

	@Override
	public Responce execute(Request request) {
		
		ServiceFactory factory = ServiceFactory.getInstance();
		FractionService service = factory.getFractionService();
		
		System.out.println("There is 2 fractions subtraction operation");
		Fraction result = service.subFraction();
		
		Responce responce = new Responce();
		responce.setErrorMessage("");
		responce.setMessage(result.getDescribeAction());
		responce.setResult(result);
		System.out.println(responce.getMessage());
		
		return responce;
	}
}
