package by.alesnax.hotel.bean;


public class Room {
	/*private int number;
	private String type;
	private int priceForDay;
	private boolean hasMinibar;
	
	public Room(int number, String type) {
		super();
		this.number = number;
		this.type = type;
	}

	public Room(int number, String type, int priceForDay, boolean hasMinibar) {
		super();
		this.number = number;
		this.type = type;
		this.priceForDay = priceForDay;
		this.hasMinibar = hasMinibar;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPriceForDay() {
		return priceForDay;
	}

	public void setPriceForDay(int priceForDay) {
		this.priceForDay = priceForDay;
	}

	public boolean isHasMinibar() {
		return hasMinibar;
	}

	public void setHasMinibar(boolean hasMinibar) {
		this.hasMinibar = hasMinibar;
	}*/
	

	private int number;
	private String type;
	
	
	public Room(int number, String type){
		this.number = number;
		this.type = type;
		
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

	
}