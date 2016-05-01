package by.alesnax.htp3.jd01.lesson06.Task02;

public class Sweet {
	private String name;
	private double value;
	private int happiness;
	
	private boolean isTasty;
	
	public Sweet(String name, double value, int happiness, int weight, boolean tasty) {
		this.value = value;
		this.name = name;
		this.happiness = happiness;
		this.isTasty = tasty;
	}
	
	public Sweet(String name) {
		this.value = 10;
		this.name = name;
		this.happiness = 5;
		this.isTasty = true;
	}

	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}

	public int getHappiness() {
		return happiness;
	}

	public boolean isTasty() {
		return isTasty;
	}
}
