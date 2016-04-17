package by.alesnax.htp3.jd01.lesson01.Task06;

import java.util.Scanner;

/*
 * Task_1.6
 * Для данных областей составить линейную программму, 
 * которая печатает true, если точка с координатами (х, у) 
 * принадлежит закрашенной области,  и false - в противном случае.
 */

public class Task06 {

	public static void main(String[] args) {
		double x;
		double y;
		
		x = enterX();		
		y = enterY();

		findResult(x, y);
		
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
				System.out.println("Wrong input, please try again!");
			}
		}
		return num;
	}
	
	public static void findResult(double x, double y){ 
		boolean bool = false;
		if ((x >= -2 && x <= 2 && y >= 0 && y <= 4)) {
			bool = true;
		} else if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
			bool = true;
		} else
			bool = false;
		System.out.print(bool);
		
	}
}