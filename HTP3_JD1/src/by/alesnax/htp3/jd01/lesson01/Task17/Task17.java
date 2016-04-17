package by.alesnax.htp3.jd01.lesson01.Task17;

import java.util.Scanner;

/*
 * Task_1.17
 * Целое число N является четным двузначным числом
 */

public class Task17 {

	public static void main(String[] args) {
		int a = enterNum();
		boolean b = checkA(a);
		print(b);
	}

	public static int enterNum() {
		int num = 0;
		System.out.println("Enter 2-digit number:");
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				break;
			} else {
				System.out.println("Incorrect input, please try again!");
			}
		}
		return num;
	}

	public static boolean checkA(int a) {
		boolean b = false;
		if (Math.abs(a) > 9 && Math.abs(a) < 100 && a % 2 == 0) {
			b = true;
		}
		return b;
	}

	public static void print(boolean b) {
		if (b == false) {
			System.out.println("Number is not even, 2-digit!"); // even - четное
		} else {
			System.out.println("Number is even, 2-digit!");
		}

	}
}
