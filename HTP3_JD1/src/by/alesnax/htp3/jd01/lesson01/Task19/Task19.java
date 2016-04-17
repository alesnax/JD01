package by.alesnax.htp3.jd01.lesson01.Task19;
import java.util.Scanner;

/*
 * Task_1.19
 * Дана длина ребра куба.
 * Найти площадь грани, площадь 
 * полной поверхности и объем этого куба.
 */

public class Task19 {

	public static void main(String[] args) {
		double len = enterA();
		edgeSquare(len);
		surfaceArea(len);
		volume(len);
	}
	
	public static double enterA(){
		double num ;
		System.out.print("Enter value of cube's edge: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextDouble()) {
				num = scanner.nextDouble();
				break;
			} else {
				System.out.println("Incorrect input, please try again!");
			}
		}
		return num;
	}
	
	
	public static void edgeSquare(double len){
		System.out.println("edgeSquare \t= " + len * len + " \tm2");
	}
	
	public static void surfaceArea(double len){
		System.out.println("surfaceArea \t= " + len * len * 6 + " \tm2");
	}
	
	public static void volume(double len){
		System.out.println("volume of Cube \t= " + len * len * len + " \tm3");
	}
}
