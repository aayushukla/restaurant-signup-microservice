package com.capgemini.foodApp.restaurant;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="DEMO")
public class RestaurantInfo {
	
	
	private String restaurantname;
	private String city;
	private String email;
	private String password;
	private long contact;
	private String breakfast;
	private String lunch;
	private String dinner;
	private String tiffin;
	public RestaurantInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RestaurantInfo(String restaurantname, String city, String email, String password, long contact,
			String breakfast, String lunch, String dinner, String tiffin) {
		super();
		this.restaurantname = restaurantname;
		this.city = city;
		this.email = email;
		this.password = password;
		this.contact = contact;	
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.dinner = dinner;
		this.tiffin = tiffin;
	}
	public String getRestaurantname() {
		return restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getLunch() {
		return lunch;
	}
	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}
	public String getTiffin() {
		return tiffin;
	}
	public void setTiffin(String tiffin) {
		this.tiffin = tiffin;
	}
	@Override
	public String toString() {
		return "RestaurantInfo [restaurantname=" + restaurantname + ", city=" + city + ", email=" + email
				+ ", password=" + password + ", contact=" + contact + ", breakfast=" + breakfast + ", lunch=" + lunch
				+ ", dinner=" + dinner + ", tiffin=" + tiffin + "]";
	}
	
	
	
	
	
	
	
	
}
	
		
	


