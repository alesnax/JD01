package by.alesnax.htp3.jd01.lesson05.Task01.Calculator;



public class Action {


	
	public static Fraction add(Fraction f1, Fraction f2){		//addition
		Fraction fr = new Fraction(0,0);
		fr.setDen(nok(f1.getDen(), f2.getDen()));
		fr.setNum((f1.getNum() * fr.getDen() / f1.getDen() + f2.getNum() * fr.getDen() / f2.getDen()));
		return reduct(fr);
	}
	
	public static Fraction subt(Fraction f1, Fraction f2){		//subtraction
		Fraction fr = new Fraction(0,0);
		fr.setDen(nok(f1.getDen(), f2.getDen()));
		fr.setNum((f1.getNum() * fr.getDen() / f1.getDen() - f2.getNum() * fr.getDen() / f2.getDen()));
		return reduct(fr);
	}
	
	public static Fraction mult(Fraction f1, Fraction f2){		//multiply
		Fraction fr = new Fraction(0,0);
		fr.setDen(f1.getDen() * f2.getDen());
		fr.setNum(f1.getNum() * f2.getNum());	
		return reduct(fr);
	}
	
	public static Fraction div(Fraction f1, Fraction f2){		//division
		Fraction fr = new Fraction(0,0);
		fr.setDen(f1.getDen() * f2.getNum());
		fr.setNum(f1.getNum() * f2.getDen());	
		return reduct(fr);
	}
	
	private static Fraction reduct(Fraction f){
		int x = gcd(f.getNum(), f.getDen());
		f.setNum(f.getNum() / x);
		f.setDen(f.getDen() / x);		
		return f;
	}
	
	private static int gcd(int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return gcd(b, x);
    }
	
	private static int nok(int x, int y) {
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
