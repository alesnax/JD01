package by.alesnax.htp3.jd01.lesson05.Task01.Calculator;


public class Fraction {
	
	private int num;		// numerator declaration
	private int den;		// denominator declaration
	
	public Fraction(){
		this.num = 0;
		this.den = 0;
	}
	
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

	public void setNum(int num) {
		this.num = num;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	
	

}
