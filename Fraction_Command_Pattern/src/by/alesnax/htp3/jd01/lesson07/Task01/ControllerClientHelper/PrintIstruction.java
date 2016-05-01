package by.alesnax.htp3.jd01.lesson07.Task01.ControllerClientHelper;

public class PrintIstruction {
	
	public static void hello(){
		System.out.println("Hello! This is a program for computing fractions!");
	}
	
	public static void login(){
		System.out.println("Please enter your Login and Password: ");
	}
	
	public static void instruction(){
		System.out.println("For addition two fractions, please press '1' button");
		System.out.println("For subtraction two fractions, please press '2' button");
		System.out.println("For multiplying two fractions, please press '3' button");
		System.out.println("For division two fractions, please press '4' button");
		System.out.println("Press default button to escape into main Menu");
	}
	
	public static void exit(){
		System.out.println("Thank you for choosing our programm!");
	}
	
	public static void exitMenu(){
		System.out.println("You've escaped into main menu!");
	}
	
}
