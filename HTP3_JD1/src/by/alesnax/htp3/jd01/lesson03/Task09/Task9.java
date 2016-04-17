package by.alesnax.htp3.jd01.lesson03.Task09;

import java.util.Random;
import java.util.Scanner;

/*
 * Даны две неубывающие последовательности.
 * Объединить их, чтобы получилась одна неубывающая последовательность.
 */

public class Task9 {

	public static void main(String[] args) {
		int[] masA = new int[enterNum()];
		enterEncreaseArrayWithRandom(masA);
		printArray(masA);
		int[] masB = new int[enterNum()];
		enterEncreaseArrayWithRandom(masB);
		printArray(masB);

		int[] masC = commonGrowMas(masA, masB);
		printArray(masC);

	}

	public static int[] commonGrowMas(int[] masA, int[] masB) {
		int[] masC = new int[masA.length + masB.length];
		System.out.println("Объединеная последовательность: ");
		int m = 0;
		int n = 0;
		for (int i = 0; i < masC.length; i++) {
			if (m < masA.length && n < masB.length) {
				if (masA[m] < masB[n]) {
					masC[i] = masA[m];
					m++;
				} else {
					masC[i] = masB[n];
					n++;
				}
			}else if(m < masA.length && n == masB.length){
				masC[i] = masA[m];
				m++;
			}else{
				masC[i] = masB[n];
				n++;
			}
		}
		return masC;
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

	public static void enterEncreaseArrayWithRandom(int[] mas) {
		Random rand = new Random();
		mas[0] = rand.nextInt(50);
		for (int i = 1; i < mas.length; i++) {
			mas[i] = mas[i - 1] + rand.nextInt(10);
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
}
