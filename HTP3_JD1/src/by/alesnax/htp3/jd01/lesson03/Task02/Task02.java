package by.alesnax.htp3.jd01.lesson03.Task02;

import java.util.Scanner;

/*
 * Task_3.2
 * Задана последователность N целых чисел.Вычислить сумму элементов 
 * массива, порядковые номера которых совпадают со значением этого элемента.
*/
public class Task02 {

	public static void main(String[] args) {

		int len = enterNum();
		int[] arr = createRandomArray(len);
		print(arr);
		print(findSumElem(arr));

	}

	public static void print(int num) {
		System.out.println("Sum of elements which numbers is equal its value = " + num);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
	}

	public static int findSumElem(int[] arrEnt) {
		int sum = 0;
		for (int i = 0; i < arrEnt.length; i++) {
			if (arrEnt[i] == i) {
				sum += i;
			}
		}
		return sum;
	}

	public static int[] createRandomArray(int numElem) {
		int[] arr = new int[numElem];
		for (int i = 0; i < numElem; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		return arr;
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

}
