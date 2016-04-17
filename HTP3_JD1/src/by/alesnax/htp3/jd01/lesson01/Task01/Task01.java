package by.alesnax.htp3.jd01.lesson01.Task01;

/*
 * Task_1.1
 * Вычислить значение выражения по формуле(все переменные принимают действительные значения):
 */

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		double x;
		double res;
		x = enterX();
		res = findResult(x);
		print(res);
	}

	public static double enterX() {
		double x = 0;
		System.out.print("Введите x: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextDouble()) {
				x = scanner.nextDouble();
				break;
			} else {
				System.out.println("Введенно некорректное значение, попробуйте еще раз!");
				System.out.print("Введите x: ");
			}
		}
		return x;
	}

	public static double findResult(double x) {
		return x - x * x * x / 3 + x * x * x * x * x / 5;
	}

	public static void print(double res) {
		System.out.println("Результат выражения: " + res);
	}
}
