package com.springcore;

public class Person {
private String name;
private int id;
private Certi c;
public Person(String name, int id,Certi c) {
	super();
	this.name = name;
	this.id = id;
	this.c=c;
}
@Override
public String toString() {
	return this.name+" : "+this.id+"{"+this.c.name+"}"; 
}

}
