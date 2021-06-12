package com.springcore.lifecycle;

public class Samosa {
private double price;

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("in setter");
	this.price = price;
}
public void init() {
	System.out.println("in init");
}
public void destroy() {
	System.out.println("is destroy");
}
}
