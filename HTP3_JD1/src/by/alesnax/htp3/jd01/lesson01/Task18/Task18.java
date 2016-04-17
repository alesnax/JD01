package by.alesnax.htp3.jd01.lesson01.Task18;

import java.util.Scanner;

/*
 * Task_1.18
 * Треугольник со сторонами a, b, c является равносторонним
 */

public class Task18 {
	public static void main(String[] args) {
		double a = enterNum();
		double b = enterNum();
		double c = enterNum();
		boolean comp = checkTriang(a, b, c);
		print(comp);
	}

	public static double enterNum() {
		double num = 0;
		System.out.println("Enter value of size:");
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextDouble()) {
				num = scanner.nextDouble();
				break;
			} else {
				System.out.println("Incoorect input, please try again!");
			}
		}
		return num;
	}

	public static boolean checkTriang(double a, double b, double c) {
		boolean comp = false;
		if (a == b && b == c && a == c)
			comp = true;
		return comp;
	}

	public static void print(boolean comp) {
		if (comp == true) {
			System.out.println("Треугольник - равносторонний.");
		} else {
			System.out.println("Треугольник - не равносторонний.");
		}
	}
}
