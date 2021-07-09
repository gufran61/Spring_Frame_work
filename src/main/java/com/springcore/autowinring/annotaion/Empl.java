package com.springcore.autowinring.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Empl {
	@Autowired
	@Qualifier("address")
private Adress address;

public Empl() {
	super();
	// TODO Auto-generated constructor stub
}

public Adress getAddress() {
	return address;
}
//@Autowired
public void setAddress(Adress address) {
	this.address = address;
}

@Override
public String toString() {
	return "Empl [address=" + address + "]";
}
//@Autowired
public Empl(Adress address) {
	super();
	this.address = address;
}

}
