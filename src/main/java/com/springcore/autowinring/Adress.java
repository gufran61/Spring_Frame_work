package com.springcore.autowinring;

public class Adress {
private String street;
private String city;
public Adress() {
	super();
	// TODO Auto-generated constructor stub
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Adress [street=" + street + ", city=" + city + "]";
}
public Adress(String street, String city) {
	super();
	this.street = street;
	this.city = city;
}

}
