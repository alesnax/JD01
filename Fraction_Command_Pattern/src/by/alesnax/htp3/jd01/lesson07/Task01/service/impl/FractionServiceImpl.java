package by.alesnax.htp3.jd01.lesson07.Task01.service.impl;

import java.util.Scanner;
import by.alesnax.htp3.jd01.lesson07.Task01.bean.Fraction;
import by.alesnax.htp3.jd01.lesson07.Task01.service.FractionService;


public class FractionServiceImpl implements FractionService{

	public static int count = 0;
	
	@Override
	public Fraction addFraction() {
		Fraction[] f = enterFraction();
		Fraction fr = new Fraction(0,0);
		fr.setDen(nok(f[0].getDen(), f[1].getDen()));
		fr.setNum((f[0].getNum() * fr.getDen() / f[0].getDen() + f[1].getNum() * fr.getDen() / f[1].getDen()));
		reduct(fr);
		fr.setDescribeAction(f[0] + " + " + f[1] + " = " + fr);
		return fr;
	}
	
	@Override
	public Fraction subFraction() {
		Fraction[] f = enterFraction();
		Fraction fr = new Fraction(0,0);
		fr.setDen(nok(f[0].getDen(), f[1].getDen()));
		fr.setNum((f[0].getNum() * fr.getDen() / f[0].getDen() - f[1].getNum() * fr.getDen() / f[1].getDen()));
		reduct(fr);
		fr.setDescribeAction(f[0] + " - " + f[1] + " = " + fr);
		return fr;
	}

	@Override
	public Fraction multFraction() {
		Fraction[] f = enterFraction();
		Fraction fr = new Fraction(0,0);
		fr.setDen(f[0].getDen() * f[1].getDen());
		fr.setNum(f[0].getNum() * f[1].getNum());	
		reduct(fr);
		fr.setDescribeAction(f[0] + " x " + f[1] + " = " + fr);
		return fr;
	}

	@Override
	public Fraction divFraction() {
		Fraction[] f = enterFraction();
		Fraction fr = new Fraction(0,0);
		fr.setDen(f[0].getDen() * f[1].getNum());
		fr.setNum(f[0].getNum() * f[1].getDen());	
		reduct(fr);
		fr.setDescribeAction(f[0] + " \\ " + f[1] + " = " + fr);
		return fr;
	}

	 static Fraction reduct(Fraction f){
		int x = gcd(f.getNum(), f.getDen());
		f.setNum(f.getNum() / x);
		f.setDen(f.getDen() / x);		
		return f;
	}
	
	 static int gcd(int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return gcd(b, x);
    }
	
	 static int nok(int x, int y) {
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
		
	public  Fraction[] enterFraction() {
		Fraction[] f = new Fraction[2];
		
		count++;
		System.out.println("Enter numerator and denominator of " + count + " fraction: ");
		int f1 = enterNum();
		System.out.println("-");
		int f2 = enterNum();
		count++;
		System.out.println("Enter numerator and denominator of " + count + " fraction: ");
		int f3 = enterNum();
		System.out.println("-");
		int f4 = enterNum();
		count = 0;
		f[0] = new Fraction(f1,f2);
		f[1] = new Fraction(f3,f4);
		return f;
	}
	
	public  int enterNum() {
		int num = 0;
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
}

















