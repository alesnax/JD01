package by.alesnax.htp3.jd01.lesson03.Task10;

/*
 * Даны дроби p1/q1, ...pn/qn
 * привести эти дроби к общему знаменателюи упорядочить их в порядке возратания
 */


public class Task10 {
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		Fraction f3 = new Fraction();
		Fraction f4 = new Fraction();
		
		Fraction[] f = new Fraction[]{f1,f2,f3,f4};
		Fraction.printFraction(f);
		Fraction.sortFraction(f);
		Fraction.printFraction(f);
		
	}

}
