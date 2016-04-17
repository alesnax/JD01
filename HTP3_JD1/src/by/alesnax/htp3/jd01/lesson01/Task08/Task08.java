package by.alesnax.htp3.jd01.lesson01.Task08;

import java.util.Scanner;

/*
 * Task_1.8 
 * Даны три положительных числа.
 * Определить, можно ли построить треугольник со сторонами, 
 * длины которых равны этим числам.
 */

public class Task08 {

	public static void main(String[] args) {
		double a = enterA();
		double b = enterB();
		double c = enterC();
		checkTriangle(a, b, c);
	}

	public static double enterA() {
		System.out.print("Enter value of a size: ");
		return enterNum();
	}

	public static double enterB() {
		System.out.print("Enter value of b size: ");
		return enterNum();
	}

	public static double enterC() {
		System.out.print("Enter value of c size: ");
		return enterNum();
	}

	public static double enterNum() {
		double num = 0;
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextDouble()) {
				num = scanner.nextDouble();
				if (num > 0) {
					break;
				} else {
					System.out.print("Entered negative value or 0 !");
				}
			} else {
				System.out.println("Wrong input, please try again!");
			}
		}
		return num;
	}

	public static void checkTriangle(double x, double y, double z) {
		double max = 0;
		System.out.println();
		if (x > max)
			max = x;
		if (y > max)
			max = y;
		if (z > max)
			max = z;
		if ((x + y + z - max * 2) > 0)
			System.out.println("You can build triangle with these sizes.");
		else
			System.out.println("Sorry! You can't build triangle with these sizes.");
	}

}
