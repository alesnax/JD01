package by.alesnax.htp3.jd01.lesson03.Task10;

import java.util.Random;
import java.util.Scanner;

/*
 * Даны дроби p1/q1, ...pn/qn
 * привести эти дроби к общему знаменателюи упорядочить их в порядке возратания
 */


public class Main {

	public static void main(String[] args) {
		
		int len = enterNum();
		int[] p = new int[len];
		enterArrayWithRandom(p);
		
		int[] q = new int[len];
		enterArrayWithRandom(q);
		print(p,q);
		
		sortFraction(p,q);
		print(p,q);

	}

	public static void print(int[] p, int[]q) {
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + "/" + q[i] + "; ");
		}
		System.out.println();
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
			mas[i] = rand.nextInt(10) + 1;
		}
	}
	
	public static void sortFraction(int[] p, int[] q) {
		int n = 1;
		int nok = 0;
		for (int i = 0; i < p.length; i++) {
			nok = nokFun(n, q[i]);
			n = nok;
			System.out.println("fn = " + nok + " n = " + n);
		}
		
		for (int i = 0; i < p.length; i++) {
			p[i] = p[i] * nok / q[i];
			q[i] = nok;
		}
		
		for (int i = 0; i < p.length; i++) {
			int min = p[i];
			int ind = i;
			for (int j = i; j < p.length-1; j++) {
				if(min > p[j]){
					min = p[j];
					ind = j;
				}
			}
			int temp = p[i];
			p[i] = min;
			p[ind] = temp;
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
