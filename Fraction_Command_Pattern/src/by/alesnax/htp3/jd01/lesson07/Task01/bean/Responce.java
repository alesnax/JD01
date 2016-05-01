package by.alesnax.htp3.jd01.lesson07.Task01.bean;

public class Responce {
	private Fraction result;
	private String errorMessage;
	private String message;
	private static boolean activate;

	public Responce() {
	}

	public boolean isActivate() {
		return activate;
	}

	public void setActivate(boolean isActivate) {
		activate = isActivate;
	}

	public Fraction getResult() {
		return result;
	}

	public void setResult(Fraction result) {
		this.result = result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void printResult() {
		System.out.println(message);
	}
}
