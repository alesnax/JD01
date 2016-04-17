package by.alesnax.htp3.jd01.lesson01.Task12;

import java.util.Scanner;

/*
 * Task_1.12
 * Вычислить значение функции:
 */

public class Task12 {

	public static void main(String[] args) {
		double x = enterNum();
		double res = findSol(x);
		print(res);
	}

	public static double enterNum() {
		double num = 0;
		while (true) {
			System.out.print("Enter x: ");
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

	public static double findSol(double x) {
		double res;
		if (x >= 0 && x <= 3) {
			res = x * x;
		} else {
			res = 4;
		}
		return res;
	}

	public static void print(double res) {
		System.out.println("Value of function is = " + res);
	}
}
