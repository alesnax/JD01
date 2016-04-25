package by.alesnax.htp3.jd01.lesson05.Task01;

import java.util.ArrayList;

public class Print {
	Fraction f;

	public static void print(Fraction f) {
		System.out.println(f.getNum() + "/" + f.getDen());
		System.out.println("-----------------------------------");
	}

	public static void print(Fraction[] f) {
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i].getNum() + "/" + f[i].getDen());
			if (i != f.length - 1) {
				System.out.print("; ");
			}
		}
		System.out.println("-----------------------------------");

	}

	public static void print(ArrayList<Fraction> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getNum() + "/" + list.get(i).getDen());
			if (i != list.size() - 1) {
				System.out.print("; ");
			}
		}
		System.out.println("-----------------------------------");

	}

}
