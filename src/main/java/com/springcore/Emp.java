package com.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
private String name;
private List<String>phones;
private Set<String> adress;
private Map<String, String> course;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(String name, List<String> phones, Set<String> adress, Map<String, String> course) {
	super();
	this.name = name;
	this.phones = phones;
	this.adress = adress;
	this.course = course;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAdress() {
	return adress;
}
public void setAdress(Set<String> adress) {
	this.adress = adress;
}
public Map<String, String> getCourse() {
	return course;
}
public void setCourse(Map<String, String> course) {
	this.course = course;
}
@Override
public String toString() {
	return "Emp [name=" + name + ", phones=" + phones + ", adress=" + adress + ", course=" + course + "]";
}

}