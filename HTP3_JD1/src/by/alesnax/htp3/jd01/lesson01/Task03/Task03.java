package by.alesnax.htp3.jd01.lesson01.Task03;

import java.util.Scanner;

/*
 * Task_1.3
 * Найти произведение цифр заданного четырехзначного числа
 */

public class Task03 {
	public static void main(String[] args) {

		int num = enterNum();
		int res = findRes(num);
		print(res);
	}

	public static int enterNum() {
		System.out.print("Введите положительное четырехзначное число: ");
		int num;
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				if ((num / 1000) >= 1 && (num / 1000) < 10)
					break;
				else {
					System.out.println("Число не входит в заданный диапозон!");
				}
			} else {
				System.out.println("Введено некорректное значение, повторите ввод!");
			}
		}
		return num;
	}

	public static int findRes(int num) {
		int a1 = num % 10;
		int a2 = num % 100 / 10;
		int a3 = num % 1000 / 100;
		int a4 = num / 1000;
		return a1 * a2 * a3 * a4;
	}

	public static void print(int res) {
		System.out.println("Произведение цифр заданного числа: " + res);
	}

}