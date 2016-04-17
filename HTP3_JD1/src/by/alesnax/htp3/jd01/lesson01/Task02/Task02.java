package by.alesnax.htp3.jd01.lesson01.Task02;

import java.util.Scanner;

/*
 * Task_1.2
 * Вычислить значение выражения по формуле(все переменные принимают действительные значения):
 */

public class Task02 {
	public static void main(String[] args) {

		double x = enterX();
		double y = enterY();
		double res = findResult(x, y);
		print(res);
	}

	public static double enterX() {
		System.out.println("Введите значение x: ");
		return enterNum();
	}

	public static double enterY() {
		System.out.print("Введите значение y: ");
		return enterNum();
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
				System.out.println("Введенно некорректное значение, попробуйте еще раз!");
			}
		}
		return num;
	}

	public static double findResult(double x, double y) {
		double num = (Math.sin(x + y)) * (Math.sin(x + y));
		double denom = 2 + Math.abs(x - (2 * x / (1 + x * x * y * y)));
		return (1 + num * num) / denom + x;
	}

	public static void print(double res) {
		System.out.println("Результат выражения: " + res);
	}
}
