package by.alesnax.htp3.jd01.lesson05.Task01.Calculator;

import by.alesnax.htp3.jd01.lesson05.Task01.Calculator.Action;;


/*
 * Solution of Task1(Lesson5) SimpleFraction
 * With Calculator version
 */

public class Calculator {

	public static void main(String[] args) {

		Fraction f1 = new Fraction(1,3);
		Fraction f2 = new Fraction(7,6);
		Fraction f3 = Action.subt(f1, f2);
		Print.print(f3);
		
	}

}
