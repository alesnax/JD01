package by.alesnax.htp3.jd01.lesson03.Task03;

import java.util.Scanner;

/*
 * Task_3.3
 * Определить, сколько процентов от всего количества элементов 
 * последовательности целых чисел составляют нечетные элементы.
 */

public class Task3 {

	public static void main(String[] args) {
		int numElem = enterNum();
		int[] arr = createRandomArray(numElem);
		print(arr);
		print(findSumElem(arr));
	}

	public static void print(double percent) {
		System.out.println("quantity of odd elements = " + percent + " %.");
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
	}

	public static double findSumElem(int[] arrEnt) {
		int oddElemNum = 0;
		for(int i = 0; i < arrEnt.length; i++){
			if(arrEnt[i]%2 ==1){
				oddElemNum++;
			}
		}
		return (double)oddElemNum / arrEnt.length * 100;
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
