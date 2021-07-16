package com.springcore.sterotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	@Value("gufran")
private String name;
	@Value("mumbai")
private String city;
	@Value("#{list}")
	private List<String>adress;

@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", adress=" + adress + "]";
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<String> getAdress() {
	return adress;
}
public void setAdress(List<String> adress) {
	this.adress = adress;
}

}
