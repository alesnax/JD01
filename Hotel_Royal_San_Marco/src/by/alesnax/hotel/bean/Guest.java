package by.alesnax.hotel.bean;

public class Guest {
	
	private String name;
	private String surName;
	private String email;
	private String country;
	private String city;
	private String address;
	public Guest(String name, String surName, String email, String country, String city, String address) {
		super();
		this.name = name;
		this.surName = surName;
		this.email = email;
		this.country = country;
		this.city = city;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
