package by.alesnax.htp3.jd01.lesson05.Task01.Calculator;

public class Print {
	
	public static void printGreeting(){
		System.out.println("Hello! It's a calculator for simplefractions computing! \n\t\tYou're welcome! ");
		System.out.println();
	}

	public static void instruction(){
		System.out.print("Enter expression: ");
	}
	public static void print(Fraction f){
		System.out.println(f.getNum() + "/" + f.getDen());
	}
}
