package by.alesnax.htp3.jd01.lesson01.Task05;

import java.util.Scanner;

/*
 * Task_1.5
 * Вычислить корни квадратного уравнения
 */

public class Task05 {

	public static void main(String[] args) {
		double a, b, c;
		System.out.println("**** Задача на нахождение корней квадратного уравнения **** \n");
		a = enterA();
		b = enterB();
		c = enterC();
		findRes(a, b, c);
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
				System.out.println("Wrong input, please try again !");
			}
		}
		return num;
	}

	public static double enterA() {
		System.out.print("Enter value \"a\" : ");
		return enterNum();
	}

	public static double enterB() {
		System.out.print("Enter value  \"b\" : ");
		return enterNum();
	}

	public static double enterC() {
		System.out.print("Enter value  \"c\" : ");
		return enterNum();
	}

	public static void findRes(double a, double b, double c) {
		double x1, x2, d;

		d = Math.sqrt(b * b - 4 * a * c);
		System.out.print("\nRoots of equation: ");
		if (d < 0) {
			x1 = Double.NaN;
			x2 = Double.NaN;
			System.out.println("x1 = " + x1 + ", x2 = " + x2);
		} else if (d == 0) {
			System.out.println("x = " + (-1) * b / 2 / a);
		} else {
			System.out.println("x1 = " + ((-1) * b - d) / 2 / a + ", x2 = " + ((-1) * b + d) / 2 / a);
		}

	}

}
