package by.alesnax.htp3.jd01.lesson01.Task21;

import java.util.Scanner;

/*
 * Task_1.21
 * Вычислить значение F(x) на отрезке [a, b] с щагом h.
 * Результат ввиде таблицы.
 * F(x) = x sin(x) 
 */

public class Task21 {

	public static void main(String[] args) {
		double a = enterA();
		double b = enterB(a);
		double step = enterStep(a, b);
		printRes(a, b, step);
	}

	public static double enterA() {
		System.out.print("Enter a : ");
		return enterNum();
	}

	public static double enterB(double a) {
		double b;
		System.out.print("Enter B: ");
		while (true) {
			b = enterNum();
			if (b > a) {
				break;
			} else {
				System.out.print("B cannot be less than A, please try input once again!");
			}
		}
		return b;
	}

	public static double enterNum() {
		double num;
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextDouble()) {
				num = scanner.nextDouble();
				break;
			} else {
				System.out.println("Incorrect input, try again!");
			}
		}
		return num;
	}

	public static double enterStep(double a, double b) {
		double step;
		System.out.print("Enter step: ");
		while (true) {
			step = enterNum();
			if (step < (b - a)) {
				break;
			} else {
				System.out.print("Step cannot be greater than interval, try input again: ");
			}
		}
		return step;
	}

	public static void printRes(double a, double b, double step) {
		double res = 0;
		System.out.println("*******************************************");
		System.out.printf("%s %12s %7s %12s   %5s  %n", "|", "F(x)", "|", "x", "|");
		System.out.println("*******************************************");

		for (double i = a; i <= b; i = i + step) {
			res = i * Math.sin(i);
			System.out.printf("%s  %10.2f  %7s  %12.5f  %5s %n", "|", i, "|", res, "|");
			// System.out.println("\t" + i + "\t" + res);
		}
		System.out.println("*******************************************");
	}
}