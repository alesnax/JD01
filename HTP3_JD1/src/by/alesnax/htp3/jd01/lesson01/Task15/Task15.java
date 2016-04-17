package by.alesnax.htp3.jd01.lesson01.Task15;
import java.util.Scanner;

/*
 * Task_1.15
 * Составить программу, которая по заданным году
 * и номеру месяца m определяет кол-во дней в этом месяце.
 */


public class Task15 {
	public static void main(String[] args) {
		int y = enterYear();
		int m = enterMon();
		int days = countDays(y, m);
		print(days, y, m);
	}

	public static int enterYear() {
		int y;
		System.out.print("Enter year: ");
		while (true) {
			y = enterNum();
			if (y >= 0)
				break;
			else
				System.out.print("Negative value, please try again!");
		}
		return y;
	}

	public static int enterMon() {
		int m;
		System.out.println("Enter month: ");
		while (true) {
			m = enterNum();
			if (m >= 1 && m <= 12)
				break;
			else
				System.out.print("Wrong interval of input, please try again!");
		}
		return m;
	}

	public static int countDays(int year, int mon) {
		int days = 0;
		switch (mon) {
		case (1):
		case (3):
		case (5):
		case (7):
		case (8):
		case (10):
		case (12):
			days = 31;
			break;
		case (4):
		case (6):
		case (9):
		case (11):
			days = 30;
			break;
		case (2): {
			days = 28;
			if (year % 4 == 0)
				days = 29;
			if (year % 100 == 0)
				days = 28;
			break;
		}
		}
		return days;
	}

	public static void print(int days, int y, int m) {
		System.out.println("In " + y + " year of " + m + " month is " + days + " days.");
	}

	public static int enterNum() {
		int num = 0;
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				break;
			} else {
				System.out.println("Incorrect input, please try again!");
			}
		}
		return num;
	}
}
