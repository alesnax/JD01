package by.alesnax.htp3.jd01.lesson07.Task01.bean;

public class Fraction {

	private int num; // numerator declaration
	private int den; // denominator declaration
	private String describeAction;

	public Fraction() {
		this.num = 0;
		this.den = 0;
	}

	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}

	public String getDescribeAction() {
		return describeAction;
	}

	public void setDescribeAction(String describeAction) {
		this.describeAction = describeAction;
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

	@Override
	public String toString() {
		return num + "/" + den;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + den;
		result = prime * result + ((describeAction == null) ? 0 : describeAction.hashCode());
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction) obj;
		if (den != other.den)
			return false;
		if (describeAction == null) {
			if (other.describeAction != null)
				return false;
		} else if (!describeAction.equals(other.describeAction))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	
	

}
