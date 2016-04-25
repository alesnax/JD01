package by.alesnax.htp3.jd01.lesson05.Task01;

/*
 * Simple Fraction program
 * 1. Create class SimpleFraction
 * 2. Realize - addition, multiply, subtraction, division methods
 * 3. Create class, which display console one fraction, fraction array, fraction collection.	 
 */

public class Main {

	public static void main(String[] args) {

		Fraction sf1 = Fraction.enterFraction();
		Fraction sf2 = Fraction.enterFraction();
		Fraction sf3, sf4, sf5, sf6;

		sf3 = sf1.add(sf2);
		sf4 = sf1.subt(sf2);
		sf5 = sf1.mult(sf2);
		sf6 = sf1.div(sf2);

		Print.print(sf3);
		Print.print(sf4);
		Print.print(sf5);
		Print.print(sf6);

	}

}
