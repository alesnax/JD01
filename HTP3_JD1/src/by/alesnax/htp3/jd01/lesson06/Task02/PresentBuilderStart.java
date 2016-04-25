package by.alesnax.htp3.jd01.lesson06.Task02;



public class PresentBuilderStart {

	public static void main(String[] args) {
		
		Pack pack = new Pack("green");
	
		Present present = new Present.PresentBuilder(pack).addSweet("Alenka").addSweet("mishkainSpace").create();
		present.openPresent();
		present.eatCandy("Alenka");
		present.showSweets();
	}

}
