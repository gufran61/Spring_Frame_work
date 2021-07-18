package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{10+20}")
private int x;
	@Value("#{10+20+7+8+9}")
private int y;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int z;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	@Value("#{new java.lang.String('gufran')}")
	private String name;
public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + "]";
}




}
