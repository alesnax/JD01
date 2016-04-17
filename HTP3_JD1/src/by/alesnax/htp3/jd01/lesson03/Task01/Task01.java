package by.alesnax.htp3.jd01.lesson03.Task01;

import java.util.Scanner;

/*
 * Task_3.1
 * В целочисленной последовательности еть нулевые элементы.
 * Создать массив из номеров этих элементов. 
*/
public class Task01 {
	public static void main(String[] args) {
		int len = enterNum();
		int[] arr = createRandomArray(len);
		print(arr);
		int[] nullArr = findNullElemInd(arr);
		print(nullArr);
	}

	public static int[] findNullElemInd(int[] arrEnt) {
		int[] arr = new int[arrEnt.length];
		int arrNum = 0;
		for (int i = 0; i < arrEnt.length; i++) {
			if (arrEnt[i] == 0) {
				arr[arrNum] = i;
				arrNum++;
			}
		}
		int[] arrNullEl = new int[arrNum];
		for (int i = 0; i < arrNullEl.length; i++) {
			arrNullEl[i] = arr[i];
		}
		return arrNullEl;
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("arr[" + i + "] = " + array[i]);
		}
		System.out.println();
	}

	public static int[] createRandomArray(int numElem) {
		int[] arr = new int[numElem];
		for (int i = 0; i < numElem; i++) {
			arr[i] = (int) (Math.random() * 30);
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
					System.out.println("Negative value or 0");
				}
			} else {
				System.out.println("Incorrect input, try again!!");
			}
		}
		return num;
	}
}

