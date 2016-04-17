package by.alesnax.htp3.jd01.lesson03.Task13;

import java.util.Scanner;
//Сформировать матрицу со значениями по диагонали == 1

public class Task13 {

	public static void main(String[] args) {
		int n = enterNum();
		int[][] matr = new int[n][n];
		form(matr);
		print(matr);

	}

	public static int enterNum() {
		int num;
		while (true) {
			System.out.print("Введите число n: ");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				if (num > 1) {
					break;
				} else {
					System.out.print("Число отрицательное или меньше 2, повторите ввод!  ");
				}
			} else {
				System.out.print("Некорректное значение, повторите ввод!  ");
			}
		}
		return num;
	}

	public static void form(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == j || j == mat[i].length - 1 - i)
					mat[i][j] = 1;
				else
					mat[i][j] = 0;
			}
		}
	}

	public static void print(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("%3d", mat[i][j]);
			}
			System.out.println();
		}

	}

}