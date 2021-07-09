package com.springcore.autowinring;

public class Empl {
private Adress address;

public Empl() {
	super();
	// TODO Auto-generated constructor stub
}

public Adress getAddress() {
	return address;
}

public void setAddress(Adress address) {
	this.address = address;
}

@Override
public String toString() {
	return "Empl [address=" + address + "]";
}

public Empl(Adress address) {
	super();
	this.address = address;
}

}
