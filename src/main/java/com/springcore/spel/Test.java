package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
	Demo d = ac.getBean("demo",Demo.class);
	System.out.println(d);
}
}
