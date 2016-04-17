package by.alesnax.htp3.jd01.lesson03.Task06;

import java.util.Scanner;

/*
 * Task_3.6
 * Дан массив X[N] целых чисел. Не используя других массивов, переставить
 * его элементы в обратном порядке.
 */

public class Task6 {

	public static void main(String[] args) {
		int[] ar = createRandomArray(enterNum());
		print(ar);
		swap(ar);
		print(ar);
	}

	public static int[] swap(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
	}

	public static int enterNum() {
		int num = 0;
		while (true) {
			System.out.print("Enter number of elements: ");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				if (num > 0) {
					break;
				} else {
					System.out.println("Negative value or 0, please try again!");
				}
			} else {
				System.out.println("Incorrect input, try again!");
			}
		}
		return num;
	}
	
	public static int[] createRandomArray(int numElem){
		int[] arr = new int[numElem];
		for (int i = 0; i < numElem; i++) { 
			arr[i] = (int) (Math.random() * 30);
		}
		return arr;
	}
}
