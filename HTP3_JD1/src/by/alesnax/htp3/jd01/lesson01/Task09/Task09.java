package by.alesnax.htp3.jd01.lesson01.Task09;

import java.util.Scanner;

/*
 * Task_1.9
 * Составить линейную программу, печатающую значение true, 
 * если указанное высказывание является истинным и false -  в противном случае:
 * Точка с координатами (x, y) принадлежит части плоскости,
 *  лежащей мужду прямыми x = m, x = n (m < n)
 */

public class Task09 {

	public static void main(String[] args) {
		boolean b = checkXY();
		print(b);
	}

	public static boolean checkXY() {
		double m;
		double n;
		boolean bool = false;
		while (true) {
			System.out.print("Enter m: ");
			m = enterNum();
			System.out.print("Enter n: ");
			n = enterNum();
			if (m < n)
				break;
			else
				System.out.println("m must be less than n, please repeat input!");
		}
		System.out.println("Please enter coordinates of point (x,y) : ");
		double x = enterX();
		@SuppressWarnings("unused")
		double y = enterY();

		if (x >= m && x <= n) {
			bool = true;
		} else
			bool = false;
		return bool;
	}

	public static double enterX() {
		System.out.print("Enter x: ");
		return enterNum();
	}

	public static double enterY() {
		System.out.print("Enter y: ");
		return enterNum();
	}

	public static double enterNum() {

		double num = 0;
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextDouble()) {
				num = scanner.nextDouble();
				break;
			} else {
				System.out.println("Incorrect input, please try again!");
			}
		}
		return num;
	}

	public static void print(boolean bool) {
		System.out.println(bool);
	}

}