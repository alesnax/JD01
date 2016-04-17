package by.alesnax.htp3.jd01.lesson03.Task07;

import java.util.Random;
import java.util.Scanner;

/*
 * Дана целочисленная таблица А[N]
 * Найти наименьшее число k элементов, которые можно выкинуть из данной 
 * последовательности, так чтобы осталась возрастающая последовательность.
 * 
 * */

//ВИДИМО У МЕНЯ НЕВЕРНОЕ ТОЛКОВАНИЕ ЗАДАЧИ

public class Task7 {

	public static void main(String[] args) {
		int[] mas = new int[enterNum()]; // создание массива, количество
											// элементов вводится с клавиатуры
		enterArrayWithRandom(mas); // инициализация элементов случайными числами
									// в заднном диапазоне
		printArray(mas); // вывод массива на экран для наглядности
		int[] growingMas = findMinKElem(mas);
		printArray(growingMas);
		// findMinK(growingMas);
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

	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(50);
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

	public static int[] findMinKElem(int[] mas) {
		int[] kCheck = new int[mas.length];
		int k = 0;

		int[] minKar;
		for (int i = 0; i < mas.length; i++) {
			kCheck[i] = 0;
			k = 1;
			int max = mas[i];
			for (int j = i; j < mas.length; j++) {
				if (max < mas[j]) {
					max = mas[j];
					k++;
				}
			}
			kCheck[i] = mas.length - k;
			k = 1;
		}
		int minK = kCheck[0];
		for (int i = 1; i < kCheck.length; i++) {
			if (minK > kCheck[i]) {
				minK = kCheck[i];
			}
		}
		System.out.println("Наименьшее число К элементов = " + minK);
		return kCheck;
	}

	/*
	 * public static void findMinK(int[] mas) { int min = mas[0]; for (int i =
	 * 1; i < mas.length; i++) { if (min > mas[i]) { min = mas[i]; } }
	 * System.out.println("Наименьшее число К элементов = " + min); }
	 */

}
