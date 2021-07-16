package com.springcore.sterotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	@Value("gufran")
private String name;
	@Value("mumbai")
private String city;
@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + "]";
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

}
