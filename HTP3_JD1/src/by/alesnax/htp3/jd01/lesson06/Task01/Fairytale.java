package by.alesnax.htp3.jd01.lesson06.Task01;

public class Fairytale {
	
	private String name;
	private int rate;
	private String text;
	private int year;
	
	
	
	private Fairytale(){
		this.year = 1800;
		this.rate = 3;
		this.text = "noText";
		this.name = "noName";
	}
	
	public Fairytale(String name, int rate, String text) {
		this.year = 1800;
		this.name = name;
		this.rate = rate;
		this.text = text;
	}

	public Fairytale(String name, String text) {
		this();
		this.name = name;
		this.text = text;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void generate(Fairytale[] f){
		for(int i = 0; i < f.length; i++){
			f[i] = new Fairytale();
			f[i].setName("Tale #" + (i+1));
			f[i].setRate(i/10 + i%10);
			f[i].setYear(1800 + i);
			f[i].setText("This tale is above" + i*i*i*i*i + "knights");
		}
		
	}
	
	public static void printAll(Fairytale[] f){
		for(int i = 0; i < f.length; i++){
			f[i].print();
			
		}
	}
	public void print(){
		System.out.println("Title: " + this.getName() + ", rate: " + this.getRate() + ", year: " + this.getYear() + ", text: " + this.getText());
	}
	
	
	
	
	
}
