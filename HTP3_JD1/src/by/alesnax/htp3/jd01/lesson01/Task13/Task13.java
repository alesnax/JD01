package by.alesnax.htp3.jd01.lesson01.Task13;

import java.util.Scanner;

/*
 * Task_1.13
 * Вычислить значение функции:
 */

public class Task13 {

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
		if (x <= 3)
			res = x * x + 3 * x + 9;
		else
			res = Math.sin(x) / (x * x - 9);
		return res;
	}

	public static void print(double res) {
		System.out.println("Value of function is = " + res);
	}
}
