package by.alesnax.htp3.jd01.lesson01.Task11;

import java.util.Scanner;

public class Point {
	public static int count = 0;
	double x;
	double y;

	public Point() {
		count++;
		System.out.println("Enter coordinates of point " + count + ": ");
		System.out.print("x = ");
		x = enterNum();
		System.out.print("y = ");
		y = enterNum();
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

}
