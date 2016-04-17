package by.alesnax.htp3.jd01.lesson01.Task04;
import java.util.Scanner;

/*
 * Task_1.4
 * Даны два действительных числа x и y, 
 * вычислить их сумму, разность, произведение и частное.
 */

public class Task04 {

	public static void main(String[] args) {
		double x;
		double y;
		
		x = enterX();		//ввод чисел
		y = enterY();
		
		add(x, y);			//addition
		subt(x, y);			//subtraction
		mult(x, y);			//multiplication
		div(x, y);			//division
		
	}

	public static double enterX(){
		System.out.print("Enter x: ");
		return enterNum();
	}
	
	public static double enterY(){
		System.out.print("Enter y: ");
		return enterNum();
	}
	
	public static double enterNum() {

		double num = 0;
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextDouble()) {
				num = scanner.nextDouble();
				break;
			} else {
				System.out.println("You've entered wrong value, please repeat input!");
			}
		}
		return num;
	}

	public static void add(double x, double y) {
		System.out.println("addition result \t=\t " + " " + (x + y));
	}
	public static void subt(double x, double y) {
		System.out.println("subtraction result \t=\t " + (x - y));
	}
	public static void mult(double x, double y) {
		System.out.println("multiplication result\t=\t " + x * y);
	}
	public static void div(double x, double y) {
		System.out.println("division result \t=\t " + x / y);
	}

	
}
