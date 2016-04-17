package by.alesnax.htp3.jd01.lesson01.Task14;

import java.util.Scanner;

/*
 * Task_1.14
 * Составить программу, которая по данному числу (1-12)
 * выводит название соответствующего ему месяца.
 */

public class Task14 {

	public static void main(String[] args) {

		int mon = enterMon();
		print(mon);
	}

	public static int enterMon() {
		int mon;
		System.out.print("Enter number of month from 1 to 12: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				mon = scanner.nextInt();
				if (mon >= 1 && mon <= 12)
					break;
				else
					System.out.println("wrong value, please try again!");
			} else {
				System.out.println("Incorrect input, please try again!");
			}
		}
		return mon;
	}

	public static void print(int mon) {
		String month = null;

		switch (mon) {
		case 1:
			month = "january";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		}
		System.out.println(month);
	}
}
