package by.alesnax.htp3.jd01.lesson03.Task05;

import java.util.Scanner;

/*
 * Task_3.5
 * Японская радиокомпания провела опрос N радиослушателей по вопросу:
 * "Какое животное вы связываете с Японией и японцами?"
 * Составить программу получения наиболее часто встречающихся вариантов и их долей.
 */

public class Task5 {

	public static void main(String[] args) {
		final String[] anim = new String[] { "Dog", "Chicken", "Hancock", "Bull" };
		String[] interviewData = createInterview(enterNum(), anim);
		int[] result = countResults(interviewData, anim);
		print(result, anim);
	}

	public static void print(int[] res, String[] anim) {
		for (int i = 0; i < res.length - 1; i++) {
			System.out.println("for " + anim[i] + "\t have vote " + (double) res[i] / res[4] * 100 + "\t% of people!");
		}
	}

	public static int[] countResults(String data[], String anim[]) {
		int[] res = new int[5]; // 0-dogs, 1- chic, 2-hanc 3- bull 4 - fullcount
		res[4] = data.length;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < anim.length; j++) {
				if (data[i].equals(anim[j])) {
					res[j]++;
				}
			}
		}
		return res;
	}

	public static String[] createInterview(int num, String[] str) {
		String[] interview = new String[num];
		for (int i = 0; i < interview.length; i++) {
			interview[i] = str[(int) (Math.random() * 4)];
		}
		return interview;
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
