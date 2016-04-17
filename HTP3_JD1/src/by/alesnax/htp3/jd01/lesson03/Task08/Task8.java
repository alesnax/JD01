package by.alesnax.htp3.jd01.lesson03.Task08;

import java.util.Random;

/*
 * Task_3.8
 * Даны два одномерных массива с различным количеством элементов и натуралное число k.
 * Объединить их в один масив, включив второй масив между k-м (k+1)-м элементами первого 
 */

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int[] masA = new int[enterNum()];
		enterArrayWithRandom(masA);
		printArray(masA);
		
		int[] masB = new int[enterNum()];
		enterArrayWithRandom(masB);
		printArray(masB);
		
		int k = enterRandomNum(masA.length);
		int[] masC = insertMasB(masA, masB, k);
		printArray(masC);
	}

	public static int enterNum() {
		int num = 0;
		while (true) {
			System.out.print("Enter number of elements: ");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				if (num > 0)
					break;
				else
					System.out.println("Negative number or 0, try input again");
			} else {
				System.out.println("Incorrect input, try again!");
			}
		}
		return num;
	}

	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(200);
		}
	}

	public static void printArray(int[] mas) {
		System.out.println("-------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.println("mas[" + i + "] = " + mas[i] + ";");
		}
		System.out.println();
		System.out.println("-------------------------------------");
	}

	public static int enterRandomNum(int len) {
		Random rand = new Random();
		int k = rand.nextInt(len);
		System.out.println("Value of k = " + k);
		return k;
	}

	public static int[] insertMasB(int[] masA, int[] masB, int k) {
		int[] masC = new int[masA.length + masB.length];
		for (int i = 0; i < k; i++) {
			masC[i] = masA[i];
		}
		for (int i = k; i < k + masB.length; i++) {
			masC[i] = masB[i - k];
		}
		for (int i = k + masB.length; i < masC.length; i++) {
			masC[i] = masA[k + i - k - masB.length];
		}
		return masC;
	}

}
