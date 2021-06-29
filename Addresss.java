package com.studentRecord.bean;

public class Addresss {
	private int pincode;
	private String city;
	private String state;
	private String country;
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Addresss [pincode=" + pincode + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}

