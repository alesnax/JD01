package by.alesnax.htp3.jd01.lesson06.Task02;

import java.util.ArrayList;

public class Present {

	private Pack pack;
	private ArrayList<Sweet> sweets;

	private boolean isOpened;

	public void showSweets() {
		System.out.print("You can find ");
		for (int i = 0; i < sweets.size(); i++) {
			System.out.print(this.sweets.get(i).getName() + ", ");
		}
		System.out.println(" in your present");
	}
	
	public Present openPresent() {
		this.isOpened = true;
		System.out.println("Кто-то открыл подарочек");
		return this;
	}

	public Present eatCandy(String name){
		if(!isOpened){
			System.out.println("Чтобы слопать конфет - сначала нужно не полениться открыть подарок ;)");
			return this;
		}
		for(int i  = 0; i < this.sweets.size(); i++){
			if(this.sweets.get(i).getName().equals(name)){
				if(this.sweets.get(i).isTasty()){
				System.out.println("Была съедена вкусная конфета " + this.sweets.get(i).getName());
				}else{
					System.out.println("Была съедена конфета " + this.sweets.get(i).getName() + ", но если признаться - так себе у нее вкус.");
				}
				this.sweets.remove(i);
				break;
			}else{
				System.out.println("Конфет с названием " + name + " - нет, или они закончились :(, но не унывайте, поищите другие :)");
			}
		}
		return this;
	}

	private Present(PresentBuilder builder) {
		this.pack = builder.pack;
		this.sweets = builder.sweets;
		this.isOpened = builder.isOpened;
	}

	public static class PresentBuilder {
		private Pack pack;
		private ArrayList<Sweet> sweets;

		private boolean isOpened;
		
		public PresentBuilder() {
			
		}
		
		public PresentBuilder(Pack pack) {
			this.pack = pack;
			this.sweets = new ArrayList<Sweet>();
		}

		public PresentBuilder(Pack pack, ArrayList<Sweet> sweets, boolean isOpened) {
			this.pack = pack;
			this.sweets = sweets;
			this.isOpened = false;
		}

		

		public PresentBuilder addSweet(String name) {
			this.sweets.add(new Sweet(name));
			return this;
		}

		public Present create() {
			return new Present(this);
		}

	}
}
