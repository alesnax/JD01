package by.alesnax.htp3.jd01.lesson03.Task10;

import java.util.Scanner;

public class Fraction {
	public int p;
	public int q;

	public Fraction() {
		System.out.print("Enter numerator and denomerator: ");
		this.p = enterNum();
		this.q = enterNum();
	}

	public int enterNum() {
		int num;
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				break;
			} else {
				System.out.println("Incorrect input, try again!");
			}
		}
		return num;
	}

	public static void printFraction(Fraction[] f) {
		System.out.println("-------------------------------------");
		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i].p + "/" + f[i].q + "; ");
		}
		System.out.println();
		System.out.println("-------------------------------------");

	}

	public static void sortFraction(Fraction[] f) {
		int n = 1;
		int nok = 0;
		for (int i = 0; i < f.length; i++) {
			nok = nokFun(n, f[i].q);
			n = nok;
			System.out.println("fn = " + nok + " n = " + n);
		}
		
		for (int i = 0; i < f.length; i++) {
			f[i].p = f[i].p * nok / f[i].q;
			f[i].q = nok;
		}
		
		for (int i = 0; i < f.length; i++) {
			int min = f[i].p;
			int ind = i;
			for (int j = i; j < f.length-1; j++) {
				if(min > f[j].p){
					min = f[j].p;
					ind = j;
				}
			}
			int temp = f[i].p;
			f[i].p = min;
			f[ind].p = temp;
		}

	}

	public static int nokFun(int x, int y) {
		int j;
		if (x < y)
			j = y;
		else
			j = x;
		while (true) {
			if ((j % x == 0) && (j % y == 0))
				break;
			else
				j += 1;
		}
		return j;
	}
	
}
