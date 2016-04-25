package by.alesnax.htp3.jd01.lesson05.Task01;

import java.util.Scanner;

public class Fraction {
	private int num; // numerator declaration
	private int den; // denominator declaration

	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}

	public Fraction add(Fraction fract) { // addition
		Fraction fr = new Fraction(0, 0);
		fr.den = nok(this.den, fract.den);
		fr.num = (this.num * fr.den / this.den + fract.num * fr.den / fract.den);
		return reduct(fr);
	}

	public Fraction subt(Fraction fract) { // subtraction
		Fraction fr = new Fraction(0, 0);
		fr.den = nok(this.den, fract.den);
		fr.num = (this.num * fr.den / this.den - fract.num * fr.den / fract.den);
		return reduct(fr);
	}

	public Fraction mult(Fraction fract) { // multiply
		Fraction fr = new Fraction(0, 0);
		fr.den = this.den * fract.den;
		fr.num = this.num * fract.num;
		return reduct(fr);
	}

	public Fraction div(Fraction fract) { // division
		Fraction fr = new Fraction(0, 0);
		fr.den = this.den * fract.num;
		fr.num = this.num * fract.den;
		return reduct(fr);
	}

	private Fraction reduct(Fraction f) {
		int x = gcd(f.num, f.den);
		f.num = f.num / x;
		f.den = f.den / x;
		return f;
	}

	private int gcd(int a, int b) {
		if (b == 0)
			return a;
		int x = a % b;
		return gcd(b, x);
	}

	private int nok(int x, int y) {
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

	public static Fraction enterFraction() {
		Fraction f = new Fraction(0, 0);
		System.out.println("Enter num");
		f.num = enterNum();
		System.out.println("Enter denom");
		f.den = enterNum();
		return f;
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
				System.out.println("You've entered wrong value, please repeat input!");
			}
		}
		return num;
	}

}
